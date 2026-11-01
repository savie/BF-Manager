package l;

import android.graphics.Rect;

/* JADX INFO: renamed from: l.᩹ۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAML */
/* JADX INFO: loaded from: classes.dex */
public final class C22265 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8653 f72771;

    public C22265(Rect rect) {
        this.f72771 = new C8653(rect);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Rect m49432() {
        return this.f72771.m22455();
    }

    public final String toString() {
        return "WindowMetrics { bounds: " + this.f72771.m22455() + " }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C22265.class.equals(obj.getClass())) {
            return false;
        }
        return C13465.m32965(this.f72771, ((C22265) obj).f72771);
    }

    public final int hashCode() {
        return this.f72771.hashCode();
    }
}
