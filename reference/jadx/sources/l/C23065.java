package l;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: l.᩸᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D7B1 */
/* JADX INFO: loaded from: classes.dex */
public final class C23065 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f74817;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Runnable f74819;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public TextView f74821;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f74822;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f74824;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C6394 f74820 = new C6394();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C22319 f74823 = new C22319(this);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f74818 = C9881.m25689();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51972(AbstractActivityC17204 abstractActivityC17204, Runnable runnable) {
        C5165 c5165M15584;
        final C23065 c23065 = new C23065(abstractActivityC17204, runnable);
        final FutureTask futureTask = new FutureTask(new Callable() { // from class: l.ۡۙۚ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C23065.m51969(this.f29693);
            }
        });
        new Thread(futureTask, "MT MCP initial workspace scan").start();
        long jUptimeMillis = SystemClock.uptimeMillis() + 300;
        AbstractActivityC17204 abstractActivityC17205 = c23065.f74817;
        View viewM40395 = abstractActivityC17205.m40395(R.layout.MT_Protector);
        ((TextView) viewM40395.findViewById(R.id.MT_Protector)).setText(abstractActivityC17205.getString(R.string.MT_Protector, Integer.valueOf(c23065.f74818)));
        C10511 c10511 = (C10511) viewM40395.findViewById(R.id.MT_Protector);
        c23065.f74821 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        c10511.setLayoutManager(new C0067(abstractActivityC17205));
        c10511.setAdapter(c23065.f74823);
        c10511.m26974((abstractActivityC17205.getResources().getDisplayMetrics().heightPixels * 2) / 3);
        try {
            c5165M15584 = (C5165) futureTask.get(Math.max(0L, jUptimeMillis - SystemClock.uptimeMillis()), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            c5165M15584 = null;
        } catch (ExecutionException e) {
            c5165M15584 = C5165.m15584(new Exception("Unable to load workspaces", e));
        } catch (TimeoutException unused2) {
            c5165M15584 = null;
        }
        if (c5165M15584 != null) {
            c23065.m51971(c5165M15584, false);
        } else {
            c23065.f74821.setVisibility(8);
        }
        C2361 c2361BuildDialog = abstractActivityC17205.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        c23065.f74822 = dialogInterfaceC8327M8016;
        C5416.m16144(dialogInterfaceC8327M8016);
        if (c5165M15584 != null) {
            if (c5165M15584.f18011 != null) {
                abstractActivityC17205.m40401(c5165M15584.f18011, (DialogInterface.OnDismissListener) null);
                return;
            }
            return;
        }
        new Thread(new Runnable() { // from class: l.֨ۙۚ
            @Override // java.lang.Runnable
            public final void run() {
                final C5165 c5165M15585;
                try {
                    c5165M15585 = (C5165) futureTask.get();
                } catch (InterruptedException unused3) {
                    Thread.currentThread().interrupt();
                    return;
                } catch (ExecutionException e2) {
                    c5165M15585 = C5165.m15584(new Exception("Unable to load workspaces", e2));
                }
                final C23065 c23066 = this.f3455;
                C21576.m49068(new Runnable() { // from class: l.ۖۙۚ
                    @Override // java.lang.Runnable
                    public final void run() {
                        c23066.m51971(c5165M15585, true);
                    }
                });
            }
        }, "MT MCP initial workspace apply").start();
    }

    public C23065(AbstractActivityC17204 abstractActivityC17204, Runnable runnable) {
        this.f74817 = abstractActivityC17204;
        this.f74819 = runnable;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C5165 m51969(C23065 c23065) {
        try {
            return C5165.m15585(c23065.f74820.m18146());
        } catch (Exception e) {
            return C5165.m15584(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m51971(C5165 c5165, boolean z) {
        if (c5165.f18011 != null) {
            Exception exc = c5165.f18011;
            this.f74823.m50379();
            this.f74821.setVisibility(0);
            if (z) {
                this.f74817.m40401(exc, (DialogInterface.OnDismissListener) null);
                return;
            }
            return;
        }
        m51970(c5165.f18012);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m51970(List list) {
        int iMin = Math.min(this.f74818, list.size());
        this.f74823.m50380(list.subList(0, iMin));
        this.f74821.setVisibility(list.isEmpty() ? 0 : 8);
        if (iMin < list.size()) {
            int i = ServiceC6459.f21716;
            C5261.f18540.execute(new RunnableC13814(3));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m51981(final C23065 c23065, final C12359 c12359, final DialogInterfaceC8327 dialogInterfaceC8327) {
        AbstractActivityC17204 abstractActivityC17204 = c23065.f74817;
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8008(abstractActivityC17204.getString(R.string.MT_Protector, c12359.f39698));
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۠ۙۚ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                new C13610(this.f27498, c12359, dialogInterfaceC8327).m8197();
            }
        });
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51976(C23065 c23065, C12359 c12359) {
        String string;
        int i;
        AbstractActivityC17204 abstractActivityC17204 = c23065.f74817;
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        TextView textView = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        boolean z = c12359.f39696 != null;
        String string2 = c12359.f39695;
        if (z) {
            textView.setText(R.string.MT_Protector);
            textView2.setText(c12359.f39696);
            textView2.setTextColor(C7508.m20558(abstractActivityC17204, R.color.MT_Protector));
        } else {
            textView.setText(R.string.MT_Protector);
            if (string2 == null || string2.isEmpty()) {
                string = abstractActivityC17204.getString(R.string.MT_Protector);
            } else {
                int iMax = Math.max(string2.lastIndexOf(47), string2.lastIndexOf(92));
                string = (iMax < 0 || (i = iMax + 1) >= string2.length()) ? string2 : string2.substring(i);
            }
            textView2.setText(string);
            textView2.setTextColor(m51979(viewM40395));
        }
        ViewOnClickListenerC15284.m36686(textView2);
        String strM22393 = C8311.m22393(c12359.f39701);
        TextView textView3 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        textView3.setText(strM22393);
        ViewOnClickListenerC15284.m36686(textView3);
        String strM50713 = C22482.m50713(c12359.f39699);
        TextView textView4 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        textView4.setText(strM50713);
        ViewOnClickListenerC15284.m36686(textView4);
        String str = c12359.f39698;
        TextView textView5 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        textView5.setText(str);
        ViewOnClickListenerC15284.m36686(textView5);
        if (string2 == null || string2.isEmpty()) {
            string2 = abstractActivityC17204.getString(R.string.MT_Protector);
        }
        TextView textView6 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        textView6.setText(string2);
        ViewOnClickListenerC15284.m36686(textView6);
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        c23065.f74824 = dialogInterfaceC8327M8016;
        dialogInterfaceC8327M8016.m22433().setOnClickListener(new ViewOnClickListenerC10751(c23065, dialogInterfaceC8327M8016, c12359, 2));
        dialogInterfaceC8327M8016.m22440().setOnClickListener(new ViewOnClickListenerC14121(c23065, c12359, dialogInterfaceC8327M8016));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51975(C23065 c23065, DialogInterfaceC8327 dialogInterfaceC8327) {
        if (dialogInterfaceC8327.m22434()) {
            dialogInterfaceC8327.dismiss();
        }
        if (c23065.f74824 == dialogInterfaceC8327) {
            c23065.f74824 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51977(C23065 c23065, C12359 c12359, DialogInterfaceC8327 dialogInterfaceC8327) {
        if (dialogInterfaceC8327.m22434()) {
            dialogInterfaceC8327.dismiss();
        }
        if (c23065.f74824 == dialogInterfaceC8327) {
            c23065.f74824 = null;
        }
        AbstractActivityC17204 abstractActivityC17204 = c23065.f74817;
        if (abstractActivityC17204 instanceof Main) {
            Main main = (Main) abstractActivityC17204;
            DialogInterfaceC8327 dialogInterfaceC8328 = c23065.f74822;
            if (dialogInterfaceC8328 != null) {
                dialogInterfaceC8328.dismiss();
            }
            c23065.f74819.run();
            C20065 c20065M117 = main.m117();
            if (c20065M117 != null) {
                c20065M117.m46155().m23226(c12359.f39700.mo4294(), true);
                return;
            }
            return;
        }
        DialogInterfaceC8327 dialogInterfaceC8329 = c23065.f74822;
        if (dialogInterfaceC8329 != null) {
            dialogInterfaceC8329.dismiss();
        }
        Main.m55((Activity) abstractActivityC17204, c12359.f39700.mo4294(), false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m51979(View view) {
        TypedValue typedValue = new TypedValue();
        if (view.getContext().getTheme().resolveAttribute(android.R.attr.textColorPrimary, typedValue, true)) {
            if (typedValue.resourceId != 0) {
                return C7508.m20558(view.getContext(), typedValue.resourceId);
            }
            return typedValue.data;
        }
        TextView textView = (TextView) view.findViewById(R.id.title);
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return ((TextView) view.findViewById(R.id.MT_Protector)).getCurrentTextColor();
    }
}
