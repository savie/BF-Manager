package l;

/* JADX INFO: renamed from: l.ۙ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: B54W */
/* JADX INFO: loaded from: classes3.dex */
public final class C4655 extends C10336 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13829 f16449;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f16450 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f16448 = 0;

    public C4655(C13829 c13829) {
        this.f16449 = c13829;
    }

    @Override // l.C10336, l.InterfaceC15616
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo12847() {
        if (this.f16450) {
            return;
        }
        this.f16450 = true;
        InterfaceC15616 interfaceC15616 = this.f16449.f45641;
        if (interfaceC15616 != null) {
            interfaceC15616.mo12847();
        }
    }

    @Override // l.InterfaceC15616
    public final void onAnimationEnd() {
        int i = this.f16448 + 1;
        this.f16448 = i;
        C13829 c13829 = this.f16449;
        if (i == c13829.f45640.size()) {
            InterfaceC15616 interfaceC15616 = c13829.f45641;
            if (interfaceC15616 != null) {
                interfaceC15616.onAnimationEnd();
            }
            this.f16448 = 0;
            this.f16450 = false;
            c13829.m33657();
        }
    }
}
