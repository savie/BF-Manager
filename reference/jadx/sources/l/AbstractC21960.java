package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩹֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC21960 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f71253;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f71254;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f71255;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f71256;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3614 f71257;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f71258;

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC21960 mo6668(int i, int i2, boolean z);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo6669(int i, Object obj);

    public AbstractC21960(C3614 c3614) {
        this.f71257 = c3614;
        this.f71254 = 0;
        this.f71253 = c3614.f13287;
        this.f71255 = 0;
        this.f71256 = c3614.f13290;
        this.f71258 = false;
    }

    public AbstractC21960(C3614 c3614, int i, int i2, boolean z) {
        this.f71257 = c3614;
        this.f71255 = 0;
        this.f71254 = i;
        this.f71253 = i2;
        this.f71256 = z;
        this.f71258 = true;
    }

    public final boolean tryAdvance(Object obj) {
        boolean z = this.f71256;
        C3614 c3614 = this.f71257;
        if (z) {
            this.f71256 = false;
            this.f71255++;
            mo6669(c3614.f13287, obj);
            return true;
        }
        int[] iArr = c3614.f13284;
        while (true) {
            int i = this.f71254;
            if (i >= this.f71253) {
                return false;
            }
            if (iArr[i] != 0) {
                this.f71255++;
                this.f71254 = i + 1;
                mo6669(i, obj);
                return true;
            }
            this.f71254 = i + 1;
        }
    }

    public final void forEachRemaining(Object obj) {
        boolean z = this.f71256;
        C3614 c3614 = this.f71257;
        if (z) {
            this.f71256 = false;
            this.f71255++;
            mo6669(c3614.f13287, obj);
        }
        int[] iArr = c3614.f13284;
        while (true) {
            int i = this.f71254;
            if (i >= this.f71253) {
                return;
            }
            if (iArr[i] != 0) {
                mo6669(i, obj);
                this.f71255++;
            }
            this.f71254++;
        }
    }

    public final long estimateSize() {
        boolean z = this.f71258;
        C3614 c3614 = this.f71257;
        if (!z) {
            return c3614.f13294 - this.f71255;
        }
        int i = c3614.f13294;
        long j = i - this.f71255;
        if (c3614.f13290) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c3614.f13287)) * ((double) (this.f71253 - this.f71254)))) + (this.f71256 ? 1L : 0L));
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final AbstractC21960 m48793trySplit() {
        int i;
        int i2 = this.f71254;
        int i3 = this.f71253;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        AbstractC21960 abstractC21960Mo6668 = mo6668(i2, i4, this.f71256);
        this.f71254 = i4;
        this.f71256 = false;
        this.f71258 = true;
        return abstractC21960Mo6668;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return tryAdvance((Object) consumer);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC20693 m48792trySplit() {
        return (InterfaceC20693) m48793trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ InterfaceC10110 trySplit() {
        return (InterfaceC10110) m48793trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC18576 m48791trySplit() {
        return (InterfaceC18576) m48793trySplit();
    }
}
