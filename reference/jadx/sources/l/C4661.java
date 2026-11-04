package l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ۙۙۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: R52T */
/* JADX INFO: loaded from: classes2.dex */
public final class C4661 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Field f16460;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean f16461;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14519(CompoundButton compoundButton, ColorStateList colorStateList) {
        C7156.m19731(compoundButton, colorStateList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m14516(MaterialRadioButton materialRadioButton) {
        return C7156.m19730(materialRadioButton);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14520(CompoundButton compoundButton, PorterDuff.Mode mode) {
        C7156.m19732(compoundButton, mode);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m14517(MaterialCheckBox materialCheckBox) {
        return C7156.m19733(materialCheckBox);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Drawable m14518(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C13867.m33809(compoundButton);
        }
        if (!f16461) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f16460 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f16461 = true;
        }
        Field field = f16460;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException unused2) {
                f16460 = null;
            }
        }
        return null;
    }
}
