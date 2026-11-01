package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩸ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC21357 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f69475;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f69476;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f69477;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f69478;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7952 f69479;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f69480;

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC21357 mo10882(int i, int i2, boolean z);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo10883(int i, Object obj);

    public AbstractC21357(C7952 c7952) {
        this.f69479 = c7952;
        this.f69476 = 0;
        this.f69475 = c7952.f26126;
        this.f69477 = 0;
        this.f69478 = c7952.f26122;
        this.f69480 = false;
    }

    public AbstractC21357(C7952 c7952, int i, int i2, boolean z) {
        this.f69479 = c7952;
        this.f69477 = 0;
        this.f69476 = i;
        this.f69475 = i2;
        this.f69478 = z;
        this.f69480 = true;
    }

    public final boolean tryAdvance(Object obj) {
        boolean z = this.f69478;
        C7952 c7952 = this.f69479;
        if (z) {
            this.f69478 = false;
            this.f69477++;
            mo10883(c7952.f26126, obj);
            return true;
        }
        char[] cArr = c7952.f26123;
        while (true) {
            int i = this.f69476;
            if (i >= this.f69475) {
                return false;
            }
            if (cArr[i] != 0) {
                this.f69477++;
                this.f69476 = i + 1;
                mo10883(i, obj);
                return true;
            }
            this.f69476 = i + 1;
        }
    }

    public final void forEachRemaining(Object obj) {
        boolean z = this.f69478;
        C7952 c7952 = this.f69479;
        if (z) {
            this.f69478 = false;
            this.f69477++;
            mo10883(c7952.f26126, obj);
        }
        char[] cArr = c7952.f26123;
        while (true) {
            int i = this.f69476;
            if (i >= this.f69475) {
                return;
            }
            if (cArr[i] != 0) {
                mo10883(i, obj);
                this.f69477++;
            }
            this.f69476++;
        }
    }

    public final long estimateSize() {
        boolean z = this.f69480;
        C7952 c7952 = this.f69479;
        if (!z) {
            return c7952.f26121 - this.f69477;
        }
        int i = c7952.f26121;
        long j = i - this.f69477;
        if (c7952.f26122) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c7952.f26126)) * ((double) (this.f69475 - this.f69476)))) + (this.f69478 ? 1L : 0L));
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final AbstractC21357 m47888trySplit() {
        int i;
        int i2 = this.f69476;
        int i3 = this.f69475;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        AbstractC21357 abstractC21357Mo10882 = mo10882(i2, i4, this.f69478);
        this.f69476 = i4;
        this.f69478 = false;
        this.f69480 = true;
        return abstractC21357Mo10882;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return tryAdvance((Object) consumer);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC20693 m47887trySplit() {
        return (InterfaceC20693) m47888trySplit();
    }

    public /* bridge */ /* synthetic */ InterfaceC10110 trySplit() {
        return (InterfaceC10110) m47888trySplit();
    }
}
