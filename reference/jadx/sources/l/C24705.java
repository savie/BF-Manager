package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩻֨᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes.dex */
public final class C24705 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22092 f79928;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f79929;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f79932;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC19728 f79934;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C15846 f79936;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final C14764 f79947;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final C1083 f79958;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C1562 f79961;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final C15252 f79964;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C19991 f79965;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public static final C13477 f79925 = new C13477();

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public static final C13777 f79924 = new C2109();

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public static final C16761 f79923 = new C16761();

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public C14769 f79935 = C14769.m35543();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final AbstractC1584 f79940 = new C5838(this);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC1100 f79942 = new C20754(this);

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C5575 f79952 = new C5575(this);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Predicate f79950 = new C12549(this);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AbstractC5313 f79927 = new C6584(this);

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public AbstractC5313 f79941 = new C24484(this);

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AbstractC5313 f79953 = new C4346(this);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC5313 f79926 = new C14786(this);

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public AbstractC5313 f79959 = new C21500(this);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13777 f79954 = new C18516();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC1584 f79956 = new C8492();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C13777 f79945 = new C7001(this);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC1100 f79963 = new C13712(this);

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public AbstractC1100 f79939 = new C5092(this);

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C13777 f79966 = new C22246(this);

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public AbstractC1584 f79951 = new C11057(this);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC1584 f79955 = new C22992(this);

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final AbstractC1584 f79930 = new C20008(this);

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public HashMap f79938 = new HashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC1584 f79944 = new C15532(this);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C16015 f79960 = new C16015(this);

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C12286 f79937 = new C12286(this);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C10311 f79946 = new C10311(this);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC5313 f79949 = new C24967(this, true);

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public AbstractC5313 f79931 = new C24967(this, false);

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C23475 f79933 = new C11803();

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final C23475 f79943 = new C25230();

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final C23475 f79962 = new C16278();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public HashMap f79967 = new HashMap();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C18188 f79957 = new C18188();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public HashSet f79948 = new HashSet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22664 m55065(C24705 c24705, AbstractC22664 abstractC22664, boolean z, boolean z2) {
        c24705.getClass();
        return (AbstractC22664) abstractC22664.mo9324(new C7812(c24705, z, z2), (Object) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24705 m55066(C4747 c4747) {
        C24705 c24705 = (C24705) c4747.m14643(f79925);
        return c24705 == null ? new C24705(c4747) : c24705;
    }

    public C24705(C4747 c4747) {
        c4747.m14646(f79925, this);
        this.f79947 = C14764.m35506(c4747);
        C15252 c15252M36599 = C15252.m36599(c4747);
        this.f79964 = c15252M36599;
        EnumC20820 enumC20820M47625 = EnumC20820.m47625(c4747);
        this.f79932 = EnumC3666.f12542.m11915(enumC20820M47625);
        this.f79929 = EnumC3666.f12562.m11915(enumC20820M47625);
        this.f79928 = C22092.m49912(c4747);
        this.f79936 = C15846.m37791(c4747);
        AbstractC22712 abstractC22712 = c15252M36599.f49864;
        abstractC22712.getClass();
        char[] charArray = "<captured wildcard>".toCharArray();
        this.f79934 = abstractC22712.mo2069(charArray, charArray.length);
        C23721.m52973(c4747);
        this.f79965 = C19991.m45972(c4747);
        this.f79958 = new C1083(null);
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m55123(AbstractC22664 abstractC22664) {
        if (!abstractC22664.m51067(EnumC21172.WILDCARD)) {
            return abstractC22664;
        }
        C10729 c10729 = (C10729) abstractC22664;
        if (c10729.mo27320()) {
            C17969 c17969 = c10729.f34072;
            return c17969 == null ? this.f79947.f48286 : c17969.mo19992();
        }
        return m55123(c10729.f34074);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static AbstractC22664 m55074(AbstractC22664 abstractC22664) {
        if (!abstractC22664.m51067(EnumC21172.TYPEVAR)) {
            return abstractC22664;
        }
        C17969 c17969 = (C17969) abstractC22664;
        return c17969.mo34139() ? m55074(c17969.mo19992()) : c17969;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m55084(AbstractC22664 abstractC22664) {
        if (!abstractC22664.m51067(EnumC21172.WILDCARD)) {
            return abstractC22664;
        }
        C10729 c10729 = (C10729) abstractC22664;
        return c10729.mo27317() ? this.f79947.f48241 : m55084(c10729.f34074);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static AbstractC22664 m55078(AbstractC22664 abstractC22664) {
        return (abstractC22664.m51067(EnumC21172.TYPEVAR) && ((C17969) abstractC22664).mo34139()) ? m55078(abstractC22664.mo41925()) : abstractC22664;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m55161(AbstractC22664 abstractC22664, boolean z) {
        while (abstractC22664.m51067(EnumC21172.TYPEVAR)) {
            abstractC22664 = abstractC22664.mo19992();
        }
        return z ? m55158(abstractC22664) : abstractC22664;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m55127(AbstractC22664 abstractC22664, C14769 c14769) {
        C12770 c12770 = new C12770(this, c14769);
        EnumC0354 enumC0354 = EnumC0354.f1861;
        abstractC22664.getClass();
        return (AbstractC22664) abstractC22664.mo9324(c12770, enumC0354);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C14769 m55125(AbstractC22664 abstractC22664) {
        InterfaceC4764 c2854 = new C2854(this);
        HashSet hashSet = new HashSet();
        abstractC22664.mo9324(c2854, hashSet);
        return C14769.m35539((Iterable) hashSet);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m55133(AbstractC22664 abstractC22664) {
        AbstractC1584 abstractC1584 = this.f79940;
        abstractC1584.getClass();
        return ((Boolean) abstractC22664.mo9324(abstractC1584, (Object) null)).booleanValue();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m55160(AbstractC22664 abstractC22664, AbstractC22970 abstractC22970) {
        AbstractC1100 abstractC1100 = this.f79942;
        abstractC1100.getClass();
        return (AbstractC22664) abstractC22664.mo9324(abstractC1100, abstractC22970);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m55170(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665, C1083 c1083) {
        AbstractC22664 abstractC22664M55152;
        if (abstractC22664.m51067(EnumC21172.ERROR)) {
            return true;
        }
        boolean zMo40452 = abstractC22664.mo40452();
        if (zMo40452 == abstractC22665.mo40452()) {
            return m55150(abstractC22664, abstractC22665, c1083);
        }
        EnumC21172 enumC21172 = EnumC21172.UNDETVAR;
        boolean zM51067 = abstractC22664.m51067(enumC21172);
        boolean zM51068 = abstractC22665.m51067(enumC21172);
        if (!zM51067 && !zM51068) {
            if (zMo40452) {
                abstractC22664M55152 = m55108(abstractC22664).f38067;
            } else {
                abstractC22664M55152 = m55152(abstractC22664);
            }
            return m55131(abstractC22664M55152, abstractC22665, true);
        }
        if (zM51067) {
            if (abstractC22665.mo40452()) {
                abstractC22665 = m55108(abstractC22665).f38067;
            }
            return m55131(abstractC22664, abstractC22665, true);
        }
        if (abstractC22664.mo40452()) {
            abstractC22664 = m55108(abstractC22664).f38067;
        }
        return m55131(abstractC22664, abstractC22665, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC11781 m55092(AbstractC22970 abstractC22970) {
        return this.f79952.m16519(abstractC22970).f41712;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m55143(AbstractC22664 abstractC22664) {
        return this.f79952.m16519(abstractC22664.f73596).mo32454(abstractC22664);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14769 m55156(C24550 c24550) {
        boolean z;
        try {
            m55092((AbstractC22970) c24550);
            z = true;
        } catch (C11540 unused) {
            z = false;
        }
        C11972.m30026(z);
        AbstractC11781 abstractC11781M55092 = m55092((AbstractC22970) c24550);
        C24352 c24352M55106 = m55106(c24550.f38067, false);
        C18499 c18499 = new C18499();
        for (AbstractC11781 abstractC11781 : c24352M55106.mo7473(abstractC11781M55092.f38072, this.f79950, EnumC13908.RECURSIVE)) {
            if (abstractC11781 != abstractC11781M55092 && abstractC11781M55092.mo26689(abstractC11781, c24550, this, false)) {
                Iterator it = c18499.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c18499.m43089(abstractC11781);
                        break;
                    }
                    AbstractC11781 abstractC11782 = (AbstractC11781) it.next();
                    if (m55149(abstractC11782.mo29576(this), abstractC11781.mo29576(this)) || (abstractC11782.mo26689(abstractC11781, c24550, this, false) && (m55069(c24550, (AbstractC22970) abstractC11782.m29558()) || ((C10377) abstractC11781).m26688((C24550) abstractC11782.f38069, this) != null))) {
                        break;
                    }
                }
            }
        }
        return c18499.m43093();
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m55087(AbstractC22664 abstractC22664) {
        try {
            m55143(abstractC22664);
            return true;
        } catch (C11540 unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m55088(AbstractC22664 abstractC22664) {
        if (!C1170.stream(abstractC22664.mo15882()).anyMatch(new C7747())) {
            return abstractC22664;
        }
        C14769 c14769Mo15882 = abstractC22664.mo15882();
        C14769<AbstractC22664> c14769Mo15883 = abstractC22664.f73596.f38067.mo15882();
        C18499 c18499 = new C18499();
        for (AbstractC22664 abstractC22665 : c14769Mo15883) {
            AbstractC22664 abstractC22666 = (AbstractC22664) c14769Mo15882.f48335;
            AbstractC22664 abstractC22664Mo19992 = abstractC22665.mo19992();
            if (!((AbstractC22664) c14769Mo15882.f48335).m51067(EnumC21172.WILDCARD)) {
                c18499.m43089(abstractC22666);
            } else {
                C10729 c10729 = (C10729) abstractC22666;
                if (abstractC22664Mo19992.m51073(c14769Mo15883)) {
                    abstractC22664Mo19992 = c10729.f34074;
                } else {
                    int i = C3600.f12305[c10729.f34073.ordinal()];
                    if (i == 1) {
                        abstractC22664Mo19992 = m55169(abstractC22664Mo19992, c10729.f34074);
                    } else if (i == 2) {
                        abstractC22664Mo19992 = c10729.f34074;
                    } else if (i != 3) {
                        C11972.m30024("Cannot get here!");
                        throw null;
                    }
                }
                c18499.m43089(abstractC22664Mo19992);
            }
            c14769Mo15882 = c14769Mo15882.f48336;
        }
        return m55103(abstractC22664.f73596.f38067, c14769Mo15883, c18499.m43093());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24550 m55107(C3168 c3168, AbstractC19728 abstractC19728, AbstractC22664 abstractC22664, long j) {
        if (abstractC22664 == null) {
            return null;
        }
        C14764 c14764 = this.f79947;
        if (abstractC22664 == c14764.f48248) {
            return null;
        }
        AbstractC11781 abstractC11781M55092 = m55092(abstractC22664.f73596);
        AbstractC22664 abstractC22664M55143 = m55143(abstractC22664);
        C24550 c24550 = new C24550(j, abstractC19728, c3168.f10279.f26345.mo9564());
        c24550.f38070 = InterfaceC14852.f48554;
        c24550.f79576 = new C2175(c24550);
        c24550.f79576.mo7481(new C10377(abstractC11781M55092.mo29591(), abstractC11781M55092.f38072, abstractC22664M55143, c24550));
        C10510 c10510 = new C10510(c24550, AbstractC22664.f73590, C14769.m35543());
        c10510.f33442 = c14764.f48286;
        c10510.f33437 = abstractC22664 instanceof C1562 ? m55135(abstractC22664) : C14769.of((Object) abstractC22664);
        c24550.f38067 = c10510;
        c24550.f79584 = ((C24550) c24550.f38069).f79584;
        return c24550;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m55069(C24550 c24550, AbstractC22970 abstractC22970) {
        InterfaceC15976 interfaceC15976 = c24550.f79575;
        if (interfaceC15976 != null && interfaceC15976.mo10885() == EnumC17468.CLASS && this.f79936.m37793(c24550) == null) {
            return false;
        }
        if (c24550 == abstractC22970) {
            return true;
        }
        Iterator it = m55144(c24550.f38067).iterator();
        while (it.hasNext()) {
            if (m55069((C24550) ((AbstractC22664) it.next()).f73596, abstractC22970)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m55150(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665, C1083 c1083) {
        boolean zM55068 = m55068(abstractC22664, abstractC22665, true, c1083);
        if (zM55068) {
            m55077(abstractC22664, abstractC22665, c1083);
        }
        return zM55068;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m55068(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665, boolean z, C1083 c1083) {
        AbstractC22664 abstractC22664M55157;
        EnumC21172 enumC21172 = EnumC21172.ARRAY;
        if (abstractC22664.m51067(enumC21172) && abstractC22665.m51067(enumC21172)) {
            if (((C2832) abstractC22664).f9333.mo40452()) {
                return m55149(m55120(abstractC22664), m55120(abstractC22665));
            }
            return m55068(m55120(abstractC22664), m55120(abstractC22665), false, c1083);
        }
        if (m55131(abstractC22664, abstractC22665, z)) {
            return true;
        }
        if (abstractC22664.m51067(EnumC21172.TYPEVAR)) {
            return m55068(abstractC22664.mo19992(), abstractC22665, false, c1083);
        }
        if (abstractC22665.mo9328() || (abstractC22664M55157 = m55157(abstractC22665.f73596, abstractC22664)) == null || !abstractC22664M55157.mo9328()) {
            return false;
        }
        if (m55151(abstractC22665)) {
            c1083.m4082(EnumC19876.UNCHECKED);
            return true;
        }
        c1083.mo4085(EnumC19876.UNCHECKED);
        return true;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m55077(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665, C1083 c1083) {
        if (!abstractC22664.m51067(EnumC21172.ARRAY) || m55151(abstractC22664)) {
            return;
        }
        C2832 c2832 = (C2832) abstractC22664;
        int i = C3600.f12307[abstractC22665.mo9097().ordinal()];
        boolean z = false;
        if (i == 1) {
            z = (!(c2832 instanceof C9543) || (((C2832) abstractC22665) instanceof C9543) || m55151(c2832)) ? false : true;
        } else if (i == 2) {
            z = c2832 instanceof C9543;
        }
        if (z) {
            c1083.mo4085(EnumC19876.VARARGS);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m55131(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665, boolean z) {
        AbstractC22664 abstractC22664M55078;
        if (abstractC22664.m51074(abstractC22665)) {
            return true;
        }
        if (abstractC22665.mo18049()) {
            return m55141(abstractC22665, abstractC22664);
        }
        if (abstractC22665.mo18914()) {
            Iterator it = m55144(abstractC22665).m35552(m55137(abstractC22665)).iterator();
            while (it.hasNext()) {
                if (!m55131(abstractC22664, (AbstractC22664) it.next(), z)) {
                    return false;
                }
            }
            return true;
        }
        if (!abstractC22664.m51067(EnumC21172.UNDETVAR) && !abstractC22664.mo18914() && abstractC22665 != (abstractC22664M55078 = m55078(m55084(abstractC22665))) && !abstractC22664M55078.m51067(EnumC21172.BOT)) {
            if (z) {
                abstractC22664 = m55158(abstractC22664);
            }
            return m55131(abstractC22664, abstractC22664M55078, false);
        }
        if (z) {
            abstractC22664 = m55158(abstractC22664);
        }
        AbstractC5313 abstractC5313 = this.f79927;
        abstractC5313.getClass();
        return ((Boolean) abstractC22664.mo9324(abstractC5313, abstractC22665)).booleanValue();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m55141(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665) {
        int i = C3600.f12307[abstractC22664.mo9097().ordinal()];
        if (i != 16) {
            if (i != 17) {
                return m55131(abstractC22665, abstractC22664, true);
            }
            C8274 c8274 = (C8274) abstractC22664;
            if (abstractC22664 != abstractC22665 && c8274.f72657 != abstractC22665 && !abstractC22665.m51067(EnumC21172.ERROR) && !abstractC22665.m51067(EnumC21172.BOT)) {
                c8274.m22334(EnumC0816.f3093, abstractC22665, this);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m55148(C14769 c14769, C14769 c147610) {
        while (c14769.f48336 != null && c147610.f48336 != null && m55149((AbstractC22664) c14769.f48335, (AbstractC22664) c147610.f48335)) {
            c14769 = c14769.f48336;
            c147610 = c147610.f48336;
        }
        return c14769.f48336 == null && c147610.f48336 == null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m55113(C10377 c10377) {
        C14769 c14769Mo50621 = c10377.f38067.mo50621();
        if ((c10377.f38071 & 256) == 0) {
            return false;
        }
        AbstractC11781 abstractC11781 = c10377.f38069;
        C14764 c14764 = this.f79947;
        return (abstractC11781 == c14764.f48294.f73596 || abstractC11781 == c14764.f48322.f73596) && c14769Mo50621.m35551() == 1 && ((AbstractC22664) c14769Mo50621.f48335).m51067(EnumC21172.ARRAY) && ((C2832) c14769Mo50621.f48335).f9333.f73596 == c14764.f48286.f73596;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C10377 m55079(C24550 c24550, C24550 c24551) {
        C10377 c10377;
        C10377 c10377M55079 = null;
        if (c24551 != c24550) {
            c24551.mo29590();
            if ((c24551.f38071 & 1536) == 0) {
                return null;
            }
        }
        c24551.mo29590();
        for (AbstractC11781 abstractC11781 : c24551.f79576.mo7472((Predicate) null, EnumC13908.NON_RECURSIVE)) {
            if (abstractC11781.f38066 == EnumC13603.f43218 && (abstractC11781.mo29591() & 8796093023234L) == ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
                C10377 c10378 = (C10377) abstractC11781;
                C10377 c10377M26687 = c10378.m26687(c24550, this, true);
                if ((c10377M26687 == null || c10377M26687 == c10378) && this.f79932 && (c10377 = (C10377) m55098(c24550.f38067, c10378).f48335) != null && c10377.mo26689(c10378, c24550, this, true)) {
                    c10377M26687 = c10377;
                }
                if (c10377M26687 == null || c10377M26687 == c10378) {
                    c10377M55079 = c10378;
                    break;
                }
            }
        }
        if (c10377M55079 == null) {
            AbstractC22664 abstractC22664M55137 = m55137(c24551.f38067);
            if (abstractC22664M55137.m51067(EnumC21172.CLASS)) {
                c10377M55079 = m55079(c24550, (C24550) abstractC22664M55137.f73596);
            }
        }
        for (C14769 c14769M55144 = m55144(c24551.f38067); c10377M55079 == null && c14769M55144.m35550(); c14769M55144 = c14769M55144.f48336) {
            c10377M55079 = m55079(c24550, (C24550) ((AbstractC22664) c14769M55144.f48335).f73596);
        }
        return c10377M55079;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m55149(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665) {
        return ((Boolean) this.f79941.m34207(abstractC22665, abstractC22664)).booleanValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m55115(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665) {
        int i = C3600.f12307[abstractC22664.mo9097().ordinal()];
        if (i != 16) {
            if (i == 17) {
                if (abstractC22665.m51067(EnumC21172.WILDCARD)) {
                    C8274 c8274 = (C8274) abstractC22664;
                    int i2 = C3600.f12305[((C10729) abstractC22665).f34073.ordinal()];
                    if (i2 == 1) {
                        c8274.m22334(EnumC0816.f3091, m55123(abstractC22665), this);
                        return true;
                    }
                    if (i2 == 2) {
                        c8274.m22334(EnumC0816.f3093, m55084(abstractC22665), this);
                        return true;
                    }
                } else {
                    return m55149(abstractC22664, abstractC22665);
                }
            } else {
                return m55163(abstractC22665, abstractC22664);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m55114(C14769 c14769, C14769 c147610) {
        while (c14769.m35550() && c147610.m35550() && m55163((AbstractC22664) c14769.f48335, (AbstractC22664) c147610.f48335)) {
            c14769 = c14769.f48336;
            c147610 = c147610.f48336;
        }
        return c14769.isEmpty() && c147610.isEmpty();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m55163(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665) {
        return ((Boolean) this.f79953.m34207(abstractC22665, abstractC22664)).booleanValue();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m55162(C14769 c14769, C14769 c147610) {
        while (c14769.m35550() && c147610.m35550()) {
            AbstractC22664 abstractC22664 = (AbstractC22664) c14769.f48335;
            AbstractC22664 abstractC22665 = (AbstractC22664) c147610.f48335;
            if (!m55149(abstractC22664, abstractC22665) && (!m55163(abstractC22664, abstractC22665) || !m55163(abstractC22665, abstractC22664))) {
                break;
            }
            c14769 = c14769.f48336;
            c147610 = c147610.f48336;
        }
        return c14769.isEmpty() && c147610.isEmpty();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ba A[RETURN] */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m55130(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665, C1083 c1083) {
        boolean zBooleanValue;
        if (abstractC22664 != abstractC22665) {
            if (abstractC22664.mo40452() != abstractC22665.mo40452()) {
                AbstractC22664 abstractC22664M55161 = m55161(abstractC22664, false);
                if (!m55170(abstractC22664M55161, abstractC22665, c1083) && (!abstractC22665.mo40452() || !m55131(m55108(abstractC22665).f38067, abstractC22664M55161, true))) {
                    return false;
                }
            } else {
                C14769 c14769 = this.f79935;
                Object obj = c14769.f48335;
                AbstractC5313 abstractC5313 = this.f79926;
                if (c1083 != obj) {
                    try {
                        this.f79935 = c14769.m35552(c1083);
                        m55077(abstractC22664, abstractC22665, c1083);
                        abstractC5313.getClass();
                        zBooleanValue = ((Boolean) abstractC22664.mo9324(abstractC5313, abstractC22665)).booleanValue();
                        this.f79935 = this.f79935.f48336;
                    } catch (Throwable th) {
                        this.f79935 = this.f79935.f48336;
                        throw th;
                    }
                } else {
                    abstractC5313.getClass();
                    zBooleanValue = ((Boolean) abstractC22664.mo9324(abstractC5313, abstractC22665)).booleanValue();
                }
                if (zBooleanValue) {
                    EnumC21172 enumC21172 = EnumC21172.CLASS;
                    if (abstractC22664.m51067(enumC21172)) {
                        EnumC13603 enumC13603 = abstractC22664.f73596.f38066;
                        C22114 c22114 = C22114.f71269;
                        if (enumC13603.m33349(c22114) && abstractC22665.m51067(enumC21172) && abstractC22665.f73596.f38066.m33349(c22114) && (abstractC22664.f73596.m29562() || abstractC22665.f73596.m29562())) {
                            if (!abstractC22664.mo18914() && !abstractC22665.mo18914() && m55070((C24550) abstractC22664.f73596, (C24550) abstractC22665.f73596)) {
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
    public boolean m55070(C24550 c24550, C24550 c24551) {
        if (m55131(m55132(c24550.f38067), m55132(c24551.f38067), true)) {
            return false;
        }
        if (c24550.m29587() == c24551.m29587() && m55131(m55132(c24551.f38067), m55132(c24550.f38067), true)) {
            return false;
        }
        if (c24550.m29587() && !c24551.m29587()) {
            return m55070(c24551, c24550);
        }
        if (!c24550.m29587() && (c24550.f38071 & 16) != 0) {
            return true;
        }
        if (!c24550.m29562() && !c24551.m29562()) {
            return false;
        }
        C24550 c24552 = c24550.m29562() ? c24550 : c24551;
        if (c24552 == c24550) {
            c24550 = c24551;
        }
        return C1170.stream(c24552.f79583).allMatch(new C0289(0, this, c24550));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m55129(C14769 c14769, C14769 c147610) {
        while (c14769.f48336 != null && c147610.f48336 != null) {
            AbstractC22664 abstractC22664 = (AbstractC22664) c14769.f48335;
            AbstractC22664 abstractC22665 = (AbstractC22664) c147610.f48335;
            AbstractC5313 abstractC5313 = this.f79959;
            abstractC5313.getClass();
            if (((Boolean) abstractC22664.mo9324(abstractC5313, abstractC22665)).booleanValue()) {
                return true;
            }
            c14769 = c14769.f48336;
            c147610 = c147610.f48336;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m55093(C14769 c14769) {
        return c14769.m35547((Function) this.f79954);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m55136(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665) {
        boolean zM55131;
        if (abstractC22664 == abstractC22665) {
            return false;
        }
        EnumC21172 enumC21172 = EnumC21172.TYPEVAR;
        if (abstractC22664.m51067(enumC21172)) {
            AbstractC22664 abstractC22664Mo19992 = ((C17969) abstractC22664).mo19992();
            if (abstractC22665.m51067(enumC21172)) {
                abstractC22665 = (AbstractC22664) m55161(abstractC22665, false).mo9324(new C7812(this, true, true), (Object) null);
            }
            zM55131 = m55130(abstractC22664Mo19992, abstractC22665, this.f79958);
        } else {
            if (!abstractC22665.m51067(EnumC21172.WILDCARD)) {
                abstractC22665 = m55074(abstractC22665);
            }
            if (abstractC22665.m51067(enumC21172)) {
                abstractC22665 = (AbstractC22664) m55161(abstractC22665, false).mo9324(new C7812(this, true, true), (Object) null);
            }
            zM55131 = m55131(abstractC22664, abstractC22665, true);
        }
        return !zM55131;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m55151(AbstractC22664 abstractC22664) {
        return ((Boolean) this.f79956.m5601(abstractC22664)).booleanValue();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m55142(AbstractC22664 abstractC22664) {
        while (abstractC22664.m51067(EnumC21172.WILDCARD)) {
            abstractC22664 = m55123(abstractC22664);
        }
        return abstractC22664.m51067(EnumC21172.ARRAY);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m55120(AbstractC22664 abstractC22664) {
        int i = C3600.f12307[abstractC22664.mo9097().ordinal()];
        if (i == 1) {
            return ((C2832) abstractC22664).f9333;
        }
        if (i == 14) {
            return m55120(m55123(abstractC22664));
        }
        if (i == 16) {
            return abstractC22664;
        }
        if (i != 18) {
            return null;
        }
        return m55120(((C5291) abstractC22664).f72657);
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C2832 m55122(AbstractC22664 abstractC22664) {
        if (abstractC22664.m51067(EnumC21172.VOID) || abstractC22664.m51067(EnumC21172.PACKAGE)) {
            C11972.m30024("Type t must not be a VOID or PACKAGE type, " + abstractC22664.toString());
            throw null;
        }
        return new C2832(abstractC22664, this.f79947.f48271);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m55157(AbstractC11781 abstractC11781, AbstractC22664 abstractC22664) {
        AbstractC22664 abstractC22665 = abstractC11781.f38067;
        AbstractC22664 abstractC22666 = this.f79947.f48286;
        return abstractC22665 == abstractC22666 ? abstractC22666 : (AbstractC22664) this.f79963.m34207(abstractC11781, abstractC22664);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m55101(AbstractC11781 abstractC11781, AbstractC22664 abstractC22664) {
        int i = C3600.f12307[abstractC22664.mo9097().ordinal()];
        if (i == 1) {
            if (m55131(abstractC22664, abstractC11781.f38067, true)) {
                return abstractC11781.f38067;
            }
            return null;
        }
        if (i != 2) {
            if (i == 12) {
                return m55157(abstractC11781, abstractC22664);
            }
            if (i != 16) {
                return null;
            }
            return abstractC22664;
        }
        do {
            AbstractC22664 abstractC22664M55157 = m55157(abstractC11781, abstractC22664);
            if (abstractC22664M55157 != null) {
                return abstractC22664M55157;
            }
            abstractC22664 = abstractC22664.mo23449();
        } while (abstractC22664.m51067(EnumC21172.CLASS));
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m55104(AbstractC22664 abstractC22664, AbstractC22970 abstractC22970) {
        EnumC21172 enumC21172;
        int i = C3600.f12307[abstractC22664.mo9097().ordinal()];
        if (i == 1) {
            if (m55131(abstractC22664, abstractC22970.f38067, true)) {
                return abstractC22970.f38067;
            }
            return null;
        }
        if (i != 2) {
            if (i == 12) {
                return m55157(abstractC22970, abstractC22664);
            }
            if (i != 16) {
                return null;
            }
            return abstractC22664;
        }
        do {
            AbstractC22664 abstractC22664M55157 = m55157(abstractC22970, abstractC22664);
            if (abstractC22664M55157 != null) {
                return abstractC22664M55157;
            }
            AbstractC22664 abstractC22664Mo23449 = abstractC22664.mo23449();
            enumC21172 = EnumC21172.CLASS;
            if (abstractC22664Mo23449.m51067(enumC21172)) {
                abstractC22664 = abstractC22664Mo23449;
            } else {
                abstractC22664 = abstractC22664.f73596.f38069.m29558() != null ? abstractC22664.f73596.f38069.m29558().f38067 : AbstractC22664.f73590;
            }
        } while (abstractC22664.m51067(enumC21172));
        return null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m55126(AbstractC11781 abstractC11781, AbstractC22664 abstractC22664) {
        if ((abstractC11781.mo29591() & 8) != 0) {
            return abstractC11781.f38067;
        }
        return (AbstractC22664) this.f79939.m34207(abstractC11781, abstractC22664);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m55164(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665, C1083 c1083) {
        if (abstractC22664.m51067(EnumC21172.ERROR)) {
            return true;
        }
        if (abstractC22664.mo9097().m48309(EnumC21172.INT) && abstractC22664.mo39105() != null) {
            int iIntValue = ((Number) abstractC22664.mo39105()).intValue();
            int[] iArr = C3600.f12307;
            int i = iArr[abstractC22665.mo9097().ordinal()];
            if (i != 2) {
                if ((i == 3 || i == 4 || i == 5 || i == 6) && abstractC22665.mo9097().m48307(iIntValue)) {
                    return true;
                }
            } else {
                int i2 = iArr[m55152(abstractC22665).mo9097().ordinal()];
                if (i2 == 3 || i2 == 4 || i2 == 5) {
                    return m55164(abstractC22664, m55152(abstractC22665), c1083);
                }
            }
        }
        return m55170(abstractC22664, abstractC22665, c1083);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m55132(AbstractC22664 abstractC22664) {
        return (abstractC22664.mo40452() || this.f79947.f48282.f73596 == abstractC22664.f73596) ? abstractC22664 : m55075(abstractC22664, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractC22664 m55075(AbstractC22664 abstractC22664, boolean z) {
        if (abstractC22664.mo40452()) {
            return abstractC22664;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C13777 c13777 = this.f79966;
        c13777.getClass();
        return (AbstractC22664) abstractC22664.mo9324(c13777, boolValueOf);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14769 m55154(C14769 c14769) {
        return this.f79966.m33663(Boolean.FALSE, c14769);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m55173(AbstractC22664 abstractC22664) {
        return m55075(abstractC22664, true);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C14769 m55124(C14769 c14769) {
        return this.f79966.m33663(Boolean.TRUE, c14769);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C1562 m55138(C14769 c14769) {
        return m55089(c14769, ((AbstractC22664) c14769.f48335).f73596.m29587());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1562 m55089(C14769 c14769, boolean z) {
        AbstractC19728 abstractC19728M51194;
        AbstractC22664 abstractC22664M55132;
        C11972.m30026(c14769.m35550());
        AbstractC22664 abstractC22664 = (AbstractC22664) c14769.f48335;
        C14764 c14764 = this.f79947;
        if (z) {
            c14769 = c14769.m35552(c14764.f48286);
        }
        boolean z2 = AbstractC22664.f73593;
        C15252 c15252 = this.f79964;
        if (z2) {
            abstractC19728M51194 = c15252.f49864.m51194(c14769.m35545(","));
        } else {
            abstractC19728M51194 = c15252.f49799;
        }
        C24550 c24550 = new C24550(1090524161L, abstractC19728M51194, null, c14764.f48321);
        C1562 c1562 = new C1562(c24550, AbstractC22664.f73590, C14769.m35543());
        c1562.f5391 = z;
        c24550.mo29590();
        C11972.m30026((c24550.f38071 & 16777216) != 0);
        AbstractC22664 abstractC22665 = (AbstractC22664) c14769.f48335;
        c1562.f33442 = abstractC22665;
        c1562.f33437 = c14769.f48336;
        C11972.m30023(c1562.f33442, (abstractC22665.f73596.f38070.mo11630() && c1562.f33442.mo31586()) ? false : true);
        c24550.f38067 = c1562;
        if (((AbstractC22664) c14769.f48335).m51067(EnumC21172.TYPEVAR)) {
            abstractC22664M55132 = c14764.f48286;
        } else {
            abstractC22664M55132 = m55132(abstractC22664);
        }
        c24550.f38073 = abstractC22664M55132;
        c24550.f79576 = new C2175(c24550);
        return c1562;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m55137(AbstractC22664 abstractC22664) {
        AbstractC1584 abstractC1584 = this.f79951;
        abstractC1584.getClass();
        return (AbstractC22664) abstractC22664.mo9324(abstractC1584, (Object) null);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C14769 m55144(AbstractC22664 abstractC22664) {
        AbstractC1584 abstractC1584 = this.f79955;
        abstractC1584.getClass();
        return (C14769) abstractC22664.mo9324(abstractC1584, (Object) null);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C14769 m55135(AbstractC22664 abstractC22664) {
        return (C14769) this.f79930.m5601(abstractC22664);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m55119(AbstractC22970 abstractC22970, AbstractC22970 abstractC22971) {
        Iterator it = m55144(abstractC22971.f38067).iterator();
        while (it.hasNext()) {
            if (abstractC22970 == ((AbstractC22664) it.next()).f73596) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m55171(AbstractC22664 abstractC22664) {
        HashMap map = this.f79938;
        Boolean boolValueOf = (Boolean) map.get(abstractC22664);
        if (boolValueOf == null) {
            boolean z = false;
            if (!abstractC22664.mo9329()) {
                if (abstractC22664.mo9328() || (m55137(abstractC22664) != AbstractC22664.f73590 && m55171(m55137(abstractC22664)))) {
                    z = true;
                } else {
                    C14769 c14769M55144 = m55144(abstractC22664);
                    while (c14769M55144.m35550() && !m55171((AbstractC22664) c14769M55144.f48335)) {
                        c14769M55144 = c14769M55144.f48336;
                    }
                    if (c14769M55144.m35550()) {
                        z = true;
                    }
                }
            }
            boolValueOf = Boolean.valueOf(z);
            map.put(abstractC22664, boolValueOf);
        }
        return boolValueOf.booleanValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55110(C17969 c17969, C14769 c14769, boolean z) {
        AbstractC22664 abstractC22664M55089;
        if (c14769.f48336.isEmpty()) {
            abstractC22664M55089 = (AbstractC22664) c14769.f48335;
        } else {
            abstractC22664M55089 = m55089(c14769, z);
        }
        c17969.mo19991(abstractC22664M55089);
        c17969.f58892 = -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m55097(C17969 c17969) {
        if (c17969.mo19992().m51067(EnumC21172.NONE)) {
            return C14769.m35543();
        }
        if (c17969.mo19992().mo9329() || !c17969.mo19992().mo18914()) {
            return C14769.of((Object) c17969.mo19992());
        }
        if ((m55132(c17969).f73596.mo29591() & 512) == 0) {
            return m55144(c17969).m35552(m55137(c17969));
        }
        return m55144(c17969);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m55168(AbstractC22664 abstractC22664) {
        return (AbstractC22664) this.f79944.m5601(abstractC22664);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m55165(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665, boolean z) {
        return m55117(abstractC22664, abstractC22665, z) || m55117(abstractC22664, m55132(abstractC22665), z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m55118(AbstractC22970 abstractC22970, AbstractC11781 abstractC11781) {
        Iterator it = this.f79947.f48286.f73596.mo29571().m38842(abstractC11781.f38072).iterator();
        while (it.hasNext()) {
            if (abstractC11781.mo26689((AbstractC11781) it.next(), abstractC22970, this, true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15867 m55099(C14769 c14769, AbstractC22664 abstractC22664, boolean z) {
        C14769 c14769Mo50621 = ((AbstractC11781) c14769.f48335).mo29576(this).mo50621();
        Iterator it = c14769.iterator();
        int i = 0;
        boolean z2 = false;
        while (true) {
            boolean z3 = true;
            if (it.hasNext()) {
                AbstractC11781 abstractC11781 = (AbstractC11781) it.next();
                if ((abstractC11781.mo29591() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) == 0 || (z && !m55148(c14769Mo50621, abstractC11781.mo29576(this).mo50621()))) {
                    return C15867.empty();
                }
                if (abstractC11781.f38067.m51067(EnumC21172.FORALL)) {
                    z2 = true;
                }
            } else {
                EnumC14523[] enumC14523ArrValues = EnumC14523.values();
                int length = enumC14523ArrValues.length;
                while (i < length) {
                    EnumC14523 enumC14523 = enumC14523ArrValues[i];
                    Iterator it2 = c14769.iterator();
                    while (it2.hasNext()) {
                        AbstractC11781 abstractC11782 = (AbstractC11781) it2.next();
                        AbstractC22664 abstractC22664M55126 = m55126(abstractC11782, abstractC22664);
                        C14769 c14769Mo50622 = abstractC22664M55126.mo50622();
                        Iterator it3 = c14769.iterator();
                        while (it3.hasNext()) {
                            AbstractC11781 abstractC11783 = (AbstractC11781) it3.next();
                            if (abstractC11782 != abstractC11783) {
                                AbstractC22664 abstractC22664M55127 = m55126(abstractC11783, abstractC22664);
                                if (m55165(abstractC22664M55126, abstractC22664M55127, z3) && enumC14523.mo13161(abstractC22664M55126, abstractC22664M55127, this)) {
                                    C14769 c14769Mo50623 = abstractC22664M55127.mo50622();
                                    EnumC21172 enumC21172 = EnumC21172.FORALL;
                                    if (!abstractC22664M55126.m51067(enumC21172) && z2) {
                                        c14769Mo50623 = m55154(c14769Mo50623);
                                    } else if (abstractC22664M55126.m51067(enumC21172)) {
                                        C11972.m30026(abstractC22664M55127.m51067(enumC21172));
                                        c14769Mo50623 = m55095(c14769Mo50623, abstractC22664M55127.mo15882(), abstractC22664M55126.mo15882());
                                    }
                                    c14769Mo50622 = this.f79928.m50029(c14769Mo50622, c14769Mo50623);
                                }
                            }
                            z3 = true;
                        }
                        if (c14769Mo50622 == abstractC22664M55126.mo50622()) {
                            return C15867.of(abstractC11782);
                        }
                        return C15867.of(new C13295(abstractC11782.mo29591(), abstractC11782.f38072, m55159(abstractC11782.f38067, c14769Mo50622), abstractC11782.f38069, abstractC11782));
                    }
                    i++;
                    z3 = true;
                }
                return C15867.empty();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10377 m55090(C10377 c10377, AbstractC22970 abstractC22970, boolean z, Predicate predicate) {
        return this.f79960.m38147(c10377, abstractC22970, z, predicate);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24352 m55106(final AbstractC22664 abstractC22664, boolean z) {
        C12286 c12286 = this.f79937;
        c12286.getClass();
        C24352 c24352 = (C24352) abstractC22664.mo9324(c12286, (Object) null);
        C11972.m30022(c24352, new Supplier() { // from class: l.ᩳ۟᩺
            @Override // java.util.function.Supplier
            public final Object get() {
                return "type " + abstractC22664;
            }
        });
        if (!z) {
            return c24352;
        }
        C20491 c20491 = new C20491(c24352.f53083);
        c20491.f65636 = c24352;
        return c20491;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10377 m55091(C24550 c24550) {
        try {
            return m55079(c24550, c24550);
        } catch (C21566 e) {
            AbstractC8036 abstractC8036 = this.f79936.m37793(c24550).f10273;
            abstractC8036.getClass();
            this.f79928.m49966(abstractC8036, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m55098(AbstractC22664 abstractC22664, C10377 c10377) {
        AbstractC11781 abstractC11781;
        AbstractC11781 abstractC11782;
        C10311 c10311 = this.f79946;
        C17359.requireNonNull(c10311);
        C19262 c19262 = new C19262(c10311, abstractC22664, c10377);
        WeakHashMap weakHashMap = c10311.f32910;
        C14769 c14769 = (C14769) weakHashMap.get(c19262);
        if (c14769 != null) {
            return c14769;
        }
        C6321 c6321 = new C6321(this, c10377, abstractC22664);
        C14769<C10377> c14769M35543 = C14769.m35543();
        for (AbstractC11781 abstractC11783 : m55106(abstractC22664, false).mo7472(c6321, EnumC13908.RECURSIVE)) {
            if (!abstractC22664.f73596.m29587() && !abstractC11783.f38069.m29587()) {
                return C14769.of(abstractC11783);
            }
            if (!c14769M35543.contains(abstractC11783)) {
                c14769M35543 = c14769M35543.m35552((C10377) abstractC11783);
            }
        }
        C18499 c18499 = new C18499();
        for (C10377 c10378 : c14769M35543) {
            Iterator it = c14769M35543.iterator();
            while (true) {
                if (it.hasNext()) {
                    C10377 c10379 = (C10377) it.next();
                    if (c10378 != c10379 && (abstractC11781 = c10379.f38069) != (abstractC11782 = c10378.f38069) && m55157(abstractC11782, abstractC11781.f38067) != null) {
                        break;
                    }
                } else {
                    c18499.m43089(c10378);
                    break;
                }
            }
        }
        C14769 c14769M43093 = c18499.m43093();
        weakHashMap.put(c19262, c14769M43093);
        return c14769M43093;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m55086(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665) {
        boolean zM55117 = m55117(abstractC22664, abstractC22665, true);
        C1083 c1083 = this.f79958;
        if (zM55117) {
            C14769 c14769Mo15882 = abstractC22664.mo15882();
            return m55116(abstractC22664.mo31585(), m55103(abstractC22665.mo31585(), abstractC22665.mo15882(), c14769Mo15882), c1083);
        }
        return m55116(abstractC22664.mo31585(), m55132(abstractC22665.mo31585()), c1083);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m55121(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665) {
        return m55117(abstractC22664, abstractC22665, true) || m55117(abstractC22664, m55132(abstractC22665), true) || m55117(m55132(abstractC22664), abstractC22665, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m55117(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665, boolean z) {
        return ((Boolean) (z ? this.f79949 : this.f79931).m34207(abstractC22665, abstractC22664)).booleanValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m55095(C14769 c14769, C14769 c147610, C14769 c147611) {
        return c14769.m35547((Function) new C8557(this, c147610, c147611));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m55103(AbstractC22664 abstractC22664, C14769 c14769, C14769 c147610) {
        C8557 c8557 = new C8557(this, c14769, c147610);
        abstractC22664.getClass();
        return (AbstractC22664) c8557.m34207(null, abstractC22664);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14769 m55155(C14769 c14769, C14769 c147610, C14769 c147611) {
        if (!c14769.isEmpty()) {
            C18499 c18499 = new C18499();
            Iterator it = c14769.iterator();
            boolean z = false;
            while (it.hasNext()) {
                C17969 c17969 = (C17969) ((AbstractC22664) it.next());
                AbstractC22664 abstractC22664M55103 = m55103(c17969.mo19992(), c147610, c147611);
                if (abstractC22664M55103 != c17969.mo19992()) {
                    z = true;
                }
                c18499.m43089(abstractC22664M55103);
            }
            if (z) {
                C18499 c184910 = new C18499();
                Iterator it2 = c14769.iterator();
                while (it2.hasNext()) {
                    AbstractC22664 abstractC22664 = (AbstractC22664) it2.next();
                    c184910.m43089(new C17969(abstractC22664.f73596, null, this.f79947.f48241, abstractC22664.f73595));
                }
                C14769 c14769M43093 = c184910.m43093();
                for (C14769 c14769M43094 = c18499.m43093(); !c14769M43094.isEmpty(); c14769M43094 = c14769M43094.f48336) {
                    c14769M43094.f48335 = m55103((AbstractC22664) c14769M43094.f48335, c14769, c14769M43093);
                }
                C14769 c14769M43095 = c18499.m43093();
                Iterator it3 = c184910.m43093().iterator();
                while (it3.hasNext()) {
                    ((C17969) ((AbstractC22664) it3.next())).mo19991((AbstractC22664) c14769M43095.f48335);
                    c14769M43095 = c14769M43095.f48336;
                }
                return c184910.m43093();
            }
        }
        return c14769;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m55112(C5291 c5291, C5291 c5292) {
        C14769 c14769 = c5291.f18620;
        C14769 c147610 = c5292.f18620;
        C14769 c147611 = c14769;
        while (c147611.m35550() && c147610.m35550() && m55149(((AbstractC22664) c147611.f48335).mo19992(), m55103(((AbstractC22664) c147610.f48335).mo19992(), c5292.f18620, c14769))) {
            c147611 = c147611.f48336;
            c147610 = c147610.f48336;
        }
        return c147611.isEmpty() && c147610.isEmpty();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C14769 m55134(C14769 c14769) {
        C14769 c14769M35547 = c14769.m35547((Function) f79924);
        for (C14769 c147610 = c14769M35547; c147610.m35550(); c147610 = c147610.f48336) {
            C17969 c17969 = (C17969) c147610.f48335;
            c17969.mo19991(m55103(c17969.mo19992(), c14769, c14769M35547));
        }
        return c14769M35547;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m55102(AbstractC22664 abstractC22664, C14769 c14769) {
        return (AbstractC22664) abstractC22664.mo9324(this.f79933, c14769);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m55159(AbstractC22664 abstractC22664, C14769 c14769) {
        return (AbstractC22664) abstractC22664.mo9324(this.f79943, c14769);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m55128(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665) {
        return (AbstractC22664) abstractC22664.mo9324(this.f79962, abstractC22665);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C12748 m55139(AbstractC22664 abstractC22664) {
        return new C12748(abstractC22664, this.f79947.f48237);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12748 m55061(AbstractC19728 abstractC19728, AbstractC22970 abstractC22970, AbstractC22664 abstractC22664) {
        return new C12748(new C24550(1073741833L, abstractC19728, null, abstractC22970), abstractC22664);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m55172(AbstractC22664 abstractC22664) {
        int i = C3600.f12307[abstractC22664.mo9097().ordinal()];
        if (i == 2) {
            C10510 c10510 = (C10510) abstractC22664;
            if (c10510.f33439 < 0) {
                if (c10510.f73596.mo29582() == this.f79964.f49838) {
                    c10510.f33439 = 0;
                } else {
                    int iM55172 = m55172(m55137(c10510));
                    for (C14769 c14769M55144 = m55144(c10510); c14769M55144.m35550(); c14769M55144 = c14769M55144.f48336) {
                        if (m55172((AbstractC22664) c14769M55144.f48335) > iM55172) {
                            iM55172 = m55172((AbstractC22664) c14769M55144.f48335);
                        }
                    }
                    c10510.f33439 = iM55172 + 1;
                }
            }
            return c10510.f33439;
        }
        if (i != 12) {
            if (i == 15 || i == 16) {
                return 0;
            }
            throw new AssertionError();
        }
        C17969 c17969 = (C17969) abstractC22664;
        if (c17969.f58892 < 0) {
            int iM55173 = m55172(m55137(c17969));
            for (C14769 c14769M55145 = m55144(c17969); c14769M55145.m35550(); c14769M55145 = c14769M55145.f48336) {
                if (m55172((AbstractC22664) c14769M55145.f48335) > iM55173) {
                    iM55173 = m55172((AbstractC22664) c14769M55145.f48335);
                }
            }
            c17969.f58892 = iM55173 + 1;
        }
        return c17969.f58892;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C14769 m55146(AbstractC22664 abstractC22664) {
        HashMap map = this.f79967;
        C14769 c14769M55146 = (C14769) map.get(abstractC22664);
        if (c14769M55146 == null) {
            AbstractC22664 abstractC22664M55137 = m55137(abstractC22664);
            boolean zMo18914 = abstractC22664.mo18914();
            C18188 c18188 = this.f79957;
            if (!zMo18914) {
                if (!abstractC22664M55137.m51067(EnumC21172.CLASS)) {
                    if (abstractC22664M55137.m51067(EnumC21172.TYPEVAR)) {
                        c14769M55146 = m55146(abstractC22664M55137).m35552(abstractC22664);
                    } else {
                        c14769M55146 = C14769.of((Object) abstractC22664);
                    }
                } else {
                    c14769M55146 = m55096(m55146(abstractC22664M55137), abstractC22664, c18188);
                }
            } else {
                c14769M55146 = m55146(m55137(abstractC22664));
            }
            for (C14769 c14769M55144 = m55144(abstractC22664); c14769M55144.m35550(); c14769M55144 = c14769M55144.f48336) {
                c14769M55146 = m55094(c14769M55146, m55146((AbstractC22664) c14769M55144.f48335), c18188);
            }
            map.put(abstractC22664, c14769M55146);
        }
        return c14769M55146;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m55096(C14769 c14769, AbstractC22664 abstractC22664, BiPredicate biPredicate) {
        if (c14769.isEmpty()) {
            return c14769.m35552(abstractC22664);
        }
        if (biPredicate.test(abstractC22664, (AbstractC22664) c14769.f48335)) {
            return c14769;
        }
        if (abstractC22664.f73596.m51846(((AbstractC22664) c14769.f48335).f73596, this)) {
            return c14769.m35552(abstractC22664);
        }
        return m55096(c14769.f48336, abstractC22664, biPredicate).m35552((AbstractC22664) c14769.f48335);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m55094(C14769 c14769, C14769 c147610, BiPredicate biPredicate) {
        if (c14769.isEmpty()) {
            return c147610;
        }
        if (c147610.isEmpty()) {
            return c14769;
        }
        if (biPredicate.test((AbstractC22664) c14769.f48335, (AbstractC22664) c147610.f48335)) {
            return m55094(c14769.f48336, c147610.f48336, biPredicate).m35552((AbstractC22664) c14769.f48335);
        }
        if (((AbstractC22664) c147610.f48335).f73596.m51846(((AbstractC22664) c14769.f48335).f73596, this)) {
            return m55094(c14769, c147610.f48336, biPredicate).m35552((AbstractC22664) c147610.f48335);
        }
        return m55094(c14769.f48336, c147610, biPredicate).m35552((AbstractC22664) c14769.f48335);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C14769 m55140(C14769 c14769, C14769 c147610) {
        return m55094(c14769, c147610, this.f79957);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C14769 m55166(C14769 c14769, C14769 c147610) {
        C10729 c10729;
        if (c14769 == c147610) {
            return c14769;
        }
        if (c14769.isEmpty() || c147610.isEmpty()) {
            return C14769.m35543();
        }
        if (((AbstractC22664) c14769.f48335).f73596.m51846(((AbstractC22664) c147610.f48335).f73596, this)) {
            return m55166(c14769.f48336, c147610);
        }
        if (((AbstractC22664) c147610.f48335).f73596.m51846(((AbstractC22664) c14769.f48335).f73596, this)) {
            return m55166(c14769, c147610.f48336);
        }
        if (m55149((AbstractC22664) c14769.f48335, (AbstractC22664) c147610.f48335)) {
            return m55166(c14769.f48336, c147610.f48336).m35552((AbstractC22664) c14769.f48335);
        }
        AbstractC22664 abstractC22664 = (AbstractC22664) c14769.f48335;
        if (abstractC22664.f73596 == ((AbstractC22664) c147610.f48335).f73596) {
            EnumC21172 enumC21172 = EnumC21172.CLASS;
            if (abstractC22664.m51067(enumC21172) && ((AbstractC22664) c147610.f48335).m51067(enumC21172)) {
                if (((AbstractC22664) c14769.f48335).mo9330() && ((AbstractC22664) c147610.f48335).mo9330()) {
                    AbstractC22664 abstractC22665 = (AbstractC22664) c14769.f48335;
                    AbstractC22664 abstractC22666 = (AbstractC22664) c147610.f48335;
                    C10510 c10510 = (C10510) abstractC22665;
                    C14769 c14769Mo15882 = c10510.mo15882();
                    C14769 c14769Mo15883 = ((C10510) abstractC22666).mo15882();
                    C18499 c18499 = new C18499();
                    C14769 c14769Mo15884 = c10510.f73596.f38067.mo15882();
                    while (c14769Mo15882.m35550() && c14769Mo15883.m35550() && c14769Mo15884.m35550()) {
                        if (m55163((AbstractC22664) c14769Mo15882.f48335, (AbstractC22664) c14769Mo15883.f48335)) {
                            c18499.m43089((AbstractC22664) c14769Mo15882.f48335);
                        } else {
                            if (m55163((AbstractC22664) c14769Mo15883.f48335, (AbstractC22664) c14769Mo15882.f48335)) {
                                c18499.m43089((AbstractC22664) c14769Mo15883.f48335);
                            } else {
                                C4567 c4567 = new C4567(abstractC22665, abstractC22666, this);
                                HashSet hashSet = this.f79948;
                                boolean zAdd = hashSet.add(c4567);
                                C14764 c14764 = this.f79947;
                                if (zAdd) {
                                    c10729 = new C10729(m55105(m55123((AbstractC22664) c14769Mo15882.f48335), m55123((AbstractC22664) c14769Mo15883.f48335)), EnumC18670.EXTENDS, c14764.f48274);
                                    hashSet.remove(c4567);
                                } else {
                                    c10729 = new C10729(c14764.f48286, EnumC18670.UNBOUND, c14764.f48274);
                                }
                                c10729.mo27318((AbstractC22664) c14769Mo15884.f48335);
                                c18499.m43089(c10729);
                            }
                            c14769Mo15882 = c14769Mo15882.f48336;
                            c14769Mo15883 = c14769Mo15883.f48336;
                            c14769Mo15884 = c14769Mo15884.f48336;
                            abstractC22665 = abstractC22665;
                        }
                        abstractC22665 = abstractC22665;
                        c14769Mo15882 = c14769Mo15882.f48336;
                        c14769Mo15883 = c14769Mo15883.f48336;
                        c14769Mo15884 = c14769Mo15884.f48336;
                        abstractC22665 = abstractC22665;
                    }
                    C11972.m30026(c14769Mo15882.isEmpty() && c14769Mo15883.isEmpty() && c14769Mo15884.isEmpty());
                    return m55166(c14769.f48336, c147610.f48336).m35552(new C10510(c10510.f73596, c10510.mo23449(), c18499.m43093()));
                }
                if (((AbstractC22664) c14769.f48335).mo9328() || ((AbstractC22664) c147610.f48335).mo9328()) {
                    return m55166(c14769.f48336, c147610.f48336).m35552(m55132((AbstractC22664) c14769.f48335));
                }
            }
        }
        return m55166(c14769.f48336, c147610.f48336);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C14769 m55073(C14769 c14769) {
        C18499 c18499 = new C18499();
        C18499 c184910 = new C18499();
        HashSet hashSet = new HashSet();
        while (!c14769.isEmpty()) {
            AbstractC22664 abstractC22664 = (AbstractC22664) c14769.f48335;
            boolean zContains = hashSet.contains(abstractC22664);
            boolean z = !zContains;
            if (!zContains && abstractC22664.m51067(EnumC21172.TYPEVAR)) {
                Iterator it = c14769.f48336.iterator();
                while (it.hasNext()) {
                    if (m55131((AbstractC22664) it.next(), abstractC22664, false)) {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                if (abstractC22664.mo31586()) {
                    c184910.m43089(abstractC22664);
                } else {
                    c18499.m43089(abstractC22664);
                }
                for (AbstractC22664 abstractC22665 : c14769.f48336) {
                    if (m55131(abstractC22664, abstractC22665, false)) {
                        hashSet.add(abstractC22665);
                    }
                }
            }
            c14769 = c14769.f48336;
        }
        c18499.m43091(c184910);
        return c18499.m43093();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m55147(C14769 c14769) {
        return m55105((AbstractC22664[]) c14769.toArray(new AbstractC22664[c14769.m35551()]));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m55105(AbstractC22664... abstractC22664Arr) {
        int[] iArr = new int[abstractC22664Arr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = abstractC22664Arr.length;
            C14764 c14764 = this.f79947;
            if (i >= length) {
                if (i2 == 0) {
                    return c14764.f48241;
                }
                if (i2 == 1) {
                    AbstractC22664[] abstractC22664Arr2 = new AbstractC22664[abstractC22664Arr.length];
                    for (int i3 = 0; i3 < abstractC22664Arr.length; i3++) {
                        AbstractC22664 abstractC22664M52682 = this.f79945.m52682(abstractC22664Arr[i3]);
                        abstractC22664Arr2[i3] = abstractC22664M52682;
                        if (abstractC22664M52682.mo40452()) {
                            AbstractC22664 abstractC22664 = abstractC22664Arr[0];
                            for (int i4 = 1; i4 < abstractC22664Arr.length; i4++) {
                                if (!m55149(abstractC22664, abstractC22664Arr[i4])) {
                                    return m55081();
                                }
                            }
                            return abstractC22664;
                        }
                    }
                    return new C2832(m55105(abstractC22664Arr2), c14764.f48271);
                }
                if (i2 == 2) {
                    int i5 = 0;
                    for (AbstractC22664 abstractC22665 : abstractC22664Arr) {
                        if (abstractC22665.m51067(EnumC21172.CLASS) || abstractC22665.m51067(EnumC21172.TYPEVAR)) {
                            break;
                        }
                        i5++;
                    }
                    C11972.m30026(i5 < abstractC22664Arr.length);
                    C14769 c14769M55085 = m55085(abstractC22664Arr[i5]);
                    int i6 = i5 + 1;
                    for (int i7 = i6; i7 < abstractC22664Arr.length; i7++) {
                        AbstractC22664 abstractC22666 = abstractC22664Arr[i7];
                        if (abstractC22666.m51067(EnumC21172.CLASS) || abstractC22666.m51067(EnumC21172.TYPEVAR)) {
                            c14769M55085 = m55166(c14769M55085, m55085(abstractC22666));
                        }
                    }
                    C14769<AbstractC22664> c14769M55073 = m55073(c14769M55085);
                    C14769 c14769M35543 = C14769.m35543();
                    for (AbstractC22664 abstractC22667 : c14769M55073) {
                        C14769 c14769Of = C14769.of((Object) m55157(abstractC22667.f73596, abstractC22664Arr[i5]));
                        for (int i8 = i6; i8 < abstractC22664Arr.length; i8++) {
                            AbstractC22664 abstractC22664M55157 = m55157(abstractC22667.f73596, abstractC22664Arr[i8]);
                            c14769Of = m55166(c14769Of, abstractC22664M55157 != null ? C14769.of((Object) abstractC22664M55157) : C14769.m35543());
                        }
                        c14769M35543.getClass();
                        c14769M35543 = c14769Of.m35549(c14769M35543);
                    }
                    if (c14769M35543.isEmpty()) {
                        return c14764.f48286;
                    }
                    C14769 c14769M55074 = m55073(c14769M35543);
                    if (c14769M55074.isEmpty()) {
                        return null;
                    }
                    if (c14769M55074.f48336.isEmpty()) {
                        return (AbstractC22664) c14769M55074.f48335;
                    }
                    return m55138(c14769M55074);
                }
                C14769 c14769Of2 = C14769.of((Object) m55081());
                for (int i9 = 0; i9 < abstractC22664Arr.length; i9++) {
                    if (iArr[i9] != 1) {
                        c14769Of2 = c14769Of2.m35552(abstractC22664Arr[i9]);
                    }
                }
                return m55147(c14769Of2);
            }
            AbstractC22664 abstractC22664Mo19992 = abstractC22664Arr[i];
            int i10 = C3600.f12307[abstractC22664Mo19992.mo9097().ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 12) {
                        do {
                            abstractC22664Mo19992 = abstractC22664Mo19992.mo19992();
                        } while (abstractC22664Mo19992.m51067(EnumC21172.TYPEVAR));
                        if (abstractC22664Mo19992.m51067(EnumC21172.ARRAY)) {
                            iArr[i] = 1;
                        } else {
                            iArr[i] = 2;
                        }
                    } else {
                        iArr[i] = 0;
                        if (abstractC22664Mo19992.mo40452()) {
                            return c14764.f48263;
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14769 m55085(AbstractC22664 abstractC22664) {
        C18499 c18499 = new C18499();
        for (AbstractC22664 abstractC22665 : m55146(abstractC22664)) {
            if (abstractC22665.m51067(EnumC21172.TYPEVAR)) {
                c18499.m43089(abstractC22665);
            } else {
                c18499.m43089(m55132(abstractC22665));
            }
        }
        return c18499.m43093();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC22664 m55081() {
        if (this.f79961 == null) {
            C14764 c14764 = this.f79947;
            this.f79961 = m55089(C14769.of((Object) c14764.f48313, (Object) c14764.f48306), true);
        }
        return this.f79961;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m55167(C14769 c14769) {
        AbstractC22664 abstractC22664M55169 = (AbstractC22664) c14769.f48335;
        for (AbstractC22664 abstractC22664 : c14769.f48336) {
            if (abstractC22664M55169.mo9329()) {
                return abstractC22664M55169;
            }
            abstractC22664M55169 = m55169(abstractC22664M55169, abstractC22664);
        }
        return abstractC22664M55169;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m55169(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665) {
        if (abstractC22665 == null) {
            return abstractC22664;
        }
        boolean zMo40452 = abstractC22664.mo40452();
        C14764 c14764 = this.f79947;
        if (!zMo40452 && !abstractC22665.mo40452()) {
            int i = 0;
            if (m55131(abstractC22664, abstractC22665, false)) {
                return abstractC22664;
            }
            if (m55131(abstractC22665, abstractC22664, false)) {
                return abstractC22665;
            }
            C14769<AbstractC22664> c14769M55073 = m55073(m55094(m55146(abstractC22664), m55146(abstractC22665), this.f79957));
            if (c14769M55073.isEmpty()) {
                return c14764.f48286;
            }
            if (c14769M55073.f48336.isEmpty()) {
                return (AbstractC22664) c14769M55073.f48335;
            }
            C14769 c14769M35543 = C14769.m35543();
            C14769 c14769M35544 = C14769.m35543();
            for (AbstractC22664 abstractC22666 : c14769M55073) {
                if (!abstractC22666.mo31586()) {
                    i++;
                    AbstractC22664 abstractC22664M55078 = m55078(abstractC22666);
                    if (abstractC22666 != abstractC22664M55078 && !abstractC22664M55078.m51067(EnumC21172.BOT)) {
                        c14769M35543 = c14769M35543.m35546(abstractC22666);
                        c14769M35544 = c14769M35544.m35546(abstractC22664M55078);
                    }
                }
            }
            if (i > 1) {
                if (c14769M35544.isEmpty()) {
                    return m55139(abstractC22664);
                }
                C14769 c14769M35548 = c14769M55073.m35548(c14769M35543);
                c14769M35548.getClass();
                return m55167(c14769M35544.m35549(c14769M35548));
            }
            return m55138(c14769M55073);
        }
        return c14764.f48263;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static int m55059(AbstractC22664 abstractC22664) {
        C16761 c16761 = f79923;
        c16761.getClass();
        return ((Integer) abstractC22664.mo9324(c16761, (Object) null)).intValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m55116(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665, C1083 c1083) {
        if (m55149(abstractC22664, abstractC22665)) {
            return true;
        }
        return (abstractC22664.mo40452() || abstractC22665.mo40452() || !m55164(abstractC22664, abstractC22665, c1083)) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24550 m55108(AbstractC22664 abstractC22664) {
        C14764 c14764 = this.f79947;
        return c14764.m35517(c14764.f48304, c14764.f48323[abstractC22664.mo9097().ordinal()]);
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m55152(AbstractC22664 abstractC22664) {
        if (abstractC22664.m51067(EnumC21172.ERROR)) {
            return AbstractC22664.f73590;
        }
        int i = 0;
        while (true) {
            C14764 c14764 = this.f79947;
            AbstractC19728[] abstractC19728Arr = c14764.f48323;
            if (i < abstractC19728Arr.length) {
                AbstractC19728 abstractC19728 = abstractC19728Arr[i];
                if (abstractC19728 != null && m55157(c14764.m35517(c14764.f48304, abstractC19728), abstractC22664) != null) {
                    return c14764.f48292[i];
                }
                i++;
            } else {
                return AbstractC22664.f73590;
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m55145(AbstractC22664 abstractC22664) {
        AbstractC22664 abstractC22664M55152 = m55152(abstractC22664);
        return abstractC22664M55152.m51067(EnumC21172.NONE) ? abstractC22664 : abstractC22664M55152;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m55158(AbstractC22664 abstractC22664) {
        C14764 c14764;
        AbstractC22664 abstractC22664M55158;
        if (!abstractC22664.m51067(EnumC21172.CLASS)) {
            return abstractC22664;
        }
        if (abstractC22664.mo23449() != AbstractC22664.f73590 && (abstractC22664M55158 = m55158(abstractC22664.mo23449())) != abstractC22664.mo23449()) {
            abstractC22664 = m55103(m55126(abstractC22664.f73596, abstractC22664M55158), abstractC22664.f73596.f38067.mo15882(), abstractC22664.mo15882());
        }
        C10510 c10510 = (C10510) abstractC22664;
        if (c10510.mo9328() || !c10510.mo9330()) {
            return c10510;
        }
        C14769 c14769Mo15882 = ((C10510) c10510.f73596.f38067).mo15882();
        C14769 c14769Mo15883 = c10510.mo15882();
        C18499 c18499 = new C18499();
        Iterator it = c14769Mo15883.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c14764 = this.f79947;
            if (!zHasNext) {
                break;
            }
            AbstractC22664 abstractC22665 = (AbstractC22664) it.next();
            if (abstractC22665.m51067(EnumC21172.WILDCARD)) {
                C10729 c10729 = (C10729) abstractC22665;
                AbstractC22664 abstractC22666 = c10729.f34073 == EnumC18670.EXTENDS ? c10729.f34074 : null;
                if (abstractC22666 == null) {
                    abstractC22666 = c14764.f48286;
                }
                c18499.m43089(new C14018(this.f79934, c14764.f48321, abstractC22666, c14764.f48241, c10729));
            } else {
                c18499.m43089(abstractC22665);
            }
        }
        C14769 c14769M43093 = c18499.m43093();
        boolean z = false;
        C14769 c14769 = c14769Mo15882;
        C14769 c147610 = c14769M43093;
        while (!c14769.isEmpty() && !c14769Mo15883.isEmpty() && !c147610.isEmpty()) {
            Object obj = c147610.f48335;
            Object obj2 = c14769Mo15883.f48335;
            if (obj != obj2) {
                C10729 c107210 = (C10729) obj2;
                AbstractC22664 abstractC22664Mo19992 = ((AbstractC22664) c14769.f48335).mo19992();
                C14018 c14018 = (C14018) c147610.f48335;
                if (abstractC22664Mo19992 == null) {
                    abstractC22664Mo19992 = c14764.f48286;
                }
                int[] iArr = C3600.f12305;
                EnumC18670 enumC18670 = c107210.f34073;
                EnumC18670 enumC18671 = c107210.f34073;
                int i = iArr[enumC18670.ordinal()];
                if (i == 1) {
                    c14018.mo19991(m55169(enumC18671 == EnumC18670.EXTENDS ? c107210.f34074 : null, m55103(abstractC22664Mo19992, c14769Mo15882, c14769M43093)));
                    c14018.f58893 = c14764.f48241;
                } else if (i == 2) {
                    c14018.mo19991(m55103(abstractC22664Mo19992, c14769Mo15882, c14769M43093));
                    c14018.f58893 = enumC18671 == EnumC18670.SUPER ? c107210.f34074 : null;
                } else if (i == 3) {
                    c14018.mo19991(m55103(abstractC22664Mo19992, c14769Mo15882, c14769M43093));
                    c14018.f58893 = c14764.f48241;
                }
                AbstractC22664 abstractC22664Mo19993 = c14018.mo19992();
                EnumC21172 enumC21172 = EnumC21172.UNDETVAR;
                AbstractC22664 abstractC22664Mo19994 = abstractC22664Mo19993.m51067(enumC21172) ? ((C8274) c14018.mo19992()).f72657 : c14018.mo19992();
                AbstractC22664 abstractC22667 = c14018.f58893.m51067(enumC21172) ? ((C8274) c14018.f58893).f72657 : c14018.f58893;
                AbstractC22664 abstractC22664Mo19995 = c14018.mo19992();
                EnumC21172 enumC21173 = EnumC21172.ERROR;
                if (!abstractC22664Mo19995.m51067(enumC21173) && !c14018.f58893.m51067(enumC21173) && m55149(abstractC22664Mo19994, abstractC22667)) {
                    c147610.f48335 = c14018.mo19992();
                }
                z = true;
            }
            c14769 = c14769.f48336;
            c14769Mo15883 = c14769Mo15883.f48336;
            c147610 = c147610.f48336;
        }
        if (c14769.isEmpty() && c14769Mo15883.isEmpty() && c147610.isEmpty()) {
            return z ? new C10510(c10510.mo23449(), c14769M43093, c10510.f73596, c10510.f73595) : abstractC22664;
        }
        return m55132(abstractC22664);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m55071(C24705 c24705, C10510 c10510, AbstractC22664 abstractC22664, C1083 c1083) {
        boolean z;
        AbstractC22664 abstractC22665;
        AbstractC22664 abstractC22666;
        if ((abstractC22664.f73596.mo29591() & 512) == 0) {
            C11972.m30026((c10510.f73596.mo29591() & 512) != 0);
            z = true;
            abstractC22665 = c10510;
            abstractC22666 = abstractC22664;
        } else {
            z = false;
            abstractC22666 = c10510;
            abstractC22665 = abstractC22664;
        }
        C14769 c14769M55083 = c24705.m55083(abstractC22665, c24705.m55132(abstractC22666));
        boolean zIsEmpty = c14769M55083.isEmpty();
        while (c14769M55083.m35550()) {
            AbstractC22664 abstractC22664M55157 = c24705.m55157(((AbstractC22664) c14769M55083.f48335).f73596, abstractC22666);
            AbstractC22664 abstractC22667 = (AbstractC22664) c14769M55083.f48335;
            if (c24705.m55129(abstractC22664M55157.mo15882(), abstractC22667.mo15882())) {
                return false;
            }
            zIsEmpty = zIsEmpty || (!z ? !c24705.m55076(abstractC22664M55157, abstractC22667) : !c24705.m55076(abstractC22667, abstractC22664M55157));
            c14769M55083 = c14769M55083.f48336;
        }
        if (zIsEmpty) {
            if (!z) {
                abstractC22666 = abstractC22665;
            }
            if (!c24705.m55151(abstractC22666)) {
                c1083.mo4085(EnumC19876.UNCHECKED);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m55082(C24705 c24705, C10510 c10510, AbstractC22664 abstractC22664, C1083 c1083) {
        AbstractC22664 abstractC22665;
        boolean z;
        AbstractC22664 abstractC22666;
        if ((abstractC22664.f73596.mo29591() & 512) == 0) {
            C11972.m30026((c10510.f73596.mo29591() & 512) != 0);
            abstractC22665 = c10510;
            abstractC22666 = abstractC22664;
            z = true;
        } else {
            abstractC22665 = abstractC22664;
            z = false;
            abstractC22666 = c10510;
        }
        C11972.m30026((abstractC22666.f73596.mo29591() & 16) != 0);
        AbstractC22664 abstractC22664M55157 = c24705.m55157(abstractC22665.f73596, abstractC22666);
        if (abstractC22664M55157 == null || c24705.m55129(abstractC22664M55157.mo15882(), abstractC22665.mo15882())) {
            return false;
        }
        if (!c24705.m55151(abstractC22664) && (!z ? c24705.m55076(abstractC22664M55157, abstractC22665) : c24705.m55076(abstractC22665, abstractC22664M55157))) {
            c1083.mo4085(EnumC19876.UNCHECKED);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m55076(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665) {
        for (AbstractC22664 abstractC22666 : abstractC22665.mo18914() ? m55135(abstractC22665) : C14769.of((Object) abstractC22665)) {
            AbstractC22664 abstractC22664M55160 = m55160(abstractC22664, abstractC22666.f73596);
            if (abstractC22666.mo9330() && !m55133(abstractC22666) && !m55131(abstractC22664, abstractC22666, true) && (abstractC22664M55160 == null || !m55114(abstractC22666.mo9323(), abstractC22664M55160.mo9323()))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private C14769 m55083(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665) {
        C14769 c14769M35543 = C14769.m35543();
        for (C14769 c14769M55144 = m55144(abstractC22664); c14769M55144.m35550(); c14769M55144 = c14769M55144.f48336) {
            boolean zM55131 = m55131(abstractC22665, m55132((AbstractC22664) c14769M55144.f48335), true);
            C18188 c18188 = this.f79957;
            if (zM55131) {
                c14769M35543 = m55096(c14769M35543, (AbstractC22664) c14769M55144.f48335, c18188);
            } else {
                c14769M35543 = m55094(c14769M35543, m55083((AbstractC22664) c14769M55144.f48335, abstractC22665), c18188);
            }
        }
        return c14769M35543;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55111(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665, C18499 c18499, C18499 c184910) {
        C8075 c8075 = new C8075(this, c18499, c184910);
        abstractC22664.mo9324(c8075, abstractC22665);
        C14769 c14769M43093 = c8075.f26726.m43093();
        C14769 c14769M43094 = c8075.f26723.m43093();
        while (!c14769M43093.isEmpty()) {
            AbstractC22664 abstractC22666 = (AbstractC22664) c8075.f26725.get(((AbstractC22664) c14769M43093.f48335).f73596);
            if (c14769M43094.f48335 != abstractC22666) {
                c14769M43094.f48335 = abstractC22666;
            }
            c14769M43093 = c14769M43093.f48336;
            c14769M43094 = c14769M43094.f48336;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10729 m55060(C24705 c24705, AbstractC22664 abstractC22664, C17969 c17969) {
        C14764 c14764 = c24705.f79947;
        AbstractC22664 abstractC22665 = c14764.f48286;
        C24550 c24550 = c14764.f48274;
        if (abstractC22664 == abstractC22665) {
            return new C10729(c14764.f48286, EnumC18670.UNBOUND, c24550, c17969);
        }
        return new C10729(abstractC22664, EnumC18670.EXTENDS, c24550, c17969);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10729 m55080(C24705 c24705, AbstractC22664 abstractC22664, C17969 c17969) {
        C14764 c14764 = c24705.f79947;
        if (abstractC22664.m51067(EnumC21172.BOT)) {
            return new C10729(c14764.f48286, EnumC18670.UNBOUND, c14764.f48274, c17969);
        }
        return new C10729(abstractC22664, EnumC18670.SUPER, c14764.f48274, c17969);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC6738 m55153(AbstractC22970 abstractC22970) {
        EnumC6738 enumC6738 = EnumC6738.CLASS;
        C23892 c23892M29565 = abstractC22970.m29565(this.f79947.f48262.f73596);
        if (c23892M29565 != null) {
            C15252 c15252 = this.f79964;
            AbstractC21654 abstractC21654M53392 = c23892M29565.m53392(c15252.f49766);
            if (abstractC21654M53392 != null && (abstractC21654M53392 instanceof C20908)) {
                AbstractC19728 abstractC19728 = ((C20908) abstractC21654M53392).f66917.f38072;
                if (abstractC19728 == c15252.f49801) {
                    return EnumC6738.SOURCE;
                }
                if (abstractC19728 != c15252.f49772 && abstractC19728 == c15252.f49855) {
                    return EnumC6738.RUNTIME;
                }
            }
        }
        return enumC6738;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m55100(InterfaceC8344 interfaceC8344) {
        int iMo2973 = interfaceC8344.mo2973();
        C14764 c14764 = this.f79947;
        switch (iMo2973) {
            case 3:
                return c14764.f48253;
            case 4:
                return c14764.f48239;
            case 5:
                return c14764.f48256;
            case 6:
                return c14764.f48249;
            case 7:
                return c14764.f48317;
            case 8:
                return c14764.f48282;
            default:
                switch (iMo2973) {
                    case 15:
                        return c14764.f48294;
                    case 16:
                        return c14764.f48297;
                    case 17:
                        return ((C0683) interfaceC8344).f38067;
                    default:
                        throw new AssertionError("Not a loadable constant: " + interfaceC8344.mo2973());
                }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55109() {
        this.f79952.f19360.clear();
        this.f79938.clear();
        this.f79960.f51964.clear();
        this.f79937.f39494.clear();
        this.f79967.clear();
    }
}
