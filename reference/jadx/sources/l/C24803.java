package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻ۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 09LR */
/* JADX INFO: loaded from: classes.dex */
public final class C24803 extends AbstractC6323 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16597 f80255;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24803(ActivityC16597 activityC16597) {
        super(true);
        this.f80255 = activityC16597;
    }

    @Override // l.AbstractC6323
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2768() {
        ActivityC16597 activityC16597 = this.f80255;
        if (activityC16597.f53686.m4744()) {
            C2361 c2361BuildDialog = activityC16597.buildDialog();
            c2361BuildDialog.m8024(activityC16597.f53683);
            c2361BuildDialog.m8000(R.string.MT_Protector);
            c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֫ۙۧ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f5788.f80255.m39280(true);
                }
            });
            c2361BuildDialog.m8022(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۧۙۧ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f35802.f80255.finish();
                }
            });
            c2361BuildDialog.m8016();
            return;
        }
        activityC16597.finish();
    }
}
