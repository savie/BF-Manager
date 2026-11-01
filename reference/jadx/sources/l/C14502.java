package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܳۨ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14502 implements InterfaceC20693, Consumer {
    public static final Object d = new Object();
    public final InterfaceC20693 a;
    public final ConcurrentMapC13783 b;
    public Object c;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C21398.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C21398.$default$hasCharacteristics(this, i);
    }

    public C14502(InterfaceC20693 interfaceC20693, ConcurrentMapC13783 concurrentMapC13783) {
        this.a = interfaceC20693;
        this.b = concurrentMapC13783;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.c = obj;
    }

    @Override // l.InterfaceC20693
    public final boolean tryAdvance(Consumer consumer) {
        while (this.a.tryAdvance(this)) {
            Object obj = this.c;
            if (obj == null) {
                obj = d;
            }
            if (this.b.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.accept(this.c);
                this.c = null;
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC20693
    public final void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(new C11251(8, this, consumer));
    }

    @Override // l.InterfaceC20693
    public final InterfaceC20693 trySplit() {
        InterfaceC20693 interfaceC20693TrySplit = this.a.trySplit();
        if (interfaceC20693TrySplit != null) {
            return new C14502(interfaceC20693TrySplit, this.b);
        }
        return null;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return (this.a.characteristics() & (-16469)) | 1;
    }

    @Override // l.InterfaceC20693
    public final Comparator getComparator() {
        return this.a.getComparator();
    }
}
