package l;

import android.content.Context;

/* JADX INFO: renamed from: l.᩵֨ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8Q4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19135 implements InterfaceC22486 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2729 f61807 = new C7846();

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1318 mo43961(Context context, C4119 c4119, C9963 c9963, ExecutorC12785 executorC12785) {
        try {
            return ((InterfaceC22486) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(InterfaceC2729.class).newInstance(this.f61807)).mo43961(context, c4119, c9963, executorC12785);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
