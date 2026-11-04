package com.google.android.material.search;

import android.content.Context;
import android.view.View;
import l.ActivityC20934;
import l.C13047;
import l.C8614;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SearchView$$ExternalSyntheticLambda10 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ SearchView$$ExternalSyntheticLambda10(int i, Object obj) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ((SearchView) this.f$0).lambda$setUpClearButton$2(view);
                break;
            default:
                ActivityC20934.m47864((Context) ((C8614) this.f$0).m23233(), C13047.m32501(), false);
                break;
        }
    }
}
