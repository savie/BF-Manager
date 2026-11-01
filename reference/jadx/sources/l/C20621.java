package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩷ۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20621 implements InterfaceC19083 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20556 f67167;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C11018 f67168 = new C11018();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13626 f67169;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6111 f67170;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23444 f67171;

    public C20621(C23444 c23444, C6111 c6111, C20556 c20556, C13626 c13626) {
        this.f67171 = c23444;
        this.f67170 = c6111;
        this.f67167 = c20556;
        this.f67169 = c13626;
    }

    @Override // l.InterfaceC19083
    /* JADX INFO: renamed from: ܰ */
    public final void mo30475() {
        C11018 c11018 = this.f67168;
        c11018.writeInt(1382253409);
        C23444 c23444 = this.f67171;
        c11018.writeInt(c23444.f75896.m16564(c23444.m51659()));
        c11018.writeInt(1382253409);
        this.f67170.m16870(c11018, true);
        c11018.writeInt(1382253409);
        C20556 c20556 = this.f67167;
        c20556.m46381(c11018);
        c11018.writeInt(1382253409);
        c20556.m46372(c11018);
    }

    @Override // l.InterfaceC19083
    /* JADX INFO: renamed from: ۙ */
    public final void mo30474() {
        try {
            this.f67169.m33324();
            byte[] bArrM41966 = C18019.m41966(this.f67168.size(), this.f67168.m27788());
            synchronized (this.f67171) {
                this.f67169.m33322(bArrM41966);
            }
        } catch (IOException e) {
            this.f67171.f75911.m42627((Throwable) e);
        }
    }
}
