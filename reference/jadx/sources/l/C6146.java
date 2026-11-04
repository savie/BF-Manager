package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۛۘ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes3.dex */
public final class C6146 extends AbstractC20316 implements InterfaceC15906 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24046 f20972;

    @Override // l.AbstractC20316, l.InterfaceC8409
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C17398.m40861(this, consumer);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ long getExactSizeIfKnown() {
        return C18105.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C18105.$default$hasCharacteristics(this, i);
    }

    @Override // l.AbstractC20316, l.InterfaceC8409, l.InterfaceC7664
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C17398.m40862(this, consumer);
    }

    @Override // l.InterfaceC8409
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // l.AbstractC20316
    /* JADX INFO: renamed from: ۙ */
    public final void mo6003(int i, Object obj) {
        ((InterfaceC0419) obj).mo2223(this.f20972.f77775[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6146(C24046 c24046) {
        super(c24046);
        this.f20972 = c24046;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6146(C24046 c24046, int i, int i2, boolean z) {
        super(c24046, i, i2, z);
        this.f20972 = c24046;
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return this.f65200 ? 256 : 320;
    }

    @Override // l.AbstractC20316
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC20316 mo6002(int i, int i2, boolean z) {
        return new C6146(this.f20972, i, i2, z);
    }
}
