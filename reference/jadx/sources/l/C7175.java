package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.۟ۖ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes3.dex */
public final class C7175 extends C20581 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AbstractC16579 f23963;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f23964;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13609 f23965;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C18258 f23966;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7175(C13609 c13609, AbstractC0618 abstractC0618, C18258 c18258, AbstractC5930 abstractC5930) {
        super(c13609, abstractC0618);
        this.f23965 = c13609;
        this.f23964 = false;
        this.f23966 = c18258;
        this.f23963 = abstractC5930 != null ? abstractC5930.f30190 : AbstractC16579.f53219;
    }

    @Override // l.C20581, l.InterfaceC15643
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC16579 mo8774() {
        if (this.f67072 == null) {
            C13609 c13609 = this.f23965;
            AbstractC16579 abstractC16579M52409 = c13609.f44895.m52409(this.f23966, this.f67071.f77449);
            EnumC6617 enumC6617 = EnumC6617.NONE;
            AbstractC16579 abstractC16579 = this.f23963;
            if (!abstractC16579.m39001(enumC6617)) {
                abstractC16579M52409 = c13609.f44895.m52370(abstractC16579M52409, abstractC16579M52409.mo33523().m48597(abstractC16579));
                this.f23964 = true;
            }
            this.f67072 = abstractC16579M52409;
        }
        return this.f67072;
    }

    @Override // l.C20581, l.InterfaceC15643
    /* JADX INFO: renamed from: ۖ */
    public final C18258 mo8773() {
        C18258 c18258Mo8773 = super.mo8773();
        long j = c18258Mo8773.f77447;
        C18258 c18258 = this.f23966;
        long j2 = j | (c18258.f77447 & 17179869184L) | 536870912;
        c18258Mo8773.f77447 = j2;
        c18258Mo8773.f77447 = j2 | (this.f23964 ? 144115188075855872L : 0L);
        C19003 c19003 = new C19003();
        C21825 c21825Mo33523 = mo8774().mo33523();
        if (!this.f23963.m39001(EnumC6617.NONE)) {
            C21825 c21825 = c21825Mo33523.f70877;
            c19003.m43729(new C6263(8589934592L, this.f23965.f44896.m14643(0), this.f23963, c18258Mo8773));
            c21825Mo33523 = c21825;
        }
        C21825<C6263> c21826 = c18258.f58259;
        if (c21826 != null) {
            C21825 c21827 = c21825Mo33523;
            for (C6263 c6263 : c21826) {
                c19003.m43723(new C6263(8589934592L | c6263.f77447, c6263.f77453, (AbstractC16579) c21827.f70876, c18258Mo8773));
                c21827 = c21827.f70877;
            }
        }
        c18258Mo8773.f58259 = c19003.m43726();
        return c18258Mo8773;
    }

    @Override // l.C20581, l.InterfaceC15643
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 mo19104() {
        return this.f23963;
    }

    @Override // l.C20581, l.InterfaceC15643
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21825 mo19105() {
        C21825 c21825M14620 = this.f23965.f44896.m14620(mo8774().mo33523(), mo8773());
        if (!this.f23963.m39001(EnumC6617.NONE)) {
            c21825M14620 = c21825M14620.f70877;
        }
        return c21825M14620.m48592((Function) new C10021(1));
    }
}
