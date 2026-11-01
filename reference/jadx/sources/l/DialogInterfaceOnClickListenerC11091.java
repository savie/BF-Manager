package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧܺ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X977 */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnClickListenerC11091 implements DialogInterface.OnClickListener, View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C11545 f37654;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final RadioButton[] f37655;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final CheckBox f37656;

    public DialogInterfaceOnClickListenerC11091(Main main, C11545 c11545) {
        RadioButton[] radioButtonArr = {(RadioButton) viewM30995.findViewById(R.id.MT_Protector), (RadioButton) viewM30995.findViewById(R.id.MT_Protector), (RadioButton) viewM30995.findViewById(R.id.MT_Protector), (RadioButton) viewM30995.findViewById(R.id.MT_Protector)};
        this.f37655 = radioButtonArr;
        this.f37654 = c11545;
        View viewM30995 = main.m30995(R.layout.MT_Protector);
        radioButtonArr[0].setOnClickListener(this);
        radioButtonArr[1].setOnClickListener(this);
        radioButtonArr[2].setOnClickListener(this);
        radioButtonArr[3].setOnClickListener(this);
        CheckBox checkBox = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        this.f37656 = checkBox;
        viewM30995.findViewById(R.id.MT_Protector).setVisibility(8);
        radioButtonArr[C3386.m10039(C0674.f2828)].setChecked(true);
        checkBox.setChecked(C3386.m10049(C0674.f2828));
        C8067 c8067BuildDialog = main.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, this);
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 0;
        while (i2 < 4 && !this.f37655[i2].isChecked()) {
            i2++;
        }
        if (this.f37656.isChecked()) {
            i2 += 4;
        }
        C0674.f2828 = i2;
        ApplicationC0716.f2992.edit().mo4064((byte) i2, "rbs").apply();
        this.f37654.m28806();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RadioButton[] radioButtonArr = this.f37655;
        radioButtonArr[0].setChecked(false);
        radioButtonArr[1].setChecked(false);
        radioButtonArr[2].setChecked(false);
        radioButtonArr[3].setChecked(false);
        ((RadioButton) view).setChecked(true);
    }
}
