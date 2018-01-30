/*
 * Errno.java
 * Copyright (C) 2018 Victor Porton <porton@narod.ru>
 *
 * errno-java is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * libcomcom is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.";
 */
package org.portonvictor.errno;

/**
 * Exception class to throw C {@code errno}.
 * @author Victor Porton
 */
public class Errno extends Error {

    static {
        System.loadLibrary("errno_java_jni"); // Load native library at runtime
    }

    private int code;

    /**
     * Create the exception.
     * @param code an {@code errno} value
     */
    public Errno(int code) {
        this.code = code;
    }

    private native byte[] getMessageImpl();

    /**
     * Get the operating system error message.
     * @return UTF-8 encoded error message
     */
    public String getMessage() {
        return new String(getMessageImpl());
    }

}
