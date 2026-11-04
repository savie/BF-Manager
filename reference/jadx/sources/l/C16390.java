package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import bin.mt.plus.R;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܶ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: V659 */
/* JADX INFO: loaded from: classes5.dex */
public class C16390 extends ViewGroup implements InterfaceC0312 {
    public static final String TAG = "Toolbar";
    public InterfaceC12772 mActionMenuPresenterCallback;
    public OnBackInvokedCallback mBackInvokedCallback;
    public boolean mBackInvokedCallbackEnabled;
    public OnBackInvokedDispatcher mBackInvokedDispatcher;
    public int mButtonGravity;
    public ImageButton mCollapseButtonView;
    public CharSequence mCollapseDescription;
    public Drawable mCollapseIcon;
    public boolean mCollapsible;
    public int mContentInsetEndWithActions;
    public int mContentInsetStartWithNavigation;
    public C15424 mContentInsets;
    public boolean mEatingHover;
    public boolean mEatingTouch;
    public View mExpandedActionView;
    public C2221 mExpandedMenuPresenter;
    public int mGravity;
    public final ArrayList mHiddenViews;
    public ImageView mLogoView;
    public int mMaxButtonHeight;
    public InterfaceC7662 mMenuBuilderCallback;
    public final C1058 mMenuHostHelper;
    public C17531 mMenuView;
    public final InterfaceC16785 mMenuViewItemClickListener;
    public ImageButton mNavButtonView;
    public InterfaceC25342 mOnMenuItemClickListener;
    public C13056 mOuterActionMenuPresenter;
    public Context mPopupContext;
    public int mPopupTheme;
    public ArrayList mProvidedMenuItems;
    public final Runnable mShowOverflowMenuRunnable;
    public CharSequence mSubtitleText;
    public int mSubtitleTextAppearance;
    public ColorStateList mSubtitleTextColor;
    public TextView mSubtitleTextView;
    public final int[] mTempMargins;
    public final ArrayList mTempViews;
    public int mTitleMarginBottom;
    public int mTitleMarginEnd;
    public int mTitleMarginStart;
    public int mTitleMarginTop;
    public CharSequence mTitleText;
    public int mTitleTextAppearance;
    public ColorStateList mTitleTextColor;
    public TextView mTitleTextView;
    public C20866 mWrapper;

    public C16390(Context context) {
        this(context, null);
    }

    public C16390(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C16390(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mGravity = 8388627;
        this.mTempViews = new ArrayList();
        this.mHiddenViews = new ArrayList();
        this.mTempMargins = new int[2];
        this.mMenuHostHelper = new C1058(new RunnableC22358(0, this));
        this.mProvidedMenuItems = new ArrayList();
        this.mMenuViewItemClickListener = new C11169(this);
        this.mShowOverflowMenuRunnable = new RunnableC23104(this);
        Context context2 = getContext();
        int[] iArr = C10401.f33077;
        C5204 c5204M15649 = C5204.m15649(context2, attributeSet, iArr, i, 0);
        C22666.m51088(this, context, iArr, attributeSet, c5204M15649.m15658(), i);
        this.mTitleTextAppearance = c5204M15649.m15660(28, 0);
        this.mSubtitleTextAppearance = c5204M15649.m15660(19, 0);
        this.mGravity = c5204M15649.m15668(0, this.mGravity);
        this.mButtonGravity = c5204M15649.m15668(2, 48);
        int iM15652 = c5204M15649.m15652(22, 0);
        iM15652 = c5204M15649.m15655(27) ? c5204M15649.m15652(27, iM15652) : iM15652;
        this.mTitleMarginBottom = iM15652;
        this.mTitleMarginTop = iM15652;
        this.mTitleMarginEnd = iM15652;
        this.mTitleMarginStart = iM15652;
        int iM15653 = c5204M15649.m15652(25, -1);
        if (iM15653 >= 0) {
            this.mTitleMarginStart = iM15653;
        }
        int iM15654 = c5204M15649.m15652(24, -1);
        if (iM15654 >= 0) {
            this.mTitleMarginEnd = iM15654;
        }
        int iM15655 = c5204M15649.m15652(26, -1);
        if (iM15655 >= 0) {
            this.mTitleMarginTop = iM15655;
        }
        int iM15656 = c5204M15649.m15652(23, -1);
        if (iM15656 >= 0) {
            this.mTitleMarginBottom = iM15656;
        }
        this.mMaxButtonHeight = c5204M15649.m15665(13, -1);
        int iM15657 = c5204M15649.m15652(9, Integer.MIN_VALUE);
        int iM15658 = c5204M15649.m15652(5, Integer.MIN_VALUE);
        int iM15665 = c5204M15649.m15665(7, 0);
        int iM15666 = c5204M15649.m15665(8, 0);
        m38901();
        this.mContentInsets.m36938(iM15665, iM15666);
        if (iM15657 != Integer.MIN_VALUE || iM15658 != Integer.MIN_VALUE) {
            this.mContentInsets.m36942(iM15657, iM15658);
        }
        this.mContentInsetStartWithNavigation = c5204M15649.m15652(10, Integer.MIN_VALUE);
        this.mContentInsetEndWithActions = c5204M15649.m15652(6, Integer.MIN_VALUE);
        this.mCollapseIcon = c5204M15649.m15669(4);
        this.mCollapseDescription = c5204M15649.m15659(3);
        CharSequence charSequenceM15659 = c5204M15649.m15659(21);
        if (!TextUtils.isEmpty(charSequenceM15659)) {
            setTitle(charSequenceM15659);
        }
        CharSequence charSequenceM156510 = c5204M15649.m15659(18);
        if (!TextUtils.isEmpty(charSequenceM156510)) {
            setSubtitle(charSequenceM156510);
        }
        this.mPopupContext = getContext();
        setPopupTheme(c5204M15649.m15660(17, 0));
        Drawable drawableM15669 = c5204M15649.m15669(16);
        if (drawableM15669 != null) {
            setNavigationIcon(drawableM15669);
        }
        CharSequence charSequenceM156511 = c5204M15649.m15659(15);
        if (!TextUtils.isEmpty(charSequenceM156511)) {
            setNavigationContentDescription(charSequenceM156511);
        }
        Drawable drawableM156610 = c5204M15649.m15669(11);
        if (drawableM156610 != null) {
            setLogo(drawableM156610);
        }
        CharSequence charSequenceM156512 = c5204M15649.m15659(12);
        if (!TextUtils.isEmpty(charSequenceM156512)) {
            setLogoDescription(charSequenceM156512);
        }
        if (c5204M15649.m15655(29)) {
            setTitleTextColor(c5204M15649.m15666(29));
        }
        if (c5204M15649.m15655(20)) {
            setSubtitleTextColor(c5204M15649.m15666(20));
        }
        if (c5204M15649.m15655(14)) {
            inflateMenu(c5204M15649.m15660(14, 0));
        }
        c5204M15649.m15664();
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.mBackInvokedCallbackEnabled != z) {
            this.mBackInvokedCallbackEnabled = z;
            updateBackInvokedCallbackState();
        }
    }

