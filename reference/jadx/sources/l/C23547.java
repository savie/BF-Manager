package l;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import java.io.PrintWriter;

/* JADX INFO: renamed from: l.᩹۫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O4XG */
/* JADX INFO: loaded from: classes.dex */
public final class C23547 extends AbstractC18325 implements InterfaceC6763, InterfaceC13474, InterfaceC21679, InterfaceC10490, InterfaceC3518, InterfaceC13779, InterfaceC6674, InterfaceC1843, InterfaceC14377, InterfaceC0312 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3409 f76072;

    @Override // l.InterfaceC14377
    /* JADX INFO: renamed from: ۙ */
    public final void mo34814(ComponentCallbacksC11612 componentCallbacksC11612) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23547(ActivityC3409 activityC3409) {
        super(activityC3409);
        this.f76072 = activityC3409;
    }

    @Override // l.InterfaceC11217
    public final AbstractC8585 getLifecycle() {
        return this.f76072.f11072;
    }

    @Override // l.InterfaceC3518
    public final C23656 getViewModelStore() {
        return this.f76072.getViewModelStore();
    }

    @Override // l.InterfaceC13779
    public final C7068 getOnBackPressedDispatcher() {
        return this.f76072.getOnBackPressedDispatcher();
    }

    @Override // l.AbstractC18325
    /* JADX INFO: renamed from: ۙ */
    public final void mo42747(PrintWriter printWriter, String[] strArr) {
        this.f76072.dump(EnumC7687.f25319, null, printWriter, strArr);
    }

    @Override // l.AbstractC18325
    /* JADX INFO: renamed from: ۫ */
    public final LayoutInflater mo42750() {
        ActivityC3409 activityC3409 = this.f76072;
        return activityC3409.getLayoutInflater().cloneInContext(activityC3409);
    }

    @Override // l.AbstractC18325
    /* JADX INFO: renamed from: ܳ */
    public final ActivityC3409 mo42751() {
        return this.f76072;
    }

    @Override // l.AbstractC18325
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo42753(String str) {
        return C14832.m35752((Activity) this.f76072, str);
    }

    @Override // l.AbstractC24293
    /* JADX INFO: renamed from: ۙ */
    public final View mo21642(int i) {
        return this.f76072.findViewById(i);
    }

    @Override // l.AbstractC24293
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo21643() {
        Window window = this.f76072.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // l.InterfaceC6674
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC12639 mo16524() {
        return this.f76072.mo16524();
    }

    @Override // l.InterfaceC1843
    public final C15266 getSavedStateRegistry() {
        return this.f76072.getSavedStateRegistry();
    }

    @Override // l.InterfaceC6763
    /* JADX INFO: renamed from: ۙ */
    public final void mo16526(InterfaceC0818 interfaceC0818) {
        this.f76072.mo16526(interfaceC0818);
    }

    @Override // l.InterfaceC6763
    /* JADX INFO: renamed from: ۚ */
    public final void mo16529(InterfaceC0818 interfaceC0818) {
        this.f76072.mo16529(interfaceC0818);
    }

    @Override // l.InterfaceC13474
    /* JADX INFO: renamed from: ᩴ */
    public final void mo16535(InterfaceC0818 interfaceC0818) {
        this.f76072.mo16535(interfaceC0818);
    }

    @Override // l.InterfaceC13474
    /* JADX INFO: renamed from: ۤ */
    public final void mo16530(InterfaceC0818 interfaceC0818) {
        this.f76072.mo16530(interfaceC0818);
    }

    @Override // l.InterfaceC21679
    /* JADX INFO: renamed from: ۫ */
    public final void mo16531(InterfaceC0818 interfaceC0818) {
        this.f76072.mo16531(interfaceC0818);
    }

    @Override // l.InterfaceC21679
    /* JADX INFO: renamed from: ܳ */
    public final void mo16532(InterfaceC0818 interfaceC0818) {
        this.f76072.mo16532(interfaceC0818);
    }

    @Override // l.InterfaceC10490
    /* JADX INFO: renamed from: ᩸ */
    public final void mo16537(InterfaceC0818 interfaceC0818) {
        this.f76072.mo16537(interfaceC0818);
    }

    @Override // l.InterfaceC10490
    /* JADX INFO: renamed from: ᩷ */
    public final void mo16536(InterfaceC0818 interfaceC0818) {
        this.f76072.mo16536(interfaceC0818);
    }

    @Override // l.InterfaceC0312
    public final void addMenuProvider(InterfaceC8515 interfaceC8515) {
        this.f76072.addMenuProvider(interfaceC8515);
    }

    @Override // l.InterfaceC0312
    public final void removeMenuProvider(InterfaceC8515 interfaceC8515) {
        this.f76072.removeMenuProvider(interfaceC8515);
    }

    @Override // l.AbstractC18325
    /* JADX INFO: renamed from: ۚ */
    public final void mo42748() {
        this.f76072.invalidateOptionsMenu();
    }
}
