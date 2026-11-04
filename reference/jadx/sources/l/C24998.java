package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩻ۧۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5RH */
/* JADX INFO: loaded from: classes.dex */
public final class C24998 implements InterfaceC22760 {
    @Override // l.InterfaceC22760
    /* JADX INFO: renamed from: ۙ */
    public final void mo1200(C19929 c19929) throws InterruptedException, IOException {
        C6352.f21477 = true;
        C3368 c3368 = new C3368(c19929);
        new C11571(c3368).start();
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (c3368.f10978) {
            Thread.sleep(200L);
            if (System.currentTimeMillis() - jCurrentTimeMillis > 15000) {
                c3368.m11063();
                throw new IOException("Connection timed out");
            }
            if (!C6352.f21477) {
                c3368.m11063();
                return;
            }
        }
    }
}
