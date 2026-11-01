package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩺᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 09LR */
/* JADX INFO: loaded from: classes.dex */
public final class C23233 extends AbstractC19432 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC15472 f75393;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23233(ActivityC15472 activityC15472) {
        super(true);
        this.f75393 = activityC15472;
    }

    @Override // l.AbstractC19432
    /* JADX INFO: renamed from: ܰ */
    public final void mo4707() {
        ActivityC15472 activityC15472 = this.f75393;
        if (activityC15472.f50419.m23935()) {
            C8067 c8067BuildDialog = activityC15472.buildDialog();
            c8067BuildDialog.m21277(activityC15472.f50413);
            c8067BuildDialog.m21253(R.string.MT_Protector);
            c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۘ᩷ۘ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f15233.f75393.m37013(true);
                }
            });
            c8067BuildDialog.m21275(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۜ᩷ۘ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f23568.f75393.finish();
                }
            });
            c8067BuildDialog.m21269();
            return;
        }
        activityC15472.finish();
    }
}
