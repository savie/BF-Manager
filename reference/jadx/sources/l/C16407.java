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

/* JADX INFO: renamed from: l.ܽۙۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5YG */
/* JADX INFO: loaded from: classes4.dex */
public final class C16407 {
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m38617(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ActionMode.Callback m38619(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof ActionModeCallbackC0178) || callback == null) ? callback : new ActionModeCallbackC0178(callback, textView);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ActionMode.Callback m38618(ActionMode.Callback callback) {
        return (!(callback instanceof ActionModeCallbackC0178) || Build.VERSION.SDK_INT < 26) ? callback : ((ActionModeCallbackC0178) callback).m1382();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38621(TextView textView, int i) {
        int i2;
        C9535.m24382(i);
        if (Build.VERSION.SDK_INT >= 28) {
            C15702.m37405(textView, i);
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m38628(TextView textView, int i) {
        int i2;
        C9535.m24382(i);
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

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m38627(TextView textView, int i) {
        C9535.m24382(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38622(TextView textView, int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            C19935.m45233(textView, i, f);
        } else {
            m38627(textView, Math.round(TypedValue.applyDimension(i, f, textView.getResources().getDisplayMetrics())));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10240 m38620(C22357 c22357) {
        TextDirectionHeuristic textDirectionHeuristic;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new C10240(C15702.m37403(c22357));
        }
        C8829 c8829 = new C8829(new TextPaint(c22357.getPaint()));
        if (i >= 23) {
            c8829.m22961(C7234.m19270(c22357));
            c8829.m22963(C7234.m19269(c22357));
        }
        if (c22357.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i >= 28 && (c22357.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(C15702.m37406(C20640.m46508(c22357.getTextLocale()))[0].codePointAt(0));
            if (directionality == 1 || directionality == 2) {
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            }
        } else {
            boolean z = c22357.getLayoutDirection() == 1;
            switch (c22357.getTextDirection()) {
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
        c8829.m22962(textDirectionHeuristic);
        return c8829.m22960();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38626(C22357 c22357, C10240 c10240) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristicM26033 = c10240.m26033();
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristicM26033 != textDirectionHeuristic2 && textDirectionHeuristicM26033 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristicM26033 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristicM26033 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristicM26033 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristicM26033 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristicM26033 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristicM26033 == textDirectionHeuristic2) {
                i = 7;
            }
        }
        c22357.setTextDirection(i);
        if (Build.VERSION.SDK_INT < 23) {
            float textScaleX = c10240.m26030().getTextScaleX();
            c22357.getPaint().set(c10240.m26030());
            if (textScaleX == c22357.getTextScaleX()) {
                c22357.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            c22357.setTextScaleX(textScaleX);
            return;
        }
        c22357.getPaint().set(c10240.m26030());
        C7234.m19271(c22357, c10240.m26031());
        C7234.m19276(c22357, c10240.m26034());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38625(C22357 c22357, C7417 c7417) {
        if (Build.VERSION.SDK_INT >= 29) {
            c7417.getClass();
            c22357.setText(C15702.m37404((PrecomputedText) null));
            return;
        }
        C10240 c10240M38620 = m38620(c22357);
        c7417.getClass();
        if (!c10240M38620.m26032(null)) {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
        c22357.setText(c7417);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38623(TextView textView, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 24) {
            C7234.m19272(textView, colorStateList);
        } else if (textView instanceof InterfaceC5823) {
            ((InterfaceC5823) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38624(TextView textView, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 24) {
            C7234.m19273(textView, mode);
        } else if (textView instanceof InterfaceC5823) {
            ((InterfaceC5823) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }
}
