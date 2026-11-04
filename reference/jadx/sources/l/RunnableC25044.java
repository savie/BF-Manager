package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩻۫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4DP */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC25044 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20568 f81017;

    public RunnableC25044(C20568 c20568) {
        this.f81017 = c20568;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f81017) {
            C20568 c20568 = this.f81017;
            if ((!c20568.f65869) || c20568.f65882) {
                return;
            }
            try {
                c20568.m47160();
            } catch (IOException unused) {
                this.f81017.f65877 = true;
            }
            try {
                if (this.f81017.m47162()) {
                    this.f81017.m47159();
                    this.f81017.f65884 = 0;
                }
            } catch (IOException unused2) {
                C20568 c20569 = this.f81017;
                c20569.f65886 = true;
                c20569.f65872 = C14556.m35106(C14556.m35103());
            }
        }
    }
}
