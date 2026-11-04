package l;

/* JADX INFO: renamed from: l.ۚۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 367O */
/* JADX INFO: loaded from: classes2.dex */
public final class C5558 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f19300;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object f19301;

    public C5558(Object obj, Object obj2) {
        this.f19300 = obj;
        this.f19301 = obj2;
    }

    public final String toString() {
        return "Pair[" + this.f19300 + "," + this.f19301 + "]";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5558)) {
            return false;
        }
        C5558 c5558 = (C5558) obj;
        return C17359.equals(this.f19300, c5558.f19300) && C17359.equals(this.f19301, c5558.f19301);
    }

    public final int hashCode() {
        Object obj = this.f19301;
        Object obj2 = this.f19300;
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
