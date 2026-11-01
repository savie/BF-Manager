package l;

import bin.mt.plugin.api.ui.PluginCompoundButton;
import bin.mt.plugin.api.ui.PluginRadioButton;
import bin.mt.plugin.api.ui.PluginRadioGroup;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plugin.api.ui.PluginViewGroup;

/* JADX INFO: renamed from: l.ܽ۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7RF */
/* JADX INFO: loaded from: classes5.dex */
public final class C16654 extends C7481 implements PluginRadioGroup {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C20182 f53399;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public PluginCompoundButton.OnCheckedChangeListener f53400;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public PluginRadioGroup.OnCheckedChangeListener f53401;

    public C16654(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        super(pluginUI, pluginViewGroup);
        this.f53400 = new C0425(this);
    }

    @Override // l.C14538
    /* JADX INFO: renamed from: ۙ */
    public final void mo23047(PluginView pluginView) {
        if (pluginView instanceof C20182) {
            C20182 c20182 = (C20182) pluginView;
            if (c20182.isChecked()) {
                C20182 c20183 = this.f53399;
                if (c20183 != null) {
                    c20183.setChecked(false);
                }
                m39123(c20182);
            }
            c20182.m45617(this.f53400);
        }
        super.mo23047(pluginView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m39123(C20182 c20182) {
        this.f53399 = c20182;
        PluginRadioGroup.OnCheckedChangeListener onCheckedChangeListener = this.f53401;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(this, c20182, c20182 == null ? -1 : c20182.getPositionInRadioGroup());
        }
    }

    @Override // bin.mt.plugin.api.ui.PluginRadioGroup
    public final String getCheckedRadioButtonId() {
        C20182 c20182 = this.f53399;
        if (c20182 != null) {
            return c20182.getId();
        }
        return null;
    }

    @Override // bin.mt.plugin.api.ui.PluginRadioGroup
    public final int getCheckedRadioButtonPosition() {
        C20182 c20182 = this.f53399;
        if (c20182 != null) {
            return c20182.getPositionInRadioGroup();
        }
        return -1;
    }

    @Override // bin.mt.plugin.api.ui.PluginRadioGroup
    public final PluginRadioButton getCheckedRadioButton() {
        return this.f53399;
    }

    @Override // bin.mt.plugin.api.ui.PluginRadioGroup
    public final void clearCheck() {
        check((String) null);
    }

    @Override // bin.mt.plugin.api.ui.PluginRadioGroup
    public final void setOnCheckedChangeListener(PluginRadioGroup.OnCheckedChangeListener onCheckedChangeListener) {
        this.f53401 = onCheckedChangeListener;
    }

    @Override // bin.mt.plugin.api.ui.PluginRadioGroup
    public final void check(int i) {
        if (C13890.m33728()) {
            C20182 c20182 = this.f53399;
            if (c20182 == null || i != c20182.getPositionInRadioGroup()) {
                C20182 c20183 = this.f53399;
                if (c20183 != null) {
                    c20183.setChecked(false);
                }
                if (i >= 0) {
                    for (PluginView pluginView : this.f47606) {
                        if (pluginView instanceof C20182) {
                            C20182 c20184 = (C20182) pluginView;
                            if (c20184.getPositionInRadioGroup() == i) {
                                c20184.setChecked(true);
                                m39123(c20184);
                                return;
                            }
                        }
                    }
                }
                m39123((C20182) null);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginRadioGroup
    public final void check(String str) {
        C20182 c20182;
        if (!C13890.m33728()) {
            throw new IllegalStateException("This method must be called on the UI thread");
        }
        if (str == null || (c20182 = this.f53399) == null || !str.equals(c20182.getId())) {
            C20182 c20183 = this.f53399;
            if (c20183 != null) {
                c20183.setChecked(false);
            }
            PluginView pluginViewFindViewById = findViewById(str);
            if (pluginViewFindViewById instanceof C20182) {
                C20182 c20184 = (C20182) pluginViewFindViewById;
                c20184.setChecked(true);
                m39123(c20184);
                return;
            }
            m39123((C20182) null);
        }
    }
}
