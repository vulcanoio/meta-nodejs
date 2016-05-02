SUMMARY = "The browser package manager"
HOMEPAGE = "http://bower.io"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e273de0d9430b4e4a74446f00e19ac54"

SRC_URI = "npm://registry.npmjs.org;name=bower;version=${PV}"

NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

INSANE_SKIP_${PN} += "file-rdeps"

BBCLASSEXTEND = "native nativesdk"
PACKAGE_ARCH = "all"
