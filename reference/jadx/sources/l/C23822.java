package l;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩹᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 46D8 */
/* JADX INFO: loaded from: classes.dex */
public final class C23822 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m53157(C2551 c2551, C0599 c0599, List list) {
        C21943 c21943M2702 = c0599.m2702();
        C0599 c05910 = (C0599) C6823.m19007(list, (Predicate) new C10316(1, c21943M2702.m49642()));
        if (c05910 != null && C6823.m19004(c21943M2702.m49646(), c05910.m2702())) {
            C21943 c21943M2704 = c0599.m2704();
            C21943 c21943M2703 = c05910.m2702();
            C21943 c21943M56578 = C25314.m56578(c2551, c21943M2704, c21943M2702);
            C25314.m56588(c21943M2702, c21943M56578);
            C25314.m56583(c21943M56578, c21943M2702, c21943M2703);
            c2551.m31133("Duplicate block (" + c21943M2702 + ") to fix multi-entry loop: " + c0599);
            return true;
        }
        C21943 c21943M2705 = c0599.m2704();
        C0599 c05911 = (C0599) C6823.m19007(list, (Predicate) new C17854(0, c21943M2705));
        if (c05911 == null) {
            c2551.m31138("Unsupported multi-entry loop pattern (" + c0599 + "). Please report as a decompilation issue!!!");
            return false;
        }
        C21943 c21943M2706 = c05911.m2704();
        C25314.m56588(c21943M2705, C25314.m56578(c2551, c21943M2706, c0599.m2702()));
        C25314.m56586(c21943M2706, c21943M2705);
        c2551.m31133("Duplicate block (" + c21943M2705 + ") to fix multi-entry loop: " + c0599);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m53156(C2551 c2551) {
        try {
            EnumC16362[] enumC16362Arr = new EnumC16362[c2551.m8508().size()];
            Arrays.fill(enumC16362Arr, EnumC16362.WHITE);
            m53155(c2551, enumC16362Arr, c2551.m8535());
            List listMo17861 = c2551.mo17861(C11457.f36031);
            List list = (List) C1170.stream(listMo17861).filter(new C14740(1)).collect(C2025.toList());
            if (list.isEmpty()) {
                return false;
            }
            try {
                List listM19008 = C6823.m19008((Collection) listMo17861, (Predicate) new C5339(2));
                Iterator it = list.iterator();
                boolean zM53157 = false;
                while (it.hasNext()) {
                    zM53157 |= m53157(c2551, (C0599) it.next(), listM19008);
                }
                return zM53157;
            } catch (Exception e) {
                c2551.m31134("Failed to fix multi-entry loops", e);
                return false;
            }
        } catch (Exception e2) {
            c2551.m31134("Failed to detect multi-entry loops", e2);
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m53155(C2551 c2551, EnumC16362[] enumC16362Arr, C21943 c21943) {
        enumC16362Arr[c21943.getId()] = EnumC16362.GRAY;
        for (C21943 c21944 : c21943.m49646()) {
            int iOrdinal = enumC16362Arr[c21944.getId()].ordinal();
            if (iOrdinal != 0) {
                C11457 c11457 = C11457.f36031;
                if (iOrdinal == 1) {
                    c2551.mo17863(c11457, new C0599(EnumC18498.BACK_EDGE, c21943, c21944));
                } else if (iOrdinal == 2) {
                    c2551.mo17863(c11457, new C0599(EnumC18498.CROSS_EDGE, c21943, c21944));
                }
            } else {
                m53155(c2551, enumC16362Arr, c21944);
            }
        }
        enumC16362Arr[c21943.getId()] = EnumC16362.BLACK;
    }
}
