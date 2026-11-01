package l;

import android.app.Application;
import android.content.ServiceConnection;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.۟᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1X5 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC7772 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Application f25633;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16944 f25634;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ServiceConnection f25635;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f25636;

    public /* synthetic */ RunnableC7772(C16944 c16944, AtomicBoolean atomicBoolean, Application application, ServiceConnection serviceConnection) {
        this.f25634 = c16944;
        this.f25636 = atomicBoolean;
        this.f25633 = application;
        this.f25635 = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C16944.m39675(this.f25634, this.f25636, this.f25633, this.f25635);
    }
}
