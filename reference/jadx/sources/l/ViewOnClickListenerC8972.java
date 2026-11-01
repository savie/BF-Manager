package l;

import android.view.KeyEvent;
import android.view.View;
import android.widget.RadioButton;

/* JADX INFO: renamed from: l.ۡܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 34MM */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC8972 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f30729;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f30730;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f30731;

    public /* synthetic */ ViewOnClickListenerC8972(Object obj, KeyEvent.Callback callback, int i) {
        this.f30730 = i;
        this.f30731 = obj;
        this.f30729 = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f30730) {
            case 0:
                ViewOnClickListenerC16028.m38011((ViewOnClickListenerC16028) this.f30731, (View) this.f30729);
                break;
            case 1:
                C7282.m19429((AbstractActivityC12483) this.f30729, ((C7282) this.f30731).f24207);
                break;
            default:
                RadioButton radioButton = (RadioButton) this.f30731;
                RadioButton radioButton2 = (RadioButton) this.f30729;
                radioButton.setChecked(view == radioButton);
                radioButton2.setChecked(view == radioButton2);
                break;
        }
    }
}
