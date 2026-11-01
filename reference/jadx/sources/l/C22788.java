package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺ۚܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: WAJD */
/* JADX INFO: loaded from: classes.dex */
public final class C22788 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1661 m50449(C19883 c19883, C15027 c15027) {
        C23535 c23535M25231;
        C6143 c6143M45140 = c19883.m45140();
        C9300 c9300M45137 = c19883.m45137();
        C1661 c1661M50448 = m50448(c9300M45137);
        C12453 c12453 = (C12453) c9300M45137.m23873("EnclosingMethod");
        C23535 c23535M25232 = null;
        if (c12453 == null) {
            c23535M25231 = null;
        } else {
            C6143 c6143M30930 = c12453.m30930();
            C0498 c0498M30929 = c12453.m30929();
            if (c0498M30929 == null) {
                c23535M25231 = C9964.m25227(c6143M30930);
            } else {
                c23535M25231 = C9964.m25231(new C20255(c6143M30930, c0498M30929));
            }
        }
        try {
            C1661 c1661M50447 = m50447(c6143M45140, c9300M45137, c23535M25231 == null);
            if (c1661M50447 != null) {
                C1661 c1661 = new C1661();
                c1661.m5565(c1661M50448);
                c1661.m5565(c1661M50447);
                c1661.mo9637();
                c1661M50448 = c1661;
            }
        } catch (C10481 e) {
            c15027.f48995.println("warning: " + e.getMessage());
        }
        if (c23535M25231 != null) {
            c1661M50448 = C1661.m5564(c1661M50448, c23535M25231);
        }
        if ((c19883.m45131() & 8192) == 0) {
            return c1661M50448;
        }
        C6143 c6143M45141 = c19883.m45140();
        C2325 c2325M45134 = c19883.m45134();
        int size = c2325M45134.size();
        C23535 c23535 = new C23535(c6143M45141, EnumC14363.EMBEDDED);
        boolean z = false;
        for (int i = 0; i < size; i++) {
            InterfaceC14239 interfaceC14239M15273get = c2325M45134.m15273get(i);
            C20919 c20919 = (C20919) interfaceC14239M15273get.getAttributes().m23873("AnnotationDefault");
            if (c20919 != null) {
                c23535.m51860(new C3072(interfaceC14239M15273get.mo30825().getName(), c20919.m47029()));
                z = true;
            }
        }
        if (z) {
            c23535.mo9637();
            c23535M25232 = C9964.m25232(c23535);
        }
        return c23535M25232 != null ? C1661.m5564(c1661M50448, c23535M25232) : c1661M50448;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1661 m50448(C9300 c9300) {
        C1661 c1661M49435;
        C3279 c3279 = (C3279) c9300.m23873("RuntimeVisibleAnnotations");
        C1868 c1868 = (C1868) c9300.m23873("RuntimeInvisibleAnnotations");
        if (c3279 == null) {
            if (c1868 == null) {
                c1661M49435 = C1661.f6627;
            } else {
                c1661M49435 = c1868.m49435();
            }
        } else if (c1868 == null) {
            c1661M49435 = c3279.m49435();
        } else {
            C1661 c1661M49436 = c3279.m49435();
            C1661 c1661M49437 = c1868.m49435();
            C1661 c1661 = new C1661();
            c1661.m5565(c1661M49436);
            c1661.m5565(c1661M49437);
            c1661.mo9637();
            c1661M49435 = c1661;
        }
        C13802 c13802 = (C13802) c9300.m23873("Signature");
        C23535 c23535M25229 = c13802 == null ? null : C9964.m25229(c13802.m33550());
        C11685 c11685 = (C11685) c9300.m23873("SourceDebugExtension");
        C23535 c23535M25234 = c11685 != null ? C9964.m25234(c11685.m29180()) : null;
        if (c23535M25229 != null) {
            c1661M49435 = C1661.m5564(c1661M49435, c23535M25229);
        }
        return c23535M25234 != null ? C1661.m5564(c1661M49435, c23535M25234) : c1661M49435;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1661 m50447(C6143 c6143, C9300 c9300, boolean z) {
        C6102 c6102 = (C6102) c9300.m23873("InnerClasses");
        if (c6102 != null) {
            C22974 c22974M16597 = c6102.m16597();
            int size = c22974M16597.size();
            ArrayList arrayList = new ArrayList();
            C6745 c6745 = null;
            for (int i = 0; i < size; i++) {
                C6745 c6745M15265get = c22974M16597.m15265get(i);
                C6143 c6143M18240 = c6745M15265get.m18240();
                if (c6143M18240.equals(c6143)) {
                    c6745 = c6745M15265get;
                } else if (c6143.equals(c6745M15265get.m18237())) {
                    arrayList.add(c6143M18240.m17128());
                }
            }
            int size2 = arrayList.size();
            if (c6745 != null || size2 != 0) {
                C1661 c1661 = new C1661();
                if (c6745 != null) {
                    c1661.m5566(C9964.m25230(c6745.m18239(), c6745.m18238()));
                    if (z) {
                        if (c6745.m18237() == null) {
                            throw new C10481("Ignoring InnerClasses attribute for an anonymous inner class\n(" + c6143.mo2376() + ") that doesn't come with an\nassociated EnclosingMethod attribute. This class was probably produced by a\ncompiler that did not target the modern .class file format. The recommended\nsolution is to recompile the class from source, using an up-to-date compiler\nand without specifying any \"-target\" type options. The consequence of ignoring\nthis warning is that reflective operations on this class will incorrectly\nindicate that it is *not* an inner class.");
                        }
                        c1661.m5566(C9964.m25227(c6745.m18237()));
                    }
                }
                if (size2 != 0) {
                    C9672 c9672 = new C9672(size2);
                    for (int i2 = 0; i2 < size2; i2++) {
                        c9672.m15255(i2, (C3320) arrayList.get(i2));
                    }
                    c9672.mo9637();
                    c1661.m5566(C9964.m25228(c9672));
                }
                c1661.mo9637();
                return c1661;
            }
        }
        return null;
    }
}
