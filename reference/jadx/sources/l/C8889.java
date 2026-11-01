package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۡ۫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: C1TT */
/* JADX INFO: loaded from: classes3.dex */
public final class C8889 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final String[] f30450 = {".*[^a-zA-Z0-9_$/].*", "[0oO]{3,}", "[Ii]{6,}"};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f30451 = new ArrayList();

    public C8889(String str) {
        int i = 0;
        if (str.isEmpty()) {
            while (i < 3) {
                this.f30451.add(new C23862(C14690.m35219(f30450[i])));
                i++;
            }
            return;
        }
        String[] strArrSplit = str.split("\n");
        int length = strArrSplit.length;
        while (i < length) {
            this.f30451.add(new C23862(C14690.m35219(strArrSplit[i])));
            i++;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m23037(String str) {
        return m23032(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m23034(String str) {
        if (!m23032(str)) {
            int iLastIndexOf = str.lastIndexOf(47);
            if (iLastIndexOf != -1) {
                str = str.substring(iLastIndexOf + 1);
            }
            int i = 0;
            while (true) {
                int iIndexOf = str.indexOf(36, i);
                if (iIndexOf != -1) {
                    if (!m23032(str.substring(i, iIndexOf))) {
                        i++;
                    }
                } else {
                    return m23032(str.substring(i));
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m23033(String str) {
        if (m23036(str)) {
            return true;
        }
        int i = 0;
        while (true) {
            int iIndexOf = str.indexOf(47, i);
            if (iIndexOf != -1) {
                if (m23032(str.substring(i, iIndexOf))) {
                    return true;
                }
                i++;
            } else {
                return m23032(str.substring(i));
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m23036(String str) {
        if (str.length() >= 20 && (str.length() > 100 || C6851.m18452(str, '/') > 10)) {
            return true;
        }
        return m23032(str);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m23035(String str) {
        return m23032(str);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private boolean m23032(String str) {
        ArrayList arrayList = this.f30451;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C6222 c6222 = ((C23862) arrayList.get(i)).get();
            c6222.m17276reset((CharSequence) str);
            if (c6222.matches()) {
                return true;
            }
        }
        return false;
    }
}
