package l;

import com.google.android.material.badge.BadgeDrawable;

/* JADX INFO: renamed from: l.ۜ֨᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes3.dex */
public final class C6439 implements InterfaceC20592 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Class f21787;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Class f21788;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC7186 f21789;

    public C6439(Class cls, Class cls2, AbstractC7186 abstractC7186) {
        this.f21787 = cls;
        this.f21788 = cls2;
        this.f21789 = abstractC7186;
    }

    @Override // l.InterfaceC20592
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7186 mo5183(C6044 c6044, C11730 c11730) {
        Class clsM29316 = c11730.m29316();
        if (clsM29316 == this.f21787 || clsM29316 == this.f21788) {
            return this.f21789;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f21788.getName() + BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX + this.f21787.getName() + ",adapter=" + this.f21789 + "]";
    }
}
