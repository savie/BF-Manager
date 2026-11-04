package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۨۘ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes4.dex */
public final class C12111 extends AbstractC3162 implements InterfaceC9367, InterfaceC19597 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24046 f38970;

    @Override // l.AbstractC3162, java.util.Iterator, l.InterfaceC19597
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C1165.m4306(this, consumer);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return Float.valueOf(nextFloat());
    }

    @Override // l.AbstractC3162
    /* JADX INFO: renamed from: ۙ */
    public final void mo10343(int i, Object obj) {
        ((InterfaceC0419) obj).mo2223(this.f38970.f77775[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12111(C24046 c24046) {
        super(c24046);
        this.f38970 = c24046;
    }

    @Override // l.InterfaceC9367
    public final float nextFloat() {
        return this.f38970.f77775[m10342()];
    }
}
