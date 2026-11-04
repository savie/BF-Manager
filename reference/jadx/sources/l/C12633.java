package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۨ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H6GW */
/* JADX INFO: loaded from: classes4.dex */
public final class C12633 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m31400(C2551 c2551, C21943 c21943, C21943 c21944) {
        List listM49643 = c21944.m49643();
        if (listM49643.size() <= 1 || !C1170.stream(listM49643).allMatch(new C15025(3))) {
            return false;
        }
        ArrayList<C21943> arrayList = new ArrayList(listM49643);
        ArrayList arrayListM52148 = C23231.m52148(c2551, c21944, false);
        C18959 c18959 = (C18959) C6823.m19006(c21943.mo1986());
        if (c18959 != null && c18959.getType() == EnumC24203.JAVA_RET) {
            AbstractC16481 abstractC16481Mo44035 = c18959.mo44035(0);
            abstractC16481Mo44035.getClass();
            if (abstractC16481Mo44035 instanceof C6041) {
                int iM17532 = ((C6041) abstractC16481Mo44035).m17532();
                C18959 c18959M52186 = C23231.m52186(c21944);
                if (c18959M52186 != null && c18959M52186.getType() == EnumC24203.MOVE && c18959M52186.m44027().m17532() == iM17532) {
                    ((ArrayList) c21944.mo1986()).remove(0);
                }
            }
        }
        C4937.forEach(arrayList, new C3684(0));
        C21943 c21945 = null;
        for (C21943 c21946 : arrayList) {
            if (c21945 == null) {
                c21945 = c21946;
            } else {
                C21943 c21943M52166 = C23231.m52166(c21944, c21946.m49646());
                C25314.m56586(c21946, c21944);
                C25314.m56586(c21946, c21943M52166);
                ArrayList arrayListM56575 = C25314.m56575(c2551, arrayListM52148);
                C21943 c21947 = (C21943) arrayListM56575.get(arrayListM52148.indexOf(c21944));
                C21943 c21948 = (C21943) arrayListM56575.get(arrayListM52148.indexOf(c21943));
                C25314.m56582(c21946, c21947);
                C25314.m56582(c21948, c21943M52166);
            }
        }
        if (c21945 != null) {
            C21943 c21943M52167 = C23231.m52166(c21944, c21945.m49646());
            C25314.m56586(c21945, c21943M52167);
            C25314.m56582(c21943, c21943M52167);
        }
        return true;
    }
}
