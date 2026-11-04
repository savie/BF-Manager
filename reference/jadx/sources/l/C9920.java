package l;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۢۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1D4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9920 extends AbstractC11191 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f31851;

    @Override // l.AbstractC11191
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo1701(float f, long j, View view, C10335 c10335) {
        Method method;
        if (view instanceof C21855) {
            ((C21855) view).m49554(m28197(f, j, view, c10335));
        } else {
            if (this.f31851) {
                return false;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f31851 = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(m28197(f, j, view, c10335)));
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            }
        }
        return this.f35301;
    }
}
