package l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۢۢܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9506 implements InterfaceC1264 {
    @Override // l.InterfaceC1264
    /* JADX INFO: renamed from: ۙ */
    public final void mo4587(View view) {
    }

    @Override // l.InterfaceC1264
    /* JADX INFO: renamed from: ܰ */
    public final void mo4588(View view) {
        C22432 c22432 = (C22432) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) c22432).width != -1 || ((ViewGroup.MarginLayoutParams) c22432).height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }
}
