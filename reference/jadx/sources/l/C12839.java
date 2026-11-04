package l;

import android.widget.ProgressBar;
import bin.mt.plugin.api.ui.PluginProgressBar;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginViewGroup;

/* JADX INFO: renamed from: l.۫ۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 57P8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12839 extends C6128 implements PluginProgressBar {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final PluginProgressBar.Style f41131;

    public C12839(PluginUI pluginUI, PluginViewGroup pluginViewGroup, PluginProgressBar.Style style) {
        super(pluginUI, pluginViewGroup);
        this.f41131 = style;
    }

    @Override // bin.mt.plugin.api.ui.PluginProgressBar
    public final PluginProgressBar.Style getStyle() {
        return this.f41131;
    }

    @Override // bin.mt.plugin.api.ui.PluginProgressBar
    public final int getProgress() {
        return ((ProgressBar) this.f20900).getProgress();
    }

    @Override // bin.mt.plugin.api.ui.PluginProgressBar
    public final int getSecondaryProgress() {
        return ((ProgressBar) this.f20900).getSecondaryProgress();
    }

    @Override // bin.mt.plugin.api.ui.PluginProgressBar
    public final int getMaxProgress() {
        return ((ProgressBar) this.f20900).getMax();
    }

    @Override // bin.mt.plugin.api.ui.PluginProgressBar
    public final boolean isIndeterminate() {
        if (this.f41131 == PluginProgressBar.Style.HORIZONTAL) {
            return ((ProgressBar) this.f20900).isIndeterminate();
        }
        return true;
    }

    @Override // bin.mt.plugin.api.ui.PluginProgressBar
    public final void setIndeterminate(boolean z) {
        if (C22415.m50557()) {
            if (this.f41131 == PluginProgressBar.Style.HORIZONTAL) {
                ((ProgressBar) this.f20900).setIndeterminate(z);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginProgressBar
    public final void setMaxProgress(int i) {
        if (C22415.m50557()) {
            if (this.f41131 == PluginProgressBar.Style.HORIZONTAL) {
                ((ProgressBar) this.f20900).setMax(i);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginProgressBar
    public final void setProgress(int i) {
        if (C22415.m50557()) {
            if (this.f41131 == PluginProgressBar.Style.HORIZONTAL) {
                ((ProgressBar) this.f20900).setProgress(i);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginProgressBar
    public final void setSecondaryProgress(int i) {
        if (C22415.m50557()) {
            if (this.f41131 == PluginProgressBar.Style.HORIZONTAL) {
                ((ProgressBar) this.f20900).setSecondaryProgress(i);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }
}
