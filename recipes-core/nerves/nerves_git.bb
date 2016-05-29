include nerves.inc

SUMMARY = "Nerves core"
DESCRIPTION = "Nerves core library providing nerves_bootstrap"

DEPENDS += "nerves-bootstrap-native"

S = "${WORKDIR}/git"

# TODO: Read this from mix.exs in bbclass
MIX_RELEASE_NAME = "nerves"
MIX_RELEASE_VERSION = "0.3.2-dev"

inherit mix
