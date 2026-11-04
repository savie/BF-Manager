package l;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;

/* JADX INFO: renamed from: l.ᩳ۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 66IP */
/* JADX INFO: loaded from: classes4.dex */
public final class C19105 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ScriptHandlerBoundaryInterface f61836;

    public C19105(ScriptHandlerBoundaryInterface scriptHandlerBoundaryInterface) {
        this.f61836 = scriptHandlerBoundaryInterface;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44225() {
        this.f61836.remove();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19105 m44224(InvocationHandler invocationHandler) {
        return new C19105((ScriptHandlerBoundaryInterface) C8372.m22531(ScriptHandlerBoundaryInterface.class, invocationHandler));
    }
}
