package l;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;

/* JADX INFO: renamed from: l.᩸ۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6218 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21324 implements InterfaceC16469, InterfaceC19985, InterfaceC17422 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C12484 f69394;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC20950 f69395;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC22654 f69397;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C4245 f69393 = null;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C15752 f69396 = null;

    public C21324(ComponentCallbacksC22654 componentCallbacksC22654, C12484 c12484) {
        this.f69397 = componentCallbacksC22654;
        this.f69394 = c12484;
    }

    @Override // l.InterfaceC17422
    public final C12484 getViewModelStore() {
        m47814();
        return this.f69394;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47814() {
        if (this.f69393 == null) {
            this.f69393 = new C4245(this);
            C15752 c15752 = new C15752(this);
            this.f69396 = c15752;
            c15752.m37491();
            C4015.m11526((InterfaceC19985) this);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m47819() {
        return this.f69393 != null;
    }

    @Override // l.InterfaceC1423
    public final AbstractC3062 getLifecycle() {
        m47814();
        return this.f69393;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47817(EnumC9414 enumC9414) {
        this.f69393.m11903(enumC9414);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47816(EnumC1651 enumC1651) {
        this.f69393.m11902(enumC1651);
    }

    @Override // l.InterfaceC16469
    public final InterfaceC20950 getDefaultViewModelProviderFactory() {
        Application application;
        ComponentCallbacksC22654 componentCallbacksC22654 = this.f69397;
        InterfaceC20950 defaultViewModelProviderFactory = componentCallbacksC22654.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(componentCallbacksC22654.mDefaultFactory)) {
            this.f69395 = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f69395 == null) {
            Context applicationContext = componentCallbacksC22654.requireContext().getApplicationContext();
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
            this.f69395 = new C21655(application, this, componentCallbacksC22654.getArguments());
        }
        return this.f69395;
    }

    @Override // l.InterfaceC16469
    public final AbstractC3310 getDefaultViewModelCreationExtras() {
        Application application;
        ComponentCallbacksC22654 componentCallbacksC22654 = this.f69397;
        Context applicationContext = componentCallbacksC22654.requireContext().getApplicationContext();
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
        C11966 c11966 = new C11966();
        if (application != null) {
            c11966.m9814().put(C7544.f25042, application);
        }
        c11966.m9814().put(C4015.f14871, this);
        c11966.m9814().put(C4015.f14870, this);
        if (componentCallbacksC22654.getArguments() != null) {
            c11966.m9814().put(C4015.f14869, componentCallbacksC22654.getArguments());
        }
        return c11966;
    }

    @Override // l.InterfaceC19985
    public final C20690 getSavedStateRegistry() {
        m47814();
        return this.f69396.m37489();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47815(Bundle bundle) {
        this.f69396.m37490(bundle);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m47818(Bundle bundle) {
        this.f69396.m37492(bundle);
    }
}
