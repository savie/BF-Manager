package l;

import android.graphics.Rect;

/* JADX INFO: renamed from: l.ۙۤۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAML */
/* JADX INFO: loaded from: classes2.dex */
public final class C4838 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17342 f16898;

    public C4838(Rect rect) {
        this.f16898 = new C17342(rect);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Rect m14868() {
        return this.f16898.m40722();
    }

    public final String toString() {
        return "WindowMetrics { bounds: " + this.f16898.m40722() + " }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C4838.class.equals(obj.getClass())) {
            return false;
        }
        return C15243.m36589(this.f16898, ((C4838) obj).f16898);
    }

    public final int hashCode() {
        return this.f16898.hashCode();
    }
}
