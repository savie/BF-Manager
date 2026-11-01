package l;

import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܺۧ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AJ5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15903 extends AbstractC7713 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20321 f51498;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20321 f51499;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16608 f51500;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f51501;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f51502;

    public C15903(C16608 c16608, String str, C20321 c20321, C20321 c20322, boolean z) {
        this.f51500 = c16608;
        this.f51502 = str;
        this.f51499 = c20321;
        this.f51498 = c20322;
        this.f51501 = z;
    }

    @Override // l.AbstractC7713
    /* JADX INFO: renamed from: ۙ */
    public final View mo2074(Main main) {
        View viewM30995 = main.m30995(R.layout.MT_Protector);
        ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(this.f51502);
        C16793.m39443(viewM30995, this.f51499, this.f51498);
        final RadioButton[] radioButtonArr = {(RadioButton) viewM30995.findViewById(R.id.MT_Protector), (RadioButton) viewM30995.findViewById(R.id.MT_Protector), (RadioButton) viewM30995.findViewById(R.id.radioButton3)};
        C16608 c16608 = this.f51500;
        if (c16608.f53298) {
            radioButtonArr[0].setText(R.string.MT_Protector);
            radioButtonArr[2].setText(R.string.MT_Protector);
        }
        ((CheckBox) viewM30995.findViewById(R.id.MT_Protector)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۤۧ᩹
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f34976.f51500.f53299 = z;
            }
        });
        final CheckBox checkBox = (CheckBox) viewM30995.findViewById(R.id.checkBox2);
        final boolean z = this.f51501 && C20370.m46024();
        if (z) {
            checkBox.setVisibility(c16608.f53297 == 0 ? 0 : 8);
            checkBox.setChecked(c16608.f53296);
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.۟ۧ᩹
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                    this.f24805.f51500.f53296 = z2;
                }
            });
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.᩷ۧ᩹
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RadioButton[] radioButtonArr2 = radioButtonArr;
                int length = radioButtonArr2.length;
                for (int i = 0; i < length; i++) {
                    RadioButton radioButton = radioButtonArr2[i];
                    radioButton.setChecked(radioButton == view);
                }
                if (z) {
                    checkBox.setVisibility(view.getId() != R.id.MT_Protector ? 8 : 0);
                }
            }
        };
        int i = 0;
        while (i < 3) {
            radioButtonArr[i].setChecked(i == c16608.f53297);
            radioButtonArr[i].setOnClickListener(onClickListener);
            i++;
        }
        viewM30995.setTag(radioButtonArr);
        return viewM30995;
    }

    @Override // l.AbstractC7713
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2077(View view) {
        RadioButton[] radioButtonArr = (RadioButton[]) view.getTag();
        boolean zIsChecked = radioButtonArr[0].isChecked();
        C16608 c16608 = this.f51500;
        if (zIsChecked) {
            c16608.f53297 = 0;
            return true;
        }
        if (radioButtonArr[1].isChecked()) {
            c16608.f53297 = 1;
            return true;
        }
        c16608.f53297 = 2;
        return true;
    }
}
