package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/* JADX INFO: renamed from: l.᩵ۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes5.dex */
public final class C20374 extends BaseAdapter {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3966 f65341;

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C20374(C3966 c3966) {
        this.f65341 = c3966;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f65341.f13564.m23215().size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        return C3966.m12713(this.f65341, i, view, viewGroup);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        try {
            return !this.f65341.f13564.m23168(i).mo8089();
        } catch (Exception unused) {
            return true;
        }
    }
}
