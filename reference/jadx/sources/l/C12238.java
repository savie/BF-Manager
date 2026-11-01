package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫ۜۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: T1PJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C12238 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f40966;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f40967;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f40968;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f40969;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return (!this.f40967 ? 1 : 0) - (!((C12238) obj).f40967 ? 1 : 0);
    }

    public C12238(String str, boolean z) {
        if (str.startsWith("!") || str.startsWith("！")) {
            str = str.substring(1);
            this.f40967 = true;
        } else {
            this.f40967 = false;
        }
        if (str.endsWith("**")) {
            this.f40969 = 2;
            this.f40966 = C20630.m46498(2, 0, str);
        } else if (str.endsWith("*")) {
            this.f40969 = 1;
            this.f40966 = C20630.m46498(1, 0, str);
        } else {
            this.f40969 = 0;
            this.f40966 = str;
        }
        this.f40968 = z;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0044 A[RETURN] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m30440(String str) {
        String str2 = this.f40966;
        int i = this.f40969;
        if (i != 0) {
            if (i == 1) {
                if (str.startsWith(str2) && str.indexOf(46, str2.length()) == -1) {
                    return true;
                }
                return false;
            }
            return str.startsWith(str2);
        }
        if (str.startsWith(str2)) {
            String strSubstring = str.substring(str2.length());
            if (strSubstring.isEmpty() || (this.f40968 && strSubstring.charAt(0) == '$' && strSubstring.indexOf(46) == -1)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InterfaceC3183 m30439(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : str.split("\n")) {
            if (!str2.isEmpty()) {
                C12238 c12238 = new C12238(str2, false);
                if (c12238.f40967) {
                    arrayList2.add(c12238);
                } else {
                    arrayList.add(c12238);
                }
            }
        }
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            return new C0242(0);
        }
        return new C16471(arrayList2, arrayList);
    }
}
