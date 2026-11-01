package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.֫۠ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB7S */
/* JADX INFO: loaded from: classes2.dex */
public final class C1703 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC19343 f6729;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public EnumC14405 f6730;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f6731 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m5658(C10877 c10877, int i, ArrayList arrayList, int i2) {
        C23577 c23577 = (C23577) c10877.f36987.get(i);
        AbstractC8075 abstractC8075 = (AbstractC8075) arrayList.get(i2);
        if (!m5661(c23577, abstractC8075)) {
            return false;
        }
        EnumC8054 enumC8054 = c23577.f76378;
        if (enumC8054 == EnumC8054.DESCENDANT) {
            if (i != 0) {
                while (i2 > 0) {
                    i2--;
                    if (m5658(c10877, i - 1, arrayList, i2)) {
                    }
                }
                return false;
            }
            return true;
        }
        if (enumC8054 == EnumC8054.CHILD) {
            return m5658(c10877, i - 1, arrayList, i2 - 1);
        }
        int iM5654 = m5654(arrayList, i2, abstractC8075);
        if (iM5654 <= 0) {
            return false;
        }
        return m5659(c10877, i - 1, arrayList, i2, (AbstractC8075) abstractC8075.f30201.getChildren().get(iM5654 - 1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m5659(C10877 c10877, int i, ArrayList arrayList, int i2, AbstractC8075 abstractC8075) {
        C23577 c23577 = (C23577) c10877.f36987.get(i);
        if (!m5661(c23577, abstractC8075)) {
            return false;
        }
        EnumC8054 enumC8054 = c23577.f76378;
        if (enumC8054 == EnumC8054.DESCENDANT) {
            if (i != 0) {
                while (i2 >= 0) {
                    if (!m5658(c10877, i - 1, arrayList, i2)) {
                        i2--;
                    }
                }
                return false;
            }
            return true;
        }
        if (enumC8054 == EnumC8054.CHILD) {
            return m5658(c10877, i - 1, arrayList, i2);
        }
        int iM5654 = m5654(arrayList, i2, abstractC8075);
        if (iM5654 <= 0) {
            return false;
        }
        return m5659(c10877, i - 1, arrayList, i2, (AbstractC8075) abstractC8075.f30201.getChildren().get(iM5654 - 1));
    }

    public C1703(EnumC19343 enumC19343, EnumC14405 enumC14405) {
        this.f6729 = enumC19343;
        this.f6730 = enumC14405;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5937 m5664(String str) {
        C18637 c18637 = new C18637(str);
        c18637.m2051();
        return m5662(c18637);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m5657(String str, EnumC19343 enumC19343) {
        C18637 c18637 = new C18637(str);
        c18637.m2051();
        for (EnumC19343 enumC19344 : m5655(c18637)) {
            if (enumC19344 == EnumC19343.all || enumC19344 == enumC19343) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m5655(C18637 c18637) {
        ArrayList arrayList = new ArrayList();
        while (!c18637.m2054()) {
            String str = c18637.f1782;
            String strSubstring = null;
            if (!c18637.m2054()) {
                int i = c18637.f1783;
                char cCharAt = str.charAt(i);
                if ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                    int iM2045 = c18637.m2045();
                    while (true) {
                        if ((iM2045 < 65 || iM2045 > 90) && (iM2045 < 97 || iM2045 > 122)) {
                            break;
                        }
                        iM2045 = c18637.m2045();
                    }
                    strSubstring = str.substring(i, c18637.f1783);
                } else {
                    c18637.f1783 = i;
                }
            }
            if (strSubstring == null) {
                break;
            }
            try {
                arrayList.add(EnumC19343.valueOf(strSubstring));
            } catch (IllegalArgumentException unused) {
            }
            if (!c18637.m2043()) {
                break;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5656(C5937 c5937, C18637 c18637) throws C22871 {
        int iIntValue;
        String strM43105 = c18637.m43105();
        c18637.m2051();
        if (strM43105 == null) {
            throw new C22871("Invalid '@' rule");
        }
        int i = 0;
        if (!this.f6731 && strM43105.equals("media")) {
            ArrayList arrayListM5655 = m5655(c18637);
            if (!c18637.m2048('{')) {
                throw new C22871("Invalid @media rule: missing rule set");
            }
            c18637.m2051();
            Iterator it = arrayListM5655.iterator();
            while (true) {
                if (!it.hasNext()) {
                    m5662(c18637);
                    break;
                }
                EnumC19343 enumC19343 = (EnumC19343) it.next();
                if (enumC19343 == EnumC19343.all || enumC19343 == this.f6729) {
                    this.f6731 = true;
                    c5937.m16208(m5662(c18637));
                    this.f6731 = false;
                    break;
                }
            }
            if (!c18637.m2054() && !c18637.m2048('}')) {
                throw new C22871("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.f6731 || !strM43105.equals("import")) {
            while (!c18637.m2054() && ((iIntValue = c18637.m2052().intValue()) != 59 || i != 0)) {
                if (iIntValue != 123) {
                    if (iIntValue == 125 && i > 0 && (i = i - 1) == 0) {
                        break;
                    }
                } else {
                    i++;
                }
            }
        } else {
            String strM43106 = c18637.m43106();
            if (strM43106 == null) {
                strM43106 = c18637.m43107();
            }
            if (strM43106 == null) {
                throw new C22871("Invalid @import rule: expected string or url()");
            }
            c18637.m2051();
            m5655(c18637);
            if (!c18637.m2054() && !c18637.m2048(';')) {
                throw new C22871("Invalid @media rule: expected '}' at end of rule set");
            }
        }
        c18637.m2051();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C5937 m5662(C18637 c18637) {
        C5937 c5937 = new C5937();
        while (!c18637.m2054()) {
            try {
                if (!c18637.m2049("<!--") && !c18637.m2049("-->")) {
                    if (c18637.m2048('@')) {
                        m5656(c5937, c18637);
                    } else if (!m5663(c5937, c18637)) {
                        break;
                    }
                }
            } catch (C22871 e) {
                e.getMessage();
                return c5937;
            }
        }
        return c5937;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m5663(C5937 c5937, C18637 c18637) throws C22871 {
        ArrayList<C10877> arrayListM43104 = c18637.m43104();
        if (arrayListM43104 == null || arrayListM43104.isEmpty()) {
            return false;
        }
        if (!c18637.m2048('{')) {
            throw new C22871("Malformed rule block: expected '{'");
        }
        c18637.m2051();
        C3840 c3840 = new C3840();
        do {
            String strM43105 = c18637.m43105();
            c18637.m2051();
            if (!c18637.m2048(':')) {
                throw new C22871("Expected ':'");
            }
            c18637.m2051();
            String str = c18637.f1782;
            String strSubstring = null;
            if (!c18637.m2054()) {
                int i = c18637.f1783;
                int iCharAt = str.charAt(i);
                int i2 = i;
                while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && iCharAt != 10 && iCharAt != 13) {
                    if (!C0354.m2040(iCharAt)) {
                        i2 = c18637.f1783 + 1;
                    }
                    iCharAt = c18637.m2045();
                }
                if (c18637.f1783 > i) {
                    strSubstring = str.substring(i, i2);
                } else {
                    c18637.f1783 = i;
                }
            }
            if (strSubstring == null) {
                throw new C22871("Expected property value");
            }
            c18637.m2051();
            if (c18637.m2048('!')) {
                c18637.m2051();
                if (!c18637.m2049("important")) {
                    throw new C22871("Malformed rule set: found unexpected '!'");
                }
                c18637.m2051();
            }
            c18637.m2048(';');
            C12350.m30680(c3840, strM43105, strSubstring);
            c18637.m2051();
            if (c18637.m2054()) {
                break;
            }
        } while (!c18637.m2048('}'));
        c18637.m2051();
        for (C10877 c10877 : arrayListM43104) {
            C17226 c17226 = new C17226();
            c17226.f54891 = c10877;
            c17226.f54892 = c3840;
            c17226.f54893 = this.f6730;
            c5937.m16209(c17226);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m5660(C10877 c10877, AbstractC8075 abstractC8075) {
        ArrayList arrayList = new ArrayList();
        Object obj = abstractC8075.f30201;
        while (true) {
            if (obj == null) {
                break;
            }
            arrayList.add(0, obj);
            obj = ((C8781) obj).f30201;
        }
        int size = arrayList.size() - 1;
        ArrayList arrayList2 = c10877.f36987;
        if ((arrayList2 == null ? 0 : arrayList2.size()) != 1) {
            ArrayList arrayList3 = c10877.f36987;
            return m5659(c10877, (arrayList3 != null ? arrayList3.size() : 0) - 1, arrayList, size, abstractC8075);
        }
        return m5661((C23577) c10877.f36987.get(0), abstractC8075);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m5654(ArrayList arrayList, int i, AbstractC8075 abstractC8075) {
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        Object obj = arrayList.get(i);
        InterfaceC17952 interfaceC17952 = abstractC8075.f30201;
        if (obj != interfaceC17952) {
            return -1;
        }
        Iterator it = interfaceC17952.getChildren().iterator();
        while (it.hasNext()) {
            if (((C8781) it.next()) == abstractC8075) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m5661(C23577 c23577, AbstractC8075 abstractC8075) {
        ArrayList arrayList;
        String str = c23577.f76375;
        if (str != null && !str.equals(abstractC8075.mo1944().toLowerCase(Locale.US))) {
            return false;
        }
        ArrayList<C15110> arrayList2 = c23577.f76376;
        if (arrayList2 != null) {
            for (C15110 c15110 : arrayList2) {
                String str2 = c15110.f49346;
                String str3 = c15110.f49347;
                if (str2.equals("id")) {
                    if (!str3.equals(abstractC8075.f28299)) {
                        return false;
                    }
                } else if (!str2.equals(Name.LABEL) || (arrayList = abstractC8075.f28298) == null || !arrayList.contains(str3)) {
                    return false;
                }
            }
        }
        ArrayList arrayList3 = c23577.f76377;
        if (arrayList3 == null) {
            return true;
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC8760) it.next()).mo1820(abstractC8075)) {
                return false;
            }
        }
        return true;
    }
}
