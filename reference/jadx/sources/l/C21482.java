package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩸ۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C59 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21482 implements InterfaceC7371 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f69803;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f69804;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f69805;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f69806;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17954 f69807;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f69808;

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

    public C21482(C17954 c17954) {
        this.f69807 = c17954;
        this.f69804 = 0;
        this.f69803 = c17954.f57421;
        this.f69805 = 0;
        this.f69806 = c17954.f57424;
        this.f69808 = false;
    }

    public C21482(C17954 c17954, int i, int i2, boolean z) {
        this.f69807 = c17954;
        this.f69805 = 0;
        this.f69804 = i;
        this.f69803 = i2;
        this.f69806 = z;
        this.f69808 = true;
    }

    @Override // l.InterfaceC20693
    public final boolean tryAdvance(Consumer consumer) {
        boolean z = this.f69806;
        C17954 c17954 = this.f69807;
        if (z) {
            this.f69806 = false;
            this.f69805++;
            consumer.accept(c17954.f57420[c17954.f57421]);
            return true;
        }
        Object[] objArr = c17954.f57420;
        while (true) {
            int i = this.f69804;
            if (i >= this.f69803) {
                return false;
            }
            Object obj = objArr[i];
            if (obj != null) {
                this.f69805++;
                this.f69804 = i + 1;
                consumer.accept(obj);
                return true;
            }
            this.f69804 = i + 1;
        }
    }

    @Override // l.InterfaceC20693
    public final void forEachRemaining(Consumer consumer) {
        C17954 c17954 = this.f69807;
        Object[] objArr = c17954.f57420;
        if (this.f69806) {
            this.f69806 = false;
            consumer.accept(objArr[c17954.f57421]);
            this.f69805++;
        }
        while (true) {
            int i = this.f69804;
            if (i >= this.f69803) {
                return;
            }
            Object obj = objArr[i];
            if (obj != null) {
                consumer.accept(obj);
                this.f69805++;
            }
            this.f69804++;
        }
    }

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return this.f69808 ? 1 : 65;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        boolean z = this.f69808;
        C17954 c17954 = this.f69807;
        if (!z) {
            return c17954.f57422 - this.f69805;
        }
        int i = c17954.f57422;
        long j = i - this.f69805;
        if (c17954.f57424) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c17954.f57421)) * ((double) (this.f69803 - this.f69804)))) + (this.f69806 ? 1L : 0L));
    }

    @Override // l.InterfaceC20693
    public final InterfaceC20693 trySplit() {
        int i;
        int i2 = this.f69804;
        int i3 = this.f69803;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        C21482 c21482 = new C21482(this.f69807, i2, i4, this.f69806);
        this.f69804 = i4;
        this.f69806 = false;
        this.f69808 = true;
        return c21482;
    }
}
