package l;

import android.content.Intent;
import android.view.View;

/* JADX INFO: renamed from: l.ۨ᩺᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: P9S5 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC12024 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f40273;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f40274;

    public /* synthetic */ ViewOnClickListenerC12024(int i, Object obj) {
        this.f40273 = i;
        this.f40274 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f40273;
        Object obj = this.f40274;
        switch (i) {
            case 0:
                C1439 c1439 = (C1439) obj;
                int i2 = C1439.f5892;
                if (c1439.m5032().length() <= 0) {
                    c1439.m5033();
                } else {
                    c1439.m5028((String) null);
                    c1439.m5034(true);
                }
                break;
            case 1:
                int i3 = ActivityC0673.f2819;
                ((ActivityC0673) obj).finish();
                break;
            case 2:
                AbstractActivityC12483 abstractActivityC12483 = (AbstractActivityC12483) obj;
                abstractActivityC12483.startActivity(new Intent(abstractActivityC12483, (Class<?>) ActivityC20807.class));
                break;
            default:
                ((AbstractDialogInterfaceOnClickListenerC17341) obj).m40346((CharSequence) C5319.m14744(System.currentTimeMillis()));
                break;
        }
    }
}
