package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۟᩶᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes4.dex */
public final class C8140 extends AbstractC18581 implements InterfaceC2546 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19327 f26853;

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

    @Override // l.AbstractC18581
    /* JADX INFO: renamed from: ۙ */
    public final void mo11911(int i, Object obj) {
        ((Consumer) obj).accept(this.f26853.f62434[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8140(C19327 c19327) {
        super(c19327);
        this.f26853 = c19327;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8140(C19327 c19327, int i, int i2, boolean z) {
        super(c19327, i, i2, z);
        this.f26853 = c19327;
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return this.f60365 ? 0 : 64;
    }

    @Override // l.AbstractC18581
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC18581 mo11910(int i, int i2, boolean z) {
        return new C8140(this.f26853, i, i2, z);
    }
}
