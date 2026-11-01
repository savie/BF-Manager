package l;

import android.animation.Animator;

/* JADX INFO: renamed from: l.ܶ᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15515 implements InterfaceC22089 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Animator f50525;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16386 f50526;

    public C15515(Animator animator, C16386 c16386) {
        this.f50525 = animator;
        this.f50526 = c16386;
    }

    @Override // l.InterfaceC22089
    /* JADX INFO: renamed from: ۙ */
    public final void mo18972() {
        this.f50525.end();
        if (AbstractC8894.m23060(2)) {
            C13638.toString(this.f50526);
        }
    }
}
