package l;

import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֡ۧ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AJ5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0379 extends AbstractC7713 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final RadioButton[] f1852 = new RadioButton[3];

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public TextView f1853;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int[] f1854;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Button f1855;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20321 f1856;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f1857;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1858;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20321 f1859;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16608 f1860;

    public C0379(C16608 c16608, String str, C20321 c20321, C20321 c20322, int i, int[] iArr) {
        this.f1860 = c16608;
        this.f1857 = str;
        this.f1859 = c20321;
        this.f1856 = c20322;
        this.f1858 = i;
        this.f1854 = iArr;
    }

    @Override // l.AbstractC7713
    /* JADX INFO: renamed from: ۙ */
    public final View mo2074(Main main) {
        View viewM30995 = main.m30995(R.layout.MT_Protector);
        ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(this.f1857);
        C16793.m39443(viewM30995, this.f1859, this.f1856);
        RadioButton radioButton = (RadioButton) viewM30995.findViewById(R.id.MT_Protector);
        RadioButton[] radioButtonArr = this.f1852;
        radioButtonArr[0] = radioButton;
        radioButtonArr[1] = (RadioButton) viewM30995.findViewById(R.id.MT_Protector);
        radioButtonArr[2] = (RadioButton) viewM30995.findViewById(R.id.radioButton3);
        if (this.f1860.f53298) {
            radioButtonArr[0].setText(R.string.MT_Protector);
            radioButtonArr[2].setText(R.string.MT_Protector);
        }
        viewM30995.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM30995.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM30995.findViewById(R.id.checkBox2).setVisibility(8);
        this.f1853 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.᩶ۧ᩹
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0379.m2114(this.f65370, view);
            }
        };
        int i = 0;
        while (i < radioButtonArr.length) {
            radioButtonArr[i].setChecked(i == this.f1858);
            radioButtonArr[i].setOnClickListener(onClickListener);
            i++;
        }
        m2113();
        return viewM30995;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m2114(C0379 c0379, View view) {
        RadioButton[] radioButtonArr = c0379.f1852;
        int length = radioButtonArr.length;
        for (int i = 0; i < length; i++) {
            RadioButton radioButton = radioButtonArr[i];
            radioButton.setChecked(radioButton == view);
        }
        c0379.m2113();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2113() {
        boolean zIsChecked = this.f1852[0].isChecked();
        this.f1853.setVisibility(zIsChecked ? 0 : 8);
        Button button = this.f1855;
        if (button != null) {
            button.setEnabled(!zIsChecked);
        }
    }

    @Override // l.AbstractC7713
    /* JADX INFO: renamed from: ۙ */
    public final void mo2076(DialogInterfaceC19356 dialogInterfaceC19356) {
        this.f1855 = dialogInterfaceC19356.m44373();
        m2113();
    }

    @Override // l.AbstractC7713
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2077(View view) {
        RadioButton[] radioButtonArr = this.f1852;
        if (radioButtonArr[0].isChecked()) {
            return false;
        }
        this.f1854[0] = radioButtonArr[1].isChecked() ? 1 : 2;
        return true;
    }
}
