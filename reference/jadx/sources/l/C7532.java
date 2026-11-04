package l;

import com.umeng.analytics.pro.am;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۟֨ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: BIX0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7532 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m20599(List list) {
        if (list.size() >= 6) {
            C15580 c15580 = (C15580) list.get(0);
            if (c15580.m37317() == EnumC23040.ENCODED_METHOD_HANDLE) {
                InterfaceC8670 interfaceC8670 = (InterfaceC8670) c15580.m37318();
                if (interfaceC8670.getType() == EnumC22294.INVOKE_STATIC) {
                    InterfaceC13890 interfaceC13890Mo5148 = interfaceC8670.mo5148();
                    if (interfaceC13890Mo5148.mo33836().equals("Ljava/lang/invoke/LambdaMetafactory;")) {
                        String name = interfaceC13890Mo5148.getName();
                        if (name.equals("metafactory") || name.equals("altMetafactory")) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4065 m20598(C2551 c2551, InterfaceC7377 interfaceC7377, boolean z, List list) {
        AbstractC1566 type;
        InterfaceC8670 interfaceC8670 = (InterfaceC8670) ((C15580) list.get(4)).m37318();
        if (interfaceC8670.getType().m50355()) {
            throw new C8597("Not yet supported");
        }
        C1610 c1610Mo8527 = c2551.mo8527();
        C21965 c21965M49692 = C21965.m49692(c1610Mo8527, c2551.m8536().m55571(), "", (InterfaceC7179) ((C15580) list.get(2)).m37318());
        EnumC22294 type2 = interfaceC8670.getType();
        C4065 c4065 = new C4065(c21965M49692, interfaceC7377, EnumC0336.CUSTOM, false, z);
        c4065.m13124(type2);
        c4065.m13123(C21965.m49692(c1610Mo8527, C1345.m4955(c1610Mo8527, c21965M49692.m49698()), (String) ((C15580) list.get(1)).m37318(), (InterfaceC7179) ((C15580) list.get(3)).m37318()));
        C21965 c21965M49693 = C21965.m49693(c1610Mo8527, interfaceC8670.mo5148());
        EnumC0336 enumC0336M24075 = C9023.m24075(type2);
        int iM49705 = c21965M49693.m49705();
        boolean z2 = enumC0336M24075 != EnumC0336.STATIC;
        if (z2) {
            iM49705++;
        }
        C21219 c21219 = new C21219(c21965M49693, enumC0336M24075, iM49705);
        int iM44039 = c4065.m44039();
        for (int i = 0; i < iM44039; i++) {
            c21219.mo44014(c4065.mo44035(i).mo17528());
        }
        if (iM49705 > iM44039) {
            int i2 = z2 ? iM44039 - 1 : iM44039;
            List listM49702 = c21965M49693.m49702();
            while (iM44039 < iM49705) {
                if (i2 < 0) {
                    type = c21965M49693.m49700().getType();
                } else {
                    type = (AbstractC1566) listM49702.get(i2);
                    i2++;
                }
                c21219.mo44014((AbstractC16481) new C20211(type, C13645.m33382(iM44039, am.aE)));
                iM44039++;
            }
        }
        if (type2 == EnumC22294.INVOKE_CONSTRUCTOR) {
            c4065.m13122((AbstractC15251) new C6787(c2551, c21219, c21219.mo18926()));
        } else {
            c4065.m13122((AbstractC15251) c21219);
        }
        C2551 c2551M5668 = c1610Mo8527.m5668(c21965M49693);
        if (c2551M5668 != null) {
            c4065.m13130().mo17864((InterfaceC11851) c2551M5668);
            if (c2551M5668.mo8547().m26528() && c2551M5668.m8536().equals(c2551.m8536())) {
                c2551M5668.mo17866(EnumC1763.DONT_GENERATE);
                c4065.m13128();
            }
        }
        if (!c4065.m13129()) {
            c4065.m13125(C4123.m13226(((InterfaceC7179) ((C15580) list.get(5)).m37318()).mo11554(), new C3398(5)).equals(c21965M49693.m49702()));
        }
        Iterator it = c4065.m44026().iterator();
        while (it.hasNext()) {
            ((AbstractC16481) it.next()).mo17866(EnumC1763.DONT_INLINE);
        }
        return c4065;
    }
}
