package l;

import com.umeng.commonsdk.statistics.b;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹֨ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 11F9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21955 implements InterfaceC23988 {
    /* JADX WARN: Code duplicated, block: B:113:0x0241  */
    /* JADX WARN: Code duplicated, block: B:115:0x0247  */
    /* JADX WARN: Code duplicated, block: B:117:0x0254  */
    /* JADX WARN: Code duplicated, block: B:120:0x0261 A[LOOP:3: B:116:0x0252->B:120:0x0261, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:219:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:221:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:222:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:224:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:226:0x03d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:227:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:232:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:233:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:236:0x0408  */
    /* JADX WARN: Code duplicated, block: B:255:0x0416 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x0264 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x025a A[SYNTHETIC] */
    @Override // l.InterfaceC23988
    /* JADX INFO: renamed from: ۙ */
    public final void mo6812(C18551 c18551, C11288 c11288, C8340 c8340) throws C4811 {
        int iIntValue;
        Iterator it;
        int iIntValue2;
        C11413 c11413M6878;
        int i;
        String str;
        String str2;
        String strConcat;
        boolean z;
        C21996[] c21996Arr;
        boolean z2;
        int i2;
        int i3;
        boolean z3;
        int iM17654;
        int length;
        int i4;
        int i5;
        C16435 c16435M42936;
        Integer numValueOf;
        int iMo19106 = c18551.m42934().mo19106();
        int i6 = 1;
        c18551.m42946(true);
        C18923 c18923M21780 = c8340.m21780("parent");
        String str3 = "null";
        String str4 = "@";
        if (c18923M21780 != null) {
            String strM43586 = c18923M21780.m43586();
            if (!strM43586.startsWith("@")) {
                throw new C4811("Expected reference value", c18923M21780);
            }
            String strSubstring = strM43586.substring(1);
            if (strSubstring.equals("null")) {
                numValueOf = 0;
            } else {
                Integer numM35486 = C14816.m35486(strSubstring);
                if (numM35486 != null) {
                    numValueOf = numM35486;
                } else {
                    int iMo15890 = c11288.mo15890(iMo19106, strSubstring);
                    numValueOf = iMo15890 == -1 ? null : Integer.valueOf(iMo15890);
                }
            }
            if (numValueOf == null) {
                throw new C4811("Resource not found: @".concat(strSubstring), c18923M21780);
            }
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = 0;
        }
        c18551.m42948(iIntValue);
        C12812 c12812 = new C12812();
        Iterator itM21772 = C8340.m21772(c8340);
        while (itM21772.hasNext()) {
            C8340 c8341 = (C8340) itM21772.next();
            if (c8341.m21779().equals("item")) {
                C18923 c18923M21786 = c8341.m21786("name");
                String strM43587 = c18923M21786.m43586();
                Integer numM35487 = C14816.m35486(strM43587);
                C5062 c5062Mo15892 = c11288.mo15892();
                String[] strArrSplit = strM43587.split(":", 2);
                if (numM35487 != null) {
                    iIntValue2 = (numM35487.intValue() >>> 24) & 255;
                    it = itM21772;
                } else {
                    it = itM21772;
                    if (strArrSplit.length == 2) {
                        int iMo15891 = c11288.mo15891(strArrSplit[0]);
                        strM43587 = strArrSplit[i6];
                        iIntValue2 = iMo15891;
                    } else {
                        iIntValue2 = iMo19106;
                    }
                }
                if (numM35487 == null) {
                    Iterator it2 = c5062Mo15892.f17661.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            c11413M6878 = null;
                            break;
                        }
                        C2239 c2239 = (C2239) it2.next();
                        if (c2239.m6879() == iIntValue2) {
                            c11413M6878 = c2239.m6878(strM43587);
                            break;
                        }
                    }
                } else {
                    c11413M6878 = c5062Mo15892.m14108(numM35487.intValue());
                }
                if (c11413M6878 == null && iIntValue2 == i6) {
                    c11413M6878 = ((C2239) C13530.m33070().f17661.get(0)).m6878(strM43587);
                }
                if (c11413M6878 == null) {
                    throw new C4811("Unknown attr " + c18923M21786.m43586(), c18923M21786);
                }
                int i7 = c11413M6878.f38428;
                int i8 = c11413M6878.f38427;
                int i9 = i8 & 2;
                if (i9 == 0 || c8341.m21789()) {
                    C10457 c10457M21784 = c8341.m21784();
                    String strM26418 = c10457M21784.m26418();
                    if (strM26418.startsWith(str4)) {
                        c12812.f42661 = i6;
                        String strSubstring2 = strM26418.substring(i6);
                        if (strSubstring2.length() == 8 && C6461.m17648(strSubstring2)) {
                            c12812.f42662 = C6461.m17654(strSubstring2);
                        } else if (C14816.m35486(strSubstring2) != null) {
                            c12812.f42662 = C14816.m35486(strSubstring2).intValue();
                        } else if (strSubstring2.equals(str3)) {
                            c12812.f42662 = 0;
                        } else if (strSubstring2.equals(b.f)) {
                            c12812.f42662 = i6;
                            c12812.f42661 = 0;
                        } else {
                            int iMo15892 = c11288.mo15890(iMo19106, strSubstring2);
                            if (iMo15892 == -1) {
                                throw new C4811("Resource not found: ".concat(strSubstring2), c10457M21784);
                            }
                            c12812.f42662 = iMo15892;
                        }
                    } else {
                        if (strM26418.startsWith("?")) {
                            c12812.f42661 = 2;
                            String strSubstring3 = strM26418.substring(i6);
                            if (strSubstring3.length() == 8 && C6461.m17648(strSubstring3)) {
                                c12812.f42662 = C6461.m17654(strSubstring3);
                            } else if (C14816.m35486(strSubstring3) != null) {
                                c12812.f42662 = C14816.m35486(strSubstring3).intValue();
                            } else {
                                int iMo15893 = c11288.mo15890(iMo19106, strSubstring3);
                                if (iMo15893 == -1) {
                                    throw new C4811("Resource not found: ".concat(strSubstring3), c10457M21784);
                                }
                                c12812.f42662 = iMo15893;
                            }
                        } else {
                            C21996[] c21996Arr2 = c11413M6878.f38429;
                            if ((65536 & i8) != 0) {
                                int length2 = c21996Arr2.length;
                                int i10 = 0;
                                while (true) {
                                    if (i10 < length2) {
                                        C21996 c21996 = c21996Arr2[i10];
                                        i = iMo19106;
                                        if (c21996.f71327.equals(strM26418)) {
                                            c12812.f42662 = c21996.f71329;
                                            c12812.f42661 = c21996.f71328;
                                            str = str3;
                                            str2 = str4;
                                        } else {
                                            i10++;
                                            iMo19106 = i;
                                        }
                                    } else {
                                        i = iMo19106;
                                        if (C6461.m17645(strM26418)) {
                                            int i11 = Integer.parseInt(strM26418);
                                            int length3 = c21996Arr2.length;
                                            int i12 = 0;
                                            while (true) {
                                                if (i12 < length3) {
                                                    if (c21996Arr2[i12].f71329 == i11) {
                                                        c12812.f42661 = 16;
                                                        c12812.f42662 = i11;
                                                    } else {
                                                        i12++;
                                                    }
                                                } else if (i11 == 0 && i8 == 65536) {
                                                    c12812.f42661 = 16;
                                                    c12812.f42662 = i11;
                                                } else if (C6461.m17655(strM26418)) {
                                                    iM17654 = C6461.m17654(strM26418.substring(2));
                                                    length = c21996Arr2.length;
                                                    i4 = 0;
                                                    while (true) {
                                                        if (i4 >= length) {
                                                            if (iM17654 != 0 && i8 == 65536) {
                                                                c12812.f42661 = 16;
                                                                c12812.f42662 = iM17654;
                                                            }
                                                            i2 = 1;
                                                            i3 = 3;
                                                            z3 = false;
                                                        } else if (c21996Arr2[i4].f71329 == iM17654) {
                                                            c12812.f42661 = 16;
                                                            c12812.f42662 = iM17654;
                                                        } else {
                                                            i4++;
                                                        }
                                                    }
                                                }
                                                str = str3;
                                                str2 = str4;
                                                i2 = 1;
                                                i3 = 3;
                                                z3 = false;
                                            }
                                        } else if (C6461.m17655(strM26418)) {
                                            iM17654 = C6461.m17654(strM26418.substring(2));
                                            length = c21996Arr2.length;
                                            i4 = 0;
                                            while (true) {
                                                if (i4 >= length) {
                                                    if (c21996Arr2[i4].f71329 == iM17654) {
                                                        c12812.f42661 = 16;
                                                        c12812.f42662 = iM17654;
                                                    } else {
                                                        i4++;
                                                    }
                                                } else if (iM17654 != 0) {
                                                }
                                                str = str3;
                                                str2 = str4;
                                                i2 = 1;
                                                i3 = 3;
                                                z3 = false;
                                            }
                                        }
                                    }
                                    i2 = 1;
                                    i3 = 3;
                                    z3 = true;
                                }
                            } else {
                                i = iMo19106;
                            }
                            if ((131072 & i8) != 0) {
                                c12812.f42661 = 17;
                                String[] strArrSplit2 = strM26418.split("\\|");
                                int length4 = strArrSplit2.length;
                                int i13 = 0;
                                boolean z4 = false;
                                int i14 = 0;
                                while (true) {
                                    if (i13 >= length4) {
                                        str = str3;
                                        str2 = str4;
                                        z = false;
                                        break;
                                    }
                                    String[] strArr = strArrSplit2;
                                    String strTrim = strArrSplit2[i13].trim();
                                    str = str3;
                                    int length5 = c21996Arr2.length;
                                    str2 = str4;
                                    int i15 = 0;
                                    while (true) {
                                        if (i15 >= length5) {
                                            c21996Arr = c21996Arr2;
                                            z2 = false;
                                            break;
                                        }
                                        int i16 = length5;
                                        C21996 c21997 = c21996Arr2[i15];
                                        c21996Arr = c21996Arr2;
                                        if (c21997.f71327.equals(strTrim)) {
                                            z2 = true;
                                            i14 |= c21997.f71329;
                                            z4 = true;
                                            break;
                                        } else {
                                            i15++;
                                            length5 = i16;
                                            c21996Arr2 = c21996Arr;
                                        }
                                    }
                                    if (!z2) {
                                        z = true;
                                        break;
                                    }
                                    i13++;
                                    str3 = str;
                                    strArrSplit2 = strArr;
                                    str4 = str2;
                                    c21996Arr2 = c21996Arr;
                                }
                                int i17 = i14;
                                if (z || !z4) {
                                    if (!z4 && C6461.m17645(strM26418)) {
                                        c12812.f42662 = Integer.parseInt(strM26418);
                                    } else if (!z4 && C6461.m17655(strM26418)) {
                                        c12812.f42662 = C6461.m17654(strM26418.substring(2));
                                    }
                                    i2 = 1;
                                    i3 = 3;
                                    z3 = false;
                                } else {
                                    c12812.f42662 = i17;
                                    i2 = 1;
                                    i3 = 3;
                                    z3 = true;
                                }
                            } else {
                                str = str3;
                                str2 = str4;
                            }
                            if ((i8 & 16) == 0 || !strM26418.startsWith("#")) {
                                i6 = 1;
                            } else {
                                i6 = 1;
                                if (strM26418.length() == 1 || !C6461.m17648(strM26418.substring(1))) {
                                    strConcat = "Color value invalid: %s".concat(strM26418);
                                } else {
                                    strConcat = !C6461.m17649(strM26418, c12812) ? "Color value invalid -- must be #rgb, #argb, #rrggbb, or #aarrggbb: ".concat(strM26418) : null;
                                }
                                if (strConcat != null) {
                                    if (i9 == 0) {
                                        throw new C4811(strConcat, c10457M21784);
                                    }
                                }
                                i2 = i6;
                                i3 = 3;
                                z3 = false;
                            }
                            if ((i8 & 4) == 0 || !C6461.m17653(strM26418, c12812)) {
                                int i18 = i8 & 32;
                                if (!(i18 == 0 && (i8 & 64) == 0 && (i8 & 128) == 0) && C6461.m17656(strM26418, c12812) && (i9 == 0 || C6461.m17650(c12812))) {
                                    int i19 = c12812.f42661;
                                    if (i19 == 4 && i18 == 0) {
                                        if (i9 == 0) {
                                            throw new C4811("Float value is not allowed here: ".concat(strM26418), c10457M21784);
                                        }
                                    } else if (i19 == 6 && (i8 & 128) == 0) {
                                        if (i9 == 0) {
                                            throw new C4811("Fraction value is not allowed here: ".concat(strM26418), c10457M21784);
                                        }
                                    } else if (i19 == 5 && (i8 & 64) == 0) {
                                        if (i9 == 0) {
                                            throw new C4811("Dimension value is not allowed here: ".concat(strM26418), c10457M21784);
                                        }
                                    }
                                    if ((i8 & 8) == 0) {
                                        if (i9 != 0) {
                                            throw new C4811(C0242.m1617("Error: ", strM26418, " [", c11413M6878.m28517(), "]"), c10457M21784);
                                        }
                                        c12812.f42661 = 3;
                                        StringBuilder sb = new StringBuilder(strM26418.length());
                                        C14816.m35489(sb, strM26418);
                                        c12812.f42663 = sb.toString();
                                    } else if (strM26418.equals("true")) {
                                        c12812.f42662 = -1;
                                        c12812.f42661 = 18;
                                    } else if (strM26418.equals("false")) {
                                        c12812.f42662 = 0;
                                        c12812.f42661 = 18;
                                    } else {
                                        if (i9 != 0) {
                                            throw new C4811(C0242.m1617("Error: ", strM26418, " [", c11413M6878.m28517(), "]"), c10457M21784);
                                        }
                                        c12812.f42661 = 3;
                                        StringBuilder sb2 = new StringBuilder(strM26418.length());
                                        C14816.m35489(sb2, strM26418);
                                        c12812.f42663 = sb2.toString();
                                    }
                                } else if ((i8 & 8) == 0) {
                                    if (i9 != 0) {
                                        throw new C4811(C0242.m1617("Error: ", strM26418, " [", c11413M6878.m28517(), "]"), c10457M21784);
                                    }
                                    c12812.f42661 = 3;
                                    StringBuilder sb3 = new StringBuilder(strM26418.length());
                                    C14816.m35489(sb3, strM26418);
                                    c12812.f42663 = sb3.toString();
                                } else if (strM26418.equals("true")) {
                                    c12812.f42662 = -1;
                                    c12812.f42661 = 18;
                                } else if (strM26418.equals("false")) {
                                    c12812.f42662 = 0;
                                    c12812.f42661 = 18;
                                } else {
                                    if (i9 != 0) {
                                        throw new C4811(C0242.m1617("Error: ", strM26418, " [", c11413M6878.m28517(), "]"), c10457M21784);
                                    }
                                    c12812.f42661 = 3;
                                    StringBuilder sb4 = new StringBuilder(strM26418.length());
                                    C14816.m35489(sb4, strM26418);
                                    c12812.f42663 = sb4.toString();
                                }
                            }
                            i2 = i6;
                            i3 = 3;
                            z3 = false;
                        }
                        i5 = c12812.f42661;
                        if (i5 == i3) {
                            c16435M42936 = c18551.m42937(c12812.f42663, (C15606[]) null, -1);
                        } else {
                            c16435M42936 = c18551.m42936(c12812.f42662, i5, -1);
                        }
                        c16435M42936.m38685(i7);
                        if (!z3) {
                            c11288.m28270(c16435M42936, c10457M21784);
                        }
                        i6 = i2;
                    }
                    i = iMo19106;
                    str = str3;
                    str2 = str4;
                    i2 = i6;
                    i3 = 3;
                    z3 = false;
                    i5 = c12812.f42661;
                    if (i5 == i3) {
                        c16435M42936 = c18551.m42937(c12812.f42663, (C15606[]) null, -1);
                    } else {
                        c16435M42936 = c18551.m42936(c12812.f42662, i5, -1);
                    }
                    c16435M42936.m38685(i7);
                    if (!z3) {
                        c11288.m28270(c16435M42936, c10457M21784);
                    }
                    i6 = i2;
                } else {
                    C14816.m35494(c18551, c11288, c8341).m38685(i7);
                    i = iMo19106;
                    str = str3;
                    str2 = str4;
                }
                itM21772 = it;
                iMo19106 = i;
                str3 = str;
                str4 = str2;
            } else {
                C16932.m39627(c18551, c11288, c8341).m38685(C16932.m39625(c8341, c12812));
            }
        }
        c18551.m42939(C18551.f59019);
    }
}
