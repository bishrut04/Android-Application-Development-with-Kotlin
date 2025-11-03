package weekOne

fun main() {
    val dictionary = mapOf(
        "adventurous" to "willing to take risks or try out new experiences",
        "brilliant" to "exceptionally clever or talented",
        "curious" to "eager to know or learn something",
        "determined" to "having made a firm decision and being resolved not to change it",
        "enthusiastic" to "showing intense and eager enjoyment or interest",
        "fearless" to "lacking fear; brave",
        "generous" to "showing a readiness to give more of something than is strictly necessary",
        "honest" to "free of deceit; truthful",
        "imaginative" to "having a creative or inventive mind",
        "joyful" to "feeling, expressing, or causing great pleasure and happiness",
        "kind" to "having a friendly, generous, and considerate nature",
        "loyal" to "giving or showing firm and constant support",
        "motivated" to "very eager to do or achieve something",
        "optimistic" to "hopeful and confident about the future",
        "patient" to "able to accept or tolerate delays, problems, or suffering without becoming annoyed",
        "reliable" to "consistently good in quality or performance; dependable",
        "thoughtful" to "showing consideration for the needs of others",
        "understanding" to "sympathetically aware of other people's feelings",
        "vigilant" to "keeping careful watch for possible danger or difficulties",
        "wise" to "having experience, knowledge, and good judgment"
    )

    val wordList = listOf(
        "adventurous",
        "brilliant",
        "curious",
        "determined",
        "enthusiastic",
        "fearless",
        "generous",
        "honest",
        "imaginative",
        "joyful",
        "kind",
        "loyal",
        "motivated",
        "optimistic",
        "patient",
        "reliable",
        "thoughtful",
        "understanding",
        "vigilant",
        "wise"
    )

    println("----- Welcome to the Dictionary App -----")
    println(wordList)

    print("Enter a word you want to know the meaning of: ")
    val userInput: String = readln()
    println("The meaning of $userInput is ${dictionary[userInput]}")
}
