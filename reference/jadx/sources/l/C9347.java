package l;

import android.os.Parcelable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۢۘ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 046D */
/* JADX INFO: loaded from: classes.dex */
public final class C9347 implements InvocationHandler {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Parcelable.Creator f31695;

    static {
        ApplicationC6132.m17119(IShizukuService.Stub.TRANSACTION_dispatchPackageChanged);
    }

    @Override // java.lang.reflect.InvocationHandler
    public native Object invoke(Object obj, Method method, Object[] objArr);

    public C9347(Parcelable.Creator creator) {
        this.f31695 = creator;
    }
}
