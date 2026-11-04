package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܳ֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5T5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15000 implements InterfaceC8550 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f49008;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f49009;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f49010;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f49011;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f49012;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f49013;

    public C15000(byte[] bArr) {
        this(bArr, false);
    }

    public C15000() {
        this(new byte[1000], true);
    }

    public C15000(byte[] bArr, boolean z) {
        if (bArr == null) {
            throw new NullPointerException("data == null");
        }
        this.f49010 = z;
        this.f49013 = bArr;
        this.f49009 = 0;
        this.f49012 = null;
        this.f49008 = 0;
        this.f49011 = 0;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final byte[] m36125() {
        return this.f49013;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final byte[] m36121() {
        int i = this.f49009;
        byte[] bArr = new byte[i];
        System.arraycopy(this.f49013, 0, bArr, 0, i);
        return bArr;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m36122() {
        return this.f49009;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m36127(int i) {
        if (this.f49009 == i) {
            return;
        }
        StringBuilder sbM12235 = C3769.m12235(i, "expected cursor ", "; actual value: ");
        sbM12235.append(this.f49009);
        throw new C3880(sbM12235.toString(), null);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m36129(int i) {
        int i2 = this.f49009;
        int i3 = i2 + 1;
        if (this.f49010) {
            m36108(i3);
        } else if (i3 > this.f49013.length) {
            m36107();
            throw null;
        }
        this.f49013[i2] = (byte) i;
        this.f49009 = i3;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m36123(int i) {
        int i2 = this.f49009;
        int i3 = i2 + 2;
        if (this.f49010) {
            m36108(i3);
        } else if (i3 > this.f49013.length) {
            m36107();
            throw null;
        }
        byte[] bArr = this.f49013;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        this.f49009 = i3;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m36124(int i) {
        int i2 = this.f49009;
        int i3 = i2 + 4;
        if (this.f49010) {
            m36108(i3);
        } else if (i3 > this.f49013.length) {
            m36107();
            throw null;
        }
        byte[] bArr = this.f49013;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.f49009 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36112(long j) {
        int i = this.f49009;
        int i2 = i + 8;
        if (this.f49010) {
            m36108(i2);
        } else if (i2 > this.f49013.length) {
            m36107();
            throw null;
        }
        int i3 = (int) j;
        byte[] bArr = this.f49013;
        bArr[i] = (byte) i3;
        bArr[i + 1] = (byte) (i3 >> 8);
        bArr[i + 2] = (byte) (i3 >> 16);
        bArr[i + 3] = (byte) (i3 >> 24);
        int i4 = (int) (j >> 32);
        bArr[i + 4] = (byte) i4;
        bArr[i + 5] = (byte) (i4 >> 8);
        bArr[i + 6] = (byte) (i4 >> 16);
        bArr[i + 7] = (byte) (i4 >> 24);
        this.f49009 = i2;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m36117(int i) {
        if (this.f49010) {
            m36108(this.f49009 + 5);
        }
        int i2 = this.f49009;
        while (true) {
            int i3 = i >>> 7;
            if (i3 != 0) {
                m36129((byte) ((i & 127) | 128));
                i = i3;
            } else {
                m36129((byte) (i & 127));
                return this.f49009 - i2;
            }
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m36120(int i) {
        if (this.f49010) {
            m36108(this.f49009 + 5);
        }
        int i2 = i >> 7;
        int i3 = (Integer.MIN_VALUE & i) == 0 ? 0 : -1;
        boolean z = true;
        while (true) {
            int i4 = i2;
            int i5 = i;
            i = i4;
            if (!z) {
                return;
            }
            z = (i == i3 && (i & 1) == ((i5 >> 6) & 1)) ? false : true;
            m36129((byte) ((i5 & 127) | (z ? 128 : 0)));
            i2 = i >> 7;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36114(C22460 c22460) {
        int iM50636 = c22460.m50636();
        int i = this.f49009;
        int i2 = iM50636 + i;
        if (this.f49010) {
            m36108(i2);
        } else if (i2 > this.f49013.length) {
            m36107();
            throw null;
        }
        c22460.m50639(i, this.f49013);
        this.f49009 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36115(byte[] bArr) {
        int length = bArr.length;
        int i = this.f49009;
        int i2 = i + length;
        if ((length | i2) < 0 || length > bArr.length) {
            throw new IndexOutOfBoundsException("bytes.length " + bArr.length + "; 0..!" + i2);
        }
        if (this.f49010) {
            m36108(i2);
        } else if (i2 > this.f49013.length) {
            m36107();
            throw null;
        }
        System.arraycopy(bArr, 0, this.f49013, i, length);
        this.f49009 = i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36109(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("count < 0");
        }
        int i2 = this.f49009 + i;
        if (this.f49010) {
            m36108(i2);
        } else if (i2 > this.f49013.length) {
            m36107();
            throw null;
        }
        Arrays.fill(this.f49013, this.f49009, i2, (byte) 0);
        this.f49009 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36110(int i) {
        int i2 = i - 1;
        if (i < 0 || (i & i2) != 0) {
            throw new IllegalArgumentException("bogus alignment");
        }
        int i3 = (this.f49009 + i2) & (~i2);
        if (this.f49010) {
            m36108(i3);
        } else if (i3 > this.f49013.length) {
            m36107();
            throw null;
        }
        Arrays.fill(this.f49013, this.f49009, i3, (byte) 0);
        this.f49009 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36116() {
        return this.f49012 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36113(String str) {
        if (this.f49012 == null) {
            return;
        }
        m36126();
        this.f49012.add(new C19476(this.f49009, Integer.MAX_VALUE, str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36111(int i, String str) {
        if (this.f49012 == null) {
            return;
        }
        m36126();
        int size = this.f49012.size();
        int iM45012 = size == 0 ? 0 : ((C19476) this.f49012.get(size - 1)).m45012();
        int i2 = this.f49009;
        if (iM45012 <= i2) {
            iM45012 = i2;
        }
        this.f49012.add(new C19476(iM45012, i + iM45012, str));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m36126() {
        int size;
        ArrayList arrayList = this.f49012;
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        ((C19476) this.f49012.get(size - 1)).m45015(this.f49009);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m36128() {
        int i = this.f49011;
        return this.f49008 - ((i / 2) + ((i * 2) + 8));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m36119(int i) {
        if (this.f49012 != null || this.f49009 != 0) {
            throw new RuntimeException("cannot enable annotations");
        }
        if (i < 40) {
            throw new IllegalArgumentException("annotationWidth < 40");
        }
        int iM18182 = C6421.m18182(i, 7, 15, 1) & (-2);
        if (iM18182 < 6) {
            iM18182 = 6;
        } else if (iM18182 > 10) {
            iM18182 = 10;
        }
        this.f49012 = new ArrayList(1000);
        this.f49008 = i;
        this.f49011 = iM18182;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m36118() {
        m36126();
        ArrayList arrayList = this.f49012;
        if (arrayList != null) {
            for (int size = arrayList.size(); size > 0; size--) {
                int i = size - 1;
                C19476 c19476 = (C19476) this.f49012.get(i);
                if (c19476.m45014() > this.f49009) {
                    this.f49012.remove(i);
                } else {
                    int iM45012 = c19476.m45012();
                    int i2 = this.f49009;
                    if (iM45012 > i2) {
                        c19476.m45013(i2);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m36107() {
        throw new IndexOutOfBoundsException("attempt to write past the end");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m36108(int i) {
        byte[] bArr = this.f49013;
        if (bArr.length < i) {
            byte[] bArr2 = new byte[(i * 2) + 1000];
            System.arraycopy(bArr, 0, bArr2, 0, this.f49009);
            this.f49013 = bArr2;
        }
    }
}
