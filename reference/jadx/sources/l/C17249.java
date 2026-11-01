package l;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܿۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAQM */
/* JADX INFO: loaded from: classes5.dex */
public class C17249 implements InterfaceC7371 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC6269 f54955;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f54956;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f54957;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f54958 = 1024;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC7371 f54959 = null;

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

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC7371 mo16249(int i, Object[] objArr) {
        C7000.m18807(objArr.length, 0, i);
        return new C15839(0, i, this.f54957, objArr);
    }

    public C17249(InterfaceC6269 interfaceC6269, long j, int i) {
        this.f54955 = interfaceC6269;
        this.f54956 = j;
        if ((i & 4096) != 0) {
            this.f54957 = i;
        } else {
            this.f54957 = i | 16448;
        }
    }

    @Override // l.InterfaceC20693
    public final boolean tryAdvance(Consumer consumer) {
        InterfaceC7371 interfaceC7371 = this.f54959;
        if (interfaceC7371 != null) {
            boolean zTryAdvance = interfaceC7371.tryAdvance(consumer);
            if (!zTryAdvance) {
                this.f54959 = null;
            }
            return zTryAdvance;
        }
        InterfaceC6269 interfaceC6269 = this.f54955;
        if (!interfaceC6269.hasNext()) {
            return false;
        }
        this.f54956--;
        consumer.accept(interfaceC6269.next());
        return true;
    }

    @Override // l.InterfaceC20693
    public final void forEachRemaining(Consumer consumer) {
        InterfaceC7371 interfaceC7371 = this.f54959;
        if (interfaceC7371 != null) {
            interfaceC7371.forEachRemaining(consumer);
            this.f54959 = null;
        }
        C17495.forEachRemaining(this.f54955, consumer);
        this.f54956 = 0L;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        InterfaceC7371 interfaceC7371 = this.f54959;
        if (interfaceC7371 != null) {
            return interfaceC7371.estimateSize();
        }
        if (!this.f54955.hasNext()) {
            return 0L;
        }
        long j = this.f54956;
        return j >= 0 ? j : C17492.FOREVER_NS;
    }

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return this.f54957;
    }

    @Override // l.InterfaceC20693
    public final InterfaceC20693 trySplit() {
        InterfaceC6269 interfaceC6269 = this.f54955;
        if (!interfaceC6269.hasNext()) {
            return null;
        }
        long j = this.f54956;
        int iMin = j > 0 ? (int) Math.min(this.f54958, j) : this.f54958;
        Object[] objArrCopyOf = new Object[iMin];
        int i = 0;
        while (i < iMin && interfaceC6269.hasNext()) {
            objArrCopyOf[i] = interfaceC6269.next();
            this.f54956--;
            i++;
        }
        if (iMin < this.f54958 && interfaceC6269.hasNext()) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, this.f54958);
            while (interfaceC6269.hasNext() && i < this.f54958) {
                objArrCopyOf[i] = interfaceC6269.next();
                this.f54956--;
                i++;
            }
        }
        this.f54958 = Math.min(33554432, this.f54958 + 1024);
        InterfaceC7371 interfaceC7371Mo16249 = mo16249(i, objArrCopyOf);
        if (interfaceC6269.hasNext()) {
            return interfaceC7371Mo16249;
        }
        this.f54959 = interfaceC7371Mo16249;
        return ((C15839) interfaceC7371Mo16249).trySplit();
    }
}
