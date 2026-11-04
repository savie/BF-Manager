package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۚܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51V0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5721 extends C21442 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24367 f19728;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C16907 f19729;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f19730;

    public C5721(C16907 c16907, C24367 c24367) {
        this.f19729 = c16907;
        this.f19728 = c24367;
    }

    @Override // l.C21442
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4288 mo16787(C24404 c24404) {
        return new C10326(this, c24404);
    }

    @Override // l.C21442
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC4288 mo16789() {
        return new InterfaceC4288() { // from class: l.֡ᩴܺ
            @Override // l.InterfaceC4288
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final Object mo2798(Object obj) {
                return C5721.m16763(this.f2475, (String) obj);
            }
        };
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m16763(C5721 c5721, String str) {
        return c5721.f19729.m39887(str, str);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m16775(C5721 c5721, String str) {
        return c5721.f19729.m39887(str, str);
    }

    @Override // l.C21442
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC4288 mo16784(final C24404 c24404) {
        return new InterfaceC4288() { // from class: l.᩶ᩴܺ
            @Override // l.InterfaceC4288
            /* JADX INFO: renamed from: ۙ */
            public final Object mo2798(Object obj) {
                return C5721.m16767(this.f68751, c24404, (InterfaceC4859) obj);
            }
        };
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C2737 m16767(C5721 c5721, C24404 c24404, InterfaceC4859 interfaceC4859) {
        InterfaceC4859 c2737;
        C25113 c25113M39893 = c5721.f19729.m39893(interfaceC4859.mo6804());
        if (c25113M39893 == null || (c2737 = c25113M39893.m55986(c24404, interfaceC4859, c5721.f19728)) == null) {
            c2737 = new C2737(c24404, interfaceC4859);
        }
        return (C2737) c2737;
    }

    @Override // l.C21442
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4288 mo16788(final C24404 c24404) {
        return new InterfaceC4288() { // from class: l.ܿᩴܺ
            @Override // l.InterfaceC4288
            /* JADX INFO: renamed from: ۙ */
            public final Object mo2798(Object obj) {
                return C5721.m16766(this.f60229, c24404, (InterfaceC8304) obj);
            }
        };
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C1246 m16766(C5721 c5721, C24404 c24404, InterfaceC8304 interfaceC8304) {
        InterfaceC8304 c1246;
        C25113 c25113M39893 = c5721.f19729.m39893(interfaceC8304.mo4500());
        if (c25113M39893 == null || (c1246 = c25113M39893.m55987(c24404, interfaceC8304, c5721.f19728)) == null) {
            c1246 = new C1246(c24404, interfaceC8304);
        }
        return (C1246) c1246;
    }

    @Override // l.C21442
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22912 mo16785(C24404 c24404) {
        return new C22912(c24404);
    }

    @Override // l.C21442
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC4288 mo16790(final C24404 c24404) {
        return new InterfaceC4288() { // from class: l.ᩳᩴܺ
            @Override // l.InterfaceC4288
            /* JADX INFO: renamed from: ۙ */
            public final Object mo2798(Object obj) {
                return C5721.m16768(this.f62332, c24404, (InterfaceC7886) obj);
            }
        };
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C10194 m16768(C5721 c5721, C24404 c24404, InterfaceC7886 interfaceC7886) {
        if (interfaceC7886.getVisibility() == 2) {
            String type = interfaceC7886.getType();
            type.getClass();
            if (type.equals("Ldalvik/annotation/InnerClass;")) {
                return new C22875(c5721, c24404, interfaceC7886);
            }
            if (type.equals("Ldalvik/annotation/Signature;")) {
                return new C13178(c5721, c24404, interfaceC7886);
            }
        } else if (c5721.f19729.m39892(interfaceC7886.getType())) {
            return new C22129(c5721, c24404, interfaceC7886);
        }
        return new C10194(c24404, interfaceC7886);
    }

    @Override // l.C21442
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC4288 mo16791(C24404 c24404) {
        return new C1378(this, c24404);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Set m16765(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return new C9580(arrayList);
    }

    @Override // l.C21442
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4288 mo16786(final C24404 c24404) {
        return new InterfaceC4288() { // from class: l.۟ᩴܺ
            @Override // l.InterfaceC4288
            /* JADX INFO: renamed from: ۙ */
            public final Object mo2798(Object obj) {
                return new C2869(this.f26753, c24404, (InterfaceC7140) obj);
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b1  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16771(C5721 c5721, List list, HashMap map, C25113 c25113, int i, int i2, int i3) {
        String strM16778;
        int iM16782;
        int iMo1546;
        int iMo1547;
        String strM16773;
        int iM16783 = m16782(i, i2, list);
        if (iM16783 == -1 || (strM16778 = m16778((InterfaceC23331) list.get(iM16783))) == null || map.containsKey(Integer.valueOf(iM16783)) || (iM16782 = m16782(i, i3, list)) == -1) {
            return;
        }
        InterfaceC23331 interfaceC23331 = (InterfaceC23331) list.get(iM16782);
        if (interfaceC23331.mo30864() == EnumC22631.f73504 && ((InterfaceC19775) ((InterfaceC6177) interfaceC23331).getReference()).getType().equals("[Ljava/lang/Class;")) {
            int iM16784 = m16782(iM16782, ((InterfaceC18109) interfaceC23331).mo1541(), list);
            if (iM16784 == -1) {
                iMo1546 = -1;
            } else {
                InterfaceC23331 interfaceC23332 = (InterfaceC23331) list.get(iM16784);
                if (!(interfaceC23332 instanceof InterfaceC3193) || (iMo1546 = ((InterfaceC3193) interfaceC23332).mo1546()) < -1) {
                    iMo1546 = -1;
                }
            }
            if (iMo1546 == -1) {
                return;
            }
            String[] strArr = new String[iMo1546];
            while (true) {
                iM16782++;
                if (iM16782 >= i) {
                    break;
                }
                InterfaceC23331 interfaceC23333 = (InterfaceC23331) list.get(iM16782);
                if (interfaceC23333.mo30864() == EnumC22631.f73428) {
                    InterfaceC17253 interfaceC17253 = (InterfaceC17253) interfaceC23333;
                    if (interfaceC17253.mo1541() == i3) {
                        int iM16785 = m16782(iM16782, interfaceC17253.mo8187(), list);
                        if (iM16785 == -1) {
                            iMo1547 = -1;
                        } else {
                            InterfaceC23331 interfaceC23334 = (InterfaceC23331) list.get(iM16785);
                            if (!(interfaceC23334 instanceof InterfaceC3193) || (iMo1547 = ((InterfaceC3193) interfaceC23334).mo1546()) < -1) {
                                iMo1547 = -1;
                            }
                        }
                        if (iMo1547 != -1 && iMo1547 < iMo1546 && (strM16773 = m16773(iM16782, interfaceC17253.mo1542(), list)) != null) {
                            strArr[iMo1547] = strM16773;
                        }
                    }
                }
            }
            StringBuilder sb = new StringBuilder(strM16778);
            sb.append('(');
            for (int i4 = 0; i4 < iMo1546; i4++) {
                String str = strArr[i4];
                if (str == null) {
                    return;
                }
                sb.append(str);
            }
            sb.append(')');
            String strM55991 = c25113.m55991(sb.toString());
            if (strM55991 == null || strM55991.equals(strM16778)) {
                return;
            }
            map.put(Integer.valueOf(i), new C7212(iM16783, strM55991));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16770(C5721 c5721, List list, HashMap map, C25113 c25113, int i, int i2) {
        String strM16778;
        String strM55985;
        int iM16782 = m16782(i, i2, list);
        if (iM16782 == -1 || (strM16778 = m16778((InterfaceC23331) list.get(iM16782))) == null || map.containsKey(Integer.valueOf(iM16782)) || (strM55985 = c25113.m55985(strM16778)) == null || strM55985.equals(strM16778)) {
            return;
        }
        map.put(Integer.valueOf(iM16782), new C7212(i2, strM55985));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16769(C5721 c5721, List list, HashMap map, int i, int i2) {
        String strM16778;
        if (i == -1 || map.containsKey(Integer.valueOf(i)) || (strM16778 = m16778((InterfaceC23331) list.get(i))) == null || strM16778.isEmpty()) {
            return;
        }
        String strM16774 = m16774(strM16778);
        if (C22313.m50373(1, strM16774) != ';') {
            return;
        }
        String strM39887 = c5721.f19729.m39887(strM16774, strM16774);
        if (strM16774.equals(strM39887)) {
            return;
        }
        map.put(Integer.valueOf(i), new C7212(i2, m16783(strM39887)));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m16774(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        if (str.charAt(0) == '[') {
            if (C22313.m50373(1, str) == ';') {
                return str.replace('.', '/');
            }
        } else if (str.indexOf(47) == -1) {
            return "L" + str.replace('.', '/') + l.b;
        }
        return str;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static String m16783(String str) {
        if (str == null) {
            return null;
        }
        return ((str.length() <= 1 || str.charAt(0) != 'L') && C22313.m50373(1, str) != ';') ? str.replace('/', '.') : str.substring(1, str.length() - 1).replace('/', '.');
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m16773(int i, int i2, List list) {
        int iM16782 = m16782(i, i2, list);
        if (iM16782 != -1) {
            InterfaceC23331 interfaceC23331 = (InterfaceC23331) list.get(iM16782);
            if (interfaceC23331.mo30864() == EnumC22631.f73378) {
                return ((InterfaceC19775) ((InterfaceC6177) interfaceC23331).getReference()).getType();
            }
            if (interfaceC23331.mo30864() == EnumC22631.f73319) {
                int i3 = iM16782 - 1;
                while (true) {
                    if (i3 < 0) {
                        i3 = -1;
                        break;
                    }
                    if ((((InterfaceC23331) list.get(i3)).mo30864().f73512 & 8) != 0) {
                        break;
                    }
                    i3--;
                }
                if (i3 != -1) {
                    InterfaceC23331 interfaceC23332 = (InterfaceC23331) list.get(i3);
                    if (interfaceC23332.mo30864() == EnumC22631.f73304) {
                        InterfaceC6067 interfaceC6067 = (InterfaceC6067) interfaceC23332;
                        if (m16781((InterfaceC4859) interfaceC6067.getReference())) {
                            int iM16783 = m16782(i3, interfaceC6067.mo7063(), list);
                            return m16774(iM16783 != -1 ? m16778((InterfaceC23331) list.get(iM16783)) : null);
                        }
                    }
                }
            } else if (interfaceC23331.mo30864() == EnumC22631.f73455) {
                InterfaceC8304 interfaceC8304 = (InterfaceC8304) ((InterfaceC6177) interfaceC23331).getReference();
                if (interfaceC8304.getName().equals("TYPE") && interfaceC8304.getType().equals("Ljava/lang/Class;")) {
                    String strMo4500 = interfaceC8304.mo4500();
                    strMo4500.getClass();
                    switch (strMo4500) {
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m16778(InterfaceC23331 interfaceC23331) {
        if (interfaceC23331.mo30864().f73513 == 0) {
            return ((InterfaceC22759) ((InterfaceC6177) interfaceC23331).getReference()).getString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m16782(int i, int i2, List list) {
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            InterfaceC23331 interfaceC23331 = (InterfaceC23331) list.get(i);
            if ((interfaceC23331.mo30864().f73512 & 16) != 0 && (interfaceC23331 instanceof InterfaceC12142) && ((InterfaceC12142) interfaceC23331).mo1542() == i2) {
                return i;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m16781(InterfaceC4859 interfaceC4859) {
        return interfaceC4859.mo6804().equals("Ljava/lang/Class;") && interfaceC4859.getName().equals("forName") && interfaceC4859.mo6802().equals("Ljava/lang/Class;");
    }
}
