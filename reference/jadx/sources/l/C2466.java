package l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ۖۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: F42B */
/* JADX INFO: loaded from: classes3.dex */
public final class C2466 implements InterfaceC4790 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15846 f7911;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashMap f7912;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C19881 f7913;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C14764 f7914;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2466 m8318(C4747 c4747) {
        C2466 c2466 = (C2466) c4747.m14642(C2466.class);
        return c2466 == null ? new C2466(c4747) : c2466;
    }

    public C2466(C4747 c4747) {
        new HashSet();
        this.f7912 = new HashMap();
        c4747.m14644(C2466.class, this);
        C4878.m14927(c4747);
        this.f7914 = C14764.m35506(c4747);
        this.f7913 = C19881.m45741(c4747);
        C15252.m36599(c4747);
        C24705.m55066(c4747);
        this.f7911 = C15846.m37791(c4747);
        C22010.m49750(c4747);
        C7312.m20023(c4747);
        EnumC3666.f12544.m11915(EnumC20820.m47625(c4747));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14106 m8320(C24550 c24550) {
        if (c24550.mo9558() == EnumC5296.MODULE) {
            return null;
        }
        return ((AbstractC11781) m8317(AbstractC11781.class, c24550)).m29564();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23196 m8322(InterfaceC3804 interfaceC3804) {
        AbstractC11781 abstractC11781 = (AbstractC11781) m8317(AbstractC11781.class, interfaceC3804);
        if (this.f7913.m45780() == this.f7914.f48278) {
            return null;
        }
        return abstractC11781.f38066 == EnumC13603.f43214 ? (InterfaceC23196) interfaceC3804 : abstractC11781.m29564().f44618;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC13499 m8324(InterfaceC12753 interfaceC12753) {
        AbstractC11781 abstractC11781 = (AbstractC11781) m8317(AbstractC11781.class, interfaceC12753);
        if ((abstractC11781.mo29591() & 68719476736L) != 0) {
            return EnumC13499.MANDATED;
        }
        if ((abstractC11781.mo29591() & X931RNG.BLOCK64_RESEED_MAX) != 0) {
            return EnumC13499.MANDATED;
        }
        return EnumC13499.EXPLICIT;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC13499 m8319(InterfaceC22450 interfaceC22450) {
        if (((C23892) m8317(C23892.class, interfaceC22450)).m53395()) {
            return EnumC13499.MANDATED;
        }
        return EnumC13499.EXPLICIT;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m8321(InterfaceC12753 interfaceC12753) {
        AbstractC11781 abstractC11781 = (AbstractC11781) m8317(AbstractC11781.class, interfaceC12753);
        C14769 c14769Mo16957 = abstractC11781.mo16957();
        while (abstractC11781.mo9558() == EnumC5296.CLASS) {
            AbstractC22664 abstractC22664Mo12339 = ((C24550) abstractC11781).mo12339();
            if (!abstractC22664Mo12339.m51067(EnumC21172.CLASS) || abstractC22664Mo12339.mo9329()) {
                break;
            }
            abstractC11781 = abstractC22664Mo12339.f73596;
            C14764 c14764 = this.f7914;
            if (abstractC11781 == c14764.f48286.f73596) {
                break;
            }
            C14769 c14769M35552 = c14769Mo16957;
            for (C23892 c23892 : abstractC11781.mo16957()) {
                if (c23892.f69124.f73596.m29565(c14764.f48261.f73596) != null) {
                    AbstractC22664 abstractC22664 = c23892.f69124;
                    Iterator it = c14769Mo16957.iterator();
                    do {
                        if (!it.hasNext()) {
                            c14769M35552 = c14769M35552.m35552(c23892);
                            break;
                        }
                    } while (((C23892) it.next()).f69124.f73596 != abstractC22664.f73596);
                }
            }
            c14769Mo16957 = c14769M35552;
        }
        return c14769Mo16957;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m8325(InterfaceC12753 interfaceC12753) {
        AbstractC22970 abstractC22970M29558;
        AbstractC8036 abstractC8036M28324;
        C19113 c19113;
        AbstractC11781 abstractC11781 = (AbstractC11781) m8317(AbstractC11781.class, interfaceC12753);
        int i = C9177.f29776[abstractC11781.f38066.ordinal()];
        if (i == 1) {
            abstractC22970M29558 = (C14106) abstractC11781;
        } else if (i == 2) {
            abstractC22970M29558 = (C2920) abstractC11781;
        } else {
            abstractC22970M29558 = abstractC11781.m29558();
        }
        C5558 c5558 = null;
        C3168 c3168M37793 = abstractC22970M29558 != null ? this.f7911.m37793(abstractC22970M29558) : null;
        if (c3168M37793 != null && (abstractC8036M28324 = C11239.m28324(abstractC11781, c3168M37793.f10273)) != null && (c19113 = c3168M37793.f10275) != null) {
            c5558 = new C5558(abstractC8036M28324, c19113);
        }
        if (c5558 == null) {
            return null;
        }
        AbstractC8036 abstractC8036 = (AbstractC8036) c5558.f19300;
        C24621 c24621 = ((C19113) c5558.f19301).f61862;
        if (c24621 == null) {
            return null;
        }
        return c24621.m54955(abstractC8036);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m8317(Class cls, Object obj) {
        if (!cls.isInstance(obj)) {
            throw new IllegalArgumentException(obj.toString());
        }
        return cls.cast(obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8323() {
        this.f7912.clear();
    }
}
