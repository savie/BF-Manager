package l;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.ActionMode;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ܿۙۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5YG */
/* JADX INFO: loaded from: classes4.dex */
public final class C18085 {
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m42126(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42119(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 27) {
            C24053.m53603(textView, 1, i, 1, 0);
        } else if (textView instanceof InterfaceC8647) {
            ((InterfaceC8647) textView).setAutoSizeTextTypeUniformWithConfiguration(1, i, 1, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m42115(TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return C24053.m53602(textView);
        }
        if (textView instanceof InterfaceC8647) {
            return ((InterfaceC8647) textView).getAutoSizeTextType();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ActionMode.Callback m42117(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof ActionModeCallbackC21069) || callback == null) ? callback : new ActionModeCallbackC21069(callback, textView);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ActionMode.Callback m42116(ActionMode.Callback callback) {
        return (!(callback instanceof ActionModeCallbackC21069) || Build.VERSION.SDK_INT < 26) ? callback : ((ActionModeCallbackC21069) callback).m48137();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m42127(TextView textView, int i) {
        int i2;
        C11293.m28551(i);
        if (Build.VERSION.SDK_INT >= 28) {
            C3915.m12622(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m42125(TextView textView, int i) {
        int i2;
        C11293.m28551(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m42128(TextView textView, int i) {
        C11293.m28551(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42120(TextView textView, int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            C14355.m34781(textView, i, f);
        } else {
            m42128(textView, Math.round(TypedValue.applyDimension(i, f, textView.getResources().getDisplayMetrics())));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3801 m42118(C5752 c5752) {
        TextDirectionHeuristic textDirectionHeuristic;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new C3801(C3915.m12620(c5752));
        }
        C23939 c23939 = new C23939(new TextPaint(c5752.getPaint()));
        if (i >= 23) {
            c23939.m53466(C12118.m30282(c5752));
            c23939.m53468(C12118.m30286(c5752));
        }
        if (c5752.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i >= 28 && (c5752.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(C3915.m12623(C6153.m17751(c5752.getTextLocale()))[0].codePointAt(0));
            if (directionality == 1 || directionality == 2) {
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            }
        } else {
            boolean z = c5752.getLayoutDirection() == 1;
            switch (c5752.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    } else {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    }
                    break;
            }
        }
        c23939.m53467(textDirectionHeuristic);
        return c23939.m53465();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42123(C5752 c5752, C3801 c3801) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristicM12336 = c3801.m12336();
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristicM12336 != textDirectionHeuristic2 && textDirectionHeuristicM12336 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristicM12336 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristicM12336 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristicM12336 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristicM12336 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristicM12336 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristicM12336 == textDirectionHeuristic2) {
                i = 7;
            }
        }
        c5752.setTextDirection(i);
        if (Build.VERSION.SDK_INT < 23) {
            float textScaleX = c3801.m12338().getTextScaleX();
            c5752.getPaint().set(c3801.m12338());
            if (textScaleX == c5752.getTextScaleX()) {
                c5752.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            c5752.setTextScaleX(textScaleX);
            return;
        }
        c5752.getPaint().set(c3801.m12338());
        C12118.m30283(c5752, c3801.m12334());
        C12118.m30287(c5752, c3801.m12337());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42124(C5752 c5752, C14241 c14241) {
        if (Build.VERSION.SDK_INT >= 29) {
            c14241.getClass();
            c5752.setText(C3915.m12621((PrecomputedText) null));
            return;
        }
        C3801 c3801M42118 = m42118(c5752);
        c14241.getClass();
        if (!c3801M42118.m12335(null)) {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
        c5752.setText(c14241);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42121(TextView textView, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 24) {
            C12118.m30284(textView, colorStateList);
        } else if (textView instanceof InterfaceC18831) {
            ((InterfaceC18831) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42122(TextView textView, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 24) {
            C12118.m30285(textView, mode);
        } else if (textView instanceof InterfaceC18831) {
            ((InterfaceC18831) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }
}
