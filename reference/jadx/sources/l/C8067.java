package l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ScrollView;

/* JADX INFO: renamed from: l.۠ۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1Z9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8067 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18540 f28282;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public DialogInterface.OnShowListener f28283;

    public C8067(Context context) {
        this.f28282 = new C18540(context);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Context m21273() {
        return this.f28282.getContext();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m21274(int i) {
        this.f28282.setTitle(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m21277(CharSequence charSequence) {
        this.f28282.setTitle(charSequence);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21253(int i) {
        this.f28282.setMessage(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21261(CharSequence charSequence) {
        this.f28282.setMessage(charSequence);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m21251(int i, DialogInterface.OnClickListener onClickListener) {
        this.f28282.setPositiveButton(i, onClickListener);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m21272(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f28282.setPositiveButton(charSequence, onClickListener);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m21275(int i, DialogInterface.OnClickListener onClickListener) {
        this.f28282.setNegativeButton(i, onClickListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21262(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f28282.setNegativeButton(charSequence, onClickListener);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m21271(int i, DialogInterface.OnClickListener onClickListener) {
        this.f28282.setNeutralButton(i, onClickListener);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m21278(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f28282.setNeutralButton(charSequence, onClickListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21265(boolean z) {
        this.f28282.setCancelable(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21256(DialogInterface.OnCancelListener onCancelListener) {
        this.f28282.setOnCancelListener(onCancelListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21257(DialogInterface.OnDismissListener onDismissListener) {
        this.f28282.setOnDismissListener(onDismissListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21264(DialogInterfaceOnShowListenerC19207 dialogInterfaceOnShowListenerC19207) {
        this.f28283 = dialogInterfaceOnShowListenerC19207;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21263(DialogInterfaceOnKeyListenerC10035 dialogInterfaceOnKeyListenerC10035) {
        this.f28282.setOnKeyListener(dialogInterfaceOnKeyListenerC10035);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21255(int i, DialogInterface.OnClickListener onClickListener) {
        this.f28282.setItems(i, onClickListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21267(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        this.f28282.setItems(charSequenceArr, onClickListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21259(BaseAdapter baseAdapter, DialogInterfaceOnClickListenerC9948 dialogInterfaceOnClickListenerC9948) {
        this.f28282.setAdapter(baseAdapter, dialogInterfaceOnClickListenerC9948);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21268(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        this.f28282.setMultiChoiceItems(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21254(int i, int i2, DialogInterface.OnClickListener onClickListener) {
        this.f28282.setSingleChoiceItems(i, i2, onClickListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21266(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
        this.f28282.setSingleChoiceItems(charSequenceArr, i, onClickListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21260(ListAdapter listAdapter, DialogInterfaceOnClickListenerC8619 dialogInterfaceOnClickListenerC8619) {
        this.f28282.setSingleChoiceItems(listAdapter, -1, dialogInterfaceOnClickListenerC8619);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m21270(int i) {
        this.f28282.setView(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21258(View view) {
        this.f28282.setView(view);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m21276(View view) {
        ScrollView scrollView = new ScrollView(view.getContext());
        scrollView.addView(view);
        scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f28282.setView(scrollView);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC19356 m21252() {
        DialogInterfaceC19356 dialogInterfaceC19356 = new DialogInterfaceC19356(this.f28282.create());
        DialogInterface.OnShowListener onShowListener = this.f28283;
        if (onShowListener != null) {
            dialogInterfaceC19356.m44369(onShowListener);
        }
        return dialogInterfaceC19356;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC19356 m21269() {
        DialogInterfaceC19356 dialogInterfaceC19356M21252 = m21252();
        dialogInterfaceC19356M21252.m44362();
        return dialogInterfaceC19356M21252;
    }
}
