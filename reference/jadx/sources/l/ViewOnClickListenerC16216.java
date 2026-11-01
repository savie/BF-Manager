package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ܺ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: I5UK */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC16216 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Context f52331;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final View f52332;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Method f52333;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f52334;

    public ViewOnClickListenerC16216(View view, String str) {
        this.f52332 = view;
        this.f52334 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f52333 != null) {
            break;
        }
        View view2 = this.f52332;
        Context context = view2.getContext();
        while (true) {
            String str2 = this.f52334;
            if (context == null) {
                int id = view2.getId();
                if (id == -1) {
                    str = "";
                } else {
                    str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                }
                StringBuilder sbM30914 = C12441.m30914("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                sbM30914.append(view2.getClass());
                sbM30914.append(str);
                throw new IllegalStateException(sbM30914.toString());
            }
            try {
                if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                    this.f52333 = method;
                    this.f52331 = context;
                    break;
                }
            } catch (NoSuchMethodException unused) {
            }
            context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
        }
        try {
            this.f52333.invoke(this.f52331, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}
