package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۢ֫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: G16V */
/* JADX INFO: loaded from: classes3.dex */
public final class C9276 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC11620 f31534;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9276(ActivityC11620 activityC11620, ActivityC11620 activityC11621) {
        super(activityC11621, -1);
        this.f31534 = activityC11620;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        ActivityC11620 activityC11620 = this.f31534;
        String strM40352 = m40352();
        if (strM40352.isEmpty()) {
            m40364();
            return;
        }
        if (strM40352.contains("/") || strM40352.contains("\\")) {
            m40365(R.string.MT_Protector);
            return;
        }
        if (C14920.m35667(strM40352)) {
            m40365(R.string.MT_Protector);
            return;
        }
        try {
            C14920.m35664(new C22681(strM40352));
            m40364();
            activityC11620.f39034 = C14920.m35666();
            activityC11620.f39033.notifyDataSetChanged();
        } catch (IOException e) {
            activityC11620.m31002(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
