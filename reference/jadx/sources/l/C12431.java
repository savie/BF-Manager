package l;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۨܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75V0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12431 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20636 f39969 = new C20636(null, true);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30909(C13791 c13791) {
        C4448 c4448;
        HashMap map = new HashMap();
        for (AbstractC12563 abstractC12563 : c13791.f43750) {
            if (abstractC12563.f40344 == EnumC20768.ASSIGN && abstractC12563.mo11730().f34921 == EnumC22260.LOCAL && abstractC12563.mo11728().f34921 == EnumC22260.NEW) {
                C4448 c4449 = (C4448) abstractC12563.mo11730();
                C3482 c3482 = new C3482();
                c3482.f12034 = c4449;
                map.put(c4449, c3482);
            }
        }
        if (map.size() > 0) {
            int iM51600 = C22874.m51600(c13791);
            C22874.m51595(c13791);
            C22874.m51597(c13791.f43750, new C23620(iM51600, map));
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                C3482 c3483 = (C3482) ((Map.Entry) it.next()).getValue();
                boolean z = !c3483.f12033;
                if (c3483.f12032 == null) {
                    z = false;
                }
                if (!z) {
                    it.remove();
                }
            }
            if (map.size() > 0) {
                HashSet hashSet = new HashSet();
                C4448[] c4448Arr = new C4448[iM51600];
                for (C4448 c44410 : c13791.f43751) {
                    c4448Arr[c44410.f15916] = c44410;
                }
                for (C3482 c3484 : map.values()) {
                    C20636[] c20636Arr = (C20636[]) c3484.f12032.f40353;
                    for (int i = 0; i < c20636Arr.length; i++) {
                        C20636 c20636 = c20636Arr[i];
                        if (c20636 != null && c20636.f66188 == c3484) {
                            hashSet.add(c4448Arr[i]);
                        }
                    }
                }
                Iterator it2 = c13791.f43750.iterator();
                while (it2.hasNext()) {
                    AbstractC12563 abstractC12564 = (AbstractC12563) it2.next();
                    if (abstractC12564.f40344 == EnumC20768.ASSIGN && abstractC12564.mo11730().f34921 == EnumC22260.LOCAL && hashSet.contains((C4448) abstractC12564.mo11730())) {
                        it2.remove();
                    }
                }
                for (C3482 c3485 : map.values()) {
                    AbstractC12563 abstractC12565 = c3485.f12032;
                    C4448 c44411 = c3485.f12034;
                    C20636[] c20636Arr2 = (C20636[]) abstractC12565.f40353;
                    for (int i2 = 0; i2 < c20636Arr2.length; i2++) {
                        C20636 c20637 = c20636Arr2[i2];
                        if (c20637 != null && c20637.f66188 == c3485 && (c4448 = c4448Arr[i2]) != c44411) {
                            c13791.f43750.m54759(c3485.f12032, C4360.m13864(c4448, c44411));
                        }
                    }
                    C6686 c6686M30908 = m30908(c3485.f12032);
                    AbstractC11071[] abstractC11071Arr = c6686M30908.f17809;
                    C3177 c3177 = c6686M30908.f22277;
                    c13791.f43750.m54762(c3485.f12032, C4360.m13864(c44411, C23840.m53164((AbstractC11071[]) Arrays.copyOfRange(abstractC11071Arr, 1, abstractC11071Arr.length), c3177.m10375(), c3177.m10371())));
                }
            }
            Iterator it3 = c13791.f43750.iterator();
            while (it3.hasNext()) {
                ((AbstractC12563) it3.next()).f40353 = null;
            }
        }
        Iterator it4 = c13791.f43750.iterator();
        while (it4.hasNext()) {
            AbstractC12563 abstractC12566 = (AbstractC12563) it4.next();
            C6686 c6686M30909 = m30908(abstractC12566);
            if (c6686M30909 != null) {
                C3177 c3178 = c6686M30909.f22277;
                if ("<init>".equals(c3178.m10374()) && "V".equals(c3178.m10372())) {
                    AbstractC11071[] abstractC11071Arr2 = c6686M30909.f17809;
                    AbstractC11071 abstractC11071 = abstractC11071Arr2[0];
                    if (abstractC11071.f34921 == EnumC22260.NEW) {
                        c13791.f43750.m54765(abstractC12566, new C0631(C23840.m53164((AbstractC11071[]) Arrays.copyOfRange(abstractC11071Arr2, 1, abstractC11071Arr2.length), c3178.m10375(), c3178.m10371())));
                        it4.remove();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6686 m30908(AbstractC12563 abstractC12563) {
        EnumC20768 enumC20768 = abstractC12563.f40344;
        if (enumC20768 == EnumC20768.ASSIGN) {
            if (abstractC12563.mo11728().f34921 == EnumC22260.INVOKE_SPECIAL) {
                return (C6686) abstractC12563.mo11728();
            }
            return null;
        }
        if (enumC20768 != EnumC20768.VOID_INVOKE) {
            return null;
        }
        AbstractC11071 abstractC11071Mo31271 = abstractC12563.mo31271();
        if (abstractC11071Mo31271 instanceof C6686) {
            return (C6686) abstractC11071Mo31271;
        }
        return null;
    }
}
