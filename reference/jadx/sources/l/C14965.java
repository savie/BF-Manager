package l;

import android.app.Person;
import android.os.PersistableBundle;

/* JADX INFO: renamed from: l.ܳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 374 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14965 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f48874;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f48875;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f48876;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f48877;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f48878;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14965 m36024(PersistableBundle persistableBundle) {
        return C22425.m50571(persistableBundle);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final PersistableBundle m36026() {
        return C22425.m50570(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Person m36025() {
        return C19441.m44929(this);
    }

    public final int hashCode() {
        String str = this.f48875;
        return str != null ? str.hashCode() : C17359.hash(this.f48878, this.f48876, Boolean.valueOf(this.f48874), Boolean.valueOf(this.f48877));
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C14965)) {
            return false;
        }
        C14965 c14965 = (C14965) obj;
        String str = this.f48875;
        String str2 = c14965.f48875;
        if (str == null && str2 == null) {
            return C17359.equals(C17359.toString(this.f48878), C17359.toString(c14965.f48878)) && C17359.equals(this.f48876, c14965.f48876) && Boolean.valueOf(this.f48874).equals(Boolean.valueOf(c14965.f48874)) && Boolean.valueOf(this.f48877).equals(Boolean.valueOf(c14965.f48877));
        }
        return C17359.equals(str, str2);
    }
}
