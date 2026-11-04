package l;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.᩵ܰۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6LQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20611 extends AbstractC12406 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1770 f66036;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3261 f66037;

    @Override // l.InterfaceC10718
    /* JADX INFO: renamed from: ᩷ */
    public final Set mo19443() {
        Object[] objArr = {C19865.class, C1966.class, C15389.class, C11660.class, C5695.class};
        HashSet hashSet = new HashSet(5);
        for (int i = 0; i < 5; i++) {
            Object obj = objArr[i];
            C17359.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C14483.m34971("duplicate element: ", obj));
            }
        }
        return C4681.unmodifiableSet(hashSet);
    }

    public C20611(InterfaceC1770 interfaceC1770) {
        this.f66037 = interfaceC1770.mo6222();
        this.f66036 = interfaceC1770;
    }

    @Override // l.InterfaceC10718
    /* JADX INFO: renamed from: ۙ */
    public final void mo19442(AbstractC4534 abstractC4534) {
        LinkedHashMap linkedHashMapMo6221;
        String str;
        boolean z = abstractC4534 instanceof C19865;
        InterfaceC1770 interfaceC1770 = this.f66036;
        C3261 c3261 = this.f66037;
        if (z) {
            AbstractC4534 abstractC4535 = (C19865) abstractC4534;
            c3261.m10647();
            c3261.m10649("table", interfaceC1770.mo6221(abstractC4535, "table", Collections.EMPTY_MAP), false);
            m47189(abstractC4535);
            c3261.m10650("/table");
            c3261.m10647();
            return;
        }
        if (abstractC4534 instanceof C1966) {
            AbstractC4534 abstractC4536 = (C1966) abstractC4534;
            c3261.m10647();
            c3261.m10649("thead", interfaceC1770.mo6221(abstractC4536, "thead", Collections.EMPTY_MAP), false);
            m47189(abstractC4536);
            c3261.m10650("/thead");
            c3261.m10647();
            return;
        }
        if (abstractC4534 instanceof C15389) {
            AbstractC4534 abstractC4537 = (C15389) abstractC4534;
            c3261.m10647();
            c3261.m10649("tbody", interfaceC1770.mo6221(abstractC4537, "tbody", Collections.EMPTY_MAP), false);
            m47189(abstractC4537);
            c3261.m10650("/tbody");
            c3261.m10647();
            return;
        }
        if (abstractC4534 instanceof C11660) {
            AbstractC4534 abstractC4538 = (C11660) abstractC4534;
            c3261.m10647();
            c3261.m10649("tr", interfaceC1770.mo6221(abstractC4538, "tr", Collections.EMPTY_MAP), false);
            m47189(abstractC4538);
            c3261.m10650("/tr");
            c3261.m10647();
            return;
        }
        if (abstractC4534 instanceof C5695) {
            C5695 c5695 = (C5695) abstractC4534;
            String str2 = c5695.m16721() ? "th" : "td";
            c3261.m10647();
            if (c5695.m16719() != null) {
                EnumC13152 enumC13152M16719 = c5695.m16719();
                int i = C3457.f11863[enumC13152M16719.ordinal()];
                if (i == 1) {
                    str = "left";
                } else if (i == 2) {
                    str = "center";
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("Unknown alignment: " + enumC13152M16719);
                    }
                    str = "right";
                }
                Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("align", str)};
                HashMap map = new HashMap(1);
                Map.Entry entry = entryArr[0];
                Object key = entry.getKey();
                C17359.requireNonNull(key);
                Object value = entry.getValue();
                C17359.requireNonNull(value);
                if (map.put(key, value) != null) {
                    throw new IllegalArgumentException(C14483.m34971("duplicate key: ", key));
                }
                linkedHashMapMo6221 = interfaceC1770.mo6221(c5695, str2, C4681.unmodifiableMap(map));
            } else {
                linkedHashMapMo6221 = interfaceC1770.mo6221(c5695, str2, Collections.EMPTY_MAP);
            }
            c3261.m10649(str2, linkedHashMapMo6221, false);
            m47189(c5695);
            c3261.m10650("/".concat(str2));
            c3261.m10647();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m47189(AbstractC4534 abstractC4534) {
        AbstractC4534 abstractC4534M14254 = abstractC4534.m14254();
        while (abstractC4534M14254 != null) {
            AbstractC4534 abstractC4534M14261 = abstractC4534M14254.m14261();
            this.f66036.mo6223(abstractC4534M14254);
            abstractC4534M14254 = abstractC4534M14261;
        }
    }
}
