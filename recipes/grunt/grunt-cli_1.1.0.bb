SUMMARY = "The grunt command line interface"
HOMEPAGE = "http://gruntjs.com/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;md5=a24cc788ab726e615aa5bf0168c5d77d"

SRC_URI = "npm://registry.npmjs.org;name=grunt-cli;version=${PV}"

NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

INSANE_SKIP_${PN} += "file-rdeps"

BBCLASSEXTEND = "native nativesdk"
PACKAGE_ARCH = "all"
