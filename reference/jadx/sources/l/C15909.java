package l;

import android.view.WindowInsets;

/* JADX INFO: renamed from: l.ܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes5.dex */
public class C15909 extends C17401 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C13275 f51680;

    public C15909(C3977 c3977, WindowInsets windowInsets) {
        super(c3977, windowInsets);
        this.f51680 = null;
    }

    @Override // l.C12180
    /* JADX INFO: renamed from: ۧ */
    public boolean mo30449() {
        return this.f56581.isConsumed();
    }

    @Override // l.C12180
    /* JADX INFO: renamed from: ᩷ */
    public C3977 mo30451() {
        return C3977.m12812(null, this.f56581.consumeStableInsets());
    }

    @Override // l.C12180
    /* JADX INFO: renamed from: ۤ */
    public C3977 mo30447() {
        return C3977.m12812(null, this.f56581.consumeSystemWindowInsets());
    }

    @Override // l.C12180
    /* JADX INFO: renamed from: ܳ */
    public final C13275 mo30450() {
        if (this.f51680 == null) {
            WindowInsets windowInsets = this.f56581;
            this.f51680 = C13275.m32819(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f51680;
    }

    @Override // l.C12180
    /* JADX INFO: renamed from: ۙ */
    public void mo10577(C13275 c13275) {
        this.f51680 = c13275;
    }
}
