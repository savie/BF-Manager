package l;

import android.content.Context;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginViewGroup;
import bin.mt.plugin.api.ui.builder.PluginBaseViewGroupBuilder;
import bin.mt.plugin.api.ui.builder.PluginUIBuilder;
import bin.mt.plugin.api.util.Consumer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܶۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7NW */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14974 extends AbstractC6506 implements PluginBaseViewGroupBuilder {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C22735 f48882;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public PluginUI.Style f48883;

    public AbstractC14974(PluginUIBuilder pluginUIBuilder, PluginUI.Style style) {
        super(pluginUIBuilder);
        this.f48882 = new C22735(this);
        C13638.requireNonNull(style);
        this.f48883 = style;
    }

    public PluginUI.Style getChildrenStyle() {
        return this.f48883;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewGroupBuilder
    public PluginUIBuilder childrenStyle(PluginUI.Style style) {
        if (style instanceof PluginUI.StyleWrapper) {
            PluginUI.StyleWrapper styleWrapper = (PluginUI.StyleWrapper) style;
            if (styleWrapper.getBaseStyle() == null) {
                styleWrapper.attachStyle(this.f48883);
            }
        }
        C13638.requireNonNull(style, "Style cannot be null");
        this.f48883 = style;
        return this;
    }

    public PluginUIBuilder children(Consumer consumer) {
        consumer.mo42471accept(this.f48882);
        return this;
    }

    @Override // l.AbstractC6506
    /* JADX INFO: renamed from: ۙ */
    public C14538 mo17707(PluginUI pluginUI, PluginViewGroup pluginViewGroup, Context context) {
        C14538 c14538 = (C14538) super.mo17707(pluginUI, pluginViewGroup, context);
        C22735 c22735 = this.f48882;
        Iterator it = c22735.f74066.iterator();
        while (it.hasNext()) {
            c14538.mo23047(((AbstractC6506) it.next()).mo17707(pluginUI, c14538, context));
        }
        ArrayList arrayList = c22735.f74065;
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                c14538.unifyWidth((String[]) it2.next());
            }
        }
        return c14538;
    }
}
