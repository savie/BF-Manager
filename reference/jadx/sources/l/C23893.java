package l;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 71DP */
/* JADX INFO: loaded from: classes.dex */
public final class C23893 extends AbstractC22172 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f77404;

    @Override // l.AbstractC22172
    /* JADX INFO: renamed from: ۙ */
    public final void mo6502(float f, View view) {
        Method method;
        if (view instanceof C10884) {
            ((C10884) view).m27289(m49189(f));
            return;
        }
        if (this.f77404) {
            return;
        }
        try {
            method = view.getClass().getMethod("setProgress", Float.TYPE);
        } catch (NoSuchMethodException unused) {
            this.f77404 = true;
            method = null;
        }
        if (method != null) {
            try {
                method.invoke(view, Float.valueOf(m49189(f)));
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
    }
}
