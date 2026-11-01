package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.json.JSONObject;
import bin.mt.plugin.api.ui.PluginEditText;
import bin.mt.plus.R;
import com.umeng.analytics.pro.am;

/* JADX INFO: renamed from: l.ܺۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7PP */
/* JADX INFO: loaded from: classes4.dex */
public final class C15641 implements InterfaceC7879 {
    @Override // l.InterfaceC7879
    /* JADX INFO: renamed from: ۙ */
    public final void mo1164(EditText editText, TextView textView, Button button, C13607 c13607) {
        button.setTag(R.id.MT_Protector, c13607);
        mo1163(editText, textView, button);
    }

    @Override // l.InterfaceC7879
    /* JADX INFO: renamed from: ۙ */
    public final void mo1163(EditText editText, TextView textView, Button button) {
        editText.setVisibility(8);
        button.setVisibility(0);
        textView.setVisibility(8);
    }

    @Override // l.InterfaceC7879
    /* JADX INFO: renamed from: ۙ */
    public final void mo1162(final Button button, final ActivityC19749 activityC19749) {
        C19874 c19874 = (C19874) button.getTag(R.id.MT_Protector);
        JSONObject jSONObject = c19874 == null ? new JSONObject() : c19874.mo33245();
        View viewM30995 = activityC19749.m30995(R.layout.MT_Protector);
        final C10948 c10948 = (C10948) viewM30995.findViewById(R.id.MT_Protector);
        final C10948 c10949 = (C10948) viewM30995.findViewById(R.id.editText2);
        final C12562 c12562 = (C12562) viewM30995.findViewById(R.id.switch1);
        final C12562 c12563 = (C12562) viewM30995.findViewById(R.id.switch2);
        final Spinner spinner = (Spinner) viewM30995.findViewById(R.id.spinner);
        final C10948 c109410 = (C10948) viewM30995.findViewById(R.id.editText3);
        spinner.setAdapter((SpinnerAdapter) new C0733(activityC19749, new String[]{activityC19749.getString(R.string.MT_Protector), activityC19749.getString(R.string.MT_Protector), activityC19749.getString(R.string.MT_Protector), activityC19749.getString(R.string.MT_Protector), activityC19749.getString(R.string.MT_Protector)}));
        c12563.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.۟ۖۚ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                c10948.m16857(z ? PluginEditText.SYNTAX_REGEX : null, true);
                c10949.m16857(z ? PluginEditText.SYNTAX_REGEX_REPLACEMENT : null, true);
            }
        });
        c10948.mo16989((CharSequence) jSONObject.getString(am.av));
        c10949.mo16989((CharSequence) jSONObject.getString("b"));
        c12562.setChecked(jSONObject.getBoolean(am.aF));
        int i = jSONObject.getInt("d");
        if (i < 0 || i > 4) {
            i = 0;
        }
        spinner.setSelection(i);
        int i2 = jSONObject.getInt("e");
        c109410.mo16989((CharSequence) (i2 <= 0 ? "" : String.valueOf(i2)));
        c12563.setChecked(jSONObject.getBoolean("f", true));
        C8067 c8067BuildDialog = activityC19749.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        final DialogInterfaceC19356 dialogInterfaceC19356M10334 = C3509.m10334(c8067BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        dialogInterfaceC19356M10334.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.᩷ۖۚ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C10948 c109411 = c10948;
                String string = c109411.m17000().toString();
                C10948 c109412 = c10949;
                String string2 = c109412.m17000().toString();
                boolean zIsChecked = c12562.isChecked();
                boolean zIsChecked2 = c12563.isChecked();
                int selectedItemPosition = spinner.getSelectedItemPosition();
                C10948 c109413 = c109410;
                String string3 = c109413.m17000().toString();
                if (string.isEmpty()) {
                    C15829.m37611(R.string.MT_Protector);
                    c109411.requestFocus();
                    return;
                }
                ActivityC19749 activityC197410 = activityC19749;
                if (zIsChecked2) {
                    try {
                        try {
                            C9751.m24733(C14690.m35219(string), string2);
                        } catch (Exception e) {
                            activityC197410.m31002(e, (DialogInterface.OnDismissListener) null);
                            c109412.m27486();
                            c109412.requestFocus();
                            return;
                        }
                    } catch (Exception e2) {
                        activityC197410.m31002(e2, (DialogInterface.OnDismissListener) null);
                        c109411.m27486();
                        c109411.requestFocus();
                        return;
                    }
                }
                try {
                    int i3 = string3.isEmpty() ? 0 : Integer.parseInt(string3);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(am.av, string);
                    jSONObject2.put("b", string2);
                    jSONObject2.put(am.aF, zIsChecked);
                    jSONObject2.put("d", selectedItemPosition);
                    jSONObject2.put("e", i3);
                    jSONObject2.put("f", zIsChecked2);
                    button.setTag(R.id.MT_Protector, new C19874(jSONObject2));
                    dialogInterfaceC19356M10334.dismiss();
                } catch (Exception e3) {
                    activityC197410.m31002(e3, (DialogInterface.OnDismissListener) null);
                    c109413.m27486();
                    c109413.requestFocus();
                }
            }
        });
    }

    @Override // l.InterfaceC7879
    /* JADX INFO: renamed from: ۙ */
    public final C13607 mo1161(int i, EditText editText, Button button) {
        C13607 c13607 = (C13607) button.getTag(R.id.MT_Protector);
        if (c13607 != null) {
            return c13607;
        }
        ActivityC19749.m44919(button);
        return null;
    }
}
