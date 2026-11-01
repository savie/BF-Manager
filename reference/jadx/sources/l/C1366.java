package l;

/* JADX INFO: renamed from: l.֨᩷ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public final class C1366 extends AbstractC17449 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23800 f5731;

    @Override // l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1767(Object obj, AbstractC16579 abstractC16579) {
        AbstractC16579 abstractC165710 = (AbstractC16579) obj;
        boolean zMo14987 = abstractC165710.mo14987();
        C23800 c23800 = this.f5731;
        if (zMo14987) {
            return Boolean.valueOf(c23800.m52392(abstractC165710, abstractC16579));
        }
        return Boolean.valueOf(c23800.m52399(abstractC16579, abstractC165710));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x006a  */
    /* JADX WARN: Code duplicated, block: B:35:0x007e  */
    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo4811(C0350 c0350, Object obj) {
        boolean z;
        EnumC15395 enumC15395 = c0350.f1776;
        AbstractC16579 abstractC16579 = (AbstractC16579) obj;
        boolean zMo14987 = abstractC16579.mo14987();
        C23800 c23800 = this.f5731;
        if (zMo14987) {
            return Boolean.valueOf(c23800.m52392(abstractC16579, c0350));
        }
        EnumC6617 enumC6617 = EnumC6617.WILDCARD;
        if (!abstractC16579.m39001(enumC6617)) {
            if (abstractC16579.m39001(EnumC6617.TYPEVAR) || !((C22929) abstractC16579).mo46762()) {
                z = false;
                if ((c0350.mo2036() || c23800.m52413(c23800.m52433(c0350), c23800.m52433(abstractC16579), false)) && (c0350.mo2034() || c23800.m52413(c23800.m52415(abstractC16579), c23800.m52415(c0350), false))) {
                    z = true;
                }
            } else {
                C0350 c0351 = ((C20771) abstractC16579).f67572;
                if (c0351.m39001(enumC6617) && c0351.f1776 == enumC15395 && c0351.f1774 == c0350.f1774) {
                    z = true;
                } else {
                    z = false;
                    if (c0350.mo2036()) {
                        z = true;
                    } else {
                        z = true;
                    }
                }
            }
        } else {
            C0350 c0352 = (C0350) abstractC16579;
            if (c0352.f1776 == enumC15395 && c0352.f1774 == c0350.f1774) {
                z = true;
            } else if (abstractC16579.m39001(EnumC6617.TYPEVAR)) {
                z = false;
                if (c0350.mo2036()) {
                    z = true;
                } else {
                    z = true;
                }
            } else {
                z = false;
                if (c0350.mo2036()) {
                    z = true;
                } else {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* bridge */ /* synthetic */ Object mo4812(C5954 c5954, Object obj) {
        return Boolean.TRUE;
    }

    @Override // l.AbstractC18154, l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo4813(C10229 c10229, Object obj) {
        AbstractC16579 abstractC16579 = (AbstractC16579) obj;
        if (!abstractC16579.m39001(EnumC6617.WILDCARD)) {
            return Boolean.valueOf(this.f5731.m52399(c10229, abstractC16579));
        }
        return Boolean.FALSE;
    }

    public C1366(C23800 c23800) {
        this.f5731 = c23800;
    }
}
