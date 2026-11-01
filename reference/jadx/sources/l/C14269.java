package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import bin.mt.json.JSONObject;
import bin.mt.plugin.api.ui.PluginRadioButton;
import bin.mt.plugin.api.ui.PluginRadioGroup;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plugin.api.ui.PluginViewGroup;
import bin.mt.plugin.api.ui.builder.PluginRadioGroupBuilder;
import bin.mt.plugin.api.ui.builder.PluginUIBuilder;
import bin.mt.plugin.api.util.Consumer;

/* JADX INFO: renamed from: l.ܳۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37MY */
/* JADX INFO: loaded from: classes4.dex */
public final class C14269 extends AbstractC12857 implements PluginRadioGroupBuilder {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f46711;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f46712;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f46713;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public PluginRadioGroup.OnCheckedChangeListener f46714;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f46715;

    @Override // bin.mt.plugin.api.ui.builder.PluginRadioGroupBuilder
    public final PluginRadioGroupBuilder checkedId(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            str = jSONObject.getString(super.requireId(), str);
        }
        check(str);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginRadioGroupBuilder
    public final PluginRadioGroupBuilder checkedPosition(JSONObject jSONObject, int i) {
        if (jSONObject != null) {
            i = jSONObject.getInt(super.requireId(), i);
        }
        check(i);
        return this;
    }

    @Override // l.AbstractC12857, bin.mt.plugin.api.ui.builder.PluginBaseLinearLayoutBuilder
    public final PluginUIBuilder gravity(int i) {
        this.f42767 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginRadioGroupBuilder
    public final PluginRadioGroupBuilder check(String str) {
        this.f46713 = true;
        if (str == null) {
            str = "";
        }
        this.f46711 = str;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginRadioGroupBuilder
    public final PluginRadioGroupBuilder checkedId(JSONObject jSONObject) {
        checkedId(jSONObject, null);
        return this;
    }

    @Override // l.AbstractC14974, bin.mt.plugin.api.ui.builder.PluginBaseViewGroupBuilder
    public final PluginUI.Style getChildrenStyle() {
        return this.f48883;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginRadioGroupBuilder
    public final PluginRadioGroupBuilder check(int i) {
        this.f46713 = true;
        this.f46711 = null;
        this.f46715 = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginRadioGroupBuilder
    public final PluginRadioGroupBuilder checkedPosition(JSONObject jSONObject) {
        checkedPosition(jSONObject, -1);
        return this;
    }

    @Override // l.AbstractC14974, bin.mt.plugin.api.ui.builder.PluginBaseViewGroupBuilder
    public final PluginUIBuilder children(Consumer consumer) {
        consumer.mo42471accept(this.f48882);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginRadioGroupBuilder
    public final PluginRadioGroupBuilder postOnCheckedChanged(PluginRadioGroup.OnCheckedChangeListener onCheckedChangeListener) {
        this.f46712 = false;
        this.f46714 = onCheckedChangeListener;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginRadioGroupBuilder
    public final PluginRadioGroupBuilder onCheckedChanged(PluginRadioGroup.OnCheckedChangeListener onCheckedChangeListener) {
        this.f46712 = true;
        this.f46714 = onCheckedChangeListener;
        return this;
    }

    @Override // l.AbstractC14974, l.AbstractC6506
    /* JADX INFO: renamed from: ۙ */
    public final C16654 mo17707(PluginUI pluginUI, PluginViewGroup pluginViewGroup, Context context) {
        int i = 0;
        for (AbstractC6506 abstractC6506 : this.f48882.f74066) {
            if (abstractC6506 instanceof C23441) {
                ((C23441) abstractC6506).f75876 = Integer.valueOf(i);
                i++;
            }
        }
        C16654 c16654 = (C16654) super.mo17707(pluginUI, pluginViewGroup, context);
        if (this.f46713) {
            String str = this.f46711;
            if (str != null) {
                c16654.check(str);
            } else {
                c16654.check(this.f46715);
            }
        }
        PluginRadioGroup.OnCheckedChangeListener onCheckedChangeListener = this.f46714;
        if (onCheckedChangeListener != null) {
            c16654.setOnCheckedChangeListener(onCheckedChangeListener);
            if (this.f46712) {
                PluginRadioButton checkedRadioButton = c16654.getCheckedRadioButton();
                this.f46714.onCheckedChanged(c16654, checkedRadioButton, checkedRadioButton == null ? -1 : ((C20182) checkedRadioButton).getPositionInRadioGroup());
            }
        }
        return c16654;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final String getId() {
        return this.f21930;
    }

    @Override // l.AbstractC6506
    /* JADX INFO: renamed from: ۙ */
    public final C3247 mo1251(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        return new C16654(pluginUI, pluginViewGroup);
    }

    @Override // l.AbstractC6506
    /* JADX INFO: renamed from: ۙ */
    public final View mo1250(Context context) {
        return new LinearLayout(context);
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder tag(Object obj) {
        this.f21928 = obj;
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final Object getTag() {
        return this.f21928;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder width(int i) {
        this.f21922.width = i;
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder height(int i) {
        this.f21922.height = i;
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder layoutWeight(float f) {
        this.f21922.weight = f;
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder layoutGravity(int i) {
        this.f21922.gravity = i;
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder padding(int i, int i2, int i3, int i4) {
        this.f21926.set(i, i2, i3, i4);
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder padding(int i) {
        this.f21926.set(i, i, i, i);
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingLeft(int i) {
        this.f21926.left = i;
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingTop(int i) {
        this.f21926.top = i;
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingRight(int i) {
        this.f21926.right = i;
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingBottom(int i) {
        this.f21926.bottom = i;
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginLeft(int i) {
        this.f21922.leftMargin = i;
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginTop(int i) {
        this.f21922.topMargin = i;
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginRight(int i) {
        this.f21922.rightMargin = i;
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginBottom(int i) {
        this.f21922.bottomMargin = i;
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder background(Drawable drawable) {
        this.f21925 = drawable;
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder onClick(PluginView.OnClickListener onClickListener) {
        this.f21921 = onClickListener;
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder onLongClick(PluginView.OnLongClickListener onLongClickListener) {
        this.f21920 = onLongClickListener;
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder enable(boolean z) {
        this.f21923 = Boolean.valueOf(z);
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder alpha(float f) {
        this.f21927 = Float.valueOf(f);
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder requestFocus() {
        this.f21931 = true;
        return this;
    }
}
