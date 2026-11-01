package l;

import android.view.WindowInsets;

/* JADX INFO: renamed from: l.ᩴۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes5.dex */
public class C18665 extends C17959 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C13954 f60589;

    public C18665(C15844 c15844, WindowInsets windowInsets) {
        super(c15844, windowInsets);
        this.f60589 = null;
    }

    @Override // l.C10199
    /* JADX INFO: renamed from: ۜ */
    public boolean mo25980() {
        return this.f57445.isConsumed();
    }

    @Override // l.C10199
    /* JADX INFO: renamed from: ܰ */
    public C15844 mo25983() {
        return C15844.m37669(null, this.f57445.consumeStableInsets());
    }

    @Override // l.C10199
    /* JADX INFO: renamed from: ۨ */
    public C15844 mo25981() {
        return C15844.m37669(null, this.f57445.consumeSystemWindowInsets());
    }

    @Override // l.C10199
    /* JADX INFO: renamed from: ᩹ */
    public final C13954 mo25984() {
        if (this.f60589 == null) {
            WindowInsets windowInsets = this.f57445;
            this.f60589 = C13954.m33793(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f60589;
    }

    @Override // l.C10199
    /* JADX INFO: renamed from: ۙ */
    public void mo25976(C13954 c13954) {
        this.f60589 = c13954;
    }
}
