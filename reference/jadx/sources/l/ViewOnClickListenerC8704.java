package l;

import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: l.ۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S696 */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC8704 implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7292 f29931;

    public ViewOnClickListenerC8704(C7292 c7292) {
        this.f29931 = c7292;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ((C19287) adapterView.getAdapter()).getClass();
        C7292 c7292 = this.f29931;
        c7292.m19434();
        C19287 c19287 = c7292.f24213;
        c19287.getClass();
        c19287.getClass();
        throw null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C7292 c7292 = this.f29931;
        C19287 c19287 = c7292.f24213;
        if (view == c7292.f24216) {
            c7292.m19434();
            c19287.getClass();
            throw null;
        }
        if (view == c7292.f24219) {
            c19287.getClass();
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        throw new IllegalArgumentException();
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C7292 c7292 = this.f29931;
        if (view == c7292.f24216) {
            c7292.f24213.getClass();
            throw null;
        }
        throw new IllegalArgumentException();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C7292 c7292 = this.f29931;
        c7292.getClass();
        c7292.getClass();
    }
}
