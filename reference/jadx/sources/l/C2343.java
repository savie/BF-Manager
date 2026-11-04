package l;

import bin.mt.plus.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.ۖ֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6KJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2343 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f7557;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f7558;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f7559;

    public C2343(String str, String str2, String str3, String str4) {
        this.f7558 = str;
        String strM7887 = m7887(str2);
        this.f7559 = strM7887;
        String strM7888 = m7888(str3);
        if (!strM7887.startsWith(strM7888)) {
            throw new IllegalArgumentException("HTML document is outside the root boundary");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C9054(strM7888, str4));
        int length = strM7888.length();
        while (true) {
            int iIndexOf = this.f7559.indexOf(47, length);
            if (iIndexOf >= 0) {
                int i = iIndexOf + 1;
                arrayList.add(new C9054(this.f7559.substring(0, i), this.f7559.substring(length, iIndexOf)));
                length = i;
            } else {
                this.f7557 = C4681.unmodifiableList(arrayList);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2343 m7885(C8614 c8614, InterfaceC2386 interfaceC2386) {
        int iIndexOf;
        AbstractC7364 abstractC7364M23213 = c8614.m23213();
        AbstractC7629 abstractC7629Mo10174 = abstractC7364M23213.mo10174();
        if (abstractC7629Mo10174 instanceof C11969) {
            return m7886(interfaceC2386.getPath());
        }
        String strSubstring = "/";
        if (!(abstractC7629Mo10174 instanceof AbstractC18881)) {
            String strM7882 = m7882(abstractC7629Mo10174);
            if (strM7882 != null) {
                return new C2343(m7881(abstractC7364M23213, m7883(c8614.m23194()), new ArrayList()), interfaceC2386.getPath(), "/", C14584.m35193(strM7882, new String[0]).getName());
            }
            throw new IllegalArgumentException("Unsupported HTML preview source");
        }
        AbstractC18881 abstractC18881 = (AbstractC18881) abstractC7629Mo10174;
        String path = interfaceC2386.getPath();
        String name = abstractC18881.m43788().getName();
        if ((abstractC18881 instanceof C18924) && (iIndexOf = path.indexOf(47, 1)) > 1) {
            strSubstring = path.substring(0, iIndexOf + 1);
            StringBuilder sbM10405 = C3188.m10405(name, " / ");
            sbM10405.append(path.substring(1, iIndexOf));
            name = sbM10405.toString();
        }
        return new C2343(m7880(abstractC18881.m43788()), path, strSubstring, name);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C2343 m7886(String str) {
        String name;
        String strMo4294;
        String strM35207 = C14584.m35207(m7887(str));
        String strM49088 = C21576.m49088(R.string.MT_Protector);
        if (C14584.m35214(strM35207)) {
            strMo4294 = C6382.f21566.mo4294();
            name = C21576.m49088(R.string.MT_Protector);
        } else {
            AbstractC22044 abstractC22044M35193 = C14584.m35193(strM35207, new String[0]);
            if (abstractC22044M35193.mo7468()) {
                C25291 c25291M7465 = abstractC22044M35193.mo7467().m7465();
                name = c25291M7465.m56469();
                strM49088 = c25291M7465.f81686;
                if (strM49088 == null) {
                    strMo4294 = name;
                } else {
                    String str2 = name;
                    name = strM49088;
                    strMo4294 = str2;
                }
            } else {
                C16997 c16997M41554 = C17743.m41554(strM35207);
                if (c16997M41554 != null) {
                    File file = c16997M41554.f55538;
                    String path = file.getPath();
                    name = c16997M41554.f55539;
                    if (name == null) {
                        name = file.getName();
                    }
                    strMo4294 = path;
                } else {
                    name = "/";
                    String str3 = name;
                    name = strM49088;
                    strMo4294 = str3;
                }
            }
        }
        return new C2343("local", strM35207, strMo4294, name);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m7880(AbstractC0148 abstractC0148) {
        return "network:" + abstractC0148.f1127 + ":" + C15022.m36181(abstractC0148.getClass().getName() + WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR + abstractC0148.mo1325());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m7881(AbstractC7364 abstractC7364, ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2.contains(Integer.valueOf(abstractC7364.m20191()))) {
            return null;
        }
        arrayList2.add(Integer.valueOf(abstractC7364.m20191()));
        AbstractC7629 abstractC7629Mo10174 = abstractC7364.mo10174();
        if (abstractC7629Mo10174 instanceof C11969) {
            return "local";
        }
        if (abstractC7629Mo10174 instanceof AbstractC18881) {
            return m7880(((AbstractC18881) abstractC7629Mo10174).m43788());
        }
        String strM7882 = m7882(abstractC7629Mo10174);
        if (strM7882 == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC7364 abstractC7365 = (AbstractC7364) it.next();
            if (abstractC7365.m20191() == abstractC7364.m20204()) {
                for (C21120 c21120 : abstractC7365.m20206()) {
                    if (C14584.m35211(strM7882, c21120.m48215().mo4294())) {
                        String strM7881 = m7881(abstractC7365, arrayList, arrayList2);
                        if (strM7881 == null) {
                            return null;
                        }
                        return m7879(abstractC7629Mo10174.mo20842(), strM7881, c21120.m48220());
                    }
                }
                break;
            }
        }
        if (C14584.m35198(strM7882, C6382.f21563.mo4294()) || C14584.m35198(strM7882, C6382.f21564.mo4294()) || C14584.m35198(strM7882, C6382.f21562.mo4294())) {
            return null;
        }
        return m7879(abstractC7629Mo10174.mo20842(), "local", C14584.m35207(strM7882));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m7879(String str, String str2, String str3) {
        if (!str3.startsWith("/")) {
            str3 = "/".concat(str3);
        }
        StringBuilder sbM10405 = C3188.m10405(str, ":");
        StringBuilder sbM10406 = C3188.m10405(str2, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
        sbM10406.append(m7887(str3));
        sbM10405.append(C15022.m36181(sbM10406.toString()));
        return sbM10405.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m7882(AbstractC7629 abstractC7629) {
        if (abstractC7629 instanceof C24320) {
            return ((C24320) abstractC7629).m54361();
        }
        if (abstractC7629 instanceof C11312) {
            return ((C11312) abstractC7629).m28592();
        }
        if (abstractC7629 instanceof C17036) {
            return ((C17036) abstractC7629).m40138();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m7883(C20065 c20065) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c20065.m46139().m23213());
        arrayList.add(c20065.m46182().m23213());
        c20065.m46173();
        try {
            arrayList.addAll(c20065.m46163());
            return arrayList;
        } finally {
            c20065.m46157();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m7884(C8614 c8614) {
        AbstractC7629 abstractC7629M23223 = c8614.m23223();
        String strM7882 = m7882(abstractC7629M23223);
        if (strM7882 == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(strM7882);
        if (abstractC7629M23223 instanceof C11312) {
            arrayList.add(((C11312) abstractC7629M23223).m28588());
        }
        if (abstractC7629M23223 instanceof C17036) {
            Iterator it = ((C17036) abstractC7629M23223).m40140().iterator();
            while (it.hasNext()) {
                arrayList.add(((C11815) it.next()).m29659().mo4294());
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC7364 abstractC7364 : m7883(c8614.m23194())) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                long jM20194 = abstractC7364.m20194((String) it2.next());
                if (jM20194 != 0) {
                    arrayList2.add(Long.valueOf(jM20194));
                    break;
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static String m7888(String str) {
        String strM7887 = m7887(str);
        return strM7887.endsWith("/") ? strM7887 : strM7887.concat("/");
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static String m7887(String str) {
        if (!str.startsWith("/")) {
            throw new IllegalArgumentException("Invalid HTML preview path");
        }
        String strM41985 = C18004.m41985(str);
        if (strM41985 == null) {
            throw new IllegalArgumentException("Invalid HTML preview path");
        }
        return "/".concat(strM41985);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m7889(String str) {
        int i = 0;
        while (true) {
            List list = this.f7557;
            if (i >= list.size()) {
                return -1;
            }
            if (((C9054) list.get(i)).f29448.equals(str)) {
                return i;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m7891(String str) {
        if (m7889(str) < 0) {
            throw new IllegalArgumentException("Invalid HTML preview root");
        }
        return this.f7559.substring(str.length());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m7890() {
        return ((C9054) C7750.m21093(1, this.f7557)).f29448;
    }
}
