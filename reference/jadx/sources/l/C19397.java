package l;

import bin.mt.plugin.api.ui.PluginButton;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginViewGroup;

/* JADX INFO: renamed from: l.ᩳ᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 47RN */
/* JADX INFO: loaded from: classes5.dex */
public class C19397 extends C23282 implements PluginButton {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final PluginButton.Style f62691;

    @Override // bin.mt.plugin.api.ui.PluginButton
    public final PluginButton.Style getStyle() {
        return this.f62691;
    }

    public C19397(PluginUI pluginUI, PluginViewGroup pluginViewGroup, PluginButton.Style style) {
        super(pluginUI, pluginViewGroup);
        this.f62691 = style;
    }
}
