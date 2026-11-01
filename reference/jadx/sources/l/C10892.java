package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۧۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 79WK */
/* JADX INFO: loaded from: classes4.dex */
public class C10892 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f37063 = C13488.m32997(C10892.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f37064;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f37065;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f37066;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f37067;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f37068;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f37069;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f37070;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f37071;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C5952 f37072;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f37073;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C17241 f37074;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f37075;

    @Override // java.io.InputStream
    public int available() {
        return 0;
    }

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    /* JADX INFO: renamed from: ۙ */
    public synchronized C5952 mo9476() {
        C5952 c5952 = this.f37072;
        if (c5952 != null && c5952.m16226()) {
            C5952 c5953 = this.f37072;
            c5953.m16224();
            return c5953;
        }
        C17241 c17241 = this.f37074;
        if (c17241 instanceof C14420) {
            this.f37072 = c17241.m40192(32, ((C14420) c17241).m34690() & 16711680, this.f37075, 128, 0);
        } else {
            C5952 c5952M40192 = c17241.m40192(this.f37073, this.f37071, this.f37075, 128, 0);
            c5952M40192.m16224();
            this.f37072 = c5952M40192;
        }
        return this.f37072;
    }

    public C10892(C17241 c17241) throws C12303 {
        this.f37065 = new byte[1];
        this.f37074 = c17241;
        this.f37067 = false;
        this.f37073 = 0;
        this.f37071 = 1;
        this.f37075 = 7;
        try {
            C17987 c17987M40191 = c17241.m40191();
            try {
                this.f37070 = c17987M40191.m41875();
                if (c17241.mo34687() != 16) {
                    C5952 c5952Mo9476 = mo9476();
                    if (c5952Mo9476 != null) {
                        c5952Mo9476.m16227();
                    }
                    this.f37073 = 0;
                }
                m27293(c17987M40191);
                c17987M40191.close();
            } catch (Throwable th) {
                if (c17987M40191 != null) {
                    try {
                        c17987M40191.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (C8484 e) {
            throw C12303.m30559(e);
        }
    }

    public C10892(C14420 c14420, C17987 c17987) throws C12303 {
        this.f37065 = new byte[1];
        this.f37074 = c14420;
        this.f37072 = null;
        this.f37067 = false;
        this.f37070 = c17987.m41875();
        try {
            m27293(c17987);
        } catch (C8484 e) {
            throw C12303.m30559(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m27293(InterfaceC18693 interfaceC18693) {
        if (this.f37070) {
            C17987 c17987 = (C17987) interfaceC18693;
            this.f37066 = c17987.m41881();
            this.f37068 = c17987.m41881();
            return;
        }
        C17987 c17988 = (C17987) interfaceC18693;
        this.f37066 = Math.min(c17988.m41881() - 70, c17988.m41866() - 70);
        boolean zM41870 = c17988.m41870(16384);
        InterfaceC4314 interfaceC4314 = f37063;
        if (zM41870) {
            this.f37069 = true;
            this.f37068 = Math.min(((C9895) c17988.m41882()).m25084() - 70, c17988.m41873() ? 65465 : 16777145);
            interfaceC4314.mo12135("Enabling LARGE_READX with " + this.f37068);
        } else {
            interfaceC4314.mo12135("LARGE_READX disabled");
            this.f37068 = this.f37066;
        }
        if (interfaceC4314.mo12125()) {
            interfaceC4314.mo12135("Negotiated file read size is " + this.f37068);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static IOException m27292(C12303 c12303) {
        Throwable cause = c12303.getCause();
        IOException iOException = c12303;
        if (cause instanceof C4498) {
            C4498 c4498 = (C4498) cause;
            cause = c4498.getCause();
            iOException = c4498;
        }
        if (!(cause instanceof InterruptedException)) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException(cause.getMessage());
        interruptedIOException.initCause(cause);
        return interruptedIOException;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0016 */
    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() {
        /*
            r4 = this;
            l.ܿۡ۠ r0 = r4.f37074
            boolean r1 = r4.f37067
            r2 = 0
            l.ۛۡ۠ r3 = r4.f37072     // Catch: java.lang.Throwable -> L16 l.C12303 -> L18
            if (r3 == 0) goto Lc
            r3.m16227()     // Catch: java.lang.Throwable -> L16 l.C12303 -> L18
        Lc:
            r4.f37065 = r2
            r4.f37072 = r2
            if (r1 == 0) goto L15
            r0.close()
        L15:
            return
        L16:
            r3 = move-exception
            goto L1e
        L18:
            r3 = move-exception
            java.io.IOException r3 = m27292(r3)     // Catch: java.lang.Throwable -> L16
            throw r3     // Catch: java.lang.Throwable -> L16
        L1e:
            r4.f37065 = r2
            r4.f37072 = r2
            if (r1 == 0) goto L27
            r0.close()
        L27:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10892.close():void");
    }

    @Override // java.io.InputStream
    public final int read() {
        if (m27294(0, 1, this.f37065) == -1) {
            return -1;
        }
        return this.f37065[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return m27294(0, bArr.length, bArr);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return m27294(i, i2, bArr);
    }

    /* JADX WARN: Code duplicated, block: B:145:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x017a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0184 A[Catch: all -> 0x01ca, TRY_ENTER, TryCatch #8 {all -> 0x01ca, blocks: (B:9:0x001e, B:11:0x0024, B:12:0x0043, B:14:0x0055, B:20:0x0061, B:22:0x0067, B:26:0x0099, B:28:0x00a3, B:30:0x00ad, B:36:0x00c1, B:38:0x00cd, B:45:0x00f1, B:54:0x0103, B:86:0x019c, B:41:0x00e0, B:43:0x00e9, B:55:0x0110, B:35:0x00bf, B:100:0x01b5, B:106:0x01c5, B:107:0x01c9, B:61:0x011f, B:64:0x013f, B:69:0x0162, B:71:0x0172, B:80:0x0184, B:65:0x014b, B:67:0x014f, B:15:0x0058), top: B:140:0x001e, outer: #5 }] */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m27294(int i, int i2, byte[] bArr) throws IOException {
        int i3;
        int i4;
        int i5;
        int iM44720;
        long j;
        byte[] bArr2 = bArr;
        InterfaceC4314 interfaceC4314 = f37063;
        if (i2 <= 0) {
            return 0;
        }
        long j2 = this.f37064;
        if (this.f37065 == null) {
            throw new IOException("Bad file descriptor");
        }
        C5952 c5952Mo9476 = mo9476();
        try {
            C17987 c17987M16222 = c5952Mo9476.m16222();
            try {
                if (interfaceC4314.mo12133()) {
                    interfaceC4314.mo12127("read: fid=" + c5952Mo9476 + ",off=" + i + ",len=" + i2);
                }
                C19626 c19626 = new C19626(i, c17987M16222.m41882(), bArr2);
                int iMo34687 = this.f37074.mo34687();
                int i6 = iMo34687 == 1 ? this.f37068 : this.f37066;
                int i7 = i2;
                int i8 = i;
                while (true) {
                    int i9 = i7 > i6 ? i6 : i7;
                    if (interfaceC4314.mo12133()) {
                        interfaceC4314.mo12127("read: len=" + i7 + ",r=" + i9 + ",fp=" + this.f37064 + ",b.length=" + bArr2.length);
                    }
                    try {
                        if (c17987M16222.m41875()) {
                            i4 = -1;
                            try {
                                C3813 c3813 = new C3813(c17987M16222.m41882(), c5952Mo9476.m16229(), bArr2, i8);
                                try {
                                    c3813.m11103(iMo34687 == 16 ? 0L : this.f37064);
                                    c3813.m11104(i9);
                                    c3813.m11105(i7 - i9);
                                    try {
                                        iM44720 = ((C6636) c17987M16222.m41868(c3813, null, EnumC19358.NO_RETRY)).m17997();
                                    } catch (C12303 e) {
                                        if (e.m30561() != -1073741807) {
                                            throw e;
                                        }
                                        interfaceC4314.mo12120("Reached end of file", (Exception) e);
                                        iM44720 = -1;
                                    }
                                    if (iM44720 <= 0) {
                                        long j3 = this.f37064 - j2;
                                        if (j3 <= 0) {
                                            j3 = -1;
                                        }
                                        int i10 = (int) j3;
                                        c17987M16222.close();
                                        c5952Mo9476.m16227();
                                        return i10;
                                    }
                                    this.f37064 += (long) iM44720;
                                    i8 += iM44720;
                                    i7 -= iM44720;
                                    i5 = i9;
                                    i3 = iMo34687;
                                } catch (C12303 e2) {
                                    e = e2;
                                    i3 = iMo34687;
                                    if (i3 == 16) {
                                    }
                                    throw m27292(e);
                                }
                            } catch (C12303 e3) {
                                e = e3;
                                i3 = iMo34687;
                            }
                        } else {
                            int i11 = iMo34687;
                            try {
                                int i12 = i8;
                                int i13 = i9;
                                C8337 c8337 = new C8337(c17987M16222.m41882(), c5952Mo9476.m16223(), this.f37064, i13);
                                i3 = i11;
                                if (i3 == 16) {
                                    try {
                                        c8337.m21768();
                                        c8337.m21767(1024);
                                        c8337.m21769();
                                    } catch (C12303 e4) {
                                        e = e4;
                                        i4 = -1;
                                        if (i3 == 16 || e.m30561() != -1073741493) {
                                            throw m27292(e);
                                        }
                                        c17987M16222.close();
                                        c5952Mo9476.m16227();
                                        return i4;
                                    }
                                } else {
                                    if (this.f37069) {
                                        i5 = i13;
                                        c8337.m21767(i5 & 65535);
                                        c8337.m21770(65535 & (i5 >> 16));
                                    }
                                    c17987M16222.m41868(c8337, c19626, EnumC19358.NO_RETRY);
                                    iM44720 = c19626.m44720();
                                    if (iM44720 <= 0) {
                                        j = this.f37064 - j2;
                                        if (j <= 0) {
                                            j = -1;
                                        }
                                        int i14 = (int) j;
                                        c17987M16222.close();
                                        c5952Mo9476.m16227();
                                        return i14;
                                    }
                                    this.f37064 += (long) iM44720;
                                    i7 -= iM44720;
                                    c19626.m44716(iM44720);
                                    i8 = i12;
                                }
                                i5 = i13;
                                c17987M16222.m41868(c8337, c19626, EnumC19358.NO_RETRY);
                                iM44720 = c19626.m44720();
                                if (iM44720 <= 0) {
                                    j = this.f37064 - j2;
                                    if (j <= 0) {
                                        j = -1;
                                    }
                                    int i15 = (int) j;
                                    c17987M16222.close();
                                    c5952Mo9476.m16227();
                                    return i15;
                                }
                                this.f37064 += (long) iM44720;
                                i7 -= iM44720;
                                c19626.m44716(iM44720);
                                i8 = i12;
                            } catch (C12303 e5) {
                                e = e5;
                                i3 = i11;
                            }
                        }
                        i6 = i6;
                        if (i7 > i6 && iM44720 == i5) {
                            iMo34687 = i3;
                            bArr2 = bArr;
                        }
                        int i16 = (int) (this.f37064 - j2);
                        c17987M16222.close();
                        c5952Mo9476.m16227();
                        return i16;
                    } catch (C12303 e6) {
                        e = e6;
                        i3 = iMo34687;
                    }
                }
            } catch (Throwable th) {
                try {
                    c17987M16222.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            if (c5952Mo9476 == null) {
                throw th3;
            }
            try {
                c5952Mo9476.m16227();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j <= 0) {
            return 0L;
        }
        this.f37064 += j;
        return j;
    }
}
