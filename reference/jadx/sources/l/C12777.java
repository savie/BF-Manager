package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.۫֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z73J */
/* JADX INFO: loaded from: classes4.dex */
public final class C12777 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31666(C22737 c22737, Writer writer) {
        C5564 c5564 = new C5564();
        c5564.f19337 = false;
        c5564.f19334 = true;
        C13021.m32450(writer, c22737, c5564);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m31667(C22737 c22737) {
        C5564 c5564 = new C5564();
        c5564.f19337 = false;
        c5564.f19334 = true;
        C18459 c18459 = new C18459();
        C13021.m32450(new C0560(c18459), c22737, c5564);
        return c18459.toString();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m31668(C22737 c22737) {
        Iterator it;
        C21728 c21728;
        Iterator it2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it3 = c22737.getMethods().iterator();
        while (it3.hasNext()) {
            InterfaceC8631 interfaceC8631 = (InterfaceC8631) it3.next();
            String strM31664 = m31664(interfaceC8631);
            InterfaceC7140 interfaceC7140Mo13175 = interfaceC8631.mo13175();
            if (interfaceC7140Mo13175 == null) {
                c21728 = new C21728(0, 0, 0, 0, new ArrayList(), new ArrayList());
                it = it3;
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                for (InterfaceC23331 interfaceC23331 : interfaceC7140Mo13175.mo2840()) {
                    i++;
                    EnumC22631 enumC22631Mo30864 = interfaceC23331.mo30864();
                    InterfaceC6177 interfaceC6177 = interfaceC23331 instanceof InterfaceC6177 ? (InterfaceC6177) interfaceC23331 : null;
                    InterfaceC10824 reference = interfaceC6177 != null ? interfaceC6177.getReference() : null;
                    if (interfaceC6177 != null && enumC22631Mo30864.f73513 == 0 && (reference instanceof InterfaceC22759)) {
                        i2++;
                        String string = ((InterfaceC22759) reference).getString();
                        if (linkedHashSet.size() < 5 && string != null && !string.isEmpty() && string.codePointCount(0, string.length()) <= 80) {
                            int iCharCount = 0;
                            while (true) {
                                if (iCharCount >= string.length()) {
                                    it2 = it3;
                                    linkedHashSet.add(string);
                                    break;
                                }
                                int iCodePointAt = string.codePointAt(iCharCount);
                                it2 = it3;
                                if (iCodePointAt == 10 || iCodePointAt == 13 || Character.isISOControl(iCodePointAt)) {
                                    break;
                                }
                                iCharCount += Character.charCount(iCodePointAt);
                                it3 = it2;
                            }
                        } else {
                            it2 = it3;
                        }
                    } else {
                        it2 = it3;
                        if (interfaceC6177 != null && enumC22631Mo30864.f73513 == 2 && (reference instanceof InterfaceC8304)) {
                            InterfaceC8304 interfaceC8304 = (InterfaceC8304) reference;
                            if ("I".equals(interfaceC8304.getType())) {
                                String strMo4500 = interfaceC8304.mo4500();
                                if (strMo4500.contains("/R$") || strMo4500.startsWith("LR$")) {
                                    i3++;
                                }
                            }
                        }
                    }
                    if (interfaceC23331 instanceof InterfaceC18855) {
                        long jMo1545 = ((InterfaceC18855) interfaceC23331).mo1545();
                        if (jMo1545 >= 0 && jMo1545 <= 4294967295L) {
                            int i5 = (int) jMo1545;
                            int i6 = (i5 >>> 24) & 255;
                            int i7 = (i5 >>> 16) & 255;
                            if ((i6 == 127 || i6 == 1) && i7 != 0) {
                                i3++;
                            }
                        }
                    }
                    if (enumC22631Mo30864.f73509.startsWith("invoke-")) {
                        i4++;
                        if (reference instanceof InterfaceC4859) {
                            InterfaceC4859 interfaceC4859 = (InterfaceC4859) reference;
                            if (linkedHashSet2.size() < 5) {
                                linkedHashSet2.add(interfaceC4859.mo6804() + "->" + interfaceC4859.getName());
                            }
                        }
                    }
                    it3 = it2;
                }
                it = it3;
                c21728 = new C21728(i, i2, i3, i4, linkedHashSet, linkedHashSet2);
            }
            linkedHashMap.put(strM31664, c21728);
            it3 = it;
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m31665(C22737 c22737) {
        InterfaceC16791 interfaceC16791Mo8822;
        C6921 c6921;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (InterfaceC2665 interfaceC2665 : c22737.getFields()) {
            int iMo8823 = interfaceC2665.mo8823();
            if (EnumC2536.STATIC.m8459(iMo8823) && EnumC2536.FINAL.m8459(iMo8823) && (interfaceC16791Mo8822 = interfaceC2665.mo8822()) != null) {
                C18459 c18459 = new C18459();
                try {
                    AbstractC3589.m11645(new C2161(new C0560(c18459)), interfaceC16791Mo8822);
                    String string = c18459.toString();
                    boolean z = string.codePointCount(0, string.length()) > 240;
                    if (z) {
                        string = C1173.m4316(0, string.length(), 240, string);
                    }
                    c6921 = new C6921(string, z);
                } catch (IOException unused) {
                    c6921 = null;
                }
                if (c6921 != null) {
                    linkedHashMap.put(interfaceC2665.getName() + ":" + interfaceC2665.getType(), c6921);
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m31664(InterfaceC8631 interfaceC8631) {
        StringBuilder sb = new StringBuilder();
        Iterator it = interfaceC8631.getParameters().iterator();
        while (it.hasNext()) {
            sb.append(((InterfaceC13851) it.next()).getType());
        }
        return interfaceC8631.getName() + MotionUtils.EASING_TYPE_FORMAT_START + ((Object) sb) + MotionUtils.EASING_TYPE_FORMAT_END + interfaceC8631.mo6802();
    }
}
