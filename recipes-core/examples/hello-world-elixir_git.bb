SUMMARY = "Example elixir project"
DESCRIPTION = "Small elixir project that uses exrm"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=80479b4d48f02e14fb0da33d8bb24bd6"

S = "${WORKDIR}/git"
SRCREV = "6fbcca1042d3c49b43c1650178c2de3bd80fe3f5"
PV = "0.0.1"
PR = "r0"

SRC_URI = "git://github.com/chrta/hello_world_elixir;branch=master \
    "

# TODO: Read this from mix.exs in bbclass
MIX_RELEASE_NAME = "hello_world"
MIX_RELEASE_VERSION = "0.0.1"

inherit mix
