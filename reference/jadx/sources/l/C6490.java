package l;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.ۜۗ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 54F8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6490 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC21307 f21885;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C14440 f21886;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Map f21884 = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f21887 = "GET";

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C5972 f21888 = new C5972();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17684(C14440 c14440) {
        if (c14440 == null) {
            throw new NullPointerException("url == null");
        }
        this.f21886 = c14440;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m17686(String str) {
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
            this.f21886 = C14440.m34732(str);
        }
        sb = new StringBuilder("http:");
        i = 3;
        str = C0242.m1616(i, str, sb);
        this.f21886 = C14440.m34732(str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m17687(String str, String str2) {
        C5972 c5972 = this.f21888;
        c5972.getClass();
        C10912.m27343(str);
        C10912.m27341(str2, str);
        c5972.m16268(str);
        c5972.m16270(str, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17680(String str, String str2) {
        this.f21888.m16267(str, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17679(String str) {
        this.f21888.m16268(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17682(C10912 c10912) {
        this.f21888 = c10912.m27346();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17683(C13734 c13734) {
        String string = c13734.toString();
        if (!string.isEmpty()) {
            C5972 c5972 = this.f21888;
            c5972.getClass();
            C10912.m27343("Cache-Control");
            C10912.m27341(string, "Cache-Control");
            c5972.m16268("Cache-Control");
            c5972.m16270("Cache-Control", string);
            return;
        }
        this.f21888.m16268("Cache-Control");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m17685() {
        m17681("GET", (AbstractC21307) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17681(String str, AbstractC21307 abstractC21307) {
        if (str == null) {
            throw new NullPointerException("method == null");
        }
        if (str.length() == 0) {
            throw new IllegalArgumentException("method.length() == 0");
        }
        if (abstractC21307 != null && !C12123.m30173(str)) {
            throw new IllegalArgumentException(C16523.m38890("method ", str, " must not have a request body."));
        }
        if (abstractC21307 == null && (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT"))) {
            throw new IllegalArgumentException(C16523.m38890("method ", str, " must have a request body."));
        }
        this.f21887 = str;
        this.f21885 = abstractC21307;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22719 m17678() {
        if (this.f21886 == null) {
            throw new IllegalStateException("url == null");
        }
        return new C22719(this);
    }
}
