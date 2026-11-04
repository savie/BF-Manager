package l;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۧ᩸᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 21VN */
/* JADX INFO: loaded from: classes3.dex */
public final class C11911 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f38379;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f38380;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f38381;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f38382;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C13961 f38383;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f38384;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f38385;

    /* JADX WARN: Code duplicated, block: B:40:0x00ea  */
    public C11911(C13961 c13961) throws IOException {
        long jM29863;
        long jM29864;
        boolean z;
        boolean z2;
        this.f38383 = c13961;
        long length = c13961.length();
        long j = length - 22;
        for (long jMax = Math.max(0L, length - 65557); j >= jMax; jMax = jMax) {
            m29852(j);
            if (m29856() == 101010256) {
                long j2 = 12 + j;
                m29852(j2);
                long jM29856 = ((long) m29856()) & 4294967295L;
                long jM29857 = ((long) m29856()) & 4294967295L;
                C13961 c13962 = this.f38383;
                int i = c13962.read();
                int i2 = c13962.read();
                if ((i | i2) < 0) {
                    throw new EOFException();
                }
                boolean z3 = false;
                boolean z4 = ((long) ((i2 << 8) | i)) == (length - j) - 22;
                boolean z5 = jM29857 == 4294967295L || jM29856 == 4294967295L;
                boolean z6 = jM29857 <= j && jM29856 <= j - jM29857;
                if (z4 && (z5 || z6)) {
                    this.f38385 = j;
                    m29852(j2);
                    long jM29858 = ((long) m29856()) & 4294967295L;
                    long jM29859 = ((long) m29856()) & 4294967295L;
                    if (jM29859 == 4294967295L || jM29858 == 4294967295L) {
                        long j3 = j - 20;
                        if (j3 >= 0) {
                            m29852(j3);
                            if (m29856() == 117853008) {
                                m29861(4);
                                m29852(m29863());
                                if (m29856() == 101075792) {
                                    m29863();
                                    m29861(12);
                                    m29863();
                                    m29861(8);
                                    jM29863 = m29863();
                                    jM29864 = m29863();
                                    z = true;
                                } else {
                                    z = false;
                                    jM29863 = 0;
                                    jM29864 = 0;
                                }
                            } else {
                                z = false;
                                jM29863 = 0;
                                jM29864 = 0;
                            }
                        } else {
                            z = false;
                            jM29863 = 0;
                            jM29864 = 0;
                        }
                    } else {
                        z = false;
                        jM29863 = 0;
                        jM29864 = 0;
                    }
                    if (z) {
                        jM29858 = jM29863;
                        jM29859 = jM29864;
                    }
                    if (jM29859 < 0 || jM29858 < 0 || jM29859 > j || jM29858 > j - jM29859) {
                        throw new IOException("Central Directory exceeds EOCD");
                    }
                    this.f38381 = z;
                    this.f38384 = jM29858;
                    this.f38379 = jM29859;
                    if (jM29859 >= 32) {
                        try {
                            m29852(jM29859 - 16);
                            if (m29863() == 2334950737559900225L && m29863() == 3617552046287187010L) {
                                m29852(jM29859 - 24);
                                long jM29865 = m29863();
                                long j4 = (jM29859 - jM29865) - 8;
                                if (j4 >= 0) {
                                    m29852(j4);
                                    if (m29863() == jM29865) {
                                        z3 = true;
                                        jM29859 = j4;
                                    }
                                }
                            }
                            z2 = z3;
                        } catch (Exception unused) {
                            z2 = false;
                        }
                    } else {
                        z2 = z3;
                    }
                    this.f38380 = jM29859;
                    this.f38382 = z2;
                    return;
                }
            }
            j--;
        }
        throw new IOException("Archive is not a ZIP archive");
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long m29854() {
        return this.f38383.length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29852(long j) {
        this.f38383.seek(j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m29850() {
        return this.f38383.getFilePointer();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29861(int i) throws IOException {
        if (i < 0) {
            throw new IOException(C13645.m33382(i, "Skip "));
        }
        C13961 c13961 = this.f38383;
        long filePointer = c13961.getFilePointer() + ((long) i);
        if (filePointer > c13961.length()) {
            throw new EOFException();
        }
        c13961.seek(filePointer);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m29853(int i) throws IOException {
        if (i < 0) {
            throw new IOException(C13645.m33382(i, "Read "));
        }
        long j = i;
        C13961 c13961 = this.f38383;
        if (j > c13961.length() - c13961.getFilePointer()) {
            throw new EOFException();
        }
        byte[] bArr = new byte[i];
        c13961.readFully(bArr, 0, i);
        return bArr;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m29856() throws EOFException {
        C13961 c13961 = this.f38383;
        int i = c13961.read();
        int i2 = c13961.read();
        int i3 = c13961.read();
        int i4 = c13961.read();
        if ((i | i2 | i3 | i4) < 0) {
            throw new EOFException();
        }
        return (i4 << 24) | i | (i2 << 8) | (i3 << 16);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long m29863() throws EOFException {
        C13961 c13961 = this.f38383;
        long j = c13961.read();
        long j2 = c13961.read();
        long j3 = c13961.read();
        long j4 = c13961.read();
        long j5 = c13961.read();
        long j6 = c13961.read();
        long j7 = c13961.read();
        long j8 = c13961.read();
        if ((j | j2 | j3 | j4 | j5 | j6 | j7 | j8) < 0) {
            throw new EOFException();
        }
        return (j8 << 56) | j | (j2 << 8) | (j3 << 16) | (j4 << 24) | (j5 << 32) | (j6 << 40) | (j7 << 48);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m29857() {
        return this.f38381;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m29855() {
        return this.f38380;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m29851() {
        return this.f38379;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m29860() {
        return this.f38384;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long m29862() {
        return this.f38385;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m29858() {
        return this.f38382;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17713 m29859() {
        return this.f38383;
    }
}
