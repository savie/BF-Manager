package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.Spinner;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۧۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5G5 */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC10786 implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C6094 f36739;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Spinner f36740;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final View f36741;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final CheckBox f36742;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final View f36743;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final CheckBox f36744;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C9160 f36745;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final CheckBox f36746;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ActivityC5677 f36747;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19356 f36748;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C9160 f36749;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC5846 f36750;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC6025 f36751;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public ViewOnClickListenerC10786(ActivityC5677 activityC5677, C6094 c6094) {
        InterfaceC6025 interfaceC6025 = ApplicationC0716.f2992;
        this.f36751 = interfaceC6025;
        this.f36747 = activityC5677;
        this.f36739 = c6094;
        View viewM30995 = activityC5677.m30995(R.layout.MT_Protector);
        this.f36741 = viewM30995;
        C9160 c9160 = (C9160) viewM30995.findViewById(R.id.MT_Protector);
        this.f36745 = c9160;
        C9160 c9161 = (C9160) viewM30995.findViewById(R.id.editText2);
        this.f36749 = c9161;
        c9160.m23508(C21905.m48704(), (String) null);
        c9161.m23508(C21905.m48703(), (String) null);
        this.f36743 = viewM30995.findViewById(R.id.linearLayout);
        this.f36740 = (Spinner) viewM30995.findViewById(R.id.spinner);
        CheckBox checkBox = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        this.f36744 = checkBox;
        CheckBox checkBox2 = (CheckBox) viewM30995.findViewById(R.id.checkBox2);
        this.f36746 = checkBox2;
        CheckBox checkBox3 = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        this.f36742 = checkBox3;
        checkBox2.setOnCheckedChangeListener(new C20389(this, 1));
        checkBox.setChecked(interfaceC6025.getBoolean("dex_search_match_case", false));
        checkBox2.setChecked(interfaceC6025.getBoolean("dex_search_regex", false));
        checkBox3.setChecked(interfaceC6025.getBoolean("dex_search_exactly_match", false));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27084(ViewOnClickListenerC10786 viewOnClickListenerC10786, boolean z) {
        viewOnClickListenerC10786.f36745.m23518(z);
        viewOnClickListenerC10786.f36749.m23514(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27086(C10617 c10617) {
        this.f36750 = new C16081(this, c10617.m26797());
        int i = this.f36751.getInt("dex_search_type", 0) == 4 ? 1 : 0;
        Spinner spinner = this.f36740;
        spinner.setSelection(i);
        onItemSelected(null, null, spinner.getSelectedItemPosition(), 0L);
        spinner.setOnItemSelectedListener(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27085() {
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(this.f36747);
        c8067.m21258(this.f36741);
        DialogInterfaceC19356 dialogInterfaceC19356M10334 = C3509.m10334(c8067, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f36748 = dialogInterfaceC19356M10334;
        dialogInterfaceC19356M10334.m44373().setOnClickListener(this);
        this.f36745.m23517(0);
        C16737.m39290(this.f36749.m23516());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C9160 c9160 = this.f36745;
        String string = c9160.m23513().toString();
        C9160 c9161 = this.f36749;
        String string2 = c9161.m23513().toString();
        if (string.isEmpty()) {
            this.f36748.dismiss();
            return;
        }
        boolean zIsChecked = this.f36744.isChecked();
        boolean zIsChecked2 = this.f36746.isChecked();
        boolean zIsChecked3 = this.f36742.isChecked();
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
        this.f36751.edit().putBoolean("dex_search_match_case", zIsChecked).putBoolean("dex_search_regex", zIsChecked2).putBoolean("dex_search_exactly_match", zIsChecked3).apply();
        this.f36748.dismiss();
        this.f36750.mo16056(string, string2, zIsChecked, zIsChecked2, zIsChecked3);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f36742.setVisibility(i == 0 ? 8 : 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27083(ViewOnClickListenerC10786 viewOnClickListenerC10786, Set set, final String str, final String str2, final boolean z, final boolean z2, final boolean z3) {
        C1777 c1777 = new C1777(viewOnClickListenerC10786.f36747);
        c1777.m5837(R.string.MT_Protector);
        c1777.mo5828((Runnable) null);
        c1777.mo5843();
        final C17135 c17135 = new C17135(viewOnClickListenerC10786, c1777);
        final boolean z4 = viewOnClickListenerC10786.f36740.getSelectedItemPosition() == 1;
        final C6094 c6094 = viewOnClickListenerC10786.f36739;
        C13638.requireNonNull(set);
        final C12197 c12197 = new C12197(0, set);
        new Thread(new Runnable() { // from class: l.ܰۨۜ
            @Override // java.lang.Runnable
            public final void run() {
                final C20494 c20494 = new C20494();
                String str3 = str;
                final boolean z5 = z2;
                final C21199 c21199M31636 = C12733.m31636(str3, z5, z);
                final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                C6094 c6095 = c6094;
                c6095.m16539(concurrentLinkedQueue, "", true, (Predicate) c12197);
                final InterfaceC16261 interfaceC16261 = c17135;
                interfaceC16261.mo15795(0);
                final C8516 c8516 = new C8516(concurrentLinkedQueue.size());
                c8516.m22241(new C16041(interfaceC16261));
                final boolean z6 = z4;
                final String str4 = str2;
                final boolean z7 = z3;
                Runnable runnable = new Runnable() { // from class: l.᩹ۨۜ
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC9354 interfaceC9354;
                        ConcurrentLinkedQueue concurrentLinkedQueue2;
                        InterfaceC16261 interfaceC16262;
                        C8516 c8517;
                        C21199 c21199;
                        boolean z8;
                        boolean z9;
                        InterfaceC9354 interfaceC9355;
                        String strM31634;
                        ConcurrentLinkedQueue concurrentLinkedQueue3 = concurrentLinkedQueue;
                        InterfaceC16261 interfaceC16263 = interfaceC16261;
                        C8516 c8518 = c8516;
                        C21199 c211910 = c21199M31636;
                        boolean z10 = z6;
                        String str5 = str4;
                        boolean z11 = z5;
                        boolean z12 = z7;
                        C20494 c20495 = c20494;
                        while (!concurrentLinkedQueue3.isEmpty() && (interfaceC9354 = (InterfaceC9354) concurrentLinkedQueue3.poll()) != null && !interfaceC16263.mo15792()) {
                            c8518.m22242(1);
                            String strMo23998 = interfaceC9354.mo23998();
                            C6222 c6222 = c211910.get();
                            if (z10) {
                                C5763 c5763 = new C5763(strMo23998);
                                C2093 c2093 = new C2093(strMo23998.length());
                                C20494 c20496 = new C20494();
                                int i = 0;
                                concurrentLinkedQueue2 = concurrentLinkedQueue3;
                                int i2 = 0;
                                while (c5763.m15885()) {
                                    InterfaceC16261 interfaceC16264 = interfaceC16263;
                                    int i3 = i;
                                    C20494 c20497 = c20496;
                                    C8516 c8519 = c8518;
                                    C2093 c2094 = c2093;
                                    C21199 c211911 = c211910;
                                    C5763 c5764 = c5763;
                                    boolean z13 = z10;
                                    String str6 = strMo23998;
                                    boolean z14 = z12;
                                    boolean z15 = z12;
                                    InterfaceC9354 interfaceC9356 = interfaceC9354;
                                    String strM31635 = C12733.m31634(c5763.f19580, str5, c6222, z11, z14, c20497);
                                    if (strM31635 != null) {
                                        c2094.append((CharSequence) str6, i2, c5764.f19577);
                                        try {
                                            C9461.m24219(c2094, strM31635);
                                        } catch (IOException unused) {
                                        }
                                        i2 = c5764.f19576;
                                        i = c20497.f66458 + i3;
                                        synchronized (c20497) {
                                            c20497.f66458 = 0;
                                            c20497.f66457 = 0;
                                        }
                                    } else {
                                        i = i3;
                                    }
                                    c20496 = c20497;
                                    c2093 = c2094;
                                    c5763 = c5764;
                                    strMo23998 = str6;
                                    interfaceC9354 = interfaceC9356;
                                    interfaceC16263 = interfaceC16264;
                                    c8518 = c8519;
                                    c211910 = c211911;
                                    z10 = z13;
                                    z12 = z15;
                                }
                                interfaceC16262 = interfaceC16263;
                                c8517 = c8518;
                                c21199 = c211910;
                                z8 = z10;
                                int i4 = i;
                                C2093 c2095 = c2093;
                                String str7 = strMo23998;
                                z9 = z12;
                                interfaceC9355 = interfaceC9354;
                                if (i4 == 0) {
                                    strM31634 = null;
                                } else {
                                    c20495.m46298(i4);
                                    if (i2 < str7.length()) {
                                        c2095.append((CharSequence) str7, i2, str7.length());
                                    }
                                    strM31634 = c2095.toString();
                                }
                            } else {
                                concurrentLinkedQueue2 = concurrentLinkedQueue3;
                                interfaceC16262 = interfaceC16263;
                                c8517 = c8518;
                                c21199 = c211910;
                                z8 = z10;
                                z9 = z12;
                                interfaceC9355 = interfaceC9354;
                                strM31634 = C12733.m31634(strMo23998, str5, c6222, z11, false, c20495);
                            }
                            if (strM31634 != null) {
                                interfaceC9355.mo24000(strM31634);
                            }
                            concurrentLinkedQueue3 = concurrentLinkedQueue2;
                            interfaceC16263 = interfaceC16262;
                            c8518 = c8517;
                            c211910 = c21199;
                            z10 = z8;
                            z12 = z9;
                        }
                    }
                };
                c6095.m16557();
                c6095.m16548(false);
                C12733.m31637((int) (C5464.f18831 * 0.66f), runnable);
                c6095.m16548(true);
                c6095.m16573();
                C16737.m39273(new RunnableC2749(2, interfaceC16261, c20494));
            }
        }).start();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27087(final C20890 c20890) {
        this.f36750 = new InterfaceC5846() { // from class: l.ܽۚۜ
            @Override // l.InterfaceC5846
            /* JADX INFO: renamed from: ۙ */
            public final void mo16056(String str, String str2, boolean z, boolean z2, boolean z3) {
                C20494 c20494 = new C20494();
                C6222 c6222Matcher = C12733.m31638(str, z2, z).matcher((CharSequence) "");
                C20890 c20891 = c20890;
                for (C15246 c15246 : c20891.m46997()) {
                    String strM31634 = C12733.m31634(c15246.m36517(), str2, c6222Matcher, z2, z3, c20494);
                    if (strM31634 != null) {
                        c15246.m36516(strM31634);
                    }
                }
                c20891.m46995();
                c20891.m46996();
                c20891.m46998().notifyDataSetChanged();
                C15829.m37613((CharSequence) c20891.getString(R.string.MT_Protector, Integer.valueOf(c20494.f66458)));
            }
        };
        this.f36743.setVisibility(8);
    }
}
