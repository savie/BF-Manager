package l;

import android.view.ViewGroup;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plugin.api.ui.PluginViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩵ۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J7R9 */
/* JADX INFO: loaded from: classes5.dex */
public class C20298 extends C6128 implements PluginViewGroup {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ConcurrentMapC17249 f65157;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f65158;

    public C20298(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        super(pluginUI, pluginViewGroup);
        this.f65158 = new ArrayList();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo46636(PluginView pluginView) {
        this.f65158.add(pluginView);
        ((ViewGroup) this.f20900).addView(((C6128) pluginView).f20900);
    }

    @Override // l.C6128
    /* JADX INFO: renamed from: ۙ */
    public final PluginView mo17690(String str) {
        ConcurrentMapC17249 concurrentMapC17249 = this.f65157;
        if (concurrentMapC17249 != null) {
            return (PluginView) C23217.computeIfAbsent(concurrentMapC17249, str, new C3144(0, this));
        }
        return m46635(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public PluginView m46635(String str) {
        if (str.equals(getId())) {
            return this;
        }
        ArrayList arrayList = this.f65158;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            PluginView pluginViewFindViewById = ((PluginView) arrayList.get(i)).findViewById(str);
            if (pluginViewFindViewById != null) {
                return pluginViewFindViewById;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m46637() {
        this.f65157 = new ConcurrentMapC17249();
    }

    @Override // bin.mt.plugin.api.ui.PluginViewGroup
    public final int getChildCount() {
        return this.f65158.size();
    }

    @Override // bin.mt.plugin.api.ui.PluginViewGroup
    public final PluginView getChildAt(int i) {
        return (PluginView) this.f65158.get(i);
    }
}
