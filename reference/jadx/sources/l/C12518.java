package l;

import android.animation.ObjectAnimator;

/* JADX INFO: renamed from: l.ۨܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes4.dex */
public final class C12518 implements InterfaceC2833 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16468 f40183;

    @Override // l.InterfaceC2833
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ void mo8155(String str) {
    }

    public C12518(C16468 c16468) {
        this.f40183 = c16468;
    }

    @Override // l.InterfaceC2833
    /* JADX INFO: renamed from: ۙ */
    public final void mo8153(String str) {
        C16468.m39021(this.f40183, str);
    }

    @Override // l.InterfaceC2833
    /* JADX INFO: renamed from: ۙ */
    public final void mo8154(EnumC8799 enumC8799) {
        boolean zM23627 = enumC8799.m23627();
        C16468 c16468 = this.f40183;
        if (zM23627 && c16468.f53407.m19782() == 1.0f) {
            C24674 c24674 = new C24674(c16468.f53386, c16468.f53406, c16468.f53388);
            c24674.setAlpha(0.0f);
            ObjectAnimator.ofFloat(c24674, "alpha", 0.0f, 1.0f).setDuration(200L).start();
        }
        c16468.m39026(enumC8799.m23629());
    }
}
