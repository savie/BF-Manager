package l;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AKQ */
/* JADX INFO: loaded from: classes4.dex */
public class DialogC13082 extends Dialog implements InterfaceC1423, InterfaceC1792, InterfaceC19985 {
    public C4245 _lifecycleRegistry;
    public final C14494 onBackPressedDispatcher;
    public final C15752 savedStateRegistryController;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DialogC13082(Context context) {
        this(context, 0, 2, null);
        C13465.m32966(context, d.R);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m32300() {
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final void m32301(DialogC13082 dialogC13082) {
        C13465.m32966(dialogC13082, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C13465.m32966(view, "view");
        initializeViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    public /* synthetic */ DialogC13082(Context context, int i, int i2, C2048 c2048) {
        this(context, (i2 & 2) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC13082(Context context, int i) {
        super(context, i);
        C13465.m32966(context, d.R);
        this.savedStateRegistryController = new C15752(this);
        this.onBackPressedDispatcher = new C14494(new RunnableC16075(1, this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final C4245 m32298() {
        C4245 c4245 = this._lifecycleRegistry;
        if (c4245 != null) {
            return c4245;
        }
        C4245 c4246 = new C4245(this);
        this._lifecycleRegistry = c4246;
        return c4246;
    }

    @Override // l.InterfaceC19985
    public C20690 getSavedStateRegistry() {
        return this.savedStateRegistryController.m37489();
    }

    @Override // l.InterfaceC1423
    public AbstractC3062 getLifecycle() {
        return m32298();
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        C13465.m32967(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.savedStateRegistryController.m37492(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            C14494 c14494 = this.onBackPressedDispatcher;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            C13465.m32967(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            c14494.m34907(onBackInvokedDispatcher);
        }
        this.savedStateRegistryController.m37490(bundle);
        m32298().m11902(EnumC1651.ON_CREATE);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        m32298().m11902(EnumC1651.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        m32298().m11902(EnumC1651.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // l.InterfaceC1792
    public final C14494 getOnBackPressedDispatcher() {
        return this.onBackPressedDispatcher;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.onBackPressedDispatcher.m34906();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        initializeViewTreeOwners();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        C13465.m32966(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C13465.m32966(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public void initializeViewTreeOwners() {
        Window window = getWindow();
        C13465.m32962(window);
        View decorView = window.getDecorView();
        C13465.m32967(decorView, "window!!.decorView");
        C23773.m52318(decorView, this);
        Window window2 = getWindow();
        C13465.m32962(window2);
        View decorView2 = window2.getDecorView();
        C13465.m32967(decorView2, "window!!.decorView");
        C2228.m6854(decorView2, this);
        Window window3 = getWindow();
        C13465.m32962(window3);
        View decorView3 = window3.getDecorView();
        C13465.m32967(decorView3, "window!!.decorView");
        C12076.m30041(decorView3, this);
    }
}
