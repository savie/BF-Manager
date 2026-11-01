package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩺ۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes.dex */
public final class C22759 implements InterfaceC19083 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20556 f74135;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C11018 f74136 = new C11018();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13626 f74137;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6111 f74138;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7236 f74139;

    public C22759(C7236 c7236, C6111 c6111, C20556 c20556, C13626 c13626) {
        this.f74139 = c7236;
        this.f74138 = c6111;
        this.f74135 = c20556;
        this.f74137 = c13626;
    }

    @Override // l.InterfaceC19083
    /* JADX INFO: renamed from: ܰ */
    public final void mo30475() {
        C11018 c11018 = this.f74136;
        c11018.writeInt(1382253410);
        C7236 c7236 = this.f74139;
        c11018.writeInt(c7236.f24113.m21597(c7236.m19346()));
        c11018.writeInt(1382253410);
        this.f74138.m16870(c11018, true);
        c11018.writeInt(1382253410);
        C20556 c20556 = this.f74135;
        c20556.m46381(c11018);
        c11018.writeInt(1382253410);
        c20556.m46372(c11018);
    }

    @Override // l.InterfaceC19083
    /* JADX INFO: renamed from: ۙ */
    public final void mo30474() {
        try {
            this.f74137.m33324();
            byte[] bArrM41966 = C18019.m41966(this.f74136.size(), this.f74136.m27788());
            synchronized (this.f74139) {
                this.f74137.m33322(bArrM41966);
            }
        } catch (IOException e) {
            this.f74139.f24104.m42627((Throwable) e);
        }
    }
}
