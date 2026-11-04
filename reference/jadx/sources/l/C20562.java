package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.᩵۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20562 extends AbstractC20344 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22010 f65845;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20562(C22010 c22010, AbstractC19728 abstractC19728, AbstractC22664 abstractC22664, C14769 c14769, C14769 c147610) {
        super(c22010, abstractC19728, abstractC22664, c14769, c147610);
        this.f65845 = c22010;
    }

    @Override // l.AbstractC20344
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC11781 mo11152(C3168 c3168, EnumC20234 enumC20234) {
        AbstractC22664 abstractC22664 = this.f27563;
        enumC20234.m46506();
        return this.f65845.m49770(c3168, abstractC22664, this.f27560, this.f27559, this.f27561, enumC20234.m46507());
    }

    @Override // l.AbstractC20344, l.AbstractC8410
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11781 mo1198(C3168 c3168, InterfaceC5075 interfaceC5075, AbstractC11781 abstractC11781, AbstractC11781 abstractC11782) {
        if (abstractC11782.f38066.m33353()) {
            return super.mo1198(c3168, interfaceC5075, abstractC11781, abstractC11782);
        }
        C10377 c10377 = (C10377) abstractC11782;
        if ((c10377.f38071 & 70368744177664L) == 0) {
            return abstractC11782;
        }
        ((C7768) c3168.f10272).f25570 = EnumC20234.f64932;
        C22010 c22010 = this.f65845;
        C14528 c14528 = c22010.f71036;
        C12775 c12775 = c22010.f71022;
        C14764 c14764 = c14528.f45699;
        AbstractC22664 abstractC22664Mo31585 = c10377.f38067.mo31585();
        int i = C23809.f77129[c3168.f10274.f10273.mo2285().ordinal()];
        if (i == 1) {
            C16985 c16985 = (C16985) c3168.f10274.f10273;
            if (C11239.m28353(c16985.f55515) == c3168.f10273) {
                abstractC22664Mo31585 = c16985.f55514.f26659;
            }
        } else if (i == 2 && C11239.m28353(((C11106) c3168.f10274.f10273).f35018) == c3168.f10273) {
            abstractC22664Mo31585 = c14764.f48251;
        }
        return c22010.m49781(abstractC11782, new C23191(this.f27559.m35547((Function) new C4834(c14528, c10377, c12775.f40879)), abstractC22664Mo31585, c10377.f38067.mo50622(), c14764.f48275));
    }
}
