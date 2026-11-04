package l;

import android.view.View;
import android.widget.RadioButton;
import bin.mt.plugin.api.ui.PluginView;
import com.google.android.material.snackbar.Snackbar;

/* JADX INFO: renamed from: l.ۨۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC12107 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f38961;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f38962;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f38963;

    public /* synthetic */ ViewOnClickListenerC12107(int i, Object obj, Object obj2) {
        this.f38961 = i;
        this.f38963 = obj;
        this.f38962 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f38961) {
            case 0:
                C25093.m55917((C2119) this.f38963, (C25093) this.f38962);
                break;
            case 1:
                RadioButton[] radioButtonArr = (RadioButton[]) this.f38963;
                int[] iArr = (int[]) this.f38962;
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
            case 2:
                C6128 c6128 = (C6128) this.f38963;
                PluginView.OnClickListener onClickListener = (PluginView.OnClickListener) this.f38962;
                c6128.getClass();
                onClickListener.onClick(c6128);
                break;
            default:
                ((Snackbar) this.f38963).lambda$setAction$0((View.OnClickListener) this.f38962, view);
                break;
        }
    }
}
