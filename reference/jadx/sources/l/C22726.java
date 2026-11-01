package l;

import java.util.Map;

/* JADX INFO: renamed from: l.᩺ۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5SO */
/* JADX INFO: loaded from: classes.dex */
public final class C22726 extends C5273 implements Cloneable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f74037;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C22726 f74038;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C22726 f74039;

    public C22726() {
        super((char) 0, null);
    }

    public C22726(char c, Object obj) {
        super(c, obj);
        this.f74037 = -1073741824;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C22726 m50385() {
        if ((this.f74037 & 1073741824) != 0) {
            return null;
        }
        return this.f74039;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C22726 m50390() {
        if ((this.f74037 & Integer.MIN_VALUE) != 0) {
            return null;
        }
        return this.f74038;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m50391() {
        return (this.f74037 & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m50389() {
        return (this.f74037 & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50384(boolean z) {
        if (z) {
            this.f74037 |= 1073741824;
        } else {
            this.f74037 &= -1073741825;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m50386(boolean z) {
        if (z) {
            this.f74037 |= Integer.MIN_VALUE;
        } else {
            this.f74037 &= Integer.MAX_VALUE;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50383(C22726 c22726) {
        this.f74037 |= 1073741824;
        this.f74039 = c22726;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m50388(C22726 c22726) {
        this.f74037 |= Integer.MIN_VALUE;
        this.f74038 = c22726;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50382(int i) {
        this.f74037 = (i & 255) | (this.f74037 & (-256));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C22726 m50381() {
        C22726 c22726 = this.f74038;
        if ((this.f74037 & Integer.MIN_VALUE) == 0) {
            while ((c22726.f74037 & 1073741824) == 0) {
                c22726 = c22726.f74039;
            }
        }
        return c22726;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C22726 m50387() {
        C22726 c22726 = this.f74039;
        if ((this.f74037 & 1073741824) == 0) {
            while ((c22726.f74037 & Integer.MIN_VALUE) == 0) {
                c22726 = c22726.f74038;
            }
        }
        return c22726;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f18266;
        this.f18266 = obj;
        return obj2;
    }

    public final C22726 clone() {
        try {
            C22726 c22726 = (C22726) super.clone();
            c22726.f18265 = this.f18265;
            c22726.f18266 = this.f18266;
            c22726.f74037 = this.f74037;
            return c22726;
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
        return this.f18265 == ((Character) entry.getKey()).charValue() && C13638.equals(this.f18266, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        char c = this.f18265;
        Object obj = this.f18266;
        return c ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return this.f18265 + "=>" + this.f18266;
    }
}
