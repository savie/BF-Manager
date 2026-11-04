package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۧܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 0JF */
/* JADX INFO: loaded from: classes4.dex */
public final class C11670 extends C0991 implements Cloneable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C11670 f37812;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C11670 f37813;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f37814;

    public C11670() {
        super(0, null);
    }

    public C11670(int i, Object obj) {
        super(i, obj);
        this.f37814 = -1073741824;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C11670 m29349() {
        if ((this.f37814 & 1073741824) != 0) {
            return null;
        }
        return this.f37812;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C11670 m29348() {
        if ((this.f37814 & Integer.MIN_VALUE) != 0) {
            return null;
        }
        return this.f37813;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m29346() {
        return (this.f37814 & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m29347() {
        return (this.f37814 & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29342(boolean z) {
        if (z) {
            this.f37814 |= 1073741824;
        } else {
            this.f37814 &= -1073741825;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m29345(boolean z) {
        if (z) {
            this.f37814 |= Integer.MIN_VALUE;
        } else {
            this.f37814 &= Integer.MAX_VALUE;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29341(C11670 c11670) {
        this.f37814 |= 1073741824;
        this.f37812 = c11670;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29350(C11670 c11670) {
        this.f37814 |= Integer.MIN_VALUE;
        this.f37813 = c11670;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29340(int i) {
        this.f37814 = (i & 255) | (this.f37814 & (-256));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C11670 m29344() {
        C11670 c11670 = this.f37813;
        if ((this.f37814 & Integer.MIN_VALUE) == 0) {
            while ((c11670.f37814 & 1073741824) == 0) {
                c11670 = c11670.f37812;
            }
        }
        return c11670;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C11670 m29343() {
        C11670 c11670 = this.f37812;
        if ((this.f37814 & 1073741824) == 0) {
            while ((c11670.f37814 & Integer.MIN_VALUE) == 0) {
                c11670 = c11670.f37813;
            }
        }
        return c11670;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f3593;
        this.f3593 = obj;
        return obj2;
    }

    public final C11670 clone() {
        try {
            C11670 c11670 = (C11670) super.clone();
            c11670.f3592 = this.f3592;
            c11670.f3593 = this.f3593;
            c11670.f37814 = this.f37814;
            return c11670;
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
