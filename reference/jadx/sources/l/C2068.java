package l;

/* JADX INFO: renamed from: l.֫᩷۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 367O */
/* JADX INFO: loaded from: classes2.dex */
public final class C2068 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f7664;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f7665;

    public C2068(Object obj, Object obj2) {
        this.f7664 = obj;
        this.f7665 = obj2;
    }

    public final String toString() {
        return "Pair[" + this.f7664 + "," + this.f7665 + "]";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2068)) {
            return false;
        }
        C2068 c2068 = (C2068) obj;
        return C13638.equals(this.f7664, c2068.f7664) && C13638.equals(this.f7665, c2068.f7665);
    }

    public final int hashCode() {
        Object obj = this.f7665;
        Object obj2 = this.f7664;
        if (obj2 == null) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode() + 1;
        }
        if (obj == null) {
            return obj2.hashCode() + 2;
        }
        return obj.hashCode() + (obj2.hashCode() * 17);
    }
}
