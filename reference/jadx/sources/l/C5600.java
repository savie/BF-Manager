package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ۚ᩷ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public final class C5600 extends AbstractC17449 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public HashSet f19204 = new HashSet();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23800 f19205;

    @Override // l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1767(Object obj, AbstractC16579 abstractC16579) {
        AbstractC16579 abstractC165710 = (AbstractC16579) obj;
        boolean z = true;
        switch (C14068.f46214[abstractC16579.mo1933().ordinal()]) {
            case 3:
                return Boolean.valueOf(!abstractC165710.m39001(EnumC6617.CHAR) && abstractC16579.mo1933().m17953(abstractC165710.mo1933()));
            case 4:
                return Boolean.valueOf(!abstractC165710.m39001(EnumC6617.SHORT) && abstractC16579.mo1933().m17953(abstractC165710.mo1933()));
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return Boolean.valueOf(abstractC16579.mo1933().m17953(abstractC165710.mo1933()));
            case 10:
            case 11:
                return Boolean.valueOf(abstractC16579.m39001(abstractC165710.mo1933()));
            case 12:
                return Boolean.valueOf(this.f19205.m52413(abstractC16579.mo18112(), abstractC165710, false));
            case 13:
                if (!abstractC165710.m39001(EnumC6617.BOT) && !abstractC165710.m39001(EnumC6617.CLASS) && !abstractC165710.m39001(EnumC6617.ARRAY) && !abstractC165710.m39001(EnumC6617.TYPEVAR)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 14:
            case 15:
                return Boolean.FALSE;
            default:
                throw new AssertionError("isSubtype " + abstractC16579.mo1933());
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C0309 c0309, Object obj) {
        boolean zM52396;
        AbstractC16579 abstractC16579 = (AbstractC16579) obj;
        AbstractC0618 abstractC0618 = abstractC16579.f53222;
        C23800 c23800 = this.f19205;
        AbstractC16579 abstractC16579M52423 = c23800.m52423(abstractC0618, c0309);
        if (abstractC16579M52423 == null) {
            return Boolean.FALSE;
        }
        boolean z = false;
        if (!abstractC16579M52423.m39001(EnumC6617.CLASS)) {
            return Boolean.valueOf(c23800.m52413(abstractC16579M52423, abstractC16579, false));
        }
        if (abstractC16579M52423.f53222 == abstractC16579.f53222) {
            if (!abstractC16579.mo1942()) {
                if (c23800.m52413(abstractC16579M52423.mo1934(), abstractC16579.mo1934(), false)) {
                    z = true;
                }
            } else {
                C7571 c7571 = new C7571(abstractC16579, abstractC16579M52423, c23800);
                HashSet hashSet = this.f19204;
                if (hashSet.add(c7571)) {
                    try {
                        zM52396 = c23800.m52396(abstractC16579.mo1938(), abstractC16579M52423.mo1938());
                        hashSet.remove(c7571);
                    } catch (Throwable th) {
                        hashSet.remove(c7571);
                        throw th;
                    }
                } else {
                    zM52396 = c23800.m52396(abstractC16579.mo1938(), m15471(abstractC16579M52423).mo1938());
                }
                if (zM52396) {
                    if (c23800.m52413(abstractC16579M52423.mo1934(), abstractC16579.mo1934(), false)) {
                        z = true;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo4812(C5954 c5954, Object obj) {
        return Boolean.TRUE;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo6580(C8777 c8777, Object obj) {
        AbstractC16579 abstractC16579 = (AbstractC16579) obj;
        boolean zM39001 = abstractC16579.m39001(EnumC6617.ARRAY);
        C23800 c23800 = this.f19205;
        if (zM39001) {
            if (c8777.f30194.mo9481()) {
                return Boolean.valueOf(c23800.m52399(c8777.f30194, c23800.m52416(abstractC16579)));
            }
            return Boolean.valueOf(c23800.m52413(c8777.f30194, c23800.m52416(abstractC16579), false));
        }
        if (abstractC16579.m39001(EnumC6617.CLASS)) {
            AbstractC11242 abstractC11242Mo20270 = abstractC16579.f53222.mo20270();
            C23942 c23942 = c23800.f76940;
            return Boolean.valueOf(abstractC11242Mo20270 == c23942.f77535 || abstractC11242Mo20270 == c23942.f77617 || abstractC11242Mo20270 == c23942.f77587);
        }
        return Boolean.FALSE;
    }

    @Override // l.AbstractC18154, l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4813(C10229 c10229, Object obj) {
        AbstractC16579 abstractC16579 = (AbstractC16579) obj;
        if (c10229 == abstractC16579 || c10229.f53121 == abstractC16579 || abstractC16579.m39001(EnumC6617.ERROR) || abstractC16579.m39001(EnumC6617.UNKNOWN)) {
            return Boolean.TRUE;
        }
        if (abstractC16579.m39001(EnumC6617.BOT)) {
            return Boolean.FALSE;
        }
        c10229.m26013(EnumC8112.f28427, abstractC16579, this.f19205);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC16579 m15471(AbstractC16579 abstractC16579) {
        C0350 c0350;
        C23800 c23800 = this.f19205;
        C3836 c3836 = c23800.f76937;
        if (!abstractC16579.mo1942()) {
            return abstractC16579;
        }
        C19003 c19003 = new C19003();
        C19003 c19004 = new C19003();
        try {
            c23800.m52387(abstractC16579.f53222.f77449, abstractC16579, c19003, c19004);
            if (c19003.isEmpty()) {
                return abstractC16579;
            }
            C19003 c19005 = new C19003();
            boolean z = false;
            for (AbstractC16579 abstractC165710 : c19004.m43726()) {
                AbstractC16579 abstractC16579M15471 = m15471(abstractC165710);
                if (abstractC16579M15471.mo2034() && !abstractC16579M15471.mo2036()) {
                    c0350 = new C0350(c3836.f14275, EnumC15395.UNBOUND, c3836.f14239, null, abstractC16579M15471.f53221);
                } else {
                    if (abstractC16579M15471 != abstractC165710) {
                        c0350 = new C0350(c23800.m52415(abstractC16579M15471), EnumC15395.EXTENDS, c3836.f14239, null, abstractC16579M15471.f53221);
                    }
                    c19005.m43723(abstractC16579M15471);
                }
                abstractC16579M15471 = c0350;
                z = true;
                c19005.m43723(abstractC16579M15471);
            }
            return z ? c23800.m52371(abstractC16579.f53222.f77449, c19003.m43726(), c19005.m43726()) : abstractC16579;
        } catch (C23240 e) {
            throw new AssertionError(e);
        }
    }

    public C5600(C23800 c23800) {
        this.f19205 = c23800;
    }
}
