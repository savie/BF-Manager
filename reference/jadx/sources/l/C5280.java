package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۚ֡ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: F7SA */
/* JADX INFO: loaded from: classes2.dex */
public final class C5280 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f18591;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f18592;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f18593;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f18594;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5280 m15866(int i, int i2, int i3, int i4) {
        return new C5280(i, i2, i3, i4);
    }

    public C5280(int i, int i2, int i3, int i4) {
        if (i < 0) {
            throw new IllegalArgumentException(C14442.m34864(i, "lineIndex ", " must be >= 0"));
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(C14442.m34864(i2, "columnIndex ", " must be >= 0"));
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(C14442.m34864(i3, "inputIndex ", " must be >= 0"));
        }
        if (i4 < 0) {
            throw new IllegalArgumentException(C14442.m34864(i4, "length ", " must be >= 0"));
        }
        this.f18594 = i;
        this.f18591 = i2;
        this.f18593 = i3;
        this.f18592 = i4;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m15872() {
        return this.f18594;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m15867() {
        return this.f18591;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m15871() {
        return this.f18593;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m15870() {
        return this.f18592;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5280 m15868(int i) {
        return m15869(i, this.f18592);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5280 m15869(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(C14442.m34864(i, "beginIndex ", " + must be >= 0"));
        }
        int i3 = this.f18592;
        if (i > i3) {
            throw new IndexOutOfBoundsException(C6934.m19217("beginIndex ", i, i3, " must be <= length "));
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(C14442.m34864(i2, "endIndex ", " + must be >= 0"));
        }
        if (i2 > i3) {
            throw new IndexOutOfBoundsException(C6934.m19217("endIndex ", i2, i3, " must be <= length "));
        }
        if (i > i2) {
            throw new IndexOutOfBoundsException(C6934.m19217("beginIndex ", i, i2, " must be <= endIndex "));
        }
        if (i == 0 && i2 == i3) {
            return this;
        }
        return new C5280(this.f18594, this.f18591 + i, this.f18593 + i, i2 - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5280.class == obj.getClass()) {
            C5280 c5280 = (C5280) obj;
            if (this.f18594 == c5280.f18594 && this.f18591 == c5280.f18591 && this.f18593 == c5280.f18593 && this.f18592 == c5280.f18592) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C17359.hash(Integer.valueOf(this.f18594), Integer.valueOf(this.f18591), Integer.valueOf(this.f18593), Integer.valueOf(this.f18592));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SourceSpan{line=");
        sb.append(this.f18594);
        sb.append(", column=");
        sb.append(this.f18591);
        sb.append(", input=");
        sb.append(this.f18593);
        sb.append(", length=");
        return C12669.m31437(this.f18592, l.d, sb);
    }
}
