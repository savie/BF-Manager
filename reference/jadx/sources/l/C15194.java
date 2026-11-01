package l;

import com.umeng.analytics.pro.o;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܶۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15194 extends C20838 implements InterfaceC20693 {
    public final ConcurrentMapC13783 i;
    public long j;

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return o.a.f77939l;
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

    public C15194(C19427[] c19427Arr, int i, int i2, int i3, long j, ConcurrentMapC13783 concurrentMapC13783) {
        super(c19427Arr, i, i2, i3);
        this.i = concurrentMapC13783;
        this.j = j;
    }

    @Override // l.InterfaceC20693
    public final InterfaceC20693 trySplit() {
        int i = this.f;
        int i2 = this.g;
        int i3 = (i + i2) >>> 1;
        if (i3 <= i) {
            return null;
        }
        C19427[] c19427Arr = this.a;
        this.g = i3;
        long j = this.j >>> 1;
        this.j = j;
        return new C15194(c19427Arr, this.h, i3, i2, j, this.i);
    }

    @Override // l.InterfaceC20693
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        while (true) {
            C19427 c19427A = a();
            if (c19427A == null) {
                return;
            } else {
                consumer.accept(new C8138(c19427A.b, c19427A.c, this.i));
            }
        }
    }

    @Override // l.InterfaceC20693
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        C19427 c19427A = a();
        if (c19427A == null) {
            return false;
        }
        consumer.accept(new C8138(c19427A.b, c19427A.c, this.i));
        return true;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        return this.j;
    }
}
