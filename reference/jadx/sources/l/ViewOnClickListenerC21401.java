package l;

import android.view.View;
import com.google.android.material.snackbar.Snackbar;

/* JADX INFO: renamed from: l.᩸ۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC21401 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f69579;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f69580;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f69581;

    public /* synthetic */ ViewOnClickListenerC21401(int i, Object obj, Object obj2) {
        this.f69580 = i;
        this.f69581 = obj;
        this.f69579 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f69580) {
            case 0:
                C23519.m51782((C11545) this.f69581, (InterfaceC2557) this.f69579);
                break;
            default:
                ((Snackbar) this.f69581).lambda$setAction$0((View.OnClickListener) this.f69579, view);
                break;
        }
    }
}
