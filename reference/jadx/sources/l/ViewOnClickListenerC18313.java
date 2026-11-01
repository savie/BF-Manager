package l;

import android.R;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.search.SearchView;

/* JADX INFO: renamed from: l.ᩳ᩸ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q649 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC18313 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f58413;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f58414;

    public /* synthetic */ ViewOnClickListenerC18313(KeyEvent.Callback callback, int i) {
        this.f58413 = i;
        this.f58414 = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f58413;
        KeyEvent.Callback callback = this.f58414;
        switch (i) {
            case 0:
                ActivityC21135 activityC21135 = (ActivityC21135) callback;
                int i2 = ActivityC21135.f68820;
                C8067 c8067BuildDialog = activityC21135.buildDialog();
                c8067BuildDialog.m21261(activityC21135.getTitle());
                TextView textView = (TextView) c8067BuildDialog.m21269().m44364(R.id.message);
                C0674.m3031(textView);
                textView.setOnClickListener(new ViewOnClickListenerC4198());
                break;
            default:
                ((SearchView) callback).lambda$setupWithSearchBar$7(view);
                break;
        }
    }
}
