

//la methode d'extension isEmptyOrBlank() permettant de rotourner true si la chaine est blanket
// et false si la chaine est empty

    fun String.isEmptyOrBlank(): Boolean? {
        var checkString: Boolean? = null
        if (this.isEmpty()){ checkString = false}
        else if (this.isBlank()){checkString = true}
        return checkString
    }
// la methode d'extension EmptyOrBlankMessage() permettant de verifier si la chaine est empty ou blank
    fun String.EmptyOrBlankMessage():String{
        var message = ""
        if(this.isEmptyOrBlank() == true){
            message = "your string is blank"
        }
        else if(this.isEmptyOrBlank() == false){
            message = "your string is empty"
        }
        else {
            message = "your string is not empty and not blank"
        }
        return message
    }

    // la method acronyme()
    fun String.acronyme():String{
        var Stringacronyme = ""
        if (this.isEmptyOrBlank() == true || this.isEmptyOrBlank() == false){
            Stringacronyme = this.EmptyOrBlankMessage()
        }
        else{
            val myString= this.split(" ").filter { it.isNotBlank() }
            val acronym = StringBuilder()
            for (mot in myString) {
                acronym.append(mot[0].toUpperCase())
            }
            Stringacronyme = acronym.toString()
        }
        return Stringacronyme
    }
