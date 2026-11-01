package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: l.ۡ᩶ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8IS */
/* JADX INFO: loaded from: classes3.dex */
public final class C9102 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8065 f31027;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7690 f31028;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10513 f31029;

    public C9102(C7690 c7690, InterfaceC8065 interfaceC8065, InterfaceC10513 interfaceC10513) {
        this.f31028 = c7690;
        this.f31027 = interfaceC8065;
        this.f31029 = interfaceC10513;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f31027.mo21243(new Runnable() { // from class: l.᩵᩶ۙ
                @Override // java.lang.Runnable
                public final void run() {
                    C9102.m23452(this.f63201);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23452(C9102 c9102) {
        if (c9102.f31028.f25472) {
            ((SurfaceHolderCallbackC4057) c9102.f31029).f14958.m36757(3, false);
        }
    }
}
