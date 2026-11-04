package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩳ᩺᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19415 extends AbstractC0770 implements InterfaceC19963, InterfaceC19597 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1516 f62753;

    @Override // java.util.Iterator
    public final Object next() {
        return Byte.valueOf(nextByte());
    }

    @Override // l.AbstractC0770, java.util.Iterator, l.InterfaceC19597
    public final void forEachRemaining(Consumer consumer) {
        InterfaceC22201 c11012;
        if (consumer instanceof InterfaceC22201) {
            c11012 = (InterfaceC22201) consumer;
        } else {
            C17359.requireNonNull(consumer);
            c11012 = new C11012(consumer);
        }
        forEachRemaining((Object) c11012);
    }

    @Override // l.AbstractC0770
    /* JADX INFO: renamed from: ۙ */
    public final void mo3146(int i, Object obj) {
        ((InterfaceC22201) obj).mo19900(this.f62753.f5289[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19415(C1516 c1516) {
        super(c1516);
        this.f62753 = c1516;
    }

    @Override // l.InterfaceC19963
    public final byte nextByte() {
        return this.f62753.f5289[m3145()];
    }
}
