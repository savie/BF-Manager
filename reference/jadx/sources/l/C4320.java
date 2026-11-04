package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۘܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H9UP */
/* JADX INFO: loaded from: classes2.dex */
public class C4320 extends OutputStream {

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f15645 = C16980.m40037(C4320.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C6558 f15646;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C4496 f15647;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f15648;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f15649;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public byte[] f15650;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f15651;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean f15652;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C24634 f15653;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C6734 f15654;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f15655;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f15656;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f15657;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C12699 f15658;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C12523 f15659;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public int f15660;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public synchronized C6558 mo13813() {
        if (isOpen()) {
            f15645.mo13717("File already open");
            C6558 c6558 = this.f15646;
            c6558.m18465();
            return c6558;
        }
        C6558 c6558M31087 = this.f15659.m31087(this.f15651, this.f15656, this.f15648, 128, 0);
        c6558M31087.m18465();
        this.f15646 = c6558M31087;
        return c6558M31087;
    }

    public C4320(C12523 c12523) throws C20728 {
        this.f15650 = new byte[1];
        this.f15659 = c12523;
        this.f15651 = 82;
        this.f15648 = 7;
        this.f15656 = 2;
        try {
            C19457 c19457M31099 = c12523.m31099();
            try {
                boolean zM44978 = c19457M31099.m44978();
                this.f15652 = zM44978;
                C6558 c6558Mo13813 = mo13813();
                try {
                    m13814(c19457M31099);
                    if (zM44978) {
                        C2413 c2413 = new C2413(c19457M31099.m44979(), c6558Mo13813.m18469());
                        c2413.m8156(new C11428());
                        c19457M31099.m44971(c2413, null, EnumC13269.NO_RETRY);
                    }
                    c6558Mo13813.m18470();
                    c19457M31099.close();
                } catch (Throwable th) {
                    try {
                        c6558Mo13813.m18470();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (c19457M31099 != null) {
                    try {
                        c19457M31099.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (C20048 e) {
            throw C20728.m47406(e);
        }
    }

    public C4320(C14760 c14760, C19457 c19457) {
        this.f15650 = new byte[1];
        this.f15659 = c14760;
        this.f15646 = null;
        this.f15651 = 0;
        this.f15656 = 0;
        this.f15648 = 0;
        this.f15652 = c19457.m44978();
        m13814(c19457);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13814(C19457 c19457) {
        int sendBufferSize = c19457.getSendBufferSize();
        if (this.f15652) {
            this.f15649 = sendBufferSize;
            this.f15660 = sendBufferSize;
            return;
        }
        this.f15651 &= -81;
        this.f15649 = sendBufferSize - 70;
        boolean zM44973 = c19457.m44973(16);
        this.f15655 = zM44973;
        InterfaceC25186 interfaceC25186 = f15645;
        if (!zM44973) {
            interfaceC25186.mo13721("No support for NT SMBs");
        }
        if (c19457.m44973(32768) && !c19457.m44984()) {
            this.f15660 = Math.min(((C14826) c19457.m44979()).m35711() - 70, 65465);
        } else {
            interfaceC25186.mo13721("No support or SMB signing is enabled, not enabling large writes");
            this.f15660 = this.f15649;
        }
        if (interfaceC25186.mo13707()) {
            interfaceC25186.mo13721("Negotiated file write size is " + this.f15660);
        }
        if (this.f15655) {
            this.f15654 = new C6734(c19457.m44979());
            this.f15653 = new C24634(c19457.m44979());
        } else {
            this.f15658 = new C12699(c19457.m44979());
            this.f15647 = new C4496(c19457.m44979());
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C12523 c12523 = this.f15659;
        try {
            if (this.f15646.m18466()) {
                this.f15646.m18470();
            }
        } finally {
            c12523.m31106();
            this.f15650 = null;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f15650;
        bArr[0] = (byte) i;
        m13815(0, bArr, 1, 0);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        m13815(0, bArr, bArr.length, 0);
    }

    public boolean isOpen() {
        C6558 c6558 = this.f15646;
        return c6558 != null && c6558.m18466();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        m13815(i, bArr, i2, 0);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m13815(int i, byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        long jM54971;
        int i5 = i2;
        InterfaceC25186 interfaceC25186 = f15645;
        if (i5 <= 0) {
            return;
        }
        if (this.f15650 == null) {
            throw new IOException("Bad file descriptor");
        }
        C6558 c6558Mo13813 = mo13813();
        try {
            C19457 c19457M18468 = c6558Mo13813.m18468();
            try {
                if (interfaceC25186.mo13707()) {
                    StringBuilder sb = new StringBuilder("write: fid=");
                    sb.append(c6558Mo13813);
                    sb.append(",off=");
                    i4 = i;
                    sb.append(i4);
                    sb.append(",len=");
                    sb.append(i5);
                    sb.append(",fp=");
                    sb.append(this.f15657);
                    interfaceC25186.mo13721(sb.toString());
                } else {
                    i4 = i;
                }
                do {
                    int i6 = this.f15659.mo31102() == 1 ? this.f15660 : this.f15649;
                    if (i5 <= i6) {
                        i6 = i5;
                    }
                    if (this.f15652) {
                        C4956 c4956 = new C4956(c19457M18468.m44979(), c6558Mo13813.m18469());
                        c4956.m15160(this.f15657);
                        c4956.m15159(i4, i6, bArr);
                        jM54971 = ((C22110) c19457M18468.m44971(c4956, null, EnumC13269.NO_RETRY)).m50065();
                        this.f15657 += jM54971;
                    } else if (this.f15655) {
                        this.f15654.m18827(c6558Mo13813.m18467(), this.f15657, i5 - i6, bArr, i4, i6);
                        if ((i3 & 1) != 0) {
                            this.f15654.m18827(c6558Mo13813.m18467(), this.f15657, i5, bArr, i4, i6);
                            this.f15654.m18828(8);
                        } else {
                            this.f15654.m18828(0);
                        }
                        c19457M18468.m44971(this.f15654, this.f15653, EnumC13269.NO_RETRY);
                        jM54971 = this.f15653.m54971();
                        this.f15657 += jM54971;
                    } else {
                        if (interfaceC25186.mo13713()) {
                            interfaceC25186.mo13717(String.format("Wrote at %d remain %d off %d len %d", Long.valueOf(this.f15657), Integer.valueOf(i5 - i6), Integer.valueOf(i4), Integer.valueOf(i6)));
                        }
                        this.f15658.m31494(c6558Mo13813.m18467(), this.f15657, i5 - i6, bArr, i4, i6);
                        c19457M18468.m44971(this.f15658, this.f15647, new EnumC13269[0]);
                        long jM14220 = this.f15647.m14220();
                        this.f15657 += jM14220;
                        i5 = (int) (((long) i5) - jM14220);
                        i4 = (int) (((long) i4) + jM14220);
                        if (interfaceC25186.mo13713()) {
                            interfaceC25186.mo13717(String.format("Wrote at %d remain %d off %d len %d", Long.valueOf(this.f15657), Integer.valueOf(i5 - i6), Integer.valueOf(i4), Integer.valueOf(i6)));
                        }
                    }
                    i5 = (int) (((long) i5) - jM54971);
                    i4 = (int) (((long) i4) + jM54971);
                } while (i5 > 0);
                c19457M18468.close();
                c6558Mo13813.m18470();
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
            if (c6558Mo13813 == null) {
                throw th3;
            }
            try {
                c6558Mo13813.m18470();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }
}
