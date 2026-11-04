package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩸ܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes.dex */
public final class C22865 extends AbstractC0578 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19881 f74303;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C2920 f74304;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C3168 f74306;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashSet f74305 = new HashSet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f74301 = new HashMap();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public HashMap f74302 = new HashMap();

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1516(C14835 c14835) {
        boolean z;
        C14769 c14769M35543 = C14769.m35543();
        C2920 c2920 = this.f74304;
        c2920.f9543 = c14769M35543;
        c2920.f9557 = C14769.m35543();
        c2920.f9560 = C14769.m35543();
        C4937.forEach(c14835.f48523, new C12945(1, this));
        c2920.f9543 = c2920.f9543.m35554();
        c2920.f9557 = c2920.f9557.m35554();
        c2920.f9560 = c2920.f9560.m35554();
        if (c2920.f9551.m35550() && ((C0180) c2920.f9551.f48335).f1261.contains(EnumC7638.MANDATED)) {
            c2920.f9543 = c2920.f9543.m35552((AbstractC9874) c2920.f9551.f48335);
        }
        C14769 c14769 = c2920.f9543;
        C19881 c19881 = this.f74303;
        C14769 c14769M35539 = C14769.m35539((Iterable) C11392.getOrDefault(c19881.f63982, c2920, Collections.EMPTY_SET));
        c14769.getClass();
        c2920.f9543 = c14769M35539.m35549(c14769);
        for (C18079 c18079 : c2920.f9557) {
            C5053 c5053 = (C5053) this.f74302.get(c18079);
            C14769 c147610 = c18079.f59178;
            C24550 c24550 = c18079.f59179;
            Iterator it = c147610.iterator();
            while (it.hasNext()) {
                C14106 c14106M29564 = ((C24550) it.next()).m29564();
                if (c14106M29564.f44618 != c2920) {
                    C7312 c7312 = c19881.f63971;
                    c5053.getClass();
                    C2920 c2921 = c14106M29564.f44618;
                    C11040 c11040 = C22843.f74058;
                    c7312.m34520(c5053, new C11040("compiler", "service.implementation.not.in.right.module", c2921));
                }
                C14106 c14106M29565 = c24550.m29564();
                boolean z2 = c14106M29565.f44618 == c2920;
                boolean z3 = c2920.f9554.get(c14106M29565.f44619) == c14106M29565;
                if (z2 && !z3) {
                    Iterator it2 = c2920.f9546.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (c14106M29565 == ((C24047) it2.next()).f77785) {
                                z = false;
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        Iterator it3 = c2920.f9560.iterator();
                        while (it3.hasNext()) {
                            if (c24550 == ((C18825) it3.next()).f61181) {
                                z = false;
                                break;
                            }
                        }
                    }
                    if (z) {
                        C7312 c7313 = c19881.f63971;
                        c5053.getClass();
                        C25213 c25213 = C13146.f42046;
                        c7313.m34531(c5053, new C25213("compiler", "service.provided.but.not.exported.or.used", c24550));
                    }
                }
            }
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2605(C5141 c5141) {
        boolean z;
        C19881 c19881;
        C14106 c14106 = c5141.f17907.f77785;
        c14106.mo29590();
        AbstractC17836 abstractC17836 = c14106.f44616;
        abstractC17836.getClass();
        Iterable iterableMo7472 = abstractC17836.mo7472((Predicate) null, EnumC13908.RECURSIVE);
        C14769 c14769M35543 = C14769.m35543();
        Iterator it = ((C20074) iterableMo7472).iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            AbstractC11781 abstractC11781 = (AbstractC11781) it.next();
            if (abstractC11781.f38066 == EnumC13603.f43213) {
                C24550 c24550 = (C24550) abstractC11781;
                if (abstractC11781.f38070.mo11630() || c24550.f79575.mo10885() == EnumC17468.CLASS) {
                    c14769M35543 = C14769.m35543();
                    z = true;
                    break;
                } else if (c24550.f79575.mo10885() == EnumC17468.SOURCE) {
                    c14769M35543 = c14769M35543.m35552(c24550.f79575);
                }
            }
        }
        Iterator it2 = c14769M35543.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            c19881 = this.f74303;
            if (!zHasNext) {
                break;
            } else if (C4878.m14928((C4878) c19881.f63956.f56446, (InterfaceC15976) it2.next()) == c5141.f17907.f77785.f44619) {
                z = true;
                break;
            }
        }
        if (!z) {
            C7312 c7312 = c19881.f63971;
            AbstractC22295 abstractC22295 = c5141.f17908;
            abstractC22295.getClass();
            C14106 c14107 = c5141.f17907.f77785;
            C11040 c11040 = C22843.f74058;
            c7312.m34520(abstractC22295, new C11040("compiler", "package.empty.or.not.found", c14107));
        }
        C2920 c2920 = this.f74304;
        c2920.f9543 = c2920.f9543.m35552(c5141.f17907);
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2602(C0666 c0666) {
        this.f74303.f63967.m49985((InterfaceC5075) c0666.f2536, c0666.f2535.f45255);
        C2920 c2920 = this.f74304;
        c2920.f9543 = c2920.f9543.m35552(c0666.f2535);
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2604(C5053 c5053) {
        C10377 c10377;
        C10377 c10378;
        C19881 c19881 = this.f74303;
        C0310 c0310 = c19881.f63954;
        AbstractC22295 abstractC22295 = c5053.f17632;
        AbstractC22664 abstractC22664 = c19881.f63964.f48286;
        C3168 c3168 = this.f74306;
        AbstractC22664 abstractC22664M1981 = c0310.m1981(abstractC22295, c3168, abstractC22664);
        C24550 c24550 = (C24550) abstractC22664M1981.f73596;
        HashMap map = this.f74301;
        boolean z = true;
        if (map.containsKey(c24550)) {
            C7312 c7312 = c19881.f63971;
            abstractC22295.getClass();
            C11040 c11040 = C22843.f74058;
            c7312.m34520(abstractC22295, new C11040("compiler", "repeated.provides.for.service", c24550));
        }
        C18499 c18499 = new C18499();
        Iterator it = c5053.f17631.iterator();
        while (it.hasNext()) {
            AbstractC22295 abstractC22296 = (AbstractC22295) it.next();
            Object obj = c3168.f10272;
            Object obj2 = c3168.f10272;
            boolean z2 = ((C7768) obj).f25566;
            try {
                ((C7768) obj).f25566 = z;
                AbstractC22664 abstractC22664M1982 = c19881.f63954.m1981(abstractC22296, c3168, c19881.f63964.f48286);
                ((C7768) obj2).f25566 = z2;
                C24550 c24551 = (C24550) abstractC22664M1982.f73596;
                if ((c24551.f38071 & 1) == 0) {
                    C7312 c7313 = c19881.f63971;
                    abstractC22296.getClass();
                    AbstractC11781 abstractC11781M29579 = c24551.m29579();
                    C11040 c11041 = C22843.f74058;
                    c7313.m34520(abstractC22296, new C11040("compiler", "not.def.public", c24551, abstractC11781M29579));
                }
                c24551.mo29590();
                AbstractC17836 abstractC17836 = c24551.f79576;
                AbstractC19728 abstractC19728 = c19881.f63962.f49821;
                C10930 c10930 = new C10930();
                abstractC17836.getClass();
                Iterator it2 = abstractC17836.mo7473(abstractC19728, c10930, EnumC13908.RECURSIVE).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        c10377 = null;
                        break;
                    }
                    c10377 = (C10377) ((AbstractC11781) it2.next());
                    if (c10377.mo7874() && (c10377.f38071 & 1) != 0 && c10377.m26691().isEmpty()) {
                        break;
                    }
                }
                if (c10377 != null) {
                    if (!c19881.f63961.m55131(c10377.f38067.mo31585(), abstractC22664M1981, true)) {
                        C7312 c7314 = c19881.f63971;
                        abstractC22296.getClass();
                        c7314.m34520(abstractC22296, C22843.f74144);
                    }
                } else if (!c19881.f63961.m55131(abstractC22664M1982, abstractC22664M1981, true)) {
                    C7312 c7315 = c19881.f63971;
                    abstractC22296.getClass();
                    c7315.m34520(abstractC22296, C22843.f74156);
                } else {
                    c24551.mo29590();
                    if ((c24551.f38071 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                        C7312 c7316 = c19881.f63971;
                        abstractC22296.getClass();
                        C11040 c11042 = C22843.f74058;
                        c7316.m34520(abstractC22296, new C11040("compiler", "service.implementation.is.abstract", c24551));
                    } else if (c24551.m29589()) {
                        C7312 c7317 = c19881.f63971;
                        abstractC22296.getClass();
                        C11040 c11043 = C22843.f74058;
                        c7317.m34520(abstractC22296, new C11040("compiler", "service.implementation.is.inner", c24551));
                    } else {
                        c24551.mo29590();
                        Iterator it3 = c24551.f79576.m38842(c19881.f63962.f49865).iterator();
                        do {
                            if (!it3.hasNext()) {
                                c10378 = null;
                                break;
                            }
                            c10378 = (C10377) ((AbstractC11781) it3.next());
                        } while (!c10378.m26691().isEmpty());
                        if (c10378 == null) {
                            C7312 c7318 = c19881.f63971;
                            abstractC22296.getClass();
                            C11040 c11044 = C22843.f74058;
                            c7318.m34520(abstractC22296, new C11040("compiler", "service.implementation.doesnt.have.a.no.args.constructor", c24551));
                        } else if ((c10378.f38071 & 1) == 0) {
                            C7312 c7319 = c19881.f63971;
                            abstractC22296.getClass();
                            C11040 c11045 = C22843.f74058;
                            c7319.m34520(abstractC22296, new C11040("compiler", "service.implementation.no.args.constructor.not.public", c24551));
                        }
                    }
                }
                if (abstractC22664M1982.m51067(EnumC21172.CLASS)) {
                    if (((Set) C11392.computeIfAbsent(map, c24550, new C22119(0))).add(c24551)) {
                        c18499.m43089(c24551);
                    } else {
                        C7312 c73110 = c19881.f63971;
                        abstractC22296.getClass();
                        C11040 c11046 = C22843.f74058;
                        c73110.m34520(abstractC22296, new C11040("compiler", "duplicate.provides", c24550, c24551));
                    }
                }
                z = true;
                it = it;
                c3168 = c3168;
            } catch (Throwable th) {
                ((C7768) obj2).f25566 = z2;
                throw th;
            }
        }
        if (!abstractC22664M1981.m51067(EnumC21172.CLASS) || c18499.isEmpty()) {
            return;
        }
        C18079 c18079 = new C18079(c24550, c18499.m43093());
        C2920 c2920 = this.f74304;
        c2920.f9557 = c2920.f9557.m35552(c18079);
        c2920.f9543 = c2920.f9543.m35552(c18079);
        this.f74302.put(c18079, c5053);
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2612(C22207 c22207) {
        C0180 c0180 = c22207.f71541;
        AbstractC22295 abstractC22295 = c22207.f71540;
        if (c0180 != null) {
            C19881 c19881 = this.f74303;
            if (c19881.m45782().contains(c22207.f71541.f1262)) {
                C22092 c22092 = c19881.f63967;
                abstractC22295.getClass();
                C2920 c2920 = c22207.f71541.f1262;
                c22092.getClass();
                C6234 c6234 = new C6234(abstractC22295);
                C2920 c2921 = this.f74304;
                c22092.m49975(c6234, c2921, c2920);
                c19881.f63967.m49984(abstractC22295, c2921, c22207.f71541.f1262);
                c19881.f63967.m49980(abstractC22295, c22207.f71541);
                c2921.f9543 = c2921.f9543.m35552(c22207.f71541);
            }
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2610(C20715 c20715) {
        C19881 c19881 = this.f74303;
        C0310 c0310 = c19881.f63954;
        AbstractC22295 abstractC22295 = c20715.f66388;
        AbstractC22664 abstractC22664M1981 = c0310.m1981(abstractC22295, this.f74306, c19881.f63964.f48286);
        if ((C11239.m28352(abstractC22295).mo29591() & 16384) != 0) {
            C7312 c7312 = c19881.f63971;
            abstractC22295.getClass();
            AbstractC22970 abstractC22970 = abstractC22664M1981.f73596;
            C11040 c11040 = C22843.f74058;
            c7312.m34520(abstractC22295, new C11040("compiler", "service.definition.is.enum", abstractC22970));
            return;
        }
        if (abstractC22664M1981.m51067(EnumC21172.CLASS)) {
            C24550 c24550 = (C24550) abstractC22664M1981.f73596;
            if (this.f74305.add(c24550)) {
                C18825 c18825 = new C18825(c24550);
                C2920 c2920 = this.f74304;
                c2920.f9560 = c2920.f9560.m35552(c18825);
                c2920.f9543 = c2920.f9543.m35552(c18825);
                return;
            }
            C7312 c7313 = c19881.f63971;
            C11040 c11041 = C22843.f74058;
            c7313.m34520(c20715, new C11040("compiler", "duplicate.uses", c24550));
        }
    }

    public C22865(C19881 c19881, C2920 c2920, C3168 c3168) {
        this.f74303 = c19881;
        this.f74304 = c2920;
        this.f74306 = c3168;
    }
}
