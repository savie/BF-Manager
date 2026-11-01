package l;

import android.content.Context;
import android.view.View;
import android.widget.Spinner;
import bin.mt.json.JSONObject;
import bin.mt.plugin.api.ui.PluginSpinner;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginViewGroup;
import bin.mt.plugin.api.ui.builder.PluginSpinnerBuilder;
import java.util.List;

/* JADX INFO: renamed from: l.ۗۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77QL */
/* JADX INFO: loaded from: classes3.dex */
public final class C2978 extends AbstractC6506 implements PluginSpinnerBuilder {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public PluginSpinner.OnItemSelectedListener f11154;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f11155;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public List f11156;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public Integer f11157;

    @Override // l.AbstractC6506
    /* JADX INFO: renamed from: ۙ */
    public final void mo1252(C3247 c3247) {
        final C17359 c17359 = (C17359) c3247;
        super.mo1252(c17359);
        List list = this.f11156;
        if (list != null) {
            c17359.setItems(list);
        }
        PluginSpinner.OnItemSelectedListener onItemSelectedListener = this.f11154;
        if (onItemSelectedListener != null) {
            if (this.f11155) {
                c17359.setOnItemSelectedListener(onItemSelectedListener);
            } else {
                ((Spinner) c17359.m9720()).post(new Runnable() { // from class: l.ۢۘۘ
                    @Override // java.lang.Runnable
                    public final void run() {
                        c17359.setOnItemSelectedListener(this.f31679.f11154);
                    }
                });
            }
        }
        Integer num = this.f11157;
        if (num != null) {
            c17359.setSelection(num.intValue());
        }
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginSpinnerBuilder
    public final PluginSpinnerBuilder items(List list) {
        this.f11156 = list;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginSpinnerBuilder
    public final PluginSpinnerBuilder postOnItemSelected(PluginSpinner.OnItemSelectedListener onItemSelectedListener) {
        this.f11155 = false;
        this.f11154 = onItemSelectedListener;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginSpinnerBuilder
    public final PluginSpinnerBuilder onItemSelected(PluginSpinner.OnItemSelectedListener onItemSelectedListener) {
        this.f11155 = true;
        this.f11154 = onItemSelectedListener;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginSpinnerBuilder
    public final PluginSpinnerBuilder selection(int i) {
        this.f11157 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginSpinnerBuilder
    public final PluginSpinnerBuilder selection(JSONObject jSONObject) {
        selection(jSONObject, 0);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginSpinnerBuilder
    public final PluginSpinnerBuilder selection(JSONObject jSONObject, int i) {
        if (jSONObject == null) {
            this.f11157 = Integer.valueOf(i);
            return this;
        }
        this.f11157 = Integer.valueOf(jSONObject.getInt(requireId(), i));
        return this;
    }

    @Override // l.AbstractC6506
    /* JADX INFO: renamed from: ۙ */
    public final C3247 mo1251(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        return new C17359(pluginUI, pluginViewGroup);
    }

    @Override // l.AbstractC6506
    /* JADX INFO: renamed from: ۙ */
    public final View mo1250(Context context) {
        return new C12709(context, null);
    }
}
