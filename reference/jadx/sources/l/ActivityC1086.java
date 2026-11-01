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

/* JADX INFO: renamed from: l.֨ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: V22O */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC1086 extends ActivityC16858 implements InterfaceC17422, InterfaceC16469, InterfaceC19985, InterfaceC1792, InterfaceC19163, InterfaceC12522, InterfaceC17460, InterfaceC10635, InterfaceC23335, InterfaceC0734 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f4950 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C5051 f4951;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C14494 f4952;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final ExecutorC22254 f4953;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f4954;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f4955;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final C15752 f4956;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C18726 f4957;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f4958;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C4245 f4959;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f4960;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f4961;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f4962;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f4963;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C21655 f4964;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f4965;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC7874 f4966;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public C12484 f4967;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C6379 f4968;

    /* JADX WARN: Type inference failed for: r5v0, types: [l.۫ܰ] */
    public ActivityC1086() {
        C5051 c5051 = new C5051();
        this.f4951 = c5051;
        this.f4968 = new C6379(new RunnableC1774(1, this));
        C4245 c4245 = new C4245(this);
        this.f4959 = c4245;
        C15752 c15752 = new C15752(this);
        this.f4956 = c15752;
        this.f4952 = null;
        ExecutorC22254 executorC22254 = new ExecutorC22254(this);
        this.f4953 = executorC22254;
        this.f4957 = new C18726(executorC22254, new InterfaceC4871() { // from class: l.۫ܰ
            @Override // l.InterfaceC4871
            /* JADX INFO: renamed from: ۙ */
            public final Object mo3788() {
                int i = ActivityC1086.f4950;
                this.f41493.reportFullyDrawn();
                return null;
            }
        });
        this.f4963 = new AtomicInteger();
        this.f4966 = new C14556(this);
        this.f4958 = new CopyOnWriteArrayList();
        this.f4960 = new CopyOnWriteArrayList();
        this.f4955 = new CopyOnWriteArrayList();
        this.f4954 = new CopyOnWriteArrayList();
        this.f4962 = new CopyOnWriteArrayList();
        this.f4961 = false;
        this.f4965 = false;
        int i = Build.VERSION.SDK_INT;
        c4245.mo9171(new C1854(this));
        c4245.mo9171(new C9617(this));
        c4245.mo9171(new C3265(this));
        c15752.m37491();
        C4015.m11526((InterfaceC19985) this);
        if (i <= 23) {
            c4245.mo9171(new C8143(this));
        }
        c15752.m37489().m46525("android:support:activity-result", new InterfaceC7284() { // from class: l.ܿܰ
            @Override // l.InterfaceC7284
            /* JADX INFO: renamed from: ۙ */
            public final Bundle mo8703() {
                return ActivityC1086.m4073(this.f55276);
            }
        });
        c5051.m14069(new InterfaceC21985() { // from class: l.ۛܰ
            @Override // l.InterfaceC21985
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final void mo16498(ActivityC1086 activityC1086) {
                ActivityC1086.m4071(this.f20604);
            }
        });
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Bundle m4073(ActivityC1086 activityC1086) {
        Bundle bundle = new Bundle();
        activityC1086.f4966.m20787(bundle);
        return bundle;
    }

    @Override // l.ActivityC16858, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f4956.m37490(bundle);
        this.f4951.m14068(this);
        super.onCreate(bundle);
        int i = FragmentC9891.f33768;
        C24002.m52831(this);
    }

    @Override // l.ActivityC16858, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C4245 c4245 = this.f4959;
        if (c4245 != null) {
            c4245.m11903(EnumC9414.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f4956.m37492(bundle);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C2497 c2497;
        C12484 c12484 = this.f4967;
        if (c12484 == null && (c2497 = (C2497) getLastNonConfigurationInstance()) != null) {
            c12484 = c2497.f9905;
        }
        if (c12484 == null) {
            return null;
        }
        C2497 c2498 = new C2497();
        c2498.f9905 = c12484;
        return c2498;
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        m4076();
        this.f4953.m49426(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        m4076();
        this.f4953.m49426(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m4076();
        this.f4953.m49426(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m4076();
        this.f4953.m49426(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m4076() {
        C23773.m52318(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        C13465.m32966(decorView, "<this>");
        decorView.setTag(R.id.MT_Protector, this);
        C12076.m30041(getWindow().getDecorView(), this);
        C2228.m6854(getWindow().getDecorView(), this);
        View decorView2 = getWindow().getDecorView();
        C13465.m32966(decorView2, "<this>");
        decorView2.setTag(R.id.MT_Protector, this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4081(InterfaceC21985 interfaceC21985) {
        this.f4951.m14069(interfaceC21985);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        this.f4968.m17514(menu);
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        this.f4968.m17509(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f4968.m17513(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        this.f4968.m17508(menu);
        super.onPanelClosed(i, menu);
    }

    @Override // l.InterfaceC0734
    public final void addMenuProvider(InterfaceC14847 interfaceC14847) {
        this.f4968.m17510(interfaceC14847);
    }

    @Override // l.InterfaceC0734
    public final void removeMenuProvider(InterfaceC14847 interfaceC14847) {
        this.f4968.m17515(interfaceC14847);
    }

    @Override // l.ActivityC16858, l.InterfaceC1423
    public final AbstractC3062 getLifecycle() {
        return this.f4959;
    }

    @Override // l.InterfaceC17422
    public final C12484 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        m4084();
        return this.f4967;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m4084() {
        if (this.f4967 == null) {
            C2497 c2497 = (C2497) getLastNonConfigurationInstance();
            if (c2497 != null) {
                this.f4967 = c2497.f9905;
            }
            if (this.f4967 == null) {
                this.f4967 = new C12484();
            }
        }
    }

    @Override // l.InterfaceC16469
    public final InterfaceC20950 getDefaultViewModelProviderFactory() {
        if (this.f4964 == null) {
            this.f4964 = new C21655(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.f4964;
    }

    @Override // l.InterfaceC16469
    public final AbstractC3310 getDefaultViewModelCreationExtras() {
        C11966 c11966 = new C11966();
        if (getApplication() != null) {
            c11966.m9814().put(C7544.f25042, getApplication());
        }
        c11966.m9814().put(C4015.f14871, this);
        c11966.m9814().put(C4015.f14870, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            c11966.m9814().put(C4015.f14869, getIntent().getExtras());
        }
        return c11966;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onBackPressed() {
        getOnBackPressedDispatcher().m34906();
    }

    @Override // l.InterfaceC1792
    public final C14494 getOnBackPressedDispatcher() {
        if (this.f4952 == null) {
            this.f4952 = new C14494(new RunnableC4614(this));
            this.f4959.mo9171(new C13788(this));
        }
        return this.f4952;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4071(ActivityC1086 activityC1086) {
        Bundle bundleM46522 = activityC1086.f4956.m37489().m46522("android:support:activity-result");
        if (bundleM46522 != null) {
            activityC1086.f4966.m20784(bundleM46522);
        }
    }

    @Override // l.InterfaceC19985
    public final C20690 getSavedStateRegistry() {
        return this.f4956.m37489();
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f4966.m20786(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity, l.InterfaceC21797
    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.f4966.m20786(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC6462 m4077(AbstractC15636 abstractC15636, InterfaceC3639 interfaceC3639) {
        return this.f4966.m20780("activity_rq#" + this.f4963.getAndIncrement(), this, abstractC15636, interfaceC3639);
    }

    @Override // l.InterfaceC19163
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC7874 mo4078() {
        return this.f4966;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f4958.iterator();
        while (it.hasNext()) {
            ((InterfaceC17295) it.next()).accept(configuration);
        }
    }

    @Override // l.InterfaceC12522
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4079(InterfaceC17295 interfaceC17295) {
        this.f4958.add(interfaceC17295);
    }

    @Override // l.InterfaceC12522
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void mo4085(InterfaceC17295 interfaceC17295) {
        this.f4958.remove(interfaceC17295);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f4960.iterator();
        while (it.hasNext()) {
            ((InterfaceC17295) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // l.InterfaceC17460
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo4082(InterfaceC17295 interfaceC17295) {
        this.f4960.add(interfaceC17295);
    }

    @Override // l.InterfaceC17460
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo4083(InterfaceC17295 interfaceC17295) {
        this.f4960.remove(interfaceC17295);
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f4955.iterator();
        while (it.hasNext()) {
            ((InterfaceC17295) it.next()).accept(intent);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4080(C17714 c17714) {
        this.f4955.add(c17714);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.f4961) {
            return;
        }
        Iterator it = this.f4954.iterator();
        while (it.hasNext()) {
            ((InterfaceC17295) it.next()).accept(new C11340(z));
        }
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.f4961 = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.f4961 = false;
            for (InterfaceC17295 interfaceC17295 : this.f4954) {
                C13465.m32966(configuration, "newConfig");
                interfaceC17295.accept(new C11340(z));
            }
        } catch (Throwable th) {
            this.f4961 = false;
            throw th;
        }
    }

    @Override // l.InterfaceC10635
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void mo4074(InterfaceC17295 interfaceC17295) {
        this.f4954.add(interfaceC17295);
    }

    @Override // l.InterfaceC10635
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void mo4087(InterfaceC17295 interfaceC17295) {
        this.f4954.remove(interfaceC17295);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.f4965) {
            return;
        }
        Iterator it = this.f4962.iterator();
        while (it.hasNext()) {
            ((InterfaceC17295) it.next()).accept(new C2872(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.f4965 = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.f4965 = false;
            for (InterfaceC17295 interfaceC17295 : this.f4962) {
                C13465.m32966(configuration, "newConfig");
                interfaceC17295.accept(new C2872(z));
            }
        } catch (Throwable th) {
            this.f4965 = false;
            throw th;
        }
    }

    @Override // l.InterfaceC23335
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo4075(InterfaceC17295 interfaceC17295) {
        this.f4962.add(interfaceC17295);
    }

    @Override // l.InterfaceC23335
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo4086(InterfaceC17295 interfaceC17295) {
        this.f4962.remove(interfaceC17295);
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (C10958.m27712()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.f4957.m43261();
        } finally {
            Trace.endSection();
        }
    }
}
