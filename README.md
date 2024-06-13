Prerequisites

    Install Java Development Kit (JDK):
        Download and install JDK from Oracle's website.
        Set up your JAVA_HOME environment variable.

---

Java Extension Pack -vsc ext.

---

Set up your JAVA_HOME environment variable on MAC: https://stackoverflow.com/questions/22842743/how-to-set-java-home-environment-variable-on-mac-os-x-10-9

---

Download & Install install JDK

    First, install JDK
    Open terminal check java version

    $ java -version


    -----

Set JAVA_HOME environment variable

    Open .zprofile file

    $ open -t .zprofile

Or create . zprofile file

    $ open -t .zprofile

    write in .zprofile

    export JAVA_HOME=$(/usr/libexec/java_home)

Save .zprofile and close the bash file & then write in the terminal for work perfectly.

$ source .zprofile

Setup test in terminal

$ echo $JAVA_HOME  
/Library/Java/JavaVirtualMachines/jdk-21.jdk/Contents/Home

---
