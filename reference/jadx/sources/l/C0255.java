package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/* JADX INFO: renamed from: l.֡ۜ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes2.dex */
public final class C0255 extends BaseAdapter {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5900 f1487;

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

    public C0255(C5900 c5900) {
        this.f1487 = c5900;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f1487.f20125.m28829().size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        return C5900.m16140(this.f1487, i, view, viewGroup);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        try {
            return !this.f1487.f20125.m28769(i).mo7984();
        } catch (Exception unused) {
            return true;
        }
    }
}
