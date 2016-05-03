SUMMARY = "Command line interface for gulp"
HOMEPAGE = "http://gulpjs.com"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2823b4b2f2e0f9bae5fa46f1f150c75a"

SRC_URI = "npm://registry.npmjs.org;name=gulp-cli;version=${PV}"

NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

INSANE_SKIP_${PN} += "file-rdeps"

BBCLASSEXTEND = "native nativesdk"
PACKAGE_ARCH = "all"
