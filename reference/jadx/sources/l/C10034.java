package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10034 implements InterfaceC21530 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC4471 f34252;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f34253;

    public C10034(ActivityC4471 activityC4471, View view) {
        this.f34252 = activityC4471;
        this.f34253 = view;
    }

    @Override // l.InterfaceC21530
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View mo25319() {
        return this.f34253.findViewById(R.id.MT_Protector);
    }

    @Override // l.InterfaceC21530
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo25320() {
        ActivityC4471 activityC4471 = this.f34252;
        activityC4471.m12450();
        activityC4471.m12463();
    }
}
