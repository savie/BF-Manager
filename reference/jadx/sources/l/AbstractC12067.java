package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۨۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12067 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f38859;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f38860;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f38861;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f38862;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3864 f38863;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f38864;

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC12067 mo28611(int i, int i2, boolean z);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo28612(int i, Object obj);

    public AbstractC12067(C3864 c3864) {
        this.f38863 = c3864;
        this.f38860 = 0;
        this.f38862 = c3864.f13187;
        this.f38861 = 0;
        this.f38859 = c3864.f13190;
        this.f38864 = false;
    }

    public AbstractC12067(C3864 c3864, int i, int i2, boolean z) {
        this.f38863 = c3864;
        this.f38861 = 0;
        this.f38860 = i;
        this.f38862 = i2;
        this.f38859 = z;
        this.f38864 = true;
    }

    public boolean tryAdvance(Consumer consumer) {
        boolean z = this.f38859;
        C3864 c3864 = this.f38863;
        if (z) {
            this.f38859 = false;
            this.f38861++;
            mo28612(c3864.f13187, consumer);
        } else {
            Object[] objArr = c3864.f13181;
            while (true) {
                int i = this.f38860;
                if (i >= this.f38862) {
                    return false;
                }
                if (objArr[i] != null) {
                    this.f38861++;
                    this.f38860 = i + 1;
                    mo28612(i, consumer);
                } else {
                    this.f38860 = i + 1;
                }
            }
        }
        return true;
    }

    public void forEachRemaining(Consumer consumer) {
        boolean z = this.f38859;
        C3864 c3864 = this.f38863;
        if (z) {
            this.f38859 = false;
            this.f38861++;
            mo28612(c3864.f13187, consumer);
        }
        Object[] objArr = c3864.f13181;
        while (true) {
            int i = this.f38860;
            if (i >= this.f38862) {
                return;
            }
            if (objArr[i] != null) {
                mo28612(i, consumer);
                this.f38861++;
            }
            this.f38860++;
        }
    }

    public final long estimateSize() {
        boolean z = this.f38864;
        C3864 c3864 = this.f38863;
        if (!z) {
            return c3864.f13183 - this.f38861;
        }
        int i = c3864.f13183;
        long j = i - this.f38861;
        if (c3864.f13190) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c3864.f13187)) * ((double) (this.f38862 - this.f38860)))) + (this.f38859 ? 1L : 0L));
    }

    public InterfaceC8409 trySplit() {
        Object objMo28611;
        int i;
        int i2 = this.f38860;
        int i3 = this.f38862;
        if (i2 < i3 - 1 && (i = (i3 - i2) >> 1) > 1) {
            int i4 = i + i2;
            objMo28611 = mo28611(i2, i4, this.f38859);
            this.f38860 = i4;
            this.f38859 = false;
            this.f38864 = true;
        } else {
            objMo28611 = null;
        }
        return (InterfaceC8409) objMo28611;
    }
}
