include nerves.inc

inherit native

SUMMARY = "Nerves bootstrap"
DESCRIPTION = "Provides mix tasks for nerves"

S = "${WORKDIR}/git/archive/nerves_bootstrap"

# TODO: Read this from mix.exs in bbclass
MIX_RELEASE_NAME = "nerves_bootstrap"
MIX_RELEASE_VERSION = "0.1.2"

inherit mix

do_install() {
	     MIX_ENV="release" mix install
}