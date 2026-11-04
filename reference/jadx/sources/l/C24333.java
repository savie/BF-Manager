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

/* JADX INFO: renamed from: l.᩺ܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 77QL */
/* JADX INFO: loaded from: classes2.dex */
public final class C24333 extends AbstractC0907 implements PluginSpinnerBuilder {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public PluginSpinner.OnItemSelectedListener f78926;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f78927;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public Integer f78928;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public List f78929;

    @Override // l.AbstractC0907
    /* JADX INFO: renamed from: ۙ */
    public final void mo3674(C6128 c6128) {
        final C17314 c17314 = (C17314) c6128;
        super.mo3674(c17314);
        List list = this.f78929;
        if (list != null) {
            c17314.setItems(list);
        }
        PluginSpinner.OnItemSelectedListener onItemSelectedListener = this.f78926;
        if (onItemSelectedListener != null) {
            if (this.f78927) {
                c17314.setOnItemSelectedListener(onItemSelectedListener);
            } else {
                ((Spinner) c17314.m17689()).post(new Runnable() { // from class: l.ۛܰ֫
                    @Override // java.lang.Runnable
                    public final void run() {
                        c17314.setOnItemSelectedListener(this.f21667.f78926);
                    }
                });
            }
        }
        Integer num = this.f78928;
        if (num != null) {
            c17314.setSelection(num.intValue());
        }
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginSpinnerBuilder
    public final PluginSpinnerBuilder items(List list) {
        this.f78929 = list;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginSpinnerBuilder
    public final PluginSpinnerBuilder postOnItemSelected(PluginSpinner.OnItemSelectedListener onItemSelectedListener) {
        this.f78927 = false;
        this.f78926 = onItemSelectedListener;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginSpinnerBuilder
    public final PluginSpinnerBuilder onItemSelected(PluginSpinner.OnItemSelectedListener onItemSelectedListener) {
        this.f78927 = true;
        this.f78926 = onItemSelectedListener;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginSpinnerBuilder
    public final PluginSpinnerBuilder selection(int i) {
        this.f78928 = Integer.valueOf(i);
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
            this.f78928 = Integer.valueOf(i);
            return this;
        }
        this.f78928 = Integer.valueOf(jSONObject.getInt(requireId(), i));
        return this;
    }

    @Override // l.AbstractC0907
    /* JADX INFO: renamed from: ۙ */
    public final C6128 mo2280(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        return new C17314(pluginUI, pluginViewGroup);
    }

    @Override // l.AbstractC0907
    /* JADX INFO: renamed from: ۙ */
    public final View mo2279(Context context) {
        return new C10467(context, null);
    }
}
