package l;

import java.net.InetAddress;

/* JADX INFO: renamed from: l.ۛۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: XA2E */
/* JADX INFO: loaded from: classes3.dex */
public final class C5806 implements InterfaceC14274 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C17095 f19722;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C22823 f19723;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C17095 f19724;

    public C5806(C22823 c22823) {
        this.f19723 = c22823;
        this.f19722 = new C17095("JmDNS(" + c22823.getName() + ").Timer", true);
        this.f19724 = new C17095("JmDNS(" + c22823.getName() + ").State.Timer", false);
    }

    @Override // l.InterfaceC14274
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void mo15976() {
        this.f19722.purge();
    }

    @Override // l.InterfaceC14274
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo15985() {
        this.f19724.purge();
    }

    @Override // l.InterfaceC14274
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo15982() {
        this.f19722.cancel();
    }

    @Override // l.InterfaceC14274
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo15978() {
        this.f19724.cancel();
    }

    @Override // l.InterfaceC14274
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo15977() {
        C7072 c7072 = new C7072(this.f19723);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - c7072.m13745().m50529() < 5000) {
            c7072.m13745().m50537(c7072.m13745().m50531() + 1);
        } else {
            c7072.m13745().m50537(1);
        }
        c7072.m13745().m50553(jCurrentTimeMillis);
        boolean zM50550 = c7072.m13745().m50550();
        C17095 c17095 = this.f19724;
        if (zM50550 && c7072.m13745().m50531() < 10) {
            c17095.schedule(c7072, C22823.m50525().nextInt(251), 250L);
        } else {
            if (c7072.m13745().m50560() || c7072.m13745().m50533()) {
                return;
            }
            c17095.schedule(c7072, 1000L, 1000L);
        }
    }

    @Override // l.InterfaceC14274
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo15984() {
        C1427 c1427 = new C1427(this.f19723);
        if (c1427.m13745().m50560() || c1427.m13745().m50533()) {
            return;
        }
        this.f19724.schedule(c1427, 1000L, 1000L);
    }

    @Override // l.InterfaceC14274
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void mo15987() {
        C23301 c23301 = new C23301(this.f19723);
        if (c23301.m13745().m50560() || c23301.m13745().m50533()) {
            return;
        }
        long j = C17178.f54758;
        this.f19724.schedule(c23301, j, j);
    }

    @Override // l.InterfaceC14274
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void mo15983() {
        this.f19724.schedule(new C13423(this.f19723), 0L, 1000L);
    }

    @Override // l.InterfaceC14274
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo15986() {
        C14129 c14129 = new C14129(this.f19723);
        if (c14129.m13745().m50560() || c14129.m13745().m50533()) {
            return;
        }
        this.f19722.schedule(c14129, 10000L, 10000L);
    }

    @Override // l.InterfaceC14274
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo15980(C0244 c0244) {
        C5661 c5661 = new C5661(this.f19723, c0244);
        if (c5661.m13745().m50560() || c5661.m13745().m50533()) {
            return;
        }
        this.f19722.schedule(c5661, 225L, 225L);
    }

    @Override // l.InterfaceC14274
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo15979(String str) {
        C22595 c22595 = new C22595(this.f19723, str);
        if (c22595.m13745().m50560() || c22595.m13745().m50533()) {
            return;
        }
        this.f19722.schedule(c22595, 225L, 225L);
    }

    @Override // l.InterfaceC14274
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo15981(C13568 c13568, InetAddress inetAddress, int i) {
        new C12012(this.f19723, c13568, inetAddress, i).m29907(this.f19722);
    }
}
