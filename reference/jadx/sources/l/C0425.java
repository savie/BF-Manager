package l;

import bin.mt.plugin.api.ui.PluginCompoundButton;

/* JADX INFO: renamed from: l.֡۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7RF */
/* JADX INFO: loaded from: classes2.dex */
public final class C0425 implements PluginCompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16654 f1941;

    public C0425(C16654 c16654) {
        this.f1941 = c16654;
    }

    @Override // bin.mt.plugin.api.ui.PluginCompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(PluginCompoundButton pluginCompoundButton, boolean z) {
        if (z) {
            C16654 c16654 = this.f1941;
            if (c16654.f53399 != null) {
                c16654.f53399.setChecked(false);
            }
            c16654.m39123((C20182) pluginCompoundButton);
        }
    }
}
