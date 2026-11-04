package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֫֫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1588 implements InterfaceC8409 {
    public final Object[] a;
    public int b;
    public final int c;
    public final int d;

    @Override // l.InterfaceC8409
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C18105.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC8409
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C18105.$default$hasCharacteristics(this, i);
    }

    public C1588(Object[] objArr, int i, int i2, int i3) {
        this.a = objArr;
        this.b = i;
        this.c = i2;
        this.d = i3 | 16448;
    }

    @Override // l.InterfaceC8409
    public final InterfaceC8409 trySplit() {
        int i = this.b;
        int i2 = (this.c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.b = i2;
        return new C1588(this.a, i, i2, this.d);
    }

    @Override // l.InterfaceC8409
    public final void forEachRemaining(Consumer consumer) {
        int i;
        consumer.getClass();
        Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = this.c;
        if (length < i2 || (i = this.b) < 0) {
            return;
        }
        this.b = i2;
        if (i < i2) {
            do {
                consumer.accept(objArr[i]);
                i++;
            } while (i < i2);
        }
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int i = this.b;
        if (i < 0 || i >= this.c) {
            return false;
        }
        this.b = i + 1;
        consumer.accept(this.a[i]);
        return true;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        return this.c - this.b;
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return this.d;
    }

    @Override // l.InterfaceC8409
    public final Comparator getComparator() {
        if (C18105.$default$hasCharacteristics(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
