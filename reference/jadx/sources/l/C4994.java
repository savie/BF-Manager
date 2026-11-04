package l;

import android.text.InputFilter;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۙܶ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes3.dex */
public final class C4994 extends AbstractC9843 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final byte[] f17354 = {-17, -69, -65};

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m15219(int i) {
        if (i == 0 || i == 1 || i == 2) {
            return i;
        }
        return 0;
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo2481(C12915 c12915) {
        return c12915.m31986("local") && !c12915.m31988() && c12915.m31981() == 1 && c12915.m31989().mo8090();
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(final C12915 c12915) {
        final Main mainM31979 = c12915.m31979();
        final InterfaceC2386 interfaceC2386M31989 = c12915.m31989();
        View viewM40395 = mainM31979.m40395(R.layout.MT_Protector);
        TextView textView = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        Spinner spinner = (Spinner) viewM40395.findViewById(R.id.spinner1);
        TextView textView3 = (TextView) viewM40395.findViewById(R.id.text1);
        final C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        final Spinner spinner2 = (Spinner) viewM40395.findViewById(R.id.spinner2);
        TextView textView4 = (TextView) viewM40395.findViewById(R.id.textCharset);
        final C23255 c23256 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C1626 c1626 = (C1626) viewM40395.findViewById(R.id.MT_Protector);
        final C23255 c23257 = (C23255) viewM40395.findViewById(R.id.editText2);
        final CheckBox checkBox = (CheckBox) viewM40395.findViewById(R.id.checkBoxText1);
        TextView textView5 = (TextView) viewM40395.findViewById(R.id.textSeparatorPolicy);
        final Spinner spinner3 = (Spinner) viewM40395.findViewById(R.id.MT_Protector);
        final CheckBox checkBox2 = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        TextView textView6 = (TextView) viewM40395.findViewById(R.id.text2);
        final CheckBox checkBox3 = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        checkBox3.setText(mainM31979.getResources().getQuantityString(R.plurals.MT_Protector, 1));
        textView.setText(interfaceC2386M31989.getName());
        textView2.setText(C8311.m22393(interfaceC2386M31989.getSize()));
        c23257.mo52291(2);
        c23257.mo52335((CharSequence) (interfaceC2386M31989.getName() + ".{D}"));
        spinner2.setAdapter((SpinnerAdapter) new C3054(mainM31979, Arrays.asList("B", "KB", "MB", "GB")));
        c1626.m5759(new View.OnClickListener() { // from class: l.ܶܽ۫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList(C2448.f7865 + 1);
                Main main = mainM31979;
                arrayList.add(main.getString(R.string.MT_Protector));
                C23255 c23258 = c23256;
                int size = c23258.m54099() == 0 ? 0 : -1;
                String string = c23258.m54021().toString();
                for (int i = 0; i < C2448.f7865; i++) {
                    String strM8274 = C2448.m8274(i);
                    if (strM8274.equalsIgnoreCase(string)) {
                        size = arrayList.size();
                    }
                    arrayList.add(strM8274);
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                C2361 c2361BuildDialog = main.buildDialog();
                c2361BuildDialog.m8021(R.string.MT_Protector);
                c2361BuildDialog.m8013(strArr, size, new DialogInterfaceOnClickListenerC24079(1, c23258, strArr));
                c2361BuildDialog.m8026(R.string.MT_Protector, null);
                c2361BuildDialog.m8016();
            }
        });
        final C12495 c12495 = new C12495();
        c12495.m31035();
        checkBox3.setChecked(c12495.f40116);
        spinner.setSelection(c12495.f40122);
        m15220(c12495, textView3, c23255, spinner2, textView4, c23256, c1626, checkBox, textView5, spinner3, checkBox2);
        RunnableC16970 runnableC16970 = new RunnableC16970(mainM31979, interfaceC2386M31989.getSize(), spinner, c23255, spinner2, textView6);
        runnableC16970.run();
        spinner.setOnItemSelectedListener(new C23684(c12495, c23255, spinner2, c23256, checkBox, spinner3, checkBox2, mainM31979, textView3, textView4, c1626, textView5, runnableC16970));
        c23255.m53899(new C3546(runnableC16970));
        spinner2.setOnItemSelectedListener(new C20700(runnableC16970));
        C2361 c2361BuildDialog = mainM31979.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        final DialogInterfaceC8327 dialogInterfaceC8327M34866 = C14442.m34866(c2361BuildDialog, R.string.MT_Protector, null, R.string.MT_Protector, null);
        dialogInterfaceC8327M34866.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.ܽܽ۫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4994.m15217(c23257, c12495, c23255, spinner2, c23256, checkBox, spinner3, checkBox2, checkBox3, dialogInterfaceC8327M34866, c12915, interfaceC2386M31989);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0055 A[Catch: Exception -> 0x00d3, PHI: r4
      0x0055: PHI (r4v8 java.lang.String) = (r4v7 java.lang.String), (r4v12 java.lang.String) binds: [B:45:0x008e, B:31:0x0052] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x00d3, blocks: (B:8:0x0010, B:10:0x0014, B:13:0x001a, B:14:0x001f, B:17:0x0023, B:20:0x0028, B:21:0x002d, B:24:0x0033, B:28:0x003c, B:30:0x004e, B:33:0x0055, B:34:0x0059, B:35:0x005e, B:38:0x0062, B:40:0x006e, B:42:0x0078, B:44:0x008a), top: B:70:0x0010 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15217(C23255 c23255, C12495 c12495, C23255 c23256, Spinner spinner, C23255 c23257, CheckBox checkBox, Spinner spinner2, CheckBox checkBox2, CheckBox checkBox3, DialogInterfaceC8327 dialogInterfaceC8327, C12915 c12915, InterfaceC2386 interfaceC2386) {
        String strTrim;
        if (c23255.m54099() == 0) {
            c23255.requestFocus();
            return;
        }
        try {
            m15221(c12495, c23256, spinner, c23257, checkBox, spinner2, checkBox2);
            try {
                int i = c12495.f40122;
                if (i == 0) {
                    if (c12495.f40119 <= 0) {
                        throw new NumberFormatException();
                    }
                } else if (i == 1) {
                    if (c12495.f40115 <= 0) {
                        throw new NumberFormatException();
                    }
                } else if (i == 2) {
                    int i2 = c12495.f40121;
                    if (i2 < 1 || i2 > 999999999) {
                        throw new NumberFormatException();
                    }
                    strTrim = c23257.m54021().toString().trim();
                    if (!strTrim.isEmpty() && !"UTF-8-BOM".equalsIgnoreCase(strTrim)) {
                        Charset.forName(strTrim);
                    }
                } else if (i == 3) {
                    if (C13986.m34073(c12495.f40120).isEmpty()) {
                        C22673.m51152(R.string.MT_Protector);
                        c23256.requestFocus();
                        return;
                    } else {
                        strTrim = c23257.m54021().toString().trim();
                        if (!strTrim.isEmpty() && !"UTF-8-BOM".equalsIgnoreCase(strTrim)) {
                            Charset.forName(strTrim);
                        }
                    }
                }
                c12495.f40116 = checkBox3.isChecked();
                c12495.m31036();
                dialogInterfaceC8327.dismiss();
                String string = c23255.m54021().toString();
                if (!string.contains("{D}")) {
                    string = string.concat("{D}");
                }
                int i3 = C13678.f43415;
                C8458 c8458 = new C8458(C10257.class);
                c8458.m22728(c12915);
                c8458.m22719("file", interfaceC2386.getPath());
                c8458.m22718("arguments", c12495);
                c8458.m22719("pattern", string);
                c8458.m22714();
            } catch (Exception e) {
                if (e instanceof NumberFormatException) {
                    C22673.m51152(R.string.MT_Protector);
                } else {
                    if ((e instanceof IllegalCharsetNameException) || (e instanceof UnsupportedCharsetException)) {
                        C22673.m51154((CharSequence) e.toString());
                        c23257.m52289();
                        c23257.requestFocus();
                        return;
                    }
                    C22673.m51154((CharSequence) e.toString());
                }
                c23256.m52289();
                c23256.requestFocus();
            }
        } catch (Exception e2) {
            if (e2 instanceof NumberFormatException) {
                C22673.m51152(R.string.MT_Protector);
            } else {
                C22673.m51154((CharSequence) e2.toString());
            }
            c23256.m52289();
            c23256.requestFocus();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m15220(C12495 c12495, TextView textView, C23255 c23255, Spinner spinner, TextView textView2, C23255 c23256, C1626 c1626, CheckBox checkBox, TextView textView3, Spinner spinner2, CheckBox checkBox2) {
        int i = c12495.f40122;
        spinner.setVisibility(i == 0 ? 0 : 8);
        int i2 = c12495.f40122;
        textView2.setVisibility((i2 == 2 || i2 == 3) ? 0 : 8);
        int i3 = c12495.f40122;
        c1626.setVisibility((i3 == 2 || i3 == 3) ? 0 : 8);
        checkBox.setVisibility(i == 2 ? 0 : 8);
        textView3.setVisibility(i == 3 ? 0 : 8);
        spinner2.setVisibility(i == 3 ? 0 : 8);
        checkBox2.setVisibility(i == 3 ? 0 : 8);
        c23256.mo52335((CharSequence) c12495.f40124);
        if (i == 0) {
            m15216(c23255);
            textView.setText(R.string.MT_Protector);
            c23255.mo52335((CharSequence) String.valueOf(c12495.f40119));
            spinner.setSelection(c12495.f40126);
        } else if (i == 1) {
            m15216(c23255);
            textView.setText(R.string.MT_Protector);
            c23255.mo52335((CharSequence) String.valueOf(c12495.f40115));
        } else if (i == 2) {
            m15216(c23255);
            textView.setText(R.string.MT_Protector);
            c23255.mo52335((CharSequence) String.valueOf(c12495.f40121));
            checkBox.setText(R.string.MT_Protector);
            checkBox.setChecked(c12495.f40117);
        } else {
            c23255.m52326(524289);
            c23255.m52304(new InputFilter[0]);
            c23255.m52296(true);
            textView.setText(R.string.MT_Protector);
            c23255.mo52335((CharSequence) c12495.f40120);
            int i4 = c12495.f40118;
            spinner2.setSelection((i4 == 0 || i4 == 1 || i4 == 2) ? i4 : 0);
            checkBox2.setText(R.string.MT_Protector);
            checkBox2.setChecked(c12495.f40123);
            c23255.mo52339(c23255.m54099());
        }
        if (i != 3) {
            checkBox2.setChecked(c12495.f40123);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15216(C23255 c23255) {
        c23255.m52326(2);
        c23255.m52304(new InputFilter[]{new InputFilter.LengthFilter(9)});
        c23255.m52296(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15215(C12495 c12495, C23255 c23255, Spinner spinner, C23255 c23256, CheckBox checkBox, Spinner spinner2, CheckBox checkBox2) {
        try {
            m15221(c12495, c23255, spinner, c23256, checkBox, spinner2, checkBox2);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m15221(C12495 c12495, C23255 c23255, Spinner spinner, C23255 c23256, CheckBox checkBox, Spinner spinner2, CheckBox checkBox2) {
        int i = c12495.f40122;
        if (i == 0) {
            c12495.f40119 = Integer.parseInt(c23255.m54021().toString());
            c12495.f40126 = spinner.getSelectedItemPosition();
            return;
        }
        if (i == 1) {
            c12495.f40115 = Integer.parseInt(c23255.m54021().toString());
            return;
        }
        if (i == 2) {
            c12495.f40121 = Integer.parseInt(c23255.m54021().toString());
            c12495.f40117 = checkBox.isChecked();
            c12495.f40124 = c23256.m54021().toString();
        } else if (i == 3) {
            c12495.f40120 = c23255.m54021().toString();
            int selectedItemPosition = spinner2.getSelectedItemPosition();
            if (selectedItemPosition != 0 && selectedItemPosition != 1 && selectedItemPosition != 2) {
                selectedItemPosition = 0;
            }
            c12495.f40118 = selectedItemPosition;
            c12495.f40123 = checkBox2.isChecked();
            c12495.f40124 = c23256.m54021().toString();
        }
    }
}
