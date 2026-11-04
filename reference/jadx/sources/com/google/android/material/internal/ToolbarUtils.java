package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import l.C16390;
import l.C17531;
import l.ViewOnClickListenerC16611;

/* JADX INFO: loaded from: classes.dex */
public class ToolbarUtils {
    public static final Comparator VIEW_TOP_COMPARATOR = new Comparator() { // from class: com.google.android.material.internal.ToolbarUtils.1
        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    };

    public static TextView getTitleTextView(C16390 c16390) {
        List textViewsWithText = getTextViewsWithText(c16390, c16390.getTitle());
        if (textViewsWithText.isEmpty()) {
            return null;
        }
        return (TextView) Collections.min(textViewsWithText, VIEW_TOP_COMPARATOR);
    }

    public static TextView getSubtitleTextView(C16390 c16390) {
        List textViewsWithText = getTextViewsWithText(c16390, c16390.getSubtitle());
        if (textViewsWithText.isEmpty()) {
            return null;
        }
        return (TextView) Collections.max(textViewsWithText, VIEW_TOP_COMPARATOR);
    }

    public static List getTextViewsWithText(C16390 c16390, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c16390.getChildCount(); i++) {
            View childAt = c16390.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static ImageView getLogoImageView(C16390 c16390) {
        return getImageView(c16390, c16390.getLogo());
    }

    public static ImageView getImageView(C16390 c16390, Drawable drawable) {
        ImageView imageView;
        Drawable drawable2;
        if (drawable == null) {
            return null;
        }
        for (int i = 0; i < c16390.getChildCount(); i++) {
            View childAt = c16390.getChildAt(i);
            if ((childAt instanceof ImageView) && (drawable2 = (imageView = (ImageView) childAt).getDrawable()) != null && drawable2.getConstantState() != null && drawable2.getConstantState().equals(drawable.getConstantState())) {
                return imageView;
            }
        }
        return null;
    }

    public static View getSecondaryActionMenuItemView(C16390 c16390) {
        C17531 actionMenuView = getActionMenuView(c16390);
        if (actionMenuView == null || actionMenuView.getChildCount() <= 1) {
            return null;
        }
        return actionMenuView.getChildAt(0);
    }

    public static C17531 getActionMenuView(C16390 c16390) {
        for (int i = 0; i < c16390.getChildCount(); i++) {
            View childAt = c16390.getChildAt(i);
            if (childAt instanceof C17531) {
                return (C17531) childAt;
            }
        }
        return null;
    }

    public static ImageButton getNavigationIconButton(C16390 c16390) {
        Drawable navigationIcon = c16390.getNavigationIcon();
        if (navigationIcon == null) {
            return null;
        }
        for (int i = 0; i < c16390.getChildCount(); i++) {
            View childAt = c16390.getChildAt(i);
            if (childAt instanceof ImageButton) {
                ImageButton imageButton = (ImageButton) childAt;
                if (imageButton.getDrawable() == navigationIcon) {
                    return imageButton;
                }
            }
        }
        return null;
    }

    public static ViewOnClickListenerC16611 getActionMenuItemView(C16390 c16390, int i) {
        C17531 actionMenuView = getActionMenuView(c16390);
        if (actionMenuView == null) {
            return null;
        }
        for (int i2 = 0; i2 < actionMenuView.getChildCount(); i2++) {
            View childAt = actionMenuView.getChildAt(i2);
            if (childAt instanceof ViewOnClickListenerC16611) {
                ViewOnClickListenerC16611 viewOnClickListenerC16611 = (ViewOnClickListenerC16611) childAt;
                if (viewOnClickListenerC16611.getItemData().getItemId() == i) {
                    return viewOnClickListenerC16611;
                }
            }
        }
        return null;
    }
}
