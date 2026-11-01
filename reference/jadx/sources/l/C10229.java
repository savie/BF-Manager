package l;

import java.util.ArrayDeque;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۤۤۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes4.dex */
public final class C10229 extends AbstractC16538 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f34908;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public AbstractC16579 f34909;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public EnumC19401 f34910;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public ArrayDeque f34911;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public C10394 f34912;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC8818 f34913;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public EnumMap f34914;

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1928(InterfaceC15874 interfaceC15874, Object obj) {
        return interfaceC15874.mo4813(this, obj);
    }

    public C10229(C22929 c22929, InterfaceC8818 interfaceC8818, C23800 c23800) {
        EnumC19401 enumC19401;
        super(EnumC6617.UNDETVAR, c22929);
        this.f34911 = new ArrayDeque();
        this.f34909 = null;
        this.f34913 = null;
        this.f34912 = new C15168();
        if (c22929.mo46762()) {
            enumC19401 = EnumC19401.CAPTURED;
        } else {
            enumC19401 = EnumC19401.NORMAL;
        }
        this.f34910 = enumC19401;
        this.f34913 = interfaceC8818;
        EnumMap enumMap = new EnumMap(EnumC8112.class);
        this.f34914 = enumMap;
        C21825 c21825M52381 = c23800.m52381(c22929);
        this.f34908 = c21825M52381.m48596();
        enumMap.put(EnumC8112.f28427, C21825.m48588());
        enumMap.put(EnumC8112.f28425, C21825.m48588());
        enumMap.put(EnumC8112.f28428, C21825.m48588());
        Iterator it = c21825M52381.m48589().iterator();
        while (it.hasNext()) {
            m26010(EnumC8112.f28427, (AbstractC16579) it.next(), c23800, true);
        }
        if (!c22929.mo46762() || c22929.f74536.m39001(EnumC6617.BOT)) {
            return;
        }
        m26010(EnumC8112.f28425, c22929.f74536, c23800, true);
    }

    @Override // l.AbstractC16538, l.AbstractC16579, l.InterfaceC9105
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        m39000(sb, false);
        AbstractC16579 abstractC16579 = this.f34909;
        if (abstractC16579 == null) {
            sb.append(this.f53121);
            sb.append('?');
        } else {
            sb.append(abstractC16579);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final void m26019() {
        if (this.f34910 == EnumC19401.CAPTURED) {
            throw new IllegalStateException();
        }
        this.f34910 = EnumC19401.THROWS;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26015(C10229 c10229, C23800 c23800) {
        c10229.f34913 = null;
        EnumMap enumMap = c10229.f34914;
        enumMap.clear();
        for (EnumC8112 enumC8112 : EnumC8112.values()) {
            enumMap.put(enumC8112, C21825.m48588());
            Iterator it = m26012(enumC8112).iterator();
            while (it.hasNext()) {
                c10229.m26010(enumC8112, (AbstractC16579) it.next(), c23800, true);
            }
        }
        c10229.f34909 = this.f34909;
        c10229.f34913 = this.f34913;
        c10229.f34911 = new ArrayDeque();
        Iterator it2 = this.f34911.iterator();
        while (it2.hasNext()) {
            c10229.f34911.add(((AbstractC16267) it2.next()).mo4311(c10229));
        }
        c10229.f34910 = this.f34910;
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC16579 mo1929(C3794 c3794) {
        throw new AssertionError("Cannot add metadata to an UndetVar type");
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ֡ */
    public final AbstractC16579 mo5593() {
        AbstractC16579 abstractC16579 = this.f34909;
        return abstractC16579 == null ? this : abstractC16579.mo5593();
    }

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m26017() {
        return this.f34909;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m26011(AbstractC16579 abstractC16579) {
        this.f34909 = abstractC16579;
        InterfaceC8818 interfaceC8818 = this.f34913;
        if (interfaceC8818 != null) {
            interfaceC8818.mo22946(this);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m26012(EnumC8112... enumC8112Arr) {
        C19003 c19003 = new C19003();
        for (EnumC8112 enumC8112 : enumC8112Arr) {
            c19003.m43725((C21825) this.f34914.get(enumC8112));
        }
        return c19003.m43726();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26014(EnumC8112 enumC8112, C21825 c21825) {
        this.f34914.put(enumC8112, c21825);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26013(EnumC8112 enumC8112, AbstractC16579 abstractC16579, C23800 c23800) {
        if (c23800.f76962) {
            int iOrdinal = enumC8112.ordinal();
            if (iOrdinal == 0) {
                abstractC16579 = C23800.m52343(abstractC16579);
            } else if (iOrdinal == 2) {
                AbstractC16579 abstractC16579M52352 = C23800.m52352(abstractC16579);
                if (!abstractC16579M52352.m39001(EnumC6617.BOT)) {
                    abstractC16579 = abstractC16579M52352;
                }
            }
        }
        m26010(enumC8112, abstractC16579, c23800, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m26010(EnumC8112 enumC8112, AbstractC16579 abstractC16579, C23800 c23800, boolean z) {
        if (this.f34910 == EnumC19401.CAPTURED && !z) {
            if (abstractC16579.m39001(EnumC6617.UNDETVAR)) {
                C10229 c10229 = (C10229) abstractC16579;
                if (c10229.m26018()) {
                    return;
                }
                c10229.m26010(enumC8112.mo21371(), this, c23800, false);
                return;
            }
            return;
        }
        abstractC16579.getClass();
        C10394 c10394 = this.f34912;
        c10394.getClass();
        AbstractC16579 abstractC16579Mo5593 = ((AbstractC16579) abstractC16579.mo1928(c10394, (Object) null)).mo5593();
        EnumMap enumMap = this.f34914;
        C21825 c21825 = (C21825) enumMap.get(enumC8112);
        if (abstractC16579 == this.f53121) {
            return;
        }
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            if (c23800.m52399((AbstractC16579) it.next(), abstractC16579Mo5593)) {
                return;
            }
        }
        enumMap.put(enumC8112, c21825.m48597(abstractC16579Mo5593));
        InterfaceC8818 interfaceC8818 = this.f34913;
        if (interfaceC8818 != null) {
            interfaceC8818.mo22947(this, enumC8112, abstractC16579Mo5593, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26016(C23800 c23800, C21825 c21825, C21825 c21826) {
        EnumMap enumMap = this.f34914;
        C19003<C2068> c19003 = new C19003();
        InterfaceC8818 interfaceC8818 = this.f34913;
        try {
            this.f34913 = new C16081(this, c19003);
            for (Map.Entry entry : enumMap.entrySet()) {
                EnumC8112 enumC8112 = (EnumC8112) entry.getKey();
                C21825<AbstractC16579> c21827 = (C21825) entry.getValue();
                C19003 c19004 = new C19003();
                C19003 c19005 = new C19003();
                for (AbstractC16579 abstractC16579 : c21827) {
                    if (!abstractC16579.m39005(c21825)) {
                        c19004.m43723(abstractC16579);
                    } else {
                        c19005.m43723(abstractC16579);
                    }
                }
                enumMap.put(enumC8112, c19004.m43726());
                Iterator it = c19005.iterator();
                while (it.hasNext()) {
                    m26010(enumC8112, c23800.m52371((AbstractC16579) it.next(), c21825, c21826), c23800, true);
                }
            }
        } finally {
            this.f34913 = interfaceC8818;
            for (C2068 c2068 : c19003) {
                EnumC8112 enumC8113 = (EnumC8112) c2068.f7664;
                AbstractC16579 abstractC165710 = (AbstractC16579) c2068.f7665;
                InterfaceC8818 interfaceC8819 = this.f34913;
                if (interfaceC8819 != null) {
                    interfaceC8819.mo22947(this, enumC8113, abstractC165710, true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final boolean m26018() {
        return this.f34910 == EnumC19401.CAPTURED;
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m26020() {
        return this.f34910 == EnumC19401.THROWS;
    }
}
