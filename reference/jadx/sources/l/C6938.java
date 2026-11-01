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

/* JADX INFO: renamed from: l.ۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: V659 */
/* JADX INFO: loaded from: classes3.dex */
public class C6938 extends ViewGroup implements InterfaceC0734 {
    public static final String TAG = "Toolbar";
    public InterfaceC5092 mActionMenuPresenterCallback;
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
    public C11857 mContentInsets;
    public boolean mEatingHover;
    public boolean mEatingTouch;
    public View mExpandedActionView;
    public C5527 mExpandedMenuPresenter;
    public int mGravity;
    public final ArrayList mHiddenViews;
    public ImageView mLogoView;
    public int mMaxButtonHeight;
    public InterfaceC0422 mMenuBuilderCallback;
    public final C6379 mMenuHostHelper;
    public C22815 mMenuView;
    public final InterfaceC6586 mMenuViewItemClickListener;
    public ImageButton mNavButtonView;
    public InterfaceC1293 mOnMenuItemClickListener;
    public C5175 mOuterActionMenuPresenter;
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
    public C21755 mWrapper;

    public C6938(Context context) {
        this(context, null);
    }

    public C6938(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C6938(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mGravity = 8388627;
        this.mTempViews = new ArrayList();
        this.mHiddenViews = new ArrayList();
        this.mTempMargins = new int[2];
        this.mMenuHostHelper = new C6379(new RunnableC7981(1, this));
        this.mProvidedMenuItems = new ArrayList();
        this.mMenuViewItemClickListener = new C9740(this);
        this.mShowOverflowMenuRunnable = new RunnableC3388(this);
        Context context2 = getContext();
        int[] iArr = C12108.f40531;
        C1977 c1977M6353 = C1977.m6353(context2, attributeSet, iArr, i, 0);
        C5031.m13983(this, context, iArr, attributeSet, c1977M6353.m6382(), i);
        this.mTitleTextAppearance = c1977M6353.m6387(28, 0);
        this.mSubtitleTextAppearance = c1977M6353.m6387(19, 0);
        this.mGravity = c1977M6353.m6369(0, this.mGravity);
        this.mButtonGravity = c1977M6353.m6369(2, 48);
        int iM6374 = c1977M6353.m6374(22, 0);
        iM6374 = c1977M6353.m6383(27) ? c1977M6353.m6374(27, iM6374) : iM6374;
        this.mTitleMarginBottom = iM6374;
        this.mTitleMarginTop = iM6374;
        this.mTitleMarginEnd = iM6374;
        this.mTitleMarginStart = iM6374;
        int iM6375 = c1977M6353.m6374(25, -1);
        if (iM6375 >= 0) {
            this.mTitleMarginStart = iM6375;
        }
        int iM6376 = c1977M6353.m6374(24, -1);
        if (iM6376 >= 0) {
            this.mTitleMarginEnd = iM6376;
        }
        int iM6377 = c1977M6353.m6374(26, -1);
        if (iM6377 >= 0) {
            this.mTitleMarginTop = iM6377;
        }
        int iM6378 = c1977M6353.m6374(23, -1);
        if (iM6378 >= 0) {
            this.mTitleMarginBottom = iM6378;
        }
        this.mMaxButtonHeight = c1977M6353.m6384(13, -1);
        int iM6379 = c1977M6353.m6374(9, Integer.MIN_VALUE);
        int iM63710 = c1977M6353.m6374(5, Integer.MIN_VALUE);
        int iM6384 = c1977M6353.m6384(7, 0);
        int iM6385 = c1977M6353.m6384(8, 0);
        m18673();
        this.mContentInsets.m29547(iM6384, iM6385);
        if (iM6379 != Integer.MIN_VALUE || iM63710 != Integer.MIN_VALUE) {
            this.mContentInsets.m29551(iM6379, iM63710);
        }
        this.mContentInsetStartWithNavigation = c1977M6353.m6374(10, Integer.MIN_VALUE);
        this.mContentInsetEndWithActions = c1977M6353.m6374(6, Integer.MIN_VALUE);
        this.mCollapseIcon = c1977M6353.m6370(4);
        this.mCollapseDescription = c1977M6353.m6368(3);
        CharSequence charSequenceM6368 = c1977M6353.m6368(21);
        if (!TextUtils.isEmpty(charSequenceM6368)) {
            setTitle(charSequenceM6368);
        }
        CharSequence charSequenceM6369 = c1977M6353.m6368(18);
        if (!TextUtils.isEmpty(charSequenceM6369)) {
            setSubtitle(charSequenceM6369);
        }
        this.mPopupContext = getContext();
        setPopupTheme(c1977M6353.m6387(17, 0));
        Drawable drawableM6370 = c1977M6353.m6370(16);
        if (drawableM6370 != null) {
            setNavigationIcon(drawableM6370);
        }
        CharSequence charSequenceM63610 = c1977M6353.m6368(15);
        if (!TextUtils.isEmpty(charSequenceM63610)) {
            setNavigationContentDescription(charSequenceM63610);
        }
        Drawable drawableM6371 = c1977M6353.m6370(11);
        if (drawableM6371 != null) {
            setLogo(drawableM6371);
        }
        CharSequence charSequenceM63611 = c1977M6353.m6368(12);
        if (!TextUtils.isEmpty(charSequenceM63611)) {
            setLogoDescription(charSequenceM63611);
        }
        if (c1977M6353.m6383(29)) {
            setTitleTextColor(c1977M6353.m6385(29));
        }
        if (c1977M6353.m6383(20)) {
            setSubtitleTextColor(c1977M6353.m6385(20));
        }
        if (c1977M6353.m6383(14)) {
            inflateMenu(c1977M6353.m6387(14, 0));
        }
        c1977M6353.m6379();
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
        m18673();
        this.mContentInsets.m29548(i == 1);
    }

    public void setLogo(int i) {
        setLogo(C15945.m37904(getContext(), i));
    }

    public boolean canShowOverflowMenu() {
        C22815 c22815;
        return getVisibility() == 0 && (c22815 = this.mMenuView) != null && c22815.m50501();
    }

    public boolean isOverflowMenuShowing() {
        C22815 c22815 = this.mMenuView;
        return c22815 != null && c22815.m50494();
    }

    public boolean isOverflowMenuShowPending() {
        C22815 c22815 = this.mMenuView;
        return c22815 != null && c22815.m50503();
    }

    public boolean showOverflowMenu() {
        C22815 c22815 = this.mMenuView;
        return c22815 != null && c22815.m50506();
    }

    public boolean hideOverflowMenu() {
        C22815 c22815 = this.mMenuView;
        return c22815 != null && c22815.m50492();
    }

    public void setMenu(C12418 c12418, C5175 c5175) {
        if (c12418 == null && this.mMenuView == null) {
            return;
        }
        m18664();
        C12418 c12418M50508 = this.mMenuView.m50508();
        if (c12418M50508 == c12418) {
            return;
        }
        if (c12418M50508 != null) {
            c12418M50508.removeMenuPresenter(this.mOuterActionMenuPresenter);
            c12418M50508.removeMenuPresenter(this.mExpandedMenuPresenter);
        }
        if (this.mExpandedMenuPresenter == null) {
            this.mExpandedMenuPresenter = new C5527(this);
        }
        c5175.m14345();
        if (c12418 != null) {
            c12418.addMenuPresenter(c5175, this.mPopupContext);
            c12418.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
        } else {
            c5175.initForMenu(this.mPopupContext, null);
            this.mExpandedMenuPresenter.initForMenu(this.mPopupContext, null);
            c5175.updateMenuView(true);
            this.mExpandedMenuPresenter.updateMenuView(true);
        }
        this.mMenuView.m50504(this.mPopupTheme);
        this.mMenuView.m50497(c5175);
        this.mOuterActionMenuPresenter = c5175;
        updateBackInvokedCallbackState();
    }

    public void dismissPopupMenus() {
        C22815 c22815 = this.mMenuView;
        if (c22815 != null) {
            c22815.m50502();
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
            m18685();
            if (!m18680(this.mLogoView)) {
                m18675((View) this.mLogoView, true);
            }
        } else {
            ImageView imageView = this.mLogoView;
            if (imageView != null && m18680(imageView)) {
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
            m18685();
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m18685() {
        if (this.mLogoView == null) {
            this.mLogoView = new C2830(getContext());
        }
    }

    public boolean hasExpandedActionView() {
        C5527 c5527 = this.mExpandedMenuPresenter;
        return (c5527 == null || c5527.f18947 == null) ? false : true;
    }

    public void collapseActionView() {
        C5527 c5527 = this.mExpandedMenuPresenter;
        C23707 c23707 = c5527 == null ? null : c5527.f18947;
        if (c23707 != null) {
            c23707.collapseActionView();
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
                C22357 c22357 = new C22357(context);
                this.mTitleTextView = c22357;
                c22357.setSingleLine();
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
            if (!m18680(this.mTitleTextView)) {
                m18675((View) this.mTitleTextView, true);
            }
        } else {
            TextView textView = this.mTitleTextView;
            if (textView != null && m18680(textView)) {
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
                C22357 c22357 = new C22357(context);
                this.mSubtitleTextView = c22357;
                c22357.setSingleLine();
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
            if (!m18680(this.mSubtitleTextView)) {
                m18675((View) this.mSubtitleTextView, true);
            }
        } else {
            TextView textView = this.mSubtitleTextView;
            if (textView != null && m18680(textView)) {
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
            m18677();
        }
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            C18933.m43611(this.mNavButtonView, charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C15945.m37904(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m18677();
            if (!m18680(this.mNavButtonView)) {
                m18675((View) this.mNavButtonView, true);
            }
        } else {
            ImageButton imageButton = this.mNavButtonView;
            if (imageButton != null && m18680(imageButton)) {
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
        m18677();
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
        setCollapseIcon(C15945.m37904(getContext(), i));
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
        m18679();
        return this.mMenuView.m50493();
    }

    public void setOverflowIcon(Drawable drawable) {
        m18679();
        this.mMenuView.m50495(drawable);
    }

    public Drawable getOverflowIcon() {
        m18679();
        return this.mMenuView.m50500();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m18679() {
        m18664();
        if (this.mMenuView.m50508() == null) {
            C12418 c12418 = (C12418) this.mMenuView.m50493();
            if (this.mExpandedMenuPresenter == null) {
                this.mExpandedMenuPresenter = new C5527(this);
            }
            this.mMenuView.m50505();
            c12418.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
            updateBackInvokedCallbackState();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m18664() {
        if (this.mMenuView == null) {
            C22815 c22815 = new C22815(getContext(), null);
            this.mMenuView = c22815;
            c22815.m50504(this.mPopupTheme);
            C22815 c22816 = this.mMenuView;
            c22816.f74225 = this.mMenuViewItemClickListener;
            c22816.m50496(this.mActionMenuPresenterCallback, new C4821(this));
            C22461 c22461GenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c22461GenerateDefaultLayoutParams.f54436 = (this.mButtonGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | 8388613;
            this.mMenuView.setLayoutParams(c22461GenerateDefaultLayoutParams);
            m18675((View) this.mMenuView, false);
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private MenuInflater m18663() {
        return new C2893(getContext());
    }

    public void inflateMenu(int i) {
        m18663().inflate(i, getMenu());
    }

    public void setOnMenuItemClickListener(InterfaceC1293 interfaceC1293) {
        this.mOnMenuItemClickListener = interfaceC1293;
    }

    public void setContentInsetsRelative(int i, int i2) {
        m18673();
        this.mContentInsets.m29551(i, i2);
    }

    public int getContentInsetStart() {
        C11857 c11857 = this.mContentInsets;
        if (c11857 != null) {
            return c11857.m29545();
        }
        return 0;
    }

    public int getContentInsetEnd() {
        C11857 c11857 = this.mContentInsets;
        if (c11857 != null) {
            return c11857.m29546();
        }
        return 0;
    }

    public void setContentInsetsAbsolute(int i, int i2) {
        m18673();
        this.mContentInsets.m29547(i, i2);
    }

    public int getContentInsetLeft() {
        C11857 c11857 = this.mContentInsets;
        if (c11857 != null) {
            return c11857.m29550();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C11857 c11857 = this.mContentInsets;
        if (c11857 != null) {
            return c11857.m29549();
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
        C12418 c12418M50508;
        C22815 c22815 = this.mMenuView;
        if (c22815 != null && (c12418M50508 = c22815.m50508()) != null && c12418M50508.hasVisibleItems()) {
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

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m18677() {
        if (this.mNavButtonView == null) {
            this.mNavButtonView = new C14121(getContext(), null, R.attr.MT_Protector);
            C22461 c22461GenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c22461GenerateDefaultLayoutParams.f54436 = (this.mButtonGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | 8388611;
            this.mNavButtonView.setLayoutParams(c22461GenerateDefaultLayoutParams);
        }
    }

    public View getNavButtonView() {
        return this.mNavButtonView;
    }

    public void ensureCollapseButtonView() {
        if (this.mCollapseButtonView == null) {
            C14121 c14121 = new C14121(getContext(), null, R.attr.MT_Protector);
            this.mCollapseButtonView = c14121;
            c14121.setImageDrawable(this.mCollapseIcon);
            this.mCollapseButtonView.setContentDescription(this.mCollapseDescription);
            C22461 c22461GenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c22461GenerateDefaultLayoutParams.f54436 = (this.mButtonGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | 8388611;
            c22461GenerateDefaultLayoutParams.f73320 = 2;
            this.mCollapseButtonView.setLayoutParams(c22461GenerateDefaultLayoutParams);
            this.mCollapseButtonView.setOnClickListener(new ViewOnClickListenerC13995(this));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m18675(View view, boolean z) {
        C22461 c22461GenerateLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            c22461GenerateLayoutParams = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            c22461GenerateLayoutParams = generateLayoutParams(layoutParams);
        } else {
            c22461GenerateLayoutParams = (C22461) layoutParams;
        }
        c22461GenerateLayoutParams.f73320 = 1;
        if (z && this.mExpandedActionView != null) {
            view.setLayoutParams(c22461GenerateLayoutParams);
            this.mHiddenViews.add(view);
        } else {
            addView(view, c22461GenerateLayoutParams);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C23707 c23707;
        C4115 c4115 = new C4115(super.onSaveInstanceState());
        C5527 c5527 = this.mExpandedMenuPresenter;
        if (c5527 != null && (c23707 = c5527.f18947) != null) {
            c4115.f15075 = c23707.getItemId();
        }
        c4115.f15076 = isOverflowMenuShowing();
        return c4115;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof C4115)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4115 c4115 = (C4115) parcelable;
        super.onRestoreInstanceState(c4115.getSuperState());
        C22815 c22815 = this.mMenuView;
        C12418 c12418M50508 = c22815 != null ? c22815.m50508() : null;
        int i = c4115.f15075;
        if (i != 0 && this.mExpandedMenuPresenter != null && c12418M50508 != null && (menuItemFindItem = c12418M50508.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (c4115.f15076) {
            m18666();
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m18666() {
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
    private void m18674(View view, int i, int i2, int i3, int i4, int i5) {
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
    private int m18670(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private boolean m18678() {
        if (!this.mCollapsible) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m18665(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
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
        int i3 = C20344.f65886;
        if (getLayoutDirection() == 1) {
            c = 1;
            c2 = 0;
        } else {
            c = 0;
            c2 = 1;
        }
        if (m18665(this.mNavButtonView)) {
            m18674(this.mNavButtonView, i, 0, i2, 0, this.mMaxButtonHeight);
            measuredWidth = this.mNavButtonView.getMeasuredWidth() + m18668(this.mNavButtonView);
            iMax = Math.max(0, this.mNavButtonView.getMeasuredHeight() + m18683(this.mNavButtonView));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.mNavButtonView.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m18665(this.mCollapseButtonView)) {
            m18674(this.mCollapseButtonView, i, 0, i2, 0, this.mMaxButtonHeight);
            measuredWidth = this.mCollapseButtonView.getMeasuredWidth() + m18668(this.mCollapseButtonView);
            iMax = Math.max(iMax, this.mCollapseButtonView.getMeasuredHeight() + m18683(this.mCollapseButtonView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mCollapseButtonView.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr[c] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (m18665(this.mMenuView)) {
            m18674(this.mMenuView, i, iMax3, i2, 0, this.mMaxButtonHeight);
            measuredWidth2 = this.mMenuView.getMeasuredWidth() + m18668(this.mMenuView);
            iMax = Math.max(iMax, this.mMenuView.getMeasuredHeight() + m18683(this.mMenuView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mMenuView.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr[c2] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (m18665(this.mExpandedActionView)) {
            iMax4 += m18670(this.mExpandedActionView, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.mExpandedActionView.getMeasuredHeight() + m18683(this.mExpandedActionView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mExpandedActionView.getMeasuredState());
        }
        if (m18665(this.mLogoView)) {
            iMax4 += m18670(this.mLogoView, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.mLogoView.getMeasuredHeight() + m18683(this.mLogoView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mLogoView.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((C22461) childAt.getLayoutParams()).f73320 == 0 && m18665(childAt)) {
                iMax4 += m18670(childAt, i, iMax4, i2, 0, iArr);
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + m18683(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i5 = this.mTitleMarginTop + this.mTitleMarginBottom;
        int i6 = this.mTitleMarginStart + this.mTitleMarginEnd;
        if (m18665(this.mTitleTextView)) {
            m18670(this.mTitleTextView, i, iMax4 + i6, i2, i5, iArr);
            int measuredWidth3 = this.mTitleTextView.getMeasuredWidth() + m18668(this.mTitleTextView);
            measuredHeight = this.mTitleTextView.getMeasuredHeight() + m18683(this.mTitleTextView);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.mTitleTextView.getMeasuredState());
            iMax2 = measuredWidth3;
        } else {
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
            measuredHeight = 0;
        }
        if (m18665(this.mSubtitleTextView)) {
            iMax2 = Math.max(iMax2, m18670(this.mSubtitleTextView, i, iMax4 + i6, i2, i5 + measuredHeight, iArr));
            measuredHeight += this.mSubtitleTextView.getMeasuredHeight() + m18683(this.mSubtitleTextView);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.mSubtitleTextView.getMeasuredState());
        }
        int iMax5 = Math.max(iMax, measuredHeight);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax4 + iMax2, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2), m18678() ? 0 : View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax5, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
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
        int iM18671;
        int iM18684;
        int iMax;
        int iMin;
        boolean zM18665;
        boolean zM18666;
        int measuredHeight;
        TextView textView;
        TextView textView2;
        C22461 c22461;
        C22461 c22462;
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
        int i26 = C5031.f17539;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (m18665(this.mNavButtonView)) {
            if (z3) {
                iM18684 = m18684(this.mNavButtonView, i25, iArr, iMin2);
                iM18671 = paddingLeft;
            } else {
                iM18671 = m18671(this.mNavButtonView, paddingLeft, iArr, iMin2);
            }
            if (m18665(this.mCollapseButtonView)) {
                if (z3) {
                    iM18684 = m18684(this.mCollapseButtonView, iM18684, iArr, iMin2);
                } else {
                    iM18671 = m18671(this.mCollapseButtonView, iM18671, iArr, iMin2);
                }
            }
            if (m18665(this.mMenuView)) {
                if (z3) {
                    iM18671 = m18671(this.mMenuView, iM18671, iArr, iMin2);
                } else {
                    iM18684 = m18684(this.mMenuView, iM18684, iArr, iMin2);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iM18671);
            iArr[1] = Math.max(0, currentContentInsetRight - (i25 - iM18684));
            iMax = Math.max(iM18671, currentContentInsetLeft);
            iMin = Math.min(iM18684, i25 - currentContentInsetRight);
            if (m18665(this.mExpandedActionView)) {
                if (z3) {
                    iMin = m18684(this.mExpandedActionView, iMin, iArr, iMin2);
                } else {
                    iMax = m18671(this.mExpandedActionView, iMax, iArr, iMin2);
                }
            }
            if (m18665(this.mLogoView)) {
                if (z3) {
                    iMin = m18684(this.mLogoView, iMin, iArr, iMin2);
                } else {
                    iMax = m18671(this.mLogoView, iMax, iArr, iMin2);
                }
            }
            zM18665 = m18665(this.mTitleTextView);
            zM18666 = m18665(this.mSubtitleTextView);
            if (zM18665) {
                C22461 c22463 = (C22461) this.mTitleTextView.getLayoutParams();
                measuredHeight = this.mTitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c22463).topMargin + ((ViewGroup.MarginLayoutParams) c22463).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zM18666) {
                C22461 c22464 = (C22461) this.mSubtitleTextView.getLayoutParams();
                measuredHeight += this.mSubtitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c22464).topMargin + ((ViewGroup.MarginLayoutParams) c22464).bottomMargin;
            }
            if (!zM18665 || zM18666) {
                if (zM18665) {
                    textView = this.mTitleTextView;
                } else {
                    textView = this.mSubtitleTextView;
                }
                if (zM18666) {
                    textView2 = this.mSubtitleTextView;
                } else {
                    textView2 = this.mTitleTextView;
                }
                c22461 = (C22461) textView.getLayoutParams();
                c22462 = (C22461) textView2.getLayoutParams();
                z2 = (!zM18665 && this.mTitleTextView.getMeasuredWidth() > 0) || (zM18666 && this.mSubtitleTextView.getMeasuredWidth() > 0);
                i5 = paddingLeft;
                i6 = this.mGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
                i7 = iMin2;
                if (i6 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c22461).topMargin + this.mTitleMarginTop;
                } else if (i6 != 80) {
                    iMax4 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    i15 = ((ViewGroup.MarginLayoutParams) c22461).topMargin;
                    i16 = this.mTitleMarginTop;
                    if (iMax4 < i15 + i16) {
                        iMax4 = i15 + i16;
                    } else {
                        i17 = (((height - paddingBottom) - measuredHeight) - iMax4) - paddingTop2;
                        i18 = ((ViewGroup.MarginLayoutParams) c22461).bottomMargin;
                        i19 = this.mTitleMarginBottom;
                        if (i17 < i18 + i19) {
                            iMax4 = Math.max(0, iMax4 - ((((ViewGroup.MarginLayoutParams) c22462).bottomMargin + i19) - i17));
                        }
                    }
                    paddingTop = paddingTop2 + iMax4;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c22462).bottomMargin) - this.mTitleMarginBottom) - measuredHeight;
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
                    if (zM18665) {
                        C22461 c22465 = (C22461) this.mTitleTextView.getLayoutParams();
                        int measuredWidth = iMin - this.mTitleTextView.getMeasuredWidth();
                        int measuredHeight2 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                        this.mTitleTextView.layout(measuredWidth, paddingTop, iMin, measuredHeight2);
                        i13 = measuredWidth - this.mTitleMarginEnd;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) c22465).bottomMargin;
                    } else {
                        i13 = iMin;
                    }
                    if (zM18666) {
                        int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C22461) this.mSubtitleTextView.getLayoutParams())).topMargin;
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
                    if (zM18665) {
                        C22461 c22466 = (C22461) this.mTitleTextView.getLayoutParams();
                        int measuredWidth2 = this.mTitleTextView.getMeasuredWidth() + iMax2;
                        int measuredHeight3 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                        this.mTitleTextView.layout(iMax2, paddingTop, measuredWidth2, measuredHeight3);
                        i9 = measuredWidth2 + this.mTitleMarginEnd;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) c22466).bottomMargin;
                    } else {
                        i9 = iMax2;
                    }
                    if (zM18666 != 0) {
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C22461) this.mSubtitleTextView.getLayoutParams())).topMargin;
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
                m18676(this.mTempViews, 3);
                size = this.mTempViews.size();
                for (i20 = 0; i20 < size; i20++) {
                    iMax3 = m18671((View) this.mTempViews.get(i20), iMax3, iArr, i7);
                }
                i21 = i7;
                m18676(this.mTempViews, 5);
                size2 = this.mTempViews.size();
                for (i22 = 0; i22 < size2; i22++) {
                    iMin = m18684((View) this.mTempViews.get(i22), iMin, iArr, i21);
                }
                m18676(this.mTempViews, 1);
                int iM18672 = m18672(this.mTempViews, iArr);
                i23 = ((((width - i5) - paddingRight) / 2) + i5) - (iM18672 / 2);
                i24 = iM18672 + i23;
                if (i23 >= iMax3) {
                    if (i24 > iMin) {
                        iMax3 = i23 - (i24 - iMin);
                    } else {
                        iMax3 = i23;
                    }
                }
                size3 = this.mTempViews.size();
                while (i11 < size3) {
                    iMax3 = m18671((View) this.mTempViews.get(i11), iMax3, iArr, i21);
                    i11++;
                }
                this.mTempViews.clear();
            }
            iMax = iMax;
            i7 = iMin2;
            i5 = paddingLeft;
            i11 = 0;
            iMax3 = iMax;
            m18676(this.mTempViews, 3);
            size = this.mTempViews.size();
            while (i20 < size) {
                iMax3 = m18671((View) this.mTempViews.get(i20), iMax3, iArr, i7);
            }
            i21 = i7;
            m18676(this.mTempViews, 5);
            size2 = this.mTempViews.size();
            while (i22 < size2) {
                iMin = m18684((View) this.mTempViews.get(i22), iMin, iArr, i21);
            }
            m18676(this.mTempViews, 1);
            int iM18673 = m18672(this.mTempViews, iArr);
            i23 = ((((width - i5) - paddingRight) / 2) + i5) - (iM18673 / 2);
            i24 = iM18673 + i23;
            if (i23 >= iMax3) {
                if (i24 > iMin) {
                    iMax3 = i23 - (i24 - iMin);
                } else {
                    iMax3 = i23;
                }
            }
            size3 = this.mTempViews.size();
            while (i11 < size3) {
                iMax3 = m18671((View) this.mTempViews.get(i11), iMax3, iArr, i21);
                i11++;
            }
            this.mTempViews.clear();
        }
        iM18671 = paddingLeft;
        iM18684 = i25;
        if (m18665(this.mCollapseButtonView)) {
            if (z3) {
                iM18684 = m18684(this.mCollapseButtonView, iM18684, iArr, iMin2);
            } else {
                iM18671 = m18671(this.mCollapseButtonView, iM18671, iArr, iMin2);
            }
        }
        if (m18665(this.mMenuView)) {
            if (z3) {
                iM18671 = m18671(this.mMenuView, iM18671, iArr, iMin2);
            } else {
                iM18684 = m18684(this.mMenuView, iM18684, iArr, iMin2);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iM18671);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i25 - iM18684));
        iMax = Math.max(iM18671, currentContentInsetLeft2);
        iMin = Math.min(iM18684, i25 - currentContentInsetRight2);
        if (m18665(this.mExpandedActionView)) {
            if (z3) {
                iMin = m18684(this.mExpandedActionView, iMin, iArr, iMin2);
            } else {
                iMax = m18671(this.mExpandedActionView, iMax, iArr, iMin2);
            }
        }
        if (m18665(this.mLogoView)) {
            if (z3) {
                iMin = m18684(this.mLogoView, iMin, iArr, iMin2);
            } else {
                iMax = m18671(this.mLogoView, iMax, iArr, iMin2);
            }
        }
        zM18665 = m18665(this.mTitleTextView);
        zM18666 = m18665(this.mSubtitleTextView);
        if (zM18665) {
            C22461 c22467 = (C22461) this.mTitleTextView.getLayoutParams();
            measuredHeight = this.mTitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c22467).topMargin + ((ViewGroup.MarginLayoutParams) c22467).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zM18666) {
            C22461 c22468 = (C22461) this.mSubtitleTextView.getLayoutParams();
            measuredHeight += this.mSubtitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c22468).topMargin + ((ViewGroup.MarginLayoutParams) c22468).bottomMargin;
        }
        if (zM18665) {
            if (zM18665) {
                textView = this.mTitleTextView;
            } else {
                textView = this.mSubtitleTextView;
            }
            if (zM18666) {
                textView2 = this.mSubtitleTextView;
            } else {
                textView2 = this.mTitleTextView;
            }
            c22461 = (C22461) textView.getLayoutParams();
            c22462 = (C22461) textView2.getLayoutParams();
            if (zM18665) {
            }
            i5 = paddingLeft;
            i6 = this.mGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
            i7 = iMin2;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c22461).topMargin + this.mTitleMarginTop;
            } else if (i6 != 80) {
                iMax4 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i15 = ((ViewGroup.MarginLayoutParams) c22461).topMargin;
                i16 = this.mTitleMarginTop;
                if (iMax4 < i15 + i16) {
                    iMax4 = i15 + i16;
                } else {
                    i17 = (((height - paddingBottom) - measuredHeight) - iMax4) - paddingTop2;
                    i18 = ((ViewGroup.MarginLayoutParams) c22461).bottomMargin;
                    i19 = this.mTitleMarginBottom;
                    if (i17 < i18 + i19) {
                        iMax4 = Math.max(0, iMax4 - ((((ViewGroup.MarginLayoutParams) c22462).bottomMargin + i19) - i17));
                    }
                }
                paddingTop = paddingTop2 + iMax4;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c22462).bottomMargin) - this.mTitleMarginBottom) - measuredHeight;
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
                if (zM18665) {
                    C22461 c22469 = (C22461) this.mTitleTextView.getLayoutParams();
                    int measuredWidth4 = iMin - this.mTitleTextView.getMeasuredWidth();
                    int measuredHeight4 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(measuredWidth4, paddingTop, iMin, measuredHeight4);
                    i13 = measuredWidth4 - this.mTitleMarginEnd;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) c22469).bottomMargin;
                } else {
                    i13 = iMin;
                }
                if (zM18666) {
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C22461) this.mSubtitleTextView.getLayoutParams())).topMargin;
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
                if (zM18665) {
                    C22461 c224610 = (C22461) this.mTitleTextView.getLayoutParams();
                    int measuredWidth5 = this.mTitleTextView.getMeasuredWidth() + iMax2;
                    int measuredHeight5 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(iMax2, paddingTop, measuredWidth5, measuredHeight5);
                    i9 = measuredWidth5 + this.mTitleMarginEnd;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) c224610).bottomMargin;
                } else {
                    i9 = iMax2;
                }
                if (zM18666 != 0) {
                    int i31 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C22461) this.mSubtitleTextView.getLayoutParams())).topMargin;
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
            if (zM18665) {
                textView = this.mTitleTextView;
            } else {
                textView = this.mSubtitleTextView;
            }
            if (zM18666) {
                textView2 = this.mSubtitleTextView;
            } else {
                textView2 = this.mTitleTextView;
            }
            c22461 = (C22461) textView.getLayoutParams();
            c22462 = (C22461) textView2.getLayoutParams();
            if (zM18665) {
            }
            i5 = paddingLeft;
            i6 = this.mGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
            i7 = iMin2;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c22461).topMargin + this.mTitleMarginTop;
            } else if (i6 != 80) {
                iMax4 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i15 = ((ViewGroup.MarginLayoutParams) c22461).topMargin;
                i16 = this.mTitleMarginTop;
                if (iMax4 < i15 + i16) {
                    iMax4 = i15 + i16;
                } else {
                    i17 = (((height - paddingBottom) - measuredHeight) - iMax4) - paddingTop2;
                    i18 = ((ViewGroup.MarginLayoutParams) c22461).bottomMargin;
                    i19 = this.mTitleMarginBottom;
                    if (i17 < i18 + i19) {
                        iMax4 = Math.max(0, iMax4 - ((((ViewGroup.MarginLayoutParams) c22462).bottomMargin + i19) - i17));
                    }
                }
                paddingTop = paddingTop2 + iMax4;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c22462).bottomMargin) - this.mTitleMarginBottom) - measuredHeight;
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
                if (zM18665) {
                    C22461 c224611 = (C22461) this.mTitleTextView.getLayoutParams();
                    int measuredWidth7 = iMin - this.mTitleTextView.getMeasuredWidth();
                    int measuredHeight6 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(measuredWidth7, paddingTop, iMin, measuredHeight6);
                    i13 = measuredWidth7 - this.mTitleMarginEnd;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) c224611).bottomMargin;
                } else {
                    i13 = iMin;
                }
                if (zM18666) {
                    int i214 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C22461) this.mSubtitleTextView.getLayoutParams())).topMargin;
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
                if (zM18665) {
                    C22461 c224612 = (C22461) this.mTitleTextView.getLayoutParams();
                    int measuredWidth8 = this.mTitleTextView.getMeasuredWidth() + iMax2;
                    int measuredHeight7 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(iMax2, paddingTop, measuredWidth8, measuredHeight7);
                    i9 = measuredWidth8 + this.mTitleMarginEnd;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) c224612).bottomMargin;
                } else {
                    i9 = iMax2;
                }
                if (zM18666 != 0) {
                    int i32 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C22461) this.mSubtitleTextView.getLayoutParams())).topMargin;
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
        m18676(this.mTempViews, 3);
        size = this.mTempViews.size();
        while (i20 < size) {
            iMax3 = m18671((View) this.mTempViews.get(i20), iMax3, iArr, i7);
        }
        i21 = i7;
        m18676(this.mTempViews, 5);
        size2 = this.mTempViews.size();
        while (i22 < size2) {
            iMin = m18684((View) this.mTempViews.get(i22), iMin, iArr, i21);
        }
        m18676(this.mTempViews, 1);
        int iM18674 = m18672(this.mTempViews, iArr);
        i23 = ((((width - i5) - paddingRight) / 2) + i5) - (iM18674 / 2);
        i24 = iM18674 + i23;
        if (i23 >= iMax3) {
            if (i24 > iMin) {
                iMax3 = i23 - (i24 - iMin);
            } else {
                iMax3 = i23;
            }
        }
        size3 = this.mTempViews.size();
        while (i11 < size3) {
            iMax3 = m18671((View) this.mTempViews.get(i11), iMax3, iArr, i21);
            i11++;
        }
        this.mTempViews.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m18672(List list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int measuredWidth = 0;
        while (i3 < size) {
            View view = (View) list.get(i3);
            C22461 c22461 = (C22461) view.getLayoutParams();
            int i4 = ((ViewGroup.MarginLayoutParams) c22461).leftMargin - i;
            int i5 = ((ViewGroup.MarginLayoutParams) c22461).rightMargin - i2;
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
    private int m18671(View view, int i, int[] iArr, int i2) {
        C22461 c22461 = (C22461) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c22461).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iM18669 = m18669(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM18669, iMax + measuredWidth, view.getMeasuredHeight() + iM18669);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c22461).rightMargin + iMax;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m18684(View view, int i, int[] iArr, int i2) {
        C22461 c22461 = (C22461) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c22461).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iM18669 = m18669(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM18669, iMax, view.getMeasuredHeight() + iM18669);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c22461).leftMargin);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m18669(View view, int i) {
        C22461 c22461 = (C22461) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int iM18682 = m18682(c22461.f54436);
        if (iM18682 == 48) {
            return getPaddingTop() - i2;
        }
        if (iM18682 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c22461).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i3 = ((ViewGroup.MarginLayoutParams) c22461).topMargin;
        if (iMax < i3) {
            iMax = i3;
        } else {
            int i4 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i5 = ((ViewGroup.MarginLayoutParams) c22461).bottomMargin;
            if (i4 < i5) {
                iMax = Math.max(0, iMax - (i5 - i4));
            }
        }
        return paddingTop + iMax;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m18682(int i) {
        int i2 = i & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.mGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m18676(List list, int i) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C22461 c22461 = (C22461) childAt.getLayoutParams();
                if (c22461.f73320 == 0 && m18665(childAt) && m18667(c22461.f54436) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            C22461 c22462 = (C22461) childAt2.getLayoutParams();
            if (c22462.f73320 == 0 && m18665(childAt2) && m18667(c22462.f54436) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m18667(int i) {
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, layoutDirection) & 7;
        if (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) {
            return absoluteGravity;
        }
        return layoutDirection == 1 ? 5 : 3;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private boolean m18665(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m18668(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m18683(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup
    public C22461 generateLayoutParams(AttributeSet attributeSet) {
        return new C22461(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public C22461 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C22461) {
            C22461 c22461 = (C22461) layoutParams;
            C22461 c22462 = new C22461(c22461);
            c22462.f73320 = 0;
            c22462.f73320 = c22461.f73320;
            return c22462;
        }
        if (layoutParams instanceof C17046) {
            C22461 c22463 = new C22461((C17046) layoutParams);
            c22463.f73320 = 0;
            return c22463;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            C22461 c22464 = new C22461(layoutParams);
            c22464.f73320 = 0;
            return c22464;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C22461 c22465 = new C22461(marginLayoutParams);
        c22465.f73320 = 0;
        ((ViewGroup.MarginLayoutParams) c22465).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) c22465).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) c22465).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) c22465).bottomMargin = marginLayoutParams.bottomMargin;
        return c22465;
    }

    @Override // android.view.ViewGroup
    public C22461 generateDefaultLayoutParams() {
        C22461 c22461 = new C22461(-2, -2);
        c22461.f73320 = 0;
        c22461.f54436 = 8388627;
        return c22461;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C22461);
    }

    public InterfaceC19535 getWrapper() {
        if (this.mWrapper == null) {
            this.mWrapper = new C21755(this, true);
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
            if (((C22461) childAt.getLayoutParams()).f73320 != 2 && childAt != this.mMenuView) {
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

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private boolean m18680(View view) {
        return view.getParent() == this || this.mHiddenViews.contains(view);
    }

    public void setCollapsible(boolean z) {
        this.mCollapsible = z;
        requestLayout();
    }

    public void setMenuCallbacks(InterfaceC5092 interfaceC5092, InterfaceC0422 interfaceC0422) {
        this.mActionMenuPresenterCallback = interfaceC5092;
        this.mMenuBuilderCallback = interfaceC0422;
        C22815 c22815 = this.mMenuView;
        if (c22815 != null) {
            c22815.m50496(interfaceC5092, interfaceC0422);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m18673() {
        if (this.mContentInsets == null) {
            this.mContentInsets = new C11857();
        }
    }

    public final TextView getTitleTextView() {
        return this.mTitleTextView;
    }

    public final TextView getSubtitleTextView() {
        return this.mSubtitleTextView;
    }

    public C5175 getOuterActionMenuPresenter() {
        return this.mOuterActionMenuPresenter;
    }

    public Context getPopupContext() {
        return this.mPopupContext;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private ArrayList m18686() {
        ArrayList arrayList = new ArrayList();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m18681() {
        Menu menu = getMenu();
        ArrayList arrayListM18686 = m18686();
        this.mMenuHostHelper.m17509(menu, m18663());
        ArrayList arrayListM18687 = m18686();
        arrayListM18687.removeAll(arrayListM18686);
        this.mProvidedMenuItems = arrayListM18687;
    }

    @Override // l.InterfaceC0734
    public void addMenuProvider(InterfaceC14847 interfaceC14847) {
        this.mMenuHostHelper.m17510(interfaceC14847);
    }

    public void addMenuProvider(InterfaceC14847 interfaceC14847, InterfaceC1423 interfaceC1423) {
        this.mMenuHostHelper.m17511(interfaceC14847, interfaceC1423);
    }

    public void addMenuProvider(InterfaceC14847 interfaceC14847, InterfaceC1423 interfaceC1423, EnumC9414 enumC9414) {
        this.mMenuHostHelper.m17512(interfaceC14847, interfaceC1423, enumC9414);
    }

    @Override // l.InterfaceC0734
    public void removeMenuProvider(InterfaceC14847 interfaceC14847) {
        this.mMenuHostHelper.m17515(interfaceC14847);
    }

    public void invalidateMenu() {
        Iterator it = this.mProvidedMenuItems.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        m18681();
    }

    public void updateBackInvokedCallbackState() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherM8243 = C2704.m8243(this);
            boolean z = hasExpandedActionView() && onBackInvokedDispatcherM8243 != null && isAttachedToWindow() && this.mBackInvokedCallbackEnabled;
            if (z && this.mBackInvokedDispatcher == null) {
                if (this.mBackInvokedCallback == null) {
                    this.mBackInvokedCallback = C2704.m8242(new RunnableC3185(1, this));
                }
                C2704.m8244(onBackInvokedDispatcherM8243, this.mBackInvokedCallback);
                this.mBackInvokedDispatcher = onBackInvokedDispatcherM8243;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.mBackInvokedDispatcher) == null) {
                return;
            }
            C2704.m8250(onBackInvokedDispatcher, this.mBackInvokedCallback);
            this.mBackInvokedDispatcher = null;
        }
    }
}
