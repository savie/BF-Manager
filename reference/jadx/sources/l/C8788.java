package l;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: l.ۡۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8788 extends C19371 {

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final C15844 f30210 = C15844.m37669(null, WindowInsets.CONSUMED);

    @Override // l.C17959, l.C10199
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo22859(View view) {
    }

    public C8788(C15844 c15844, WindowInsets windowInsets) {
        super(c15844, windowInsets);
    }

    @Override // l.C17959, l.C10199
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13954 mo22858(int i) {
        return C13954.m33794(this.f57445.getInsets(C20782.m46772(i)));
    }

    @Override // l.C17959, l.C10199
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C13954 mo22861(int i) {
        return C13954.m33794(this.f57445.getInsetsIgnoringVisibility(C20782.m46772(i)));
    }

    @Override // l.C17959, l.C10199
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean mo22860(int i) {
        return this.f57445.isVisible(C20782.m46772(i));
    }
}
