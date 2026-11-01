package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩳۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes5.dex */
public final class C17829 extends AbstractC15008 implements InterfaceC6269, InterfaceC6206 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7952 f56465;

    @Override // l.AbstractC15008
    /* JADX INFO: renamed from: ۙ */
    public final void mo3571(int i, Object obj) {
        ((Consumer) obj).accept(this.f56465.f26116[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17829(C7952 c7952) {
        super(c7952);
        this.f56465 = c7952;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f56465.f26116[m35989()];
    }
}