    public boolean isBackInvokedCallbackEnabled() {
        return this.mBackInvokedCallbackEnabled;
    }

    public void setPopupTheme(int i) {
        if (this.mPopupTheme != i) {
            this.mPopupTheme = i;
            if (i == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    public void setTitleMargin(int i, int i2, int i3, int i4) {
        this.mTitleMarginStart = i;
        this.mTitleMarginTop = i2;
        this.mTitleMarginEnd = i3;
        this.mTitleMarginBottom = i4;
        requestLayout();
    }

    public int getTitleMarginStart() {
        return this.mTitleMarginStart;
    }

    public void setTitleMarginStart(int i) {
        this.mTitleMarginStart = i;
        requestLayout();
    }

    public int getTitleMarginTop() {
        return this.mTitleMarginTop;
    }

    public void setTitleMarginTop(int i) {
        this.mTitleMarginTop = i;
        requestLayout();
    }

    public int getTitleMarginEnd() {
        return this.mTitleMarginEnd;
    }

    public void setTitleMarginEnd(int i) {
        this.mTitleMarginEnd = i;
        requestLayout();
    }

    public int getTitleMarginBottom() {
        return this.mTitleMarginBottom;
    }

    public void setTitleMarginBottom(int i) {
        this.mTitleMarginBottom = i;
        requestLayout();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        m38901();
        this.mContentInsets.m36939(i == 1);
    }

    public void setLogo(int i) {
        setLogo(C0385.m2186(getContext(), i));
    }

    public boolean canShowOverflowMenu() {
        C17531 c17531;
        return getVisibility() == 0 && (c17531 = this.mMenuView) != null && c17531.m41174();
    }

    public boolean isOverflowMenuShowing() {
        C17531 c17531 = this.mMenuView;
        return c17531 != null && c17531.m41166();
    }

    public boolean isOverflowMenuShowPending() {
        C17531 c17531 = this.mMenuView;
        return c17531 != null && c17531.m41172();
    }

    public boolean showOverflowMenu() {
        C17531 c17531 = this.mMenuView;
        return c17531 != null && c17531.m41178();
    }

    public boolean hideOverflowMenu() {
        C17531 c17531 = this.mMenuView;
        return c17531 != null && c17531.m41175();
    }

    public void setMenu(C9898 c9898, C13056 c13056) {
        if (c9898 == null && this.mMenuView == null) {
            return;
        }
        m38916();
        C9898 c9898M41182 = this.mMenuView.m41182();
        if (c9898M41182 == c9898) {
            return;
        }
        if (c9898M41182 != null) {
            c9898M41182.removeMenuPresenter(this.mOuterActionMenuPresenter);
            c9898M41182.removeMenuPresenter(this.mExpandedMenuPresenter);
        }
        if (this.mExpandedMenuPresenter == null) {
            this.mExpandedMenuPresenter = new C2221(this);
        }
        c13056.m32538();
        if (c9898 != null) {
            c9898.addMenuPresenter(c13056, this.mPopupContext);
            c9898.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
        } else {
            c13056.initForMenu(this.mPopupContext, null);
            this.mExpandedMenuPresenter.initForMenu(this.mPopupContext, null);
            c13056.updateMenuView(true);
            this.mExpandedMenuPresenter.updateMenuView(true);
        }
        this.mMenuView.m41180(this.mPopupTheme);
        this.mMenuView.m41169(c13056);
        this.mOuterActionMenuPresenter = c13056;
        updateBackInvokedCallbackState();
    }

    public void dismissPopupMenus() {
        C17531 c17531 = this.mMenuView;
        if (c17531 != null) {
            c17531.m41173();
        }
    }

    public boolean isTitleTruncated() {
        Layout layout;
        TextView textView = this.mTitleTextView;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            if (layout.getEllipsisCount(i) > 0) {
                return true;
            }
        }
        return false;
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m38915();
            if (!m38907(this.mLogoView)) {
                m38903((View) this.mLogoView, true);
            }
        } else {
            ImageView imageView = this.mLogoView;
            if (imageView != null && m38907(imageView)) {
                removeView(this.mLogoView);
                this.mHiddenViews.remove(this.mLogoView);
            }
        }
        ImageView imageView2 = this.mLogoView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public Drawable getLogo() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m38915();
        }
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m38915() {
        if (this.mLogoView == null) {
            this.mLogoView = new C15688(getContext());
        }
    }

    public boolean hasExpandedActionView() {
        C2221 c2221 = this.mExpandedMenuPresenter;
        return (c2221 == null || c2221.f7283 == null) ? false : true;
    }

    public void collapseActionView() {
        C2221 c2221 = this.mExpandedMenuPresenter;
        C8407 c8407 = c2221 == null ? null : c2221.f7283;
        if (c8407 != null) {
            c8407.collapseActionView();
        }
    }

    public CharSequence getTitle() {
        return this.mTitleText;
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.mTitleTextView == null) {
                Context context = getContext();
                C5752 c5752 = new C5752(context);
                this.mTitleTextView = c5752;
                c5752.setSingleLine();
                this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.mTitleTextAppearance;
                if (i != 0) {
                    this.mTitleTextView.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.mTitleTextColor;
                if (colorStateList != null) {
                    this.mTitleTextView.setTextColor(colorStateList);
                }
            }
            if (!m38907(this.mTitleTextView)) {
                m38903((View) this.mTitleTextView, true);
            }
        } else {
            TextView textView = this.mTitleTextView;
            if (textView != null && m38907(textView)) {
                removeView(this.mTitleTextView);
                this.mHiddenViews.remove(this.mTitleTextView);
            }
        }
        TextView textView2 = this.mTitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mTitleText = charSequence;
    }

