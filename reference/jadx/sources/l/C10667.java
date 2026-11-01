package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۧ֨ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: L99C */
/* JADX INFO: loaded from: classes4.dex */
public final class C10667 extends AbstractC3733 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f36373;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f36374;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f36375;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f36376;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C3960[] f36377;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f36378;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C1388 f36379;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int[] f36380;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f36381;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int[] f36382;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f36383;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f36384;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f36385;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private synchronized String m26867(int i) {
        int i2;
        if (i >= 0) {
            if (i < this.f36375) {
                int i3 = this.f36378 + this.f36385 + this.f36380[i];
                if (i3 >= this.f36376 && i3 < (i2 = this.f36374)) {
                    String strM10935 = m10935(this.f36379, i3, this.f36373, i2);
                    if (strM10935 == null) {
                        int iM26869 = m26869(i);
                        if (iM26869 != -1 && (strM10935 = m10935(this.f36379, iM26869, this.f36373, this.f36374)) != null) {
                            this.f36380[i] = (iM26869 - this.f36378) - this.f36385;
                        }
                        if (strM10935 == null) {
                            strM10935 = "";
                        }
                    }
                    if (strM10935.length() > 10000) {
                        strM10935 = InterfaceC5727.f19491;
                    }
                    return strM10935;
                }
                return InterfaceC5727.f19491;
            }
        }
        return C20149.m45565(i, this.f36375).toString();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private synchronized int[] m26868(int i) {
        if (i >= 0) {
            try {
                if (i < this.f36383) {
                    this.f36379.seek(this.f36378 + this.f36381 + this.f36382[i]);
                    C15070 c15070 = new C15070();
                    while (true) {
                        try {
                            int i2 = this.f36379.readInt();
                            if (i2 == -1) {
                                return c15070.mo3181();
                            }
                            c15070.add(i2);
                        } catch (ArrayIndexOutOfBoundsException unused) {
                            return null;
                        }
                    }
                }
            } catch (IOException e) {
                throw new C3214(e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private synchronized int m26869(int i) {
        C20149.m45563("getPreviousStringEndOffset " + i);
        if (i == 0) {
            return this.f36378 + this.f36385;
        }
        int i2 = i - 1;
        int iM10931 = AbstractC3733.m10931(this.f36379, this.f36378 + this.f36385 + this.f36380[i2], this.f36373, this.f36374);
        C20149.m45563("new offset " + iM10931);
        if (iM10931 != -1) {
            return iM10931;
        }
        int iM26869 = m26869(i2);
        if (iM26869 == -1) {
            return -1;
        }
        return AbstractC3733.m10931(this.f36379, iM26869, this.f36373, this.f36374);
    }

    public C10667(C1388 c1388) throws IOException {
        this.f36379 = c1388;
        long filePointer = c1388.getFilePointer();
        int i = (int) filePointer;
        if (filePointer != i) {
            throw new ArithmeticException();
        }
        this.f36378 = i;
        C4356 c4356M12195 = C4356.m12195(c1388);
        if (c4356M12195.f15584 == 0) {
            c1388.skipBytes(c4356M12195.f15585 - 8);
            long filePointer2 = c1388.getFilePointer();
            int i2 = (int) filePointer2;
            if (filePointer2 != i2) {
                throw new ArithmeticException();
            }
            this.f36378 = i2;
            c4356M12195 = C4356.m12195(c1388);
        }
        int i3 = c4356M12195.f15585;
        int i4 = c4356M12195.f15587;
        c4356M12195.m12198(1);
        int i5 = c1388.readInt();
        int i6 = c1388.readInt();
        this.f36383 = i6;
        this.f36384 = c1388.readInt();
        int i7 = c1388.readInt();
        int i8 = c1388.readInt();
        this.f36381 = i8;
        if (i4 > 28) {
            c1388.skipBytes(i4 - 28);
        }
        i7 = i7 < i4 ? i4 : i7;
        if ((i6 == 0 || i8 == 0) && (i5 < 0 || (i5 * 4) + i4 > i7)) {
            this.f36383 = 0;
            this.f36381 = 0;
            i5 = (i7 - i4) / 4;
        }
        this.f36375 = i5;
        this.f36385 = i7;
        int i9 = this.f36383;
        if (i9 == 0) {
            this.f36381 = 0;
        }
        if (i5 > 16777216) {
            throw new IOException("Too many strings");
        }
        if (i9 > i5) {
            this.f36383 = i5;
        }
        int i10 = this.f36378;
        this.f36376 = i4 + i10;
        int i11 = this.f36381;
        long length = c1388.length();
        this.f36374 = AbstractC3733.m10923(i10, i7, i11, i3, length <= 0 ? 0 : length >= 2147483647L ? Integer.MAX_VALUE : (int) length);
        this.f36380 = new int[i5];
        for (int i12 = 0; i12 < i5; i12++) {
            this.f36380[i12] = c1388.readInt();
        }
        int i13 = this.f36383;
        if (i13 != 0) {
            this.f36382 = new int[i13];
            for (int i14 = 0; i14 < this.f36383; i14++) {
                this.f36382[i14] = c1388.readInt();
            }
        } else {
            this.f36382 = new int[0];
        }
        this.f36377 = new C3960[i5];
        this.f36373 = (this.f36384 & 256) != 0;
        c1388.seek(this.f36378 + i3);
    }

    @Override // l.InterfaceC5727
    public final int size() {
        return this.f36375;
    }

    @Override // l.InterfaceC5727
    public final C3960 getItem(int i) {
        C3960[] c3960Arr = this.f36377;
        if (c3960Arr != null && i >= 0 && i < this.f36375) {
            C3960 c3960 = c3960Arr[i];
            if (c3960 != null) {
                return c3960;
            }
            C3960 c3961 = new C3960(this, m26867(i), m26868(i));
            c3960Arr[i] = c3961;
            return c3961;
        }
        return new C3960(this, m26867(i), m26868(i));
    }

    @Override // l.InterfaceC5727
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC12078 mo15779(int i) {
        int i2 = this.f36375;
        if (i < 0 || i >= i2) {
            throw C20149.m45565(i, i2);
        }
        return getItem(i);
    }

    @Override // l.InterfaceC5727
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15780() {
        return this.f36373;
    }
}
