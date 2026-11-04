package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۫֫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC12790 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f40906;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f40907;

    public /* synthetic */ ViewOnClickListenerC12790(int i, Object obj) {
        this.f40906 = i;
        this.f40907 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f40906;
        Object obj = this.f40907;
        switch (i) {
            case 0:
                int i2 = ActivityC2350.f7575;
                ((ActivityC2350) obj).finish();
                break;
            case 1:
                C4059.m13058((C4059) obj, view);
                break;
            case 2:
                C21576.m49067((CharSequence) ((C8002) obj).m21840().getName());
                break;
            case 3:
                int i3 = ActivityC5863.f20105;
                ((ActivityC5863) obj).finish();
                break;
            case 4:
                ((ActivityC3846) obj).m12465(true);
                break;
            default:
                ((AbstractActivityC17204) obj).m40396(R.string.MT_Protector, R.string.MT_Protector, false);
                break;
        }
    }
}
