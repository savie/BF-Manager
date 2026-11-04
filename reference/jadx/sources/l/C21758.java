package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.᩷ۖܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB7S */
/* JADX INFO: loaded from: classes.dex */
public final class C21758 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC4054 f69399;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public EnumC4604 f69400;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f69401 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m49320(C7037 c7037, int i, ArrayList arrayList, int i2) {
        C13748 c13748 = (C13748) c7037.f23219.get(i);
        AbstractC14472 abstractC14472 = (AbstractC14472) arrayList.get(i2);
        if (!m49323(c13748, abstractC14472)) {
            return false;
        }
        EnumC24192 enumC24192 = c13748.f43623;
        if (enumC24192 == EnumC24192.DESCENDANT) {
            if (i != 0) {
                while (i2 > 0) {
                    i2--;
                    if (m49320(c7037, i - 1, arrayList, i2)) {
                    }
                }
                return false;
            }
            return true;
        }
        if (enumC24192 == EnumC24192.CHILD) {
            return m49320(c7037, i - 1, arrayList, i2 - 1);
        }
        int iM49316 = m49316(arrayList, i2, abstractC14472);
        if (iM49316 <= 0) {
            return false;
        }
        return m49321(c7037, i - 1, arrayList, i2, (AbstractC14472) abstractC14472.f59447.getChildren().get(iM49316 - 1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m49321(C7037 c7037, int i, ArrayList arrayList, int i2, AbstractC14472 abstractC14472) {
        C13748 c13748 = (C13748) c7037.f23219.get(i);
        if (!m49323(c13748, abstractC14472)) {
            return false;
        }
        EnumC24192 enumC24192 = c13748.f43623;
        if (enumC24192 == EnumC24192.DESCENDANT) {
            if (i != 0) {
                while (i2 >= 0) {
                    if (!m49320(c7037, i - 1, arrayList, i2)) {
                        i2--;
                    }
                }
                return false;
            }
            return true;
        }
        if (enumC24192 == EnumC24192.CHILD) {
            return m49320(c7037, i - 1, arrayList, i2);
        }
        int iM49316 = m49316(arrayList, i2, abstractC14472);
        if (iM49316 <= 0) {
            return false;
        }
        return m49321(c7037, i - 1, arrayList, i2, (AbstractC14472) abstractC14472.f59447.getChildren().get(iM49316 - 1));
    }

    public C21758(EnumC4054 enumC4054, EnumC4604 enumC4604) {
        this.f69399 = enumC4054;
        this.f69400 = enumC4604;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8528 m49326(String str) {
        C6292 c6292 = new C6292(str);
        c6292.m24374();
        return m49324(c6292);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m49319(String str, EnumC4054 enumC4054) {
        C6292 c6292 = new C6292(str);
        c6292.m24374();
        for (EnumC4054 enumC4055 : m49317(c6292)) {
            if (enumC4055 == EnumC4054.all || enumC4055 == enumC4054) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m49317(C6292 c6292) {
        ArrayList arrayList = new ArrayList();
        while (!c6292.m24378()) {
            String str = c6292.f30022;
            String strSubstring = null;
            if (!c6292.m24378()) {
                int i = c6292.f30024;
                char cCharAt = str.charAt(i);
                if ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                    int iM24367 = c6292.m24367();
                    while (true) {
                        if ((iM24367 < 65 || iM24367 > 90) && (iM24367 < 97 || iM24367 > 122)) {
                            break;
                        }
                        iM24367 = c6292.m24367();
                    }
                    strSubstring = str.substring(i, c6292.f30024);
                } else {
                    c6292.f30024 = i;
                }
            }
            if (strSubstring == null) {
                break;
            }
            try {
                arrayList.add(EnumC4054.valueOf(strSubstring));
            } catch (IllegalArgumentException unused) {
            }
            if (!c6292.m24365()) {
                break;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m49318(C8528 c8528, C6292 c6292) throws C23446 {
        int iIntValue;
        String strM17976 = c6292.m17976();
        c6292.m24374();
        if (strM17976 == null) {
            throw new C23446("Invalid '@' rule");
        }
        int i = 0;
        if (!this.f69401 && strM17976.equals("media")) {
            ArrayList arrayListM49317 = m49317(c6292);
            if (!c6292.m24370('{')) {
                throw new C23446("Invalid @media rule: missing rule set");
            }
            c6292.m24374();
            Iterator it = arrayListM49317.iterator();
            while (true) {
                if (!it.hasNext()) {
                    m49324(c6292);
                    break;
                }
                EnumC4054 enumC4054 = (EnumC4054) it.next();
                if (enumC4054 == EnumC4054.all || enumC4054 == this.f69399) {
                    this.f69401 = true;
                    c8528.m22843(m49324(c6292));
                    this.f69401 = false;
                    break;
                }
            }
            if (!c6292.m24378() && !c6292.m24370('}')) {
                throw new C23446("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.f69401 || !strM17976.equals("import")) {
            while (!c6292.m24378() && ((iIntValue = c6292.m24373().intValue()) != 59 || i != 0)) {
                if (iIntValue != 123) {
                    if (iIntValue == 125 && i > 0 && (i = i - 1) == 0) {
                        break;
                    }
                } else {
                    i++;
                }
            }
        } else {
            String strM17977 = c6292.m17977();
            if (strM17977 == null) {
                strM17977 = c6292.m17978();
            }
            if (strM17977 == null) {
                throw new C23446("Invalid @import rule: expected string or url()");
            }
            c6292.m24374();
            m49317(c6292);
            if (!c6292.m24378() && !c6292.m24370(';')) {
                throw new C23446("Invalid @media rule: expected '}' at end of rule set");
            }
        }
        c6292.m24374();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C8528 m49324(C6292 c6292) {
        C8528 c8528 = new C8528();
        while (!c6292.m24378()) {
            try {
                if (!c6292.m24371("<!--") && !c6292.m24371("-->")) {
                    if (c6292.m24370('@')) {
                        m49318(c8528, c6292);
                    } else if (!m49325(c8528, c6292)) {
                        break;
                    }
                }
            } catch (C23446 e) {
                e.getMessage();
                return c8528;
            }
        }
        return c8528;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m49325(C8528 c8528, C6292 c6292) throws C23446 {
        ArrayList<C7037> arrayListM17974 = c6292.m17974();
        if (arrayListM17974 == null || arrayListM17974.isEmpty()) {
            return false;
        }
        if (!c6292.m24370('{')) {
            throw new C23446("Malformed rule block: expected '{'");
        }
        c6292.m24374();
        C23424 c23424 = new C23424();
        do {
            String strM17976 = c6292.m17976();
            c6292.m24374();
            if (!c6292.m24370(':')) {
                throw new C23446("Expected ':'");
            }
            c6292.m24374();
            String str = c6292.f30022;
            String strSubstring = null;
            if (!c6292.m24378()) {
                int i = c6292.f30024;
                int iCharAt = str.charAt(i);
                int i2 = i;
                while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && iCharAt != 10 && iCharAt != 13) {
                    if (!C9208.m24364(iCharAt)) {
                        i2 = c6292.f30024 + 1;
                    }
                    iCharAt = c6292.m24367();
                }
                if (c6292.f30024 > i) {
                    strSubstring = str.substring(i, i2);
                } else {
                    c6292.f30024 = i;
                }
            }
            if (strSubstring == null) {
                throw new C23446("Expected property value");
            }
            c6292.m24374();
            if (c6292.m24370('!')) {
                c6292.m24374();
                if (!c6292.m24371("important")) {
                    throw new C23446("Malformed rule set: found unexpected '!'");
                }
                c6292.m24374();
            }
            c6292.m24370(';');
            C8463.m22757(c23424, strM17976, strSubstring);
            c6292.m24374();
            if (c6292.m24378()) {
                break;
            }
        } while (!c6292.m24370('}'));
        c6292.m24374();
        for (C7037 c7037 : arrayListM17974) {
            C2562 c2562 = new C2562();
            c2562.f8233 = c7037;
            c2562.f8234 = c23424;
            c2562.f8235 = this.f69400;
            c8528.m22842(c2562);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m49322(C7037 c7037, AbstractC14472 abstractC14472) {
        ArrayList arrayList = new ArrayList();
        Object obj = abstractC14472.f59447;
        while (true) {
            if (obj == null) {
                break;
            }
            arrayList.add(0, obj);
            obj = ((C18202) obj).f59447;
        }
        int size = arrayList.size() - 1;
        ArrayList arrayList2 = c7037.f23219;
        if ((arrayList2 == null ? 0 : arrayList2.size()) != 1) {
            ArrayList arrayList3 = c7037.f23219;
            return m49321(c7037, (arrayList3 != null ? arrayList3.size() : 0) - 1, arrayList, size, abstractC14472);
        }
        return m49323((C13748) c7037.f23219.get(0), abstractC14472);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m49316(ArrayList arrayList, int i, AbstractC14472 abstractC14472) {
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        Object obj = arrayList.get(i);
        InterfaceC24170 interfaceC24170 = abstractC14472.f59447;
        if (obj != interfaceC24170) {
            return -1;
        }
        Iterator it = interfaceC24170.getChildren().iterator();
        while (it.hasNext()) {
            if (((C18202) it.next()) == abstractC14472) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m49323(C13748 c13748, AbstractC14472 abstractC14472) {
        ArrayList arrayList;
        String str = c13748.f43624;
        if (str != null && !str.equals(abstractC14472.mo1286().toLowerCase(Locale.US))) {
            return false;
        }
        ArrayList<C3308> arrayList2 = c13748.f43621;
        if (arrayList2 != null) {
            for (C3308 c3308 : arrayList2) {
                String str2 = c3308.f10813;
                String str3 = c3308.f10814;
                if (str2.equals("id")) {
                    if (!str3.equals(abstractC14472.f45545)) {
                        return false;
                    }
                } else if (!str2.equals(Name.LABEL) || (arrayList = abstractC14472.f45546) == null || !arrayList.contains(str3)) {
                    return false;
                }
            }
        }
        ArrayList arrayList3 = c13748.f43622;
        if (arrayList3 == null) {
            return true;
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC14494) it.next()).mo4022(abstractC14472)) {
                return false;
            }
        }
        return true;
    }
}
