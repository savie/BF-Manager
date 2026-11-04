package l;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import bin.mt.plus.R;
import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.ۧۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AKQ */
/* JADX INFO: loaded from: classes4.dex */
public class DialogC11542 extends Dialog implements InterfaceC11217, InterfaceC13779, InterfaceC1843 {
    public C20168 _lifecycleRegistry;
    public final C7068 onBackPressedDispatcher;
    public final C5572 savedStateRegistryController;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DialogC11542(Context context) {
        this(context, 0, 2, null);
        C15243.m36590(context, d.R);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29047() {
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final void m29048(DialogC11542 dialogC11542) {
        C15243.m36590(dialogC11542, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C15243.m36590(view, "view");
        initializeViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    public /* synthetic */ DialogC11542(Context context, int i, int i2, C21957 c21957) {
        this(context, (i2 & 2) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC11542(Context context, int i) {
        super(context, i);
        C15243.m36590(context, d.R);
        this.savedStateRegistryController = new C5572(new C24964(this, new C13029(this)));
        this.onBackPressedDispatcher = new C7068(new RunnableC1848(this, 0));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final C20168 m29045() {
        C20168 c20168 = this._lifecycleRegistry;
        if (c20168 != null) {
            return c20168;
        }
        C20168 c20169 = new C20168(this);
        this._lifecycleRegistry = c20169;
        return c20169;
    }

    @Override // l.InterfaceC1843
    public C15266 getSavedStateRegistry() {
        return this.savedStateRegistryController.m16513();
    }

    @Override // l.InterfaceC11217
    public AbstractC8585 getLifecycle() {
        return m29045();
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        C15243.m36591(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.savedStateRegistryController.m16516(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            C7068 c7068 = this.onBackPressedDispatcher;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            C15243.m36591(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            c7068.m19402(onBackInvokedDispatcher);
        }
        this.savedStateRegistryController.m16514(bundle);
        m29045().m46395(EnumC9330.ON_CREATE);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        m29045().m46395(EnumC9330.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        m29045().m46395(EnumC9330.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // l.InterfaceC13779
    public final C7068 getOnBackPressedDispatcher() {
        return this.onBackPressedDispatcher;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.onBackPressedDispatcher.m19401();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        initializeViewTreeOwners();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        C15243.m36590(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C15243.m36590(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public void initializeViewTreeOwners() {
        Window window = getWindow();
        C15243.m36586(window);
        View decorView = window.getDecorView();
        C15243.m36591(decorView, "window!!.decorView");
        decorView.setTag(R.id.MT_Protector, this);
        Window window2 = getWindow();
        C15243.m36586(window2);
        View decorView2 = window2.getDecorView();
        C15243.m36591(decorView2, "window!!.decorView");
        decorView2.setTag(R.id.MT_Protector, this);
        Window window3 = getWindow();
        C15243.m36586(window3);
        View decorView3 = window3.getDecorView();
        C15243.m36591(decorView3, "window!!.decorView");
        decorView3.setTag(R.id.MT_Protector, this);
    }
}
