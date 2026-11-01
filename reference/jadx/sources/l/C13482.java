package l;

import android.view.View;

/* JADX INFO: renamed from: l.ܰ֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4LB */
/* JADX INFO: loaded from: classes4.dex */
public class C13482 implements InterfaceC5657 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ComponentCallbacksC22654 f44567;

    public C13482(ComponentCallbacksC22654 componentCallbacksC22654) {
        this.f44567 = componentCallbacksC22654;
    }

    @Override // l.InterfaceC5657
    /* JADX INFO: renamed from: ۙ */
    public final void mo4164(InterfaceC1423 interfaceC1423, EnumC1651 enumC1651) {
        View view;
        if (enumC1651 != EnumC1651.ON_STOP || (view = this.f44567.mView) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}
