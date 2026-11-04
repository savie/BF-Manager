package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۡ᩶᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X5U */
/* JADX INFO: loaded from: classes4.dex */
public final class C9630 extends C0991 implements Cloneable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C9630 f31138;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C9630 f31139;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f31140;

    public C9630() {
        super(0, null);
    }

    public C9630(int i, Object obj) {
        super(i, obj);
        this.f31140 = -1073741824;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C9630 m25133() {
        if ((this.f31140 & 1073741824) != 0) {
            return null;
        }
        return this.f31138;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C9630 m25137() {
        if ((this.f31140 & Integer.MIN_VALUE) != 0) {
            return null;
        }
        return this.f31139;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m25132() {
        return (this.f31140 & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m25129() {
        return (this.f31140 & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m25135(boolean z) {
        if (z) {
            this.f31140 |= 1073741824;
        } else {
            this.f31140 &= -1073741825;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m25141(boolean z) {
        this.f31140 &= Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25130(C9630 c9630) {
        this.f31140 |= 1073741824;
        this.f31138 = c9630;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m25134(C9630 c9630) {
        this.f31140 |= Integer.MIN_VALUE;
        this.f31139 = c9630;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m25139(C9630 c9630) {
        this.f31140 &= Integer.MAX_VALUE;
        this.f31139 = c9630;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m25140() {
        return (this.f31140 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25131(boolean z) {
        if (z) {
            this.f31140 |= 1;
        } else {
            this.f31140 &= -2;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9630 m25136() {
        C9630 c9630 = this.f31139;
        if ((this.f31140 & Integer.MIN_VALUE) == 0) {
            while ((c9630.f31140 & 1073741824) == 0) {
                c9630 = c9630.f31138;
            }
        }
        return c9630;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C9630 m25138() {
        C9630 c9630 = this.f31138;
        if ((this.f31140 & 1073741824) == 0) {
            while ((c9630.f31140 & Integer.MIN_VALUE) == 0) {
                c9630 = c9630.f31139;
            }
        }
        return c9630;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f3593;
        this.f3593 = obj;
        return obj2;
    }

    public final C9630 clone() {
        try {
            C9630 c9630 = (C9630) super.clone();
            c9630.f3592 = this.f3592;
            c9630.f3593 = this.f3593;
            c9630.f31140 = this.f31140;
            return c9630;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.f3592 == ((Integer) entry.getKey()).intValue() && C17359.equals(this.f3593, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int i = this.f3592;
        Object obj = this.f3593;
        return i ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return this.f3592 + "=>" + this.f3593;
    }
}
