package l;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: l.ۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3977 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C3977 f13623;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12180 f13624;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f13623 = C20385.f65359;
        } else {
            f13623 = C12180.f39161;
        }
    }

    public C3977(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f13624 = new C20385(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f13624 = new C3231(this, windowInsets);
        } else if (i >= 28) {
            this.f13624 = new C23369(this, windowInsets);
        } else {
            this.f13624 = new C15909(this, windowInsets);
        }
    }

    public C3977() {
        this.f13624 = new C12180(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3977 m12812(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C3977 c3977 = new C3977(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            c3977.m12819(C22666.m51078(view));
            c3977.m12818(view.getRootView());
        }
        return c3977;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m12822() {
        return this.f13624.mo30446().f42407;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m12824() {
        return this.f13624.mo30446().f42408;
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m12814() {
        return this.f13624.mo30446().f42406;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m12825() {
        return this.f13624.mo30446().f42405;
    }

    @Deprecated
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m12834() {
        return !this.f13624.mo30446().equals(C13275.f42404);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m12828() {
        return this.f13624.mo30449();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C3977 m12823() {
        return this.f13624.mo30447();
    }

    @Deprecated
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3977 m12831() {
        return this.f13624.mo30451();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C6279 m12833() {
        return this.f13624.mo30453();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3977 m12815() {
        return this.f13624.mo30441();
    }

    @Deprecated
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C13275 m12830() {
        return this.f13624.mo30450();
    }

    @Deprecated
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C13275 m12826() {
        return this.f13624.mo10578();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3977 m12816(int i, int i2, int i3, int i4) {
        return this.f13624.mo10576(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13275 m12817(int i) {
        return this.f13624.mo30442(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C13275 m12832(int i) {
        return this.f13624.mo30452(i);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m12829() {
        return this.f13624.mo30448(8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3977) {
            return C17359.equals(this.f13624, ((C3977) obj).f13624);
        }
        return false;
    }

    public final int hashCode() {
        C12180 c12180 = this.f13624;
        if (c12180 == null) {
            return 0;
        }
        return c12180.hashCode();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final WindowInsets m12827() {
        C12180 c12180 = this.f13624;
        if (c12180 instanceof C17401) {
            return ((C17401) c12180).f56581;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13275 m12813(C13275 c13275, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, c13275.f42407 - i);
        int iMax2 = Math.max(0, c13275.f42408 - i2);
        int iMax3 = Math.max(0, c13275.f42406 - i3);
        int iMax4 = Math.max(0, c13275.f42405 - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? c13275 : C13275.m32819(iMax, iMax2, iMax3, iMax4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12821(C13275[] c13275Arr) {
        this.f13624.mo30445(c13275Arr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12820(C13275 c13275) {
        this.f13624.mo10577(c13275);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12819(C3977 c3977) {
        this.f13624.mo30444(c3977);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12818(View view) {
        this.f13624.mo30443(view);
    }
}
