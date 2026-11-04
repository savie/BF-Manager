package l;

/* JADX INFO: renamed from: l.ۖ۫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: B91A */
/* JADX INFO: loaded from: classes3.dex */
public final class C2678 extends AbstractC24593 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C12901 f8515;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC11528 f8517;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C10135 f8516 = new C10135();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11409 f8514 = new C11409();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2678 m8841(C10621 c10621) {
        C2678 c2678 = new C2678();
        c10621.m27096(c2678);
        return c2678;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8844(AbstractC17376 abstractC17376) {
        this.f8514.m28758(abstractC17376);
    }

    @Override // l.AbstractC24593, l.InterfaceC2963
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8845(C19371 c19371) {
        C11409 c11409 = this.f8514;
        c11409.getClass();
        c11409.m28757(C15707.m37499());
        c11409.m28757(new C6013());
        c11409.m28757(new C11232());
        c11409.m28757(new C16453());
        c11409.m28757(new C23913());
        c11409.m28757(new C17945());
        c11409.m28757(new C17199());
        c11409.m28757(new C3775());
        c11409.m28757(new C11978());
        c11409.m28757(new C23167());
        c11409.m28757(new C20183());
        this.f8515 = new C12901(this.f8516, new C15884());
        this.f8517 = c11409.m28756();
    }

    @Override // l.AbstractC24593, l.InterfaceC2963
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8846(InterfaceC20029 interfaceC20029) {
        AbstractC11528 abstractC11528 = this.f8517;
        if (abstractC11528 != null) {
            abstractC11528.mo29029(interfaceC20029, this.f8515);
            return;
        }
        throw new IllegalStateException("Unexpected state, html-renderer is not defined");
    }

    @Override // l.AbstractC24593, l.InterfaceC2963
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8843(InterfaceC11078 interfaceC11078) {
        interfaceC11078.mo17052(C19229.class, new C9389(this));
        interfaceC11078.mo17052(C10278.class, new C1187(this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8842(C2678 c2678, InterfaceC20029 interfaceC20029, String str) {
        if (str != null) {
            c2678.f8515.m31940(interfaceC20029.builder(), str);
        }
    }
}
