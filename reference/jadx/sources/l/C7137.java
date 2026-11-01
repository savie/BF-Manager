package l;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.۟֨ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1SB */
/* JADX INFO: loaded from: classes3.dex */
public final class C7137 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f23847;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f23848;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C0081 f23849;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f23850;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final DataInputStream f23851;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InputStream f23852;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC8900 f23854;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f23856;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f23857;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f23853 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f23855 = false;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final byte[] f23858 = new byte[1];

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C7137(InputStream inputStream, AbstractC8900 abstractC8900, boolean z, int i, C17720 c17720) throws IOException, C14194 {
        this.f23848 = -1L;
        this.f23857 = -1L;
        this.f23854 = abstractC8900;
        this.f23850 = z;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f23851 = dataInputStream;
        int unsignedByte = dataInputStream.readUnsignedByte();
        if (unsignedByte == 0) {
            throw new C14194();
        }
        int i2 = (unsignedByte + 1) * 4;
        this.f23856 = i2;
        byte[] bArr = new byte[i2];
        bArr[0] = (byte) unsignedByte;
        dataInputStream.readFully(bArr, 1, i2 - 1);
        int i3 = i2 - 4;
        if (!C20894.m47003(0, bArr, i3, i3)) {
            throw new C19838("XZ Block Header is corrupt");
        }
        int i4 = bArr[1];
        if ((i4 & 60) != 0) {
            throw new C6782("Unsupported options in XZ Block Header");
        }
        int i5 = i4 & 3;
        int i6 = i5 + 1;
        long[] jArr = new long[i6];
        byte[][] bArr2 = new byte[i6][];
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, 2, i2 - 6);
        try {
            long jM23157 = (9223372036854775804L - ((long) i2)) - ((long) abstractC8900.m23157());
            this.f23847 = jM23157;
            if ((bArr[1] & 64) != 0) {
                long jM47000 = C20894.m47000(byteArrayInputStream);
                this.f23857 = jM47000;
                if (jM47000 == 0 || jM47000 > jM23157) {
                    throw new C19838();
                }
                this.f23847 = jM47000;
            }
            if ((bArr[1] & GCMSIVBlockCipher.MASK) != 0) {
                this.f23848 = C20894.m47000(byteArrayInputStream);
            }
            for (int i7 = 0; i7 < i6; i7++) {
                jArr[i7] = C20894.m47000(byteArrayInputStream);
                long jM47001 = C20894.m47000(byteArrayInputStream);
                if (jM47001 > byteArrayInputStream.available()) {
                    throw new C19838();
                }
                byte[] bArr3 = new byte[(int) jM47001];
                bArr2[i7] = bArr3;
                byteArrayInputStream.read(bArr3);
            }
            for (int iAvailable = byteArrayInputStream.available(); iAvailable > 0; iAvailable--) {
                if (byteArrayInputStream.read() != 0) {
                    throw new C6782("Unsupported options in XZ Block Header");
                }
            }
            InterfaceC10666[] interfaceC10666Arr = new InterfaceC10666[i6];
            for (int i8 = 0; i8 < i6; i8++) {
                long j = jArr[i8];
                if (j == 33) {
                    interfaceC10666Arr[i8] = new C9255(bArr2[i8]);
                } else if (j == 3) {
                    interfaceC10666Arr[i8] = new C12077(bArr2[i8]);
                } else {
                    if (j < 4 || j > 11) {
                        throw new C6782("Unknown Filter ID " + jArr[i8]);
                    }
                    interfaceC10666Arr[i8] = new C18426(j, bArr2[i8]);
                }
            }
            C22305.m49472(interfaceC10666Arr);
            if (i >= 0) {
                int iMo23780 = 0;
                for (int i9 = 0; i9 < i6; i9++) {
                    iMo23780 += interfaceC10666Arr[i9].mo23780();
                }
                if (iMo23780 > i) {
                    throw new C5371(C8015.m21119("", iMo23780, " KiB of memory would be needed; limit was ", " KiB", i));
                }
            }
            C0081 c0081 = new C0081(inputStream);
            this.f23849 = c0081;
            this.f23852 = c0081;
            while (i5 >= 0) {
                this.f23852 = interfaceC10666Arr[i5].mo23781(this.f23852, c17720);
                i5--;
            }
        } catch (IOException unused) {
            throw new C19838("XZ Block Header is corrupt");
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f23858;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.f23855) {
            return -1;
        }
        int i3 = this.f23852.read(bArr, i, i2);
        if (i3 > 0) {
            if (this.f23850) {
                this.f23854.mo19985(bArr, i, i3);
            }
            this.f23853 += (long) i3;
            long jM1015 = this.f23849.m1015();
            if (jM1015 >= 0 && jM1015 <= this.f23847) {
                long j = this.f23853;
                if (j >= 0) {
                    long j2 = this.f23848;
                    if (j2 == -1 || j <= j2) {
                        if (i3 < i2 || j == j2) {
                            if (this.f23852.read() != -1) {
                                throw new C19838();
                            }
                            m19033();
                            this.f23855 = true;
                            return i3;
                        }
                    }
                }
            }
            throw new C19838();
        }
        if (i3 == -1) {
            m19033();
            this.f23855 = true;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m19033() throws IOException {
        long jM1015 = this.f23849.m1015();
        long j = this.f23857;
        if (j == -1 || j == jM1015) {
            long j2 = this.f23848;
            if (j2 == -1 || j2 == this.f23853) {
                while (true) {
                    long j3 = 1 + jM1015;
                    long j4 = jM1015 & 3;
                    DataInputStream dataInputStream = this.f23851;
                    if (j4 != 0) {
                        if (dataInputStream.readUnsignedByte() != 0) {
                            throw new C19838();
                        }
                        jM1015 = j3;
                    } else {
                        AbstractC8900 abstractC8900 = this.f23854;
                        byte[] bArr = new byte[abstractC8900.m23157()];
                        dataInputStream.readFully(bArr);
                        if (!this.f23850 || Arrays.equals(abstractC8900.mo19986(), bArr)) {
                            return;
                        }
                        throw new C19838("Integrity check (" + abstractC8900.m23158() + ") does not match");
                    }
                }
            }
        }
        throw new C19838();
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f23852.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f23852.close();
        } catch (IOException unused) {
        }
        this.f23852 = null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m19035() {
        return ((long) this.f23856) + this.f23849.m1015() + ((long) this.f23854.m23157());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m19034() {
        return this.f23853;
    }
}
