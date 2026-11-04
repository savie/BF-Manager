package org.lsposed.lsplant;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import l.InterfaceC23439;

/* JADX INFO: loaded from: classes2.dex */
public class Hooker {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static Method f82014;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Method f82015;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC23439 f82016;

    private native boolean check();

    private native Method doHook(Member member, Method method);

    private native boolean doUnhook(Member member);

    static {
        try {
            System.loadLibrary("hook");
            f82014 = Hooker.class.getDeclaredMethod("ۙ", Object[].class);
        } catch (Throwable unused) {
            f82014 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object m56794(Object[] objArr) {
        return this.f82016.mo11559(this.f82015, objArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m56793(Method method, InterfaceC23439 interfaceC23439) {
        Method methodDoHook;
        Method method2 = f82014;
        if (method2 == null) {
            return;
        }
        Hooker hooker = new Hooker();
        if (hooker.check() && (methodDoHook = hooker.doHook(method, method2)) != null) {
            hooker.f82015 = methodDoHook;
            hooker.f82016 = interfaceC23439;
        }
    }
}
