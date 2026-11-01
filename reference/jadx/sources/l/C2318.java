package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۖۚ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: F43P */
/* JADX INFO: loaded from: classes2.dex */
public final class C2318 extends Thread {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14315 f8240;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2318(C14315 c14315, String str) {
        super(str);
        this.f8240 = c14315;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            synchronized (this.f8240) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                while (true) {
                    long j = this.f8240.f13547;
                    C14315 c14315 = this.f8240;
                    if (jCurrentTimeMillis < j + c14315.f13552) {
                        c14315.wait((c14315.f13547 + this.f8240.f13552) - jCurrentTimeMillis);
                        jCurrentTimeMillis = System.currentTimeMillis();
                    } else {
                        c14315.f13552 = 0L;
                        c14315.close();
                    }
                }
            }
        } catch (IOException | InterruptedException unused) {
        }
    }
}
