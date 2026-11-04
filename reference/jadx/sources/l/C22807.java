package l;

import bin.mt.plus.R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩸۫۫, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes.dex */
public final class C22807 extends AbstractC9843 {
    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo2481(C12915 c12915) {
        return c12915.m31986("local") && !c12915.m31988();
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(C12915 c12915) {
        String name;
        c12915.m31970("local");
        C8614 c8614M31974 = c12915.m31974();
        boolean z = !c8614M31974.m23197() && c8614M31974.m23228("local");
        boolean zAnyMatch = C1170.stream(c12915.m31982()).anyMatch(new C11444(0));
        String strSubstring = "";
        if (c12915.m31981() == 1) {
            InterfaceC2386 interfaceC2386M31989 = c12915.m31989();
            if (interfaceC2386M31989.isDirectory()) {
                name = interfaceC2386M31989.getName();
            } else {
                name = interfaceC2386M31989.getName();
                int iLastIndexOf = name.lastIndexOf(46);
                if (iLastIndexOf != -1) {
                    String strSubstring2 = name.substring(0, iLastIndexOf);
                    strSubstring = name.substring(iLastIndexOf);
                    name = strSubstring2;
                }
            }
        } else {
            name = C14584.m35193(c12915.m31978(), new String[0]).getName();
        }
        C24364 c24364 = new C24364(c12915.m31979(), z, c8614M31974, c12915);
        c24364.m39554(name, strSubstring);
        c24364.m39553(c12915.m31981(), zAnyMatch, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51421(C8458 c8458, C12915 c12915, boolean z) {
        c8458.m22720("compressToAnother", z);
        if (z) {
            c8458.m22726(c12915);
        } else {
            c8458.m22728(c12915);
        }
        c8458.m22714();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13789 m51419(AbstractC18900 abstractC18900, String[] strArr, boolean z) {
        C13789 c13789 = new C13789();
        c13789.m33696(strArr, z, new C4226(abstractC18900));
        return c13789;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51423(AbstractC18900 abstractC18900, String[] strArr, List list, int i) {
        String strM34911;
        List list2 = (List) C1170.stream(list).map(new C7873(2)).collect(C2025.toList());
        try {
            ArrayList arrayListM51417 = m51417(list, new C13921(1));
            boolean z = i > 1;
            if (z) {
                abstractC18900.m43868(R.string.MT_Protector);
                abstractC18900.mo16839(0);
                if (abstractC18900 instanceof AbstractC19594) {
                    ((AbstractC19594) abstractC18900).m45194(0);
                }
            }
            for (String str : strArr) {
                if (!m51424(str, list2)) {
                    AbstractC22044 abstractC22044M35193 = C14584.m35193(str, new String[0]);
                    try {
                        if (abstractC22044M35193.mo42886()) {
                            strM34911 = m51416(abstractC22044M35193.mo4294());
                        } else {
                            strM34911 = C14453.m34911(abstractC22044M35193.mo4294());
                        }
                        if (!m51424(strM34911, arrayListM51417)) {
                            if (z) {
                                abstractC18900.mo29447(abstractC22044M35193.getName());
                            }
                            EnumC22346 enumC22346M50415 = EnumC22346.m50415(abstractC22044M35193.mo4281());
                            if (abstractC22044M35193.mo4296()) {
                                enumC22346M50415.m50417(str);
                            }
                        }
                    } catch (IOException unused) {
                    }
                }
            }
        } catch (IOException unused2) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m51416(String str) {
        String strM35186 = C14584.m35186(str);
        if (strM35186 != null) {
            return new File(C6382.f21566.mo4294(), strM35186).getPath();
        }
        return C14584.m35214(str) ? C6382.f21566.mo4294() : str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m51417(List list, C13921 c13921) {
        ArrayList arrayList = new ArrayList(list.size());
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC22044 abstractC22044 = (AbstractC22044) it.next();
            if (abstractC22044.mo42886()) {
                arrayList.add(m51416(abstractC22044.mo4294()));
            } else {
                String parent = abstractC22044.getParent();
                if (parent == null) {
                    arrayList.add(C14453.m34911(abstractC22044.mo4294()));
                } else {
                    String strM34911 = (String) map.get(parent);
                    if (strM34911 == null) {
                        strM34911 = C14453.m34911(parent);
                        map.put(parent, strM34911);
                    }
                    arrayList.add(new File(strM34911, abstractC22044.getName()).getPath());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m51424(String str, List list) {
        if (C14584.m35214(str) || C14584.m35210(str)) {
            return C1170.stream(list).anyMatch(new C7844(str, 1));
        }
        return C1170.stream(list).anyMatch(new C0289(1, str, str.endsWith("/") ? str : str.concat("/")));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m51418(List list) {
        return (List) C1170.stream(list).map(new C3398(0)).collect(C2025.toList());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51422(C12187 c12187, boolean z, boolean z2, C8614 c8614, C8614 c8615, List list) {
        if (c12187.m30474() && z2) {
            if (z) {
                c8614 = c8615;
            }
            c8614.m23209();
            c8614.m23176((Collection) list);
            c8614.m23216();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51420(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC22044) it.next()).mo4287();
        }
    }
}
