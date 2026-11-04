package l;

import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۘ᩸۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AJ5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4446 extends AbstractC21832 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21578 f15910;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18616 f15911;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21578 f15912;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f15913;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f15914;

    public C4446(C18616 c18616, String str, C21578 c21578, C21578 c21579, boolean z) {
        this.f15911 = c18616;
        this.f15914 = str;
        this.f15912 = c21578;
        this.f15910 = c21579;
        this.f15913 = z;
    }

    @Override // l.AbstractC21832
    /* JADX INFO: renamed from: ۙ */
    public final View mo2088(Main main) {
        View viewM40395 = main.m40395(R.layout.MT_Protector);
        ((TextView) viewM40395.findViewById(R.id.MT_Protector)).setText(this.f15914);
        C0695.m3002(viewM40395, this.f15912, this.f15910);
        final RadioButton[] radioButtonArr = {(RadioButton) viewM40395.findViewById(R.id.MT_Protector), (RadioButton) viewM40395.findViewById(R.id.MT_Protector), (RadioButton) viewM40395.findViewById(R.id.radioButton3)};
        C18616 c18616 = this.f15911;
        if (c18616.f60533) {
            radioButtonArr[0].setText(R.string.MT_Protector);
            radioButtonArr[2].setText(R.string.MT_Protector);
        }
        ((CheckBox) viewM40395.findViewById(R.id.MT_Protector)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۨ᩸۫
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f40562.f15911.f60537 = z;
            }
        });
        final CheckBox checkBox = (CheckBox) viewM40395.findViewById(R.id.checkBox2);
        final boolean z = this.f15913 && C19632.m45281();
        if (z) {
            checkBox.setVisibility(c18616.f60535 == 0 ? 0 : 8);
            checkBox.setChecked(c18616.f60534);
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۛ᩸۫
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                    this.f22267.f15911.f60534 = z2;
                }
            });
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.᩺᩸۫
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
            radioButtonArr[i].setChecked(i == c18616.f60535);
            radioButtonArr[i].setOnClickListener(onClickListener);
            i++;
        }
        viewM40395.setTag(radioButtonArr);
        return viewM40395;
    }

    @Override // l.AbstractC21832
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2091(View view) {
        RadioButton[] radioButtonArr = (RadioButton[]) view.getTag();
        boolean zIsChecked = radioButtonArr[0].isChecked();
        C18616 c18616 = this.f15911;
        if (zIsChecked) {
            c18616.f60535 = 0;
            return true;
        }
        if (radioButtonArr[1].isChecked()) {
            c18616.f60535 = 1;
            return true;
        }
        c18616.f60535 = 2;
        return true;
    }
}
