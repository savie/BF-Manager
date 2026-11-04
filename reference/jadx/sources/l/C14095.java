package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.۬᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07SP */
/* JADX INFO: loaded from: classes4.dex */
public final class C14095 implements InterfaceC17958 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f44606 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f44607 = false;

    @Override // l.InterfaceC17958
    /* JADX INFO: renamed from: ۙ */
    public final C2076 mo2196(C3655 c3655) {
        C9753 c9753;
        C0805 c0805M11850 = c3655.m11850();
        C9753 c9753M3237 = c0805M11850.m3237();
        int iM3239 = c0805M11850.m3239('`');
        C9753 c9753M3238 = c0805M11850.m3237();
        boolean z = this.f44607;
        HashMap map = this.f44606;
        if (z && ((c9753 = (C9753) map.get(Integer.valueOf(iM3239))) == null || c9753.compareTo(c9753M3237) <= 0)) {
            return new C2076(new C24672(c0805M11850.m3230(c9753M3237, c9753M3238).m47873()), c9753M3238);
        }
        while (c0805M11850.m3228('`') > 0) {
            C9753 c9753M3239 = c0805M11850.m3237();
            int iM32310 = c0805M11850.m3239('`');
            map.put(Integer.valueOf(iM32310), c9753M3239);
            if (iM32310 == iM3239) {
                C12516 c12516 = new C12516();
                String strReplace = c0805M11850.m3230(c9753M3238, c9753M3239).m47873().replace('\n', ' ');
                if (strReplace.length() >= 3) {
                    int i = 0;
                    if (strReplace.charAt(0) == ' ' && C22313.m50373(1, strReplace) == ' ') {
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
                            strReplace = C1402.m5124(1, 1, strReplace);
                        }
                    }
                }
                c12516.m31070(strReplace);
                return new C2076(c12516, c0805M11850.m3237());
            }
        }
        this.f44607 = true;
        return new C2076(new C24672(c0805M11850.m3230(c9753M3237, c9753M3238).m47873()), c9753M3238);
    }
}
