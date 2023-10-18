#include "stdio.h"
#include "stdlib.h"

int main()
{
        while(1)
        {
                fprintf(stderr, "HelloWorld: this is a patch!");
                sleep(1);
        }
        return 0;
}
