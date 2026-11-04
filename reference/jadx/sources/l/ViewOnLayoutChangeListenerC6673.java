package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.TextView;
import bin.mt.plus.R;
import com.umeng.analytics.pro.o;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛ᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes3.dex */
public class ViewOnLayoutChangeListenerC6673 extends AbstractActivityC17204 implements InterfaceC9654, View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f22246 = 0;

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public C3347 f22247;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public int f22248;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f22249 = new ArrayList();

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public ServiceConnection f22250 = new ServiceConnectionC20843(this);

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public View f22251;

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC2943 f22252;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public TextView f22253;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public BinderC16784 f22254;

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public C8580 f22255;

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "TerminalActivity";
    }

    @Override // l.ActivityC7405
    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int mo18669() {
        SharedPreferences sharedPreferences = ApplicationC17729.f58262;
        return (sharedPreferences == null || !sharedPreferences.getBoolean("term_keep_dark", true)) ? -100 : 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18653(AbstractActivityC17204 abstractActivityC17204, boolean z) {
        Window window = abstractActivityC17204.getWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            window.setStatusBarColor(C9217.m24386(abstractActivityC17204.getResources(), R.color.MT_Protector, abstractActivityC17204.getTheme()));
        } else {
            window.setStatusBarColor(C9217.m24386(abstractActivityC17204.getResources(), R.color.MT_Protector, abstractActivityC17204.getTheme()));
            View decorView = window.getDecorView();
            int i2 = i >= 26 ? o.a.y : 8192;
            if (z) {
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (~i2));
            } else {
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | i2);
            }
        }
        if (i >= 27) {
            window.setNavigationBarColor(C9217.m24386(abstractActivityC17204.getResources(), R.color.MT_Protector, abstractActivityC17204.getTheme()));
        }
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        this.f56044 = false;
        setTheme(C7207.m19791());
        super.onCreate(bundle);
        m40418(R.layout.MT_Protector);
        m40418(R.string.MT_Protector);
        boolean zM52629 = C23434.m52629(this);
        C4435.f15888 = zM52629;
        m18653(this, zM52629);
        runOnUiThread(new RunnableC6235(2, this, new RunnableC2198(0, this)));
        this.f22252 = new ViewOnClickListenerC2943(this, this);
        this.f22247 = C12296.m30693(this, new C20995(this));
        View viewM40418 = m40418(R.id.MT_Protector);
        this.f22251 = viewM40418;
        this.f22253 = (TextView) viewM40418.findViewById(R.id.MT_Protector);
        int i = 0;
        this.f22251.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC11892(this, i));
        this.f22251.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC25319(i, this));
        C7508.m20562(this, new Intent(this, (Class<?>) ServiceC17530.class));
        bindService(new Intent(this, (Class<?>) ServiceC17530.class), this.f22250, 64);
        C8580 c8580 = (C8580) m40418(R.id.MT_Protector);
        this.f22255 = c8580;
        c8580.addOnLayoutChangeListener(this);
        m18665();
        this.f22255.m23061(new C16367(this));
        C0949.m3772((AbstractActivityC17204) this, (Runnable) new RunnableC21244(4, this), false);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m18658(ViewOnLayoutChangeListenerC6673 viewOnLayoutChangeListenerC6673) {
        viewOnLayoutChangeListenerC6673.m18665();
        AbstractC1365 abstractC1365M13854 = viewOnLayoutChangeListenerC6673.m13854();
        SharedPreferences sharedPreferences = ApplicationC17729.f58262;
        abstractC1365M13854.mo5049((sharedPreferences == null || !sharedPreferences.getBoolean("term_keep_dark", true)) ? -100 : 2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18644(ViewOnLayoutChangeListenerC6673 viewOnLayoutChangeListenerC6673) {
        BinderC16784 binderC16784 = viewOnLayoutChangeListenerC6673.f22254;
        if (binderC16784 != null) {
            String strM39640 = binderC16784.m39640();
            if (!TextUtils.isEmpty(strM39640)) {
                viewOnLayoutChangeListenerC6673.f22254.m39643(strM39640.length() - strM39640.lastIndexOf("\n"));
                viewOnLayoutChangeListenerC6673.f22254.m39631(viewOnLayoutChangeListenerC6673.f22253.getText().toString() + "\r");
            }
        }
        viewOnLayoutChangeListenerC6673.f22251.setVisibility(8);
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    private void m18665() {
        int i;
        try {
            i = Integer.parseInt(ApplicationC17729.f58262.getString("term_font_size", "12"));
        } catch (Exception unused) {
            i = 12;
        }
        this.f22248 = i;
        this.f22255.m23058(i);
        this.f22255.m23059(C0706.m3027());
    }

    @Override // l.ActivityC4348, l.ActivityC3409, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        runOnUiThread(new RunnableC6235(2, this, new RunnableC6915(0, this)));
    }

    @Override // l.InterfaceC9654
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18668(View view) {
        C18452 c18452 = new C18452(this, view, 0);
        C9898 c9898M42995 = c18452.m42995();
        BinderC16784 binderC16784 = this.f22254;
        if (binderC16784 != null) {
            ServiceC17530 serviceC17530 = binderC16784.f54158;
            if (serviceC17530.f56977 != null || serviceC17530.f56978 != null) {
                c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            } else {
                c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            }
            c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        }
        c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        BinderC16784 binderC16785 = this.f22254;
        if (binderC16785 != null && binderC16785.m39637()) {
            c9898M42995.add(0, android.R.string.paste, 0, android.R.string.paste).setIcon(R.drawable.MT_Protector).setEnabled(this.f22255.m23063());
        }
        c18452.m42994(new C17859(this));
        c9898M42995.setOptionalIconsVisible(true);
        c18452.mo21878();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18646(ViewOnLayoutChangeListenerC6673 viewOnLayoutChangeListenerC6673, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 17039371) {
            viewOnLayoutChangeListenerC6673.f22255.m23065();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            viewOnLayoutChangeListenerC6673.f22247.m11000(ActivityC7418.class);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            C2361 c2361BuildDialog = viewOnLayoutChangeListenerC6673.buildDialog();
            c2361BuildDialog.m8021(R.string.MT_Protector);
            c2361BuildDialog.m8000(R.string.MT_Protector);
            c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC23081(0, viewOnLayoutChangeListenerC6673));
            c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361BuildDialog.m8016();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            C2361 c2361BuildDialog2 = viewOnLayoutChangeListenerC6673.buildDialog();
            c2361BuildDialog2.m8021(R.string.MT_Protector);
            c2361BuildDialog2.m8000(R.string.MT_Protector);
            c2361BuildDialog2.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC20097(0, viewOnLayoutChangeListenerC6673));
            c2361BuildDialog2.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361BuildDialog2.m8018(R.string.MT_Protector, new DialogInterfaceOnClickListenerC15621(0, viewOnLayoutChangeListenerC6673));
            c2361BuildDialog2.m8016();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            ServiceC17530 serviceC17530 = viewOnLayoutChangeListenerC6673.f22254.f54158;
            if (serviceC17530.f56977 != null || serviceC17530.f56978 != null) {
                menuItem.setIcon(R.drawable.MT_Protector);
                viewOnLayoutChangeListenerC6673.f22254.m39645(true);
            } else {
                menuItem.setIcon(R.drawable.MT_Protector);
                viewOnLayoutChangeListenerC6673.f22254.m39635(true);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18643(ViewOnLayoutChangeListenerC6673 viewOnLayoutChangeListenerC6673) {
        BinderC16784 binderC16784 = viewOnLayoutChangeListenerC6673.f22254;
        if (binderC16784 != null) {
            binderC16784.m39644(viewOnLayoutChangeListenerC6673.f22255, ApplicationC17729.f58262.getBoolean("term_create_session_as_root", false));
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18657(ViewOnLayoutChangeListenerC6673 viewOnLayoutChangeListenerC6673) {
        BinderC16784 binderC16784 = viewOnLayoutChangeListenerC6673.f22254;
        if (binderC16784 == null || binderC16784.m39636(viewOnLayoutChangeListenerC6673.f22255)) {
            viewOnLayoutChangeListenerC6673.finish();
        }
    }

    @Override // l.InterfaceC9654
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo18670() {
        BinderC16784 binderC16784 = this.f22254;
        if (binderC16784 == null) {
            return;
        }
        final CharSequence[] charSequenceArrM39641 = binderC16784.m39641();
        C2361 c2361BuildDialog = buildDialog();
        c2361BuildDialog.m8013(charSequenceArrM39641, this.f22254.m39638(), new DialogInterfaceOnClickListenerC13626(this, 0));
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8022(R.string.MT_Protector, new DialogInterfaceOnClickListenerC10689(2, this));
        c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        dialogInterfaceC8327M8016.m22440().setOnClickListener(new ViewOnClickListenerC5181(this, dialogInterfaceC8327M8016, 0));
        dialogInterfaceC8327M8016.m22437().setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: l.᩷᩷᩻
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
                ViewOnLayoutChangeListenerC6673.m18652(this.f72310, charSequenceArrM39641, dialogInterfaceC8327M8016, i);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18645(ViewOnLayoutChangeListenerC6673 viewOnLayoutChangeListenerC6673, DialogInterface dialogInterface, int i) {
        viewOnLayoutChangeListenerC6673.f22254.m39632(viewOnLayoutChangeListenerC6673.f22255, i);
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m18655(ViewOnLayoutChangeListenerC6673 viewOnLayoutChangeListenerC6673) {
        viewOnLayoutChangeListenerC6673.f22254.m39634(viewOnLayoutChangeListenerC6673.f22255, ApplicationC17729.f58262.getBoolean("term_create_session_as_root", false), false, viewOnLayoutChangeListenerC6673.f22248);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18650(final ViewOnLayoutChangeListenerC6673 viewOnLayoutChangeListenerC6673, final DialogInterfaceC8327 dialogInterfaceC8327, View view) {
        C18452 c18452 = new C18452(viewOnLayoutChangeListenerC6673, view, 0);
        C9898 c9898M42995 = c18452.m42995();
        if (C20340.m46731() != null) {
            c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setEnabled(viewOnLayoutChangeListenerC6673.f22254.m39646() > 1);
        c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c18452.m42994(new InterfaceC21436() { // from class: l.۫᩷᩻
            @Override // l.InterfaceC21436
            public final boolean onMenuItemClick(MenuItem menuItem) {
                ViewOnLayoutChangeListenerC6673.m18649(this.f42668, dialogInterfaceC8327, menuItem);
                return true;
            }
        });
        c18452.mo21878();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18649(ViewOnLayoutChangeListenerC6673 viewOnLayoutChangeListenerC6673, DialogInterfaceC8327 dialogInterfaceC8327, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            viewOnLayoutChangeListenerC6673.f22254.m39634(viewOnLayoutChangeListenerC6673.f22255, ApplicationC17729.f58262.getBoolean("term_create_session_as_root", false), true, viewOnLayoutChangeListenerC6673.f22248);
            dialogInterfaceC8327.dismiss();
        } else if (itemId == R.string.MT_Protector) {
            viewOnLayoutChangeListenerC6673.f22254.m39628();
            viewOnLayoutChangeListenerC6673.finish();
        } else if (itemId == R.string.MT_Protector) {
            viewOnLayoutChangeListenerC6673.f22254.m39642();
            dialogInterfaceC8327.dismiss();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18652(ViewOnLayoutChangeListenerC6673 viewOnLayoutChangeListenerC6673, CharSequence[] charSequenceArr, DialogInterfaceC8327 dialogInterfaceC8327, int i) {
        C23827 c23827 = new C23827(viewOnLayoutChangeListenerC6673, viewOnLayoutChangeListenerC6673, i, charSequenceArr, dialogInterfaceC8327);
        c23827.m36565(R.string.MT_Protector);
        c23827.m36571(viewOnLayoutChangeListenerC6673.f22254.m39627(i));
        c23827.m36572();
        c23827.m36569();
        c23827.m36567();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m18654(ViewOnLayoutChangeListenerC6673 viewOnLayoutChangeListenerC6673) {
        String stringExtra;
        viewOnLayoutChangeListenerC6673.f22254.m39633(viewOnLayoutChangeListenerC6673.f22255, ApplicationC17729.f58262.getBoolean("term_create_session_as_root", false));
        if (viewOnLayoutChangeListenerC6673.m40392() || (stringExtra = viewOnLayoutChangeListenerC6673.getIntent().getStringExtra("PATH")) == null || stringExtra.isEmpty()) {
            return;
        }
        C5261.f18540.submit(new RunnableC11146(viewOnLayoutChangeListenerC6673, stringExtra, 0));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18648(ViewOnLayoutChangeListenerC6673 viewOnLayoutChangeListenerC6673, String str) {
        for (int i = 15; i > 0; i--) {
            BinderC16784 binderC16784 = viewOnLayoutChangeListenerC6673.f22254;
            if (binderC16784 == null) {
                return;
            }
            if (!TextUtils.isEmpty(binderC16784.m39640())) {
                viewOnLayoutChangeListenerC6673.runOnUiThread(new RunnableC5927(0, new File(str).getPath(), viewOnLayoutChangeListenerC6673));
                return;
            }
            SystemClock.sleep(200L);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18664(ViewOnLayoutChangeListenerC6673 viewOnLayoutChangeListenerC6673, String str) {
        viewOnLayoutChangeListenerC6673.f22253.setText("cd " + C7756.m21098(str));
        viewOnLayoutChangeListenerC6673.f22251.setVisibility(0);
        TextView textView = (TextView) viewOnLayoutChangeListenerC6673.f22251.findViewById(R.id.MT_Protector);
        textView.setTag(5);
        new RunnableC12638(viewOnLayoutChangeListenerC6673, textView).run();
    }

    @Override // l.AbstractActivityC17204, l.ActivityC4348, l.ActivityC3409, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        unbindService(this.f22250);
        BinderC16784 binderC16784 = this.f22254;
        if (binderC16784 != null) {
            binderC16784.m39629(0, 0, false);
        }
        BinderC16784 binderC16785 = this.f22254;
        if (binderC16785 != null && !binderC16785.m39639()) {
            C7508.m20562(this, new Intent(this, (Class<?>) ServiceC17530.class).setAction("bin.mt.term.TerminalService.ACTION_EXIT"));
        }
        C21576.m49062(500L, new RunnableC17113());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18647(ViewOnLayoutChangeListenerC6673 viewOnLayoutChangeListenerC6673, Runnable runnable) {
        if (viewOnLayoutChangeListenerC6673.f22254 != null) {
            runnable.run();
        } else {
            viewOnLayoutChangeListenerC6673.f22249.add(runnable);
        }
    }
}
