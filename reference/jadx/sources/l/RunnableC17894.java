package l;

import android.graphics.drawable.TransitionDrawable;

/* JADX INFO: renamed from: l.ᩳۜ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC17894 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f56671;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f56672;

    public /* synthetic */ RunnableC17894(int i, Object obj) {
        this.f56671 = i;
        this.f56672 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f56671) {
            case 0:
                ((TransitionDrawable) this.f56672).startTransition(EnumC12167.f40710);
                break;
            case 1:
                ((C11643) this.f56672).m29077();
                break;
            case 2:
                ((InterfaceC2288) this.f56672).cancel();
                break;
            default:
                C11734.m29329((C11734) this.f56672);
                break;
        }
    }
}
