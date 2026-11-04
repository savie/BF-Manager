package l;

import android.graphics.drawable.TransitionDrawable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۚۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5458 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f19053;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f19054;

    public /* synthetic */ RunnableC5458(int i, Object obj) {
        this.f19053 = i;
        this.f19054 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19053) {
            case 0:
                ((TransitionDrawable) this.f19054).startTransition(EnumC5810.f19974);
                break;
            case 1:
                ((ActivityC18143) this.f19054).m42298(true);
                break;
            case 2:
                try {
                    ((InputStream) this.f19054).close();
                } catch (IOException | RuntimeException unused) {
                    return;
                }
                break;
            case 3:
                ((C21403) this.f19054).m48693();
                break;
            case 4:
                ((AbstractViewOnClickListenerC22702) this.f19054).m51180();
                break;
            case 5:
                C10060.m26014((C10060) this.f19054);
                break;
            case 6:
                C11223.m28281((C11223) this.f19054);
                break;
            case 7:
                ActivityC7135.m19657((ActivityC7135) this.f19054);
                break;
            default:
                ((C22403) this.f19054).m50533();
                break;
        }
    }
}
