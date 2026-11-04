package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: l.᩸᩶ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8IS */
/* JADX INFO: loaded from: classes.dex */
public final class C23042 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4879 f74777;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15582 f74778;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC20058 f74779;

    public C23042(C15582 c15582, InterfaceC4879 interfaceC4879, InterfaceC20058 interfaceC20058) {
        this.f74778 = c15582;
        this.f74777 = interfaceC4879;
        this.f74779 = interfaceC20058;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f74777.mo14966(new Runnable() { // from class: l.ۤ᩶ۙ
                @Override // java.lang.Runnable
                public final void run() {
                    C23042.m51938(this.f35019);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51938(C23042 c23042) {
        if (c23042.f74778.f50684) {
            ((SurfaceHolderCallbackC1325) c23042.f74779).f4759.m23503(3, false);
        }
    }
}
