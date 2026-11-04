package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۢܰܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J26J */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC10170 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f32564;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f32565;

    public /* synthetic */ ViewOnClickListenerC10170(int i, Object obj) {
        this.f32564 = i;
        this.f32565 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f32564) {
            case 0:
                C20065.m46119((C20065) this.f32565, view);
                break;
            case 1:
                C2361 c2361BuildDialog = ((AbstractActivityC17204) this.f32565).buildDialog();
                c2361BuildDialog.m8021(R.string.MT_Protector);
                c2361BuildDialog.m8000(R.string.MT_Protector);
                c2361BuildDialog.m8026(R.string.MT_Protector, null);
                c2361BuildDialog.m8016();
                break;
            case 2:
                AbstractC21716.m49286((AbstractC21716) this.f32565);
                break;
            case 3:
                ((AbstractC13001) this.f32565).f27860.m24476();
                break;
            case 4:
                ((C13132) this.f32565).m32615(view);
                break;
            default:
                ((C0168) this.f32565).f1225.m30404();
                break;
        }
    }
}
