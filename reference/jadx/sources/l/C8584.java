package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.۠ۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes4.dex */
public final class C8584 extends C7093 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17929 f28063;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC22664 f28064;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10377 f28065;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f28066;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8584(C17929 c17929, AbstractC22970 abstractC22970, C10377 c10377, AbstractC22295 abstractC22295) {
        super(c17929, abstractC22970);
        this.f28063 = c17929;
        this.f28066 = false;
        this.f28065 = c10377;
        this.f28064 = abstractC22295 != null ? abstractC22295.f26659 : AbstractC22664.f73590;
    }

    @Override // l.C7093, l.InterfaceC13804
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC22664 mo19436() {
        if (this.f23401 == null) {
            C17929 c17929 = this.f28063;
            AbstractC22664 abstractC22664M55126 = c17929.f58720.m55126(this.f28065, this.f23400.f38067);
            EnumC21172 enumC21172 = EnumC21172.NONE;
            AbstractC22664 abstractC22664 = this.f28064;
            if (!abstractC22664.m51067(enumC21172)) {
                abstractC22664M55126 = c17929.f58720.m55102(abstractC22664M55126, abstractC22664M55126.mo50621().m35552(abstractC22664));
                this.f28066 = true;
            }
            this.f23401 = abstractC22664M55126;
        }
        return this.f23401;
    }

    @Override // l.C7093, l.InterfaceC13804
    /* JADX INFO: renamed from: ᩸ */
    public final C10377 mo19439() {
        C10377 c10377Mo19439 = super.mo19439();
        long j = c10377Mo19439.f38071;
        C10377 c10377 = this.f28065;
        long j2 = j | (c10377.f38071 & 17179869184L) | 536870912;
        c10377Mo19439.f38071 = j2;
        c10377Mo19439.f38071 = j2 | (this.f28066 ? 144115188075855872L : 0L);
        C18499 c18499 = new C18499();
        C14769 c14769Mo50621 = mo19436().mo50621();
        if (!this.f28064.m51067(EnumC21172.NONE)) {
            C14769 c14769 = c14769Mo50621.f48336;
            c18499.m43095(new C5816(8589934592L, this.f28063.f58722.m37572(0), this.f28064, c10377Mo19439));
            c14769Mo50621 = c14769;
        }
        C14769<C5816> c147610 = c10377.f33013;
        if (c147610 != null) {
            C14769 c147611 = c14769Mo50621;
            for (C5816 c5816 : c147610) {
                c18499.m43089(new C5816(8589934592L | c5816.f38071, c5816.f38072, (AbstractC22664) c147611.f48335, c10377Mo19439));
                c147611 = c147611.f48336;
            }
        }
        c10377Mo19439.f33013 = c18499.m43093();
        return c10377Mo19439;
    }

    @Override // l.C7093, l.InterfaceC13804
    /* JADX INFO: renamed from: ۤ */
    public final AbstractC22664 mo19437() {
        return this.f28064;
    }

    @Override // l.C7093, l.InterfaceC13804
    /* JADX INFO: renamed from: ᩷ */
    public final C14769 mo19438() {
        C14769 c14769M37528 = this.f28063.f58722.m37528(mo19436().mo50621(), mo19439());
        if (!this.f28064.m51067(EnumC21172.NONE)) {
            c14769M37528 = c14769M37528.f48336;
        }
        return c14769M37528.m35547((Function) new C8693(1));
    }
}
