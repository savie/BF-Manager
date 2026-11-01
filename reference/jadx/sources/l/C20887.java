package l;

import android.widget.ProgressBar;
import bin.mt.plugin.api.ui.PluginProgressBar;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginViewGroup;

/* JADX INFO: renamed from: l.᩷۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57P8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20887 extends C3247 implements PluginProgressBar {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final PluginProgressBar.Style f67837;

    public C20887(PluginUI pluginUI, PluginViewGroup pluginViewGroup, PluginProgressBar.Style style) {
        super(pluginUI, pluginViewGroup);
        this.f67837 = style;
    }

    @Override // bin.mt.plugin.api.ui.PluginProgressBar
    public final PluginProgressBar.Style getStyle() {
        return this.f67837;
    }

    @Override // bin.mt.plugin.api.ui.PluginProgressBar
    public final int getProgress() {
        return ((ProgressBar) this.f12078).getProgress();
    }

    @Override // bin.mt.plugin.api.ui.PluginProgressBar
    public final int getSecondaryProgress() {
        return ((ProgressBar) this.f12078).getSecondaryProgress();
    }

    @Override // bin.mt.plugin.api.ui.PluginProgressBar
    public final int getMaxProgress() {
        return ((ProgressBar) this.f12078).getMax();
    }

    @Override // bin.mt.plugin.api.ui.PluginProgressBar
    public final boolean isIndeterminate() {
        if (this.f67837 == PluginProgressBar.Style.HORIZONTAL) {
            return ((ProgressBar) this.f12078).isIndeterminate();
        }
        return true;
    }

    @Override // bin.mt.plugin.api.ui.PluginProgressBar
    public final void setIndeterminate(boolean z) {
        if (C13890.m33728()) {
            if (this.f67837 == PluginProgressBar.Style.HORIZONTAL) {
                ((ProgressBar) this.f12078).setIndeterminate(z);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginProgressBar
    public final void setMaxProgress(int i) {
        if (C13890.m33728()) {
            if (this.f67837 == PluginProgressBar.Style.HORIZONTAL) {
                ((ProgressBar) this.f12078).setMax(i);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginProgressBar
    public final void setProgress(int i) {
        if (C13890.m33728()) {
            if (this.f67837 == PluginProgressBar.Style.HORIZONTAL) {
                ((ProgressBar) this.f12078).setProgress(i);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginProgressBar
    public final void setSecondaryProgress(int i) {
        if (C13890.m33728()) {
            if (this.f67837 == PluginProgressBar.Style.HORIZONTAL) {
                ((ProgressBar) this.f12078).setSecondaryProgress(i);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }
}
