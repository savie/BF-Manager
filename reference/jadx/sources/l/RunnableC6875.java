package l;

import android.os.SystemClock;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۜܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 84GP */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6875 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC21692 f23163;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f23164;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f23165;

    public /* synthetic */ RunnableC6875(int i, String str, InterfaceC21692 interfaceC21692) {
        this.f23164 = i;
        this.f23165 = str;
        this.f23163 = interfaceC21692;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f23165;
        int i = this.f23164;
        InterfaceC21692 interfaceC21692 = this.f23163;
        if (i > 0) {
            try {
                SystemClock.sleep(i);
            } catch (IOException e) {
                C16737.m39273(new RunnableC23104(0, interfaceC21692, e));
                return;
            } catch (Throwable th) {
                C16737.m39273(new RunnableC15343(0, interfaceC21692, th));
                return;
            }
        }
        C16737.m39273(new RunnableC13667(4, interfaceC21692, C18164.m42285(str)));
    }
}
