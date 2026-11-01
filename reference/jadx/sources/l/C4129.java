package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۘᩴܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 41QS */
/* JADX INFO: loaded from: classes3.dex */
public final class C4129 extends C18947 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C4129 f15128;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f15129;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f15130;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f15131;

    static {
        C4129 c4129 = new C4129(0);
        f15128 = c4129;
        c4129.mo9637();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C4129 m11753(int i) {
        C4129 c4129 = new C4129(1);
        c4129.add(i);
        c4129.mo9637();
        return c4129;
    }

    public C4129() {
        this(4);
    }

    public C4129(int i) {
        super(true);
        try {
            this.f15130 = new int[i];
            this.f15131 = 0;
            this.f15129 = true;
        } catch (NegativeArraySizeException unused) {
            throw new IllegalArgumentException("size < 0");
        }
    }

    public final int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < this.f15131; i2++) {
            i = (i * 31) + this.f15130[i2];
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4129)) {
            return false;
        }
        C4129 c4129 = (C4129) obj;
        if (this.f15129 != c4129.f15129 || this.f15131 != c4129.f15131) {
            return false;
        }
        for (int i = 0; i < this.f15131; i++) {
            if (this.f15130[i] != c4129.f15130[i]) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f15131 * 5) + 10);
        sb.append('{');
        for (int i = 0; i < this.f15131; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(this.f15130[i]);
        }
        sb.append('}');
        return sb.toString();
    }

    public final int size() {
        return this.f15131;
    }

    public final int get(int i) {
        if (i >= this.f15131) {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        try {
            return this.f15130[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IndexOutOfBoundsException("n < 0");
        }
    }

    public final void set(int i, int i2) {
        m43641();
        if (i >= this.f15131) {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        try {
            this.f15130[i] = i2;
            this.f15129 = false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            if (i < 0) {
                throw new IllegalArgumentException("n < 0");
            }
        }
    }

    public final void add(int i) {
        m43641();
        int i2 = this.f15131;
        int[] iArr = this.f15130;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[C0833.m3428(i2, 3, 2, 10)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f15130 = iArr2;
        }
        int[] iArr3 = this.f15130;
        int i3 = this.f15131;
        int i4 = i3 + 1;
        this.f15131 = i4;
        iArr3[i3] = i;
        if (!this.f15129 || i4 <= 1) {
            return;
        }
        this.f15129 = i >= iArr3[i3 + (-1)];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m11760(int i, int i2) {
        int i3 = this.f15131;
        if (i > i3) {
            throw new IndexOutOfBoundsException("n > size()");
        }
        int[] iArr = this.f15130;
        boolean z = false;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[C0833.m3428(i3, 3, 2, 10)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f15130 = iArr2;
        }
        int[] iArr3 = this.f15130;
        int i4 = i + 1;
        System.arraycopy(iArr3, i, iArr3, i4, this.f15131 - i);
        int[] iArr4 = this.f15130;
        iArr4[i] = i2;
        int i5 = this.f15131;
        this.f15131 = i5 + 1;
        if (this.f15129 && ((i == 0 || i2 > iArr4[i - 1]) && (i == i5 || i2 < iArr4[i4]))) {
            z = true;
        }
        this.f15129 = z;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m11759(int i) {
        int i2 = this.f15131;
        if (i >= i2) {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        int[] iArr = this.f15130;
        System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        this.f15131--;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m11761() {
        return get(this.f15131 - 1);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m11758() {
        m43641();
        int i = get(this.f15131 - 1);
        this.f15131--;
        return i;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m11754(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("newSize < 0");
        }
        if (i > this.f15131) {
            throw new IllegalArgumentException("newSize > size");
        }
        m43641();
        this.f15131 = i;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C4129 m11757() {
        int i = this.f15131;
        C4129 c4129 = new C4129(i);
        for (int i2 = 0; i2 < i; i2++) {
            c4129.add(this.f15130[i2]);
        }
        return c4129;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final void m11756() {
        m43641();
        if (this.f15129) {
            return;
        }
        Arrays.sort(this.f15130, 0, this.f15131);
        this.f15129 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m11755(int i) {
        int i2;
        int i3 = this.f15131;
        if (!this.f15129) {
            for (int i4 = 0; i4 < i3; i4++) {
                if (this.f15130[i4] == i) {
                    return i4;
                }
            }
            return -i3;
        }
        int i5 = -1;
        int i6 = i3;
        while (i6 > i5 + 1) {
            int i7 = ((i6 - i5) >> 1) + i5;
            if (i <= this.f15130[i7]) {
                i6 = i7;
            } else {
                i5 = i7;
            }
        }
        if (i6 == i3) {
            i2 = -i3;
        } else {
            if (i == this.f15130[i6]) {
                return i6;
            }
            i2 = -i6;
        }
        return i2 - 1;
    }
}
