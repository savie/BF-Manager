package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙۛ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: W79N */
/* JADX INFO: loaded from: classes3.dex */
public final class C4711 implements InterfaceC15897 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13833 f16616;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C23357 f16617 = new C23357();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C11422 f16618;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m14598(int i, String str) {
        if (this.f16618.m28777()) {
            return;
        }
        Iterator it = this.f16617.m52522(i, str).iterator();
        while (it.hasNext()) {
            C13833.m33775(this.f16616, this.f16618, (String) it.next());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m14599(String str, String str2) {
        if (this.f16618.m28777()) {
            return;
        }
        Iterator it = this.f16617.m52523(str, str2).iterator();
        while (it.hasNext()) {
            C13833.m33775(this.f16616, this.f16618, (String) it.next());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m14600(String str, String str2, String str3, C10676 c10676) {
        if (this.f16618.m28777()) {
            return;
        }
        for (String str4 : this.f16617.m52524(str, str2, c10676)) {
            if (!str4.equals(str)) {
                C13833.m33775(this.f16616, this.f16618, str4);
            }
        }
        C13833.m33776(this.f16616, this.f16618, str, c10676);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m14601(String str, String str2, String str3, C10676 c10676) {
        if (!this.f16618.m28777() && this.f16617.m52525(str, str2, c10676)) {
            C13833.m33776(this.f16616, this.f16618, str, c10676);
        }
    }

    public C4711(C13833 c13833, C11422 c11422) {
        this.f16616 = c13833;
        this.f16618 = c11422;
    }
}
