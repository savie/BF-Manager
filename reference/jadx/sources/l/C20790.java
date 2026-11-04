package l;

/* JADX INFO: renamed from: l.᩵᩵ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9JT */
/* JADX INFO: loaded from: classes5.dex */
public final class C20790 extends AbstractC13331 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f66597 = C16980.m40037(C20790.class);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C20044 f66598;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C9844 f66599;

    public C20790(C20044 c20044, C9844 c9844) {
        this.f66598 = c20044;
        this.f66599 = c9844;
    }

    @Override // l.AbstractC13331
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo7408(AbstractC21779 abstractC21779) {
        return abstractC21779 instanceof C8988;
    }

    @Override // l.AbstractC13331
    /* JADX INFO: renamed from: ᩷ */
    public final void mo7409(AbstractC21779 abstractC21779) {
        C9844 c9844 = this.f66599;
        C8988 c8988 = (C8988) abstractC21779;
        f66597.mo13716(c8988, "Decrypting packet {}");
        try {
            m47573(c8988);
        } finally {
            c9844.getClass();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47573(C8988 c8988) throws C9469 {
        C9844 c9844 = this.f66599;
        if (!c9844.m25636(c8988)) {
            this.f42518.m32898(new C13813(c8988.m49391()));
            return;
        }
        C10852 c10852M46100 = this.f66598.m46100(Long.valueOf(((C10479) c8988.m49391()).m26905()));
        if (c10852M46100 == null) {
            this.f42518.m32898(new C13813(c8988.m49391()));
            return;
        }
        byte[] bArrM25638 = c9844.m25638(c8988, c10852M46100.m27589().m51389());
        boolean zM26902 = C10479.m26902(bArrM25638);
        InterfaceC25186 interfaceC25186 = f66597;
        if (zM26902) {
            interfaceC25186.mo13698(c8988, "Encountered a nested encrypted packet in packet {}, disconnecting the transport");
            throw new C9469("Cannot nest an encrypted packet in encrypted packet " + c8988);
        }
        if (!C5260.m15830(bArrM25638)) {
            if (C18684.m43449(bArrM25638)) {
                try {
                    C20176 c20176 = new C20176(bArrM25638);
                    interfaceC25186.mo13701("Decrypted packet {} is packet {}.", c8988, c20176);
                    if (((C18684) c20176.m49391()).m43461() != ((C10479) c8988.m49391()).m26905()) {
                        interfaceC25186.mo13718("Mismatched sessionId between encrypted packet {} and decrypted contents {}", c8988, c20176);
                        this.f42518.m32898(new C13813(c20176.m49391()));
                        return;
                    } else {
                        this.f42518.m32898(c20176);
                        return;
                    }
                } catch (C2013 e) {
                    throw new C12082("Could not load SMB2 Packet", e);
                }
            }
            interfaceC25186.mo13698(c8988, "Could not determine the encrypted packet contents of packet {}");
            throw new C9469("Could not determine the encrypted packet data, disconnecting");
        }
        interfaceC25186.mo13716(c8988, "Packet {} is compressed.");
        try {
            this.f42518.m32898(new C1531(bArrM25638));
        } catch (C2013 e2) {
            throw new C12082("Could not load compression header", e2);
        }
    }
}
