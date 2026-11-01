package l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ܺ᩸۟, reason: contains not printable characters */
/* JADX INFO: compiled from: F42B */
/* JADX INFO: loaded from: classes4.dex */
public final class C16202 implements InterfaceC16865 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C3836 f52302;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9399 f52303;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final HashMap f52304;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C12325 f52305;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16202 m38303(C12343 c12343) {
        C16202 c16202 = (C16202) c12343.m30655(C16202.class);
        return c16202 == null ? new C16202(c12343) : c16202;
    }

    public C16202(C12343 c12343) {
        new HashSet();
        this.f52304 = new HashMap();
        c12343.m30657(C16202.class, this);
        C16949.m39706(c12343);
        this.f52302 = C3836.m11131(c12343);
        this.f52305 = C12325.m30599(c12343);
        C23942.m52776(c12343);
        C23800.m52336(c12343);
        this.f52303 = C9399.m24138(c12343);
        C20145.m45505(c12343);
        C20414.m46161(c12343);
        EnumC14026.f46096.m33945(EnumC11909.m29706(c12343));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7675 m38306(C22492 c22492) {
        if (c22492.mo17325() == EnumC1923.MODULE) {
            return null;
        }
        return ((AbstractC23903) m38302(AbstractC23903.class, c22492)).m52724();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5576 m38305(InterfaceC23216 interfaceC23216) {
        AbstractC23903 abstractC23903 = (AbstractC23903) m38302(AbstractC23903.class, interfaceC23216);
        if (this.f52305.m30637() == this.f52302.f14249) {
            return null;
        }
        return abstractC23903.f77452 == EnumC10477.f35868 ? (InterfaceC5576) interfaceC23216 : abstractC23903.m52724().f25392;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC0636 m38309(InterfaceC14625 interfaceC14625) {
        AbstractC23903 abstractC23903 = (AbstractC23903) m38302(AbstractC23903.class, interfaceC14625);
        if ((abstractC23903.mo20276() & 68719476736L) != 0) {
            return EnumC0636.MANDATED;
        }
        if ((abstractC23903.mo20276() & X931RNG.BLOCK64_RESEED_MAX) != 0) {
            return EnumC0636.MANDATED;
        }
        return EnumC0636.EXPLICIT;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC0636 m38304(InterfaceC6157 interfaceC6157) {
        if (((C11867) m38302(C11867.class, interfaceC6157)).m29575()) {
            return EnumC0636.MANDATED;
        }
        return EnumC0636.EXPLICIT;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m38307(InterfaceC14625 interfaceC14625) {
        AbstractC23903 abstractC23903 = (AbstractC23903) m38302(AbstractC23903.class, interfaceC14625);
        C21825 c21825Mo2878 = abstractC23903.mo2878();
        while (abstractC23903.mo17325() == EnumC1923.CLASS) {
            AbstractC16579 abstractC16579Mo49995 = ((C22492) abstractC23903).mo49995();
            if (!abstractC16579Mo49995.m39001(EnumC6617.CLASS) || abstractC16579Mo49995.mo1926()) {
                break;
            }
            abstractC23903 = abstractC16579Mo49995.f53222;
            C3836 c3836 = this.f52302;
            if (abstractC23903 == c3836.f14275.f53222) {
                break;
            }
            C21825 c21825M48597 = c21825Mo2878;
            for (C11867 c11867 : abstractC23903.mo2878()) {
                if (c11867.f75167.f53222.m52702(c3836.f14251.f53222) != null) {
                    AbstractC16579 abstractC16579 = c11867.f75167;
                    Iterator it = c21825Mo2878.iterator();
                    do {
                        if (!it.hasNext()) {
                            c21825M48597 = c21825M48597.m48597(c11867);
                            break;
                        }
                    } while (((C11867) it.next()).f75167.f53222 != abstractC16579.f53222);
                }
            }
            c21825Mo2878 = c21825M48597;
        }
        return c21825Mo2878;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m38310(InterfaceC14625 interfaceC14625) {
        AbstractC0618 abstractC0618M52720;
        AbstractC8774 abstractC8774M9439;
        C10164 c10164;
        AbstractC23903 abstractC23903 = (AbstractC23903) m38302(AbstractC23903.class, interfaceC14625);
        int i = C21140.f68857[abstractC23903.f77452.ordinal()];
        if (i == 1) {
            abstractC0618M52720 = (C7675) abstractC23903;
        } else if (i == 2) {
            abstractC0618M52720 = (C19670) abstractC23903;
        } else {
            abstractC0618M52720 = abstractC23903.m52720();
        }
        C2068 c2068 = null;
        C4603 c4603M24141 = abstractC0618M52720 != null ? this.f52303.m24141(abstractC0618M52720) : null;
        if (c4603M24141 != null && (abstractC8774M9439 = C3128.m9439(abstractC23903, c4603M24141.f16296)) != null && (c10164 = c4603M24141.f16295) != null) {
            c2068 = new C2068(abstractC8774M9439, c10164);
        }
        if (c2068 == null) {
            return null;
        }
        AbstractC8774 abstractC8774 = (AbstractC8774) c2068.f7664;
        C23153 c23153 = ((C10164) c2068.f7665).f34729;
        if (c23153 == null) {
            return null;
        }
        return c23153.m51144(abstractC8774);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m38302(Class cls, Object obj) {
        if (!cls.isInstance(obj)) {
            throw new IllegalArgumentException(obj.toString());
        }
        return cls.cast(obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38308() {
        this.f52304.clear();
    }
}
