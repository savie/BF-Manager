package l;

/* JADX INFO: renamed from: l.ᩳ᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: JAWY */
/* JADX INFO: loaded from: classes4.dex */
public final class C18298 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f58385;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f58386;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18298)) {
            return false;
        }
        C18298 c18298 = (C18298) obj;
        return this.f58385 == c18298.f58385 && C13465.m32965(this.f58386, c18298.f58386);
    }

    public final int hashCode() {
        int i = this.f58385 * 31;
        Object obj = this.f58386;
        return i + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f58385 + ", value=" + this.f58386 + ')';
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m42507() {
        return this.f58386;
    }

    public C18298(int i, Object obj) {
        this.f58385 = i;
        this.f58386 = obj;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m42508() {
        return this.f58385;
    }
}
