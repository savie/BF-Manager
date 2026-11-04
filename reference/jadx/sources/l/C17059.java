package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.Arrays;
import java.util.Calendar;

/* JADX INFO: renamed from: l.ܺ᩵ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C76R */
/* JADX INFO: loaded from: classes4.dex */
public final class C17059 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f55717;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC2144 f55718;

    public C17059(AbstractActivityC17204 abstractActivityC17204, InterfaceC2144 interfaceC2144) {
        this.f55717 = abstractActivityC17204;
        this.f55718 = interfaceC2144;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40196() {
        C2361 c2361BuildDialog = this.f55717.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8002(R.array.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۜۗܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C17059.m40188(this.f22783, i);
            }
        });
        c2361BuildDialog.m8016();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40188(final C17059 c17059, int i) {
        if (i >= 0 && i <= 3) {
            c17059.f55718.mo6280(i);
            return;
        }
        int i2 = 4;
        if (i == 4) {
            String strM40185 = m40185(ApplicationC17729.f58258.getString("smint", null));
            String strM40186 = m40185(ApplicationC17729.f58258.getString("smaxt", null));
            if (strM40185 == null) {
                Calendar calendar = Calendar.getInstance();
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                strM40185 = C22482.m50713(calendar.getTimeInMillis());
            }
            m40192(c17059.f55717, R.string.MT_Protector, strM40185, strM40186, true, new C19403(i2, c17059));
            return;
        }
        int i3 = 1;
        if (i == 5) {
            m40191(c17059.f55717, R.string.MT_Protector, ApplicationC17729.f58258.getString("smins", null), ApplicationC17729.f58258.getString("smaxs", null), ApplicationC17729.f58258.getInt("ssun", 1), true, new C9706(c17059));
            return;
        }
        if (i != 6) {
            throw new IllegalArgumentException();
        }
        AbstractActivityC17204 abstractActivityC17204 = c17059.f55717;
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        final C17771 c17771 = (C17771) viewM40395.findViewById(R.id.MT_Protector);
        final CheckBox checkBox = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        RadioButton[] radioButtonArr = {(RadioButton) viewM40395.findViewById(R.id.MT_Protector), (RadioButton) viewM40395.findViewById(R.id.MT_Protector), (RadioButton) viewM40395.findViewById(R.id.MT_Protector), (RadioButton) viewM40395.findViewById(R.id.radioButton3)};
        checkBox.setChecked(ApplicationC17729.f58258.getBoolean("skc", false));
        final int i4 = ApplicationC17729.f58258.getInt("skt", 0);
        final int[] iArr = {i4};
        if (i4 < 0 || i4 >= 4) {
            iArr[0] = 0;
        }
        ViewOnClickListenerC12107 viewOnClickListenerC12107 = new ViewOnClickListenerC12107(i3, radioButtonArr, iArr);
        radioButtonArr[iArr[0]].setChecked(true);
        for (int i5 = 0; i5 < 4; i5++) {
            radioButtonArr[i5].setOnClickListener(viewOnClickListenerC12107);
        }
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩷᩵ܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i6) {
                C17059.m40190(this.f72152, c17771, iArr, i4, checkBox);
            }
        });
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016();
        C21576.m49090(c17771.m41605());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long[] m40193(int i, long j) {
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40195(C17059 c17059, long j, long j2) {
        InterfaceC2144 interfaceC2144 = c17059.f55718;
        if (j == -1) {
            j = 0;
        }
        if (j2 == -1) {
            j2 = C25227.FOREVER_NS;
        }
        interfaceC2144.mo6283(j, j2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40192(AbstractActivityC17204 abstractActivityC17204, int i, String str, String str2, final boolean z, final InterfaceC25265 interfaceC25265) {
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        ((TextView) viewM40395.findViewById(R.id.title)).setText(i);
        final C1626 c1626 = (C1626) viewM40395.findViewById(R.id.MT_Protector);
        final C1626 c1627 = (C1626) viewM40395.findViewById(R.id.MT_Protector);
        final C23255 c23255M5756 = c1626.m5756();
        C17359.requireNonNull(c23255M5756);
        final C23255 c23255M5757 = c1627.m5756();
        C17359.requireNonNull(c23255M5757);
        c23255M5756.mo52335((CharSequence) str);
        c23255M5757.mo52335((CharSequence) str2);
        c23255M5756.m53899(new C4863(false));
        c23255M5757.m53899(new C4863(false));
        C7893.m21433(c1626);
        C7893.m21433(c1627);
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        final DialogInterfaceC8327 dialogInterfaceC8327M23911 = C8947.m23911(c2361BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        dialogInterfaceC8327M23911.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.ۤ᩵ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C23255 c23255 = c23255M5756;
                String strTrim = c23255.m54021().toString().trim();
                C23255 c23256 = c23255M5757;
                String strTrim2 = c23256.m54021().toString().trim();
                boolean zIsEmpty = strTrim.isEmpty();
                C1626 c1628 = c1626;
                if (zIsEmpty && strTrim2.isEmpty()) {
                    c23255.requestFocus();
                    c1628.m5768(C21576.m49088(R.string.MT_Protector));
                    return;
                }
                long jM40194 = strTrim.isEmpty() ? -1L : C17059.m40194(strTrim);
                if (!strTrim.isEmpty() && jM40194 < 0) {
                    c23255.requestFocus();
                    c1628.m5768(C21576.m49088(R.string.MT_Protector));
                    return;
                }
                long jM40195 = strTrim2.isEmpty() ? -1L : C17059.m40194(strTrim2);
                if (!strTrim2.isEmpty() && jM40195 < 0) {
                    c23256.requestFocus();
                    c1627.m5768(C21576.m49088(R.string.MT_Protector));
                } else if (jM40194 != -1 && jM40195 != -1 && jM40194 >= jM40195) {
                    c23255.requestFocus();
                    c1628.m5768(C21576.m49088(R.string.MT_Protector));
                } else {
                    if (z) {
                        ApplicationC17729.f58258.edit().putString("smint", strTrim).putString("smaxt", strTrim2).apply();
                    }
                    interfaceC25265.mo40719(jM40194, jM40195);
                    dialogInterfaceC8327M23911.dismiss();
                }
            }
        });
        dialogInterfaceC8327M23911.m22440().setOnClickListener(new View.OnClickListener() { // from class: l.᩸᩵ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C23255 c23255 = c23255M5757;
                if (c23255.isFocused()) {
                    c23255.mo52335((CharSequence) C22482.m50713(System.currentTimeMillis()));
                } else {
                    c23255M5756.mo52335((CharSequence) C22482.m50713(System.currentTimeMillis()));
                }
            }
        });
        C21576.m49090(c23255M5756);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m40185(String str) {
        if (str == null || str.isEmpty() || m40194(str) >= 0) {
            return str;
        }
        long jM50717 = C22482.m50717(str);
        if (jM50717 < 0 || !C22482.m50718(jM50717).equals(str)) {
            return null;
        }
        return C22482.m50713(jM50717);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static long m40194(String str) {
        long jM50711 = C22482.m50711(str);
        if (jM50711 < 0 || !C22482.m50713(jM50711).equals(str)) {
            return -1L;
        }
        return jM50711;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40186(Main main, long j, long j2, C17340 c17340) {
        m40192(main, R.string.MT_Protector, j == -1 ? "" : C22482.m50713(j), j2 != -1 ? C22482.m50713(j2) : "", false, c17340);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40189(C17059 c17059, long j, long j2) {
        InterfaceC2144 interfaceC2144 = c17059.f55718;
        if (j == -1) {
            j = 0;
        }
        if (j2 == -1) {
            j2 = C25227.FOREVER_NS;
        }
        interfaceC2144.mo6281(j, j2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40191(AbstractActivityC17204 abstractActivityC17204, int i, String str, String str2, int i2, final boolean z, final InterfaceC11838 interfaceC11838) {
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        ((TextView) viewM40395.findViewById(R.id.title)).setText(i);
        final C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        final C23255 c23256 = (C23255) viewM40395.findViewById(R.id.editText2);
        final Spinner spinner = (Spinner) viewM40395.findViewById(R.id.spinner);
        spinner.setAdapter((SpinnerAdapter) new C5873(abstractActivityC17204, Arrays.asList("B", "KB", "MB", "GB")));
        c23255.mo52335((CharSequence) str);
        c23256.mo52335((CharSequence) str2);
        spinner.setSelection(i2);
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        final DialogInterfaceC8327 dialogInterfaceC8327M34866 = C14442.m34866(c2361BuildDialog, R.string.MT_Protector, null, R.string.MT_Protector, null);
        dialogInterfaceC8327M34866.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.ۙ᩵ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long j;
                long j2;
                long j3;
                long j4;
                C23255 c23257 = c23255;
                String strTrim = c23257.m54021().toString().trim();
                C23255 c23258 = c23256;
                String strTrim2 = c23258.m54021().toString().trim();
                int selectedItemPosition = spinner.getSelectedItemPosition();
                long j5 = 1 << (selectedItemPosition * 10);
                if (strTrim.isEmpty() && strTrim2.isEmpty()) {
                    C22673.m51152(R.string.MT_Protector);
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
                    c23257.requestFocus();
                    C22673.m51152(R.string.MT_Protector);
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
                    c23258.requestFocus();
                    C22673.m51152(R.string.MT_Protector);
                    return;
                }
                if ((j2 != -1 ? j2 : 0L) >= (j4 == -1 ? C25227.FOREVER_NS : j4)) {
                    C22673.m51152(R.string.MT_Protector);
                    return;
                }
                if (z) {
                    ApplicationC17729.f58258.edit().putString("smins", strTrim).putString("smaxs", strTrim2).mo3486(selectedItemPosition, "ssun").apply();
                }
                interfaceC11838.mo25302(j2, j4);
                dialogInterfaceC8327M34866.dismiss();
            }
        });
        C21576.m49090(c23255);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40187(Main main, long j, long j2, C17859 c17859) {
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
        m40191(main, R.string.MT_Protector, j == -1 ? "" : Long.toString(j / j4), j2 == -1 ? "" : Long.toString(j2 / j4), i, false, c17859);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40190(C17059 c17059, C17771 c17771, int[] iArr, int i, CheckBox checkBox) {
        InterfaceC4787 interfaceC4787;
        c17771.m41603();
        if (iArr[0] != i) {
            ApplicationC17729.f58258.edit().mo3486(iArr[0], "skt").apply();
        }
        ApplicationC17729.f58258.edit().putBoolean("skc", checkBox.isChecked()).apply();
        final String string = c17771.m41599().toString();
        if (string.isEmpty()) {
            return;
        }
        final boolean zIsChecked = checkBox.isChecked();
        int i2 = iArr[0];
        if (i2 == 0) {
            interfaceC4787 = new InterfaceC4787() { // from class: l.ᩴ᩵ܳ
                @Override // l.InterfaceC4787
                public final boolean test(Object obj) {
                    String str = (String) obj;
                    boolean z = zIsChecked;
                    String str2 = string;
                    return z ? str.contains(str2) : C24276.m54287(str, str2);
                }
            };
        } else if (i2 == 1) {
            interfaceC4787 = new InterfaceC4787() { // from class: l.ܳ᩵ܳ
                @Override // l.InterfaceC4787
                public final boolean test(Object obj) {
                    String str = (String) obj;
                    boolean z = zIsChecked;
                    String str2 = string;
                    if (z) {
                        return !str.contains(str2);
                    }
                    return !C24276.m54287(str, str2);
                }
            };
        } else if (i2 == 2) {
            interfaceC4787 = new InterfaceC4787() { // from class: l.۫᩵ܳ
                @Override // l.InterfaceC4787
                public final boolean test(Object obj) {
                    String str = (String) obj;
                    boolean z = zIsChecked;
                    String str2 = string;
                    if (z) {
                        return str.startsWith(str2);
                    }
                    int i3 = C24276.f78588;
                    return AbstractC21292.f67895.m48533(str2, str);
                }
            };
        } else if (i2 == 3) {
            interfaceC4787 = new InterfaceC4787() { // from class: l.۬ۗܳ
                @Override // l.InterfaceC4787
                public final boolean test(Object obj) {
                    String str = (String) obj;
                    boolean z = zIsChecked;
                    String str2 = string;
                    if (z) {
                        return str.endsWith(str2);
                    }
                    int i3 = C24276.f78588;
                    return AbstractC21292.f67895.m48532(str2, str);
                }
            };
        } else {
            throw new IllegalArgumentException();
        }
        c17059.f55718.mo6282(interfaceC4787);
    }
}
