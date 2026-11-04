package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;

/* JADX INFO: renamed from: l.ۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnClickListenerC6740 implements InterfaceC19418, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10467 f22459;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ListAdapter f22460;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public CharSequence f22461;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC12551 f22462;

    @Override // l.InterfaceC19418
    public final Drawable getBackground() {
        return null;
    }

    @Override // l.InterfaceC19418
    public final void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // l.InterfaceC19418
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo18832() {
        return 0;
    }

    @Override // l.InterfaceC19418
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18833(int i) {
    }

    @Override // l.InterfaceC19418
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int mo18837() {
        return 0;
    }

    @Override // l.InterfaceC19418
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo18838(int i) {
    }

    @Override // l.InterfaceC19418
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo18840(int i) {
    }

    public DialogInterfaceOnClickListenerC6740(C10467 c10467) {
        this.f22459 = c10467;
    }

    @Override // l.InterfaceC19418
    public final void dismiss() {
        DialogInterfaceC12551 dialogInterfaceC12551 = this.f22462;
        if (dialogInterfaceC12551 != null) {
            dialogInterfaceC12551.dismiss();
            this.f22462 = null;
        }
    }

    @Override // l.InterfaceC19418
    public final boolean isShowing() {
        DialogInterfaceC12551 dialogInterfaceC12551 = this.f22462;
        if (dialogInterfaceC12551 != null) {
            return dialogInterfaceC12551.isShowing();
        }
        return false;
    }

    @Override // l.InterfaceC19418
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18835(ListAdapter listAdapter) {
        this.f22460 = listAdapter;
    }

    @Override // l.InterfaceC19418
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18836(CharSequence charSequence) {
        this.f22461 = charSequence;
    }

    @Override // l.InterfaceC19418
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final CharSequence mo18839() {
        return this.f22461;
    }

    @Override // l.InterfaceC19418
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18834(int i, int i2) {
        if (this.f22460 == null) {
            return;
        }
        C10467 c10467 = this.f22459;
        C20756 c20756 = new C20756(c10467.getPopupContext());
        CharSequence charSequence = this.f22461;
        if (charSequence != null) {
            c20756.setTitle(charSequence);
        }
        DialogInterfaceC12551 dialogInterfaceC12551Create = c20756.setSingleChoiceItems(this.f22460, c10467.getSelectedItemPosition(), this).create();
        this.f22462 = dialogInterfaceC12551Create;
        C23740 c23740M31226 = dialogInterfaceC12551Create.m31226();
        c23740M31226.setTextDirection(i);
        c23740M31226.setTextAlignment(i2);
        this.f22462.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C10467 c10467 = this.f22459;
        c10467.setSelection(i);
        if (c10467.getOnItemClickListener() != null) {
            c10467.performItemClick(null, i, this.f22460.getItemId(i));
        }
        dismiss();
    }
}
