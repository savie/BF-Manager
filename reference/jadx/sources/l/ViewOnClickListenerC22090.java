package l;

import android.view.View;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.᩷۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ML */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC22090 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f71187;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f71188;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f71189;

    public /* synthetic */ ViewOnClickListenerC22090(int i, Object obj, Object obj2) {
        this.f71187 = i;
        this.f71189 = obj;
        this.f71188 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f71187;
        Object obj = this.f71188;
        Object obj2 = this.f71189;
        switch (i) {
            case 0:
                C23582.m52784((C23582) obj2, (AbstractActivityC17204) obj, view);
                break;
            default:
                ViewOnClickListenerC7793 viewOnClickListenerC7793 = (ViewOnClickListenerC7793) obj2;
                int i2 = ViewOnClickListenerC7793.f25871;
                viewOnClickListenerC7793.getClass();
                Main.m93(viewOnClickListenerC7793, (String) obj);
                break;
        }
    }
}
