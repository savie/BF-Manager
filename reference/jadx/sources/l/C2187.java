package l;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۖ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 45OX */
/* JADX INFO: loaded from: classes2.dex */
public final class C2187 extends AbstractC12067 implements InterfaceC0422 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Context f7926;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5010 f7927;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public WeakReference f7928;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC16300 f7929;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C12418 f7930;

    public C2187(C5010 c5010, Context context, InterfaceC16300 interfaceC16300) {
        this.f7927 = c5010;
        this.f7926 = context;
        this.f7929 = interfaceC16300;
        C12418 defaultShowAsAction = new C12418(context).setDefaultShowAsAction(1);
        this.f7930 = defaultShowAsAction;
        defaultShowAsAction.setCallback(this);
    }

    @Override // l.AbstractC12067
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final MenuInflater mo6782() {
        return new C2893(this.f7926);
    }

    @Override // l.AbstractC12067
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C12418 mo6791() {
        return this.f7930;
    }

    @Override // l.AbstractC12067
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6784() {
        C5010 c5010 = this.f7927;
        if (c5010.f17431 != this) {
            return;
        }
        if (c5010.f17448) {
            c5010.f17433 = this;
            c5010.f17450 = this.f7929;
        } else {
            ((C2809) this.f7929).mo8540(this);
        }
        this.f7929 = null;
        c5010.m13892(false);
        c5010.f17449.m45190();
        c5010.f17437.m26977(c5010.f17444);
        c5010.f17431 = null;
    }

    @Override // l.AbstractC12067
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void mo6783() {
        if (this.f7927.f17431 != this) {
            return;
        }
        C12418 c12418 = this.f7930;
        c12418.stopDispatchingItemsChanged();
        try {
            this.f7929.mo8541(this, c12418);
        } finally {
            c12418.startDispatchingItemsChanged();
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m6795() {
        C12418 c12418 = this.f7930;
        c12418.stopDispatchingItemsChanged();
        try {
            return ((C2809) this.f7929).m8543(this, c12418);
        } finally {
            c12418.startDispatchingItemsChanged();
        }
    }

    @Override // l.AbstractC12067
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6786(View view) {
        this.f7927.f17449.m45191(view);
        this.f7928 = new WeakReference(view);
    }

    @Override // l.AbstractC12067
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6787(CharSequence charSequence) {
        this.f7927.f17449.m45192(charSequence);
    }

    @Override // l.AbstractC12067
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo6794(CharSequence charSequence) {
        this.f7927.f17449.m45198(charSequence);
    }

    @Override // l.AbstractC12067
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo6793(int i) {
        mo6794(this.f7927.f17432.getResources().getString(i));
    }

    @Override // l.AbstractC12067
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6785(int i) {
        mo6787((CharSequence) this.f7927.f17432.getResources().getString(i));
    }

    @Override // l.AbstractC12067
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final CharSequence mo6781() {
        return this.f7927.f17449.m45196();
    }

    @Override // l.AbstractC12067
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final CharSequence mo6789() {
        return this.f7927.f17449.m45197();
    }

    @Override // l.AbstractC12067
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6788(boolean z) {
        super.mo6788(z);
        this.f7927.f17449.m45194(z);
    }

    @Override // l.AbstractC12067
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean mo6790() {
        return this.f7927.f17449.m45188();
    }

    @Override // l.AbstractC12067
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final View mo6792() {
        WeakReference weakReference = this.f7928;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // l.InterfaceC0422
    public final boolean onMenuItemSelected(C12418 c12418, MenuItem menuItem) {
        InterfaceC16300 interfaceC16300 = this.f7929;
        if (interfaceC16300 != null) {
            return ((C2809) interfaceC16300).mo8542(this, menuItem);
        }
        return false;
    }

    @Override // l.InterfaceC0422
    public final void onMenuModeChange(C12418 c12418) {
        if (this.f7929 == null) {
            return;
        }
        mo6783();
        this.f7927.f17449.m45199();
    }
}
