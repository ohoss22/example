DESCRIPTION = "Hello World Example"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
PV = "1.0"
PR = "r0"

SRC_URI = "git://github.com/ohoss22/example.git;protocol=https;branch=main"

S = "${WORKDIR}"

do_compile () {
    make
}

do_install() {
        install -d ${D}${bindir}/
        install -m 0755 ${S}/hello ${D}${bindir}/
}

FILES_${PN} = "${bindir}/hello"

TARGET_CC_ARCH += "${LDFLAGS}"

INSANE_SKIP_${PN} = "ldflags"
INSANE_SKIP_${PN}-dev = "ldflags"

