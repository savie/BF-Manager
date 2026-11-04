package l;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ۖܽ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: G1SB */
/* JADX INFO: loaded from: classes3.dex */
public final class C2810 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final DataInputStream f9230;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f9232;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public InputStream f9233;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public long f9234;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C5004 f9236;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC1275 f9237;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f9238;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f9239;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f9240;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f9231 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f9229 = false;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final byte[] f9235 = new byte[1];

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C2810(InputStream inputStream, AbstractC1275 abstractC1275, boolean z, int i, C0573 c0573) throws IOException, C5750 {
        this.f9234 = -1L;
        this.f9240 = -1L;
        this.f9237 = abstractC1275;
        this.f9232 = z;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f9230 = dataInputStream;
        int unsignedByte = dataInputStream.readUnsignedByte();
        if (unsignedByte == 0) {
            throw new C5750();
        }
        int i2 = (unsignedByte + 1) * 4;
        this.f9239 = i2;
        byte[] bArr = new byte[i2];
        bArr[0] = (byte) unsignedByte;
        dataInputStream.readFully(bArr, 1, i2 - 1);
        int i3 = i2 - 4;
        if (!C8732.m23415(0, bArr, i3, i3)) {
            throw new C13996("XZ Block Header is corrupt");
        }
        int i4 = bArr[1];
        if ((i4 & 60) != 0) {
            throw new C4258("Unsupported options in XZ Block Header");
        }
        int i5 = i4 & 3;
        int i6 = i5 + 1;
        long[] jArr = new long[i6];
        byte[][] bArr2 = new byte[i6][];
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, 2, i2 - 6);
        try {
            long jM4665 = (9223372036854775804L - ((long) i2)) - ((long) abstractC1275.m4665());
            this.f9238 = jM4665;
            if ((bArr[1] & 64) != 0) {
                long jM23412 = C8732.m23412(byteArrayInputStream);
                this.f9240 = jM23412;
                if (jM23412 == 0 || jM23412 > jM4665) {
                    throw new C13996();
                }
                this.f9238 = jM23412;
            }
            if ((bArr[1] & GCMSIVBlockCipher.MASK) != 0) {
                this.f9234 = C8732.m23412(byteArrayInputStream);
            }
            for (int i7 = 0; i7 < i6; i7++) {
                jArr[i7] = C8732.m23412(byteArrayInputStream);
                long jM23413 = C8732.m23412(byteArrayInputStream);
                if (jM23413 > byteArrayInputStream.available()) {
                    throw new C13996();
                }
                byte[] bArr3 = new byte[(int) jM23413];
                bArr2[i7] = bArr3;
                byteArrayInputStream.read(bArr3);
            }
            for (int iAvailable = byteArrayInputStream.available(); iAvailable > 0; iAvailable--) {
                if (byteArrayInputStream.read() != 0) {
                    throw new C4258("Unsupported options in XZ Block Header");
                }
            }
            InterfaceC15444[] interfaceC15444Arr = new InterfaceC15444[i6];
            for (int i8 = 0; i8 < i6; i8++) {
                long j = jArr[i8];
                if (j == 33) {
                    interfaceC15444Arr[i8] = new C11715(bArr2[i8]);
                } else if (j == 3) {
                    interfaceC15444Arr[i8] = new C10969(bArr2[i8]);
                } else {
                    if (j < 4 || j > 11) {
                        throw new C4258("Unknown Filter ID " + jArr[i8]);
                    }
                    interfaceC15444Arr[i8] = new C8031(j, bArr2[i8]);
                }
            }
            C20666.m47291(interfaceC15444Arr);
            if (i >= 0) {
                int iMo21905 = 0;
                for (int i9 = 0; i9 < i6; i9++) {
                    iMo21905 += interfaceC15444Arr[i9].mo21905();
                }
                if (iMo21905 > i) {
                    throw new C3512(C0703.m3016("", iMo21905, " KiB of memory would be needed; limit was ", " KiB", i));
                }
            }
            C5004 c5004 = new C5004(inputStream);
            this.f9236 = c5004;
            this.f9233 = c5004;
            while (i5 >= 0) {
                this.f9233 = interfaceC15444Arr[i5].mo21906(this.f9233, c0573);
                i5--;
            }
        } catch (IOException unused) {
            throw new C13996("XZ Block Header is corrupt");
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f9235;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f9229) {
            return -1;
        }
        int i3 = this.f9233.read(bArr, i, i2);
        if (i3 > 0) {
            if (this.f9232) {
                this.f9237.mo4663(bArr, i, i3);
            }
            this.f9231 += (long) i3;
            long jM15231 = this.f9236.m15231();
            if (jM15231 >= 0 && jM15231 <= this.f9238) {
                long j = this.f9231;
                if (j >= 0) {
                    long j2 = this.f9234;
                    if (j2 == -1 || j <= j2) {
                        if (i3 < i2 || j == j2) {
                            if (this.f9233.read() != -1) {
                                throw new C13996();
                            }
                            m9281();
                            this.f9229 = true;
                            return i3;
                        }
                    }
                }
            }
            throw new C13996();
        }
        if (i3 == -1) {
            m9281();
            this.f9229 = true;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m9281() throws IOException {
        long jM15231 = this.f9236.m15231();
        long j = this.f9240;
        if (j == -1 || j == jM15231) {
            long j2 = this.f9234;
            if (j2 == -1 || j2 == this.f9231) {
                while (true) {
                    long j3 = 1 + jM15231;
                    long j4 = jM15231 & 3;
                    DataInputStream dataInputStream = this.f9230;
                    if (j4 != 0) {
                        if (dataInputStream.readUnsignedByte() != 0) {
                            throw new C13996();
                        }
                        jM15231 = j3;
                    } else {
                        AbstractC1275 abstractC1275 = this.f9237;
                        byte[] bArr = new byte[abstractC1275.m4665()];
                        dataInputStream.readFully(bArr);
                        if (!this.f9232 || Arrays.equals(abstractC1275.mo4664(), bArr)) {
                            return;
                        }
                        throw new C13996("Integrity check (" + abstractC1275.m4666() + ") does not match");
                    }
                }
            }
        }
        throw new C13996();
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f9233.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f9233.close();
        } catch (IOException unused) {
        }
        this.f9233 = null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m9283() {
        return ((long) this.f9239) + this.f9236.m15231() + ((long) this.f9237.m4665());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m9282() {
        return this.f9231;
    }
}
