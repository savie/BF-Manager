package l;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩸ۨۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95GT */
/* JADX INFO: loaded from: classes.dex */
public final class C22781 implements InterfaceC14070 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f73898 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f73897 = new byte[0];

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m51382() {
        return this.f73897;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m51383() {
        return this.f73898;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] m51385() {
        return Arrays.copyOf(this.f73897, this.f73898);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m51384() {
        Arrays.fill(this.f73897, (byte) 0);
        this.f73898 = 0;
    }

    @Override // l.InterfaceC14070
    /* JADX INFO: renamed from: ۛ */
    public final OutputStream mo14972(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        return new C22035(this, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51379(C22781 c22781, int i) {
        if (i > c22781.f73898) {
            byte[] bArr = c22781.f73897;
            if (i > bArr.length) {
                int iMax = Math.max((i >> 2) + i, bArr.length + 262144);
                if (iMax < i) {
                    throw new IndexOutOfBoundsException();
                }
                c22781.f73897 = Arrays.copyOf(c22781.f73897, iMax);
            }
            c22781.f73898 = i;
        }
    }

    @Override // l.InterfaceC14070
    /* JADX INFO: renamed from: ۨ */
    public final InputStream mo14973(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        return new C10846(this, i);
    }
}
