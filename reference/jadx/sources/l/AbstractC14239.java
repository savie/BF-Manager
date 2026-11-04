package l;

/* JADX INFO: renamed from: l.ܰ֡᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14239 extends C13777 {
    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public AbstractC22664 mo1768(C10510 c10510, Object obj) {
        AbstractC22664 abstractC22664Mo23449 = c10510.mo23449();
        AbstractC22664 abstractC22664 = (AbstractC22664) abstractC22664Mo23449.mo9324(this, obj);
        C14769 c14769Mo15882 = c10510.mo15882();
        C14769 c14769M33663 = m33663(obj, c14769Mo15882);
        return (abstractC22664 == abstractC22664Mo23449 && c14769M33663 == c14769Mo15882) ? c10510 : new C12002(abstractC22664, c14769M33663, c10510.f73596, c10510.f73595);
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public AbstractC22664 mo1769(C10729 c10729, Object obj) {
        AbstractC22664 abstractC22664 = c10729.f34074;
        if (abstractC22664 != null) {
            abstractC22664 = (AbstractC22664) m34207(obj, abstractC22664);
        }
        AbstractC22664 abstractC22665 = abstractC22664;
        return abstractC22665 == c10729.f34074 ? c10729 : new C6037(abstractC22665, c10729.f34073, c10729.f73596, c10729.f34072, c10729.f73595);
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public C2832 mo1767(C2832 c2832, Object obj) {
        AbstractC22664 abstractC22664 = c2832.f9333;
        AbstractC22664 abstractC22665 = (AbstractC22664) abstractC22664.mo9324(this, obj);
        return abstractC22665 == abstractC22664 ? c2832 : new C23937(abstractC22665, c2832.f73596, c2832.f73595);
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public C23191 mo2231(C23191 c23191, Object obj) {
        C14769 c14769 = c23191.f75155;
        AbstractC22664 abstractC22664 = c23191.f75156;
        C14769 c147610 = c23191.f75157;
        C14769 c14769M33663 = m33663(obj, c14769);
        AbstractC22664 abstractC22665 = (AbstractC22664) abstractC22664.mo9324(this, obj);
        C14769 c14769M33664 = m33663(obj, c147610);
        return (c14769M33663 == c14769 && abstractC22665 == abstractC22664 && c14769M33664 == c147610) ? c23191 : new C3799(c14769M33663, abstractC22665, c14769M33664, c23191.f73596);
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public AbstractC22664 mo4102(C5291 c5291, Object obj) {
        return (AbstractC22664) c5291.f72657.mo9324(this, obj);
    }
}
