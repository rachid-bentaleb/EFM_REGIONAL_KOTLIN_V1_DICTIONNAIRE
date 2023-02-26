class Ent {

    var motAnglais:String
        set(value) {
            if (value.isEmptyOrBlank() == true || value.isEmptyOrBlank() == false){
                 throw Exception("le mot Englais not invalide")
            }
            else{
                field = value
            }
        }

    var motFrancais:String
        set(value) {
            if (value.isEmptyOrBlank() == true || value.isEmptyOrBlank() == false){
                throw Exception("le mot francais not invalide")
            }
            else{
                field = value
            }
        }

    constructor(motEnglais: String,motFrancais: String) {
        this.motAnglais = motEnglais
        this.motFrancais = motFrancais
    }

    override fun toString(): String {
        return "$motAnglais : $motFrancais"
    }

    override fun equals(other: Any?): Boolean {
        other as Ent
        if (motAnglais == other.motAnglais) return true
        else return false

    }



}