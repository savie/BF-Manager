package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import com.google.android.material.drawable.DrawableUtils;
import java.util.ArrayList;
import java.util.List;
import l.C10405;
import l.C15844;
import l.C5031;
import l.C5965;
import l.C8033;
import l.InterfaceC11754;

/* JADX INFO: loaded from: classes.dex */
public class ViewUtils {
    public static final int EDGE_TO_EDGE_FLAGS = 768;

    public interface OnApplyWindowInsetsListener {
        C15844 onApplyWindowInsets(View view, C15844 c15844, RelativePadding relativePadding);
    }

    public static void showKeyboard(View view) {
        showKeyboard(view, true);
    }

    public static void showKeyboard(View view, boolean z) {
        C5965 c5965M14013;
        if (z && (c5965M14013 = C5031.m14013(view)) != null) {
            c5965M14013.m16256(8);
        } else {
            getInputMethodManager(view).showSoftInput(view, 1);
        }
    }

    public static void requestFocusAndShowKeyboard(View view) {
        requestFocusAndShowKeyboard(view, true);
    }

    public static void requestFocusAndShowKeyboard(final View view, final boolean z) {
        view.requestFocus();
        view.post(new Runnable() { // from class: com.google.android.material.internal.ViewUtils$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ViewUtils.showKeyboard(view, z);
            }
        });
    }

    public static void hideKeyboard(View view) {
        hideKeyboard(view, true);
    }

    public static void hideKeyboard(View view, boolean z) {
        C5965 c5965M14013;
        if (z && (c5965M14013 = C5031.m14013(view)) != null) {
            c5965M14013.m16253(8);
            return;
        }
        InputMethodManager inputMethodManager = getInputMethodManager(view);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static InputMethodManager getInputMethodManager(View view) {
        return (InputMethodManager) C10405.m26301(view.getContext(), InputMethodManager.class);
    }

    public static void setBoundsFromRect(View view, Rect rect) {
        view.setLeft(rect.left);
        view.setTop(rect.top);
        view.setRight(rect.right);
        view.setBottom(rect.bottom);
    }

    public static Rect calculateRectFromBounds(View view) {
        return calculateRectFromBounds(view, 0);
    }

    public static Rect calculateRectFromBounds(View view, int i) {
        return new Rect(view.getLeft(), view.getTop() + i, view.getRight(), view.getBottom() + i);
    }

    public static Rect calculateOffsetRectFromBounds(View view, View view2) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i3 = i - iArr2[0];
        int i4 = i2 - iArr2[1];
        return new Rect(i3, i4, view2.getWidth() + i3, view2.getHeight() + i4);
    }

    public static List getChildren(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                arrayList.add(viewGroup.getChildAt(i));
            }
        }
        return arrayList;
    }

    public static PorterDuff.Mode parseTintMode(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static boolean isLayoutRtl(View view) {
        int i = C5031.f17539;
        return view.getLayoutDirection() == 1;
    }

    public static float dpToPx(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public class RelativePadding {
        public int bottom;
        public int end;
        public int start;
        public int top;

        public RelativePadding(int i, int i2, int i3, int i4) {
            this.start = i;
            this.top = i2;
            this.end = i3;
            this.bottom = i4;
        }

        public RelativePadding(RelativePadding relativePadding) {
            this.start = relativePadding.start;
            this.top = relativePadding.top;
            this.end = relativePadding.end;
            this.bottom = relativePadding.bottom;
        }

        public void applyToView(View view) {
            int i = this.start;
            int i2 = this.top;
            int i3 = this.end;
            int i4 = this.bottom;
            int i5 = C5031.f17539;
            view.setPaddingRelative(i, i2, i3, i4);
        }
    }

    public static void doOnApplyWindowInsets(View view, AttributeSet attributeSet, int i, int i2) {
        doOnApplyWindowInsets(view, attributeSet, i, i2, null);
    }

    public static void doOnApplyWindowInsets(View view, AttributeSet attributeSet, int i, int i2, final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, C8033.f27421, i, i2);
        final boolean z = typedArrayObtainStyledAttributes.getBoolean(C8033.f26686, false);
        final boolean z2 = typedArrayObtainStyledAttributes.getBoolean(C8033.f27378, false);
        final boolean z3 = typedArrayObtainStyledAttributes.getBoolean(C8033.f27218, false);
        typedArrayObtainStyledAttributes.recycle();
        doOnApplyWindowInsets(view, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.internal.ViewUtils.1
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            public C15844 onApplyWindowInsets(View view2, C15844 c15844, RelativePadding relativePadding) {
                if (z) {
                    relativePadding.bottom = c15844.m37670() + relativePadding.bottom;
                }
                boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(view2);
                if (z2) {
                    if (zIsLayoutRtl) {
                        relativePadding.end = c15844.m37683() + relativePadding.end;
                    } else {
                        relativePadding.start = c15844.m37683() + relativePadding.start;
                    }
                }
                if (z3) {
                    if (zIsLayoutRtl) {
                        relativePadding.start = c15844.m37672() + relativePadding.start;
                    } else {
                        relativePadding.end = c15844.m37672() + relativePadding.end;
                    }
                }
                relativePadding.applyToView(view2);
                OnApplyWindowInsetsListener onApplyWindowInsetsListener2 = onApplyWindowInsetsListener;
                return onApplyWindowInsetsListener2 != null ? onApplyWindowInsetsListener2.onApplyWindowInsets(view2, c15844, relativePadding) : c15844;
            }
        });
    }

    public static void doOnApplyWindowInsets(View view, final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        int i = C5031.f17539;
        final RelativePadding relativePadding = new RelativePadding(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
        C5031.m13989(view, new InterfaceC11754() { // from class: com.google.android.material.internal.ViewUtils.2
            @Override // l.InterfaceC11754
            public C15844 onApplyWindowInsets(View view2, C15844 c15844) {
                return onApplyWindowInsetsListener.onApplyWindowInsets(view2, c15844, new RelativePadding(relativePadding));
            }
        });
        requestApplyInsetsWhenAttached(view);
    }

    public static void requestApplyInsetsWhenAttached(View view) {
        int i = C5031.f17539;
        if (view.isAttachedToWindow()) {
            C5031.m14002(view);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.internal.ViewUtils.3
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    view2.removeOnAttachStateChangeListener(this);
                    C5031.m14002(view2);
                }
            });
        }
    }

    public static float getParentAbsoluteElevation(View view) {
        float fM14006 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fM14006 += C5031.m14006((View) parent);
        }
        return fM14006;
    }

    public static ViewOverlayImpl getOverlay(View view) {
        if (view == null) {
            return null;
        }
        return new ViewOverlayApi18(view);
    }

    public static ViewGroup getContentView(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static ViewOverlayImpl getContentViewOverlay(View view) {
        return getOverlay(getContentView(view));
    }

    public static void addOnGlobalLayoutListener(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void removeOnGlobalLayoutListener(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            removeOnGlobalLayoutListener(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public static void removeOnGlobalLayoutListener(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static Integer getBackgroundColor(View view) {
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(view.getBackground());
        if (colorStateListOrNull != null) {
            return Integer.valueOf(colorStateListOrNull.getDefaultColor());
        }
        return null;
    }
}
