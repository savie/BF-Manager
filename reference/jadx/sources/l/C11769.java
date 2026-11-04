package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۧܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T1PJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C11769 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean f38033;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f38034;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f38035;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f38036;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return (!this.f38034 ? 1 : 0) - (!((C11769) obj).f38034 ? 1 : 0);
    }

    public C11769(String str, boolean z) {
        if (str.startsWith("!") || str.startsWith("！")) {
            str = str.substring(1);
            this.f38034 = true;
        } else {
            this.f38034 = false;
        }
        if (str.endsWith("**")) {
            this.f38036 = 2;
            this.f38035 = C1402.m5124(2, 0, str);
        } else if (str.endsWith("*")) {
            this.f38036 = 1;
            this.f38035 = C1402.m5124(1, 0, str);
        } else {
            this.f38036 = 0;
            this.f38035 = str;
        }
        this.f38033 = z;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0044 A[RETURN] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29546(String str) {
        String str2 = this.f38035;
        int i = this.f38036;
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
            if (strSubstring.isEmpty() || (this.f38033 && strSubstring.charAt(0) == '$' && strSubstring.indexOf(46) == -1)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static InterfaceC4787 m29545(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : str.split("\n")) {
            if (!str2.isEmpty()) {
                C11769 c11769 = new C11769(str2, false);
                if (c11769.f38034) {
                    arrayList2.add(c11769);
                } else {
                    arrayList.add(c11769);
                }
            }
        }
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            return new C3769();
        }
        return new C2075(arrayList2, arrayList);
    }
}
