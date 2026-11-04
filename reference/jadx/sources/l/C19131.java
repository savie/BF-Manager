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

/* JADX INFO: renamed from: l.ᩳܰ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N155 */
/* JADX INFO: loaded from: classes5.dex */
public class C19131 extends BaseAdapter implements Filterable, InterfaceC2746 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C7944 f61907;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public List f61908;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f61909;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final LayoutInflater f61910;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public ArrayList f61911;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Context f61913;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f61914;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public LayoutInflater f61916;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object f61915 = new Object();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f61912 = true;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C19131(int i, Context context, List list) {
        this.f61913 = context;
        this.f61910 = LayoutInflater.from(context);
        this.f61914 = i;
        this.f61909 = i;
        this.f61908 = list;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44265(String str) {
        synchronized (this.f61915) {
            ArrayList arrayList = this.f61911;
            if (arrayList != null) {
                arrayList.add(str);
            } else {
                this.f61908.add(str);
            }
        }
        if (this.f61912) {
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44266(List list) {
        synchronized (this.f61915) {
            ArrayList arrayList = this.f61911;
            if (arrayList != null) {
                arrayList.addAll(list);
            } else {
                this.f61908.addAll(list);
            }
        }
        if (this.f61912) {
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44264() {
        synchronized (this.f61915) {
            ArrayList arrayList = this.f61911;
            if (arrayList != null) {
                arrayList.clear();
            } else {
                this.f61908.clear();
            }
        }
        if (this.f61912) {
            notifyDataSetChanged();
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.f61912 = true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m44267() {
        this.f61912 = false;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f61908.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        try {
            return this.f61908.get(i);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        return m44258(this.f61910, i, view, viewGroup, this.f61909);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private View m44258(LayoutInflater layoutInflater, int i, View view, ViewGroup viewGroup, int i2) {
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

    @Override // l.InterfaceC2746
    public final void setDropDownViewTheme(Resources.Theme theme) {
        if (theme == null) {
            this.f61916 = null;
            return;
        }
        LayoutInflater layoutInflater = this.f61910;
        if (theme == layoutInflater.getContext().getTheme()) {
            this.f61916 = layoutInflater;
        } else {
            this.f61916 = LayoutInflater.from(new C9370(this.f61913, theme));
        }
    }

    @Override // l.InterfaceC2746
    public final Resources.Theme getDropDownViewTheme() {
        LayoutInflater layoutInflater = this.f61916;
        if (layoutInflater == null) {
            return null;
        }
        return layoutInflater.getContext().getTheme();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = this.f61916;
        if (layoutInflater == null) {
            layoutInflater = this.f61910;
        }
        return m44258(layoutInflater, i, view, viewGroup, this.f61914);
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f61907 == null) {
            this.f61907 = new C7944(this);
        }
        return this.f61907;
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
