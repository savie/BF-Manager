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

/* JADX INFO: renamed from: l.᩵ܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 37MY */
/* JADX INFO: loaded from: classes5.dex */
public final class C20603 extends AbstractC18806 implements PluginRadioGroupBuilder {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f66024;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f66025;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f66026;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public PluginRadioGroup.OnCheckedChangeListener f66027;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public String f66028;

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

    @Override // l.AbstractC18806, bin.mt.plugin.api.ui.builder.PluginBaseLinearLayoutBuilder
    public final PluginUIBuilder gravity(int i) {
        this.f61078 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginRadioGroupBuilder
    public final PluginRadioGroupBuilder check(String str) {
        this.f66025 = true;
        if (str == null) {
            str = "";
        }
        this.f66028 = str;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginRadioGroupBuilder
    public final PluginRadioGroupBuilder checkedId(JSONObject jSONObject) {
        checkedId(jSONObject, null);
        return this;
    }

    @Override // l.AbstractC2398, bin.mt.plugin.api.ui.builder.PluginBaseViewGroupBuilder
    public final PluginUI.Style getChildrenStyle() {
        return this.f7710;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginRadioGroupBuilder
    public final PluginRadioGroupBuilder check(int i) {
        this.f66025 = true;
        this.f66028 = null;
        this.f66024 = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginRadioGroupBuilder
    public final PluginRadioGroupBuilder checkedPosition(JSONObject jSONObject) {
        checkedPosition(jSONObject, -1);
        return this;
    }

    @Override // l.AbstractC2398, bin.mt.plugin.api.ui.builder.PluginBaseViewGroupBuilder
    public final PluginUIBuilder children(Consumer consumer) {
        consumer.accept(this.f7709);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginRadioGroupBuilder
    public final PluginRadioGroupBuilder postOnCheckedChanged(PluginRadioGroup.OnCheckedChangeListener onCheckedChangeListener) {
        this.f66026 = false;
        this.f66027 = onCheckedChangeListener;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginRadioGroupBuilder
    public final PluginRadioGroupBuilder onCheckedChanged(PluginRadioGroup.OnCheckedChangeListener onCheckedChangeListener) {
        this.f66026 = true;
        this.f66027 = onCheckedChangeListener;
        return this;
    }

    @Override // l.AbstractC2398, l.AbstractC0907
    /* JADX INFO: renamed from: ۙ */
    public final C24774 mo3672(PluginUI pluginUI, PluginViewGroup pluginViewGroup, Context context) {
        int i = 0;
        for (AbstractC0907 abstractC0907 : this.f7709.f29590) {
            if (abstractC0907 instanceof C3449) {
                ((C3449) abstractC0907).f11247 = Integer.valueOf(i);
                i++;
            }
        }
        C24774 c24774 = (C24774) super.mo3672(pluginUI, pluginViewGroup, context);
        if (this.f66025) {
            String str = this.f66028;
            if (str != null) {
                c24774.check(str);
            } else {
                c24774.check(this.f66024);
            }
        }
        PluginRadioGroup.OnCheckedChangeListener onCheckedChangeListener = this.f66027;
        if (onCheckedChangeListener != null) {
            c24774.setOnCheckedChangeListener(onCheckedChangeListener);
            if (this.f66026) {
                PluginRadioButton checkedRadioButton = c24774.getCheckedRadioButton();
                this.f66027.onCheckedChanged(c24774, checkedRadioButton, checkedRadioButton == null ? -1 : ((C1653) checkedRadioButton).getPositionInRadioGroup());
            }
        }
        return c24774;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final String getId() {
        return this.f3401;
    }

    @Override // l.AbstractC0907
    /* JADX INFO: renamed from: ۙ */
    public final C6128 mo2280(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        return new C24774(pluginUI, pluginViewGroup);
    }

    @Override // l.AbstractC0907
    /* JADX INFO: renamed from: ۙ */
    public final View mo2279(Context context) {
        return new LinearLayout(context);
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder tag(Object obj) {
        this.f3402 = obj;
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final Object getTag() {
        return this.f3402;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder width(int i) {
        this.f3396.width = i;
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder height(int i) {
        this.f3396.height = i;
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder layoutWeight(float f) {
        this.f3396.weight = f;
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder layoutGravity(int i) {
        this.f3396.gravity = i;
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder padding(int i, int i2, int i3, int i4) {
        this.f3397.set(i, i2, i3, i4);
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder padding(int i) {
        this.f3397.set(i, i, i, i);
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingLeft(int i) {
        this.f3397.left = i;
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingTop(int i) {
        this.f3397.top = i;
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingRight(int i) {
        this.f3397.right = i;
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingBottom(int i) {
        this.f3397.bottom = i;
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginLeft(int i) {
        this.f3396.leftMargin = i;
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginTop(int i) {
        this.f3396.topMargin = i;
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginRight(int i) {
        this.f3396.rightMargin = i;
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginBottom(int i) {
        this.f3396.bottomMargin = i;
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder background(Drawable drawable) {
        this.f3398 = drawable;
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder onClick(PluginView.OnClickListener onClickListener) {
        this.f3406 = onClickListener;
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder onLongClick(PluginView.OnLongClickListener onLongClickListener) {
        this.f3400 = onLongClickListener;
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder enable(boolean z) {
        this.f3404 = Boolean.valueOf(z);
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder alpha(float f) {
        this.f3405 = Float.valueOf(f);
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder requestFocus() {
        this.f3407 = true;
        return this;
    }
}
