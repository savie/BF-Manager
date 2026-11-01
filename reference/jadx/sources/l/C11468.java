package l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ۨۙۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: R52T */
/* JADX INFO: loaded from: classes3.dex */
public final class C11468 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Field f38611;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean f38612;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28656(CompoundButton compoundButton, ColorStateList colorStateList) {
        C4411.m12338(compoundButton, colorStateList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m28653(MaterialRadioButton materialRadioButton) {
        return C4411.m12337(materialRadioButton);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28657(CompoundButton compoundButton, PorterDuff.Mode mode) {
        C4411.m12339(compoundButton, mode);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m28654(MaterialCheckBox materialCheckBox) {
        return C4411.m12340(materialCheckBox);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Drawable m28655(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C13585.m33209(compoundButton);
        }
        if (!f38612) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f38611 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f38612 = true;
        }
        Field field = f38611;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException unused2) {
                f38611 = null;
            }
        }
        return null;
    }
}
