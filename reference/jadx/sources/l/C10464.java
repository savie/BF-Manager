package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۢ᩺᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10464 extends AbstractC8228 implements InterfaceC17725 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1516 f33307;

    @Override // l.InterfaceC8409
    public /* synthetic */ long getExactSizeIfKnown() {
        return C18105.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C18105.$default$hasCharacteristics(this, i);
    }

    @Override // l.AbstractC8228, l.InterfaceC8409, l.InterfaceC7664
    public final boolean tryAdvance(Consumer consumer) {
        InterfaceC22201 c11012;
        if (consumer instanceof InterfaceC22201) {
            c11012 = (InterfaceC22201) consumer;
        } else {
            C17359.requireNonNull(consumer);
            c11012 = new C11012(consumer);
        }
        return tryAdvance((Object) c11012);
    }

    @Override // l.AbstractC8228, l.InterfaceC8409
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

    @Override // l.InterfaceC8409
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // l.AbstractC8228
    /* JADX INFO: renamed from: ۙ */
    public final void mo22134(int i, Object obj) {
        ((InterfaceC22201) obj).mo19900(this.f33307.f5289[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10464(C1516 c1516) {
        super(c1516);
        this.f33307 = c1516;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10464(C1516 c1516, int i, int i2, boolean z) {
        super(c1516, i, i2, z);
        this.f33307 = c1516;
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return this.f27085 ? 256 : 320;
    }

    @Override // l.AbstractC8228
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC8228 mo22133(int i, int i2, boolean z) {
        return new C10464(this.f33307, i, i2, z);
    }
}
