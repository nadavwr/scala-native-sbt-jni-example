#include <stdio.h>

__attribute__ ((visibility ("default")))
void println(const char *s) {
  printf("%s\n", s);
}

