package l;

import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y55F */
/* JADX INFO: loaded from: classes2.dex */
public final class MenuItemOnMenuItemClickListenerC1482 implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final Class[] f6014 = {MenuItem.class};

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Method f6015;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f6016;

    public MenuItemOnMenuItemClickListenerC1482(Object obj, String str) {
        this.f6016 = obj;
        Class<?> cls = obj.getClass();
        try {
            this.f6015 = cls.getMethod(str, f6014);
        } catch (Exception e) {
            StringBuilder sbM30914 = C12441.m30914("Couldn't resolve menu item onClick handler ", str, " in class ");
            sbM30914.append(cls.getName());
            InflateException inflateException = new InflateException(sbM30914.toString());
            inflateException.initCause(e);
            throw inflateException;
        }
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.f6015;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f6016;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
