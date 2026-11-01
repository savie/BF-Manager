package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩶ۜۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5RH */
/* JADX INFO: loaded from: classes5.dex */
public final class C20004 implements InterfaceC21414 {
    @Override // l.InterfaceC21414
    /* JADX INFO: renamed from: ۙ */
    public final void mo3144(C15313 c15313) throws InterruptedException, IOException {
        C17181.f54767 = true;
        C0247 c0247 = new C0247(c15313);
        new C15771(c0247).start();
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (c0247.f1474) {
            Thread.sleep(200L);
            if (System.currentTimeMillis() - jCurrentTimeMillis > 15000) {
                c0247.m1682();
                throw new IOException("Connection timed out");
            }
            if (!C17181.f54767) {
                c0247.m1682();
                return;
            }
        }
    }
}
