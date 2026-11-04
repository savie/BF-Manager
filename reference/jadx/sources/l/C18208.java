package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܿ۠᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C59 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18208 implements InterfaceC2546 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f59455;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f59456;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f59457;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f59458;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0309 f59459;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f59460;

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

    public C18208(C0309 c0309) {
        this.f59459 = c0309;
        this.f59456 = 0;
        this.f59458 = c0309.f1660;
        this.f59457 = 0;
        this.f59455 = c0309.f1661;
        this.f59460 = false;
    }

    public C18208(C0309 c0309, int i, int i2, boolean z) {
        this.f59459 = c0309;
        this.f59457 = 0;
        this.f59456 = i;
        this.f59458 = i2;
        this.f59455 = z;
        this.f59460 = true;
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final boolean tryAdvance(Consumer consumer) {
        boolean z = this.f59455;
        C0309 c0309 = this.f59459;
        if (z) {
            this.f59455 = false;
            this.f59457++;
            consumer.accept(c0309.f1662[c0309.f1660]);
            return true;
        }
        Object[] objArr = c0309.f1662;
        while (true) {
            int i = this.f59456;
            if (i >= this.f59458) {
                return false;
            }
            Object obj = objArr[i];
            if (obj != null) {
                this.f59457++;
                this.f59456 = i + 1;
                consumer.accept(obj);
                return true;
            }
            this.f59456 = i + 1;
        }
    }

    @Override // l.InterfaceC8409
    public final void forEachRemaining(Consumer consumer) {
        C0309 c0309 = this.f59459;
        Object[] objArr = c0309.f1662;
        if (this.f59455) {
            this.f59455 = false;
            consumer.accept(objArr[c0309.f1660]);
            this.f59457++;
        }
        while (true) {
            int i = this.f59456;
            if (i >= this.f59458) {
                return;
            }
            Object obj = objArr[i];
            if (obj != null) {
                consumer.accept(obj);
                this.f59457++;
            }
            this.f59456++;
        }
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return this.f59460 ? 1 : 65;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        boolean z = this.f59460;
        C0309 c0309 = this.f59459;
        if (!z) {
            return c0309.f1658 - this.f59457;
        }
        int i = c0309.f1658;
        long j = i - this.f59457;
        if (c0309.f1661) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c0309.f1660)) * ((double) (this.f59458 - this.f59456)))) + (this.f59455 ? 1L : 0L));
    }

    @Override // l.InterfaceC8409
    public final InterfaceC8409 trySplit() {
        int i;
        int i2 = this.f59456;
        int i3 = this.f59458;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        C18208 c18208 = new C18208(this.f59459, i2, i4, this.f59455);
        this.f59456 = i4;
        this.f59455 = false;
        this.f59460 = true;
        return c18208;
    }
}
