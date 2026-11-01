package l;

/* JADX INFO: renamed from: l.۠ۤۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8IH */
/* JADX INFO: loaded from: classes3.dex */
public final class C8106 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f28384;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8106 m21323(C2460 c2460) {
        String str;
        c2460.m7535(2);
        int iM7516 = c2460.m7516();
        int i = iM7516 >> 1;
        int iM7517 = ((c2460.m7516() >> 3) & 31) | ((iM7516 & 1) << 5);
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sbM23356 = C9023.m23356(str);
        sbM23356.append(i < 10 ? ".0" : ".");
        sbM23356.append(i);
        sbM23356.append(iM7517 < 10 ? ".0" : ".");
        sbM23356.append(iM7517);
        return new C8106(sbM23356.toString());
    }

    public C8106(String str) {
        this.f28384 = str;
    }
}
