package l;

import android.os.Process;

/* JADX INFO: renamed from: l.ۙ۠᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4783 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f16778;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f16779;

    public /* synthetic */ RunnableC4783(int i, Object obj) {
        this.f16778 = i;
        this.f16779 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16778) {
            case 0:
                ((C24132) this.f16779).m53823();
                break;
            case 1:
                C4914.m15070((C4914) this.f16779);
                break;
            case 2:
                C10060.m26012((C10060) this.f16779);
                break;
            case 3:
                Runnable runnable = (Runnable) this.f16779;
                Process.setThreadPriority(10);
                runnable.run();
                break;
            case 4:
                C22673.m51154((CharSequence) this.f16779);
                break;
            default:
                ((InterfaceC23507) this.f16779).mo19231();
                break;
        }
    }
}
