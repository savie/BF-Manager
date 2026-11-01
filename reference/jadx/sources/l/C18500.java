package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩴۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18500 implements Consumer {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC4471 f58940;

    public /* synthetic */ C18500(ActivityC4471 activityC4471) {
        this.f58940 = activityC4471;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42894(boolean z) {
        ActivityC4471.m12477(this.f58940, z);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        m42894(((Boolean) obj).booleanValue());
    }

    public final Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }
}
