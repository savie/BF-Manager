package l;

import bin.mt.json.JSON;
import com.google.android.material.color.ColorResourcesTableCreator;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.core.AnnotationHandler;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۟ܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AI */
/* JADX INFO: loaded from: classes3.dex */
public final class C7972 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final char[] f26502 = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public SoftReference f26503;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public SoftReference f26504;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C2751 f26505;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object f26506;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f26507;

    public C7972(C2751 c2751) {
        this.f26506 = new Object();
        this.f26505 = c2751;
        this.f26507 = new ArrayList();
    }

    public C7972(C2751 c2751, ArrayList arrayList) {
        this.f26506 = new Object();
        this.f26505 = c2751;
        this.f26507 = C1260.m4565(arrayList);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList m21758() {
        return new ArrayList(this.f26507);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7972 m21723(C2751 c2751) {
        C7972 c7972 = new C7972(c2751);
        c7972.m21737();
        return c7972;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7972 m21724(C2751 c2751, ArrayList arrayList) {
        C7972 c7972 = new C7972(c2751, arrayList);
        c7972.m21737();
        return c7972;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11700 m21750(String str, final String str2, int i, int i2, final HashSet hashSet) throws C10186 {
        String str3;
        final C1304 c1304M21737 = m21737();
        C2863 c2863 = c1304M21737.f4689;
        m21731(c2863.m9453(), str2);
        final C25127 c25127 = new C25127(i, i2);
        HashSet hashSet2 = new HashSet();
        for (InterfaceC10869 interfaceC10869 : c2863.m9453().mo15672()) {
            for (InterfaceC15344 interfaceC15344 : interfaceC10869.mo19822()) {
                if (hashSet2.add(Integer.valueOf((interfaceC10869.mo27607() << 8) | interfaceC15344.mo35833())) && ("*".equals(str) || str.equals(interfaceC15344.getTypeName()))) {
                    final ArrayList arrayList = new ArrayList();
                    if (!"*".equals(str2)) {
                        for (InterfaceC2731 interfaceC2731 : interfaceC15344.mo33925()) {
                            if (str2.equals(C10208.m26337(interfaceC2731))) {
                                arrayList.add(interfaceC2731);
                            }
                        }
                        if (arrayList.isEmpty()) {
                        }
                    }
                    m21732(c1304M21737, interfaceC15344, new InterfaceC2006() { // from class: l.֡ܽۚ
                        @Override // l.InterfaceC2006
                        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                        public final boolean mo2565(C13192 c13192) {
                            if (!"*".equals(str2)) {
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    if (((InterfaceC2731) it.next()).mo9075(c13192.f42132)) {
                                    }
                                }
                                return false;
                            }
                            C25127 c25128 = c25127;
                            ArrayList arrayList2 = c25128.f81251;
                            if (c25128.f81254 >= c25128.f81252 && arrayList2.size() < c25128.f81253) {
                                arrayList2.add(c13192);
                            }
                            c25128.f81254++;
                            return false;
                        }
                    });
                }
            }
        }
        ArrayList<C13192> arrayList2 = c25127.f81251;
        int size = arrayList2.size() + c25127.f81252;
        int i3 = c25127.f81254;
        C11700 c11700 = new C11700(i3, size, arrayList2, size < i3);
        C19905 c19905 = new C19905();
        for (C13192 c13192 : arrayList2) {
            final C21397 c21397 = new C21397();
            m21730(c1304M21737, c13192, new InterfaceC5735() { // from class: l.ۢܽۚ
                @Override // l.InterfaceC5735
                /* JADX INFO: renamed from: ۙ */
                public final boolean mo16794(InterfaceC2731 interfaceC2732, InterfaceC8697 interfaceC8697) {
                    String str4 = str2;
                    boolean z = "*".equals(str4) || str4.equals(C10208.m26337(interfaceC2732));
                    C21397 c21398 = c21397;
                    c21398.f68159.add(C10208.m26337(interfaceC2732));
                    c21398.f68160.add(C7972.m21736(interfaceC8697));
                    if (z) {
                        C3497 c3497M21720 = C7972.m21720(c1304M21737, interfaceC2732, interfaceC8697, 300, -1, 0, 0, hashSet, null);
                        if (!"item_list".equals(c3497M21720.f12068)) {
                            c21398.f68158.add(c3497M21720);
                        }
                    }
                    return false;
                }
            }, c19905);
            c13192.f42131 = c21397.m48648().size();
            LinkedHashSet linkedHashSet = c21397.f68160;
            if (linkedHashSet.size() > 1) {
                str3 = "mixed";
            } else {
                str3 = linkedHashSet.contains("item_list") ? "item_list" : "single_value";
            }
            c13192.f42133 = str3;
            C3497 c3497 = null;
            for (C3497 c3498 : c21397.f68158) {
                if ("default".equals(c3498.f12055)) {
                    c3497 = c3498;
                    break;
                }
                if (c3497 == null || m21739(c3498.f12055, c3497.f12055) < 0) {
                    c3497 = c3498;
                }
            }
            c13192.f42139 = c3497;
        }
        return c11700;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3960 m21748(C19050 c19050) throws C10186 {
        InterfaceC7206 interfaceC7206M9453 = m21737().f4689.m9453();
        String str = c19050.f61730;
        String str2 = c19050.f61732;
        int i = c19050.f61736;
        m21731(interfaceC7206M9453, str);
        ArrayList arrayList = new ArrayList();
        Iterator it = interfaceC7206M9453.mo15672().iterator();
        while (it.hasNext()) {
            for (InterfaceC15344 interfaceC15344 : ((InterfaceC10869) it.next()).mo19822()) {
                if ("*".equals(str2) || str2.equals(interfaceC15344.getTypeName())) {
                    for (InterfaceC2731 interfaceC2731 : interfaceC15344.mo33925()) {
                        if ("*".equals(str) || str.equals(C10208.m26337(interfaceC2731))) {
                            arrayList.add(interfaceC2731);
                        }
                    }
                }
            }
        }
        C12884.sort(arrayList, new C8016());
        int iMin = (int) Math.min(arrayList.size(), ((long) i) + ((long) c19050.f61733));
        int iMax = Math.max(0, iMin - i);
        C3960 c3960 = new C3960(c19050.f61740, c19050.f61734, iMax, arrayList.size(), c19050.f61733, iMin < arrayList.size(), i + iMax, null, null, null, 0);
        while (i < iMin) {
            c3960.f13534.add(new C18413((InterfaceC2731) arrayList.get(i)));
            i++;
        }
        return c3960;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ int m21708(InterfaceC2731 interfaceC2731, InterfaceC2731 interfaceC2732) {
        int iCompare = Integer.compare(interfaceC2731.getType().mo4332().mo27607(), interfaceC2732.getType().mo4332().mo27607());
        if (iCompare == 0) {
            iCompare = Integer.compare(interfaceC2731.getType().mo35833(), interfaceC2732.getType().mo35833());
        }
        return iCompare == 0 ? m21739(C10208.m26337(interfaceC2731), C10208.m26337(interfaceC2732)) : iCompare;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21731(InterfaceC7206 interfaceC7206, String str) throws C10186 {
        boolean zEquals;
        boolean zEquals2;
        if ("*".equals(str) || "default".equals(str)) {
            return;
        }
        try {
            zEquals = str.equals(C20500.m47000(str, EnumC18262.AOSP).m47027());
        } catch (Exception unused) {
            zEquals = false;
        }
        if (zEquals) {
            return;
        }
        for (InterfaceC10869 interfaceC10869 : interfaceC7206.mo15672()) {
            if (interfaceC10869.mo27606() != EnumC18262.AOSP) {
                try {
                    zEquals2 = str.equals(C20500.m47000(str, interfaceC10869.mo27606()).m47027());
                } catch (Exception unused2) {
                    zEquals2 = false;
                }
                if (zEquals2) {
                    return;
                }
            }
            Iterator it = interfaceC10869.mo19822().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((InterfaceC15344) it.next()).mo33925().iterator();
                while (it2.hasNext()) {
                    if (str.equals(C10208.m26337((InterfaceC2731) it2.next()))) {
                        return;
                    }
                }
            }
        }
        throw C10186.m26301("Invalid variant. Use default for a configuration with no qualifiers, or exact qualifiers with a leading hyphen, such as -zh-rCN. Copy a variant returned by resource_table_variants when unsure. Use * only to list all configurations.", "variant", JSON.value(str), JSON.array(), JSON.object().add("variant", "-zh-rCN"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16921 m21754(String str, HashSet hashSet) throws C10186 {
        C1304 c1304M21737 = m21737();
        int iM21746 = m21746(str, "locator");
        C4989 c4989 = new C4989(c1304M21737, iM21746, "default", 20, 4096, 32768, 50, 0, hashSet);
        m21729(c1304M21737, iM21746, new C21441(c4989));
        if (c4989.f17336 == null) {
            return null;
        }
        ArrayList arrayListM15204 = c4989.m15204();
        c4989.f17336.f42131 = arrayListM15204.size();
        String str2 = c4989.f17339;
        if (!"*".equals(str2) && !arrayListM15204.contains(str2)) {
            C10186 c10186M26301 = C10186.m26301("Resource variant not found", "variant", JSON.value("default"), C12556.m31235(arrayListM15204), JSON.object().add("variant", "default"));
            c10186M26301.f32602.put("availableVariants", C12556.m31235(arrayListM15204));
            throw c10186M26301;
        }
        c4989.m15205();
        ArrayList arrayList = c4989.f17342;
        int size = arrayList.size();
        int i = c4989.f17337;
        return new C16921(c4989.f17336, arrayListM15204, arrayList, size, size < i, i, "default");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16921 m21753(String str, String str2, int i, int i2, int i3, int i4, HashSet hashSet) throws C10186 {
        C1304 c1304M21737 = m21737();
        int iM21746 = m21746(str, "locator");
        C4989 c4989 = new C4989(c1304M21737, iM21746, str2, 1, i, i2, i3, i4, hashSet);
        m21729(c1304M21737, iM21746, new C21441(c4989));
        if (c4989.f17336 == null) {
            return null;
        }
        ArrayList arrayListM15204 = c4989.m15204();
        c4989.f17336.f42131 = arrayListM15204.size();
        if (!arrayListM15204.contains(str2)) {
            return new C16921(c4989.f17336, arrayListM15204, new ArrayList(), 0, false, 0, str2);
        }
        c4989.m15205();
        C13192 c13192 = c4989.f17336;
        ArrayList arrayList = c4989.f17342;
        return new C16921(c13192, arrayListM15204, arrayList, arrayList.size(), false, c4989.f17337, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16175 m21752(final C10671 c10671, final String str, final int i, final HashSet hashSet, final int i2) {
        final int i3;
        C12666 c12666 = c10671.f33858;
        final ArrayList arrayList = new ArrayList();
        if (i2 <= 0) {
            return new C16175(arrayList, i, true);
        }
        if (!"resource_table_id".equals(str)) {
            i3 = 0;
        } else {
            if (!"literal".equals(c12666.f40589)) {
                return new C16175(arrayList, i, false);
            }
            long jM21710 = m21710(c10671.f33873);
            if (jM21710 < 0) {
                return new C16175(arrayList, i, false);
            }
            i3 = (int) jM21710;
        }
        final C1304 c1304M21737 = m21737();
        final C20871 c20871M31435 = c12666.m31435();
        final boolean z = "resource_table_value".equals(str) || "resource_table_file_path".equals(str);
        final C19905 c19905 = z ? new C19905() : null;
        final C23635 c23635 = new C23635();
        InterfaceC2006 interfaceC2006 = interfaceC2006;
        InterfaceC2006 interfaceC2007 = new InterfaceC2006() { // from class: l.ܰܽۚ
            @Override // l.InterfaceC2006
            /* JADX INFO: renamed from: ۙ */
            public final boolean mo2565(C13192 c13192) {
                return C7972.m21733(this.f48119, c23635, i, c10671, z, c1304M21737, c20871M31435, str, hashSet, c19905, i3, arrayList, i2, c13192);
            }
        };
        InterfaceC7206 interfaceC7206M9453 = c1304M21737.f4689.m9453();
        HashSet hashSet2 = new HashSet();
        loop0: for (InterfaceC10869 interfaceC10869 : interfaceC7206M9453.mo15672()) {
            int iMo27607 = interfaceC10869.mo27607();
            for (InterfaceC15344 interfaceC15344 : interfaceC10869.mo19822()) {
                if (hashSet2.add(Integer.valueOf(interfaceC15344.mo35833() | (iMo27607 << 8)))) {
                    InterfaceC2006 interfaceC2008 = interfaceC2006;
                    if (m21732(c1304M21737, interfaceC15344, interfaceC2008)) {
                        break loop0;
                    }
                    interfaceC2006 = interfaceC2008;
                }
            }
        }
        boolean z2 = c23635.f76678;
        return new C16175(arrayList, z2 ? c23635.f76677 : c23635.f76676, z2);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:50:0x0119  */
    /* JADX WARN: Code duplicated, block: B:52:0x0120  */
    /* JADX WARN: Code duplicated, block: B:55:0x013f  */
    /* JADX WARN: Code duplicated, block: B:57:0x014c  */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x00fd, please report this as an issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m21733(C7972 c7972, C23635 c23635, int i, C10671 c10671, boolean z, C1304 c1304, C20871 c20871, String str, HashSet hashSet, C19905 c19905, int i2, ArrayList arrayList, int i3, C13192 c13192) {
        C3717 c3717M47696;
        C3717 c3717;
        C23131 c23131;
        boolean z2;
        C3717 c3718;
        char c;
        String str2 = c13192.f42136;
        int i4 = c13192.f42137;
        String str3 = c13192.f42138;
        c7972.getClass();
        int i5 = c23635.f76676;
        int i6 = i5 + 1;
        c23635.f76676 = i6;
        if (i5 >= i) {
            String str4 = c10671.f33867;
            if (str4 == null || str4.isEmpty()) {
                if (!z) {
                    if ("resource_table_id".equals(str)) {
                        if (i4 != i2) {
                            c3718 = null;
                        } else {
                            String strM21711 = m21711(i4);
                            c3718 = new C3717("resource_table_id", 0, strM21711.length(), strM21711);
                        }
                        if (c3718 != null) {
                            c23131 = new C23131("resource", str, "id", c3718, null, c13192, null, null, null, null);
                        } else {
                            z2 = true;
                            c23131 = null;
                        }
                    } else {
                        if ("resource_table_name".equals(str)) {
                            c3717M47696 = c20871.m47696(str2 + "/" + str3, "resource_table_type_name");
                            if (c3717M47696 == null) {
                                c3717M47696 = c20871.m47696(str3, "resource_table_name");
                            }
                            c3717 = c3717M47696;
                            if (c3717 != null) {
                                c23131 = new C23131("resource", str, "name", c3717, null, c13192, null, null, null, null);
                            }
                        }
                        z2 = true;
                        c23131 = null;
                    }
                    if (c23131 != null) {
                        arrayList.add(c23131);
                        if (arrayList.size() >= i3) {
                            c23635.f76678 = z2;
                            c23635.f76677 = i6;
                            return z2;
                        }
                    }
                } else {
                    final C12446 c12446 = new C12446(c1304, c10671, str, c13192, hashSet, c20871);
                    m21730(c1304, c13192, new InterfaceC5735() { // from class: l.ܿܽۚ
                        @Override // l.InterfaceC5735
                        /* JADX INFO: renamed from: ۙ */
                        public final boolean mo16794(InterfaceC2731 interfaceC2731, InterfaceC8697 interfaceC8697) {
                            return c12446.m30915(interfaceC2731, interfaceC8697);
                        }
                    }, c19905);
                    c23131 = c12446.f40007;
                }
                z2 = true;
                if (c23131 != null) {
                    arrayList.add(c23131);
                    if (arrayList.size() >= i3) {
                        c23635.f76678 = z2;
                        c23635.f76677 = i6;
                        return z2;
                    }
                }
            } else if (str4.regionMatches(true, 0, "0x", 0, 2)) {
                if (str4.length() <= 10) {
                    for (int i7 = 0; i7 < str4.length(); i7++) {
                        if (i7 == 0) {
                            c = '0';
                        } else if (i7 == 1) {
                            c = 'x';
                        } else {
                            c = f26502[(i4 >>> (28 - ((i7 - 2) * 4))) & 15];
                        }
                        char cCharAt = str4.charAt(i7);
                        if (cCharAt == c || cCharAt == Character.toUpperCase(c)) {
                        }
                    }
                    if (!z) {
                        if ("resource_table_id".equals(str)) {
                            if (i4 != i2) {
                                c3718 = null;
                            } else {
                                String strM21712 = m21711(i4);
                                c3718 = new C3717("resource_table_id", 0, strM21712.length(), strM21712);
                            }
                            if (c3718 != null) {
                                c23131 = new C23131("resource", str, "id", c3718, null, c13192, null, null, null, null);
                            } else {
                                z2 = true;
                                c23131 = null;
                            }
                        } else {
                            if ("resource_table_name".equals(str)) {
                                c3717M47696 = c20871.m47696(str2 + "/" + str3, "resource_table_type_name");
                                if (c3717M47696 == null) {
                                    c3717M47696 = c20871.m47696(str3, "resource_table_name");
                                }
                                c3717 = c3717M47696;
                                if (c3717 != null) {
                                    c23131 = new C23131("resource", str, "name", c3717, null, c13192, null, null, null, null);
                                }
                            }
                            z2 = true;
                            c23131 = null;
                        }
                        if (c23131 != null) {
                            arrayList.add(c23131);
                            if (arrayList.size() >= i3) {
                                c23635.f76678 = z2;
                                c23635.f76677 = i6;
                                return z2;
                            }
                        }
                    } else {
                        final C12446 c12447 = new C12446(c1304, c10671, str, c13192, hashSet, c20871);
                        m21730(c1304, c13192, new InterfaceC5735() { // from class: l.ܿܽۚ
                            @Override // l.InterfaceC5735
                            /* JADX INFO: renamed from: ۙ */
                            public final boolean mo16794(InterfaceC2731 interfaceC2731, InterfaceC8697 interfaceC8697) {
                                return c12447.m30915(interfaceC2731, interfaceC8697);
                            }
                        }, c19905);
                        c23131 = c12447.f40007;
                    }
                    z2 = true;
                    if (c23131 != null) {
                        arrayList.add(c23131);
                        if (arrayList.size() >= i3) {
                            c23635.f76678 = z2;
                            c23635.f76677 = i6;
                            return z2;
                        }
                    }
                }
            } else {
                if ((str2 + "/" + str3).startsWith(str4) || str3.startsWith(str4)) {
                    if (!z) {
                        if ("resource_table_id".equals(str)) {
                            if (i4 != i2) {
                                c3718 = null;
                            } else {
                                String strM21713 = m21711(i4);
                                c3718 = new C3717("resource_table_id", 0, strM21713.length(), strM21713);
                            }
                            if (c3718 != null) {
                                c23131 = new C23131("resource", str, "id", c3718, null, c13192, null, null, null, null);
                            } else {
                                z2 = true;
                                c23131 = null;
                            }
                        } else {
                            if ("resource_table_name".equals(str)) {
                                c3717M47696 = c20871.m47696(str2 + "/" + str3, "resource_table_type_name");
                                if (c3717M47696 == null) {
                                    c3717M47696 = c20871.m47696(str3, "resource_table_name");
                                }
                                c3717 = c3717M47696;
                                if (c3717 != null) {
                                    c23131 = new C23131("resource", str, "name", c3717, null, c13192, null, null, null, null);
                                }
                            }
                            z2 = true;
                            c23131 = null;
                        }
                        if (c23131 != null) {
                            arrayList.add(c23131);
                            if (arrayList.size() >= i3) {
                                c23635.f76678 = z2;
                                c23635.f76677 = i6;
                                return z2;
                            }
                        }
                    } else {
                        final C12446 c12448 = new C12446(c1304, c10671, str, c13192, hashSet, c20871);
                        m21730(c1304, c13192, new InterfaceC5735() { // from class: l.ܿܽۚ
                            @Override // l.InterfaceC5735
                            /* JADX INFO: renamed from: ۙ */
                            public final boolean mo16794(InterfaceC2731 interfaceC2731, InterfaceC8697 interfaceC8697) {
                                return c12448.m30915(interfaceC2731, interfaceC8697);
                            }
                        }, c19905);
                        c23131 = c12448.f40007;
                    }
                    z2 = true;
                    if (c23131 != null) {
                        arrayList.add(c23131);
                        if (arrayList.size() >= i3) {
                            c23635.f76678 = z2;
                            c23635.f76677 = i6;
                            return z2;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x015a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0182  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:93:0x019e A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14683 m21751(String str, int i, int i2, int i3, HashSet hashSet) throws C10186 {
        int i4;
        int i5;
        int i6;
        boolean z;
        InterfaceC8697 interfaceC8697Mo9076;
        C4243 c4243;
        C6481 c6481;
        int i7;
        C6481 c6482;
        C1304 c1304M21737 = m21737();
        int iM21746 = m21746(str, "locator");
        C19905 c19905 = new C19905();
        ArrayList arrayList = new ArrayList();
        C2863 c2863 = c1304M21737.f4689;
        InterfaceC7206 interfaceC7206M9453 = c2863.m9453();
        HashSet hashSet2 = new HashSet();
        Iterator it = interfaceC7206M9453.mo15672().iterator();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (it.hasNext()) {
                InterfaceC10869 interfaceC10869 = (InterfaceC10869) it.next();
                int iMo27607 = interfaceC10869.mo27607();
                Iterator it2 = interfaceC10869.mo19822().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        InterfaceC15344 interfaceC15344 = (InterfaceC15344) it2.next();
                        if (hashSet2.add(Integer.valueOf(interfaceC15344.mo35833() | (iMo27607 << 8)))) {
                            HashSet hashSet3 = new HashSet();
                            Iterator it3 = interfaceC15344.mo35832().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    InterfaceC2731 interfaceC2731 = (InterfaceC2731) it3.next();
                                    Iterator it4 = interfaceC2731.mo9078().iterator();
                                    int i10 = i9;
                                    while (true) {
                                        if (it4.hasNext()) {
                                            InterfaceC8697 interfaceC8697 = (InterfaceC8697) it4.next();
                                            if (hashSet3.add(Integer.valueOf(interfaceC8697.mo23383()))) {
                                                i6 = i10 + 1;
                                                if (i10 >= i) {
                                                    C6481 c6483 = new C6481(arrayList, Math.max(i8, i10 == i ? i2 : 0), i3);
                                                    C4243 c4244 = new C4243(c1304M21737, interfaceC2731, interfaceC8697);
                                                    int iMo23383 = interfaceC8697.mo23383();
                                                    Iterator it5 = c19905.m45833(interfaceC15344).iterator();
                                                    while (true) {
                                                        if (it5.hasNext()) {
                                                            InterfaceC2731 interfaceC2732 = (InterfaceC2731) it5.next();
                                                            if (interfaceC2732.mo9075(iMo23383) && (interfaceC8697Mo9076 = interfaceC2732.mo9076(iMo23383)) != null) {
                                                                InterfaceC8697 interfaceC8697M21744 = m21744(c1304M21737, interfaceC2732, interfaceC8697Mo9076);
                                                                int i11 = iMo23383;
                                                                int parent = interfaceC8697M21744.getParent();
                                                                if (parent != 0 && parent == iM21746 && c6483.m18317(c4244, interfaceC2732, str)) {
                                                                    c6482 = c6483;
                                                                    i7 = i10;
                                                                } else {
                                                                    boolean z2 = interfaceC8697M21744.mo18154() > 0 && !m21747(interfaceC8697M21744);
                                                                    Iterator it6 = interfaceC8697M21744.values().iterator();
                                                                    while (true) {
                                                                        if (it6.hasNext()) {
                                                                            InterfaceC5650 interfaceC5650 = (InterfaceC5650) it6.next();
                                                                            if (iM21746 == 0 || !z2) {
                                                                                c4243 = c4244;
                                                                            } else {
                                                                                int iMo16637 = interfaceC5650.mo16637();
                                                                                if (iMo16637 == -1) {
                                                                                    c4243 = c4244;
                                                                                } else {
                                                                                    c4243 = c4244;
                                                                                    if (!"style".equals(C10208.m26336(interfaceC2732.getType().getTypeName()))) {
                                                                                    }
                                                                                    if (iMo16637 == iM21746) {
                                                                                        c6481 = c6483;
                                                                                        i7 = i10;
                                                                                        if (c6483.m18315(c2863, c4243, interfaceC2732, interfaceC5650, str, hashSet)) {
                                                                                        }
                                                                                        c6482 = c6481;
                                                                                    }
                                                                                    if (iM21746 == 0 && m21709(interfaceC5650) == iM21746) {
                                                                                        if (c6481.m18316(c2863, c4243, interfaceC2732, interfaceC5650, z2, str, hashSet)) {
                                                                                            c6482 = c6481;
                                                                                        }
                                                                                    }
                                                                                    c6483 = c6481;
                                                                                    interfaceC15344 = interfaceC15344;
                                                                                    c4244 = c4243;
                                                                                    i10 = i7;
                                                                                    interfaceC2731 = interfaceC2731;
                                                                                    hashSet3 = hashSet3;
                                                                                }
                                                                                iMo16637 = 0;
                                                                                if (iMo16637 == iM21746) {
                                                                                    c6481 = c6483;
                                                                                    i7 = i10;
                                                                                    if (c6483.m18315(c2863, c4243, interfaceC2732, interfaceC5650, str, hashSet)) {
                                                                                    }
                                                                                    c6482 = c6481;
                                                                                }
                                                                                if (iM21746 == 0) {
                                                                                }
                                                                                c6483 = c6481;
                                                                                interfaceC15344 = interfaceC15344;
                                                                                c4244 = c4243;
                                                                                i10 = i7;
                                                                                interfaceC2731 = interfaceC2731;
                                                                                hashSet3 = hashSet3;
                                                                            }
                                                                            c6481 = c6483;
                                                                            i7 = i10;
                                                                            if (iM21746 == 0) {
                                                                            }
                                                                            c6483 = c6481;
                                                                            interfaceC15344 = interfaceC15344;
                                                                            c4244 = c4243;
                                                                            i10 = i7;
                                                                            interfaceC2731 = interfaceC2731;
                                                                            hashSet3 = hashSet3;
                                                                        } else {
                                                                            iMo23383 = i11;
                                                                        }
                                                                    }
                                                                }
                                                                i5 = c6482.f21792;
                                                                z = true;
                                                                i4 = i7;
                                                            }
                                                        }
                                                    }
                                                }
                                                i8 = 0;
                                                i = i;
                                                i10 = i6;
                                                interfaceC15344 = interfaceC15344;
                                                interfaceC2731 = interfaceC2731;
                                                hashSet3 = hashSet3;
                                            }
                                        } else {
                                            i8 = 0;
                                            i = i;
                                            i9 = i10;
                                        }
                                    }
                                } else {
                                    i8 = 0;
                                    i = i;
                                }
                            }
                        }
                    } else {
                        i8 = 0;
                    }
                }
            } else {
                i4 = 0;
                i5 = 0;
                i6 = i9;
                z = false;
            }
            if (!z) {
                i4 = i6;
            }
            if (!z) {
                i5 = 0;
            }
            return new C14683(i4, i5, arrayList, z);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21246 m21755() {
        C21246 c21246;
        C21246 c21247;
        SoftReference softReference = this.f26503;
        if (softReference != null && (c21247 = (C21246) softReference.get()) != null) {
            return c21247;
        }
        synchronized (this.f26506) {
            SoftReference softReference2 = this.f26503;
            if (softReference2 != null && (c21246 = (C21246) softReference2.get()) != null) {
                return c21246;
            }
            C2863 c2863 = m21737().f4689;
            C21246 c21248 = new C21246(c2863.m9453(), c2863.m9457());
            this.f26503 = new SoftReference(c21248);
            return c21248;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C10954 m21757() {
        return new C10954(m21737());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10954 m21749(ArrayList arrayList) {
        C1304 c1304M21737 = m21737();
        return new C10954(new C1304(new C2863(new C5209(c1304M21737.f4689.m9453(), arrayList)), c1304M21737.f4688, c1304M21737.f4687));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private C1304 m21737() {
        C1304 c1304;
        C1304 c1305;
        SoftReference softReference = this.f26504;
        if (softReference != null && (c1305 = (C1304) softReference.get()) != null) {
            return c1305;
        }
        synchronized (this.f26506) {
            SoftReference softReference2 = this.f26504;
            if (softReference2 != null && (c1304 = (C1304) softReference2.get()) != null) {
                return c1304;
            }
            C24296 c24296M9101 = this.f26505.m9101();
            AbstractC20105 c5209 = this.f26507.isEmpty() ? c24296M9101 : new C5209(c24296M9101, this.f26507);
            C1304 c1306 = new C1304(new C2863(c5209), m21717(c5209), c24296M9101);
            this.f26504 = new SoftReference(c1306);
            return c1306;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C19159 m21756() {
        return C16395.m38927(m21737().f4689);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private HashMap m21717(AbstractC20105 abstractC20105) throws C10186 {
        HashMap map = new HashMap();
        for (C1260 c1260 : this.f26507) {
            boolean zM4578 = c1260.m4578();
            String str = c1260.f4549;
            int i = c1260.f4547;
            if (!zM4578 && !c1260.m4580()) {
                InterfaceC2731 interfaceC2731M21742 = m21742(abstractC20105, i, str);
                if (interfaceC2731M21742 != null) {
                    int i2 = 65535 & i;
                    if (interfaceC2731M21742.mo9075(i2)) {
                        map.put(m21741(i, str), C4287.m13664(interfaceC2731M21742, i2, c1260.f4545));
                    }
                }
                throw C10186.m26305("RESOURCE_PATCH_CORRUPT", "Resource patch target is missing from base resources.arsc.");
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21729(C1304 c1304, int i, InterfaceC15429 interfaceC15429) {
        InterfaceC8697 interfaceC8697Mo9076;
        InterfaceC15344 interfaceC15344M21728 = m21728(c1304.f4689.m9453(), i >>> 24, (i >>> 16) & 255);
        if (interfaceC15344M21728 == null) {
            return;
        }
        int i2 = i & 65535;
        for (InterfaceC2731 interfaceC2731 : interfaceC15344M21728.mo35832()) {
            if (interfaceC2731.mo9075(i2) && (interfaceC8697Mo9076 = interfaceC2731.mo9076(i2)) != null) {
                interfaceC15429.mo36958(interfaceC2731, m21744(c1304, interfaceC2731, interfaceC8697Mo9076));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m21732(C1304 c1304, InterfaceC15344 interfaceC15344, InterfaceC2006 interfaceC2006) {
        HashSet hashSet = new HashSet();
        for (InterfaceC2731 interfaceC2731 : interfaceC15344.mo35832()) {
            for (InterfaceC8697 interfaceC8697 : interfaceC2731.mo9078()) {
                if (hashSet.add(Integer.valueOf(interfaceC8697.mo23383())) && interfaceC2006.mo2565(m21738(m21744(c1304, interfaceC2731, interfaceC8697)))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C13192 m21738(InterfaceC8697 interfaceC8697) {
        int iMo23384 = interfaceC8697.mo23384();
        InterfaceC10869 interfaceC10869Mo18153 = interfaceC8697.mo18153();
        InterfaceC15344 type = interfaceC8697.getType();
        interfaceC10869Mo18153.getClass();
        int iMo27607 = interfaceC10869Mo18153.mo27607();
        return new C13192(type.getTypeName(), iMo23384, iMo27607, type.mo35833(), interfaceC8697.mo23383(), interfaceC8697.mo18156());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21730(C1304 c1304, C13192 c13192, InterfaceC5735 interfaceC5735, C19905 c19905) {
        InterfaceC8697 interfaceC8697Mo9076;
        InterfaceC7206 interfaceC7206M9453 = c1304.f4689.m9453();
        int i = c13192.f42134;
        int i2 = c13192.f42132;
        InterfaceC15344 interfaceC15344M21728 = m21728(interfaceC7206M9453, i, c13192.f42135);
        if (interfaceC15344M21728 == null) {
            return;
        }
        for (InterfaceC2731 interfaceC2731 : c19905 == null ? m21715((Iterable) interfaceC15344M21728.mo35832()) : c19905.m45833(interfaceC15344M21728)) {
            if (interfaceC2731.mo9075(i2) && (interfaceC8697Mo9076 = interfaceC2731.mo9076(i2)) != null && interfaceC5735.mo16794(interfaceC2731, m21744(c1304, interfaceC2731, interfaceC8697Mo9076))) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m21715(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add((InterfaceC2731) it.next());
        }
        C12884.sort(arrayList, new C18529(1));
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static InterfaceC8697 m21744(C1304 c1304, InterfaceC2731 interfaceC2731, InterfaceC8697 interfaceC8697) {
        InterfaceC8697 interfaceC8698;
        return (c1304.f4688.isEmpty() || (interfaceC8698 = (InterfaceC8697) c1304.f4688.get(m21741(interfaceC8697.mo23384(), C10208.m26337(interfaceC2731)))) == null) ? interfaceC8697 : interfaceC8698;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m21741(int i, String str) {
        return m21711(i) + '\n' + str;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static InterfaceC2731 m21742(InterfaceC7206 interfaceC7206, int i, String str) {
        InterfaceC15344 interfaceC15344M21728 = m21728(interfaceC7206, i >>> 24, (i >>> 16) & 255);
        if (interfaceC15344M21728 == null) {
            return null;
        }
        int i2 = i & 65535;
        for (InterfaceC2731 interfaceC2731 : interfaceC15344M21728.mo35832()) {
            if (C10208.m26337(interfaceC2731).equals(str) && interfaceC2731.mo9075(i2)) {
                return interfaceC2731;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m21739(String str, String str2) {
        if (str.equals(str2)) {
            return 0;
        }
        if ("default".equals(str)) {
            return -1;
        }
        if ("default".equals(str2)) {
            return 1;
        }
        return str.compareTo(str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC15344 m21728(InterfaceC7206 interfaceC7206, int i, int i2) {
        for (InterfaceC10869 interfaceC10869 : interfaceC7206.mo15672()) {
            if (interfaceC10869.mo27607() == i) {
                for (InterfaceC15344 interfaceC15344 : interfaceC10869.mo19822()) {
                    if (interfaceC15344.mo35833() == i2) {
                        return interfaceC15344;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m21711(int i) {
        char[] cArr = new char[10];
        cArr[0] = '0';
        cArr[1] = 'x';
        for (int i2 = 0; i2 < 8; i2++) {
            cArr[i2 + 2] = f26502[(i >>> (28 - (i2 * 4))) & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m21735(String str, String str2) {
        return m21711(m21746(str, str2));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m21746(String str, String str2) throws C10186 {
        long jM21710 = m21710(str);
        if (jM21710 < 0) {
            throw C10186.m26301(C25272.m56409("Invalid ", str2), str2, str == null ? null : JSON.value(str), JSON.array("0x00000000..0xffffffff"), JSON.object().add(str2, "0x7f010000"));
        }
        return (int) jM21710;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m21710(String str) {
        int i;
        if (str == null || str.length() != 10 || !str.regionMatches(true, 0, "0x", 0, 2)) {
            return -1L;
        }
        long j = 0;
        for (int i2 = 2; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= '0' && cCharAt <= '9') {
                i = cCharAt - '0';
            } else if (cCharAt < 'a' || cCharAt > 'f') {
                i = (cCharAt < 'A' || cCharAt > 'F') ? -1 : cCharAt - '7';
            } else {
                i = cCharAt - 'W';
            }
            if (i < 0) {
                return -1L;
            }
            j = (j << 4) | ((long) i);
        }
        return j;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m21747(InterfaceC8697 interfaceC8697) {
        return interfaceC8697.mo18154() == 1 && interfaceC8697.getValue(0).mo16637() == -1;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m21736(InterfaceC8697 interfaceC8697) {
        return (interfaceC8697.mo18154() <= 0 || m21747(interfaceC8697)) ? "single_value" : "item_list";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3497 m21720(C1304 c1304, InterfaceC2731 interfaceC2731, InterfaceC8697 interfaceC8697, int i, int i2, int i3, int i4, Set set, HashMap map) {
        C2863 c2863 = c1304.f4689;
        String strM26337 = C10208.m26337(interfaceC2731);
        int iMo18154 = interfaceC8697.mo18154();
        if (iMo18154 != 0) {
            C20125 c20125M38928 = i2 >= 0 ? C16395.m38928(c2863, interfaceC8697, i2) : null;
            if (m21747(interfaceC8697)) {
                return m21721(c1304, interfaceC8697.getValue(0), null, null, strM26337, i, i4, set, map, c20125M38928);
            }
            ArrayList arrayList = new ArrayList();
            int i5 = 0;
            for (InterfaceC5650 interfaceC5650 : interfaceC8697.values()) {
                if (i5 < i3) {
                    C2795 c2795M21743 = m21743(c2863, interfaceC2731, interfaceC5650.mo16637());
                    arrayList.add(m21721(c1304, interfaceC5650, c2795M21743.f9199, c2795M21743.f9200, strM26337, i, i4, set, map, null));
                }
                i5++;
            }
            return new C3497(null, null, strM26337, "item_list", false, false, null, null, null, null, null, arrayList, iMo18154 > i3, iMo18154, c20125M38928);
        }
        return new C3497(null, null, strM26337, "null_value", false, false, null, null, null, null, null, new ArrayList(), false, 0, i2 >= 0 ? C16395.m38928(c2863, interfaceC8697, i2) : null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3497 m21721(C1304 c1304, InterfaceC5650 interfaceC5650, String str, String str2, String str3, int i, int i2, Set set, HashMap map, C20125 c20125) {
        String str4;
        C17667 c17667;
        String str5;
        C17667 c17667M50101;
        C9506 c9506M21727 = m21727(c1304.f4689, interfaceC5650, i);
        String str6 = c9506M21727.f30785;
        String strM21714 = m21714(interfaceC5650, c9506M21727, set);
        if ("null_value".equals(strM21714)) {
            return new C3497(str, str2, str3, strM21714, false, false, null, null, null, null, null, new ArrayList(), false, 0, c20125);
        }
        if ("unparsed".equals(strM21714)) {
            return new C3497(str, str2, str3, strM21714, false, false, (str6 == null || str6.isEmpty()) ? null : C1173.m4316(0, str6.length(), 300, str6), null, null, null, null, new ArrayList(), false, 0, c20125);
        }
        String str7 = c9506M21727.f30789;
        int iM21709 = m21709(interfaceC5650);
        String strM21711 = iM21709 == 0 ? null : m21711(iM21709);
        String str8 = "file_path".equals(strM21714) ? c9506M21727.f30788 : null;
        if (i2 != 1 || iM21709 == 0) {
            str4 = strM21711;
            c17667 = null;
        } else {
            String strM21712 = m21711(iM21709);
            String strM46451 = C20196.m46451(str3, "\n", strM21712);
            if (map == null || !map.containsKey(strM46451)) {
                try {
                    str4 = strM21711;
                    str5 = strM46451;
                    try {
                        final C22143 c22143 = new C22143(c1304, iM21709, strM21712, str3, set);
                        m21729(c1304, iM21709, new InterfaceC15429() { // from class: l.ᩳܽۚ
                            @Override // l.InterfaceC15429
                            /* JADX INFO: renamed from: ۙ */
                            public final void mo36958(InterfaceC2731 interfaceC2731, InterfaceC8697 interfaceC8697) {
                                int iMo23384 = interfaceC8697.mo23384();
                                C22143 c22144 = c22143;
                                if (iMo23384 != c22144.f71326) {
                                    return;
                                }
                                if (c22144.f71332 == null) {
                                    c22144.f71332 = C7972.m21738(interfaceC8697);
                                }
                                C3497 c3497M21720 = C7972.m21720(c22144.f71325, interfaceC2731, interfaceC8697, 300, -1, 0, 0, c22144.f71324, null);
                                String strM26337 = C10208.m26337(interfaceC2731);
                                if (c22144.f71329.equals(strM26337)) {
                                    c22144.f71330 = c3497M21720;
                                } else if ("default".equals(strM26337)) {
                                    c22144.f71331 = c3497M21720;
                                }
                                C3497 c3497 = c22144.f71327;
                                if (c3497 == null || C7972.m21739(strM26337, c3497.f12055) < 0) {
                                    c22144.f71327 = c3497M21720;
                                }
                            }
                        });
                        c17667M50101 = c22143.m50101();
                    } catch (Exception unused) {
                        c17667M50101 = null;
                    }
                } catch (Exception unused2) {
                    str4 = strM21711;
                    str5 = strM46451;
                }
                if (map != null) {
                    map.put(str5, c17667M50101);
                }
                c17667 = c17667M50101;
            } else {
                c17667 = (C17667) map.get(strM46451);
                str4 = strM21711;
            }
        }
        return new C3497(str, str2, str3, strM21714, "styled_text".equals(strM21714), c9506M21727.f30787, str7, c20125 == null ? null : c20125.f64677, str8, str4, c17667, new ArrayList(), false, 0, c20125);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m21714(InterfaceC5650 interfaceC5650, C9506 c9506, Set set) {
        if (c9506.f30785 != null) {
            return "unparsed";
        }
        int iMo16635 = interfaceC5650.mo16635();
        if (iMo16635 == 0) {
            return "null_value";
        }
        if (iMo16635 == 3) {
            if (c9506.f30786) {
                return "styled_text";
            }
            String str = c9506.f30788;
            return (str == null || !set.contains(str)) ? TextBundle.TEXT_ENTRY : "file_path";
        }
        if (iMo16635 == 1 || iMo16635 == 7) {
            return Name.REFER;
        }
        if (iMo16635 == 2 || iMo16635 == 8) {
            return AnnotationHandler.ATTRIBUTE;
        }
        if (iMo16635 == 18) {
            return ClassTransform.BOOLEAN;
        }
        if (iMo16635 >= 28 && iMo16635 <= 31) {
            return ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR;
        }
        if (iMo16635 == 5) {
            return "dimension";
        }
        if (iMo16635 == 6) {
            return "fraction";
        }
        return (iMo16635 == 4 || iMo16635 == 16 || iMo16635 == 17) ? "number" : "unparsed";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9506 m21727(C2863 c2863, InterfaceC5650 interfaceC5650, int i) {
        CharSequence charSequenceM34210;
        boolean zMo8825;
        try {
            if (interfaceC5650.mo16635() == 3 && interfaceC5650.mo11710() != null) {
                InterfaceC16090 interfaceC16090Mo11710 = interfaceC5650.mo11710();
                charSequenceM34210 = interfaceC16090Mo11710.getValue();
                zMo8825 = interfaceC16090Mo11710.mo8825();
            } else {
                charSequenceM34210 = C14049.m34210(c2863, interfaceC5650);
                if (charSequenceM34210 instanceof InterfaceC16090) {
                    InterfaceC16090 interfaceC16090 = (InterfaceC16090) charSequenceM34210;
                    String value = interfaceC16090.getValue();
                    zMo8825 = interfaceC16090.mo8825();
                    charSequenceM34210 = value;
                } else {
                    zMo8825 = false;
                }
            }
            String strM4319 = C1173.m4319(charSequenceM34210.toString());
            if (i > 0) {
                String strM4317 = C1173.m4317(0, i, (CharSequence) strM4319);
                return new C9506(strM4317, null, strM4319, strM4317.codePointCount(0, strM4317.length()) < strM4319.codePointCount(0, strM4319.length()), zMo8825);
            }
            return new C9506(strM4319, null, strM4319, false, zMo8825);
        } catch (Exception e) {
            return new C9506("", e.getMessage() == null ? "Failed to format resource value" : e.getMessage(), null, false, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m21709(InterfaceC5650 interfaceC5650) {
        int iMo16635 = interfaceC5650.mo16635();
        if (interfaceC5650.getValue() == 0) {
            return 0;
        }
        if (iMo16635 == 1 || iMo16635 == 7 || iMo16635 == 2 || iMo16635 == 8) {
            return interfaceC5650.getValue();
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0091 A[ADDED_TO_REGION, LOOP:0: B:28:0x0091->B:32:0x00a7, LOOP_START, PHI: r0
      0x0091: PHI (r0v4 int) = (r0v0 int), (r0v5 int) binds: [B:26:0x008e, B:32:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a5 A[EDGE_INSN: B:31:0x00a5->B:33:0x00aa BREAK  A[LOOP:0: B:28:0x0091->B:32:0x00a7]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a7 A[LOOP:0: B:28:0x0091->B:32:0x00a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C2795 m21743(C2863 c2863, InterfaceC2731 interfaceC2731, int i) {
        C2600 c2600M19410;
        String strMo9456;
        String strM21711 = null;
        if (i == -1) {
            return new C2795(null, 0);
        }
        int i2 = (i != -1 && "style".equals(C10208.m26336(interfaceC2731.getType().getTypeName()))) ? i : 0;
        String strM26336 = C10208.m26336(interfaceC2731.getType().getTypeName());
        if ("plurals".equals(strM26336)) {
            int i3 = i - 16777220;
            if (i3 >= 0 && i3 < 6) {
                strM21711 = InterfaceC5650.f19517[i3];
            } else {
                strMo9456 = c2863.mo9456(interfaceC2731.mo9071().mo27607(), i);
                if (strMo9456.length() != 8) {
                    strM21711 = strMo9456;
                    break;
                }
                for (int i4 = 0; i4 < 8; i4++) {
                    if (strMo9456.charAt(i4) != f26502[(i >>> (28 - (i4 * 4))) & 15]) {
                        strM21711 = strMo9456;
                        break;
                    }
                }
            }
        } else if ("style".equals(strM26336) && (c2600M19410 = c2863.m9457().m19410(i)) != null) {
            strM21711 = c2863.m9452(interfaceC2731.mo9071().mo27607(), (c2600M19410.f8353 >>> 24) & 255) + c2600M19410.f8356;
        } else {
            strMo9456 = c2863.mo9456(interfaceC2731.mo9071().mo27607(), i);
            if (strMo9456.length() != 8) {
                strM21711 = strMo9456;
                break;
            }
            while (i4 < 8) {
                if (strMo9456.charAt(i4) != f26502[(i >>> (28 - (i4 * 4))) & 15]) {
                    strM21711 = strMo9456;
                    break;
                }
            }
        }
        if (strM21711 == null) {
            strM21711 = m21711(i);
        }
        return new C2795(strM21711, i2);
    }
}
