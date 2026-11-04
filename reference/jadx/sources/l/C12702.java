package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۨ᩺᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12702 extends AbstractC8228 implements InterfaceC2546 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1516 f40690;

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

    @Override // l.AbstractC8228
    /* JADX INFO: renamed from: ۙ */
    public final void mo22134(int i, Object obj) {
        ((Consumer) obj).accept(new C21653(this.f40690, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12702(C1516 c1516) {
        super(c1516);
        this.f40690 = c1516;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12702(C1516 c1516, int i, int i2, boolean z) {
        super(c1516, i, i2, z);
        this.f40690 = c1516;
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return this.f27085 ? 1 : 65;
    }

    @Override // l.AbstractC8228
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC8228 mo22133(int i, int i2, boolean z) {
        return new C12702(this.f40690, i, i2, z);
    }
}
