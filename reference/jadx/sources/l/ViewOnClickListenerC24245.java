package l;

import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: l.᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S696 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC24245 implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14547 f78536;

    public ViewOnClickListenerC24245(C14547 c14547) {
        this.f78536 = c14547;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ((C6345) adapterView.getAdapter()).getClass();
        C14547 c14547 = this.f78536;
        c14547.m35098();
        C6345 c6345 = c14547.f45854;
        c6345.getClass();
        c6345.getClass();
        throw null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C14547 c14547 = this.f78536;
        C6345 c6345 = c14547.f45854;
        if (view == c14547.f45850) {
            c14547.m35098();
            c6345.getClass();
            throw null;
        }
        if (view == c14547.f45855) {
            c6345.getClass();
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        throw new IllegalArgumentException();
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C14547 c14547 = this.f78536;
        if (view == c14547.f45850) {
            c14547.f45854.getClass();
            throw null;
        }
        throw new IllegalArgumentException();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C14547 c14547 = this.f78536;
        c14547.getClass();
        c14547.getClass();
    }
}
