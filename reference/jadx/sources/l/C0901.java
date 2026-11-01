package l;

import android.content.DialogInterface;
import android.text.InputFilter;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.֨ۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes2.dex */
public final class C0901 extends AbstractC4674 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final byte[] f3627 = {-17, -69, -65};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m3595(int i) {
        if (i == 0 || i == 1 || i == 2) {
            return i;
        }
        return 0;
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo1960(C21422 c21422) {
        return c21422.m47974("local") && !c21422.m47977() && c21422.m47975() == 1 && c21422.m47981().mo7985();
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(final C21422 c21422) {
        Main mainM47980 = c21422.m47980();
        final InterfaceC2557 interfaceC2557M47981 = c21422.m47981();
        View viewM30995 = mainM47980.m30995(R.layout.MT_Protector);
        TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        Spinner spinner = (Spinner) viewM30995.findViewById(R.id.spinner1);
        TextView textView3 = (TextView) viewM30995.findViewById(R.id.text1);
        final C10948 c10948 = (C10948) viewM30995.findViewById(R.id.MT_Protector);
        final Spinner spinner2 = (Spinner) viewM30995.findViewById(R.id.spinner2);
        TextView textView4 = (TextView) viewM30995.findViewById(R.id.textCharset);
        final EditText editText = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        View viewFindViewById = viewM30995.findViewById(R.id.MT_Protector);
        final C10948 c10949 = (C10948) viewM30995.findViewById(R.id.editText2);
        final CheckBox checkBox = (CheckBox) viewM30995.findViewById(R.id.checkBoxText1);
        TextView textView5 = (TextView) viewM30995.findViewById(R.id.textSeparatorPolicy);
        final Spinner spinner3 = (Spinner) viewM30995.findViewById(R.id.MT_Protector);
        final CheckBox checkBox2 = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        TextView textView6 = (TextView) viewM30995.findViewById(R.id.text2);
        final CheckBox checkBox3 = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        checkBox3.setText(mainM47980.getResources().getQuantityString(R.plurals.MT_Protector, 1));
        textView.setText(interfaceC2557M47981.getName());
        textView2.setText(C1791.m5873(interfaceC2557M47981.getSize()));
        c10949.m16930(2);
        c10949.mo16989((CharSequence) (interfaceC2557M47981.getName() + ".{D}"));
        spinner2.setAdapter((SpinnerAdapter) new C0733(mainM47980, Arrays.asList("B", "KB", "MB", "GB")));
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC21591(1, mainM47980, editText));
        final C0113 c0113 = new C0113();
        c0113.m1155();
        checkBox3.setChecked(c0113.f1090);
        spinner.setSelection(c0113.f1088);
        m3596(c0113, textView3, c10948, spinner2, textView4, editText, viewFindViewById, checkBox, textView5, spinner3, checkBox2);
        RunnableC8581 runnableC8581 = new RunnableC8581(mainM47980, interfaceC2557M47981.getSize(), spinner, c10948, spinner2, textView6);
        runnableC8581.run();
        spinner.setOnItemSelectedListener(new C20575(c0113, c10948, spinner2, editText, checkBox, spinner3, checkBox2, mainM47980, textView3, textView4, viewFindViewById, textView5, runnableC8581));
        c10948.m16853(new C15637(runnableC8581));
        spinner2.setOnItemSelectedListener(new C19870(runnableC8581));
        C8067 c8067BuildDialog = mainM47980.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        final DialogInterfaceC19356 dialogInterfaceC19356M10334 = C3509.m10334(c8067BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        dialogInterfaceC19356M10334.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.ۤۖ֨
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0901.m3594(c10949, c0113, c10948, spinner2, editText, checkBox, spinner3, checkBox2, checkBox3, dialogInterfaceC19356M10334, c21422, interfaceC2557M47981);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0055 A[Catch: Exception -> 0x00d3, PHI: r4
      0x0055: PHI (r4v8 java.lang.String) = (r4v7 java.lang.String), (r4v12 java.lang.String) binds: [B:45:0x008e, B:31:0x0052] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x00d3, blocks: (B:8:0x0010, B:10:0x0014, B:13:0x001a, B:14:0x001f, B:17:0x0023, B:20:0x0028, B:21:0x002d, B:24:0x0033, B:28:0x003c, B:30:0x004e, B:33:0x0055, B:34:0x0059, B:35:0x005e, B:38:0x0062, B:40:0x006e, B:42:0x0078, B:44:0x008a), top: B:70:0x0010 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3594(C10948 c10948, C0113 c0113, C10948 c10949, Spinner spinner, EditText editText, CheckBox checkBox, Spinner spinner2, CheckBox checkBox2, CheckBox checkBox3, DialogInterfaceC19356 dialogInterfaceC19356, C21422 c21422, InterfaceC2557 interfaceC2557) {
        String strTrim;
        if (c10948.m16842() == 0) {
            c10948.requestFocus();
            return;
        }
        try {
            m3597(c0113, c10949, spinner, editText, checkBox, spinner2, checkBox2);
            try {
                int i = c0113.f1088;
                if (i == 0) {
                    if (c0113.f1091 <= 0) {
                        throw new NumberFormatException();
                    }
                } else if (i == 1) {
                    if (c0113.f1094 <= 0) {
                        throw new NumberFormatException();
                    }
                } else if (i == 2) {
                    int i2 = c0113.f1097;
                    if (i2 < 1 || i2 > 999999999) {
                        throw new NumberFormatException();
                    }
                    strTrim = editText.getText().toString().trim();
                    if (!strTrim.isEmpty() && !"UTF-8-BOM".equalsIgnoreCase(strTrim)) {
                        Charset.forName(strTrim);
                    }
                } else if (i == 3) {
                    if (C22069.m49004(c0113.f1086).isEmpty()) {
                        C15829.m37611(R.string.MT_Protector);
                        c10949.requestFocus();
                        return;
                    } else {
                        strTrim = editText.getText().toString().trim();
                        if (!strTrim.isEmpty() && !"UTF-8-BOM".equalsIgnoreCase(strTrim)) {
                            Charset.forName(strTrim);
                        }
                    }
                }
                c0113.f1090 = checkBox3.isChecked();
                c0113.m1154();
                dialogInterfaceC19356.dismiss();
                String string = c10948.m17000().toString();
                if (!string.contains("{D}")) {
                    string = string.concat("{D}");
                }
                int i3 = C20725.f67443;
                C10142 c10142 = new C10142(C2935.class);
                c10142.m25777(c21422);
                c10142.m25768("file", interfaceC2557.getPath());
                c10142.m25767("arguments", c0113);
                c10142.m25768("pattern", string);
                c10142.m25763();
            } catch (Exception e) {
                if (e instanceof NumberFormatException) {
                    C15829.m37611(R.string.MT_Protector);
                } else {
                    if ((e instanceof IllegalCharsetNameException) || (e instanceof UnsupportedCharsetException)) {
                        C15829.m37613((CharSequence) e.toString());
                        editText.selectAll();
                        editText.requestFocus();
                        return;
                    }
                    C15829.m37613((CharSequence) e.toString());
                }
                c10949.m27486();
                c10949.requestFocus();
            }
        } catch (Exception e2) {
            if (e2 instanceof NumberFormatException) {
                C15829.m37611(R.string.MT_Protector);
            } else {
                C15829.m37613((CharSequence) e2.toString());
            }
            c10949.m27486();
            c10949.requestFocus();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m3596(C0113 c0113, TextView textView, C10948 c10948, Spinner spinner, TextView textView2, EditText editText, View view, CheckBox checkBox, TextView textView3, Spinner spinner2, CheckBox checkBox2) {
        int i = c0113.f1088;
        spinner.setVisibility(i == 0 ? 0 : 8);
        textView2.setVisibility(c0113.m1153() ? 0 : 8);
        editText.setVisibility(c0113.m1153() ? 0 : 8);
        view.setVisibility(c0113.m1153() ? 0 : 8);
        checkBox.setVisibility(i == 2 ? 0 : 8);
        textView3.setVisibility(i == 3 ? 0 : 8);
        spinner2.setVisibility(i == 3 ? 0 : 8);
        checkBox2.setVisibility(i == 3 ? 0 : 8);
        editText.setText(c0113.f1093);
        if (i == 0) {
            m3593(c10948);
            textView.setText(R.string.MT_Protector);
            c10948.mo16989((CharSequence) String.valueOf(c0113.f1091));
            spinner.setSelection(c0113.f1095);
        } else if (i == 1) {
            m3593(c10948);
            textView.setText(R.string.MT_Protector);
            c10948.mo16989((CharSequence) String.valueOf(c0113.f1094));
        } else if (i == 2) {
            m3593(c10948);
            textView.setText(R.string.MT_Protector);
            c10948.mo16989((CharSequence) String.valueOf(c0113.f1097));
            checkBox.setText(R.string.MT_Protector);
            checkBox.setChecked(c0113.f1092);
        } else {
            c10948.m27484(524289);
            c10948.m27473(new InputFilter[0]);
            c10948.m27476(true);
            textView.setText(R.string.MT_Protector);
            c10948.mo16989((CharSequence) c0113.f1086);
            int i2 = c0113.f1089;
            spinner2.setSelection((i2 == 0 || i2 == 1 || i2 == 2) ? i2 : 0);
            checkBox2.setText(R.string.MT_Protector);
            checkBox2.setChecked(c0113.f1087);
            c10948.mo17029(c10948.m16842());
        }
        if (i != 3) {
            checkBox2.setChecked(c0113.f1087);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3593(C10948 c10948) {
        c10948.m27484(2);
        c10948.m27473(new InputFilter[]{new InputFilter.LengthFilter(9)});
        c10948.m27476(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3592(C0113 c0113, C10948 c10948, Spinner spinner, EditText editText, CheckBox checkBox, Spinner spinner2, CheckBox checkBox2) {
        try {
            m3597(c0113, c10948, spinner, editText, checkBox, spinner2, checkBox2);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m3597(C0113 c0113, C10948 c10948, Spinner spinner, EditText editText, CheckBox checkBox, Spinner spinner2, CheckBox checkBox2) {
        int i = c0113.f1088;
        if (i == 0) {
            c0113.f1091 = Integer.parseInt(c10948.m17000().toString());
            c0113.f1095 = spinner.getSelectedItemPosition();
            return;
        }
        if (i == 1) {
            c0113.f1094 = Integer.parseInt(c10948.m17000().toString());
            return;
        }
        if (i == 2) {
            c0113.f1097 = Integer.parseInt(c10948.m17000().toString());
            c0113.f1092 = checkBox.isChecked();
            c0113.f1093 = editText.getText().toString();
        } else if (i == 3) {
            c0113.f1086 = c10948.m17000().toString();
            int selectedItemPosition = spinner2.getSelectedItemPosition();
            if (selectedItemPosition != 0 && selectedItemPosition != 1 && selectedItemPosition != 2) {
                selectedItemPosition = 0;
            }
            c0113.f1089 = selectedItemPosition;
            c0113.f1087 = checkBox2.isChecked();
            c0113.f1093 = editText.getText().toString();
        }
    }
}
