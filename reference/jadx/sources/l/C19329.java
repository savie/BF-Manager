package l;

import android.os.Parcelable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ᩳ᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 046D */
/* JADX INFO: loaded from: classes.dex */
public final class C19329 implements InvocationHandler {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Parcelable.Creator f62443;

    static {
        ApplicationC23172.m52091(139);
    }

    @Override // java.lang.reflect.InvocationHandler
    public native Object invoke(Object obj, Method method, Object[] objArr);

    public C19329(Parcelable.Creator creator) {
        this.f62443 = creator;
    }
}
