package l;

import android.view.View;
import android.widget.RadioButton;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۗۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAXL */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC3238 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f10549;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f10550;

    public /* synthetic */ ViewOnClickListenerC3238(int i, Object obj) {
        this.f10549 = i;
        this.f10550 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f10549) {
            case 0:
                ViewOnClickListenerC5914.m17159((AbstractActivityC17204) this.f10550, false);
                break;
            case 1:
                AbstractC9781.m25506((AbstractC9781) this.f10550);
                break;
            case 2:
                ((C17695) this.f10550).m41411();
                break;
            case 3:
                RadioButton[] radioButtonArr = (RadioButton[]) this.f10550;
                int length = radioButtonArr.length;
                for (int i = 0; i < length; i++) {
                    RadioButton radioButton = radioButtonArr[i];
                    radioButton.setChecked(view == radioButton);
                }
                break;
            case 4:
                C20956 c20956 = (C20956) this.f10550;
                c20956.getClass();
                C20956.m47909(c20956, R.string.MT_Protector, null, null, 14);
                break;
            case 5:
                ActivityC7135.m19628((ActivityC7135) this.f10550);
                break;
            default:
                ActivityC0848 activityC0848 = (ActivityC0848) this.f10550;
                activityC0848.f3187.smoothScrollToPosition(activityC0848.f3172);
                break;
        }
    }
}
