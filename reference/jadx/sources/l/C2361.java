package l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ScrollView;

/* JADX INFO: renamed from: l.ۖۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1Z9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2361 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20756 f7614;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public DialogInterface.OnShowListener f7615;

    public C2361(Context context) {
        this.f7614 = new C20756(context);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Context m8020() {
        return this.f7614.getContext();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m8021(int i) {
        this.f7614.setTitle(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m8024(CharSequence charSequence) {
        this.f7614.setTitle(charSequence);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8000(int i) {
        this.f7614.setMessage(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8008(CharSequence charSequence) {
        this.f7614.setMessage(charSequence);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m8026(int i, DialogInterface.OnClickListener onClickListener) {
        this.f7614.setPositiveButton(i, onClickListener);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m8019(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f7614.setPositiveButton(charSequence, onClickListener);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m8022(int i, DialogInterface.OnClickListener onClickListener) {
        this.f7614.setNegativeButton(i, onClickListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8009(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f7614.setNegativeButton(charSequence, onClickListener);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m8018(int i, DialogInterface.OnClickListener onClickListener) {
        this.f7614.setNeutralButton(i, onClickListener);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m8025(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f7614.setNeutralButton(charSequence, onClickListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8012(boolean z) {
        this.f7614.setCancelable(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8003(DialogInterface.OnCancelListener onCancelListener) {
        this.f7614.setOnCancelListener(onCancelListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8004(DialogInterface.OnDismissListener onDismissListener) {
        this.f7614.setOnDismissListener(onDismissListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8010(DialogInterfaceOnShowListenerC10906 dialogInterfaceOnShowListenerC10906) {
        this.f7615 = dialogInterfaceOnShowListenerC10906;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8011(DialogInterfaceOnKeyListenerC19857 dialogInterfaceOnKeyListenerC19857) {
        this.f7614.setOnKeyListener(dialogInterfaceOnKeyListenerC19857);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8002(int i, DialogInterface.OnClickListener onClickListener) {
        this.f7614.setItems(i, onClickListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8014(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        this.f7614.setItems(charSequenceArr, onClickListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8006(BaseAdapter baseAdapter, DialogInterfaceOnClickListenerC14427 dialogInterfaceOnClickListenerC14427) {
        this.f7614.setAdapter(baseAdapter, dialogInterfaceOnClickListenerC14427);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8015(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        this.f7614.setMultiChoiceItems(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8001(int i, int i2, DialogInterface.OnClickListener onClickListener) {
        this.f7614.setSingleChoiceItems(i, i2, onClickListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8013(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
        this.f7614.setSingleChoiceItems(charSequenceArr, i, onClickListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8007(ListAdapter listAdapter, DialogInterfaceOnClickListenerC6071 dialogInterfaceOnClickListenerC6071) {
        this.f7614.setSingleChoiceItems(listAdapter, -1, dialogInterfaceOnClickListenerC6071);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m8017(int i) {
        this.f7614.setView(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8005(View view) {
        this.f7614.setView(view);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m8023(View view) {
        ScrollView scrollView = new ScrollView(view.getContext());
        scrollView.addView(view);
        scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f7614.setView(scrollView);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC8327 m7999() {
        DialogInterfaceC8327 dialogInterfaceC8327 = new DialogInterfaceC8327(this.f7614.create());
        DialogInterface.OnShowListener onShowListener = this.f7615;
        if (onShowListener != null) {
            dialogInterfaceC8327.m22428(onShowListener);
        }
        return dialogInterfaceC8327;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC8327 m8016() {
        DialogInterfaceC8327 dialogInterfaceC8327M7999 = m7999();
        dialogInterfaceC8327M7999.m22432();
        return dialogInterfaceC8327M7999;
    }
}
