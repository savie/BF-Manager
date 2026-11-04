package l;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۨۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: S3QK */
/* JADX INFO: loaded from: classes3.dex */
public final class C12266 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C12266 f39443 = m30637(new Locale[0]);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC24201 f39444;

    public C12266(InterfaceC24201 interfaceC24201) {
        this.f39444 = interfaceC24201;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12266 m30635(LocaleList localeList) {
        return new C12266(new C4063(localeList));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12266 m30637(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return m30635(C20471.m46975(localeArr));
        }
        return new C12266(new C6301(localeArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Locale m30639(int i) {
        return this.f39444.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m30640() {
        return this.f39444.isEmpty();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m30642() {
        return this.f39444.size();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m30641() {
        return this.f39444.mo13118();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C12266 m30638() {
        return f39443;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12266 m30636(String str) {
        if (str == null || str.isEmpty()) {
            return f39443;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = C3317.m10932(strArrSplit[i]);
        }
        return m30637(localeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C12266) {
            return this.f39444.equals(((C12266) obj).f39444);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39444.hashCode();
    }

    public final String toString() {
        return this.f39444.toString();
    }
}
