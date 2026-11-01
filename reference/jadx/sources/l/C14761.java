package l;

import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܳ᩶᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes5.dex */
public final class C14761 extends AbstractViewOnLongClickListenerC22543 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11359 f48277;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C8411 f48278;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f48279;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final View f48280;

    public C14761(Main main, View view, C11359 c11359) {
        super(main, view);
        this.f48280 = view.findViewById(R.id.details);
        this.f48277 = c11359;
    }

    @Override // l.AbstractViewOnLongClickListenerC22543
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2418() {
        return this.f48279;
    }

    @Override // l.AbstractViewOnLongClickListenerC22543
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2419(AbstractC12554 abstractC12554) {
        C14761 c14761 = (C14761) abstractC12554;
        if (!c14761.f48279) {
            return false;
        }
        C11359.m28451(this.f48277, this, c14761);
        return true;
    }

    @Override // l.AbstractViewOnLongClickListenerC22543, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C8411 c8411;
        C11359 c11359 = this.f48277;
        if (c11359.f21343.m31494() || (c8411 = this.f48278) == null || c8411.f29159.mo6560() == null) {
            return false;
        }
        InterfaceC4302 interfaceC4302 = this.f48278.f29159;
        C12665 c12665 = c11359.f21343;
        C13638.requireNonNull(c12665);
        C11359.m28449(this.f48277, this.f73513, interfaceC4302, false, (DialogInterfaceC19356) null, (Runnable) new RunnableC14912(1, c12665), (RunnableC20405) null);
        return true;
    }
}
