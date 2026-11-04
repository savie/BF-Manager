package l;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* JADX INFO: renamed from: l.ۜ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 355C */
/* JADX INFO: loaded from: classes3.dex */
public final class C7134 extends ActionMode {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context f23490;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC10116 f23491;

    public C7134(Context context, AbstractC10116 abstractC10116) {
        this.f23490 = context;
        this.f23491 = abstractC10116;
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f23491.m26072();
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f23491.m26070(obj);
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f23491.mo8811(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f23491.mo8803(charSequence);
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f23491.mo8799();
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f23491.mo8800();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC24707(this.f23490, this.f23491.mo8805());
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f23491.mo8807();
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f23491.mo8810(i);
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f23491.mo8808();
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f23491.mo8801(i);
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f23491.mo8809();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f23491.mo8802(view);
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f23491.mo8812();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f23491.m26071();
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.f23491.mo8804(z);
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f23491.mo8806();
    }
}
