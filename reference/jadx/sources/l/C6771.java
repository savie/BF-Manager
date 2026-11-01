package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۜ۫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 51V0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6771 extends C21953 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20178 f22862;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C18060 f22863;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f22864;

    public C6771(C18060 c18060, C20178 c20178) {
        this.f22863 = c18060;
        this.f22862 = c20178;
    }

    @Override // l.C21953
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2196 mo18376(C11992 c11992) {
        return new C23830(this, c11992);
    }

    @Override // l.C21953
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC2196 mo1467() {
        return new InterfaceC2196() { // from class: l.ܿܽ᩺
            @Override // l.InterfaceC2196
            /* JADX INFO: renamed from: ۙ */
            public final Object mo1014(Object obj) {
                return C6771.m18356(this.f55616, (String) obj);
            }
        };
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m18356(C6771 c6771, String str) {
        return c6771.f22863.m42050(str, str);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m18367(C6771 c6771, String str) {
        return c6771.f22863.m42050(str, str);
    }

    @Override // l.C21953
    /* JADX INFO: renamed from: ۘ */
    public final InterfaceC2196 mo1465(final C11992 c11992) {
        return new InterfaceC2196() { // from class: l.ܽܽ᩺
            @Override // l.InterfaceC2196
            /* JADX INFO: renamed from: ۙ */
            public final Object mo1014(Object obj) {
                return C6771.m18359(this.f53686, c11992, (InterfaceC8858) obj);
            }
        };
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C3243 m18359(C6771 c6771, C11992 c11992, InterfaceC8858 interfaceC8858) {
        InterfaceC8858 c3243;
        C21588 c21588M42054 = c6771.f22863.m42054(interfaceC8858.mo9700());
        if (c21588M42054 == null || (c3243 = c21588M42054.m48301(c11992, interfaceC8858, c6771.f22862)) == null) {
            c3243 = new C3243(c11992, interfaceC8858);
        }
        return (C3243) c3243;
    }

    @Override // l.C21953
    /* JADX INFO: renamed from: ۚ */
    public final InterfaceC2196 mo1466(final C11992 c11992) {
        return new InterfaceC2196() { // from class: l.۫ܽ᩺
            @Override // l.InterfaceC2196
            /* JADX INFO: renamed from: ۙ */
            public final Object mo1014(Object obj) {
                return C6771.m18358(this.f41981, c11992, (InterfaceC18735) obj);
            }
        };
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C1832 m18358(C6771 c6771, C11992 c11992, InterfaceC18735 interfaceC18735) {
        InterfaceC18735 c1832;
        C21588 c21588M42054 = c6771.f22863.m42054(interfaceC18735.mo1183());
        if (c21588M42054 == null || (c1832 = c21588M42054.m48302(c11992, interfaceC18735, c6771.f22862)) == null) {
            c1832 = new C1832(c11992, interfaceC18735);
        }
        return (C1832) c1832;
    }

    @Override // l.C21953
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20666 mo18375(C11992 c11992) {
        return new C20666(c11992);
    }

    @Override // l.C21953
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2196 mo18378(final C11992 c11992) {
        return new InterfaceC2196() { // from class: l.ۧܽ᩺
            @Override // l.InterfaceC2196
            /* JADX INFO: renamed from: ۙ */
            public final Object mo1014(Object obj) {
                return C6771.m18360(this.f37771, c11992, (InterfaceC3710) obj);
            }
        };
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C14534 m18360(C6771 c6771, C11992 c11992, InterfaceC3710 interfaceC3710) {
        if (interfaceC3710.getVisibility() == 2) {
            String type = interfaceC3710.getType();
            type.getClass();
            if (type.equals("Ldalvik/annotation/InnerClass;")) {
                return new C22294(c6771, c11992, interfaceC3710);
            }
            if (type.equals("Ldalvik/annotation/Signature;")) {
                return new C3948(c6771, c11992, interfaceC3710);
            }
        } else if (c6771.f22863.m42052(interfaceC3710.getType())) {
            return new C2537(c6771, c11992, interfaceC3710);
        }
        return new C14534(c11992, interfaceC3710);
    }

    @Override // l.C21953
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2196 mo18374(C11992 c11992) {
        return new C14658(this, c11992);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Set m18357(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return new C1956(arrayList);
    }

    @Override // l.C21953
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC2196 mo18377(final C11992 c11992) {
        return new InterfaceC2196() { // from class: l.ۛܽ᩺
            @Override // l.InterfaceC2196
            /* JADX INFO: renamed from: ۙ */
            public final Object mo1014(Object obj) {
                return new C9719(this.f21068, c11992, (InterfaceC7945) obj);
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b1  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18363(C6771 c6771, List list, HashMap map, C21588 c21588, int i, int i2, int i3) {
        String strM18370;
        int iM18350;
        int iMo4063;
        int iMo4064;
        String strM18365;
        int iM18351 = m18350(i, i2, list);
        if (iM18351 == -1 || (strM18370 = m18370((InterfaceC1594) list.get(iM18351))) == null || map.containsKey(Integer.valueOf(iM18351)) || (iM18350 = m18350(i, i3, list)) == -1) {
            return;
        }
        InterfaceC1594 interfaceC1594 = (InterfaceC1594) list.get(iM18350);
        if (interfaceC1594.mo5435() == EnumC10297.f35314 && ((InterfaceC15914) ((InterfaceC13859) interfaceC1594).getReference()).getType().equals("[Ljava/lang/Class;")) {
            int iM18352 = m18350(iM18350, ((InterfaceC1157) interfaceC1594).mo1144(), list);
            if (iM18352 == -1) {
                iMo4063 = -1;
            } else {
                InterfaceC1594 interfaceC1595 = (InterfaceC1594) list.get(iM18352);
                if (!(interfaceC1595 instanceof InterfaceC9357) || (iMo4063 = ((InterfaceC9357) interfaceC1595).mo4063()) < -1) {
                    iMo4063 = -1;
                }
            }
            if (iMo4063 == -1) {
                return;
            }
            String[] strArr = new String[iMo4063];
            while (true) {
                iM18350++;
                if (iM18350 >= i) {
                    break;
                }
                InterfaceC1594 interfaceC1596 = (InterfaceC1594) list.get(iM18350);
                if (interfaceC1596.mo5435() == EnumC10297.f35049) {
                    InterfaceC23737 interfaceC23737 = (InterfaceC23737) interfaceC1596;
                    if (interfaceC23737.mo1144() == i3) {
                        int iM18353 = m18350(iM18350, interfaceC23737.mo26898(), list);
                        if (iM18353 == -1) {
                            iMo4064 = -1;
                        } else {
                            InterfaceC1594 interfaceC1597 = (InterfaceC1594) list.get(iM18353);
                            if (!(interfaceC1597 instanceof InterfaceC9357) || (iMo4064 = ((InterfaceC9357) interfaceC1597).mo4063()) < -1) {
                                iMo4064 = -1;
                            }
                        }
                        if (iMo4064 != -1 && iMo4064 < iMo4063 && (strM18365 = m18365(iM18350, interfaceC23737.mo1140(), list)) != null) {
                            strArr[iMo4064] = strM18365;
                        }
                    }
                }
            }
            StringBuilder sb = new StringBuilder(strM18370);
            sb.append('(');
            for (int i4 = 0; i4 < iMo4063; i4++) {
                String str = strArr[i4];
                if (str == null) {
                    return;
                }
                sb.append(str);
            }
            sb.append(')');
            String strM48306 = c21588.m48306(sb.toString());
            if (strM48306 == null || strM48306.equals(strM18370)) {
                return;
            }
            map.put(Integer.valueOf(i), new C13973(iM18351, strM48306));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18362(C6771 c6771, List list, HashMap map, C21588 c21588, int i, int i2) {
        String strM18370;
        String strM48300;
        int iM18350 = m18350(i, i2, list);
        if (iM18350 == -1 || (strM18370 = m18370((InterfaceC1594) list.get(iM18350))) == null || map.containsKey(Integer.valueOf(iM18350)) || (strM48300 = c21588.m48300(strM18370)) == null || strM48300.equals(strM18370)) {
            return;
        }
        map.put(Integer.valueOf(iM18350), new C13973(i2, strM48300));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18361(C6771 c6771, List list, HashMap map, int i, int i2) {
        String strM18370;
        if (i == -1 || map.containsKey(Integer.valueOf(i)) || (strM18370 = m18370((InterfaceC1594) list.get(i))) == null || strM18370.isEmpty()) {
            return;
        }
        String strM18366 = m18366(strM18370);
        if (C3184.m9601(1, strM18366) != ';') {
            return;
        }
        String strM42050 = c6771.f22863.m42050(strM18366, strM18366);
        if (strM18366.equals(strM42050)) {
            return;
        }
        map.put(Integer.valueOf(i), new C13973(i2, m18351(strM42050)));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m18366(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        if (str.charAt(0) == '[') {
            if (C3184.m9601(1, str) == ';') {
                return str.replace('.', '/');
            }
        } else if (str.indexOf(47) == -1) {
            return "L" + str.replace('.', '/') + l.b;
        }
        return str;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static String m18351(String str) {
        if (str == null) {
            return null;
        }
        return ((str.length() <= 1 || str.charAt(0) != 'L') && C3184.m9601(1, str) != ';') ? str.replace('/', '.') : str.substring(1, str.length() - 1).replace('/', '.');
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m18365(int i, int i2, List list) {
        int iM18350 = m18350(i, i2, list);
        if (iM18350 != -1) {
            InterfaceC1594 interfaceC1594 = (InterfaceC1594) list.get(iM18350);
            if (interfaceC1594.mo5435() == EnumC10297.f35061) {
                return ((InterfaceC15914) ((InterfaceC13859) interfaceC1594).getReference()).getType();
            }
            if (interfaceC1594.mo5435() == EnumC10297.f35189) {
                int i3 = iM18350 - 1;
                while (true) {
                    if (i3 < 0) {
                        i3 = -1;
                        break;
                    }
                    if ((((InterfaceC1594) list.get(i3)).mo5435().f35324 & 8) != 0) {
                        break;
                    }
                    i3--;
                }
                if (i3 != -1) {
                    InterfaceC1594 interfaceC1595 = (InterfaceC1594) list.get(i3);
                    if (interfaceC1595.mo5435() == EnumC10297.f35162) {
                        InterfaceC13797 interfaceC13797 = (InterfaceC13797) interfaceC1595;
                        if (m18373((InterfaceC8858) interfaceC13797.getReference())) {
                            int iM18351 = m18350(i3, interfaceC13797.mo3085(), list);
                            return m18366(iM18351 != -1 ? m18370((InterfaceC1594) list.get(iM18351)) : null);
                        }
                    }
                }
            } else if (interfaceC1594.mo5435() == EnumC10297.f35267) {
                InterfaceC18735 interfaceC18735 = (InterfaceC18735) ((InterfaceC13859) interfaceC1594).getReference();
                if (interfaceC18735.getName().equals("TYPE") && interfaceC18735.getType().equals("Ljava/lang/Class;")) {
                    String strMo1183 = interfaceC18735.mo1183();
                    strMo1183.getClass();
                    switch (strMo1183) {
                        case "Ljava/lang/Integer;":
                            return "I";
                        case "Ljava/lang/Boolean;":
                        case "Ljava/lang/Byte;":
                            return "B";
                        case "Ljava/lang/Double;":
                            return "D";
                        case "Ljava/lang/Character;":
                            return "C";
                        case "Ljava/lang/Float;":
                            return "F";
                        case "Ljava/lang/Long;":
                            return "J";
                        case "Ljava/lang/Void;":
                            return "V";
                        case "Ljava/lang/Short;":
                            return "S";
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m18370(InterfaceC1594 interfaceC1594) {
        if (interfaceC1594.mo5435().f35329 == 0) {
            return ((InterfaceC20852) ((InterfaceC13859) interfaceC1594).getReference()).getString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int m18350(int i, int i2, List list) {
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            InterfaceC1594 interfaceC1594 = (InterfaceC1594) list.get(i);
            if ((interfaceC1594.mo5435().f35324 & 16) != 0 && (interfaceC1594 instanceof InterfaceC4685) && ((InterfaceC4685) interfaceC1594).mo1140() == i2) {
                return i;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m18373(InterfaceC8858 interfaceC8858) {
        return interfaceC8858.mo9700().equals("Ljava/lang/Class;") && interfaceC8858.getName().equals("forName") && interfaceC8858.mo9698().equals("Ljava/lang/Class;");
    }
}
