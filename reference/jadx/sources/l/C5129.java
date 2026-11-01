package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۚۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes3.dex */
public final class C5129 extends AbstractC21357 implements InterfaceC7371 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7952 f17840;

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

    @Override // l.AbstractC21357
    /* JADX INFO: renamed from: ۙ */
    public final void mo10883(int i, Object obj) {
        ((Consumer) obj).accept(new C6540(this.f17840, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5129(C7952 c7952) {
        super(c7952);
        this.f17840 = c7952;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5129(C7952 c7952, int i, int i2, boolean z) {
        super(c7952, i, i2, z);
        this.f17840 = c7952;
    }

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return this.f69480 ? 1 : 65;
    }

    @Override // l.AbstractC21357
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC21357 mo10882(int i, int i2, boolean z) {
        return new C5129(this.f17840, i, i2, z);
    }
}
