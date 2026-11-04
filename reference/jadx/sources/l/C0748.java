package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֡᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes3.dex */
public final class C0748 extends AbstractC21631 implements InterfaceC15224, InterfaceC19597 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19393 f2726;

    @Override // l.AbstractC21631
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3081(int i, Object obj) {
        ((Consumer) obj).accept(this.f2726.f62673[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0748(C19393 c19393) {
        super(c19393);
        this.f2726 = c19393;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f2726.f62673[m49168()];
    }
}
