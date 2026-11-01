package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۧۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 795C */
/* JADX INFO: loaded from: classes4.dex */
public final class C10967 extends AbstractC4674 {
    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo1960(C21422 c21422) {
        if (!c21422.m47974("local")) {
            return false;
        }
        C11545 c11545M47970 = c21422.m47970();
        if (c21422.m47974("local")) {
            return c21422.m47975() == 1 || !(!c11545M47970.m28814("local") || c11545M47970.m28794() || c21422.m47966().equals(c11545M47970.m28801()));
        }
        return false;
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(final C21422 c21422) {
        C11545 c11545M47970 = c21422.m47970();
        c21422.m47963("local");
        if (c21422.m47975() != 1) {
            c11545M47970.m28775("local");
            m12943(c21422, R.string.MT_Protector, AbstractC4674.m12940(c21422, R.string.MT_Protector));
            return;
        }
        AbstractC20745 abstractC20745Mo7989 = c21422.m47981().mo7989();
        View viewM30995 = c21422.m47980().m30995(R.layout.MT_Protector);
        final EditText editText = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        final EditText editText2 = (EditText) viewM30995.findViewById(R.id.editText2);
        final EditText editText3 = (EditText) viewM30995.findViewById(R.id.editText3);
        final TextInputLayout textInputLayout = (TextInputLayout) viewM30995.findViewById(R.id.MT_Protector);
        TextInputLayout textInputLayout2 = (TextInputLayout) viewM30995.findViewById(R.id.MT_Protector);
        C11150.m28071(textInputLayout);
        final C11545 c11545M47971 = c21422.m47970();
        if (!c11545M47971.m28814("local") || c11545M47971.m28794() || c21422.m47966().equals(c11545M47971.m28801())) {
            editText.setText(abstractC20745Mo7989.m46718() + "-link" + abstractC20745Mo7989.m46726());
            editText2.setText(c21422.m47959());
        } else {
            editText.setText(abstractC20745Mo7989.getName());
            editText2.setText(c11545M47971.m28798());
            textInputLayout2.setEndIconMode(-1);
            textInputLayout2.setEndIconDrawable(R.drawable.MT_Protector);
            textInputLayout2.setEndIconOnClickListener(new ViewOnClickListenerC4749(c21422, c11545M47971, editText2));
        }
        editText3.setText(abstractC20745Mo7989.mo40911());
        C8067 c8067BuildDialog = c21422.m47980().buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21258(viewM30995);
        final DialogInterfaceC19356 dialogInterfaceC19356M10334 = C3509.m10334(c8067BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        dialogInterfaceC19356M10334.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.۫ۨ֨
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogInterfaceC19356 dialogInterfaceC19356 = dialogInterfaceC19356M10334;
                C11545 c11545 = c11545M47971;
                C21422 c21423 = c21422;
                String string = editText.getText().toString();
                String string2 = editText2.getText().toString();
                String string3 = editText3.getText().toString();
                AbstractC20745 abstractC20745M15313 = C5553.m15313(C6730.m18162(string2, string), new String[0]);
                if (abstractC20745M15313.mo33975()) {
                    textInputLayout.setError(C16737.m39288(R.string.MT_Protector));
                    return;
                }
                try {
                    abstractC20745M15313.mo46720();
                    abstractC20745M15313.mo33977(string3);
                    dialogInterfaceC19356.dismiss();
                    if (c11545.m28814("local") && !c11545.m28794() && string2.equals(c11545.m28798())) {
                        c11545.m28763(abstractC20745M15313.getName());
                        c11545.m28830();
                    } else {
                        c21423.m47965().m28763(abstractC20745M15313.getName());
                        c21423.m47965().m28812(string2, true);
                    }
                    C21094.m47530();
                    dialogInterfaceC19356.dismiss();
                } catch (IOException e) {
                    c21423.m47980().m31002(e, (DialogInterface.OnDismissListener) null);
                }
            }
        });
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۚ */
    public final void mo6949(C21422 c21422) {
        C11545 c11545M47970 = c21422.m47970();
        c11545M47970.m28775("local");
        int i = C20725.f67443;
        C10142 c10142 = new C10142(C6027.class);
        c10142.m25772(c21422.m47979());
        c10142.m25780(c21422);
        c10142.m25768("targetPath", c11545M47970.m28798());
        c10142.m25763();
    }
}
