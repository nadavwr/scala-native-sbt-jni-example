################################################################
# A minimal CMake file that is compatible with sbt-jni         #
#                                                              #
# All settings required by sbt-jni have been marked so, please #
# add/modify/remove settings to build your specific library.   #
################################################################

cmake_minimum_required(VERSION 3.0.0)

# Define project and related variables
# (required by sbt-jni) please use semantic versioning
#
project (println)
set(PROJECT_VERSION_MAJOR 0)
set(PROJECT_VERSION_MINOR 1)
set(PROJECT_VERSION_PATCH 0)

# Include directories
#include_directories(.)

# Sources
file(GLOB LIB_SRC
  "*.c"
  "*.cc"
  "*.cpp"
)

# Setup installation targets
# (required by sbt-jni) major version should always be appended to library name
#
set (LIB_NAME ${PROJECT_NAME}${PROJECT_VERSION_MAJOR})
add_library(${LIB_NAME} SHARED ${LIB_SRC})
install(TARGETS ${LIB_NAME} LIBRARY DESTINATION .)

## uncomment lines below to also build libprintln.a
## note that you'll have to change the @link attribute to point to "println" (drop the 0)
#add_library(${PROJECT_NAME} STATIC ${LIB_SRC})
#install(TARGETS ${PROJECT_NAME} ARCHIVE DESTINATION .)

