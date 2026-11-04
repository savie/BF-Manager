package l;

/* JADX INFO: renamed from: l.᩺֡ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1B9F */
/* JADX INFO: loaded from: classes.dex */
public final class C23930 extends AbstractC17216 {
    public C23930(C18708 c18708, C9012 c9012, C20946 c20946, C0063 c0063) {
        super(c18708, c9012, c20946, c0063);
        int iM43508 = c18708.m43508();
        if (iM43508 == 5 || iM43508 == 6) {
            throw new IllegalArgumentException("opcode with invalid branchingness: " + c18708.m43508());
        }
        if (c20946 != null && c18708.m43508() != 1) {
            throw new IllegalArgumentException("can't mix branchingness with result");
        }
    }

    public C23930(C18708 c18708, C9012 c9012, C20946 c20946, C20946 c20947) {
        this(c18708, c9012, c20946, C0063.m1033(c20947));
    }

    @Override // l.AbstractC17216
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC11050 mo7781() {
        return C13705.f43487;
    }

    @Override // l.AbstractC17216
    /* JADX INFO: renamed from: ۙ */
    public final void mo7779(InterfaceC16470 interfaceC16470) {
        interfaceC16470.mo38989(this);
    }

    @Override // l.AbstractC17216
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC17216 mo7777(C5085 c5085) {
        throw new UnsupportedOperationException("unsupported");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC17216
    /* JADX INFO: renamed from: ܶ */
    public final AbstractC17216 mo40436() {
        C0063 c0063M40438 = m40438();
        int size = c0063M40438.size();
        if (size != 0) {
            InterfaceC22239 interfaceC22239M47898 = c0063M40438.m31619get(size - 1).m47898();
            if (!interfaceC22239M47898.mo8409()) {
                InterfaceC22239 interfaceC22239M47899 = c0063M40438.m31619get(0).m47898();
                if (size == 2 && interfaceC22239M47899.mo8409()) {
                    AbstractC13487 abstractC13487 = (AbstractC13487) interfaceC22239M47899;
                    C0063 c0063M1042 = c0063M40438.m1042();
                    return new C6030(C0809.m3250(m40434().m43509(), m40437(), c0063M1042, abstractC13487), m40433(), m40437(), c0063M1042, abstractC13487);
                }
            } else {
                AbstractC13487 abstractC13487M37967 = (AbstractC13487) interfaceC22239M47898;
                C0063 c0063M1034 = c0063M40438.m1034();
                try {
                    int iM43509 = m40434().m43509();
                    if (iM43509 == 15 && (abstractC13487M37967 instanceof C15943)) {
                        abstractC13487M37967 = C15943.m37967(-((C15943) abstractC13487M37967).mo17877());
                        iM43509 = 14;
                    }
                    AbstractC13487 abstractC13488 = abstractC13487M37967;
                    return new C6030(C0809.m3250(iM43509, m40437(), c0063M1034, abstractC13488), m40433(), m40437(), c0063M1034, abstractC13488);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return this;
    }

    @Override // l.AbstractC17216
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC17216 mo7778(C20946 c20946, C0063 c0063) {
        return new C23930(m40434(), m40433(), c20946, c0063);
    }
}
