package l;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: U5VL */
/* JADX INFO: loaded from: classes3.dex */
public final class C10656 extends AbstractC12067 implements InterfaceC0422 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC16300 f36340;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f36341;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C12418 f36342;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C19910 f36343;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Context f36344;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public WeakReference f36345;

    public C10656(Context context, C19910 c19910, InterfaceC16300 interfaceC16300) {
        this.f36344 = context;
        this.f36343 = c19910;
        this.f36340 = interfaceC16300;
        C12418 defaultShowAsAction = new C12418(c19910.getContext()).setDefaultShowAsAction(1);
        this.f36342 = defaultShowAsAction;
        defaultShowAsAction.setCallback(this);
    }

    @Override // l.AbstractC12067
    /* JADX INFO: renamed from: ܰ */
    public final void mo6794(CharSequence charSequence) {
        this.f36343.m45198(charSequence);
    }

    @Override // l.AbstractC12067
    /* JADX INFO: renamed from: ۙ */
    public final void mo6787(CharSequence charSequence) {
        this.f36343.m45192(charSequence);
    }

    @Override // l.AbstractC12067
    /* JADX INFO: renamed from: ܰ */
    public final void mo6793(int i) {
        mo6794(this.f36344.getString(i));
    }

    @Override // l.AbstractC12067
    /* JADX INFO: renamed from: ۙ */
    public final void mo6785(int i) {
        mo6787((CharSequence) this.f36344.getString(i));
    }

    @Override // l.AbstractC12067
    /* JADX INFO: renamed from: ۙ */
    public final void mo6788(boolean z) {
        super.mo6788(z);
        this.f36343.m45194(z);
    }

    @Override // l.AbstractC12067
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo6790() {
        return this.f36343.m45188();
    }

    @Override // l.AbstractC12067
    /* JADX INFO: renamed from: ۙ */
    public final void mo6786(View view) {
        this.f36343.m45191(view);
        this.f36345 = view != null ? new WeakReference(view) : null;
    }

    @Override // l.AbstractC12067
    /* JADX INFO: renamed from: ۘ */
    public final void mo6783() {
        this.f36340.mo8541(this, this.f36342);
    }

    @Override // l.AbstractC12067
    /* JADX INFO: renamed from: ۙ */
    public final void mo6784() {
        if (this.f36341) {
            return;
        }
        this.f36341 = true;
        this.f36340.mo8540(this);
    }

    @Override // l.AbstractC12067
    /* JADX INFO: renamed from: ۨ */
    public final C12418 mo6791() {
        return this.f36342;
    }

    @Override // l.AbstractC12067
    /* JADX INFO: renamed from: ֨ */
    public final CharSequence mo6781() {
        return this.f36343.m45196();
    }

    @Override // l.AbstractC12067
    /* JADX INFO: renamed from: ۚ */
    public final CharSequence mo6789() {
        return this.f36343.m45197();
    }

    @Override // l.AbstractC12067
    /* JADX INFO: renamed from: ܰ */
    public final View mo6792() {
        WeakReference weakReference = this.f36345;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // l.AbstractC12067
    /* JADX INFO: renamed from: ۖ */
    public final MenuInflater mo6782() {
        return new C2893(this.f36343.getContext());
    }

    @Override // l.InterfaceC0422
    public final boolean onMenuItemSelected(C12418 c12418, MenuItem menuItem) {
        return this.f36340.mo8542(this, menuItem);
    }

    @Override // l.InterfaceC0422
    public final void onMenuModeChange(C12418 c12418) {
        mo6783();
        this.f36343.m45199();
    }
}
