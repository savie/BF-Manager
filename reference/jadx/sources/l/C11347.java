package l;

import bin.mt.plugin.api.ui.PluginCompoundButton;

/* JADX INFO: renamed from: l.ۧۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K7RF */
/* JADX INFO: loaded from: classes4.dex */
public final class C11347 implements PluginCompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24774 f35746;

    public C11347(C24774 c24774) {
        this.f35746 = c24774;
    }

    @Override // bin.mt.plugin.api.ui.PluginCompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(PluginCompoundButton pluginCompoundButton, boolean z) {
        if (z) {
            C24774 c24774 = this.f35746;
            if (c24774.f80179 != null) {
                c24774.f80179.setChecked(false);
            }
            c24774.m55297((C1653) pluginCompoundButton);
        }
    }
}
