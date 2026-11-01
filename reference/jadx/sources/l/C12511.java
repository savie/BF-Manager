package l;

import java.util.HashSet;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۫ܺۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes4.dex */
public final class C12511 extends C10394 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C21825 f41871;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public HashSet f41872 = new HashSet();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23800 f41873;

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C0309 c0309, Object obj) {
        final EnumC6865 enumC6865 = (EnumC6865) obj;
        boolean zMo12731 = c0309.mo12731();
        C23800 c23800 = this.f41873;
        if (zMo12731) {
            C21825 c21825M52356 = c23800.m52356(c0309);
            C21825 c21825M48592 = c21825M52356.m48592(new Function() { // from class: l.᩷ܺۤ
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo33696andThen(Function function) {
                    return C4277.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C4277.$default$compose(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    AbstractC16579 abstractC16579 = (AbstractC16579) obj2;
                    abstractC16579.getClass();
                    return (AbstractC16579) abstractC16579.mo1928(this.f68318, enumC6865);
                }
            });
            if (c21825M52356 != c21825M48592) {
                return c23800.m52442(c21825M48592);
            }
        } else {
            AbstractC16579 abstractC16579Mo1934 = c0309.mo1934();
            AbstractC16579 abstractC16579 = (AbstractC16579) abstractC16579Mo1934.mo1928(this, enumC6865);
            C21825<AbstractC16579> c21825Mo1938 = c0309.mo1938();
            C21825 c21825Mo1939 = c0309.f53222.f77449.mo1938();
            C19003 c19003 = new C19003();
            boolean z = false;
            for (AbstractC16579 abstractC165710 : c21825Mo1938) {
                AbstractC16579 abstractC165711 = abstractC165710.m39005(this.f41871) ? (AbstractC16579) abstractC165710.mo1928(new C16744(this, c0309, ((AbstractC16579) c21825Mo1939.f70876).mo18112()), enumC6865) : abstractC165710;
                if (!abstractC165711.m39001(EnumC6617.BOT)) {
                    c19003.m43723(abstractC165711);
                    z |= abstractC165710 != abstractC165711;
                    c21825Mo1939 = c21825Mo1939.f70877;
                } else {
                    return c23800.f76937.f14228;
                }
            }
            if (abstractC16579 != abstractC16579Mo1934 || z) {
                return new C16039(abstractC16579, c19003.m43726(), c0309.f53222, c0309.f53221);
            }
        }
        return c0309;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo6580(C8777 c8777, Object obj) {
        AbstractC16579 abstractC16579 = c8777.f30194;
        AbstractC16579 abstractC165710 = (AbstractC16579) abstractC16579.mo1928(this, (EnumC6865) obj);
        if (abstractC165710 == abstractC16579) {
            return c8777;
        }
        if (abstractC165710.m39001(EnumC6617.BOT)) {
            return this.f41873.f76937.f14228;
        }
        return new C20272(abstractC165710, c8777.f53222, c8777.f53221);
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1769(C22929 c22929, Object obj) {
        AbstractC16579 abstractC16579Mo18112;
        EnumC6865 enumC6865 = (EnumC6865) obj;
        C3836 c3836 = this.f41873.f76937;
        if (!this.f41871.contains(c22929)) {
            return c22929;
        }
        HashSet hashSet = this.f41872;
        if (!hashSet.add(c22929)) {
            return enumC6865 == EnumC6865.f23146 ? c3836.f14275 : c3836.f14228;
        }
        try {
            int iOrdinal = enumC6865.ordinal();
            if (iOrdinal == 0) {
                abstractC16579Mo18112 = c22929.mo18112();
            } else {
                if (iOrdinal != 1) {
                    C6171.m17170();
                    throw null;
                }
                abstractC16579Mo18112 = c22929.f74536;
                if (abstractC16579Mo18112 == null) {
                    abstractC16579Mo18112 = c3836.f14228;
                }
            }
            abstractC16579Mo18112.getClass();
            AbstractC16579 abstractC16579 = (AbstractC16579) abstractC16579Mo18112.mo1928(this, enumC6865);
            hashSet.remove(c22929);
            return abstractC16579;
        } catch (Throwable th) {
            hashSet.remove(c22929);
            throw th;
        }
    }

    public C12511(C23800 c23800, C21825 c21825) {
        this.f41873 = c23800;
        this.f41871 = c21825;
    }
}
