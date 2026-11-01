package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֨֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes3.dex */
public final class C0792 extends AbstractC5026 implements InterfaceC10007, InterfaceC6206 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3614 f3381;

    @Override // l.AbstractC5026, java.util.Iterator, l.InterfaceC6206
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C8596.m22379(this, consumer);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return Float.valueOf(nextFloat());
    }

    @Override // l.AbstractC5026
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3343(int i, Object obj) {
        ((InterfaceC17767) obj).mo35707(this.f3381.f13289[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0792(C3614 c3614) {
        super(c3614);
        this.f3381 = c3614;
    }

    @Override // l.InterfaceC10007
    public final float nextFloat() {
        return this.f3381.f13289[m13969()];
    }
}
