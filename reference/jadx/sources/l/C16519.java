package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܺ֫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C16519 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC2350 f53487;

    public /* synthetic */ C16519(ActivityC2350 activityC2350) {
        this.f53487 = activityC2350;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39147(boolean z) {
        ActivityC2350.m7958(this.f53487, z);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        m39147(((Boolean) obj).booleanValue());
    }

    public final Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }
}
