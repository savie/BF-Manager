package l;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۤۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71DP */
/* JADX INFO: loaded from: classes4.dex */
public final class C10840 extends AbstractC17553 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f34328;

    @Override // l.AbstractC17553
    /* JADX INFO: renamed from: ۙ */
    public final void mo6509(float f, View view) {
        Method method;
        if (view instanceof C21855) {
            ((C21855) view).m49554(m41207(f));
            return;
        }
        if (this.f34328) {
            return;
        }
        try {
            method = view.getClass().getMethod("setProgress", Float.TYPE);
        } catch (NoSuchMethodException unused) {
            this.f34328 = true;
            method = null;
        }
        if (method != null) {
            try {
                method.invoke(view, Float.valueOf(m41207(f)));
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
    }
}
