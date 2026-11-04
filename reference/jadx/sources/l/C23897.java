package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩹᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: F43P */
/* JADX INFO: loaded from: classes.dex */
public final class C23897 extends Thread {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2026 f77382;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23897(C2026 c2026, String str) {
        super(str);
        this.f77382 = c2026;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            synchronized (this.f77382) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                while (true) {
                    long j = this.f77382.f79775;
                    C2026 c2026 = this.f77382;
                    if (jCurrentTimeMillis < j + c2026.f79784) {
                        c2026.wait((c2026.f79775 + this.f77382.f79784) - jCurrentTimeMillis);
                        jCurrentTimeMillis = System.currentTimeMillis();
                    } else {
                        c2026.f79784 = 0L;
                        c2026.close();
                    }
                }
            }
        } catch (IOException | InterruptedException unused) {
        }
    }
}
