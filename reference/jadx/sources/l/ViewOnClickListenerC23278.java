package l;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

/* JADX INFO: renamed from: l.᩺᩹ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC23278 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f75510;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f75511;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f75512;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f75513;

    public /* synthetic */ ViewOnClickListenerC23278(Object obj, Object obj2, Object obj3, int i) {
        this.f75511 = i;
        this.f75513 = obj;
        this.f75510 = obj2;
        this.f75512 = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f75511) {
            case 0:
                RadioButton radioButton = (RadioButton) this.f75513;
                RadioButton radioButton2 = (RadioButton) this.f75510;
                EditText editText = (EditText) this.f75512;
                radioButton.setChecked(view == radioButton);
                radioButton2.setChecked(view == radioButton2);
                editText.setEnabled(view == radioButton2);
                break;
            default:
                C17606.m40929((C20429) this.f75513, (C17606) this.f75510, (DialogInterfaceC19356) this.f75512);
                break;
        }
    }
}
