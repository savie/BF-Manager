package com.amazonaws.util;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class NamespaceRemovingInputStream extends SdkFilterInputStream {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f831;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final byte[] f832;

    public NamespaceRemovingInputStream(ByteArrayInputStream byteArrayInputStream) {
        super(new BufferedInputStream(byteArrayInputStream));
        this.f832 = new byte[200];
        this.f831 = false;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        m274();
        int i = ((FilterInputStream) this).in.read();
        if (i != 120 || this.f831) {
            return i;
        }
        this.f832[0] = (byte) i;
        ((FilterInputStream) this).in.mark(this.f832.length);
        InputStream inputStream = ((FilterInputStream) this).in;
        byte[] bArr = this.f832;
        int i2 = inputStream.read(bArr, 1, bArr.length - 1);
        ((FilterInputStream) this).in.reset();
        String str = new String(this.f832, 0, i2 + 1, StringUtils.f834);
        StringPrefixSlicer stringPrefixSlicer = new StringPrefixSlicer(str);
        int length = -1;
        if (stringPrefixSlicer.m780("xmlns")) {
            stringPrefixSlicer.m781();
            if (stringPrefixSlicer.m780("=")) {
                stringPrefixSlicer.m781();
                if (stringPrefixSlicer.m780("\"") && stringPrefixSlicer.m782()) {
                    length = str.length() - stringPrefixSlicer.m779().length();
                }
            }
        }
        if (length <= 0) {
            return i;
        }
        for (int i3 = 0; i3 < length - 1; i3++) {
            ((FilterInputStream) this).in.read();
        }
        int i4 = ((FilterInputStream) this).in.read();
        this.f831 = true;
        return i4;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = read();
            if (i4 == -1) {
                if (i3 == 0) {
                    return -1;
                }
                return i3;
            }
            bArr[i3 + i] = (byte) i4;
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final class StringPrefixSlicer {

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public String f833;

        public StringPrefixSlicer(String str) {
            this.f833 = str;
        }

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final String m779() {
            return this.f833;
        }

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final boolean m780(String str) {
            if (!this.f833.startsWith(str)) {
                return false;
            }
            this.f833 = this.f833.substring(str.length());
            return true;
        }

        /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
        public final void m781() {
            if (this.f833.startsWith(" ")) {
                while (this.f833.startsWith(" ")) {
                    this.f833 = this.f833.substring(1);
                }
            }
        }

        /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
        public final boolean m782() {
            int iIndexOf = this.f833.indexOf("\"");
            if (iIndexOf < 0) {
                return false;
            }
            this.f833 = this.f833.substring(iIndexOf + 1);
            return true;
        }
    }
}
