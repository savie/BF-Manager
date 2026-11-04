package l;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟ܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: OIRX */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogC7990 extends Dialog {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C22907 f26536;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f26537;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f26538;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final MenuItem f26539;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Bitmap f26540;

    public DialogC7990(AbstractActivityC17204 abstractActivityC17204, Bitmap bitmap, String str, String str2) {
        super(abstractActivityC17204, C7207.m19791());
        if (bitmap == null || bitmap.isRecycled()) {
            throw new IllegalArgumentException("Invalid cover bitmap");
        }
        this.f26540 = bitmap;
        this.f26538 = abstractActivityC17204;
        requestWindowFeature(1);
        setCanceledOnTouchOutside(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        C22907 c22907 = new C22907(getContext(), null);
        this.f26536 = c22907;
        c22907.setId(R.id.MT_Protector);
        frameLayout.addView(c22907, new FrameLayout.LayoutParams(-1, -1));
        C9370 c9370 = new C9370(getContext(), R.style.MT_Protector);
        C16390 c16390 = new C16390(c9370);
        c16390.setId(R.id.MT_Protector);
        c16390.setBackgroundColor(1711276032);
        c16390.setTitleTextColor(-986896);
        c16390.setTitle(str);
        Drawable drawableM2186 = C0385.m2186(c9370, R.drawable.MT_Protector);
        if (drawableM2186 != null) {
            drawableM2186 = drawableM2186.mutate();
            C0597.m2700(drawableM2186, -986896);
        }
        c16390.setNavigationIcon(drawableM2186);
        c16390.setNavigationContentDescription(R.string.MT_Protector);
        c16390.setNavigationOnClickListener(new View.OnClickListener() { // from class: l.ۘܺ֫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15500.dismiss();
            }
        });
        Drawable drawableM2187 = C0385.m2186(c9370, R.drawable.MT_Protector);
        if (drawableM2187 != null) {
            drawableM2187 = drawableM2187.mutate();
            C0597.m2700(drawableM2187, -986896);
        }
        MenuItem icon = c16390.getMenu().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(drawableM2187);
        this.f26539 = icon;
        icon.setShowAsAction(2);
        c16390.setOnMenuItemClickListener(new C2075(this, str2));
        frameLayout.addView(c16390, new FrameLayout.LayoutParams(-1, -2));
        setContentView(frameLayout);
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.MT_Protector);
            window.setBackgroundDrawableResource(android.R.color.transparent);
            window.clearFlags(2);
            C18190.m42352(window, false);
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.layoutInDisplayCutoutMode = i >= 30 ? 3 : 1;
                window.setAttributes(attributes);
            }
        }
        C22666.m51097(frameLayout, new C19301(c16390));
        c22907.mo1641(new C14701(this));
        c22907.mo1642(new C21415(this), 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m21779(DialogC7990 dialogC7990, String str, MenuItem menuItem) {
        MenuItem menuItem2 = dialogC7990.f26539;
        if (menuItem != menuItem2) {
            return false;
        }
        Bitmap bitmap = dialogC7990.f26540;
        if (bitmap == null || !menuItem2.isEnabled()) {
            return true;
        }
        menuItem2.setEnabled(false);
        new C18431(dialogC7990, str, bitmap).m8197();
        return true;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 == null) {
            return;
        }
        C18893 c18893 = new C18893(window2, window2.getDecorView());
        c18893.m43816(false);
        c18893.m43812(false);
        c18893.m43815(2);
        c18893.m43814(7);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m21782(DialogC7990 dialogC7990) {
        AbstractActivityC17204 abstractActivityC17204 = dialogC7990.f26538;
        return dialogC7990.isShowing() && !abstractActivityC17204.isFinishing() && !abstractActivityC17204.isDestroyed() && abstractActivityC17204.getLifecycle().mo23076().m8762(EnumC2619.STARTED);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f26537;
        if (dialogInterfaceC8327 != null) {
            dialogInterfaceC8327.dismiss();
            this.f26537 = null;
        }
        super.dismiss();
        this.f26536.mo1649();
        this.f26540 = null;
    }
}
