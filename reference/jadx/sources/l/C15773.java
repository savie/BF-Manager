package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܶ֫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15773 implements InterfaceC24197 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC2350 f51351;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f51352;

    public C15773(ActivityC2350 activityC2350, View view) {
        this.f51351 = activityC2350;
        this.f51352 = view;
    }

    @Override // l.InterfaceC24197
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View mo37711() {
        return this.f51352.findViewById(R.id.MT_Protector);
    }

    @Override // l.InterfaceC24197
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo37712() {
        ActivityC2350 activityC2350 = this.f51351;
        activityC2350.m7953();
        activityC2350.m7948();
    }
}
