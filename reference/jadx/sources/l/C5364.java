package l;

import bin.mt.plugin.api.ui.PluginButton;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginViewGroup;

/* JADX INFO: renamed from: l.ۚ۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47RN */
/* JADX INFO: loaded from: classes3.dex */
public class C5364 extends C11010 implements PluginButton {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final PluginButton.Style f18524;

    @Override // bin.mt.plugin.api.ui.PluginButton
    public final PluginButton.Style getStyle() {
        return this.f18524;
    }

    public C5364(PluginUI pluginUI, PluginViewGroup pluginViewGroup, PluginButton.Style style) {
        super(pluginUI, pluginViewGroup);
        this.f18524 = style;
    }
}
