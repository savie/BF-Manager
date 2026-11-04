package l;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;

/* JADX INFO: renamed from: l.۫ۗۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12818 implements InterfaceC8409 {
    public InterfaceC13409 a;
    public int b;
    public InterfaceC8409 c;
    public InterfaceC8409 d;
    public Deque e;

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return 64;
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

    public AbstractC12818(InterfaceC13409 interfaceC13409) {
        this.a = interfaceC13409;
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

    public static InterfaceC13409 a(Deque deque) {
        while (true) {
            ArrayDeque arrayDeque = (ArrayDeque) deque;
            InterfaceC13409 interfaceC13409 = (InterfaceC13409) arrayDeque.pollFirst();
            if (interfaceC13409 == null) {
                return null;
            }
            if (interfaceC13409.o() != 0) {
                int iO = interfaceC13409.o();
                while (true) {
                    iO--;
                    if (iO >= 0) {
                        arrayDeque.addFirst(interfaceC13409.a(iO));
                    }
                }
            } else if (interfaceC13409.count() > 0) {
                return interfaceC13409;
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
        InterfaceC8409 interfaceC8409 = this.c;
        if (interfaceC8409 == null) {
            Deque dequeB = b();
            this.e = dequeB;
            InterfaceC13409 interfaceC13409A = a(dequeB);
            if (interfaceC13409A != null) {
                this.d = interfaceC13409A.spliterator();
                return true;
            }
            this.a = null;
            return false;
        }
        this.d = interfaceC8409;
        return true;
    }

    @Override // l.InterfaceC8409
    public final InterfaceC8409 trySplit() {
        InterfaceC13409 interfaceC13409 = this.a;
        if (interfaceC13409 == null || this.d != null) {
            return null;
        }
        InterfaceC8409 interfaceC8409 = this.c;
        if (interfaceC8409 != null) {
            return interfaceC8409.trySplit();
        }
        if (this.b < interfaceC13409.o() - 1) {
            InterfaceC13409 interfaceC134010 = this.a;
            int i = this.b;
            this.b = i + 1;
            return interfaceC134010.a(i).spliterator();
        }
        InterfaceC13409 interfaceC13409A = this.a.a(this.b);
        this.a = interfaceC13409A;
        if (interfaceC13409A.o() == 0) {
            InterfaceC8409 interfaceC8409Spliterator = this.a.spliterator();
            this.c = interfaceC8409Spliterator;
            return interfaceC8409Spliterator.trySplit();
        }
        InterfaceC13409 interfaceC134011 = this.a;
        this.b = 1;
        return interfaceC134011.a(0).spliterator();
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        long jCount = 0;
        if (this.a == null) {
            return 0L;
        }
        InterfaceC8409 interfaceC8409 = this.c;
        if (interfaceC8409 != null) {
            return interfaceC8409.estimateSize();
        }
        for (int i = this.b; i < this.a.o(); i++) {
            jCount += this.a.a(i).count();
        }
        return jCount;
    }

    @Override // l.InterfaceC8409
    public /* bridge */ /* synthetic */ InterfaceC9154 trySplit() {
        return (InterfaceC9154) trySplit();
    }

    @Override // l.InterfaceC8409
    public /* bridge */ /* synthetic */ InterfaceC7664 trySplit() {
        return (InterfaceC7664) trySplit();
    }

    @Override // l.InterfaceC8409
    public /* bridge */ /* synthetic */ InterfaceC9900 trySplit() {
        return (InterfaceC9900) trySplit();
    }

    @Override // l.InterfaceC8409
    public /* bridge */ /* synthetic */ InterfaceC3012 trySplit() {
        return (InterfaceC3012) trySplit();
    }
}
