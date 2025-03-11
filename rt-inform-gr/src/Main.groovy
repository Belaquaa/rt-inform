static def countElements(List list) {
    def counts = [:]
    list.each { item ->
        counts[item] = (counts[item] ?: 0) + 1
    }
    return counts
}

def list = [1, 3, 4, 5, 1, 5, 4]
def result = countElements(list)
println result