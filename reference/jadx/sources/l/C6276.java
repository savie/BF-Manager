package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۛ۠᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: VFO */
/* JADX INFO: loaded from: classes3.dex */
public final class C6276 implements InterfaceC2546 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f21307;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f21308;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f21309;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f21310;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24176 f21311;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f21312;

    @Override // l.InterfaceC8409
    public /* synthetic */ Comparator getComparator() {
        return C18105.$default$getComparator(this);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ long getExactSizeIfKnown() {
        return C18105.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C18105.$default$hasCharacteristics(this, i);
    }

    public C6276(C24176 c24176) {
        this.f21311 = c24176;
        this.f21308 = 0;
        this.f21310 = c24176.f78307;
        this.f21309 = 0;
        this.f21307 = c24176.f78308;
        this.f21312 = false;
    }

    public C6276(C24176 c24176, int i, int i2, boolean z) {
        this.f21311 = c24176;
        this.f21309 = 0;
        this.f21308 = i;
        this.f21310 = i2;
        this.f21307 = z;
        this.f21312 = true;
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final boolean tryAdvance(Consumer consumer) {
        boolean z = this.f21307;
        C24176 c24176 = this.f21311;
        if (z) {
            this.f21307 = false;
            this.f21309++;
            consumer.accept(c24176.f78309[c24176.f78307]);
            return true;
        }
        Object[] objArr = c24176.f78309;
        while (true) {
            int i = this.f21308;
            if (i >= this.f21310) {
                return false;
            }
            Object obj = objArr[i];
            if (obj != null) {
                this.f21309++;
                this.f21308 = i + 1;
                consumer.accept(obj);
                return true;
            }
            this.f21308 = i + 1;
        }
    }

    @Override // l.InterfaceC8409
    public final void forEachRemaining(Consumer consumer) {
        C24176 c24176 = this.f21311;
        Object[] objArr = c24176.f78309;
        if (this.f21307) {
            this.f21307 = false;
            consumer.accept(objArr[c24176.f78307]);
            this.f21309++;
        }
        while (true) {
            int i = this.f21308;
            if (i >= this.f21310) {
                return;
            }
            Object obj = objArr[i];
            if (obj != null) {
                consumer.accept(obj);
                this.f21309++;
            }
            this.f21308++;
        }
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return this.f21312 ? 1 : 65;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        boolean z = this.f21312;
        C24176 c24176 = this.f21311;
        if (!z) {
            return c24176.f78304 - this.f21309;
        }
        int i = c24176.f78304;
        long j = i - this.f21309;
        if (c24176.f78308) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c24176.f78307)) * ((double) (this.f21310 - this.f21308)))) + (this.f21307 ? 1L : 0L));
    }

    @Override // l.InterfaceC8409
    public final InterfaceC8409 trySplit() {
        int i;
        int i2 = this.f21308;
        int i3 = this.f21310;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        C6276 c6276 = new C6276(this.f21311, i2, i4, this.f21307);
        this.f21308 = i4;
        this.f21307 = false;
        this.f21312 = true;
        return c6276;
    }
}
