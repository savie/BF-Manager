package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۛ֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: V4E2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5744 implements InterfaceC2307 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2921 f19537;

    public C5744(C2921 c2921) {
        this.f19537 = c2921;
    }

    @Override // l.InterfaceC2307
    /* JADX INFO: renamed from: ܰ */
    public final C18485 mo7050(C22719 c22719) {
        C2921 c2921 = this.f19537;
        try {
            C4424 c4424M33234 = c2921.f10981.m33234(C14511.m34934(c22719.f74015.toString()).mo34944().mo34946());
            if (c4424M33234 != null) {
                try {
                    C9273 c9273 = new C9273(c4424M33234.m12357(0));
                    C18485 c18485M23824 = c9273.m23824(c4424M33234);
                    if (c9273.m23826(c22719, c18485M23824)) {
                        return c18485M23824;
                    }
                    C0140.m1231(c18485M23824.f58914);
                    return null;
                } catch (IOException unused) {
                    C0140.m1231(c4424M33234);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    @Override // l.InterfaceC2307
    /* JADX INFO: renamed from: ۙ */
    public final void mo7049(C22719 c22719) {
        this.f19537.f10981.m33227(C14511.m34934(c22719.f74015.toString()).mo34944().mo34946());
    }

    @Override // l.InterfaceC2307
    /* JADX INFO: renamed from: ۙ */
    public final void mo7046() {
        synchronized (this.f19537) {
        }
    }

    @Override // l.InterfaceC2307
    /* JADX INFO: renamed from: ۙ */
    public final void mo7047(C10725 c10725) {
        synchronized (this.f19537) {
        }
    }

    @Override // l.InterfaceC2307
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC17074 mo7045(C18485 c18485) {
        C9314 c9314M33229;
        C2921 c2921 = this.f19537;
        C13598 c13598 = c2921.f10981;
        C22719 c22719 = c18485.f58910;
        String str = c22719.f74010;
        C14440 c14440 = c22719.f74015;
        try {
            if (!C12123.m30170(str)) {
                if (str.equals("GET")) {
                    int i = C10070.f34404;
                    if (!C10070.m25482(c18485.f58916).contains("*")) {
                        C9273 c9273 = new C9273(c18485);
                        try {
                            c9314M33229 = c13598.m33229(C14511.m34934(c14440.toString()).mo34944().mo34946());
                            if (c9314M33229 != null) {
                                try {
                                    c9273.m23825(c9314M33229);
                                    return new C23384(c2921, c9314M33229);
                                } catch (IOException unused) {
                                    if (c9314M33229 != null) {
                                        c9314M33229.m23888();
                                    }
                                    return null;
                                }
                            }
                        } catch (IOException unused2) {
                            c9314M33229 = null;
                        }
                    }
                }
                return null;
            }
            c13598.m33227(C14511.m34934(c14440.toString()).mo34944().mo34946());
            return null;
        } catch (IOException unused3) {
        }
    }

    @Override // l.InterfaceC2307
    /* JADX INFO: renamed from: ۙ */
    public final void mo7048(C18485 c18485, C18485 c18486) {
        C9314 c9314M12356;
        C9273 c9273 = new C9273(c18486);
        try {
            c9314M12356 = ((C1510) c18485.f58914).f6160.m12356();
            if (c9314M12356 != null) {
                try {
                    c9273.m23825(c9314M12356);
                    c9314M12356.m23890();
                } catch (IOException unused) {
                    if (c9314M12356 != null) {
                        try {
                            c9314M12356.m23888();
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
        } catch (IOException unused3) {
            c9314M12356 = null;
        }
    }
}
