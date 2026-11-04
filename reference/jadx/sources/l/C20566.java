package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩵۫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: L99C */
/* JADX INFO: loaded from: classes5.dex */
public final class C20566 extends AbstractC5101 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13961 f65850;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int[] f65851;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f65852;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f65853;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f65854;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f65855;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f65856;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f65857;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f65858;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f65859;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f65860;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f65861;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C2666[] f65862;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private synchronized int[] m47145(int i) {
        if (i >= 0) {
            try {
                if (i < this.f65856) {
                    this.f65850.seek(this.f65860 + this.f65861 + this.f65851[i]);
                    C14763 c14763 = new C14763();
                    while (true) {
                        try {
                            int i2 = this.f65850.readInt();
                            if (i2 == -1) {
                                return c14763.mo2687();
                            }
                            c14763.add(i2);
                        } catch (ArrayIndexOutOfBoundsException unused) {
                            return null;
                        }
                    }
                }
            } catch (IOException e) {
                throw new C1109(e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private synchronized String m47146(int i) {
        int i2;
        if (i >= 0) {
            if (i < this.f65853) {
                int i3 = this.f65860 + this.f65857 + this.f65858[i];
                if (i3 >= this.f65855 && i3 < (i2 = this.f65859)) {
                    String strM15437 = m15437(this.f65850, i3, this.f65852, i2);
                    if (strM15437 == null) {
                        int iM47147 = m47147(i);
                        if (iM47147 != -1 && (strM15437 = m15437(this.f65850, iM47147, this.f65852, this.f65859)) != null) {
                            this.f65858[i] = (iM47147 - this.f65860) - this.f65857;
                        }
                        if (strM15437 == null) {
                            strM15437 = "";
                        }
                    }
                    if (strM15437.length() > 10000) {
                        strM15437 = InterfaceC3412.f11079;
                    }
                    return strM15437;
                }
                return InterfaceC3412.f11079;
            }
        }
        return C12295.m30686(i, this.f65853).toString();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private synchronized int m47147(int i) {
        C12295.m30688("getPreviousStringEndOffset " + i);
        if (i == 0) {
            return this.f65860 + this.f65857;
        }
        int i2 = i - 1;
        int iM15431 = AbstractC5101.m15431(this.f65850, this.f65860 + this.f65857 + this.f65858[i2], this.f65852, this.f65859);
        C12295.m30688("new offset " + iM15431);
        if (iM15431 != -1) {
            return iM15431;
        }
        int iM47147 = m47147(i2);
        if (iM47147 == -1) {
            return -1;
        }
        return AbstractC5101.m15431(this.f65850, iM47147, this.f65852, this.f65859);
    }

    public C20566(C13961 c13961) throws IOException {
        this.f65850 = c13961;
        long filePointer = c13961.getFilePointer();
        int i = (int) filePointer;
        if (filePointer != i) {
            throw new ArithmeticException();
        }
        this.f65860 = i;
        C9311 c9311M24534 = C9311.m24534(c13961);
        if (c9311M24534.f30253 == 0) {
            c13961.skipBytes(c9311M24534.f30250 - 8);
            long filePointer2 = c13961.getFilePointer();
            int i2 = (int) filePointer2;
            if (filePointer2 != i2) {
                throw new ArithmeticException();
            }
            this.f65860 = i2;
            c9311M24534 = C9311.m24534(c13961);
        }
        int i3 = c9311M24534.f30250;
        int i4 = c9311M24534.f30252;
        c9311M24534.m24537(1);
        int i5 = c13961.readInt();
        int i6 = c13961.readInt();
        this.f65856 = i6;
        this.f65854 = c13961.readInt();
        int i7 = c13961.readInt();
        int i8 = c13961.readInt();
        this.f65861 = i8;
        if (i4 > 28) {
            c13961.skipBytes(i4 - 28);
        }
        i7 = i7 < i4 ? i4 : i7;
        if ((i6 == 0 || i8 == 0) && (i5 < 0 || (i5 * 4) + i4 > i7)) {
            this.f65856 = 0;
            this.f65861 = 0;
            i5 = (i7 - i4) / 4;
        }
        this.f65853 = i5;
        this.f65857 = i7;
        int i9 = this.f65856;
        if (i9 == 0) {
            this.f65861 = 0;
        }
        if (i5 > 16777216) {
            throw new IOException("Too many strings");
        }
        if (i9 > i5) {
            this.f65856 = i5;
        }
        int i10 = this.f65860;
        this.f65855 = i4 + i10;
        int i11 = this.f65861;
        long length = c13961.length();
        this.f65859 = AbstractC5101.m15421(i10, i7, i11, i3, length <= 0 ? 0 : length >= 2147483647L ? Integer.MAX_VALUE : (int) length);
        this.f65858 = new int[i5];
        for (int i12 = 0; i12 < i5; i12++) {
            this.f65858[i12] = c13961.readInt();
        }
        int i13 = this.f65856;
        if (i13 != 0) {
            this.f65851 = new int[i13];
            for (int i14 = 0; i14 < this.f65856; i14++) {
                this.f65851[i14] = c13961.readInt();
            }
        } else {
            this.f65851 = new int[0];
        }
        this.f65862 = new C2666[i5];
        this.f65852 = (this.f65854 & 256) != 0;
        c13961.seek(this.f65860 + i3);
    }

    @Override // l.InterfaceC3412
    public final int size() {
        return this.f65853;
    }

    @Override // l.InterfaceC3412
    public final C2666 getItem(int i) {
        C2666[] c2666Arr = this.f65862;
        if (c2666Arr != null && i >= 0 && i < this.f65853) {
            C2666 c2666 = c2666Arr[i];
            if (c2666 != null) {
                return c2666;
            }
            C2666 c2667 = new C2666(this, m47146(i), m47145(i));
            c2666Arr[i] = c2667;
            return c2667;
        }
        return new C2666(this, m47146(i), m47145(i));
    }

    @Override // l.InterfaceC3412
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC16090 mo11156(int i) {
        int i2 = this.f65853;
        if (i < 0 || i >= i2) {
            throw C12295.m30686(i, i2);
        }
        return getItem(i);
    }

    @Override // l.InterfaceC3412
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo11157() {
        return this.f65852;
    }
}
