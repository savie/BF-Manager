package l;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩷ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1D4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20802 extends AbstractC23625 {

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f67629;

    @Override // l.AbstractC23625
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo2000(float f, long j, View view, C21070 c21070) {
        Method method;
        if (view instanceof C10884) {
            ((C10884) view).m27289(m52090(f, j, view, c21070));
        } else {
            if (this.f67629) {
                return false;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f67629 = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(m52090(f, j, view, c21070)));
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            }
        }
        return this.f76537;
    }
}
