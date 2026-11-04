package l;

import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: l.۟ᩳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes4.dex */
public final class C8075 extends AbstractC1100 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24705 f26722;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C18499 f26723;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public HashSet f26724 = new HashSet();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public HashMap f26725 = new HashMap();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C18499 f26726;

    @Override // l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo1766(Object obj, AbstractC22664 abstractC22664) {
        return null;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1767(C2832 c2832, Object obj) {
        AbstractC22664 abstractC22664 = (AbstractC22664) obj;
        if (!abstractC22664.m51067(EnumC21172.ARRAY)) {
            return null;
        }
        C24705 c24705 = this.f26722;
        m21968(c24705.m55120(c2832), c24705.m55120(abstractC22664));
        return null;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C10510 c10510, Object obj) {
        AbstractC22664 abstractC22664 = (AbstractC22664) obj;
        if (!abstractC22664.m51067(EnumC21172.CLASS)) {
            return null;
        }
        C14769 c14769Mo9323 = c10510.mo9323();
        C14769 c14769Mo9324 = abstractC22664.mo9323();
        if (c14769Mo9323.m35551() != c14769Mo9324.m35551()) {
            return null;
        }
        while (c14769Mo9323.m35550()) {
            m21968((AbstractC22664) c14769Mo9323.f48335, (AbstractC22664) c14769Mo9324.f48335);
            c14769Mo9323 = c14769Mo9323.f48336;
            c14769Mo9324 = c14769Mo9324.f48336;
        }
        return null;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1769(C10729 c10729, Object obj) {
        AbstractC22664 abstractC22664 = (AbstractC22664) obj;
        boolean zMo27317 = c10729.mo27317();
        C24705 c24705 = this.f26722;
        if (zMo27317) {
            m21968(c24705.m55123(c10729), c24705.m55123(abstractC22664));
            return null;
        }
        if (!c10729.mo27320()) {
            return null;
        }
        m21968(c24705.m55084(c10729), c24705.m55084(abstractC22664));
        return null;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1771(C17969 c17969, Object obj) {
        AbstractC22664 abstractC22664 = (AbstractC22664) obj;
        AbstractC22970 abstractC22970 = c17969.f73596;
        HashMap map = this.f26725;
        AbstractC22664 abstractC22665 = (AbstractC22664) map.get(abstractC22970);
        if (abstractC22665 != null) {
            boolean zMo27320 = abstractC22665.mo27320();
            C24705 c24705 = this.f26722;
            if (zMo27320 && abstractC22664.mo27320()) {
                if (!c24705.m55131(c24705.m55084(abstractC22665), c24705.m55084(abstractC22664), true)) {
                    abstractC22664 = abstractC22665;
                }
            } else {
                if (abstractC22665.mo27317() && abstractC22664.mo27317()) {
                    if (c24705.m55131(c24705.m55123(abstractC22665), c24705.m55123(abstractC22664), true)) {
                    }
                } else if (!c24705.m55149(abstractC22665, abstractC22664)) {
                    throw new C0617();
                }
                abstractC22664 = abstractC22665;
            }
        } else {
            this.f26726.m43089(c17969);
            this.f26723.m43089(abstractC22664);
        }
        map.put(c17969.f73596, abstractC22664);
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m21968(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665) {
        C4567 c4567 = new C4567(abstractC22664, abstractC22665, this.f26722);
        HashSet hashSet = this.f26724;
        if (hashSet.add(c4567)) {
            try {
                abstractC22664.mo9324(this, abstractC22665);
            } finally {
                hashSet.remove(c4567);
            }
        }
    }

    public C8075(C24705 c24705, C18499 c18499, C18499 c184910) {
        this.f26722 = c24705;
        this.f26726 = c18499;
        this.f26723 = c184910;
    }
}
