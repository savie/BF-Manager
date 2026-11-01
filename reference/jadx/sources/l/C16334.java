package l;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܽ֫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: D2QB */
/* JADX INFO: loaded from: classes4.dex */
public final class C16334 implements Serializable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f52619 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C16334 f52620 = new C16334(new int[0]);

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int[] f52621;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f52622;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38508(int[] iArr) {
        if (iArr.length == 0) {
            return;
        }
        new C16334(Arrays.copyOf(iArr, iArr.length));
    }

    public C16334(int[] iArr) {
        int length = iArr.length;
        this.f52621 = iArr;
        this.f52622 = length;
    }

    public Object readResolve() {
        return this.f52622 == 0 ? f52620 : this;
    }

    public final String toString() {
        int i = this.f52622;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.f52621;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        C16334 c16334;
        int i;
        int i2;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C16334) && (i2 = this.f52622) == (i = (c16334 = (C16334) obj).f52622)) {
            for (int i3 = 0; i3 < i2; i3++) {
                C18304.m42510(i3, i2);
                int i4 = this.f52621[i3];
                C18304.m42510(i3, i);
                if (i4 == c16334.f52621[i3]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f52622; i2++) {
            i = (i * 31) + this.f52621[i2];
        }
        return i;
    }

    public Object writeReplace() {
        int[] iArr = this.f52621;
        int length = iArr.length;
        int i = this.f52622;
        return i < length ? new C16334(Arrays.copyOfRange(iArr, 0, i)) : this;
    }
}
