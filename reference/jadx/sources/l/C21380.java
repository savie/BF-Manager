package l;

import java.util.ArrayList;
import net.sf.sevenzipjbinding.ISequentialInStream;
import net.sf.sevenzipjbinding.impl.OutItem;
import net.sf.sevenzipjbinding.impl.OutItemFactory;

/* JADX INFO: renamed from: l.᩶ܳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes5.dex */
public final class C21380 implements InterfaceC21388 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f68079;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f68080;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18396 f68081;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f68082;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f68083;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13789 f68084;

    @Override // l.InterfaceC21388
    public final /* synthetic */ OutItem getItemInformation(int i, OutItemFactory outItemFactory) {
        return C14674.m35303(this, i, outItemFactory);
    }

    public C21380(C18396 c18396, long j, AbstractC22044 abstractC22044, ArrayList arrayList, String str, C13789 c13789) {
        this.f68081 = c18396;
        this.f68083 = j;
        this.f68079 = abstractC22044;
        this.f68082 = arrayList;
        this.f68080 = str;
        this.f68084 = c13789;
    }

    @Override // l.InterfaceC21388
    /* JADX INFO: renamed from: ۛۙ */
    public final C8919 mo2400() {
        ArrayList arrayList = this.f68082;
        AbstractC22044 abstractC22044 = this.f68079;
        long j = this.f68083;
        if (j != -1) {
            return new C8919(abstractC22044, j, new C14666(arrayList));
        }
        arrayList.add(abstractC22044);
        return new C8919(abstractC22044);
    }

    @Override // l.InterfaceC21388
    /* JADX INFO: renamed from: ܶ */
    public final String mo2401() {
        return this.f68080;
    }

    @Override // l.InterfaceC21388
    /* JADX INFO: renamed from: ᩸ */
    public final C18404 mo2402(int i) {
        return new C18404((C7078) this.f68084.f43741.get(i));
    }

    @Override // l.InterfaceC21388
    public final ISequentialInStream getStream(int i) {
        C7078 c7078 = (C7078) this.f68084.f43741.get(i);
        if (c7078.f23331) {
            return null;
        }
        this.f68081.mo29447(c7078.f23324);
        return new C2953(c7078.f23323);
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        return this.f68081.mo924();
    }

    @Override // l.InterfaceC21388
    /* JADX INFO: renamed from: ۙ */
    public final void mo2399(int i) {
        this.f68081.m45194(i);
    }
}
