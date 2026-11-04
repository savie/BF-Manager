package l;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: l.۫۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B749 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13126 implements InterfaceC9461 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19839 f41932;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f41933;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f41934;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9461 f41935;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f41936;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] f41937;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f41938;

    public C13126(InterfaceC9461 interfaceC9461, byte[] bArr, int i, long j, C19839 c19839) {
        this.f41935 = interfaceC9461;
        this.f41937 = bArr;
        this.f41938 = i;
        this.f41936 = j;
        this.f41932 = c19839;
    }

    @Override // l.InterfaceC9461
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C19839 c19839 = this.f41932;
        c19839.m45695();
        if (i2 != 0) {
            int i3 = this.f41933;
            long j = this.f41936;
            int i4 = this.f41938;
            if (i3 != i4) {
                int iMin = Math.min(i2, i4 - i3);
                int i5 = this.f41935.read(bArr, i, iMin);
                if (i5 == -1) {
                    if (this.f41933 < j) {
                        throw new EOFException("MPEG-TS preview source ended before declared length");
                    }
                } else {
                    if (i5 < 0 || i5 > iMin) {
                        throw new IOException("MPEG-TS data source returned an invalid read result");
                    }
                    if (i5 != 0) {
                        this.f41934 = 0;
                        System.arraycopy(bArr, i, this.f41937, this.f41933, i5);
                        this.f41933 += i5;
                        c19839.m45695();
                        return i5;
                    }
                    int i6 = this.f41934 + 1;
                    this.f41934 = i6;
                    if (i6 >= 16) {
                        throw new IOException("MPEG-TS data source returned too many zero-byte reads");
                    }
                }
            } else if (i3 < j) {
                throw new C1940(C13645.m33382(i4, "MPEG-TS preview scan budget was exhausted: "));
            }
            return -1;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m32603() {
        return this.f41933;
    }
}
