package l;

import android.animation.ObjectAnimator;

/* JADX INFO: renamed from: l.֡ᩴ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes2.dex */
public final class C0606 implements InterfaceC5673 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8765 f2619;

    @Override // l.InterfaceC5673
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo2812(String str) {
    }

    public C0606(C8765 c8765) {
        this.f2619 = c8765;
    }

    @Override // l.InterfaceC5673
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2810(String str) {
        C8765.m22780(this.f2619, str);
    }

    @Override // l.InterfaceC5673
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2811(EnumC22607 enumC22607) {
        boolean zM50113 = enumC22607.m50113();
        C8765 c8765 = this.f2619;
        if (zM50113 && c8765.f30145.m48992() == 1.0f) {
            C19348 c19348 = new C19348(c8765.f30148, c8765.f30152, c8765.f30139);
            c19348.setAlpha(0.0f);
            ObjectAnimator.ofFloat(c19348, "alpha", 0.0f, 1.0f).setDuration(200L).start();
        }
        c8765.m22785(enumC22607.m50115());
    }
}
