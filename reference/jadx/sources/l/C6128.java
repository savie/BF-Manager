package l;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plugin.api.ui.PluginViewGroup;

/* JADX INFO: renamed from: l.ۛۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: A7OH */
/* JADX INFO: loaded from: classes3.dex */
public class C6128 implements PluginView {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f20898;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final PluginUI f20899;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public View f20900;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final PluginViewGroup f20901;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Object f20902;

    public C6128(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        this.f20899 = pluginUI;
        this.f20901 = pluginViewGroup;
        if (pluginViewGroup == null && !(this instanceof PluginViewGroup)) {
            throw new IllegalArgumentException("PluginView which is not a PluginViewGroup must have a parent");
        }
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final PluginUI getPluginUI() {
        return this.f20899;
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setHeightDp(float f) {
        setHeight(this.f20899.dp2px(f));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setMarginBottomDp(float f) {
        setMarginBottom(this.f20899.dp2px(f));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setMarginDp(float f) {
        setMargin(this.f20899.dp2px(f));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setMarginHorizontalDp(float f) {
        setMarginHorizontal(this.f20899.dp2px(f));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setMarginLeftDp(float f) {
        setMarginLeft(this.f20899.dp2px(f));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setMarginRightDp(float f) {
        setMarginRight(this.f20899.dp2px(f));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setMarginTopDp(float f) {
        setMarginTop(this.f20899.dp2px(f));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setMarginVerticalDp(float f) {
        setMarginVertical(this.f20899.dp2px(f));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setPaddingBottomDp(float f) {
        setPaddingBottom(this.f20899.dp2px(f));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setPaddingDp(float f) {
        setPadding(this.f20899.dp2px(f));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setPaddingHorizontalDp(float f) {
        setPaddingHorizontal(this.f20899.dp2px(f));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setPaddingLeftDp(float f) {
        setPaddingLeft(this.f20899.dp2px(f));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setPaddingRightDp(float f) {
        setPaddingRight(this.f20899.dp2px(f));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setPaddingTopDp(float f) {
        setPaddingTop(this.f20899.dp2px(f));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setPaddingVerticalDp(float f) {
        setPaddingVertical(this.f20899.dp2px(f));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setWidthDp(float f) {
        setWidth(this.f20899.dp2px(f));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View m17689() {
        return this.f20900;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo5941(View view) {
        this.f20900 = view;
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final PluginView findViewById(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return mo17690(str);
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final PluginView requireViewById(String str) {
        PluginView pluginViewFindViewById = findViewById(str);
        if (pluginViewFindViewById != null) {
            return pluginViewFindViewById;
        }
        throw new IllegalArgumentException(C14442.m34865("ID '", str, "' does not reference a PluginView"));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final String getId() {
        return this.f20898;
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final String requireId() {
        String str = this.f20898;
        if (str == null || str.isEmpty()) {
            throw new NullPointerException("The id not set");
        }
        return str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public PluginView mo17690(String str) {
        if (str.equals(this.f20898)) {
            return this;
        }
        return null;
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final PluginViewGroup getParentView() {
        return this.f20901;
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final PluginViewGroup requireParentView() {
        PluginViewGroup pluginViewGroup = this.f20901;
        if (pluginViewGroup != null) {
            return pluginViewGroup;
        }
        throw new NullPointerException("No parent view");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bin.mt.plugin.api.ui.PluginView
    public final PluginViewGroup getRootView() {
        PluginViewGroup pluginViewGroup = this.f20901;
        return pluginViewGroup == null ? (PluginViewGroup) this : pluginViewGroup.getRootView();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m17692(String str) {
        this.f20898 = str;
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final Object getTag() {
        return this.f20902;
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setTag(Object obj) {
        this.f20902 = obj;
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final float getLayoutWeight() {
        ViewGroup.LayoutParams layoutParams = this.f20900.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return ((LinearLayout.LayoutParams) layoutParams).weight;
        }
        return 0.0f;
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final int getLayoutGravity() {
        ViewGroup.LayoutParams layoutParams = this.f20900.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return ((LinearLayout.LayoutParams) layoutParams).gravity;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m17691(CharSequence charSequence) {
        String stringNullable;
        if (charSequence instanceof String) {
            String str = (String) charSequence;
            if (str.length() >= 3 && str.charAt(0) == '{' && C22313.m50373(1, str) == '}' && (stringNullable = this.f20899.getContext().getStringNullable(str)) != null) {
                return stringNullable;
            }
        }
        return charSequence;
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final int getWidth() {
        return this.f20900.getLayoutParams().width;
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final int getHeight() {
        return this.f20900.getLayoutParams().height;
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final int getViewWidth() {
        return this.f20900.getWidth();
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final int getViewHeight() {
        return this.f20900.getHeight();
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final int getPaddingLeft() {
        return this.f20900.getPaddingLeft();
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final int getPaddingTop() {
        return this.f20900.getPaddingTop();
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final int getPaddingRight() {
        return this.f20900.getPaddingRight();
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final int getPaddingBottom() {
        return this.f20900.getPaddingBottom();
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final int getMarginLeft() {
        ViewGroup.LayoutParams layoutParams = this.f20900.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        }
        return 0;
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final int getMarginTop() {
        ViewGroup.LayoutParams layoutParams = this.f20900.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        }
        return 0;
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final int getMarginRight() {
        ViewGroup.LayoutParams layoutParams = this.f20900.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }
        return 0;
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final int getMarginBottom() {
        ViewGroup.LayoutParams layoutParams = this.f20900.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return 0;
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setSizeDp(float f, float f2) {
        PluginUI pluginUI = this.f20899;
        setSize(pluginUI.dp2px(f), pluginUI.dp2px(f2));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setPaddingDp(float f, float f2, float f3, float f4) {
        PluginUI pluginUI = this.f20899;
        setPadding(pluginUI.dp2px(f), pluginUI.dp2px(f2), pluginUI.dp2px(f3), pluginUI.dp2px(f4));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setMarginDp(float f, float f2, float f3, float f4) {
        PluginUI pluginUI = this.f20899;
        setMargin(pluginUI.dp2px(f), pluginUI.dp2px(f2), pluginUI.dp2px(f3), pluginUI.dp2px(f4));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public void setOnClickListener(PluginView.OnClickListener onClickListener) {
        if (onClickListener == null) {
            this.f20900.setOnClickListener(null);
        } else {
            this.f20900.setOnClickListener(new ViewOnClickListenerC12107(2, this, onClickListener));
        }
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public void setOnLongClickListener(final PluginView.OnLongClickListener onLongClickListener) {
        if (onLongClickListener == null) {
            this.f20900.setOnLongClickListener(null);
        } else {
            this.f20900.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ۨۘ֫
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    C6128 c6128 = this.f38934;
                    c6128.getClass();
                    return onLongClickListener.onLongClick(c6128);
                }
            });
        }
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final boolean performClick() {
        return this.f20900.performClick();
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final boolean performLongClick() {
        return this.f20900.performLongClick();
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final boolean isEnabled() {
        return this.f20900.isEnabled();
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final Drawable getBackground() {
        return this.f20900.getBackground();
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setBackgroundColor(int i) {
        this.f20900.setBackgroundColor(i);
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final float getAlpha() {
        return this.f20900.getAlpha();
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setVisible() {
        if (this.f20900.getVisibility() != 0) {
            if (C22415.m50557()) {
                this.f20900.setVisibility(0);
                return;
            }
            throw new IllegalStateException("This method must be called on the UI thread");
        }
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setInvisible() {
        if (this.f20900.getVisibility() != 4) {
            if (C22415.m50557()) {
                this.f20900.setVisibility(4);
                return;
            }
            throw new IllegalStateException("This method must be called on the UI thread");
        }
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setGone() {
        if (this.f20900.getVisibility() != 8) {
            if (C22415.m50557()) {
                this.f20900.setVisibility(8);
                return;
            }
            throw new IllegalStateException("This method must be called on the UI thread");
        }
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final int getVisibility() {
        return this.f20900.getVisibility();
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setVisibility(int i) {
        if (this.f20900.getVisibility() != i) {
            if (C22415.m50557()) {
                this.f20900.setVisibility(i);
                return;
            }
            throw new IllegalStateException("This method must be called on the UI thread");
        }
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final boolean isFocused() {
        return this.f20900.isFocused();
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final boolean requestFocus() {
        if (C22415.m50557()) {
            return this.f20900.requestFocus();
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setAlpha(float f) {
        if (C22415.m50557()) {
            this.f20900.setAlpha(f);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setBackground(Drawable drawable) {
        if (C22415.m50557()) {
            this.f20900.setBackground(drawable);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setEnabled(boolean z) {
        if (C22415.m50557()) {
            this.f20900.setEnabled(z);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setHeight(int i) {
        if (C22415.m50557()) {
            ViewGroup.LayoutParams layoutParams = this.f20900.getLayoutParams();
            layoutParams.height = i;
            this.f20900.setLayoutParams(layoutParams);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setLayoutGravity(int i) {
        if (C22415.m50557()) {
            ViewGroup.LayoutParams layoutParams = this.f20900.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = i;
                this.f20900.setLayoutParams(layoutParams2);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setLayoutWeight(float f) {
        if (C22415.m50557()) {
            ViewGroup.LayoutParams layoutParams = this.f20900.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.weight = f;
                this.f20900.setLayoutParams(layoutParams2);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setMargin(int i) {
        if (C22415.m50557()) {
            ViewGroup.LayoutParams layoutParams = this.f20900.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = i;
                marginLayoutParams.topMargin = i;
                marginLayoutParams.rightMargin = i;
                marginLayoutParams.bottomMargin = i;
                this.f20900.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setMargin(int i, int i2, int i3, int i4) {
        if (C22415.m50557()) {
            ViewGroup.LayoutParams layoutParams = this.f20900.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = i;
                marginLayoutParams.topMargin = i2;
                marginLayoutParams.rightMargin = i3;
                marginLayoutParams.bottomMargin = i4;
                this.f20900.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setMarginBottom(int i) {
        if (C22415.m50557()) {
            ViewGroup.LayoutParams layoutParams = this.f20900.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = i;
                this.f20900.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setMarginHorizontal(int i) {
        if (C22415.m50557()) {
            ViewGroup.LayoutParams layoutParams = this.f20900.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = i;
                marginLayoutParams.rightMargin = i;
                this.f20900.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setMarginLeft(int i) {
        if (C22415.m50557()) {
            ViewGroup.LayoutParams layoutParams = this.f20900.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = i;
                this.f20900.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setMarginRight(int i) {
        if (C22415.m50557()) {
            ViewGroup.LayoutParams layoutParams = this.f20900.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.rightMargin = i;
                this.f20900.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setMarginTop(int i) {
        if (C22415.m50557()) {
            ViewGroup.LayoutParams layoutParams = this.f20900.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = i;
                this.f20900.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setMarginVertical(int i) {
        if (C22415.m50557()) {
            ViewGroup.LayoutParams layoutParams = this.f20900.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = i;
                marginLayoutParams.bottomMargin = i;
                this.f20900.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setPadding(int i) {
        if (C22415.m50557()) {
            this.f20900.setPadding(i, i, i, i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setPadding(int i, int i2, int i3, int i4) {
        if (C22415.m50557()) {
            this.f20900.setPadding(i, i2, i3, i4);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setPaddingBottom(int i) {
        if (C22415.m50557()) {
            C0385.m2188(this.f20900, -1, -1, -1, i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setPaddingHorizontal(int i) {
        if (C22415.m50557()) {
            C0385.m2188(this.f20900, i, -1, i, -1);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setPaddingLeft(int i) {
        if (C22415.m50557()) {
            C0385.m2188(this.f20900, i, -1, -1, -1);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setPaddingRight(int i) {
        if (C22415.m50557()) {
            C0385.m2188(this.f20900, -1, -1, i, -1);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setPaddingTop(int i) {
        if (C22415.m50557()) {
            C0385.m2188(this.f20900, -1, i, -1, -1);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setPaddingVertical(int i) {
        if (C22415.m50557()) {
            C0385.m2188(this.f20900, -1, i, -1, i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setSize(int i, int i2) {
        if (C22415.m50557()) {
            ViewGroup.LayoutParams layoutParams = this.f20900.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i2;
            this.f20900.setLayoutParams(layoutParams);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setWidth(int i) {
        if (C22415.m50557()) {
            ViewGroup.LayoutParams layoutParams = this.f20900.getLayoutParams();
            layoutParams.width = i;
            this.f20900.setLayoutParams(layoutParams);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void unifyWidth(PluginView... pluginViewArr) {
        if (C22415.m50557()) {
            if (pluginViewArr.length < 2) {
                throw new IllegalArgumentException();
            }
            View[] viewArr = new View[pluginViewArr.length];
            for (int i = 0; i < pluginViewArr.length; i++) {
                viewArr[i] = ((C6128) pluginViewArr[i]).f20900;
            }
            C18060.m42083(viewArr);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void unifyWidth(String... strArr) {
        if (C22415.m50557()) {
            if (strArr.length < 2) {
                throw new IllegalArgumentException();
            }
            View[] viewArr = new View[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                viewArr[i] = ((C6128) requireViewById(strArr[i])).f20900;
            }
            C18060.m42083(viewArr);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }
}
