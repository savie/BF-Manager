package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܶۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J57U */
/* JADX INFO: loaded from: classes4.dex */
public final class C15011 extends OutputStream {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f48957;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f48958;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final byte[] f48959;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f48960;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f48961;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f48962;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f48963;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f48964;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] f48965;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C4633 f48966;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC5614 f48969;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f48970;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int[] f48968 = new int[1024];

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f48967 = -1;

    public C15011(C4633 c4633, int i, byte[] bArr, byte[] bArr2, InterfaceC5614 interfaceC5614) {
        this.f48966 = c4633;
        this.f48957 = i;
        this.f48965 = bArr;
        this.f48959 = bArr2;
        this.f48969 = interfaceC5614;
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
        this.f48958 = iArr;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        long j = ((long) i) + ((long) i2);
        int i3 = (int) j;
        if (j != i3) {
            throw new ArithmeticException();
        }
        while (i < i3) {
            if ((this.f48970 & 4095) == 0 && this.f48969.mo2357()) {
                throw new C17832();
            }
            m36006(bArr[i]);
            this.f48970++;
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36006(byte b) throws IOException {
        int i;
        byte[] bArr;
        while (true) {
            i = this.f48961;
            bArr = this.f48965;
            if (i <= 0 || bArr[i] == b) {
                break;
            }
            this.f48961 = this.f48958[i - 1];
        }
        if (bArr[i] != b) {
            return;
        }
        int i2 = i + 1;
        this.f48961 = i2;
        if (i2 != bArr.length) {
            return;
        }
        int length = (this.f48970 - bArr.length) + 1;
        long j = this.f48963;
        long j2 = ((long) length) + j;
        long length2 = ((long) bArr.length) + j2;
        long j3 = ((long) this.f48957) + j;
        if (j2 < 0 || length2 > j3) {
            throw new IOException("Search result exceeds transaction length");
        }
        byte[] bArr2 = this.f48959;
        long length3 = (j3 + ((long) bArr2.length)) - ((long) bArr.length);
        if (length3 > 2147483647L) {
            throw new C3015();
        }
        int i3 = length >>> 16;
        int i4 = this.f48964;
        int[] iArr = this.f48968;
        C4633 c4633 = this.f48966;
        if (i4 != 0 && i3 != this.f48967 && i4 != 0) {
            c4633.m12798(i4, iArr);
            this.f48964 = 0;
        }
        this.f48967 = i3;
        int i5 = this.f48964;
        int i6 = i5 + 1;
        this.f48964 = i6;
        iArr[i5] = length;
        if (i6 == iArr.length && i6 != 0) {
            c4633.m12798(i6, iArr);
            this.f48964 = 0;
        }
        this.f48962++;
        this.f48963 = (((long) bArr2.length) - ((long) bArr.length)) + this.f48963;
        long length4 = j2 + ((long) bArr2.length);
        if (length4 < 0 || length4 > length3) {
            throw new IOException("Replacement offset exceeds transaction length");
        }
        this.f48960 = (int) length4;
        this.f48961 = 0;
    }

    public final C22772 finish() {
        int i = this.f48964;
        C4633 c4633 = this.f48966;
        if (i != 0) {
            c4633.m12798(i, this.f48968);
            this.f48964 = 0;
        }
        c4633.m12799(this.f48969);
        return new C22772(this.f48962, this.f48960, false);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        if (!this.f48969.mo2357()) {
            m36006((byte) i);
            this.f48970++;
            return;
        }
        throw new C17832();
    }
}
