package l;

import android.app.Application;
import android.content.Intent;

/* JADX INFO: renamed from: l.ۡۛۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AW */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC8689 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f29895;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29895) {
            case 0:
                int i = ServiceC4538.f16137;
                Application applicationM39277 = C16737.m39277();
                C10405.m26303(applicationM39277, new Intent(applicationM39277, (Class<?>) ServiceC4538.class));
                break;
            default:
                C23186.m51176();
                break;
        }
    }
}
