package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۧۡ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes4.dex */
public final class C11517 extends AbstractC12263 implements InterfaceC2546 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4060 f36239;

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

    @Override // l.AbstractC12263
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo28978(int i, Object obj) {
        ((Consumer) obj).accept(new C23452(this.f36239, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11517(C4060 c4060) {
        super(c4060);
        this.f36239 = c4060;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11517(C4060 c4060, int i, int i2, boolean z) {
        super(c4060, i, i2, z);
        this.f36239 = c4060;
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return this.f39440 ? 1 : 65;
    }

    @Override // l.AbstractC12263
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC12263 mo28977(int i, int i2, boolean z) {
        return new C11517(this.f36239, i, i2, z);
    }
}
