package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;
import java.util.Calendar;

/* JADX INFO: renamed from: l.ۡ۬᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: C76R */
/* JADX INFO: loaded from: classes3.dex */
public final class C8909 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 f30559;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18786 f30560;

    public C8909(AbstractActivityC12483 abstractActivityC12483, InterfaceC18786 interfaceC18786) {
        this.f30559 = abstractActivityC12483;
        this.f30560 = interfaceC18786;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23183() {
        C8067 c8067BuildDialog = this.f30559.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21255(R.array.MT_Protector, new DialogInterfaceOnClickListenerC13363(1, this));
        c8067BuildDialog.m21269();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23175(final C8909 c8909, int i) {
        if (i >= 0 && i <= 3) {
            c8909.f30560.mo39922(i);
            return;
        }
        if (i == 4) {
            String strM23172 = m23172(ApplicationC0716.f2992.getString("smint", null));
            String strM23173 = m23172(ApplicationC0716.f2992.getString("smaxt", null));
            if (strM23172 == null) {
                Calendar calendar = Calendar.getInstance();
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                strM23172 = C5319.m14739(calendar.getTimeInMillis());
            }
            m23179(c8909.f30559, R.string.MT_Protector, strM23172, strM23173, true, new C7789(c8909));
            return;
        }
        if (i == 5) {
            m23178(c8909.f30559, R.string.MT_Protector, ApplicationC0716.f2992.getString("smins", null), ApplicationC0716.f2992.getString("smaxs", null), ApplicationC0716.f2992.getInt("ssun", 1), true, new C9285(c8909));
            return;
        }
        if (i != 6) {
            throw new IllegalArgumentException();
        }
        AbstractActivityC12483 abstractActivityC12483 = c8909.f30559;
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        final C9160 c9160 = (C9160) viewM30995.findViewById(R.id.MT_Protector);
        final CheckBox checkBox = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        RadioButton[] radioButtonArr = {(RadioButton) viewM30995.findViewById(R.id.MT_Protector), (RadioButton) viewM30995.findViewById(R.id.MT_Protector), (RadioButton) viewM30995.findViewById(R.id.MT_Protector), (RadioButton) viewM30995.findViewById(R.id.radioButton3)};
        checkBox.setChecked(ApplicationC0716.f2992.getBoolean("skc", false));
        final int i2 = ApplicationC0716.f2992.getInt("skt", 0);
        final int[] iArr = {i2};
        if (i2 < 0 || i2 >= 4) {
            iArr[0] = 0;
        }
        ViewOnClickListenerC22648 viewOnClickListenerC22648 = new ViewOnClickListenerC22648(1, radioButtonArr, iArr);
        radioButtonArr[iArr[0]].setChecked(true);
        for (int i3 = 0; i3 < 4; i3++) {
            radioButtonArr[i3].setOnClickListener(viewOnClickListenerC22648);
        }
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۬۬᩹
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C8909.m23177(this.f43748, c9160, iArr, i2, checkBox);
            }
        });
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269();
        C16737.m39290(c9160.m23516());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long[] m23180(int i, long j) {
        long timeInMillis;
        long timeInMillis2;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        if (i == 0) {
            timeInMillis = calendar.getTimeInMillis();
            calendar.add(5, 1);
            timeInMillis2 = calendar.getTimeInMillis();
        } else if (i == 1) {
            calendar.set(7, calendar.getFirstDayOfWeek());
            long timeInMillis3 = calendar.getTimeInMillis();
            calendar.add(5, 7);
            timeInMillis2 = calendar.getTimeInMillis();
            timeInMillis = timeInMillis3;
        } else if (i == 2) {
            calendar.set(5, 1);
            timeInMillis = calendar.getTimeInMillis();
            calendar.add(2, 1);
            timeInMillis2 = calendar.getTimeInMillis();
        } else if (i == 3) {
            calendar.set(6, 1);
            timeInMillis = calendar.getTimeInMillis();
            calendar.add(1, 1);
            timeInMillis2 = calendar.getTimeInMillis();
        } else {
            throw new IllegalArgumentException();
        }
        return new long[]{timeInMillis, timeInMillis2};
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23182(C8909 c8909, long j, long j2) {
        InterfaceC18786 interfaceC18786 = c8909.f30560;
        if (j == -1) {
            j = 0;
        }
        if (j2 == -1) {
            j2 = C17492.FOREVER_NS;
        }
        interfaceC18786.mo39925(j, j2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23179(AbstractActivityC12483 abstractActivityC12483, int i, String str, String str2, final boolean z, final InterfaceC19492 interfaceC19492) {
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(i);
        final TextInputLayout textInputLayout = (TextInputLayout) viewM30995.findViewById(R.id.MT_Protector);
        final TextInputLayout textInputLayout2 = (TextInputLayout) viewM30995.findViewById(R.id.MT_Protector);
        final EditText editText = textInputLayout.getEditText();
        C13638.requireNonNull(editText);
        final EditText editText2 = textInputLayout2.getEditText();
        C13638.requireNonNull(editText2);
        editText.setText(str);
        editText2.setText(str2);
        editText.addTextChangedListener(new C4408(false));
        editText2.addTextChangedListener(new C4408(false));
        editText.addTextChangedListener(new C18080(textInputLayout));
        editText2.addTextChangedListener(new C18080(textInputLayout2));
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        final DialogInterfaceC19356 dialogInterfaceC19356M52499 = C23821.m52499(c8067BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        dialogInterfaceC19356M52499.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.ۘ۬᩹
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditText editText3 = editText;
                String strTrim = editText3.getText().toString().trim();
                EditText editText4 = editText2;
                String strTrim2 = editText4.getText().toString().trim();
                boolean zIsEmpty = strTrim.isEmpty();
                TextInputLayout textInputLayout3 = textInputLayout;
                if (zIsEmpty && strTrim2.isEmpty()) {
                    editText3.requestFocus();
                    textInputLayout3.setError(C16737.m39288(R.string.MT_Protector));
                    return;
                }
                long jM23181 = strTrim.isEmpty() ? -1L : C8909.m23181(strTrim);
                if (!strTrim.isEmpty() && jM23181 < 0) {
                    editText3.requestFocus();
                    textInputLayout3.setError(C16737.m39288(R.string.MT_Protector));
                    return;
                }
                long jM23182 = strTrim2.isEmpty() ? -1L : C8909.m23181(strTrim2);
                if (!strTrim2.isEmpty() && jM23182 < 0) {
                    editText4.requestFocus();
                    textInputLayout2.setError(C16737.m39288(R.string.MT_Protector));
                } else if (jM23181 != -1 && jM23182 != -1 && jM23181 >= jM23182) {
                    editText3.requestFocus();
                    textInputLayout3.setError(C16737.m39288(R.string.MT_Protector));
                } else {
                    if (z) {
                        ApplicationC0716.f2992.edit().putString("smint", strTrim).putString("smaxt", strTrim2).apply();
                    }
                    interfaceC19492.mo20462(jM23181, jM23182);
                    dialogInterfaceC19356M52499.dismiss();
                }
            }
        });
        dialogInterfaceC19356M52499.m44361().setOnClickListener(new ViewOnClickListenerC11877(editText2, editText));
        C16737.m39290(editText);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m23172(String str) {
        if (str == null || str.isEmpty() || m23181(str) >= 0) {
            return str;
        }
        long jM14743 = C5319.m14743(str);
        if (jM14743 < 0 || !C5319.m14744(jM14743).equals(str)) {
            return null;
        }
        return C5319.m14739(jM14743);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static long m23181(String str) {
        long jM14737 = C5319.m14737(str);
        if (jM14737 < 0 || !C5319.m14739(jM14737).equals(str)) {
            return -1L;
        }
        return jM14737;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23174(Main main, long j, long j2, C14415 c14415) {
        m23179(main, R.string.MT_Protector, j == -1 ? "" : C5319.m14739(j), j2 != -1 ? C5319.m14739(j2) : "", false, c14415);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23176(C8909 c8909, long j, long j2) {
        InterfaceC18786 interfaceC18786 = c8909.f30560;
        if (j == -1) {
            j = 0;
        }
        if (j2 == -1) {
            j2 = C17492.FOREVER_NS;
        }
        interfaceC18786.mo39923(j, j2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23178(AbstractActivityC12483 abstractActivityC12483, int i, String str, String str2, int i2, final boolean z, final InterfaceC8203 interfaceC8203) {
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(i);
        final EditText editText = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        final EditText editText2 = (EditText) viewM30995.findViewById(R.id.editText2);
        final Spinner spinner = (Spinner) viewM30995.findViewById(R.id.spinner);
        spinner.setAdapter((SpinnerAdapter) new C21608(abstractActivityC12483, Arrays.asList("B", "KB", "MB", "GB")));
        editText.setText(str);
        editText2.setText(str2);
        spinner.setSelection(i2);
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        final DialogInterfaceC19356 dialogInterfaceC19356M10334 = C3509.m10334(c8067BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        dialogInterfaceC19356M10334.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.֨۬᩹
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long j;
                long j2;
                long j3;
                long j4;
                EditText editText3 = editText;
                String strTrim = editText3.getText().toString().trim();
                EditText editText4 = editText2;
                String strTrim2 = editText4.getText().toString().trim();
                int selectedItemPosition = spinner.getSelectedItemPosition();
                long j5 = 1 << (selectedItemPosition * 10);
                if (strTrim.isEmpty() && strTrim2.isEmpty()) {
                    C15829.m37611(R.string.MT_Protector);
                    return;
                }
                if (strTrim.isEmpty()) {
                    j2 = -1;
                } else {
                    try {
                        j = Long.parseLong(strTrim);
                    } catch (NumberFormatException unused) {
                        j = -1;
                    }
                    j2 = j * j5;
                }
                if (!strTrim.isEmpty() && j2 < 0) {
                    editText3.requestFocus();
                    C15829.m37611(R.string.MT_Protector);
                    return;
                }
                if (strTrim2.isEmpty()) {
                    j4 = -1;
                } else {
                    try {
                        j3 = Long.parseLong(strTrim2);
                    } catch (NumberFormatException unused2) {
                        j3 = -1;
                    }
                    j4 = j3 * j5;
                }
                if (!strTrim2.isEmpty() && j4 < 0) {
                    editText4.requestFocus();
                    C15829.m37611(R.string.MT_Protector);
                    return;
                }
                if ((j2 != -1 ? j2 : 0L) >= (j4 == -1 ? C17492.FOREVER_NS : j4)) {
                    C15829.m37611(R.string.MT_Protector);
                    return;
                }
                if (z) {
                    ApplicationC0716.f2992.edit().putString("smins", strTrim).putString("smaxs", strTrim2).mo4065(selectedItemPosition, "ssun").apply();
                }
                interfaceC8203.mo21492(j2, j4);
                dialogInterfaceC19356M10334.dismiss();
            }
        });
        C16737.m39290(editText);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23173(Main main, long j, long j2, C9372 c9372) {
        int i;
        if (j != -1 || j2 != -1) {
            int i2 = 3;
            while (true) {
                if (i2 <= 0) {
                    i = 0;
                    break;
                }
                long j3 = 1 << (i2 * 10);
                if ((j == -1 || j % j3 == 0) && (j2 == -1 || j2 % j3 == 0)) {
                    i = i2;
                    break;
                }
                i2--;
            }
        } else {
            i = 1;
        }
        long j4 = 1 << (i * 10);
        m23178(main, R.string.MT_Protector, j == -1 ? "" : Long.toString(j / j4), j2 == -1 ? "" : Long.toString(j2 / j4), i, false, c9372);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23177(C8909 c8909, C9160 c9160, int[] iArr, int i, CheckBox checkBox) {
        InterfaceC3183 interfaceC3183;
        c9160.m23519();
        if (iArr[0] != i) {
            ApplicationC0716.f2992.edit().mo4065(iArr[0], "skt").apply();
        }
        ApplicationC0716.f2992.edit().putBoolean("skc", checkBox.isChecked()).apply();
        final String string = c9160.m23513().toString();
        if (string.isEmpty()) {
            return;
        }
        final boolean zIsChecked = checkBox.isChecked();
        int i2 = iArr[0];
        if (i2 == 0) {
            interfaceC3183 = new InterfaceC3183() { // from class: l.ۜ۬᩹
                @Override // l.InterfaceC3183
                /* JADX INFO: renamed from: ۙ */
                public final boolean mo1619(String str) {
                    boolean z = zIsChecked;
                    String str2 = string;
                    return z ? str.contains(str2) : C6851.m18463((CharSequence) str, (CharSequence) str2);
                }
            };
        } else if (i2 == 1) {
            interfaceC3183 = new InterfaceC3183() { // from class: l.᩺۬᩹
                @Override // l.InterfaceC3183
                /* JADX INFO: renamed from: ۙ */
                public final boolean mo1619(String str) {
                    boolean z = zIsChecked;
                    String str2 = string;
                    if (z) {
                        return !str.contains(str2);
                    }
                    return !C6851.m18463((CharSequence) str, (CharSequence) str2);
                }
            };
        } else if (i2 == 2) {
            interfaceC3183 = new InterfaceC3183() { // from class: l.ܶ۬᩹
                @Override // l.InterfaceC3183
                /* JADX INFO: renamed from: ۙ */
                public final boolean mo1619(String str) {
                    boolean z = zIsChecked;
                    String str2 = string;
                    return z ? str.startsWith(str2) : C6851.m18466(str2, str);
                }
            };
        } else if (i2 == 3) {
            interfaceC3183 = new InterfaceC3183() { // from class: l.᩹۬᩹
                @Override // l.InterfaceC3183
                /* JADX INFO: renamed from: ۙ */
                public final boolean mo1619(String str) {
                    boolean z = zIsChecked;
                    String str2 = string;
                    return z ? str.endsWith(str2) : C6851.m18464((CharSequence) str2, str);
                }
            };
        } else {
            throw new IllegalArgumentException();
        }
        c8909.f30560.mo39924(interfaceC3183);
    }
}
