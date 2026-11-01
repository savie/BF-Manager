package l;

import android.view.View;
import bin.mt.plus.R;
import com.google.android.material.search.SearchView;

/* JADX INFO: renamed from: l.ܰ᩺᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: P9S5 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC14141 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f46411;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f46412;

    public /* synthetic */ ViewOnClickListenerC14141(int i, Object obj) {
        this.f46411 = i;
        this.f46412 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f46411;
        Object obj = this.f46412;
        switch (i) {
            case 0:
                int i2 = C1439.f5892;
                ((C1439) obj).m5034(true);
                break;
            case 1:
                int i3 = ActivityC6426.f21765;
                ((ActivityC6426) obj).finish();
                break;
            case 2:
                C22418.m49702((C22418) obj);
                break;
            case 3:
                int i4 = DialogInterfaceC19356.f62401;
                C8067 c8067 = new C8067((AbstractActivityC12483) obj);
                c8067.m21274(R.string.MT_Protector);
                c8067.m21253(R.string.MT_Protector);
                c8067.m21251(R.string.MT_Protector, null);
                c8067.m21269();
                break;
            case 4:
                int i5 = ActivityC10957.f37270;
                ((ActivityC10957) obj).finish();
                break;
            case 5:
                ((ViewOnLayoutChangeListenerC3333) obj).f12358.setVisibility(8);
                break;
            case 6:
                C16609 c16609 = ActivityC23376.f75722;
                ((ActivityC23376) obj).finish();
                break;
            default:
                ((SearchView) obj).lambda$setUpBackButton$1(view);
                break;
        }
    }
}
