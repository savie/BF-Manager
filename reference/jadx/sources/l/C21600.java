package l;

import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩶᩸۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AJ5 */
/* JADX INFO: loaded from: classes.dex */
public final class C21600 extends AbstractC21832 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final RadioButton[] f69002 = new RadioButton[3];

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int[] f69003;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Button f69004;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public TextView f69005;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f69006;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21578 f69007;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21578 f69008;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f69009;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18616 f69010;

    public C21600(C18616 c18616, String str, C21578 c21578, C21578 c21579, int i, int[] iArr) {
        this.f69010 = c18616;
        this.f69006 = str;
        this.f69008 = c21578;
        this.f69007 = c21579;
        this.f69009 = i;
        this.f69003 = iArr;
    }

    @Override // l.AbstractC21832
    /* JADX INFO: renamed from: ۙ */
    public final View mo2088(Main main) {
        View viewM40395 = main.m40395(R.layout.MT_Protector);
        ((TextView) viewM40395.findViewById(R.id.MT_Protector)).setText(this.f69006);
        C0695.m3002(viewM40395, this.f69008, this.f69007);
        RadioButton radioButton = (RadioButton) viewM40395.findViewById(R.id.MT_Protector);
        RadioButton[] radioButtonArr = this.f69002;
        radioButtonArr[0] = radioButton;
        radioButtonArr[1] = (RadioButton) viewM40395.findViewById(R.id.MT_Protector);
        radioButtonArr[2] = (RadioButton) viewM40395.findViewById(R.id.radioButton3);
        if (this.f69010.f60533) {
            radioButtonArr[0].setText(R.string.MT_Protector);
            radioButtonArr[2].setText(R.string.MT_Protector);
        }
        viewM40395.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM40395.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM40395.findViewById(R.id.checkBox2).setVisibility(8);
        this.f69005 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ܰ᩸۫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21600.m49131(this.f48638, view);
            }
        };
        int i = 0;
        while (i < radioButtonArr.length) {
            radioButtonArr[i].setChecked(i == this.f69009);
            radioButtonArr[i].setOnClickListener(onClickListener);
            i++;
        }
        m49130();
        return viewM40395;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49131(C21600 c21600, View view) {
        RadioButton[] radioButtonArr = c21600.f69002;
        int length = radioButtonArr.length;
        for (int i = 0; i < length; i++) {
            RadioButton radioButton = radioButtonArr[i];
            radioButton.setChecked(radioButton == view);
        }
        c21600.m49130();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m49130() {
        boolean zIsChecked = this.f69002[0].isChecked();
        this.f69005.setVisibility(zIsChecked ? 0 : 8);
        Button button = this.f69004;
        if (button != null) {
            button.setEnabled(!zIsChecked);
        }
    }

    @Override // l.AbstractC21832
    /* JADX INFO: renamed from: ۙ */
    public final void mo2090(DialogInterfaceC8327 dialogInterfaceC8327) {
        this.f69004 = dialogInterfaceC8327.m22436();
        m49130();
    }

    @Override // l.AbstractC21832
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2091(View view) {
        RadioButton[] radioButtonArr = this.f69002;
        if (radioButtonArr[0].isChecked()) {
            return false;
        }
        this.f69003[0] = radioButtonArr[1].isChecked() ? 1 : 2;
        return true;
    }
}