    public CharSequence getSubtitle() {
        return this.mSubtitleText;
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.mSubtitleTextView == null) {
                Context context = getContext();
                C5752 c5752 = new C5752(context);
                this.mSubtitleTextView = c5752;
                c5752.setSingleLine();
                this.mSubtitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.mSubtitleTextAppearance;
                if (i != 0) {
                    this.mSubtitleTextView.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.mSubtitleTextColor;
                if (colorStateList != null) {
                    this.mSubtitleTextView.setTextColor(colorStateList);
                }
            }
            if (!m38907(this.mSubtitleTextView)) {
                m38903((View) this.mSubtitleTextView, true);
            }
        } else {
            TextView textView = this.mSubtitleTextView;
            if (textView != null && m38907(textView)) {
                removeView(this.mSubtitleTextView);
                this.mHiddenViews.remove(this.mSubtitleTextView);
            }
        }
        TextView textView2 = this.mSubtitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mSubtitleText = charSequence;
    }

    public void setTitleTextAppearance(Context context, int i) {
        this.mTitleTextAppearance = i;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setSubtitleTextAppearance(Context context, int i) {
        this.mSubtitleTextAppearance = i;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.mTitleTextColor = colorStateList;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.mSubtitleTextColor = colorStateList;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m38911();
        }
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            C6696.m18717(this.mNavButtonView, charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C0385.m2186(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m38911();
            if (!m38907(this.mNavButtonView)) {
                m38903((View) this.mNavButtonView, true);
            }
        } else {
            ImageButton imageButton = this.mNavButtonView;
            if (imageButton != null && m38907(imageButton)) {
                removeView(this.mNavButtonView);
                this.mHiddenViews.remove(this.mNavButtonView);
            }
        }
        ImageButton imageButton2 = this.mNavButtonView;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m38911();
        this.mNavButtonView.setOnClickListener(onClickListener);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureCollapseButtonView();
        }
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C0385.m2186(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            ensureCollapseButtonView();
            this.mCollapseButtonView.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.mCollapseButtonView;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.mCollapseIcon);
            }
        }
    }

    public Menu getMenu() {
        m38906();
        return this.mMenuView.m41181();
    }

    public void setOverflowIcon(Drawable drawable) {
        m38906();
        this.mMenuView.m41167(drawable);
    }

    public Drawable getOverflowIcon() {
        m38906();
        return this.mMenuView.m41179();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m38906() {
        m38916();
        if (this.mMenuView.m41182() == null) {
            C9898 c9898 = (C9898) this.mMenuView.m41181();
            if (this.mExpandedMenuPresenter == null) {
                this.mExpandedMenuPresenter = new C2221(this);
            }
            this.mMenuView.m41177();
            c9898.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
            updateBackInvokedCallbackState();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m38916() {
        if (this.mMenuView == null) {
            C17531 c17531 = new C17531(getContext(), null);
            this.mMenuView = c17531;
            c17531.m41180(this.mPopupTheme);
            C17531 c17532 = this.mMenuView;
            c17532.f56983 = this.mMenuViewItemClickListener;
            c17532.m41168(this.mActionMenuPresenterCallback, new C20120(this));
            C11915 c11915GenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c11915GenerateDefaultLayoutParams.f5085 = (this.mButtonGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | 8388613;
            this.mMenuView.setLayoutParams(c11915GenerateDefaultLayoutParams);
            m38903((View) this.mMenuView, false);
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private MenuInflater m38909() {
        return new C21833(getContext());
    }

    public void inflateMenu(int i) {
        m38909().inflate(i, getMenu());
    }

    public void setOnMenuItemClickListener(InterfaceC25342 interfaceC25342) {
        this.mOnMenuItemClickListener = interfaceC25342;
    }

    public void setContentInsetsRelative(int i, int i2) {
        m38901();
        this.mContentInsets.m36942(i, i2);
    }

    public int getContentInsetStart() {
        C15424 c15424 = this.mContentInsets;
        if (c15424 != null) {
            return c15424.m36943();
        }
        return 0;
    }

    public int getContentInsetEnd() {
        C15424 c15424 = this.mContentInsets;
        if (c15424 != null) {
            return c15424.m36937();
        }
        return 0;
    }

    public void setContentInsetsAbsolute(int i, int i2) {
        m38901();
        this.mContentInsets.m36938(i, i2);
    }

    public int getContentInsetLeft() {
        C15424 c15424 = this.mContentInsets;
        if (c15424 != null) {
            return c15424.m36941();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C15424 c15424 = this.mContentInsets;
        if (c15424 != null) {
            return c15424.m36940();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.mContentInsetStartWithNavigation;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.mContentInsetStartWithNavigation) {
            this.mContentInsetStartWithNavigation = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public int getContentInsetEndWithActions() {
        int i = this.mContentInsetEndWithActions;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.mContentInsetEndWithActions) {
            this.mContentInsetEndWithActions = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.mContentInsetStartWithNavigation, 0));
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        C9898 c9898M41182;
        C17531 c17531 = this.mMenuView;
        if (c17531 != null && (c9898M41182 = c17531.m41182()) != null && c9898M41182.hasVisibleItems()) {
            return Math.max(getContentInsetEnd(), Math.max(this.mContentInsetEndWithActions, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m38911() {
        if (this.mNavButtonView == null) {
            this.mNavButtonView = new C23148(getContext(), null, R.attr.MT_Protector);
            C11915 c11915GenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c11915GenerateDefaultLayoutParams.f5085 = (this.mButtonGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | 8388611;
            this.mNavButtonView.setLayoutParams(c11915GenerateDefaultLayoutParams);
        }
    }

    public View getNavButtonView() {
        return this.mNavButtonView;
    }

    public void ensureCollapseButtonView() {
        if (this.mCollapseButtonView == null) {
            C23148 c23148 = new C23148(getContext(), null, R.attr.MT_Protector);
            this.mCollapseButtonView = c23148;
            c23148.setImageDrawable(this.mCollapseIcon);
            this.mCollapseButtonView.setContentDescription(this.mCollapseDescription);
            C11915 c11915GenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c11915GenerateDefaultLayoutParams.f5085 = (this.mButtonGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | 8388611;
            c11915GenerateDefaultLayoutParams.f38394 = 2;
            this.mCollapseButtonView.setLayoutParams(c11915GenerateDefaultLayoutParams);
            this.mCollapseButtonView.setOnClickListener(new ViewOnClickListenerC15644(this));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38903(View view, boolean z) {
        C11915 c11915GenerateLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            c11915GenerateLayoutParams = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            c11915GenerateLayoutParams = generateLayoutParams(layoutParams);
        } else {
            c11915GenerateLayoutParams = (C11915) layoutParams;
        }
        c11915GenerateLayoutParams.f38394 = 1;
        if (z && this.mExpandedActionView != null) {
            view.setLayoutParams(c11915GenerateLayoutParams);
            this.mHiddenViews.add(view);
        } else {
            addView(view, c11915GenerateLayoutParams);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C8407 c8407;
        C17882 c17882 = new C17882(super.onSaveInstanceState());
        C2221 c2221 = this.mExpandedMenuPresenter;
        if (c2221 != null && (c8407 = c2221.f7283) != null) {
            c17882.f58608 = c8407.getItemId();
        }
        c17882.f58609 = isOverflowMenuShowing();
        return c17882;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof C17882)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C17882 c17882 = (C17882) parcelable;
        super.onRestoreInstanceState(c17882.getSuperState());
        C17531 c17531 = this.mMenuView;
        C9898 c9898M41182 = c17531 != null ? c17531.m41182() : null;
        int i = c17882.f58608;
        if (i != 0 && this.mExpandedMenuPresenter != null && c9898M41182 != null && (menuItemFindItem = c9898M41182.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (c17882.f58609) {
            m38894();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38894() {
        removeCallbacks(this.mShowOverflowMenuRunnable);
        post(this.mShowOverflowMenuRunnable);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.mShowOverflowMenuRunnable);
        updateBackInvokedCallbackState();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateBackInvokedCallbackState();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38902(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m38898(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m38908() {
        if (!this.mCollapsible) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m38917(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        char c;
        char c2;
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int iCombineMeasuredStates2;
        int iMax2;
        int measuredHeight;
        int[] iArr = this.mTempMargins;
        int i3 = C19374.f62602;
        if (getLayoutDirection() == 1) {
            c = 1;
            c2 = 0;
        } else {
            c = 0;
            c2 = 1;
        }
        if (m38917(this.mNavButtonView)) {
            m38902(this.mNavButtonView, i, 0, i2, 0, this.mMaxButtonHeight);
            measuredWidth = this.mNavButtonView.getMeasuredWidth() + m38896(this.mNavButtonView);
            iMax = Math.max(0, this.mNavButtonView.getMeasuredHeight() + m38913(this.mNavButtonView));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.mNavButtonView.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m38917(this.mCollapseButtonView)) {
            m38902(this.mCollapseButtonView, i, 0, i2, 0, this.mMaxButtonHeight);
            measuredWidth = this.mCollapseButtonView.getMeasuredWidth() + m38896(this.mCollapseButtonView);
            iMax = Math.max(iMax, this.mCollapseButtonView.getMeasuredHeight() + m38913(this.mCollapseButtonView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mCollapseButtonView.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr[c] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (m38917(this.mMenuView)) {
            m38902(this.mMenuView, i, iMax3, i2, 0, this.mMaxButtonHeight);
            measuredWidth2 = this.mMenuView.getMeasuredWidth() + m38896(this.mMenuView);
            iMax = Math.max(iMax, this.mMenuView.getMeasuredHeight() + m38913(this.mMenuView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mMenuView.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr[c2] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (m38917(this.mExpandedActionView)) {
            iMax4 += m38898(this.mExpandedActionView, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.mExpandedActionView.getMeasuredHeight() + m38913(this.mExpandedActionView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mExpandedActionView.getMeasuredState());
        }
        if (m38917(this.mLogoView)) {
            iMax4 += m38898(this.mLogoView, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.mLogoView.getMeasuredHeight() + m38913(this.mLogoView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mLogoView.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((C11915) childAt.getLayoutParams()).f38394 == 0 && m38917(childAt)) {
                iMax4 += m38898(childAt, i, iMax4, i2, 0, iArr);
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + m38913(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i5 = this.mTitleMarginTop + this.mTitleMarginBottom;
        int i6 = this.mTitleMarginStart + this.mTitleMarginEnd;
        if (m38917(this.mTitleTextView)) {
            m38898(this.mTitleTextView, i, iMax4 + i6, i2, i5, iArr);
            int measuredWidth3 = this.mTitleTextView.getMeasuredWidth() + m38896(this.mTitleTextView);
            measuredHeight = this.mTitleTextView.getMeasuredHeight() + m38913(this.mTitleTextView);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.mTitleTextView.getMeasuredState());
            iMax2 = measuredWidth3;
        } else {
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
            measuredHeight = 0;
        }
        if (m38917(this.mSubtitleTextView)) {
            iMax2 = Math.max(iMax2, m38898(this.mSubtitleTextView, i, iMax4 + i6, i2, i5 + measuredHeight, iArr));
            measuredHeight += this.mSubtitleTextView.getMeasuredHeight() + m38913(this.mSubtitleTextView);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.mSubtitleTextView.getMeasuredState());
        }
        int iMax5 = Math.max(iMax, measuredHeight);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax4 + iMax2, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2), m38908() ? 0 : View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax5, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0289  */
    /* JADX WARN: Code duplicated, block: B:102:0x028f  */
    /* JADX WARN: Code duplicated, block: B:106:0x02a0 A[LOOP:0: B:105:0x029e->B:106:0x02a0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x02c2 A[LOOP:1: B:108:0x02c0->B:109:0x02c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x02ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:115:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:118:0x02fb A[LOOP:2: B:117:0x02f9->B:118:0x02fb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x006a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0081  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:42:0x0102  */
    /* JADX WARN: Code duplicated, block: B:43:0x011a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0129 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x012b  */
    /* JADX WARN: Code duplicated, block: B:50:0x012e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0132  */
    /* JADX WARN: Code duplicated, block: B:53:0x0135  */
    /* JADX WARN: Code duplicated, block: B:56:0x0145  */
    /* JADX WARN: Code duplicated, block: B:58:0x014d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x0166  */
    /* JADX WARN: Code duplicated, block: B:67:0x016a  */
    /* JADX WARN: Code duplicated, block: B:69:0x017c  */
    /* JADX WARN: Code duplicated, block: B:70:0x017f  */
    /* JADX WARN: Code duplicated, block: B:72:0x018a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0196  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:82:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x0218  */
    /* JADX WARN: Code duplicated, block: B:88:0x021b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0225 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0227  */
    /* JADX WARN: Code duplicated, block: B:92:0x022a  */
    /* JADX WARN: Code duplicated, block: B:95:0x023e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0261  */
    /* JADX WARN: Code duplicated, block: B:98:0x0264  */
    /* JADX WARN: Code duplicated, block: B:99:0x0286  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iM38899;
        int iM38914;
        int iMax;
        int iMin;
        boolean zM38917;
        boolean zM38918;
        int measuredHeight;
        TextView textView;
        TextView textView2;
        C11915 c11915;
        C11915 c11916;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        int iMax2;
        int i9;
        int i10;
        int iMax3;
        int i11;
        int i12;
        int i13;
        int i14;
        int iMax4;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int size;
        int i20;
        int i21;
        int size2;
        int i22;
        int i23;
        int i24;
        int size3;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i25 = width - paddingRight;
        int[] iArr = this.mTempMargins;
        iArr[1] = 0;
        iArr[0] = 0;
        int i26 = C22666.f73603;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (m38917(this.mNavButtonView)) {
            if (z3) {
                iM38914 = m38914(this.mNavButtonView, i25, iArr, iMin2);
                iM38899 = paddingLeft;
            } else {
                iM38899 = m38899(this.mNavButtonView, paddingLeft, iArr, iMin2);
            }
            if (m38917(this.mCollapseButtonView)) {
                if (z3) {
                    iM38914 = m38914(this.mCollapseButtonView, iM38914, iArr, iMin2);
                } else {
                    iM38899 = m38899(this.mCollapseButtonView, iM38899, iArr, iMin2);
                }
            }
            if (m38917(this.mMenuView)) {
                if (z3) {
                    iM38899 = m38899(this.mMenuView, iM38899, iArr, iMin2);
                } else {
                    iM38914 = m38914(this.mMenuView, iM38914, iArr, iMin2);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iM38899);
            iArr[1] = Math.max(0, currentContentInsetRight - (i25 - iM38914));
            iMax = Math.max(iM38899, currentContentInsetLeft);
            iMin = Math.min(iM38914, i25 - currentContentInsetRight);
            if (m38917(this.mExpandedActionView)) {
                if (z3) {
                    iMin = m38914(this.mExpandedActionView, iMin, iArr, iMin2);
                } else {
                    iMax = m38899(this.mExpandedActionView, iMax, iArr, iMin2);
                }
            }
            if (m38917(this.mLogoView)) {
                if (z3) {
                    iMin = m38914(this.mLogoView, iMin, iArr, iMin2);
                } else {
                    iMax = m38899(this.mLogoView, iMax, iArr, iMin2);
                }
            }
            zM38917 = m38917(this.mTitleTextView);
            zM38918 = m38917(this.mSubtitleTextView);
            if (zM38917) {
                C11915 c11917 = (C11915) this.mTitleTextView.getLayoutParams();
                measuredHeight = this.mTitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c11917).topMargin + ((ViewGroup.MarginLayoutParams) c11917).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zM38918) {
                C11915 c11918 = (C11915) this.mSubtitleTextView.getLayoutParams();
                measuredHeight += this.mSubtitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c11918).topMargin + ((ViewGroup.MarginLayoutParams) c11918).bottomMargin;
            }
            if (!zM38917 || zM38918) {
                if (zM38917) {
                    textView = this.mTitleTextView;
                } else {
                    textView = this.mSubtitleTextView;
                }
                if (zM38918) {
                    textView2 = this.mSubtitleTextView;
                } else {
                    textView2 = this.mTitleTextView;
                }
                c11915 = (C11915) textView.getLayoutParams();
                c11916 = (C11915) textView2.getLayoutParams();
                z2 = (!zM38917 && this.mTitleTextView.getMeasuredWidth() > 0) || (zM38918 && this.mSubtitleTextView.getMeasuredWidth() > 0);
                i5 = paddingLeft;
                i6 = this.mGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
                i7 = iMin2;
                if (i6 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c11915).topMargin + this.mTitleMarginTop;
                } else if (i6 != 80) {
                    iMax4 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    i15 = ((ViewGroup.MarginLayoutParams) c11915).topMargin;
                    i16 = this.mTitleMarginTop;
                    if (iMax4 < i15 + i16) {
                        iMax4 = i15 + i16;
                    } else {
                        i17 = (((height - paddingBottom) - measuredHeight) - iMax4) - paddingTop2;
                        i18 = ((ViewGroup.MarginLayoutParams) c11915).bottomMargin;
                        i19 = this.mTitleMarginBottom;
                        if (i17 < i18 + i19) {
                            iMax4 = Math.max(0, iMax4 - ((((ViewGroup.MarginLayoutParams) c11916).bottomMargin + i19) - i17));
                        }
                    }
                    paddingTop = paddingTop2 + iMax4;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c11916).bottomMargin) - this.mTitleMarginBottom) - measuredHeight;
                }
                if (z3) {
                    if (z2) {
                        i12 = this.mTitleMarginStart;
                    } else {
                        i12 = 0;
                    }
                    int i27 = i12 - iArr[1];
                    iMin -= Math.max(0, i27);
                    iArr[1] = Math.max(0, -i27);
                    if (zM38917) {
                        C11915 c11919 = (C11915) this.mTitleTextView.getLayoutParams();
                        int measuredWidth = iMin - this.mTitleTextView.getMeasuredWidth();
                        int measuredHeight2 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                        this.mTitleTextView.layout(measuredWidth, paddingTop, iMin, measuredHeight2);
                        i13 = measuredWidth - this.mTitleMarginEnd;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) c11919).bottomMargin;
                    } else {
                        i13 = iMin;
                    }
                    if (zM38918) {
                        int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C11915) this.mSubtitleTextView.getLayoutParams())).topMargin;
                        this.mSubtitleTextView.layout(iMin - this.mSubtitleTextView.getMeasuredWidth(), i28, iMin, this.mSubtitleTextView.getMeasuredHeight() + i28);
                        i14 = iMin - this.mTitleMarginEnd;
                    } else {
                        i14 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i13, i14);
                    }
                } else {
                    if (z2) {
                        i8 = this.mTitleMarginStart;
                    } else {
                        i8 = 0;
                    }
                    int i29 = i8 - iArr[0];
                    iMax2 = Math.max(0, i29) + iMax;
                    iArr[0] = Math.max(0, -i29);
                    if (zM38917) {
                        C11915 c119110 = (C11915) this.mTitleTextView.getLayoutParams();
                        int measuredWidth2 = this.mTitleTextView.getMeasuredWidth() + iMax2;
                        int measuredHeight3 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                        this.mTitleTextView.layout(iMax2, paddingTop, measuredWidth2, measuredHeight3);
                        i9 = measuredWidth2 + this.mTitleMarginEnd;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) c119110).bottomMargin;
                    } else {
                        i9 = iMax2;
                    }
                    if (zM38918 != 0) {
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C11915) this.mSubtitleTextView.getLayoutParams())).topMargin;
                        int measuredWidth3 = this.mSubtitleTextView.getMeasuredWidth() + iMax2;
                        this.mSubtitleTextView.layout(iMax2, i30, measuredWidth3, this.mSubtitleTextView.getMeasuredHeight() + i30);
                        i10 = measuredWidth3 + this.mTitleMarginEnd;
                    } else {
                        i10 = iMax2;
                    }
                    if (z2) {
                        iMax3 = Math.max(i9, i10);
                    } else {
                        iMax3 = iMax2;
                    }
                    i11 = 0;
                }
                m38904(this.mTempViews, 3);
                size = this.mTempViews.size();
                for (i20 = 0; i20 < size; i20++) {
                    iMax3 = m38899((View) this.mTempViews.get(i20), iMax3, iArr, i7);
                }
                i21 = i7;
                m38904(this.mTempViews, 5);
                size2 = this.mTempViews.size();
                for (i22 = 0; i22 < size2; i22++) {
                    iMin = m38914((View) this.mTempViews.get(i22), iMin, iArr, i21);
                }
                m38904(this.mTempViews, 1);
                int iM38900 = m38900(this.mTempViews, iArr);
                i23 = ((((width - i5) - paddingRight) / 2) + i5) - (iM38900 / 2);
                i24 = iM38900 + i23;
                if (i23 >= iMax3) {
                    if (i24 > iMin) {
                        iMax3 = i23 - (i24 - iMin);
                    } else {
                        iMax3 = i23;
                    }
                }
                size3 = this.mTempViews.size();
                while (i11 < size3) {
                    iMax3 = m38899((View) this.mTempViews.get(i11), iMax3, iArr, i21);
                    i11++;
                }
                this.mTempViews.clear();
            }
            iMax = iMax;
            i7 = iMin2;
            i5 = paddingLeft;
            i11 = 0;
            iMax3 = iMax;
            m38904(this.mTempViews, 3);
            size = this.mTempViews.size();
            while (i20 < size) {
                iMax3 = m38899((View) this.mTempViews.get(i20), iMax3, iArr, i7);
            }
            i21 = i7;
            m38904(this.mTempViews, 5);
            size2 = this.mTempViews.size();
            while (i22 < size2) {
                iMin = m38914((View) this.mTempViews.get(i22), iMin, iArr, i21);
            }
            m38904(this.mTempViews, 1);
            int iM38901 = m38900(this.mTempViews, iArr);
            i23 = ((((width - i5) - paddingRight) / 2) + i5) - (iM38901 / 2);
            i24 = iM38901 + i23;
            if (i23 >= iMax3) {
                if (i24 > iMin) {
                    iMax3 = i23 - (i24 - iMin);
                } else {
                    iMax3 = i23;
                }
            }
            size3 = this.mTempViews.size();
            while (i11 < size3) {
                iMax3 = m38899((View) this.mTempViews.get(i11), iMax3, iArr, i21);
                i11++;
            }
            this.mTempViews.clear();
        }
        iM38899 = paddingLeft;
        iM38914 = i25;
        if (m38917(this.mCollapseButtonView)) {
            if (z3) {
                iM38914 = m38914(this.mCollapseButtonView, iM38914, iArr, iMin2);
            } else {
                iM38899 = m38899(this.mCollapseButtonView, iM38899, iArr, iMin2);
            }
        }
        if (m38917(this.mMenuView)) {
            if (z3) {
                iM38899 = m38899(this.mMenuView, iM38899, iArr, iMin2);
            } else {
                iM38914 = m38914(this.mMenuView, iM38914, iArr, iMin2);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iM38899);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i25 - iM38914));
        iMax = Math.max(iM38899, currentContentInsetLeft2);
        iMin = Math.min(iM38914, i25 - currentContentInsetRight2);
        if (m38917(this.mExpandedActionView)) {
            if (z3) {
                iMin = m38914(this.mExpandedActionView, iMin, iArr, iMin2);
            } else {
                iMax = m38899(this.mExpandedActionView, iMax, iArr, iMin2);
            }
        }
        if (m38917(this.mLogoView)) {
            if (z3) {
                iMin = m38914(this.mLogoView, iMin, iArr, iMin2);
            } else {
                iMax = m38899(this.mLogoView, iMax, iArr, iMin2);
            }
        }
        zM38917 = m38917(this.mTitleTextView);
        zM38918 = m38917(this.mSubtitleTextView);
        if (zM38917) {
            C11915 c119111 = (C11915) this.mTitleTextView.getLayoutParams();
            measuredHeight = this.mTitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c119111).topMargin + ((ViewGroup.MarginLayoutParams) c119111).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zM38918) {
            C11915 c119112 = (C11915) this.mSubtitleTextView.getLayoutParams();
            measuredHeight += this.mSubtitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c119112).topMargin + ((ViewGroup.MarginLayoutParams) c119112).bottomMargin;
        }
        if (zM38917) {
            if (zM38917) {
                textView = this.mTitleTextView;
            } else {
                textView = this.mSubtitleTextView;
            }
            if (zM38918) {
                textView2 = this.mSubtitleTextView;
            } else {
                textView2 = this.mTitleTextView;
            }
            c11915 = (C11915) textView.getLayoutParams();
            c11916 = (C11915) textView2.getLayoutParams();
            if (zM38917) {
            }
            i5 = paddingLeft;
            i6 = this.mGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
            i7 = iMin2;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c11915).topMargin + this.mTitleMarginTop;
            } else if (i6 != 80) {
                iMax4 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i15 = ((ViewGroup.MarginLayoutParams) c11915).topMargin;
                i16 = this.mTitleMarginTop;
                if (iMax4 < i15 + i16) {
                    iMax4 = i15 + i16;
                } else {
                    i17 = (((height - paddingBottom) - measuredHeight) - iMax4) - paddingTop2;
                    i18 = ((ViewGroup.MarginLayoutParams) c11915).bottomMargin;
                    i19 = this.mTitleMarginBottom;
                    if (i17 < i18 + i19) {
                        iMax4 = Math.max(0, iMax4 - ((((ViewGroup.MarginLayoutParams) c11916).bottomMargin + i19) - i17));
                    }
                }
                paddingTop = paddingTop2 + iMax4;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c11916).bottomMargin) - this.mTitleMarginBottom) - measuredHeight;
            }
            if (z3) {
                if (z2) {
                    i12 = this.mTitleMarginStart;
                } else {
                    i12 = 0;
                }
                int i210 = i12 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zM38917) {
                    C11915 c119113 = (C11915) this.mTitleTextView.getLayoutParams();
                    int measuredWidth4 = iMin - this.mTitleTextView.getMeasuredWidth();
                    int measuredHeight4 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(measuredWidth4, paddingTop, iMin, measuredHeight4);
                    i13 = measuredWidth4 - this.mTitleMarginEnd;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) c119113).bottomMargin;
                } else {
                    i13 = iMin;
                }
                if (zM38918) {
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C11915) this.mSubtitleTextView.getLayoutParams())).topMargin;
                    this.mSubtitleTextView.layout(iMin - this.mSubtitleTextView.getMeasuredWidth(), i211, iMin, this.mSubtitleTextView.getMeasuredHeight() + i211);
                    i14 = iMin - this.mTitleMarginEnd;
                } else {
                    i14 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i13, i14);
                }
                i11 = 0;
                iMax3 = iMax;
            } else {
                if (z2) {
                    i8 = this.mTitleMarginStart;
                } else {
                    i8 = 0;
                }
                int i212 = i8 - iArr[0];
                iMax2 = Math.max(0, i212) + iMax;
                iArr[0] = Math.max(0, -i212);
                if (zM38917) {
                    C11915 c119114 = (C11915) this.mTitleTextView.getLayoutParams();
                    int measuredWidth5 = this.mTitleTextView.getMeasuredWidth() + iMax2;
                    int measuredHeight5 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(iMax2, paddingTop, measuredWidth5, measuredHeight5);
                    i9 = measuredWidth5 + this.mTitleMarginEnd;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) c119114).bottomMargin;
                } else {
                    i9 = iMax2;
                }
                if (zM38918 != 0) {
                    int i31 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C11915) this.mSubtitleTextView.getLayoutParams())).topMargin;
                    int measuredWidth6 = this.mSubtitleTextView.getMeasuredWidth() + iMax2;
                    this.mSubtitleTextView.layout(iMax2, i31, measuredWidth6, this.mSubtitleTextView.getMeasuredHeight() + i31);
                    i10 = measuredWidth6 + this.mTitleMarginEnd;
                } else {
                    i10 = iMax2;
                }
                if (z2) {
                    iMax3 = Math.max(i9, i10);
                } else {
                    iMax3 = iMax2;
                }
                i11 = 0;
            }
        } else {
            if (zM38917) {
                textView = this.mTitleTextView;
            } else {
                textView = this.mSubtitleTextView;
            }
            if (zM38918) {
                textView2 = this.mSubtitleTextView;
            } else {
                textView2 = this.mTitleTextView;
            }
            c11915 = (C11915) textView.getLayoutParams();
            c11916 = (C11915) textView2.getLayoutParams();
            if (zM38917) {
            }
            i5 = paddingLeft;
            i6 = this.mGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
            i7 = iMin2;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c11915).topMargin + this.mTitleMarginTop;
            } else if (i6 != 80) {
                iMax4 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i15 = ((ViewGroup.MarginLayoutParams) c11915).topMargin;
                i16 = this.mTitleMarginTop;
                if (iMax4 < i15 + i16) {
                    iMax4 = i15 + i16;
                } else {
                    i17 = (((height - paddingBottom) - measuredHeight) - iMax4) - paddingTop2;
                    i18 = ((ViewGroup.MarginLayoutParams) c11915).bottomMargin;
                    i19 = this.mTitleMarginBottom;
                    if (i17 < i18 + i19) {
                        iMax4 = Math.max(0, iMax4 - ((((ViewGroup.MarginLayoutParams) c11916).bottomMargin + i19) - i17));
                    }
                }
                paddingTop = paddingTop2 + iMax4;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c11916).bottomMargin) - this.mTitleMarginBottom) - measuredHeight;
            }
            if (z3) {
                if (z2) {
                    i12 = this.mTitleMarginStart;
                } else {
                    i12 = 0;
                }
                int i213 = i12 - iArr[1];
                iMin -= Math.max(0, i213);
                iArr[1] = Math.max(0, -i213);
                if (zM38917) {
                    C11915 c119115 = (C11915) this.mTitleTextView.getLayoutParams();
                    int measuredWidth7 = iMin - this.mTitleTextView.getMeasuredWidth();
                    int measuredHeight6 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(measuredWidth7, paddingTop, iMin, measuredHeight6);
                    i13 = measuredWidth7 - this.mTitleMarginEnd;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) c119115).bottomMargin;
                } else {
                    i13 = iMin;
                }
                if (zM38918) {
                    int i214 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C11915) this.mSubtitleTextView.getLayoutParams())).topMargin;
                    this.mSubtitleTextView.layout(iMin - this.mSubtitleTextView.getMeasuredWidth(), i214, iMin, this.mSubtitleTextView.getMeasuredHeight() + i214);
                    i14 = iMin - this.mTitleMarginEnd;
                } else {
                    i14 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i13, i14);
                }
                i11 = 0;
                iMax3 = iMax;
            } else {
                if (z2) {
                    i8 = this.mTitleMarginStart;
                } else {
                    i8 = 0;
                }
                int i215 = i8 - iArr[0];
                iMax2 = Math.max(0, i215) + iMax;
                iArr[0] = Math.max(0, -i215);
                if (zM38917) {
                    C11915 c119116 = (C11915) this.mTitleTextView.getLayoutParams();
                    int measuredWidth8 = this.mTitleTextView.getMeasuredWidth() + iMax2;
                    int measuredHeight7 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(iMax2, paddingTop, measuredWidth8, measuredHeight7);
                    i9 = measuredWidth8 + this.mTitleMarginEnd;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) c119116).bottomMargin;
                } else {
                    i9 = iMax2;
                }
                if (zM38918 != 0) {
                    int i32 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C11915) this.mSubtitleTextView.getLayoutParams())).topMargin;
                    int measuredWidth9 = this.mSubtitleTextView.getMeasuredWidth() + iMax2;
                    this.mSubtitleTextView.layout(iMax2, i32, measuredWidth9, this.mSubtitleTextView.getMeasuredHeight() + i32);
                    i10 = measuredWidth9 + this.mTitleMarginEnd;
                } else {
                    i10 = iMax2;
                }
                if (z2) {
                    iMax3 = Math.max(i9, i10);
                } else {
                    iMax3 = iMax2;
                }
                i11 = 0;
            }
        }
        m38904(this.mTempViews, 3);
        size = this.mTempViews.size();
        while (i20 < size) {
            iMax3 = m38899((View) this.mTempViews.get(i20), iMax3, iArr, i7);
        }
        i21 = i7;
        m38904(this.mTempViews, 5);
        size2 = this.mTempViews.size();
        while (i22 < size2) {
            iMin = m38914((View) this.mTempViews.get(i22), iMin, iArr, i21);
        }
        m38904(this.mTempViews, 1);
        int iM38902 = m38900(this.mTempViews, iArr);
        i23 = ((((width - i5) - paddingRight) / 2) + i5) - (iM38902 / 2);
        i24 = iM38902 + i23;
        if (i23 >= iMax3) {
            if (i24 > iMin) {
                iMax3 = i23 - (i24 - iMin);
            } else {
                iMax3 = i23;
            }
        }
        size3 = this.mTempViews.size();
        while (i11 < size3) {
            iMax3 = m38899((View) this.mTempViews.get(i11), iMax3, iArr, i21);
            i11++;
        }
        this.mTempViews.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m38900(List list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int measuredWidth = 0;
        while (i3 < size) {
            View view = (View) list.get(i3);
            C11915 c11915 = (C11915) view.getLayoutParams();
            int i4 = ((ViewGroup.MarginLayoutParams) c11915).leftMargin - i;
            int i5 = ((ViewGroup.MarginLayoutParams) c11915).rightMargin - i2;
            int iMax = Math.max(0, i4);
            int iMax2 = Math.max(0, i5);
            int iMax3 = Math.max(0, -i4);
            int iMax4 = Math.max(0, -i5);
            measuredWidth += view.getMeasuredWidth() + iMax + iMax2;
            i3++;
            i2 = iMax4;
            i = iMax3;
        }
        return measuredWidth;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m38899(View view, int i, int[] iArr, int i2) {
        C11915 c11915 = (C11915) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c11915).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iM38897 = m38897(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM38897, iMax + measuredWidth, view.getMeasuredHeight() + iM38897);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c11915).rightMargin + iMax;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m38914(View view, int i, int[] iArr, int i2) {
        C11915 c11915 = (C11915) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c11915).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iM38897 = m38897(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM38897, iMax, view.getMeasuredHeight() + iM38897);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c11915).leftMargin);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m38897(View view, int i) {
        C11915 c11915 = (C11915) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int iM38912 = m38912(c11915.f5085);
        if (iM38912 == 48) {
            return getPaddingTop() - i2;
        }
        if (iM38912 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c11915).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i3 = ((ViewGroup.MarginLayoutParams) c11915).topMargin;
        if (iMax < i3) {
            iMax = i3;
        } else {
            int i4 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i5 = ((ViewGroup.MarginLayoutParams) c11915).bottomMargin;
            if (i4 < i5) {
                iMax = Math.max(0, iMax - (i5 - i4));
            }
        }
        return paddingTop + iMax;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m38912(int i) {
        int i2 = i & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.mGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38904(List list, int i) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C11915 c11915 = (C11915) childAt.getLayoutParams();
                if (c11915.f38394 == 0 && m38917(childAt) && m38895(c11915.f5085) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            C11915 c11916 = (C11915) childAt2.getLayoutParams();
            if (c11916.f38394 == 0 && m38917(childAt2) && m38895(c11916.f5085) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m38895(int i) {
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, layoutDirection) & 7;
        if (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) {
            return absoluteGravity;
        }
        return layoutDirection == 1 ? 5 : 3;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private boolean m38917(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m38896(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m38913(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup
    public C11915 generateLayoutParams(AttributeSet attributeSet) {
        return new C11915(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public C11915 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C11915) {
            C11915 c11915 = (C11915) layoutParams;
            C11915 c11916 = new C11915(c11915);
            c11916.f38394 = 0;
            c11916.f38394 = c11915.f38394;
            return c11916;
        }
        if (layoutParams instanceof C1453) {
            C11915 c11917 = new C11915((C1453) layoutParams);
            c11917.f38394 = 0;
            return c11917;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            C11915 c11918 = new C11915(layoutParams);
            c11918.f38394 = 0;
            return c11918;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C11915 c11919 = new C11915(marginLayoutParams);
        c11919.f38394 = 0;
        ((ViewGroup.MarginLayoutParams) c11919).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) c11919).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) c11919).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) c11919).bottomMargin = marginLayoutParams.bottomMargin;
        return c11919;
    }

    @Override // android.view.ViewGroup
    public C11915 generateDefaultLayoutParams() {
        C11915 c11915 = new C11915(-2, -2);
        c11915.f38394 = 0;
        c11915.f5085 = 8388627;
        return c11915;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C11915);
    }

    public InterfaceC6498 getWrapper() {
        if (this.mWrapper == null) {
            this.mWrapper = new C20866(this, true);
        }
        return this.mWrapper;
    }

    public void removeChildrenForExpandedActionView() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            }
            View childAt = getChildAt(childCount);
            if (((C11915) childAt.getLayoutParams()).f38394 != 2 && childAt != this.mMenuView) {
                removeViewAt(childCount);
                this.mHiddenViews.add(childAt);
            }
        }
    }

    public void addChildrenForExpandedActionView() {
        int size = this.mHiddenViews.size();
        while (true) {
            size--;
            if (size >= 0) {
                addView((View) this.mHiddenViews.get(size));
            } else {
                this.mHiddenViews.clear();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private boolean m38907(View view) {
        return view.getParent() == this || this.mHiddenViews.contains(view);
    }

    public void setCollapsible(boolean z) {
        this.mCollapsible = z;
        requestLayout();
    }

    public void setMenuCallbacks(InterfaceC12772 interfaceC12772, InterfaceC7662 interfaceC7662) {
        this.mActionMenuPresenterCallback = interfaceC12772;
        this.mMenuBuilderCallback = interfaceC7662;
        C17531 c17531 = this.mMenuView;
        if (c17531 != null) {
            c17531.m41168(interfaceC12772, interfaceC7662);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38901() {
        if (this.mContentInsets == null) {
            this.mContentInsets = new C15424();
        }
    }

    public final TextView getTitleTextView() {
        return this.mTitleTextView;
    }

    public final TextView getSubtitleTextView() {
        return this.mSubtitleTextView;
    }

    public C13056 getOuterActionMenuPresenter() {
        return this.mOuterActionMenuPresenter;
    }

    public Context getPopupContext() {
        return this.mPopupContext;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private ArrayList m38910() {
        ArrayList arrayList = new ArrayList();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m38905() {
        Menu menu = getMenu();
        ArrayList arrayListM38910 = m38910();
        this.mMenuHostHelper.m3988(menu, m38909());
        ArrayList arrayListM38911 = m38910();
        arrayListM38911.removeAll(arrayListM38910);
        this.mProvidedMenuItems = arrayListM38911;
    }

    @Override // l.InterfaceC0312
    public void addMenuProvider(InterfaceC8515 interfaceC8515) {
        this.mMenuHostHelper.m3989(interfaceC8515);
    }

    public void addMenuProvider(InterfaceC8515 interfaceC8515, InterfaceC11217 interfaceC11217) {
        this.mMenuHostHelper.m3990(interfaceC8515, interfaceC11217);
    }

    public void addMenuProvider(InterfaceC8515 interfaceC8515, InterfaceC11217 interfaceC11217, EnumC2619 enumC2619) {
        this.mMenuHostHelper.m3991(interfaceC8515, interfaceC11217, enumC2619);
    }

    @Override // l.InterfaceC0312
    public void removeMenuProvider(InterfaceC8515 interfaceC8515) {
        this.mMenuHostHelper.m3994(interfaceC8515);
    }

    public void invalidateMenu() {
        Iterator it = this.mProvidedMenuItems.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        m38905();
    }

    public void updateBackInvokedCallbackState() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherM17330 = C5950.m17330(this);
            boolean z = hasExpandedActionView() && onBackInvokedDispatcherM17330 != null && isAttachedToWindow() && this.mBackInvokedCallbackEnabled;
            if (z && this.mBackInvokedDispatcher == null) {
                if (this.mBackInvokedCallback == null) {
                    this.mBackInvokedCallback = C5950.m17329(new RunnableC15052(1, this));
                }
                C5950.m17331(onBackInvokedDispatcherM17330, this.mBackInvokedCallback);
                this.mBackInvokedDispatcher = onBackInvokedDispatcherM17330;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.mBackInvokedDispatcher) == null) {
                return;
            }
            C5950.m17332(onBackInvokedDispatcher, this.mBackInvokedCallback);
            this.mBackInvokedDispatcher = null;
        }
    }
}
