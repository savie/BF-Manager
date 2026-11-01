package l;

import com.tencent.connect.common.AssistActivity;

/* JADX INFO: renamed from: l.ۚ᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC5605 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AssistActivity f19208;

    public RunnableC5605(AssistActivity assistActivity) {
        this.f19208 = assistActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AssistActivity assistActivity = this.f19208;
        C23099.m51113(assistActivity.f887, "onActivityResult finish delay");
        assistActivity.finish();
    }
}
