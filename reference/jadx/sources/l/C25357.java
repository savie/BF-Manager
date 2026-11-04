package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩻᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2708 */
/* JADX INFO: loaded from: classes.dex */
public final class C25357 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int[] f81868;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f81869;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int[] f81870;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f81872;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceC11930[] f81873;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean[] f81877;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long[] f81878;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int[] f81879 = new int[16];

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int[] f81876 = new int[16];

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int[] f81874 = new int[16];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f81871 = -1;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C11974[] f81875 = new C11974[16];

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m56705() {
        return this.f81872;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long m56704() {
        return (((long) this.f81871) << 32) | (((long) this.f81872) & 4294967295L);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m56711() {
        this.f81869 = true;
        this.f81871 = -1;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m56699() {
        this.f81869 = false;
        this.f81871 = -1;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m56701(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative syntax effect end");
        }
        if (this.f81869) {
            this.f81871 = Math.max(this.f81871, i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m56692(int i, int i2, C11974 c11974) {
        return m56687(i, i2, c11974, true);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m56706(int i, int i2, C11974 c11974) {
        return m56687(i, i2, c11974, !this.f81869);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m56687(int i, int i2, C11974 c11974, boolean z) {
        if (i < 0 || i2 < i) {
            throw new IllegalArgumentException(C6934.m19217("Invalid style range: ", i, i2, ".."));
        }
        C17359.requireNonNull(c11974, "style");
        if (c11974 == C11974.f38541 || i == i2) {
            return -1;
        }
        if (this.f81872 == this.f81879.length) {
            m56689();
        }
        int i3 = this.f81872;
        this.f81872 = i3 + 1;
        int[] iArr = this.f81879;
        iArr[i3] = i;
        this.f81876[i3] = i2;
        this.f81875[i3] = c11974;
        long[] jArr = this.f81878;
        if (jArr != null) {
            jArr[i3] = 0;
        }
        this.f81874[i3] = -1;
        if (z) {
            boolean[] zArr = this.f81877;
            if (zArr != null) {
                zArr[i3] = false;
            }
            m56701(i2);
        } else {
            if (this.f81877 == null) {
                this.f81877 = new boolean[iArr.length];
            }
            this.f81877[i3] = true;
        }
        if (this.f81873 != null) {
            this.f81868[i3] = -1;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m56693(C11732 c11732) {
        if (this.f81872 == this.f81879.length) {
            m56689();
        }
        if (this.f81873 == null) {
            int[] iArr = this.f81879;
            this.f81873 = new InterfaceC11930[iArr.length];
            this.f81870 = new int[iArr.length];
            this.f81868 = new int[iArr.length];
        }
        int i = this.f81872;
        this.f81872 = i + 1;
        boolean[] zArr = this.f81877;
        if (zArr != null) {
            zArr[i] = false;
        }
        this.f81875[i] = null;
        long[] jArr = this.f81878;
        if (jArr != null) {
            jArr[i] = 0;
        }
        this.f81874[i] = -1;
        this.f81873[i] = c11732;
        this.f81870[i] = -1;
        this.f81868[i] = -1;
        return i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m56707(int i, int i2) {
        this.f81870[i] = i2;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m56702(int i) {
        return this.f81870[i];
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m56700(int i) {
        if (i >= 0 && this.f81873 != null) {
            while (i >= 0) {
                if (this.f81873[i] != null) {
                    return true;
                }
                i = this.f81870[i];
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m56709(int i) {
        return this.f81869 && this.f81871 > i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m56710(int i) {
        InterfaceC11930 interfaceC11930 = this.f81873[i];
        if (interfaceC11930 != null) {
            this.f81868[i] = interfaceC11930.mo29465();
            this.f81873[i] = null;
        }
        return this.f81868[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56695(int i, int i2) {
        this.f81874[i] = i2;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m56703(int i) {
        return this.f81874[i];
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m56698(int i) {
        return this.f81879[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m56691(int i) {
        return this.f81876[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11974 m56690(int i) {
        return this.f81875[i];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m56708(int i, int i2, int i3) {
        C17359.checkIndex(i, this.f81872);
        int[] iArr = this.f81879;
        if (i2 == iArr[i] && i3 == this.f81876[i]) {
            return;
        }
        if (this.f81878 == null) {
            this.f81878 = new long[iArr.length];
        }
        this.f81878[i] = (((long) i3) & 4294967295L) | (((long) i2) << 32);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56696(int i, int i2, int i3) {
        C17359.checkIndex(i, this.f81872);
        C11974 c11974 = this.f81875[i];
        if (c11974 == null) {
            return;
        }
        if (c11974.m30035() != null) {
            long[] jArr = this.f81878;
            long j = jArr == null ? 0L : jArr[i];
            int i4 = j == 0 ? this.f81879[i] : (int) (j >>> 32);
            int i5 = j == 0 ? this.f81876[i] : (int) j;
            if (i4 < i2 || i5 > i3) {
                C11974[] c11974Arr = this.f81875;
                c11974Arr[i] = c11974Arr[i].m30037((String) null);
            }
        }
        int iMin = Math.min(i3, Math.max(i2, this.f81879[i]));
        this.f81879[i] = iMin;
        int[] iArr = this.f81876;
        iArr[i] = Math.max(iMin, Math.min(i3, iArr[i]));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56697(long j) {
        m56688((int) j);
        this.f81871 = (int) (j >> 32);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m56688(int i) {
        int i2;
        if (i < 0 || i > (i2 = this.f81872)) {
            StringBuilder sbM12235 = C3769.m12235(i, "Invalid style journal mark: ", ", size=");
            sbM12235.append(this.f81872);
            throw new IllegalArgumentException(sbM12235.toString());
        }
        Arrays.fill(this.f81875, i, i2, (Object) null);
        InterfaceC11930[] interfaceC11930Arr = this.f81873;
        if (interfaceC11930Arr != null) {
            Arrays.fill(interfaceC11930Arr, i, this.f81872, (Object) null);
        }
        boolean[] zArr = this.f81877;
        if (zArr != null) {
            Arrays.fill(zArr, i, this.f81872, false);
        }
        this.f81872 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56694() {
        m56688(0);
        this.f81871 = -1;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m56689() {
        int i = this.f81872;
        int iMin = (int) Math.min(2147483647L, ((long) i) + ((long) (i >> 1)));
        if (iMin <= this.f81872) {
            throw new OutOfMemoryError("Syntax style journal capacity exceeded");
        }
        this.f81879 = Arrays.copyOf(this.f81879, iMin);
        this.f81876 = Arrays.copyOf(this.f81876, iMin);
        this.f81874 = Arrays.copyOf(this.f81874, iMin);
        this.f81875 = (C11974[]) Arrays.copyOf(this.f81875, iMin);
        long[] jArr = this.f81878;
        if (jArr != null) {
            this.f81878 = Arrays.copyOf(jArr, iMin);
        }
        boolean[] zArr = this.f81877;
        if (zArr != null) {
            this.f81877 = Arrays.copyOf(zArr, iMin);
        }
        InterfaceC11930[] interfaceC11930Arr = this.f81873;
        if (interfaceC11930Arr != null) {
            this.f81873 = (InterfaceC11930[]) Arrays.copyOf(interfaceC11930Arr, iMin);
            this.f81870 = Arrays.copyOf(this.f81870, iMin);
            this.f81868 = Arrays.copyOf(this.f81868, iMin);
        }
    }
}
