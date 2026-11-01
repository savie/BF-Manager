package l;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ܽᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAOW */
/* JADX INFO: loaded from: classes5.dex */
public final class C16811 implements InterfaceC10462 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC1288 f53814;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f53815;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f53816;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f53817 = 1024;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC10462 f53818 = null;

    @Override // l.InterfaceC19282, l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C9051.m23382(this, consumer);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ long getExactSizeIfKnown() {
        return C21398.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C21398.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC19282, l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C9051.m23383(this, consumer);
    }

    @Override // l.InterfaceC20693
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public C16811(InterfaceC1288 interfaceC1288, long j, int i) {
        this.f53814 = interfaceC1288;
        this.f53815 = j;
        this.f53816 = i | 16704;
    }

    @Override // l.InterfaceC10110
    public final boolean tryAdvance(LongConsumer longConsumer) {
        InterfaceC10462 interfaceC10462 = this.f53818;
        if (interfaceC10462 != null) {
            boolean zTryAdvance = interfaceC10462.tryAdvance(longConsumer);
            if (!zTryAdvance) {
                this.f53818 = null;
            }
            return zTryAdvance;
        }
        InterfaceC1288 interfaceC1288 = this.f53814;
        if (!interfaceC1288.hasNext()) {
            return false;
        }
        this.f53815--;
        longConsumer.accept(interfaceC1288.nextLong());
        return true;
    }

    @Override // l.InterfaceC10110
    public final void forEachRemaining(LongConsumer longConsumer) {
        InterfaceC10462 interfaceC10462 = this.f53818;
        if (interfaceC10462 != null) {
            interfaceC10462.forEachRemaining(longConsumer);
            this.f53818 = null;
        }
        this.f53814.forEachRemaining(longConsumer);
        this.f53815 = 0L;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        InterfaceC10462 interfaceC10462 = this.f53818;
        if (interfaceC10462 != null) {
            return interfaceC10462.estimateSize();
        }
        if (!this.f53814.hasNext()) {
            return 0L;
        }
        long j = this.f53815;
        return j >= 0 ? j : C17492.FOREVER_NS;
    }

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return this.f53816;
    }

    @Override // l.InterfaceC20693
    public final InterfaceC10462 trySplit() {
        InterfaceC1288 interfaceC1288 = this.f53814;
        if (!interfaceC1288.hasNext()) {
            return null;
        }
        long j = this.f53815;
        int iMin = j > 0 ? (int) Math.min(this.f53817, j) : this.f53817;
        long[] jArrCopyOf = new long[iMin];
        int i = 0;
        while (i < iMin && interfaceC1288.hasNext()) {
            jArrCopyOf[i] = interfaceC1288.nextLong();
            this.f53815--;
            i++;
        }
        if (iMin < this.f53817 && interfaceC1288.hasNext()) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, this.f53817);
            while (interfaceC1288.hasNext() && i < this.f53817) {
                jArrCopyOf[i] = interfaceC1288.nextLong();
                this.f53815--;
                i++;
            }
        }
        this.f53817 = Math.min(33554432, this.f53817 + 1024);
        C7000.m18807(jArrCopyOf.length, 0, i);
        C21044 c21044 = new C21044(jArrCopyOf, 0, i, this.f53816);
        if (interfaceC1288.hasNext()) {
            return c21044;
        }
        this.f53818 = c21044;
        return c21044.trySplit();
    }
}
