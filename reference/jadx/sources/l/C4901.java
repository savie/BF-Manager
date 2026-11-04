package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۙ۫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4LB */
/* JADX INFO: loaded from: classes3.dex */
public final class C4901 implements InterfaceC5252 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ComponentCallbacksC11612 f17123;

    public C4901(ComponentCallbacksC11612 componentCallbacksC11612) {
        this.f17123 = componentCallbacksC11612;
    }

    @Override // l.InterfaceC5252
    /* JADX INFO: renamed from: ۙ */
    public final void mo2183(InterfaceC11217 interfaceC11217, EnumC9330 enumC9330) {
        View view;
        if (enumC9330 != EnumC9330.ON_STOP || (view = this.f17123.mView) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}
