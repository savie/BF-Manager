package l;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21VN */
/* JADX INFO: loaded from: classes4.dex */
public final class C18459 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean f58823;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f58824;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f58825;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C1388 f58826;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f58827;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f58828;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f58829;

    /* JADX WARN: Code duplicated, block: B:40:0x00ea  */
    public C18459(C1388 c1388) throws IOException {
        long jM42819;
        long jM428110;
        boolean z;
        boolean z2;
        this.f58826 = c1388;
        long length = c1388.length();
        long j = length - 22;
        for (long jMax = Math.max(0L, length - 65557); j >= jMax; jMax = jMax) {
            m42810(j);
            if (m42813() == 101010256) {
                long j2 = 12 + j;
                m42810(j2);
                long jM42813 = ((long) m42813()) & 4294967295L;
                long jM42814 = ((long) m42813()) & 4294967295L;
                C1388 c1389 = this.f58826;
                int i = c1389.read();
                int i2 = c1389.read();
                if ((i | i2) < 0) {
                    throw new EOFException();
                }
                boolean z3 = false;
                boolean z4 = ((long) ((i2 << 8) | i)) == (length - j) - 22;
                boolean z5 = jM42814 == 4294967295L || jM42813 == 4294967295L;
                boolean z6 = jM42814 <= j && jM42813 <= j - jM42814;
                if (z4 && (z5 || z6)) {
                    this.f58824 = j;
                    m42810(j2);
                    long jM42815 = ((long) m42813()) & 4294967295L;
                    long jM42816 = ((long) m42813()) & 4294967295L;
                    if (jM42816 == 4294967295L || jM42815 == 4294967295L) {
                        long j3 = j - 20;
                        if (j3 >= 0) {
                            m42810(j3);
                            if (m42813() == 117853008) {
                                m42817(4);
                                m42810(m42819());
                                if (m42813() == 101075792) {
                                    m42819();
                                    m42817(12);
                                    m42819();
                                    m42817(8);
                                    jM42819 = m42819();
                                    jM428110 = m42819();
                                    z = true;
                                } else {
                                    z = false;
                                    jM42819 = 0;
                                    jM428110 = 0;
                                }
                            } else {
                                z = false;
                                jM42819 = 0;
                                jM428110 = 0;
                            }
                        } else {
                            z = false;
                            jM42819 = 0;
                            jM428110 = 0;
                        }
                    } else {
                        z = false;
                        jM42819 = 0;
                        jM428110 = 0;
                    }
                    if (z) {
                        jM42815 = jM42819;
                        jM42816 = jM428110;
                    }
                    if (jM42816 < 0 || jM42815 < 0 || jM42816 > j || jM42815 > j - jM42816) {
                        throw new IOException("Central Directory exceeds EOCD");
                    }
                    this.f58823 = z;
                    this.f58828 = jM42815;
                    this.f58825 = jM42816;
                    if (jM42816 >= 32) {
                        try {
                            m42810(jM42816 - 16);
                            if (m42819() == 2334950737559900225L && m42819() == 3617552046287187010L) {
                                m42810(jM42816 - 24);
                                long jM428111 = m42819();
                                long j4 = (jM42816 - jM428111) - 8;
                                if (j4 >= 0) {
                                    m42810(j4);
                                    if (m42819() == jM428111) {
                                        z3 = true;
                                        jM42816 = j4;
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
                    this.f58827 = jM42816;
                    this.f58829 = z2;
                    return;
                }
            }
            j--;
        }
        throw new IOException("Archive is not a ZIP archive");
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long m42815() {
        return this.f58826.length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42810(long j) {
        this.f58826.seek(j);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long m42808() {
        return this.f58826.getFilePointer();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m42817(int i) throws IOException {
        if (i < 0) {
            throw new IOException(C8479.m22141(i, "Skip "));
        }
        C1388 c1388 = this.f58826;
        long filePointer = c1388.getFilePointer() + ((long) i);
        if (filePointer > c1388.length()) {
            throw new EOFException();
        }
        c1388.seek(filePointer);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m42811(int i) throws IOException {
        if (i < 0) {
            throw new IOException(C8479.m22141(i, "Read "));
        }
        long j = i;
        C1388 c1388 = this.f58826;
        if (j > c1388.length() - c1388.getFilePointer()) {
            throw new EOFException();
        }
        byte[] bArr = new byte[i];
        c1388.m4864(bArr, 0, i);
        return bArr;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m42813() throws EOFException {
        C1388 c1388 = this.f58826;
        int i = c1388.read();
        int i2 = c1388.read();
        int i3 = c1388.read();
        int i4 = c1388.read();
        if ((i | i2 | i3 | i4) < 0) {
            throw new EOFException();
        }
        return (i4 << 24) | i | (i2 << 8) | (i3 << 16);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final long m42819() throws EOFException {
        C1388 c1388 = this.f58826;
        long j = c1388.read();
        long j2 = c1388.read();
        long j3 = c1388.read();
        long j4 = c1388.read();
        long j5 = c1388.read();
        long j6 = c1388.read();
        long j7 = c1388.read();
        long j8 = c1388.read();
        if ((j | j2 | j3 | j4 | j5 | j6 | j7 | j8) < 0) {
            throw new EOFException();
        }
        return (j8 << 56) | j | (j2 << 8) | (j3 << 16) | (j4 << 24) | (j5 << 32) | (j6 << 40) | (j7 << 48);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m42806() {
        return this.f58823;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m42814() {
        return this.f58827;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m42809() {
        return this.f58825;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m42816() {
        return this.f58828;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long m42807() {
        return this.f58824;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m42818() {
        return this.f58829;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7739 m42812() {
        return this.f58826;
    }
}
