package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import net.sf.sevenzipjbinding.ISequentialInStream;
import net.sf.sevenzipjbinding.impl.OutItem;
import net.sf.sevenzipjbinding.impl.OutItemFactory;

/* JADX INFO: renamed from: l.ۛܳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C6127 implements InterfaceC16923 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f20911;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f20912;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11067 f20913;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f20914;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f20915;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4612 f20916;

    @Override // l.InterfaceC16923
    public final /* synthetic */ OutItem getItemInformation(int i, OutItemFactory outItemFactory) {
        return C0694.m3081(this, i, outItemFactory);
    }

    public C6127(C11067 c11067, long j, AbstractC20745 abstractC20745, ArrayList arrayList, String str, C4612 c4612) {
        this.f20913 = c11067;
        this.f20914 = j;
        this.f20915 = abstractC20745;
        this.f20912 = arrayList;
        this.f20911 = str;
        this.f20916 = c4612;
    }

    @Override // l.InterfaceC16923
    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final C7861 mo17107() {
        ArrayList arrayList = this.f20912;
        AbstractC20745 abstractC20745 = this.f20915;
        long j = this.f20914;
        if (j != -1) {
            return new C7861(abstractC20745, j, new C16711(arrayList));
        }
        arrayList.add(abstractC20745);
        return new C7861(abstractC20745);
    }

    @Override // l.InterfaceC16923
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String mo17108() {
        return this.f20911;
    }

    @Override // l.InterfaceC16923
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C12690 mo17105(int i) {
        return new C12690((C3056) this.f20916.f16331.get(i));
    }

    @Override // l.InterfaceC16923
    public final ISequentialInStream getStream(int i) {
        C3056 c3056 = (C3056) this.f20916.f16331.get(i);
        if (c3056.f11515) {
            return null;
        }
        C11067 c11067 = this.f20913;
        c11067.m41591(R.string.MT_Protector);
        c11067.mo41554(c3056.f11521);
        return new C17738(c3056.f11517);
    }

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2357() {
        return this.f20913.mo2357();
    }

    @Override // l.InterfaceC16923
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17106(int i) {
        this.f20913.mo21455(i);
    }
}
