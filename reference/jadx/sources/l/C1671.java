package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֫ۘ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes3.dex */
public final class C1671 extends AbstractC20316 implements InterfaceC2546 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24046 f5774;

    @Override // l.InterfaceC8409
    public /* synthetic */ Comparator getComparator() {
        return C18105.$default$getComparator(this);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ long getExactSizeIfKnown() {
        return C18105.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C18105.$default$hasCharacteristics(this, i);
    }

    @Override // l.AbstractC20316
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6003(int i, Object obj) {
        ((Consumer) obj).accept(new C15840(this.f5774, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1671(C24046 c24046) {
        super(c24046);
        this.f5774 = c24046;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1671(C24046 c24046, int i, int i2, boolean z) {
        super(c24046, i, i2, z);
        this.f5774 = c24046;
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return this.f65200 ? 1 : 65;
    }

    @Override // l.AbstractC20316
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20316 mo6002(int i, int i2, boolean z) {
        return new C1671(this.f5774, i, i2, z);
    }
}
