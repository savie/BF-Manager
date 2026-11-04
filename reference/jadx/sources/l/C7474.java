package l;

import java.util.Iterator;
import net.sf.sevenzipjbinding.IInArchive;

/* JADX INFO: renamed from: l.ۜ᩺ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05ZQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C7474 implements InterfaceC13118 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14185 f24735;

    @Override // l.InterfaceC13118
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void mo20515(AbstractC22044 abstractC22044) {
        C14185 c14185 = this.f24735;
        C20766 c20766 = c14185.f44856;
        if (c20766 == null) {
            RunnableC0334.m2054(c14185.f44855, abstractC22044);
        } else {
            c20766.m47475(abstractC22044);
        }
    }

    @Override // l.InterfaceC13118
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void mo20516(IInArchive iInArchive) {
        C14185 c14185 = this.f24735;
        int iM20191 = C1564.m5519(this.f24735.f44857).m20191();
        C14185 c14186 = this.f24735;
        c14185.f44856 = new C20766(iM20191, iInArchive, c14186.f44853, c14186.f44855);
        Iterator itM4942 = C1343.m4942(this.f24735.f44855);
        while (C1826.m6317(itM4942)) {
            this.f24735.f44856.m47475((AbstractC22044) C4238.m13529(itM4942));
        }
        C3448.m11253(this.f24735.f44855);
    }

    public C7474(C14185 c14185) {
        this.f24735 = c14185;
    }

    @Override // l.InterfaceC13118
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo20517() {
        this.f24735.f44854 = true;
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        return this.f24735.f44852.m8779();
    }
}
