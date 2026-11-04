package l;

import bin.mt.plugin.api.ui.PluginCompoundButton;
import bin.mt.plugin.api.ui.PluginRadioButton;
import bin.mt.plugin.api.ui.PluginRadioGroup;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plugin.api.ui.PluginViewGroup;

/* JADX INFO: renamed from: l.᩻ۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K7RF */
/* JADX INFO: loaded from: classes2.dex */
public final class C24774 extends C15076 implements PluginRadioGroup {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C1653 f80179;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public PluginCompoundButton.OnCheckedChangeListener f80180;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public PluginRadioGroup.OnCheckedChangeListener f80181;

    public C24774(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        super(pluginUI, pluginViewGroup);
        this.f80180 = new C11347(this);
    }

    @Override // l.C20298
    /* JADX INFO: renamed from: ۙ */
    public final void mo46636(PluginView pluginView) {
        if (pluginView instanceof C1653) {
            C1653 c1653 = (C1653) pluginView;
            if (c1653.isChecked()) {
                C1653 c1654 = this.f80179;
                if (c1654 != null) {
                    c1654.setChecked(false);
                }
                m55297(c1653);
            }
            c1653.m5942(this.f80180);
        }
        super.mo46636(pluginView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m55297(C1653 c1653) {
        this.f80179 = c1653;
        PluginRadioGroup.OnCheckedChangeListener onCheckedChangeListener = this.f80181;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(this, c1653, c1653 == null ? -1 : c1653.getPositionInRadioGroup());
        }
    }

    @Override // bin.mt.plugin.api.ui.PluginRadioGroup
    public final String getCheckedRadioButtonId() {
        C1653 c1653 = this.f80179;
        if (c1653 != null) {
            return c1653.getId();
        }
        return null;
    }

    @Override // bin.mt.plugin.api.ui.PluginRadioGroup
    public final int getCheckedRadioButtonPosition() {
        C1653 c1653 = this.f80179;
        if (c1653 != null) {
            return c1653.getPositionInRadioGroup();
        }
        return -1;
    }

    @Override // bin.mt.plugin.api.ui.PluginRadioGroup
    public final PluginRadioButton getCheckedRadioButton() {
        return this.f80179;
    }

    @Override // bin.mt.plugin.api.ui.PluginRadioGroup
    public final void clearCheck() {
        check((String) null);
    }

    @Override // bin.mt.plugin.api.ui.PluginRadioGroup
    public final void setOnCheckedChangeListener(PluginRadioGroup.OnCheckedChangeListener onCheckedChangeListener) {
        this.f80181 = onCheckedChangeListener;
    }

    @Override // bin.mt.plugin.api.ui.PluginRadioGroup
    public final void check(int i) {
        if (C22415.m50557()) {
            C1653 c1653 = this.f80179;
            if (c1653 == null || i != c1653.getPositionInRadioGroup()) {
                C1653 c1654 = this.f80179;
                if (c1654 != null) {
                    c1654.setChecked(false);
                }
                if (i >= 0) {
                    for (PluginView pluginView : this.f65158) {
                        if (pluginView instanceof C1653) {
                            C1653 c1655 = (C1653) pluginView;
                            if (c1655.getPositionInRadioGroup() == i) {
                                c1655.setChecked(true);
                                m55297(c1655);
                                return;
                            }
                        }
                    }
                }
                m55297((C1653) null);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginRadioGroup
    public final void check(String str) {
        C1653 c1653;
        if (!C22415.m50557()) {
            throw new IllegalStateException("This method must be called on the UI thread");
        }
        if (str == null || (c1653 = this.f80179) == null || !str.equals(c1653.getId())) {
            C1653 c1654 = this.f80179;
            if (c1654 != null) {
                c1654.setChecked(false);
            }
            PluginView pluginViewFindViewById = findViewById(str);
            if (pluginViewFindViewById instanceof C1653) {
                C1653 c1655 = (C1653) pluginViewFindViewById;
                c1655.setChecked(true);
                m55297(c1655);
                return;
            }
            m55297((C1653) null);
        }
    }
}
