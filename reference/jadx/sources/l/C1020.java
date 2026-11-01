package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֨ۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VFO */
/* JADX INFO: loaded from: classes3.dex */
public final class C1020 implements InterfaceC7371 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f4788;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f4789;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f4790;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f4791;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13016 f4792;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f4793;

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

    public C1020(C13016 c13016) {
        this.f4792 = c13016;
        this.f4789 = 0;
        this.f4788 = c13016.f43409;
        this.f4790 = 0;
        this.f4791 = c13016.f43412;
        this.f4793 = false;
    }

    public C1020(C13016 c13016, int i, int i2, boolean z) {
        this.f4792 = c13016;
        this.f4790 = 0;
        this.f4789 = i;
        this.f4788 = i2;
        this.f4791 = z;
        this.f4793 = true;
    }

    @Override // l.InterfaceC20693
    public final boolean tryAdvance(Consumer consumer) {
        boolean z = this.f4791;
        C13016 c13016 = this.f4792;
        if (z) {
            this.f4791 = false;
            this.f4790++;
            consumer.accept(c13016.f43408[c13016.f43409]);
            return true;
        }
        Object[] objArr = c13016.f43408;
        while (true) {
            int i = this.f4789;
            if (i >= this.f4788) {
                return false;
            }
            Object obj = objArr[i];
            if (obj != null) {
                this.f4790++;
                this.f4789 = i + 1;
                consumer.accept(obj);
                return true;
            }
            this.f4789 = i + 1;
        }
    }

    @Override // l.InterfaceC20693
    public final void forEachRemaining(Consumer consumer) {
        C13016 c13016 = this.f4792;
        Object[] objArr = c13016.f43408;
        if (this.f4791) {
            this.f4791 = false;
            consumer.accept(objArr[c13016.f43409]);
            this.f4790++;
        }
        while (true) {
            int i = this.f4789;
            if (i >= this.f4788) {
                return;
            }
            Object obj = objArr[i];
            if (obj != null) {
                consumer.accept(obj);
                this.f4790++;
            }
            this.f4789++;
        }
    }

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return this.f4793 ? 1 : 65;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        boolean z = this.f4793;
        C13016 c13016 = this.f4792;
        if (!z) {
            return c13016.f43410 - this.f4790;
        }
        int i = c13016.f43410;
        long j = i - this.f4790;
        if (c13016.f43412) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c13016.f43409)) * ((double) (this.f4788 - this.f4789)))) + (this.f4791 ? 1L : 0L));
    }

    @Override // l.InterfaceC20693
    public final InterfaceC20693 trySplit() {
        int i;
        int i2 = this.f4789;
        int i3 = this.f4788;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        C1020 c1020 = new C1020(this.f4792, i2, i4, this.f4791);
        this.f4789 = i4;
        this.f4791 = false;
        this.f4793 = true;
        return c1020;
    }
}
