package l;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩺ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAP5 */
/* JADX INFO: loaded from: classes2.dex */
public class C23079 implements InterfaceC11790 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC13431 f74977;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f74978;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f74979;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f74980 = 1024;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC11790 f74981 = null;

    @Override // l.InterfaceC18576, l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C13907.m33739(this, consumer);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ long getExactSizeIfKnown() {
        return C21398.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C21398.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC18576, l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C13907.m33740(this, consumer);
    }

    @Override // l.InterfaceC20693
    public /* bridge */ /* synthetic */ Comparator getComparator() {
        return getComparator();
    }

    @Override // l.InterfaceC11790, l.InterfaceC20693
    public InterfaceC16481 getComparator() {
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC11790 mo36682(int i, int[] iArr) {
        C7000.m18807(iArr.length, 0, i);
        return new C5439(0, i, this.f74979, iArr);
    }

    public C23079(InterfaceC13431 interfaceC13431, long j, int i) {
        this.f74977 = interfaceC13431;
        this.f74978 = j;
        if ((i & 4096) != 0) {
            this.f74979 = i | 256;
        } else {
            this.f74979 = i | 16704;
        }
    }

    @Override // l.InterfaceC10110
    public final boolean tryAdvance(IntConsumer intConsumer) {
        InterfaceC11790 interfaceC11790 = this.f74981;
        if (interfaceC11790 != null) {
            boolean zTryAdvance = interfaceC11790.tryAdvance(intConsumer);
            if (!zTryAdvance) {
                this.f74981 = null;
            }
            return zTryAdvance;
        }
        InterfaceC13431 interfaceC13431 = this.f74977;
        if (!interfaceC13431.hasNext()) {
            return false;
        }
        this.f74978--;
        intConsumer.accept(interfaceC13431.nextInt());
        return true;
    }

    @Override // l.InterfaceC10110
    public final void forEachRemaining(IntConsumer intConsumer) {
        InterfaceC11790 interfaceC11790 = this.f74981;
        if (interfaceC11790 != null) {
            interfaceC11790.forEachRemaining(intConsumer);
            this.f74981 = null;
        }
        this.f74977.forEachRemaining(intConsumer);
        this.f74978 = 0L;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        InterfaceC11790 interfaceC11790 = this.f74981;
        if (interfaceC11790 != null) {
            return interfaceC11790.estimateSize();
        }
        if (!this.f74977.hasNext()) {
            return 0L;
        }
        long j = this.f74978;
        return j >= 0 ? j : C17492.FOREVER_NS;
    }

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return this.f74979;
    }

    @Override // l.InterfaceC20693
    public final InterfaceC11790 trySplit() {
        InterfaceC13431 interfaceC13431 = this.f74977;
        if (!interfaceC13431.hasNext()) {
            return null;
        }
        long j = this.f74978;
        int iMin = j > 0 ? (int) Math.min(this.f74980, j) : this.f74980;
        int[] iArrCopyOf = new int[iMin];
        int i = 0;
        while (i < iMin && interfaceC13431.hasNext()) {
            iArrCopyOf[i] = interfaceC13431.nextInt();
            this.f74978--;
            i++;
        }
        if (iMin < this.f74980 && interfaceC13431.hasNext()) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, this.f74980);
            while (interfaceC13431.hasNext() && i < this.f74980) {
                iArrCopyOf[i] = interfaceC13431.nextInt();
                this.f74978--;
                i++;
            }
        }
        this.f74980 = Math.min(33554432, this.f74980 + 1024);
        InterfaceC11790 interfaceC11790Mo36682 = mo36682(i, iArrCopyOf);
        if (interfaceC13431.hasNext()) {
            return interfaceC11790Mo36682;
        }
        this.f74981 = interfaceC11790Mo36682;
        return ((C5439) interfaceC11790Mo36682).trySplit();
    }
}
