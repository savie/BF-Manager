package l;

import android.os.Build;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩵ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5JQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C19618 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Method f62977;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Method f62978;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Method f62979;

    public C19618() {
        this.f62979 = null;
        this.f62977 = null;
        this.f62978 = null;
        m44711();
        try {
            Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
            this.f62979 = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        try {
            Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
            this.f62977 = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
            this.f62978 = method;
            method.setAccessible(true);
        } catch (NoSuchMethodException unused3) {
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m44714(AutoCompleteTextView autoCompleteTextView) {
        m44711();
        Method method = this.f62979;
        if (method != null) {
            try {
                method.invoke(autoCompleteTextView, null);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44712(AutoCompleteTextView autoCompleteTextView) {
        m44711();
        Method method = this.f62977;
        if (method != null) {
            try {
                method.invoke(autoCompleteTextView, null);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44713(C21028 c21028) {
        m44711();
        Method method = this.f62978;
        if (method != null) {
            try {
                method.invoke(c21028, Boolean.TRUE);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44711() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
