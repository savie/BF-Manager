package l;

import java.util.ArrayList;
import java.util.List;
import net.sf.sevenzipjbinding.IInArchive;

/* JADX INFO: renamed from: l.۫ۚ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: A1YB */
/* JADX INFO: loaded from: classes4.dex */
public final class C12892 implements InterfaceC13118 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f41238;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f41239;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24827 f41240;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f41241;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f41242;

    public C12892(C24827 c24827, ArrayList arrayList, AbstractC22044 abstractC22044, int i, AbstractC22044 abstractC22045) {
        this.f41240 = c24827;
        this.f41239 = arrayList;
        this.f41242 = abstractC22044;
        this.f41238 = i;
        this.f41241 = abstractC22045;
    }

    @Override // l.InterfaceC13118
    /* JADX INFO: renamed from: ۙ */
    public final void mo20515(AbstractC22044 abstractC22044) {
        this.f41240.f80312.m51338(abstractC22044);
        List list = this.f41239;
        if (list != null) {
            list.add(new C11400(abstractC22044));
        }
    }

    @Override // l.InterfaceC13118
    /* JADX INFO: renamed from: ۙ */
    public final void mo20516(IInArchive iInArchive) {
        C24827 c24827 = this.f41240;
        AbstractC22044 abstractC22044 = this.f41242;
        try {
            int numberOfItems = iInArchive.getNumberOfItems();
            String[] strArr = new String[numberOfItems];
            C1706[] c1706Arr = new C1706[numberOfItems];
            int i = C24827.f80304;
            String strMo4294 = abstractC22044.mo4294();
            boolean z = (C14584.m35214(strMo4294) || C14584.m35210(strMo4294)) ? false : true;
            for (int i2 = 0; i2 < numberOfItems; i2++) {
                C1997 c1997M6830 = C1997.m6830(iInArchive, i2);
                boolean z2 = z && c1997M6830.m6843() != null;
                String strM35187 = C14584.m35187(c1997M6830.m6840(), z2 ? false : c1997M6830.m6837());
                strArr[i2] = strM35187;
                if (z2) {
                    c1706Arr[i2] = new C1706(strM35187, C14584.m35202(strM35187, c1997M6830.m6843()), c1997M6830.m6837());
                }
            }
            c24827.m55342(abstractC22044);
            C24827.m55341(c24827, abstractC22044, this.f41238, iInArchive, this.f41241, strArr, c1706Arr);
        } finally {
            C20244.m46520(iInArchive);
        }
    }

    @Override // l.InterfaceC13118
    /* JADX INFO: renamed from: ᩷ */
    public final void mo20517() {
        this.f41240.cancel();
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        return this.f41240.mo924();
    }
}
