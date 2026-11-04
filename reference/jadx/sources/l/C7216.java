package l;

import android.content.Context;

/* JADX INFO: renamed from: l.ۜܳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8Q4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7216 implements InterfaceC0142 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21025 f23812 = new C8707();

    @Override // l.InterfaceC0142
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC7600 mo1300(Context context, C1259 c1259, C4914 c4914, ExecutorC7962 executorC7962) {
        try {
            return ((InterfaceC0142) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(InterfaceC21025.class).newInstance(this.f23812)).mo1300(context, c1259, c4914, executorC7962);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
