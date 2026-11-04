package l;

import android.content.DialogInterface;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۤۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: HIRF */
/* JADX INFO: loaded from: classes4.dex */
public final class C10633 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f33723;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f33724;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C1442 f33725;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C19143 f33726;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C19143 f33727;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22568 f33728;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C1442 f33729;

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
    }

    public C10633(ActivityC22568 activityC22568) {
        this.f33728 = activityC22568;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        ActivityC22568 activityC22568 = this.f33728;
        this.f33727 = activityC22568.f72948.m42190(true).f40509.m17213();
        this.f33726 = activityC22568.f72948.m42190(false).f40509.m17213();
        this.f33725 = activityC22568.f72956;
        this.f33729 = activityC22568.f72938;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws IOException {
        this.f33727.m44377();
        this.f33726.m44377();
        this.f33724 = true;
        this.f33725.m5191();
        this.f33729.m5191();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (this.f33723) {
            return;
        }
        C1442 c1442 = this.f33725;
        ActivityC22568 activityC22568 = this.f33728;
        if (c1442 == activityC22568.f72956 && this.f33729 == activityC22568.f72938 && activityC22568.f72927 == null && !activityC22568.isFinishing() && !activityC22568.isDestroyed()) {
            if (this.f33724 || !(exc instanceof IOException)) {
                activityC22568.m40401(exc, (DialogInterface.OnDismissListener) null);
            } else {
                activityC22568.m50858((IOException) exc);
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        ActivityC22568 activityC22568 = this.f33728;
        if (activityC22568.f72941 == this) {
            activityC22568.f72941 = null;
        }
    }
}
