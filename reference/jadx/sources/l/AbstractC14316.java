package l;

import java.util.Comparator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܳۚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14316 implements InterfaceC20693 {
    public final InterfaceC20693 a;
    public final AtomicBoolean b;
    public boolean c;
    public int d;

    public abstract InterfaceC20693 b(InterfaceC20693 interfaceC20693);

    @Override // l.InterfaceC20693
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        C21398.$default$forEachRemaining(this, consumer);
    }

    @Override // l.InterfaceC20693
    public final long getExactSizeIfKnown() {
        return -1L;
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C21398.$default$hasCharacteristics(this, i);
    }

    public AbstractC14316(InterfaceC20693 interfaceC20693) {
        this.c = true;
        this.a = interfaceC20693;
        this.b = new AtomicBoolean();
    }

    public AbstractC14316(InterfaceC20693 interfaceC20693, AbstractC14316 abstractC14316) {
        this.c = true;
        this.a = interfaceC20693;
        this.b = abstractC14316.b;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return this.a.characteristics() & (-16449);
    }

    @Override // l.InterfaceC20693
    public final Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override // l.InterfaceC20693
    public InterfaceC20693 trySplit() {
        InterfaceC20693 interfaceC20693TrySplit = this.a.trySplit();
        if (interfaceC20693TrySplit != null) {
            return b(interfaceC20693TrySplit);
        }
        return null;
    }

    public final boolean a() {
        return (this.d == 0 && this.b.get()) ? false : true;
    }

    @Override // l.InterfaceC20693
    public /* bridge */ /* synthetic */ InterfaceC18576 trySplit() {
        return (InterfaceC18576) trySplit();
    }

    @Override // l.InterfaceC20693
    public /* bridge */ /* synthetic */ InterfaceC19282 trySplit() {
        return (InterfaceC19282) trySplit();
    }

    @Override // l.InterfaceC20693
    public /* bridge */ /* synthetic */ InterfaceC7535 trySplit() {
        return (InterfaceC7535) trySplit();
    }

    @Override // l.InterfaceC20693
    public /* bridge */ /* synthetic */ InterfaceC10110 trySplit() {
        return (InterfaceC10110) trySplit();
    }
}
