package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۘۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes3.dex */
public final class C3717 extends AbstractC21357 implements InterfaceC11687 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7952 f13515;

    @Override // l.AbstractC21357, l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C13804.m33553(this, consumer);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ long getExactSizeIfKnown() {
        return C21398.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C21398.$default$hasCharacteristics(this, i);
    }

    @Override // l.AbstractC21357, l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C13804.m33554(this, consumer);
    }

    @Override // l.InterfaceC20693
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        getComparator();
        throw null;
    }

    @Override // l.InterfaceC11687, l.InterfaceC20693
    public final InterfaceC4692 getComparator() {
        throw new IllegalStateException();
    }

    @Override // l.AbstractC21357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10883(int i, Object obj) {
        ((InterfaceC1164) obj).mo4297(this.f13515.f26123[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3717(C7952 c7952) {
        super(c7952);
        this.f13515 = c7952;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3717(C7952 c7952, int i, int i2, boolean z) {
        super(c7952, i, i2, z);
        this.f13515 = c7952;
    }

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return this.f69480 ? 257 : 321;
    }

    @Override // l.AbstractC21357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC21357 mo10882(int i, int i2, boolean z) {
        return new C3717(this.f13515, i, i2, z);
    }
}
