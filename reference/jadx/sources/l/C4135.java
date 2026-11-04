package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۘۨۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5SH */
/* JADX INFO: loaded from: classes2.dex */
public final class C4135 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6373 f14029;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C6373 f14030;

    public C4135() {
        C6373 c6373 = new C6373(0, 0);
        this.f14030 = c6373;
        C6373 c6374 = new C6373(0, 0);
        this.f14029 = c6374;
        c6373.f21524 = c6374;
        c6374.f21527 = c6373;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x010a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0114 A[EDGE_INSN: B:81:0x0114->B:60:0x0114 BREAK  A[LOOP:4: B:46:0x00dc->B:82:0x00dc], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00dc A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m13260(List list) {
        C24273 c24273;
        C6373 c6373;
        int i;
        int i2;
        ArrayList arrayList;
        Iterator it;
        InterfaceC9376 interfaceC9376;
        String strMo11196;
        String strMo11197;
        C24273 c24274;
        C4135 c4135 = new C4135();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC4685 interfaceC4685 = (InterfaceC4685) it2.next();
            int iMo4114 = interfaceC4685.mo4114();
            int iMo4115 = interfaceC4685.mo4115() + iMo4114;
            if (iMo4114 != iMo4115) {
                for (InterfaceC9376 interfaceC9377 : interfaceC4685.mo4116()) {
                    C6373 c6373M18111 = c4135.f14030.f21524;
                    while (true) {
                        C6373 c6374 = c4135.f14029;
                        if (c6373M18111 != c6374) {
                            int i3 = c6373M18111.f21525;
                            int i4 = c6373M18111.f21523;
                            if (iMo4114 != i3) {
                                if (iMo4114 > i3 && iMo4114 < i4) {
                                    c6373M18111 = c6373M18111.m18111(iMo4114);
                                } else if (iMo4114 >= i3) {
                                    c6373M18111 = c6373M18111.f21524;
                                } else {
                                    if (iMo4115 <= i3) {
                                        C6373 c6375 = new C6373(iMo4114, iMo4115);
                                        c6373M18111.m18112(c6375);
                                        c24273 = new C24273(c6375, c6375);
                                    } else {
                                        C6373 c6376 = new C6373(iMo4114, i3);
                                        c6373M18111.m18112(c6376);
                                        c6373M18111 = c6376;
                                    }
                                    c6373 = c24273.f78585;
                                    i = iMo4114;
                                    do {
                                        i2 = c6373.f21525;
                                        if (i2 > i) {
                                            C6373 c6377 = new C6373(i, i2);
                                            c6373.m18112(c6377);
                                            c6373 = c6377;
                                        }
                                        arrayList = c6373.f21526;
                                        it = arrayList.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                interfaceC9376 = (InterfaceC9376) it.next();
                                                strMo11196 = interfaceC9376.mo11196();
                                                strMo11197 = interfaceC9377.mo11196();
                                                if (strMo11196 != null) {
                                                    if (strMo11196.equals(strMo11197)) {
                                                        break;
                                                    }
                                                } else {
                                                    if (strMo11197 == null) {
                                                        if (interfaceC9376.mo11197() == interfaceC9377.mo11197()) {
                                                            break;
                                                        }
                                                        throw new C12338(null, "Multiple overlapping catch all handlers with different handlers", new Object[0]);
                                                    }
                                                }
                                            } else {
                                                arrayList.add(interfaceC9377);
                                                break;
                                            }
                                        }
                                        i = c6373.f21523;
                                        c6373 = c6373.f21524;
                                    } while (c6373.f21527 != c24273.f78584);
                                }
                            }
                        } else {
                            c6373M18111 = null;
                        }
                        if (c6373M18111 == null) {
                            C6373 c6378 = new C6373(iMo4114, iMo4115);
                            c6374.m18112(c6378);
                            c24274 = new C24273(c6378, c6378);
                        } else {
                            C6373 c6379 = c6373M18111;
                            while (true) {
                                if (c6379 != c6374) {
                                    int i5 = c6379.f21525;
                                    int i6 = c6379.f21523;
                                    if (iMo4115 == i6) {
                                        c24274 = new C24273(c6373M18111, c6379);
                                    } else if (iMo4115 > i5 && iMo4115 < i6) {
                                        c6379.m18111(iMo4115);
                                        c24274 = new C24273(c6373M18111, c6379);
                                    } else {
                                        if (iMo4115 <= i5) {
                                            C6373 c63710 = new C6373(c6379.f21527.f21523, iMo4115);
                                            c6379.m18112(c63710);
                                            c24273 = new C24273(c6373M18111, c63710);
                                            break;
                                        }
                                        c6379 = c6379.f21524;
                                    }
                                } else {
                                    C6373 c63711 = new C6373(c6374.f21527.f21523, iMo4115);
                                    c6374.m18112(c63711);
                                    c24274 = new C24273(c6373M18111, c63711);
                                }
                            }
                            c6373 = c24273.f78585;
                            i = iMo4114;
                            do {
                                i2 = c6373.f21525;
                                if (i2 > i) {
                                    C6373 c63712 = new C6373(i, i2);
                                    c6373.m18112(c63712);
                                    c6373 = c63712;
                                }
                                arrayList = c6373.f21526;
                                it = arrayList.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        interfaceC9376 = (InterfaceC9376) it.next();
                                        strMo11196 = interfaceC9376.mo11196();
                                        strMo11197 = interfaceC9377.mo11196();
                                        if (strMo11196 != null) {
                                            if (strMo11196.equals(strMo11197)) {
                                                break;
                                                break;
                                            }
                                        } else {
                                            if (strMo11197 == null) {
                                                if (interfaceC9376.mo11197() == interfaceC9377.mo11197()) {
                                                    break;
                                                }
                                                throw new C12338(null, "Multiple overlapping catch all handlers with different handlers", new Object[0]);
                                            }
                                        }
                                    } else {
                                        arrayList.add(interfaceC9377);
                                        break;
                                    }
                                }
                                i = c6373.f21523;
                                c6373 = c6373.f21524;
                            } while (c6373.f21527 != c24273.f78584);
                        }
                        c24273 = c24274;
                        c6373 = c24273.f78585;
                        i = iMo4114;
                        do {
                            i2 = c6373.f21525;
                            if (i2 > i) {
                                C6373 c63713 = new C6373(i, i2);
                                c6373.m18112(c63713);
                                c6373 = c63713;
                            }
                            arrayList = c6373.f21526;
                            it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    interfaceC9376 = (InterfaceC9376) it.next();
                                    strMo11196 = interfaceC9376.mo11196();
                                    strMo11197 = interfaceC9377.mo11196();
                                    if (strMo11196 != null) {
                                        if (strMo11196.equals(strMo11197)) {
                                            break;
                                            break;
                                        }
                                    } else {
                                        if (strMo11197 == null) {
                                            if (interfaceC9376.mo11197() == interfaceC9377.mo11197()) {
                                                break;
                                            }
                                            throw new C12338(null, "Multiple overlapping catch all handlers with different handlers", new Object[0]);
                                        }
                                    }
                                } else {
                                    arrayList.add(interfaceC9377);
                                    break;
                                }
                            }
                            i = c6373.f21523;
                            c6373 = c6373.f21524;
                        } while (c6373.f21527 != c24273.f78584);
                    }
                }
            }
        }
        return C4583.m14374(new C20543(c4135));
    }
}
