package l;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bin.mt.plugin.api.ui.PluginFrameLayout;
import bin.mt.plugin.api.ui.PluginView;

/* JADX INFO: renamed from: l.ۡ۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: L7NC */
/* JADX INFO: loaded from: classes4.dex */
public final class C8893 extends C14538 implements PluginFrameLayout {
    @Override // l.C14538
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23047(PluginView pluginView) {
        C3247 c3247 = (C3247) pluginView;
        this.f47606.add(pluginView);
        ViewGroup.LayoutParams layoutParams = c3247.f12078.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            c3247.f12078.setLayoutParams(new FrameLayout.LayoutParams(layoutParams2.width, layoutParams2.height, layoutParams2.gravity));
        }
        ((FrameLayout) this.f12078).addView(c3247.f12078);
    }
}
