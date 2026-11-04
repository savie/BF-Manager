package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ܰ᩵ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14812 implements InterfaceC8409 {
    public int a;

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return 17488;
    }

    @Override // l.InterfaceC8409
    public final /* synthetic */ Comparator getComparator() {
        return C18105.$default$getComparator(this);
    }

    @Override // l.InterfaceC8409
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C18105.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC8409
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C18105.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC8409
    public final InterfaceC8409 trySplit() {
        return null;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        return (-this.a) - 1;
    }
}
