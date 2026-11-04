package l;

import bin.mt.json.JSONObject;
import bin.mt.plugin.api.ui.PluginCompoundButton;
import bin.mt.plugin.api.ui.builder.PluginBaseCompoundButtonBuilder;
import bin.mt.plugin.api.ui.builder.PluginUIBuilder;

/* JADX INFO: renamed from: l.۟ۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 07NZ */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7619 extends AbstractC0161 implements PluginBaseCompoundButtonBuilder {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Boolean f25151;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public PluginCompoundButton.OnCheckedChangeListener f25152;

    @Override // l.AbstractC9855
    /* JADX INFO: renamed from: ۙ, reason: merged with bridge method [inline-methods] */
    public void mo3674(AbstractC9700 abstractC9700) {
        super.mo3674((C23282) abstractC9700);
        PluginCompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f25152;
        if (onCheckedChangeListener != null) {
            abstractC9700.setOnCheckedChangeListener(onCheckedChangeListener);
        }
        Boolean bool = this.f25151;
        if (bool != null) {
            abstractC9700.setChecked(bool.booleanValue());
        }
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseCompoundButtonBuilder
    public final PluginUIBuilder onCheckedChange(PluginCompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f25152 = onCheckedChangeListener;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseCompoundButtonBuilder
    public final PluginUIBuilder checked(boolean z) {
        this.f25151 = Boolean.valueOf(z);
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
            this.f25151 = Boolean.valueOf(z);
            return this;
        }
        this.f25151 = Boolean.valueOf(jSONObject.getBoolean(requireId(), z));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseCompoundButtonBuilder
    public final PluginUIBuilder check() {
        this.f25151 = Boolean.TRUE;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseCompoundButtonBuilder
    public final PluginUIBuilder uncheck() {
        this.f25151 = Boolean.FALSE;
        return this;
    }
}
