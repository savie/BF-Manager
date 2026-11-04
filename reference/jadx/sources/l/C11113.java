package l;

import android.text.TextUtils;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: renamed from: l.ۤ᩶۫, reason: contains not printable characters */
/* JADX INFO: compiled from: F7U3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11113 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f35037;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f35038;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f35039;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f35040;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f35041;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f35042;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f35043;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f35044;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11113 m28063(int i, AbstractC0148 abstractC0148) {
        if (abstractC0148 instanceof C9423) {
            return new C11113(i, (C9423) abstractC0148);
        }
        throw new RuntimeException();
    }

    public C11113(int i, C9423 c9423) {
        this.f35038 = i;
        this.f35037 = c9423.f30575;
        this.f35040 = c9423.f30578;
        this.f35044 = c9423.f30581;
        this.f35043 = c9423.f30580;
        this.f35039 = c9423.f30576;
        this.f35041 = c9423.f30579;
        this.f35042 = c9423.f30577 == 5;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final URI m28064() {
        String strConcat = this.f35039;
        if (TextUtils.isEmpty(strConcat)) {
            return null;
        }
        String lowerCase = strConcat.toLowerCase();
        if (!lowerCase.startsWith("http://") && !lowerCase.startsWith("https://")) {
            strConcat = "https://".concat(strConcat);
        }
        try {
            return new URI(strConcat);
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C11113.class == obj.getClass()) {
            C11113 c11113 = (C11113) obj;
            if (this.f35038 == c11113.f35038 && this.f35037.equals(c11113.f35037) && this.f35040.equals(c11113.f35040) && this.f35044.equals(c11113.f35044) && this.f35043.equals(c11113.f35043) && this.f35039.equals(c11113.f35039) && this.f35041 == c11113.f35041 && this.f35042 == c11113.f35042) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((C12351.m30817(C12351.m30817(C12351.m30817(C12351.m30817(C12351.m30817(this.f35038 * 31, 31, this.f35037), 31, this.f35040), 31, this.f35044), 31, this.f35043), 31, this.f35039) + (this.f35041 ? 1231 : 1237)) * 31) + (this.f35042 ? 1231 : 1237);
    }
}
