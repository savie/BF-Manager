package l;

/* JADX INFO: renamed from: l.۠ۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: D8TG */
/* JADX INFO: loaded from: classes3.dex */
public final class C8402 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f27516;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f27517;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f27518;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f27519;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object f27520;

    public C8402(Object obj) {
        this(-1L, obj);
    }

    public C8402(long j, Object obj) {
        this(obj, -1, -1, j, -1);
    }

    public C8402(int i, long j, Object obj) {
        this(obj, -1, -1, j, i);
    }

    public C8402(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    public C8402(Object obj, int i, int i2, long j, int i3) {
        this.f27520 = obj;
        this.f27516 = i;
        this.f27519 = i2;
        this.f27518 = j;
        this.f27517 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8402 m22580(Object obj) {
        if (this.f27520.equals(obj)) {
            return this;
        }
        return new C8402(obj, this.f27516, this.f27519, this.f27518, this.f27517);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m22581() {
        return this.f27516 != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8402)) {
            return false;
        }
        C8402 c8402 = (C8402) obj;
        return this.f27520.equals(c8402.f27520) && this.f27516 == c8402.f27516 && this.f27519 == c8402.f27519 && this.f27518 == c8402.f27518 && this.f27517 == c8402.f27517;
    }

    public final int hashCode() {
        return ((((((((this.f27520.hashCode() + 527) * 31) + this.f27516) * 31) + this.f27519) * 31) + ((int) this.f27518)) * 31) + this.f27517;
    }
}
