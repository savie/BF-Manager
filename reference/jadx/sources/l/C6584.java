package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ۛᩳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public final class C6584 extends AbstractC5313 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public HashSet f22070 = new HashSet();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24705 f22071;

    @Override // l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1766(Object obj, AbstractC22664 abstractC22664) {
        AbstractC22664 abstractC22665 = (AbstractC22664) obj;
        boolean z = true;
        switch (C3600.f12307[abstractC22664.mo9097().ordinal()]) {
            case 3:
                return Boolean.valueOf(!abstractC22665.m51067(EnumC21172.CHAR) && abstractC22664.mo9097().m48309(abstractC22665.mo9097()));
            case 4:
                return Boolean.valueOf(!abstractC22665.m51067(EnumC21172.SHORT) && abstractC22664.mo9097().m48309(abstractC22665.mo9097()));
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return Boolean.valueOf(abstractC22664.mo9097().m48309(abstractC22665.mo9097()));
            case 10:
            case 11:
                return Boolean.valueOf(abstractC22664.m51067(abstractC22665.mo9097()));
            case 12:
                return Boolean.valueOf(this.f22071.m55131(abstractC22664.mo19992(), abstractC22665, false));
            case 13:
                if (!abstractC22665.m51067(EnumC21172.BOT) && !abstractC22665.m51067(EnumC21172.CLASS) && !abstractC22665.m51067(EnumC21172.ARRAY) && !abstractC22665.m51067(EnumC21172.TYPEVAR)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 14:
            case 15:
                return Boolean.FALSE;
            default:
                throw new AssertionError("isSubtype " + abstractC22664.mo9097());
        }
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1767(C2832 c2832, Object obj) {
        AbstractC22664 abstractC22664 = (AbstractC22664) obj;
        boolean zM51067 = abstractC22664.m51067(EnumC21172.ARRAY);
        C24705 c24705 = this.f22071;
        if (zM51067) {
            if (c2832.f9333.mo40452()) {
                return Boolean.valueOf(c24705.m55149(c2832.f9333, c24705.m55120(abstractC22664)));
            }
            return Boolean.valueOf(c24705.m55131(c2832.f9333, c24705.m55120(abstractC22664), false));
        }
        if (abstractC22664.m51067(EnumC21172.CLASS)) {
            AbstractC19728 abstractC19728Mo29582 = abstractC22664.f73596.mo29582();
            C15252 c15252 = c24705.f79964;
            return Boolean.valueOf(abstractC19728Mo29582 == c15252.f49838 || abstractC19728Mo29582 == c15252.f49818 || abstractC19728Mo29582 == c15252.f49779);
        }
        return Boolean.FALSE;
    }

    @Override // l.AbstractC1100, l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1125(C8274 c8274, Object obj) {
        AbstractC22664 abstractC22664 = (AbstractC22664) obj;
        if (c8274 == abstractC22664 || c8274.f72657 == abstractC22664 || abstractC22664.m51067(EnumC21172.ERROR) || abstractC22664.m51067(EnumC21172.UNKNOWN)) {
            return Boolean.TRUE;
        }
        if (abstractC22664.m51067(EnumC21172.BOT)) {
            return Boolean.FALSE;
        }
        c8274.m22334(EnumC0816.f3091, abstractC22664, this.f22071);
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C10510 c10510, Object obj) {
        boolean zM55114;
        AbstractC22664 abstractC22664 = (AbstractC22664) obj;
        AbstractC22970 abstractC22970 = abstractC22664.f73596;
        C24705 c24705 = this.f22071;
        AbstractC22664 abstractC22664M55157 = c24705.m55157(abstractC22970, c10510);
        if (abstractC22664M55157 == null) {
            return Boolean.FALSE;
        }
        boolean z = false;
        if (!abstractC22664M55157.m51067(EnumC21172.CLASS)) {
            return Boolean.valueOf(c24705.m55131(abstractC22664M55157, abstractC22664, false));
        }
        if (abstractC22664M55157.f73596 == abstractC22664.f73596) {
            if (!abstractC22664.mo9330()) {
                if (c24705.m55131(abstractC22664M55157.mo23449(), abstractC22664.mo23449(), false)) {
                    z = true;
                }
            } else {
                C4567 c4567 = new C4567(abstractC22664, abstractC22664M55157, c24705);
                HashSet hashSet = this.f22070;
                if (hashSet.add(c4567)) {
                    try {
                        zM55114 = c24705.m55114(abstractC22664.mo15882(), abstractC22664M55157.mo15882());
                        hashSet.remove(c4567);
                    } catch (Throwable th) {
                        hashSet.remove(c4567);
                        throw th;
                    }
                } else {
                    zM55114 = c24705.m55114(abstractC22664.mo15882(), m18511(abstractC22664M55157).mo15882());
                }
                if (zM55114) {
                    if (c24705.m55131(abstractC22664M55157.mo23449(), abstractC22664.mo23449(), false)) {
                        z = true;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo10772(C12748 c12748, Object obj) {
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC22664 m18511(AbstractC22664 abstractC22664) {
        C10729 c10729;
        C24705 c24705 = this.f22071;
        C14764 c14764 = c24705.f79947;
        if (!abstractC22664.mo9330()) {
            return abstractC22664;
        }
        C18499 c18499 = new C18499();
        C18499 c184910 = new C18499();
        try {
            c24705.m55111(abstractC22664.f73596.f38067, abstractC22664, c18499, c184910);
            if (c18499.isEmpty()) {
                return abstractC22664;
            }
            C18499 c184911 = new C18499();
            boolean z = false;
            for (AbstractC22664 abstractC22665 : c184910.m43093()) {
                AbstractC22664 abstractC22664M18511 = m18511(abstractC22665);
                if (abstractC22664M18511.mo27320() && !abstractC22664M18511.mo27317()) {
                    c10729 = new C10729(c14764.f48286, EnumC18670.UNBOUND, c14764.f48274, null, abstractC22664M18511.f73595);
                } else {
                    if (abstractC22664M18511 != abstractC22665) {
                        c10729 = new C10729(c24705.m55123(abstractC22664M18511), EnumC18670.EXTENDS, c14764.f48274, null, abstractC22664M18511.f73595);
                    }
                    c184911.m43089(abstractC22664M18511);
                }
                abstractC22664M18511 = c10729;
                z = true;
                c184911.m43089(abstractC22664M18511);
            }
            return z ? c24705.m55103(abstractC22664.f73596.f38067, c18499.m43093(), c184911.m43093()) : abstractC22664;
        } catch (C0617 e) {
            throw new AssertionError(e);
        }
    }

    public C6584(C24705 c24705) {
        this.f22071 = c24705;
    }
}
