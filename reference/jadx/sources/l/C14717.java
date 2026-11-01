package l;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ܳᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S6LQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C14717 extends AbstractC2015 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0357 f48134;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14470 f48135;

    @Override // l.InterfaceC8825
    /* JADX INFO: renamed from: ܰ */
    public final Set mo5501() {
        Object[] objArr = {C10484.class, C20361.class, C7661.class, C0604.class, C16128.class};
        HashSet hashSet = new HashSet(5);
        for (int i = 0; i < 5; i++) {
            Object obj = objArr[i];
            C13638.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C9023.m23354(obj, "duplicate element: "));
            }
        }
        return C0561.unmodifiableSet(hashSet);
    }

    public C14717(InterfaceC0357 interfaceC0357) {
        this.f48135 = interfaceC0357.mo2067();
        this.f48134 = interfaceC0357;
    }

    @Override // l.InterfaceC8825
    /* JADX INFO: renamed from: ۙ */
    public final void mo5500(AbstractC19367 abstractC19367) {
        LinkedHashMap linkedHashMapMo2066;
        String str;
        boolean z = abstractC19367 instanceof C10484;
        InterfaceC0357 interfaceC0357 = this.f48134;
        C14470 c14470 = this.f48135;
        if (z) {
            AbstractC19367 abstractC19368 = (C10484) abstractC19367;
            c14470.m34872();
            c14470.m34874("table", interfaceC0357.mo2066(abstractC19368, "table", Collections.EMPTY_MAP), false);
            m35243(abstractC19368);
            c14470.m34875("/table");
            c14470.m34872();
            return;
        }
        if (abstractC19367 instanceof C20361) {
            AbstractC19367 abstractC19369 = (C20361) abstractC19367;
            c14470.m34872();
            c14470.m34874("thead", interfaceC0357.mo2066(abstractC19369, "thead", Collections.EMPTY_MAP), false);
            m35243(abstractC19369);
            c14470.m34875("/thead");
            c14470.m34872();
            return;
        }
        if (abstractC19367 instanceof C7661) {
            AbstractC19367 abstractC193610 = (C7661) abstractC19367;
            c14470.m34872();
            c14470.m34874("tbody", interfaceC0357.mo2066(abstractC193610, "tbody", Collections.EMPTY_MAP), false);
            m35243(abstractC193610);
            c14470.m34875("/tbody");
            c14470.m34872();
            return;
        }
        if (abstractC19367 instanceof C0604) {
            AbstractC19367 abstractC193611 = (C0604) abstractC19367;
            c14470.m34872();
            c14470.m34874("tr", interfaceC0357.mo2066(abstractC193611, "tr", Collections.EMPTY_MAP), false);
            m35243(abstractC193611);
            c14470.m34875("/tr");
            c14470.m34872();
            return;
        }
        if (abstractC19367 instanceof C16128) {
            C16128 c16128 = (C16128) abstractC19367;
            String str2 = c16128.m38180() ? "th" : "td";
            c14470.m34872();
            if (c16128.m38178() != null) {
                EnumC21066 enumC21066M38178 = c16128.m38178();
                int i = C23889.f77391[enumC21066M38178.ordinal()];
                if (i == 1) {
                    str = "left";
                } else if (i == 2) {
                    str = "center";
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("Unknown alignment: " + enumC21066M38178);
                    }
                    str = "right";
                }
                Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("align", str)};
                HashMap map = new HashMap(1);
                Map.Entry entry = entryArr[0];
                Object key = entry.getKey();
                C13638.requireNonNull(key);
                Object value = entry.getValue();
                C13638.requireNonNull(value);
                if (map.put(key, value) != null) {
                    throw new IllegalArgumentException(C9023.m23354(key, "duplicate key: "));
                }
                linkedHashMapMo2066 = interfaceC0357.mo2066(c16128, str2, C0561.unmodifiableMap(map));
            } else {
                linkedHashMapMo2066 = interfaceC0357.mo2066(c16128, str2, Collections.EMPTY_MAP);
            }
            c14470.m34874(str2, linkedHashMapMo2066, false);
            m35243(c16128);
            c14470.m34875("/".concat(str2));
            c14470.m34872();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m35243(AbstractC19367 abstractC19367) {
        AbstractC19367 abstractC19367M44383 = abstractC19367.m44383();
        while (abstractC19367M44383 != null) {
            AbstractC19367 abstractC19367M44390 = abstractC19367M44383.m44390();
            this.f48134.mo2068(abstractC19367M44383);
            abstractC19367M44383 = abstractC19367M44390;
        }
    }
}
