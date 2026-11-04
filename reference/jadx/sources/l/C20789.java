package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩵᩵ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 969A */
/* JADX INFO: loaded from: classes5.dex */
public final class C20789 extends AbstractC18551 {
    @Override // l.AbstractC18551
    /* JADX INFO: renamed from: ۙ */
    public final void mo3178(C8614 c8614) {
        DialogInterfaceOnClickListenerC12983.m32394(R.string.MT_Protector, c8614.m23233(), "sel_all");
        c8614.m23206();
    }

    @Override // l.AbstractC18551
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo3179() {
        return ApplicationC17729.f58258.getInt("swipe_select_count", 0) < 3;
    }
}
