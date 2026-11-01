package l;

import android.view.View;
import bin.mt.plus.R;
import com.google.android.material.search.SearchView;

/* JADX INFO: renamed from: l.ۢ֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: S54T */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC9227 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f31371;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f31372;

    public /* synthetic */ ViewOnClickListenerC9227(int i, Object obj) {
        this.f31371 = i;
        this.f31372 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f31371;
        Object obj = this.f31372;
        switch (i) {
            case 0:
                int i2 = AbstractActivityC4762.f16776;
                ((AbstractActivityC4762) obj).getOnBackPressedDispatcher().m34906();
                break;
            case 1:
                C8067 c8067BuildDialog = ((C11545) obj).m28824().buildDialog();
                c8067BuildDialog.m21274(R.string.MT_Protector);
                c8067BuildDialog.m21253(R.string.MT_Protector);
                c8067BuildDialog.m21251(R.string.MT_Protector, null);
                c8067BuildDialog.m21269();
                break;
            case 2:
                C22342.m49524((C22342) obj);
                break;
            default:
                ((SearchView) obj).lambda$setUpClearButton$2(view);
                break;
        }
    }
}
