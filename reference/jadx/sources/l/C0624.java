package l;

import android.content.Intent;

/* JADX INFO: renamed from: l.֡ᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26HN */
/* JADX INFO: loaded from: classes3.dex */
public final class C0624 extends AbstractC6323 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC9572 f2442;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0624(ActivityC9572 activityC9572) {
        super(true);
        this.f2442 = activityC9572;
    }

    @Override // l.AbstractC6323
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo2768() {
        int i = ActivityC9572.f30971;
        ActivityC9572 activityC9572 = this.f2442;
        if (activityC9572.isFinishing()) {
            return;
        }
        if (activityC9572.getIntent().getBooleanExtra("mcp_log_return_to_manager", false)) {
            activityC9572.startActivity(new Intent(activityC9572, (Class<?>) ActivityC20852.class).addFlags(268435456));
        }
        activityC9572.finish();
    }
}
