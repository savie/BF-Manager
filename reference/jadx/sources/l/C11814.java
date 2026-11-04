package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۧᩴۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: V4E2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11814 implements InterfaceC6398 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3611 f38135;

    public C11814(C3611 c3611) {
        this.f38135 = c3611;
    }

    @Override // l.InterfaceC6398
    /* JADX INFO: renamed from: ᩷ */
    public final C9444 mo18164(C7954 c7954) {
        C3611 c3611 = this.f38135;
        try {
            C3414 c3414M47161 = c3611.f12370.m47161(C16794.m39651(c7954.f26430.toString()).mo23090().mo23091());
            if (c3414M47161 != null) {
                try {
                    C23749 c23749 = new C23749(c3414M47161.m11164(0));
                    C9444 c9444M53033 = c23749.m53033(c3414M47161);
                    if (c23749.m53035(c7954, c9444M53033)) {
                        return c9444M53033;
                    }
                    C19822.m45601(c9444M53033.f30632);
                    return null;
                } catch (IOException unused) {
                    C19822.m45601(c3414M47161);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    @Override // l.InterfaceC6398
    /* JADX INFO: renamed from: ۙ */
    public final void mo18161(C7954 c7954) {
        this.f38135.f12370.m47163(C16794.m39651(c7954.f26430.toString()).mo23090().mo23091());
    }

    @Override // l.InterfaceC6398
    /* JADX INFO: renamed from: ۙ */
    public final void mo18160() {
        synchronized (this.f38135) {
        }
    }

    @Override // l.InterfaceC6398
    /* JADX INFO: renamed from: ۙ */
    public final void mo18163(C11617 c11617) {
        synchronized (this.f38135) {
        }
    }

    @Override // l.InterfaceC6398
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC5652 mo18159(C9444 c9444) {
        C16092 c16092M47155;
        C3611 c3611 = this.f38135;
        C20568 c20568 = c3611.f12370;
        C7954 c7954 = c9444.f30626;
        String str = c7954.f26433;
        C16903 c16903 = c7954.f26430;
        try {
            if (!C15407.m36885(str)) {
                if (str.equals("GET")) {
                    int i = C13854.f43953;
                    if (!C13854.m33801(c9444.f30634).contains("*")) {
                        C23749 c23749 = new C23749(c9444);
                        try {
                            c16092M47155 = c20568.m47155(C16794.m39651(c16903.toString()).mo23090().mo23091());
                            if (c16092M47155 != null) {
                                try {
                                    c23749.m53034(c16092M47155);
                                    return new C17035(c3611, c16092M47155);
                                } catch (IOException unused) {
                                    if (c16092M47155 != null) {
                                        c16092M47155.m38247();
                                    }
                                    return null;
                                }
                            }
                        } catch (IOException unused2) {
                            c16092M47155 = null;
                        }
                    }
                }
                return null;
            }
            c20568.m47163(C16794.m39651(c16903.toString()).mo23090().mo23091());
            return null;
        } catch (IOException unused3) {
        }
    }

    @Override // l.InterfaceC6398
    /* JADX INFO: renamed from: ۙ */
    public final void mo18162(C9444 c9444, C9444 c9445) {
        C16092 c16092M11165;
        C23749 c23749 = new C23749(c9445);
        try {
            c16092M11165 = ((C16289) c9444.f30632).f52890.m11165();
            if (c16092M11165 != null) {
                try {
                    c23749.m53034(c16092M11165);
                    c16092M11165.m38249();
                } catch (IOException unused) {
                    if (c16092M11165 != null) {
                        try {
                            c16092M11165.m38247();
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
        } catch (IOException unused3) {
            c16092M11165 = null;
        }
    }
}
