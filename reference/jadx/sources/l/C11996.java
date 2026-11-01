package l;

import java.security.spec.AlgorithmParameterSpec;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.ۨ᩹ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 763M */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11996 implements InterfaceC7359, InterfaceC11955, InterfaceC1008 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m29881(String str, AlgorithmParameterSpec algorithmParameterSpec) {
        return str + algorithmParameterSpec;
    }

    @Override // l.InterfaceC1008
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    @Override // l.InterfaceC11955
    public Object apply(Object obj) {
        return ((InterfaceC10045) obj).mo2755().getClass().getSimpleName();
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        ((InterfaceC10430) obj).getClass();
    }
}
