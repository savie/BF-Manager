package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۢ۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9468 extends AbstractC1330 implements InterfaceC7371 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6975 f32026;

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

    @Override // l.AbstractC1330
    /* JADX INFO: renamed from: ۙ */
    public final void mo4728(int i, Object obj) {
        ((Consumer) obj).accept(new C2741(this.f32026, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9468(C6975 c6975) {
        super(c6975);
        this.f32026 = c6975;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9468(C6975 c6975, int i, int i2, boolean z) {
        super(c6975, i, i2, z);
        this.f32026 = c6975;
    }

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return this.f5636 ? 1 : 65;
    }

    @Override // l.AbstractC1330
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC1330 mo4727(int i, int i2, boolean z) {
        return new C9468(this.f32026, i, i2, z);
    }
}
