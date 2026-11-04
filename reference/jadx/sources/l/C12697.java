package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۨ᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H87Q */
/* JADX INFO: loaded from: classes4.dex */
public final class C12697 extends AbstractC17567 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final InterfaceC16075 f40668 = new C3748(new C12697(EnumC11600.f36423));

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC25027 f40669;

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) throws IOException {
        c21362.m48588((Number) obj);
    }

    public C12697(InterfaceC25027 interfaceC25027) {
        this.f40669 = interfaceC25027;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC16075 m31493(InterfaceC25027 interfaceC25027) {
        if (interfaceC25027 != EnumC11600.f36423) {
            return new C3748(new C12697(interfaceC25027));
        }
        return f40668;
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3722(C4208 c4208) throws IOException {
        EnumC14648 enumC14648M13438 = c4208.m13438();
        int i = C20902.f66907[enumC14648M13438.ordinal()];
        if (i == 1) {
            c4208.m13444();
            return null;
        }
        if (i == 2 || i == 3) {
            return this.f40669.mo6563(c4208);
        }
        throw new C7367("Expecting number, got: " + enumC14648M13438 + "; at path " + c4208.m13443());
    }
}
