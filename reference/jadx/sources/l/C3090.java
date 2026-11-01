package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۗ۟ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 097X */
/* JADX INFO: loaded from: classes2.dex */
public final class C3090 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9281(final C11545 c11545, final C3246 c3246) {
        Main mainM28824 = c11545.m28824();
        View viewM30995 = mainM28824.m30995(R.layout.MT_Protector);
        EditText editText = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText2 = (EditText) viewM30995.findViewById(R.id.editText2);
        ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        final CheckBox checkBox = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        final CheckBox checkBox2 = (CheckBox) viewM30995.findViewById(R.id.checkBox2);
        checkBox.setVisibility(0);
        checkBox2.setVisibility(0);
        checkBox.setText(R.string.MT_Protector);
        checkBox2.setText(R.string.MT_Protector);
        checkBox.setChecked(ApplicationC0716.f2992.getBoolean("aciad", true));
        checkBox2.setChecked(ActivityC11632.m29003());
        editText.setKeyListener(null);
        editText2.setKeyListener(null);
        C4388.m12238(c3246.f12072, c3246.f12075, editText, editText2);
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(mainM28824);
        c8067.m21258(viewM30995);
        c8067.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩻۟ۨ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C3246 c3247 = c3246;
                c3247.m9717();
                InterfaceC17314 interfaceC17314Edit = ApplicationC0716.f2992.edit();
                CheckBox checkBox3 = checkBox;
                interfaceC17314Edit.putBoolean("aciad", checkBox3.isChecked()).apply();
                CheckBox checkBox4 = checkBox2;
                boolean zIsChecked = checkBox4.isChecked();
                int i3 = ActivityC11632.f39058;
                C1679.m5597(ApplicationC0716.f2992, "axml_id_2_name", zIsChecked);
                AbstractC20745 abstractC20745 = c3247.f12071;
                AbstractC20745 abstractC20746 = c3247.f12074;
                boolean zIsChecked2 = checkBox4.isChecked();
                boolean zIsChecked3 = checkBox3.isChecked();
                AbstractC20745 abstractC20745M4734 = C1333.m4734(c11545, R.string.MT_Protector, "mtcr");
                int i4 = C20725.f67443;
                C10142 c10142 = new C10142(C9442.class);
                c10142.m25768("saveAsPath", abstractC20745M4734.mo33986());
                c10142.m25768("inputPath1", abstractC20745.mo33986());
                c10142.m25768("inputPath2", abstractC20746.mo33986());
                c10142.m25769("id2name", zIsChecked2);
                c10142.m25769("ignoreAddOrDel", zIsChecked3);
                c10142.m25763();
            }
        });
        c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067.m21269().m44361().setOnClickListener(new ViewOnClickListenerC14381(c3246, editText, editText2, 0));
    }
}
