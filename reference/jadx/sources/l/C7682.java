package l;

/* JADX INFO: renamed from: l.۟᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 97SA */
/* JADX INFO: loaded from: classes3.dex */
public final class C7682 implements InterfaceC5296 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C9531 f25445;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C9531 f25446;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C9531 f25447;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C9531 f25448;

    static {
        C1768 c1768M24375 = C9531.m24375();
        c1768M24375.m5810('0', '9');
        c1768M24375.m5810('A', 'F');
        c1768M24375.m5810('a', 'f');
        f25445 = c1768M24375.m5808();
        C1768 c1768M24376 = C9531.m24375();
        c1768M24376.m5810('0', '9');
        f25446 = c1768M24376.m5808();
        C1768 c1768M24377 = C9531.m24375();
        c1768M24377.m5810('A', 'Z');
        c1768M24377.m5810('a', 'z');
        C9531 c9531M5808 = c1768M24377.m5808();
        f25447 = c9531M5808;
        C1768 c1768M24378 = c9531M5808.m24376();
        c1768M24378.m5810('0', '9');
        f25448 = c1768M24378.m5808();
    }

    @Override // l.InterfaceC5296
    /* JADX INFO: renamed from: ۙ */
    public final C16854 mo14672(C1706 c1706) {
        C6707 c6707M5679 = c1706.m5679();
        C3884 c3884M18139 = c6707M5679.m18139();
        c6707M5679.m18138();
        char cM18135 = c6707M5679.m18135();
        if (cM18135 == '#') {
            c6707M5679.m18138();
            if (c6707M5679.m18136('x') || c6707M5679.m18136('X')) {
                int iM18129 = c6707M5679.m18129(f25445);
                if (1 > iM18129 || iM18129 > 6 || !c6707M5679.m18136(';')) {
                    return null;
                }
                return m20309(c3884M18139, c6707M5679);
            }
            int iM181210 = c6707M5679.m18129(f25446);
            if (1 > iM181210 || iM181210 > 7 || !c6707M5679.m18136(';')) {
                return null;
            }
            return m20309(c3884M18139, c6707M5679);
        }
        if (!f25447.m24377(cM18135)) {
            return null;
        }
        c6707M5679.m18129(f25448);
        if (c6707M5679.m18136(';')) {
            return m20309(c3884M18139, c6707M5679);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16854 m20309(C3884 c3884, C6707 c6707) {
        return new C16854(new C17250(C11210.m28154(c6707.m18130(c3884, c6707.m18139()).m7583())), c6707.m18139());
    }
}
