DEPENDS += "elixir elixir-native"

B = "${S}"

# This is the default directory erlinit is looking for releases
ERLINIT_RELEASE_PATH ?= "/srv/erlang"

elixir_release = "${D}/${ERLINIT_RELEASE_PATH}/${BPN}"

MIX_RELEASE_NAME ?= "${BPN}"
MIX_RELEASE_VERSION ?= "${PV}"

MIX_ENV = "prod"

mix_do_compile() {
    MIX_ENV=${MIX_ENV} yes | mix do deps.get, compile
}

mix_do_install() {
    # build release using mix and exrm
    # the exrm dependency must used in the mix file
    MIX_ENV=${MIX_ENV} yes | mix release

    # create target directory
    install -d ${elixir_release}

    #B = .../poky/build/tmp/work/i586-poky-linux/hello-world-elixir/0.0.1-gitAUTOINC+6fbcca1042-r0/git/
    #rel
    #BPN = hello-world-elixir vs "hello_world"
    #releases
    #PV = 0.0.1-gitAUTOINC+6fbcca1042 vs "0.0.1"
    #MIX_RELEASE_NAME = hello-world-elixir
    #.tar.gz
    
    # extract build release
    MIX_RELEASE_DIR="${B}/rel/${MIX_RELEASE_NAME}/releases/${MIX_RELEASE_VERSION}"
    tar -zxf ${MIX_RELEASE_DIR}/${MIX_RELEASE_NAME}.tar.gz -C ${elixir_release}
}

EXPORT_FUNCTIONS do_compile do_install

FILES_${PN} += "${ERLINIT_RELEASE_PATH}"