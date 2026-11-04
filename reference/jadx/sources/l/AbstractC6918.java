package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۜۚۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6918 implements InterfaceC8409 {
    public final int a;
    public long b;
    public int c;

    @Override // l.InterfaceC8409
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        C18105.$default$forEachRemaining(this, consumer);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ Comparator getComparator() {
        return C18105.$default$getComparator(this);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ long getExactSizeIfKnown() {
        return C18105.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C18105.$default$hasCharacteristics(this, i);
    }

    public AbstractC6918(long j, int i) {
        this.b = j;
        this.a = (i & 64) != 0 ? i | 16384 : i;
    }

    @Override // l.InterfaceC8409
    public final InterfaceC8409 trySplit() {
        C15011 c15011 = new C15011();
        long j = this.b;
        if (j <= 1 || !tryAdvance(c15011)) {
            return null;
        }
        int i = this.c + 1024;
        if (i > j) {
            i = (int) j;
        }
        if (i > 33554432) {
            i = 33554432;
        }
        Object[] objArr = new Object[i];
        int i2 = 0;
        do {
            objArr[i2] = c15011.a;
            i2++;
            if (i2 >= i) {
                break;
            }
        } while (tryAdvance(c15011));
        this.c = i2;
        long j2 = this.b;
        if (j2 != C25227.FOREVER_NS) {
            this.b = j2 - ((long) i2);
        }
        return new C1588(objArr, 0, i2, this.a);
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        return this.b;
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return this.a;
    }
}
