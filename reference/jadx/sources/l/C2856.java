package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C2856 implements InterfaceC22491 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C24354 f9429;

    public C2856(LayoutInflaterFactory2C24354 layoutInflaterFactory2C24354) {
        this.f9429 = layoutInflaterFactory2C24354;
    }

    @Override // l.InterfaceC22491
    public final C3977 onApplyWindowInsets(View view, C3977 c3977) {
        int iM12824 = c3977.m12824();
        int iM54411 = this.f9429.m54411(c3977);
        if (iM12824 != iM54411) {
            int iM12822 = c3977.m12822();
            int iM12814 = c3977.m12814();
            int iM12825 = c3977.m12825();
            C15163 c15163 = new C15163(c3977);
            c15163.m36480(C13275.m32819(iM12822, iM54411, iM12814, iM12825));
            c3977 = c15163.m36477();
        }
        return C22666.m51118(view, c3977);
    }
}
