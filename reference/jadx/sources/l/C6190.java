package l;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛۚ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: R2TM */
/* JADX INFO: loaded from: classes3.dex */
public final class C6190 implements Iterable, Cloneable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final String[] f21083 = new String[0];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String[] f21084;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String[] f21085;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f21086 = 0;

    public C6190() {
        String[] strArr = f21083;
        this.f21084 = strArr;
        this.f21085 = strArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m17838(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Object must not be null");
        }
        for (int i = 0; i < this.f21086; i++) {
            if (str.equals(this.f21084[i])) {
                return i;
            }
        }
        return -1;
    }

    public final void put(String str, String str2) {
        int iM17838 = m17838(str);
        if (iM17838 != -1) {
            this.f21085[iM17838] = str2;
            return;
        }
        int i = this.f21086;
        int i2 = i + 1;
        if (i2 < i) {
            throw new IllegalArgumentException("Must be true");
        }
        String[] strArr = this.f21084;
        int length = strArr.length;
        if (length < i2) {
            int i3 = length >= 4 ? i * 2 : 4;
            if (i2 <= i3) {
                i2 = i3;
            }
            String[] strArr2 = new String[i2];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i2));
            this.f21084 = strArr2;
            String[] strArr3 = this.f21085;
            String[] strArr4 = new String[i2];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i2));
            this.f21085 = strArr4;
        }
        String[] strArr5 = this.f21084;
        int i4 = this.f21086;
        strArr5[i4] = str;
        this.f21085[i4] = str2;
        this.f21086 = i4 + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17837(C6190 c6190, int i) {
        int i2 = c6190.f21086;
        if (i >= i2) {
            throw new IllegalArgumentException("Must be false");
        }
        int i3 = (i2 - i) - 1;
        if (i3 > 0) {
            String[] strArr = c6190.f21084;
            int i4 = i + 1;
            System.arraycopy(strArr, i4, strArr, i, i3);
            String[] strArr2 = c6190.f21085;
            System.arraycopy(strArr2, i4, strArr2, i, i3);
        }
        int i5 = c6190.f21086 - 1;
        c6190.f21086 = i5;
        c6190.f21084[i5] = null;
        c6190.f21085[i5] = null;
    }

    public final int size() {
        return this.f21086;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C12155(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6190.class != obj.getClass()) {
            return false;
        }
        C6190 c6190 = (C6190) obj;
        if (this.f21086 == c6190.f21086 && Arrays.equals(this.f21084, c6190.f21084)) {
            return Arrays.equals(this.f21085, c6190.f21085);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f21086 * 31) + Arrays.hashCode(this.f21084)) * 31) + Arrays.hashCode(this.f21085);
    }

    public final Object clone() {
        try {
            C6190 c6190 = (C6190) super.clone();
            c6190.f21086 = this.f21086;
            String[] strArr = this.f21084;
            int i = this.f21086;
            String[] strArr2 = new String[i];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i));
            this.f21084 = strArr2;
            String[] strArr3 = this.f21085;
            int i2 = this.f21086;
            String[] strArr4 = new String[i2];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i2));
            this.f21085 = strArr4;
            return c6190;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
