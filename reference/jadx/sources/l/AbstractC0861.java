package l;

import bin.mt.json.JSONObject;
import bin.mt.plugin.api.ui.PluginCompoundButton;
import bin.mt.plugin.api.ui.builder.PluginBaseCompoundButtonBuilder;
import bin.mt.plugin.api.ui.builder.PluginUIBuilder;

/* JADX INFO: renamed from: l.֨ۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07NZ */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0861 extends AbstractC22029 implements PluginBaseCompoundButtonBuilder {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Boolean f3514;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public PluginCompoundButton.OnCheckedChangeListener f3515;

    @Override // l.AbstractC3683
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public void mo1252(AbstractC13126 abstractC13126) {
        super.mo1252((C11010) abstractC13126);
        PluginCompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f3515;
        if (onCheckedChangeListener != null) {
            abstractC13126.setOnCheckedChangeListener(onCheckedChangeListener);
        }
        Boolean bool = this.f3514;
        if (bool != null) {
            abstractC13126.setChecked(bool.booleanValue());
        }
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseCompoundButtonBuilder
    public final PluginUIBuilder onCheckedChange(PluginCompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f3515 = onCheckedChangeListener;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseCompoundButtonBuilder
    public final PluginUIBuilder checked(boolean z) {
        this.f3514 = Boolean.valueOf(z);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseCompoundButtonBuilder
    public final PluginUIBuilder checked(JSONObject jSONObject) {
        checked(jSONObject, false);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseCompoundButtonBuilder
    public final PluginUIBuilder checked(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            this.f3514 = Boolean.valueOf(z);
            return this;
        }
        this.f3514 = Boolean.valueOf(jSONObject.getBoolean(requireId(), z));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseCompoundButtonBuilder
    public final PluginUIBuilder check() {
        this.f3514 = Boolean.TRUE;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseCompoundButtonBuilder
    public final PluginUIBuilder uncheck() {
        this.f3514 = Boolean.FALSE;
        return this;
    }
}
