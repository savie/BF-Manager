package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۨ۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes4.dex */
public final class C11584 extends AbstractC0999 implements InterfaceC7371 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6644 f38947;

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

    @Override // l.AbstractC0999
    /* JADX INFO: renamed from: ۙ */
    public final void mo3826(int i, Object obj) {
        ((Consumer) obj).accept(this.f38947.f22442[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11584(C6644 c6644) {
        super(c6644);
        this.f38947 = c6644;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11584(C6644 c6644, int i, int i2, boolean z) {
        super(c6644, i, i2, z);
        this.f38947 = c6644;
    }

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return this.f4674 ? 1 : 65;
    }

    @Override // l.AbstractC0999
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC0999 mo3825(int i, int i2, boolean z) {
        return new C11584(this.f38947, i, i2, z);
    }
}
