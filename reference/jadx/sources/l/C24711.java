package l;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;

/* JADX INFO: renamed from: l.᩻֫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6218 */
/* JADX INFO: loaded from: classes.dex */
public final class C24711 implements InterfaceC21265, InterfaceC1843, InterfaceC3518 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C23656 f79986;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC11721 f79987;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC11612 f79989;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C20168 f79988 = null;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C5572 f79985 = null;

    public C24711(ComponentCallbacksC11612 componentCallbacksC11612, C23656 c23656) {
        this.f79989 = componentCallbacksC11612;
        this.f79986 = c23656;
    }

    @Override // l.InterfaceC3518
    public final C23656 getViewModelStore() {
        m55176();
        return this.f79986;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55176() {
        if (this.f79988 == null) {
            this.f79988 = new C20168(this);
            C5572 c5572 = new C5572(new C24964(this, new C13029(this)));
            this.f79985 = c5572;
            c5572.m16515();
            C5010.m15238((InterfaceC1843) this);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m55181() {
        return this.f79988 != null;
    }

    @Override // l.InterfaceC11217
    public final AbstractC8585 getLifecycle() {
        m55176();
        return this.f79988;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55178(EnumC2619 enumC2619) {
        this.f79988.m46394(enumC2619);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55179(EnumC9330 enumC9330) {
        this.f79988.m46395(enumC9330);
    }

    @Override // l.InterfaceC21265
    public final InterfaceC11721 getDefaultViewModelProviderFactory() {
        Application application;
        ComponentCallbacksC11612 componentCallbacksC11612 = this.f79989;
        InterfaceC11721 defaultViewModelProviderFactory = componentCallbacksC11612.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(componentCallbacksC11612.mDefaultFactory)) {
            this.f79987 = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f79987 == null) {
            Context applicationContext = componentCallbacksC11612.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f79987 = new C22910(application, this, componentCallbacksC11612.getArguments());
        }
        return this.f79987;
    }

    @Override // l.InterfaceC21265
    public final AbstractC24402 getDefaultViewModelCreationExtras() {
        Application application;
        ComponentCallbacksC11612 componentCallbacksC11612 = this.f79989;
        Context applicationContext = componentCallbacksC11612.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C4264 c4264 = new C4264();
        if (application != null) {
            c4264.m54576().put(C2027.f6751, application);
        }
        c4264.m54576().put(C5010.f17389, this);
        c4264.m54576().put(C5010.f17388, this);
        if (componentCallbacksC11612.getArguments() != null) {
            c4264.m54576().put(C5010.f17387, componentCallbacksC11612.getArguments());
        }
        return c4264;
    }

    @Override // l.InterfaceC1843
    public final C15266 getSavedStateRegistry() {
        m55176();
        return this.f79985.m16513();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55177(Bundle bundle) {
        this.f79985.m16514(bundle);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m55180(Bundle bundle) {
        this.f79985.m16516(bundle);
    }
}
