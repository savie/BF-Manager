package l;

import android.graphics.Rect;

/* JADX INFO: renamed from: l.ۡۙۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAMZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8653 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f29829;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f29830;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f29831;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f29832;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m22457() {
        return this.f29832;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m22456() {
        return this.f29829;
    }

    public C8653(Rect rect) {
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        this.f29832 = i;
        this.f29829 = i2;
        this.f29831 = i3;
        this.f29830 = i4;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Rect m22455() {
        return new Rect(this.f29832, this.f29829, this.f29831, this.f29830);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m22453() {
        return this.f29831 - this.f29832;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m22454() {
        return this.f29830 - this.f29829;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Bounds { [");
        sb.append(this.f29832);
        sb.append(',');
        sb.append(this.f29829);
        sb.append(',');
        sb.append(this.f29831);
        sb.append(',');
        return C12441.m30911(this.f29830, "] }", sb);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C8653.class.equals(obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj != null) {
            C8653 c8653 = (C8653) obj;
            return this.f29832 == c8653.f29832 && this.f29829 == c8653.f29829 && this.f29831 == c8653.f29831 && this.f29830 == c8653.f29830;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.window.core.Bounds");
    }

    public final int hashCode() {
        return (((((this.f29832 * 31) + this.f29829) * 31) + this.f29831) * 31) + this.f29830;
    }
}
