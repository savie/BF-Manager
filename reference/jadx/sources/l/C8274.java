package l;

import java.util.ArrayDeque;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.۠֡᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes4.dex */
public final class C8274 extends AbstractC22445 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public EnumMap f27217;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public EnumC9019 f27218;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public ArrayDeque f27219;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f27220;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public C13777 f27221;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public AbstractC22664 f27222;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC2308 f27223;

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۙ */
    public final Object mo9324(InterfaceC4764 interfaceC4764, Object obj) {
        return interfaceC4764.mo1125(this, obj);
    }

    public C8274(C17969 c17969, InterfaceC2308 interfaceC2308, C24705 c24705) {
        EnumC9019 enumC9019;
        super(EnumC21172.UNDETVAR, c17969);
        this.f27219 = new ArrayDeque();
        this.f27222 = null;
        this.f27223 = null;
        this.f27221 = new C0070();
        if (c17969.mo34139()) {
            enumC9019 = EnumC9019.CAPTURED;
        } else {
            enumC9019 = EnumC9019.NORMAL;
        }
        this.f27218 = enumC9019;
        this.f27223 = interfaceC2308;
        EnumMap enumMap = new EnumMap(EnumC0816.class);
        this.f27217 = enumMap;
        C14769 c14769M55097 = c24705.m55097(c17969);
        this.f27220 = c14769M55097.m35551();
        enumMap.put(EnumC0816.f3091, C14769.m35543());
        enumMap.put(EnumC0816.f3093, C14769.m35543());
        enumMap.put(EnumC0816.f3094, C14769.m35543());
        Iterator it = c14769M55097.m35554().iterator();
        while (it.hasNext()) {
            m22329(EnumC0816.f3091, (AbstractC22664) it.next(), c24705, true);
        }
        if (!c17969.mo34139() || c17969.f58893.m51067(EnumC21172.BOT)) {
            return;
        }
        m22329(EnumC0816.f3093, c17969.f58893, c24705, true);
    }

    @Override // l.AbstractC22445, l.AbstractC22664, l.InterfaceC9769
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        m51066(sb, false);
        AbstractC22664 abstractC22664 = this.f27222;
        if (abstractC22664 == null) {
            sb.append(this.f72657);
            sb.append('?');
        } else {
            sb.append(abstractC22664);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final void m22331() {
        if (this.f27218 == EnumC9019.CAPTURED) {
            throw new IllegalStateException();
        }
        this.f27218 = EnumC9019.THROWS;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22335(C8274 c8274, C24705 c24705) {
        c8274.f27223 = null;
        EnumMap enumMap = c8274.f27217;
        enumMap.clear();
        for (EnumC0816 enumC0816 : EnumC0816.values()) {
            enumMap.put(enumC0816, C14769.m35543());
            Iterator it = m22332(enumC0816).iterator();
            while (it.hasNext()) {
                c8274.m22329(enumC0816, (AbstractC22664) it.next(), c24705, true);
            }
        }
        c8274.f27222 = this.f27222;
        c8274.f27223 = this.f27223;
        c8274.f27219 = new ArrayDeque();
        Iterator it2 = this.f27219.iterator();
        while (it2.hasNext()) {
            c8274.f27219.add(((AbstractC21988) it2.next()).mo13163(c8274));
        }
        c8274.f27218 = this.f27218;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC22664 mo4934(C14458 c14458) {
        throw new AssertionError("Cannot add metadata to an UndetVar type");
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ܿ */
    public final AbstractC22664 mo4935() {
        AbstractC22664 abstractC22664 = this.f27222;
        return abstractC22664 == null ? this : abstractC22664.mo4935();
    }

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m22338() {
        return this.f27222;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m22339(AbstractC22664 abstractC22664) {
        this.f27222 = abstractC22664;
        InterfaceC2308 interfaceC2308 = this.f27223;
        if (interfaceC2308 != null) {
            interfaceC2308.mo7795(this);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m22332(EnumC0816... enumC0816Arr) {
        C18499 c18499 = new C18499();
        for (EnumC0816 enumC0816 : enumC0816Arr) {
            c18499.m43090((C14769) this.f27217.get(enumC0816));
        }
        return c18499.m43093();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22333(EnumC0816 enumC0816, C14769 c14769) {
        this.f27217.put(enumC0816, c14769);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22334(EnumC0816 enumC0816, AbstractC22664 abstractC22664, C24705 c24705) {
        if (c24705.f79929) {
            int iOrdinal = enumC0816.ordinal();
            if (iOrdinal == 0) {
                abstractC22664 = C24705.m55074(abstractC22664);
            } else if (iOrdinal == 2) {
                AbstractC22664 abstractC22664M55078 = C24705.m55078(abstractC22664);
                if (!abstractC22664M55078.m51067(EnumC21172.BOT)) {
                    abstractC22664 = abstractC22664M55078;
                }
            }
        }
        m22329(enumC0816, abstractC22664, c24705, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22329(EnumC0816 enumC0816, AbstractC22664 abstractC22664, C24705 c24705, boolean z) {
        if (this.f27218 == EnumC9019.CAPTURED && !z) {
            if (abstractC22664.m51067(EnumC21172.UNDETVAR)) {
                C8274 c8274 = (C8274) abstractC22664;
                if (c8274.m22330()) {
                    return;
                }
                c8274.m22329(enumC0816.mo3284(), this, c24705, false);
                return;
            }
            return;
        }
        abstractC22664.getClass();
        C13777 c13777 = this.f27221;
        c13777.getClass();
        AbstractC22664 abstractC22664Mo4935 = ((AbstractC22664) abstractC22664.mo9324(c13777, (Object) null)).mo4935();
        EnumMap enumMap = this.f27217;
        C14769 c14769 = (C14769) enumMap.get(enumC0816);
        if (abstractC22664 == this.f72657) {
            return;
        }
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            if (c24705.m55149((AbstractC22664) it.next(), abstractC22664Mo4935)) {
                return;
            }
        }
        enumMap.put(enumC0816, c14769.m35552(abstractC22664Mo4935));
        InterfaceC2308 interfaceC2308 = this.f27223;
        if (interfaceC2308 != null) {
            interfaceC2308.mo7796(this, enumC0816, abstractC22664Mo4935, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22336(C24705 c24705, C14769 c14769, C14769 c147610) {
        EnumMap enumMap = this.f27217;
        C18499<C5558> c18499 = new C18499();
        InterfaceC2308 interfaceC2308 = this.f27223;
        try {
            this.f27223 = new C21755(this, c18499);
            for (Map.Entry entry : enumMap.entrySet()) {
                EnumC0816 enumC0816 = (EnumC0816) entry.getKey();
                C14769<AbstractC22664> c147611 = (C14769) entry.getValue();
                C18499 c184910 = new C18499();
                C18499 c184911 = new C18499();
                for (AbstractC22664 abstractC22664 : c147611) {
                    if (!abstractC22664.m51073(c14769)) {
                        c184910.m43089(abstractC22664);
                    } else {
                        c184911.m43089(abstractC22664);
                    }
                }
                enumMap.put(enumC0816, c184910.m43093());
                Iterator it = c184911.iterator();
                while (it.hasNext()) {
                    m22329(enumC0816, c24705.m55103((AbstractC22664) it.next(), c14769, c147610), c24705, true);
                }
            }
        } finally {
            this.f27223 = interfaceC2308;
            for (C5558 c5558 : c18499) {
                EnumC0816 enumC0817 = (EnumC0816) c5558.f19300;
                AbstractC22664 abstractC22665 = (AbstractC22664) c5558.f19301;
                InterfaceC2308 interfaceC2309 = this.f27223;
                if (interfaceC2309 != null) {
                    interfaceC2309.mo7796(this, enumC0817, abstractC22665, true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m22330() {
        return this.f27218 == EnumC9019.CAPTURED;
    }

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final boolean m22337() {
        return this.f27218 == EnumC9019.THROWS;
    }
}
