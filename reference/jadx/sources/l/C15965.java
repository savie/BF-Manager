package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܺ۬᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 969A */
/* JADX INFO: loaded from: classes4.dex */
public final class C15965 extends AbstractC11026 {
    @Override // l.AbstractC11026
    /* JADX INFO: renamed from: ۙ */
    public final void mo2267(C11545 c11545) {
        DialogInterfaceOnClickListenerC14147.m34220(R.string.MT_Protector, c11545.m28824(), "sel_all");
        c11545.m28761();
    }

    @Override // l.AbstractC11026
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo6292() {
        return ApplicationC0716.f2992.getInt("swipe_select_count", 0) < 3;
    }
}
