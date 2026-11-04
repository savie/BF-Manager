package l;

import android.graphics.Rect;

/* JADX INFO: renamed from: l.ܽۙۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAMZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17342 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f56448;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f56449;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f56450;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f56451;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m40723() {
        return this.f56450;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m40721() {
        return this.f56451;
    }

    public C17342(Rect rect) {
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        this.f56450 = i;
        this.f56451 = i2;
        this.f56449 = i3;
        this.f56448 = i4;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Rect m40722() {
        return new Rect(this.f56450, this.f56451, this.f56449, this.f56448);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m40724() {
        return this.f56449 - this.f56450;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m40720() {
        return this.f56448 - this.f56451;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Bounds { [");
        sb.append(this.f56450);
        sb.append(',');
        sb.append(this.f56451);
        sb.append(',');
        sb.append(this.f56449);
        sb.append(',');
        return C12669.m31437(this.f56448, "] }", sb);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C17342.class.equals(obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj != null) {
            C17342 c17342 = (C17342) obj;
            return this.f56450 == c17342.f56450 && this.f56451 == c17342.f56451 && this.f56449 == c17342.f56449 && this.f56448 == c17342.f56448;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.window.core.Bounds");
    }

    public final int hashCode() {
        return (((((this.f56450 * 31) + this.f56451) * 31) + this.f56449) * 31) + this.f56448;
    }
}
