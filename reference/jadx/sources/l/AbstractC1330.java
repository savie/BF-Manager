package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֨᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1330 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f5631;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f5632;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f5633;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f5634;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6975 f5635;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f5636;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC1330 mo4727(int i, int i2, boolean z);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo4728(int i, Object obj);

    public AbstractC1330(C6975 c6975) {
        this.f5635 = c6975;
        this.f5632 = 0;
        this.f5631 = c6975.f23479;
        this.f5633 = 0;
        this.f5634 = c6975.f23475;
        this.f5636 = false;
    }

    public AbstractC1330(C6975 c6975, int i, int i2, boolean z) {
        this.f5635 = c6975;
        this.f5633 = 0;
        this.f5632 = i;
        this.f5631 = i2;
        this.f5634 = z;
        this.f5636 = true;
    }

    public boolean tryAdvance(Consumer consumer) {
        boolean z = this.f5634;
        C6975 c6975 = this.f5635;
        if (z) {
            this.f5634 = false;
            this.f5633++;
            mo4728(c6975.f23479, consumer);
        } else {
            Object[] objArr = c6975.f23476;
            while (true) {
                int i = this.f5632;
                if (i >= this.f5631) {
                    return false;
                }
                if (objArr[i] != null) {
                    this.f5633++;
                    this.f5632 = i + 1;
                    mo4728(i, consumer);
                } else {
                    this.f5632 = i + 1;
                }
            }
        }
        return true;
    }

    public void forEachRemaining(Consumer consumer) {
        boolean z = this.f5634;
        C6975 c6975 = this.f5635;
        if (z) {
            this.f5634 = false;
            this.f5633++;
            mo4728(c6975.f23479, consumer);
        }
        Object[] objArr = c6975.f23476;
        while (true) {
            int i = this.f5632;
            if (i >= this.f5631) {
                return;
            }
            if (objArr[i] != null) {
                mo4728(i, consumer);
                this.f5633++;
            }
            this.f5632++;
        }
    }

    public final long estimateSize() {
        boolean z = this.f5636;
        C6975 c6975 = this.f5635;
        if (!z) {
            return c6975.f23474 - this.f5633;
        }
        int i = c6975.f23474;
        long j = i - this.f5633;
        if (c6975.f23475) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c6975.f23479)) * ((double) (this.f5631 - this.f5632)))) + (this.f5634 ? 1L : 0L));
    }

    public InterfaceC20693 trySplit() {
        Object objMo4727;
        int i;
        int i2 = this.f5632;
        int i3 = this.f5631;
        if (i2 < i3 - 1 && (i = (i3 - i2) >> 1) > 1) {
            int i4 = i + i2;
            objMo4727 = mo4727(i2, i4, this.f5634);
            this.f5632 = i4;
            this.f5634 = false;
            this.f5636 = true;
        } else {
            objMo4727 = null;
        }
        return (InterfaceC20693) objMo4727;
    }
}
