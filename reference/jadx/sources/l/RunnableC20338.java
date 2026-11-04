package l;

import com.tencent.connect.common.AssistActivity;

/* JADX INFO: renamed from: l.᩵ۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC20338 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AssistActivity f65245;

    public RunnableC20338(AssistActivity assistActivity) {
        this.f65245 = assistActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AssistActivity assistActivity = this.f65245;
        C21587.m49113(assistActivity.f882, "onActivityResult finish delay");
        assistActivity.finish();
    }
}
