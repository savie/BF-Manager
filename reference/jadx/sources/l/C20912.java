package l;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩵᩻ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public class C20912 implements InterfaceC8409 {
    public final Collection a;
    public Iterator b;
    public final int c;
    public long d;
    public int e;

    @Override // l.InterfaceC8409
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C18105.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC8409
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C18105.$default$hasCharacteristics(this, i);
    }

    public C20912(Collection collection, int i) {
        this.a = collection;
        this.b = null;
        this.c = (i & 4096) == 0 ? i | 16448 : i;
    }

    public C20912(Iterator it, long j, int i) {
        this.a = null;
        this.b = it;
        this.d = j;
        this.c = (i & 4096) == 0 ? i | 16448 : i;
    }

    public C20912(Iterator it, int i) {
        this.a = null;
        this.b = it;
        this.d = C25227.FOREVER_NS;
        this.c = i & (-16449);
    }

    @Override // l.InterfaceC8409
    public final InterfaceC8409 trySplit() {
        long size;
        Iterator it = this.b;
        if (it == null) {
            it = this.a.iterator();
            this.b = it;
            size = this.a.size();
            this.d = size;
        } else {
            size = this.d;
        }
        if (size <= 1 || !it.hasNext()) {
            return null;
        }
        int i = this.e + 1024;
        if (i > size) {
            i = (int) size;
        }
        if (i > 33554432) {
            i = 33554432;
        }
        Object[] objArr = new Object[i];
        int i2 = 0;
        do {
            objArr[i2] = it.next();
            i2++;
            if (i2 >= i) {
                break;
            }
        } while (it.hasNext());
        this.e = i2;
        long j = this.d;
        if (j != C25227.FOREVER_NS) {
            this.d = j - ((long) i2);
        }
        return new C1588(objArr, 0, i2, this.c);
    }

    @Override // l.InterfaceC8409
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        Iterator it = this.b;
        if (it == null) {
            it = this.a.iterator();
            this.b = it;
            this.d = this.a.size();
        }
        C22581.forEachRemaining(it, consumer);
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        if (this.b == null) {
            this.b = this.a.iterator();
            this.d = this.a.size();
        }
        if (!this.b.hasNext()) {
            return false;
        }
        consumer.accept(this.b.next());
        return true;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        if (this.b == null) {
            this.b = this.a.iterator();
            long size = this.a.size();
            this.d = size;
            return size;
        }
        return this.d;
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return this.c;
    }

    @Override // l.InterfaceC8409
    public Comparator getComparator() {
        if (C18105.$default$hasCharacteristics(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
