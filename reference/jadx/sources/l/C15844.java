package l;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: l.ܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15844 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C15844 f51279;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10199 f51280;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f51279 = C8788.f30210;
        } else {
            f51279 = C10199.f34836;
        }
    }

    public C15844(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f51280 = new C8788(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f51280 = new C19371(this, windowInsets);
        } else if (i >= 28) {
            this.f51280 = new C8082(this, windowInsets);
        } else {
            this.f51280 = new C18665(this, windowInsets);
        }
    }

    public C15844() {
        this.f51280 = new C10199(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15844 m37669(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C15844 c15844 = new C15844(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            c15844.m37678(C5031.m13974(view));
            c15844.m37676(view.getRootView());
        }
        return c15844;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m37683() {
        return this.f51280.mo25982().f45915;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m37681() {
        return this.f51280.mo25982().f45912;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m37672() {
        return this.f51280.mo25982().f45914;
    }

    @Deprecated
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m37670() {
        return this.f51280.mo25982().f45913;
    }

    @Deprecated
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m37690() {
        return !this.f51280.mo25982().equals(C13954.f45911);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m37686() {
        return this.f51280.mo25980();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C15844 m37682() {
        return this.f51280.mo25981();
    }

    @Deprecated
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C15844 m37685() {
        return this.f51280.mo25983();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C9203 m37671() {
        return this.f51280.mo21289();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15844 m37674() {
        return this.f51280.mo21290();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C13954 m37680() {
        return this.f51280.mo25984();
    }

    @Deprecated
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C13954 m37689() {
        return this.f51280.mo25973();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15844 m37675(int i, int i2, int i3, int i4) {
        return this.f51280.mo25975(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13954 m37673(int i) {
        return this.f51280.mo22858(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13954 m37684(int i) {
        return this.f51280.mo22861(i);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m37688() {
        return this.f51280.mo22860(8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15844) {
            return C13638.equals(this.f51280, ((C15844) obj).f51280);
        }
        return false;
    }

    public final int hashCode() {
        C10199 c10199 = this.f51280;
        if (c10199 == null) {
            return 0;
        }
        return c10199.hashCode();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final WindowInsets m37687() {
        C10199 c10199 = this.f51280;
        if (c10199 instanceof C17959) {
            return ((C17959) c10199).f57445;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13954 m37668(C13954 c13954, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, c13954.f45915 - i);
        int iMax2 = Math.max(0, c13954.f45912 - i2);
        int iMax3 = Math.max(0, c13954.f45914 - i3);
        int iMax4 = Math.max(0, c13954.f45913 - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? c13954 : C13954.m33793(iMax, iMax2, iMax3, iMax4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37679(C13954[] c13954Arr) {
        this.f51280.mo25978(c13954Arr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37677(C13954 c13954) {
        this.f51280.mo25976(c13954);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37678(C15844 c15844) {
        this.f51280.mo25977(c15844);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37676(View view) {
        this.f51280.mo22859(view);
    }
}
