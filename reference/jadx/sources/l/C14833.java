package l;

import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ܰ᩶֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R7YU */
/* JADX INFO: loaded from: classes5.dex */
public final class C14833 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f48514;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f48515;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC0726 f48516;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Button f48517;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC10358 f48518;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f48519;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f48520;

    public C14833(ActivityC10358 activityC10358, AbstractC0726 abstractC0726, TextView textView, CheckBox checkBox, CheckBox checkBox2, Button button, View view) {
        this.f48518 = activityC10358;
        this.f48516 = abstractC0726;
        this.f48519 = textView;
        this.f48515 = checkBox;
        this.f48514 = checkBox2;
        this.f48517 = button;
        this.f48520 = view;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8190(this.f48518);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws C4866 {
        ReentrantLock reentrantLock = C11650.f37690;
        C13778 c13778M8688 = C2592.m8672(4212).m8688();
        if (!c13778M8688.m33676()) {
            throw new C4866(C1364.m5010(c13778M8688, R.string.MT_Protector));
        }
        this.f48518.f32977 = new C19309(c13778M8688.m33677(), c13778M8688.m33677(), c13778M8688.m33677(), c13778M8688.m33675(), c13778M8688.m33677(), c13778M8688.m33677(), c13778M8688.m33677());
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        final CheckBox[] checkBoxArr;
        ActivityC10358 activityC10358 = this.f48518;
        this.f48516.mo3052(this.f48519, activityC10358.f32977.f62398);
        boolean zIsEmpty = TextUtils.isEmpty(activityC10358.f32977.f62397);
        CheckBox checkBox = this.f48515;
        CheckBox checkBox2 = this.f48514;
        if (zIsEmpty) {
            checkBoxArr = new CheckBox[]{checkBox};
            checkBox.setText(activityC10358.f32977.f62392);
            checkBox2.setVisibility(8);
        } else {
            checkBoxArr = new CheckBox[]{checkBox, checkBox2};
            checkBox.setText(activityC10358.f32977.f62392);
            checkBox2.setText(activityC10358.f32977.f62397);
        }
        final Button button = this.f48517;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.ۘ᩶֫
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
        button.setOnClickListener(new ViewOnClickListenerC2289(1, this));
        this.f48520.setVisibility(0);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f48518.m40402((Throwable) exc, true);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
