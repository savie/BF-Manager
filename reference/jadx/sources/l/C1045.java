package l;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.֨ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1CY */
/* JADX INFO: loaded from: classes2.dex */
public final class C1045 extends AbstractC8102 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f4847;

    @Override // l.AbstractC8102
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3906(float f, View view) {
        Method method;
        if (view instanceof C10884) {
            ((C10884) view).m27289(m21316(f));
            return;
        }
        if (this.f4847) {
            return;
        }
        try {
            method = view.getClass().getMethod("setProgress", Float.TYPE);
        } catch (NoSuchMethodException unused) {
            this.f4847 = true;
            method = null;
        }
        if (method != null) {
            try {
                method.invoke(view, Float.valueOf(m21316(f)));
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
    }
}
