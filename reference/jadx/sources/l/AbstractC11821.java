package l;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.ۧᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J6E6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11821 implements InterfaceC14892 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f38148 = new ArrayDeque();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo2799(C2551 c2551, InterfaceC23435 interfaceC23435, InterfaceC18213 interfaceC18213);

    @Override // l.InterfaceC14892
    /* JADX INFO: renamed from: ۤ */
    public boolean mo7323(C2551 c2551, InterfaceC18213 interfaceC18213) {
        this.f38148.push(interfaceC18213);
        return true;
    }

    @Override // l.InterfaceC14892
    /* JADX INFO: renamed from: ۙ */
    public final void mo18704(C2551 c2551, InterfaceC23435 interfaceC23435) {
        InterfaceC18213 interfaceC18213 = (InterfaceC18213) this.f38148.peek();
        C17359.requireNonNull(interfaceC18213);
        mo2799(c2551, interfaceC23435, interfaceC18213);
    }

    @Override // l.InterfaceC14892
    /* JADX INFO: renamed from: ᩷ */
    public final void mo13866(C2551 c2551, InterfaceC18213 interfaceC18213) {
        this.f38148.pop();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque m29668() {
        return this.f38148;
    }
}
