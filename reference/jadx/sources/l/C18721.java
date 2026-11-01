package l;

import com.umeng.analytics.pro.o;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩴۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18721 extends C20838 implements InterfaceC20693 {
    public final /* synthetic */ int i;
    public long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18721(C19427[] c19427Arr, int i, int i2, int i3, long j, int i4) {
        super(c19427Arr, i, i2, i3);
        this.i = i4;
        this.j = j;
    }

    @Override // l.InterfaceC20693
    public final int characteristics() {
        switch (this.i) {
            case 0:
                return o.a.f77939l;
            default:
                return o.a.k;
        }
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ Comparator getComparator() {
        switch (this.i) {
            case 0:
                break;
        }
        return C21398.$default$getComparator(this);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.i) {
            case 0:
                break;
        }
        return C21398.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        switch (this.i) {
            case 0:
                break;
        }
        return C21398.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC20693
    public final InterfaceC20693 trySplit() {
        switch (this.i) {
            case 0:
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
                return new C18721(c19427Arr, this.h, i3, i2, j, 0);
            default:
                int i4 = this.f;
                int i5 = this.g;
                int i6 = (i4 + i5) >>> 1;
                if (i6 <= i4) {
                    return null;
                }
                C19427[] c19427Arr2 = this.a;
                this.g = i6;
                long j2 = this.j >>> 1;
                this.j = j2;
                return new C18721(c19427Arr2, this.h, i6, i5, j2, 1);
        }
    }

    @Override // l.InterfaceC20693
    public final void forEachRemaining(Consumer consumer) {
        switch (this.i) {
            case 0:
                consumer.getClass();
                while (true) {
                    C19427 c19427A = a();
                    if (c19427A != null) {
                        consumer.accept(c19427A.b);
                    }
                    break;
                }
                break;
            default:
                consumer.getClass();
                while (true) {
                    C19427 c19427A2 = a();
                    if (c19427A2 != null) {
                        consumer.accept(c19427A2.c);
                    }
                    break;
                }
                break;
        }
    }

    @Override // l.InterfaceC20693
    public final boolean tryAdvance(Consumer consumer) {
        switch (this.i) {
            case 0:
                consumer.getClass();
                C19427 c19427A = a();
                if (c19427A == null) {
                    return false;
                }
                consumer.accept(c19427A.b);
                return true;
            default:
                consumer.getClass();
                C19427 c19427A2 = a();
                if (c19427A2 == null) {
                    return false;
                }
                consumer.accept(c19427A2.c);
                return true;
        }
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        switch (this.i) {
            case 0:
                break;
        }
        return this.j;
    }
}
