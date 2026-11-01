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

/* JADX INFO: renamed from: l.ܰܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: D7B1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13955 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19356 f45917;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 f45918;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19356 f45919;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Runnable f45920;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public TextView f45923;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C6815 f45916 = new C6815();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C3225 f45922 = new C3225(this);

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f45921 = C0403.m2137();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33801(AbstractActivityC12483 abstractActivityC12483, Runnable runnable) {
        C9577 c9577M24442;
        final C13955 c13955 = new C13955(abstractActivityC12483, runnable);
        final FutureTask futureTask = new FutureTask(new Callable() { // from class: l.۫۫֨
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C13955.m33798(this.f41422);
            }
        });
        new Thread(futureTask, "MT MCP initial workspace scan").start();
        long jUptimeMillis = SystemClock.uptimeMillis() + 300;
        AbstractActivityC12483 abstractActivityC12484 = c13955.f45918;
        View viewM30995 = abstractActivityC12484.m30995(R.layout.MT_Protector);
        ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(abstractActivityC12484.getString(R.string.MT_Protector, Integer.valueOf(c13955.f45921)));
        C23313 c23313 = (C23313) viewM30995.findViewById(R.id.MT_Protector);
        c13955.f45923 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        c23313.setLayoutManager(new C13115(abstractActivityC12484));
        c23313.setAdapter(c13955.f45922);
        c23313.m51393((abstractActivityC12484.getResources().getDisplayMetrics().heightPixels * 2) / 3);
        try {
            c9577M24442 = (C9577) futureTask.get(Math.max(0L, jUptimeMillis - SystemClock.uptimeMillis()), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            c9577M24442 = null;
        } catch (ExecutionException e) {
            c9577M24442 = C9577.m24442(new Exception("Unable to load workspaces", e));
        } catch (TimeoutException unused2) {
            c9577M24442 = null;
        }
        if (c9577M24442 != null) {
            c13955.m33800(c9577M24442, false);
        } else {
            c13955.f45923.setVisibility(8);
        }
        C8067 c8067BuildDialog = abstractActivityC12484.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        c13955.f45919 = dialogInterfaceC19356M21269;
        C23250.m51309(dialogInterfaceC19356M21269);
        if (c9577M24442 != null) {
            if (c9577M24442.f32286 != null) {
                abstractActivityC12484.m31002(c9577M24442.f32286, (DialogInterface.OnDismissListener) null);
                return;
            }
            return;
        }
        new Thread(new Runnable() { // from class: l.ܽ۫֨
            @Override // java.lang.Runnable
            public final void run() {
                final C9577 c9577M24443;
                try {
                    c9577M24443 = (C9577) futureTask.get();
                } catch (InterruptedException unused3) {
                    Thread.currentThread().interrupt();
                    return;
                } catch (ExecutionException e2) {
                    c9577M24443 = C9577.m24442(new Exception("Unable to load workspaces", e2));
                }
                final C13955 c13956 = this.f53357;
                C16737.m39273(new Runnable() { // from class: l.ۧ۫֨
                    @Override // java.lang.Runnable
                    public final void run() {
                        c13956.m33800(c9577M24443, true);
                    }
                });
            }
        }, "MT MCP initial workspace apply").start();
    }

    public C13955(AbstractActivityC12483 abstractActivityC12483, Runnable runnable) {
        this.f45918 = abstractActivityC12483;
        this.f45920 = runnable;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C9577 m33798(C13955 c13955) {
        try {
            return C9577.m24443(c13955.f45916.m18418());
        } catch (Exception e) {
            return C9577.m24442(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m33800(C9577 c9577, boolean z) {
        if (c9577.f32286 != null) {
            Exception exc = c9577.f32286;
            this.f45922.m9672();
            this.f45923.setVisibility(0);
            if (z) {
                this.f45918.m31002(exc, (DialogInterface.OnDismissListener) null);
                return;
            }
            return;
        }
        m33799(c9577.f32287);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m33799(List list) {
        int iMin = Math.min(this.f45921, list.size());
        this.f45922.m9673(list.subList(0, iMin));
        this.f45923.setVisibility(list.isEmpty() ? 0 : 8);
        if (iMin < list.size()) {
            int i = ServiceC8498.f29454;
            C4716.f16636.execute(new RunnableC17856(1));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m33810(final C13955 c13955, final C3992 c3992, final DialogInterfaceC19356 dialogInterfaceC19356) {
        AbstractActivityC12483 abstractActivityC12483 = c13955.f45918;
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21261(abstractActivityC12483.getString(R.string.MT_Protector, c3992.f14833));
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩻۫֨
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                new C1814(this.f76657, c3992, dialogInterfaceC19356).m10243();
            }
        });
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33803(final C13955 c13955, final C3992 c3992) {
        String string;
        int i;
        AbstractActivityC12483 abstractActivityC12483 = c13955.f45918;
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        boolean z = c3992.f14830 != null;
        String string2 = c3992.f14831;
        if (z) {
            textView.setText(R.string.MT_Protector);
            textView2.setText(c3992.f14830);
            textView2.setTextColor(C10405.m26299(abstractActivityC12483, R.color.MT_Protector));
        } else {
            textView.setText(R.string.MT_Protector);
            if (string2 == null || string2.isEmpty()) {
                string = abstractActivityC12483.getString(R.string.MT_Protector);
            } else {
                int iMax = Math.max(string2.lastIndexOf(47), string2.lastIndexOf(92));
                string = (iMax < 0 || (i = iMax + 1) >= string2.length()) ? string2 : string2.substring(i);
            }
            textView2.setText(string);
            textView2.setTextColor(m33808(viewM30995));
        }
        ViewOnClickListenerC22523.m50034(textView2);
        String strM5873 = C1791.m5873(c3992.f14826);
        TextView textView3 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        textView3.setText(strM5873);
        ViewOnClickListenerC22523.m50034(textView3);
        String strM14739 = C5319.m14739(c3992.f14829);
        TextView textView4 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        textView4.setText(strM14739);
        ViewOnClickListenerC22523.m50034(textView4);
        String str = c3992.f14833;
        TextView textView5 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        textView5.setText(str);
        ViewOnClickListenerC22523.m50034(textView5);
        if (string2 == null || string2.isEmpty()) {
            string2 = abstractActivityC12483.getString(R.string.MT_Protector);
        }
        TextView textView6 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        textView6.setText(string2);
        ViewOnClickListenerC22523.m50034(textView6);
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        c13955.f45917 = dialogInterfaceC19356M21269;
        dialogInterfaceC19356M21269.m44374().setOnClickListener(new View.OnClickListener() { // from class: l.ܿ۫֨
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogInterfaceC19356 dialogInterfaceC19356 = dialogInterfaceC19356M21269;
                C13955.m33804(this.f55163, c3992, dialogInterfaceC19356);
            }
        });
        dialogInterfaceC19356M21269.m44361().setOnClickListener(new ViewOnClickListenerC6048(c13955, c3992, dialogInterfaceC19356M21269, 0));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33804(C13955 c13955, C3992 c3992, DialogInterfaceC19356 dialogInterfaceC19356) {
        if (dialogInterfaceC19356.m44375()) {
            dialogInterfaceC19356.dismiss();
        }
        if (c13955.f45917 == dialogInterfaceC19356) {
            c13955.f45917 = null;
        }
        AbstractActivityC12483 abstractActivityC12483 = c13955.f45918;
        if (abstractActivityC12483 instanceof Main) {
            Main main = (Main) abstractActivityC12483;
            DialogInterfaceC19356 dialogInterfaceC19357 = c13955.f45919;
            if (dialogInterfaceC19357 != null) {
                dialogInterfaceC19357.dismiss();
            }
            c13955.f45920.run();
            C6936 c6936M125 = main.m125();
            if (c6936M125 != null) {
                c6936M125.m18646().m28812(c3992.f14832.mo33986(), true);
                return;
            }
            return;
        }
        DialogInterfaceC19356 dialogInterfaceC19358 = c13955.f45919;
        if (dialogInterfaceC19358 != null) {
            dialogInterfaceC19358.dismiss();
        }
        Main.m68((Activity) abstractActivityC12483, c3992.f14832.mo33986(), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33806(C13955 c13955, DialogInterfaceC19356 dialogInterfaceC19356) {
        if (dialogInterfaceC19356.m44375()) {
            dialogInterfaceC19356.dismiss();
        }
        if (c13955.f45917 == dialogInterfaceC19356) {
            c13955.f45917 = null;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m33808(View view) {
        TypedValue typedValue = new TypedValue();
        if (view.getContext().getTheme().resolveAttribute(android.R.attr.textColorPrimary, typedValue, true)) {
            if (typedValue.resourceId != 0) {
                return C10405.m26299(view.getContext(), typedValue.resourceId);
            }
            return typedValue.data;
        }
        TextView textView = (TextView) view.findViewById(R.id.MT_Protector);
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return ((TextView) view.findViewById(R.id.MT_Protector)).getCurrentTextColor();
    }
}
