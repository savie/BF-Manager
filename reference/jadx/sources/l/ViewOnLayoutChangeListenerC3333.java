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

/* JADX INFO: renamed from: l.ۗܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes3.dex */
public class ViewOnLayoutChangeListenerC3333 extends AbstractActivityC12483 implements InterfaceC23215, View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ᩸ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f12350 = 0;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public BinderC14748 f12352;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public C9101 f12353;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public TextView f12354;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public int f12356;

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC15454 f12357;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public View f12358;

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public C19107 f12359;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f12355 = new ArrayList();

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public ServiceConnection f12351 = new ServiceConnectionC1922(this);

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "TerminalActivity";
    }

    @Override // l.ActivityC4866
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int mo9927() {
        SharedPreferences sharedPreferences = ApplicationC0716.f2988;
        return (sharedPreferences == null || !sharedPreferences.getBoolean("term_keep_dark", true)) ? -100 : 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9913(AbstractActivityC12483 abstractActivityC12483, boolean z) {
        Window window = abstractActivityC12483.getWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            window.setStatusBarColor(C16631.m39095(abstractActivityC12483.getResources(), R.color.MT_Protector, abstractActivityC12483.getTheme()));
        } else {
            window.setStatusBarColor(C16631.m39095(abstractActivityC12483.getResources(), R.color.MT_Protector, abstractActivityC12483.getTheme()));
            View decorView = window.getDecorView();
            int i2 = i >= 26 ? o.a.y : 8192;
            if (z) {
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (~i2));
            } else {
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | i2);
            }
        }
        if (i >= 27) {
            window.setNavigationBarColor(C16631.m39095(abstractActivityC12483.getResources(), R.color.MT_Protector, abstractActivityC12483.getTheme()));
        }
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        this.f41637 = false;
        setTheme(C2666.m8210());
        super.onCreate(bundle);
        m31016(R.layout.MT_Protector);
        m31016(R.string.MT_Protector);
        boolean zM38190 = C16135.m38190(this);
        C14043.f46170 = zM38190;
        m9913(this, zM38190);
        runOnUiThread(new RunnableC2749(3, this, new RunnableC12507(0, this)));
        this.f12357 = new ViewOnClickListenerC15454(this, this);
        this.f12353 = C7689.m20320(this, new C3078(6, this));
        View viewM31016 = m31016(R.id.MT_Protector);
        this.f12358 = viewM31016;
        this.f12354 = (TextView) viewM31016.findViewById(R.id.MT_Protector);
        this.f12358.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC17445(0, this));
        this.f12358.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC14141(5, this));
        C10405.m26303(this, new Intent(this, (Class<?>) ServiceC2046.class));
        bindService(new Intent(this, (Class<?>) ServiceC2046.class), this.f12351, 64);
        C19107 c19107 = (C19107) m31016(R.id.MT_Protector);
        this.f12359 = c19107;
        c19107.addOnLayoutChangeListener(this);
        m9920();
        this.f12359.m43904(new C11096(this));
        C18150.m42278((AbstractActivityC12483) this, (Runnable) new RunnableC4263(8, this), false);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static void m9924(ViewOnLayoutChangeListenerC3333 viewOnLayoutChangeListenerC3333) {
        viewOnLayoutChangeListenerC3333.m9920();
        AbstractC17129 abstractC17129M25488 = viewOnLayoutChangeListenerC3333.m25488();
        SharedPreferences sharedPreferences = ApplicationC0716.f2988;
        abstractC17129M25488.mo23537((sharedPreferences == null || !sharedPreferences.getBoolean("term_keep_dark", true)) ? -100 : 2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9904(ViewOnLayoutChangeListenerC3333 viewOnLayoutChangeListenerC3333) {
        BinderC14748 binderC14748 = viewOnLayoutChangeListenerC3333.f12352;
        if (binderC14748 != null) {
            String strM35366 = binderC14748.m35366();
            if (!TextUtils.isEmpty(strM35366)) {
                viewOnLayoutChangeListenerC3333.f12352.m35363(strM35366.length() - strM35366.lastIndexOf("\n"));
                viewOnLayoutChangeListenerC3333.f12352.m35353(viewOnLayoutChangeListenerC3333.f12354.getText().toString() + "\r");
            }
        }
        viewOnLayoutChangeListenerC3333.f12358.setVisibility(8);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m9920() {
        int i;
        try {
            i = Integer.parseInt(ApplicationC0716.f2988.getString("term_font_size", "12"));
        } catch (Exception unused) {
            i = 12;
        }
        this.f12356 = i;
        this.f12359.m43900(i);
        this.f12359.m43901(C22509.m50031());
    }

    @Override // l.ActivityC10074, l.ActivityC19126, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        runOnUiThread(new RunnableC2749(3, this, new RunnableC8979(0, this)));
    }

    @Override // l.InterfaceC23215
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo9926(View view) {
        C16195 c16195 = new C16195(this, view, 0);
        C12418 c12418M38298 = c16195.m38298();
        BinderC14748 binderC14748 = this.f12352;
        if (binderC14748 != null) {
            ServiceC2046 serviceC2046 = binderC14748.f48242;
            if (serviceC2046.f7624 != null || serviceC2046.f7622 != null) {
                c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            } else {
                c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            }
            c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        }
        c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        BinderC14748 binderC14749 = this.f12352;
        if (binderC14749 != null && binderC14749.m35361()) {
            c12418M38298.add(0, android.R.string.paste, 0, android.R.string.paste).setIcon(R.drawable.MT_Protector).setEnabled(this.f12359.m43905());
        }
        c16195.m38296(new C6156(0, this));
        c12418M38298.setOptionalIconsVisible(true);
        c16195.m38297();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9906(final ViewOnLayoutChangeListenerC3333 viewOnLayoutChangeListenerC3333, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 17039371) {
            viewOnLayoutChangeListenerC3333.f12359.m43907();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            viewOnLayoutChangeListenerC3333.f12353.m23451(ActivityC18275.class);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            C8067 c8067BuildDialog = viewOnLayoutChangeListenerC3333.buildDialog();
            c8067BuildDialog.m21274(R.string.MT_Protector);
            c8067BuildDialog.m21253(R.string.MT_Protector);
            c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC20268(0, viewOnLayoutChangeListenerC3333));
            c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067BuildDialog.m21269();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            C8067 c8067BuildDialog2 = viewOnLayoutChangeListenerC3333.buildDialog();
            c8067BuildDialog2.m21274(R.string.MT_Protector);
            c8067BuildDialog2.m21253(R.string.MT_Protector);
            c8067BuildDialog2.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC0221(2, viewOnLayoutChangeListenerC3333));
            c8067BuildDialog2.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067BuildDialog2.m21271(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֡ܺۜ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    int i2 = ViewOnLayoutChangeListenerC3333.f12350;
                    this.f2205.finish();
                }
            });
            c8067BuildDialog2.m21269();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            ServiceC2046 serviceC2046 = viewOnLayoutChangeListenerC3333.f12352.f48242;
            if (serviceC2046.f7624 != null || serviceC2046.f7622 != null) {
                menuItem.setIcon(R.drawable.MT_Protector);
                viewOnLayoutChangeListenerC3333.f12352.m35365(true);
            } else {
                menuItem.setIcon(R.drawable.MT_Protector);
                viewOnLayoutChangeListenerC3333.f12352.m35357(true);
            }
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static void m9903(ViewOnLayoutChangeListenerC3333 viewOnLayoutChangeListenerC3333) {
        BinderC14748 binderC14748 = viewOnLayoutChangeListenerC3333.f12352;
        if (binderC14748 != null) {
            binderC14748.m35364(viewOnLayoutChangeListenerC3333.f12359, ApplicationC0716.f2988.getBoolean("term_create_session_as_root", false));
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9901(ViewOnLayoutChangeListenerC3333 viewOnLayoutChangeListenerC3333) {
        BinderC14748 binderC14748 = viewOnLayoutChangeListenerC3333.f12352;
        if (binderC14748 == null || binderC14748.m35358(viewOnLayoutChangeListenerC3333.f12359)) {
            viewOnLayoutChangeListenerC3333.finish();
        }
    }

    @Override // l.InterfaceC23215
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void mo9928() {
        BinderC14748 binderC14748 = this.f12352;
        if (binderC14748 == null) {
            return;
        }
        final CharSequence[] charSequenceArrM35359 = binderC14748.m35359();
        C8067 c8067BuildDialog = buildDialog();
        c8067BuildDialog.m21266(charSequenceArrM35359, this.f12352.m35360(), new DialogInterfaceOnClickListenerC6675(this, 2));
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21275(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۤܺۜ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ViewOnLayoutChangeListenerC3333.m9916(this.f35567);
            }
        });
        c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        dialogInterfaceC19356M21269.m44361().setOnClickListener(new View.OnClickListener() { // from class: l.۟ܺۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewOnLayoutChangeListenerC3333.m9911(this.f25095, dialogInterfaceC19356M21269, view);
            }
        });
        dialogInterfaceC19356M21269.m44376().setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: l.᩷ܺۜ
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
                ViewOnLayoutChangeListenerC3333.m9912(this.f68314, charSequenceArrM35359, dialogInterfaceC19356M21269, i);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9905(ViewOnLayoutChangeListenerC3333 viewOnLayoutChangeListenerC3333, DialogInterface dialogInterface, int i) {
        viewOnLayoutChangeListenerC3333.f12352.m35354(viewOnLayoutChangeListenerC3333.f12359, i);
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m9916(ViewOnLayoutChangeListenerC3333 viewOnLayoutChangeListenerC3333) {
        viewOnLayoutChangeListenerC3333.f12352.m35356(viewOnLayoutChangeListenerC3333.f12359, ApplicationC0716.f2988.getBoolean("term_create_session_as_root", false), false, viewOnLayoutChangeListenerC3333.f12356);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9911(ViewOnLayoutChangeListenerC3333 viewOnLayoutChangeListenerC3333, DialogInterfaceC19356 dialogInterfaceC19356, View view) {
        C16195 c16195 = new C16195(viewOnLayoutChangeListenerC3333, view, 0);
        C12418 c12418M38298 = c16195.m38298();
        if (C4744.m13121() != null) {
            c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setEnabled(viewOnLayoutChangeListenerC3333.f12352.m35347() > 1);
        c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c16195.m38296(new C16740(viewOnLayoutChangeListenerC3333, dialogInterfaceC19356));
        c16195.m38297();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9910(ViewOnLayoutChangeListenerC3333 viewOnLayoutChangeListenerC3333, DialogInterfaceC19356 dialogInterfaceC19356, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            viewOnLayoutChangeListenerC3333.f12352.m35356(viewOnLayoutChangeListenerC3333.f12359, ApplicationC0716.f2988.getBoolean("term_create_session_as_root", false), true, viewOnLayoutChangeListenerC3333.f12356);
            dialogInterfaceC19356.dismiss();
        } else if (itemId == R.string.MT_Protector) {
            viewOnLayoutChangeListenerC3333.f12352.m35350();
            viewOnLayoutChangeListenerC3333.finish();
        } else if (itemId == R.string.MT_Protector) {
            viewOnLayoutChangeListenerC3333.f12352.m35362();
            dialogInterfaceC19356.dismiss();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9912(ViewOnLayoutChangeListenerC3333 viewOnLayoutChangeListenerC3333, CharSequence[] charSequenceArr, DialogInterfaceC19356 dialogInterfaceC19356, int i) {
        C23796 c23796 = new C23796(viewOnLayoutChangeListenerC3333, viewOnLayoutChangeListenerC3333, i, charSequenceArr, dialogInterfaceC19356);
        c23796.m13797(R.string.MT_Protector);
        c23796.m13801(viewOnLayoutChangeListenerC3333.f12352.m35349(i));
        c23796.m13795();
        c23796.m13799();
        c23796.m13794();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static void m9917(final ViewOnLayoutChangeListenerC3333 viewOnLayoutChangeListenerC3333) {
        final String stringExtra;
        viewOnLayoutChangeListenerC3333.f12352.m35355(viewOnLayoutChangeListenerC3333.f12359, ApplicationC0716.f2988.getBoolean("term_create_session_as_root", false));
        if (viewOnLayoutChangeListenerC3333.m30994() || (stringExtra = viewOnLayoutChangeListenerC3333.getIntent().getStringExtra("PATH")) == null || stringExtra.isEmpty()) {
            return;
        }
        C4716.f16636.submit(new Runnable() { // from class: l.ܺܺۜ
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnLayoutChangeListenerC3333.m9908(this.f51916, stringExtra);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9908(ViewOnLayoutChangeListenerC3333 viewOnLayoutChangeListenerC3333, String str) {
        for (int i = 15; i > 0; i--) {
            BinderC14748 binderC14748 = viewOnLayoutChangeListenerC3333.f12352;
            if (binderC14748 == null) {
                return;
            }
            if (!TextUtils.isEmpty(binderC14748.m35366())) {
                viewOnLayoutChangeListenerC3333.runOnUiThread(new RunnableC9534(2, viewOnLayoutChangeListenerC3333, new File(str).getPath()));
                return;
            }
            SystemClock.sleep(200L);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9919(ViewOnLayoutChangeListenerC3333 viewOnLayoutChangeListenerC3333, String str) {
        viewOnLayoutChangeListenerC3333.f12354.setText("cd " + C6696.m18085(str));
        viewOnLayoutChangeListenerC3333.f12358.setVisibility(0);
        TextView textView = (TextView) viewOnLayoutChangeListenerC3333.f12358.findViewById(R.id.MT_Protector);
        textView.setTag(5);
        new RunnableC9685(viewOnLayoutChangeListenerC3333, textView).run();
    }

    @Override // l.AbstractActivityC12483, l.ActivityC10074, l.ActivityC19126, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        unbindService(this.f12351);
        BinderC14748 binderC14748 = this.f12352;
        if (binderC14748 != null) {
            binderC14748.m35351(0, 0, false);
        }
        BinderC14748 binderC14749 = this.f12352;
        if (binderC14749 != null && !binderC14749.m35346()) {
            C10405.m26303(this, new Intent(this, (Class<?>) ServiceC2046.class).setAction("bin.mt.term.TerminalService.ACTION_EXIT"));
        }
        C16737.m39267(500L, new RunnableC19768(2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9907(ViewOnLayoutChangeListenerC3333 viewOnLayoutChangeListenerC3333, Runnable runnable) {
        if (viewOnLayoutChangeListenerC3333.f12352 != null) {
            runnable.run();
        } else {
            viewOnLayoutChangeListenerC3333.f12355.add(runnable);
        }
    }
}
