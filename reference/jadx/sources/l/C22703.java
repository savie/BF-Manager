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

/* JADX INFO: renamed from: l.᩺ۖ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AI */
/* JADX INFO: loaded from: classes.dex */
public final class C22703 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final char[] f73942 = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f73943;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public SoftReference f73944;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C7886 f73945;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public SoftReference f73946;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f73947;

    /* JADX WARN: Code duplicated, block: B:27:0x00c6  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m50297(C22703 c22703, C4357 c4357, int i, C1139 c1139, boolean z, C18738 c18738, C13614 c13614, String str, HashSet hashSet, C16622 c16622, int i2, ArrayList arrayList, int i3, C17327 c17327) {
        String str2;
        C0870 c0870;
        C4440 c4440;
        c22703.getClass();
        int i4 = c4357.f15588;
        int i5 = i4 + 1;
        c4357.f15588 = i5;
        if (i4 >= i && ((str2 = c1139.f5127) == null || c17327.m40289(str2))) {
            if (!z) {
                if (!"resource_table_id".equals(str)) {
                    if ("resource_table_name".equals(str)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(c17327.f55133);
                        sb.append("/");
                        String str3 = c17327.f55132;
                        sb.append(str3);
                        C4440 c4440M33293 = c13614.m33293(sb.toString(), "resource_table_type_name");
                        C4440 c4440M33294 = c4440M33293 != null ? c4440M33293 : c13614.m33293(str3, "resource_table_name");
                        if (c4440M33294 != null) {
                            c0870 = new C0870("resource", str, "name", c4440M33294, null, c17327, null, null, null, null);
                        } else {
                            c0870 = null;
                        }
                    } else {
                        c0870 = null;
                    }
                } else {
                    int i6 = c17327.f55129;
                    if (i6 != i2) {
                        c4440 = null;
                    } else {
                        String strM50274 = m50274(i6);
                        c4440 = new C4440("resource_table_id", 0, strM50274.length(), strM50274);
                    }
                    if (c4440 != null) {
                        c0870 = new C0870("resource", str, "id", c4440, null, c17327, null, null, null, null);
                    } else {
                        c0870 = null;
                    }
                }
            } else {
                final C2240 c2240 = new C2240(c18738, c1139, str, c17327, hashSet, c13614);
                m50294(c18738, c17327, new InterfaceC6038() { // from class: l.ܶۨ۬
                    @Override // l.InterfaceC6038
                    /* JADX INFO: renamed from: ۙ */
                    public final boolean mo16377(InterfaceC12783 interfaceC12783, InterfaceC3609 interfaceC3609) {
                        return c2240.m6883(interfaceC12783, interfaceC3609);
                    }
                }, c16622);
                c0870 = c2240.f8036;
            }
            if (c0870 != null) {
                arrayList.add(c0870);
                if (arrayList.size() >= i3) {
                    c4357.f15590 = true;
                    c4357.f15589 = i5;
                    return true;
                }
            }
        }
        return false;
    }

    public C22703(C7886 c7886) {
        this.f73947 = new Object();
        this.f73945 = c7886;
        this.f73943 = new ArrayList();
    }

    public C22703(C7886 c7886, ArrayList arrayList) {
        this.f73947 = new Object();
        this.f73945 = c7886;
        this.f73943 = C17763.m41319(arrayList);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList m50309() {
        return new ArrayList(this.f73943);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22703 m50290(C7886 c7886) {
        C22703 c22703 = new C22703(c7886);
        c22703.m50299();
        return c22703;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22703 m50291(C7886 c7886, ArrayList arrayList) {
        C22703 c22703 = new C22703(c7886, arrayList);
        c22703.m50299();
        return c22703;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23678 m50316(int i, int i2, String str, final HashSet hashSet) {
        String str2;
        final C18738 c18738M50299 = m50299();
        final C14506 c14506 = new C14506(str, i, i2);
        m50293(c18738M50299, new InterfaceC10978() { // from class: l.۬ۨ۬
            @Override // l.InterfaceC10978
            /* JADX INFO: renamed from: ۙ */
            public final boolean mo27729(C17327 c17327) {
                C14506 c14507 = c14506;
                ArrayList arrayList = c14507.f47525;
                c14507.f47526++;
                if (!c17327.m40289(c14507.f47524)) {
                    return false;
                }
                if (c14507.f47529 >= c14507.f47527 && arrayList.size() < c14507.f47528) {
                    arrayList.add(c17327);
                }
                c14507.f47529++;
                return false;
            }
        });
        ArrayList<C17327> arrayList = c14506.f47525;
        int size = arrayList.size() + c14506.f47527;
        int i3 = c14506.f47526;
        int i4 = c14506.f47529;
        C23678 c23678 = new C23678(arrayList, i3, i4, size, size < i4);
        C16622 c16622 = new C16622();
        for (C17327 c17327 : arrayList) {
            final C3651 c3651 = new C3651();
            m50294(c18738M50299, c17327, new InterfaceC6038() { // from class: l.ۜۨ۬
                @Override // l.InterfaceC6038
                /* JADX INFO: renamed from: ۙ */
                public final boolean mo16377(InterfaceC12783 interfaceC12783, InterfaceC3609 interfaceC3609) {
                    C3651 c3652 = c3651;
                    c3652.f13385.add(C21291.m47741(interfaceC12783));
                    c3652.f13386.add(C22703.m50302(interfaceC3609));
                    C13531 c13531M50286 = C22703.m50286(c18738M50299, interfaceC12783, interfaceC3609, 300, -1, 0, 0, hashSet, null);
                    if ("item_list".equals(c13531M50286.f44684)) {
                        return false;
                    }
                    c3652.f13384.add(c13531M50286);
                    return false;
                }
            }, c16622);
            c17327.f55127 = c3651.m10758().size();
            LinkedHashSet linkedHashSet = c3651.f13386;
            if (linkedHashSet.size() > 1) {
                str2 = "mixed";
            } else {
                str2 = linkedHashSet.contains("item_list") ? "item_list" : "single_value";
            }
            c17327.f55131 = str2;
            C13531 c13531 = null;
            for (C13531 c13532 : c3651.f13384) {
                if ("default".equals(c13532.f44678)) {
                    c13531 = c13532;
                    break;
                }
                if (c13531 == null || m50271(c13532.f44678, c13531.f44678) < 0) {
                    c13531 = c13532;
                }
            }
            c17327.f55126 = c13531;
        }
        return c23678;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1804 m50311(String str, HashSet hashSet) throws C12731 {
        C18738 c18738M50299 = m50299();
        int iM50300 = m50300(str, "locator");
        C20855 c20855 = new C20855(c18738M50299, iM50300, "default", 20, 4096, 32768, 50, 0, hashSet);
        m50292(c18738M50299, iM50300, new C3920(c20855));
        if (c20855.f67763 == null) {
            return null;
        }
        ArrayList arrayListM46876 = c20855.m46876();
        c20855.f67763.f55127 = arrayListM46876.size();
        String str2 = c20855.f67770;
        if (!"*".equals(str2) && !arrayListM46876.contains(str2)) {
            C12731 c12731M31626 = C12731.m31626("Resource variant not found", "variant", JSON.value("default"), C10413.m26314(arrayListM46876), JSON.object().add("variant", "default"));
            c12731M31626.f42468.put("availableVariants", C10413.m26314(arrayListM46876));
            throw c12731M31626;
        }
        c20855.m46877();
        ArrayList arrayList = c20855.f67769;
        int size = arrayList.size();
        int i = c20855.f67762;
        return new C1804(c20855.f67763, arrayListM46876, arrayList, size, size < i, i, "default");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1804 m50310(String str, String str2, int i, int i2, int i3, int i4, HashSet hashSet) throws C12731 {
        C18738 c18738M50299 = m50299();
        int iM50300 = m50300(str, "locator");
        C20855 c20855 = new C20855(c18738M50299, iM50300, str2, 1, i, i2, i3, i4, hashSet);
        m50292(c18738M50299, iM50300, new C3920(c20855));
        if (c20855.f67763 == null) {
            return null;
        }
        ArrayList arrayListM46876 = c20855.m46876();
        c20855.f67763.f55127 = arrayListM46876.size();
        if (!arrayListM46876.contains(str2)) {
            return new C1804(c20855.f67763, arrayListM46876, new ArrayList(), 0, false, 0, str2);
        }
        c20855.m46877();
        C17327 c17327 = c20855.f67763;
        ArrayList arrayList = c20855.f67769;
        return new C1804(c17327, arrayListM46876, arrayList, arrayList.size(), false, c20855.f67762, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3215 m50312(final C1139 c1139, final String str, final int i, final HashSet hashSet, final int i2) {
        final int i3;
        C11497 c11497 = c1139.f5119;
        final ArrayList arrayList = new ArrayList();
        if (i2 <= 0) {
            return new C3215(arrayList, i, true);
        }
        if (!"resource_table_id".equals(str)) {
            i3 = 0;
        } else {
            if (!"literal".equals(c11497.f38670)) {
                return new C3215(arrayList, i, false);
            }
            long jM50273 = m50273(c1139.f5132);
            if (jM50273 < 0) {
                return new C3215(arrayList, i, false);
            }
            i3 = (int) jM50273;
        }
        final C18738 c18738M50299 = m50299();
        final C13614 c13614M28688 = c11497.m28688();
        final boolean z = "resource_table_value".equals(str) || "resource_table_file_path".equals(str);
        final C16622 c16622 = z ? new C16622() : null;
        final C4357 c4357 = new C4357();
        m50293(c18738M50299, new InterfaceC10978() { // from class: l.᩺ۨ۬
            @Override // l.InterfaceC10978
            /* JADX INFO: renamed from: ۙ */
            public final boolean mo27729(C17327 c17327) {
                return C22703.m50297(this.f74665, c4357, i, c1139, z, c18738M50299, c13614M28688, str, hashSet, c16622, i3, arrayList, i2, c17327);
            }
        });
        boolean z2 = c4357.f15590;
        return new C3215(arrayList, z2 ? c4357.f15589 : c4357.f15588, z2);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0176  */
    /* JADX WARN: Code duplicated, block: B:70:0x019c  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b6 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12825 m50314(String str, int i, int i2, int i3, HashSet hashSet) throws C12731 {
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        C5063 c5063;
        InterfaceC12783 interfaceC12783;
        HashSet hashSet2;
        InterfaceC19133 interfaceC19133;
        HashSet hashSet3;
        int i8;
        C5063 c5064;
        C5063 c5065;
        int i9 = i;
        C18738 c18738M50299 = m50299();
        String str2 = str;
        int iM50300 = m50300(str2, "locator");
        C16622 c16622 = new C16622();
        ArrayList arrayList = new ArrayList();
        C22577 c22577 = c18738M50299.f60792;
        InterfaceC6432 interfaceC6432M50079 = c22577.m50079();
        HashSet hashSet4 = new HashSet();
        Iterator it = interfaceC6432M50079.mo17615().iterator();
        int i10 = 0;
        while (true) {
            if (it.hasNext()) {
                InterfaceC17721 interfaceC17721 = (InterfaceC17721) it.next();
                if (hashSet4.add(Integer.valueOf(interfaceC17721.mo19106()))) {
                    HashSet hashSet5 = new HashSet();
                    Iterator it2 = interfaceC17721.mo19112().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            InterfaceC19133 interfaceC19134 = (InterfaceC19133) it2.next();
                            if (hashSet5.add(Integer.valueOf(interfaceC19134.mo26942()))) {
                                HashSet hashSet6 = new HashSet();
                                Iterator it3 = interfaceC19134.mo26941().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        InterfaceC12783 interfaceC12784 = (InterfaceC12783) it3.next();
                                        Iterator it4 = interfaceC12784.mo31746().iterator();
                                        int i11 = i10;
                                        while (true) {
                                            if (it4.hasNext()) {
                                                InterfaceC3609 interfaceC3609 = (InterfaceC3609) it4.next();
                                                if (hashSet6.add(Integer.valueOf(interfaceC3609.mo10691()))) {
                                                    int i12 = i11 + 1;
                                                    if (i11 >= i9) {
                                                        C5063 c5066 = new C5063(arrayList, Math.max(0, i11 == i9 ? i2 : 0), i3);
                                                        C0829 c0829 = new C0829(c18738M50299, interfaceC12784, interfaceC3609);
                                                        int iMo10691 = interfaceC3609.mo10691();
                                                        Iterator it5 = c16622.m39083(interfaceC19134).iterator();
                                                        String str3 = str2;
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                InterfaceC12783 interfaceC12785 = (InterfaceC12783) it5.next();
                                                                if (interfaceC12785.mo31756(iMo10691)) {
                                                                    i6 = i11;
                                                                    InterfaceC3609 interfaceC3609Mo31753 = interfaceC12785.mo31753(iMo10691);
                                                                    if (interfaceC3609Mo31753 != null) {
                                                                        InterfaceC3609 interfaceC3609M50305 = m50305(c18738M50299, interfaceC12785, interfaceC3609Mo31753);
                                                                        int parent = interfaceC3609M50305.getParent();
                                                                        if (parent != 0 && parent == iM50300 && c5066.m14110(c0829, interfaceC12785, str3)) {
                                                                            c5065 = c5066;
                                                                        } else {
                                                                            boolean z2 = interfaceC3609M50305.mo7647() > 0 && !m50270(interfaceC3609M50305);
                                                                            Iterator it6 = interfaceC3609M50305.values().iterator();
                                                                            String str4 = str3;
                                                                            while (true) {
                                                                                if (it6.hasNext()) {
                                                                                    InterfaceC9961 interfaceC9961 = (InterfaceC9961) it6.next();
                                                                                    if (iM50300 == 0 || !z2) {
                                                                                        i8 = iMo10691;
                                                                                    } else {
                                                                                        int iMo25193 = interfaceC9961.mo25193();
                                                                                        if (iMo25193 == -1) {
                                                                                            i8 = iMo10691;
                                                                                        } else {
                                                                                            i8 = iMo10691;
                                                                                            if (!"style".equals(C21291.m47740(interfaceC12785.getType().getTypeName()))) {
                                                                                            }
                                                                                            if (iMo25193 == iM50300) {
                                                                                                c5064 = c5066;
                                                                                                if (c5066.m14111(c22577, c0829, interfaceC12785, interfaceC9961, str4, hashSet)) {
                                                                                                }
                                                                                                c5065 = c5064;
                                                                                            }
                                                                                            if (iM50300 == 0 && m50272(interfaceC9961) == iM50300) {
                                                                                                if (c5064.m14112(c22577, c0829, interfaceC12785, interfaceC9961, z2, str, hashSet)) {
                                                                                                    c5065 = c5064;
                                                                                                }
                                                                                            }
                                                                                            c5066 = c5064;
                                                                                            interfaceC19134 = interfaceC19134;
                                                                                            hashSet5 = hashSet5;
                                                                                            iMo10691 = i8;
                                                                                            interfaceC12784 = interfaceC12784;
                                                                                            hashSet6 = hashSet6;
                                                                                            str4 = str;
                                                                                        }
                                                                                        iMo25193 = 0;
                                                                                        if (iMo25193 == iM50300) {
                                                                                            c5064 = c5066;
                                                                                            if (c5066.m14111(c22577, c0829, interfaceC12785, interfaceC9961, str4, hashSet)) {
                                                                                            }
                                                                                            c5065 = c5064;
                                                                                        }
                                                                                        if (iM50300 == 0) {
                                                                                        }
                                                                                        c5066 = c5064;
                                                                                        interfaceC19134 = interfaceC19134;
                                                                                        hashSet5 = hashSet5;
                                                                                        iMo10691 = i8;
                                                                                        interfaceC12784 = interfaceC12784;
                                                                                        hashSet6 = hashSet6;
                                                                                        str4 = str;
                                                                                    }
                                                                                    c5064 = c5066;
                                                                                    if (iM50300 == 0) {
                                                                                    }
                                                                                    c5066 = c5064;
                                                                                    interfaceC19134 = interfaceC19134;
                                                                                    hashSet5 = hashSet5;
                                                                                    iMo10691 = i8;
                                                                                    interfaceC12784 = interfaceC12784;
                                                                                    hashSet6 = hashSet6;
                                                                                    str4 = str;
                                                                                } else {
                                                                                    i7 = iMo10691;
                                                                                    c5063 = c5066;
                                                                                    interfaceC12783 = interfaceC12784;
                                                                                    hashSet2 = hashSet6;
                                                                                    interfaceC19133 = interfaceC19134;
                                                                                    hashSet3 = hashSet5;
                                                                                    str3 = str;
                                                                                }
                                                                            }
                                                                        }
                                                                        i5 = c5065.f17666;
                                                                        z = true;
                                                                        i10 = i12;
                                                                        i4 = i6;
                                                                    }
                                                                    c5066 = c5063;
                                                                    i11 = i6;
                                                                    c18738M50299 = c18738M50299;
                                                                    interfaceC19134 = interfaceC19133;
                                                                    hashSet5 = hashSet3;
                                                                    iMo10691 = i7;
                                                                    interfaceC12784 = interfaceC12783;
                                                                    hashSet6 = hashSet2;
                                                                } else {
                                                                    i6 = i11;
                                                                }
                                                                i7 = iMo10691;
                                                                c5063 = c5066;
                                                                interfaceC12783 = interfaceC12784;
                                                                hashSet2 = hashSet6;
                                                                interfaceC19133 = interfaceC19134;
                                                                hashSet3 = hashSet5;
                                                                c5066 = c5063;
                                                                i11 = i6;
                                                                c18738M50299 = c18738M50299;
                                                                interfaceC19134 = interfaceC19133;
                                                                hashSet5 = hashSet3;
                                                                iMo10691 = i7;
                                                                interfaceC12784 = interfaceC12783;
                                                                hashSet6 = hashSet2;
                                                            }
                                                        }
                                                    }
                                                    str2 = str;
                                                    i9 = i;
                                                    i11 = i12;
                                                    c18738M50299 = c18738M50299;
                                                    interfaceC19134 = interfaceC19134;
                                                    hashSet5 = hashSet5;
                                                    interfaceC12784 = interfaceC12784;
                                                    hashSet6 = hashSet6;
                                                }
                                            } else {
                                                str2 = str;
                                                i9 = i;
                                                i10 = i11;
                                            }
                                        }
                                    } else {
                                        str2 = str;
                                        i9 = i;
                                    }
                                }
                            }
                        } else {
                            str2 = str;
                            i9 = i;
                        }
                    }
                }
            } else {
                i4 = 0;
                i5 = 0;
                z = false;
            }
            if (z) {
                i10 = i4;
            }
            if (!z) {
                i5 = 0;
            }
            return new C12825(i10, i5, arrayList, z);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6037 m50313() {
        C6037 c6037;
        C6037 c6038;
        SoftReference softReference = this.f73944;
        if (softReference != null && (c6038 = (C6037) softReference.get()) != null) {
            return c6038;
        }
        synchronized (this.f73947) {
            SoftReference softReference2 = this.f73944;
            if (softReference2 != null && (c6037 = (C6037) softReference2.get()) != null) {
                return c6037;
            }
            C22577 c22577 = m50299().f60792;
            C6037 c6039 = new C6037(c22577.m50079(), c22577.m50082());
            this.f73944 = new SoftReference(c6039);
            return c6039;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C20150 m50318() {
        return new C20150(m50299());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20150 m50315(ArrayList arrayList) {
        C18738 c18738M50299 = m50299();
        return new C20150(new C18738(new C22577(new C7180(c18738M50299.f60792.m50079(), arrayList)), c18738M50299.f60791, c18738M50299.f60790));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private C18738 m50299() {
        C18738 c18738;
        C18738 c18739;
        SoftReference softReference = this.f73946;
        if (softReference != null && (c18739 = (C18738) softReference.get()) != null) {
            return c18739;
        }
        synchronized (this.f73947) {
            SoftReference softReference2 = this.f73946;
            if (softReference2 != null && (c18738 = (C18738) softReference2.get()) != null) {
                return c18738;
            }
            C1493 c1493M20809 = this.f73945.m20809();
            AbstractC22702 c7180 = this.f73943.isEmpty() ? c1493M20809 : new C7180(c1493M20809, this.f73943);
            C18738 c187310 = new C18738(new C22577(c7180), m50279(c7180), c1493M20809);
            this.f73946 = new SoftReference(c187310);
            return c187310;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C14942 m50317() {
        return C9298.m23850(m50299().f60792);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private HashMap m50279(AbstractC22702 abstractC22702) throws C12731 {
        HashMap map = new HashMap();
        for (C17763 c17763 : this.f73943) {
            boolean zM41330 = c17763.m41330();
            String str = c17763.f56348;
            int i = c17763.f56352;
            if (!zM41330) {
                InterfaceC12783 interfaceC12783M50306 = m50306(abstractC22702, i, str);
                if (interfaceC12783M50306 != null) {
                    int i2 = 65535 & i;
                    if (interfaceC12783M50306.mo31756(i2)) {
                        map.put(m50301(i, str), C1098.m4100(interfaceC12783M50306, i2, c17763.f56349));
                    }
                }
                throw C12731.m31630("RESOURCE_PATCH_CORRUPT", "Resource patch target is missing from base resources.arsc.");
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50292(C18738 c18738, int i, InterfaceC12389 interfaceC12389) {
        InterfaceC19133 interfaceC19133M50288;
        InterfaceC3609 interfaceC3609Mo31753;
        InterfaceC17721 interfaceC17721M50287 = m50287((i >>> 24) & 255, c18738.f60792.m50079());
        if (interfaceC17721M50287 == null || (interfaceC19133M50288 = m50288(interfaceC17721M50287, (i >>> 16) & 255)) == null) {
            return;
        }
        int i2 = i & 65535;
        for (InterfaceC12783 interfaceC12783 : interfaceC19133M50288.mo26941()) {
            if (interfaceC12783.mo31756(i2) && (interfaceC3609Mo31753 = interfaceC12783.mo31753(i2)) != null) {
                interfaceC12389.mo11368(interfaceC12783, m50305(c18738, interfaceC12783, interfaceC3609Mo31753));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50293(C18738 c18738, InterfaceC10978 interfaceC10978) {
        InterfaceC6432 interfaceC6432M50079 = c18738.f60792.m50079();
        HashSet hashSet = new HashSet();
        for (InterfaceC17721 interfaceC17721 : interfaceC6432M50079.mo17615()) {
            if (hashSet.add(Integer.valueOf(interfaceC17721.mo19106()))) {
                HashSet hashSet2 = new HashSet();
                for (InterfaceC19133 interfaceC19133 : interfaceC17721.mo19112()) {
                    if (hashSet2.add(Integer.valueOf(interfaceC19133.mo26942()))) {
                        HashSet hashSet3 = new HashSet();
                        for (InterfaceC12783 interfaceC12783 : interfaceC19133.mo26941()) {
                            for (InterfaceC3609 interfaceC3609 : interfaceC12783.mo31746()) {
                                if (hashSet3.add(Integer.valueOf(interfaceC3609.mo10691())) && interfaceC10978.mo27729(m50298(m50305(c18738, interfaceC12783, interfaceC3609)))) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C17327 m50298(InterfaceC3609 interfaceC3609) {
        int iMo10693 = interfaceC3609.mo10693();
        InterfaceC17721 interfaceC17721Mo10692 = interfaceC3609.mo10692();
        InterfaceC19133 type = interfaceC3609.getType();
        interfaceC17721Mo10692.getClass();
        int iMo19106 = interfaceC17721Mo10692.mo19106();
        return new C17327(type.getTypeName(), iMo10693, iMo19106, type.mo26942(), interfaceC3609.mo10691(), interfaceC3609.mo7645());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50294(C18738 c18738, C17327 c17327, InterfaceC6038 interfaceC6038, C16622 c16622) {
        InterfaceC19133 interfaceC19133M50288;
        InterfaceC3609 interfaceC3609Mo31753;
        InterfaceC6432 interfaceC6432M50079 = c18738.f60792.m50079();
        int i = c17327.f55130;
        int i2 = c17327.f55128;
        InterfaceC17721 interfaceC17721M50287 = m50287(i, interfaceC6432M50079);
        if (interfaceC17721M50287 == null || (interfaceC19133M50288 = m50288(interfaceC17721M50287, c17327.f55125)) == null) {
            return;
        }
        for (InterfaceC12783 interfaceC12783 : c16622 == null ? m50277((Iterable) interfaceC19133M50288.mo26941()) : c16622.m39083(interfaceC19133M50288)) {
            if (interfaceC12783.mo31756(i2) && (interfaceC3609Mo31753 = interfaceC12783.mo31753(i2)) != null && interfaceC6038.mo16377(interfaceC12783, m50305(c18738, interfaceC12783, interfaceC3609Mo31753))) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m50277(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add((InterfaceC12783) it.next());
        }
        C23846.sort(arrayList, new C21560());
        return arrayList;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InterfaceC3609 m50305(C18738 c18738, InterfaceC12783 interfaceC12783, InterfaceC3609 interfaceC3609) {
        InterfaceC3609 interfaceC36010;
        return (c18738.f60791.isEmpty() || (interfaceC36010 = (InterfaceC3609) c18738.f60791.get(m50301(interfaceC3609.mo10693(), C21291.m47741(interfaceC12783)))) == null) ? interfaceC3609 : interfaceC36010;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m50301(int i, String str) {
        return m50274(i) + '\n' + str;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InterfaceC12783 m50306(InterfaceC6432 interfaceC6432, int i, String str) {
        InterfaceC19133 interfaceC19133M50288;
        InterfaceC17721 interfaceC17721M50287 = m50287((i >>> 24) & 255, interfaceC6432);
        if (interfaceC17721M50287 == null || (interfaceC19133M50288 = m50288(interfaceC17721M50287, (i >>> 16) & 255)) == null) {
            return null;
        }
        int i2 = i & 65535;
        for (InterfaceC12783 interfaceC12783 : interfaceC19133M50288.mo26941()) {
            if (C21291.m47741(interfaceC12783).equals(str) && interfaceC12783.mo31756(i2)) {
                return interfaceC12783;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m50271(String str, String str2) {
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
    public static InterfaceC17721 m50287(int i, InterfaceC6432 interfaceC6432) {
        for (InterfaceC17721 interfaceC17721 : interfaceC6432.mo17615()) {
            if (interfaceC17721.mo19106() == i) {
                return interfaceC17721;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC19133 m50288(InterfaceC17721 interfaceC17721, int i) {
        for (InterfaceC19133 interfaceC19133 : interfaceC17721.mo19112()) {
            if (interfaceC19133.mo26942() == i) {
                return interfaceC19133;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m50274(int i) {
        char[] cArr = new char[10];
        cArr[0] = '0';
        cArr[1] = 'x';
        for (int i2 = 0; i2 < 8; i2++) {
            cArr[i2 + 2] = f73942[(i >>> (28 - (i2 * 4))) & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m50304(String str, String str2) {
        return m50274(m50300(str, str2));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m50300(String str, String str2) throws C12731 {
        long jM50273 = m50273(str);
        if (jM50273 < 0) {
            throw C12731.m31626(C0252.m1693("Invalid ", str2), str2, str == null ? null : JSON.value(str), JSON.array("0x00000000..0xffffffff"), JSON.object().add(str2, "0x7f010000"));
        }
        return (int) jM50273;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m50273(String str) {
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

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m50295(int i, String str) {
        char c;
        if (str.length() <= 10) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (i2 == 0) {
                    c = '0';
                } else if (i2 == 1) {
                    c = 'x';
                } else {
                    c = f73942[(i >>> (28 - ((i2 - 2) * 4))) & 15];
                }
                char cCharAt = str.charAt(i2);
                if (cCharAt == c || cCharAt == Character.toUpperCase(c)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m50270(InterfaceC3609 interfaceC3609) {
        return interfaceC3609.mo7647() == 1 && interfaceC3609.getValue(0).mo25193() == -1;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m50302(InterfaceC3609 interfaceC3609) {
        return (interfaceC3609.mo7647() <= 0 || m50270(interfaceC3609)) ? "single_value" : "item_list";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13531 m50286(C18738 c18738, InterfaceC12783 interfaceC12783, InterfaceC3609 interfaceC3609, int i, int i2, int i3, int i4, Set set, HashMap map) {
        C22577 c22577 = c18738.f60792;
        String strM47741 = C21291.m47741(interfaceC12783);
        int iMo7647 = interfaceC3609.mo7647();
        if (iMo7647 != 0) {
            C0124 c0124M23848 = i2 >= 0 ? C9298.m23848(c22577, interfaceC3609, i2) : null;
            if (m50270(interfaceC3609)) {
                return m50284(c18738, interfaceC3609.getValue(0), null, null, strM47741, i, i4, set, map, c0124M23848);
            }
            ArrayList arrayList = new ArrayList();
            int i5 = 0;
            for (InterfaceC9961 interfaceC9961 : interfaceC3609.values()) {
                if (i5 < i3) {
                    C19444 c19444M50308 = m50308(c22577, interfaceC12783, interfaceC9961.mo25193());
                    arrayList.add(m50284(c18738, interfaceC9961, c19444M50308.f62608, c19444M50308.f62609, strM47741, i, i4, set, map, null));
                }
                i5++;
            }
            return new C13531(null, null, strM47741, "item_list", false, false, null, null, null, null, null, arrayList, iMo7647 > i3, iMo7647, c0124M23848);
        }
        return new C13531(null, null, strM47741, "null_value", false, false, null, null, null, null, null, new ArrayList(), false, 0, i2 >= 0 ? C9298.m23848(c22577, interfaceC3609, i2) : null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13531 m50284(C18738 c18738, InterfaceC9961 interfaceC9961, String str, String str2, String str3, int i, int i2, Set set, HashMap map, C0124 c0124) {
        String str4;
        C9567 c9567;
        String str5;
        C9567 c9567M37868;
        C8155 c8155M50282 = m50282(c18738.f60792, interfaceC9961, i);
        String str6 = c8155M50282.f28505;
        String strM50276 = m50276(interfaceC9961, c8155M50282, set);
        if ("null_value".equals(strM50276)) {
            return new C13531(str, str2, str3, strM50276, false, false, null, null, null, null, null, new ArrayList(), false, 0, c0124);
        }
        if ("unparsed".equals(strM50276)) {
            return new C13531(str, str2, str3, strM50276, false, false, (str6 == null || str6.isEmpty()) ? null : C7521.m20035(0, str6.length(), 300, str6), null, null, null, null, new ArrayList(), false, 0, c0124);
        }
        String str7 = c8155M50282.f28504;
        int iM50272 = m50272(interfaceC9961);
        String strM50274 = iM50272 == 0 ? null : m50274(iM50272);
        String str8 = "file_path".equals(strM50276) ? c8155M50282.f28508 : null;
        if (i2 != 1 || iM50272 == 0) {
            str4 = strM50274;
            c9567 = null;
        } else {
            String strM50275 = m50274(iM50272);
            String strM5594 = C1679.m5594(str3, "\n", strM50275);
            if (map == null || !map.containsKey(strM5594)) {
                try {
                    str4 = strM50274;
                    str5 = strM5594;
                    try {
                        final C15917 c15917 = new C15917(c18738, iM50272, strM50275, str3, set);
                        m50292(c18738, iM50272, new InterfaceC12389() { // from class: l.ᩳۨ۬
                            @Override // l.InterfaceC12389
                            /* JADX INFO: renamed from: ۙ */
                            public final void mo11368(InterfaceC12783 interfaceC12783, InterfaceC3609 interfaceC3609) {
                                int iMo10693 = interfaceC3609.mo10693();
                                C15917 c15918 = c15917;
                                if (iMo10693 != c15918.f51583) {
                                    return;
                                }
                                if (c15918.f51578 == null) {
                                    c15918.f51578 = C22703.m50298(interfaceC3609);
                                }
                                C13531 c13531M50286 = C22703.m50286(c15918.f51580, interfaceC12783, interfaceC3609, 300, -1, 0, 0, c15918.f51579, null);
                                String strM47741 = C21291.m47741(interfaceC12783);
                                if (c15918.f51585.equals(strM47741)) {
                                    c15918.f51581 = c13531M50286;
                                } else if ("default".equals(strM47741)) {
                                    c15918.f51584 = c13531M50286;
                                }
                                C13531 c13531 = c15918.f51582;
                                if (c13531 == null || C22703.m50271(strM47741, c13531.f44678) < 0) {
                                    c15918.f51582 = c13531M50286;
                                }
                            }
                        });
                        c9567M37868 = c15917.m37868();
                    } catch (Exception unused) {
                        c9567M37868 = null;
                    }
                } catch (Exception unused2) {
                    str4 = strM50274;
                    str5 = strM5594;
                }
                if (map != null) {
                    map.put(str5, c9567M37868);
                }
                c9567 = c9567M37868;
            } else {
                c9567 = (C9567) map.get(strM5594);
                str4 = strM50274;
            }
        }
        return new C13531(str, str2, str3, strM50276, "styled_text".equals(strM50276), c8155M50282.f28506, str7, c0124 == null ? null : c0124.f1109, str8, str4, c9567, new ArrayList(), false, 0, c0124);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m50276(InterfaceC9961 interfaceC9961, C8155 c8155, Set set) {
        if (c8155.f28505 != null) {
            return "unparsed";
        }
        int iMo25192 = interfaceC9961.mo25192();
        if (iMo25192 == 0) {
            return "null_value";
        }
        if (iMo25192 == 3) {
            if (c8155.f28507) {
                return "styled_text";
            }
            String str = c8155.f28508;
            return (str == null || !set.contains(str)) ? TextBundle.TEXT_ENTRY : "file_path";
        }
        if (iMo25192 == 1 || iMo25192 == 7) {
            return Name.REFER;
        }
        if (iMo25192 == 2 || iMo25192 == 8) {
            return AnnotationHandler.ATTRIBUTE;
        }
        if (iMo25192 == 18) {
            return ClassTransform.BOOLEAN;
        }
        if (iMo25192 >= 28 && iMo25192 <= 31) {
            return ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR;
        }
        if (iMo25192 == 5) {
            return "dimension";
        }
        if (iMo25192 == 6) {
            return "fraction";
        }
        return (iMo25192 == 4 || iMo25192 == 16 || iMo25192 == 17) ? "number" : "unparsed";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8155 m50282(C22577 c22577, InterfaceC9961 interfaceC9961, int i) {
        CharSequence charSequenceM18900;
        boolean zMo11445;
        try {
            if (interfaceC9961.mo25192() == 3 && interfaceC9961.mo25187() != null) {
                InterfaceC12078 interfaceC12078Mo25187 = interfaceC9961.mo25187();
                charSequenceM18900 = interfaceC12078Mo25187.getValue();
                zMo11445 = interfaceC12078Mo25187.mo11445();
            } else {
                charSequenceM18900 = C7054.m18900(c22577, interfaceC9961);
                if (charSequenceM18900 instanceof InterfaceC12078) {
                    InterfaceC12078 interfaceC12078 = (InterfaceC12078) charSequenceM18900;
                    String value = interfaceC12078.getValue();
                    zMo11445 = interfaceC12078.mo11445();
                    charSequenceM18900 = value;
                } else {
                    zMo11445 = false;
                }
            }
            String strM20038 = C7521.m20038(charSequenceM18900.toString());
            if (i > 0) {
                String strM20036 = C7521.m20036(0, i, (CharSequence) strM20038);
                return new C8155(strM20036, null, strM20038, strM20036.codePointCount(0, strM20036.length()) < strM20038.codePointCount(0, strM20038.length()), zMo11445);
            }
            return new C8155(strM20038, null, strM20038, false, zMo11445);
        } catch (Exception e) {
            return new C8155("", e.getMessage() == null ? "Failed to format resource value" : e.getMessage(), null, false, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m50272(InterfaceC9961 interfaceC9961) {
        int iMo25192 = interfaceC9961.mo25192();
        if (interfaceC9961.getValue() == 0) {
            return 0;
        }
        if (iMo25192 == 1 || iMo25192 == 7 || iMo25192 == 2 || iMo25192 == 8) {
            return interfaceC9961.getValue();
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
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C19444 m50308(C22577 c22577, InterfaceC12783 interfaceC12783, int i) {
        C11413 c11413M14108;
        String strMo39837;
        String strM50274 = null;
        if (i == -1) {
            return new C19444(null, 0);
        }
        int i2 = (i != -1 && "style".equals(C21291.m47740(interfaceC12783.getType().getTypeName()))) ? i : 0;
        String strM47740 = C21291.m47740(interfaceC12783.getType().getTypeName());
        if ("plurals".equals(strM47740)) {
            int i3 = i - 16777220;
            if (i3 >= 0 && i3 < 6) {
                strM50274 = InterfaceC9961.f34034[i3];
            } else {
                strMo39837 = c22577.mo39837(interfaceC12783.mo31754().mo19106(), i);
                if (strMo39837.length() != 8) {
                    strM50274 = strMo39837;
                    break;
                }
                for (int i4 = 0; i4 < 8; i4++) {
                    if (strMo39837.charAt(i4) != f73942[(i >>> (28 - (i4 * 4))) & 15]) {
                        strM50274 = strMo39837;
                        break;
                    }
                }
            }
        } else if ("style".equals(strM47740) && (c11413M14108 = c22577.m50082().m14108(i)) != null) {
            strM50274 = c22577.m50078(interfaceC12783.mo31754().mo19106(), (c11413M14108.f38428 >>> 24) & 255) + c11413M14108.f38431;
        } else {
            strMo39837 = c22577.mo39837(interfaceC12783.mo31754().mo19106(), i);
            if (strMo39837.length() != 8) {
                strM50274 = strMo39837;
                break;
            }
            while (i4 < 8) {
                if (strMo39837.charAt(i4) != f73942[(i >>> (28 - (i4 * 4))) & 15]) {
                    strM50274 = strMo39837;
                    break;
                }
            }
        }
        if (strM50274 == null) {
            strM50274 = m50274(i);
        }
        return new C19444(strM50274, i2);
    }
}
