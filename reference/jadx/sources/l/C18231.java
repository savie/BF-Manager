package l;

import java.util.Map;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܿۡ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: I7LP */
/* JADX INFO: loaded from: classes5.dex */
public final class C18231 extends AbstractC6299 {

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7044 f59516;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public C15867 f59517;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public C15867 f59518;

    @Override // l.AbstractC6299
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC6299 mo4038(C3168 c3168, AbstractC22295 abstractC22295) {
        C16327 c16327 = (C16327) this.f21366;
        Map map = this.f21368;
        return new C18231(this.f59516, (C16327) abstractC22295, c3168, c16327, map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18231(C7044 c7044, C16327 c16327, C3168 c3168, C16327 c16328, Map map) {
        super(c7044, c16327, c3168, c16328, map);
        this.f59516 = c7044;
        this.f59518 = C15867.empty();
        this.f59517 = C15867.empty();
    }

    @Override // l.AbstractC6299
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC22664 mo8632(C14479 c14479) {
        try {
            C21193 c21193M1929 = this.f59516.f23245.m1929((AbstractC7378) this.f21366, c14479, (C14769) this.f59518.orElseGet(new Supplier() { // from class: l.ۘۡ᩺
                @Override // java.util.function.Supplier
                public final Object get() {
                    C18231 c18231 = this.f13861;
                    C14769 c14769M28328 = C11239.m28328(((C16327) c18231.f21366).f52999);
                    c18231.f59518 = C15867.of(c14769M28328);
                    return c14769M28328;
                }
            }));
            AbstractC22664 abstractC22664 = c21193M1929.f67667;
            AbstractC22664 abstractC22665 = c21193M1929.f67668;
            m42393(abstractC22664, c14479);
            return abstractC22665;
        } catch (C11540 e) {
            c14479.f45571.mo3910(null, e.m29044());
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42393(AbstractC22664 abstractC22664, C14479 c14479) {
        InterfaceC1013 interfaceC1013 = c14479.f45571;
        C7044 c7044 = this.f59516;
        C0310 c0310 = c7044.f23245;
        C16327 c16327 = (C16327) this.f21366;
        C14479 c14479M1927 = c0310.m1927(c16327, abstractC22664, c14479);
        int i = C12264.f39441[c16327.m38748().ordinal()];
        if (i == 1) {
            AbstractC8036 abstractC8036 = c16327.f53001;
            C7044.m19377(abstractC8036, abstractC8036.f26659, c14479M1927);
        } else if (i == 2) {
            for (C11018 c11018 : (C14769) this.f59517.orElseGet(new Supplier() { // from class: l.ܰۡ᩺
                @Override // java.util.function.Supplier
                public final Object get() {
                    C18499 c18499 = new C18499();
                    C21215 c21215 = new C21215(c18499);
                    C18231 c18231 = this.f45625;
                    c21215.mo5474(((C16327) c18231.f21366).f53001);
                    C14769 c14769M43093 = c18499.m43093();
                    c18231.f59517 = C15867.of(c14769M43093);
                    return c14769M43093;
                }
            })) {
                AbstractC22664 abstractC22665 = c14479M1927.f45575;
                InterfaceC1013 interfaceC1014 = c14479M1927.f45571;
                EnumC21172 enumC21172 = EnumC21172.VOID;
                if (abstractC22665.m51067(enumC21172) && c11018.f34795 != null) {
                    c16327.getClass();
                    interfaceC1014.mo3910(c16327, c7044.f23246.m45980("unexpected.ret.val", new Object[0]));
                } else if (!c14479M1927.f45575.m51067(enumC21172)) {
                    if (c11018.f34795 == null) {
                        c16327.getClass();
                        interfaceC1014.mo3910(c16327, c7044.f23246.m45980("missing.ret.val", new Object[0]));
                    }
                    AbstractC22295 abstractC22295 = c11018.f34795;
                    C7044.m19377(abstractC22295, abstractC22295.f26659, c14479M1927);
                }
            }
        }
        c7044.f23245.m1962(c16327, abstractC22664, interfaceC1013);
    }
}
