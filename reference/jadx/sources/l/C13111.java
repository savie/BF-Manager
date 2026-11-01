package l;

/* JADX INFO: renamed from: l.۬۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 367O */
/* JADX INFO: loaded from: classes3.dex */
public class C13111 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Object f43679;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f43680;

    public C13111(Object obj, Object obj2) {
        this.f43679 = obj;
        this.f43680 = obj2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C13111 c13111 = (C13111) obj;
        if (this.f43679.equals(c13111.f43679)) {
            return this.f43680.equals(c13111.f43680);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f43679;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f43680;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{ " + this.f43679 + ", " + this.f43680 + " }";
    }
}
