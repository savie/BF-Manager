package l;

import android.view.View;
import android.widget.RadioButton;

/* JADX INFO: renamed from: l.᩺֡᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X5LN */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC22648 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f73785;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f73786;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f73787;

    public /* synthetic */ ViewOnClickListenerC22648(int i, Object obj, Object obj2) {
        this.f73786 = i;
        this.f73787 = obj;
        this.f73785 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f73786) {
            case 0:
                C22418.m49714((C22418) this.f73787, (DialogInterfaceC19356) this.f73785);
                break;
            default:
                RadioButton[] radioButtonArr = (RadioButton[]) this.f73787;
                int[] iArr = (int[]) this.f73785;
                int length = radioButtonArr.length;
                for (int i = 0; i < length; i++) {
                    RadioButton radioButton = radioButtonArr[i];
                    if (radioButton == view) {
                        radioButton.setChecked(true);
                        iArr[0] = i;
                    } else {
                        radioButton.setChecked(false);
                    }
                }
                break;
        }
    }
}
