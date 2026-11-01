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
import l.C22815;
import l.C6938;
import l.ViewOnClickListenerC6772;

/* JADX INFO: loaded from: classes.dex */
public class ToolbarUtils {
    public static final Comparator VIEW_TOP_COMPARATOR = new Comparator() { // from class: com.google.android.material.internal.ToolbarUtils.1
        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    };

    public static TextView getTitleTextView(C6938 c6938) {
        List textViewsWithText = getTextViewsWithText(c6938, c6938.getTitle());
        if (textViewsWithText.isEmpty()) {
            return null;
        }
        return (TextView) Collections.min(textViewsWithText, VIEW_TOP_COMPARATOR);
    }

    public static TextView getSubtitleTextView(C6938 c6938) {
        List textViewsWithText = getTextViewsWithText(c6938, c6938.getSubtitle());
        if (textViewsWithText.isEmpty()) {
            return null;
        }
        return (TextView) Collections.max(textViewsWithText, VIEW_TOP_COMPARATOR);
    }

    public static List getTextViewsWithText(C6938 c6938, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c6938.getChildCount(); i++) {
            View childAt = c6938.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static ImageView getLogoImageView(C6938 c6938) {
        return getImageView(c6938, c6938.getLogo());
    }

    public static ImageView getImageView(C6938 c6938, Drawable drawable) {
        ImageView imageView;
        Drawable drawable2;
        if (drawable == null) {
            return null;
        }
        for (int i = 0; i < c6938.getChildCount(); i++) {
            View childAt = c6938.getChildAt(i);
            if ((childAt instanceof ImageView) && (drawable2 = (imageView = (ImageView) childAt).getDrawable()) != null && drawable2.getConstantState() != null && drawable2.getConstantState().equals(drawable.getConstantState())) {
                return imageView;
            }
        }
        return null;
    }

    public static View getSecondaryActionMenuItemView(C6938 c6938) {
        C22815 actionMenuView = getActionMenuView(c6938);
        if (actionMenuView == null || actionMenuView.getChildCount() <= 1) {
            return null;
        }
        return actionMenuView.getChildAt(0);
    }

    public static C22815 getActionMenuView(C6938 c6938) {
        for (int i = 0; i < c6938.getChildCount(); i++) {
            View childAt = c6938.getChildAt(i);
            if (childAt instanceof C22815) {
                return (C22815) childAt;
            }
        }
        return null;
    }

    public static ImageButton getNavigationIconButton(C6938 c6938) {
        Drawable navigationIcon = c6938.getNavigationIcon();
        if (navigationIcon == null) {
            return null;
        }
        for (int i = 0; i < c6938.getChildCount(); i++) {
            View childAt = c6938.getChildAt(i);
            if (childAt instanceof ImageButton) {
                ImageButton imageButton = (ImageButton) childAt;
                if (imageButton.getDrawable() == navigationIcon) {
                    return imageButton;
                }
            }
        }
        return null;
    }

    public static ViewOnClickListenerC6772 getActionMenuItemView(C6938 c6938, int i) {
        C22815 actionMenuView = getActionMenuView(c6938);
        if (actionMenuView == null) {
            return null;
        }
        for (int i2 = 0; i2 < actionMenuView.getChildCount(); i2++) {
            View childAt = actionMenuView.getChildAt(i2);
            if (childAt instanceof ViewOnClickListenerC6772) {
                ViewOnClickListenerC6772 viewOnClickListenerC6772 = (ViewOnClickListenerC6772) childAt;
                if (viewOnClickListenerC6772.getItemData().getItemId() == i) {
                    return viewOnClickListenerC6772;
                }
            }
        }
        return null;
    }
}
