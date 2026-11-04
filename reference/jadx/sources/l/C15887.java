package l;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ܶۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1CY */
/* JADX INFO: loaded from: classes5.dex */
public final class C15887 extends AbstractC21109 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f51650;

    @Override // l.AbstractC21109
    /* JADX INFO: renamed from: ۙ */
    public final void mo6085(float f, View view) {
        Method method;
        if (view instanceof C21855) {
            ((C21855) view).m49554(m48193(f));
            return;
        }
        if (this.f51650) {
            return;
        }
        try {
            method = view.getClass().getMethod("setProgress", Float.TYPE);
        } catch (NoSuchMethodException unused) {
            this.f51650 = true;
            method = null;
        }
        if (method != null) {
            try {
                method.invoke(view, Float.valueOf(m48193(f)));
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
    }
}
