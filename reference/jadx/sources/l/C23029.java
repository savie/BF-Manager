package l;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩺ܰ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23029 extends C13151 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20145 f74838;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23029(C20145 c20145, C6095 c6095) {
        super(c20145, EnumC10477.f35873, "inapplicable symbols", c6095);
        this.f74838 = c20145;
    }

    @Override // l.C13151, l.AbstractC8856
    /* JADX INFO: renamed from: ۙ */
    public final C11948 mo8964(EnumC17198 enumC17198, InterfaceC12260 interfaceC12260, AbstractC23903 abstractC23903, AbstractC16579 abstractC16579, AbstractC11242 abstractC11242, C21825 c21825, C21825 c21826) {
        Map mapM50966;
        EnumSet enumSetNoneOf;
        Map mapM50967 = m50966();
        C20145 c20145 = this.f74838;
        C23942 c23942 = c20145.f65436;
        if (c20145.f65442) {
            mapM50966 = m50967(mapM50967);
        } else {
            mapM50966 = m50966();
        }
        if (mapM50966.isEmpty()) {
            mapM50966 = mapM50967;
        }
        boolean z = ((HashMap) mapM50967).size() != mapM50966.size();
        if (mapM50966.size() > 1) {
            C23549 c23549 = c20145.f65420;
            if (z) {
                enumSetNoneOf = EnumSet.of(EnumC0264.COMPRESSED);
            } else {
                enumSetNoneOf = EnumSet.noneOf(EnumC0264.class);
            }
            C11948 c11948M51911 = c23549.m51911(enumC17198, enumSetNoneOf, c20145.f65441.m48186(), interfaceC12260, abstractC11242 == c23942.f77632 ? EnumC7654.CONSTRUCTOR : this.f77452.m26578(), abstractC11242 == c23942.f77632 ? abstractC16579.f53222.f77453 : abstractC11242, c20145.m45522(c21825));
            C21825 c21825M48588 = C21825.m48588();
            for (Map.Entry entry : mapM50966.entrySet()) {
                AbstractC23903 abstractC23904 = (AbstractC23903) entry.getKey();
                C23549 c235410 = c20145.f65420;
                C23800 c23800 = c20145.f65444;
                EnumC7654 enumC7654M38160 = C16121.m38160(abstractC23904);
                AbstractC23903 abstractC23903M52714 = abstractC23904.m52714(abstractC16579, c23800);
                AbstractC23903 abstractC23903Mo17326 = abstractC23904.mo17326(abstractC16579, c23800);
                C11948 c11948 = (C11948) entry.getValue();
                C14377 c14377 = C14707.f48054;
                c21825M48588 = c21825M48588.m48597(c235410.m51910(new C14377("compiler", "inapplicable.method", enumC7654M38160, abstractC23903M52714, abstractC23903Mo17326, c11948)));
            }
            return new C1675(c11948M51911, c21825M48588);
        }
        if (mapM50966.size() == 1) {
            Map.Entry entry2 = (Map.Entry) mapM50966.entrySet().iterator().next();
            C11948 c11948Mo8964 = new C3977(this, this.f43784, new C2068((AbstractC23903) entry2.getKey(), (C11948) entry2.getValue())).mo8964(enumC17198, interfaceC12260, abstractC23903, abstractC16579, abstractC11242, c21825, c21826);
            if (z) {
                c11948Mo8964.m29766(EnumC0264.COMPRESSED);
            }
            return c11948Mo8964;
        }
        return new C7444(c20145, EnumC10477.f35881).mo8964(enumC17198, interfaceC12260, abstractC23903, abstractC16579, abstractC11242, c21825, c21826);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public Map m50966() {
        C6800 c6800 = new C6800(this);
        for (C17384 c17384 : this.f43784.f20639) {
            boolean zM40497 = c17384.m40497();
            AbstractC23903 abstractC23903 = c17384.f55329;
            if (!zM40497) {
                C20145 c20145 = c6800.f22951.f74838;
                C19003 c19003 = new C19003();
                Iterator it = c6800.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Iterator it2 = c19003.iterator();
                        while (it2.hasNext()) {
                            c6800.remove((AbstractC23903) it2.next());
                        }
                        c6800.put(abstractC23903, c17384.f55330);
                        break;
                    }
                    AbstractC23903 abstractC23904 = (AbstractC23903) it.next();
                    if (abstractC23904 != abstractC23903) {
                        if (abstractC23903.mo42453(abstractC23904, (AbstractC0618) abstractC23904.f77448, c20145.f65444, false)) {
                            c19003.m43723(abstractC23904);
                        } else if (abstractC23904.mo42453(abstractC23903, (AbstractC0618) abstractC23903.f77448, c20145.f65444, false)) {
                            break;
                        }
                    }
                }
            }
        }
        return c6800;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m50967(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            C11948 c11948 = (C11948) entry.getValue();
            String strM37956 = EnumC15974.ARITY_MISMATCH.m37956();
            C3272[] c3272Arr = new C3272[0];
            Object[] objArrM29763 = c11948.m29763();
            if (c11948.mo29765().matches(strM37956) && c11948.m29763().length == 0) {
                for (int i = 0; i < objArrM29763.length; i++) {
                    if (c3272Arr[i].mo9752(objArrM29763[i])) {
                    }
                }
            }
            linkedHashMap.put((AbstractC23903) entry.getKey(), c11948);
        }
        return linkedHashMap;
    }

    @Override // l.C13151
    /* JADX INFO: renamed from: ᩶ۙ */
    public final C2068 mo11471() {
        LinkedHashMap linkedHashMapM50967 = m50967(m50966());
        if (linkedHashMapM50967.size() == 1) {
            return new C2068((AbstractC23903) linkedHashMapM50967.keySet().iterator().next(), (C11948) linkedHashMapM50967.values().iterator().next());
        }
        return null;
    }
}
