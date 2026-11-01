package l;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: l.ᩳۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: S3QK */
/* JADX INFO: loaded from: classes4.dex */
public final class C17855 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C17855 f56546 = m41447(new Locale[0]);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7978 f56547;

    public C17855(InterfaceC7978 interfaceC7978) {
        this.f56547 = interfaceC7978;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17855 m41445(LocaleList localeList) {
        return new C17855(new C19267(localeList));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object m41449() {
        return this.f56547.mo21043();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17855 m41447(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return m41445(C21383.m47934(localeArr));
        }
        return new C17855(new C18561(localeArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Locale m41450(int i) {
        return this.f56547.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m41451() {
        return this.f56547.isEmpty();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m41453() {
        return this.f56547.size();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m41452() {
        return this.f56547.mo21042();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C17855 m41448() {
        return f56546;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17855 m41446(String str) {
        if (str == null || str.isEmpty()) {
            return f56546;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = C15034.m36020(strArrSplit[i]);
        }
        return m41447(localeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C17855) {
            return this.f56547.equals(((C17855) obj).f56547);
        }
        return false;
    }

    public final int hashCode() {
        return this.f56547.hashCode();
    }

    public final String toString() {
        return this.f56547.toString();
    }
}
