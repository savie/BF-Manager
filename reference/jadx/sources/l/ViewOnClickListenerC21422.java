package l;

import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.Spinner;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: l.᩶ܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1F3 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC21422 implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f68223;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final CheckBox f68224;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final CheckBox f68225;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final View f68226;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C17771 f68227;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final Spinner f68228;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9801 f68229;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final CheckBox f68230;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final View f68231;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ActivityC0848 f68232;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC14708 f68233;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C17771 f68234;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C11967 f68235;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public ViewOnClickListenerC21422(ActivityC0848 activityC0848, C11967 c11967) {
        InterfaceC9801 interfaceC9801 = ApplicationC17729.f58258;
        this.f68229 = interfaceC9801;
        this.f68232 = activityC0848;
        this.f68235 = c11967;
        View viewM40395 = activityC0848.m40395(R.layout.MT_Protector);
        this.f68231 = viewM40395;
        C17771 c17771 = (C17771) viewM40395.findViewById(R.id.MT_Protector);
        this.f68227 = c17771;
        C17771 c17772 = (C17771) viewM40395.findViewById(R.id.editText2);
        this.f68234 = c17772;
        c17771.m41595(C10826.m27556(), (String) null);
        c17772.m41595(C10826.m27555(), (String) null);
        this.f68226 = viewM40395.findViewById(R.id.linearLayout);
        this.f68228 = (Spinner) viewM40395.findViewById(R.id.spinner);
        CheckBox checkBox = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        this.f68224 = checkBox;
        CheckBox checkBox2 = (CheckBox) viewM40395.findViewById(R.id.checkBox2);
        this.f68225 = checkBox2;
        CheckBox checkBox3 = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        this.f68230 = checkBox3;
        checkBox2.setOnCheckedChangeListener(new C0582(1, this));
        checkBox.setChecked(interfaceC9801.getBoolean("dex_search_match_case", false));
        checkBox2.setChecked(interfaceC9801.getBoolean("dex_search_regex", false));
        checkBox3.setChecked(interfaceC9801.getBoolean("dex_search_exactly_match", false));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48726(ViewOnClickListenerC21422 viewOnClickListenerC21422, boolean z) {
        viewOnClickListenerC21422.f68227.m41606(z);
        viewOnClickListenerC21422.f68234.m41600(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48728(C1878 c1878) {
        this.f68233 = new C24023(this, c1878.m6424());
        int i = this.f68229.getInt("arsc_search_type", 0) == 2 ? 1 : 0;
        Spinner spinner = this.f68228;
        spinner.setSelection(i);
        onItemSelected(null, null, spinner.getSelectedItemPosition(), 0L);
        spinner.setOnItemSelectedListener(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48727() {
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(this.f68232);
        c2361.m8005(this.f68231);
        DialogInterfaceC8327 dialogInterfaceC8327M34866 = C14442.m34866(c2361, R.string.MT_Protector, null, R.string.MT_Protector, null);
        this.f68223 = dialogInterfaceC8327M34866;
        dialogInterfaceC8327M34866.m22436().setOnClickListener(this);
        this.f68227.m41601();
        C21576.m49090(this.f68234.m41605());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C17771 c17771 = this.f68227;
        String string = c17771.m41599().toString();
        C17771 c17772 = this.f68234;
        String string2 = c17772.m41599().toString();
        if (string.isEmpty()) {
            this.f68223.dismiss();
            return;
        }
        boolean zIsChecked = this.f68224.isChecked();
        boolean zIsChecked2 = this.f68225.isChecked();
        boolean zIsChecked3 = this.f68230.isChecked();
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
        this.f68229.edit().putBoolean("dex_search_match_case", zIsChecked).putBoolean("dex_search_regex", zIsChecked2).putBoolean("dex_search_exactly_match", zIsChecked3).apply();
        this.f68223.dismiss();
        this.f68233.mo35376(string, string2, zIsChecked, zIsChecked2, zIsChecked3);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f68230.setVisibility(i == 0 ? 8 : 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48725(ViewOnClickListenerC21422 viewOnClickListenerC21422, final Set set, final String str, final String str2, final boolean z, final boolean z2, final boolean z3) {
        C10745 c10745 = new C10745(viewOnClickListenerC21422.f68232);
        c10745.m27397(R.string.MT_Protector);
        c10745.mo25916((Runnable) null);
        c10745.mo25931();
        final C4268 c4268 = new C4268(viewOnClickListenerC21422, c10745);
        final boolean z4 = viewOnClickListenerC21422.f68228.getSelectedItemPosition() == 1;
        final C11967 c11967 = viewOnClickListenerC21422.f68235;
        new Thread(new Runnable() { // from class: l.ۢ᩻ۧ
            @Override // java.lang.Runnable
            public final void run() {
                C11967 c11968 = c11967;
                final boolean z5 = z4;
                final C15454 c15454 = new C15454(c11968, z5);
                final InterfaceC16793 interfaceC16793 = c4268;
                try {
                    c15454.f50312 = z5 ? c11968.m29999() : Collections.EMPTY_MAP;
                    final C17539 c17539 = new C17539();
                    String str3 = str;
                    final boolean z6 = z2;
                    final C24999 c24999M11068 = C3369.m11068(str3, z6, z);
                    final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    c11968.m29976(concurrentLinkedQueue, "", true, set);
                    interfaceC16793.mo13596(0);
                    final C3374 c3374 = new C3374(concurrentLinkedQueue.size());
                    c3374.m11078(new C8114(interfaceC16793));
                    final String str4 = str2;
                    final boolean z7 = z3;
                    Runnable runnable = new Runnable() { // from class: l.ۜ᩻ۧ
                        @Override // java.lang.Runnable
                        public final void run() {
                            InterfaceC16200 interfaceC16200;
                            ConcurrentLinkedQueue concurrentLinkedQueue2;
                            InterfaceC16793 interfaceC16794;
                            C3374 c3375;
                            C24999 c24999;
                            boolean z8;
                            C15454 c15455;
                            InterfaceC16200 interfaceC16201;
                            boolean z9;
                            C17539 c175310;
                            String strM11066;
                            C17539 c175311;
                            C24999 c249910;
                            StringBuilder sb;
                            boolean z10;
                            String str5;
                            C15454 c15456;
                            InterfaceC16200 interfaceC16202;
                            boolean z11;
                            C17539 c175312;
                            ConcurrentLinkedQueue concurrentLinkedQueue3 = concurrentLinkedQueue;
                            InterfaceC16793 interfaceC16795 = interfaceC16793;
                            C3374 c3376 = c3374;
                            C24999 c249911 = c24999M11068;
                            boolean z12 = z5;
                            C15454 c15457 = c15454;
                            String str6 = str4;
                            boolean z13 = z6;
                            boolean z14 = z7;
                            C17539 c175313 = c17539;
                            while (!concurrentLinkedQueue3.isEmpty() && (interfaceC16200 = (InterfaceC16200) concurrentLinkedQueue3.poll()) != null && !interfaceC16795.mo13593()) {
                                c3376.m11079(1);
                                String strMo7710 = interfaceC16200.mo7710();
                                C4245 c4245 = c249911.get();
                                if (z12) {
                                    List<C9442> listM37007 = c15457.m37007(interfaceC16200.getPath());
                                    strM11066 = null;
                                    if (listM37007 == null) {
                                        concurrentLinkedQueue2 = concurrentLinkedQueue3;
                                        interfaceC16794 = interfaceC16795;
                                        c3375 = c3376;
                                        c24999 = c249911;
                                        z8 = z12;
                                        c15455 = c15457;
                                        interfaceC16201 = interfaceC16200;
                                        z9 = z14;
                                        c175310 = c175313;
                                    } else {
                                        StringBuilder sb2 = new StringBuilder(strMo7710.length());
                                        C17539 c175314 = new C17539();
                                        int i = 0;
                                        concurrentLinkedQueue2 = concurrentLinkedQueue3;
                                        int i2 = 0;
                                        for (C9442 c9442 : listM37007) {
                                            InterfaceC16793 interfaceC16796 = interfaceC16795;
                                            C3374 c3377 = c3376;
                                            if (c9442.f30619 != 1) {
                                                c249910 = c249911;
                                                z10 = z12;
                                                c15456 = c15457;
                                                c175311 = c175314;
                                                sb = sb2;
                                                str5 = strMo7710;
                                                interfaceC16202 = interfaceC16200;
                                                z11 = z14;
                                                c175312 = c175313;
                                            } else {
                                                int i3 = i;
                                                c175311 = c175314;
                                                c249910 = c249911;
                                                sb = sb2;
                                                z10 = z12;
                                                str5 = strMo7710;
                                                c15456 = c15457;
                                                interfaceC16202 = interfaceC16200;
                                                boolean z15 = z14;
                                                z11 = z14;
                                                c175312 = c175313;
                                                String strM11067 = C3369.m11066(c9442.f30622, str6, c4245, z13, z15, c175311);
                                                if (strM11067 != null) {
                                                    sb.append((CharSequence) str5, i2, c9442.f30618);
                                                    sb.append(C1306.m4757(strM11067));
                                                    i2 = c9442.f30617;
                                                    i = i3 + c175311.f57015;
                                                    synchronized (c175311) {
                                                        c175311.f57015 = 0;
                                                        c175311.f57014 = 0;
                                                    }
                                                } else {
                                                    i = i3;
                                                }
                                            }
                                            c175314 = c175311;
                                            sb2 = sb;
                                            strMo7710 = str5;
                                            interfaceC16200 = interfaceC16202;
                                            c175313 = c175312;
                                            interfaceC16795 = interfaceC16796;
                                            c3376 = c3377;
                                            c249911 = c249910;
                                            z12 = z10;
                                            c15457 = c15456;
                                            z14 = z11;
                                        }
                                        interfaceC16794 = interfaceC16795;
                                        c3375 = c3376;
                                        c24999 = c249911;
                                        z8 = z12;
                                        c15455 = c15457;
                                        int i4 = i;
                                        StringBuilder sb3 = sb2;
                                        String str7 = strMo7710;
                                        interfaceC16201 = interfaceC16200;
                                        z9 = z14;
                                        c175310 = c175313;
                                        if (i4 != 0) {
                                            c175310.m41195(i4);
                                            if (i2 < str7.length()) {
                                                sb3.append((CharSequence) str7, i2, str7.length());
                                            }
                                            strM11066 = sb3.toString();
                                        }
                                    }
                                } else {
                                    concurrentLinkedQueue2 = concurrentLinkedQueue3;
                                    interfaceC16794 = interfaceC16795;
                                    c3375 = c3376;
                                    c24999 = c249911;
                                    z8 = z12;
                                    c15455 = c15457;
                                    interfaceC16201 = interfaceC16200;
                                    z9 = z14;
                                    c175310 = c175313;
                                    strM11066 = C3369.m11066(strMo7710, str6, c4245, z13, false, c175313);
                                }
                                String str8 = strM11066;
                                if (str8 != null) {
                                    interfaceC16201.mo7711(str8);
                                }
                                c175313 = c175310;
                                concurrentLinkedQueue3 = concurrentLinkedQueue2;
                                interfaceC16795 = interfaceC16794;
                                c3376 = c3375;
                                c249911 = c24999;
                                z12 = z8;
                                c15457 = c15455;
                                z14 = z9;
                            }
                        }
                    };
                    c11968.m29984(false);
                    C3369.m11069((int) (C11138.f35105 * 0.66f), runnable);
                    c11968.m29984(true);
                    C21576.m49068(new Runnable() { // from class: l.֡᩻ۧ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C17539 c175310 = c17539;
                            int i = c175310.f57014;
                            int i2 = c175310.f57015;
                            InterfaceC16793 interfaceC16794 = interfaceC16793;
                            interfaceC16794.mo13592(i, i2);
                            interfaceC16794.mo13595();
                        }
                    });
                } catch (Exception e) {
                    C21576.m49068(new Runnable() { // from class: l.۠᩻ۧ
                        @Override // java.lang.Runnable
                        public final void run() {
                            Exception exc = e;
                            InterfaceC16793 interfaceC16794 = interfaceC16793;
                            c15454.m37008(interfaceC16794.mo13594(), exc);
                            interfaceC16794.mo13595();
                        }
                    });
                }
            }
        }).start();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48729(C2009 c2009) {
        this.f68233 = new C25130(c2009);
        this.f68226.setVisibility(8);
    }
}
