package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܰ۬ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51KR */
/* JADX INFO: loaded from: classes4.dex */
public final class C13835 implements InterfaceC19083 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20556 f45651;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C11018 f45652 = new C11018();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13626 f45653;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6111 f45654;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11718 f45655;

    public C13835(C11718 c11718, C6111 c6111, C20556 c20556, C13626 c13626) {
        this.f45655 = c11718;
        this.f45654 = c6111;
        this.f45651 = c20556;
        this.f45653 = c13626;
    }

    @Override // l.InterfaceC19083
    /* JADX INFO: renamed from: ܰ */
    public final void mo30475() {
        C11018 c11018 = this.f45652;
        c11018.writeInt(1382253410);
        C11718 c11718 = this.f45655;
        c11018.writeByte(c11718.f39392);
        c11018.m27784(c11718.f39386);
        c11018.writeInt(1382253410);
        this.f45654.m16870(c11018, true);
        c11018.writeInt(1382253410);
        C20556 c20556 = this.f45651;
        c20556.m46381(c11018);
        c11018.writeInt(1382253410);
        c20556.m46372(c11018);
        AbstractC21616 abstractC21616M36573 = c11718.f39380.m36573();
        if (abstractC21616M36573 instanceof C12819) {
            c11018.writeInt(1382256833);
            c11018.m27782((CharSequence) ((C12819) abstractC21616M36573).m31826().mo19151());
        }
    }

    @Override // l.InterfaceC19083
    /* JADX INFO: renamed from: ۙ */
    public final void mo30474() {
        try {
            this.f45653.m33324();
            byte[] bArrM41966 = C18019.m41966(this.f45652.size(), this.f45652.m27788());
            synchronized (this.f45655) {
                this.f45653.m33322(bArrM41966);
            }
        } catch (IOException e) {
            this.f45655.f39387.m42627((Throwable) e);
        }
    }
}
