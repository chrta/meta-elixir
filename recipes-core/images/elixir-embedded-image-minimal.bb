SUMMARY = "A small image just capable of allowing a device to boot with Elixir and Erlang."

IMAGE_INSTALL = "\
	      packagegroup-core-boot \
	      ${ROOTFS_PKGMANAGE_BOOTSTRAP} \
	      ${CORE_IMAGE_EXTRA_INSTALL} \
	      packagegroup-erlang-embedded \
	      elixir \
	      hello-world-elixir \
	      "

#		     packagegroup-erlang-embedded \
#

IMAGE_LINGUAS = " "

#GLIBC_GENERATE_LOCALES = "en_US.UTF-8"

USE_NLS="no"

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_SIZE ?= "40000"
