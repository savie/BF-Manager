package l;

import android.R;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ܽܽ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Q649 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC17724 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f58248;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f58249;

    public /* synthetic */ ViewOnClickListenerC17724(int i, Object obj) {
        this.f58248 = i;
        this.f58249 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f58248;
        Object obj = this.f58249;
        switch (i) {
            case 0:
                ActivityC4300 activityC4300 = (ActivityC4300) obj;
                int i2 = ActivityC4300.f15587;
                C2361 c2361BuildDialog = activityC4300.buildDialog();
                c2361BuildDialog.m8008(activityC4300.getTitle());
                TextView textView = (TextView) c2361BuildDialog.m8016().m22423(R.id.message);
                C17423.m40915(textView);
                textView.setOnClickListener(new ViewOnClickListenerC15110());
                break;
            case 1:
                C14031.m34165((C14031) obj);
                break;
            case 2:
                ActivityC7135.m19573((ActivityC7135) obj, view);
                break;
            case 3:
                C0107 c0107 = ActivityC17639.f57995;
                ((ActivityC17639) obj).finish();
                break;
            default:
                ActivityC0093.m1175((ActivityC0093) obj);
                break;
        }
    }
}
