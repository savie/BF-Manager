package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۖܶۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5SH */
/* JADX INFO: loaded from: classes2.dex */
public final class C2609 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13900 f10212;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13900 f10213;

    public C2609() {
        C13900 c13900 = new C13900(0, 0);
        this.f10213 = c13900;
        C13900 c13901 = new C13900(0, 0);
        this.f10212 = c13901;
        c13900.f45797 = c13901;
        c13901.f45794 = c13900;
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
    public static ArrayList m8081(List list) {
        C11783 c11783;
        C13900 c13900;
        int i;
        int i2;
        ArrayList arrayList;
        Iterator it;
        InterfaceC21350 interfaceC21350;
        String strMo6347;
        String strMo6348;
        C11783 c11784;
        C2609 c2609 = new C2609();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC8651 interfaceC8651 = (InterfaceC8651) it2.next();
            int iMo18941 = interfaceC8651.mo18941();
            int iMo18942 = interfaceC8651.mo18942() + iMo18941;
            if (iMo18941 != iMo18942) {
                for (InterfaceC21350 interfaceC21351 : interfaceC8651.mo18943()) {
                    C13900 c13900M33735 = c2609.f10213.f45797;
                    while (true) {
                        C13900 c13901 = c2609.f10212;
                        if (c13900M33735 != c13901) {
                            int i3 = c13900M33735.f45796;
                            int i4 = c13900M33735.f45795;
                            if (iMo18941 != i3) {
                                if (iMo18941 > i3 && iMo18941 < i4) {
                                    c13900M33735 = c13900M33735.m33735(iMo18941);
                                } else if (iMo18941 >= i3) {
                                    c13900M33735 = c13900M33735.f45797;
                                } else {
                                    if (iMo18942 <= i3) {
                                        C13900 c13902 = new C13900(iMo18941, iMo18942);
                                        c13900M33735.m33736(c13902);
                                        c11783 = new C11783(c13902, c13902);
                                    } else {
                                        C13900 c13903 = new C13900(iMo18941, i3);
                                        c13900M33735.m33736(c13903);
                                        c13900M33735 = c13903;
                                    }
                                    c13900 = c11783.f39579;
                                    i = iMo18941;
                                    do {
                                        i2 = c13900.f45796;
                                        if (i2 > i) {
                                            C13900 c13904 = new C13900(i, i2);
                                            c13900.m33736(c13904);
                                            c13900 = c13904;
                                        }
                                        arrayList = c13900.f45798;
                                        it = arrayList.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                interfaceC21350 = (InterfaceC21350) it.next();
                                                strMo6347 = interfaceC21350.mo6347();
                                                strMo6348 = interfaceC21351.mo6347();
                                                if (strMo6347 != null) {
                                                    if (strMo6347.equals(strMo6348)) {
                                                        break;
                                                    }
                                                } else {
                                                    if (strMo6348 == null) {
                                                        if (interfaceC21350.mo6346() == interfaceC21351.mo6346()) {
                                                            break;
                                                        }
                                                        throw new C4726(null, "Multiple overlapping catch all handlers with different handlers", new Object[0]);
                                                    }
                                                }
                                            } else {
                                                arrayList.add(interfaceC21351);
                                                break;
                                            }
                                        }
                                        i = c13900.f45795;
                                        c13900 = c13900.f45797;
                                    } while (c13900.f45794 != c11783.f39578);
                                }
                            }
                        } else {
                            c13900M33735 = null;
                        }
                        if (c13900M33735 == null) {
                            C13900 c13905 = new C13900(iMo18941, iMo18942);
                            c13901.m33736(c13905);
                            c11784 = new C11783(c13905, c13905);
                        } else {
                            C13900 c13906 = c13900M33735;
                            while (true) {
                                if (c13906 != c13901) {
                                    int i5 = c13906.f45796;
                                    int i6 = c13906.f45795;
                                    if (iMo18942 == i6) {
                                        c11784 = new C11783(c13900M33735, c13906);
                                    } else if (iMo18942 > i5 && iMo18942 < i6) {
                                        c13906.m33735(iMo18942);
                                        c11784 = new C11783(c13900M33735, c13906);
                                    } else {
                                        if (iMo18942 <= i5) {
                                            C13900 c13907 = new C13900(c13906.f45794.f45795, iMo18942);
                                            c13906.m33736(c13907);
                                            c11783 = new C11783(c13900M33735, c13907);
                                            break;
                                        }
                                        c13906 = c13906.f45797;
                                    }
                                } else {
                                    C13900 c13908 = new C13900(c13901.f45794.f45795, iMo18942);
                                    c13901.m33736(c13908);
                                    c11784 = new C11783(c13900M33735, c13908);
                                }
                            }
                            c13900 = c11783.f39579;
                            i = iMo18941;
                            do {
                                i2 = c13900.f45796;
                                if (i2 > i) {
                                    C13900 c13909 = new C13900(i, i2);
                                    c13900.m33736(c13909);
                                    c13900 = c13909;
                                }
                                arrayList = c13900.f45798;
                                it = arrayList.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        interfaceC21350 = (InterfaceC21350) it.next();
                                        strMo6347 = interfaceC21350.mo6347();
                                        strMo6348 = interfaceC21351.mo6347();
                                        if (strMo6347 != null) {
                                            if (strMo6347.equals(strMo6348)) {
                                                break;
                                                break;
                                            }
                                        } else {
                                            if (strMo6348 == null) {
                                                if (interfaceC21350.mo6346() == interfaceC21351.mo6346()) {
                                                    break;
                                                }
                                                throw new C4726(null, "Multiple overlapping catch all handlers with different handlers", new Object[0]);
                                            }
                                        }
                                    } else {
                                        arrayList.add(interfaceC21351);
                                        break;
                                    }
                                }
                                i = c13900.f45795;
                                c13900 = c13900.f45797;
                            } while (c13900.f45794 != c11783.f39578);
                        }
                        c11783 = c11784;
                        c13900 = c11783.f39579;
                        i = iMo18941;
                        do {
                            i2 = c13900.f45796;
                            if (i2 > i) {
                                C13900 c139010 = new C13900(i, i2);
                                c13900.m33736(c139010);
                                c13900 = c139010;
                            }
                            arrayList = c13900.f45798;
                            it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    interfaceC21350 = (InterfaceC21350) it.next();
                                    strMo6347 = interfaceC21350.mo6347();
                                    strMo6348 = interfaceC21351.mo6347();
                                    if (strMo6347 != null) {
                                        if (strMo6347.equals(strMo6348)) {
                                            break;
                                            break;
                                        }
                                    } else {
                                        if (strMo6348 == null) {
                                            if (interfaceC21350.mo6346() == interfaceC21351.mo6346()) {
                                                break;
                                            }
                                            throw new C4726(null, "Multiple overlapping catch all handlers with different handlers", new Object[0]);
                                        }
                                    }
                                } else {
                                    arrayList.add(interfaceC21351);
                                    break;
                                }
                            }
                            i = c13900.f45795;
                            c13900 = c13900.f45797;
                        } while (c13900.f45794 != c11783.f39578);
                    }
                }
            }
        }
        return C3051.m9145(new C3544(c2609));
    }
}
