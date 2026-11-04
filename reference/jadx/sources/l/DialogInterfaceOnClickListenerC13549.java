package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۬ۖ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: X977 */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogInterfaceOnClickListenerC13549 implements DialogInterface.OnClickListener, View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final RadioButton[] f43035;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C8614 f43036;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final CheckBox f43037;

    public DialogInterfaceOnClickListenerC13549(Main main, C8614 c8614) {
        RadioButton[] radioButtonArr = {(RadioButton) viewM40395.findViewById(R.id.MT_Protector), (RadioButton) viewM40395.findViewById(R.id.MT_Protector), (RadioButton) viewM40395.findViewById(R.id.MT_Protector), (RadioButton) viewM40395.findViewById(R.id.MT_Protector)};
        this.f43035 = radioButtonArr;
        this.f43036 = c8614;
        View viewM40395 = main.m40395(R.layout.MT_Protector);
        radioButtonArr[0].setOnClickListener(this);
        radioButtonArr[1].setOnClickListener(this);
        radioButtonArr[2].setOnClickListener(this);
        radioButtonArr[3].setOnClickListener(this);
        CheckBox checkBox = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        this.f43037 = checkBox;
        viewM40395.findViewById(R.id.MT_Protector).setVisibility(8);
        radioButtonArr[C14118.m34280(C17423.f56649)].setChecked(true);
        checkBox.setChecked(C14118.m34290(C17423.f56649));
        C2361 c2361BuildDialog = main.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, this);
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 0;
        while (i2 < 4 && !this.f43035[i2].isChecked()) {
            i2++;
        }
        if (this.f43037.isChecked()) {
            i2 += 4;
        }
        C17423.f56649 = i2;
        ApplicationC17729.f58258.edit().mo3485((byte) i2, "rbs").apply();
        this.f43036.m23201();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RadioButton[] radioButtonArr = this.f43035;
        radioButtonArr[0].setChecked(false);
        radioButtonArr[1].setChecked(false);
        radioButtonArr[2].setChecked(false);
        radioButtonArr[3].setChecked(false);
        ((RadioButton) view).setChecked(true);
    }
}
