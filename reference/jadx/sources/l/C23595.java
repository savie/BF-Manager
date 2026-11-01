package l;

import java.util.ArrayList;
import org.bouncycastle.math.ec.rfc7748.X448Field;

/* JADX INFO: renamed from: l.᩻ۡۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes.dex */
public class C23595 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C23595 f76439 = C22141.f71668;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52022(C17285 c17285) {
        C23595 c23595;
        ArrayList arrayList = new ArrayList();
        C23595 c23596 = this;
        while (true) {
            boolean z = false;
            if (c23596 != null) {
                if (!(c23596 instanceof C2030)) {
                    if (c23596 instanceof C17244) {
                        c17285.f55043 = false;
                        c17285.f55042 = false;
                    } else if (c23596 instanceof C3132) {
                        c23596 = ((C3132) c23596).f11790;
                    } else if (c23596 instanceof C19402) {
                        arrayList.add(new C5996(0, c23596, c17285));
                        c23596 = c23596.f76439;
                    } else if (c23596 instanceof C17949) {
                        arrayList.add(new C5996(1, c23596, c17285));
                    } else if (c23596 instanceof C13758) {
                        arrayList.add(new C5996(2, c23596, c17285));
                        c23596 = ((C13758) c23596).f45371;
                    } else if (c23596 instanceof C3837) {
                        C3837 c3837 = (C3837) c23596;
                        arrayList.add(new C5996(3, c23596, c17285, c3837.f14305, c3837.f14307));
                        c17285.m40245();
                        c23596 = c3837.f14308;
                    } else if (c23596 instanceof C19361) {
                        C19361 c19361 = (C19361) c23596;
                        arrayList.add(new C5996(3, c23596, c17285, c19361.f62410, c19361.f62409));
                        c17285.m40245();
                        c23596 = c19361.f62413;
                    } else if (c23596 instanceof C14732) {
                        C14732 c14732 = (C14732) c23596;
                        C5996 c5996 = new C5996(4, c23596, c17285);
                        arrayList.add(c5996);
                        c17285.m40245();
                        if (c14732.f48160 == 0) {
                            c5996.f20392 = 1;
                            c5996.f20388 += c5996.f20391;
                            c5996.f20390 += c5996.f20386;
                            c23595 = c14732.f48159.f76439;
                        } else {
                            c23595 = c14732.f48161[0];
                        }
                        c23596 = c23595;
                    } else {
                        if (c23596 instanceof C21518) {
                            int i = c17285.f55041;
                            int[] iArr = ((C21518) c23596).f69912;
                            c17285.f55041 = i + iArr.length;
                            c17285.f55044 += iArr.length;
                        } else if (c23596 instanceof C1015) {
                            c17285.f55041++;
                            c17285.f55044++;
                        } else if (c23596 instanceof C20067) {
                            c17285.f55041++;
                            c17285.f55044 += 2;
                        } else if ((c23596 instanceof C5955) || (c23596 instanceof C5207)) {
                            c17285.f55041++;
                            c17285.f55042 = false;
                        } else if (c23596 instanceof C13011) {
                            c17285.f55041 += ((C13011) c23596).f43383;
                            if (c17285.f55043) {
                                c17285.f55044 += Integer.MAX_VALUE;
                            }
                            c17285.f55042 = false;
                        } else if ((c23596 instanceof C19671) || (c23596 instanceof C9793)) {
                            c17285.f55043 = false;
                        } else if (c23596 instanceof C6264) {
                            c17285.f55041 += ((C6264) c23596).f21231.length;
                            c17285.f55043 = false;
                        }
                        c23596 = c23596.f76439;
                    }
                }
                c23596 = null;
            } else {
                if (arrayList.isEmpty()) {
                    return c17285.f55042;
                }
                C5996 c5997 = (C5996) C19084.m43861(arrayList, 1);
                int i2 = c5997.f20383;
                int i3 = c5997.f20389;
                C23595 c23597 = c5997.f20394;
                if (i2 == 0) {
                    c17285.f55043 = false;
                    c17285.f55042 = false;
                } else if (i2 == 1) {
                    c17285.f55043 = false;
                    c17285.f55042 = false;
                    C19028.m43762(arrayList, 1);
                    c23596 = c23597.f76439;
                } else if (i2 == 2) {
                    if (((C13758) c23597).f45370 != EnumC4584.INDEPENDENT) {
                        c17285.f55041 = c5997.f20388;
                        c17285.f55042 = false;
                    }
                    C19028.m43762(arrayList, 1);
                    c23596 = c23597.f76439;
                } else if (i2 == 3) {
                    int i4 = c17285.f55041;
                    int i5 = c5997.f20384;
                    int i6 = c5997.f20388;
                    int i7 = (i4 * i5) + i6;
                    if (i7 < i6) {
                        i7 = X448Field.M28;
                    }
                    c17285.f55041 = i7;
                    if (c5997.f20385 && c17285.f55043) {
                        int i8 = c17285.f55044 * i3;
                        int i9 = c5997.f20390;
                        int i10 = i8 + i9;
                        c17285.f55044 = i10;
                        if (i10 < i9) {
                            c17285.f55043 = false;
                        }
                    } else {
                        c17285.f55043 = false;
                    }
                    if (c17285.f55042 && i5 == i3 && c5997.f20387) {
                        z = true;
                    }
                    c17285.f55042 = z;
                    C19028.m43762(arrayList, 1);
                    c23596 = c23597.f76439;
                } else {
                    if (i2 != 4) {
                        throw new AssertionError(c5997.f20383);
                    }
                    C14732 c14733 = (C14732) c23597;
                    if (c5997.f20392 == 0) {
                        c5997.f20391 = Math.min(c5997.f20391, c17285.f55041);
                        c5997.f20386 = Math.max(c5997.f20386, c17285.f55044);
                        c5997.f20385 &= c17285.f55043;
                        c17285.m40245();
                        int i11 = c5997.f20393 + 1;
                        c5997.f20393 = i11;
                        if (i11 < c14733.f48160) {
                            c23596 = c14733.f48161[i11];
                        } else {
                            c5997.f20388 += c5997.f20391;
                            c5997.f20390 += c5997.f20386;
                            c5997.f20392 = 1;
                            c23596 = c14733.f48159.f76439;
                        }
                    } else {
                        c17285.f55041 += c5997.f20388;
                        c17285.f55044 += c5997.f20390;
                        c17285.f55043 &= c5997.f20385;
                        c17285.f55042 = false;
                    }
                }
                C19028.m43762(arrayList, 1);
            }
        }
    }
}
