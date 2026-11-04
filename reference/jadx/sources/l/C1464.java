package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.֨᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J57U */
/* JADX INFO: loaded from: classes2.dex */
public final class C1464 extends OutputStream {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f5104;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final byte[] f5105;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f5106;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f5107;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f5108;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int[] f5109;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f5110;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f5111;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final byte[] f5112;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C18397 f5113;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f5114;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC7509 f5116;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f5115 = new int[1024];

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f5103 = -1;

    public C1464(C18397 c18397, int i, byte[] bArr, byte[] bArr2, InterfaceC7509 interfaceC7509) {
        this.f5113 = c18397;
        this.f5114 = i;
        this.f5105 = bArr;
        this.f5112 = bArr2;
        this.f5116 = interfaceC7509;
        int[] iArr = new int[bArr.length];
        int i2 = 0;
        for (int i3 = 1; i3 < bArr.length; i3++) {
            while (i2 > 0 && bArr[i3] != bArr[i2]) {
                i2 = iArr[i2 - 1];
            }
            if (bArr[i3] == bArr[i2]) {
                i2++;
            }
            iArr[i3] = i2;
        }
        this.f5109 = iArr;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        long j = ((long) i) + ((long) i2);
        int i3 = (int) j;
        if (j != i3) {
            throw new ArithmeticException();
        }
        while (i < i3) {
            if ((this.f5110 & 4095) == 0 && this.f5116.mo924()) {
                throw new C2955();
            }
            m5236(bArr[i]);
            this.f5110++;
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5236(byte b) throws IOException {
        int i;
        byte[] bArr;
        while (true) {
            i = this.f5111;
            bArr = this.f5105;
            if (i <= 0 || bArr[i] == b) {
                break;
            }
            this.f5111 = this.f5109[i - 1];
        }
        if (bArr[i] != b) {
            return;
        }
        int i2 = i + 1;
        this.f5111 = i2;
        if (i2 != bArr.length) {
            return;
        }
        int length = (this.f5110 - bArr.length) + 1;
        long j = this.f5104;
        long j2 = ((long) length) + j;
        long length2 = ((long) bArr.length) + j2;
        long j3 = ((long) this.f5114) + j;
        if (j2 < 0 || length2 > j3) {
            throw new IOException("Search result exceeds transaction length");
        }
        byte[] bArr2 = this.f5112;
        long length3 = (j3 + ((long) bArr2.length)) - ((long) bArr.length);
        if (length3 > 2147483647L) {
            throw new C12562();
        }
        int i3 = length >>> 16;
        int i4 = this.f5108;
        int[] iArr = this.f5115;
        C18397 c18397 = this.f5113;
        if (i4 != 0 && i3 != this.f5103 && i4 != 0) {
            c18397.m42909(i4, iArr);
            this.f5108 = 0;
        }
        this.f5103 = i3;
        int i5 = this.f5108;
        int i6 = i5 + 1;
        this.f5108 = i6;
        iArr[i5] = length;
        if (i6 == iArr.length && i6 != 0) {
            c18397.m42909(i6, iArr);
            this.f5108 = 0;
        }
        this.f5107++;
        this.f5104 = (((long) bArr2.length) - ((long) bArr.length)) + this.f5104;
        long length4 = j2 + ((long) bArr2.length);
        if (length4 < 0 || length4 > length3) {
            throw new IOException("Replacement offset exceeds transaction length");
        }
        this.f5106 = (int) length4;
        this.f5111 = 0;
    }

    public final C10412 finish() {
        int i = this.f5108;
        C18397 c18397 = this.f5113;
        if (i != 0) {
            c18397.m42909(i, this.f5115);
            this.f5108 = 0;
        }
        c18397.m42910(this.f5116);
        return new C10412(this.f5107, this.f5106, false);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        if (!this.f5116.mo924()) {
            m5236((byte) i);
            this.f5110++;
            return;
        }
        throw new C2955();
    }
}
