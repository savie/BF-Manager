package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.simpleframework.xml.core.AnnotationHandler;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.᩵۠ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: OIYE */
/* JADX INFO: loaded from: classes5.dex */
public final class C20430 extends AbstractC16700 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final Map f65438;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final List f65439;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final Set f65440;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C1610 f65441;

    @Override // l.AbstractC16700, l.InterfaceC13673
    public final String getName() {
        return "ApplyVariableNames";
    }

    static {
        String[] strArr = {"java.lang.String", "str", "java.lang.Class", "cls", "java.lang.Throwable", "th", "java.lang.Object", "obj", "java.util.Iterator", "it", "java.util.HashMap", "map", "java.lang.Boolean", "bool", "java.lang.Short", "sh", "java.lang.Integer", "num", "java.lang.Character", "ch", "java.lang.Byte", "b", "java.lang.Float", "f", "java.lang.Long", "l", "java.lang.Double", "d", "java.lang.StringBuilder", "sb", "java.lang.Exception", "exc"};
        HashMap map = new HashMap(16);
        int iM9136 = 0;
        for (int i = 0; i < 31; i += 2) {
            map.put(strArr[i], strArr[i + 1]);
        }
        f65438 = C4681.unmodifiableMap(map);
        Object[] objArr = {"size", Name.LENGTH, "list", "map", "next"};
        HashSet hashSet = new HashSet(5);
        for (int i2 = 0; i2 < 5; i2++) {
            Object obj = objArr[i2];
            C17359.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C14483.m34971("duplicate element: ", obj));
            }
        }
        f65440 = C4681.unmodifiableSet(hashSet);
        Object[] objArr2 = {"get", "set", "to", "parse", "read", "format"};
        ArrayList arrayList = new ArrayList(6);
        while (iM9136 < 6) {
            Object obj2 = objArr2[iM9136];
            iM9136 = C2764.m9136(obj2, arrayList, obj2, iM9136, 1);
        }
        f65439 = C4681.unmodifiableList(arrayList);
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo8439(C1610 c1610) {
        this.f65441 = c1610;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0088  */
    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(C2551 c2551) {
        String strM46855;
        String strM46856;
        Iterator it = c2551.m8490().iterator();
        while (it.hasNext()) {
            C11260 c11260M41945 = ((C17973) it.next()).m41945();
            if (c11260M41945.m28512()) {
                strM46855 = "this";
            } else if (c11260M41945.m28516() && (c11260M41945.m28513() == null || c11260M41945.m28513().isEmpty())) {
                List listM28519 = c11260M41945.m28519();
                if (!C4123.m13232((Collection) listM28519) || C1170.stream(listM28519).anyMatch(new C6563(3))) {
                    strM46855 = m46855(c11260M41945.m28517());
                } else {
                    Iterator it2 = listM28519.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            strM46855 = m46855(c11260M41945.m28517());
                            break;
                        }
                        C17973 c17973 = (C17973) it2.next();
                        String name = c17973.getName();
                        if (name != null) {
                            strM46856 = name;
                        } else {
                            C18959 c18959M41951 = c17973.m41951();
                            if (c18959M41951 != null) {
                                strM46856 = m46856(c17973, c18959M41951);
                                if (!C13534.m33239(strM46856)) {
                                    strM46856 = null;
                                }
                            } else {
                                strM46856 = null;
                            }
                        }
                        if (strM46856 != null) {
                            strM46855 = strM46856;
                            break;
                        }
                    }
                }
            } else {
                strM46855 = null;
            }
            if (strM46855 != null) {
                c11260M41945.m28506(strM46855);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:42:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:63:0x010e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0120  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m46856(C17973 c17973, C18959 c18959) {
        String strM46855;
        String str;
        String strM46856;
        int i = C3276.f10661[c18959.getType().ordinal()];
        Map map = f65438;
        String strSubstring = null;
        switch (i) {
            case 1:
                C21965 c21965Mo18926 = ((C21219) c18959).mo18926();
                String strM49696 = c21965Mo18926.m49696();
                C1345 c1345M49700 = c21965Mo18926.m49700();
                if ("getInstance".equals(strM49696)) {
                    String str2 = (String) map.get(c1345M49700.m4957());
                    return str2 != null ? str2 : m46854(c1345M49700);
                }
                for (String str3 : f65439) {
                    if (strM49696.startsWith(str3)) {
                        strSubstring = strM49696.substring(str3.length());
                        if (strSubstring != null) {
                            return m46853(strSubstring);
                        }
                        if ("iterator".equals(strM49696)) {
                            return "it";
                        }
                        if (AnnotationHandler.STRING.equals(strM49696)) {
                            str = (String) map.get(c1345M49700.m4957());
                            if (str != null) {
                                return str;
                            }
                            return m46854(c1345M49700);
                        }
                        if (!"forName".equals(strM49696) && c1345M49700.getType().equals(AbstractC1566.f5427)) {
                            return (String) map.get("java.lang.Class");
                        }
                        if (!f65440.contains(strM49696)) {
                            strM46855 = m46855(c17973.m41945().m28517());
                            if (!strM46855.equalsIgnoreCase(strM49696)) {
                                StringBuilder sbM27333 = C10732.m27333(strM46855);
                                int i2 = C12326.f39603;
                                if (strM49696 != null && !strM49696.isEmpty()) {
                                    strM49696 = Character.toUpperCase(strM49696.charAt(0)) + strM49696.substring(1);
                                }
                                sbM27333.append(strM49696);
                                return sbM27333.toString();
                            }
                        }
                        return strM49696;
                    }
                }
                if (strSubstring != null) {
                    return m46853(strSubstring);
                }
                if ("iterator".equals(strM49696)) {
                    return "it";
                }
                if (AnnotationHandler.STRING.equals(strM49696)) {
                    str = (String) map.get(c1345M49700.m4957());
                    if (str != null) {
                        return str;
                    }
                    return m46854(c1345M49700);
                }
                if (!"forName".equals(strM49696)) {
                }
                if (!f65440.contains(strM49696)) {
                    strM46855 = m46855(c17973.m41945().m28517());
                    if (!strM46855.equalsIgnoreCase(strM49696)) {
                        StringBuilder sbM27334 = C10732.m27333(strM46855);
                        int i3 = C12326.f39603;
                        if (strM49696 != null) {
                            strM49696 = Character.toUpperCase(strM49696.charAt(0)) + strM49696.substring(1);
                        }
                        sbM27334.append(strM49696);
                        return sbM27334.toString();
                    }
                }
                return strM49696;
            case 2:
                C6787 c6787 = (C6787) c18959;
                InterfaceC21197 interfaceC21197M19301 = this.f65441.m5683().m19301(c6787);
                C2551 c2551 = interfaceC21197M19301 instanceof C2551 ? (C2551) interfaceC21197M19301 : null;
                if (c2551 == null || !c2551.mo17865(EnumC1763.ANONYMOUS_CONSTRUCTOR)) {
                    C1345 c1345M18927 = c6787.m18927();
                    String str4 = (String) map.get(c1345M18927.m4957());
                    return str4 != null ? str4 : m46854(c1345M18927);
                }
                return null;
            case 3:
                return Name.LENGTH;
            case 4:
            case 5:
            case 6:
                for (AbstractC16481 abstractC16481 : c18959.m44026()) {
                    abstractC16481.getClass();
                    if ((abstractC16481 instanceof C17227) && (strM46856 = m46856(c17973, ((C17227) abstractC16481).m40461())) != null) {
                        return strM46856;
                    }
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m46855(AbstractC1566 abstractC1566) {
        if (abstractC1566.m5556()) {
            return abstractC1566.mo5558().m30193().toLowerCase();
        }
        if (abstractC1566.m5554()) {
            return C8947.m23910(new StringBuilder(), m46855(abstractC1566.mo5555()), "Arr");
        }
        if (abstractC1566.m5569()) {
            return C12326.m30749(abstractC1566.mo5570().toLowerCase());
        }
        if (!abstractC1566.mo5543()) {
            return C12326.m30749(abstractC1566.toString());
        }
        String str = (String) f65438.get(abstractC1566.mo5570());
        return str != null ? str : m46854(C1345.m4955(this.f65441, abstractC1566));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m46854(C1345 c1345) {
        String strM4965 = c1345.m4965();
        String strM46853 = m46853(strM4965);
        if (strM46853 != null) {
            return strM46853;
        }
        String strM30749 = C12326.m30749(strM4965.toLowerCase());
        return strM4965.equals(strM30749) ? C14483.m34972(strM30749, "Var") : strM30749;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m46853(String str) {
        if (str != null && !str.isEmpty()) {
            if (str.toUpperCase().equals(str)) {
                return str.toLowerCase();
            }
            String str2 = Character.toLowerCase(str.charAt(0)) + str.substring(1);
            if (!str2.equals(str)) {
                return str2;
            }
            if (str.length() < 3) {
                return str.concat("Var");
            }
        }
        return null;
    }
}
