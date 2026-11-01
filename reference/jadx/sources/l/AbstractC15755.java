package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܺۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15755 implements InterfaceC20693 {
    public final int a;
    public long b;
    public int c;

    @Override // l.InterfaceC20693
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        C21398.$default$forEachRemaining(this, consumer);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ Comparator getComparator() {
        return C21398.$default$getComparator(this);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ long getExactSizeIfKnown() {
        return C21398.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C21398.$default$hasCharacteristics(this, i);
    }

    public AbstractC15755(long j, int i) {
        this.b = j;
        this.a = (i & 64) != 0 ? i | 16384 : i;
    }

    @Override // l.InterfaceC20693
    public final InterfaceC20693 trySplit() {
        C10816 c10816 = new C10816();
        long j = this.b;
        if (j <= 1 || !tryAdvance(c10816)) {
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
            objArr[i2] = c10816.a;
            i2++;
            if (i2 >= i) {
                break;
            }
        } while (tryAdvance(c10816));
        this.c = i2;
        long j2 = this.b;
        if (j2 != C17492.FOREVER_NS) {
            this.b = j2 - ((long) i2);
        }
        return new C1642(objArr, 0, i2, this.a);
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        return this.b;
    }

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return this.a;
    }
}
