package l;

import android.os.Build;
import android.widget.LinearLayout;
import bin.mt.plugin.api.ui.PluginLinearLayout;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginViewGroup;

/* JADX INFO: renamed from: l.۟۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17MX */
/* JADX INFO: loaded from: classes4.dex */
public class C7481 extends C14538 implements PluginLinearLayout {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f24926;

    public C7481(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        super(pluginUI, pluginViewGroup);
        this.f24926 = 8388659;
    }

    @Override // bin.mt.plugin.api.ui.PluginLinearLayout
    public final boolean isHorizontal() {
        return ((LinearLayout) this.f12078).getOrientation() == 0;
    }

    @Override // bin.mt.plugin.api.ui.PluginLinearLayout
    public final boolean isVertical() {
        return ((LinearLayout) this.f12078).getOrientation() == 1;
    }

    @Override // bin.mt.plugin.api.ui.PluginLinearLayout
    public final int getGravity() {
        if (Build.VERSION.SDK_INT < 24) {
            return this.f24926;
        }
        return ((LinearLayout) this.f12078).getGravity();
    }

    @Override // bin.mt.plugin.api.ui.PluginLinearLayout
    public final void setGravity(int i) {
        if (C13890.m33728()) {
            ((LinearLayout) this.f12078).setGravity(i);
            if (Build.VERSION.SDK_INT < 24) {
                this.f24926 = i;
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }
}
