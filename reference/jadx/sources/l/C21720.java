package l;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩷֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: DAOW */
/* JADX INFO: loaded from: classes2.dex */
public final class C21720 implements InterfaceC9301 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f69310;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f69311;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12285 f69312;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f69309 = 1024;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC9301 f69313 = null;

    @Override // l.InterfaceC9900, l.InterfaceC8409
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C1099.m4100(this, consumer);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ long getExactSizeIfKnown() {
        return C18105.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C18105.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC9900, l.InterfaceC8409, l.InterfaceC7664
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C1099.m4101(this, consumer);
    }

    @Override // l.InterfaceC8409
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public C21720(InterfaceC12285 interfaceC12285, long j, int i) {
        this.f69312 = interfaceC12285;
        this.f69310 = j;
        this.f69311 = i | 16704;
    }

    @Override // l.InterfaceC9154
    public final boolean tryAdvance(LongConsumer longConsumer) {
        InterfaceC9301 interfaceC9301 = this.f69313;
        if (interfaceC9301 != null) {
            boolean zTryAdvance = interfaceC9301.tryAdvance(longConsumer);
            if (!zTryAdvance) {
                this.f69313 = null;
            }
            return zTryAdvance;
        }
        InterfaceC12285 interfaceC12285 = this.f69312;
        if (!interfaceC12285.hasNext()) {
            return false;
        }
        this.f69310--;
        longConsumer.accept(interfaceC12285.nextLong());
        return true;
    }

    @Override // l.InterfaceC9154
    public final void forEachRemaining(LongConsumer longConsumer) {
        InterfaceC9301 interfaceC9301 = this.f69313;
        if (interfaceC9301 != null) {
            interfaceC9301.forEachRemaining(longConsumer);
            this.f69313 = null;
        }
        this.f69312.forEachRemaining(longConsumer);
        this.f69310 = 0L;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        InterfaceC9301 interfaceC9301 = this.f69313;
        if (interfaceC9301 != null) {
            return interfaceC9301.estimateSize();
        }
        if (!this.f69312.hasNext()) {
            return 0L;
        }
        long j = this.f69310;
        return j >= 0 ? j : C25227.FOREVER_NS;
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return this.f69311;
    }

    @Override // l.InterfaceC9900, l.InterfaceC9154, l.InterfaceC8409
    public final InterfaceC9301 trySplit() {
        InterfaceC12285 interfaceC12285 = this.f69312;
        if (!interfaceC12285.hasNext()) {
            return null;
        }
        long j = this.f69310;
        int iMin = j > 0 ? (int) Math.min(this.f69309, j) : this.f69309;
        long[] jArrCopyOf = new long[iMin];
        int i = 0;
        while (i < iMin && interfaceC12285.hasNext()) {
            jArrCopyOf[i] = interfaceC12285.nextLong();
            this.f69310--;
            i++;
        }
        if (iMin < this.f69309 && interfaceC12285.hasNext()) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, this.f69309);
            while (interfaceC12285.hasNext() && i < this.f69309) {
                jArrCopyOf[i] = interfaceC12285.nextLong();
                this.f69310--;
                i++;
            }
        }
        this.f69309 = Math.min(33554432, this.f69309 + 1024);
        C18450.m42990(jArrCopyOf.length, 0, i);
        C8556 c8556 = new C8556(jArrCopyOf, 0, i, this.f69311);
        if (interfaceC12285.hasNext()) {
            return c8556;
        }
        this.f69313 = c8556;
        return c8556.trySplit();
    }
}
