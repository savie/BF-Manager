package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1TT */
/* JADX INFO: loaded from: classes2.dex */
public final class C3483 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final String[] f12035 = {".*[^a-zA-Z0-9_$/].*", "[0oO]{3,}", "[Ii]{6,}"};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f12036 = new ArrayList();

    public C3483(String str) {
        int i = 0;
        if (str.isEmpty()) {
            while (i < 3) {
                this.f12036.add(new C21399(C18415.m42925(f12035[i])));
                i++;
            }
            return;
        }
        String[] strArrSplit = str.split("\n");
        int length = strArrSplit.length;
        while (i < length) {
            this.f12036.add(new C21399(C18415.m42925(strArrSplit[i])));
            i++;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m11446(String str) {
        return m11442(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m11443(String str) {
        if (!m11442(str)) {
            int iLastIndexOf = str.lastIndexOf(47);
            if (iLastIndexOf != -1) {
                str = str.substring(iLastIndexOf + 1);
            }
            int i = 0;
            while (true) {
                int iIndexOf = str.indexOf(36, i);
                if (iIndexOf != -1) {
                    if (!m11442(str.substring(i, iIndexOf))) {
                        i++;
                    }
                } else {
                    return m11442(str.substring(i));
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m11447(String str) {
        if (m11444(str)) {
            return true;
        }
        int i = 0;
        while (true) {
            int iIndexOf = str.indexOf(47, i);
            if (iIndexOf != -1) {
                if (m11442(str.substring(i, iIndexOf))) {
                    return true;
                }
                i++;
            } else {
                return m11442(str.substring(i));
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m11444(String str) {
        if (str.length() >= 20 && (str.length() > 100 || C24276.m54279(str, '/') > 10)) {
            return true;
        }
        return m11442(str);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m11445(String str) {
        return m11442(str);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private boolean m11442(String str) {
        ArrayList arrayList = this.f12036;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C4245 c4245 = ((C21399) arrayList.get(i)).get();
            c4245.m13568reset((CharSequence) str);
            if (c4245.matches()) {
                return true;
            }
        }
        return false;
    }
}
