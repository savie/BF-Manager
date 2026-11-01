package l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܶ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 37TO */
/* JADX INFO: loaded from: classes4.dex */
public final class C15444 implements InterfaceC5296 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C9531 f50329;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Pattern f50330;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Pattern f50331;

    static {
        C1768 c1768M24375 = C9531.m24375();
        c1768M24375.m5809('<');
        c1768M24375.m5809('>');
        f50329 = c1768M24375.m5808();
        f50330 = Pattern.compile("^[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*$");
        f50331 = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*+$");
    }

    @Override // l.InterfaceC5296
    /* JADX INFO: renamed from: ۙ */
    public final C16854 mo14672(C1706 c1706) {
        String strM1693;
        C6707 c6707M5679 = c1706.m5679();
        c6707M5679.m18138();
        C3884 c3884M18139 = c6707M5679.m18139();
        int i = 0;
        while (true) {
            char cM18135 = c6707M5679.m18135();
            if (cM18135 == 0) {
                i = -1;
                break;
            }
            if (f50329.m24377(cM18135)) {
                break;
            }
            i++;
            c6707M5679.m18138();
        }
        if (i > 0 && c6707M5679.m18135() == '>') {
            C2473 c2473M18130 = c6707M5679.m18130(c3884M18139, c6707M5679.m18139());
            String strM7583 = c2473M18130.m7583();
            c6707M5679.m18138();
            if (f50330.matcher(strM7583).matches()) {
                strM1693 = strM7583;
            } else {
                strM1693 = f50331.matcher(strM7583).matches() ? C0252.m1693("mailto:", strM7583) : null;
            }
            if (strM1693 != null) {
                C21483 c21483 = new C21483(strM1693, null);
                C17250 c17250 = new C17250(strM7583);
                c17250.m44384(c2473M18130.m7585());
                c21483.m44388(c17250);
                return new C16854(c21483, c6707M5679.m18139());
            }
        }
        return null;
    }
}
