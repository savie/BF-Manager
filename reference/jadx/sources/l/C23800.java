package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩻ܺۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes.dex */
public final class C23800 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final C3836 f76937;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final C23942 f76940;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C21017 f76942;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f76943;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final C10391 f76946;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C9399 f76953;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AbstractC11242 f76958;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C23594 f76960;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f76962;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C23549 f76968;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static final C16576 f76934 = new C16576();

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public static final C10394 f76933 = new C10852();

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public static final C2071 f76932 = new C2071();

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public C21825 f76959 = C21825.m48588();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC6160 f76976 = new C5912(this);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC18154 f76955 = new C11951(this);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C6305 f76967 = new C6305(this);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Predicate f76973 = new C2777(this);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC17449 f76954 = new C5600(this);

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public AbstractC17449 f76947 = new C22534(this);

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public AbstractC17449 f76963 = new C1366(this);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC17449 f76965 = new C13362(this);

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public AbstractC17449 f76969 = new C4188(this);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C10394 f76972 = new C7011();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC6160 f76966 = new C8735();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C10394 f76951 = new C10146(this);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC18154 f76939 = new C7323(this);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC18154 f76938 = new C20729(this);

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C10394 f76949 = new C15791(this);

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC6160 f76974 = new C20024(this);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC6160 f76935 = new C0267(this);

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final AbstractC6160 f76950 = new C16496(this);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public HashMap f76957 = new HashMap();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public AbstractC6160 f76948 = new C12263(this);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C3482 f76970 = new C3482(this);

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C11805 f76952 = new C11805(this);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C18300 f76936 = new C18300(this);

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AbstractC17449 f76964 = new C14773(this, true);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC17449 f76971 = new C14773(this, false);

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C4748 f76944 = new C23552();

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final C4748 f76956 = new C14380();

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final C4748 f76961 = new C3089();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public HashMap f76975 = new HashMap();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C22846 f76945 = new C22846();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public HashSet f76941 = new HashSet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC16579 m52334(C23800 c23800, AbstractC16579 abstractC16579, boolean z, boolean z2) {
        c23800.getClass();
        return (AbstractC16579) abstractC16579.mo1928(new C23094(c23800, z, z2), (Object) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23800 m52336(C12343 c12343) {
        C23800 c23800 = (C23800) c12343.m30656(f76934);
        return c23800 == null ? new C23800(c12343) : c23800;
    }

    public C23800(C12343 c12343) {
        c12343.m30659(f76934, this);
        this.f76937 = C3836.m11131(c12343);
        C23942 c23942M52776 = C23942.m52776(c12343);
        this.f76940 = c23942M52776;
        EnumC11909 enumC11909M29706 = EnumC11909.m29706(c12343);
        this.f76943 = EnumC14026.f46107.m33945(enumC11909M29706);
        this.f76962 = EnumC14026.f46092.m33945(enumC11909M29706);
        this.f76942 = C21017.m47211(c12343);
        this.f76953 = C9399.m24138(c12343);
        AbstractC6302 abstractC6302 = c23942M52776.f77631;
        abstractC6302.getClass();
        char[] charArray = "<captured wildcard>".toCharArray();
        this.f76958 = abstractC6302.mo17390(charArray, charArray.length);
        C22531.m50048(c12343);
        this.f76968 = C23549.m51906(c12343);
        this.f76946 = new C10391(null);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m52415(AbstractC16579 abstractC16579) {
        if (!abstractC16579.m39001(EnumC6617.WILDCARD)) {
            return abstractC16579;
        }
        C0350 c0350 = (C0350) abstractC16579;
        if (c0350.mo2034()) {
            C22929 c22929 = c0350.f1775;
            return c22929 == null ? this.f76937.f14275 : c22929.mo18112();
        }
        return m52415(c0350.f1774);
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static AbstractC16579 m52343(AbstractC16579 abstractC16579) {
        if (!abstractC16579.m39001(EnumC6617.TYPEVAR)) {
            return abstractC16579;
        }
        C22929 c22929 = (C22929) abstractC16579;
        return c22929.mo46762() ? m52343(c22929.mo18112()) : c22929;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m52433(AbstractC16579 abstractC16579) {
        if (!abstractC16579.m39001(EnumC6617.WILDCARD)) {
            return abstractC16579;
        }
        C0350 c0350 = (C0350) abstractC16579;
        return c0350.mo2036() ? this.f76937.f14228 : m52433(c0350.f1774);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static AbstractC16579 m52352(AbstractC16579 abstractC16579) {
        return (abstractC16579.m39001(EnumC6617.TYPEVAR) && ((C22929) abstractC16579).mo46762()) ? m52352(abstractC16579.mo39002()) : abstractC16579;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m52422(AbstractC16579 abstractC16579, boolean z) {
        while (abstractC16579.m39001(EnumC6617.TYPEVAR)) {
            abstractC16579 = abstractC16579.mo18112();
        }
        return z ? m52419(abstractC16579) : abstractC16579;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m52408(AbstractC16579 abstractC16579, C21825 c21825) {
        C12511 c12511 = new C12511(this, c21825);
        EnumC6865 enumC6865 = EnumC6865.f23146;
        abstractC16579.getClass();
        return (AbstractC16579) abstractC16579.mo1928(c12511, enumC6865);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C21825 m52410(AbstractC16579 abstractC16579) {
        InterfaceC15874 c19712 = new C19712(this);
        HashSet hashSet = new HashSet();
        abstractC16579.mo1928(c19712, hashSet);
        return C21825.m48583((Iterable) hashSet);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m52405(AbstractC16579 abstractC16579) {
        AbstractC6160 abstractC6160 = this.f76976;
        abstractC6160.getClass();
        return ((Boolean) abstractC16579.mo1928(abstractC6160, (Object) null)).booleanValue();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m52420(AbstractC16579 abstractC16579, AbstractC0618 abstractC0618) {
        AbstractC18154 abstractC18154 = this.f76955;
        abstractC18154.getClass();
        return (AbstractC16579) abstractC16579.mo1928(abstractC18154, abstractC0618);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m52363(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710, C10391 c10391) {
        AbstractC16579 abstractC16579M52437;
        if (abstractC16579.m39001(EnumC6617.ERROR)) {
            return true;
        }
        boolean zMo9481 = abstractC16579.mo9481();
        if (zMo9481 == abstractC165710.mo9481()) {
            return m52400(abstractC16579, abstractC165710, c10391);
        }
        EnumC6617 enumC6617 = EnumC6617.UNDETVAR;
        boolean zM39001 = abstractC16579.m39001(enumC6617);
        boolean zM39002 = abstractC165710.m39001(enumC6617);
        if (!zM39001 && !zM39002) {
            if (zMo9481) {
                abstractC16579M52437 = m52383(abstractC16579).f77449;
            } else {
                abstractC16579M52437 = m52437(abstractC16579);
            }
            return m52413(abstractC16579M52437, abstractC165710, true);
        }
        if (zM39001) {
            if (abstractC165710.mo9481()) {
                abstractC165710 = m52383(abstractC165710).f77449;
            }
            return m52413(abstractC16579, abstractC165710, true);
        }
        if (abstractC16579.mo9481()) {
            abstractC16579 = m52383(abstractC16579).f77449;
        }
        return m52413(abstractC16579, abstractC165710, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 m52385(AbstractC0618 abstractC0618) {
        return this.f76967.m17401(abstractC0618).f55921;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m52431(AbstractC16579 abstractC16579) {
        return this.f76967.m17401(abstractC16579.f53222).mo39553(abstractC16579);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21825 m52426(C22492 c22492) {
        boolean z;
        try {
            m52385((AbstractC0618) c22492);
            z = true;
        } catch (C23945 unused) {
            z = false;
        }
        C6171.m17176(z);
        AbstractC23903 abstractC23903M52385 = m52385((AbstractC0618) c22492);
        C5227 c5227M52366 = m52366(c22492.f77449, false);
        C19003 c19003 = new C19003();
        for (AbstractC23903 abstractC23903 : c5227M52366.mo3803(abstractC23903M52385.f77453, this.f76973, EnumC10167.RECURSIVE)) {
            if (abstractC23903 != abstractC23903M52385 && abstractC23903M52385.mo42453(abstractC23903, c22492, this, false)) {
                Iterator it = c19003.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c19003.m43723(abstractC23903);
                        break;
                    }
                    AbstractC23903 abstractC23904 = (AbstractC23903) it.next();
                    if (m52399(abstractC23904.mo50006(this), abstractC23903.mo50006(this)) || (abstractC23904.mo42453(abstractC23903, c22492, this, false) && (m52339(c22492, (AbstractC0618) abstractC23904.m52720()) || ((C18258) abstractC23903).m42452((C22492) abstractC23904.f77448, this) != null))) {
                        break;
                    }
                }
            }
        }
        return c19003.m43726();
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m52404(AbstractC16579 abstractC16579) {
        try {
            m52431(abstractC16579);
            return true;
        } catch (C23945 unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m52438(AbstractC16579 abstractC16579) {
        if (!C9030.stream(abstractC16579.mo1938()).anyMatch(new C15951(2))) {
            return abstractC16579;
        }
        C21825 c21825Mo1938 = abstractC16579.mo1938();
        C21825<AbstractC16579> c21825Mo1939 = abstractC16579.f53222.f77449.mo1938();
        C19003 c19003 = new C19003();
        for (AbstractC16579 abstractC165710 : c21825Mo1939) {
            AbstractC16579 abstractC165711 = (AbstractC16579) c21825Mo1938.f70876;
            AbstractC16579 abstractC16579Mo18112 = abstractC165710.mo18112();
            if (!((AbstractC16579) c21825Mo1938.f70876).m39001(EnumC6617.WILDCARD)) {
                c19003.m43723(abstractC165711);
            } else {
                C0350 c0350 = (C0350) abstractC165711;
                if (abstractC16579Mo18112.m39005(c21825Mo1939)) {
                    abstractC16579Mo18112 = c0350.f1774;
                } else {
                    int i = C14068.f46212[c0350.f1776.ordinal()];
                    if (i == 1) {
                        abstractC16579Mo18112 = m52360(abstractC16579Mo18112, c0350.f1774);
                    } else if (i == 2) {
                        abstractC16579Mo18112 = c0350.f1774;
                    } else if (i != 3) {
                        C6171.m17174("Cannot get here!");
                        throw null;
                    }
                }
                c19003.m43723(abstractC16579Mo18112);
            }
            c21825Mo1938 = c21825Mo1938.f70877;
        }
        return m52371(abstractC16579.f53222.f77449, c21825Mo1939, c19003.m43726());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22492 m52382(C4603 c4603, AbstractC11242 abstractC11242, AbstractC16579 abstractC16579, long j) {
        if (abstractC16579 == null) {
            return null;
        }
        C3836 c3836 = this.f76937;
        if (abstractC16579 == c3836.f14247) {
            return null;
        }
        AbstractC23903 abstractC23903M52385 = m52385(abstractC16579.f53222);
        AbstractC16579 abstractC16579M52431 = m52431(abstractC16579);
        C22492 c22492 = new C22492(j, abstractC11242, c4603.f16301.f30086.mo44804());
        c22492.f77451 = InterfaceC13320.f44208;
        c22492.f73417 = new C10873(c22492);
        c22492.f73417.mo24224(new C18258(abstractC23903M52385.mo20276(), abstractC23903M52385.f77453, abstractC16579M52431, c22492));
        C0309 c0309 = new C0309(c22492, AbstractC16579.f53219, C21825.m48588());
        c0309.f1654 = c3836.f14275;
        c0309.f1658 = abstractC16579 instanceof C23594 ? m52356(abstractC16579) : C21825.of((Object) abstractC16579);
        c22492.f77449 = c0309;
        c22492.f73415 = ((C22492) c22492.f77448).f73415;
        return c22492;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m52339(C22492 c22492, AbstractC0618 abstractC0618) {
        InterfaceC2173 interfaceC2173 = c22492.f73422;
        if (interfaceC2173 != null && interfaceC2173.mo6760() == EnumC11347.CLASS && this.f76953.m24141(c22492) == null) {
            return false;
        }
        if (c22492 == abstractC0618) {
            return true;
        }
        Iterator it = m52439(c22492.f77449).iterator();
        while (it.hasNext()) {
            if (m52339((C22492) ((AbstractC16579) it.next()).f53222, abstractC0618)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m52400(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710, C10391 c10391) {
        boolean zM52338 = m52338(abstractC16579, abstractC165710, true, c10391);
        if (zM52338) {
            m52353(abstractC16579, abstractC165710, c10391);
        }
        return zM52338;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m52338(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710, boolean z, C10391 c10391) {
        AbstractC16579 abstractC16579M52423;
        EnumC6617 enumC6617 = EnumC6617.ARRAY;
        if (abstractC16579.m39001(enumC6617) && abstractC165710.m39001(enumC6617)) {
            if (((C8777) abstractC16579).f30194.mo9481()) {
                return m52399(m52416(abstractC16579), m52416(abstractC165710));
            }
            return m52338(m52416(abstractC16579), m52416(abstractC165710), false, c10391);
        }
        if (m52413(abstractC16579, abstractC165710, z)) {
            return true;
        }
        if (abstractC16579.m39001(EnumC6617.TYPEVAR)) {
            return m52338(abstractC16579.mo18112(), abstractC165710, false, c10391);
        }
        if (abstractC165710.mo1936() || (abstractC16579M52423 = m52423(abstractC165710.f53222, abstractC16579)) == null || !abstractC16579M52423.mo1936()) {
            return false;
        }
        if (m52436(abstractC165710)) {
            c10391.m26291(EnumC0597.UNCHECKED);
            return true;
        }
        c10391.mo21748(EnumC0597.UNCHECKED);
        return true;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m52353(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710, C10391 c10391) {
        if (!abstractC16579.m39001(EnumC6617.ARRAY) || m52436(abstractC16579)) {
            return;
        }
        C8777 c8777 = (C8777) abstractC16579;
        int i = C14068.f46214[abstractC165710.mo1933().ordinal()];
        boolean z = false;
        if (i == 1) {
            z = (!(c8777 instanceof C19360) || (((C8777) abstractC165710) instanceof C19360) || m52436(c8777)) ? false : true;
        } else if (i == 2) {
            z = c8777 instanceof C19360;
        }
        if (z) {
            c10391.mo21748(EnumC0597.VARARGS);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m52413(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710, boolean z) {
        AbstractC16579 abstractC16579M52352;
        if (abstractC16579.m39004(abstractC165710)) {
            return true;
        }
        if (abstractC165710.mo14987()) {
            return m52443(abstractC165710, abstractC16579);
        }
        if (abstractC165710.mo12731()) {
            Iterator it = m52439(abstractC165710).m48597(m52432(abstractC165710)).iterator();
            while (it.hasNext()) {
                if (!m52413(abstractC16579, (AbstractC16579) it.next(), z)) {
                    return false;
                }
            }
            return true;
        }
        if (!abstractC16579.m39001(EnumC6617.UNDETVAR) && !abstractC16579.mo12731() && abstractC165710 != (abstractC16579M52352 = m52352(m52433(abstractC165710))) && !abstractC16579M52352.m39001(EnumC6617.BOT)) {
            if (z) {
                abstractC16579 = m52419(abstractC16579);
            }
            return m52413(abstractC16579, abstractC16579M52352, false);
        }
        if (z) {
            abstractC16579 = m52419(abstractC16579);
        }
        AbstractC17449 abstractC17449 = this.f76954;
        abstractC17449.getClass();
        return ((Boolean) abstractC16579.mo1928(abstractC17449, abstractC165710)).booleanValue();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m52443(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710) {
        int i = C14068.f46214[abstractC16579.mo1933().ordinal()];
        if (i != 16) {
            if (i != 17) {
                return m52413(abstractC165710, abstractC16579, true);
            }
            C10229 c10229 = (C10229) abstractC16579;
            if (abstractC16579 != abstractC165710 && c10229.f53121 != abstractC165710 && !abstractC165710.m39001(EnumC6617.ERROR) && !abstractC165710.m39001(EnumC6617.BOT)) {
                c10229.m26013(EnumC8112.f28425, abstractC165710, this);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m52401(C21825 c21825, C21825 c21826) {
        while (c21825.f70877 != null && c21826.f70877 != null && m52399((AbstractC16579) c21825.f70876, (AbstractC16579) c21826.f70876)) {
            c21825 = c21825.f70877;
            c21826 = c21826.f70877;
        }
        return c21825.f70877 == null && c21826.f70877 == null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52395(C18258 c18258) {
        C21825 c21825Mo33523 = c18258.f77449.mo33523();
        if ((c18258.f77447 & 256) == 0) {
            return false;
        }
        AbstractC23903 abstractC23903 = c18258.f77448;
        C3836 c3836 = this.f76937;
        return (abstractC23903 == c3836.f14272.f53222 || abstractC23903 == c3836.f14244.f53222) && c21825Mo33523.m48596() == 1 && ((AbstractC16579) c21825Mo33523.f70876).m39001(EnumC6617.ARRAY) && ((C8777) c21825Mo33523.f70876).f30194.f53222 == c3836.f14275.f53222;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C18258 m52350(C22492 c22492, C22492 c22493) {
        C18258 c18258;
        C18258 c18258M52350 = null;
        if (c22493 != c22492) {
            c22493.mo49994();
            if ((c22493.f77447 & 1536) == 0) {
                return null;
            }
        }
        c22493.mo49994();
        for (AbstractC23903 abstractC23903 : c22493.f73417.mo3802((Predicate) null, EnumC10167.NON_RECURSIVE)) {
            if (abstractC23903.f77452 == EnumC10477.f35879 && (abstractC23903.mo20276() & 8796093023234L) == ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
                C18258 c18259 = (C18258) abstractC23903;
                C18258 c18258M42451 = c18259.m42451(c22492, this, true);
                if ((c18258M42451 == null || c18258M42451 == c18259) && this.f76943 && (c18258 = (C18258) m52376(c22492.f77449, c18259).f70876) != null && c18258.mo42453(c18259, c22492, this, true)) {
                    c18258M42451 = c18258;
                }
                if (c18258M42451 == null || c18258M42451 == c18259) {
                    c18258M52350 = c18259;
                    break;
                }
            }
        }
        if (c18258M52350 == null) {
            AbstractC16579 abstractC16579M52432 = m52432(c22493.f77449);
            if (abstractC16579M52432.m39001(EnumC6617.CLASS)) {
                c18258M52350 = m52350(c22492, (C22492) abstractC16579M52432.f53222);
            }
        }
        for (C21825 c21825M52439 = m52439(c22493.f77449); c18258M52350 == null && c21825M52439.m48595(); c21825M52439 = c21825M52439.f70877) {
            c18258M52350 = m52350(c22492, (C22492) ((AbstractC16579) c21825M52439.f70876).f53222);
        }
        return c18258M52350;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m52399(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710) {
        return ((Boolean) this.f76947.m20360(abstractC165710, abstractC16579)).booleanValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52392(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710) {
        int i = C14068.f46214[abstractC16579.mo1933().ordinal()];
        if (i != 16) {
            if (i == 17) {
                if (abstractC165710.m39001(EnumC6617.WILDCARD)) {
                    C10229 c10229 = (C10229) abstractC16579;
                    int i2 = C14068.f46212[((C0350) abstractC165710).f1776.ordinal()];
                    if (i2 == 1) {
                        c10229.m26013(EnumC8112.f28427, m52415(abstractC165710), this);
                        return true;
                    }
                    if (i2 == 2) {
                        c10229.m26013(EnumC8112.f28425, m52433(abstractC165710), this);
                        return true;
                    }
                } else {
                    return m52399(abstractC16579, abstractC165710);
                }
            } else {
                return m52427(abstractC165710, abstractC16579);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52396(C21825 c21825, C21825 c21826) {
        while (c21825.m48595() && c21826.m48595() && m52427((AbstractC16579) c21825.f70876, (AbstractC16579) c21826.f70876)) {
            c21825 = c21825.f70877;
            c21826 = c21826.f70877;
        }
        return c21825.isEmpty() && c21826.isEmpty();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m52427(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710) {
        return ((Boolean) this.f76963.m20360(abstractC165710, abstractC16579)).booleanValue();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m52430(C21825 c21825, C21825 c21826) {
        while (c21825.m48595() && c21826.m48595()) {
            AbstractC16579 abstractC16579 = (AbstractC16579) c21825.f70876;
            AbstractC16579 abstractC165710 = (AbstractC16579) c21826.f70876;
            if (!m52399(abstractC16579, abstractC165710) && (!m52427(abstractC16579, abstractC165710) || !m52427(abstractC165710, abstractC16579))) {
                break;
            }
            c21825 = c21825.f70877;
            c21826 = c21826.f70877;
        }
        return c21825.isEmpty() && c21826.isEmpty();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ba A[RETURN] */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m52412(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710, C10391 c10391) {
        boolean zBooleanValue;
        if (abstractC16579 != abstractC165710) {
            if (abstractC16579.mo9481() != abstractC165710.mo9481()) {
                AbstractC16579 abstractC16579M52422 = m52422(abstractC16579, false);
                if (!m52363(abstractC16579M52422, abstractC165710, c10391) && (!abstractC165710.mo9481() || !m52413(m52383(abstractC165710).f77449, abstractC16579M52422, true))) {
                    return false;
                }
            } else {
                C21825 c21825 = this.f76959;
                Object obj = c21825.f70876;
                AbstractC17449 abstractC17449 = this.f76965;
                if (c10391 != obj) {
                    try {
                        this.f76959 = c21825.m48597(c10391);
                        m52353(abstractC16579, abstractC165710, c10391);
                        abstractC17449.getClass();
                        zBooleanValue = ((Boolean) abstractC16579.mo1928(abstractC17449, abstractC165710)).booleanValue();
                        this.f76959 = this.f76959.f70877;
                    } catch (Throwable th) {
                        this.f76959 = this.f76959.f70877;
                        throw th;
                    }
                } else {
                    abstractC17449.getClass();
                    zBooleanValue = ((Boolean) abstractC16579.mo1928(abstractC17449, abstractC165710)).booleanValue();
                }
                if (zBooleanValue) {
                    EnumC6617 enumC6617 = EnumC6617.CLASS;
                    if (abstractC16579.m39001(enumC6617)) {
                        EnumC10477 enumC10477 = abstractC16579.f53222.f77452;
                        C21059 c21059 = C21059.f68585;
                        if (enumC10477.m26580(c21059) && abstractC165710.m39001(enumC6617) && abstractC165710.f53222.f77452.m26580(c21059) && (abstractC16579.f53222.m52707() || abstractC165710.f53222.m52707())) {
                            if (!abstractC16579.mo12731() && !abstractC165710.mo12731() && m52340((C22492) abstractC16579.f53222, (C22492) abstractC165710.f53222)) {
                                return false;
                            }
                        }
                    }
                }
                return zBooleanValue;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m52340(final C22492 c22492, C22492 c22493) {
        if (m52413(m52402(c22492.f77449), m52402(c22493.f77449), true)) {
            return false;
        }
        if (c22492.m52721() == c22493.m52721() && m52413(m52402(c22493.f77449), m52402(c22492.f77449), true)) {
            return false;
        }
        if (c22492.m52721() && !c22493.m52721()) {
            return m52340(c22493, c22492);
        }
        if (!c22492.m52721() && (c22492.f77447 & 16) != 0) {
            return true;
        }
        if (!c22492.m52707() && !c22493.m52707()) {
            return false;
        }
        C22492 c22494 = c22492.m52707() ? c22492 : c22493;
        if (c22494 == c22492) {
            c22492 = c22493;
        }
        return C9030.stream(c22494.f73421).allMatch(new Predicate() { // from class: l.ܶ۟ۤ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C8512.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo9645negate() {
                return C8512.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C8512.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.m52340((C22492) ((AbstractC23903) obj), c22492);
            }
        });
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m52414(C21825 c21825, C21825 c21826) {
        while (c21825.f70877 != null && c21826.f70877 != null) {
            AbstractC16579 abstractC16579 = (AbstractC16579) c21825.f70876;
            AbstractC16579 abstractC165710 = (AbstractC16579) c21826.f70876;
            AbstractC17449 abstractC17449 = this.f76969;
            abstractC17449.getClass();
            if (((Boolean) abstractC16579.mo1928(abstractC17449, abstractC165710)).booleanValue()) {
                return true;
            }
            c21825 = c21825.f70877;
            c21826 = c21826.f70877;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m52377(C21825 c21825) {
        return c21825.m48592((Function) this.f76972);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m52358(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710) {
        boolean zM52413;
        if (abstractC16579 == abstractC165710) {
            return false;
        }
        EnumC6617 enumC6617 = EnumC6617.TYPEVAR;
        if (abstractC16579.m39001(enumC6617)) {
            AbstractC16579 abstractC16579Mo18112 = ((C22929) abstractC16579).mo18112();
            if (abstractC165710.m39001(enumC6617)) {
                abstractC165710 = (AbstractC16579) m52422(abstractC165710, false).mo1928(new C23094(this, true, true), (Object) null);
            }
            zM52413 = m52412(abstractC16579Mo18112, abstractC165710, this.f76946);
        } else {
            if (!abstractC165710.m39001(EnumC6617.WILDCARD)) {
                abstractC165710 = m52343(abstractC165710);
            }
            if (abstractC165710.m39001(enumC6617)) {
                abstractC165710 = (AbstractC16579) m52422(abstractC165710, false).mo1928(new C23094(this, true, true), (Object) null);
            }
            zM52413 = m52413(abstractC16579, abstractC165710, true);
        }
        return !zM52413;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m52436(AbstractC16579 abstractC16579) {
        return ((Boolean) this.f76966.m17162(abstractC16579)).booleanValue();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m52434(AbstractC16579 abstractC16579) {
        while (abstractC16579.m39001(EnumC6617.WILDCARD)) {
            abstractC16579 = m52415(abstractC16579);
        }
        return abstractC16579.m39001(EnumC6617.ARRAY);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m52416(AbstractC16579 abstractC16579) {
        int i = C14068.f46214[abstractC16579.mo1933().ordinal()];
        if (i == 1) {
            return ((C8777) abstractC16579).f30194;
        }
        if (i == 14) {
            return m52416(m52415(abstractC16579));
        }
        if (i == 16) {
            return abstractC16579;
        }
        if (i != 18) {
            return null;
        }
        return m52416(((C10894) abstractC16579).f53121);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C8777 m52406(AbstractC16579 abstractC16579) {
        if (abstractC16579.m39001(EnumC6617.VOID) || abstractC16579.m39001(EnumC6617.PACKAGE)) {
            C6171.m17174("Type t must not be a VOID or PACKAGE type, " + abstractC16579.toString());
            throw null;
        }
        return new C8777(abstractC16579, this.f76937.f14258);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m52423(AbstractC23903 abstractC23903, AbstractC16579 abstractC16579) {
        AbstractC16579 abstractC165710 = abstractC23903.f77449;
        AbstractC16579 abstractC165711 = this.f76937.f14275;
        return abstractC165710 == abstractC165711 ? abstractC165711 : (AbstractC16579) this.f76939.m20360(abstractC23903, abstractC16579);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m52372(AbstractC23903 abstractC23903, AbstractC16579 abstractC16579) {
        int i = C14068.f46214[abstractC16579.mo1933().ordinal()];
        if (i == 1) {
            if (m52413(abstractC16579, abstractC23903.f77449, true)) {
                return abstractC23903.f77449;
            }
            return null;
        }
        if (i != 2) {
            if (i == 12) {
                return m52423(abstractC23903, abstractC16579);
            }
            if (i != 16) {
                return null;
            }
            return abstractC16579;
        }
        do {
            AbstractC16579 abstractC16579M52423 = m52423(abstractC23903, abstractC16579);
            if (abstractC16579M52423 != null) {
                return abstractC16579M52423;
            }
            abstractC16579 = abstractC16579.mo1934();
        } while (abstractC16579.m39001(EnumC6617.CLASS));
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m52369(AbstractC16579 abstractC16579, AbstractC0618 abstractC0618) {
        EnumC6617 enumC6617;
        int i = C14068.f46214[abstractC16579.mo1933().ordinal()];
        if (i == 1) {
            if (m52413(abstractC16579, abstractC0618.f77449, true)) {
                return abstractC0618.f77449;
            }
            return null;
        }
        if (i != 2) {
            if (i == 12) {
                return m52423(abstractC0618, abstractC16579);
            }
            if (i != 16) {
                return null;
            }
            return abstractC16579;
        }
        do {
            AbstractC16579 abstractC16579M52423 = m52423(abstractC0618, abstractC16579);
            if (abstractC16579M52423 != null) {
                return abstractC16579M52423;
            }
            AbstractC16579 abstractC16579Mo1934 = abstractC16579.mo1934();
            enumC6617 = EnumC6617.CLASS;
            if (abstractC16579Mo1934.m39001(enumC6617)) {
                abstractC16579 = abstractC16579Mo1934;
            } else {
                abstractC16579 = abstractC16579.f53222.f77448.m52720() != null ? abstractC16579.f53222.f77448.m52720().f77449 : AbstractC16579.f53219;
            }
        } while (abstractC16579.m39001(enumC6617));
        return null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m52409(AbstractC23903 abstractC23903, AbstractC16579 abstractC16579) {
        if ((abstractC23903.mo20276() & 8) != 0) {
            return abstractC23903.f77449;
        }
        return (AbstractC16579) this.f76938.m20360(abstractC23903, abstractC16579);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m52428(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710, C10391 c10391) {
        if (abstractC16579.m39001(EnumC6617.ERROR)) {
            return true;
        }
        if (abstractC16579.mo1933().m17953(EnumC6617.INT) && abstractC16579.mo24292() != null) {
            int iIntValue = ((Number) abstractC16579.mo24292()).intValue();
            int[] iArr = C14068.f46214;
            int i = iArr[abstractC165710.mo1933().ordinal()];
            if (i != 2) {
                if ((i == 3 || i == 4 || i == 5 || i == 6) && abstractC165710.mo1933().m17950(iIntValue)) {
                    return true;
                }
            } else {
                int i2 = iArr[m52437(abstractC165710).mo1933().ordinal()];
                if (i2 == 3 || i2 == 4 || i2 == 5) {
                    return m52428(abstractC16579, m52437(abstractC165710), c10391);
                }
            }
        }
        return m52363(abstractC16579, abstractC165710, c10391);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m52402(AbstractC16579 abstractC16579) {
        return (abstractC16579.mo9481() || this.f76937.f14220.f53222 == abstractC16579.f53222) ? abstractC16579 : m52346(abstractC16579, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public AbstractC16579 m52346(AbstractC16579 abstractC16579, boolean z) {
        if (abstractC16579.mo9481()) {
            return abstractC16579;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C10394 c10394 = this.f76949;
        c10394.getClass();
        return (AbstractC16579) abstractC16579.mo1928(c10394, boolValueOf);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21825 m52424(C21825 c21825) {
        return this.f76949.m26295(Boolean.FALSE, c21825);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m52444(AbstractC16579 abstractC16579) {
        return m52346(abstractC16579, true);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C21825 m52411(C21825 c21825) {
        return this.f76949.m26295(Boolean.TRUE, c21825);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C23594 m52442(C21825 c21825) {
        return m52384(c21825, ((AbstractC16579) c21825.f70876).f53222.m52721());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23594 m52384(C21825 c21825, boolean z) {
        AbstractC11242 abstractC11242M17389;
        AbstractC16579 abstractC16579M52402;
        C6171.m17176(c21825.m48595());
        AbstractC16579 abstractC16579 = (AbstractC16579) c21825.f70876;
        C3836 c3836 = this.f76937;
        if (z) {
            c21825 = c21825.m48597(c3836.f14275);
        }
        boolean z2 = AbstractC16579.f53216;
        C23942 c23942 = this.f76940;
        if (z2) {
            abstractC11242M17389 = c23942.f77631.m17389(c21825.m48590(","));
        } else {
            abstractC11242M17389 = c23942.f77594;
        }
        C22492 c22492 = new C22492(1090524161L, abstractC11242M17389, null, c3836.f14243);
        C23594 c23594 = new C23594(c22492, AbstractC16579.f53219, C21825.m48588());
        c23594.f76438 = z;
        c22492.mo49994();
        C6171.m17176((c22492.f77447 & 16777216) != 0);
        AbstractC16579 abstractC165710 = (AbstractC16579) c21825.f70876;
        c23594.f1654 = abstractC165710;
        c23594.f1658 = c21825.f70877;
        C6171.m17173(c23594.f1654, (abstractC165710.f53222.f77451.mo1180() && c23594.f1654.mo16236()) ? false : true);
        c22492.f77449 = c23594;
        if (((AbstractC16579) c21825.f70876).m39001(EnumC6617.TYPEVAR)) {
            abstractC16579M52402 = c3836.f14275;
        } else {
            abstractC16579M52402 = m52402(abstractC16579);
        }
        c22492.f77454 = abstractC16579M52402;
        c22492.f73417 = new C10873(c22492);
        return c23594;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m52432(AbstractC16579 abstractC16579) {
        AbstractC6160 abstractC6160 = this.f76974;
        abstractC6160.getClass();
        return (AbstractC16579) abstractC16579.mo1928(abstractC6160, (Object) null);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C21825 m52439(AbstractC16579 abstractC16579) {
        AbstractC6160 abstractC6160 = this.f76935;
        abstractC6160.getClass();
        return (C21825) abstractC16579.mo1928(abstractC6160, (Object) null);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C21825 m52356(AbstractC16579 abstractC16579) {
        return (C21825) this.f76950.m17162(abstractC16579);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52389(AbstractC0618 abstractC0618, AbstractC0618 abstractC0619) {
        Iterator it = m52439(abstractC0619.f77449).iterator();
        while (it.hasNext()) {
            if (abstractC0618 == ((AbstractC16579) it.next()).f53222) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m52435(AbstractC16579 abstractC16579) {
        HashMap map = this.f76957;
        Boolean boolValueOf = (Boolean) map.get(abstractC16579);
        if (boolValueOf == null) {
            boolean z = false;
            if (!abstractC16579.mo1926()) {
                if (abstractC16579.mo1936() || (m52432(abstractC16579) != AbstractC16579.f53219 && m52435(m52432(abstractC16579)))) {
                    z = true;
                } else {
                    C21825 c21825M52439 = m52439(abstractC16579);
                    while (c21825M52439.m48595() && !m52435((AbstractC16579) c21825M52439.f70876)) {
                        c21825M52439 = c21825M52439.f70877;
                    }
                    if (c21825M52439.m48595()) {
                        z = true;
                    }
                }
            }
            boolValueOf = Boolean.valueOf(z);
            map.put(abstractC16579, boolValueOf);
        }
        return boolValueOf.booleanValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52388(C22929 c22929, C21825 c21825, boolean z) {
        AbstractC16579 abstractC16579M52384;
        if (c21825.f70877.isEmpty()) {
            abstractC16579M52384 = (AbstractC16579) c21825.f70876;
        } else {
            abstractC16579M52384 = m52384(c21825, z);
        }
        c22929.mo18111(abstractC16579M52384);
        c22929.f74535 = -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m52381(C22929 c22929) {
        if (c22929.mo18112().m39001(EnumC6617.NONE)) {
            return C21825.m48588();
        }
        if (c22929.mo18112().mo1926() || !c22929.mo18112().mo12731()) {
            return C21825.of((Object) c22929.mo18112());
        }
        if ((m52402(c22929).f53222.mo20276() & 512) == 0) {
            return m52439(c22929).m48597(m52432(c22929));
        }
        return m52439(c22929);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m52359(AbstractC16579 abstractC16579) {
        return (AbstractC16579) this.f76948.m17162(abstractC16579);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m52429(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710, boolean z) {
        return m52394(abstractC16579, abstractC165710, z) || m52394(abstractC16579, m52402(abstractC165710), z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52390(AbstractC0618 abstractC0618, AbstractC23903 abstractC23903) {
        Iterator it = this.f76937.f14275.f53222.mo20272().m9327(abstractC23903.f77453).iterator();
        while (it.hasNext()) {
            if (abstractC23903.mo42453((AbstractC23903) it.next(), abstractC0618, this, true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11521 m52367(C21825 c21825, AbstractC16579 abstractC16579, boolean z) {
        C21825 c21825Mo33523 = ((AbstractC23903) c21825.f70876).mo50006(this).mo33523();
        Iterator it = c21825.iterator();
        int i = 0;
        boolean z2 = false;
        while (true) {
            boolean z3 = true;
            if (it.hasNext()) {
                AbstractC23903 abstractC23903 = (AbstractC23903) it.next();
                if ((abstractC23903.mo20276() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) == 0 || (z && !m52401(c21825Mo33523, abstractC23903.mo50006(this).mo33523()))) {
                    return C11521.empty();
                }
                if (abstractC23903.f77449.m39001(EnumC6617.FORALL)) {
                    z2 = true;
                }
            } else {
                EnumC1220[] enumC1220ArrValues = EnumC1220.values();
                int length = enumC1220ArrValues.length;
                while (i < length) {
                    EnumC1220 enumC1220 = enumC1220ArrValues[i];
                    Iterator it2 = c21825.iterator();
                    while (it2.hasNext()) {
                        AbstractC23903 abstractC23904 = (AbstractC23903) it2.next();
                        AbstractC16579 abstractC16579M52409 = m52409(abstractC23904, abstractC16579);
                        C21825 c21825Mo33524 = abstractC16579M52409.mo33524();
                        Iterator it3 = c21825.iterator();
                        while (it3.hasNext()) {
                            AbstractC23903 abstractC23905 = (AbstractC23903) it3.next();
                            if (abstractC23904 != abstractC23905) {
                                AbstractC16579 abstractC16579M524010 = m52409(abstractC23905, abstractC16579);
                                if (m52429(abstractC16579M52409, abstractC16579M524010, z3) && enumC1220.mo4420(abstractC16579M52409, abstractC16579M524010, this)) {
                                    C21825 c21825Mo33525 = abstractC16579M524010.mo33524();
                                    EnumC6617 enumC6617 = EnumC6617.FORALL;
                                    if (!abstractC16579M52409.m39001(enumC6617) && z2) {
                                        c21825Mo33525 = m52424(c21825Mo33525);
                                    } else if (abstractC16579M52409.m39001(enumC6617)) {
                                        C6171.m17176(abstractC16579M524010.m39001(enumC6617));
                                        c21825Mo33525 = m52380(c21825Mo33525, abstractC16579M524010.mo1938(), abstractC16579M52409.mo1938());
                                    }
                                    c21825Mo33524 = this.f76942.m47331(c21825Mo33524, c21825Mo33525);
                                }
                            }
                            z3 = true;
                        }
                        if (c21825Mo33524 == abstractC16579M52409.mo33524()) {
                            return C11521.of(abstractC23904);
                        }
                        return C11521.of(new C17201(abstractC23904.mo20276(), abstractC23904.f77453, m52421(abstractC23904.f77449, c21825Mo33524), abstractC23904.f77448, abstractC23904));
                    }
                    i++;
                    z3 = true;
                }
                return C11521.empty();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18258 m52374(C18258 c18258, AbstractC0618 abstractC0618, boolean z, Predicate predicate) {
        return this.f76970.m10215(c18258, abstractC0618, z, predicate);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5227 m52366(AbstractC16579 abstractC16579, boolean z) {
        C11805 c11805 = this.f76952;
        c11805.getClass();
        C5227 c5227 = (C5227) abstractC16579.mo1928(c11805, (Object) null);
        C6171.m17172(c5227, new C21434(abstractC16579, 0));
        if (!z) {
            return c5227;
        }
        C13922 c13922 = new C13922(c5227.f11719);
        c13922.f45851 = c5227;
        return c13922;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18258 m52375(C22492 c22492) {
        try {
            return m52350(c22492, c22492);
        } catch (C4146 e) {
            AbstractC8774 abstractC8774 = this.f76953.m24141(c22492).f16296;
            abstractC8774.getClass();
            this.f76942.m47261(abstractC8774, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m52376(AbstractC16579 abstractC16579, C18258 c18258) {
        AbstractC23903 abstractC23903;
        AbstractC23903 abstractC23904;
        C18300 c18300 = this.f76936;
        C13638.requireNonNull(c18300);
        C21828 c21828 = new C21828(c18300, abstractC16579, c18258);
        WeakHashMap weakHashMap = c18300.f58387;
        C21825 c21825 = (C21825) weakHashMap.get(c21828);
        if (c21825 != null) {
            return c21825;
        }
        C2631 c2631 = new C2631(this, c18258, abstractC16579);
        C21825<C18258> c21825M48588 = C21825.m48588();
        for (AbstractC23903 abstractC23905 : m52366(abstractC16579, false).mo3802(c2631, EnumC10167.RECURSIVE)) {
            if (!abstractC16579.f53222.m52721() && !abstractC23905.f77448.m52721()) {
                return C21825.of(abstractC23905);
            }
            if (!c21825M48588.contains(abstractC23905)) {
                c21825M48588 = c21825M48588.m48597((C18258) abstractC23905);
            }
        }
        C19003 c19003 = new C19003();
        for (C18258 c18259 : c21825M48588) {
            Iterator it = c21825M48588.iterator();
            while (true) {
                if (it.hasNext()) {
                    C18258 c182510 = (C18258) it.next();
                    if (c18259 != c182510 && (abstractC23903 = c182510.f77448) != (abstractC23904 = c18259.f77448) && m52423(abstractC23904, abstractC23903.f77449) != null) {
                        break;
                    }
                } else {
                    c19003.m43723(c18259);
                    break;
                }
            }
        }
        C21825 c21825M43726 = c19003.m43726();
        weakHashMap.put(c21828, c21825M43726);
        return c21825M43726;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m52365(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710) {
        boolean zM52394 = m52394(abstractC16579, abstractC165710, true);
        C10391 c10391 = this.f76946;
        if (zM52394) {
            C21825 c21825Mo1938 = abstractC16579.mo1938();
            return m52393(abstractC16579.mo16235(), m52371(abstractC165710.mo16235(), abstractC165710.mo1938(), c21825Mo1938), c10391);
        }
        return m52393(abstractC16579.mo16235(), m52402(abstractC165710.mo16235()), c10391);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m52417(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710) {
        return m52394(abstractC16579, abstractC165710, true) || m52394(abstractC16579, m52402(abstractC165710), true) || m52394(m52402(abstractC16579), abstractC165710, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52394(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710, boolean z) {
        return ((Boolean) (z ? this.f76964 : this.f76971).m20360(abstractC165710, abstractC16579)).booleanValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m52380(C21825 c21825, C21825 c21826, C21825 c21827) {
        return c21825.m48592((Function) new C19566(this, c21826, c21827));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m52371(AbstractC16579 abstractC16579, C21825 c21825, C21825 c21826) {
        C19566 c19566 = new C19566(this, c21825, c21826);
        abstractC16579.getClass();
        return (AbstractC16579) c19566.m20360(null, abstractC16579);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21825 m52425(C21825 c21825, C21825 c21826, C21825 c21827) {
        if (!c21825.isEmpty()) {
            C19003 c19003 = new C19003();
            Iterator it = c21825.iterator();
            boolean z = false;
            while (it.hasNext()) {
                C22929 c22929 = (C22929) ((AbstractC16579) it.next());
                AbstractC16579 abstractC16579M52371 = m52371(c22929.mo18112(), c21826, c21827);
                if (abstractC16579M52371 != c22929.mo18112()) {
                    z = true;
                }
                c19003.m43723(abstractC16579M52371);
            }
            if (z) {
                C19003 c19004 = new C19003();
                Iterator it2 = c21825.iterator();
                while (it2.hasNext()) {
                    AbstractC16579 abstractC16579 = (AbstractC16579) it2.next();
                    c19004.m43723(new C22929(abstractC16579.f53222, null, this.f76937.f14228, abstractC16579.f53221));
                }
                C21825 c21825M43726 = c19004.m43726();
                for (C21825 c21825M43727 = c19003.m43726(); !c21825M43727.isEmpty(); c21825M43727 = c21825M43727.f70877) {
                    c21825M43727.f70876 = m52371((AbstractC16579) c21825M43727.f70876, c21825, c21825M43726);
                }
                C21825 c21825M43728 = c19003.m43726();
                Iterator it3 = c19004.m43726().iterator();
                while (it3.hasNext()) {
                    ((C22929) ((AbstractC16579) it3.next())).mo18111((AbstractC16579) c21825M43728.f70876);
                    c21825M43728 = c21825M43728.f70877;
                }
                return c19004.m43726();
            }
        }
        return c21825;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52391(C10894 c10894, C10894 c10895) {
        C21825 c21825 = c10894.f37076;
        C21825 c21826 = c10895.f37076;
        C21825 c21827 = c21825;
        while (c21827.m48595() && c21826.m48595() && m52399(((AbstractC16579) c21827.f70876).mo18112(), m52371(((AbstractC16579) c21826.f70876).mo18112(), c10895.f37076, c21825))) {
            c21827 = c21827.f70877;
            c21826 = c21826.f70877;
        }
        return c21827.isEmpty() && c21826.isEmpty();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C21825 m52357(C21825 c21825) {
        C21825 c21825M48592 = c21825.m48592((Function) f76933);
        for (C21825 c21826 = c21825M48592; c21826.m48595(); c21826 = c21826.f70877) {
            C22929 c22929 = (C22929) c21826.f70876;
            c22929.mo18111(m52371(c22929.mo18112(), c21825, c21825M48592));
        }
        return c21825M48592;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m52370(AbstractC16579 abstractC16579, C21825 c21825) {
        return (AbstractC16579) abstractC16579.mo1928(this.f76944, c21825);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m52421(AbstractC16579 abstractC16579, C21825 c21825) {
        return (AbstractC16579) abstractC16579.mo1928(this.f76956, c21825);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m52407(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710) {
        return (AbstractC16579) abstractC16579.mo1928(this.f76961, abstractC165710);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C5954 m52440(AbstractC16579 abstractC16579) {
        return new C5954(abstractC16579, this.f76937.f14276);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5954 m52331(AbstractC11242 abstractC11242, AbstractC0618 abstractC0618, AbstractC16579 abstractC16579) {
        return new C5954(new C22492(1073741833L, abstractC11242, null, abstractC0618), abstractC16579);
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int m52403(AbstractC16579 abstractC16579) {
        int i = C14068.f46214[abstractC16579.mo1933().ordinal()];
        if (i == 2) {
            C0309 c0309 = (C0309) abstractC16579;
            if (c0309.f1656 < 0) {
                if (c0309.f53222.mo20270() == this.f76940.f77535) {
                    c0309.f1656 = 0;
                } else {
                    int iM52403 = m52403(m52432(c0309));
                    for (C21825 c21825M52439 = m52439(c0309); c21825M52439.m48595(); c21825M52439 = c21825M52439.f70877) {
                        if (m52403((AbstractC16579) c21825M52439.f70876) > iM52403) {
                            iM52403 = m52403((AbstractC16579) c21825M52439.f70876);
                        }
                    }
                    c0309.f1656 = iM52403 + 1;
                }
            }
            return c0309.f1656;
        }
        if (i != 12) {
            if (i == 15 || i == 16) {
                return 0;
            }
            throw new AssertionError();
        }
        C22929 c22929 = (C22929) abstractC16579;
        if (c22929.f74535 < 0) {
            int iM52404 = m52403(m52432(c22929));
            for (C21825 c21825M524310 = m52439(c22929); c21825M524310.m48595(); c21825M524310 = c21825M524310.f70877) {
                if (m52403((AbstractC16579) c21825M524310.f70876) > iM52404) {
                    iM52404 = m52403((AbstractC16579) c21825M524310.f70876);
                }
            }
            c22929.f74535 = iM52404 + 1;
        }
        return c22929.f74535;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C21825 m52398(AbstractC16579 abstractC16579) {
        HashMap map = this.f76975;
        C21825 c21825M52398 = (C21825) map.get(abstractC16579);
        if (c21825M52398 == null) {
            AbstractC16579 abstractC16579M52432 = m52432(abstractC16579);
            boolean zMo12731 = abstractC16579.mo12731();
            C22846 c22846 = this.f76945;
            if (!zMo12731) {
                if (!abstractC16579M52432.m39001(EnumC6617.CLASS)) {
                    if (abstractC16579M52432.m39001(EnumC6617.TYPEVAR)) {
                        c21825M52398 = m52398(abstractC16579M52432).m48597(abstractC16579);
                    } else {
                        c21825M52398 = C21825.of((Object) abstractC16579);
                    }
                } else {
                    c21825M52398 = m52378(m52398(abstractC16579M52432), abstractC16579, c22846);
                }
            } else {
                c21825M52398 = m52398(m52432(abstractC16579));
            }
            for (C21825 c21825M52439 = m52439(abstractC16579); c21825M52439.m48595(); c21825M52439 = c21825M52439.f70877) {
                c21825M52398 = m52379(c21825M52398, m52398((AbstractC16579) c21825M52439.f70876), c22846);
            }
            map.put(abstractC16579, c21825M52398);
        }
        return c21825M52398;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m52378(C21825 c21825, AbstractC16579 abstractC16579, BiPredicate biPredicate) {
        if (c21825.isEmpty()) {
            return c21825.m48597(abstractC16579);
        }
        if (biPredicate.test(abstractC16579, (AbstractC16579) c21825.f70876)) {
            return c21825;
        }
        if (abstractC16579.f53222.m2881(((AbstractC16579) c21825.f70876).f53222, this)) {
            return c21825.m48597(abstractC16579);
        }
        return m52378(c21825.f70877, abstractC16579, biPredicate).m48597((AbstractC16579) c21825.f70876);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m52379(C21825 c21825, C21825 c21826, BiPredicate biPredicate) {
        if (c21825.isEmpty()) {
            return c21826;
        }
        if (c21826.isEmpty()) {
            return c21825;
        }
        if (biPredicate.test((AbstractC16579) c21825.f70876, (AbstractC16579) c21826.f70876)) {
            return m52379(c21825.f70877, c21826.f70877, biPredicate).m48597((AbstractC16579) c21825.f70876);
        }
        if (((AbstractC16579) c21826.f70876).f53222.m2881(((AbstractC16579) c21825.f70876).f53222, this)) {
            return m52379(c21825, c21826.f70877, biPredicate).m48597((AbstractC16579) c21826.f70876);
        }
        return m52379(c21825.f70877, c21826, biPredicate).m48597((AbstractC16579) c21825.f70876);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C21825 m52441(C21825 c21825, C21825 c21826) {
        return m52379(c21825, c21826, this.f76945);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C21825 m52362(C21825 c21825, C21825 c21826) {
        C0350 c0350;
        if (c21825 == c21826) {
            return c21825;
        }
        if (c21825.isEmpty() || c21826.isEmpty()) {
            return C21825.m48588();
        }
        if (((AbstractC16579) c21825.f70876).f53222.m2881(((AbstractC16579) c21826.f70876).f53222, this)) {
            return m52362(c21825.f70877, c21826);
        }
        if (((AbstractC16579) c21826.f70876).f53222.m2881(((AbstractC16579) c21825.f70876).f53222, this)) {
            return m52362(c21825, c21826.f70877);
        }
        if (m52399((AbstractC16579) c21825.f70876, (AbstractC16579) c21826.f70876)) {
            return m52362(c21825.f70877, c21826.f70877).m48597((AbstractC16579) c21825.f70876);
        }
        AbstractC16579 abstractC16579 = (AbstractC16579) c21825.f70876;
        if (abstractC16579.f53222 == ((AbstractC16579) c21826.f70876).f53222) {
            EnumC6617 enumC6617 = EnumC6617.CLASS;
            if (abstractC16579.m39001(enumC6617) && ((AbstractC16579) c21826.f70876).m39001(enumC6617)) {
                if (((AbstractC16579) c21825.f70876).mo1942() && ((AbstractC16579) c21826.f70876).mo1942()) {
                    AbstractC16579 abstractC165710 = (AbstractC16579) c21825.f70876;
                    AbstractC16579 abstractC165711 = (AbstractC16579) c21826.f70876;
                    C0309 c0309 = (C0309) abstractC165710;
                    C21825 c21825Mo1938 = c0309.mo1938();
                    C21825 c21825Mo1939 = ((C0309) abstractC165711).mo1938();
                    C19003 c19003 = new C19003();
                    C21825 c21825Mo19310 = c0309.f53222.f77449.mo1938();
                    while (c21825Mo1938.m48595() && c21825Mo1939.m48595() && c21825Mo19310.m48595()) {
                        if (m52427((AbstractC16579) c21825Mo1938.f70876, (AbstractC16579) c21825Mo1939.f70876)) {
                            c19003.m43723((AbstractC16579) c21825Mo1938.f70876);
                        } else {
                            if (m52427((AbstractC16579) c21825Mo1939.f70876, (AbstractC16579) c21825Mo1938.f70876)) {
                                c19003.m43723((AbstractC16579) c21825Mo1939.f70876);
                            } else {
                                C7571 c7571 = new C7571(abstractC165710, abstractC165711, this);
                                HashSet hashSet = this.f76941;
                                boolean zAdd = hashSet.add(c7571);
                                C3836 c3836 = this.f76937;
                                if (zAdd) {
                                    c0350 = new C0350(m52373(m52415((AbstractC16579) c21825Mo1938.f70876), m52415((AbstractC16579) c21825Mo1939.f70876)), EnumC15395.EXTENDS, c3836.f14239);
                                    hashSet.remove(c7571);
                                } else {
                                    c0350 = new C0350(c3836.f14275, EnumC15395.UNBOUND, c3836.f14239);
                                }
                                c0350.mo2035((AbstractC16579) c21825Mo19310.f70876);
                                c19003.m43723(c0350);
                            }
                            c21825Mo1938 = c21825Mo1938.f70877;
                            c21825Mo1939 = c21825Mo1939.f70877;
                            c21825Mo19310 = c21825Mo19310.f70877;
                            abstractC165710 = abstractC165710;
                        }
                        abstractC165710 = abstractC165710;
                        c21825Mo1938 = c21825Mo1938.f70877;
                        c21825Mo1939 = c21825Mo1939.f70877;
                        c21825Mo19310 = c21825Mo19310.f70877;
                        abstractC165710 = abstractC165710;
                    }
                    C6171.m17176(c21825Mo1938.isEmpty() && c21825Mo1939.isEmpty() && c21825Mo19310.isEmpty());
                    return m52362(c21825.f70877, c21826.f70877).m48597(new C0309(c0309.f53222, c0309.mo1934(), c19003.m43726()));
                }
                if (((AbstractC16579) c21825.f70876).mo1936() || ((AbstractC16579) c21826.f70876).mo1936()) {
                    return m52362(c21825.f70877, c21826.f70877).m48597(m52402((AbstractC16579) c21825.f70876));
                }
            }
        }
        return m52362(c21825.f70877, c21826.f70877);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C21825 m52347(C21825 c21825) {
        C19003 c19003 = new C19003();
        C19003 c19004 = new C19003();
        HashSet hashSet = new HashSet();
        while (!c21825.isEmpty()) {
            AbstractC16579 abstractC16579 = (AbstractC16579) c21825.f70876;
            boolean zContains = hashSet.contains(abstractC16579);
            boolean z = !zContains;
            if (!zContains && abstractC16579.m39001(EnumC6617.TYPEVAR)) {
                Iterator it = c21825.f70877.iterator();
                while (it.hasNext()) {
                    if (m52413((AbstractC16579) it.next(), abstractC16579, false)) {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                if (abstractC16579.mo16236()) {
                    c19004.m43723(abstractC16579);
                } else {
                    c19003.m43723(abstractC16579);
                }
                for (AbstractC16579 abstractC165710 : c21825.f70877) {
                    if (m52413(abstractC16579, abstractC165710, false)) {
                        hashSet.add(abstractC165710);
                    }
                }
            }
            c21825 = c21825.f70877;
        }
        c19003.m43724(c19004);
        return c19003.m43726();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m52397(C21825 c21825) {
        return m52373((AbstractC16579[]) c21825.toArray(new AbstractC16579[c21825.m48596()]));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m52373(AbstractC16579... abstractC16579Arr) {
        int[] iArr = new int[abstractC16579Arr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = abstractC16579Arr.length;
            C3836 c3836 = this.f76937;
            if (i >= length) {
                if (i2 == 0) {
                    return c3836.f14228;
                }
                if (i2 == 1) {
                    AbstractC16579[] abstractC16579Arr2 = new AbstractC16579[abstractC16579Arr.length];
                    for (int i3 = 0; i3 < abstractC16579Arr.length; i3++) {
                        AbstractC16579 abstractC16579M13122 = this.f76951.m13122(abstractC16579Arr[i3]);
                        abstractC16579Arr2[i3] = abstractC16579M13122;
                        if (abstractC16579M13122.mo9481()) {
                            AbstractC16579 abstractC16579 = abstractC16579Arr[0];
                            for (int i4 = 1; i4 < abstractC16579Arr.length; i4++) {
                                if (!m52399(abstractC16579, abstractC16579Arr[i4])) {
                                    return m52349();
                                }
                            }
                            return abstractC16579;
                        }
                    }
                    return new C8777(m52373(abstractC16579Arr2), c3836.f14258);
                }
                if (i2 == 2) {
                    int i5 = 0;
                    for (AbstractC16579 abstractC165710 : abstractC16579Arr) {
                        if (abstractC165710.m39001(EnumC6617.CLASS) || abstractC165710.m39001(EnumC6617.TYPEVAR)) {
                            break;
                        }
                        i5++;
                    }
                    C6171.m17176(i5 < abstractC16579Arr.length);
                    C21825 c21825M52364 = m52364(abstractC16579Arr[i5]);
                    int i6 = i5 + 1;
                    for (int i7 = i6; i7 < abstractC16579Arr.length; i7++) {
                        AbstractC16579 abstractC165711 = abstractC16579Arr[i7];
                        if (abstractC165711.m39001(EnumC6617.CLASS) || abstractC165711.m39001(EnumC6617.TYPEVAR)) {
                            c21825M52364 = m52362(c21825M52364, m52364(abstractC165711));
                        }
                    }
                    C21825<AbstractC16579> c21825M52347 = m52347(c21825M52364);
                    C21825 c21825M48588 = C21825.m48588();
                    for (AbstractC16579 abstractC165712 : c21825M52347) {
                        C21825 c21825Of = C21825.of((Object) m52423(abstractC165712.f53222, abstractC16579Arr[i5]));
                        for (int i8 = i6; i8 < abstractC16579Arr.length; i8++) {
                            AbstractC16579 abstractC16579M52423 = m52423(abstractC165712.f53222, abstractC16579Arr[i8]);
                            c21825Of = m52362(c21825Of, abstractC16579M52423 != null ? C21825.of((Object) abstractC16579M52423) : C21825.m48588());
                        }
                        c21825M48588.getClass();
                        c21825M48588 = c21825Of.m48594(c21825M48588);
                    }
                    if (c21825M48588.isEmpty()) {
                        return c3836.f14275;
                    }
                    C21825 c21825M52348 = m52347(c21825M48588);
                    if (c21825M52348.isEmpty()) {
                        return null;
                    }
                    if (c21825M52348.f70877.isEmpty()) {
                        return (AbstractC16579) c21825M52348.f70876;
                    }
                    return m52442(c21825M52348);
                }
                C21825 c21825Of2 = C21825.of((Object) m52349());
                for (int i9 = 0; i9 < abstractC16579Arr.length; i9++) {
                    if (iArr[i9] != 1) {
                        c21825Of2 = c21825Of2.m48597(abstractC16579Arr[i9]);
                    }
                }
                return m52397(c21825Of2);
            }
            AbstractC16579 abstractC16579Mo18112 = abstractC16579Arr[i];
            int i10 = C14068.f46214[abstractC16579Mo18112.mo1933().ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 12) {
                        do {
                            abstractC16579Mo18112 = abstractC16579Mo18112.mo18112();
                        } while (abstractC16579Mo18112.m39001(EnumC6617.TYPEVAR));
                        if (abstractC16579Mo18112.m39001(EnumC6617.ARRAY)) {
                            iArr[i] = 1;
                        } else {
                            iArr[i] = 2;
                        }
                    } else {
                        iArr[i] = 0;
                        if (abstractC16579Mo18112.mo9481()) {
                            return c3836.f14261;
                        }
                    }
                    i++;
                } else {
                    iArr[i] = 2;
                }
                i2 |= 2;
                i++;
            } else {
                iArr[i] = 1;
            }
            i2 |= 1;
            i++;
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C21825 m52364(AbstractC16579 abstractC16579) {
        C19003 c19003 = new C19003();
        for (AbstractC16579 abstractC165710 : m52398(abstractC16579)) {
            if (abstractC165710.m39001(EnumC6617.TYPEVAR)) {
                c19003.m43723(abstractC165710);
            } else {
                c19003.m43723(m52402(abstractC165710));
            }
        }
        return c19003.m43726();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC16579 m52349() {
        if (this.f76960 == null) {
            C3836 c3836 = this.f76937;
            this.f76960 = m52384(C21825.of((Object) c3836.f14268, (Object) c3836.f14286), true);
        }
        return this.f76960;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m52361(C21825 c21825) {
        AbstractC16579 abstractC16579M52360 = (AbstractC16579) c21825.f70876;
        for (AbstractC16579 abstractC16579 : c21825.f70877) {
            if (abstractC16579M52360.mo1926()) {
                return abstractC16579M52360;
            }
            abstractC16579M52360 = m52360(abstractC16579M52360, abstractC16579);
        }
        return abstractC16579M52360;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m52360(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710) {
        if (abstractC165710 == null) {
            return abstractC16579;
        }
        boolean zMo9481 = abstractC16579.mo9481();
        C3836 c3836 = this.f76937;
        if (!zMo9481 && !abstractC165710.mo9481()) {
            int i = 0;
            if (m52413(abstractC16579, abstractC165710, false)) {
                return abstractC16579;
            }
            if (m52413(abstractC165710, abstractC16579, false)) {
                return abstractC165710;
            }
            C21825<AbstractC16579> c21825M52347 = m52347(m52379(m52398(abstractC16579), m52398(abstractC165710), this.f76945));
            if (c21825M52347.isEmpty()) {
                return c3836.f14275;
            }
            if (c21825M52347.f70877.isEmpty()) {
                return (AbstractC16579) c21825M52347.f70876;
            }
            C21825 c21825M48588 = C21825.m48588();
            C21825 c21825M48589 = C21825.m48588();
            for (AbstractC16579 abstractC165711 : c21825M52347) {
                if (!abstractC165711.mo16236()) {
                    i++;
                    AbstractC16579 abstractC16579M52352 = m52352(abstractC165711);
                    if (abstractC165711 != abstractC16579M52352 && !abstractC16579M52352.m39001(EnumC6617.BOT)) {
                        c21825M48588 = c21825M48588.m48591(abstractC165711);
                        c21825M48589 = c21825M48589.m48591(abstractC16579M52352);
                    }
                }
            }
            if (i > 1) {
                if (c21825M48589.isEmpty()) {
                    return m52440(abstractC16579);
                }
                C21825 c21825M48593 = c21825M52347.m48593(c21825M48588);
                c21825M48593.getClass();
                return m52361(c21825M48589.m48594(c21825M48593));
            }
            return m52442(c21825M52347);
        }
        return c3836.f14261;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m52345(AbstractC16579 abstractC16579) {
        C2071 c2071 = f76932;
        c2071.getClass();
        return ((Integer) abstractC16579.mo1928(c2071, (Object) null)).intValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52393(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710, C10391 c10391) {
        if (m52399(abstractC16579, abstractC165710)) {
            return true;
        }
        return (abstractC16579.mo9481() || abstractC165710.mo9481() || !m52428(abstractC16579, abstractC165710, c10391)) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22492 m52383(AbstractC16579 abstractC16579) {
        C3836 c3836 = this.f76937;
        return c3836.m11148(c3836.f14235, c3836.f14300[abstractC16579.mo1933().ordinal()]);
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m52437(AbstractC16579 abstractC16579) {
        if (abstractC16579.m39001(EnumC6617.ERROR)) {
            return AbstractC16579.f53219;
        }
        int i = 0;
        while (true) {
            C3836 c3836 = this.f76937;
            AbstractC11242[] abstractC11242Arr = c3836.f14300;
            if (i < abstractC11242Arr.length) {
                AbstractC11242 abstractC11242 = abstractC11242Arr[i];
                if (abstractC11242 != null && m52423(c3836.m11148(c3836.f14235, abstractC11242), abstractC16579) != null) {
                    return c3836.f14282[i];
                }
                i++;
            } else {
                return AbstractC16579.f53219;
            }
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m52355(AbstractC16579 abstractC16579) {
        AbstractC16579 abstractC16579M52437 = m52437(abstractC16579);
        return abstractC16579M52437.m39001(EnumC6617.NONE) ? abstractC16579 : abstractC16579M52437;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m52419(AbstractC16579 abstractC16579) {
        C3836 c3836;
        AbstractC16579 abstractC16579M52419;
        if (!abstractC16579.m39001(EnumC6617.CLASS)) {
            return abstractC16579;
        }
        if (abstractC16579.mo1934() != AbstractC16579.f53219 && (abstractC16579M52419 = m52419(abstractC16579.mo1934())) != abstractC16579.mo1934()) {
            abstractC16579 = m52371(m52409(abstractC16579.f53222, abstractC16579M52419), abstractC16579.f53222.f77449.mo1938(), abstractC16579.mo1938());
        }
        C0309 c0309 = (C0309) abstractC16579;
        if (c0309.mo1936() || !c0309.mo1942()) {
            return c0309;
        }
        C21825 c21825Mo1938 = ((C0309) c0309.f53222.f77449).mo1938();
        C21825 c21825Mo1939 = c0309.mo1938();
        C19003 c19003 = new C19003();
        Iterator it = c21825Mo1939.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c3836 = this.f76937;
            if (!zHasNext) {
                break;
            }
            AbstractC16579 abstractC165710 = (AbstractC16579) it.next();
            if (abstractC165710.m39001(EnumC6617.WILDCARD)) {
                C0350 c0350 = (C0350) abstractC165710;
                AbstractC16579 abstractC165711 = c0350.f1776 == EnumC15395.EXTENDS ? c0350.f1774 : null;
                if (abstractC165711 == null) {
                    abstractC165711 = c3836.f14275;
                }
                c19003.m43723(new C20771(this.f76958, c3836.f14243, abstractC165711, c3836.f14228, c0350));
            } else {
                c19003.m43723(abstractC165710);
            }
        }
        C21825 c21825M43726 = c19003.m43726();
        boolean z = false;
        C21825 c21825 = c21825Mo1938;
        C21825 c21826 = c21825M43726;
        while (!c21825.isEmpty() && !c21825Mo1939.isEmpty() && !c21826.isEmpty()) {
            Object obj = c21826.f70876;
            Object obj2 = c21825Mo1939.f70876;
            if (obj != obj2) {
                C0350 c0351 = (C0350) obj2;
                AbstractC16579 abstractC16579Mo18112 = ((AbstractC16579) c21825.f70876).mo18112();
                C20771 c20771 = (C20771) c21826.f70876;
                if (abstractC16579Mo18112 == null) {
                    abstractC16579Mo18112 = c3836.f14275;
                }
                int[] iArr = C14068.f46212;
                EnumC15395 enumC15395 = c0351.f1776;
                EnumC15395 enumC15396 = c0351.f1776;
                int i = iArr[enumC15395.ordinal()];
                if (i == 1) {
                    c20771.mo18111(m52360(enumC15396 == EnumC15395.EXTENDS ? c0351.f1774 : null, m52371(abstractC16579Mo18112, c21825Mo1938, c21825M43726)));
                    c20771.f74536 = c3836.f14228;
                } else if (i == 2) {
                    c20771.mo18111(m52371(abstractC16579Mo18112, c21825Mo1938, c21825M43726));
                    c20771.f74536 = enumC15396 == EnumC15395.SUPER ? c0351.f1774 : null;
                } else if (i == 3) {
                    c20771.mo18111(m52371(abstractC16579Mo18112, c21825Mo1938, c21825M43726));
                    c20771.f74536 = c3836.f14228;
                }
                AbstractC16579 abstractC16579Mo18113 = c20771.mo18112();
                EnumC6617 enumC6617 = EnumC6617.UNDETVAR;
                AbstractC16579 abstractC16579Mo18114 = abstractC16579Mo18113.m39001(enumC6617) ? ((C10229) c20771.mo18112()).f53121 : c20771.mo18112();
                AbstractC16579 abstractC165712 = c20771.f74536.m39001(enumC6617) ? ((C10229) c20771.f74536).f53121 : c20771.f74536;
                AbstractC16579 abstractC16579Mo18115 = c20771.mo18112();
                EnumC6617 enumC6618 = EnumC6617.ERROR;
                if (!abstractC16579Mo18115.m39001(enumC6618) && !c20771.f74536.m39001(enumC6618) && m52399(abstractC16579Mo18114, abstractC165712)) {
                    c21826.f70876 = c20771.mo18112();
                }
                z = true;
            }
            c21825 = c21825.f70877;
            c21825Mo1939 = c21825Mo1939.f70877;
            c21826 = c21826.f70877;
        }
        if (c21825.isEmpty() && c21825Mo1939.isEmpty() && c21826.isEmpty()) {
            return z ? new C0309(c0309.mo1934(), c21825M43726, c0309.f53222, c0309.f53221) : abstractC16579;
        }
        return m52402(abstractC16579);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m52341(C23800 c23800, C0309 c0309, AbstractC16579 abstractC16579, C10391 c10391) {
        boolean z;
        AbstractC16579 abstractC165710;
        AbstractC16579 abstractC165711;
        if ((abstractC16579.f53222.mo20276() & 512) == 0) {
            C6171.m17176((c0309.f53222.mo20276() & 512) != 0);
            z = true;
            abstractC165710 = c0309;
            abstractC165711 = abstractC16579;
        } else {
            z = false;
            abstractC165711 = c0309;
            abstractC165710 = abstractC16579;
        }
        C21825 c21825M52354 = c23800.m52354(abstractC165710, c23800.m52402(abstractC165711));
        boolean zIsEmpty = c21825M52354.isEmpty();
        while (c21825M52354.m48595()) {
            AbstractC16579 abstractC16579M52423 = c23800.m52423(((AbstractC16579) c21825M52354.f70876).f53222, abstractC165711);
            AbstractC16579 abstractC165712 = (AbstractC16579) c21825M52354.f70876;
            if (c23800.m52414(abstractC16579M52423.mo1938(), abstractC165712.mo1938())) {
                return false;
            }
            zIsEmpty = zIsEmpty || (!z ? !c23800.m52344(abstractC16579M52423, abstractC165712) : !c23800.m52344(abstractC165712, abstractC16579M52423));
            c21825M52354 = c21825M52354.f70877;
        }
        if (zIsEmpty) {
            if (!z) {
                abstractC165711 = abstractC165710;
            }
            if (!c23800.m52436(abstractC165711)) {
                c10391.mo21748(EnumC0597.UNCHECKED);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m52351(C23800 c23800, C0309 c0309, AbstractC16579 abstractC16579, C10391 c10391) {
        AbstractC16579 abstractC165710;
        boolean z;
        AbstractC16579 abstractC165711;
        if ((abstractC16579.f53222.mo20276() & 512) == 0) {
            C6171.m17176((c0309.f53222.mo20276() & 512) != 0);
            abstractC165710 = c0309;
            abstractC165711 = abstractC16579;
            z = true;
        } else {
            abstractC165710 = abstractC16579;
            z = false;
            abstractC165711 = c0309;
        }
        C6171.m17176((abstractC165711.f53222.mo20276() & 16) != 0);
        AbstractC16579 abstractC16579M52423 = c23800.m52423(abstractC165710.f53222, abstractC165711);
        if (abstractC16579M52423 == null || c23800.m52414(abstractC16579M52423.mo1938(), abstractC165710.mo1938())) {
            return false;
        }
        if (!c23800.m52436(abstractC16579) && (!z ? c23800.m52344(abstractC16579M52423, abstractC165710) : c23800.m52344(abstractC165710, abstractC16579M52423))) {
            c10391.mo21748(EnumC0597.UNCHECKED);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean m52344(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710) {
        for (AbstractC16579 abstractC165711 : abstractC165710.mo12731() ? m52356(abstractC165710) : C21825.of((Object) abstractC165710)) {
            AbstractC16579 abstractC16579M52420 = m52420(abstractC16579, abstractC165711.f53222);
            if (abstractC165711.mo1942() && !m52405(abstractC165711) && !m52413(abstractC16579, abstractC165711, true) && (abstractC16579M52420 == null || !m52396(abstractC165711.mo1943(), abstractC16579M52420.mo1943()))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private C21825 m52354(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710) {
        C21825 c21825M48588 = C21825.m48588();
        for (C21825 c21825M52439 = m52439(abstractC16579); c21825M52439.m48595(); c21825M52439 = c21825M52439.f70877) {
            boolean zM52413 = m52413(abstractC165710, m52402((AbstractC16579) c21825M52439.f70876), true);
            C22846 c22846 = this.f76945;
            if (zM52413) {
                c21825M48588 = m52378(c21825M48588, (AbstractC16579) c21825M52439.f70876, c22846);
            } else {
                c21825M48588 = m52379(c21825M48588, m52354((AbstractC16579) c21825M52439.f70876, abstractC165710), c22846);
            }
        }
        return c21825M48588;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52387(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710, C19003 c19003, C19003 c19004) {
        C15479 c15479 = new C15479(this, c19003, c19004);
        abstractC16579.mo1928(c15479, abstractC165710);
        C21825 c21825M43726 = c15479.f50431.m43726();
        C21825 c21825M43727 = c15479.f50428.m43726();
        while (!c21825M43726.isEmpty()) {
            AbstractC16579 abstractC165711 = (AbstractC16579) c15479.f50427.get(((AbstractC16579) c21825M43726.f70876).f53222);
            if (c21825M43727.f70876 != abstractC165711) {
                c21825M43727.f70876 = abstractC165711;
            }
            c21825M43726 = c21825M43726.f70877;
            c21825M43727 = c21825M43727.f70877;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0350 m52330(C23800 c23800, AbstractC16579 abstractC16579, C22929 c22929) {
        C3836 c3836 = c23800.f76937;
        AbstractC16579 abstractC165710 = c3836.f14275;
        C22492 c22492 = c3836.f14239;
        if (abstractC16579 == abstractC165710) {
            return new C0350(c3836.f14275, EnumC15395.UNBOUND, c22492, c22929);
        }
        return new C0350(abstractC16579, EnumC15395.EXTENDS, c22492, c22929);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C0350 m52348(C23800 c23800, AbstractC16579 abstractC16579, C22929 c22929) {
        C3836 c3836 = c23800.f76937;
        if (abstractC16579.m39001(EnumC6617.BOT)) {
            return new C0350(c3836.f14275, EnumC15395.UNBOUND, c3836.f14239, c22929);
        }
        return new C0350(abstractC16579, EnumC15395.SUPER, c3836.f14239, c22929);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC1282 m52418(AbstractC0618 abstractC0618) {
        EnumC1282 enumC1282 = EnumC1282.CLASS;
        C11867 c11867M52702 = abstractC0618.m52702(this.f76937.f14252.f53222);
        if (c11867M52702 != null) {
            C23942 c23942 = this.f76940;
            AbstractC23156 abstractC23156M29574 = c11867M52702.m29574(c23942.f77643);
            if (abstractC23156M29574 != null && (abstractC23156M29574 instanceof C5516)) {
                AbstractC11242 abstractC11242 = ((C5516) abstractC23156M29574).f18928.f77453;
                if (abstractC11242 == c23942.f77566) {
                    return EnumC1282.SOURCE;
                }
                if (abstractC11242 != c23942.f77599 && abstractC11242 == c23942.f77604) {
                    return EnumC1282.RUNTIME;
                }
            }
        }
        return enumC1282;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m52368(InterfaceC7299 interfaceC7299) {
        int iMo1941 = interfaceC7299.mo1941();
        C3836 c3836 = this.f76937;
        switch (iMo1941) {
            case 3:
                return c3836.f14232;
            case 4:
                return c3836.f14256;
            case 5:
                return c3836.f14264;
            case 6:
                return c3836.f14291;
            case 7:
                return c3836.f14283;
            case 8:
                return c3836.f14220;
            default:
                switch (iMo1941) {
                    case 15:
                        return c3836.f14272;
                    case 16:
                        return c3836.f14295;
                    case 17:
                        return ((C23198) interfaceC7299).f77449;
                    default:
                        throw new AssertionError("Not a loadable constant: " + interfaceC7299.mo1941());
                }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52386() {
        this.f76967.f21328.clear();
        this.f76957.clear();
        this.f76970.f12778.clear();
        this.f76952.f39675.clear();
        this.f76975.clear();
    }
}
