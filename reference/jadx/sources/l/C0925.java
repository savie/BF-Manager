package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֨ۘ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0925 extends AbstractC10924 implements InterfaceC2546 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15399 f3445;

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

    @Override // l.AbstractC10924
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3733(int i, Object obj) {
        ((Consumer) obj).accept(new C13602(this.f3445, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0925(C15399 c15399) {
        super(c15399);
        this.f3445 = c15399;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0925(C15399 c15399, int i, int i2, boolean z) {
        super(c15399, i, i2, z);
        this.f3445 = c15399;
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return this.f34584 ? 1 : 65;
    }

    @Override // l.AbstractC10924
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC10924 mo3732(int i, int i2, boolean z) {
        return new C0925(this.f3445, i, i2, z);
    }
}
