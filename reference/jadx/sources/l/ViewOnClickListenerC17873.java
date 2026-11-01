package l;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: l.ᩳۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC17873 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f56579;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f56580;

    public /* synthetic */ ViewOnClickListenerC17873(int i, Object obj) {
        this.f56579 = i;
        this.f56580 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f56579;
        Object obj = this.f56580;
        switch (i) {
            case 0:
                C23519 c23519 = (C23519) obj;
                C23519.m51783(c23519.f76117, new RunnableC19285(0, c23519));
                break;
            case 1:
                ActivityC14082.m34069((Context) ((C11545) obj).m28824(), C1355.m4789(), false);
                break;
            case 2:
                C18398.m42681((AbstractActivityC12483) obj);
                break;
            default:
                int i2 = ActivityC7042.f23658;
                ((ActivityC7042) obj).finish();
                break;
        }
    }
}
