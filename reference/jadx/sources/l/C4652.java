package l;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۙ۫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 75V0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4652 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3365 f16444 = new C3365(null, true);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12844(C9116 c9116) {
        C2184 c2184;
        HashMap map = new HashMap();
        for (AbstractC4777 abstractC4777 : c9116.f31045) {
            if (abstractC4777.f16795 == EnumC2890.ASSIGN && abstractC4777.mo13244().f23823 == EnumC9947.LOCAL && abstractC4777.mo13245().f23823 == EnumC9947.NEW) {
                C2184 c2185 = (C2184) abstractC4777.mo13244();
                C9717 c9717 = new C9717();
                c9717.f32714 = c2185;
                map.put(c2185, c9717);
            }
        }
        if (map.size() > 0) {
            int iM47173 = C21005.m47173(c9116);
            C21005.m47168(c9116);
            C21005.m47170(c9116.f31045, new C1954(iM47173, map));
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                C9717 c9718 = (C9717) ((Map.Entry) it.next()).getValue();
                boolean z = !c9718.f32713;
                if (c9718.f32712 == null) {
                    z = false;
                }
                if (!z) {
                    it.remove();
                }
            }
            if (map.size() > 0) {
                HashSet hashSet = new HashSet();
                C2184[] c2184Arr = new C2184[iM47173];
                for (C2184 c2186 : c9116.f31044) {
                    c2184Arr[c2186.f7921] = c2186;
                }
                for (C9717 c9719 : map.values()) {
                    C3365[] c3365Arr = (C3365[]) c9719.f32712.f16794;
                    for (int i = 0; i < c3365Arr.length; i++) {
                        C3365 c3365 = c3365Arr[i];
                        if (c3365 != null && c3365.f12477 == c9719) {
                            hashSet.add(c2184Arr[i]);
                        }
                    }
                }
                Iterator it2 = c9116.f31045.iterator();
                while (it2.hasNext()) {
                    AbstractC4777 abstractC4778 = (AbstractC4777) it2.next();
                    if (abstractC4778.f16795 == EnumC2890.ASSIGN && abstractC4778.mo13244().f23823 == EnumC9947.LOCAL && hashSet.contains((C2184) abstractC4778.mo13244())) {
                        it2.remove();
                    }
                }
                for (C9717 c97110 : map.values()) {
                    AbstractC4777 abstractC4779 = c97110.f32712;
                    C2184 c2187 = c97110.f32714;
                    C3365[] c3365Arr2 = (C3365[]) abstractC4779.f16794;
                    for (int i2 = 0; i2 < c3365Arr2.length; i2++) {
                        C3365 c3366 = c3365Arr2[i2];
                        if (c3366 != null && c3366.f12477 == c97110 && (c2184 = c2184Arr[i2]) != c2187) {
                            c9116.f31045.m29520(c97110.f32712, C2660.m8188(c2184, c2187));
                        }
                    }
                    C13475 c13475M12843 = m12843(c97110.f32712);
                    AbstractC7124[] abstractC7124Arr = c13475M12843.f29544;
                    C3097 c3097 = c13475M12843.f44541;
                    c9116.f31045.m29523(c97110.f32712, C2660.m8188(c2187, C2058.m6555((AbstractC7124[]) Arrays.copyOfRange(abstractC7124Arr, 1, abstractC7124Arr.length), c3097.m9291(), c3097.m9294())));
                }
            }
            Iterator it3 = c9116.f31045.iterator();
            while (it3.hasNext()) {
                ((AbstractC4777) it3.next()).f16794 = null;
            }
        }
        Iterator it4 = c9116.f31045.iterator();
        while (it4.hasNext()) {
            AbstractC4777 abstractC47710 = (AbstractC4777) it4.next();
            C13475 c13475M12844 = m12843(abstractC47710);
            if (c13475M12844 != null) {
                C3097 c3098 = c13475M12844.f44541;
                if ("<init>".equals(c3098.m9295()) && "V".equals(c3098.m9296())) {
                    AbstractC7124[] abstractC7124Arr2 = c13475M12844.f29544;
                    AbstractC7124 abstractC7124 = abstractC7124Arr2[0];
                    if (abstractC7124.f23823 == EnumC9947.NEW) {
                        c9116.f31045.m29526(abstractC47710, new C13245(C2058.m6555((AbstractC7124[]) Arrays.copyOfRange(abstractC7124Arr2, 1, abstractC7124Arr2.length), c3098.m9291(), c3098.m9294())));
                        it4.remove();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13475 m12843(AbstractC4777 abstractC4777) {
        EnumC2890 enumC2890 = abstractC4777.f16795;
        if (enumC2890 == EnumC2890.ASSIGN) {
            if (abstractC4777.mo13245().f23823 == EnumC9947.INVOKE_SPECIAL) {
                return (C13475) abstractC4777.mo13245();
            }
            return null;
        }
        if (enumC2890 != EnumC2890.VOID_INVOKE) {
            return null;
        }
        AbstractC7124 abstractC7124Mo5126 = abstractC4777.mo5126();
        if (abstractC7124Mo5126 instanceof C13475) {
            return (C13475) abstractC7124Mo5126;
        }
        return null;
    }
}
