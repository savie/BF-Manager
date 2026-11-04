package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.۬۟᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes4.dex */
public final class C13712 extends AbstractC1100 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public HashSet f43536 = new HashSet();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24705 f43537;

    @Override // l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo1766(Object obj, AbstractC22664 abstractC22664) {
        return null;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1767(C2832 c2832, Object obj) {
        AbstractC11781 abstractC11781 = (AbstractC11781) obj;
        if (this.f43537.m55131((AbstractC22664) c2832, abstractC11781.f38067, true)) {
            return abstractC11781.f38067;
        }
        return null;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C10510 c10510, Object obj) {
        AbstractC22664 abstractC22664M55157;
        AbstractC22664 abstractC22664M55158;
        AbstractC11781 abstractC11781 = (AbstractC11781) obj;
        C24705 c24705 = this.f43537;
        AbstractC22970 abstractC22970 = c10510.f73596;
        if (abstractC22970 == abstractC11781) {
            return c10510;
        }
        HashSet hashSet = this.f43536;
        if (!hashSet.add(abstractC22970)) {
            return null;
        }
        try {
            AbstractC22664 abstractC22664M55137 = c24705.m55137(c10510);
            if ((abstractC22664M55137.m51067(EnumC21172.CLASS) || abstractC22664M55137.m51067(EnumC21172.TYPEVAR)) && (abstractC22664M55157 = c24705.m55157(abstractC11781, abstractC22664M55137)) != null) {
                return abstractC22664M55157;
            }
            if ((abstractC11781.mo29591() & 512) != 0) {
                for (C14769 c14769M55144 = c24705.m55144(c10510); c14769M55144.m35550(); c14769M55144 = c14769M55144.f48336) {
                    if (!((AbstractC22664) c14769M55144.f48335).m51067(EnumC21172.ERROR) && (abstractC22664M55158 = c24705.m55157(abstractC11781, (AbstractC22664) c14769M55144.f48335)) != null) {
                        return abstractC22664M55158;
                    }
                }
            }
            return null;
        } finally {
            hashSet.remove(abstractC22970);
        }
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo10772(C12748 c12748, Object obj) {
        return c12748;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1771(C17969 c17969, Object obj) {
        AbstractC11781 abstractC11781 = (AbstractC11781) obj;
        return c17969.f73596 == abstractC11781 ? c17969 : this.f43537.m55157(abstractC11781, c17969.mo19992());
    }

    public C13712(C24705 c24705) {
        this.f43537 = c24705;
    }
}
