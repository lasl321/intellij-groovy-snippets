static String makeComponentSpec(final String fileName) {
    fileName.split('-').findAll {
        it != 'spec.ts'
    }.collect {
        it.capitalize()
    }.join('')
}

String fileName = _1
return makeComponentSpec(fileName)
