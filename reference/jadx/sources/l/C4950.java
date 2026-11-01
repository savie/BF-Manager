package l;

import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۙ᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7YU */
/* JADX INFO: loaded from: classes3.dex */
public final class C4950 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Button f17283;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f17284;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC14883 f17285;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f17286;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f17287;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC13418 f17288;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f17289;

    public C4950(ActivityC13418 activityC13418, AbstractC14883 abstractC14883, TextView textView, CheckBox checkBox, CheckBox checkBox2, Button button, View view) {
        this.f17288 = activityC13418;
        this.f17285 = abstractC14883;
        this.f17287 = textView;
        this.f17286 = checkBox;
        this.f17284 = checkBox2;
        this.f17283 = button;
        this.f17289 = view;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10245(this.f17288);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        final CheckBox[] checkBoxArr;
        ActivityC13418 activityC13418 = this.f17288;
        this.f17285.mo20653(this.f17287, activityC13418.f44381.f5867);
        boolean zIsEmpty = TextUtils.isEmpty(activityC13418.f44381.f5871);
        CheckBox checkBox = this.f17286;
        CheckBox checkBox2 = this.f17284;
        if (zIsEmpty) {
            checkBoxArr = new CheckBox[]{checkBox};
            checkBox.setText(activityC13418.f44381.f5868);
            checkBox2.setVisibility(8);
        } else {
            checkBoxArr = new CheckBox[]{checkBox, checkBox2};
            checkBox.setText(activityC13418.f44381.f5868);
            checkBox2.setText(activityC13418.f44381.f5871);
        }
        final Button button = this.f17283;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.ۢۜۘ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                boolean z2 = false;
                for (CheckBox checkBox3 : checkBoxArr) {
                    if (!checkBox3.isChecked()) {
                        button.setEnabled(z2);
                    }
                }
                z2 = true;
                button.setEnabled(z2);
            }
        };
        for (CheckBox checkBox3 : checkBoxArr) {
            checkBox3.setOnCheckedChangeListener(onCheckedChangeListener);
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: l.ۗۜۘ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC13418.m32906(this.f11527.f17288);
            }
        });
        this.f17289.setVisibility(0);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f17288.m31003((Throwable) exc, true);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws C4987 {
        C1313 c1313M8314 = C2724.m8305(4212).m8314();
        if (!c1313M8314.m4686()) {
            throw new C4987(C4820.m13401(c1313M8314, R.string.MT_Protector));
        }
        this.f17288.f44381 = new C1422(c1313M8314.m4683(), c1313M8314.m4683(), c1313M8314.m4683(), c1313M8314.m4671(), c1313M8314.m4683(), c1313M8314.m4683(), c1313M8314.m4683());
    }
}
