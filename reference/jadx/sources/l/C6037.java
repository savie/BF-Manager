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

/* JADX INFO: renamed from: l.ۛۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45G7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6037 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public HashMap f20501;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f20502;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f20503;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public volatile C5062 f20504;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6432 f20505;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final String[] f20500 = {"px", "dp", "sp", "pt", "in", "mm"};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final String[] f20499 = {"%", "%p"};

    public C6037() {
        this.f20501 = new HashMap();
        this.f20505 = null;
        this.f20502 = false;
        this.f20503 = false;
    }

    public C6037(AbstractC20745 abstractC20745) {
        this(0, new C1493(abstractC20745));
    }

    public C6037(int i, InterfaceC6432 interfaceC6432) {
        boolean z;
        this.f20501 = new HashMap();
        this.f20505 = interfaceC6432;
        if (interfaceC6432 == null) {
            z = false;
        } else {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            Iterator it = interfaceC6432.mo17615().iterator();
            while (true) {
                if (it.hasNext()) {
                    InterfaceC17721 interfaceC17721 = (InterfaceC17721) it.next();
                    if (!interfaceC17721.getPackageName().equals("bin.mt.plus.TranslationData")) {
                        hashSet.clear();
                        Iterator it2 = interfaceC17721.mo19112().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                InterfaceC19133 interfaceC19133 = (InterfaceC19133) it2.next();
                                if (hashSet.add(interfaceC19133.getTypeName())) {
                                    hashSet2.clear();
                                    if (interfaceC19133.mo26937(new C0392(hashSet2)) != null) {
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
        this.f20502 = z;
        if (interfaceC6432 instanceof C1493) {
            ((C1493) interfaceC6432).m5142();
        } else if (interfaceC6432 instanceof C8901) {
            ((C8901) interfaceC6432).m23160();
        }
        this.f20503 = m16361(interfaceC6432);
    }

    public C6037(InterfaceC6432 interfaceC6432, C5062 c5062) {
        this(0, interfaceC6432);
        this.f20504 = c5062;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C6037(C2455 c2455) {
        C12107 entry;
        try {
            entry = c2455.getEntry("resources.arsc");
        } catch (Exception unused) {
        }
        this(0, entry != null ? new C1493(c2455.m7471(entry)) : null);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5062 m16376() {
        if (this.f20504 == null) {
            synchronized (this) {
                if (this.f20504 == null) {
                    this.f20504 = new C5062(this.f20505);
                }
            }
        }
        return this.f20504;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6432 m16369() {
        return this.f20505;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m16368(String str) {
        InterfaceC6432 interfaceC6432;
        ArrayList arrayList = new ArrayList();
        C17326 c17326M16362 = m16362(str);
        int i = c17326M16362.f55124;
        String str2 = c17326M16362.f55123;
        int iIndexOf = str2.indexOf(47);
        if (iIndexOf != -1) {
            String strSubstring = str2.substring(0, iIndexOf);
            String strSubstring2 = str2.substring(iIndexOf + 1);
            if (!strSubstring.isEmpty() && !strSubstring2.isEmpty() && strSubstring2.indexOf(47) == -1) {
                if (!this.f20503 && i == 1) {
                    m16360(arrayList, C13530.m33074(), 1, strSubstring, strSubstring2);
                }
                if (arrayList.isEmpty() && (interfaceC6432 = this.f20505) != null) {
                    m16360(arrayList, interfaceC6432, i, strSubstring, strSubstring2);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16360(ArrayList arrayList, InterfaceC6432 interfaceC6432, int i, String str, String str2) {
        for (InterfaceC17721 interfaceC17721 : interfaceC6432.mo17615()) {
            if (interfaceC17721.mo19106() == i) {
                for (InterfaceC19133 interfaceC19133 : interfaceC17721.mo19112()) {
                    if (interfaceC19133.getTypeName().equals(str)) {
                        int iMo1521 = interfaceC19133.mo1521(new C16621(str2));
                        if (iMo1521 != -1) {
                            for (InterfaceC12783 interfaceC12783 : interfaceC19133.mo26941()) {
                                if (interfaceC12783.mo31756(iMo1521)) {
                                    arrayList.add(interfaceC12783.mo31753(iMo1521));
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
    public final ArrayList m16367(int i) {
        InterfaceC6432 interfaceC6432;
        int i2 = (i >>> 24) & 255;
        int i3 = (i >>> 16) & 255;
        int i4 = i & 65535;
        ArrayList arrayList = new ArrayList();
        if (!this.f20503 && i2 == 1) {
            m16359(arrayList, C13530.m33074(), 1, i3, i4, true);
        }
        if (arrayList.isEmpty() && (interfaceC6432 = this.f20505) != null) {
            m16359(arrayList, interfaceC6432, i2, i3, i4, true);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16359(ArrayList arrayList, InterfaceC6432 interfaceC6432, int i, int i2, int i3, boolean z) {
        InterfaceC3609 interfaceC3609Mo31753;
        for (InterfaceC17721 interfaceC17721 : interfaceC6432.mo17615()) {
            if (interfaceC17721.mo19106() == i) {
                for (InterfaceC19133 interfaceC19133 : interfaceC17721.mo19112()) {
                    if (interfaceC19133.mo26942() == i2) {
                        for (InterfaceC12783 interfaceC12783 : z ? interfaceC19133.mo26941() : interfaceC19133.mo25271()) {
                            if (interfaceC12783.mo31756(i3) && (interfaceC3609Mo31753 = interfaceC12783.mo31753(i3)) != null) {
                                arrayList.add(interfaceC3609Mo31753);
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
    public final void m16370(int i, TypedValue typedValue, boolean z) {
        int i2 = (i >>> 24) & 255;
        if (i2 == 1) {
            C16737.m39279().getValue(i, typedValue, z);
            return;
        }
        if (this.f20505 == null) {
            throw new Resources.NotFoundException(String.format("id: %08x", Integer.valueOf(i)));
        }
        ArrayList<InterfaceC3609> arrayList = new ArrayList();
        m16359(arrayList, this.f20505, i2, (i >>> 16) & 255, i & 65535, false);
        if (arrayList.isEmpty()) {
            throw new Resources.NotFoundException(String.format("id: %08x", Integer.valueOf(i)));
        }
        C15916 c15916M37839 = C15916.m37839(C16737.m39279());
        InterfaceC3609 interfaceC3609 = null;
        for (InterfaceC3609 interfaceC36010 : arrayList) {
            if (!interfaceC36010.mo7644() && interfaceC36010.mo10690().mo31747().m37866(c15916M37839) && (interfaceC3609 == null || interfaceC36010.mo10690().mo31747().m37864(interfaceC3609.mo10690().mo31747(), c15916M37839))) {
                interfaceC3609 = interfaceC36010;
            }
        }
        if (interfaceC3609 == null) {
            throw new Resources.NotFoundException(String.format("id: %08x", Integer.valueOf(i)));
        }
        InterfaceC9961 value = interfaceC3609.getValue();
        typedValue.data = value.getValue();
        typedValue.type = value.mo25192();
        typedValue.resourceId = value.mo25193();
        if (typedValue.type == 3) {
            typedValue.string = value.mo25187().getValue();
        } else {
            typedValue.string = null;
        }
        if (z) {
            for (int i3 = 0; i3 < 20 && typedValue.type == 1; i3++) {
                m16370(typedValue.data, typedValue, false);
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m16373() {
        return this.f20502;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m16374(String str) {
        Integer num;
        InterfaceC6432 interfaceC6432;
        C17326 c17326M16362 = m16362(str);
        int i = c17326M16362.f55124;
        String str2 = c17326M16362.f55123;
        int iIndexOf = str2.indexOf(47);
        if (iIndexOf == -1) {
            return -1;
        }
        String strSubstring = str2.substring(0, iIndexOf);
        String strSubstring2 = str2.substring(iIndexOf + 1);
        if (strSubstring.isEmpty() || strSubstring2.isEmpty() || strSubstring2.indexOf(47) != -1) {
            return -1;
        }
        int iM16355 = (this.f20503 || i != 1) ? -1 : m16355(C13530.m33074(), 1, strSubstring, strSubstring2);
        if (iM16355 == -1 && (interfaceC6432 = this.f20505) != null && !this.f20502) {
            iM16355 = m16355(interfaceC6432, i, strSubstring, strSubstring2);
        }
        return (iM16355 != -1 || (num = (Integer) this.f20501.get(str)) == null) ? iM16355 : num.intValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m16355(InterfaceC6432 interfaceC6432, int i, String str, String str2) {
        for (InterfaceC17721 interfaceC17721 : interfaceC6432.mo17615()) {
            if (i == -1 || interfaceC17721.mo19106() == i) {
                for (InterfaceC19133 interfaceC19133 : interfaceC17721.mo19112()) {
                    if (interfaceC19133.getTypeName().equals(str)) {
                        int iMo1521 = interfaceC19133.mo1521(new C12388(0, str2));
                        if (iMo1521 == -1) {
                            break;
                        }
                        return (interfaceC17721.mo19106() << 24) | (interfaceC19133.mo26942() << 16) | iMo1521;
                    }
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static String m16364(int i) {
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
    public final String m16366(InterfaceC9961 interfaceC9961) {
        int iMo25192 = interfaceC9961.mo25192();
        int value = interfaceC9961.getValue();
        if (iMo25192 == 17) {
            return C9576.m24440(new StringBuilder("0x"), value);
        }
        if (iMo25192 == 18) {
            return value != 0 ? "true" : "false";
        }
        switch (iMo25192) {
            case 0:
                return "null";
            case 1:
                return "@".concat(m16371(value));
            case 2:
                return "?".concat(m16371(value));
            case 3:
                String value2 = interfaceC9961.mo25187().getValue();
                return value2.length() > 100 ? value2.substring(0, 97).replaceFirst("[\\s]{0,6}$", "...") : value2;
            case 4:
                return Float.toString(Float.intBitsToFloat(value));
            case 5:
                return m16354(value);
            case 6:
                return m16363(value);
            default:
                if (iMo25192 < 28 || iMo25192 > 31) {
                    return (iMo25192 < 16 || iMo25192 > 31) ? d.O : Integer.toString(value);
                }
                return String.format("#%08x", Integer.valueOf(value));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m16375(int i) {
        String strM16356 = m16356(i, this.f20505);
        return strM16356 != null ? strM16356 : String.format("%08x", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m16372(int i) {
        return m16356(i, this.f20505);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m16371(int i) {
        int i2 = 65535 & i;
        int i3 = (i >> 16) & 255;
        int i4 = (i >> 24) & 255;
        boolean z = this.f20502;
        InterfaceC6432 interfaceC6432 = this.f20505;
        String strM16358 = null;
        String strM16359 = z ? null : m16358(interfaceC6432, i4, i3, i2, true);
        if (strM16359 != null) {
            strM16358 = strM16359;
        } else if (!m16361(interfaceC6432)) {
            strM16358 = m16358((InterfaceC6432) C13530.m33074(), i4, i3, i2, false);
        }
        return strM16358 != null ? strM16358 : String.format("%08x", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m16356(int i, InterfaceC6432 interfaceC6432) {
        int i2 = 65535 & i;
        int i3 = (i >> 16) & 255;
        int i4 = (i >> 24) & 255;
        String strM16357 = m16357(interfaceC6432, i4, i3, i2);
        if (strM16357 != null) {
            return strM16357;
        }
        if (m16361(interfaceC6432)) {
            return null;
        }
        return m16357(C13530.m33074(), i4, i3, i2);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m16365(int i) {
        int i2 = 65535 & i;
        int i3 = (i >> 16) & 255;
        int i4 = (i >> 24) & 255;
        InterfaceC6432 interfaceC6432 = this.f20505;
        String strM16357 = m16357(interfaceC6432, i4, i3, i2);
        if (strM16357 == null && !m16361(interfaceC6432)) {
            strM16357 = m16357(C13530.m33074(), i4, i3, i2);
        }
        return strM16357 != null ? String.format("%s(%08x)", strM16357, Integer.valueOf(i)) : String.format("%08x", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m16357(InterfaceC6432 interfaceC6432, int i, int i2, int i3) {
        if (interfaceC6432 == null) {
            return null;
        }
        for (InterfaceC17721 interfaceC17721 : interfaceC6432.mo17615()) {
            if (interfaceC17721.mo19106() == i) {
                for (InterfaceC19133 interfaceC19133 : interfaceC17721.mo19112()) {
                    if (interfaceC19133.mo26942() == i2) {
                        Iterator it = interfaceC19133.mo25271().iterator();
                        while (it.hasNext()) {
                            InterfaceC3609 interfaceC3609Mo31753 = ((InterfaceC12783) it.next()).mo31753(i3);
                            if (interfaceC3609Mo31753 != null) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(i == 1 ? "android:" : i != 127 ? String.format("app%02x:", Integer.valueOf(i)) : "");
                                sb.append(interfaceC3609Mo31753.mo7645());
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
    public static String m16358(InterfaceC6432 interfaceC6432, int i, int i2, int i3, boolean z) {
        if (interfaceC6432 == null) {
            return null;
        }
        for (InterfaceC17721 interfaceC17721 : interfaceC6432.mo17615()) {
            if (interfaceC17721.mo19106() == i) {
                for (InterfaceC19133 interfaceC19133 : interfaceC17721.mo19112()) {
                    if (interfaceC19133.mo26942() == i2) {
                        Iterator it = interfaceC19133.mo25271().iterator();
                        while (it.hasNext()) {
                            InterfaceC3609 interfaceC3609Mo31753 = ((InterfaceC12783) it.next()).mo31753(i3);
                            if (interfaceC3609Mo31753 != null && (z || interfaceC3609Mo31753.mo7649())) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(i == 1 ? "android:" : i != 127 ? String.format("app%02x:", Integer.valueOf(i)) : "");
                                sb.append(interfaceC19133.getTypeName());
                                sb.append("/");
                                sb.append(interfaceC3609Mo31753.mo7645());
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
    public static boolean m16361(InterfaceC6432 interfaceC6432) {
        if (interfaceC6432 == null) {
            return false;
        }
        for (InterfaceC17721 interfaceC17721 : interfaceC6432.mo17615()) {
            if (interfaceC17721.mo19106() == 1) {
                InterfaceC19133 type = interfaceC17721.getType("attr");
                InterfaceC19133 type2 = interfaceC17721.getType("id");
                return type != null && type.mo1519() > 50 && type2 != null && type2.mo1519() > 50;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static String m16354(int i) {
        return TypedValue.complexToFloat(i) + f20500[i & 15];
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static String m16363(int i) {
        return (TypedValue.complexToFloat(i) * 100.0f) + f20499[i & 15];
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C17326 m16362(String str) {
        String[] strArrSplit = str.split(":", 2);
        if (strArrSplit.length == 2) {
            if (strArrSplit[0].equals("android")) {
                return new C17326(1, strArrSplit[1]);
            }
            if (strArrSplit[0].startsWith("app") && strArrSplit[0].length() == 5) {
                String strSubstring = strArrSplit[0].substring(3);
                if (C6461.m17648(strSubstring)) {
                    return new C17326(Integer.parseInt(strSubstring, 16), strArrSplit[1]);
                }
            }
        }
        return new C17326(127, str);
    }
}
