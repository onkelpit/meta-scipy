inherit pypi setuptools3

SUMMARY = "Ahead of Time compiler for numeric kernels"
HOMEPAGE = "https://pythran.readthedocs.io/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e277a0b6033e0cb3d510c86b74144b01"

SRC_URI[sha256sum] = "42f3473946205964844eff7f750e2541afb2006d53475d708f5ff2d048db89bd"

DEPENDS = "python3-gast"
RDEPENDS_${PN} = "python3-beniget python3-gast"

BBCLASSEXTEND = "native"
