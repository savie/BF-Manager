package l;

import java.util.List;

/* JADX INFO: renamed from: l.ܶ᩺ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8N9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15545 implements InterfaceC10045 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10045 f50594;

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC10045 mo2755() {
        return this;
    }

    public C15545(int i) {
        if ((i & 1) != 0) {
            this.f50594 = new C15067(65496, 2, "image/jpeg");
        } else {
            this.f50594 = new C21894();
        }
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2754(InterfaceC7222 interfaceC7222) {
        return this.f50594.mo2754(interfaceC7222);
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2753(InterfaceC15690 interfaceC15690) {
        this.f50594.mo2753(interfaceC15690);
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ᩹ */
    public final List mo2756() {
        return AbstractC22433.of();
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final int mo2750(InterfaceC7222 interfaceC7222, C0954 c0954) {
        return this.f50594.mo2750(interfaceC7222, c0954);
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2752(long j, long j2) {
        this.f50594.mo2752(j, j2);
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2751() {
        this.f50594.mo2751();
    }
}
