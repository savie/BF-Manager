package l;

import android.view.ViewGroup;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plugin.api.ui.PluginViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳ۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7R9 */
/* JADX INFO: loaded from: classes5.dex */
public class C14538 extends C3247 implements PluginViewGroup {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public ConcurrentMapC13783 f47605;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f47606;

    public C14538(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        super(pluginUI, pluginViewGroup);
        this.f47606 = new ArrayList();
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo23047(PluginView pluginView) {
        this.f47606.add(pluginView);
        ((ViewGroup) this.f12078).addView(((C3247) pluginView).f12078);
    }

    @Override // l.C3247
    /* JADX INFO: renamed from: ۙ */
    public final PluginView mo9721(String str) {
        ConcurrentMapC13783 concurrentMapC13783 = this.f47605;
        if (concurrentMapC13783 != null) {
            return (PluginView) C2492.computeIfAbsent(concurrentMapC13783, str, new C23710(0, this));
        }
        return m34972(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public PluginView m34972(String str) {
        if (str.equals(getId())) {
            return this;
        }
        ArrayList arrayList = this.f47606;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            PluginView pluginViewFindViewById = ((PluginView) arrayList.get(i)).findViewById(str);
            if (pluginViewFindViewById != null) {
                return pluginViewFindViewById;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m34973() {
        this.f47605 = new ConcurrentMapC13783();
    }

    @Override // bin.mt.plugin.api.ui.PluginViewGroup
    public final int getChildCount() {
        return this.f47606.size();
    }

    @Override // bin.mt.plugin.api.ui.PluginViewGroup
    public final PluginView getChildAt(int i) {
        return (PluginView) this.f47606.get(i);
    }
}
