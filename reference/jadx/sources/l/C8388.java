package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.۠᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 07SP */
/* JADX INFO: loaded from: classes3.dex */
public final class C8388 implements InterfaceC5296 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f29128 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f29129 = false;

    @Override // l.InterfaceC5296
    /* JADX INFO: renamed from: ۙ */
    public final C16854 mo14672(C1706 c1706) {
        C3884 c3884;
        C6707 c6707M5679 = c1706.m5679();
        C3884 c3884M18139 = c6707M5679.m18139();
        int iM18137 = c6707M5679.m18137('`');
        C3884 c3884M181310 = c6707M5679.m18139();
        boolean z = this.f29129;
        HashMap map = this.f29128;
        if (z && ((c3884 = (C3884) map.get(Integer.valueOf(iM18137))) == null || c3884.compareTo(c3884M18139) <= 0)) {
            return new C16854(new C17250(c6707M5679.m18130(c3884M18139, c3884M181310).m7583()), c3884M181310);
        }
        while (c6707M5679.m18128('`') > 0) {
            C3884 c3884M181311 = c6707M5679.m18139();
            int iM18138 = c6707M5679.m18137('`');
            map.put(Integer.valueOf(iM18138), c3884M181311);
            if (iM18138 == iM18137) {
                C3447 c3447 = new C3447();
                String strReplace = c6707M5679.m18130(c3884M181310, c3884M181311).m7583().replace('\n', ' ');
                if (strReplace.length() >= 3) {
                    int i = 0;
                    if (strReplace.charAt(0) == ' ' && C3184.m9601(1, strReplace) == ' ') {
                        int length = strReplace.length();
                        while (true) {
                            if (i >= length) {
                                i = length;
                                break;
                            }
                            if (strReplace.charAt(i) != ' ') {
                                break;
                            }
                            i++;
                        }
                        if (i != length) {
                            strReplace = C20630.m46498(1, 1, strReplace);
                        }
                    }
                }
                c3447.m10157(strReplace);
                return new C16854(c3447, c6707M5679.m18139());
            }
        }
        this.f29129 = true;
        return new C16854(new C17250(c6707M5679.m18130(c3884M18139, c3884M181310).m7583()), c3884M181310);
    }
}
