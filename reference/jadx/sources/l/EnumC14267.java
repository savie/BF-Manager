package l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ܰ֫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: VB94 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC14267 {
    REMOVED,
    VISIBLE,
    GONE,
    INVISIBLE;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static EnumC14267 m34600(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return INVISIBLE;
        }
        return m34599(view.getVisibility());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC14267 m34599(int i) {
        if (i == 0) {
            return VISIBLE;
        }
        if (i == 4) {
            return INVISIBLE;
        }
        if (i == 8) {
            return GONE;
        }
        throw new IllegalArgumentException(C13645.m33382(i, "Unknown visibility "));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m34601(View view) {
        int i = C12030.f38767[ordinal()];
        if (i == 1) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (AbstractC3191.m10427(2)) {
                    view.toString();
                    viewGroup.toString();
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (i == 2) {
            if (AbstractC3191.m10427(2)) {
                C17359.toString(view);
            }
            view.setVisibility(0);
        } else if (i == 3) {
            if (AbstractC3191.m10427(2)) {
                C17359.toString(view);
            }
            view.setVisibility(8);
        } else {
            if (i != 4) {
                return;
            }
            if (AbstractC3191.m10427(2)) {
                C17359.toString(view);
            }
            view.setVisibility(4);
        }
    }
}
