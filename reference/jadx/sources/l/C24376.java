package l;

import android.os.Build;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5JQ */
/* JADX INFO: loaded from: classes.dex */
public final class C24376 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Method f79089;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Method f79090;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Method f79091;

    public C24376() {
        this.f79091 = null;
        this.f79089 = null;
        this.f79090 = null;
        m54493();
        try {
            Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
            this.f79091 = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        try {
            Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
            this.f79089 = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
            this.f79090 = method;
            method.setAccessible(true);
        } catch (NoSuchMethodException unused3) {
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m54496(AutoCompleteTextView autoCompleteTextView) {
        m54493();
        Method method = this.f79091;
        if (method != null) {
            try {
                method.invoke(autoCompleteTextView, null);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54494(AutoCompleteTextView autoCompleteTextView) {
        m54493();
        Method method = this.f79089;
        if (method != null) {
            try {
                method.invoke(autoCompleteTextView, null);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54495(C18408 c18408) {
        m54493();
        Method method = this.f79090;
        if (method != null) {
            try {
                method.invoke(c18408, Boolean.TRUE);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m54493() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
