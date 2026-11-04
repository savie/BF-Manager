package l;

import android.content.Context;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginViewGroup;
import bin.mt.plugin.api.ui.builder.PluginBaseViewGroupBuilder;
import bin.mt.plugin.api.ui.builder.PluginUIBuilder;
import bin.mt.plugin.api.util.Consumer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: B7NW */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2398 extends AbstractC0907 implements PluginBaseViewGroupBuilder {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C9109 f7709;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public PluginUI.Style f7710;

    public AbstractC2398(PluginUIBuilder pluginUIBuilder, PluginUI.Style style) {
        super(pluginUIBuilder);
        this.f7709 = new C9109(this);
        C17359.requireNonNull(style);
        this.f7710 = style;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewGroupBuilder
    public PluginUI.Style getChildrenStyle() {
        return this.f7710;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewGroupBuilder
    public PluginUIBuilder childrenStyle(PluginUI.Style style) {
        if (style instanceof PluginUI.StyleWrapper) {
            PluginUI.StyleWrapper styleWrapper = (PluginUI.StyleWrapper) style;
            if (styleWrapper.getBaseStyle() == null) {
                styleWrapper.attachStyle(this.f7710);
            }
        }
        C17359.requireNonNull(style, "Style cannot be null");
        this.f7710 = style;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewGroupBuilder
    public PluginUIBuilder children(Consumer consumer) {
        consumer.accept(this.f7709);
        return this;
    }

    @Override // l.AbstractC0907
    /* JADX INFO: renamed from: ۙ */
    public C20298 mo3672(PluginUI pluginUI, PluginViewGroup pluginViewGroup, Context context) {
        C20298 c20298 = (C20298) super.mo3672(pluginUI, pluginViewGroup, context);
        C9109 c9109 = this.f7709;
        Iterator it = c9109.f29590.iterator();
        while (it.hasNext()) {
            c20298.mo46636(((AbstractC0907) it.next()).mo3672(pluginUI, c20298, context));
        }
        ArrayList arrayList = c9109.f29589;
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                c20298.unifyWidth((String[]) it2.next());
            }
        }
        return c20298;
    }
}
