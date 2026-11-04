package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.umeng.analytics.pro.am;

/* JADX INFO: renamed from: l.ܽܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7PP */
/* JADX INFO: loaded from: classes5.dex */
public final class C17655 implements InterfaceC5723 {
    @Override // l.InterfaceC5723
    /* JADX INFO: renamed from: ۙ */
    public final void mo2466(C23255 c23255, TextView textView, Button button, C19147 c19147) {
        button.setTag(R.id.MT_Protector, c19147);
        mo2465(c23255, textView, button);
    }

    @Override // l.InterfaceC5723
    /* JADX INFO: renamed from: ۙ */
    public final void mo2465(C23255 c23255, TextView textView, Button button) {
        c23255.setVisibility(8);
        button.setVisibility(0);
        textView.setVisibility(8);
    }

    @Override // l.InterfaceC5723
    /* JADX INFO: renamed from: ۙ */
    public final void mo2464(final Button button, final ActivityC5440 activityC5440) {
        C16163 c16163 = (C16163) button.getTag(R.id.MT_Protector);
        JSONObject jSONObject = c16163 == null ? new JSONObject() : c16163.mo35301();
        View viewM40395 = activityC5440.m40395(R.layout.MT_Protector);
        final C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        final C23255 c23256 = (C23255) viewM40395.findViewById(R.id.editText2);
        final C1255 c1255 = (C1255) viewM40395.findViewById(R.id.switch1);
        final C1255 c1256 = (C1255) viewM40395.findViewById(R.id.switch2);
        final Spinner spinner = (Spinner) viewM40395.findViewById(R.id.spinner);
        final C23255 c23257 = (C23255) viewM40395.findViewById(R.id.editText3);
        spinner.setAdapter((SpinnerAdapter) new C3054(activityC5440, new String[]{activityC5440.getString(R.string.MT_Protector), activityC5440.getString(R.string.MT_Protector), activityC5440.getString(R.string.MT_Protector), activityC5440.getString(R.string.MT_Protector), activityC5440.getString(R.string.MT_Protector)}));
        c1256.setOnCheckedChangeListener(new C16768(c23255, c23256, 1));
        c23255.mo52335((CharSequence) jSONObject.getString(am.av));
        c23256.mo52335((CharSequence) jSONObject.getString("b"));
        c1255.setChecked(jSONObject.getBoolean(am.aF));
        int i = jSONObject.getInt("d");
        if (i < 0 || i > 4) {
            i = 0;
        }
        spinner.setSelection(i);
        int i2 = jSONObject.getInt("e");
        c23257.mo52335((CharSequence) (i2 <= 0 ? "" : String.valueOf(i2)));
        c1256.setChecked(jSONObject.getBoolean("f", true));
        C2361 c2361BuildDialog = activityC5440.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        final DialogInterfaceC8327 dialogInterfaceC8327M34866 = C14442.m34866(c2361BuildDialog, R.string.MT_Protector, null, R.string.MT_Protector, null);
        dialogInterfaceC8327M34866.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.ܺܳᩴ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C23255 c23258 = c23255;
                String string = c23258.m54021().toString();
                C23255 c23259 = c23256;
                String string2 = c23259.m54021().toString();
                boolean zIsChecked = c1255.isChecked();
                boolean zIsChecked2 = c1256.isChecked();
                int selectedItemPosition = spinner.getSelectedItemPosition();
                C23255 c232510 = c23257;
                String string3 = c232510.m54021().toString();
                if (string.isEmpty()) {
                    C22673.m51152(R.string.MT_Protector);
                    c23258.requestFocus();
                    return;
                }
                ActivityC5440 activityC5441 = activityC5440;
                if (zIsChecked2) {
                    try {
                        try {
                            C7974.m21762(C18415.m42925(string), string2);
                        } catch (Exception e) {
                            activityC5441.m40401(e, (DialogInterface.OnDismissListener) null);
                            c23259.m52289();
                            c23259.requestFocus();
                            return;
                        }
                    } catch (Exception e2) {
                        activityC5441.m40401(e2, (DialogInterface.OnDismissListener) null);
                        c23258.m52289();
                        c23258.requestFocus();
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
                    button.setTag(R.id.MT_Protector, new C16163(jSONObject2));
                    dialogInterfaceC8327M34866.dismiss();
                } catch (Exception e3) {
                    activityC5441.m40401(e3, (DialogInterface.OnDismissListener) null);
                    c232510.m52289();
                    c232510.requestFocus();
                }
            }
        });
    }

    @Override // l.InterfaceC5723
    /* JADX INFO: renamed from: ۙ */
    public final C19147 mo2463(int i, C23255 c23255, Button button) {
        C19147 c19147 = (C19147) button.getTag(R.id.MT_Protector);
        if (c19147 != null) {
            return c19147;
        }
        ActivityC5440.m16262(button);
        return null;
    }
}
