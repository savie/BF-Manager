package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩹ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes.dex */
public final class C22063 extends AbstractC15008 implements InterfaceC6269, InterfaceC6206 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C6540 f71488;

    public C22063(C7952 c7952) {
        super(c7952);
        this.f71488 = new C6540(c7952);
    }

    @Override // l.AbstractC15008
    /* JADX INFO: renamed from: ۙ */
    public final void mo3571(int i, Object obj) {
        C6540 c6540 = this.f71488;
        c6540.f22015 = i;
        ((Consumer) obj).accept(c6540);
    }

    @Override // java.util.Iterator
    public final Object next() {
        int iM35989 = m35989();
        C6540 c6540 = this.f71488;
        c6540.f22015 = iM35989;
        return c6540;
    }
}
