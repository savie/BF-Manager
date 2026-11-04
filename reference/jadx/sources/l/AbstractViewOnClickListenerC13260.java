package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.۫ܿۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 251F */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractViewOnClickListenerC13260 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final CheckBox f42361;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final CheckBox f42362;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ActivityC22957 f42363;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C17771 f42364;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final TextView f42365;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC8327 f42366;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo32808();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo32809(Pattern pattern, String str);

    public AbstractViewOnClickListenerC13260(ActivityC22957 activityC22957) {
        this.f42363 = activityC22957;
        View viewM40395 = activityC22957.m40395(R.layout.MT_Protector);
        this.f42364 = (C17771) viewM40395.findViewById(R.id.MT_Protector);
        CheckBox checkBox = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        this.f42361 = checkBox;
        CheckBox checkBox2 = (CheckBox) viewM40395.findViewById(R.id.checkBox2);
        this.f42362 = checkBox2;
        this.f42365 = (TextView) viewM40395.findViewById(R.id.title);
        checkBox.setChecked(ApplicationC17729.f58258.getBoolean("dex_search_match_case", false));
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ᩴܿۤ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f64181.f42364.m41606(z);
            }
        });
        checkBox2.setChecked(ApplicationC17729.f58258.getBoolean("dex_search_regex", false));
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(activityC22957);
        c2361.m8005(viewM40395);
        c2361.m8026(R.string.MT_Protector, null);
        c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f42366 = c2361.m7999();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32810(boolean z) {
        this.f42365.setText(z ? R.string.MT_Protector : R.string.MT_Protector);
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f42366;
        dialogInterfaceC8327.m22432();
        dialogInterfaceC8327.m22436().setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Pattern patternCompile;
        boolean zIsChecked = this.f42361.isChecked();
        boolean zIsChecked2 = this.f42362.isChecked();
        C17771 c17771 = this.f42364;
        String string = c17771.m41599().toString();
        String strM40798 = !zIsChecked2 ? C17370.m40798(string) : string;
        try {
            if (zIsChecked) {
                patternCompile = Pattern.compile(strM40798, 8);
            } else {
                patternCompile = Pattern.compile(strM40798, 74);
            }
            ApplicationC17729.f58258.edit().putBoolean("dex_search_match_case", zIsChecked).putBoolean("dex_search_regex", zIsChecked2).apply();
            c17771.m41603();
            this.f42366.dismiss();
            new C15497(this, patternCompile, string).m8197();
        } catch (PatternSyntaxException e) {
            C22673.m51154((CharSequence) e.getMessage());
            c17771.requestFocus();
        }
    }
}
