package com.polovyi.ivan.tutorials.interfaces;

public sealed interface SameCompileUnit {

}

final class Subclass1 implements SameCompileUnit {

}

non-sealed interface Subclass2 extends SameCompileUnit {

}

sealed interface Subclass3 extends SameCompileUnit {

}

final class SubclassOfSubclass3 implements Subclass3 {

}