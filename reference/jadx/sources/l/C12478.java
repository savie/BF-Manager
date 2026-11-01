package l;

import java.util.ArrayList;
import net.sf.sevenzipjbinding.ISequentialInStream;
import net.sf.sevenzipjbinding.impl.OutItem;
import net.sf.sevenzipjbinding.impl.OutItemFactory;

/* JADX INFO: renamed from: l.۫ܳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C12478 implements InterfaceC16923 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f41592;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f41593;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17416 f41594;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f41595;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f41596;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4612 f41597;

    @Override // l.InterfaceC16923
    public final /* synthetic */ OutItem getItemInformation(int i, OutItemFactory outItemFactory) {
        return C0694.m3081(this, i, outItemFactory);
    }

    public C12478(C17416 c17416, long j, AbstractC20745 abstractC20745, ArrayList arrayList, String str, C4612 c4612) {
        this.f41594 = c17416;
        this.f41596 = j;
        this.f41595 = abstractC20745;
        this.f41592 = arrayList;
        this.f41593 = str;
        this.f41597 = c4612;
    }

    @Override // l.InterfaceC16923
    /* JADX INFO: renamed from: ۤۙ */
    public final C7861 mo17107() {
        ArrayList arrayList = this.f41592;
        AbstractC20745 abstractC20745 = this.f41595;
        long j = this.f41596;
        if (j != -1) {
            return new C7861(abstractC20745, j, new C16711(arrayList));
        }
        arrayList.add(abstractC20745);
        return new C7861(abstractC20745);
    }

    @Override // l.InterfaceC16923
    /* JADX INFO: renamed from: ᩳ */
    public final String mo17108() {
        return this.f41593;
    }

    @Override // l.InterfaceC16923
    /* JADX INFO: renamed from: ۖ */
    public final C12690 mo17105(int i) {
        return new C12690((C3056) this.f41597.f16331.get(i));
    }

    @Override // l.InterfaceC16923
    public final ISequentialInStream getStream(int i) {
        C3056 c3056 = (C3056) this.f41597.f16331.get(i);
        if (c3056.f11515) {
            return null;
        }
        this.f41594.mo41554(c3056.f11521);
        return new C17738(c3056.f11517);
    }

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2357() {
        return this.f41594.mo2357();
    }

    @Override // l.InterfaceC16923
    /* JADX INFO: renamed from: ۙ */
    public final void mo17106(int i) {
        this.f41594.m46157(i);
    }
}
