package l;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* JADX INFO: renamed from: l.ܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 355C */
/* JADX INFO: loaded from: classes3.dex */
public final class C14184 extends ActionMode {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context f46534;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC12067 f46535;

    public C14184(Context context, AbstractC12067 abstractC12067) {
        this.f46534 = context;
        this.f46535 = abstractC12067;
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f46535.m29985();
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f46535.m29983(obj);
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f46535.mo6794(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f46535.mo6787(charSequence);
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f46535.mo6783();
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f46535.mo6784();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC3680(this.f46534, this.f46535.mo6791());
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f46535.mo6781();
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f46535.mo6793(i);
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f46535.mo6789();
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f46535.mo6785(i);
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f46535.mo6792();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f46535.mo6786(view);
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f46535.mo6782();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f46535.m29984();
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.f46535.mo6788(z);
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f46535.mo6790();
    }
}
