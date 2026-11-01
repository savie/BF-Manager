package l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۜܽ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1UG */
/* JADX INFO: loaded from: classes3.dex */
public final class C6896 extends AbstractC21803 implements InterfaceC21733 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC10425 f23217;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2662 f23218;

    public C6896(AbstractC10425 abstractC10425, C2662 c2662) {
        super(2);
        this.f23217 = abstractC10425;
        this.f23218 = c2662;
    }

    @Override // l.AbstractC21803
    /* JADX INFO: renamed from: ۙ */
    public final void mo4483(AbstractC6066 abstractC6066) {
        String strMo15749;
        String strM39114 = abstractC6066.m39114();
        if (C1791.m5871(strM39114)) {
            return;
        }
        C2662 c2662 = this.f23218;
        AbstractC11836 abstractC11836 = C13953.f45909;
        Map map = (Map) c2662.get(abstractC11836);
        if (map == null) {
            map = new HashMap();
            c2662.put(abstractC11836, map);
        }
        if (m18509(abstractC6066) == null) {
            AbstractC10425 abstractC10425 = this.f23217;
            abstractC10425.mo15751();
            do {
                strMo15749 = abstractC10425.mo15749();
            } while (map.containsKey(strMo15749));
            map.put(strMo15749, strM39114);
            C15364.m36802(abstractC6066).mo2194(strMo15749);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m18509(AbstractC6066 abstractC6066) {
        return (String) C15364.m36802(abstractC6066).mo2192();
    }
}
