package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import net.sf.sevenzipjbinding.ISequentialInStream;
import net.sf.sevenzipjbinding.impl.OutItem;
import net.sf.sevenzipjbinding.impl.OutItemFactory;

/* JADX INFO: renamed from: l.֡ܳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C0497 implements InterfaceC21388 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f2148;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f2149;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7955 f2150;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f2151;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f2152;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13789 f2153;

    @Override // l.InterfaceC21388
    public final /* synthetic */ OutItem getItemInformation(int i, OutItemFactory outItemFactory) {
        return C14674.m35303(this, i, outItemFactory);
    }

    public C0497(C7955 c7955, long j, AbstractC22044 abstractC22044, ArrayList arrayList, String str, C13789 c13789) {
        this.f2150 = c7955;
        this.f2148 = j;
        this.f2152 = abstractC22044;
        this.f2149 = arrayList;
        this.f2151 = str;
        this.f2153 = c13789;
    }

    @Override // l.InterfaceC21388
    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final C8919 mo2400() {
        ArrayList arrayList = this.f2149;
        AbstractC22044 abstractC22044 = this.f2152;
        long j = this.f2148;
        if (j != -1) {
            return new C8919(abstractC22044, j, new C14666(arrayList));
        }
        arrayList.add(abstractC22044);
        return new C8919(abstractC22044);
    }

    @Override // l.InterfaceC21388
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String mo2401() {
        return this.f2151;
    }

    @Override // l.InterfaceC21388
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C18404 mo2402(int i) {
        return new C18404((C7078) this.f2153.f43741.get(i));
    }

    @Override // l.InterfaceC21388
    public final ISequentialInStream getStream(int i) {
        C7078 c7078 = (C7078) this.f2153.f43741.get(i);
        if (c7078.f23331) {
            return null;
        }
        C7955 c7955 = this.f2150;
        c7955.m43868(R.string.MT_Protector);
        c7955.mo29447(c7078.f23324);
        return new C2953(c7078.f23323);
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        return this.f2150.mo924();
    }

    @Override // l.InterfaceC21388
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2399(int i) {
        this.f2150.mo16839(i);
    }
}
