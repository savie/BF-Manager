package l;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: l.᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20385 extends C3231 {

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final C3977 f65359 = C3977.m12812(null, WindowInsets.CONSUMED);

    @Override // l.C17401, l.C12180
    /* JADX INFO: renamed from: ۙ */
    public final void mo30443(View view) {
    }

    public C20385(C3977 c3977, WindowInsets windowInsets) {
        super(c3977, windowInsets);
    }

    @Override // l.C17401, l.C12180
    /* JADX INFO: renamed from: ۙ */
    public C13275 mo30442(int i) {
        return C13275.m32820(this.f56581.getInsets(C24115.m53667(i)));
    }

    @Override // l.C17401, l.C12180
    /* JADX INFO: renamed from: ᩷ */
    public C13275 mo30452(int i) {
        return C13275.m32820(this.f56581.getInsetsIgnoringVisibility(C24115.m53667(i)));
    }

    @Override // l.C17401, l.C12180
    /* JADX INFO: renamed from: ۤ */
    public boolean mo30448(int i) {
        return this.f56581.isVisible(C24115.m53667(i));
    }
}
