package l;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.᩸ۙۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: W73L */
/* JADX INFO: loaded from: classes4.dex */
public final class C21352 {
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static InterfaceC17824 m47879() {
        return C15003.f48930;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C7947 m47881() {
        return C22764.f74142;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC17824 m47880() {
        try {
            return new C18530((WebViewProviderFactoryBoundaryInterface) C15423.m36894(WebViewProviderFactoryBoundaryInterface.class, m47882()));
        } catch (ClassNotFoundException unused) {
            return new C4418();
        } catch (IllegalAccessException e) {
            e = e;
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InvocationHandler m47882() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = C1556.m5334();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }
}
