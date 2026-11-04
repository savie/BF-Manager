package l;

/* JADX INFO: renamed from: l.ᩳۘܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: IAH0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18817 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f61151;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C18817 f61150 = new C18817("tableDirectory");

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C18817 f61149 = new C18817("name");

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C18817 f61148 = new C18817("OS/2");

    public C18817(String str) {
        this.f61151 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18817 m43671(String str) {
        return new C18817(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C18817) {
            return this.f61151.equals(((C18817) obj).f61151);
        }
        return false;
    }

    public final int hashCode() {
        return this.f61151.hashCode();
    }

    public final String toString() {
        return this.f61151;
    }
}
