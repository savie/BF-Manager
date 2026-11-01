package l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.֨ܽ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: F1VH */
/* JADX INFO: loaded from: classes2.dex */
public final class C1251 extends AbstractC21803 implements InterfaceC21733 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2662 f5439;

    public C1251(C2662 c2662) {
        super(2);
        this.f5439 = c2662;
    }

    @Override // l.AbstractC21803
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4483(AbstractC6066 abstractC6066) {
        String strM18509;
        String strM39114 = abstractC6066.m39114();
        if (C1791.m5871(strM39114) || (strM18509 = C6896.m18509(abstractC6066)) == null) {
            return;
        }
        C2662 c2662 = this.f5439;
        AbstractC11836 abstractC11836 = C13953.f45909;
        Map map = (Map) c2662.get(abstractC11836);
        if (map == null) {
            map = new HashMap();
            c2662.put(abstractC11836, map);
        }
        String str = (String) map.get(strM18509);
        if (str == null || (C15364.m36802(abstractC6066) instanceof C4073) || strM39114.compareTo(str) < 0) {
            map.put(strM18509, strM39114);
        }
    }
}
