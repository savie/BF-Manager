package l;

import java.util.Map;

/* JADX INFO: renamed from: l.۟ۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5U */
/* JADX INFO: loaded from: classes4.dex */
public final class C7225 extends C8679 implements Cloneable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f24055;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C7225 f24056;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C7225 f24057;

    public C7225() {
        super(0, null);
    }

    public C7225(int i, Object obj) {
        super(i, obj);
        this.f24055 = -1073741824;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C7225 m19226() {
        if ((this.f24055 & 1073741824) != 0) {
            return null;
        }
        return this.f24057;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C7225 m19236() {
        if ((this.f24055 & Integer.MIN_VALUE) != 0) {
            return null;
        }
        return this.f24056;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m19234() {
        return (this.f24055 & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m19230() {
        return (this.f24055 & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m19232(boolean z) {
        if (z) {
            this.f24055 |= 1073741824;
        } else {
            this.f24055 &= -1073741825;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m19227(boolean z) {
        this.f24055 &= Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19228(C7225 c7225) {
        this.f24055 |= 1073741824;
        this.f24057 = c7225;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m19231(C7225 c7225) {
        this.f24055 |= Integer.MIN_VALUE;
        this.f24056 = c7225;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m19235(C7225 c7225) {
        this.f24055 &= Integer.MAX_VALUE;
        this.f24056 = c7225;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m19233() {
        return (this.f24055 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19229(boolean z) {
        if (z) {
            this.f24055 |= 1;
        } else {
            this.f24055 &= -2;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C7225 m19238() {
        C7225 c7225 = this.f24056;
        if ((this.f24055 & Integer.MIN_VALUE) == 0) {
            while ((c7225.f24055 & 1073741824) == 0) {
                c7225 = c7225.f24057;
            }
        }
        return c7225;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C7225 m19237() {
        C7225 c7225 = this.f24057;
        if ((this.f24055 & 1073741824) == 0) {
            while ((c7225.f24055 & Integer.MIN_VALUE) == 0) {
                c7225 = c7225.f24056;
            }
        }
        return c7225;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f29882;
        this.f29882 = obj;
        return obj2;
    }

    public final C7225 clone() {
        try {
            C7225 c7225 = (C7225) super.clone();
            c7225.f29881 = this.f29881;
            c7225.f29882 = this.f29882;
            c7225.f24055 = this.f24055;
            return c7225;
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
