package l;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܰܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: D2QB */
/* JADX INFO: loaded from: classes4.dex */
public final class C14714 implements Serializable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C14714 f48075 = new C14714(new int[0]);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f48076 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int[] f48077;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f48078;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35383(int[] iArr) {
        if (iArr.length == 0) {
            return;
        }
        new C14714(Arrays.copyOf(iArr, iArr.length));
    }

    public C14714(int[] iArr) {
        int length = iArr.length;
        this.f48077 = iArr;
        this.f48078 = length;
    }

    public Object readResolve() {
        return this.f48078 == 0 ? f48075 : this;
    }

    public final String toString() {
        int i = this.f48078;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.f48077;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        C14714 c14714;
        int i;
        int i2;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C14714) && (i2 = this.f48078) == (i = (c14714 = (C14714) obj).f48078)) {
            for (int i3 = 0; i3 < i2; i3++) {
                C12128.m30302(i3, i2);
                int i4 = this.f48077[i3];
                C12128.m30302(i3, i);
                if (i4 == c14714.f48077[i3]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f48078; i2++) {
            i = (i * 31) + this.f48077[i2];
        }
        return i;
    }

    public Object writeReplace() {
        int[] iArr = this.f48077;
        int length = iArr.length;
        int i = this.f48078;
        return i < length ? new C14714(Arrays.copyOfRange(iArr, 0, i)) : this;
    }
}
