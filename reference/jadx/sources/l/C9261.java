package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۢ֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0JF */
/* JADX INFO: loaded from: classes4.dex */
public final class C9261 extends C8679 implements Cloneable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f31484;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C9261 f31485;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C9261 f31486;

    public C9261() {
        super(0, null);
    }

    public C9261(int i, Object obj) {
        super(i, obj);
        this.f31484 = -1073741824;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C9261 m23789() {
        if ((this.f31484 & 1073741824) != 0) {
            return null;
        }
        return this.f31486;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C9261 m23794() {
        if ((this.f31484 & Integer.MIN_VALUE) != 0) {
            return null;
        }
        return this.f31485;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m23795() {
        return (this.f31484 & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m23793() {
        return (this.f31484 & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23788(boolean z) {
        if (z) {
            this.f31484 |= 1073741824;
        } else {
            this.f31484 &= -1073741825;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m23790(boolean z) {
        if (z) {
            this.f31484 |= Integer.MIN_VALUE;
        } else {
            this.f31484 &= Integer.MAX_VALUE;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23787(C9261 c9261) {
        this.f31484 |= 1073741824;
        this.f31486 = c9261;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m23792(C9261 c9261) {
        this.f31484 |= Integer.MIN_VALUE;
        this.f31485 = c9261;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23786(int i) {
        this.f31484 = (i & 255) | (this.f31484 & (-256));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C9261 m23785() {
        C9261 c9261 = this.f31485;
        if ((this.f31484 & Integer.MIN_VALUE) == 0) {
            while ((c9261.f31484 & 1073741824) == 0) {
                c9261 = c9261.f31486;
            }
        }
        return c9261;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C9261 m23791() {
        C9261 c9261 = this.f31486;
        if ((this.f31484 & 1073741824) == 0) {
            while ((c9261.f31484 & Integer.MIN_VALUE) == 0) {
                c9261 = c9261.f31485;
            }
        }
        return c9261;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f29882;
        this.f29882 = obj;
        return obj2;
    }

    public final C9261 clone() {
        try {
            C9261 c9261 = (C9261) super.clone();
            c9261.f29881 = this.f29881;
            c9261.f29882 = this.f29882;
            c9261.f31484 = this.f31484;
            return c9261;
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
        return this.f29881 == ((Integer) entry.getKey()).intValue() && C13638.equals(this.f29882, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int i = this.f29881;
        Object obj = this.f29882;
        return i ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return this.f29881 + "=>" + this.f29882;
    }
}
