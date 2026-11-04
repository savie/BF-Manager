package l;

import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֡ۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5G5 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC0234 implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f1483;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final CheckBox f1484;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final CheckBox f1485;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final View f1486;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C17771 f1487;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final Spinner f1488;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9801 f1489;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final CheckBox f1490;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final View f1491;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ActivityC0848 f1492;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C20283 f1493;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C17771 f1494;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC18133 f1495;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public ViewOnClickListenerC0234(ActivityC0848 activityC0848, C20283 c20283) {
        InterfaceC9801 interfaceC9801 = ApplicationC17729.f58258;
        this.f1489 = interfaceC9801;
        this.f1492 = activityC0848;
        this.f1493 = c20283;
        View viewM40395 = activityC0848.m40395(R.layout.MT_Protector);
        this.f1491 = viewM40395;
        C17771 c17771 = (C17771) viewM40395.findViewById(R.id.MT_Protector);
        this.f1487 = c17771;
        C17771 c17772 = (C17771) viewM40395.findViewById(R.id.editText2);
        this.f1494 = c17772;
        c17771.m41595(C10826.m27556(), (String) null);
        c17772.m41595(C10826.m27555(), (String) null);
        this.f1486 = viewM40395.findViewById(R.id.linearLayout);
        this.f1488 = (Spinner) viewM40395.findViewById(R.id.spinner);
        CheckBox checkBox = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        this.f1484 = checkBox;
        CheckBox checkBox2 = (CheckBox) viewM40395.findViewById(R.id.checkBox2);
        this.f1485 = checkBox2;
        CheckBox checkBox3 = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        this.f1490 = checkBox3;
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۛۛۧ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ViewOnClickListenerC0234.m1708(this.f21110, z);
            }
        });
        checkBox.setChecked(interfaceC9801.getBoolean("dex_search_match_case", false));
        checkBox2.setChecked(interfaceC9801.getBoolean("dex_search_regex", false));
        checkBox3.setChecked(interfaceC9801.getBoolean("dex_search_exactly_match", false));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m1708(ViewOnClickListenerC0234 viewOnClickListenerC0234, boolean z) {
        viewOnClickListenerC0234.f1487.m41606(z);
        viewOnClickListenerC0234.f1494.m41600(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1710(C1878 c1878) {
        this.f1495 = new C3963(this, c1878.m6424());
        int i = this.f1489.getInt("dex_search_type", 0) == 4 ? 1 : 0;
        Spinner spinner = this.f1488;
        spinner.setSelection(i);
        onItemSelected(null, null, spinner.getSelectedItemPosition(), 0L);
        spinner.setOnItemSelectedListener(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1709() {
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(this.f1492);
        c2361.m8005(this.f1491);
        DialogInterfaceC8327 dialogInterfaceC8327M34866 = C14442.m34866(c2361, R.string.MT_Protector, null, R.string.MT_Protector, null);
        this.f1483 = dialogInterfaceC8327M34866;
        dialogInterfaceC8327M34866.m22436().setOnClickListener(this);
        this.f1487.m41601();
        C21576.m49090(this.f1494.m41605());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C17771 c17771 = this.f1487;
        String string = c17771.m41599().toString();
        C17771 c17772 = this.f1494;
        String string2 = c17772.m41599().toString();
        if (string.isEmpty()) {
            this.f1483.dismiss();
            return;
        }
        boolean zIsChecked = this.f1484.isChecked();
        boolean zIsChecked2 = this.f1485.isChecked();
        boolean zIsChecked3 = this.f1490.isChecked();
        if (zIsChecked2) {
            try {
                try {
                    C7974.m21762(C18415.m42925(string), string2);
                } catch (Exception e) {
                    C22673.m51154((CharSequence) e.getMessage());
                    c17772.requestFocus();
                    return;
                }
            } catch (Exception e2) {
                C22673.m51154((CharSequence) e2.getMessage());
                c17771.requestFocus();
                return;
            }
        }
        c17771.m41603();
        c17772.m41603();
        this.f1489.edit().putBoolean("dex_search_match_case", zIsChecked).putBoolean("dex_search_regex", zIsChecked2).putBoolean("dex_search_exactly_match", zIsChecked3).apply();
        this.f1483.dismiss();
        this.f1495.mo12699(string, string2, zIsChecked, zIsChecked2, zIsChecked3);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f1490.setVisibility(i == 0 ? 8 : 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m1707(ViewOnClickListenerC0234 viewOnClickListenerC0234, Set set, final String str, final String str2, final boolean z, final boolean z2, final boolean z3) {
        C10745 c10745 = new C10745(viewOnClickListenerC0234.f1492);
        c10745.m27397(R.string.MT_Protector);
        c10745.mo25916((Runnable) null);
        c10745.mo25931();
        final C21117 c21117 = new C21117(viewOnClickListenerC0234, c10745);
        final boolean z4 = viewOnClickListenerC0234.f1488.getSelectedItemPosition() == 1;
        final C20283 c20283 = viewOnClickListenerC0234.f1493;
        C17359.requireNonNull(set);
        final C14403 c14403 = new C14403(set);
        new Thread(new Runnable() { // from class: l.۟ۗۧ
            @Override // java.lang.Runnable
            public final void run() {
                final C17539 c17539 = new C17539();
                String str3 = str;
                final boolean z5 = z2;
                final C24999 c24999M11068 = C3369.m11068(str3, z5, z);
                final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                C20283 c20284 = c20283;
                c20284.m46582(concurrentLinkedQueue, "", true, (Predicate) c14403);
                final InterfaceC16793 interfaceC16793 = c21117;
                interfaceC16793.mo13596(0);
                final C3374 c3374 = new C3374(concurrentLinkedQueue.size());
                c3374.m11078(new C8114(interfaceC16793));
                final boolean z6 = z4;
                final String str4 = str2;
                final boolean z7 = z3;
                Runnable runnable = new Runnable() { // from class: l.ۡۗۧ
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC14906 interfaceC14906;
                        ConcurrentLinkedQueue concurrentLinkedQueue2;
                        InterfaceC16793 interfaceC16794;
                        C3374 c3375;
                        C24999 c24999;
                        boolean z8;
                        boolean z9;
                        InterfaceC14906 interfaceC14907;
                        String strM11066;
                        ConcurrentLinkedQueue concurrentLinkedQueue3 = concurrentLinkedQueue;
                        InterfaceC16793 interfaceC16795 = interfaceC16793;
                        C3374 c3376 = c3374;
                        C24999 c249910 = c24999M11068;
                        boolean z10 = z6;
                        String str5 = str4;
                        boolean z11 = z5;
                        boolean z12 = z7;
                        C17539 c175310 = c17539;
                        while (!concurrentLinkedQueue3.isEmpty() && (interfaceC14906 = (InterfaceC14906) concurrentLinkedQueue3.poll()) != null && !interfaceC16795.mo13593()) {
                            c3376.m11079(1);
                            String strMo10209 = interfaceC14906.mo10209();
                            C4245 c4245 = c249910.get();
                            if (z10) {
                                C4137 c4137 = new C4137(strMo10209);
                                C0560 c0560 = new C0560(strMo10209.length());
                                C17539 c175311 = new C17539();
                                int i = 0;
                                concurrentLinkedQueue2 = concurrentLinkedQueue3;
                                int i2 = 0;
                                while (c4137.m13266()) {
                                    InterfaceC16793 interfaceC16796 = interfaceC16795;
                                    int i3 = i;
                                    C17539 c175312 = c175311;
                                    C3374 c3377 = c3376;
                                    C0560 c0561 = c0560;
                                    C24999 c249911 = c249910;
                                    C4137 c4138 = c4137;
                                    boolean z13 = z10;
                                    String str6 = strMo10209;
                                    boolean z14 = z12;
                                    boolean z15 = z12;
                                    InterfaceC14906 interfaceC14908 = interfaceC14906;
                                    String strM11067 = C3369.m11066(c4137.f14034, str5, c4245, z11, z14, c175312);
                                    if (strM11067 != null) {
                                        c0561.append((CharSequence) str6, i2, c4138.f14035);
                                        try {
                                            C3652.m11836(c0561, strM11067);
                                        } catch (IOException unused) {
                                        }
                                        i2 = c4138.f14032;
                                        i = c175312.f57015 + i3;
                                        synchronized (c175312) {
                                            c175312.f57015 = 0;
                                            c175312.f57014 = 0;
                                        }
                                    } else {
                                        i = i3;
                                    }
                                    c175311 = c175312;
                                    c0560 = c0561;
                                    c4137 = c4138;
                                    strMo10209 = str6;
                                    interfaceC14906 = interfaceC14908;
                                    interfaceC16795 = interfaceC16796;
                                    c3376 = c3377;
                                    c249910 = c249911;
                                    z10 = z13;
                                    z12 = z15;
                                }
                                interfaceC16794 = interfaceC16795;
                                c3375 = c3376;
                                c24999 = c249910;
                                z8 = z10;
                                int i4 = i;
                                C0560 c0562 = c0560;
                                String str7 = strMo10209;
                                z9 = z12;
                                interfaceC14907 = interfaceC14906;
                                if (i4 == 0) {
                                    strM11066 = null;
                                } else {
                                    c175310.m41195(i4);
                                    if (i2 < str7.length()) {
                                        c0562.append((CharSequence) str7, i2, str7.length());
                                    }
                                    strM11066 = c0562.toString();
                                }
                            } else {
                                concurrentLinkedQueue2 = concurrentLinkedQueue3;
                                interfaceC16794 = interfaceC16795;
                                c3375 = c3376;
                                c24999 = c249910;
                                z8 = z10;
                                z9 = z12;
                                interfaceC14907 = interfaceC14906;
                                strM11066 = C3369.m11066(strMo10209, str5, c4245, z11, false, c175310);
                            }
                            if (strM11066 != null) {
                                interfaceC14907.mo10204(strM11066);
                            }
                            concurrentLinkedQueue3 = concurrentLinkedQueue2;
                            interfaceC16795 = interfaceC16794;
                            c3376 = c3375;
                            c249910 = c24999;
                            z10 = z8;
                            z12 = z9;
                        }
                    }
                };
                c20284.m46595();
                c20284.m46591(false);
                C3369.m11069((int) (C11138.f35105 * 0.66f), runnable);
                c20284.m46591(true);
                c20284.m46573();
                C21576.m49068(new RunnableC8349(0, interfaceC16793, c17539));
            }
        }).start();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1711(C1965 c1965) {
        this.f1495 = new C24101(c1965);
        this.f1486.setVisibility(8);
    }
}
