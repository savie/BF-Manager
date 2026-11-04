package l;

import android.view.View;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.᩶۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes5.dex */
public final class C21184 extends AbstractViewOnClickListenerC21206 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC12936 f67652;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1750 f67653;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ InterfaceC12936 m48333(C21184 c21184) {
        return c21184.f67652;
    }

    @Override // l.AbstractC6796
    /* JADX INFO: renamed from: ᩷ */
    public final int mo3322() {
        return 4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21184(C1750 c1750, Main main, InterfaceC12936 interfaceC12936) {
        super(main);
        this.f67653 = c1750;
        this.f67652 = interfaceC12936;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f67653.f27860.m24482() || AbstractViewOnClickListenerC21206.f67690.m55200()) {
            return;
        }
        this.f67652.mo16305(this.f22654);
    }
}
