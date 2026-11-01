package l;

import java.util.Map;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.۬֡ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7LP */
/* JADX INFO: loaded from: classes4.dex */
public final class C12761 extends AbstractC11350 {

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public C11521 f42550;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public C11521 f42551;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8528 f42552;

    @Override // l.AbstractC11350
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11350 mo6775(C4603 c4603, AbstractC5930 abstractC5930) {
        C22489 c22489 = (C22489) this.f38291;
        Map map = this.f38293;
        return new C12761(this.f42552, (C22489) abstractC5930, c4603, c22489, map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12761(C8528 c8528, C22489 c22489, C4603 c4603, C22489 c224810, Map map) {
        super(c8528, c22489, c4603, c224810, map);
        this.f42552 = c8528;
        this.f42550 = C11521.empty();
        this.f42551 = C11521.empty();
    }

    @Override // l.AbstractC11350
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC16579 mo6776(C1116 c1116) {
        try {
            C13112 c13112M18296 = this.f42552.f29530.m18296((AbstractC16844) this.f38291, c1116, (C21825) this.f42550.orElseGet(new Supplier() { // from class: l.ۚ֡ۤ
                @Override // java.util.function.Supplier
                public final Object get() {
                    C12761 c12761 = this.f17404;
                    C21825 c21825M9446 = C3128.m9446(((C22489) c12761.f38291).f73410);
                    c12761.f42550 = C11521.of(c21825M9446);
                    return c21825M9446;
                }
            }));
            AbstractC16579 abstractC16579 = c13112M18296.f43681;
            AbstractC16579 abstractC165710 = c13112M18296.f43682;
            m31714(abstractC16579, c1116);
            return abstractC165710;
        } catch (C23945 e) {
            c1116.f5037.mo2545(null, e.m52780());
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31714(AbstractC16579 abstractC16579, C1116 c1116) {
        InterfaceC18195 interfaceC18195 = c1116.f5037;
        C8528 c8528 = this.f42552;
        C6761 c6761 = c8528.f29530;
        C22489 c22489 = (C22489) this.f38291;
        C1116 c1116M18293 = c6761.m18293(c22489, abstractC16579, c1116);
        int i = C13467.f44534[c22489.m49993().ordinal()];
        if (i == 1) {
            AbstractC8774 abstractC8774 = c22489.f73408;
            C8528.m22276(abstractC8774, abstractC8774.f30190, c1116M18293);
        } else if (i == 2) {
            for (C11200 c11200 : (C21825) this.f42551.orElseGet(new Supplier() { // from class: l.᩹֡ۤ
                @Override // java.util.function.Supplier
                public final Object get() {
                    C19003 c19003 = new C19003();
                    C0765 c0765 = new C0765(c19003);
                    C12761 c12761 = this.f71138;
                    c0765.mo7248(((C22489) c12761.f38291).f73408);
                    C21825 c21825M43726 = c19003.m43726();
                    c12761.f42551 = C11521.of(c21825M43726);
                    return c21825M43726;
                }
            })) {
                AbstractC16579 abstractC165710 = c1116M18293.f5036;
                InterfaceC18195 interfaceC18196 = c1116M18293.f5037;
                EnumC6617 enumC6617 = EnumC6617.VOID;
                if (abstractC165710.m39001(enumC6617) && c11200.f37914 != null) {
                    c22489.getClass();
                    interfaceC18196.mo2545(c22489, c8528.f29525.m51914("unexpected.ret.val", new Object[0]));
                } else if (!c1116M18293.f5036.m39001(enumC6617)) {
                    if (c11200.f37914 == null) {
                        c22489.getClass();
                        interfaceC18196.mo2545(c22489, c8528.f29525.m51914("missing.ret.val", new Object[0]));
                    }
                    AbstractC5930 abstractC5930 = c11200.f37914;
                    C8528.m22276(abstractC5930, abstractC5930.f30190, c1116M18293);
                }
            }
        }
        c8528.f29530.m18319(c22489, abstractC16579, interfaceC18195);
    }
}
