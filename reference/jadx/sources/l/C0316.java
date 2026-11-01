package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.֡ۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F7SA */
/* JADX INFO: loaded from: classes2.dex */
public final class C0316 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f1683;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f1684;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f1685;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f1686;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0316 m1947(int i, int i2, int i3, int i4) {
        return new C0316(i, i2, i3, i4);
    }

    public C0316(int i, int i2, int i3, int i4) {
        if (i < 0) {
            throw new IllegalArgumentException(C2271.m6966(i, "lineIndex ", " must be >= 0"));
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(C2271.m6966(i2, "columnIndex ", " must be >= 0"));
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(C2271.m6966(i3, "inputIndex ", " must be >= 0"));
        }
        if (i4 < 0) {
            throw new IllegalArgumentException(C2271.m6966(i4, "length ", " must be >= 0"));
        }
        this.f1683 = i;
        this.f1684 = i2;
        this.f1686 = i3;
        this.f1685 = i4;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m1948() {
        return this.f1683;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m1949() {
        return this.f1684;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m1953() {
        return this.f1686;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m1952() {
        return this.f1685;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0316 m1950(int i) {
        return m1951(i, this.f1685);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0316 m1951(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(C2271.m6966(i, "beginIndex ", " + must be >= 0"));
        }
        int i3 = this.f1685;
        if (i > i3) {
            throw new IndexOutOfBoundsException(C2271.m6967("beginIndex ", i, i3, " must be <= length "));
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(C2271.m6966(i2, "endIndex ", " + must be >= 0"));
        }
        if (i2 > i3) {
            throw new IndexOutOfBoundsException(C2271.m6967("endIndex ", i2, i3, " must be <= length "));
        }
        if (i > i2) {
            throw new IndexOutOfBoundsException(C2271.m6967("beginIndex ", i, i2, " must be <= endIndex "));
        }
        if (i == 0 && i2 == i3) {
            return this;
        }
        return new C0316(this.f1683, this.f1684 + i, this.f1686 + i, i2 - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0316.class == obj.getClass()) {
            C0316 c0316 = (C0316) obj;
            if (this.f1683 == c0316.f1683 && this.f1684 == c0316.f1684 && this.f1686 == c0316.f1686 && this.f1685 == c0316.f1685) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C13638.hash(Integer.valueOf(this.f1683), Integer.valueOf(this.f1684), Integer.valueOf(this.f1686), Integer.valueOf(this.f1685));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SourceSpan{line=");
        sb.append(this.f1683);
        sb.append(", column=");
        sb.append(this.f1684);
        sb.append(", input=");
        sb.append(this.f1686);
        sb.append(", length=");
        return C12441.m30911(this.f1685, l.d, sb);
    }
}
