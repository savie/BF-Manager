package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: l.ۨۖ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: J951 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11403 extends AbstractC4674 {
    public C11403() {
        super(R.string.MT_Protector, -1);
    }

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
        final Main mainM47980 = c21422.m47980();
        View viewM30995 = mainM47980.m30995(R.layout.MT_Protector);
        ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        final TextInputLayout textInputLayout = (TextInputLayout) viewM30995.findViewById(R.id.MT_Protector);
        C11150.m28071(textInputLayout);
        viewM30995.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM30995.findViewById(R.id.MT_Protector).setVisibility(8);
        final CheckBox checkBox = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        final C21986 c21986 = new C21986();
        c21986.m48809();
        checkBox.setText(mainM47980.getResources().getQuantityString(R.plurals.MT_Protector, c21422.m47975()));
        checkBox.setChecked(c21986.f71306);
        C8067 c8067BuildDialog = mainM47980.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        final DialogInterfaceC19356 dialogInterfaceC19356M10334 = C3509.m10334(c8067BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        C16737.m39290(textInputLayout.getEditText());
        dialogInterfaceC19356M10334.m44373().setOnClickListener(new View.OnClickListener(this) { // from class: l.ܳۨ֨
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextInputLayout textInputLayout2 = textInputLayout;
                EditText editText = textInputLayout2.getEditText();
                C13638.requireNonNull(editText);
                String string = editText.getText().toString();
                if (string.isEmpty()) {
                    textInputLayout2.setError(C16737.m39288(R.string.MT_Protector));
                    editText.requestFocus();
                } else {
                    view.setEnabled(false);
                    new C9556(mainM47980, c21422, string, dialogInterfaceC19356M10334, c21986, checkBox, view, textInputLayout2, editText).m10243();
                }
            }
        });
    }
}
