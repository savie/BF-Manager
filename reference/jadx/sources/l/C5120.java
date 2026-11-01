package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۚۙ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5120 extends AbstractC2566 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20145 f17830;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5120(C20145 c20145, AbstractC11242 abstractC11242, AbstractC16579 abstractC16579, C21825 c21825, C21825 c21826) {
        super(c20145, abstractC11242, abstractC16579, c21825, c21826);
        this.f17830 = c20145;
    }

    @Override // l.AbstractC2566
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC23903 mo3562(C4603 c4603, EnumC11678 enumC11678) {
        AbstractC16579 abstractC16579 = this.f35427;
        enumC11678.m29178();
        return this.f17830.m45538(c4603, abstractC16579, this.f35430, this.f35428, this.f35429, enumC11678.m29179());
    }

    @Override // l.AbstractC2566, l.AbstractC10329
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC23903 mo8017(C4603 c4603, InterfaceC12260 interfaceC12260, AbstractC23903 abstractC23903, AbstractC23903 abstractC23904) {
        if (abstractC23904.f77452.m26583()) {
            return super.mo8017(c4603, interfaceC12260, abstractC23903, abstractC23904);
        }
        C18258 c18258 = (C18258) abstractC23904;
        if ((c18258.f77447 & 70368744177664L) == 0) {
            return abstractC23904;
        }
        ((C22990) c4603.f16299).f74727 = EnumC11678.f39282;
        C20145 c20145 = this.f17830;
        C13174 c13174 = c20145.f65419;
        C6095 c6095 = c20145.f65437;
        C3836 c3836 = c13174.f43868;
        AbstractC16579 abstractC16579Mo16235 = c18258.f77449.mo16235();
        int i = C4977.f17353[c4603.f16297.f16296.mo1803().ordinal()];
        if (i == 1) {
            C2422 c2422 = (C2422) c4603.f16297.f16296;
            if (C3128.m9461(c2422.f9708) == c4603.f16296) {
                abstractC16579Mo16235 = c2422.f9707.f30190;
            }
        } else if (i == 2 && C3128.m9461(((C10870) c4603.f16297.f16296).f36960) == c4603.f16296) {
            abstractC16579Mo16235 = c3836.f14293;
        }
        return c20145.m45547(abstractC23904, new C13757(this.f35428.m48592((Function) new C21205(c13174, c18258, c6095.f20637)), abstractC16579Mo16235, c18258.f77449.mo33524(), c3836.f14240));
    }
}
