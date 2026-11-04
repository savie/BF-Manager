package l;

import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.۬۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Y55F */
/* JADX INFO: loaded from: classes4.dex */
public final class MenuItemOnMenuItemClickListenerC13845 implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Class[] f43939 = {MenuItem.class};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Method f43940;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f43941;

    public MenuItemOnMenuItemClickListenerC13845(Object obj, String str) {
        this.f43941 = obj;
        Class<?> cls = obj.getClass();
        try {
            this.f43940 = cls.getMethod(str, f43939);
        } catch (Exception e) {
            StringBuilder sbM51387 = C22783.m51387("Couldn't resolve menu item onClick handler ", str, " in class ");
            sbM51387.append(cls.getName());
            InflateException inflateException = new InflateException(sbM51387.toString());
            inflateException.initCause(e);
            throw inflateException;
        }
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.f43940;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f43941;
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
