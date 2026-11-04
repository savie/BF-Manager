package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۜ۠ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: HIWU */
/* JADX INFO: loaded from: classes3.dex */
public final class C7005 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19327(final InterfaceC13673 interfaceC13673, C24927 c24927) {
        try {
            if (interfaceC13673.mo22644(c24927)) {
                C4937.forEach(c24927.m55534(), new Consumer() { // from class: l.۠۠ۗ
                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return C12312.$default$andThen(this, consumer);
                    }

                    @Override // java.util.function.Consumer
                    /* JADX INFO: renamed from: accept */
                    public final void n(Object obj) {
                        C7005.m19327(interfaceC13673, (C24927) obj);
                    }
                });
                C4937.forEach(c24927.getMethods(), new C15713(2, interfaceC13673));
            }
        } catch (BootstrapMethodError | Exception | StackOverflowError e) {
            String str = e.getClass().getSimpleName() + " in pass: " + interfaceC13673.getClass().getSimpleName();
            c24927.getClass();
            C23977.m53506(c24927, str, e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19326(InterfaceC13673 interfaceC13673, C2551 c2551) {
        try {
            if (c2551.mo17867(C11457.f36007)) {
                return;
            }
            interfaceC13673.mo1737(c2551);
        } catch (BootstrapMethodError | Exception | StackOverflowError e) {
            String str = e.getClass().getSimpleName() + " in pass: " + interfaceC13673.getClass().getSimpleName();
            c2551.getClass();
            C23977.m53506(c2551, str, e);
        }
    }
}
