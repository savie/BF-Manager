package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: l.᩹ۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BHP */
/* JADX INFO: loaded from: classes.dex */
public final class C23468 implements InterfaceC13025 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19738 f75925;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC3330 f75927;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20946[] f75929;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashSet f75928 = new HashSet();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashMap f75926 = new HashMap();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C16008 f75930 = new C16008(this);

    public C23468(RunnableC3330 runnableC3330, C19738 c19738) {
        this.f75927 = runnableC3330;
        this.f75925 = c19738;
        this.f75929 = runnableC3330.f10895[c19738.m45472()];
        runnableC3330.f10895[c19738.m45472()] = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52680() {
        RunnableC3330 runnableC3330;
        C19738 c19738 = this.f75925;
        c19738.m45454(this);
        C17500 c17500 = new C17500(this);
        BitSet bitSetM45467 = c19738.m45467();
        int iNextSetBit = bitSetM45467.nextSetBit(0);
        while (true) {
            runnableC3330 = this.f75927;
            if (iNextSetBit < 0) {
                break;
            }
            ((C19738) runnableC3330.f10897.m55749().get(iNextSetBit)).m45453(c17500);
            iNextSetBit = bitSetM45467.nextSetBit(iNextSetBit + 1);
        }
        ArrayList arrayListM45460 = c19738.m45460();
        boolean z = true;
        for (int size = arrayListM45460.size() - 1; size >= 0; size--) {
            AbstractC5568 abstractC5568 = (AbstractC5568) arrayListM45460.get(size);
            AbstractC5568 abstractC5569 = (AbstractC5568) this.f75926.get(abstractC5568);
            if (abstractC5569 != null) {
                arrayListM45460.set(size, abstractC5569);
            } else if (abstractC5568.mo4990() && !this.f75928.contains(abstractC5568)) {
                arrayListM45460.remove(size);
            }
        }
        for (C19738 c19739 : c19738.m45450()) {
            if (c19739 != c19738) {
                C20946[] c20946Arr = this.f75929;
                if (!z) {
                    C20946[] c20946Arr2 = new C20946[c20946Arr.length];
                    System.arraycopy(c20946Arr, 0, c20946Arr2, 0, c20946Arr.length);
                    c20946Arr = c20946Arr2;
                }
                runnableC3330.f10895[c19739.m45472()] = c20946Arr;
                z = false;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m52678(int i, C20946 c20946) {
        int iM47903 = c20946.m47903();
        C3046 c3046M47896 = c20946.m47896();
        C20946[] c20946Arr = this.f75929;
        c20946Arr[i] = c20946;
        int length = c20946Arr.length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            } else if (iM47903 == c20946Arr[length].m47903()) {
                c20946Arr[length] = c20946;
            }
        }
        if (c3046M47896 == null) {
            return;
        }
        RunnableC3330.m10976(this.f75927, c20946);
        int length2 = c20946Arr.length;
        while (true) {
            length2--;
            if (length2 < 0) {
                return;
            }
            C20946 c20947 = c20946Arr[length2];
            if (iM47903 != c20947.m47903() && c3046M47896.equals(c20947.m47896())) {
                c20946Arr[length2] = c20947.m47891((C3046) null);
            }
        }
    }

    @Override // l.InterfaceC13025
    /* JADX INFO: renamed from: ۙ */
    public final void mo6342(C14033 c14033) {
        m52681((AbstractC5568) c14033);
    }

    @Override // l.InterfaceC13025
    /* JADX INFO: renamed from: ۙ */
    public final void mo6341(C1356 c1356) {
        C20946 c20946M16508 = c1356.m16508();
        int iM47903 = c20946M16508.m47903();
        int iM47904 = c1356.mo4992().m31619get(0).m47903();
        c1356.mo4995(this.f75930);
        int iM47905 = c1356.mo4992().m31619get(0).m47903();
        C3046 c3046M47896 = this.f75929[iM47904].m47896();
        C3046 c3046M47897 = c20946M16508.m47896();
        if (c3046M47897 == null) {
            c3046M47897 = c3046M47896;
        }
        RunnableC3330 runnableC3330 = this.f75927;
        C3046 c3046M10979 = RunnableC3330.m10979(runnableC3330, iM47905);
        boolean z = c3046M10979 == null || c3046M47897 == null || c3046M47897.equals(c3046M10979);
        C20946 c20946M47886 = C20946.m47886(iM47905, c20946M16508.getType(), c3046M47897);
        if (!C2847.m9356() || (z && ((c3046M47897 == c3046M47896 || (c3046M47897 != null && c3046M47897.equals(c3046M47896))) && runnableC3330.f10898 == 0))) {
            m52678(iM47903, c20946M47886);
            return;
        }
        if (z && c3046M47896 == null && runnableC3330.f10898 == 0) {
            this.f75926.put(c1356, new C1356(new C23930(C0809.m3253(c20946M47886), C9012.f29360, (C20946) null, C0063.m1033(C20946.m47882(c20946M47886.m47903(), c20946M47886.getType(), c3046M47897))), this.f75925));
            m52678(iM47903, c20946M47886);
        } else {
            m52681((AbstractC5568) c1356);
            this.f75928.add(c1356);
        }
    }

    @Override // l.InterfaceC13025
    /* JADX INFO: renamed from: ᩷ */
    public final void mo6343(C1356 c1356) {
        c1356.mo4995(this.f75930);
        m52681((AbstractC5568) c1356);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52681(AbstractC5568 abstractC5568) {
        C20946 c20946M16508 = abstractC5568.m16508();
        if (c20946M16508 == null) {
            return;
        }
        int iM47903 = c20946M16508.m47903();
        RunnableC3330 runnableC3330 = this.f75927;
        if (RunnableC3330.m10977(runnableC3330, iM47903)) {
            return;
        }
        abstractC5568.m16502(runnableC3330.f10896);
        m52678(iM47903, abstractC5568.m16508());
        runnableC3330.f10896++;
    }
}
