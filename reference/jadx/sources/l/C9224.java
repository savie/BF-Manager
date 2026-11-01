package l;

import android.app.Person;
import android.os.PersistableBundle;

/* JADX INFO: renamed from: l.ۢ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 374 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9224 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f31356;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C16775 f31357;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public CharSequence f31358;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f31359;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f31360;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f31361;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9224 m23745(PersistableBundle persistableBundle) {
        return C14163.m34237(persistableBundle);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final PersistableBundle m23747() {
        return C14163.m34236(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Person m23746() {
        return C1461.m5075(this);
    }

    public final int hashCode() {
        String str = this.f31356;
        return str != null ? str.hashCode() : C13638.hash(this.f31358, this.f31361, Boolean.valueOf(this.f31360), Boolean.valueOf(this.f31359));
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C9224)) {
            return false;
        }
        C9224 c9224 = (C9224) obj;
        String str = this.f31356;
        String str2 = c9224.f31356;
        if (str == null && str2 == null) {
            return C13638.equals(C13638.toString(this.f31358), C13638.toString(c9224.f31358)) && C13638.equals(this.f31361, c9224.f31361) && Boolean.valueOf(this.f31360).equals(Boolean.valueOf(c9224.f31360)) && Boolean.valueOf(this.f31359).equals(Boolean.valueOf(c9224.f31359));
        }
        return C13638.equals(str, str2);
    }
}
