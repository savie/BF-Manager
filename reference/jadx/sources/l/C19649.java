package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩴۜܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes5.dex */
public final class C19649 implements InterfaceC12936 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1750 f63295;

    @Override // l.InterfaceC12936
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ String mo16304() {
        return null;
    }

    @Override // l.InterfaceC12936
    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ boolean mo16306() {
        return false;
    }

    public C19649(C1750 c1750) {
        this.f63295 = c1750;
    }

    @Override // l.InterfaceC12936
    public final String getName() {
        return C21576.m49088(R.string.MT_Protector);
    }

    @Override // l.InterfaceC12936
    /* JADX INFO: renamed from: ᩷ */
    public final C11983 mo16307() {
        return this.f63295.f5975;
    }

    @Override // l.InterfaceC12936
    /* JADX INFO: renamed from: ۙ */
    public final void mo16305(Main main) {
        if (!C18978.m44079()) {
            C22673.m51152(R.string.MT_Protector);
            new ViewOnClickListenerC16544(main).m39187();
        } else {
            ViewOnClickListenerC5914.m17159((AbstractActivityC17204) main, true);
        }
    }
}
