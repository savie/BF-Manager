package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: WAJD */
/* JADX INFO: loaded from: classes4.dex */
public final class C17392 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14011 m40854(C18312 c18312, C15900 c15900) {
        C8791 c8791M12548;
        C1028 c1028M42710 = c18312.m42710();
        C13836 c13836M42712 = c18312.m42712();
        C14011 c14011M40853 = m40853(c13836M42712);
        C18796 c18796 = (C18796) c13836M42712.m33788("EnclosingMethod");
        C8791 c8791M12544 = null;
        if (c18796 == null) {
            c8791M12548 = null;
        } else {
            C1028 c1028M43589 = c18796.m43589();
            C0282 c0282M43588 = c18796.m43588();
            if (c0282M43588 == null) {
                c8791M12548 = C3902.m12543(c1028M43589);
            } else {
                c8791M12548 = C3902.m12548(new C18181(c1028M43589, c0282M43588));
            }
        }
        try {
            C14011 c14011M40852 = m40852(c1028M42710, c13836M42712, c8791M12548 == null);
            if (c14011M40852 != null) {
                C14011 c14011 = new C14011();
                c14011.m34104(c14011M40853);
                c14011.m34104(c14011M40852);
                c14011.mo15005();
                c14011M40853 = c14011;
            }
        } catch (C3814 e) {
            c15900.f51667.println("warning: " + e.getMessage());
        }
        if (c8791M12548 != null) {
            c14011M40853 = C14011.m34102(c14011M40853, c8791M12548);
        }
        if ((c18312.m42701() & 8192) == 0) {
            return c14011M40853;
        }
        C1028 c1028M42711 = c18312.m42710();
        C19630 c19630M42705 = c18312.m42705();
        int size = c19630M42705.size();
        C8791 c8791 = new C8791(c1028M42711, EnumC7300.EMBEDDED);
        boolean z = false;
        for (int i = 0; i < size; i++) {
            InterfaceC8616 interfaceC8616M31612get = c19630M42705.m31612get(i);
            C14320 c14320 = (C14320) interfaceC8616M31612get.getAttributes().m33788("AnnotationDefault");
            if (c14320 != null) {
                c8791.m23587(new C21692(interfaceC8616M31612get.mo8780().getName(), c14320.m34750()));
                z = true;
            }
        }
        if (z) {
            c8791.mo15005();
            c8791M12544 = C3902.m12544(c8791);
        }
        return c8791M12544 != null ? C14011.m34102(c14011M40853, c8791M12544) : c14011M40853;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14011 m40853(C13836 c13836) {
        C14011 c14011M32899;
        C5129 c5129 = (C5129) c13836.m33788("RuntimeVisibleAnnotations");
        C6863 c6863 = (C6863) c13836.m33788("RuntimeInvisibleAnnotations");
        if (c5129 == null) {
            if (c6863 == null) {
                c14011M32899 = C14011.f44380;
            } else {
                c14011M32899 = c6863.m32899();
            }
        } else if (c6863 == null) {
            c14011M32899 = c5129.m32899();
        } else {
            C14011 c14011M328910 = c5129.m32899();
            C14011 c14011M328911 = c6863.m32899();
            C14011 c14011 = new C14011();
            c14011.m34104(c14011M328910);
            c14011.m34104(c14011M328911);
            c14011.mo15005();
            c14011M32899 = c14011;
        }
        C11094 c11094 = (C11094) c13836.m33788("Signature");
        C8791 c8791M12545 = c11094 == null ? null : C3902.m12545(c11094.m28009());
        C23029 c23029 = (C23029) c13836.m33788("SourceDebugExtension");
        C8791 c8791M12550 = c23029 != null ? C3902.m12550(c23029.m51930()) : null;
        if (c8791M12545 != null) {
            c14011M32899 = C14011.m34102(c14011M32899, c8791M12545);
        }
        return c8791M12550 != null ? C14011.m34102(c14011M32899, c8791M12550) : c14011M32899;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14011 m40852(C1028 c1028, C13836 c13836, boolean z) {
        C0897 c0897 = (C0897) c13836.m33788("InnerClasses");
        if (c0897 != null) {
            C17061 c17061M3633 = c0897.m3633();
            int size = c17061M3633.size();
            ArrayList arrayList = new ArrayList();
            C25267 c25267 = null;
            for (int i = 0; i < size; i++) {
                C25267 c25267M31622get = c17061M3633.m31622get(i);
                C1028 c1028M56399 = c25267M31622get.m56399();
                if (c1028M56399.equals(c1028)) {
                    c25267 = c25267M31622get;
                } else if (c1028.equals(c25267M31622get.m56400())) {
                    arrayList.add(c1028M56399.m3933());
                }
            }
            int size2 = arrayList.size();
            if (c25267 != null || size2 != 0) {
                C14011 c14011 = new C14011();
                if (c25267 != null) {
                    c14011.m34103(C3902.m12546(c25267.m56398(), c25267.m56397()));
                    if (z) {
                        if (c25267.m56400() == null) {
                            throw new C3814("Ignoring InnerClasses attribute for an anonymous inner class\n(" + c1028.mo1843() + ") that doesn't come with an\nassociated EnclosingMethod attribute. This class was probably produced by a\ncompiler that did not target the modern .class file format. The recommended\nsolution is to recompile the class from source, using an up-to-date compiler\nand without specifying any \"-target\" type options. The consequence of ignoring\nthis warning is that reflective operations on this class will incorrectly\nindicate that it is *not* an inner class.");
                        }
                        c14011.m34103(C3902.m12543(c25267.m56400()));
                    }
                }
                if (size2 != 0) {
                    C13705 c13705 = new C13705(size2);
                    for (int i2 = 0; i2 < size2; i2++) {
                        c13705.m31599(i2, (C5085) arrayList.get(i2));
                    }
                    c13705.mo15005();
                    c14011.m34103(C3902.m12547(c13705));
                }
                c14011.mo15005();
                return c14011;
            }
        }
        return null;
    }
}
