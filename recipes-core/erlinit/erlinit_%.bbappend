SRCREV = "b291b8a0f62b1f9e6431aced02009de7fcb7b00b"
PV = "0.7.2-git${SRCPV}"
PR = "r1"

LIC_FILES_CHKSUM = "file://LICENSE;md5=1cb512268740591efa7a3791b3924ef8"

SRC_URI = "git://github.com/chrta/erlinit;branch=add_erlexec_boot_var \
    file://erlinit.config \
    "


#do_install() {
#        install -d 0755 ${D}/${base_sbindir}
#        install -d 0755 ${D}/${sysconfdir}
#	install -m 0755 ${S}/erlinit ${D}/${base_sbindir}
#        install -m 0644 ${WORKDIR}/erlinit.config ${D}/${sysconfdir}/erlinit.config
#}
