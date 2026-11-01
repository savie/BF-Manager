package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ܶܽ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 21V7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15364 extends AbstractC21803 implements InterfaceC23145, InterfaceC21733 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f50039;

    public C15364() {
        super(2);
        this.f50039 = new HashMap();
    }

    @Override // l.AbstractC21803
    /* JADX INFO: renamed from: ܰ */
    public final void mo15147(C12417 c12417) {
        c12417.m2202(true, true, true, false, new C1271(new C15384(0, 10, this)));
        this.f50039.clear();
    }

    @Override // l.AbstractC21803
    /* JADX INFO: renamed from: ۙ */
    public final void mo4483(AbstractC6066 abstractC6066) {
        String strM39114 = abstractC6066.m39114();
        AbstractC11836 abstractC11836M39118 = abstractC6066.m39118();
        if (C1791.m5871(strM39114)) {
            return;
        }
        C9014 c9014 = new C9014(strM39114, abstractC11836M39118, true);
        HashMap map = this.f50039;
        AbstractC16650 abstractC16650 = (AbstractC16650) map.get(c9014);
        if (abstractC16650 == null) {
            map.put(c9014, m36801((AbstractC16650) abstractC6066));
            return;
        }
        Object objM36801 = m36801((AbstractC16650) abstractC6066);
        AbstractC16650 abstractC16650M36801 = m36801(abstractC16650);
        if (objM36801.equals(abstractC16650M36801)) {
            return;
        }
        abstractC16650M36801.mo2194(objM36801);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC16650 m36801(AbstractC16650 abstractC16650) {
        while (abstractC16650.mo2192() != null && (abstractC16650.mo2192() instanceof AbstractC16650)) {
            abstractC16650 = (AbstractC16650) abstractC16650.mo2192();
        }
        return abstractC16650;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InterfaceC18911 m36802(AbstractC6066 abstractC6066) {
        InterfaceC18911 interfaceC18911 = abstractC6066;
        while (interfaceC18911.mo2192() != null && (interfaceC18911.mo2192() instanceof InterfaceC18911)) {
            interfaceC18911 = (InterfaceC18911) interfaceC18911.mo2192();
        }
        return interfaceC18911;
    }
}
