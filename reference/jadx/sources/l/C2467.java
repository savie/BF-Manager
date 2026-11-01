package l;

import java.util.ArrayList;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.ۖۤۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes2.dex */
public final class C2467 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C3399 f9824 = C3399.m10074(15360, 0, true, false);

    /* JADX WARN: Code duplicated, block: B:182:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x001c A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3399 m7575(C23595 c23595) {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        IdentityHashMap identityHashMap2 = new IdentityHashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C11641(c23595));
        C3399 c3399 = C3399.f12541;
        C3399 c3399M7574 = c3399;
        while (!arrayList.isEmpty()) {
            C11641 c11641 = (C11641) C19084.m43861(arrayList, 1);
            C23595 c23596 = c11641.f39115;
            int i = c11641.f39111;
            if (i == 0) {
                C3399 c3399M7573 = C3399.f12542;
                if (c23596 != null && c23596 != C22141.f71668 && !(c23596 instanceof C20772) && !(c23596 instanceof C0310)) {
                    if (identityHashMap2.containsKey(c23596)) {
                        c3399M7574 = (C3399) identityHashMap2.get(c23596);
                    } else {
                        if (!identityHashMap.containsKey(c23596)) {
                            identityHashMap.put(c23596, Boolean.TRUE);
                            c11641.f39116 = true;
                            if (c23596.getClass() != C23595.class) {
                                if (c23596 instanceof C21518) {
                                    C21518 c21518 = (C21518) c23596;
                                    if (c21518.f69912.length == 0) {
                                        c11641.f39111 = 1;
                                        arrayList.add(new C11641(c23596.f76439));
                                    } else {
                                        c3399M7574 = m7574(c21518);
                                    }
                                } else if (c23596 instanceof C1015) {
                                    c3399M7574 = m7573(((C1015) c23596).f4704);
                                } else if (c23596 instanceof C20067) {
                                    c3399M7574 = f9824;
                                } else if (c23596 instanceof C5207) {
                                    c3399M7574 = C3399.m10074(-1L, -1L, true, false);
                                } else if (c23596 instanceof C13011) {
                                    C13011 c13011 = (C13011) c23596;
                                    c3399M7573 = m7573(c13011.f43382);
                                    if (c13011.f43383 <= 0) {
                                        c11641.f39114 = c3399M7573;
                                        c11641.f39111 = 2;
                                        arrayList.add(new C11641(c23596.f76439));
                                        c3399M7574 = c3399M7573;
                                    }
                                } else {
                                    if (c23596 instanceof C3837) {
                                        C3837 c3837 = (C3837) c23596;
                                        c11641.f39113 = c3837.f14305 > 0;
                                        int i2 = c3837.f14307;
                                        c11641.f39111 = i2 != 0 ? 3 : 1;
                                        arrayList.add(new C11641(i2 == 0 ? c3837.f76439 : c3837.f14308));
                                    } else if (c23596 instanceof C19361) {
                                        C19361 c19361 = (C19361) c23596;
                                        c11641.f39113 = c19361.f62410 > 0;
                                        int i3 = c19361.f62409;
                                        c11641.f39111 = i3 != 0 ? 3 : 1;
                                        arrayList.add(new C11641(i3 == 0 ? c19361.f76439 : c19361.f62413));
                                    } else if (c23596 instanceof C13758) {
                                        C13758 c13758 = (C13758) c23596;
                                        c11641.f39113 = c13758.f45370 == EnumC4584.INDEPENDENT;
                                        c11641.f39111 = 3;
                                        arrayList.add(new C11641(c13758.f45371));
                                    } else if (c23596 instanceof C14732) {
                                        C14732 c14732 = (C14732) c23596;
                                        int i4 = c14732.f48160;
                                        C3399 c33910 = C3399.f12540;
                                        if (i4 > 0) {
                                            c11641.f39114 = c33910;
                                            c11641.f39111 = 4;
                                            C23595 c23597 = c14732.f48161[0];
                                            if (c23597 == null) {
                                                c23597 = c14732.f48159.f76439;
                                            }
                                            if (c23597 instanceof C6701) {
                                                C6701 c6701 = (C6701) c23597;
                                                if (c6701.f69912.length > 0) {
                                                    c3399M7574 = m7574((C21518) c6701);
                                                }
                                            }
                                            arrayList.add(new C11641(c23597));
                                            c3399M7574 = c33910;
                                        } else {
                                            c3399M7574 = c33910;
                                        }
                                    } else if ((c23596 instanceof C2384) || (c23596 instanceof C9088) || (c23596 instanceof C3441) || (c23596 instanceof C3173) || (c23596 instanceof C21477) || (c23596 instanceof C6660) || (c23596 instanceof C4501) || (c23596 instanceof C8778) || (c23596 instanceof C10189) || (c23596 instanceof C2030) || (c23596 instanceof C9484) || (c23596 instanceof C10895) || (c23596 instanceof C10499) || (c23596 instanceof C14423) || (c23596 instanceof C23904)) {
                                        c11641.f39111 = 1;
                                        arrayList.add(new C11641(c23596.f76439));
                                    }
                                }
                            }
                        }
                        c3399M7574 = c3399;
                    }
                    C19028.m43762(arrayList, 1);
                    if (c11641.f39116) {
                        identityHashMap.remove(c23596);
                        identityHashMap2.put(c23596, c3399M7574);
                    }
                }
                c3399M7574 = c3399M7573;
                C19028.m43762(arrayList, 1);
                if (c11641.f39116) {
                    identityHashMap.remove(c23596);
                    identityHashMap2.put(c23596, c3399M7574);
                }
            } else {
                if (i == 2) {
                    c3399M7574 = c11641.f39114.m10078(c3399M7574);
                } else if (i == 3) {
                    if (!c3399M7574.m10081()) {
                        if (!c11641.f39113 || c3399M7574.m10077()) {
                            c11641.f39114 = c3399M7574.m10076();
                            c11641.f39111 = 2;
                            arrayList.add(new C11641(c23596.f76439));
                        } else {
                            c3399M7574 = c3399M7574.m10076();
                        }
                    }
                } else if (i == 4) {
                    c3399M7574 = c11641.f39114.m10078(c3399M7574);
                    C14732 c14733 = (C14732) c23596;
                    if (!c3399M7574.m10081()) {
                        int i5 = c11641.f39112 + 1;
                        c11641.f39112 = i5;
                        if (i5 < c14733.f48160) {
                            c11641.f39114 = c3399M7574;
                            C23595 c23598 = c14733.f48161[i5];
                            if (c23598 == null) {
                                c23598 = c14733.f48159.f76439;
                            }
                            if (c23598 instanceof C6701) {
                                C6701 c6702 = (C6701) c23598;
                                if (c6702.f69912.length > 0) {
                                    c3399M7574 = m7574((C21518) c6702);
                                }
                            }
                            arrayList.add(new C11641(c23598));
                        }
                    }
                }
                C19028.m43762(arrayList, 1);
                if (c11641.f39116) {
                    identityHashMap.remove(c23596);
                    identityHashMap2.put(c23596, c3399M7574);
                }
            }
        }
        return c3399M7574;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0072  */
    /* JADX WARN: Code duplicated, block: B:51:0x0077  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3399 m7574(C21518 c21518) {
        boolean z = c21518 instanceof C6701;
        boolean z2 = (c21518 instanceof C22930) || (c21518 instanceof C15169);
        boolean z3 = (c21518 instanceof C18696) || (c21518 instanceof C8113);
        if (!z && !z2 && !z3) {
            return C3399.f12541;
        }
        int i = c21518.f69912[0];
        long j = 0;
        if (z) {
            long j2 = (i < 0 || i >= 64) ? 0L : 1 << i;
            if (i >= 64 && i < 128) {
                j = 1 << (i - 64);
            }
            return C3399.m10074(j2, j, i >= 128, false);
        }
        long j3 = 0;
        long j4 = 0;
        for (int i2 = 0; i2 < 128; i2++) {
            if (z3) {
                if (i == i2 || i == C12123.m30171(i2)) {
                    if (i2 < 64) {
                        j3 = (1 << i2) | j3;
                    } else {
                        j4 = (1 << (i2 - 64)) | j4;
                    }
                }
            } else if (z2) {
                if (i == i2 || i == C20025.m45350(i2)) {
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
        return C3399.m10074(j3, j4, !z || i >= 128, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3399 m7573(InterfaceC13717 interfaceC13717) {
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < 128; i++) {
            if (interfaceC13717.mo1813(i)) {
                if (i < 64) {
                    j = (1 << i) | j;
                } else {
                    j2 = (1 << (i - 64)) | j2;
                }
            }
        }
        return C3399.m10074(j, j2, true, false);
    }
}
