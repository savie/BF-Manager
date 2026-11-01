package l;

import bin.mt.plus.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.ᩴۚ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D6KJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18559 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f59045;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f59046;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f59047;

    public C18559(String str, String str2, String str3, String str4) {
        this.f59046 = str;
        String strM42970 = m42970(str2);
        this.f59047 = strM42970;
        String strM42962 = m42962(str3);
        if (!strM42970.startsWith(strM42962)) {
            throw new IllegalArgumentException("HTML document is outside the root boundary");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C17853(strM42962, str4));
        int length = strM42962.length();
        while (true) {
            int iIndexOf = this.f59047.indexOf(47, length);
            if (iIndexOf >= 0) {
                int i = iIndexOf + 1;
                arrayList.add(new C17853(this.f59047.substring(0, i), this.f59047.substring(length, iIndexOf)));
                length = i;
            } else {
                this.f59045 = C0561.unmodifiableList(arrayList);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18559 m42969(C11545 c11545, InterfaceC2557 interfaceC2557) {
        int iIndexOf;
        AbstractC11462 abstractC11462M28817 = c11545.m28817();
        AbstractC9677 abstractC9677Mo13029 = abstractC11462M28817.mo13029();
        if (abstractC9677Mo13029 instanceof C21611) {
            return m42971(interfaceC2557.getPath());
        }
        String strSubstring = "/";
        if (!(abstractC9677Mo13029 instanceof AbstractC12233)) {
            String strM42964 = m42964(abstractC9677Mo13029);
            if (strM42964 != null) {
                return new C18559(m42965(abstractC11462M28817, m42967(c11545.m28807()), new ArrayList()), interfaceC2557.getPath(), "/", C5553.m15313(strM42964, new String[0]).getName());
            }
            throw new IllegalArgumentException("Unsupported HTML preview source");
        }
        AbstractC12233 abstractC12233 = (AbstractC12233) abstractC9677Mo13029;
        String path = interfaceC2557.getPath();
        String name = abstractC12233.m30345().getName();
        if ((abstractC12233 instanceof C17543) && (iIndexOf = path.indexOf(47, 1)) > 1) {
            strSubstring = path.substring(0, iIndexOf + 1);
            StringBuilder sbM8976 = C3012.m8976(name, " / ");
            sbM8976.append(path.substring(1, iIndexOf));
            name = sbM8976.toString();
        }
        return new C18559(m42966(abstractC12233.m30345()), path, strSubstring, name);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C18559 m42971(String str) {
        String name;
        String strMo33986;
        String strM15323 = C5553.m15323(m42970(str));
        String strM39288 = C16737.m39288(R.string.MT_Protector);
        if (C5553.m15304(strM15323)) {
            strMo33986 = C11904.f39934.mo33986();
            name = C16737.m39288(R.string.MT_Protector);
        } else {
            AbstractC20745 abstractC20745M15313 = C5553.m15313(strM15323, new String[0]);
            if (abstractC20745M15313.mo46731()) {
                C18295 c18295M51272 = abstractC20745M15313.mo46707().m51272();
                name = c18295M51272.m42503();
                strM39288 = c18295M51272.f58377;
                if (strM39288 == null) {
                    strMo33986 = name;
                } else {
                    String str2 = name;
                    name = strM39288;
                    strMo33986 = str2;
                }
            } else {
                C18149 c18149M21690 = C8272.m21690(strM15323);
                if (c18149M21690 != null) {
                    File file = c18149M21690.f58039;
                    String path = file.getPath();
                    name = c18149M21690.f58040;
                    if (name == null) {
                        name = file.getName();
                    }
                    strMo33986 = path;
                } else {
                    name = "/";
                    String str3 = name;
                    name = strM39288;
                    strMo33986 = str3;
                }
            }
        }
        return new C18559("local", strM15323, strMo33986, name);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m42966(AbstractC12068 abstractC12068) {
        return "network:" + abstractC12068.f40385 + ":" + C22253.m49423(abstractC12068.getClass().getName() + WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR + abstractC12068.mo4700());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m42965(AbstractC11462 abstractC11462, ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2.contains(Integer.valueOf(abstractC11462.m28617()))) {
            return null;
        }
        arrayList2.add(Integer.valueOf(abstractC11462.m28617()));
        AbstractC9677 abstractC9677Mo13029 = abstractC11462.mo13029();
        if (abstractC9677Mo13029 instanceof C21611) {
            return "local";
        }
        if (abstractC9677Mo13029 instanceof AbstractC12233) {
            return m42966(((AbstractC12233) abstractC9677Mo13029).m30345());
        }
        String strM42964 = m42964(abstractC9677Mo13029);
        if (strM42964 == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC11462 abstractC11463 = (AbstractC11462) it.next();
            if (abstractC11463.m28617() == abstractC11462.m28632()) {
                for (C23540 c23540 : abstractC11463.m28631()) {
                    if (C5553.m15330(strM42964, c23540.m51884().mo33986())) {
                        String strM42965 = m42965(abstractC11463, arrayList, arrayList2);
                        if (strM42965 == null) {
                            return null;
                        }
                        return m42963(abstractC9677Mo13029.mo15077(), strM42965, c23540.m51888());
                    }
                }
                break;
            }
        }
        if (C5553.m15319(strM42964, C11904.f39941.mo33986()) || C5553.m15319(strM42964, C11904.f39940.mo33986()) || C5553.m15319(strM42964, C11904.f39937.mo33986())) {
            return null;
        }
        return m42963(abstractC9677Mo13029.mo15077(), "local", C5553.m15323(strM42964));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m42963(String str, String str2, String str3) {
        if (!str3.startsWith("/")) {
            str3 = "/".concat(str3);
        }
        StringBuilder sbM8976 = C3012.m8976(str, ":");
        StringBuilder sbM8977 = C3012.m8976(str2, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
        sbM8977.append(m42970(str3));
        sbM8976.append(C22253.m49423(sbM8977.toString()));
        return sbM8976.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m42964(AbstractC9677 abstractC9677) {
        if (abstractC9677 instanceof C8289) {
            return ((C8289) abstractC9677).m21715();
        }
        if (abstractC9677 instanceof C5445) {
            return ((C5445) abstractC9677).m15079();
        }
        if (abstractC9677 instanceof C21920) {
            return ((C21920) abstractC9677).m48739();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m42967(C6936 c6936) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c6936.m18623().m28817());
        arrayList.add(c6936.m18662().m28817());
        c6936.m18647();
        try {
            arrayList.addAll(c6936.m18621());
            return arrayList;
        } finally {
            c6936.m18643();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m42968(C11545 c11545) {
        AbstractC9677 abstractC9677M28827 = c11545.m28827();
        String strM42964 = m42964(abstractC9677M28827);
        if (strM42964 == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(strM42964);
        if (abstractC9677M28827 instanceof C5445) {
            arrayList.add(((C5445) abstractC9677M28827).m15080());
        }
        if (abstractC9677M28827 instanceof C21920) {
            Iterator it = ((C21920) abstractC9677M28827).m48742().iterator();
            while (it.hasNext()) {
                arrayList.add(((C23332) it.next()).m51411().mo33986());
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC11462 abstractC11462 : m42967(c11545.m28807())) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                long jM28618 = abstractC11462.m28618((String) it2.next());
                if (jM28618 != 0) {
                    arrayList2.add(Long.valueOf(jM28618));
                    break;
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static String m42962(String str) {
        String strM42970 = m42970(str);
        return strM42970.endsWith("/") ? strM42970 : strM42970.concat("/");
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static String m42970(String str) {
        if (!str.startsWith("/")) {
            throw new IllegalArgumentException("Invalid HTML preview path");
        }
        String strM32001 = C12915.m32001(str);
        if (strM32001 == null) {
            throw new IllegalArgumentException("Invalid HTML preview path");
        }
        return "/".concat(strM32001);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m42972(String str) {
        int i = 0;
        while (true) {
            List list = this.f59045;
            if (i >= list.size()) {
                return -1;
            }
            if (((C17853) list.get(i)).f56545.equals(str)) {
                return i;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m42974(String str) {
        if (m42972(str) < 0) {
            throw new IllegalArgumentException("Invalid HTML preview root");
        }
        return this.f59047.substring(str.length());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m42973() {
        return ((C17853) C3012.m8974(1, this.f59045)).f56545;
    }
}
