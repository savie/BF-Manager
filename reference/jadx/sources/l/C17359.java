package l;

import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import bin.mt.plugin.api.ui.PluginSpinner;
import java.util.List;

/* JADX INFO: renamed from: l.ܿ۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: X7NV */
/* JADX INFO: loaded from: classes5.dex */
public final class C17359 extends C3247 implements PluginSpinner {
    @Override // bin.mt.plugin.api.ui.PluginSpinner
    public final void setItems(List list) {
        ((Spinner) this.f12078).setAdapter((SpinnerAdapter) new C0733(((Spinner) this.f12078).getContext(), list));
    }

    @Override // bin.mt.plugin.api.ui.PluginSpinner
    public final void setOnItemSelectedListener(PluginSpinner.OnItemSelectedListener onItemSelectedListener) {
        if (onItemSelectedListener == null) {
            ((Spinner) this.f12078).setOnItemSelectedListener(null);
        } else {
            ((Spinner) this.f12078).setOnItemSelectedListener(new C12421(this, onItemSelectedListener));
        }
    }

    @Override // bin.mt.plugin.api.ui.PluginSpinner
    public final int getSelection() {
        return ((Spinner) this.f12078).getSelectedItemPosition();
    }

    @Override // bin.mt.plugin.api.ui.PluginSpinner
    public final Object getSelectedItem() {
        return ((Spinner) this.f12078).getSelectedItem();
    }

    @Override // bin.mt.plugin.api.ui.PluginSpinner
    public final Object getItem(int i) {
        return ((Spinner) this.f12078).getItemAtPosition(i);
    }

    @Override // bin.mt.plugin.api.ui.PluginSpinner
    public final int getCount() {
        return ((Spinner) this.f12078).getCount();
    }

    @Override // bin.mt.plugin.api.ui.PluginSpinner
    public final void setSelection(int i) {
        if (C13890.m33728()) {
            if (i < 0 || i >= ((Spinner) this.f12078).getCount()) {
                i = 0;
            }
            ((Spinner) this.f12078).setSelection(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }
}
