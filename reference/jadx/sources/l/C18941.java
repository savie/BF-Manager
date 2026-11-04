package l;

/* JADX INFO: renamed from: l.ᩳ۠ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 367O */
/* JADX INFO: loaded from: classes4.dex */
public class C18941 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object f61428;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f61429;

    public C18941(Object obj, Object obj2) {
        this.f61428 = obj;
        this.f61429 = obj2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C18941 c18941 = (C18941) obj;
        if (this.f61428.equals(c18941.f61428)) {
            return this.f61429.equals(c18941.f61429);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f61428;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f61429;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{ " + this.f61428 + ", " + this.f61429 + " }";
    }
}
