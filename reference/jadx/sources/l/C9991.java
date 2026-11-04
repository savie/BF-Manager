package l;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.mt.plugin.api.ui.PluginEditText;
import bin.mt.plus.R;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.ۢ۠ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y184 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9991 implements CompoundButton.OnCheckedChangeListener, TextWatcher {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C1626 f32097;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C22629 f32098;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public CheckBox f32099;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public TextView f32100;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public CheckBox f32101;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C23255 f32102;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C9991(View view, int i, int i2, int i3, int i4, int i5) {
        this.f32100 = (TextView) view.findViewById(i);
        this.f32097 = (C1626) view.findViewById(i2);
        C23255 c23255 = (C23255) view.findViewById(i3);
        this.f32102 = c23255;
        CheckBox checkBox = (CheckBox) view.findViewById(i4);
        this.f32099 = checkBox;
        CheckBox checkBox2 = (CheckBox) view.findViewById(i5);
        this.f32101 = checkBox2;
        checkBox.setOnCheckedChangeListener(this);
        c23255.m53899(this);
        onCheckedChanged(checkBox, checkBox.isChecked());
        if (checkBox2 != null) {
            checkBox2.setOnCheckedChangeListener(new C17287(0, c23255));
        }
        c23255.m53903((checkBox2 == null || checkBox2.isChecked()) ? PluginEditText.SYNTAX_REGEX : null, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25838(C22629 c22629) {
        this.f32098 = c22629;
        this.f32102.mo52335((CharSequence) c22629.f73227);
        this.f32099.setChecked(c22629.f73224);
        this.f32101.setChecked(c22629.f73225);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m25839() {
        this.f32098.f73227 = this.f32102.m54021().toString();
        this.f32098.f73224 = this.f32099.isChecked();
        this.f32098.f73225 = this.f32101.isChecked();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25836() {
        if (this.f32099.isChecked() || !this.f32101.isChecked()) {
            return;
        }
        try {
            Pattern.compile(this.f32102.m54021().toString());
        } catch (PatternSyntaxException e) {
            m25837(R.string.MT_Protector);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m25840() {
        return this.f32102.m54099() == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25837(int i) {
        C1626 c1626 = this.f32097;
        c1626.m5769(true);
        c1626.m5768(C21576.m49088(i));
        this.f32102.requestFocus();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C1626 c1626 = this.f32097;
        c1626.setEnabled(!z);
        this.f32102.setEnabled(!z);
        this.f32101.setEnabled(!z);
        c1626.setAlpha(z ? 0.6f : 1.0f);
        this.f32100.setAlpha(z ? 0.6f : 1.0f);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C1626 c1626 = this.f32097;
        if (c1626.m5765()) {
            c1626.m5769(false);
            c1626.m5768((CharSequence) null);
        }
    }
}
