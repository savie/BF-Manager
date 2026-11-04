package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۨۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: C420 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12269 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f39453 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30648(AbstractC11781 abstractC11781) {
        AbstractC19728 abstractC19728Mo9563 = abstractC11781.mo9563();
        HashMap map = this.f39453;
        C14769 c14769M35543 = (C14769) map.get(abstractC19728Mo9563);
        if (c14769M35543 == null) {
            c14769M35543 = C14769.m35543();
        }
        if (c14769M35543.contains(abstractC11781)) {
            return;
        }
        map.put(abstractC19728Mo9563, c14769M35543.m35546(abstractC11781));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m30649(AbstractC11781 abstractC11781) {
        C14769 c14769;
        String string = abstractC11781.mo29582().toString();
        if (abstractC11781.f38067.mo18914() || abstractC11781.f38067.mo40452() || !((c14769 = (C14769) this.f39453.get(abstractC11781.mo9563())) == null || (c14769.m35551() == 1 && c14769.contains(abstractC11781)))) {
            return string;
        }
        C14769 c14769M35543 = C14769.m35543();
        while (true) {
            AbstractC22664 abstractC22664 = abstractC11781.f38067;
            EnumC21172 enumC21172 = EnumC21172.CLASS;
            if (!abstractC22664.m51067(enumC21172) || !abstractC11781.f38067.mo23449().m51067(enumC21172) || abstractC11781.f38069.f38066 != EnumC13603.f43213) {
                break;
            }
            AbstractC19728 abstractC19728Mo9563 = abstractC11781.mo9563();
            c14769M35543.getClass();
            C14769 c147610 = new C14769(abstractC19728Mo9563, c14769M35543);
            abstractC11781 = abstractC11781.f38069;
            c14769M35543 = c147610;
        }
        AbstractC19728 abstractC19728Mo9564 = abstractC11781.mo9563();
        c14769M35543.getClass();
        C14769<AbstractC19728> c147611 = new C14769(abstractC19728Mo9564, c14769M35543);
        StringBuilder sb = new StringBuilder();
        String str = "";
        for (AbstractC19728 abstractC19728 : c147611) {
            sb.append(str);
            sb.append((CharSequence) abstractC19728);
            str = ".";
        }
        return sb.toString();
    }
}
