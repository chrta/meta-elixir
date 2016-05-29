SUMMARY = "Nerves blinky project"
DESCRIPTION = "Blonky that is based on nerves"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/LICENSE;md5=180feeeb39521091a7f2ced341588068"

DEPENDS += "nerves"

S = "${WORKDIR}/git/blinky"
SRCREV = "3aa497e14e4d18fe96f1f7a081649cc07d1440d6"
PV = "0.1.0"
PR = "r0"

SRC_URI = "git://github.com/nerves-project/nerves-examples;branch=master \
	file://LICENSE \
    "

# TODO: Read this from mix.exs in bbclass
MIX_RELEASE_NAME = "blinky"
MIX_RELEASE_VERSION = "0.1.0"

inherit mix
