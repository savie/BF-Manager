package l;

/* JADX INFO: renamed from: l.᩸ܿۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97SA */
/* JADX INFO: loaded from: classes.dex */
public final class C22959 implements InterfaceC17958 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C12210 f74580;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C12210 f74581;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C12210 f74582;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C12210 f74583;

    static {
        C20415 c20415M30483 = C12210.m30483();
        c20415M30483.m46829('0', '9');
        c20415M30483.m46829('A', 'F');
        c20415M30483.m46829('a', 'f');
        f74583 = c20415M30483.m46827();
        C20415 c20415M30484 = C12210.m30483();
        c20415M30484.m46829('0', '9');
        f74580 = c20415M30484.m46827();
        C20415 c20415M30485 = C12210.m30483();
        c20415M30485.m46829('A', 'Z');
        c20415M30485.m46829('a', 'z');
        C12210 c12210M46827 = c20415M30485.m46827();
        f74581 = c12210M46827;
        C20415 c20415M30486 = c12210M46827.m30484();
        c20415M30486.m46829('0', '9');
        f74582 = c20415M30486.m46827();
    }

    @Override // l.InterfaceC17958
    /* JADX INFO: renamed from: ۙ */
    public final C2076 mo2196(C3655 c3655) {
        C0805 c0805M11850 = c3655.m11850();
        C9753 c9753M3237 = c0805M11850.m3237();
        c0805M11850.m3240();
        char cM3234 = c0805M11850.m3234();
        if (cM3234 == '#') {
            c0805M11850.m3240();
            if (c0805M11850.m3235('x') || c0805M11850.m3235('X')) {
                int iM3229 = c0805M11850.m3229(f74583);
                if (1 > iM3229 || iM3229 > 6 || !c0805M11850.m3235(';')) {
                    return null;
                }
                return m51784(c9753M3237, c0805M11850);
            }
            int iM32210 = c0805M11850.m3229(f74580);
            if (1 > iM32210 || iM32210 > 7 || !c0805M11850.m3235(';')) {
                return null;
            }
            return m51784(c9753M3237, c0805M11850);
        }
        if (!f74581.m30485(cM3234)) {
            return null;
        }
        c0805M11850.m3229(f74582);
        if (c0805M11850.m3235(';')) {
            return m51784(c9753M3237, c0805M11850);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2076 m51784(C9753 c9753, C0805 c0805) {
        return new C2076(new C24672(C17737.m41545(c0805.m3230(c9753, c0805.m3237()).m47873())), c0805.m3237());
    }
}
