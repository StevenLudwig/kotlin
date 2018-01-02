// !DIAGNOSTICS: -NOTHING_TO_INLINE
// FILE: api.kt

package api

@Experimental(<!ANNOTATION_PARAMETER_MUST_BE_CONST!><!UNRESOLVED_REFERENCE!>ExperimentalLevel<!>.<!DEBUG_INFO_ELEMENT_WITH_ERROR_TYPE!>WARNING<!><!>, <!ANNOTATION_PARAMETER_MUST_BE_CONST!><!UNRESOLVED_REFERENCE!>ExperimentalScope<!>.<!DEBUG_INFO_ELEMENT_WITH_ERROR_TYPE!>SOURCE_ONLY<!><!>)
annotation class ExperimentalSourceOnlyAPI

@Experimental(<!ANNOTATION_PARAMETER_MUST_BE_CONST!><!UNRESOLVED_REFERENCE!>ExperimentalLevel<!>.<!DEBUG_INFO_ELEMENT_WITH_ERROR_TYPE!>WARNING<!><!>, <!ANNOTATION_PARAMETER_MUST_BE_CONST!><!UNRESOLVED_REFERENCE!>ExperimentalScope<!>.<!DEBUG_INFO_ELEMENT_WITH_ERROR_TYPE!>BINARY<!><!>)
annotation class ExperimentalBinaryAPI

@ExperimentalSourceOnlyAPI
fun sourceOnly() {}

@ExperimentalBinaryAPI
fun binary() {}

// FILE: usage.kt

package usage

import api.*

fun use1() {
    sourceOnly()
    binary()
}

val use2 = sourceOnly()
val use3 = binary()


inline fun inlineUse1() {
    <!EXPERIMENTAL_API_USAGE_ERROR!>sourceOnly<!>()
    <!EXPERIMENTAL_API_USAGE_ERROR!>binary<!>()
}

inline var inlineUse2: Unit
    get() {
        <!EXPERIMENTAL_API_USAGE_ERROR!>sourceOnly<!>()
        <!EXPERIMENTAL_API_USAGE_ERROR!>binary<!>()
    }
    set(value) {
        <!EXPERIMENTAL_API_USAGE_ERROR!>sourceOnly<!>()
        <!EXPERIMENTAL_API_USAGE_ERROR!>binary<!>()
    }

var inlineUse3: Unit
    inline get() {
        <!EXPERIMENTAL_API_USAGE_ERROR!>sourceOnly<!>()
        <!EXPERIMENTAL_API_USAGE_ERROR!>binary<!>()
    }
    @ExperimentalSourceOnlyAPI
    @ExperimentalBinaryAPI
    inline set(value) {
        sourceOnly()
        binary()
    }

@ExperimentalSourceOnlyAPI
@ExperimentalBinaryAPI
inline fun inlineUse4() {
    sourceOnly()
    binary()
}
