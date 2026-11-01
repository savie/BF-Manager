package l;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹ۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R2TM */
/* JADX INFO: loaded from: classes.dex */
public final class C22103 implements Iterable, Cloneable {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final String[] f71578 = new String[0];

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String[] f71579;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String[] f71580;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f71581 = 0;

    public C22103() {
        String[] strArr = f71578;
        this.f71580 = strArr;
        this.f71579 = strArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m49044(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Object must not be null");
        }
        for (int i = 0; i < this.f71581; i++) {
            if (str.equals(this.f71580[i])) {
                return i;
            }
        }
        return -1;
    }

    public final void put(String str, String str2) {
        int iM49044 = m49044(str);
        if (iM49044 != -1) {
            this.f71579[iM49044] = str2;
            return;
        }
        int i = this.f71581;
        int i2 = i + 1;
        if (i2 < i) {
            throw new IllegalArgumentException("Must be true");
        }
        String[] strArr = this.f71580;
        int length = strArr.length;
        if (length < i2) {
            int i3 = length >= 4 ? i * 2 : 4;
            if (i2 <= i3) {
                i2 = i3;
            }
            String[] strArr2 = new String[i2];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i2));
            this.f71580 = strArr2;
            String[] strArr3 = this.f71579;
            String[] strArr4 = new String[i2];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i2));
            this.f71579 = strArr4;
        }
        String[] strArr5 = this.f71580;
        int i4 = this.f71581;
        strArr5[i4] = str;
        this.f71579[i4] = str2;
        this.f71581 = i4 + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49043(C22103 c22103, int i) {
        int i2 = c22103.f71581;
        if (i >= i2) {
            throw new IllegalArgumentException("Must be false");
        }
        int i3 = (i2 - i) - 1;
        if (i3 > 0) {
            String[] strArr = c22103.f71580;
            int i4 = i + 1;
            System.arraycopy(strArr, i4, strArr, i, i3);
            String[] strArr2 = c22103.f71579;
            System.arraycopy(strArr2, i4, strArr2, i, i3);
        }
        int i5 = c22103.f71581 - 1;
        c22103.f71581 = i5;
        c22103.f71580[i5] = null;
        c22103.f71579[i5] = null;
    }

    public final int size() {
        return this.f71581;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C5169(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C22103.class != obj.getClass()) {
            return false;
        }
        C22103 c22103 = (C22103) obj;
        if (this.f71581 == c22103.f71581 && Arrays.equals(this.f71580, c22103.f71580)) {
            return Arrays.equals(this.f71579, c22103.f71579);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f71581 * 31) + Arrays.hashCode(this.f71580)) * 31) + Arrays.hashCode(this.f71579);
    }

    public final Object clone() {
        try {
            C22103 c22103 = (C22103) super.clone();
            c22103.f71581 = this.f71581;
            String[] strArr = this.f71580;
            int i = this.f71581;
            String[] strArr2 = new String[i];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i));
            this.f71580 = strArr2;
            String[] strArr3 = this.f71579;
            int i2 = this.f71581;
            String[] strArr4 = new String[i2];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i2));
            this.f71579 = strArr4;
            return c22103;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
