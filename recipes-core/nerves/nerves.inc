
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/LICENSE;md5=180feeeb39521091a7f2ced341588068"

S = "${WORKDIR}/git"
SRCREV = "76b5161daa49c10818cace199828b0ea44305f2d"
PV = "0.3.2"
PR = "r0"

SRC_URI = "git://github.com/chrta/nerves;branch=yocto \
	file://LICENSE \
	file://0001-Add-relx.config.patch \
    "
