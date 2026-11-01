package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.TextInputLayoutHelper;

/* JADX INFO: renamed from: l.ۘۖ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y96B */
/* JADX INFO: loaded from: classes2.dex */
public final class C3640 extends AbstractC4674 {
    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo1960(C21422 c21422) {
        if (c21422.m47974("local") && !c21422.m47977()) {
            return c21422.m47968();
        }
        return false;
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(final C21422 c21422) {
        Main mainM47980 = c21422.m47980();
        View viewM30995 = mainM47980.m30995(R.layout.MT_Protector);
        final TextInputLayout textInputLayout = (TextInputLayout) viewM30995.findViewById(R.id.MT_Protector);
        final TextInputLayout textInputLayout2 = (TextInputLayout) viewM30995.findViewById(R.id.MT_Protector);
        C11150.m28071(textInputLayout);
        C11150.m28071(textInputLayout2);
        final View.OnClickListener endIconDelegateOnClickListener = TextInputLayoutHelper.getEndIconDelegateOnClickListener(textInputLayout);
        textInputLayout.setEndIconOnClickListener(new View.OnClickListener() { // from class: l.ۖۖ֨
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                endIconDelegateOnClickListener.onClick(view);
                boolean zHasPasswordTransformation = TextInputLayoutHelper.hasPasswordTransformation(textInputLayout);
                TextInputLayout textInputLayout3 = textInputLayout2;
                if (zHasPasswordTransformation) {
                    textInputLayout3.setVisibility(0);
                } else {
                    textInputLayout3.setVisibility(8);
                }
            }
        });
        final CheckBox checkBox = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        final C21986 c21986 = new C21986();
        c21986.m48809();
        checkBox.setText(mainM47980.getResources().getQuantityString(R.plurals.MT_Protector, c21422.m47975()));
        checkBox.setChecked(c21986.f71308);
        if (c21986.f71307) {
            TextInputLayoutHelper.setPasswordTransformation(textInputLayout, false);
            textInputLayout2.setVisibility(8);
        }
        C8067 c8067BuildDialog = mainM47980.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        C16737.m39290(textInputLayout.getEditText());
        dialogInterfaceC19356M21269.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.ۚۖ֨
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextInputLayout textInputLayout3 = textInputLayout;
                EditText editText = textInputLayout3.getEditText();
                C13638.requireNonNull(editText);
                TextInputLayout textInputLayout4 = textInputLayout2;
                EditText editText2 = textInputLayout4.getEditText();
                C13638.requireNonNull(editText2);
                String string = editText.getText().toString();
                if (string.isEmpty()) {
                    textInputLayout3.setError(C16737.m39288(R.string.MT_Protector));
                    editText.requestFocus();
                    return;
                }
                boolean z = textInputLayout4.getVisibility() == 8;
                if (!z && !string.equals(editText2.getText().toString())) {
                    textInputLayout4.setError(C16737.m39288(R.string.MT_Protector));
                    editText2.selectAll();
                    editText2.requestFocus();
                    return;
                }
                dialogInterfaceC19356M21269.dismiss();
                C21986 c21987 = c21986;
                boolean z2 = c21987.f71308;
                CheckBox checkBox2 = checkBox;
                if (z2 != checkBox2.isChecked() || c21987.f71307 != z) {
                    c21987.f71308 = checkBox2.isChecked();
                    c21987.f71307 = z;
                    c21987.m48810();
                }
                int i = C20725.f67443;
                C10142 c10142 = new C10142(C12814.class);
                C21422 c21423 = c21422;
                c10142.m25777(c21423);
                c10142.m25772(c21423.m47979());
                c10142.m25768("password", string);
                c10142.m25769("removeSource", checkBox2.isChecked());
                c10142.m25763();
            }
        });
    }
}
