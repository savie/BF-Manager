package l;

import android.view.View;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.۠᩶᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C8411 extends AbstractViewOnClickListenerC10549 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11359 f29158;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4302 f29159;

    @Override // l.AbstractC14389
    /* JADX INFO: renamed from: ܰ */
    public final int mo13629() {
        return 4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8411(C11359 c11359, Main main, InterfaceC4302 interfaceC4302) {
        super(main);
        this.f29158 = c11359;
        this.f29159 = interfaceC4302;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f29158.f21343.m31494() || AbstractViewOnClickListenerC10549.f36130.m50803()) {
            return;
        }
        this.f29159.mo6561(this.f47137);
    }
}
