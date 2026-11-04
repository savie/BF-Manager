package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩻֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 41QS */
/* JADX INFO: loaded from: classes.dex */
public final class C24698 extends C20222 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final C24698 f79910;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int[] f79911;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f79912;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f79913;

    static {
        C24698 c24698 = new C24698(0);
        f79910 = c24698;
        c24698.mo15005();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C24698 m55041(int i) {
        C24698 c24698 = new C24698(1);
        c24698.add(i);
        c24698.mo15005();
        return c24698;
    }

    public C24698() {
        this(4);
    }

    public C24698(int i) {
        super(true);
        try {
            this.f79911 = new int[i];
            this.f79913 = 0;
            this.f79912 = true;
        } catch (NegativeArraySizeException unused) {
            throw new IllegalArgumentException("size < 0");
        }
    }

    public final int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < this.f79913; i2++) {
            i = (i * 31) + this.f79911[i2];
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C24698)) {
            return false;
        }
        C24698 c24698 = (C24698) obj;
        if (this.f79912 != c24698.f79912 || this.f79913 != c24698.f79913) {
            return false;
        }
        for (int i = 0; i < this.f79913; i++) {
            if (this.f79911[i] != c24698.f79911[i]) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f79913 * 5) + 10);
        sb.append('{');
        for (int i = 0; i < this.f79913; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(this.f79911[i]);
        }
        sb.append('}');
        return sb.toString();
    }

    public final int size() {
        return this.f79913;
    }

    public final int get(int i) {
        if (i >= this.f79913) {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        try {
            return this.f79911[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IndexOutOfBoundsException("n < 0");
        }
    }

    public final void set(int i, int i2) {
        m46490();
        if (i >= this.f79913) {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        try {
            this.f79911[i] = i2;
            this.f79912 = false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            if (i < 0) {
                throw new IllegalArgumentException("n < 0");
            }
        }
    }

    public final void add(int i) {
        m46490();
        int i2 = this.f79913;
        int[] iArr = this.f79911;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[C7376.m20246(i2, 3, 2, 10)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f79911 = iArr2;
        }
        int[] iArr3 = this.f79911;
        int i3 = this.f79913;
        int i4 = i3 + 1;
        this.f79913 = i4;
        iArr3[i3] = i;
        if (!this.f79912 || i4 <= 1) {
            return;
        }
        this.f79912 = i >= iArr3[i3 + (-1)];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m55047(int i, int i2) {
        int i3 = this.f79913;
        if (i > i3) {
            throw new IndexOutOfBoundsException("n > size()");
        }
        int[] iArr = this.f79911;
        boolean z = false;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[C7376.m20246(i3, 3, 2, 10)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f79911 = iArr2;
        }
        int[] iArr3 = this.f79911;
        int i4 = i + 1;
        System.arraycopy(iArr3, i, iArr3, i4, this.f79913 - i);
        int[] iArr4 = this.f79911;
        iArr4[i] = i2;
        int i5 = this.f79913;
        this.f79913 = i5 + 1;
        if (this.f79912 && ((i == 0 || i2 > iArr4[i - 1]) && (i == i5 || i2 < iArr4[i4]))) {
            z = true;
        }
        this.f79912 = z;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m55046(int i) {
        int i2 = this.f79913;
        if (i >= i2) {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        int[] iArr = this.f79911;
        System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        this.f79913--;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m55042() {
        return get(this.f79913 - 1);
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int m55044() {
        m46490();
        int i = get(this.f79913 - 1);
        this.f79913--;
        return i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m55048(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("newSize < 0");
        }
        if (i > this.f79913) {
            throw new IllegalArgumentException("newSize > size");
        }
        m46490();
        this.f79913 = i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C24698 m55045() {
        int i = this.f79913;
        C24698 c24698 = new C24698(i);
        for (int i2 = 0; i2 < i; i2++) {
            c24698.add(this.f79911[i2]);
        }
        return c24698;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m55049() {
        m46490();
        if (this.f79912) {
            return;
        }
        Arrays.sort(this.f79911, 0, this.f79913);
        this.f79912 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m55043(int i) {
        int i2;
        int i3 = this.f79913;
        if (!this.f79912) {
            for (int i4 = 0; i4 < i3; i4++) {
                if (this.f79911[i4] == i) {
                    return i4;
                }
            }
            return -i3;
        }
        int i5 = -1;
        int i6 = i3;
        while (i6 > i5 + 1) {
            int i7 = ((i6 - i5) >> 1) + i5;
            if (i <= this.f79911[i7]) {
                i6 = i7;
            } else {
                i5 = i7;
            }
        }
        if (i6 == i3) {
            i2 = -i3;
        } else {
            if (i == this.f79911[i6]) {
                return i6;
            }
            i2 = -i6;
        }
        return i2 - 1;
    }
}
