package l;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۬ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAQ5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12912 implements InterfaceC11501 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC10007 f42926;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f42927;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f42928;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f42929 = 1024;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC11501 f42930 = null;

    @Override // l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C13618.m33299(this, consumer);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ long getExactSizeIfKnown() {
        return C21398.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C21398.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C13618.m33300(this, consumer);
    }

    @Override // l.InterfaceC20693
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // l.InterfaceC10110
    public final void forEachRemaining(Object obj) {
        InterfaceC17767 interfaceC17767 = (InterfaceC17767) obj;
        InterfaceC11501 interfaceC11501 = this.f42930;
        if (interfaceC11501 != null) {
            ((C5150) interfaceC11501).forEachRemaining((Object) interfaceC17767);
            this.f42930 = null;
        }
        this.f42926.forEachRemaining(interfaceC17767);
        this.f42927 = 0L;
    }

    @Override // l.InterfaceC10110
    public final boolean tryAdvance(Object obj) {
        InterfaceC17767 interfaceC17767 = (InterfaceC17767) obj;
        InterfaceC11501 interfaceC11501 = this.f42930;
        if (interfaceC11501 != null) {
            boolean zTryAdvance = interfaceC11501.tryAdvance((Object) interfaceC17767);
            if (!zTryAdvance) {
                this.f42930 = null;
            }
            return zTryAdvance;
        }
        InterfaceC10007 interfaceC10007 = this.f42926;
        if (!interfaceC10007.hasNext()) {
            return false;
        }
        this.f42927--;
        interfaceC17767.mo35707(interfaceC10007.nextFloat());
        return true;
    }

    public C12912(InterfaceC10007 interfaceC10007, long j, int i) {
        this.f42926 = interfaceC10007;
        this.f42927 = j;
        this.f42928 = i | 16704;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        InterfaceC11501 interfaceC11501 = this.f42930;
        if (interfaceC11501 != null) {
            return interfaceC11501.estimateSize();
        }
        if (!this.f42926.hasNext()) {
            return 0L;
        }
        long j = this.f42927;
        return j >= 0 ? j : C17492.FOREVER_NS;
    }

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return this.f42928;
    }

    @Override // l.InterfaceC20693
    public final InterfaceC11501 trySplit() {
        InterfaceC10007 interfaceC10007 = this.f42926;
        if (!interfaceC10007.hasNext()) {
            return null;
        }
        long j = this.f42927;
        int iMin = j > 0 ? (int) Math.min(this.f42929, j) : this.f42929;
        float[] fArrCopyOf = new float[iMin];
        int i = 0;
        while (i < iMin && interfaceC10007.hasNext()) {
            fArrCopyOf[i] = interfaceC10007.nextFloat();
            this.f42927--;
            i++;
        }
        if (iMin < this.f42929 && interfaceC10007.hasNext()) {
            fArrCopyOf = Arrays.copyOf(fArrCopyOf, this.f42929);
            while (interfaceC10007.hasNext() && i < this.f42929) {
                fArrCopyOf[i] = interfaceC10007.nextFloat();
                this.f42927--;
                i++;
            }
        }
        this.f42929 = Math.min(33554432, this.f42929 + 1024);
        C7000.m18807(fArrCopyOf.length, 0, i);
        C5150 c5150 = new C5150(0, i, this.f42928, fArrCopyOf);
        if (interfaceC10007.hasNext()) {
            return c5150;
        }
        this.f42930 = c5150;
        return c5150.trySplit();
    }
}
