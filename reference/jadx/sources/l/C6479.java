package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes3.dex */
public class C6479 implements InterfaceC8715 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC22664 f21778;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C24550 f21779;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11172 f21780;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC21654 f21781;

    public C6479(C11172 c11172, C24550 c24550) {
        this.f21780 = c11172;
        this.f21779 = c24550;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:22:0x0067 A[Catch: all -> 0x00cf, TRY_ENTER, TryCatch #1 {all -> 0x00cf, blocks: (B:18:0x005c, B:22:0x0067, B:23:0x007a), top: B:33:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:23:0x007a A[Catch: all -> 0x00cf, TRY_LEAVE, TryCatch #1 {all -> 0x00cf, blocks: (B:18:0x005c, B:22:0x0067, B:23:0x007a), top: B:33:0x005c }] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C23892 m18311(C7970 c7970) {
        C11172 c11172;
        C7312 c7312;
        InterfaceC15976 interfaceC15976M34530;
        C10377 c10377;
        AbstractC22664 abstractC22664M18300 = m18300(c7970.f69124);
        C18499 c18499 = new C18499();
        C14769 c14769 = c7970.f26500;
        while (true) {
            C21566 c21566 = null;
            if (!c14769.m35550()) {
                return new C23892(abstractC22664M18300, c18499.m43093(), null);
            }
            AbstractC19728 abstractC19728 = (AbstractC19728) ((C5558) c14769.f48335).f19300;
            try {
                Iterator it = abstractC22664M18300.f73596.mo29571().m38842(abstractC19728).iterator();
                while (true) {
                    if (it.hasNext()) {
                        AbstractC11781 abstractC11781 = (AbstractC11781) it.next();
                        if (abstractC11781.f38066 == EnumC13603.f43218 && abstractC11781.f38067.mo50621().m35551() == 0) {
                            c10377 = (C10377) abstractC11781;
                        }
                        c11172 = this.f21780;
                        c7312 = c11172.f35184;
                        C14764 c14764 = c11172.f35200;
                        interfaceC15976M34530 = c7312.m34530(this.f21779.f79575);
                        try {
                            if (c11172.f35194) {
                                if (c21566 == null) {
                                    C25213 c25213 = C13146.f42046;
                                    c7312.m34529(new C25213("compiler", "annotation.method.not.found", abstractC22664M18300, abstractC19728));
                                } else {
                                    C17007 c17007M49041 = c21566.m49041();
                                    C25213 c25214 = C13146.f42046;
                                    c7312.m34529(new C25213("compiler", "annotation.method.not.found.reason", abstractC22664M18300, abstractC19728, c17007M49041));
                                }
                            }
                            c7312.m34530(interfaceC15976M34530);
                            c10377 = new C10377(1025L, abstractC19728, new C23191(C14769.m35543(), c14764.f48241, C14769.m35543(), c14764.f48275), abstractC22664M18300.f73596);
                        } catch (Throwable th) {
                            c7312.m34530(interfaceC15976M34530);
                            throw th;
                        }
                    } else {
                        c11172 = this.f21780;
                        c7312 = c11172.f35184;
                        C14764 c14765 = c11172.f35200;
                        interfaceC15976M34530 = c7312.m34530(this.f21779.f79575);
                        if (c11172.f35194) {
                            if (c21566 == null) {
                                C25213 c25215 = C13146.f42046;
                                c7312.m34529(new C25213("compiler", "annotation.method.not.found", abstractC22664M18300, abstractC19728));
                            } else {
                                C17007 c17007M49042 = c21566.m49041();
                                C25213 c25216 = C13146.f42046;
                                c7312.m34529(new C25213("compiler", "annotation.method.not.found.reason", abstractC22664M18300, abstractC19728, c17007M49042));
                            }
                        }
                        c7312.m34530(interfaceC15976M34530);
                        c10377 = new C10377(1025L, abstractC19728, new C23191(C14769.m35543(), c14765.f48241, C14769.m35543(), c14765.f48275), abstractC22664M18300.f73596);
                    }
                    c18499.m43089(new C5558(c10377, m18299(c10377.f38067.mo31585(), (AbstractC21654) ((C5558) c14769.f48335).f19301)));
                    c14769 = c14769.f48336;
                }
            } catch (C21566 e) {
                c21566 = e;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC21654 m18299(AbstractC22664 abstractC22664, AbstractC21654 abstractC21654) {
        AbstractC22664 abstractC22665 = this.f21778;
        try {
            this.f21778 = abstractC22664;
            abstractC21654.mo12192(this);
            return this.f21781;
        } finally {
            this.f21778 = abstractC22665;
        }
    }

    @Override // l.InterfaceC14940
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18301(C3754 c3754) {
        this.f21781 = c3754;
    }

    @Override // l.InterfaceC14940
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18304(C16432 c16432) {
        this.f21781 = c16432;
    }

    @Override // l.InterfaceC14940
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18307(C20908 c20908) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC14940
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18309(C23892 c23892) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC14940
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18305(C17924 c17924) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC14940
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18303(C12703 c12703) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC8715
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18306(C19157 c19157) {
        C5816 c5816;
        AbstractC22664 abstractC22664 = c19157.f61985;
        AbstractC19728 abstractC19728 = c19157.f61984;
        AbstractC22970 abstractC22970 = m18300(abstractC22664).f73596;
        C5816 c5817 = null;
        try {
            Iterator it = abstractC22970.mo29571().m38842(abstractC19728).iterator();
            while (true) {
                if (!it.hasNext()) {
                    c5816 = null;
                    break;
                }
                AbstractC11781 abstractC11781 = (AbstractC11781) it.next();
                if (abstractC11781.f38066 == EnumC13603.f43205) {
                    c5816 = (C5816) abstractC11781;
                    break;
                }
            }
            e = null;
            c5817 = c5816;
        } catch (C21566 e) {
            e = e;
        }
        if (c5817 == null) {
            C11172 c11172 = this.f21780;
            if (e != null) {
                C7312 c7312 = c11172.f35184;
                InterfaceC15976 interfaceC15976 = c11172.f35182;
                C17007 c17007M49041 = e.m49041();
                C25213 c25213 = C13146.f42046;
                c7312.m34529(new C25213("compiler", "unknown.enum.constant.reason", interfaceC15976, abstractC22970, abstractC19728, c17007M49041));
            } else {
                C7312 c7313 = c11172.f35184;
                InterfaceC15976 interfaceC15977 = c11172.f35182;
                C25213 c25214 = C13146.f42046;
                c7313.m34529(new C25213("compiler", "unknown.enum.constant", interfaceC15977, abstractC22970, abstractC19728));
            }
            this.f21781 = new C20908(abstractC22970.f38067, new C5816(0L, c19157.f61984, c11172.f35200.f48241, abstractC22970));
            return;
        }
        this.f21781 = new C20908(abstractC22970.f38067, c5817);
    }

    @Override // l.InterfaceC8715
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18308(C21395 c21395) {
        this.f21781 = new C16432(m18300(c21395.f68156), this.f21780.f35183);
    }

    @Override // l.InterfaceC8715
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18310(C24379 c24379) {
        C14769 c14769 = c24379.f79094;
        AbstractC21654[] abstractC21654Arr = new AbstractC21654[c14769.m35551()];
        AbstractC22664 abstractC22664M55120 = this.f21780.f35183.m55120(this.f21778);
        int i = 0;
        while (c14769.m35550()) {
            abstractC21654Arr[i] = m18299(abstractC22664M55120, (AbstractC21654) c14769.f48335);
            c14769 = c14769.f48336;
            i++;
        }
        this.f21781 = new C17924(this.f21778, abstractC21654Arr);
    }

    @Override // l.InterfaceC8715
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18302(C7970 c7970) {
        this.f21781 = m18311(c7970);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m18300(AbstractC22664 abstractC22664) {
        if (!(abstractC22664 instanceof C2749)) {
            return abstractC22664;
        }
        C2749 c2749 = (C2749) abstractC22664;
        C24550 c24550 = this.f21779;
        C11972.m30026(c24550.f38069.f38066 == EnumC13603.f43214);
        C11172 c11172 = this.f21780;
        C2920 c2920 = c11172.f35175;
        c11172.f35175 = (C2920) c24550.f38069;
        try {
            return c2749.m9098();
        } finally {
            c11172.f35175 = c2920;
        }
    }
}
