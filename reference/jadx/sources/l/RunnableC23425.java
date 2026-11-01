package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩻ۗ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A4DP */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC23425 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13598 f75848;

    public RunnableC23425(C13598 c13598) {
        this.f75848 = c13598;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f75848) {
            C13598 c13598 = this.f75848;
            if ((!c13598.f44848) || c13598.f44839) {
                return;
            }
            try {
                c13598.m33235();
            } catch (IOException unused) {
                this.f75848.f44849 = true;
            }
            try {
                if (this.f75848.m33233()) {
                    this.f75848.m33226();
                    this.f75848.f44845 = 0;
                }
            } catch (IOException unused2) {
                C13598 c13599 = this.f75848;
                c13599.f44851 = true;
                c13599.f44847 = C0834.m3436(C0834.m3432());
            }
        }
    }
}
