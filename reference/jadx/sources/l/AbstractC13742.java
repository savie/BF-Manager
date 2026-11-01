package l;

import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ܰۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13742 implements InterfaceC10110 {
    public int a;
    public final int b;
    public int c;
    public final int d;
    public Object e;
    public final /* synthetic */ AbstractC21502 f;

    public abstract void a(int i, Object obj, Object obj2);

    public abstract InterfaceC10110 b(Object obj, int i, int i2);

    public abstract InterfaceC10110 c(int i, int i2, int i3, int i4);

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return 16464;
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

    public AbstractC13742(AbstractC21502 abstractC21502, int i, int i2, int i3, int i4) {
        this.f = abstractC21502;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        Object[] objArr = abstractC21502.f;
        this.e = objArr == null ? abstractC21502.e : objArr[i];
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        int i = this.a;
        int i2 = this.d;
        int i3 = this.b;
        if (i == i3) {
            return ((long) i2) - ((long) this.c);
        }
        long[] jArr = this.f.d;
        return ((jArr[i3] + ((long) i2)) - jArr[i]) - ((long) this.c);
    }

    @Override // l.InterfaceC10110
    public final boolean tryAdvance(Object obj) {
        C13638.requireNonNull(obj);
        int i = this.a;
        int i2 = this.b;
        if (i >= i2 && (i != i2 || this.c >= this.d)) {
            return false;
        }
        Object obj2 = this.e;
        int i3 = this.c;
        this.c = i3 + 1;
        a(i3, obj2, obj);
        int i4 = this.c;
        Object obj3 = this.e;
        AbstractC21502 abstractC21502 = this.f;
        if (i4 == abstractC21502.q(obj3)) {
            this.c = 0;
            int i5 = this.a + 1;
            this.a = i5;
            Object[] objArr = abstractC21502.f;
            if (objArr != null && i5 <= i2) {
                this.e = objArr[i5];
            }
        }
        return true;
    }

    @Override // l.InterfaceC10110
    public final void forEachRemaining(Object obj) {
        AbstractC21502 abstractC21502;
        C13638.requireNonNull(obj);
        int i = this.a;
        int i2 = this.d;
        int i3 = this.b;
        if (i < i3 || (i == i3 && this.c < i2)) {
            int i4 = this.c;
            while (true) {
                abstractC21502 = this.f;
                if (i >= i3) {
                    break;
                }
                Object obj2 = abstractC21502.f[i];
                abstractC21502.p(obj2, i4, abstractC21502.q(obj2), obj);
                i++;
                i4 = 0;
            }
            abstractC21502.p(this.a == i3 ? this.e : abstractC21502.f[i3], i4, i2, obj);
            this.a = i3;
            this.c = i2;
        }
    }

    @Override // l.InterfaceC20693
    public final InterfaceC10110 trySplit() {
        int i = this.a;
        int i2 = this.b;
        if (i < i2) {
            int i3 = i2 - 1;
            int i4 = this.c;
            AbstractC21502 abstractC21502 = this.f;
            InterfaceC10110 interfaceC10110C = c(i, i3, i4, abstractC21502.q(abstractC21502.f[i3]));
            this.a = i2;
            this.c = 0;
            this.e = abstractC21502.f[i2];
            return interfaceC10110C;
        }
        if (i != i2) {
            return null;
        }
        int i5 = this.c;
        int i6 = (this.d - i5) / 2;
        if (i6 == 0) {
            return null;
        }
        InterfaceC10110 interfaceC10110B = b(this.e, i5, i6);
        this.c += i6;
        return interfaceC10110B;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    @Override // l.InterfaceC10110, l.InterfaceC20693
    public /* bridge */ /* synthetic */ InterfaceC18576 trySplit() {
        return (InterfaceC18576) trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    @Override // l.InterfaceC10110, l.InterfaceC20693
    public /* bridge */ /* synthetic */ InterfaceC19282 trySplit() {
        return (InterfaceC19282) trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    @Override // l.InterfaceC10110, l.InterfaceC20693
    public /* bridge */ /* synthetic */ InterfaceC7535 trySplit() {
        return (InterfaceC7535) trySplit();
    }
}
