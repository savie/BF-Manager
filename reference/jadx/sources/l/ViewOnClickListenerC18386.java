package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5UK */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC18386 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Method f59899;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final View f59900;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Context f59901;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f59902;

    public ViewOnClickListenerC18386(View view, String str) {
        this.f59900 = view;
        this.f59902 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f59899 != null) {
            break;
        }
        View view2 = this.f59900;
        Context context = view2.getContext();
        while (true) {
            String str2 = this.f59902;
            if (context == null) {
                int id = view2.getId();
                if (id == -1) {
                    str = "";
                } else {
                    str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                }
                StringBuilder sbM51387 = C22783.m51387("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                sbM51387.append(view2.getClass());
                sbM51387.append(str);
                throw new IllegalStateException(sbM51387.toString());
            }
            try {
                if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                    this.f59899 = method;
                    this.f59901 = context;
                    break;
                }
            } catch (NoSuchMethodException unused) {
            }
            context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
        }
        try {
            this.f59899.invoke(this.f59901, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}
