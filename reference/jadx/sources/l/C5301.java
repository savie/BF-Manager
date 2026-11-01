package l;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.m.y.c;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import java.io.IOException;
import java.net.BindException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.ۚۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes.dex */
public final class C5301 {

    /* JADX INFO: renamed from: ֨֨ۧ, reason: not valid java name and contains not printable characters */
    private static final short[] f18324;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean f18325;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final WeakHashMap f18326;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final BroadcastReceiver f18327;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int f18328;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean f18329;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Set f18330;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native void m14702(TextView textView, TextView textView2, Button button, View view, View view2);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static native void m14721(View view);

    static {
        ApplicationC6132.m17119(75);
        f18324 = new short[]{7710, -12886, 10275, -8393, -10631, 11153, -14519, 12142, -9848, 13091, -11777, 10053, -2099, -23683};
        f18330 = Collections.newSetFromMap(new WeakHashMap());
        f18326 = new WeakHashMap();
        f18327 = new C2478();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14707(final AbstractActivityC12483 abstractActivityC12483) {
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        final TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        final TextView textView2 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        final View viewFindViewById = viewM30995.findViewById(R.id.MT_Protector);
        final View viewFindViewById2 = viewM30995.findViewById(R.id.MT_Protector);
        View viewFindViewById3 = viewM30995.findViewById(R.id.MT_Protector);
        View viewFindViewById4 = viewM30995.findViewById(R.id.MT_Protector);
        final boolean[] zArr = {true};
        final C17481 c17481 = new C17481();
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21276(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21257(new DialogInterface.OnDismissListener() { // from class: l.ۖۛ֨
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C5301.m14714(zArr, abstractActivityC12483, c17481);
            }
        });
        final DialogInterfaceC19356 dialogInterfaceC19356M21252 = c8067BuildDialog.m21252();
        DialogInterfaceC19356[] dialogInterfaceC19356Arr = {dialogInterfaceC19356M21252};
        dialogInterfaceC19356M21252.m44369(new DialogInterface.OnShowListener() { // from class: l.ᩴۛ֨
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                C5301.m14708(abstractActivityC12483, c17481);
            }
        });
        dialogInterfaceC19356M21252.m44362();
        final RunnableC11110 runnableC11110M52471 = C23810.m52471(viewM30995.findViewById(R.id.MT_Protector), abstractActivityC12483, dialogInterfaceC19356M21252);
        int i = 0;
        final Button buttonM44361 = dialogInterfaceC19356M21252.m44361();
        buttonM44361.setOnClickListener(new ViewOnClickListenerC7273(i));
        dialogInterfaceC19356M21252.m44374().setOnClickListener(new View.OnClickListener() { // from class: l.᩷ۛ֨
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v5, types: [l.֫ܿ֨, l.᩹᩺ۙ] */
            /* JADX WARN: Type inference failed for: r5v8, types: [l.ۘۛ֨] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                final AbstractActivityC12483 abstractActivityC12484 = abstractActivityC12483;
                View viewM30996 = abstractActivityC12484.m30995(R.layout.MT_Protector);
                final TabLayout tabLayout = (TabLayout) viewM30996.findViewById(R.id.MT_Protector);
                View[] viewArr = {viewM30996.findViewById(R.id.MT_Protector), viewM30996.findViewById(R.id.MT_Protector), viewM30996.findViewById(R.id.MT_Protector), viewM30996.findViewById(R.id.MT_Protector)};
                int[] iArr = {R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector};
                C20492 c20492 = (C20492) viewM30996.findViewById(R.id.MT_Protector);
                c20492.m44433();
                c20492.m44420(new C5862(viewArr, abstractActivityC12484, iArr));
                tabLayout.setupWithViewPager(c20492);
                final EditText editText = (EditText) viewM30996.findViewById(R.id.MT_Protector);
                final EditText editText2 = (EditText) viewM30996.findViewById(R.id.MT_Protector);
                final EditText editText3 = (EditText) viewM30996.findViewById(R.id.MT_Protector);
                final C12562 c12562 = (C12562) viewM30996.findViewById(R.id.MT_Protector);
                final C12562 c12563 = (C12562) viewM30996.findViewById(R.id.MT_Protector);
                final Button button = (Button) viewM30996.findViewById(R.id.MT_Protector);
                Button button2 = (Button) viewM30996.findViewById(R.id.MT_Protector);
                TextInputLayout textInputLayout = (TextInputLayout) viewM30996.findViewById(R.id.MT_Protector);
                final TextInputLayout textInputLayout2 = (TextInputLayout) viewM30996.findViewById(R.id.MT_Protector);
                final TextInputLayout textInputLayout3 = (TextInputLayout) viewM30996.findViewById(R.id.MT_Protector);
                editText.setText(C16259.m38422().mo33986());
                editText2.setText(String.valueOf(C0403.m2137()));
                editText3.setText(String.valueOf(C16259.m38409()));
                c12562.setChecked(C16259.m38427() && C16125.m38170(abstractActivityC12484));
                c12563.setChecked(ApplicationC0716.f2992.getBoolean("floating_button_stick_to_edge", true));
                c12563.setEnabled(c12562.isChecked());
                button.setEnabled(c12562.isChecked());
                editText.addTextChangedListener(new C10802(textInputLayout, editText));
                editText2.addTextChangedListener(new C23502(textInputLayout2, editText2));
                textInputLayout3.setHelperTextColor(ColorStateList.valueOf(C20368.f65973));
                final RunnableC6192 runnableC6192 = new RunnableC6192(textInputLayout3);
                textInputLayout3.setEndIconVisible(false);
                editText3.addTextChangedListener(new C14330(textInputLayout3, runnableC6192, editText3));
                textInputLayout3.setEndIconOnClickListener(new View.OnClickListener() { // from class: l.ۨۛ֨
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C5301.m14706(textInputLayout3, runnableC6192, editText3, abstractActivityC12484);
                    }
                });
                button.setOnClickListener(new View.OnClickListener() { // from class: l.ۚۛ֨
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i2 = C16259.f52420;
                        C17296.m40261(abstractActivityC12484, C16259.m38411(ApplicationC0716.f2992.getInt("amfbc", 0)), new C19268());
                    }
                });
                C9682.m24639(button);
                final RunnableC22090 runnableC22090 = new RunnableC22090(0, viewM30996);
                runnableC22090.run();
                button2.setOnClickListener(new ViewOnClickListenerC0922(abstractActivityC12484, runnableC22090, 0));
                int i2 = DialogInterfaceC19356.f62401;
                C8067 c8067 = new C8067(abstractActivityC12484);
                c8067.m21274(R.string.MT_Protector);
                c8067.m21258(viewM30996);
                c8067.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c8067.m21265(false);
                final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067.m21269();
                final RunnableC12918 runnableC12918 = new RunnableC12918(0, abstractActivityC12484);
                final C23566 c23566M21925 = ViewOnClickListenerC8374.m21925(abstractActivityC12484.mo4078(), "mcp-home-" + UUID.randomUUID(), new C1628(runnableC12918, dialogInterfaceC19356M21269, abstractActivityC12484, editText));
                C9725.m24679(abstractActivityC12484, textInputLayout, editText, (RunnableC3744) new Runnable() { // from class: l.ۘۛ֨
                    @Override // java.lang.Runnable
                    public final void run() {
                        C23566 c23566 = c23566M21925;
                        EditText editText4 = editText;
                        if (dialogInterfaceC19356M21269.m44375()) {
                            AbstractActivityC12483 abstractActivityC12485 = abstractActivityC12484;
                            if (abstractActivityC12485.isFinishing() || abstractActivityC12485.isDestroyed()) {
                                return;
                            }
                            if (abstractActivityC12485 instanceof ActivityC7109) {
                                ((ActivityC7109) abstractActivityC12485).m18998(true);
                            }
                            try {
                                c23566.m46684(0, R.string.MT_Protector, editText4.getText().toString(), (String) null, (String[]) null, (Bundle) null);
                            } catch (RuntimeException e) {
                                runnableC12918.run();
                                throw e;
                            }
                        }
                    }
                });
                final C20824 c20824M46833 = C20824.m46833(viewArr[2], abstractActivityC12484, dialogInterfaceC19356M21269);
                dialogInterfaceC19356M21269.m44361().setVisibility(8);
                final C12543 c12543M31180 = C12543.m31180(viewArr[3], abstractActivityC12484, dialogInterfaceC19356M21269);
                c20492.m46297((ViewGroup) viewArr[0], (ViewGroup) viewArr[1]);
                final C22959 c22959M50800 = C22959.m50800();
                View viewFindViewById5 = viewM30996.findViewById(R.id.MT_Protector);
                final DialogInterfaceC19356 dialogInterfaceC19356 = dialogInterfaceC19356M21252;
                viewFindViewById5.setOnClickListener(new View.OnClickListener() { // from class: l.ۜۛ֨
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C5301.m14710(c12543M31180, c22959M50800, textInputLayout2, editText2, abstractActivityC12484, dialogInterfaceC19356M21269, dialogInterfaceC19356);
                    }
                });
                final RunnableC22796 runnableC22796 = new RunnableC22796(textInputLayout, editText, abstractActivityC12484, dialogInterfaceC19356M21269, 0);
                final RunnableC15035 runnableC15035 = new RunnableC15035(c20824M46833);
                dialogInterfaceC19356M21269.m44361().setOnClickListener(new View.OnClickListener() { // from class: l.ۧܿ֨
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int selectedTabPosition = tabLayout.getSelectedTabPosition();
                        if (selectedTabPosition == 2) {
                            c20824M46833.m46849();
                        } else if (selectedTabPosition == 3) {
                            c12543M31180.m31200();
                        }
                    }
                });
                tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C9391(viewM30996, abstractActivityC12484, dialogInterfaceC19356M21269, runnableC22090, runnableC15035, viewArr, c12543M31180, runnableC22796));
                c12562.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.᩻ܿ֨
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        C5301.m14709(abstractActivityC12484, dialogInterfaceC19356M21269, c12562, c12563, button, z);
                    }
                });
                c12563.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ܳܿ֨
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        C5301.m14723(c12562, c12563);
                    }
                });
                final ?? r1 = new InterfaceC5657() { // from class: l.֫ܿ֨
                    @Override // l.InterfaceC5657
                    /* JADX INFO: renamed from: ۙ */
                    public final void mo4164(InterfaceC1423 interfaceC1423, EnumC1651 enumC1651) throws Throwable {
                        if (enumC1651 == EnumC1651.ON_RESUME && dialogInterfaceC19356M21269.m44375()) {
                            C12562 c12564 = c12562;
                            if (c12564.isChecked() && !C16125.m38170(abstractActivityC12484)) {
                                c12564.setChecked(false);
                            }
                            runnableC22090.run();
                            runnableC15035.run();
                            c12543M31180.m31201();
                        }
                    }
                };
                abstractActivityC12484.getLifecycle().mo9171(r1);
                dialogInterfaceC19356M21269.m44367(new DialogInterface.OnDismissListener() { // from class: l.ۢܿ֨
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        C5301.m14712(c23566M21925, runnableC12918, c20824M46833, abstractActivityC12484, r1, textInputLayout3, runnableC6192, runnableC22796, textInputLayout2, editText2);
                    }
                });
                final RunnableC3369 runnableC3369 = new RunnableC3369(c12543M31180, dialogInterfaceC19356M21269);
                dialogInterfaceC19356M21269.m44374().setOnClickListener(new ViewOnClickListenerC4450(0, runnableC3369));
                dialogInterfaceC19356M21269.m44368(new DialogInterface.OnKeyListener() { // from class: l.ܰۛ֨
                    @Override // android.content.DialogInterface.OnKeyListener
                    public final boolean onKey(DialogInterface dialogInterface, int i3, KeyEvent keyEvent) {
                        if (i3 != 4) {
                            return false;
                        }
                        if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                            runnableC3369.run();
                        }
                        return true;
                    }
                });
            }
        });
        final C22959 c22959M50800 = C22959.m50800();
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: l.ܺۛ֨
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (c22959M50800.m50802()) {
                    RunnableC12213 runnableC12213 = new RunnableC12213();
                    AbstractActivityC12483 abstractActivityC12484 = abstractActivityC12483;
                    abstractActivityC12484.m30998(runnableC12213);
                    C14057.m34006(abstractActivityC12484);
                    C5301.m14717();
                    C16737.m39274(new RunnableC17856(0), 1000L);
                    C16737.m39274(new RunnableC17856(0), c.a);
                }
            }
        });
        viewFindViewById3.setOnClickListener(new ViewOnClickListenerC19974(c22959M50800, abstractActivityC12483, dialogInterfaceC19356Arr, i));
        viewFindViewById4.setOnClickListener(new ViewOnClickListenerC0217(i, c22959M50800, abstractActivityC12483));
        Runnable runnable = new Runnable() { // from class: l.ܽۛ֨
            @Override // java.lang.Runnable
            public final void run() {
                C5301.m14713(zArr, runnableC11110M52471, textView, textView2, buttonM44361, viewFindViewById, viewFindViewById2);
            }
        };
        viewM30995.setTag(runnable);
        f18330.add(runnable);
        m14717();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14714(boolean[] zArr, AbstractActivityC12483 abstractActivityC12483, C17481 c17481) {
        zArr[0] = false;
        abstractActivityC12483.getLifecycle().mo9172(c17481);
        WeakHashMap weakHashMap = f18326;
        Integer num = (Integer) weakHashMap.get(abstractActivityC12483);
        if (num != null) {
            if (num.intValue() == 1) {
                weakHashMap.remove(abstractActivityC12483);
            } else {
                weakHashMap.put(abstractActivityC12483, Integer.valueOf(num.intValue() - 1));
            }
        }
        int i = f18328;
        if (i != 0) {
            f18328 = i - 1;
            m14698();
        }
        if (abstractActivityC12483 instanceof ActivityC7109) {
            abstractActivityC12483.finish();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14713(boolean[] zArr, RunnableC11110 runnableC11110, TextView textView, TextView textView2, Button button, View view, View view2) {
        if (zArr[0]) {
            runnableC11110.run();
            m14702(textView, textView2, button, view, view2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14703(TextView textView, boolean z) {
        if (z) {
            ViewOnClickListenerC22523.m50034(textView);
            return;
        }
        textView.setOnClickListener(null);
        textView.setClickable(false);
        textView.setFocusable(false);
        textView.setBackground(null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14706(TextInputLayout textInputLayout, RunnableC6192 runnableC6192, EditText editText, AbstractActivityC12483 abstractActivityC12483) {
        textInputLayout.removeCallbacks(runnableC6192);
        runnableC6192.run();
        Integer numM37905 = C15945.m37905(editText.getText().toString());
        if (numM37905 == null) {
            textInputLayout.setError(C16737.m39288(R.string.MT_Protector));
        } else {
            textInputLayout.setError(null);
            textInputLayout.setErrorEnabled(false);
        }
        if (numM37905 == null) {
            return;
        }
        if (!ServiceC8498.m22208() || ServiceC8498.m22215() != numM37905.intValue()) {
            try {
                ServerSocket serverSocket = new ServerSocket();
                try {
                    serverSocket.setReuseAddress(true);
                    serverSocket.bind(new InetSocketAddress(numM37905.intValue()));
                    serverSocket.close();
                } catch (Throwable th) {
                    try {
                        serverSocket.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException | SecurityException e) {
                textInputLayout.setError(C16737.m39264(e instanceof BindException ? R.string.MT_Protector : R.string.MT_Protector, numM37905));
                editText.requestFocus();
                return;
            }
        }
        textInputLayout.setError(null);
        textInputLayout.setErrorEnabled(false);
        int iM38409 = C16259.m38409();
        C16259.m38426(editText.getText().toString());
        textInputLayout.setEndIconVisible(false);
        if (ServiceC8498.m22208() && iM38409 != C16259.m38409()) {
            f18329 = true;
            Application applicationM39277 = C16737.m39277();
            applicationM39277.stopService(new Intent(applicationM39277, (Class<?>) ServiceC8498.class));
        }
        m14717();
        textInputLayout.setHelperText(abstractActivityC12483.getString(R.string.MT_Protector));
        textInputLayout.postDelayed(runnableC6192, 2000L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14710(C12543 c12543, C22959 c22959, TextInputLayout textInputLayout, EditText editText, AbstractActivityC12483 abstractActivityC12483, DialogInterfaceC19356 dialogInterfaceC19356, DialogInterfaceC19356 dialogInterfaceC19357) {
        if (!c12543.m31202() && c22959.m50802() && m14699(textInputLayout, editText)) {
            C0403.m2139(editText.getText().toString());
            C13955.m33801(abstractActivityC12483, new RunnableC7979(0, dialogInterfaceC19356, dialogInterfaceC19357));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14705(TextInputLayout textInputLayout, EditText editText, AbstractActivityC12483 abstractActivityC12483, DialogInterfaceC19356 dialogInterfaceC19356) {
        String strM14718 = m14718(textInputLayout, editText);
        if (strM14718 == null) {
            return;
        }
        try {
            if (!strM14718.equals(C16259.m38422().mo33986())) {
                C16259.m38420(strM14718);
            }
            if (strM14718.equals(editText.getText().toString())) {
                return;
            }
            editText.setText(strM14718);
        } catch (C21197 e) {
            EnumC7792 enumC7792 = e.f68995;
            textInputLayout.setError(abstractActivityC12483.getString(m14700(enumC7792)));
            if (dialogInterfaceC19356.m44375()) {
                return;
            }
            C15829.m37611(m14700(enumC7792));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14709(AbstractActivityC12483 abstractActivityC12483, DialogInterfaceC19356 dialogInterfaceC19356, C12562 c12562, C12562 c12563, Button button, boolean z) {
        if (z && !C6696.m18094(abstractActivityC12483)) {
            c12562.setChecked(false);
            C4595 c4595 = new C4595(new boolean[]{false}, abstractActivityC12483 instanceof ActivityC7109 ? (ActivityC7109) abstractActivityC12483 : null, abstractActivityC12483, dialogInterfaceC19356, c12562);
            try {
                C16125.m38167(abstractActivityC12483, c4595);
            } catch (Throwable th) {
                c4595.mo12740();
                abstractActivityC12483.m31002(th, (DialogInterface.OnDismissListener) null);
            }
        }
        boolean zIsChecked = c12562.isChecked();
        c12563.setEnabled(zIsChecked);
        button.setEnabled(zIsChecked);
        m14723(c12562, c12563);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14712(C23566 c23566, RunnableC12918 runnableC12918, C20824 c20824, AbstractActivityC12483 abstractActivityC12483, C1958 c1958, TextInputLayout textInputLayout, RunnableC6192 runnableC6192, RunnableC22796 runnableC22796, TextInputLayout textInputLayout2, EditText editText) {
        c23566.m46683();
        runnableC12918.run();
        c20824.m46851();
        abstractActivityC12483.getLifecycle().mo9172(c1958);
        textInputLayout.removeCallbacks(runnableC6192);
        runnableC6192.run();
        runnableC22796.run();
        if (m14699(textInputLayout2, editText)) {
            int iM2137 = C0403.m2137();
            C0403.m2139(editText.getText().toString());
            if (C0403.m2137() != iM2137) {
                int i = ServiceC8498.f29454;
                C4716.f16636.execute(new RunnableC17856(1));
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m14718(TextInputLayout textInputLayout, EditText editText) {
        try {
            String strM38414 = C16259.m38414(editText.getText().toString());
            textInputLayout.setError(null);
            textInputLayout.setErrorEnabled(false);
            return strM38414;
        } catch (C21197 e) {
            textInputLayout.setError(C16737.m39288(m14700(e.f68995)));
            return null;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m14723(C12562 c12562, C12562 c12563) {
        if (C16259.m38427() == c12562.isChecked() && ApplicationC0716.f2992.getBoolean("floating_button_stick_to_edge", true) == c12563.isChecked()) {
            return;
        }
        C16259.m38419(c12562.isChecked(), c12563.isChecked());
        ServiceC8498.m22213();
        m14717();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m14700(EnumC7792 enumC7792) {
        int i = C17151.f54705[enumC7792.ordinal()];
        if (i == 1) {
            return R.string.MT_Protector;
        }
        if (i == 2) {
            return R.string.MT_Protector;
        }
        if (i == 3) {
            return R.string.MT_Protector;
        }
        if (i == 4) {
            return R.string.MT_Protector;
        }
        if (i == 5) {
            return R.string.MT_Protector;
        }
        throw new IncompatibleClassChangeError();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m14699(TextInputLayout textInputLayout, EditText editText) {
        try {
            int i = Integer.parseInt(editText.getText().toString().trim());
            if (i < 1 || i > 100) {
                textInputLayout.setError(C16737.m39288(R.string.MT_Protector));
                return false;
            }
            textInputLayout.setError(null);
            textInputLayout.setErrorEnabled(false);
            return true;
        } catch (NumberFormatException unused) {
            textInputLayout.setError(C16737.m39288(R.string.MT_Protector));
            return false;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m14717() {
        Iterator it = f18330.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m14716(Main main) {
        return main != null && main.getLifecycle().mo9170().m24173(EnumC9414.RESUMED) && f18326.containsKey(main);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14708(AbstractActivityC12483 abstractActivityC12483, C17481 c17481) {
        if (!f18325) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.WIFI_AP_STATE_CHANGED");
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            Application applicationM39277 = C16737.m39277();
            BroadcastReceiver broadcastReceiver = f18327;
            applicationM39277.registerReceiver(broadcastReceiver, intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("bin.mt.mcp.ACTION_STARTED");
            intentFilter2.addAction("bin.mt.mcp.ACTION_STOPPED");
            intentFilter2.addAction("bin.mt.mcp.ACTION_FAILED_TO_START");
            C16737.m39269(broadcastReceiver, intentFilter2);
            f18325 = true;
        }
        f18328++;
        WeakHashMap weakHashMap = f18326;
        Integer num = (Integer) weakHashMap.get(abstractActivityC12483);
        weakHashMap.put(abstractActivityC12483, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        abstractActivityC12483.getLifecycle().mo9171(c17481);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m14698() {
        if (f18325 && f18328 == 0 && !f18329) {
            Application applicationM39277 = C16737.m39277();
            BroadcastReceiver broadcastReceiver = f18327;
            applicationM39277.unregisterReceiver(broadcastReceiver);
            C16737.m39268(broadcastReceiver);
            f18325 = false;
        }
    }
}
