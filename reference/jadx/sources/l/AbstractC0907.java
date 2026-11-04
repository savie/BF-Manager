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

/* JADX INFO: renamed from: l.֨ۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 37NY */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0907 extends AbstractC21349 implements PluginBaseViewBuilder {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public LinearLayout.LayoutParams f3396 = new LinearLayout.LayoutParams(-2, -2);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Rect f3397 = new Rect(-1, -1, -1, -1);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Drawable f3398;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final PluginUIBuilder f3399;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public PluginView.OnLongClickListener f3400;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f3401;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Object f3402;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Integer f3403;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Boolean f3404;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Float f3405;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public PluginView.OnClickListener f3406;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f3407;

    /* JADX INFO: renamed from: ۙ */
    public abstract View mo2279(Context context);

    /* JADX INFO: renamed from: ۙ */
    public abstract C6128 mo2280(PluginUI pluginUI, PluginViewGroup pluginViewGroup);

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder widthWrapContent() {
        return width(-2);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder widthMatchParent() {
        return width(-1);
    }

    public AbstractC0907(PluginUIBuilder pluginUIBuilder) {
        this.f3399 = pluginUIBuilder;
        m48573(pluginUIBuilder);
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
        size(C6907.m19160(f), C6907.m19160(f2));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder widthDp(float f) {
        return width(C6907.m19160(f));
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder heightDp(float f) {
        return height(C6907.m19160(f));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C6128 mo3672(PluginUI pluginUI, PluginViewGroup pluginViewGroup, Context context) {
        C6128 c6128Mo2280 = mo2280(pluginUI, pluginViewGroup);
        View viewMo2279 = mo2279(context);
        c6128Mo2280.mo5941(viewMo2279);
        viewMo2279.setLayoutParams(this.f3396);
        mo3674(c6128Mo2280);
        return c6128Mo2280;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingDp(float f, float f2, float f3, float f4) {
        return padding(C6907.m19160(f), C6907.m19160(f2), C6907.m19160(f3), C6907.m19160(f4));
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingDp(float f) {
        return padding(C6907.m19160(f));
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingLeftDp(float f) {
        return paddingLeft(C6907.m19160(f));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3674(C6128 c6128) {
        String str = this.f3401;
        if (str != null) {
            c6128.m17692(str);
        }
        Object obj = this.f3402;
        if (obj != null) {
            c6128.setTag(obj);
        }
        Drawable drawable = this.f3398;
        if (drawable != null) {
            c6128.setBackground(drawable);
        }
        Rect rect = this.f3397;
        int paddingLeft = rect.left;
        int paddingTop = rect.top;
        int paddingRight = rect.right;
        int paddingBottom = rect.bottom;
        if (paddingLeft != -1 || paddingTop != -1 || paddingRight != -1 || paddingBottom != -1) {
            if (paddingLeft == -1) {
                paddingLeft = c6128.getPaddingLeft();
            }
            if (paddingTop == -1) {
                paddingTop = c6128.getPaddingTop();
            }
            if (paddingRight == -1) {
                paddingRight = c6128.getPaddingRight();
            }
            if (paddingBottom == -1) {
                paddingBottom = c6128.getPaddingBottom();
            }
            c6128.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
        PluginView.OnClickListener onClickListener = this.f3406;
        if (onClickListener != null) {
            c6128.setOnClickListener(onClickListener);
        }
        PluginView.OnLongClickListener onLongClickListener = this.f3400;
        if (onLongClickListener != null) {
            c6128.setOnLongClickListener(onLongClickListener);
        }
        Boolean bool = this.f3404;
        if (bool != null) {
            c6128.setEnabled(bool.booleanValue());
        }
        Float f = this.f3405;
        if (f != null) {
            c6128.setAlpha(f.floatValue());
        }
        if (this.f3407) {
            c6128.requestFocus();
        }
        Integer num = this.f3403;
        if (num != null) {
            c6128.setVisibility(num.intValue());
        }
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingTopDp(float f) {
        return paddingTop(C6907.m19160(f));
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingRightDp(float f) {
        return paddingRight(C6907.m19160(f));
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingBottomDp(float f) {
        return paddingBottom(C6907.m19160(f));
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingHorizontalDp(float f) {
        paddingHorizontal(C6907.m19160(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingVerticalDp(float f) {
        paddingVertical(C6907.m19160(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginDp(float f, float f2, float f3, float f4) {
        margin(C6907.m19160(f), C6907.m19160(f2), C6907.m19160(f3), C6907.m19160(f4));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginDp(float f) {
        margin(C6907.m19160(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginLeftDp(float f) {
        return marginLeft(C6907.m19160(f));
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginTopDp(float f) {
        return marginTop(C6907.m19160(f));
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginRightDp(float f) {
        return marginRight(C6907.m19160(f));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m3671(CharSequence charSequence) {
        String stringNullable;
        PluginUI pluginUI = getPluginUI();
        if (charSequence instanceof String) {
            String str = (String) charSequence;
            if (str.length() >= 3 && str.charAt(0) == '{' && C22313.m50373(1, str) == '}' && (stringNullable = pluginUI.getContext().getStringNullable(str)) != null) {
                return stringNullable;
            }
        }
        return charSequence;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginBottomDp(float f) {
        return marginBottom(C6907.m19160(f));
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public String getId() {
        return this.f3401;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginHorizontalDp(float f) {
        marginHorizontal(C6907.m19160(f));
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
        marginVertical(C6907.m19160(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder id(String str) {
        HashSet hashSetM30869;
        if (str == null) {
            throw new NullPointerException("The id cannot be null");
        }
        if (str.isEmpty()) {
            throw new NullPointerException("The id cannot be empty");
        }
        if (getPluginUI().isStrictIdModeEnabled()) {
            String str2 = this.f3401;
            if (!str.equals(str2) && (hashSetM30869 = m3673().m30869()) != null) {
                if (str2 != null) {
                    hashSetM30869.remove(str2);
                }
                if (!hashSetM30869.add(str)) {
                    throw new RuntimeException(C14442.m34865("The id \"", str, " has been used, please use another id or call PluginUI.disableStrictIdMode()"));
                }
            }
        }
        this.f3401 = str;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder tag(Object obj) {
        this.f3402 = obj;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public Object getTag() {
        return this.f3402;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder size(int i, int i2) {
        LinearLayout.LayoutParams layoutParams = this.f3396;
        layoutParams.width = i;
        layoutParams.height = i2;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder width(int i) {
        this.f3396.width = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder height(int i) {
        this.f3396.height = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder layoutWeight(float f) {
        this.f3396.weight = f;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder layoutGravity(int i) {
        this.f3396.gravity = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder padding(int i, int i2, int i3, int i4) {
        this.f3397.set(i, i2, i3, i4);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder padding(int i) {
        this.f3397.set(i, i, i, i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder paddingLeft(int i) {
        this.f3397.left = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder paddingTop(int i) {
        this.f3397.top = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder paddingRight(int i) {
        this.f3397.right = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder paddingBottom(int i) {
        this.f3397.bottom = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder paddingHorizontal(int i) {
        Rect rect = this.f3397;
        rect.left = i;
        rect.right = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder paddingVertical(int i) {
        Rect rect = this.f3397;
        rect.top = i;
        rect.bottom = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder margin(int i, int i2, int i3, int i4) {
        LinearLayout.LayoutParams layoutParams = this.f3396;
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i2;
        layoutParams.rightMargin = i3;
        layoutParams.bottomMargin = i4;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder margin(int i) {
        LinearLayout.LayoutParams layoutParams = this.f3396;
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i;
        layoutParams.rightMargin = i;
        layoutParams.bottomMargin = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder marginLeft(int i) {
        this.f3396.leftMargin = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder marginTop(int i) {
        this.f3396.topMargin = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder marginRight(int i) {
        this.f3396.rightMargin = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder marginBottom(int i) {
        this.f3396.bottomMargin = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder marginHorizontal(int i) {
        LinearLayout.LayoutParams layoutParams = this.f3396;
        layoutParams.leftMargin = i;
        layoutParams.rightMargin = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder marginVertical(int i) {
        LinearLayout.LayoutParams layoutParams = this.f3396;
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder background(Drawable drawable) {
        this.f3398 = drawable;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder backgroundColor(int i) {
        Drawable drawable = this.f3398;
        if (drawable instanceof ColorDrawable) {
            ((ColorDrawable) drawable).setColor(i);
            return this;
        }
        this.f3398 = new ColorDrawable(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder onClick(PluginView.OnClickListener onClickListener) {
        this.f3406 = onClickListener;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder onLongClick(PluginView.OnLongClickListener onLongClickListener) {
        this.f3400 = onLongClickListener;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder enable(boolean z) {
        this.f3404 = Boolean.valueOf(z);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder alpha(float f) {
        this.f3405 = Float.valueOf(f);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder requestFocus() {
        this.f3407 = true;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder visible() {
        this.f3403 = 0;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder invisible() {
        this.f3403 = 4;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder gone() {
        this.f3403 = 8;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public PluginUIBuilder unifyWidth(String... strArr) {
        PluginUIBuilder pluginUIBuilder = this.f3399;
        if (pluginUIBuilder instanceof C9109) {
            C9109 c9109 = (C9109) pluginUIBuilder;
            if (c9109.f29589 == null) {
                c9109.f29589 = new ArrayList(1);
            }
            c9109.f29589.add(strArr);
            return this;
        }
        if (pluginUIBuilder instanceof C12398) {
            ((C12398) pluginUIBuilder).m30870unifyWidth(strArr);
            return this;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12398 m3673() {
        PluginUIBuilder pluginUIBuilder = this.f3399;
        if (pluginUIBuilder instanceof C9109) {
            return ((C9109) pluginUIBuilder).f29591.m3673();
        }
        return pluginUIBuilder instanceof C12398 ? (C12398) pluginUIBuilder : ((AbstractC0907) pluginUIBuilder).m3673();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginView build() {
        return this.f3399.build();
    }
}
