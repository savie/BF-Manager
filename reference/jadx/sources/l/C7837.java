package l;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import java.io.PrintWriter;

/* JADX INFO: renamed from: l.۠֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O4XG */
/* JADX INFO: loaded from: classes4.dex */
public final class C7837 extends AbstractC16304 implements InterfaceC12522, InterfaceC17460, InterfaceC10635, InterfaceC23335, InterfaceC17422, InterfaceC1792, InterfaceC19163, InterfaceC19985, InterfaceC0426, InterfaceC0734 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC19126 f25783;

    @Override // l.InterfaceC0426
    /* JADX INFO: renamed from: ۙ */
    public final void mo2217(ComponentCallbacksC22654 componentCallbacksC22654) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7837(ActivityC19126 activityC19126) {
        super(activityC19126);
        this.f25783 = activityC19126;
    }

    @Override // l.InterfaceC1423
    public final AbstractC3062 getLifecycle() {
        return this.f25783.f61790;
    }

    @Override // l.InterfaceC17422
    public final C12484 getViewModelStore() {
        return this.f25783.getViewModelStore();
    }

    @Override // l.InterfaceC1792
    public final C14494 getOnBackPressedDispatcher() {
        return this.f25783.getOnBackPressedDispatcher();
    }

    @Override // l.AbstractC16304
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo20669(PrintWriter printWriter, String[] strArr) {
        this.f25783.dump(EnumC19730.f63352, null, printWriter, strArr);
    }

    @Override // l.AbstractC16304
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final LayoutInflater mo20670() {
        ActivityC19126 activityC19126 = this.f25783;
        return activityC19126.getLayoutInflater().cloneInContext(activityC19126);
    }

    @Override // l.AbstractC16304
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ActivityC19126 mo20672() {
        return this.f25783;
    }

    @Override // l.AbstractC16304
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo20671(String str) {
        return C18975.m43675((Activity) this.f25783, str);
    }

    @Override // l.AbstractC20537
    /* JADX INFO: renamed from: ۙ */
    public final View mo12110(int i) {
        return this.f25783.findViewById(i);
    }

    @Override // l.AbstractC20537
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo12111() {
        Window window = this.f25783.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // l.InterfaceC19163
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7874 mo4078() {
        return this.f25783.mo4078();
    }

    @Override // l.InterfaceC19985
    public final C20690 getSavedStateRegistry() {
        return this.f25783.getSavedStateRegistry();
    }

    @Override // l.InterfaceC12522
    /* JADX INFO: renamed from: ۙ */
    public final void mo4079(InterfaceC17295 interfaceC17295) {
        this.f25783.mo4079(interfaceC17295);
    }

    @Override // l.InterfaceC12522
    /* JADX INFO: renamed from: ۬ */
    public final void mo4085(InterfaceC17295 interfaceC17295) {
        this.f25783.mo4085(interfaceC17295);
    }

    @Override // l.InterfaceC17460
    /* JADX INFO: renamed from: ۚ */
    public final void mo4082(InterfaceC17295 interfaceC17295) {
        this.f25783.mo4082(interfaceC17295);
    }

    @Override // l.InterfaceC17460
    /* JADX INFO: renamed from: ۨ */
    public final void mo4083(InterfaceC17295 interfaceC17295) {
        this.f25783.mo4083(interfaceC17295);
    }

    @Override // l.InterfaceC10635
    /* JADX INFO: renamed from: ֨ */
    public final void mo4074(InterfaceC17295 interfaceC17295) {
        this.f25783.mo4074(interfaceC17295);
    }

    @Override // l.InterfaceC10635
    /* JADX INFO: renamed from: ᩹ */
    public final void mo4087(InterfaceC17295 interfaceC17295) {
        this.f25783.mo4087(interfaceC17295);
    }

    @Override // l.InterfaceC23335
    /* JADX INFO: renamed from: ۖ */
    public final void mo4075(InterfaceC17295 interfaceC17295) {
        this.f25783.mo4075(interfaceC17295);
    }

    @Override // l.InterfaceC23335
    /* JADX INFO: renamed from: ܰ */
    public final void mo4086(InterfaceC17295 interfaceC17295) {
        this.f25783.mo4086(interfaceC17295);
    }

    @Override // l.InterfaceC0734
    public final void addMenuProvider(InterfaceC14847 interfaceC14847) {
        this.f25783.addMenuProvider(interfaceC14847);
    }

    @Override // l.InterfaceC0734
    public final void removeMenuProvider(InterfaceC14847 interfaceC14847) {
        this.f25783.removeMenuProvider(interfaceC14847);
    }

    @Override // l.AbstractC16304
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void mo20668() {
        this.f25783.invalidateOptionsMenu();
    }
}
