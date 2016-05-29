# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0c48e31d655fb0e9b1f60b931e652f47"

#SRC_URI = "git://github.com/elixir-lang/elixir.git;protocol=https"
SRC_URI = "git://github.com/elixir-lang/elixir.git;protocol=https;branch=v1.2"

# Modify these as desired
#PV = "1.3.0-dev+git${SRCPV}"
#SRCREV = "${AUTOREV}"
PV = "1.2.5"
SRCREV = "e5374cf5d3beb510a0fdeddd0f8b89e8e26445ef"

S = "${WORKDIR}/git"

#erlang-compiler for iex
RDEPENDS_${PN} += "erlang erlang-compiler"

do_compile () {
	# You will almost certainly need to add additional arguments here
	oe_runmake
}

do_install () {
	# This is a guess; additional arguments may be required
	oe_runmake install PREFIX=${D}${prefix}
}
