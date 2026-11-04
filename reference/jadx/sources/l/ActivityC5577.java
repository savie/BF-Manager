package l;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: V22O */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC5577 extends ActivityC8866 implements InterfaceC3518, InterfaceC21265, InterfaceC1843, InterfaceC13779, InterfaceC6674, InterfaceC6763, InterfaceC13474, InterfaceC21679, InterfaceC10490, InterfaceC0312 {

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f19364 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C22910 f19365;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C20168 f19366;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f19367;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f19368;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f19369;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f19370;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C7068 f19371;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C1058 f19372;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C20493 f19373;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f19374;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f19375;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public C23656 f19376;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C13385 f19377;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f19378;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final C5572 f19379;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC12639 f19380;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f19381;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final ExecutorC13034 f19382;

    public ActivityC5577() {
        C13385 c13385 = new C13385();
        this.f19377 = c13385;
        this.f19372 = new C1058(new RunnableC8143(0, this));
        C20168 c20168 = new C20168(this);
        this.f19366 = c20168;
        C5572 c5572 = new C5572(new C24964(this, new C13029(this)));
        this.f19379 = c5572;
        this.f19371 = null;
        ExecutorC13034 executorC13034 = new ExecutorC13034(this);
        this.f19382 = executorC13034;
        this.f19373 = new C20493(executorC13034, new C19330(this, 0));
        this.f19367 = new AtomicInteger();
        this.f19380 = new C8888(this);
        this.f19369 = new CopyOnWriteArrayList();
        this.f19374 = new CopyOnWriteArrayList();
        this.f19368 = new CopyOnWriteArrayList();
        this.f19375 = new CopyOnWriteArrayList();
        this.f19381 = new CopyOnWriteArrayList();
        this.f19370 = false;
        this.f19378 = false;
        int i = Build.VERSION.SDK_INT;
        c20168.mo23077(new C7397(this));
        c20168.mo23077(new C14108(this));
        c20168.mo23077(new C4831(this));
        c5572.m16515();
        C5010.m15238((InterfaceC1843) this);
        if (i <= 23) {
            c20168.mo23077(new C12288(this));
        }
        c5572.m16513().m36621("android:support:activity-result", new InterfaceC19742() { // from class: l.ۢ᩷
            @Override // l.InterfaceC19742
            /* JADX INFO: renamed from: ۙ */
            public final Bundle mo14860() {
                return ActivityC5577.m16522(this.f33017);
            }
        });
        c13385.m33009(new InterfaceC5928() { // from class: l.֨᩷
            @Override // l.InterfaceC5928
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final void mo5165(ActivityC5577 activityC5577) {
                ActivityC5577.m16520(this.f5030);
            }
        });
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Bundle m16522(ActivityC5577 activityC5577) {
        Bundle bundle = new Bundle();
        activityC5577.f19380.m31426(bundle);
        return bundle;
    }

    @Override // l.ActivityC8866, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f19379.m16514(bundle);
        this.f19377.m33008(this);
        super.onCreate(bundle);
        int i = FragmentC19422.f62761;
        C18676.m43426(this);
    }

    @Override // l.ActivityC8866, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C20168 c20168 = this.f19366;
        if (c20168 != null) {
            c20168.m46394(EnumC2619.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f19379.m16516(bundle);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C19747 c19747;
        C23656 c23656 = this.f19376;
        if (c23656 == null && (c19747 = (C19747) getLastNonConfigurationInstance()) != null) {
            c23656 = c19747.f63575;
        }
        if (c23656 == null) {
            return null;
        }
        C19747 c19748 = new C19747();
        c19748.f63575 = c23656;
        return c19748;
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        m16533();
        this.f19382.m32455(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        m16533();
        this.f19382.m32455(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m16533();
        this.f19382.m32455(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m16533();
        this.f19382.m32455(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m16533() {
        View decorView = getWindow().getDecorView();
        C15243.m36590(decorView, "<this>");
        decorView.setTag(R.id.MT_Protector, this);
        View decorView2 = getWindow().getDecorView();
        C15243.m36590(decorView2, "<this>");
        decorView2.setTag(R.id.MT_Protector, this);
        View decorView3 = getWindow().getDecorView();
        C15243.m36590(decorView3, "<this>");
        decorView3.setTag(R.id.MT_Protector, this);
        View decorView4 = getWindow().getDecorView();
        C15243.m36590(decorView4, "<this>");
        decorView4.setTag(R.id.MT_Protector, this);
        View decorView5 = getWindow().getDecorView();
        C15243.m36590(decorView5, "<this>");
        decorView5.setTag(R.id.MT_Protector, this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16527(InterfaceC5928 interfaceC5928) {
        this.f19377.m33009(interfaceC5928);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        this.f19372.m3993(menu);
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        this.f19372.m3988(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f19372.m3992(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        this.f19372.m3987(menu);
        super.onPanelClosed(i, menu);
    }

    @Override // l.InterfaceC0312
    public final void addMenuProvider(InterfaceC8515 interfaceC8515) {
        this.f19372.m3989(interfaceC8515);
    }

    @Override // l.InterfaceC0312
    public final void removeMenuProvider(InterfaceC8515 interfaceC8515) {
        this.f19372.m3994(interfaceC8515);
    }

    @Override // l.ActivityC8866, l.InterfaceC11217
    public final AbstractC8585 getLifecycle() {
        return this.f19366;
    }

    @Override // l.InterfaceC3518
    public final C23656 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        m16534();
        return this.f19376;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m16534() {
        if (this.f19376 == null) {
            C19747 c19747 = (C19747) getLastNonConfigurationInstance();
            if (c19747 != null) {
                this.f19376 = c19747.f63575;
            }
            if (this.f19376 == null) {
                this.f19376 = new C23656();
            }
        }
    }

    @Override // l.InterfaceC21265
    public final InterfaceC11721 getDefaultViewModelProviderFactory() {
        if (this.f19365 == null) {
            this.f19365 = new C22910(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.f19365;
    }

    @Override // l.InterfaceC21265
    public final AbstractC24402 getDefaultViewModelCreationExtras() {
        C4264 c4264 = new C4264();
        if (getApplication() != null) {
            c4264.m54576().put(C2027.f6751, getApplication());
        }
        c4264.m54576().put(C5010.f17389, this);
        c4264.m54576().put(C5010.f17388, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            c4264.m54576().put(C5010.f17387, getIntent().getExtras());
        }
        return c4264;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onBackPressed() {
        getOnBackPressedDispatcher().m19401();
    }

    @Override // l.InterfaceC13779
    public final C7068 getOnBackPressedDispatcher() {
        if (this.f19371 == null) {
            this.f19371 = new C7068(new RunnableC21985(this));
            this.f19366.mo23077(new C10796(this));
        }
        return this.f19371;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16520(ActivityC5577 activityC5577) {
        Bundle bundleM36619 = activityC5577.f19379.m16513().m36619("android:support:activity-result");
        if (bundleM36619 != null) {
            activityC5577.f19380.m31423(bundleM36619);
        }
    }

    @Override // l.InterfaceC1843
    public final C15266 getSavedStateRegistry() {
        return this.f19379.m16513();
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f19380.m31425(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity, l.InterfaceC24530
    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.f19380.m31425(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC17114 m16525(AbstractC18606 abstractC18606, InterfaceC25320 interfaceC25320) {
        return this.f19380.m31420("activity_rq#" + this.f19367.getAndIncrement(), this, abstractC18606, interfaceC25320);
    }

    @Override // l.InterfaceC6674
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC12639 mo16524() {
        return this.f19380;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f19369.iterator();
        while (it.hasNext()) {
            ((InterfaceC0818) it.next()).accept(configuration);
        }
    }

    @Override // l.InterfaceC6763
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo16526(InterfaceC0818 interfaceC0818) {
        this.f19369.add(interfaceC0818);
    }

    @Override // l.InterfaceC6763
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo16529(InterfaceC0818 interfaceC0818) {
        this.f19369.remove(interfaceC0818);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f19374.iterator();
        while (it.hasNext()) {
            ((InterfaceC0818) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // l.InterfaceC13474
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo16535(InterfaceC0818 interfaceC0818) {
        this.f19374.add(interfaceC0818);
    }

    @Override // l.InterfaceC13474
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo16530(InterfaceC0818 interfaceC0818) {
        this.f19374.remove(interfaceC0818);
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f19368.iterator();
        while (it.hasNext()) {
            ((InterfaceC0818) it.next()).accept(intent);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16528(C17579 c17579) {
        this.f19368.add(c17579);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.f19370) {
            return;
        }
        Iterator it = this.f19375.iterator();
        while (it.hasNext()) {
            ((InterfaceC0818) it.next()).accept(new C11761(z));
        }
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.f19370 = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.f19370 = false;
            for (InterfaceC0818 interfaceC0818 : this.f19375) {
                C15243.m36590(configuration, "newConfig");
                interfaceC0818.accept(new C11761(z));
            }
        } catch (Throwable th) {
            this.f19370 = false;
            throw th;
        }
    }

    @Override // l.InterfaceC21679
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void mo16531(InterfaceC0818 interfaceC0818) {
        this.f19375.add(interfaceC0818);
    }

    @Override // l.InterfaceC21679
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void mo16532(InterfaceC0818 interfaceC0818) {
        this.f19375.remove(interfaceC0818);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.f19378) {
            return;
        }
        Iterator it = this.f19381.iterator();
        while (it.hasNext()) {
            ((InterfaceC0818) it.next()).accept(new C12728(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.f19378 = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.f19378 = false;
            for (InterfaceC0818 interfaceC0818 : this.f19381) {
                C15243.m36590(configuration, "newConfig");
                interfaceC0818.accept(new C12728(z));
            }
        } catch (Throwable th) {
            this.f19378 = false;
            throw th;
        }
    }

    @Override // l.InterfaceC10490
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo16537(InterfaceC0818 interfaceC0818) {
        this.f19381.add(interfaceC0818);
    }

    @Override // l.InterfaceC10490
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo16536(InterfaceC0818 interfaceC0818) {
        this.f19381.remove(interfaceC0818);
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (C20226.m46501()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.f19373.m46992();
        } finally {
            Trace.endSection();
        }
    }
}
