package l;

import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import bin.mt.plugin.api.ui.PluginSpinner;
import java.util.List;

/* JADX INFO: renamed from: l.ܽۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X7NV */
/* JADX INFO: loaded from: classes5.dex */
public final class C17314 extends C6128 implements PluginSpinner {
    @Override // bin.mt.plugin.api.ui.PluginSpinner
    public final void setItems(List list) {
        ((Spinner) this.f20900).setAdapter((SpinnerAdapter) new C3054(((Spinner) this.f20900).getContext(), list));
    }

    @Override // bin.mt.plugin.api.ui.PluginSpinner
    public final void setOnItemSelectedListener(PluginSpinner.OnItemSelectedListener onItemSelectedListener) {
        if (onItemSelectedListener == null) {
            ((Spinner) this.f20900).setOnItemSelectedListener(null);
        } else {
            ((Spinner) this.f20900).setOnItemSelectedListener(new C16568(this, onItemSelectedListener));
        }
    }

    @Override // bin.mt.plugin.api.ui.PluginSpinner
    public final int getSelection() {
        return ((Spinner) this.f20900).getSelectedItemPosition();
    }

    @Override // bin.mt.plugin.api.ui.PluginSpinner
    public final Object getSelectedItem() {
        return ((Spinner) this.f20900).getSelectedItem();
    }

    @Override // bin.mt.plugin.api.ui.PluginSpinner
    public final Object getItem(int i) {
        return ((Spinner) this.f20900).getItemAtPosition(i);
    }

    @Override // bin.mt.plugin.api.ui.PluginSpinner
    public final int getCount() {
        return ((Spinner) this.f20900).getCount();
    }

    @Override // bin.mt.plugin.api.ui.PluginSpinner
    public final void setSelection(int i) {
        if (C22415.m50557()) {
            if (i < 0 || i >= ((Spinner) this.f20900).getCount()) {
                i = 0;
            }
            ((Spinner) this.f20900).setSelection(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }
}
