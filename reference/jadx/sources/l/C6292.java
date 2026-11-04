package l;

import com.alipay.sdk.m.p.a;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.slider.BasicLabelFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ۛۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB7S */
/* JADX INFO: loaded from: classes3.dex */
public final class C6292 extends C9208 {
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m17975(int i) {
        if (i >= 48 && i <= 57) {
            return i - 48;
        }
        if (i >= 65 && i <= 70) {
            return i - 55;
        }
        if (i < 97 || i > 102) {
            return -1;
        }
        return i - 87;
    }

    public C6292(String str) {
        super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m17976() {
        int i;
        int i2;
        boolean zM24378 = m24378();
        String str = this.f30022;
        if (zM24378) {
            i2 = this.f30024;
        } else {
            int i3 = this.f30024;
            int iCharAt = str.charAt(i3);
            if (iCharAt == 45) {
                iCharAt = m24367();
            }
            if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                i = i3;
            } else {
                int iM24367 = m24367();
                while (true) {
                    if ((iM24367 < 65 || iM24367 > 90) && ((iM24367 < 97 || iM24367 > 122) && !((iM24367 >= 48 && iM24367 <= 57) || iM24367 == 45 || iM24367 == 95))) {
                        break;
                    }
                    iM24367 = m24367();
                }
                i = this.f30024;
            }
            this.f30024 = i3;
            i2 = i;
        }
        int i4 = this.f30024;
        if (i2 == i4) {
            return null;
        }
        String strSubstring = str.substring(i4, i2);
        this.f30024 = i2;
        return strSubstring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    /* JADX WARN: Code duplicated, block: B:240:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:245:0x040d  */
    /* JADX WARN: Code duplicated, block: B:247:0x0411  */
    /* JADX WARN: Code duplicated, block: B:251:0x0424  */
    /* JADX WARN: Code duplicated, block: B:256:0x0439  */
    /* JADX WARN: Code duplicated, block: B:272:0x0433 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x042e A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [l.᩵ۡܺ] */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v10, types: [l.۬ۡܺ] */
    /* JADX WARN: Type inference failed for: r2v12, types: [l.۬ۡܺ] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [l.۬ۡܺ] */
    /* JADX WARN: Type inference failed for: r2v16, types: [l.۬ۡܺ] */
    /* JADX WARN: Type inference failed for: r2v17, types: [l.۬ۡܺ] */
    /* JADX WARN: Type inference failed for: r2v18, types: [l.۬ۡܺ] */
    /* JADX WARN: Type inference failed for: r2v19, types: [l.۬ۡܺ] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v14, types: [l.ۨۡܺ] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v43, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v69 */
    /* JADX WARN: Type inference failed for: r3v70 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v2, types: [l.᩺ۡܺ] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public ArrayList m17974() throws C23446 {
        ArrayList arrayList;
        ?? r7;
        ?? r5;
        ?? c13748;
        ?? r11;
        EnumC20462 enumC20462;
        EnumC20462 enumC20463;
        ?? r12;
        String strM24376;
        ?? M17976;
        EnumC20462 enumC20464;
        int i;
        int i2;
        C10569 c10569M27030;
        C10569 c10569;
        C12257 c12257;
        Object obj;
        Object obj2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ?? arrayList4 = 0;
        if (m24378()) {
            return null;
        }
        int i3 = 1;
        ArrayList arrayList5 = new ArrayList(1);
        boolean z = false;
        C7037 c7037 = new C7037(0);
        while (!m24378() && !m24378()) {
            int i4 = this.f30024;
            ArrayList arrayList6 = c7037.f23219;
            if (arrayList6 == null || arrayList6.isEmpty()) {
                r7 = arrayList4;
            } else if (m24370('>')) {
                EnumC24192 enumC24192 = EnumC24192.CHILD;
                m24374();
                r7 = enumC24192;
            } else if (m24370('+')) {
                EnumC24192 enumC24193 = EnumC24192.FOLLOWS;
                m24374();
                r7 = enumC24193;
            } else {
                r7 = arrayList4;
            }
            if (m24370('*')) {
                c13748 = new C13748(r7, arrayList4);
                r5 = i3;
            } else {
                String strM17976 = m17976();
                if (strM17976 != null) {
                    C13748 c13749 = new C13748(r7, strM17976);
                    c7037.f23220 += i3;
                    r5 = i3;
                    c13748 = c13749;
                } else {
                    r5 = i3;
                    c13748 = arrayList4;
                }
            }
            while (!m24378()) {
                if (m24370('.')) {
                    if (c13748 == 0) {
                        c13748 = new C13748(r7, arrayList4);
                    }
                    String strM17977 = m17976();
                    if (strM17977 == null) {
                        throw new C23446("Invalid \".class\" simpleSelectors");
                    }
                    c13748.m33593(Name.LABEL, EnumC20462.EQUALS, strM17977);
                    c7037.m19360();
                } else if (m24370('#')) {
                    if (c13748 == 0) {
                        c13748 = new C13748(r7, arrayList4);
                    }
                    String strM17978 = m17976();
                    if (strM17978 == null) {
                        throw new C23446("Invalid \"#id\" simpleSelectors");
                    }
                    c13748.m33593("id", EnumC20462.EQUALS, strM17978);
                    c7037.f23220 += BasicLabelFormatter.MILLION;
                } else if (m24370('[')) {
                    if (c13748 == 0) {
                        c13748 = new C13748(r7, arrayList4);
                    }
                    m24374();
                    String strM17979 = m17976();
                    if (strM17979 == null) {
                        throw new C23446("Invalid attribute simpleSelectors");
                    }
                    m24374();
                    if (m24370(a.h)) {
                        enumC20464 = EnumC20462.EQUALS;
                    } else if (m24371("~=")) {
                        enumC20463 = EnumC20462.INCLUDES;
                    } else if (m24371("|=")) {
                        enumC20462 = EnumC20462.DASHMATCH;
                    } else {
                        r11 = arrayList4;
                    }
                    if (r11 != 0) {
                        r11 = enumC20462;
                        r11 = enumC20463;
                        m24374();
                        if (m24378()) {
                            M17976 = arrayList4;
                        } else {
                            strM24376 = m24376();
                            if (strM24376 == null) {
                                r11 = enumC20464;
                                M17976 = strM24376;
                                M17976 = m17976();
                            }
                        }
                        if (M17976 == 0) {
                            r11 = enumC20464;
                            throw new C23446("Invalid attribute simpleSelectors");
                        }
                        r11 = enumC20464;
                        m24374();
                        r12 = M17976;
                    } else {
                        r11 = enumC20462;
                        r11 = enumC20463;
                        r11 = enumC20464;
                        r12 = arrayList4;
                    }
                    ?? r13 = r11;
                    if (!m24370(']')) {
                        throw new C23446("Invalid attribute simpleSelectors");
                    }
                    if (r11 == 0) {
                        r13 = EnumC20462.EXISTS;
                    }
                    c13748.m33593(strM17979, r13, r12);
                    c7037.m19360();
                } else {
                    c13748 = c13748;
                    if (m24370(':')) {
                        if (c13748 == 0) {
                            c13748 = new C13748(r7, arrayList4);
                        }
                        String strM179710 = m17976();
                        if (strM179710 == null) {
                            throw new C23446("Invalid pseudo class");
                        }
                        EnumC0325 enumC0325M2018 = EnumC0325.m2018(strM179710);
                        switch (enumC0325M2018.ordinal()) {
                            case 0:
                                C9273 c9273 = new C9273();
                                c7037.m19360();
                                obj2 = c9273;
                                if (c13748.f43622 == null) {
                                    c13748.f43622 = new ArrayList();
                                }
                                c13748.f43622.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 1:
                                C1071 c1071 = new C1071();
                                c7037.m19360();
                                obj2 = c1071;
                                if (c13748.f43622 == null) {
                                    c13748.f43622 = new ArrayList();
                                }
                                c13748.f43622.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                                boolean z2 = enumC0325M2018 == EnumC0325.nth_child || enumC0325M2018 == EnumC0325.nth_of_type;
                                boolean z3 = enumC0325M2018 == EnumC0325.nth_of_type || enumC0325M2018 == EnumC0325.nth_last_of_type;
                                ?? r3 = arrayList4;
                                if (!m24378()) {
                                    int i5 = this.f30024;
                                    if (m24370('(')) {
                                        m24374();
                                        if (m24371("odd")) {
                                            r3 = arrayList4;
                                            c12257 = new C12257(2, r5 == true ? 1 : 0);
                                        } else if (m24371("even")) {
                                            r3 = arrayList4;
                                            c12257 = new C12257(2, z ? 1 : 0);
                                        } else {
                                            if (!m24370('+') && m24370('-')) {
                                                r3 = arrayList4;
                                                i = -1;
                                            } else {
                                                r3 = arrayList4;
                                                r3 = arrayList4;
                                                i = 1;
                                            }
                                            int i6 = this.f30024;
                                            int i7 = this.f30025;
                                            String str = this.f30022;
                                            C10569 c10569M27031 = C10569.m27030(i6, i7, str);
                                            if (c10569M27031 != null) {
                                                this.f30024 = c10569M27031.m27031();
                                            }
                                            if (m24370('n') || m24370('N')) {
                                                if (c10569M27031 == null) {
                                                    c10569M27031 = new C10569(this.f30024, 1L);
                                                }
                                                m24374();
                                                boolean zM24370 = m24370('+');
                                                i2 = (zM24370 || !(zM24370 = m24370('-'))) ? 1 : -1;
                                                if (zM24370) {
                                                    m24374();
                                                    c10569M27030 = C10569.m27030(this.f30024, i7, str);
                                                    if (c10569M27030 != null) {
                                                        this.f30024 = c10569M27030.m27031();
                                                    } else {
                                                        this.f30024 = i5;
                                                    }
                                                    r3 = 0;
                                                } else {
                                                    c10569M27030 = null;
                                                }
                                                C10569 c105610 = c10569M27030;
                                                c10569 = c10569M27031;
                                                c10569M27031 = c105610;
                                            } else {
                                                c10569 = null;
                                                i2 = i;
                                                i = 1;
                                            }
                                            c12257 = new C12257(c10569 == null ? 0 : i * c10569.m27032(), c10569M27031 == null ? 0 : c10569M27031.m27032() * i2);
                                        }
                                        m24374();
                                        r3 = c12257;
                                        if (!m24370(')')) {
                                            this.f30024 = i5;
                                            r3 = 0;
                                        }
                                    }
                                }
                                if (r3 == 0) {
                                    throw new C23446("Invalid or missing parameter section for pseudo class: ".concat(strM179710));
                                }
                                C21208 c21208 = new C21208(c13748.f43624, r3.f39424, r3.f39425, z2, z3);
                                c7037.m19360();
                                obj = c21208;
                                obj2 = obj;
                                if (c13748.f43622 == null) {
                                    c13748.f43622 = new ArrayList();
                                }
                                c13748.f43622.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                                break;
                            case 6:
                                C21208 c21209 = new C21208(null, 0, 1, true, false);
                                c7037.m19360();
                                obj2 = c21209;
                                if (c13748.f43622 == null) {
                                    c13748.f43622 = new ArrayList();
                                }
                                c13748.f43622.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 7:
                                C21208 c212010 = new C21208(null, 0, 1, false, false);
                                c7037.m19360();
                                obj2 = c212010;
                                if (c13748.f43622 == null) {
                                    c13748.f43622 = new ArrayList();
                                }
                                c13748.f43622.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 8:
                                C21208 c212011 = new C21208(c13748.f43624, 0, 1, true, true);
                                c7037.m19360();
                                obj2 = c212011;
                                if (c13748.f43622 == null) {
                                    c13748.f43622 = new ArrayList();
                                }
                                c13748.f43622.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 9:
                                C21208 c212012 = new C21208(c13748.f43624, 0, 1, false, true);
                                c7037.m19360();
                                obj2 = c212012;
                                if (c13748.f43622 == null) {
                                    c13748.f43622 = new ArrayList();
                                }
                                c13748.f43622.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 10:
                                C10019 c10019 = new C10019(z, arrayList4);
                                c7037.m19360();
                                obj = c10019;
                                obj2 = obj;
                                if (c13748.f43622 == null) {
                                    c13748.f43622 = new ArrayList();
                                }
                                c13748.f43622.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 11:
                                C10019 c100110 = new C10019(r5, c13748.f43624);
                                c7037.m19360();
                                obj2 = c100110;
                                if (c13748.f43622 == null) {
                                    c13748.f43622 = new ArrayList();
                                }
                                c13748.f43622.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 12:
                                C18224 c18224 = new C18224();
                                c7037.m19360();
                                obj2 = c18224;
                                if (c13748.f43622 == null) {
                                    c13748.f43622 = new ArrayList();
                                }
                                c13748.f43622.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 13:
                                if (!m24378()) {
                                    int i8 = this.f30024;
                                    if (m24370('(')) {
                                        m24374();
                                        ArrayList arrayListM17974 = m17974();
                                        if (arrayListM17974 != null && m24370(')')) {
                                            Iterator it = arrayListM17974.iterator();
                                            while (true) {
                                                if (!it.hasNext() || (arrayList2 = ((C7037) it.next()).f23219) == null) {
                                                    arrayList4 = arrayListM17974;
                                                } else {
                                                    Iterator it2 = arrayList2.iterator();
                                                    while (true) {
                                                        if (it2.hasNext() && (arrayList3 = ((C13748) it2.next()).f43622) != null) {
                                                            Iterator it3 = arrayList3.iterator();
                                                            while (true) {
                                                                if (it3.hasNext()) {
                                                                    if (((InterfaceC14494) it3.next()) instanceof C7783) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            this.f30024 = i8;
                                        }
                                    }
                                }
                                if (arrayList4 == 0) {
                                    throw new C23446("Invalid or missing parameter section for pseudo class: ".concat(strM179710));
                                }
                                C7783 c7783 = new C7783(arrayList4);
                                c7037.f23220 = c7783.m21175();
                                obj = c7783;
                                obj2 = obj;
                                if (c13748.f43622 == null) {
                                    c13748.f43622 = new ArrayList();
                                }
                                c13748.f43622.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                                break;
                            case 14:
                                if (!m24378()) {
                                    int i9 = this.f30024;
                                    if (m24370('(')) {
                                        m24374();
                                        while (true) {
                                            String strM179711 = m17976();
                                            arrayList4 = arrayList4;
                                            if (strM179711 == null) {
                                                this.f30024 = i9;
                                            } else {
                                                if (arrayList4 == 0) {
                                                    arrayList4 = new ArrayList();
                                                }
                                                arrayList4.add(strM179711);
                                                m24374();
                                                if (!m24365()) {
                                                    if (!m24370(')')) {
                                                        this.f30024 = i9;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                C18970 c18970 = new C18970(strM179710);
                                c7037.m19360();
                                obj2 = c18970;
                                if (c13748.f43622 == null) {
                                    c13748.f43622 = new ArrayList();
                                }
                                c13748.f43622.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                                C18970 c18971 = new C18970(strM179710);
                                c7037.m19360();
                                obj2 = c18971;
                                if (c13748.f43622 == null) {
                                    c13748.f43622 = new ArrayList();
                                }
                                c13748.f43622.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            default:
                                throw new C23446("Unsupported pseudo class: ".concat(strM179710));
                        }
                    } else {
                        if (c13748 != 0) {
                            this.f30024 = i4;
                            arrayList = c7037.f23219;
                            if (arrayList != null && !arrayList.isEmpty()) {
                                arrayList5.add(c7037);
                            }
                            return arrayList5;
                        }
                        if (c7037.f23219 == null) {
                            c7037.f23219 = new ArrayList();
                        }
                        c7037.f23219.add(c13748);
                        if (!m24365()) {
                            arrayList5.add(c7037);
                            c7037 = new C7037(0);
                        }
                        arrayList4 = 0;
                        i3 = 1;
                        z = false;
                    }
                }
            }
            if (c13748 != 0) {
                this.f30024 = i4;
                arrayList = c7037.f23219;
                if (arrayList != null) {
                    arrayList5.add(c7037);
                }
                return arrayList5;
            }
            if (c7037.f23219 == null) {
                c7037.f23219 = new ArrayList();
            }
            c7037.f23219.add(c13748);
            if (!m24365()) {
                arrayList5.add(c7037);
                c7037 = new C7037(0);
            }
            arrayList4 = 0;
            i3 = 1;
            z = false;
        }
        arrayList = c7037.f23219;
        if (arrayList != null) {
            arrayList5.add(c7037);
        }
        return arrayList5;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m17978() {
        int iM17975;
        if (m24378()) {
            return null;
        }
        char cCharAt = this.f30022.charAt(this.f30024);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        this.f30024++;
        int iIntValue = m24373().intValue();
        while (iIntValue != -1 && iIntValue != cCharAt) {
            if (iIntValue == 92) {
                iIntValue = m24373().intValue();
                if (iIntValue != -1) {
                    if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                        iIntValue = m24373().intValue();
                    } else {
                        int iM17976 = m17975(iIntValue);
                        if (iM17976 != -1) {
                            for (int i = 1; i <= 5 && (iM17975 = m17975((iIntValue = m24373().intValue()))) != -1; i++) {
                                iM17976 = (iM17976 * 16) + iM17975;
                            }
                            sb.append((char) iM17976);
                        }
                    }
                }
            }
            sb.append((char) iIntValue);
            iIntValue = m24373().intValue();
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m17977() {
        int iM17975;
        if (!m24378()) {
            int i = this.f30024;
            if (m24371("url(")) {
                m24374();
                String strM17978 = m17978();
                if (strM17978 == null) {
                    StringBuilder sb = new StringBuilder();
                    while (!m24378()) {
                        int i2 = this.f30024;
                        String str = this.f30022;
                        char cCharAt = str.charAt(i2);
                        if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '(' || cCharAt == ')' || C9208.m24364((int) cCharAt) || Character.isISOControl((int) cCharAt)) {
                            break;
                        }
                        this.f30024++;
                        if (cCharAt == '\\') {
                            if (!m24378()) {
                                int i3 = this.f30024;
                                this.f30024 = i3 + 1;
                                cCharAt = str.charAt(i3);
                                if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                                    int iM17976 = m17975(cCharAt);
                                    if (iM17976 != -1) {
                                        for (int i4 = 1; i4 <= 5 && !m24378() && (iM17975 = m17975(str.charAt(this.f30024))) != -1; i4++) {
                                            this.f30024++;
                                            iM17976 = (iM17976 * 16) + iM17975;
                                        }
                                        sb.append((char) iM17976);
                                    }
                                }
                            }
                        }
                        sb.append(cCharAt);
                    }
                    strM17978 = sb.length() == 0 ? null : sb.toString();
                }
                if (strM17978 == null) {
                    this.f30024 = i;
                    return null;
                }
                m24374();
                if (m24378() || m24371(MotionUtils.EASING_TYPE_FORMAT_END)) {
                    return strM17978;
                }
                this.f30024 = i;
                return null;
            }
        }
        return null;
    }
}
