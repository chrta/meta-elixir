
SRCREV = "1e15397a4924804f248facc18ccd07076baef7a4"
PV = "3.19.0-git${SRCPV}"

DEPENDS += "rebar3-native"

do_compile() {
    rebar3 escriptize
}
