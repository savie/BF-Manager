package l;

import java.util.UUID;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܿۨ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18317 implements Consumer {
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        int i;
        int i2;
        AbstractC22044 abstractC22044 = (AbstractC22044) obj;
        int i3 = ActivityC18143.f59323;
        String name = abstractC22044.getName();
        if (name.endsWith(".e2")) {
            return;
        }
        int iIndexOf = name.indexOf(".e2-");
        if (iIndexOf < 0) {
            abstractC22044.mo4296();
            return;
        }
        int i4 = iIndexOf + 3;
        int i5 = i4;
        while (true) {
            int i6 = 0;
            if (i5 >= name.length()) {
                InterfaceC24329 interfaceC24329Of = C6429.of(abstractC22044.mo4294(), new String[0]);
                C8950 c8950M23921 = C8950.m23921("abandoned_directory_cleanup", interfaceC24329Of.resolveSibling(name.substring(0, i4)));
                c8950M23921.m23934().m52948(new RunnableC24614(i6, interfaceC24329Of), C5261.f18538).m52931((InterfaceC2017) new C4476(c8950M23921));
                return;
            }
            if (name.startsWith("-new-", i5)) {
                i6 = 5;
            } else if (name.startsWith("-deleted-", i5)) {
                i6 = 9;
            }
            if (i6 == 0 || (i2 = (i = i5 + i6) + 36) > name.length()) {
                return;
            }
            String strSubstring = name.substring(i, i2);
            try {
                if (!UUID.fromString(strSubstring).toString().equals(strSubstring)) {
                    return;
                } else {
                    i5 += i6 + 36;
                }
            } catch (IllegalArgumentException unused) {
                return;
            }
        }
    }
}
