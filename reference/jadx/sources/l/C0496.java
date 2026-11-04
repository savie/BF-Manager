package l;

import java.util.Collections;
import java.util.Map;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.֡ܳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54F8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0496 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC10190 f2143;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C16903 f2145;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Map f2147 = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f2144 = "GET";

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C1988 f2146 = new C1988();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2395(C16903 c16903) {
        if (c16903 == null) {
            throw new NullPointerException("url == null");
        }
        this.f2145 = c16903;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m2397(String str) {
        StringBuilder sb;
        int i;
        if (str == null) {
            throw new NullPointerException("url == null");
        }
        if (!str.regionMatches(true, 0, "ws:", 0, 3)) {
            if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                sb = new StringBuilder("https:");
                i = 4;
            }
            this.f2145 = C16903.m39861(str);
        }
        sb = new StringBuilder("http:");
        i = 3;
        str = ExternalValue$$ExternalSyntheticOutline0.m(i, str, sb);
        this.f2145 = C16903.m39861(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m2398(String str, String str2) {
        C1988 c1988 = this.f2146;
        c1988.getClass();
        C11682.m29359(str);
        C11682.m29357(str2, str);
        c1988.m6812(str);
        c1988.m6814(str, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2391(String str, String str2) {
        this.f2146.m6811(str, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2390(String str) {
        this.f2146.m6812(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2393(C11682 c11682) {
        this.f2146 = c11682.m29362();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2394(C12560 c12560) {
        String string = c12560.toString();
        if (!string.isEmpty()) {
            C1988 c1988 = this.f2146;
            c1988.getClass();
            C11682.m29359("Cache-Control");
            C11682.m29357(string, "Cache-Control");
            c1988.m6812("Cache-Control");
            c1988.m6814("Cache-Control", string);
            return;
        }
        this.f2146.m6812("Cache-Control");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m2396() {
        m2392("GET", (AbstractC10190) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2392(String str, AbstractC10190 abstractC10190) {
        if (str == null) {
            throw new NullPointerException("method == null");
        }
        if (str.length() == 0) {
            throw new IllegalArgumentException("method.length() == 0");
        }
        if (abstractC10190 != null && !C15407.m36887(str)) {
            throw new IllegalArgumentException(C14442.m34865("method ", str, " must not have a request body."));
        }
        if (abstractC10190 == null && (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT"))) {
            throw new IllegalArgumentException(C14442.m34865("method ", str, " must have a request body."));
        }
        this.f2144 = str;
        this.f2143 = abstractC10190;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7954 m2389() {
        if (this.f2145 == null) {
            throw new IllegalStateException("url == null");
        }
        return new C7954(this);
    }
}
