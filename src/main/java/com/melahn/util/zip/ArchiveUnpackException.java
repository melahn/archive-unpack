package com.melahn.util.zip;

import java.util.UUID;

/*
 *  ArchiveUnpackException is an exception class designed for use in problenms discovered 
 *  unpacking an archive, such as the zip slip vulnerability described
 *  by https://github.com/snyk/zip-slip-vulnerability
*/
public class ArchiveUnpackException extends SecurityException {
    static final long serialVersionUID = UUID.fromString("5a8dba66-71e1-492c-bf3b-53cceb67b785")
            .getLeastSignificantBits();

    public ArchiveUnpackException(String message) {
        super(message);
    }
}
