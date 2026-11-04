package l;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۖ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: U5VL */
/* JADX INFO: loaded from: classes3.dex */
public final class C2659 extends AbstractC10116 implements InterfaceC7662 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Context f8468;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C9898 f8469;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C0094 f8470;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f8471;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC19067 f8472;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public WeakReference f8473;

    public C2659(Context context, C0094 c0094, InterfaceC19067 interfaceC19067) {
        this.f8468 = context;
        this.f8470 = c0094;
        this.f8472 = interfaceC19067;
        C9898 defaultShowAsAction = new C9898(c0094.getContext()).setDefaultShowAsAction(1);
        this.f8469 = defaultShowAsAction;
        defaultShowAsAction.setCallback(this);
    }

    @Override // l.AbstractC10116
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo8811(CharSequence charSequence) {
        this.f8470.m1192(charSequence);
    }

    @Override // l.AbstractC10116
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8803(CharSequence charSequence) {
        this.f8470.m1185(charSequence);
    }

    @Override // l.AbstractC10116
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo8810(int i) {
        mo8811(this.f8468.getString(i));
    }

    @Override // l.AbstractC10116
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8801(int i) {
        mo8803((CharSequence) this.f8468.getString(i));
    }

    @Override // l.AbstractC10116
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8804(boolean z) {
        super.mo8804(z);
        this.f8470.m1187(z);
    }

    @Override // l.AbstractC10116
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo8806() {
        return this.f8470.m1193();
    }

    @Override // l.AbstractC10116
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8802(View view) {
        this.f8470.m1184(view);
        this.f8473 = view != null ? new WeakReference(view) : null;
    }

    @Override // l.AbstractC10116
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8799() {
        this.f8472.mo23250(this, this.f8469);
    }

    @Override // l.AbstractC10116
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8800() {
        if (this.f8471) {
            return;
        }
        this.f8471 = true;
        this.f8472.mo23249(this);
    }

    @Override // l.AbstractC10116
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C9898 mo8805() {
        return this.f8469;
    }

    @Override // l.AbstractC10116
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final CharSequence mo8807() {
        return this.f8470.m1188();
    }

    @Override // l.AbstractC10116
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final CharSequence mo8808() {
        return this.f8470.m1191();
    }

    @Override // l.AbstractC10116
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final View mo8809() {
        WeakReference weakReference = this.f8473;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // l.AbstractC10116
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final MenuInflater mo8812() {
        return new C21833(this.f8470.getContext());
    }

    @Override // l.InterfaceC7662
    public final boolean onMenuItemSelected(C9898 c9898, MenuItem menuItem) {
        return this.f8472.mo23251(this, menuItem);
    }

    @Override // l.InterfaceC7662
    public final void onMenuModeChange(C9898 c9898) {
        mo8799();
        this.f8470.m1189();
    }
}
