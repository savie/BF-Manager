package l;

/* JADX INFO: renamed from: l.ۙۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9JT */
/* JADX INFO: loaded from: classes3.dex */
public final class C4629 extends AbstractC16687 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f16358 = C13488.m32997(C4629.class);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C20215 f16359;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C15276 f16360;

    public C4629(C20215 c20215, C15276 c15276) {
        this.f16359 = c20215;
        this.f16360 = c15276;
    }

    @Override // l.AbstractC16687
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6063(AbstractC7245 abstractC7245) {
        return abstractC7245 instanceof C18826;
    }

    @Override // l.AbstractC16687
    /* JADX INFO: renamed from: ܰ */
    public final void mo6064(AbstractC7245 abstractC7245) {
        C15276 c15276 = this.f16360;
        C18826 c18826 = (C18826) abstractC7245;
        f16358.mo12126(c18826, "Decrypting packet {}");
        try {
            m12779(c18826);
        } finally {
            c15276.getClass();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12779(C18826 c18826) throws C21317 {
        C15276 c15276 = this.f16360;
        if (!c15276.m36588(c18826)) {
            this.f53462.m39153(new C19803(c18826.m19360()));
            return;
        }
        C20858 c20858M45673 = this.f16359.m45673(Long.valueOf(((C23060) c18826.m19360()).m51005()));
        if (c20858M45673 == null) {
            this.f53462.m39153(new C19803(c18826.m19360()));
            return;
        }
        byte[] bArrM36590 = c15276.m36590(c18826, c20858M45673.m46892().m37874());
        boolean zM51004 = C23060.m51004(bArrM36590);
        InterfaceC4314 interfaceC4314 = f16358;
        if (zM51004) {
            interfaceC4314.mo12118(c18826, "Encountered a nested encrypted packet in packet {}, disconnecting the transport");
            throw new C21317("Cannot nest an encrypted packet in encrypted packet " + c18826);
        }
        if (!C9220.m23735(bArrM36590)) {
            if (C1186.m4323(bArrM36590)) {
                try {
                    C16275 c16275 = new C16275(bArrM36590);
                    interfaceC4314.mo12121("Decrypted packet {} is packet {}.", c18826, c16275);
                    if (((C1186) c16275.m19360()).m4337() != ((C23060) c18826.m19360()).m51005()) {
                        interfaceC4314.mo12128("Mismatched sessionId between encrypted packet {} and decrypted contents {}", c18826, c16275);
                        this.f53462.m39153(new C19803(c16275.m19360()));
                        return;
                    } else {
                        this.f53462.m39153(c16275);
                        return;
                    }
                } catch (C17271 e) {
                    throw new C13865("Could not load SMB2 Packet", e);
                }
            }
            interfaceC4314.mo12118(c18826, "Could not determine the encrypted packet contents of packet {}");
            throw new C21317("Could not determine the encrypted packet data, disconnecting");
        }
        interfaceC4314.mo12126(c18826, "Packet {} is compressed.");
        try {
            this.f53462.m39153(new C15299(bArrM36590));
        } catch (C17271 e2) {
            throw new C13865("Could not load compression header", e2);
        }
    }
}
