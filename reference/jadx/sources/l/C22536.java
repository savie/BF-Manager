package l;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bin.mt.plugin.api.ui.PluginFrameLayout;
import bin.mt.plugin.api.ui.PluginView;

/* JADX INFO: renamed from: l.᩸ۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: L7NC */
/* JADX INFO: loaded from: classes2.dex */
public final class C22536 extends C20298 implements PluginFrameLayout {
    @Override // l.C20298
    /* JADX INFO: renamed from: ۙ */
    public final void mo46636(PluginView pluginView) {
        C6128 c6128 = (C6128) pluginView;
        this.f65158.add(pluginView);
        ViewGroup.LayoutParams layoutParams = c6128.f20900.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            c6128.f20900.setLayoutParams(new FrameLayout.LayoutParams(layoutParams2.width, layoutParams2.height, layoutParams2.gravity));
        }
        ((FrameLayout) this.f20900).addView(c6128.f20900);
    }
}
