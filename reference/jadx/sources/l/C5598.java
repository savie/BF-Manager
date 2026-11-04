package l;

import bin.mt.plus.R;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۚۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1R8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5598 extends AbstractC6323 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C22673 f19423;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC11563 f19424;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C24720 f19425;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AtomicInteger f19426;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5598(ActivityC11563 activityC11563) {
        super(false);
        this.f19424 = activityC11563;
        this.f19425 = C24720.m55196();
        this.f19426 = new AtomicInteger();
    }

    @Override // l.AbstractC6323
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2768() {
        boolean z = ApplicationC17729.f58262.getBoolean("term_double_confirm_to_exit", true);
        ActivityC11563 activityC11563 = this.f19424;
        if (!z) {
            activityC11563.f36351.f6297.m54259();
            activityC11563.finish();
            return;
        }
        final int iIncrementAndGet = this.f19426.incrementAndGet();
        if (this.f19425.m55200()) {
            C22673 c22673 = this.f19423;
            if (c22673 != null) {
                c22673.m51161();
            }
            activityC11563.f36351.f6297.m54259();
            activityC11563.finish();
            return;
        }
        C21576.m49069(new Runnable() { // from class: l.۫ۤ᩻
            @Override // java.lang.Runnable
            public final void run() {
                C5598 c5598 = this.f41776;
                if (iIncrementAndGet == c5598.f19426.get()) {
                    c5598.f19423 = C22673.m51152(R.string.MT_Protector);
                }
            }
        }, 100L);
    }
}
