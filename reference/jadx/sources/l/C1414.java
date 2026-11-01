package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֨᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1414 extends AbstractC19054 implements InterfaceC7371 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9177 f5841;

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

    @Override // l.AbstractC19054
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4947(int i, Object obj) {
        ((Consumer) obj).accept(new C15527(this.f5841, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1414(C9177 c9177) {
        super(c9177);
        this.f5841 = c9177;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1414(C9177 c9177, int i, int i2, boolean z) {
        super(c9177, i, i2, z);
        this.f5841 = c9177;
    }

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return this.f61617 ? 1 : 65;
    }

    @Override // l.AbstractC19054
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC19054 mo4946(int i, int i2, boolean z) {
        return new C1414(this.f5841, i, i2, z);
    }
}
