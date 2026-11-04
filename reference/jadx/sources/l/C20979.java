package l;

import com.umeng.analytics.pro.o;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩶֫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20979 extends C8300 implements InterfaceC8409 {
    public final ConcurrentMapC17249 i;
    public long j;

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return o.a.f82055l;
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

    public C20979(C9790[] c9790Arr, int i, int i2, int i3, long j, ConcurrentMapC17249 concurrentMapC17249) {
        super(c9790Arr, i, i2, i3);
        this.i = concurrentMapC17249;
        this.j = j;
    }

    @Override // l.InterfaceC8409
    public final InterfaceC8409 trySplit() {
        int i = this.f;
        int i2 = this.g;
        int i3 = (i + i2) >>> 1;
        if (i3 <= i) {
            return null;
        }
        C9790[] c9790Arr = this.a;
        this.g = i3;
        long j = this.j >>> 1;
        this.j = j;
        return new C20979(c9790Arr, this.h, i3, i2, j, this.i);
    }

    @Override // l.InterfaceC8409
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        while (true) {
            C9790 c9790A = a();
            if (c9790A == null) {
                return;
            } else {
                consumer.accept(new C18741(c9790A.b, c9790A.c, this.i));
            }
        }
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        C9790 c9790A = a();
        if (c9790A == null) {
            return false;
        }
        consumer.accept(new C18741(c9790A.b, c9790A.c, this.i));
        return true;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        return this.j;
    }
}
