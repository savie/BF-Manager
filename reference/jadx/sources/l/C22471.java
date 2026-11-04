package l;

import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩸֫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C22471 implements InterfaceC8409 {
    public final List a;
    public int b;
    public int c;

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return 16464;
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

    public C22471(List list) {
        this.a = list;
        this.b = 0;
        this.c = -1;
    }

    public C22471(C22471 c22471, int i, int i2) {
        this.a = c22471.a;
        this.b = i;
        this.c = i2;
    }

    public final int a() {
        List list = this.a;
        int i = this.c;
        if (i >= 0) {
            return i;
        }
        int size = list.size();
        this.c = size;
        return size;
    }

    @Override // l.InterfaceC8409
    public final InterfaceC8409 trySplit() {
        int iA = a();
        int i = this.b;
        int i2 = (iA + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.b = i2;
        return new C22471(this, i, i2);
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int iA = a();
        int i = this.b;
        if (i >= iA) {
            return false;
        }
        this.b = i + 1;
        try {
            consumer.accept(this.a.get(i));
            return true;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // l.InterfaceC8409
    public final void forEachRemaining(Consumer consumer) {
        C17359.requireNonNull(consumer);
        List list = this.a;
        int iA = a();
        this.b = iA;
        for (int i = this.b; i < iA; i++) {
            try {
                consumer.accept(list.get(i));
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        return a() - this.b;
    }
}
