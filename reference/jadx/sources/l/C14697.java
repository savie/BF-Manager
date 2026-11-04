package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ܰܶ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 5SO */
/* JADX INFO: loaded from: classes5.dex */
public final class C14697 extends C20709 implements Cloneable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C14697 f48033;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C14697 f48034;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f48035;

    public C14697() {
        super((char) 0, null);
    }

    public C14697(char c, Object obj) {
        super(c, obj);
        this.f48035 = -1073741824;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14697 m35371() {
        if ((this.f48035 & 1073741824) != 0) {
            return null;
        }
        return this.f48033;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C14697 m35370() {
        if ((this.f48035 & Integer.MIN_VALUE) != 0) {
            return null;
        }
        return this.f48034;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m35368() {
        return (this.f48035 & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m35369() {
        return (this.f48035 & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35364(boolean z) {
        if (z) {
            this.f48035 |= 1073741824;
        } else {
            this.f48035 &= -1073741825;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m35367(boolean z) {
        if (z) {
            this.f48035 |= Integer.MIN_VALUE;
        } else {
            this.f48035 &= Integer.MAX_VALUE;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35363(C14697 c14697) {
        this.f48035 |= 1073741824;
        this.f48033 = c14697;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m35372(C14697 c14697) {
        this.f48035 |= Integer.MIN_VALUE;
        this.f48034 = c14697;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35362(int i) {
        this.f48035 = (i & 255) | (this.f48035 & (-256));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C14697 m35366() {
        C14697 c14697 = this.f48034;
        if ((this.f48035 & Integer.MIN_VALUE) == 0) {
            while ((c14697.f48035 & 1073741824) == 0) {
                c14697 = c14697.f48033;
            }
        }
        return c14697;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C14697 m35365() {
        C14697 c14697 = this.f48033;
        if ((this.f48035 & 1073741824) == 0) {
            while ((c14697.f48035 & Integer.MIN_VALUE) == 0) {
                c14697 = c14697.f48034;
            }
        }
        return c14697;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f66378;
        this.f66378 = obj;
        return obj2;
    }

    public final C14697 clone() {
        try {
            C14697 c14697 = (C14697) super.clone();
            c14697.f66377 = this.f66377;
            c14697.f66378 = this.f66378;
            c14697.f48035 = this.f48035;
            return c14697;
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
        return this.f66377 == ((Character) entry.getKey()).charValue() && C17359.equals(this.f66378, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        char c = this.f66377;
        Object obj = this.f66378;
        return c ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return this.f66377 + "=>" + this.f66378;
    }
}
