/*
 * Copyright 2016 Jonathan Paz <jonathan@pazdev.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.pazdev.tar;

/**
 *
 * @author Jonathan Paz jonathan.paz@pazdev.com
 */
public final class TarConstants {

    public static final short SET_UID = 04000;
    public static final short SET_GID = 02000;
    public static final short STICKY = 01000;
    public static final short OWNER_READ = 00400;
    public static final short OWNER_WRITE = 00200;
    public static final short OWNER_EXECUTE = 00100;
    public static final short GROUP_READ = 00040;
    public static final short GROUP_WRITE = 00020;
    public static final short GROUP_EXECUTE = 00010;
    public static final short OTHERS_READ = 00004;
    public static final short OTHERS_WRITE = 00002;
    public static final short OTHERS_EXECUTE = 00001;

    public static final char REGTYPE = '0';
    public static final char AREGTYPE = '\0';
    public static final char LNKTYPE = '1';
    public static final char SYMTYPE = '2';
    public static final char CHRTYPE = '3';
    public static final char BLKTYPE = '4';
    public static final char DIRTYPE = '5';
    public static final char FIFOTYPE = '6';
    public static final char CONTTYPE = '7';
    public static final char XHDTYPE = 'x';
    public static final char XGLTYPE = 'g';

    public static final int BLOCKSIZE = 512;

    public static final int NAME_OFFSET = 0;
    public static final int NAME_LENGTH = 100;
    public static final int MODE_OFFSET = 100;
    public static final int MODE_LENGTH = 8;
    public static final int UID_OFFSET = 108;
    public static final int UID_LENGTH = 8;
    public static final int GID_OFFSET = 116;
    public static final int GID_LENGTH = 8;
    public static final int SIZE_OFFSET = 124;
    public static final int SIZE_LENGTH = 12;
    public static final int MTIME_OFFSET = 136;
    public static final int MTIME_LENGTH = 12;
    public static final int CHKSUM_OFFSET = 148;
    public static final int CHKSUM_LENGTH = 8;
    public static final int TYPEFLAG_OFFSET = 156;
    public static final int TYPEFLAG_LENGTH = 1;
    public static final int LINKNAME_OFFSET = 157;
    public static final int LINKNAME_LENGTH = 100;
    public static final int MAGIC_OFFSET = 257;
    public static final int MAGIC_LENGTH = 6;
    public static final int VERSION_OFFSET = 263;
    public static final int VERSION_LENGTH = 2;
    public static final int UNAME_OFFSET = 265;
    public static final int UNAME_LENGTH = 32;
    public static final int GNAME_OFFSET = 297;
    public static final int GNAME_LENGTH = 32;
    public static final int DEVMAJOR_OFFSET = 329;
    public static final int DEVMAJOR_LENGTH = 8;
    public static final int DEVMINOR_OFFSET = 337;
    public static final int DEVMINOR_LENGTH = 8;
    public static final int PREFIX_OFFSET = 345;
    public static final int PREFIX_LENGTH = 155;
    public static final int GNU_MAGIC_LENGTH = 8;
    public static final int GNU_ATIME_OFFSET = 345;
    public static final int GNU_ATIME_LENGTH = 12;
    public static final int GNU_CTIME_OFFSET = 357;
    public static final int GNU_CTIME_LENGTH = 12;
    public static final int GNU_MULTIVOL_OFFSET = 369;
    public static final int GNU_MULTIVOL_LENGTH = 12;
    public static final int GNU_SPARSES_OFFSET = 386;
    public static final int GNU_SPARSES_LENGTH = 96;
    public static final int GNU_SPARSE_EXTENDED_OFFSET = 482;
    public static final int GNU_SPARSE_EXTENDED_LENGTH = 1;
    public static final int GNU_SPARSE_REALSIZE_OFFSET = 483;
    public static final int GNU_SPARSE_REALSIZE_LENGTH = 12;
    public static final int SCHILY_PREFIX_LENGTH = 131;
    public static final int SCHILY_ATIME_OFFSET = 476;
    public static final int SCHILY_ATIME_LENGTH = 12;
    public static final int SCHILY_CTIME_OFFSET = 488;
    public static final int SCHILY_CTIME_LENGTH = 12;
    public static final int SCHILY_MFILL_OFFSET = 500;
    public static final int SCHILY_MFILL_LENGTH = 8;
    public static final int SCHILY_XMAGIC_OFFSET = 508;
    public static final int SCHILY_XMAGIC_LENGTH = 4;

    public static final char GNUTYPE_DUMPDIR = 'D';
    public static final char GNUTYPE_LONGLINK = 'K';
    public static final char GNUTYPE_LONGNAME = 'L';
    public static final char GNUTYPE_MULTIVOL = 'M';
    public static final char GNUTYPE_SPARSE = 'S';
    public static final char GNUTYPE_VOLHDR = 'V';
    public static final char SOLARIS_XHDTYPE = 'X';
    public static final char SCHILY_INODE = 'I';

    public static final String USTAR_MAGIC = "ustar";
    public static final String USTAR_VERSION = "00";
    public static final String GNU_MAGIC = "ustar  ";
    public static final String SCHILY_XMAGIC = "tar";

    public static final String PAX_ATIME = "atime";
    public static final String PAX_CHARSET = "charset";
    public static final String PAX_COMMENT = "comment";
    public static final String PAX_CTIME = "ctime";
    public static final String PAX_GID = "gid";
    public static final String PAX_GNAME = "gname";
    public static final String PAX_LINKPATH = "linkpath";
    public static final String PAX_MTIME = "mtime";
    public static final String PAX_PATH = "path";
    public static final String PAX_SIZE = "size";
    public static final String PAX_UID = "uid";
    public static final String PAX_UNAME = "uname";

    private TarConstants() {
        throw new UnsupportedOperationException("Cannot instantiate this class");
    }
}
