package com.polovyi.ivan.tutorials.classes;

public sealed class SameCompileUnit {

}

final class Subclass1 extends SameCompileUnit {

}

non-sealed class Subclass2 extends SameCompileUnit {

}

sealed class Subclass3 extends SameCompileUnit {

}

final class SubclassOfSubclass3 extends Subclass3 {

}