package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩻ۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H9UP */
/* JADX INFO: loaded from: classes.dex */
public class C23592 extends OutputStream {

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f76422 = C13488.m32997(C23592.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f76423;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f76424;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f76425;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f76426;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C11159 f76427;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public byte[] f76428;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C14687 f76429;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f76430;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public int f76431;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f76432;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f76433;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C5952 f76434;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C6219 f76435;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C17241 f76436;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C23859 f76437;

    /* JADX INFO: renamed from: ۙ */
    public synchronized C5952 mo12725() {
        if (isOpen()) {
            f76422.mo12127("File already open");
            C5952 c5952 = this.f76434;
            c5952.m16224();
            return c5952;
        }
        C5952 c5952M40192 = this.f76436.m40192(this.f76430, this.f76433, this.f76432, 128, 0);
        c5952M40192.m16224();
        this.f76434 = c5952M40192;
        return c5952M40192;
    }

    public C23592(C17241 c17241) throws C12303 {
        this.f76428 = new byte[1];
        this.f76436 = c17241;
        this.f76430 = 82;
        this.f76432 = 7;
        this.f76433 = 2;
        try {
            C17987 c17987M40191 = c17241.m40191();
            try {
                boolean zM41875 = c17987M40191.m41875();
                this.f76424 = zM41875;
                C5952 c5952Mo12725 = mo12725();
                try {
                    m52018(c17987M40191);
                    if (zM41875) {
                        C0991 c0991 = new C0991(c17987M40191.m41882(), c5952Mo12725.m16229());
                        c0991.m3797(new C7736());
                        c17987M40191.m41868(c0991, null, EnumC19358.NO_RETRY);
                    }
                    c5952Mo12725.m16227();
                    c17987M40191.close();
                } catch (Throwable th) {
                    try {
                        c5952Mo12725.m16227();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (c17987M40191 != null) {
                    try {
                        c17987M40191.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (C8484 e) {
            throw C12303.m30559(e);
        }
    }

    public C23592(C14420 c14420, C17987 c17987) {
        this.f76428 = new byte[1];
        this.f76436 = c14420;
        this.f76434 = null;
        this.f76430 = 0;
        this.f76433 = 0;
        this.f76432 = 0;
        this.f76424 = c17987.m41875();
        m52018(c17987);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52018(C17987 c17987) {
        int sendBufferSize = c17987.getSendBufferSize();
        if (this.f76424) {
            this.f76426 = sendBufferSize;
            this.f76431 = sendBufferSize;
            return;
        }
        this.f76430 &= -81;
        this.f76426 = sendBufferSize - 70;
        boolean zM41870 = c17987.m41870(16);
        this.f76425 = zM41870;
        InterfaceC4314 interfaceC4314 = f76422;
        if (!zM41870) {
            interfaceC4314.mo12135("No support for NT SMBs");
        }
        if (c17987.m41870(32768) && !c17987.m41873()) {
            this.f76431 = Math.min(((C9895) c17987.m41882()).m25059() - 70, 65465);
        } else {
            interfaceC4314.mo12135("No support or SMB signing is enabled, not enabling large writes");
            this.f76431 = this.f76426;
        }
        if (interfaceC4314.mo12125()) {
            interfaceC4314.mo12135("Negotiated file write size is " + this.f76431);
        }
        if (this.f76425) {
            this.f76427 = new C11159(c17987.m41882());
            this.f76437 = new C23859(c17987.m41882());
        } else {
            this.f76435 = new C6219(c17987.m41882());
            this.f76429 = new C14687(c17987.m41882());
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C17241 c17241 = this.f76436;
        try {
            if (this.f76434.m16226()) {
                this.f76434.m16227();
            }
        } finally {
            c17241.m40201();
            this.f76428 = null;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f76428;
        bArr[0] = (byte) i;
        m52019(0, bArr, 1, 0);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        m52019(0, bArr, bArr.length, 0);
    }

    public boolean isOpen() {
        C5952 c5952 = this.f76434;
        return c5952 != null && c5952.m16226();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        m52019(i, bArr, i2, 0);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m52019(int i, byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        long jM52588;
        int i5 = i2;
        InterfaceC4314 interfaceC4314 = f76422;
        if (i5 <= 0) {
            return;
        }
        if (this.f76428 == null) {
            throw new IOException("Bad file descriptor");
        }
        C5952 c5952Mo12725 = mo12725();
        try {
            C17987 c17987M16222 = c5952Mo12725.m16222();
            try {
                if (interfaceC4314.mo12125()) {
                    StringBuilder sb = new StringBuilder("write: fid=");
                    sb.append(c5952Mo12725);
                    sb.append(",off=");
                    i4 = i;
                    sb.append(i4);
                    sb.append(",len=");
                    sb.append(i5);
                    sb.append(",fp=");
                    sb.append(this.f76423);
                    interfaceC4314.mo12135(sb.toString());
                } else {
                    i4 = i;
                }
                do {
                    int i6 = this.f76436.mo34687() == 1 ? this.f76431 : this.f76426;
                    if (i5 <= i6) {
                        i6 = i5;
                    }
                    if (this.f76424) {
                        C22865 c22865 = new C22865(c17987M16222.m41882(), c5952Mo12725.m16229());
                        c22865.m50612(this.f76423);
                        c22865.m50613(i4, i6, bArr);
                        jM52588 = ((C15104) c17987M16222.m41868(c22865, null, EnumC19358.NO_RETRY)).m36180();
                        this.f76423 += jM52588;
                    } else if (this.f76425) {
                        this.f76427.m28096(c5952Mo12725.m16223(), this.f76423, i5 - i6, bArr, i4, i6);
                        if ((i3 & 1) != 0) {
                            this.f76427.m28096(c5952Mo12725.m16223(), this.f76423, i5, bArr, i4, i6);
                            this.f76427.m28097(8);
                        } else {
                            this.f76427.m28097(0);
                        }
                        c17987M16222.m41868(this.f76427, this.f76437, EnumC19358.NO_RETRY);
                        jM52588 = this.f76437.m52588();
                        this.f76423 += jM52588;
                    } else {
                        if (interfaceC4314.mo12133()) {
                            interfaceC4314.mo12127(String.format("Wrote at %d remain %d off %d len %d", Long.valueOf(this.f76423), Integer.valueOf(i5 - i6), Integer.valueOf(i4), Integer.valueOf(i6)));
                        }
                        this.f76435.m17256(c5952Mo12725.m16223(), this.f76423, i5 - i6, bArr, i4, i6);
                        c17987M16222.m41868(this.f76435, this.f76429, new EnumC19358[0]);
                        long jM35216 = this.f76429.m35216();
                        this.f76423 += jM35216;
                        i5 = (int) (((long) i5) - jM35216);
                        i4 = (int) (((long) i4) + jM35216);
                        if (interfaceC4314.mo12133()) {
                            interfaceC4314.mo12127(String.format("Wrote at %d remain %d off %d len %d", Long.valueOf(this.f76423), Integer.valueOf(i5 - i6), Integer.valueOf(i4), Integer.valueOf(i6)));
                        }
                    }
                    i5 = (int) (((long) i5) - jM52588);
                    i4 = (int) (((long) i4) + jM52588);
                } while (i5 > 0);
                c17987M16222.close();
                c5952Mo12725.m16227();
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
            if (c5952Mo12725 == null) {
                throw th3;
            }
            try {
                c5952Mo12725.m16227();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }
}
