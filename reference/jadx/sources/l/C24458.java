package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩺ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 79WK */
/* JADX INFO: loaded from: classes.dex */
public class C24458 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f79395 = C16980.m40037(C24458.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C6558 f79396;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f79397;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f79398;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f79399;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f79400;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public byte[] f79401;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f79402;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f79403;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f79404;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f79405;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f79406;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C12523 f79407;

    @Override // java.io.InputStream
    public int available() {
        return 0;
    }

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    /* JADX INFO: renamed from: ۙ */
    public synchronized C6558 mo2684() {
        C6558 c6558 = this.f79396;
        if (c6558 != null && c6558.m18466()) {
            C6558 c6559 = this.f79396;
            c6559.m18465();
            return c6559;
        }
        C12523 c12523 = this.f79407;
        if (c12523 instanceof C14760) {
            this.f79396 = c12523.m31087(32, ((C14760) c12523).m35494() & 16711680, this.f79402, 128, 0);
        } else {
            C6558 c6558M31087 = c12523.m31087(this.f79406, this.f79404, this.f79402, 128, 0);
            c6558M31087.m18465();
            this.f79396 = c6558M31087;
        }
        return this.f79396;
    }

    public C24458(C12523 c12523) throws C20728 {
        this.f79401 = new byte[1];
        this.f79407 = c12523;
        this.f79399 = false;
        this.f79406 = 0;
        this.f79404 = 1;
        this.f79402 = 7;
        try {
            C19457 c19457M31099 = c12523.m31099();
            try {
                this.f79398 = c19457M31099.m44978();
                if (c12523.mo31102() != 16) {
                    C6558 c6558Mo2684 = mo2684();
                    if (c6558Mo2684 != null) {
                        c6558Mo2684.m18470();
                    }
                    this.f79406 = 0;
                }
                m54709(c19457M31099);
                c19457M31099.close();
            } catch (Throwable th) {
                if (c19457M31099 != null) {
                    try {
                        c19457M31099.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (C20048 e) {
            throw C20728.m47406(e);
        }
    }

    public C24458(C14760 c14760, C19457 c19457) throws C20728 {
        this.f79401 = new byte[1];
        this.f79407 = c14760;
        this.f79396 = null;
        this.f79399 = false;
        this.f79398 = c19457.m44978();
        try {
            m54709(c19457);
        } catch (C20048 e) {
            throw C20728.m47406(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m54709(InterfaceC14981 interfaceC14981) {
        if (this.f79398) {
            C19457 c19457 = (C19457) interfaceC14981;
            this.f79403 = c19457.m44981();
            this.f79397 = c19457.m44981();
            return;
        }
        C19457 c19458 = (C19457) interfaceC14981;
        this.f79403 = Math.min(c19458.m44981() - 70, c19458.m44977() - 70);
        boolean zM44973 = c19458.m44973(16384);
        InterfaceC25186 interfaceC25186 = f79395;
        if (zM44973) {
            this.f79400 = true;
            this.f79397 = Math.min(((C14826) c19458.m44979()).m35714() - 70, c19458.m44984() ? 65465 : 16777145);
            interfaceC25186.mo13721("Enabling LARGE_READX with " + this.f79397);
        } else {
            interfaceC25186.mo13721("LARGE_READX disabled");
            this.f79397 = this.f79403;
        }
        if (interfaceC25186.mo13707()) {
            interfaceC25186.mo13721("Negotiated file read size is " + this.f79397);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static IOException m54708(C20728 c20728) {
        Throwable cause = c20728.getCause();
        IOException iOException = c20728;
        if (cause instanceof C7524) {
            C7524 c7524 = (C7524) cause;
            cause = c7524.getCause();
            iOException = c7524;
        }
        if (!(cause instanceof InterruptedException)) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException(cause.getMessage());
        interruptedIOException.initCause(cause);
        return interruptedIOException;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C12523 c12523 = this.f79407;
        boolean z = this.f79399;
        try {
            try {
                C6558 c6558 = this.f79396;
                if (c6558 != null) {
                    c6558.m18470();
                }
                this.f79401 = null;
                this.f79396 = null;
                if (z) {
                    c12523.close();
                }
            } catch (C20728 e) {
                throw m54708(e);
            }
        } catch (Throwable th) {
            this.f79401 = null;
            this.f79396 = null;
            if (z) {
                c12523.close();
            }
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (m54710(0, 1, this.f79401) == -1) {
            return -1;
        }
        return this.f79401[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return m54710(0, bArr.length, bArr);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return m54710(i, i2, bArr);
    }

    /* JADX WARN: Code duplicated, block: B:145:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x017a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0184 A[Catch: all -> 0x01ca, TRY_ENTER, TryCatch #7 {all -> 0x01ca, blocks: (B:9:0x001e, B:11:0x0024, B:12:0x0043, B:14:0x0055, B:20:0x0061, B:22:0x0067, B:26:0x0099, B:28:0x00a3, B:30:0x00ad, B:36:0x00c1, B:38:0x00cd, B:45:0x00f1, B:54:0x0103, B:86:0x019c, B:41:0x00e0, B:43:0x00e9, B:55:0x0110, B:35:0x00bf, B:100:0x01b5, B:106:0x01c5, B:107:0x01c9, B:61:0x011f, B:64:0x013f, B:69:0x0162, B:71:0x0172, B:80:0x0184, B:65:0x014b, B:67:0x014f, B:15:0x0058), top: B:138:0x001e, outer: #3 }] */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m54710(int i, int i2, byte[] bArr) throws IOException {
        int i3;
        int i4;
        int i5;
        int iM33089;
        long j;
        byte[] bArr2 = bArr;
        InterfaceC25186 interfaceC25186 = f79395;
        if (i2 <= 0) {
            return 0;
        }
        long j2 = this.f79405;
        if (this.f79401 == null) {
            throw new IOException("Bad file descriptor");
        }
        C6558 c6558Mo2684 = mo2684();
        try {
            C19457 c19457M18468 = c6558Mo2684.m18468();
            try {
                if (interfaceC25186.mo13713()) {
                    interfaceC25186.mo13717("read: fid=" + c6558Mo2684 + ",off=" + i + ",len=" + i2);
                }
                C13445 c13445 = new C13445(i, c19457M18468.m44979(), bArr2);
                int iMo31102 = this.f79407.mo31102();
                int i6 = iMo31102 == 1 ? this.f79397 : this.f79403;
                int i7 = i2;
                int i8 = i;
                while (true) {
                    int i9 = i7 > i6 ? i6 : i7;
                    if (interfaceC25186.mo13713()) {
                        interfaceC25186.mo13717("read: len=" + i7 + ",r=" + i9 + ",fp=" + this.f79405 + ",b.length=" + bArr2.length);
                    }
                    try {
                        if (c19457M18468.m44978()) {
                            i4 = -1;
                            try {
                                C6888 c6888 = new C6888(c19457M18468.m44979(), c6558Mo2684.m18469(), bArr2, i8);
                                try {
                                    c6888.m19152(iMo31102 == 16 ? 0L : this.f79405);
                                    c6888.m19150(i9);
                                    c6888.m19151(i7 - i9);
                                    try {
                                        iM33089 = ((C13599) c19457M18468.m44971(c6888, null, EnumC13269.NO_RETRY)).m33334();
                                    } catch (C20728 e) {
                                        if (e.m47408() != -1073741807) {
                                            throw e;
                                        }
                                        interfaceC25186.mo13711("Reached end of file", e);
                                        iM33089 = -1;
                                    }
                                    if (iM33089 <= 0) {
                                        long j3 = this.f79405 - j2;
                                        if (j3 <= 0) {
                                            j3 = -1;
                                        }
                                        int i10 = (int) j3;
                                        c19457M18468.close();
                                        c6558Mo2684.m18470();
                                        return i10;
                                    }
                                    this.f79405 += (long) iM33089;
                                    i8 += iM33089;
                                    i7 -= iM33089;
                                    i5 = i9;
                                    i3 = iMo31102;
                                } catch (C20728 e2) {
                                    e = e2;
                                    i3 = iMo31102;
                                    if (i3 == 16 || e.m47408() != -1073741493) {
                                        throw m54708(e);
                                    }
                                    c19457M18468.close();
                                    c6558Mo2684.m18470();
                                    return i4;
                                }
                            } catch (C20728 e3) {
                                e = e3;
                                i3 = iMo31102;
                            }
                        } else {
                            int i11 = iMo31102;
                            try {
                                int i12 = i8;
                                int i13 = i9;
                                C15682 c15682 = new C15682(c19457M18468.m44979(), c6558Mo2684.m18467(), this.f79405, i13);
                                i3 = i11;
                                if (i3 == 16) {
                                    try {
                                        c15682.m37459();
                                        c15682.m37458(1024);
                                        c15682.m37460();
                                    } catch (C20728 e4) {
                                        e = e4;
                                        i4 = -1;
                                        if (i3 == 16) {
                                        }
                                        throw m54708(e);
                                    }
                                } else {
                                    if (this.f79400) {
                                        i5 = i13;
                                        c15682.m37458(i5 & 65535);
                                        c15682.m37461(65535 & (i5 >> 16));
                                    }
                                    c19457M18468.m44971(c15682, c13445, EnumC13269.NO_RETRY);
                                    iM33089 = c13445.m33089();
                                    if (iM33089 <= 0) {
                                        j = this.f79405 - j2;
                                        if (j <= 0) {
                                            j = -1;
                                        }
                                        int i14 = (int) j;
                                        c19457M18468.close();
                                        c6558Mo2684.m18470();
                                        return i14;
                                    }
                                    this.f79405 += (long) iM33089;
                                    i7 -= iM33089;
                                    c13445.m33086(iM33089);
                                    i8 = i12;
                                }
                                i5 = i13;
                                c19457M18468.m44971(c15682, c13445, EnumC13269.NO_RETRY);
                                iM33089 = c13445.m33089();
                                if (iM33089 <= 0) {
                                    j = this.f79405 - j2;
                                    if (j <= 0) {
                                        j = -1;
                                    }
                                    int i15 = (int) j;
                                    c19457M18468.close();
                                    c6558Mo2684.m18470();
                                    return i15;
                                }
                                this.f79405 += (long) iM33089;
                                i7 -= iM33089;
                                c13445.m33086(iM33089);
                                i8 = i12;
                            } catch (C20728 e5) {
                                e = e5;
                                i3 = i11;
                            }
                        }
                        i6 = i6;
                        if (i7 > i6 && iM33089 == i5) {
                            iMo31102 = i3;
                            bArr2 = bArr;
                        }
                        int i16 = (int) (this.f79405 - j2);
                        c19457M18468.close();
                        c6558Mo2684.m18470();
                        return i16;
                    } catch (C20728 e6) {
                        e = e6;
                        i3 = iMo31102;
                    }
                }
            } catch (Throwable th) {
                try {
                    c19457M18468.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            if (c6558Mo2684 == null) {
                throw th3;
            }
            try {
                c6558Mo2684.m18470();
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
        this.f79405 += j;
        return j;
    }
}
