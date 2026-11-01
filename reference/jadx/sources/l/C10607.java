package l;

/* JADX INFO: renamed from: l.ۤ᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1B9F */
/* JADX INFO: loaded from: classes4.dex */
public final class C10607 extends AbstractC15546 {
    public C10607(C12723 c12723, C11312 c11312, C16251 c16251, C0727 c0727) {
        super(c12723, c11312, c16251, c0727);
        int iM31577 = c12723.m31577();
        if (iM31577 == 5 || iM31577 == 6) {
            throw new IllegalArgumentException("opcode with invalid branchingness: " + c12723.m31577());
        }
        if (c16251 != null && c12723.m31577() != 1) {
            throw new IllegalArgumentException("can't mix branchingness with result");
        }
    }

    public C10607(C12723 c12723, C11312 c11312, C16251 c16251, C16251 c16252) {
        this(c12723, c11312, c16251, C0727.m3151(c16252));
    }

    @Override // l.AbstractC15546
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC14093 mo6700() {
        return C9672.f32573;
    }

    @Override // l.AbstractC15546
    /* JADX INFO: renamed from: ۙ */
    public final void mo6699(InterfaceC23307 interfaceC23307) {
        interfaceC23307.mo8606(this);
    }

    @Override // l.AbstractC15546
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC15546 mo6697(C3320 c3320) {
        throw new UnsupportedOperationException("unsupported");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC15546
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC15546 mo26774() {
        C0727 c0727M37186 = m37186();
        int size = c0727M37186.size();
        if (size != 0) {
            InterfaceC4919 interfaceC4919M38401 = c0727M37186.m15275get(size - 1).m38401();
            if (!interfaceC4919M38401.mo9847()) {
                InterfaceC4919 interfaceC4919M38402 = c0727M37186.m15275get(0).m38401();
                if (size == 2 && interfaceC4919M38402.mo9847()) {
                    AbstractC9901 abstractC9901 = (AbstractC9901) interfaceC4919M38402;
                    C0727 c0727M3158 = c0727M37186.m3158();
                    return new C9196(C6372.m17482(m37181().m31572(), m37185(), c0727M3158, abstractC9901), m37183(), m37185(), c0727M3158, abstractC9901);
                }
            } else {
                AbstractC9901 abstractC9901M48398 = (AbstractC9901) interfaceC4919M38401;
                C0727 c0727M3160 = c0727M37186.m3160();
                try {
                    int iM31572 = m37181().m31572();
                    if (iM31572 == 15 && (abstractC9901M48398 instanceof C21665)) {
                        abstractC9901M48398 = C21665.m48398(-((C21665) abstractC9901M48398).mo21658());
                        iM31572 = 14;
                    }
                    AbstractC9901 abstractC9902 = abstractC9901M48398;
                    return new C9196(C6372.m17482(iM31572, m37185(), c0727M3160, abstractC9902), m37183(), m37185(), c0727M3160, abstractC9902);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return this;
    }

    @Override // l.AbstractC15546
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC15546 mo6698(C16251 c16251, C0727 c0727) {
        return new C10607(m37181(), m37183(), c16251, c0727);
    }
}
