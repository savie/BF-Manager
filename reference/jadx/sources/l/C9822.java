package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۢ᩶᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C9822 implements InterfaceC4302 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11359 f33571;

    @Override // l.InterfaceC4302
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ String mo6560() {
        return null;
    }

    @Override // l.InterfaceC4302
    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ boolean mo6562() {
        return false;
    }

    public C9822(C11359 c11359) {
        this.f33571 = c11359;
    }

    @Override // l.InterfaceC4302
    public final String getName() {
        return C16737.m39288(R.string.MT_Protector);
    }

    @Override // l.InterfaceC4302
    /* JADX INFO: renamed from: ܰ */
    public final C14600 mo6563() {
        return this.f33571.f38319;
    }

    @Override // l.InterfaceC4302
    /* JADX INFO: renamed from: ۙ */
    public final void mo6561(Main main) {
        if (!C1709.m5692()) {
            C15829.m37611(R.string.MT_Protector);
            new ViewOnClickListenerC19680(main).m44817();
        } else {
            ViewOnClickListenerC13209.m32681((AbstractActivityC12483) main, true);
        }
    }
}
