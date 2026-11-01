package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.ܶ֡ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 251F */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractViewOnClickListenerC14879 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C9160 f48630;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final CheckBox f48631;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ActivityC3588 f48632;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final CheckBox f48633;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final TextView f48634;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC19356 f48635;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo22036();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo22037(Pattern pattern, String str);

    public AbstractViewOnClickListenerC14879(ActivityC3588 activityC3588) {
        this.f48632 = activityC3588;
        View viewM30995 = activityC3588.m30995(R.layout.MT_Protector);
        this.f48630 = (C9160) viewM30995.findViewById(R.id.MT_Protector);
        CheckBox checkBox = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        this.f48633 = checkBox;
        CheckBox checkBox2 = (CheckBox) viewM30995.findViewById(R.id.checkBox2);
        this.f48631 = checkBox2;
        this.f48634 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        checkBox.setChecked(ApplicationC0716.f2992.getBoolean("dex_search_match_case", false));
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۜ֡ۨ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f21728.f48630.m23518(z);
            }
        });
        checkBox2.setChecked(ApplicationC0716.f2992.getBoolean("dex_search_regex", false));
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(activityC3588);
        c8067.m21258(viewM30995);
        c8067.m21251(R.string.MT_Protector, null);
        c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f48635 = c8067.m21252();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35576(boolean z) {
        this.f48634.setText(z ? R.string.MT_Protector : R.string.MT_Protector);
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f48635;
        dialogInterfaceC19356.m44362();
        dialogInterfaceC19356.m44373().setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Pattern patternCompile;
        boolean zIsChecked = this.f48633.isChecked();
        boolean zIsChecked2 = this.f48631.isChecked();
        C9160 c9160 = this.f48630;
        String string = c9160.m23513().toString();
        String strM41459 = !zIsChecked2 ? C17874.m41459(string) : string;
        try {
            if (zIsChecked) {
                patternCompile = Pattern.compile(strM41459, 8);
            } else {
                patternCompile = Pattern.compile(strM41459, 74);
            }
            ApplicationC0716.f2992.edit().putBoolean("dex_search_match_case", zIsChecked).putBoolean("dex_search_regex", zIsChecked2).apply();
            c9160.m23519();
            this.f48635.dismiss();
            new C22640(this, patternCompile, string).m10243();
        } catch (PatternSyntaxException e) {
            C15829.m37613((CharSequence) e.getMessage());
            c9160.requestFocus();
        }
    }
}
