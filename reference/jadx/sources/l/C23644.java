package l;

import net.engio.mbassy.listener.MessageHandler;

/* JADX INFO: renamed from: l.᩹ܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAXR */
/* JADX INFO: loaded from: classes.dex */
public final class C23644 extends AbstractC3506 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9471 f76700;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC3506 f76701;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC3506 f76702;

    public C23644(C9471 c9471, AbstractC3506 abstractC3506, AbstractC3506 abstractC3507) {
        this.f76700 = c9471;
        this.f76701 = abstractC3506;
        this.f76702 = abstractC3507;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23644 m52881(C9471 c9471, AbstractC3506 abstractC3506, AbstractC3506 abstractC3507) {
        return new C23644(c9471, abstractC3506, abstractC3507);
    }

    @Override // l.AbstractC3506
    /* JADX INFO: renamed from: ۙ */
    public final int mo11499() {
        return (((Boolean) this.f76700.f30689.orElse(Boolean.FALSE)).booleanValue() ? this.f76701 : this.f76702).mo11499();
    }

    public final String toString() {
        C3179 c3179M46714 = C20333.m46714(this);
        c3179M46714.m10379(this.f76700, MessageHandler.Properties.Condition);
        c3179M46714.m10379(this.f76701, "thenIndent");
        c3179M46714.m10379(this.f76702, "elseIndent");
        return c3179M46714.toString();
    }
}
