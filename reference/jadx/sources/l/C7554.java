package l;

import com.umeng.analytics.pro.o;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۟֫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7554 extends C8300 implements InterfaceC8409 {
    public final /* synthetic */ int i;
    public long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7554(C9790[] c9790Arr, int i, int i2, int i3, long j, int i4) {
        super(c9790Arr, i, i2, i3);
        this.i = i4;
        this.j = j;
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        switch (this.i) {
            case 0:
                return o.a.f82055l;
            default:
                return o.a.k;
        }
    }

    @Override // l.InterfaceC8409
    public final /* synthetic */ Comparator getComparator() {
        switch (this.i) {
            case 0:
                break;
        }
        return C18105.$default$getComparator(this);
    }

    @Override // l.InterfaceC8409
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.i) {
            case 0:
                break;
        }
        return C18105.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC8409
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        switch (this.i) {
            case 0:
                break;
        }
        return C18105.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC8409
    public final InterfaceC8409 trySplit() {
        switch (this.i) {
            case 0:
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
                return new C7554(c9790Arr, this.h, i3, i2, j, 0);
            default:
                int i4 = this.f;
                int i5 = this.g;
                int i6 = (i4 + i5) >>> 1;
                if (i6 <= i4) {
                    return null;
                }
                C9790[] c9790Arr2 = this.a;
                this.g = i6;
                long j2 = this.j >>> 1;
                this.j = j2;
                return new C7554(c9790Arr2, this.h, i6, i5, j2, 1);
        }
    }

    @Override // l.InterfaceC8409
    public final void forEachRemaining(Consumer consumer) {
        switch (this.i) {
            case 0:
                consumer.getClass();
                while (true) {
                    C9790 c9790A = a();
                    if (c9790A != null) {
                        consumer.accept(c9790A.b);
                    }
                    break;
                }
                break;
            default:
                consumer.getClass();
                while (true) {
                    C9790 c9790A2 = a();
                    if (c9790A2 != null) {
                        consumer.accept(c9790A2.c);
                    }
                    break;
                }
                break;
        }
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final boolean tryAdvance(Consumer consumer) {
        switch (this.i) {
            case 0:
                consumer.getClass();
                C9790 c9790A = a();
                if (c9790A == null) {
                    return false;
                }
                consumer.accept(c9790A.b);
                return true;
            default:
                consumer.getClass();
                C9790 c9790A2 = a();
                if (c9790A2 == null) {
                    return false;
                }
                consumer.accept(c9790A2.c);
                return true;
        }
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        switch (this.i) {
            case 0:
                break;
        }
        return this.j;
    }
}
