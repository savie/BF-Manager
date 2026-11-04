package l;

import android.os.SystemClock;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۚ᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84GP */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC5919 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f20261;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC17105 f20262;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f20263;

    public /* synthetic */ RunnableC5919(int i, String str, InterfaceC17105 interfaceC17105) {
        this.f20261 = i;
        this.f20263 = str;
        this.f20262 = interfaceC17105;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f20263;
        int i = this.f20261;
        InterfaceC17105 interfaceC17105 = this.f20262;
        if (i > 0) {
            try {
                SystemClock.sleep(i);
            } catch (IOException e) {
                C21576.m49068(new RunnableC11884(0, interfaceC17105, e));
                return;
            } catch (Throwable th) {
                C21576.m49068(new RunnableC25311(interfaceC17105, th, 0));
                return;
            }
        }
        C21576.m49068(new RunnableC2190(0, interfaceC17105, C17851.m41699(str)));
    }
}
