package l;

import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۖ۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: R537 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2549 extends AbstractC7179 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f10089;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C6783 f10090;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public List f10091;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayList f10092;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public List f10093;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f10094;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ArrayList f10095;

    public C2549(C1493 c1493, C23718 c23718) throws IOException {
        ArrayList arrayList;
        super(c1493);
        this.f10092 = new ArrayList();
        this.f10094 = new ArrayList();
        this.f10095 = new ArrayList();
        this.f10089 = new ArrayList();
        int iM52234 = c23718.m52234();
        C4356 c4356M12196 = C4356.m12196(c23718);
        c4356M12196.m12198(512);
        this.f23974 = c23718.m52225();
        this.f23976 = c23718.m52235(128);
        int iM52225 = c23718.m52225();
        c23718.m52233();
        int iM52226 = c23718.m52225();
        c23718.m52233();
        int iM52227 = c4356M12196.f15587 >= 288 ? c23718.m52225() : 0;
        c23718.m52232(iM52225 + iM52234);
        C6783 c6783 = new C6783(c23718);
        c23718.m52232(iM52226 + iM52234);
        C6783 c6784 = new C6783(c23718);
        this.f10090 = c6784;
        this.f10093 = new C13840(c6783);
        this.f10091 = new C11723(c6784);
        C4356 c4356M12197 = C4356.m12196(c23718);
        int i = iM52234 + c4356M12196.f15585;
        SparseArray sparseArray = new SparseArray();
        while (true) {
            short s = c4356M12197.f15584;
            if (s == 515) {
                int iM52228 = c23718.m52225();
                ArrayList arrayList2 = this.f10092;
                arrayList2.ensureCapacity(iM52228);
                for (int i2 = 0; i2 < iM52228; i2++) {
                    arrayList2.add(new C9256(c23718));
                }
            } else if (s == 516) {
                C2904 c2904 = new C2904(c23718);
                this.f10094.add(c2904);
                int iM52235 = c23718.m52234();
                C4356 c4356M12198 = C4356.m12196(c23718);
                while (true) {
                    short s2 = c4356M12198.f15584;
                    arrayList = c2904.f10946;
                    if (s2 != 517) {
                        break;
                    }
                    int iM52229 = c23718.m52225();
                    int iM522210 = c23718.m52225();
                    C15070 c15070 = new C15070(iM522210);
                    for (int i3 = 0; i3 < iM522210; i3++) {
                        c15070.add(c23718.m52225());
                    }
                    arrayList.add(new C4666(iM52229, c15070));
                    iM52235 = c23718.m52234();
                    c4356M12198 = C4356.m12196(c23718);
                }
                arrayList.trimToSize();
                c23718.m52232(iM52235);
            } else if (s == 518) {
                this.f10095.add(new C5372(c23718));
            } else if (s == 514) {
                C1138 c1138 = new C1138(this, c23718, c4356M12197);
                this.f10089.add(c1138);
                sparseArray.put(c1138.mo26942(), c1138);
            } else {
                if (s != 513) {
                    if (s != -1 && s != 512) {
                        System.err.printf("Skip arsc chunk: %04x\n", Short.valueOf(s));
                    }
                    c23718.m52232(i);
                    return;
                }
                int iM52236 = c23718.m52236() - iM52227;
                C1138 c1139 = (C1138) sparseArray.get(iM52236);
                if (c1139 == null) {
                    throw new IOException(C8479.m22141(iM52236, "Can not find ArscType with id of "));
                }
                c1139.m4169(new C23367(c1139, c23718, c4356M12197));
            }
            int i4 = c4356M12197.f15586 + c4356M12197.f15585;
            if (i4 >= i) {
                c23718.m52232(i);
                return;
            } else {
                c23718.m52232(i4);
                c4356M12197 = C4356.m12196(c23718);
            }
        }
    }

    @Override // l.InterfaceC17721
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int mo7941() {
        return this.f10089.size();
    }

    @Override // l.InterfaceC17721
    public final InterfaceC19133 getType(int i) {
        return (C1138) this.f10089.get(i);
    }

    @Override // l.AbstractC7179, l.InterfaceC17721
    public final InterfaceC19133 getType(String str) {
        return (C1138) super.getType(str);
    }

    @Override // l.InterfaceC17721
    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public final int mo7939() {
        return this.f10092.size();
    }

    @Override // l.InterfaceC17721
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC22661 mo7947(int i) {
        return (C9256) this.f10092.get(i);
    }

    @Override // l.InterfaceC17721
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int mo7946() {
        return this.f10094.size();
    }

    @Override // l.InterfaceC17721
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14900 mo7945(int i) {
        return (C2904) this.f10094.get(i);
    }

    @Override // l.InterfaceC17721
    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final int mo7940() {
        return this.f10095.size();
    }

    @Override // l.InterfaceC17721
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC18427 mo7943(int i) {
        return (C5372) this.f10095.get(i);
    }

    @Override // l.InterfaceC17721
    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public final List mo7944() {
        return this.f10093;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final List m7942() {
        return this.f10091;
    }

    @Override // l.AbstractC7179, l.InterfaceC17721
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1493 mo7938() {
        return (C1493) super.mo7938();
    }

    @Override // l.AbstractC7179, l.InterfaceC17721
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC6432 mo7938() {
        return (C1493) super.mo7938();
    }
}
