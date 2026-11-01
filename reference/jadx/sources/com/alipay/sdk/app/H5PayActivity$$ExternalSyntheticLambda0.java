package com.alipay.sdk.app;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import bin.mt.plus.R;
import l.AbstractC20745;
import l.ActivityC19749;
import l.ApplicationC0716;
import l.C0524;
import l.C15829;
import l.C15844;
import l.C5553;
import l.C7754;
import l.C8067;
import l.DialogInterfaceOnClickListenerC16588;
import l.InterfaceC11754;
import l.InterfaceC14394;
import l.InterfaceC21133;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class H5PayActivity$$ExternalSyntheticLambda0 implements InterfaceC14394, InterfaceC21133, InterfaceC11754 {
    public final /* synthetic */ Object f$0;

    public /* synthetic */ H5PayActivity$$ExternalSyntheticLambda0(Object obj) {
        this.f$0 = obj;
    }

    @Override // l.InterfaceC11754
    public C15844 onApplyWindowInsets(View view, C15844 c15844) {
        return H5PayActivity.a((View) this.f$0, view, c15844);
    }

    @Override // l.InterfaceC14394
    public /* synthetic */ void onCanceled() {
    }

    @Override // l.InterfaceC21133
    public boolean onMenuItemClick(MenuItem menuItem) {
        C0524.m2415((C0524) this.f$0, menuItem);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [int[], java.io.Serializable] */
    @Override // l.InterfaceC14394
    public void onGetPath(Bundle bundle, String str) {
        final ActivityC19749 activityC19749 = (ActivityC19749) this.f$0;
        int i = ActivityC19749.f63457;
        final AbstractC20745 abstractC20745M15313 = C5553.m15313(str, new String[0]);
        ApplicationC0716.f2992.edit().putString("tfdp", str).apply();
        if (bundle.getBoolean("export")) {
            try {
                C7754.m20407(abstractC20745M15313, bundle.getIntegerArrayList("indices"));
                C15829.m37611(R.string.MT_Protector);
                return;
            } catch (Exception e) {
                activityC19749.m31002(e, (DialogInterface.OnDismissListener) null);
                return;
            }
        }
        final ?? r7 = {0};
        C8067 c8067BuildDialog = activityC19749.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21254(R.array.MT_Protector, r7[0], new DialogInterfaceOnClickListenerC16588(1, r7));
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۘۚۚ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ActivityC19749.m44928(activityC19749, abstractC20745M15313, r7);
            }
        });
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269();
    }
}
