package l;

import android.content.DialogInterface;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۨ᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7YU */
/* JADX INFO: loaded from: classes4.dex */
public final class C12007 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f40241;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC13418 f40242;

    public C12007(ActivityC13418 activityC13418, View view) {
        this.f40242 = activityC13418;
        this.f40241 = view;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f40242, R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C8067 c8067BuildDialog = this.f40242.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21253(R.string.MT_Protector);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        C23250.m51307(c8067BuildDialog.m21269());
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f40241.setEnabled(true);
        this.f40242.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws C8142 {
        C1313 c1313M8314 = C2724.m8305(4213).m8314();
        if (!c1313M8314.m4686()) {
            throw new C8142(C4820.m13401(c1313M8314, R.string.MT_Protector));
        }
    }
}
