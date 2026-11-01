package l;

/* JADX INFO: renamed from: l.ۤ۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Z90G */
/* JADX INFO: loaded from: classes4.dex */
public final class C10174 extends AbstractC15175 {
    /* JADX WARN: Code duplicated, block: B:41:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:68:0x0135  */
    @Override // l.InterfaceC17996
    /* JADX INFO: renamed from: ۙ */
    public final C3822 mo3830(C8057 c8057, InterfaceC18702 interfaceC18702) {
        int i;
        C7351 c7351;
        if (c8057.mo21201() < 4) {
            C11647 line = c8057.getLine();
            int iMo21197 = c8057.mo21197();
            if (line.m29102().charAt(iMo21197) == '#') {
                C11647 c11647M29103 = line.m29103(iMo21197, line.m29102().length());
                C2473 c2473 = new C2473();
                c2473.m7584(c11647M29103);
                C6707 c6707M18124 = C6707.m18124(c2473);
                int iM18137 = c6707M18124.m18137('#');
                if (iM18137 == 0 || iM18137 > 6) {
                    c7351 = null;
                } else if (c6707M18124.m18132()) {
                    char cM18135 = c6707M18124.m18135();
                    if (cM18135 == ' ' || cM18135 == '\t') {
                        c6707M18124.m18126();
                        C3884 c3884M18139 = c6707M18124.m18139();
                        C3884 c3884M181310 = c3884M18139;
                        loop0: while (true) {
                            boolean z = true;
                            while (true) {
                                if (!c6707M18124.m18132()) {
                                    break loop0;
                                }
                                char cM18136 = c6707M18124.m18135();
                                if (cM18136 == '\t' || cM18136 == ' ') {
                                    c6707M18124.m18138();
                                } else {
                                    if (cM18136 != '#') {
                                        c6707M18124.m18138();
                                        c3884M181310 = c6707M18124.m18139();
                                    } else if (z) {
                                        c6707M18124.m18137('#');
                                        int iM18126 = c6707M18124.m18126();
                                        if (c6707M18124.m18132()) {
                                            c3884M181310 = c6707M18124.m18139();
                                        }
                                        if (iM18126 > 0) {
                                        }
                                    } else {
                                        c6707M18124.m18138();
                                        c3884M181310 = c6707M18124.m18139();
                                    }
                                    z = false;
                                }
                            }
                        }
                        C2473 c2473M18130 = c6707M18124.m18130(c3884M18139, c3884M181310);
                        c7351 = c2473M18130.m7583().isEmpty() ? new C7351(iM18137, new C2473()) : new C7351(iM18137, c2473M18130);
                    } else {
                        c7351 = null;
                    }
                } else {
                    c7351 = new C7351(iM18137, new C2473());
                }
                if (c7351 != null) {
                    C3822 c3822 = new C3822(c7351);
                    c3822.m11116(line.m29102().length());
                    return c3822;
                }
            }
            CharSequence charSequenceM29102 = line.m29102();
            char cCharAt = charSequenceM29102.charAt(iMo21197);
            if (cCharAt == '-') {
                int length = charSequenceM29102.length();
                for (int i2 = iMo21197 + 1; i2 < length; i2++) {
                    if (charSequenceM29102.charAt(i2) != '-') {
                        length = i2;
                        break;
                    }
                }
                if (C22851.m50577(length, charSequenceM29102.length(), charSequenceM29102) >= charSequenceM29102.length()) {
                    i = 2;
                } else {
                    i = 0;
                }
            } else if (cCharAt != '=') {
                i = 0;
            } else {
                int length2 = charSequenceM29102.length();
                for (int i3 = iMo21197 + 1; i3 < length2; i3++) {
                    if (charSequenceM29102.charAt(i3) != '=') {
                        length2 = i3;
                        break;
                    }
                }
                if (C22851.m50577(length2, charSequenceM29102.length(), charSequenceM29102) >= charSequenceM29102.length()) {
                    i = 1;
                } else {
                    i = 0;
                }
            }
            if (i > 0) {
                C2473 c2473Mo41745 = ((C17934) interfaceC18702).mo41745();
                if (!c2473Mo41745.m7582()) {
                    C3822 c3823 = new C3822(new C7351(i, c2473Mo41745));
                    c3823.m11116(line.m29102().length());
                    c3823.m11114(c2473Mo41745.m7586().size());
                    return c3823;
                }
            }
        }
        return null;
    }
}
