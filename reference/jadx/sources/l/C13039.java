package l;

import java.util.ArrayList;
import java.util.List;
import net.sf.sevenzipjbinding.IInArchive;

/* JADX INFO: renamed from: l.۬ۢ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: A1YB */
/* JADX INFO: loaded from: classes4.dex */
public final class C13039 implements InterfaceC3600 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f43477;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f43478;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15156 f43479;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f43480;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f43481;

    public C13039(C15156 c15156, ArrayList arrayList, AbstractC20745 abstractC20745, int i, AbstractC20745 abstractC20746) {
        this.f43479 = c15156;
        this.f43478 = arrayList;
        this.f43481 = abstractC20745;
        this.f43480 = i;
        this.f43477 = abstractC20746;
    }

    @Override // l.InterfaceC3600
    /* JADX INFO: renamed from: ۙ */
    public final void mo10686(AbstractC20745 abstractC20745) {
        this.f43479.f49509.m28646(abstractC20745);
        List list = this.f43478;
        if (list != null) {
            list.add(new C22917(abstractC20745));
        }
    }

    @Override // l.InterfaceC3600
    /* JADX INFO: renamed from: ۙ */
    public final void mo10687(IInArchive iInArchive) {
        C15156 c15156 = this.f43479;
        AbstractC20745 abstractC20745 = this.f43481;
        try {
            int numberOfItems = iInArchive.getNumberOfItems();
            String[] strArr = new String[numberOfItems];
            C6688[] c6688Arr = new C6688[numberOfItems];
            int i = C15156.f49500;
            String strMo33986 = abstractC20745.mo33986();
            boolean z = (C5553.m15304(strMo33986) || C5553.m15329(strMo33986)) ? false : true;
            for (int i2 = 0; i2 < numberOfItems; i2++) {
                C18334 c18334M42567 = C18334.m42567(iInArchive, i2);
                boolean z2 = z && c18334M42567.m42569() != null;
                String strM15307 = C5553.m15307(c18334M42567.m42573(), z2 ? false : c18334M42567.m42574());
                strArr[i2] = strM15307;
                if (z2) {
                    c6688Arr[i2] = new C6688(strM15307, C5553.m15324(strM15307, c18334M42567.m42569()), c18334M42567.m42574());
                }
            }
            c15156.m36327(abstractC20745);
            C15156.m36325(c15156, abstractC20745, this.f43480, iInArchive, this.f43477, strArr, c6688Arr);
        } finally {
            C19431.m44468(iInArchive);
        }
    }

    @Override // l.InterfaceC3600
    /* JADX INFO: renamed from: ۨ */
    public final void mo10688() {
        this.f43479.cancel();
    }

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2357() {
        return this.f43479.mo2357();
    }
}
