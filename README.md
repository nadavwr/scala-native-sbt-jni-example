[sbt-jni](https://github.com/jodersky/sbt-jni)'s `nativeCompile` will compile and link a dynamic library used from Scala code. Scala Native's `nativeLink` and `run` will "just work" (with a tiny nudge so that the dynamic library is picked up).

Packaging is somewhat of an issue: `package` works just fine, and you'll see that the dynamic library is packaged as `native/${your_platform}/libprintln0.dylib`, but additional work will be needed to be able to use it as part of a dependency jar. Cross-compilation is also not addressed.

Given its stated purpose (JNI...), it is understandable that sbt-jni expects us to build a dynamic library. However, building and linking against a static library is perfectly possible (albeit alongside a dynamic library, so that sbt-jni doesn't complain). See comment at bottom of `CMakeLists.txt`. It doesn't handle packaging of static libraries out-of-the-box, but all that seems to be within easy reach.

