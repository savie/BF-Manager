package l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤ֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44R4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9976 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f34101 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25241(final C13026 c13026) {
        Context context = c13026.getContext();
        View viewInflate = View.inflate(context, R.layout.MT_Protector, null);
        final EditText editText = (EditText) viewInflate.findViewById(R.id.MT_Protector);
        StringBuilder sb = new StringBuilder("0…");
        sb.append(Integer.toString(c13026.f43452.m33442(), f34101 ? 16 : 10).toUpperCase());
        editText.setHint(sb.toString());
        final CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.MT_Protector);
        checkBox.setChecked(f34101);
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(context);
        c8067.m21258(viewInflate);
        c8067.m21251(R.string.MT_Protector, null);
        c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067.m21269();
        C16737.m39290(editText);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.᩵֫ۚ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C9976.m25240(editText, c13026, z);
            }
        });
        dialogInterfaceC19356M21269.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.ۡ֫ۚ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                try {
                    int i2 = Integer.parseInt(editText.getText().toString(), checkBox.isChecked() ? 16 : 10);
                    if (i2 >= 0) {
                        C13026 c13027 = c13026;
                        if (i2 <= c13027.f43452.m33442()) {
                            c13027.m32241(i2);
                            dialogInterfaceC19356M21269.dismiss();
                            return;
                        }
                    }
                    C15829.m37617(R.string.MT_Protector, 0).m37622();
                } catch (NumberFormatException unused) {
                    C15829.m37617(R.string.MT_Protector, 0).m37622();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25240(EditText editText, C13026 c13026, boolean z) {
        f34101 = z;
        try {
            editText.setText(Integer.toString(Integer.parseInt(editText.getText().toString(), z ? 10 : 16), z ? 16 : 10).toUpperCase());
            editText.setSelection(editText.length());
        } catch (NumberFormatException unused) {
        }
        StringBuilder sb = new StringBuilder("0…");
        sb.append(Integer.toString(c13026.f43452.m33442(), z ? 16 : 10).toUpperCase());
        editText.setHint(sb.toString());
    }
}
