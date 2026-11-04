package l;

import android.content.res.Resources;
import android.util.TypedValue;
import com.umeng.analytics.pro.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.simpleframework.xml.core.AnnotationHandler;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩶ۤۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45G7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21246 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f67790;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile C7075 f67791;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f67792;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC7206 f67793;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public HashMap f67794;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final String[] f67789 = {"px", "dp", "sp", "pt", "in", "mm"};

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final String[] f67788 = {"%", "%p"};

    public C21246() {
        this.f67794 = new HashMap();
        this.f67793 = null;
        this.f67790 = false;
        this.f67792 = false;
    }

    public C21246(AbstractC22044 abstractC22044) {
        this(0, new C24296(abstractC22044));
    }

    public C21246(int i, InterfaceC7206 interfaceC7206) {
        boolean z;
        this.f67794 = new HashMap();
        this.f67793 = interfaceC7206;
        if (interfaceC7206 == null) {
            z = false;
        } else {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            Iterator it = interfaceC7206.mo15672().iterator();
            while (true) {
                if (it.hasNext()) {
                    InterfaceC10869 interfaceC10869 = (InterfaceC10869) it.next();
                    if (!interfaceC10869.getPackageName().equals("bin.mt.plus.TranslationData")) {
                        hashSet.clear();
                        Iterator it2 = interfaceC10869.mo19822().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                InterfaceC15344 interfaceC15344 = (InterfaceC15344) it2.next();
                                if (hashSet.add(interfaceC15344.getTypeName())) {
                                    hashSet2.clear();
                                    if (interfaceC15344.mo35829(new C6330(hashSet2)) != null) {
                                    }
                                }
                                z = true;
                            } else {
                                continue;
                            }
                        }
                    }
                } else {
                    z = false;
                }
            }
        }
        this.f67790 = z;
        if (interfaceC7206 instanceof C24296) {
            ((C24296) interfaceC7206).m54313();
        } else if (interfaceC7206 instanceof C15126) {
            ((C15126) interfaceC7206).m36400();
        }
        this.f67792 = m48416(interfaceC7206);
    }

    public C21246(InterfaceC7206 interfaceC7206, C7075 c7075) {
        this(0, interfaceC7206);
        this.f67791 = c7075;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C21246(C22941 c22941) {
        C8002 entry;
        try {
            entry = c22941.getEntry("resources.arsc");
        } catch (Exception unused) {
        }
        this(0, entry != null ? new C24296(c22941.m51727(entry)) : null);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7075 m48431() {
        if (this.f67791 == null) {
            synchronized (this) {
                if (this.f67791 == null) {
                    this.f67791 = new C7075(this.f67793);
                }
            }
        }
        return this.f67791;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7206 m48424() {
        return this.f67793;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m48423(String str) {
        InterfaceC7206 interfaceC7206;
        ArrayList arrayList = new ArrayList();
        C14532 c14532M48418 = m48418(str);
        int i = c14532M48418.f45720;
        String str2 = c14532M48418.f45719;
        int iIndexOf = str2.indexOf(47);
        if (iIndexOf != -1) {
            String strSubstring = str2.substring(0, iIndexOf);
            String strSubstring2 = str2.substring(iIndexOf + 1);
            if (!strSubstring.isEmpty() && !strSubstring2.isEmpty() && strSubstring2.indexOf(47) == -1) {
                if (!this.f67792 && i == 1) {
                    m48415(arrayList, C15407.m36884(), 1, strSubstring, strSubstring2);
                }
                if (arrayList.isEmpty() && (interfaceC7206 = this.f67793) != null) {
                    m48415(arrayList, interfaceC7206, i, strSubstring, strSubstring2);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48415(ArrayList arrayList, InterfaceC7206 interfaceC7206, int i, String str, String str2) {
        for (InterfaceC10869 interfaceC10869 : interfaceC7206.mo15672()) {
            if (interfaceC10869.mo27607() == i) {
                for (InterfaceC15344 interfaceC15344 : interfaceC10869.mo19822()) {
                    if (interfaceC15344.getTypeName().equals(str)) {
                        int iMo35827 = interfaceC15344.mo35827(new C24230(str2));
                        if (iMo35827 != -1) {
                            for (InterfaceC2731 interfaceC2731 : interfaceC15344.mo35832()) {
                                if (interfaceC2731.mo9075(iMo35827)) {
                                    arrayList.add(interfaceC2731.mo9076(iMo35827));
                                }
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m48422(int i) {
        InterfaceC7206 interfaceC7206;
        int i2 = (i >>> 24) & 255;
        int i3 = (i >>> 16) & 255;
        int i4 = i & 65535;
        ArrayList arrayList = new ArrayList();
        if (!this.f67792 && i2 == 1) {
            m48414(arrayList, C15407.m36884(), 1, i3, i4, true);
        }
        if (arrayList.isEmpty() && (interfaceC7206 = this.f67793) != null) {
            m48414(arrayList, interfaceC7206, i2, i3, i4, true);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48414(ArrayList arrayList, InterfaceC7206 interfaceC7206, int i, int i2, int i3, boolean z) {
        InterfaceC8697 interfaceC8697Mo9076;
        for (InterfaceC10869 interfaceC10869 : interfaceC7206.mo15672()) {
            if (interfaceC10869.mo27607() == i) {
                for (InterfaceC15344 interfaceC15344 : interfaceC10869.mo19822()) {
                    if (interfaceC15344.mo35833() == i2) {
                        for (InterfaceC2731 interfaceC2731 : z ? interfaceC15344.mo35832() : interfaceC15344.mo33925()) {
                            if (interfaceC2731.mo9075(i3) && (interfaceC8697Mo9076 = interfaceC2731.mo9076(i3)) != null) {
                                arrayList.add(interfaceC8697Mo9076);
                            }
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48425(int i, TypedValue typedValue, boolean z) {
        int i2 = (i >>> 24) & 255;
        if (i2 == 1) {
            C21576.m49055().getValue(i, typedValue, z);
            return;
        }
        if (this.f67793 == null) {
            throw new Resources.NotFoundException(String.format("id: %08x", Integer.valueOf(i)));
        }
        ArrayList<InterfaceC8697> arrayList = new ArrayList();
        m48414(arrayList, this.f67793, i2, (i >>> 16) & 255, i & 65535, false);
        if (arrayList.isEmpty()) {
            throw new Resources.NotFoundException(String.format("id: %08x", Integer.valueOf(i)));
        }
        C20500 c20500M46999 = C20500.m46999(C21576.m49055());
        InterfaceC8697 interfaceC8697 = null;
        for (InterfaceC8697 interfaceC8698 : arrayList) {
            if (!interfaceC8698.mo18155() && interfaceC8698.mo18158().mo9073().m47025(c20500M46999) && (interfaceC8697 == null || interfaceC8698.mo18158().mo9073().m47023(interfaceC8697.mo18158().mo9073(), c20500M46999))) {
                interfaceC8697 = interfaceC8698;
            }
        }
        if (interfaceC8697 == null) {
            throw new Resources.NotFoundException(String.format("id: %08x", Integer.valueOf(i)));
        }
        InterfaceC5650 value = interfaceC8697.getValue();
        typedValue.data = value.getValue();
        typedValue.type = value.mo16635();
        typedValue.resourceId = value.mo16637();
        if (typedValue.type == 3) {
            typedValue.string = value.mo11710().getValue();
        } else {
            typedValue.string = null;
        }
        if (z) {
            for (int i3 = 0; i3 < 20 && typedValue.type == 1; i3++) {
                m48425(typedValue.data, typedValue, false);
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m48427() {
        return this.f67790;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m48429(String str) {
        Integer num;
        InterfaceC7206 interfaceC7206;
        C14532 c14532M48418 = m48418(str);
        int i = c14532M48418.f45720;
        String str2 = c14532M48418.f45719;
        int iIndexOf = str2.indexOf(47);
        if (iIndexOf == -1) {
            return -1;
        }
        String strSubstring = str2.substring(0, iIndexOf);
        String strSubstring2 = str2.substring(iIndexOf + 1);
        if (strSubstring.isEmpty() || strSubstring2.isEmpty() || strSubstring2.indexOf(47) != -1) {
            return -1;
        }
        int iM48410 = (this.f67792 || i != 1) ? -1 : m48410(C15407.m36884(), 1, strSubstring, strSubstring2);
        if (iM48410 == -1 && (interfaceC7206 = this.f67793) != null && !this.f67790) {
            iM48410 = m48410(interfaceC7206, i, strSubstring, strSubstring2);
        }
        return (iM48410 != -1 || (num = (Integer) this.f67794.get(str)) == null) ? iM48410 : num.intValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m48410(InterfaceC7206 interfaceC7206, int i, String str, String str2) {
        for (InterfaceC10869 interfaceC10869 : interfaceC7206.mo15672()) {
            if (i == -1 || interfaceC10869.mo27607() == i) {
                for (InterfaceC15344 interfaceC15344 : interfaceC10869.mo19822()) {
                    if (interfaceC15344.getTypeName().equals(str)) {
                        int iMo35827 = interfaceC15344.mo35827(new C4092(str2));
                        if (iMo35827 == -1) {
                            break;
                        }
                        return (interfaceC10869.mo27607() << 24) | (interfaceC15344.mo35833() << 16) | iMo35827;
                    }
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m48420(int i) {
        switch (i) {
            case 0:
                return "null";
            case 1:
                return Name.REFER;
            case 2:
                return AnnotationHandler.ATTRIBUTE;
            case 3:
                return "string";
            case 4:
                return ClassTransform.FLOAT;
            case 5:
                return "dimension";
            case 6:
                return "fraction";
            case 7:
                return "dynamic-reference";
            case 8:
                return "dynamic-attribute";
            default:
                switch (i) {
                    case 16:
                        return "int-dec";
                    case 17:
                        return "int-hex";
                    case 18:
                        return ClassTransform.BOOLEAN;
                    default:
                        switch (i) {
                            case 28:
                                return "color-argb8";
                            case 29:
                                return "color-rgb8";
                            case 30:
                                return "color-argb4";
                            case 31:
                                return "color-rgb4";
                            default:
                                return String.format("unknown-type-%02x", Integer.valueOf(i));
                        }
                }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m48421(InterfaceC5650 interfaceC5650) {
        int iMo16635 = interfaceC5650.mo16635();
        int value = interfaceC5650.getValue();
        if (iMo16635 == 17) {
            return C4791.m14766(new StringBuilder("0x"), value);
        }
        if (iMo16635 == 18) {
            return value != 0 ? "true" : "false";
        }
        switch (iMo16635) {
            case 0:
                return "null";
            case 1:
                return "@".concat(m48428(value));
            case 2:
                return "?".concat(m48428(value));
            case 3:
                String value2 = interfaceC5650.mo11710().getValue();
                return value2.length() > 100 ? value2.substring(0, 97).replaceFirst("[\\s]{0,6}$", "...") : value2;
            case 4:
                return Float.toString(Float.intBitsToFloat(value));
            case 5:
                return m48419(value);
            case 6:
                return m48417(value);
            default:
                if (iMo16635 < 28 || iMo16635 > 31) {
                    return (iMo16635 < 16 || iMo16635 > 31) ? d.O : Integer.toString(value);
                }
                return String.format("#%08x", Integer.valueOf(value));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m48430(int i) {
        String strM48411 = m48411(i, this.f67793);
        return strM48411 != null ? strM48411 : String.format("%08x", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m48426(int i) {
        return m48411(i, this.f67793);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m48428(int i) {
        int i2 = 65535 & i;
        int i3 = (i >> 16) & 255;
        int i4 = (i >> 24) & 255;
        boolean z = this.f67790;
        InterfaceC7206 interfaceC7206 = this.f67793;
        String strM48413 = null;
        String strM48414 = z ? null : m48413(interfaceC7206, i4, i3, i2, true);
        if (strM48414 != null) {
            strM48413 = strM48414;
        } else if (!m48416(interfaceC7206)) {
            strM48413 = m48413((InterfaceC7206) C15407.m36884(), i4, i3, i2, false);
        }
        return strM48413 != null ? strM48413 : String.format("%08x", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m48411(int i, InterfaceC7206 interfaceC7206) {
        int i2 = 65535 & i;
        int i3 = (i >> 16) & 255;
        int i4 = (i >> 24) & 255;
        String strM48412 = m48412(interfaceC7206, i4, i3, i2);
        if (strM48412 != null) {
            return strM48412;
        }
        if (m48416(interfaceC7206)) {
            return null;
        }
        return m48412(C15407.m36884(), i4, i3, i2);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m48432(int i) {
        int i2 = 65535 & i;
        int i3 = (i >> 16) & 255;
        int i4 = (i >> 24) & 255;
        InterfaceC7206 interfaceC7206 = this.f67793;
        String strM48412 = m48412(interfaceC7206, i4, i3, i2);
        if (strM48412 == null && !m48416(interfaceC7206)) {
            strM48412 = m48412(C15407.m36884(), i4, i3, i2);
        }
        return strM48412 != null ? String.format("%s(%08x)", strM48412, Integer.valueOf(i)) : String.format("%08x", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m48412(InterfaceC7206 interfaceC7206, int i, int i2, int i3) {
        if (interfaceC7206 == null) {
            return null;
        }
        for (InterfaceC10869 interfaceC10869 : interfaceC7206.mo15672()) {
            if (interfaceC10869.mo27607() == i) {
                for (InterfaceC15344 interfaceC15344 : interfaceC10869.mo19822()) {
                    if (interfaceC15344.mo35833() == i2) {
                        Iterator it = interfaceC15344.mo33925().iterator();
                        while (it.hasNext()) {
                            InterfaceC8697 interfaceC8697Mo9076 = ((InterfaceC2731) it.next()).mo9076(i3);
                            if (interfaceC8697Mo9076 != null) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(i == 1 ? "android:" : i != 127 ? String.format("app%02x:", Integer.valueOf(i)) : "");
                                sb.append(interfaceC8697Mo9076.mo18156());
                                return sb.toString();
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m48413(InterfaceC7206 interfaceC7206, int i, int i2, int i3, boolean z) {
        if (interfaceC7206 == null) {
            return null;
        }
        for (InterfaceC10869 interfaceC10869 : interfaceC7206.mo15672()) {
            if (interfaceC10869.mo27607() == i) {
                for (InterfaceC15344 interfaceC15344 : interfaceC10869.mo19822()) {
                    if (interfaceC15344.mo35833() == i2) {
                        Iterator it = interfaceC15344.mo33925().iterator();
                        while (it.hasNext()) {
                            InterfaceC8697 interfaceC8697Mo9076 = ((InterfaceC2731) it.next()).mo9076(i3);
                            if (interfaceC8697Mo9076 != null && (z || interfaceC8697Mo9076.mo18152())) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(i == 1 ? "android:" : i != 127 ? String.format("app%02x:", Integer.valueOf(i)) : "");
                                sb.append(interfaceC15344.getTypeName());
                                sb.append("/");
                                sb.append(interfaceC8697Mo9076.mo18156());
                                return sb.toString();
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m48416(InterfaceC7206 interfaceC7206) {
        if (interfaceC7206 == null) {
            return false;
        }
        for (InterfaceC10869 interfaceC10869 : interfaceC7206.mo15672()) {
            if (interfaceC10869.mo27607() == 1) {
                InterfaceC15344 type = interfaceC10869.getType("attr");
                InterfaceC15344 type2 = interfaceC10869.getType("id");
                return type != null && type.mo4328() > 50 && type2 != null && type2.mo4328() > 50;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static String m48419(int i) {
        return TypedValue.complexToFloat(i) + f67789[i & 15];
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static String m48417(int i) {
        return (TypedValue.complexToFloat(i) * 100.0f) + f67788[i & 15];
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C14532 m48418(String str) {
        String[] strArrSplit = str.split(":", 2);
        if (strArrSplit.length == 2) {
            if (strArrSplit[0].equals("android")) {
                return new C14532(1, strArrSplit[1]);
            }
            if (strArrSplit[0].startsWith("app") && strArrSplit[0].length() == 5) {
                String strSubstring = strArrSplit[0].substring(3);
                if (C11730.m29453(strSubstring)) {
                    return new C14532(Integer.parseInt(strSubstring, 16), strArrSplit[1]);
                }
            }
        }
        return new C14532(127, str);
    }
}
