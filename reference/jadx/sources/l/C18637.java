package l;

import com.alipay.sdk.m.p.a;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.slider.BasicLabelFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ᩴ۠ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB7S */
/* JADX INFO: loaded from: classes5.dex */
public final class C18637 extends C0354 {
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m43103(int i) {
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

    public C18637(String str) {
        super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String m43105() {
        int i;
        int i2;
        boolean zM2054 = m2054();
        String str = this.f1782;
        if (zM2054) {
            i2 = this.f1783;
        } else {
            int i3 = this.f1783;
            int iCharAt = str.charAt(i3);
            if (iCharAt == 45) {
                iCharAt = m2045();
            }
            if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                i = i3;
            } else {
                int iM2045 = m2045();
                while (true) {
                    if ((iM2045 < 65 || iM2045 > 90) && ((iM2045 < 97 || iM2045 > 122) && !((iM2045 >= 48 && iM2045 <= 57) || iM2045 == 45 || iM2045 == 95))) {
                        break;
                    }
                    iM2045 = m2045();
                }
                i = this.f1783;
            }
            this.f1783 = i3;
            i2 = i;
        }
        int i4 = this.f1783;
        if (i2 == i4) {
            return null;
        }
        String strSubstring = str.substring(i4, i2);
        this.f1783 = i2;
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
    /* JADX WARN: Type inference failed for: r11v12, types: [l.᩸۠ܶ] */
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
    /* JADX WARN: Type inference failed for: r2v10, types: [l.᩻۠ܶ] */
    /* JADX WARN: Type inference failed for: r2v12, types: [l.᩻۠ܶ] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [l.᩻۠ܶ] */
    /* JADX WARN: Type inference failed for: r2v16, types: [l.᩻۠ܶ] */
    /* JADX WARN: Type inference failed for: r2v17, types: [l.᩻۠ܶ] */
    /* JADX WARN: Type inference failed for: r2v18, types: [l.᩻۠ܶ] */
    /* JADX WARN: Type inference failed for: r2v19, types: [l.᩻۠ܶ] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v14, types: [l.ᩳ۠ܶ] */
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
    /* JADX WARN: Type inference failed for: r7v2, types: [l.۠۠ܶ] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList m43104() throws C22871 {
        ArrayList arrayList;
        ?? r7;
        ?? r5;
        ?? c23577;
        ?? r11;
        EnumC21459 enumC21459;
        EnumC21459 enumC214510;
        ?? r12;
        String strM2055;
        ?? M43105;
        EnumC21459 enumC214511;
        int i;
        int i2;
        C9466 c9466M24236;
        C9466 c9466;
        C17931 c17931;
        Object obj;
        Object obj2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ?? arrayList4 = 0;
        if (m2054()) {
            return null;
        }
        int i3 = 1;
        ArrayList arrayList5 = new ArrayList(1);
        boolean z = false;
        C10877 c10877 = new C10877(0);
        while (!m2054() && !m2054()) {
            int i4 = this.f1783;
            ArrayList arrayList6 = c10877.f36987;
            if (arrayList6 == null || arrayList6.isEmpty()) {
                r7 = arrayList4;
            } else if (m2048('>')) {
                EnumC8054 enumC8054 = EnumC8054.CHILD;
                m2051();
                r7 = enumC8054;
            } else if (m2048('+')) {
                EnumC8054 enumC8055 = EnumC8054.FOLLOWS;
                m2051();
                r7 = enumC8055;
            } else {
                r7 = arrayList4;
            }
            if (m2048('*')) {
                c23577 = new C23577(r7, arrayList4);
                r5 = i3;
            } else {
                String strM43105 = m43105();
                if (strM43105 != null) {
                    C23577 c23578 = new C23577(r7, strM43105);
                    c10877.f36988 += i3;
                    r5 = i3;
                    c23577 = c23578;
                } else {
                    r5 = i3;
                    c23577 = arrayList4;
                }
            }
            while (!m2054()) {
                if (m2048('.')) {
                    if (c23577 == 0) {
                        c23577 = new C23577(r7, arrayList4);
                    }
                    String strM43106 = m43105();
                    if (strM43106 == null) {
                        throw new C22871("Invalid \".class\" simpleSelectors");
                    }
                    c23577.m52005(Name.LABEL, EnumC21459.EQUALS, strM43106);
                    c10877.m27246();
                } else if (m2048('#')) {
                    if (c23577 == 0) {
                        c23577 = new C23577(r7, arrayList4);
                    }
                    String strM43107 = m43105();
                    if (strM43107 == null) {
                        throw new C22871("Invalid \"#id\" simpleSelectors");
                    }
                    c23577.m52005("id", EnumC21459.EQUALS, strM43107);
                    c10877.f36988 += BasicLabelFormatter.MILLION;
                } else if (m2048('[')) {
                    if (c23577 == 0) {
                        c23577 = new C23577(r7, arrayList4);
                    }
                    m2051();
                    String strM43108 = m43105();
                    if (strM43108 == null) {
                        throw new C22871("Invalid attribute simpleSelectors");
                    }
                    m2051();
                    if (m2048(a.h)) {
                        enumC214511 = EnumC21459.EQUALS;
                    } else if (m2049("~=")) {
                        enumC214510 = EnumC21459.INCLUDES;
                    } else if (m2049("|=")) {
                        enumC21459 = EnumC21459.DASHMATCH;
                    } else {
                        r11 = arrayList4;
                    }
                    if (r11 != 0) {
                        r11 = enumC21459;
                        r11 = enumC214510;
                        m2051();
                        if (m2054()) {
                            M43105 = arrayList4;
                        } else {
                            strM2055 = m2055();
                            if (strM2055 == null) {
                                r11 = enumC214511;
                                M43105 = strM2055;
                                M43105 = m43105();
                            }
                        }
                        if (M43105 == 0) {
                            r11 = enumC214511;
                            throw new C22871("Invalid attribute simpleSelectors");
                        }
                        r11 = enumC214511;
                        m2051();
                        r12 = M43105;
                    } else {
                        r11 = enumC21459;
                        r11 = enumC214510;
                        r11 = enumC214511;
                        r12 = arrayList4;
                    }
                    ?? r13 = r11;
                    if (!m2048(']')) {
                        throw new C22871("Invalid attribute simpleSelectors");
                    }
                    if (r11 == 0) {
                        r13 = EnumC21459.EXISTS;
                    }
                    c23577.m52005(strM43108, r13, r12);
                    c10877.m27246();
                } else {
                    c23577 = c23577;
                    if (m2048(':')) {
                        if (c23577 == 0) {
                            c23577 = new C23577(r7, arrayList4);
                        }
                        String strM43109 = m43105();
                        if (strM43109 == null) {
                            throw new C22871("Invalid pseudo class");
                        }
                        EnumC20754 enumC20754M46759 = EnumC20754.m46759(strM43109);
                        switch (enumC20754M46759.ordinal()) {
                            case 0:
                                C12288 c12288 = new C12288();
                                c10877.m27246();
                                obj2 = c12288;
                                if (c23577.f76377 == null) {
                                    c23577.f76377 = new ArrayList();
                                }
                                c23577.f76377.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 1:
                                C16521 c16521 = new C16521();
                                c10877.m27246();
                                obj2 = c16521;
                                if (c23577.f76377 == null) {
                                    c23577.f76377 = new ArrayList();
                                }
                                c23577.f76377.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                                boolean z2 = enumC20754M46759 == EnumC20754.nth_child || enumC20754M46759 == EnumC20754.nth_of_type;
                                boolean z3 = enumC20754M46759 == EnumC20754.nth_of_type || enumC20754M46759 == EnumC20754.nth_last_of_type;
                                ?? r3 = arrayList4;
                                if (!m2054()) {
                                    int i5 = this.f1783;
                                    if (m2048('(')) {
                                        m2051();
                                        if (m2049("odd")) {
                                            r3 = arrayList4;
                                            c17931 = new C17931(2, r5 == true ? 1 : 0);
                                        } else if (m2049("even")) {
                                            r3 = arrayList4;
                                            c17931 = new C17931(2, z ? 1 : 0);
                                        } else {
                                            if (!m2048('+') && m2048('-')) {
                                                r3 = arrayList4;
                                                i = -1;
                                            } else {
                                                r3 = arrayList4;
                                                r3 = arrayList4;
                                                i = 1;
                                            }
                                            int i6 = this.f1783;
                                            int i7 = this.f1785;
                                            String str = this.f1782;
                                            C9466 c9466M24237 = C9466.m24236(i6, i7, str);
                                            if (c9466M24237 != null) {
                                                this.f1783 = c9466M24237.m24237();
                                            }
                                            if (m2048('n') || m2048('N')) {
                                                if (c9466M24237 == null) {
                                                    c9466M24237 = new C9466(this.f1783, 1L);
                                                }
                                                m2051();
                                                boolean zM2048 = m2048('+');
                                                i2 = (zM2048 || !(zM2048 = m2048('-'))) ? 1 : -1;
                                                if (zM2048) {
                                                    m2051();
                                                    c9466M24236 = C9466.m24236(this.f1783, i7, str);
                                                    if (c9466M24236 != null) {
                                                        this.f1783 = c9466M24236.m24237();
                                                    } else {
                                                        this.f1783 = i5;
                                                    }
                                                    r3 = 0;
                                                } else {
                                                    c9466M24236 = null;
                                                }
                                                C9466 c9467 = c9466M24236;
                                                c9466 = c9466M24237;
                                                c9466M24237 = c9467;
                                            } else {
                                                c9466 = null;
                                                i2 = i;
                                                i = 1;
                                            }
                                            c17931 = new C17931(c9466 == null ? 0 : i * c9466.m24238(), c9466M24237 == null ? 0 : c9466M24237.m24238() * i2);
                                        }
                                        m2051();
                                        r3 = c17931;
                                        if (!m2048(')')) {
                                            this.f1783 = i5;
                                            r3 = 0;
                                        }
                                    }
                                }
                                if (r3 == 0) {
                                    throw new C22871("Invalid or missing parameter section for pseudo class: ".concat(strM43109));
                                }
                                C10171 c10171 = new C10171(c23577.f76375, r3.f57366, r3.f57367, z2, z3);
                                c10877.m27246();
                                obj = c10171;
                                obj2 = obj;
                                if (c23577.f76377 == null) {
                                    c23577.f76377 = new ArrayList();
                                }
                                c23577.f76377.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                                break;
                            case 6:
                                C10171 c10172 = new C10171(null, 0, 1, true, false);
                                c10877.m27246();
                                obj2 = c10172;
                                if (c23577.f76377 == null) {
                                    c23577.f76377 = new ArrayList();
                                }
                                c23577.f76377.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 7:
                                C10171 c10173 = new C10171(null, 0, 1, false, false);
                                c10877.m27246();
                                obj2 = c10173;
                                if (c23577.f76377 == null) {
                                    c23577.f76377 = new ArrayList();
                                }
                                c23577.f76377.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 8:
                                C10171 c10174 = new C10171(c23577.f76375, 0, 1, true, true);
                                c10877.m27246();
                                obj2 = c10174;
                                if (c23577.f76377 == null) {
                                    c23577.f76377 = new ArrayList();
                                }
                                c23577.f76377.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 9:
                                C10171 c10175 = new C10171(c23577.f76375, 0, 1, false, true);
                                c10877.m27246();
                                obj2 = c10175;
                                if (c23577.f76377 == null) {
                                    c23577.f76377 = new ArrayList();
                                }
                                c23577.f76377.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 10:
                                C0292 c0292 = new C0292(z, arrayList4);
                                c10877.m27246();
                                obj = c0292;
                                obj2 = obj;
                                if (c23577.f76377 == null) {
                                    c23577.f76377 = new ArrayList();
                                }
                                c23577.f76377.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 11:
                                C0292 c0293 = new C0292(r5, c23577.f76375);
                                c10877.m27246();
                                obj2 = c0293;
                                if (c23577.f76377 == null) {
                                    c23577.f76377 = new ArrayList();
                                }
                                c23577.f76377.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 12:
                                C7348 c7348 = new C7348();
                                c10877.m27246();
                                obj2 = c7348;
                                if (c23577.f76377 == null) {
                                    c23577.f76377 = new ArrayList();
                                }
                                c23577.f76377.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            case 13:
                                if (!m2054()) {
                                    int i8 = this.f1783;
                                    if (m2048('(')) {
                                        m2051();
                                        ArrayList arrayListM43104 = m43104();
                                        if (arrayListM43104 != null && m2048(')')) {
                                            Iterator it = arrayListM43104.iterator();
                                            while (true) {
                                                if (!it.hasNext() || (arrayList2 = ((C10877) it.next()).f36987) == null) {
                                                    arrayList4 = arrayListM43104;
                                                } else {
                                                    Iterator it2 = arrayList2.iterator();
                                                    while (true) {
                                                        if (it2.hasNext() && (arrayList3 = ((C23577) it2.next()).f76377) != null) {
                                                            Iterator it3 = arrayList3.iterator();
                                                            while (true) {
                                                                if (it3.hasNext()) {
                                                                    if (((InterfaceC8760) it3.next()) instanceof C15816) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            this.f1783 = i8;
                                        }
                                    }
                                }
                                if (arrayList4 == 0) {
                                    throw new C22871("Invalid or missing parameter section for pseudo class: ".concat(strM43109));
                                }
                                C15816 c15816 = new C15816(arrayList4);
                                c10877.f36988 = c15816.m37592();
                                obj = c15816;
                                obj2 = obj;
                                if (c23577.f76377 == null) {
                                    c23577.f76377 = new ArrayList();
                                }
                                c23577.f76377.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                                break;
                            case 14:
                                if (!m2054()) {
                                    int i9 = this.f1783;
                                    if (m2048('(')) {
                                        m2051();
                                        while (true) {
                                            String strM431010 = m43105();
                                            arrayList4 = arrayList4;
                                            if (strM431010 == null) {
                                                this.f1783 = i9;
                                            } else {
                                                if (arrayList4 == 0) {
                                                    arrayList4 = new ArrayList();
                                                }
                                                arrayList4.add(strM431010);
                                                m2051();
                                                if (!m2043()) {
                                                    if (!m2048(')')) {
                                                        this.f1783 = i9;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                C20049 c20049 = new C20049(strM43109);
                                c10877.m27246();
                                obj2 = c20049;
                                if (c23577.f76377 == null) {
                                    c23577.f76377 = new ArrayList();
                                }
                                c23577.f76377.add(obj2);
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
                                C20049 c200410 = new C20049(strM43109);
                                c10877.m27246();
                                obj2 = c200410;
                                if (c23577.f76377 == null) {
                                    c23577.f76377 = new ArrayList();
                                }
                                c23577.f76377.add(obj2);
                                arrayList4 = 0;
                                r5 = 1;
                                z = false;
                                break;
                            default:
                                throw new C22871("Unsupported pseudo class: ".concat(strM43109));
                        }
                    } else {
                        if (c23577 != 0) {
                            this.f1783 = i4;
                            arrayList = c10877.f36987;
                            if (arrayList != null && !arrayList.isEmpty()) {
                                arrayList5.add(c10877);
                            }
                            return arrayList5;
                        }
                        if (c10877.f36987 == null) {
                            c10877.f36987 = new ArrayList();
                        }
                        c10877.f36987.add(c23577);
                        if (!m2043()) {
                            arrayList5.add(c10877);
                            c10877 = new C10877(0);
                        }
                        arrayList4 = 0;
                        i3 = 1;
                        z = false;
                    }
                }
            }
            if (c23577 != 0) {
                this.f1783 = i4;
                arrayList = c10877.f36987;
                if (arrayList != null) {
                    arrayList5.add(c10877);
                }
                return arrayList5;
            }
            if (c10877.f36987 == null) {
                c10877.f36987 = new ArrayList();
            }
            c10877.f36987.add(c23577);
            if (!m2043()) {
                arrayList5.add(c10877);
                c10877 = new C10877(0);
            }
            arrayList4 = 0;
            i3 = 1;
            z = false;
        }
        arrayList = c10877.f36987;
        if (arrayList != null) {
            arrayList5.add(c10877);
        }
        return arrayList5;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String m43107() {
        int iM43103;
        if (m2054()) {
            return null;
        }
        char cCharAt = this.f1782.charAt(this.f1783);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        this.f1783++;
        int iIntValue = m2052().intValue();
        while (iIntValue != -1 && iIntValue != cCharAt) {
            if (iIntValue == 92) {
                iIntValue = m2052().intValue();
                if (iIntValue != -1) {
                    if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                        iIntValue = m2052().intValue();
                    } else {
                        int iM43104 = m43103(iIntValue);
                        if (iM43104 != -1) {
                            for (int i = 1; i <= 5 && (iM43103 = m43103((iIntValue = m2052().intValue()))) != -1; i++) {
                                iM43104 = (iM43104 * 16) + iM43103;
                            }
                            sb.append((char) iM43104);
                        }
                    }
                }
            }
            sb.append((char) iIntValue);
            iIntValue = m2052().intValue();
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m43106() {
        int iM43103;
        if (!m2054()) {
            int i = this.f1783;
            if (m2049("url(")) {
                m2051();
                String strM43107 = m43107();
                if (strM43107 == null) {
                    StringBuilder sb = new StringBuilder();
                    while (!m2054()) {
                        int i2 = this.f1783;
                        String str = this.f1782;
                        char cCharAt = str.charAt(i2);
                        if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '(' || cCharAt == ')' || C0354.m2040((int) cCharAt) || Character.isISOControl((int) cCharAt)) {
                            break;
                        }
                        this.f1783++;
                        if (cCharAt == '\\') {
                            if (!m2054()) {
                                int i3 = this.f1783;
                                this.f1783 = i3 + 1;
                                cCharAt = str.charAt(i3);
                                if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                                    int iM43104 = m43103(cCharAt);
                                    if (iM43104 != -1) {
                                        for (int i4 = 1; i4 <= 5 && !m2054() && (iM43103 = m43103(str.charAt(this.f1783))) != -1; i4++) {
                                            this.f1783++;
                                            iM43104 = (iM43104 * 16) + iM43103;
                                        }
                                        sb.append((char) iM43104);
                                    }
                                }
                            }
                        }
                        sb.append(cCharAt);
                    }
                    strM43107 = sb.length() == 0 ? null : sb.toString();
                }
                if (strM43107 == null) {
                    this.f1783 = i;
                    return null;
                }
                m2051();
                if (m2054() || m2049(MotionUtils.EASING_TYPE_FORMAT_END)) {
                    return strM43107;
                }
                this.f1783 = i;
                return null;
            }
        }
        return null;
    }
}
