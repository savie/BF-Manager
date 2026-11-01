package l;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۙۘ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: N155 */
/* JADX INFO: loaded from: classes3.dex */
public class C4406 extends BaseAdapter implements Filterable, InterfaceC6211 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f15688;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public List f15690;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final LayoutInflater f15691;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f15692;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Context f15693;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C3264 f15694;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public LayoutInflater f15696;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public ArrayList f15697;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object f15695 = new Object();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f15689 = true;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C4406(int i, Context context, List list) {
        this.f15693 = context;
        this.f15691 = LayoutInflater.from(context);
        this.f15688 = i;
        this.f15692 = i;
        this.f15690 = list;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12330(String str) {
        synchronized (this.f15695) {
            ArrayList arrayList = this.f15697;
            if (arrayList != null) {
                arrayList.add(str);
            } else {
                this.f15690.add(str);
            }
        }
        if (this.f15689) {
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12331(List list) {
        synchronized (this.f15695) {
            ArrayList arrayList = this.f15697;
            if (arrayList != null) {
                arrayList.addAll(list);
            } else {
                this.f15690.addAll(list);
            }
        }
        if (this.f15689) {
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12329() {
        synchronized (this.f15695) {
            ArrayList arrayList = this.f15697;
            if (arrayList != null) {
                arrayList.clear();
            } else {
                this.f15690.clear();
            }
        }
        if (this.f15689) {
            notifyDataSetChanged();
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.f15689 = true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m12332() {
        this.f15689 = false;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f15690.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        try {
            return this.f15690.get(i);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        return m12323(this.f15691, i, view, viewGroup, this.f15692);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private View m12323(LayoutInflater layoutInflater, int i, View view, ViewGroup viewGroup, int i2) {
        if (view == null) {
            view = layoutInflater.inflate(i2, viewGroup, false);
        }
        try {
            TextView textView = (TextView) view;
            Object item = getItem(i);
            if (item instanceof CharSequence) {
                textView.setText((CharSequence) item);
                return view;
            }
            textView.setText(item == null ? "" : item.toString());
            return view;
        } catch (ClassCastException e) {
            throw new IllegalStateException("ArrayAdapter requires the resource ID to be a TextView", e);
        }
    }

    @Override // l.InterfaceC6211
    public final void setDropDownViewTheme(Resources.Theme theme) {
        if (theme == null) {
            this.f15696 = null;
            return;
        }
        LayoutInflater layoutInflater = this.f15691;
        if (theme == layoutInflater.getContext().getTheme()) {
            this.f15696 = layoutInflater;
        } else {
            this.f15696 = LayoutInflater.from(new C5716(this.f15693, theme));
        }
    }

    @Override // l.InterfaceC6211
    public final Resources.Theme getDropDownViewTheme() {
        LayoutInflater layoutInflater = this.f15696;
        if (layoutInflater == null) {
            return null;
        }
        return layoutInflater.getContext().getTheme();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = this.f15696;
        if (layoutInflater == null) {
            layoutInflater = this.f15691;
        }
        return m12323(layoutInflater, i, view, viewGroup, this.f15688);
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f15694 == null) {
            this.f15694 = new C3264(this);
        }
        return this.f15694;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final CharSequence[] getAutofillOptions() {
        CharSequence[] autofillOptions = super.getAutofillOptions();
        if (autofillOptions != null) {
            return autofillOptions;
        }
        return null;
    }
}
