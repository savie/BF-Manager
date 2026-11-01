package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: l.᩻֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1F3 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC23380 implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC10680 f75740;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Spinner f75741;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final View f75742;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final CheckBox f75743;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final View f75744;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final CheckBox f75745;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C9160 f75746;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final CheckBox f75747;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ActivityC5677 f75748;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19356 f75749;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C9160 f75750;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C8229 f75751;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC6025 f75752;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public ViewOnClickListenerC23380(ActivityC5677 activityC5677, C8229 c8229) {
        InterfaceC6025 interfaceC6025 = ApplicationC0716.f2992;
        this.f75752 = interfaceC6025;
        this.f75748 = activityC5677;
        this.f75751 = c8229;
        View viewM30995 = activityC5677.m30995(R.layout.MT_Protector);
        this.f75742 = viewM30995;
        C9160 c9160 = (C9160) viewM30995.findViewById(R.id.MT_Protector);
        this.f75746 = c9160;
        C9160 c9161 = (C9160) viewM30995.findViewById(R.id.editText2);
        this.f75750 = c9161;
        c9160.m23508(C21905.m48704(), (String) null);
        c9161.m23508(C21905.m48703(), (String) null);
        this.f75744 = viewM30995.findViewById(R.id.linearLayout);
        this.f75741 = (Spinner) viewM30995.findViewById(R.id.spinner);
        CheckBox checkBox = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        this.f75745 = checkBox;
        CheckBox checkBox2 = (CheckBox) viewM30995.findViewById(R.id.checkBox2);
        this.f75747 = checkBox2;
        CheckBox checkBox3 = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        this.f75743 = checkBox3;
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.۫֫ۘ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ViewOnClickListenerC23380.m51517(this.f40455, z);
            }
        });
        checkBox.setChecked(interfaceC6025.getBoolean("dex_search_match_case", false));
        checkBox2.setChecked(interfaceC6025.getBoolean("dex_search_regex", false));
        checkBox3.setChecked(interfaceC6025.getBoolean("dex_search_exactly_match", false));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m51517(ViewOnClickListenerC23380 viewOnClickListenerC23380, boolean z) {
        viewOnClickListenerC23380.f75746.m23518(z);
        viewOnClickListenerC23380.f75750.m23514(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51520(C10617 c10617) {
        this.f75740 = new C23979(this, c10617.m26797());
        int i = this.f75752.getInt("arsc_search_type", 0) == 2 ? 1 : 0;
        Spinner spinner = this.f75741;
        spinner.setSelection(i);
        onItemSelected(null, null, spinner.getSelectedItemPosition(), 0L);
        spinner.setOnItemSelectedListener(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51518() {
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(this.f75748);
        c8067.m21258(this.f75742);
        DialogInterfaceC19356 dialogInterfaceC19356M10334 = C3509.m10334(c8067, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f75749 = dialogInterfaceC19356M10334;
        dialogInterfaceC19356M10334.m44373().setOnClickListener(this);
        this.f75746.m23517(0);
        C16737.m39290(this.f75750.m23516());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C9160 c9160 = this.f75746;
        String string = c9160.m23513().toString();
        C9160 c9161 = this.f75750;
        String string2 = c9161.m23513().toString();
        if (string.isEmpty()) {
            this.f75749.dismiss();
            return;
        }
        boolean zIsChecked = this.f75745.isChecked();
        boolean zIsChecked2 = this.f75747.isChecked();
        boolean zIsChecked3 = this.f75743.isChecked();
        if (zIsChecked2) {
            try {
                try {
                    C9751.m24733(C14690.m35219(string), string2);
                } catch (Exception e) {
                    C15829.m37613((CharSequence) e.getMessage());
                    c9161.requestFocus();
                    return;
                }
            } catch (Exception e2) {
                C15829.m37613((CharSequence) e2.getMessage());
                c9160.requestFocus();
                return;
            }
        }
        c9160.m23519();
        c9161.m23519();
        this.f75752.edit().putBoolean("dex_search_match_case", zIsChecked).putBoolean("dex_search_regex", zIsChecked2).putBoolean("dex_search_exactly_match", zIsChecked3).apply();
        this.f75749.dismiss();
        this.f75740.mo26890(string, string2, zIsChecked, zIsChecked2, zIsChecked3);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f75743.setVisibility(i == 0 ? 8 : 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51516(ViewOnClickListenerC23380 viewOnClickListenerC23380, final Set set, final String str, final String str2, final boolean z, final boolean z2, final boolean z3) {
        C1777 c1777 = new C1777(viewOnClickListenerC23380.f75748);
        c1777.m5837(R.string.MT_Protector);
        c1777.mo5828((Runnable) null);
        c1777.mo5843();
        final C5740 c5740 = new C5740(viewOnClickListenerC23380, c1777);
        final boolean z4 = viewOnClickListenerC23380.f75741.getSelectedItemPosition() == 1;
        final C8229 c8229 = viewOnClickListenerC23380.f75751;
        new Thread(new Runnable() { // from class: l.֫ܳۘ
            @Override // java.lang.Runnable
            public final void run() {
                C8229 c82210 = c8229;
                final boolean z5 = z4;
                final C22674 c22674 = new C22674(c82210, z5);
                final InterfaceC16261 interfaceC16261 = c5740;
                try {
                    c22674.f73834 = z5 ? c82210.m21605() : Collections.EMPTY_MAP;
                    final C20494 c20494 = new C20494();
                    String str3 = str;
                    final boolean z6 = z2;
                    final C21199 c21199M31636 = C12733.m31636(str3, z6, z);
                    final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    c82210.m21579(concurrentLinkedQueue, "", true, set);
                    interfaceC16261.mo15795(0);
                    final C8516 c8516 = new C8516(concurrentLinkedQueue.size());
                    c8516.m22241(new C16041(interfaceC16261));
                    final String str4 = str2;
                    final boolean z7 = z3;
                    Runnable runnable = new Runnable() { // from class: l.ۖ֫ۘ
                        @Override // java.lang.Runnable
                        public final void run() {
                            InterfaceC9974 interfaceC9974;
                            ConcurrentLinkedQueue concurrentLinkedQueue2;
                            InterfaceC16261 interfaceC16262;
                            C8516 c8517;
                            C21199 c21199;
                            boolean z8;
                            C22674 c22675;
                            InterfaceC9974 interfaceC9975;
                            boolean z9;
                            C20494 c20495;
                            String strM31634;
                            C20494 c20496;
                            C21199 c211910;
                            StringBuilder sb;
                            boolean z10;
                            String str5;
                            C22674 c22676;
                            InterfaceC9974 interfaceC9976;
                            boolean z11;
                            C20494 c20497;
                            ConcurrentLinkedQueue concurrentLinkedQueue3 = concurrentLinkedQueue;
                            InterfaceC16261 interfaceC16263 = interfaceC16261;
                            C8516 c8518 = c8516;
                            C21199 c211911 = c21199M31636;
                            boolean z12 = z5;
                            C22674 c22677 = c22674;
                            String str6 = str4;
                            boolean z13 = z6;
                            boolean z14 = z7;
                            C20494 c20498 = c20494;
                            while (!concurrentLinkedQueue3.isEmpty() && (interfaceC9974 = (InterfaceC9974) concurrentLinkedQueue3.poll()) != null && !interfaceC16263.mo15792()) {
                                c8518.m22242(1);
                                String strMo25238 = interfaceC9974.mo25238();
                                C6222 c6222 = c211911.get();
                                if (z12) {
                                    List<C0787> listM50206 = c22677.m50206(interfaceC9974.getPath());
                                    strM31634 = null;
                                    if (listM50206 == null) {
                                        concurrentLinkedQueue2 = concurrentLinkedQueue3;
                                        interfaceC16262 = interfaceC16263;
                                        c8517 = c8518;
                                        c21199 = c211911;
                                        z8 = z12;
                                        c22675 = c22677;
                                        interfaceC9975 = interfaceC9974;
                                        z9 = z14;
                                        c20495 = c20498;
                                    } else {
                                        StringBuilder sb2 = new StringBuilder(strMo25238.length());
                                        C20494 c20499 = new C20494();
                                        int i = 0;
                                        concurrentLinkedQueue2 = concurrentLinkedQueue3;
                                        int i2 = 0;
                                        for (C0787 c0787 : listM50206) {
                                            InterfaceC16261 interfaceC16264 = interfaceC16263;
                                            C8516 c8519 = c8518;
                                            if (c0787.f3371 != 1) {
                                                c211910 = c211911;
                                                z10 = z12;
                                                c22676 = c22677;
                                                c20496 = c20499;
                                                sb = sb2;
                                                str5 = strMo25238;
                                                interfaceC9976 = interfaceC9974;
                                                z11 = z14;
                                                c20497 = c20498;
                                            } else {
                                                int i3 = i;
                                                c20496 = c20499;
                                                c211910 = c211911;
                                                sb = sb2;
                                                z10 = z12;
                                                str5 = strMo25238;
                                                c22676 = c22677;
                                                interfaceC9976 = interfaceC9974;
                                                boolean z15 = z14;
                                                z11 = z14;
                                                c20497 = c20498;
                                                String strM31635 = C12733.m31634(c0787.f3366, str6, c6222, z13, z15, c20496);
                                                if (strM31635 != null) {
                                                    sb.append((CharSequence) str5, i2, c0787.f3369);
                                                    sb.append(C13985.m33830(strM31635));
                                                    i2 = c0787.f3367;
                                                    i = i3 + c20496.f66458;
                                                    synchronized (c20496) {
                                                        c20496.f66458 = 0;
                                                        c20496.f66457 = 0;
                                                    }
                                                } else {
                                                    i = i3;
                                                }
                                            }
                                            c20499 = c20496;
                                            sb2 = sb;
                                            strMo25238 = str5;
                                            interfaceC9974 = interfaceC9976;
                                            c20498 = c20497;
                                            interfaceC16263 = interfaceC16264;
                                            c8518 = c8519;
                                            c211911 = c211910;
                                            z12 = z10;
                                            c22677 = c22676;
                                            z14 = z11;
                                        }
                                        interfaceC16262 = interfaceC16263;
                                        c8517 = c8518;
                                        c21199 = c211911;
                                        z8 = z12;
                                        c22675 = c22677;
                                        int i4 = i;
                                        StringBuilder sb3 = sb2;
                                        String str7 = strMo25238;
                                        interfaceC9975 = interfaceC9974;
                                        z9 = z14;
                                        c20495 = c20498;
                                        if (i4 != 0) {
                                            c20495.m46298(i4);
                                            if (i2 < str7.length()) {
                                                sb3.append((CharSequence) str7, i2, str7.length());
                                            }
                                            strM31634 = sb3.toString();
                                        }
                                    }
                                } else {
                                    concurrentLinkedQueue2 = concurrentLinkedQueue3;
                                    interfaceC16262 = interfaceC16263;
                                    c8517 = c8518;
                                    c21199 = c211911;
                                    z8 = z12;
                                    c22675 = c22677;
                                    interfaceC9975 = interfaceC9974;
                                    z9 = z14;
                                    c20495 = c20498;
                                    strM31634 = C12733.m31634(strMo25238, str6, c6222, z13, false, c20498);
                                }
                                String str8 = strM31634;
                                if (str8 != null) {
                                    interfaceC9975.mo25239(str8);
                                }
                                c20498 = c20495;
                                concurrentLinkedQueue3 = concurrentLinkedQueue2;
                                interfaceC16263 = interfaceC16262;
                                c8518 = c8517;
                                c211911 = c21199;
                                z12 = z8;
                                c22677 = c22675;
                                z14 = z9;
                            }
                        }
                    };
                    c82210.m21587(false);
                    C12733.m31637((int) (C5464.f18831 * 0.66f), runnable);
                    c82210.m21587(true);
                    C16737.m39273(new RunnableC3870(4, interfaceC16261, c20494));
                } catch (Exception e) {
                    C16737.m39273(new Runnable() { // from class: l.ۨ֫ۘ
                        @Override // java.lang.Runnable
                        public final void run() {
                            Exception exc = e;
                            InterfaceC16261 interfaceC16262 = interfaceC16261;
                            c22674.m50207(interfaceC16262.mo15793(), exc);
                            interfaceC16262.mo15794();
                        }
                    });
                }
            }
        }).start();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51519(final C7898 c7898) {
        this.f75740 = new InterfaceC10680() { // from class: l.ܿ֫ۘ
            @Override // l.InterfaceC10680
            /* JADX INFO: renamed from: ۙ */
            public final void mo26890(String str, String str2, boolean z, boolean z2, boolean z3) {
                C20494 c20494 = new C20494();
                C6222 c6222Matcher = C12733.m31638(str, z2, z).matcher((CharSequence) "");
                C7898 c7899 = c7898;
                for (C0841 c0841 : c7899.m20905()) {
                    String strM31634 = C12733.m31634(c0841.m3454(), str2, c6222Matcher, z2, z3, c20494);
                    if (strM31634 != null) {
                        c0841.m3453(strM31634);
                    }
                }
                c7899.m20902();
                c7899.m20904();
                c7899.m20906().notifyDataSetChanged();
                C15829.m37613((CharSequence) c7899.getString(R.string.MT_Protector, Integer.valueOf(c20494.f66458)));
            }
        };
        this.f75744.setVisibility(8);
    }
}
