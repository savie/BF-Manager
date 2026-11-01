package l;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;

/* JADX INFO: renamed from: l.ۡۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8650 implements InterfaceC20693 {
    public InterfaceC8616 a;
    public int b;
    public InterfaceC20693 c;
    public InterfaceC20693 d;
    public Deque e;

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return 64;
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

    public AbstractC8650(InterfaceC8616 interfaceC8616) {
        this.a = interfaceC8616;
    }

    public final Deque b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int iO = this.a.o();
        while (true) {
            iO--;
            if (iO < this.b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.a.a(iO));
        }
    }

    public static InterfaceC8616 a(Deque deque) {
        while (true) {
            ArrayDeque arrayDeque = (ArrayDeque) deque;
            InterfaceC8616 interfaceC8616 = (InterfaceC8616) arrayDeque.pollFirst();
            if (interfaceC8616 == null) {
                return null;
            }
            if (interfaceC8616.o() != 0) {
                int iO = interfaceC8616.o();
                while (true) {
                    iO--;
                    if (iO >= 0) {
                        arrayDeque.addFirst(interfaceC8616.a(iO));
                    }
                }
            } else if (interfaceC8616.count() > 0) {
                return interfaceC8616;
            }
        }
    }

    public final boolean c() {
        if (this.a == null) {
            return false;
        }
        if (this.d != null) {
            return true;
        }
        InterfaceC20693 interfaceC20693 = this.c;
        if (interfaceC20693 == null) {
            Deque dequeB = b();
            this.e = dequeB;
            InterfaceC8616 interfaceC8616A = a(dequeB);
            if (interfaceC8616A != null) {
                this.d = interfaceC8616A.spliterator();
                return true;
            }
            this.a = null;
            return false;
        }
        this.d = interfaceC20693;
        return true;
    }

    @Override // l.InterfaceC20693
    public final InterfaceC20693 trySplit() {
        InterfaceC8616 interfaceC8616 = this.a;
        if (interfaceC8616 == null || this.d != null) {
            return null;
        }
        InterfaceC20693 interfaceC20693 = this.c;
        if (interfaceC20693 != null) {
            return interfaceC20693.trySplit();
        }
        if (this.b < interfaceC8616.o() - 1) {
            InterfaceC8616 interfaceC8617 = this.a;
            int i = this.b;
            this.b = i + 1;
            return interfaceC8617.a(i).spliterator();
        }
        InterfaceC8616 interfaceC8616A = this.a.a(this.b);
        this.a = interfaceC8616A;
        if (interfaceC8616A.o() == 0) {
            InterfaceC20693 interfaceC20693Spliterator = this.a.spliterator();
            this.c = interfaceC20693Spliterator;
            return interfaceC20693Spliterator.trySplit();
        }
        InterfaceC8616 interfaceC8618 = this.a;
        this.b = 1;
        return interfaceC8618.a(0).spliterator();
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        long jCount = 0;
        if (this.a == null) {
            return 0L;
        }
        InterfaceC20693 interfaceC20693 = this.c;
        if (interfaceC20693 != null) {
            return interfaceC20693.estimateSize();
        }
        for (int i = this.b; i < this.a.o(); i++) {
            jCount += this.a.a(i).count();
        }
        return jCount;
    }

    @Override // l.InterfaceC20693
    public /* bridge */ /* synthetic */ InterfaceC10110 trySplit() {
        return (InterfaceC10110) trySplit();
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
}
