class Dict {
    var daictionnaire = ArrayList<Ent>()

    //
    fun ajouter(e:Ent){
        if (daictionnaire.contains(e)){
            throw Exception("l'entree appartien deja au daictionnaire ")
        }else{
            daictionnaire.add(e)
        }
    }

    //
    fun nombreEntrees():Int{
        return daictionnaire.size
    }

    //
    fun supprimer(e:Ent):Boolean{
        var isexiste = false
        if (daictionnaire.contains(e)){
            daictionnaire.remove(e)
            isexiste = true
        }
        return isexiste
    }

    //
    fun supprimer(motAnglais:String):Boolean {
        var isexiste = false
        for (i in daictionnaire) {
            if (i.motAnglais == motAnglais) {
                daictionnaire.remove(i)
                isexiste = true
            }
        }
        return isexiste
    }

    //
    fun frAn(motFrancais:String):ArrayList<String>{
        var motEngiaisListe = ArrayList<String>()
        for (i in daictionnaire){
            if (i.motFrancais == motFrancais){
                motEngiaisListe.add(i.motAnglais)
            }
        }
        return motEngiaisListe
    }

    //
    fun motFrancais():ArrayList<String>{
        var motFrancaisListe = ArrayList<String>()
        for (i in daictionnaire){
            if (!motFrancaisListe.contains(i.motFrancais)){
                motFrancaisListe.add(i.motFrancais)
            }
        }
        return motFrancaisListe
    }

    //
    fun dictionnaireFrEn():HashMap<String,ArrayList<String>>{
        var map = HashMap<String,ArrayList<String>>()

        for (i in daictionnaire){
            val motsAnglais = map.getOrDefault(i.motFrancais, ArrayList())
            motsAnglais.add(i.motAnglais)
            map[i.motFrancais] = motsAnglais

        }
        return map
    }

    override fun toString(): String {
        return "DAICTIONNAIRE = ${daictionnaire.joinToString()} "
    }

    //



}



