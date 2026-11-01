package l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plugin.api.ui.PluginViewGroup;
import bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder;
import bin.mt.plugin.api.ui.builder.PluginUIBuilder;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۜۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37NY */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6506 extends AbstractC11529 implements PluginBaseViewBuilder {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public PluginView.OnLongClickListener f21920;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public PluginView.OnClickListener f21921;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Boolean f21923;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final PluginUIBuilder f21924;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Drawable f21925;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Float f21927;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public Object f21928;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Integer f21929;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f21930;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f21931;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public LinearLayout.LayoutParams f21922 = new LinearLayout.LayoutParams(-2, -2);

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Rect f21926 = new Rect(-1, -1, -1, -1);

    /* JADX INFO: renamed from: ۙ */
    public abstract View mo1250(Context context);

    /* JADX INFO: renamed from: ۙ */
    public abstract C3247 mo1251(PluginUI pluginUI, PluginViewGroup pluginViewGroup);

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder widthWrapContent() {
        return width(-2);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder widthMatchParent() {
        return width(-1);
    }

    public AbstractC6506(PluginUIBuilder pluginUIBuilder) {
        this.f21924 = pluginUIBuilder;
        m28701(pluginUIBuilder);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder heightWrapContent() {
        return height(-2);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder heightMatchParent() {
        return height(-1);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder sizeDp(float f, float f2) {
        size(C13932.m33769(f), C13932.m33769(f2));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder widthDp(float f) {
        return width(C13932.m33769(f));
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder heightDp(float f) {
        return height(C13932.m33769(f));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C3247 mo17707(PluginUI pluginUI, PluginViewGroup pluginViewGroup, Context context) {
        C3247 c3247Mo1251 = mo1251(pluginUI, pluginViewGroup);
        View viewMo1250 = mo1250(context);
        c3247Mo1251.mo9723(viewMo1250);
        viewMo1250.setLayoutParams(this.f21922);
        mo1252(c3247Mo1251);
        return c3247Mo1251;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingDp(float f, float f2, float f3, float f4) {
        return padding(C13932.m33769(f), C13932.m33769(f2), C13932.m33769(f3), C13932.m33769(f4));
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingDp(float f) {
        return padding(C13932.m33769(f));
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingLeftDp(float f) {
        return paddingLeft(C13932.m33769(f));
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo1252(C3247 c3247) {
        String str = this.f21930;
        if (str != null) {
            c3247.m9724(str);
        }
        Object obj = this.f21928;
        if (obj != null) {
            c3247.setTag(obj);
        }
        Drawable drawable = this.f21925;
        if (drawable != null) {
            c3247.setBackground(drawable);
        }
        Rect rect = this.f21926;
        int paddingLeft = rect.left;
        int paddingTop = rect.top;
        int paddingRight = rect.right;
        int paddingBottom = rect.bottom;
        if (paddingLeft != -1 || paddingTop != -1 || paddingRight != -1 || paddingBottom != -1) {
            if (paddingLeft == -1) {
                paddingLeft = c3247.getPaddingLeft();
            }
            if (paddingTop == -1) {
                paddingTop = c3247.getPaddingTop();
            }
            if (paddingRight == -1) {
                paddingRight = c3247.getPaddingRight();
            }
            if (paddingBottom == -1) {
                paddingBottom = c3247.getPaddingBottom();
            }
            c3247.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
        PluginView.OnClickListener onClickListener = this.f21921;
        if (onClickListener != null) {
            c3247.setOnClickListener(onClickListener);
        }
        PluginView.OnLongClickListener onLongClickListener = this.f21920;
        if (onLongClickListener != null) {
            c3247.setOnLongClickListener(onLongClickListener);
        }
        Boolean bool = this.f21923;
        if (bool != null) {
            c3247.setEnabled(bool.booleanValue());
        }
        Float f = this.f21927;
        if (f != null) {
            c3247.setAlpha(f.floatValue());
        }
        if (this.f21931) {
            c3247.requestFocus();
        }
        Integer num = this.f21929;
        if (num != null) {
            c3247.setVisibility(num.intValue());
        }
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingTopDp(float f) {
        return paddingTop(C13932.m33769(f));
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingRightDp(float f) {
        return paddingRight(C13932.m33769(f));
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingBottomDp(float f) {
        return paddingBottom(C13932.m33769(f));
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingHorizontalDp(float f) {
        paddingHorizontal(C13932.m33769(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingVerticalDp(float f) {
        paddingVertical(C13932.m33769(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginDp(float f, float f2, float f3, float f4) {
        margin(C13932.m33769(f), C13932.m33769(f2), C13932.m33769(f3), C13932.m33769(f4));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginDp(float f) {
        margin(C13932.m33769(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginLeftDp(float f) {
        return marginLeft(C13932.m33769(f));
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginTopDp(float f) {
        return marginTop(C13932.m33769(f));
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginRightDp(float f) {
        return marginRight(C13932.m33769(f));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m17705(CharSequence charSequence) {
        String stringNullable;
        PluginUI pluginUI = getPluginUI();
        if (charSequence instanceof String) {
            String str = (String) charSequence;
            if (str.length() >= 3 && str.charAt(0) == '{' && C3184.m9601(1, str) == '}' && (stringNullable = pluginUI.getContext().getStringNullable(str)) != null) {
                return stringNullable;
            }
        }
        return charSequence;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginBottomDp(float f) {
        return marginBottom(C13932.m33769(f));
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public String getId() {
        return this.f21930;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginHorizontalDp(float f) {
        marginHorizontal(C13932.m33769(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public String requireId() {
        String id = getId();
        if (id == null || id.isEmpty()) {
            throw new NullPointerException("Please set the id first");
        }
        return id;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginVerticalDp(float f) {
        marginVertical(C13932.m33769(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder id(String str) {
        HashSet hashSetM5357;
        if (str == null) {
            throw new NullPointerException("The id cannot be null");
        }
        if (str.isEmpty()) {
            throw new NullPointerException("The id cannot be empty");
        }
        if (getPluginUI().isStrictIdModeEnabled()) {
            String str2 = this.f21930;
            if (!str.equals(str2) && (hashSetM5357 = m17706().m5357()) != null) {
                if (str2 != null) {
                    hashSetM5357.remove(str2);
                }
                if (!hashSetM5357.add(str)) {
                    throw new RuntimeException(C16523.m38890("The id \"", str, " has been used, please use another id or call PluginUI.disableStrictIdMode()"));
                }
            }
        }
        this.f21930 = str;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder tag(Object obj) {
        this.f21928 = obj;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public Object getTag() {
        return this.f21928;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder size(int i, int i2) {
        LinearLayout.LayoutParams layoutParams = this.f21922;
        layoutParams.width = i;
        layoutParams.height = i2;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder width(int i) {
        this.f21922.width = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder height(int i) {
        this.f21922.height = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder layoutWeight(float f) {
        this.f21922.weight = f;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder layoutGravity(int i) {
        this.f21922.gravity = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder padding(int i, int i2, int i3, int i4) {
        this.f21926.set(i, i2, i3, i4);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder padding(int i) {
        this.f21926.set(i, i, i, i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder paddingLeft(int i) {
        this.f21926.left = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder paddingTop(int i) {
        this.f21926.top = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder paddingRight(int i) {
        this.f21926.right = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder paddingBottom(int i) {
        this.f21926.bottom = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder paddingHorizontal(int i) {
        Rect rect = this.f21926;
        rect.left = i;
        rect.right = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder paddingVertical(int i) {
        Rect rect = this.f21926;
        rect.top = i;
        rect.bottom = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder margin(int i, int i2, int i3, int i4) {
        LinearLayout.LayoutParams layoutParams = this.f21922;
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i2;
        layoutParams.rightMargin = i3;
        layoutParams.bottomMargin = i4;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder margin(int i) {
        LinearLayout.LayoutParams layoutParams = this.f21922;
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i;
        layoutParams.rightMargin = i;
        layoutParams.bottomMargin = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder marginLeft(int i) {
        this.f21922.leftMargin = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder marginTop(int i) {
        this.f21922.topMargin = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder marginRight(int i) {
        this.f21922.rightMargin = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder marginBottom(int i) {
        this.f21922.bottomMargin = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder marginHorizontal(int i) {
        LinearLayout.LayoutParams layoutParams = this.f21922;
        layoutParams.leftMargin = i;
        layoutParams.rightMargin = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder marginVertical(int i) {
        LinearLayout.LayoutParams layoutParams = this.f21922;
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        return this;
    }

    public PluginUIBuilder background(Drawable drawable) {
        this.f21925 = drawable;
        return this;
    }

    public PluginUIBuilder backgroundColor(int i) {
        Drawable drawable = this.f21925;
        if (drawable instanceof ColorDrawable) {
            ((ColorDrawable) drawable).setColor(i);
            return this;
        }
        this.f21925 = new ColorDrawable(i);
        return this;
    }

    public PluginUIBuilder onClick(PluginView.OnClickListener onClickListener) {
        this.f21921 = onClickListener;
        return this;
    }

    public PluginUIBuilder onLongClick(PluginView.OnLongClickListener onLongClickListener) {
        this.f21920 = onLongClickListener;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder enable(boolean z) {
        this.f21923 = Boolean.valueOf(z);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder alpha(float f) {
        this.f21927 = Float.valueOf(f);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder requestFocus() {
        this.f21931 = true;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder visible() {
        this.f21929 = 0;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder invisible() {
        this.f21929 = 4;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder gone() {
        this.f21929 = 8;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder unifyWidth(String... strArr) {
        PluginUIBuilder pluginUIBuilder = this.f21924;
        if (pluginUIBuilder instanceof C22735) {
            C22735 c22735 = (C22735) pluginUIBuilder;
            if (c22735.f74065 == null) {
                c22735.f74065 = new ArrayList(1);
            }
            c22735.f74065.add(strArr);
            return this;
        }
        if (pluginUIBuilder instanceof C1567) {
            ((C1567) pluginUIBuilder).m5358unifyWidth(strArr);
            return this;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1567 m17706() {
        PluginUIBuilder pluginUIBuilder = this.f21924;
        if (pluginUIBuilder instanceof C22735) {
            return ((C22735) pluginUIBuilder).f74063.m17706();
        }
        return pluginUIBuilder instanceof C1567 ? (C1567) pluginUIBuilder : ((AbstractC6506) pluginUIBuilder).m17706();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginView build() {
        return this.f21924.build();
    }
}
