package l;

/* JADX INFO: renamed from: l.ᩴᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: JAWY */
/* JADX INFO: loaded from: classes5.dex */
public final class C20004 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f64280;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object f64281;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20004)) {
            return false;
        }
        C20004 c20004 = (C20004) obj;
        return this.f64280 == c20004.f64280 && C15243.m36589(this.f64281, c20004.f64281);
    }

    public final int hashCode() {
        int i = this.f64280 * 31;
        Object obj = this.f64281;
        return i + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f64280 + ", value=" + this.f64281 + ')';
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m46013() {
        return this.f64281;
    }

    public C20004(int i, Object obj) {
        this.f64280 = i;
        this.f64281 = obj;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m46014() {
        return this.f64280;
    }
}
