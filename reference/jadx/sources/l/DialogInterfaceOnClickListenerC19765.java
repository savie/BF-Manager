package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;

/* JADX INFO: renamed from: l.᩵᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes5.dex */
public final class DialogInterfaceOnClickListenerC19765 implements InterfaceC16942, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public CharSequence f63505;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ListAdapter f63506;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12709 f63507;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC7957 f63508;

    @Override // l.InterfaceC16942
    public final Drawable getBackground() {
        return null;
    }

    @Override // l.InterfaceC16942
    public final void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // l.InterfaceC16942
    /* JADX INFO: renamed from: ۙ */
    public final int mo39654() {
        return 0;
    }

    @Override // l.InterfaceC16942
    /* JADX INFO: renamed from: ۙ */
    public final void mo39655(int i) {
    }

    @Override // l.InterfaceC16942
    /* JADX INFO: renamed from: ۨ */
    public final int mo39656() {
        return 0;
    }

    @Override // l.InterfaceC16942
    /* JADX INFO: renamed from: ۨ */
    public final void mo38352(int i) {
    }

    @Override // l.InterfaceC16942
    /* JADX INFO: renamed from: ܰ */
    public final void mo39657(int i) {
    }

    public DialogInterfaceOnClickListenerC19765(C12709 c12709) {
        this.f63507 = c12709;
    }

    @Override // l.InterfaceC16942
    public final void dismiss() {
        DialogInterfaceC7957 dialogInterfaceC7957 = this.f63508;
        if (dialogInterfaceC7957 != null) {
            dialogInterfaceC7957.dismiss();
            this.f63508 = null;
        }
    }

    @Override // l.InterfaceC16942
    public final boolean isShowing() {
        DialogInterfaceC7957 dialogInterfaceC7957 = this.f63508;
        if (dialogInterfaceC7957 != null) {
            return dialogInterfaceC7957.isShowing();
        }
        return false;
    }

    @Override // l.InterfaceC16942
    /* JADX INFO: renamed from: ۙ */
    public final void mo18833(ListAdapter listAdapter) {
        this.f63506 = listAdapter;
    }

    @Override // l.InterfaceC16942
    /* JADX INFO: renamed from: ۙ */
    public final void mo38351(CharSequence charSequence) {
        this.f63505 = charSequence;
    }

    @Override // l.InterfaceC16942
    /* JADX INFO: renamed from: ܰ */
    public final CharSequence mo38353() {
        return this.f63505;
    }

    @Override // l.InterfaceC16942
    /* JADX INFO: renamed from: ۙ */
    public final void mo38350(int i, int i2) {
        if (this.f63506 == null) {
            return;
        }
        C12709 c12709 = this.f63507;
        C18540 c18540 = new C18540(c12709.getPopupContext());
        CharSequence charSequence = this.f63505;
        if (charSequence != null) {
            c18540.setTitle(charSequence);
        }
        DialogInterfaceC7957 dialogInterfaceC7957Create = c18540.setSingleChoiceItems(this.f63506, c12709.getSelectedItemPosition(), this).create();
        this.f63508 = dialogInterfaceC7957Create;
        C21362 c21362M21015 = dialogInterfaceC7957Create.m21015();
        c21362M21015.setTextDirection(i);
        c21362M21015.setTextAlignment(i2);
        this.f63508.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C12709 c12709 = this.f63507;
        c12709.setSelection(i);
        if (c12709.getOnItemClickListener() != null) {
            c12709.performItemClick(null, i, this.f63506.getItemId(i));
        }
        dismiss();
    }
}
