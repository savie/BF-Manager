package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.ۜۨۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes3.dex */
public final class C7119 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C19161 f23466 = C19161.m44408(15360, 0, true, false);

    /* JADX WARN: Code duplicated, block: B:182:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x001c A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19161 m19517(C0407 c0407) {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        IdentityHashMap identityHashMap2 = new IdentityHashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C8610(c0407));
        C19161 c19161 = C19161.f61997;
        C19161 c19161M19519 = c19161;
        while (!arrayList.isEmpty()) {
            C8610 c8610 = (C8610) j$$ExternalSyntheticOutline0.m(arrayList, 1);
            C0407 c0408 = c8610.f28118;
            int i = c8610.f28119;
            if (i == 0) {
                C19161 c19161M19518 = C19161.f61999;
                if (c0408 != null && c0408 != C5233.f18438 && !(c0408 instanceof C3390) && !(c0408 instanceof C6374)) {
                    if (identityHashMap2.containsKey(c0408)) {
                        c19161M19519 = (C19161) identityHashMap2.get(c0408);
                    } else {
                        if (!identityHashMap.containsKey(c0408)) {
                            identityHashMap.put(c0408, Boolean.TRUE);
                            c8610.f28116 = true;
                            if (c0408.getClass() != C0407.class) {
                                if (c0408 instanceof C5454) {
                                    C5454 c5454 = (C5454) c0408;
                                    if (c5454.f19048.length == 0) {
                                        c8610.f28119 = 1;
                                        arrayList.add(new C8610(c0408.f1952));
                                    } else {
                                        c19161M19519 = m19519(c5454);
                                    }
                                } else if (c0408 instanceof C22036) {
                                    c19161M19519 = m19518(((C22036) c0408).f71066);
                                } else if (c0408 instanceof C12339) {
                                    c19161M19519 = f23466;
                                } else if (c0408 instanceof C13656) {
                                    c19161M19519 = C19161.m44408(-1L, -1L, true, false);
                                } else if (c0408 instanceof C10847) {
                                    C10847 c10847 = (C10847) c0408;
                                    c19161M19518 = m19518(c10847.f34347);
                                    if (c10847.f34348 <= 0) {
                                        c8610.f28115 = c19161M19518;
                                        c8610.f28119 = 2;
                                        arrayList.add(new C8610(c0408.f1952));
                                        c19161M19519 = c19161M19518;
                                    }
                                } else {
                                    if (c0408 instanceof C22782) {
                                        C22782 c22782 = (C22782) c0408;
                                        c8610.f28117 = c22782.f73902 > 0;
                                        int i2 = c22782.f73899;
                                        c8610.f28119 = i2 != 0 ? 3 : 1;
                                        arrayList.add(new C8610(i2 == 0 ? c22782.f1952 : c22782.f73901));
                                    } else if (c0408 instanceof C16814) {
                                        C16814 c16814 = (C16814) c0408;
                                        c8610.f28117 = c16814.f54250 > 0;
                                        int i3 = c16814.f54252;
                                        c8610.f28119 = i3 != 0 ? 3 : 1;
                                        arrayList.add(new C8610(i3 == 0 ? c16814.f1952 : c16814.f54251));
                                    } else if (c0408 instanceof C2644) {
                                        C2644 c2644 = (C2644) c0408;
                                        c8610.f28117 = c2644.f8451 == EnumC9355.INDEPENDENT;
                                        c8610.f28119 = 3;
                                        arrayList.add(new C8610(c2644.f8452));
                                    } else if (c0408 instanceof C8106) {
                                        C8106 c8106 = (C8106) c0408;
                                        int i4 = c8106.f26769;
                                        C19161 c19162 = C19161.f61998;
                                        if (i4 > 0) {
                                            c8610.f28115 = c19162;
                                            c8610.f28119 = 4;
                                            C0407 c0409 = c8106.f26768[0];
                                            if (c0409 == null) {
                                                c0409 = c8106.f26771.f1952;
                                            }
                                            if (c0409 instanceof C19624) {
                                                C19624 c19624 = (C19624) c0409;
                                                if (c19624.f19048.length > 0) {
                                                    c19161M19519 = m19519((C5454) c19624);
                                                }
                                            }
                                            arrayList.add(new C8610(c0409));
                                            c19161M19519 = c19162;
                                        } else {
                                            c19161M19519 = c19162;
                                        }
                                    } else if ((c0408 instanceof C6945) || (c0408 instanceof C17801) || (c0408 instanceof C1394) || (c0408 instanceof C0979) || (c0408 instanceof C5628) || (c0408 instanceof C19798) || (c0408 instanceof C9181) || (c0408 instanceof C17560) || (c0408 instanceof C16068) || (c0408 instanceof C19293) || (c0408 instanceof C10101) || (c0408 instanceof C18306) || (c0408 instanceof C16309) || (c0408 instanceof C7865) || (c0408 instanceof C0648)) {
                                        c8610.f28119 = 1;
                                        arrayList.add(new C8610(c0408.f1952));
                                    }
                                }
                            }
                        }
                        c19161M19519 = c19161;
                    }
                    C2764.m9138(arrayList, 1);
                    if (c8610.f28116) {
                        identityHashMap.remove(c0408);
                        identityHashMap2.put(c0408, c19161M19519);
                    }
                }
                c19161M19519 = c19161M19518;
                C2764.m9138(arrayList, 1);
                if (c8610.f28116) {
                    identityHashMap.remove(c0408);
                    identityHashMap2.put(c0408, c19161M19519);
                }
            } else {
                if (i == 2) {
                    c19161M19519 = c8610.f28115.m44410(c19161M19519);
                } else if (i == 3) {
                    if (!c19161M19519.m44416()) {
                        if (!c8610.f28117 || c19161M19519.m44418()) {
                            c8610.f28115 = c19161M19519.m44414();
                            c8610.f28119 = 2;
                            arrayList.add(new C8610(c0408.f1952));
                        } else {
                            c19161M19519 = c19161M19519.m44414();
                        }
                    }
                } else if (i == 4) {
                    c19161M19519 = c8610.f28115.m44410(c19161M19519);
                    C8106 c8107 = (C8106) c0408;
                    if (!c19161M19519.m44416()) {
                        int i5 = c8610.f28114 + 1;
                        c8610.f28114 = i5;
                        if (i5 < c8107.f26769) {
                            c8610.f28115 = c19161M19519;
                            C0407 c04010 = c8107.f26768[i5];
                            if (c04010 == null) {
                                c04010 = c8107.f26771.f1952;
                            }
                            if (c04010 instanceof C19624) {
                                C19624 c19625 = (C19624) c04010;
                                if (c19625.f19048.length > 0) {
                                    c19161M19519 = m19519((C5454) c19625);
                                }
                            }
                            arrayList.add(new C8610(c04010));
                        }
                    }
                }
                C2764.m9138(arrayList, 1);
                if (c8610.f28116) {
                    identityHashMap.remove(c0408);
                    identityHashMap2.put(c0408, c19161M19519);
                }
            }
        }
        return c19161M19519;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0072  */
    /* JADX WARN: Code duplicated, block: B:51:0x0077  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19161 m19519(C5454 c5454) {
        boolean z = c5454 instanceof C19624;
        boolean z2 = (c5454 instanceof C15148) || (c5454 instanceof C12911);
        boolean z3 = (c5454 instanceof C11419) || (c5454 instanceof C24846);
        if (!z && !z2 && !z3) {
            return C19161.f61997;
        }
        int i = c5454.f19048[0];
        long j = 0;
        if (z) {
            long j2 = (i < 0 || i >= 64) ? 0L : 1 << i;
            if (i >= 64 && i < 128) {
                j = 1 << (i - 64);
            }
            return C19161.m44408(j2, j, i >= 128, false);
        }
        long j3 = 0;
        long j4 = 0;
        for (int i2 = 0; i2 < 128; i2++) {
            if (z3) {
                if (i == i2 || i == C17933.m41869(i2)) {
                    if (i2 < 64) {
                        j3 = (1 << i2) | j3;
                    } else {
                        j4 = (1 << (i2 - 64)) | j4;
                    }
                }
            } else if (z2) {
                if (i == i2 || i == C12690.m31488(i2)) {
                    if (i2 < 64) {
                        j3 = (1 << i2) | j3;
                    } else {
                        j4 = (1 << (i2 - 64)) | j4;
                    }
                }
            } else if (i == i2) {
                if (i2 < 64) {
                    j3 = (1 << i2) | j3;
                } else {
                    j4 = (1 << (i2 - 64)) | j4;
                }
            }
        }
        return C19161.m44408(j3, j4, !z || i >= 128, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19161 m19518(InterfaceC2885 interfaceC2885) {
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < 128; i++) {
            if (interfaceC2885.mo1303(i)) {
                if (i < 64) {
                    j = (1 << i) | j;
                } else {
                    j2 = (1 << (i - 64)) | j2;
                }
            }
        }
        return C19161.m44408(j, j2, true, false);
    }
}
