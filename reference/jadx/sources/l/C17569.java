package l;

import bin.mt.plus.R;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ܿ᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1R8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17569 extends AbstractC19432 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C15829 f55826;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f55827;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C22959 f55828;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC11220 f55829;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17569(ActivityC11220 activityC11220) {
        super(false);
        this.f55829 = activityC11220;
        this.f55828 = C22959.m50801();
        this.f55827 = new AtomicInteger();
    }

    @Override // l.AbstractC19432
    /* JADX INFO: renamed from: ܰ */
    public final void mo4707() {
        boolean z = ApplicationC0716.f2988.getBoolean("term_double_confirm_to_exit", true);
        ActivityC11220 activityC11220 = this.f55829;
        if (!z) {
            activityC11220.f37972.f21274.m13849();
            activityC11220.finish();
            return;
        }
        final int iIncrementAndGet = this.f55827.incrementAndGet();
        if (this.f55828.m50803()) {
            C15829 c15829 = this.f55826;
            if (c15829 != null) {
                c15829.m37620();
            }
            activityC11220.f37972.f21274.m13849();
            activityC11220.finish();
            return;
        }
        C16737.m39274(new Runnable() { // from class: l.۫᩶ۜ
            @Override // java.lang.Runnable
            public final void run() {
                C17569 c17569 = this.f42211;
                if (iIncrementAndGet == c17569.f55827.get()) {
                    c17569.f55826 = C15829.m37611(R.string.MT_Protector);
                }
            }
        }, 100L);
    }
}
