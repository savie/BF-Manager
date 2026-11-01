package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۢܰ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9625 implements InterfaceC20693 {
    public int a;

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return 17488;
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ Comparator getComparator() {
        return C21398.$default$getComparator(this);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C21398.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C21398.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC20693
    public final InterfaceC20693 trySplit() {
        return null;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        return (-this.a) - 1;
    }
}
