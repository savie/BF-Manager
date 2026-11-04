package l;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.tabs.TabLayout;
import java.io.IOException;
import java.net.BindException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.ۛ᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes.dex */
public final class C6679 {

    /* JADX INFO: renamed from: ۘ֫᩺, reason: not valid java name and contains not printable characters */
    private static final short[] f22258;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final WeakHashMap f22259;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int f22260;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Set f22261;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final BroadcastReceiver f22262;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean f22263;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean f22264;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native void m18676(TextView textView, TextView textView2, Button button, View view, View view2);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static native void m18695(View view);

    static {
        ApplicationC23172.m52091(68);
        f22258 = new short[]{5618, -5384, 4831, 1404, -4820, -1068, 9956, 1746, -1259, 8993, 11666, -2949, 109, 29168};
        f22261 = Collections.newSetFromMap(new WeakHashMap());
        f22259 = new WeakHashMap();
        f22262 = new C12644();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18683(final AbstractActivityC17204 abstractActivityC17204) {
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        final TextView textView = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        final TextView textView2 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        final View viewFindViewById = viewM40395.findViewById(R.id.MT_Protector);
        final View viewFindViewById2 = viewM40395.findViewById(R.id.MT_Protector);
        View viewFindViewById3 = viewM40395.findViewById(R.id.MT_Protector);
        View viewFindViewById4 = viewM40395.findViewById(R.id.help);
        View viewFindViewById5 = viewM40395.findViewById(R.id.MT_Protector);
        View[] viewArr = {viewFindViewById5, viewFindViewById3, viewFindViewById4};
        for (int i = 0; i < 3; i++) {
            View view = viewArr[i];
            C6696.m18717(view, view.getContentDescription());
        }
        final boolean[] zArr = {true};
        final C22736 c22736 = new C22736();
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8023(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8004(new DialogInterface.OnDismissListener() { // from class: l.᩹ۤۚ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C6679.m18688(zArr, abstractActivityC17204, c22736);
            }
        });
        final DialogInterfaceC8327 dialogInterfaceC8327M7999 = c2361BuildDialog.m7999();
        dialogInterfaceC8327M7999.m22435().addFlags(128);
        DialogInterfaceC8327[] dialogInterfaceC8327Arr = {dialogInterfaceC8327M7999};
        dialogInterfaceC8327M7999.m22428(new DialogInterface.OnShowListener() { // from class: l.۟ۤۚ
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                C6679.m18685(abstractActivityC17204, c22736);
            }
        });
        dialogInterfaceC8327M7999.m22432();
        final RunnableC1444 runnableC1444M25158 = C9646.m25158(viewM40395.findViewById(R.id.MT_Protector), abstractActivityC17204, dialogInterfaceC8327M7999);
        final Button buttonM22440 = dialogInterfaceC8327M7999.m22440();
        buttonM22440.setOnClickListener(new ViewOnClickListenerC13784());
        dialogInterfaceC8327M7999.m22433().setOnClickListener(new View.OnClickListener() { // from class: l.ۙ᩸ۚ
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [l.ܽۤۚ, l.᩷᩻ۙ] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                final AbstractActivityC17204 abstractActivityC17205 = abstractActivityC17204;
                View viewM40396 = abstractActivityC17205.m40395(R.layout.MT_Protector);
                final TabLayout tabLayout = (TabLayout) viewM40396.findViewById(R.id.MT_Protector);
                View[] viewArr2 = {viewM40396.findViewById(R.id.MT_Protector), viewM40396.findViewById(R.id.MT_Protector), viewM40396.findViewById(R.id.MT_Protector), viewM40396.findViewById(R.id.MT_Protector)};
                int[] iArr = {R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector};
                C7950 c7950 = (C7950) viewM40396.findViewById(R.id.MT_Protector);
                c7950.m36522(3);
                c7950.m36514(new C5933(viewArr2, abstractActivityC17205, iArr));
                tabLayout.setupWithViewPager(c7950);
                C23255 c23255 = (C23255) viewM40396.findViewById(R.id.MT_Protector);
                final C23255 c23256 = (C23255) viewM40396.findViewById(R.id.MT_Protector);
                final C23255 c23257 = (C23255) viewM40396.findViewById(R.id.MT_Protector);
                final C1255 c1255 = (C1255) viewM40396.findViewById(R.id.MT_Protector);
                C1255 c1256 = (C1255) viewM40396.findViewById(R.id.MT_Protector);
                c1256.setChecked((1 & C4422.m14043()) != 0);
                c1256.setOnCheckedChangeListener(new C15276());
                viewM40396.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC12293(c1256, 0));
                final C1255 c1257 = (C1255) viewM40396.findViewById(R.id.MT_Protector);
                final Button button = (Button) viewM40396.findViewById(R.id.MT_Protector);
                Button button2 = (Button) viewM40396.findViewById(R.id.MT_Protector);
                C1626 c1626 = (C1626) viewM40396.findViewById(R.id.MT_Protector);
                final C1626 c1627 = (C1626) viewM40396.findViewById(R.id.MT_Protector);
                final C1626 c1628 = (C1626) viewM40396.findViewById(R.id.MT_Protector);
                c23255.mo52335((CharSequence) C0492.m2374().mo4294());
                c23256.mo52335((CharSequence) String.valueOf(C9881.m25689()));
                c23257.mo52335((CharSequence) String.valueOf(C0492.m2384()));
                c1255.setChecked(C0492.m2379() && C7543.m20616(abstractActivityC17205));
                c1257.setChecked(ApplicationC17729.f58258.getBoolean("floating_button_stick_to_edge", true));
                c1257.setEnabled(c1255.isChecked());
                button.setEnabled(c1255.isChecked());
                c23255.m53899(new C2204(c1626, c23255));
                c23256.m53899(new C11898(c1627, c23256));
                c1628.m5758(ColorStateList.valueOf(C3296.f10768));
                final RunnableC24228 runnableC24228 = new RunnableC24228(0, c1628);
                c1628.m5763(false);
                c23257.m53899(new C25325(c1628, runnableC24228, c23257));
                c1628.m5759(new View.OnClickListener() { // from class: l.ۘۤۚ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        C6679.m18681(c1628, runnableC24228, c23257, abstractActivityC17205);
                    }
                });
                button.setOnClickListener(new View.OnClickListener() { // from class: l.ܰۤۚ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        int i2 = C0492.f2135;
                        C2116.m7296(abstractActivityC17205, C0492.m2365(ApplicationC17729.f58258.getInt("amfbc", 0)), new C7073());
                    }
                });
                C2930.m9576(button);
                int i2 = 0;
                final RunnableC21244 runnableC21244 = new RunnableC21244(i2, viewM40396);
                runnableC21244.run();
                button2.setOnClickListener(new ViewOnClickListenerC18260(i2, abstractActivityC17205, runnableC21244));
                int i3 = DialogInterfaceC8327.f27315;
                C2361 c2361 = new C2361(abstractActivityC17205);
                c2361.m8021(R.string.MT_Protector);
                c2361.m8005(viewM40396);
                c2361.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c2361.m8012(false);
                final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361.m8016();
                final RunnableC0361 runnableC0361 = new RunnableC0361(0, abstractActivityC17205);
                final C20956 c20956M28898 = ViewOnClickListenerC11499.m28898(abstractActivityC17205.mo16524(), "mcp-home-" + UUID.randomUUID(), new C17119(runnableC0361, dialogInterfaceC8327M8016, abstractActivityC17205, c23255));
                C15242.m36583(abstractActivityC17205, c1626, c23255, new RunnableC19006(dialogInterfaceC8327M8016, abstractActivityC17205, c20956M28898, c23255, runnableC0361, 0));
                final C11064 c11064M27953 = C11064.m27953(viewArr2[2], abstractActivityC17205, dialogInterfaceC8327M8016);
                dialogInterfaceC8327M8016.m22440().setVisibility(8);
                final C8893 c8893M23784 = C8893.m23784(viewArr2[3], abstractActivityC17205, dialogInterfaceC8327M8016);
                c7950.m21644((ViewGroup) viewArr2[0], (ViewGroup) viewArr2[1]);
                final C24720 c24720M55197 = C24720.m55197();
                View viewFindViewById6 = viewM40396.findViewById(R.id.MT_Protector);
                final DialogInterfaceC8327 dialogInterfaceC8327 = dialogInterfaceC8327M7999;
                viewFindViewById6.setOnClickListener(new View.OnClickListener() { // from class: l.ۢۤۚ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        C6679.m18682(c8893M23784, c24720M55197, c1627, c23256, abstractActivityC17205, dialogInterfaceC8327M8016, dialogInterfaceC8327);
                    }
                });
                final RunnableC13039 runnableC13039 = new RunnableC13039(c1626, c23255, abstractActivityC17205, dialogInterfaceC8327M8016, 0);
                final RunnableC5582 runnableC5582 = new RunnableC5582(c11064M27953);
                dialogInterfaceC8327M8016.m22440().setOnClickListener(new View.OnClickListener() { // from class: l.֫ۤۚ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        int selectedTabPosition = tabLayout.getSelectedTabPosition();
                        if (selectedTabPosition == 2) {
                            c11064M27953.m27973();
                        } else if (selectedTabPosition == 3) {
                            c8893M23784.m23808();
                        }
                    }
                });
                tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C17865(viewM40396, abstractActivityC17205, dialogInterfaceC8327M8016, runnableC21244, runnableC5582, viewArr2, c8893M23784, runnableC13039));
                c1255.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۧۤۚ
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        C6679.m18684(abstractActivityC17205, dialogInterfaceC8327M8016, c1255, c1257, button, z);
                    }
                });
                viewM40396.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC24974(0, c1255));
                c1257.setOnCheckedChangeListener(new C16768(c1255, c1257, 0));
                final ?? r1 = new InterfaceC5252() { // from class: l.ܽۤۚ
                    @Override // l.InterfaceC5252
                    /* JADX INFO: renamed from: ۙ */
                    public final void mo2183(InterfaceC11217 interfaceC11217, EnumC9330 enumC9330) {
                        if (enumC9330 == EnumC9330.ON_RESUME && dialogInterfaceC8327M8016.m22434()) {
                            C1255 c1258 = c1255;
                            if (c1258.isChecked() && !C7543.m20616(abstractActivityC17205)) {
                                c1258.setChecked(false);
                            }
                            runnableC21244.run();
                            runnableC5582.run();
                            c8893M23784.m23809();
                        }
                    }
                };
                abstractActivityC17205.getLifecycle().mo23077(r1);
                dialogInterfaceC8327M8016.m22426(new DialogInterface.OnDismissListener() { // from class: l.ܶۤۚ
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        C6679.m18686(c20956M28898, runnableC0361, c11064M27953, abstractActivityC17205, r1, c1628, runnableC24228, runnableC13039, c1627, c23256);
                    }
                });
                final RunnableC3344 runnableC3344 = new RunnableC3344(c8893M23784, dialogInterfaceC8327M8016);
                dialogInterfaceC8327M8016.m22433().setOnClickListener(new ViewOnClickListenerC20498(0, runnableC3344));
                dialogInterfaceC8327M8016.m22427(new DialogInterface.OnKeyListener() { // from class: l.ۛۤۚ
                    @Override // android.content.DialogInterface.OnKeyListener
                    public final boolean onKey(DialogInterface dialogInterface, int i4, KeyEvent keyEvent) {
                        if (i4 != 4) {
                            return false;
                        }
                        if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                            runnableC3344.run();
                        }
                        return true;
                    }
                });
            }
        });
        final C24720 c24720M55197 = C24720.m55197();
        viewFindViewById5.setOnClickListener(new View.OnClickListener() { // from class: l.᩷᩸ۚ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                if (c24720M55197.m55199()) {
                    int i2 = ActivityC9572.f30971;
                    AbstractActivityC17204 abstractActivityC17205 = abstractActivityC17204;
                    ActivityC20852 activityC20852 = abstractActivityC17205 instanceof ActivityC20852 ? (ActivityC20852) abstractActivityC17205 : null;
                    boolean z = true;
                    if (activityC20852 != null) {
                        activityC20852.m47680(true);
                        activityC20852.m40399(new RunnableC14793(0, activityC20852));
                    }
                    try {
                        Intent intent = new Intent(abstractActivityC17205, (Class<?>) ActivityC9572.class);
                        if (activityC20852 == null) {
                            z = false;
                        }
                        abstractActivityC17205.startActivity(intent.putExtra("mcp_log_return_to_manager", z));
                    } catch (RuntimeException e) {
                        if (activityC20852 != null) {
                            activityC20852.m47680(false);
                            activityC20852.m40399((Runnable) null);
                        }
                        throw e;
                    }
                }
            }
        });
        int i2 = 0;
        viewFindViewById2.setOnClickListener(new ViewOnClickListenerC11152(i2, c24720M55197, abstractActivityC17204));
        viewFindViewById3.setOnClickListener(new ViewOnClickListenerC23087(c24720M55197, abstractActivityC17204, dialogInterfaceC8327Arr, i2));
        viewFindViewById4.setOnClickListener(new View.OnClickListener() { // from class: l.ᩴ᩸ۚ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                if (c24720M55197.m55199()) {
                    ActivityC20934.m47864((Context) abstractActivityC17204, C13047.m32502(), true);
                }
            }
        });
        Runnable runnable = new Runnable() { // from class: l.ܳ᩸ۚ
            @Override // java.lang.Runnable
            public final void run() {
                C6679.m18687(zArr, runnableC1444M25158, textView, textView2, buttonM22440, viewFindViewById, viewFindViewById2);
            }
        };
        viewM40395.setTag(runnable);
        f22261.add(runnable);
        m18693();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18688(boolean[] zArr, AbstractActivityC17204 abstractActivityC17204, C22736 c22736) {
        zArr[0] = false;
        abstractActivityC17204.getLifecycle().mo23078(c22736);
        WeakHashMap weakHashMap = f22259;
        Integer num = (Integer) weakHashMap.get(abstractActivityC17204);
        if (num != null) {
            if (num.intValue() == 1) {
                weakHashMap.remove(abstractActivityC17204);
            } else {
                weakHashMap.put(abstractActivityC17204, Integer.valueOf(num.intValue() - 1));
            }
        }
        int i = f22260;
        if (i != 0) {
            f22260 = i - 1;
            m18698();
        }
        if (abstractActivityC17204 instanceof ActivityC20852) {
            abstractActivityC17204.finish();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18687(boolean[] zArr, RunnableC1444 runnableC1444, TextView textView, TextView textView2, Button button, View view, View view2) {
        if (zArr[0]) {
            runnableC1444.run();
            m18676(textView, textView2, button, view, view2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18677(TextView textView, boolean z) {
        if (z) {
            ViewOnClickListenerC15284.m36686(textView);
            return;
        }
        textView.setOnClickListener(null);
        textView.setClickable(false);
        textView.setFocusable(false);
        textView.setBackground(null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18681(C1626 c1626, RunnableC24228 runnableC24228, C23255 c23255, AbstractActivityC17204 abstractActivityC17204) {
        c1626.removeCallbacks(runnableC24228);
        runnableC24228.run();
        Integer numM43756 = C18856.m43756(c23255.m54021().toString());
        if (numM43756 == null) {
            c1626.m5768(C21576.m49088(R.string.MT_Protector));
        } else {
            c1626.m5768((CharSequence) null);
            c1626.m5769(false);
        }
        if (numM43756 == null) {
            return;
        }
        if (!ServiceC6459.m18242() || ServiceC6459.m18246() != numM43756.intValue()) {
            try {
                ServerSocket serverSocket = new ServerSocket();
                try {
                    serverSocket.setReuseAddress(true);
                    serverSocket.bind(new InetSocketAddress(numM43756.intValue()));
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
                c1626.m5768(C21576.m49059(e instanceof BindException ? R.string.MT_Protector : R.string.MT_Protector, numM43756));
                c23255.requestFocus();
                return;
            }
        }
        c1626.m5768((CharSequence) null);
        c1626.m5769(false);
        int iM2384 = C0492.m2384();
        C0492.m2378(c23255.m54021().toString());
        c1626.m5763(false);
        if (ServiceC6459.m18242() && iM2384 != C0492.m2384()) {
            f22263 = true;
            Application applicationM49084 = C21576.m49084();
            applicationM49084.stopService(new Intent(applicationM49084, (Class<?>) ServiceC6459.class));
        }
        m18693();
        c1626.m5764(abstractActivityC17204.getString(R.string.MT_Protector));
        c1626.postDelayed(runnableC24228, 2000L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18682(C8893 c8893, C24720 c24720, C1626 c1626, C23255 c23255, AbstractActivityC17204 abstractActivityC17204, DialogInterfaceC8327 dialogInterfaceC8327, DialogInterfaceC8327 dialogInterfaceC8328) {
        if (!c8893.m23810() && c24720.m55199() && m18699(c1626, c23255)) {
            C9881.m25691(c23255.m54021().toString());
            C23065.m51972(abstractActivityC17204, new RunnableC11478(1, dialogInterfaceC8327, dialogInterfaceC8328));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18680(C1626 c1626, C23255 c23255, AbstractActivityC17204 abstractActivityC17204, DialogInterfaceC8327 dialogInterfaceC8327) {
        String strM18691 = m18691(c1626, c23255);
        if (strM18691 == null) {
            return;
        }
        try {
            if (!strM18691.equals(C0492.m2374().mo4294())) {
                C0492.m2380(strM18691);
            }
            if (strM18691.equals(c23255.m54021().toString())) {
                return;
            }
            c23255.mo52335((CharSequence) strM18691);
        } catch (C18391 e) {
            EnumC21375 enumC21375 = e.f59906;
            c1626.m5768(abstractActivityC17204.getString(m18674(enumC21375)));
            if (dialogInterfaceC8327.m22434()) {
                return;
            }
            C22673.m51152(m18674(enumC21375));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18684(AbstractActivityC17204 abstractActivityC17204, DialogInterfaceC8327 dialogInterfaceC8327, C1255 c1255, C1255 c1256, Button button, boolean z) {
        if (z && !C7756.m21107(abstractActivityC17204)) {
            c1255.setChecked(false);
            C23833 c23833 = new C23833(c1255, abstractActivityC17204, abstractActivityC17204 instanceof ActivityC20852 ? (ActivityC20852) abstractActivityC17204 : null, dialogInterfaceC8327, new boolean[]{false});
            try {
                C7543.m20612(abstractActivityC17204, c23833);
            } catch (Throwable th) {
                c23833.mo1153();
                abstractActivityC17204.m40401(th, (DialogInterface.OnDismissListener) null);
            }
        }
        boolean zIsChecked = c1255.isChecked();
        c1256.setEnabled(zIsChecked);
        button.setEnabled(zIsChecked);
        m18696(c1255, c1256);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18686(C20956 c20956, RunnableC0361 runnableC0361, C11064 c11064, AbstractActivityC17204 abstractActivityC17204, C17514 c17514, C1626 c1626, RunnableC24228 runnableC24228, RunnableC13039 runnableC13039, C1626 c1627, C23255 c23255) {
        c20956.m37642();
        runnableC0361.run();
        c11064.m27975();
        abstractActivityC17204.getLifecycle().mo23078(c17514);
        c1626.removeCallbacks(runnableC24228);
        runnableC24228.run();
        runnableC13039.run();
        if (m18699(c1627, c23255)) {
            int iM25689 = C9881.m25689();
            C9881.m25691(c23255.m54021().toString());
            if (C9881.m25689() != iM25689) {
                int i = ServiceC6459.f21716;
                C5261.f18540.execute(new RunnableC13814(3));
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m18691(C1626 c1626, C23255 c23255) {
        try {
            String strM2368 = C0492.m2368(c23255.m54021().toString());
            c1626.m5768((CharSequence) null);
            c1626.m5769(false);
            return strM2368;
        } catch (C18391 e) {
            c1626.m5768(C21576.m49088(m18674(e.f59906)));
            return null;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m18696(C1255 c1255, C1255 c1256) {
        if (C0492.m2379() == c1255.isChecked() && ApplicationC17729.f58258.getBoolean("floating_button_stick_to_edge", true) == c1256.isChecked()) {
            return;
        }
        C0492.m2373(c1255.isChecked(), c1256.isChecked());
        ServiceC6459.m18248();
        m18693();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m18674(EnumC21375 enumC21375) {
        int i = C13390.f42680[enumC21375.ordinal()];
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

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m18699(C1626 c1626, C23255 c23255) {
        try {
            int i = Integer.parseInt(c23255.m54021().toString().trim());
            if (i < 1 || i > 100) {
                c1626.m5768(C21576.m49088(R.string.MT_Protector));
                return false;
            }
            c1626.m5768((CharSequence) null);
            c1626.m5769(false);
            return true;
        } catch (NumberFormatException unused) {
            c1626.m5768(C21576.m49088(R.string.MT_Protector));
            return false;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m18693() {
        Iterator it = f22261.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m18690(Main main) {
        return main != null && main.getLifecycle().mo23076().m8762(EnumC2619.RESUMED) && f22259.containsKey(main);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18685(AbstractActivityC17204 abstractActivityC17204, C22736 c22736) {
        if (!f22264) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.WIFI_AP_STATE_CHANGED");
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            Application applicationM49084 = C21576.m49084();
            BroadcastReceiver broadcastReceiver = f22262;
            applicationM49084.registerReceiver(broadcastReceiver, intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("bin.mt.mcp.ACTION_STARTED");
            intentFilter2.addAction("bin.mt.mcp.ACTION_STOPPED");
            intentFilter2.addAction("bin.mt.mcp.ACTION_FAILED_TO_START");
            C21576.m49064(broadcastReceiver, intentFilter2);
            f22264 = true;
        }
        f22260++;
        WeakHashMap weakHashMap = f22259;
        Integer num = (Integer) weakHashMap.get(abstractActivityC17204);
        weakHashMap.put(abstractActivityC17204, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        abstractActivityC17204.getLifecycle().mo23077(c22736);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m18698() {
        if (f22264 && f22260 == 0 && !f22263) {
            Application applicationM49084 = C21576.m49084();
            BroadcastReceiver broadcastReceiver = f22262;
            applicationM49084.unregisterReceiver(broadcastReceiver);
            C21576.m49063(broadcastReceiver);
            f22264 = false;
        }
    }
}
