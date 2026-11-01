package l;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۜۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AQC */
/* JADX INFO: loaded from: classes3.dex */
public class C6747 implements InterfaceC11687 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC15277 f22726;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f22727;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f22728;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f22729 = 1024;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC11687 f22730 = null;

    @Override // l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C13804.m33553(this, consumer);
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
        return C13804.m33554(this, consumer);
    }

    @Override // l.InterfaceC20693
    public /* bridge */ /* synthetic */ Comparator getComparator() {
        return getComparator();
    }

    @Override // l.InterfaceC11687, l.InterfaceC20693
    public InterfaceC4692 getComparator() {
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC11687 mo18245(char[] cArr, int i) {
        C7000.m18807(cArr.length, 0, i);
        return new C5336(0, i, cArr, this.f22728);
    }

    @Override // l.InterfaceC10110
    public final void forEachRemaining(Object obj) {
        InterfaceC1164 interfaceC1164 = (InterfaceC1164) obj;
        InterfaceC11687 interfaceC11687 = this.f22730;
        if (interfaceC11687 != null) {
            interfaceC11687.forEachRemaining((Object) interfaceC1164);
            this.f22730 = null;
        }
        this.f22726.forEachRemaining(interfaceC1164);
        this.f22727 = 0L;
    }

    @Override // l.InterfaceC10110
    public final boolean tryAdvance(Object obj) {
        InterfaceC1164 interfaceC1164 = (InterfaceC1164) obj;
        InterfaceC11687 interfaceC11687 = this.f22730;
        if (interfaceC11687 != null) {
            boolean zTryAdvance = interfaceC11687.tryAdvance((Object) interfaceC1164);
            if (!zTryAdvance) {
                this.f22730 = null;
            }
            return zTryAdvance;
        }
        InterfaceC15277 interfaceC15277 = this.f22726;
        if (!interfaceC15277.hasNext()) {
            return false;
        }
        this.f22727--;
        interfaceC1164.mo4297(interfaceC15277.mo1416());
        return true;
    }

    public C6747(InterfaceC15277 interfaceC15277, long j, int i) {
        this.f22726 = interfaceC15277;
        this.f22727 = j;
        if ((i & 4096) != 0) {
            this.f22728 = i | 256;
        } else {
            this.f22728 = i | 16704;
        }
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        InterfaceC11687 interfaceC11687 = this.f22730;
        if (interfaceC11687 != null) {
            return interfaceC11687.estimateSize();
        }
        if (!this.f22726.hasNext()) {
            return 0L;
        }
        long j = this.f22727;
        return j >= 0 ? j : C17492.FOREVER_NS;
    }

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return this.f22728;
    }

    @Override // l.InterfaceC20693
    public final InterfaceC11687 trySplit() {
        InterfaceC15277 interfaceC15277 = this.f22726;
        if (!interfaceC15277.hasNext()) {
            return null;
        }
        long j = this.f22727;
        int iMin = j > 0 ? (int) Math.min(this.f22729, j) : this.f22729;
        char[] cArrCopyOf = new char[iMin];
        int i = 0;
        while (i < iMin && interfaceC15277.hasNext()) {
            cArrCopyOf[i] = interfaceC15277.mo1416();
            this.f22727--;
            i++;
        }
        if (iMin < this.f22729 && interfaceC15277.hasNext()) {
            cArrCopyOf = Arrays.copyOf(cArrCopyOf, this.f22729);
            while (interfaceC15277.hasNext() && i < this.f22729) {
                cArrCopyOf[i] = interfaceC15277.mo1416();
                this.f22727--;
                i++;
            }
        }
        this.f22729 = Math.min(33554432, this.f22729 + 1024);
        InterfaceC11687 interfaceC11687Mo18245 = mo18245(cArrCopyOf, i);
        if (interfaceC15277.hasNext()) {
            return interfaceC11687Mo18245;
        }
        this.f22730 = interfaceC11687Mo18245;
        return ((C5336) interfaceC11687Mo18245).trySplit();
    }
}
