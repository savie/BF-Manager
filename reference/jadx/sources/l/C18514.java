package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩴۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes5.dex */
public final class C18514 extends AbstractC21336 implements InterfaceC7371 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7931 f58965;

    @Override // l.InterfaceC20693
    public /* synthetic */ Comparator getComparator() {
        return C21398.$default$getComparator(this);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ long getExactSizeIfKnown() {
        return C21398.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C21398.$default$hasCharacteristics(this, i);
    }

    @Override // l.AbstractC21336
    /* JADX INFO: renamed from: ۙ */
    public final void mo10865(int i, Object obj) {
        ((Consumer) obj).accept(this.f58965.f26047[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18514(C7931 c7931) {
        super(c7931);
        this.f58965 = c7931;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18514(C7931 c7931, int i, int i2, boolean z) {
        super(c7931, i, i2, z);
        this.f58965 = c7931;
    }

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return this.f69445 ? 0 : 64;
    }

    @Override // l.AbstractC21336
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC21336 mo10864(int i, int i2, boolean z) {
        return new C18514(this.f58965, i, i2, z);
    }
}
