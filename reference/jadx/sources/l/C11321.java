package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۧۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11321 extends AbstractC12067 implements InterfaceC2546 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3864 f35676;

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

    @Override // l.AbstractC12067
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo28612(int i, Object obj) {
        ((Consumer) obj).accept(new C23256(this.f35676, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11321(C3864 c3864) {
        super(c3864);
        this.f35676 = c3864;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11321(C3864 c3864, int i, int i2, boolean z) {
        super(c3864, i, i2, z);
        this.f35676 = c3864;
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return this.f38864 ? 1 : 65;
    }

    @Override // l.AbstractC12067
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC12067 mo28611(int i, int i2, boolean z) {
        return new C11321(this.f35676, i, i2, z);
    }
}
