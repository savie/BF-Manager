package l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۡ᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37TO */
/* JADX INFO: loaded from: classes4.dex */
public final class C9620 implements InterfaceC17958 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C12210 f31115;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Pattern f31116;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Pattern f31117;

    static {
        C20415 c20415M30483 = C12210.m30483();
        c20415M30483.m46828('<');
        c20415M30483.m46828('>');
        f31115 = c20415M30483.m46827();
        f31116 = Pattern.compile("^[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*$");
        f31117 = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*+$");
    }

    @Override // l.InterfaceC17958
    /* JADX INFO: renamed from: ۙ */
    public final C2076 mo2196(C3655 c3655) {
        String strM56409;
        C0805 c0805M11850 = c3655.m11850();
        c0805M11850.m3240();
        C9753 c9753M3237 = c0805M11850.m3237();
        int i = 0;
        while (true) {
            char cM3234 = c0805M11850.m3234();
            if (cM3234 == 0) {
                i = -1;
                break;
            }
            if (f31115.m30485(cM3234)) {
                break;
            }
            i++;
            c0805M11850.m3240();
        }
        if (i > 0 && c0805M11850.m3234() == '>') {
            C20942 c20942M3230 = c0805M11850.m3230(c9753M3237, c0805M11850.m3237());
            String strM47873 = c20942M3230.m47873();
            c0805M11850.m3240();
            if (f31116.matcher(strM47873).matches()) {
                strM56409 = strM47873;
            } else {
                strM56409 = f31117.matcher(strM47873).matches() ? C25272.m56409("mailto:", strM47873) : null;
            }
            if (strM56409 != null) {
                C2821 c2821 = new C2821(strM56409, null);
                C24672 c24672 = new C24672(strM47873);
                c24672.m14255(c20942M3230.m47875());
                c2821.m14256(c24672);
                return new C2076(c2821, c0805M11850.m3237());
            }
        }
        return null;
    }
}
