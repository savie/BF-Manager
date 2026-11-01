package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֫᩷ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public class C2071 extends AbstractC6160 {
    @Override // l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1767(Object obj, AbstractC16579 abstractC16579) {
        return Integer.valueOf(abstractC16579.mo1933().ordinal());
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C0309 c0309, Object obj) {
        int iHashCode = c0309.f53222.mo50003().hashCode() + (((Integer) c0309.mo1934().mo1928(this, (Object) null)).intValue() * 127);
        Iterator it = c0309.mo1938().iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 127) + ((Integer) ((AbstractC16579) it.next()).mo1928(this, (Object) null)).intValue();
        }
        return Integer.valueOf(iHashCode);
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4811(C0350 c0350, Object obj) {
        int iHashCode = c0350.f1776.hashCode();
        AbstractC16579 abstractC16579 = c0350.f1774;
        if (abstractC16579 != null) {
            iHashCode = (iHashCode * 127) + ((Integer) abstractC16579.mo1928(this, (Object) null)).intValue();
        }
        return Integer.valueOf(iHashCode);
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo4812(C5954 c5954, Object obj) {
        return 0;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo6580(C8777 c8777, Object obj) {
        return Integer.valueOf(((Integer) c8777.f30194.mo1928(this, (Object) null)).intValue() + 12);
    }

    @Override // l.AbstractC18154, l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4813(C10229 c10229, Object obj) {
        return Integer.valueOf(System.identityHashCode(c10229));
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo6581(C13757 c13757, Object obj) {
        int iOrdinal = EnumC6617.METHOD.ordinal();
        for (C21825 c21825 = c13757.f45367; c21825.f70877 != null; c21825 = c21825.f70877) {
            iOrdinal = (iOrdinal << 5) + ((Integer) ((AbstractC16579) c21825.f70876).mo1928(this, (Object) null)).intValue();
        }
        return Integer.valueOf(((Integer) c13757.f45368.mo1928(this, (Object) null)).intValue() + (iOrdinal << 5));
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public /* bridge */ /* synthetic */ Object mo1769(C22929 c22929, Object obj) {
        return mo6579(c22929);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Integer mo6579(C22929 c22929) {
        return Integer.valueOf(System.identityHashCode(c22929));
    }
}
