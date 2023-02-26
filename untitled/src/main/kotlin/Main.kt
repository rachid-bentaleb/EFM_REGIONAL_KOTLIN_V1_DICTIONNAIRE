import kotlin.properties.Delegates

fun main(args: Array<String>) {
 //   var hh = "bentaleb rachid"
//    println(hh.isEmptyOrBlank())
//    println(hh.EmptyOrBlankMessage())
//     println(hh.acronyme())

    var dic1 = Dict()
    var e1 = Ent("me1","mf1")
    var e2 = Ent("me2","mf1")
    var e3 = Ent("me3","mf2")

    dic1.ajouter(e1)
    dic1.ajouter(e2)
    dic1.ajouter(e3)

    println(dic1)
//    println(dic1.dictionnaireFrEn())



}




