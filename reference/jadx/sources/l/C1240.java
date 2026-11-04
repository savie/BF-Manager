package l;

import com.umeng.commonsdk.statistics.b;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ܳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 11F9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1240 implements InterfaceC6461 {
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
    @Override // l.InterfaceC6461
    /* JADX INFO: renamed from: ۙ */
    public final void mo2387(C13304 c13304, C12426 c12426, C2008 c2008) throws C10254 {
        int iIntValue;
        Iterator it;
        int iIntValue2;
        C2600 c2600M23009;
        int i;
        String str;
        String str2;
        String strConcat;
        boolean z;
        C13786[] c13786Arr;
        boolean z2;
        int i2;
        int i3;
        boolean z3;
        int iM29456;
        int length;
        int i4;
        int i5;
        C3609 c3609M32848;
        Integer numValueOf;
        int iMo27607 = c13304.m32857().mo27607();
        int i6 = 1;
        c13304.m32860(true);
        C5737 c5737M6854 = c2008.m6854("parent");
        String str3 = "null";
        String str4 = "@";
        if (c5737M6854 != null) {
            String strM16798 = c5737M6854.m16798();
            if (!strM16798.startsWith("@")) {
                throw new C10254("Expected reference value", c5737M6854);
            }
            String strSubstring = strM16798.substring(1);
            if (strSubstring.equals("null")) {
                numValueOf = 0;
            } else {
                Integer numM54433 = C24361.m54433(strSubstring);
                if (numM54433 != null) {
                    numValueOf = numM54433;
                } else {
                    int iMo7578 = c12426.mo7578(iMo27607, strSubstring);
                    numValueOf = iMo7578 == -1 ? null : Integer.valueOf(iMo7578);
                }
            }
            if (numValueOf == null) {
                throw new C10254("Resource not found: @".concat(strSubstring), c5737M6854);
            }
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = 0;
        }
        c13304.m32859(iIntValue);
        C5765 c5765 = new C5765();
        Iterator itM6847 = C2008.m6847(c2008);
        while (itM6847.hasNext()) {
            C2008 c2009 = (C2008) itM6847.next();
            if (c2009.m6853().equals("item")) {
                C5737 c5737M6863 = c2009.m6863("name");
                String strM16799 = c5737M6863.m16798();
                Integer numM54434 = C24361.m54433(strM16799);
                C7075 c7075Mo7580 = c12426.mo7580();
                String[] strArrSplit = strM16799.split(":", 2);
                if (numM54434 != null) {
                    iIntValue2 = (numM54434.intValue() >>> 24) & 255;
                    it = itM6847;
                } else {
                    it = itM6847;
                    if (strArrSplit.length == 2) {
                        int iMo7579 = c12426.mo7579(strArrSplit[0]);
                        strM16799 = strArrSplit[i6];
                        iIntValue2 = iMo7579;
                    } else {
                        iIntValue2 = iMo27607;
                    }
                }
                if (numM54434 == null) {
                    Iterator it2 = c7075Mo7580.f23304.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            c2600M23009 = null;
                            break;
                        }
                        C8566 c8566 = (C8566) it2.next();
                        if (c8566.m23010() == iIntValue2) {
                            c2600M23009 = c8566.m23009(strM16799);
                            break;
                        }
                    }
                } else {
                    c2600M23009 = c7075Mo7580.m19410(numM54434.intValue());
                }
                if (c2600M23009 == null && iIntValue2 == i6) {
                    c2600M23009 = ((C8566) C15407.m36886().f23304.get(0)).m23009(strM16799);
                }
                if (c2600M23009 == null) {
                    throw new C10254("Unknown attr " + c5737M6863.m16798(), c5737M6863);
                }
                int i7 = c2600M23009.f8353;
                int i8 = c2600M23009.f8357;
                int i9 = i8 & 2;
                if (i9 == 0 || c2009.m6864()) {
                    C16923 c16923M6859 = c2009.m6859();
                    String strM39906 = c16923M6859.m39906();
                    if (strM39906.startsWith(str4)) {
                        c5765.f19814 = i6;
                        String strSubstring2 = strM39906.substring(i6);
                        if (strSubstring2.length() == 8 && C11730.m29453(strSubstring2)) {
                            c5765.f19813 = C11730.m29456(strSubstring2);
                        } else if (C24361.m54433(strSubstring2) != null) {
                            c5765.f19813 = C24361.m54433(strSubstring2).intValue();
                        } else if (strSubstring2.equals(str3)) {
                            c5765.f19813 = 0;
                        } else if (strSubstring2.equals(b.f)) {
                            c5765.f19813 = i6;
                            c5765.f19814 = 0;
                        } else {
                            int iMo75710 = c12426.mo7578(iMo27607, strSubstring2);
                            if (iMo75710 == -1) {
                                throw new C10254("Resource not found: ".concat(strSubstring2), c16923M6859);
                            }
                            c5765.f19813 = iMo75710;
                        }
                    } else {
                        if (strM39906.startsWith("?")) {
                            c5765.f19814 = 2;
                            String strSubstring3 = strM39906.substring(i6);
                            if (strSubstring3.length() == 8 && C11730.m29453(strSubstring3)) {
                                c5765.f19813 = C11730.m29456(strSubstring3);
                            } else if (C24361.m54433(strSubstring3) != null) {
                                c5765.f19813 = C24361.m54433(strSubstring3).intValue();
                            } else {
                                int iMo75711 = c12426.mo7578(iMo27607, strSubstring3);
                                if (iMo75711 == -1) {
                                    throw new C10254("Resource not found: ".concat(strSubstring3), c16923M6859);
                                }
                                c5765.f19813 = iMo75711;
                            }
                        } else {
                            C13786[] c13786Arr2 = c2600M23009.f8355;
                            if ((65536 & i8) != 0) {
                                int length2 = c13786Arr2.length;
                                int i10 = 0;
                                while (true) {
                                    if (i10 < length2) {
                                        C13786 c13786 = c13786Arr2[i10];
                                        i = iMo27607;
                                        if (c13786.f43733.equals(strM39906)) {
                                            c5765.f19813 = c13786.f43735;
                                            c5765.f19814 = c13786.f43734;
                                            str = str3;
                                            str2 = str4;
                                        } else {
                                            i10++;
                                            iMo27607 = i;
                                        }
                                    } else {
                                        i = iMo27607;
                                        if (C11730.m29464(strM39906)) {
                                            int i11 = Integer.parseInt(strM39906);
                                            int length3 = c13786Arr2.length;
                                            int i12 = 0;
                                            while (true) {
                                                if (i12 < length3) {
                                                    if (c13786Arr2[i12].f43735 == i11) {
                                                        c5765.f19814 = 16;
                                                        c5765.f19813 = i11;
                                                    } else {
                                                        i12++;
                                                    }
                                                } else if (i11 == 0 && i8 == 65536) {
                                                    c5765.f19814 = 16;
                                                    c5765.f19813 = i11;
                                                } else if (C11730.m29462(strM39906)) {
                                                    iM29456 = C11730.m29456(strM39906.substring(2));
                                                    length = c13786Arr2.length;
                                                    i4 = 0;
                                                    while (true) {
                                                        if (i4 >= length) {
                                                            if (iM29456 != 0 && i8 == 65536) {
                                                                c5765.f19814 = 16;
                                                                c5765.f19813 = iM29456;
                                                            }
                                                            i2 = 1;
                                                            i3 = 3;
                                                            z3 = false;
                                                        } else if (c13786Arr2[i4].f43735 == iM29456) {
                                                            c5765.f19814 = 16;
                                                            c5765.f19813 = iM29456;
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
                                        } else if (C11730.m29462(strM39906)) {
                                            iM29456 = C11730.m29456(strM39906.substring(2));
                                            length = c13786Arr2.length;
                                            i4 = 0;
                                            while (true) {
                                                if (i4 >= length) {
                                                    if (c13786Arr2[i4].f43735 == iM29456) {
                                                        c5765.f19814 = 16;
                                                        c5765.f19813 = iM29456;
                                                    } else {
                                                        i4++;
                                                    }
                                                } else if (iM29456 != 0) {
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
                                i = iMo27607;
                            }
                            if ((131072 & i8) != 0) {
                                c5765.f19814 = 17;
                                String[] strArrSplit2 = strM39906.split("\\|");
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
                                    int length5 = c13786Arr2.length;
                                    str2 = str4;
                                    int i15 = 0;
                                    while (true) {
                                        if (i15 >= length5) {
                                            c13786Arr = c13786Arr2;
                                            z2 = false;
                                            break;
                                        }
                                        int i16 = length5;
                                        C13786 c13787 = c13786Arr2[i15];
                                        c13786Arr = c13786Arr2;
                                        if (c13787.f43733.equals(strTrim)) {
                                            z2 = true;
                                            i14 |= c13787.f43735;
                                            z4 = true;
                                            break;
                                        } else {
                                            i15++;
                                            length5 = i16;
                                            c13786Arr2 = c13786Arr;
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
                                    c13786Arr2 = c13786Arr;
                                }
                                int i17 = i14;
                                if (z || !z4) {
                                    if (!z4 && C11730.m29464(strM39906)) {
                                        c5765.f19813 = Integer.parseInt(strM39906);
                                    } else if (!z4 && C11730.m29462(strM39906)) {
                                        c5765.f19813 = C11730.m29456(strM39906.substring(2));
                                    }
                                    i2 = 1;
                                    i3 = 3;
                                    z3 = false;
                                } else {
                                    c5765.f19813 = i17;
                                    i2 = 1;
                                    i3 = 3;
                                    z3 = true;
                                }
                            } else {
                                str = str3;
                                str2 = str4;
                            }
                            if ((i8 & 16) == 0 || !strM39906.startsWith("#")) {
                                i6 = 1;
                            } else {
                                i6 = 1;
                                if (strM39906.length() == 1 || !C11730.m29453(strM39906.substring(1))) {
                                    strConcat = "Color value invalid: %s".concat(strM39906);
                                } else {
                                    strConcat = !C11730.m29454(strM39906, c5765) ? "Color value invalid -- must be #rgb, #argb, #rrggbb, or #aarrggbb: ".concat(strM39906) : null;
                                }
                                if (strConcat != null) {
                                    if (i9 == 0) {
                                        throw new C10254(strConcat, c16923M6859);
                                    }
                                }
                                i2 = i6;
                                i3 = 3;
                                z3 = false;
                            }
                            if ((i8 & 4) == 0 || !C11730.m29458(strM39906, c5765)) {
                                int i18 = i8 & 32;
                                if (!(i18 == 0 && (i8 & 64) == 0 && (i8 & 128) == 0) && C11730.m29463(strM39906, c5765) && (i9 == 0 || C11730.m29455(c5765))) {
                                    int i19 = c5765.f19814;
                                    if (i19 == 4 && i18 == 0) {
                                        if (i9 == 0) {
                                            throw new C10254("Float value is not allowed here: ".concat(strM39906), c16923M6859);
                                        }
                                    } else if (i19 == 6 && (i8 & 128) == 0) {
                                        if (i9 == 0) {
                                            throw new C10254("Fraction value is not allowed here: ".concat(strM39906), c16923M6859);
                                        }
                                    } else if (i19 == 5 && (i8 & 64) == 0) {
                                        if (i9 == 0) {
                                            throw new C10254("Dimension value is not allowed here: ".concat(strM39906), c16923M6859);
                                        }
                                    }
                                    if ((i8 & 8) == 0) {
                                        if (i9 != 0) {
                                            throw new C10254(C3188.m10404("Error: ", strM39906, " [", c2600M23009.m8731(), "]"), c16923M6859);
                                        }
                                        c5765.f19814 = 3;
                                        StringBuilder sb = new StringBuilder(strM39906.length());
                                        C24361.m54436(sb, strM39906);
                                        c5765.f19815 = sb.toString();
                                    } else if (strM39906.equals("true")) {
                                        c5765.f19813 = -1;
                                        c5765.f19814 = 18;
                                    } else if (strM39906.equals("false")) {
                                        c5765.f19813 = 0;
                                        c5765.f19814 = 18;
                                    } else {
                                        if (i9 != 0) {
                                            throw new C10254(C3188.m10404("Error: ", strM39906, " [", c2600M23009.m8731(), "]"), c16923M6859);
                                        }
                                        c5765.f19814 = 3;
                                        StringBuilder sb2 = new StringBuilder(strM39906.length());
                                        C24361.m54436(sb2, strM39906);
                                        c5765.f19815 = sb2.toString();
                                    }
                                } else if ((i8 & 8) == 0) {
                                    if (i9 != 0) {
                                        throw new C10254(C3188.m10404("Error: ", strM39906, " [", c2600M23009.m8731(), "]"), c16923M6859);
                                    }
                                    c5765.f19814 = 3;
                                    StringBuilder sb3 = new StringBuilder(strM39906.length());
                                    C24361.m54436(sb3, strM39906);
                                    c5765.f19815 = sb3.toString();
                                } else if (strM39906.equals("true")) {
                                    c5765.f19813 = -1;
                                    c5765.f19814 = 18;
                                } else if (strM39906.equals("false")) {
                                    c5765.f19813 = 0;
                                    c5765.f19814 = 18;
                                } else {
                                    if (i9 != 0) {
                                        throw new C10254(C3188.m10404("Error: ", strM39906, " [", c2600M23009.m8731(), "]"), c16923M6859);
                                    }
                                    c5765.f19814 = 3;
                                    StringBuilder sb4 = new StringBuilder(strM39906.length());
                                    C24361.m54436(sb4, strM39906);
                                    c5765.f19815 = sb4.toString();
                                }
                            }
                            i2 = i6;
                            i3 = 3;
                            z3 = false;
                        }
                        i5 = c5765.f19814;
                        if (i5 == i3) {
                            c3609M32848 = c13304.m32849(c5765.f19815, (C25042[]) null, -1);
                        } else {
                            c3609M32848 = c13304.m32848(c5765.f19813, i5, -1);
                        }
                        c3609M32848.m11711(i7);
                        if (!z3) {
                            c12426.m30903(c3609M32848, c16923M6859);
                        }
                        i6 = i2;
                    }
                    i = iMo27607;
                    str = str3;
                    str2 = str4;
                    i2 = i6;
                    i3 = 3;
                    z3 = false;
                    i5 = c5765.f19814;
                    if (i5 == i3) {
                        c3609M32848 = c13304.m32849(c5765.f19815, (C25042[]) null, -1);
                    } else {
                        c3609M32848 = c13304.m32848(c5765.f19813, i5, -1);
                    }
                    c3609M32848.m11711(i7);
                    if (!z3) {
                        c12426.m30903(c3609M32848, c16923M6859);
                    }
                    i6 = i2;
                } else {
                    C24361.m54439(c13304, c12426, c2009).m11711(i7);
                    i = iMo27607;
                    str = str3;
                    str2 = str4;
                }
                itM6847 = it;
                iMo27607 = i;
                str3 = str;
                str4 = str2;
            } else {
                C16155.m38330(c13304, c12426, c2009).m11711(C16155.m38328(c2009, c5765));
            }
        }
        c13304.m32851(C13304.f42461);
    }
}
