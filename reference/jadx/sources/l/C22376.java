package l;

import java.util.Iterator;
import net.sf.sevenzipjbinding.IInArchive;

/* JADX INFO: renamed from: l.᩹ܶ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 05ZQ */
/* JADX INFO: loaded from: classes.dex */
public final class C22376 implements InterfaceC3600 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1208 f73062;

    @Override // l.InterfaceC3600
    /* JADX INFO: renamed from: ۙ */
    public final synchronized void mo10686(AbstractC20745 abstractC20745) {
        C1208 c1208 = this.f73062;
        C9221 c9221 = c1208.f5326;
        if (c9221 == null) {
            C2249.m6905(c1208.f5327, abstractC20745);
        } else {
            c9221.m23738(abstractC20745);
        }
    }

    @Override // l.InterfaceC3600
    /* JADX INFO: renamed from: ۙ */
    public final synchronized void mo10687(IInArchive iInArchive) {
        C1208 c1208 = this.f73062;
        int iM28617 = C1937.m6289(this.f73062.f5328).m28617();
        C1208 c1209 = this.f73062;
        c1208.f5326 = new C9221(iM28617, iInArchive, c1209.f5324, c1209.f5327);
        Iterator itM10563 = C3577.m10563(this.f73062.f5327);
        while (RunnableC1564.m5348(itM10563)) {
            this.f73062.f5326.m23738((AbstractC20745) C0216.m1584(itM10563));
        }
        C1461.m5085(this.f73062.f5327);
    }

    public C22376(C1208 c1208) {
        this.f73062 = c1208;
    }

    @Override // l.InterfaceC3600
    /* JADX INFO: renamed from: ۨ */
    public final void mo10688() {
        this.f73062.f5322 = true;
    }

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2357() {
        return this.f73062.f5325.m33367();
    }
}
