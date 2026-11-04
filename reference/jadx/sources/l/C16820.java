package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BHG */
/* JADX INFO: loaded from: classes4.dex */
public final class C16820 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f54264;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6621 f54265;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C19299 f54266;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C5634 f54267;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f54268;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f54269;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f54270;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f54271;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C1400[] f54272;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C11599[] f54273;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C17566 f54274;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15328[] f54275;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f54276;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C3396 f54277;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9757 m39722(C19299 c19299, C19630 c19630, C16646 c16646) {
        try {
            C16820 c16820 = new C16820(c19299, c19630, c16646);
            c16820.m39738();
            ArrayList arrayList = c16820.f54264;
            int size = arrayList.size();
            C14978 c14978 = new C14978(size);
            for (int i = 0; i < size; i++) {
                c14978.m36041(i, (C22438) arrayList.get(i));
            }
            c14978.mo15005();
            return new C9757(c14978, c16820.m39720(-1));
        } catch (C16074 e) {
            e.m12508("...while working on method " + c19299.mo8780().mo1843());
            throw e;
        }
    }

    public C16820(C19299 c19299, C19630 c19630, C16646 c16646) {
        this.f54266 = c19299;
        C6621 c6621M38704 = C16315.m38704(c19299);
        this.f54265 = c6621M38704;
        int iM37668 = c6621M38704.m37668();
        this.f54270 = iM37668;
        int iM44664 = c19299.m44664();
        this.f54269 = iM44664;
        C17566 c17566 = new C17566(this, c19299, c19630);
        this.f54274 = c17566;
        this.f54277 = new C3396(c17566, c19299, c16646);
        C1400[] c1400Arr = new C1400[iM37668];
        this.f54272 = c1400Arr;
        this.f54273 = new C11599[iM37668];
        this.f54264 = new ArrayList((c6621M38704.size() * 2) + 10);
        this.f54268 = new ArrayList((c6621M38704.size() * 2) + 10);
        this.f54275 = new C15328[iM37668];
        this.f54271 = false;
        c1400Arr[0] = new C1400(iM44664, c19299.m44669());
        C5634 c5634 = new C5634(iM37668);
        c5634.f19483 = c19299.m44668().size() + iM37668;
        this.f54267 = c5634;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m39720(int i) {
        return this.f54266.m44668().size() + this.f54270 + (~i);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private int m39731() {
        int size = this.f54266.m44668().size() + this.f54270 + 7;
        Iterator it = this.f54264.iterator();
        while (it.hasNext()) {
            int iMo31292 = ((C22438) it.next()).mo31292();
            if (iMo31292 >= size) {
                size = iMo31292 + 1;
            }
        }
        return size;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m39740(int i) {
        int size = this.f54266.m44668().size() + this.f54270 + 7;
        ArrayList arrayList = this.f54264;
        C24698 c24698M50590 = ((C22438) arrayList.get(i)).m50590();
        int size2 = c24698M50590.size();
        arrayList.remove(i);
        this.f54268.remove(i);
        for (int i2 = 0; i2 < size2; i2++) {
            int i3 = c24698M50590.get(i2);
            if (i3 >= size) {
                int iM39732 = m39732(i3);
                if (iM39732 < 0) {
                    throw new RuntimeException("Invalid label ".concat(C5306.m15934(i3)));
                }
                m39740(iM39732);
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private boolean m39734() {
        return (this.f54266.mo8783() & 32) != 0;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private boolean m39741() {
        return (this.f54266.mo8783() & 8) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m39742() {
        int iM44669 = this.f54266.m44669() + this.f54269;
        return m39734() ? iM44669 + 1 : iM44669;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private int m39732(int i) {
        ArrayList arrayList = this.f54264;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C22438) arrayList.get(i2)).mo31292() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C22438 m39737(int i) {
        int iM39732 = m39732(i);
        if (iM39732 < 0) {
            throw new IllegalArgumentException("no such label ".concat(C5306.m15934(i)));
        }
        return (C22438) this.f54264.get(iM39732);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m39729(C22438 c22438, C24698 c24698) {
        this.f54264.add(c22438);
        c24698.m46488();
        this.f54268.add(c24698);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m39739(C16820 c16820, C22438 c22438, C24698 c24698) {
        ArrayList arrayList = c16820.f54268;
        ArrayList arrayList2 = c16820.f54264;
        int iM39732 = c16820.m39732(c22438.mo31292());
        if (iM39732 >= 0) {
            arrayList2.remove(iM39732);
            arrayList.remove(iM39732);
        }
        arrayList2.add(c22438);
        c24698.m46488();
        arrayList.add(c24698);
    }

    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, java.lang.String, l.᩶֡ܺ] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m39738() {
        ?? r6;
        char c;
        int i;
        int i2;
        ArrayList arrayList;
        ArrayList arrayList2;
        C15724 c15724;
        boolean z;
        int i3 = this.f54270;
        int[] iArrM14321 = C4560.m14321(i3);
        int i4 = 0;
        C4560.m14326(0, iArrM14321);
        C19299 c19299 = this.f54266;
        C7366 c7366M44662 = c19299.m44662();
        C9012 c9012M44663 = c19299.m44663(0);
        C13705 c13705M19309 = c19299.mo23245().m19309();
        int size = c13705M19309.size();
        C15724 c15725 = new C15724(size + 1);
        int i5 = 0;
        int iM15371 = 0;
        while (i5 < size) {
            C5085 c5085M31609get = c13705M19309.m31609get(i5);
            C8857 c8857M20230 = c7366M44662.m20230(i4, iM15371);
            C7366 c7366 = c7366M44662;
            int i6 = i5;
            c15725.m31603(i6, (AbstractC17216) new C6030(C0809.m3256(c5085M31609get), c9012M44663, c8857M20230 == null ? C20946.m47883(iM15371, c5085M31609get) : C20946.m47886(iM15371, c5085M31609get, c8857M20230.m23735()), C0063.f947, C15943.m37967(iM15371)));
            iM15371 = c5085M31609get.m15371() + iM15371;
            i5 = i6 + 1;
            c7366M44662 = c7366;
            i4 = 0;
        }
        C18708 c18708 = C0809.f3062;
        C0063 c0063 = C0063.f947;
        c15725.m31603(size, (AbstractC17216) new C23930(c18708, c9012M44663, (C20946) null, c0063));
        c15725.mo15005();
        boolean zM39734 = m39734();
        int iM39720 = zM39734 ? m39720(-4) : 0;
        C22438 c22438 = new C22438(m39720(-1), c15725, C24698.m55041(iM39720), iM39720);
        C24698 c24698 = C24698.f79910;
        m39729(c22438, c24698);
        int i7 = this.f54269;
        if (zM39734) {
            int iM44669 = c19299.m44669() + i7;
            if (iM44669 < 1) {
                iM44669 = 1;
            }
            C20946 c20946M47883 = C20946.m47883(iM44669, C5085.f17733);
            if (m39741()) {
                C8267 c8267 = new C8267(C0809.f2913, c9012M44663, c0063, C13705.f43487, c19299.mo8782());
                C15724 c15726 = new C15724(1);
                c15726.m31603(0, (AbstractC17216) c8267);
                c15724 = c15726;
                z = false;
                i = 1;
            } else {
                c15724 = new C15724(2);
                c15724.m31603(0, (AbstractC17216) new C6030(C0809.f3060, c9012M44663, c20946M47883, c0063, C15943.f51773));
                z = false;
                i = 1;
                c15724.m31603(1, (AbstractC17216) new C23930(c18708, c9012M44663, (C20946) null, c0063));
            }
            int iM39721 = m39720(-5);
            c15724.mo15005();
            m39729(new C22438(iM39720, c15724, C24698.m55041(iM39721), iM39721), c24698);
            C15724 c15727 = new C15724(m39741() ? 2 : 1);
            if (m39741()) {
                c15727.m31603(0, (AbstractC17216) new C23930(C0809.m3259(c20946M47883), c9012M44663, c20946M47883, c0063));
            }
            c15727.m31603(m39741() ? 1 : 0, (AbstractC17216) new C6776(C0809.f3054, c9012M44663, C0063.m1033(c20946M47883), C13705.f43487));
            c15727.mo15005();
            c = 0;
            m39729(new C22438(iM39721, c15727, C24698.m55041(0), 0), c24698);
            r6 = z;
        } else {
            i3 = i3;
            iArrM14321 = iArrM14321;
            i7 = i7;
            r6 = 0;
            c = 0;
            i = 1;
        }
        C6994 c6994Mo23245 = c19299.mo23245();
        C1400[] c1400Arr = this.f54272;
        c1400Arr[c].m5116(c6994Mo23245.m19309());
        c1400Arr[c].m5119();
        int[] iArr = iArrM14321;
        int i8 = 0;
        while (true) {
            int iM14323 = C4560.m14323(i8, iArr);
            if (iM14323 < 0) {
                break;
            }
            int i9 = i3;
            int i10 = i7;
            C4560.m14320(iM14323, iArr);
            try {
                m39725(this.f54265.m18556(iM14323), c1400Arr[iM14323], iArr);
                i8 = 0;
                i = 1;
                i3 = i9;
                i7 = i10;
            } catch (C16074 e) {
                e.m12508("...while working on block ".concat(C5306.m15934(iM14323)));
                throw e;
            }
        }
        C17566 c17566 = this.f54274;
        C18708 c18708M41217 = c17566.m41217();
        if (c18708M41217 == null) {
            i2 = i7;
        } else {
            C9012 c9012M41225 = c17566.m41225();
            int iM39722 = m39720(-2);
            if (m39734()) {
                C15724 c15728 = new C15724(i);
                C18708 c18709 = C0809.f3029;
                i2 = i7;
                int iM446610 = c19299.m44669() + i2;
                if (iM446610 < i) {
                    iM446610 = 1;
                }
                c15728.m31603(i8, (AbstractC17216) new C6776(c18709, c9012M41225, C0063.m1033(C20946.m47883(iM446610, C5085.f17733)), C13705.f43487));
                c15728.mo15005();
                int iM39723 = m39720(-3);
                m39729(new C22438(iM39722, c15728, C24698.m55041(iM39723), iM39723), C24698.f79910);
                iM39722 = iM39723;
            } else {
                i2 = i7;
            }
            C15724 c15729 = new C15724(i);
            InterfaceC11050 interfaceC11050M43506 = c18708M41217.m43506();
            c15729.m31603(i8, (AbstractC17216) new C23930(c18708M41217, c9012M41225, (C20946) r6, interfaceC11050M43506.size() == 0 ? C0063.f947 : C0063.m1033(C20946.m47883(i8, interfaceC11050M43506.getType(i8)))));
            c15729.mo15005();
            C24698 c24699 = C24698.f79910;
            m39729(new C22438(iM39722, c15729, c24699, -1), c24699);
        }
        if (this.f54271) {
            C9012 c9012M44664 = c19299.m44663(i8);
            C5085 c5085 = C5085.f17728;
            C20946 c20946M47884 = C20946.m47883(i8, c5085);
            C15724 c157210 = new C15724(2);
            c5085.getClass();
            C13705 c13705 = C13705.f43487;
            c157210.m31603(i8, (AbstractC17216) new C23930(new C18708(4, c5085, c13705, r6), c9012M44664, c20946M47884, C0063.f947));
            C18708 c187010 = C0809.f3029;
            int iM446611 = c19299.m44669() + i2;
            if (iM446611 < i) {
                iM446611 = 1;
            }
            c157210.m31603(i, (AbstractC17216) new C6776(c187010, c9012M44664, C0063.m1033(C20946.m47883(iM446611, C5085.f17733)), c13705));
            c157210.mo15005();
            int iM39724 = m39720(-7);
            C22438 c22439 = new C22438(m39720(-6), c157210, C24698.m55041(iM39724), iM39724);
            C24698 c246910 = C24698.f79910;
            m39729(c22439, c246910);
            C15724 c157211 = new C15724(i);
            c157211.m31603(i8, (AbstractC17216) new C6776(C0809.f2933, c9012M44664, C0063.m1033(c20946M47884), c13705));
            c157211.mo15005();
            m39729(new C22438(iM39724, c157211, c246910, -1), c246910);
        }
        C15328[] c15328Arr = this.f54275;
        int length = c15328Arr.length;
        for (int i11 = 0; i11 < length; i11++) {
            C15328 c15328 = c15328Arr[i11];
            if (c15328 != null) {
                for (C13091 c13091 : c15328.m36776()) {
                    C9012 c9012M40433 = m39737(i11).m50591().m40433();
                    C15724 c157212 = new C15724(2);
                    C5085 c5085M32558 = c13091.m32558();
                    c5085M32558.getClass();
                    C18708 c187011 = new C18708(4, c5085M32558, C13705.f43487, r6);
                    C20946 c20946M47885 = C20946.m47883(i2, c13091.m32558());
                    C0063 c0064 = C0063.f947;
                    c157212.m31603(0, (AbstractC17216) new C23930(c187011, c9012M40433, c20946M47885, c0064));
                    c157212.m31603(1, (AbstractC17216) new C23930(C0809.f3062, c9012M40433, (C20946) r6, c0064));
                    c157212.mo15005();
                    m39729(new C22438(c13091.m32559(), c157212, C24698.m55041(i11), i11), c1400Arr[i11].m5122());
                }
            }
        }
        if (!this.f54276) {
            return;
        }
        C24698 c246911 = new C24698(4);
        int i12 = i3;
        m39728(m39737(0), new C22788(this, c246911), new BitSet(i12));
        int iM39731 = m39731();
        ArrayList arrayList3 = new ArrayList(iM39731);
        for (int i13 = 0; i13 < iM39731; i13++) {
            arrayList3.add(r6);
        }
        int i14 = 0;
        while (true) {
            arrayList = this.f54264;
            int size2 = arrayList.size();
            arrayList2 = this.f54268;
            if (i14 >= size2) {
                break;
            }
            C22438 c224310 = (C22438) arrayList.get(i14);
            if (c224310 != null) {
                arrayList3.set(c224310.mo31292(), (C24698) arrayList2.get(i14));
            }
            i14++;
        }
        int size3 = c246911.size();
        for (int i15 = 0; i15 < size3; i15++) {
            new C25026(this, new C1905(m39731()), arrayList3).m55853(m39737(c246911.get(i15)));
        }
        C24698 c246912 = new C24698(arrayList.size());
        arrayList2.clear();
        m39728(m39737(m39720(-1)), new C19804(c246912), new BitSet(i12));
        c246912.m55049();
        int size4 = arrayList.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                return;
            }
            int iM55043 = c246912.m55043(((C22438) arrayList.get(size4)).mo31292());
            if (iM55043 < 0) {
                iM55043 = -1;
            }
            if (iM55043 < 0) {
                arrayList.remove(size4);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m39725(C12586 c12586, C1400 c1400, int[] iArr) {
        int size;
        C11599 c11599;
        int i;
        C24698 c24698M55045;
        int i2;
        int i3;
        C9012 c9012M40433;
        C24698 c24698M55041;
        C4383 c4383M31295 = c12586.m31295();
        C13705 c13705M13993 = c4383M31295.m13993();
        C17566 c17566 = this.f54274;
        c17566.m41219(c13705M13993);
        C1400 c1400M5110 = c1400.m5110();
        this.f54277.m11126(c12586, c1400M5110);
        c1400M5110.m5119();
        int iM41223 = c17566.m41223();
        ArrayList arrayListM41224 = c17566.m41224();
        int size2 = arrayListM41224.size();
        int size3 = c4383M31295.size();
        C24698 c24698M31294 = c12586.m31294();
        boolean zM41221 = c17566.m41221();
        C11599[] c11599Arr = this.f54273;
        if (zM41221) {
            int i4 = c24698M31294.get(1);
            if (c11599Arr[i4] == null) {
                c11599Arr[i4] = new C11599(this, i4);
            }
            c11599Arr[i4].m29156(c12586.mo31292());
            c11599 = c11599Arr[i4];
            size = 1;
        } else {
            if (c17566.m41220()) {
                int iM27591 = c17566.m41226().m27591();
                C11599 c115910 = c11599Arr[iM27591];
                if (c115910 == null) {
                    int iMo31292 = c12586.mo31292();
                    C11599 c115911 = new C11599(this, iM27591);
                    c115911.m29159(iMo31292);
                    c11599Arr[iM27591] = c115911;
                } else {
                    c115910.m29159(c12586.mo31292());
                }
                C24698 c24698M29158 = c11599Arr[iM27591].m29158();
                c11599Arr[iM27591].m29157(c1400M5110, iArr);
                size = c24698M29158.size();
                c24698M31294 = c24698M29158;
            } else {
                size = c17566.m41218() ? size3 : 0;
            }
            c11599 = null;
        }
        C24698 c24698 = c24698M31294;
        C11599 c115912 = c11599;
        int size4 = c24698.size();
        int i5 = size;
        while (i5 < size4) {
            int i6 = c24698.get(i5);
            try {
                int i7 = i5;
                int i8 = size4;
                C24698 c24699 = c24698;
                m39724(i6, c12586.mo31292(), c115912, c1400M5110, iArr);
                i5 = i7 + 1;
                size4 = i8;
                c24698 = c24699;
            } catch (C16074 e) {
                e.m12508("...while merging to block ".concat(C5306.m15934(i6)));
                throw e;
            }
        }
        int i9 = size4;
        C24698 c246910 = c24698;
        if (i9 == 0 && c17566.m41227()) {
            c24698M55045 = C24698.m55041(m39720(-2));
            i = 1;
        } else {
            i = i9;
            c24698M55045 = c246910;
        }
        if (i == 0) {
            i2 = -1;
        } else {
            int iM41222 = c17566.m41222();
            if (iM41222 >= 0) {
                iM41222 = c24698M55045.get(iM41222);
            }
            i2 = iM41222;
        }
        boolean z = m39734() && c17566.m41228();
        if (z || size3 != 0) {
            C24698 c246911 = new C24698(i);
            boolean z2 = false;
            int i10 = 0;
            while (i10 < size3) {
                C24521 c24521M31621get = c4383M31295.m31621get(i10);
                C1028 c1028M54782 = c24521M31621get.m54782();
                int iM54781 = c24521M31621get.m54781();
                boolean z3 = (c1028M54782 == C1028.f3733) | z2;
                try {
                    C4383 c4383 = c4383M31295;
                    int i11 = i2;
                    int i12 = i10;
                    C24698 c246912 = c246911;
                    m39724(iM54781, c12586.mo31292(), null, c1400M5110.m5112(c1028M54782), iArr);
                    C15328[] c15328Arr = this.f54275;
                    C15328 c15328 = c15328Arr[iM54781];
                    if (c15328 == null) {
                        c15328 = new C15328(this);
                        c15328Arr[iM54781] = c15328;
                    }
                    c246912.add(c15328.m36777(c1028M54782.m3933()).m32559());
                    i10 = i12 + 1;
                    i2 = i11;
                    c246911 = c246912;
                    z2 = z3;
                    c4383M31295 = c4383;
                } catch (C16074 e2) {
                    e2.m12508("...while merging exception to block ".concat(C5306.m15934(iM54781)));
                    throw e2;
                }
            }
            i3 = i2;
            C24698 c246913 = c246911;
            if (z && !z2) {
                c246913.add(m39720(-6));
                this.f54271 = true;
                for (int i13 = (size2 - iM41223) - 1; i13 < size2; i13++) {
                    AbstractC17216 abstractC17216 = (AbstractC17216) arrayListM41224.get(i13);
                    if (abstractC17216.m40439()) {
                        arrayListM41224.set(i13, abstractC17216.mo7777(C5085.f17733));
                    }
                }
            }
            if (i3 >= 0) {
                c246913.add(i3);
            }
            c246913.mo15005();
            c24698M55045 = c246913;
        } else {
            i3 = i2;
        }
        int iM55043 = c24698M55045.m55043(i3);
        if (iM55043 < 0) {
            iM55043 = -1;
        }
        int i14 = i3;
        while (iM41223 > 0) {
            size2--;
            AbstractC17216 abstractC17217 = (AbstractC17216) arrayListM41224.get(size2);
            boolean z4 = abstractC17217.m40434().m43508() == 1;
            C15724 c15724 = new C15724(z4 ? 2 : 1);
            c15724.m31603(0, abstractC17217);
            if (z4) {
                c15724.m31603(1, (AbstractC17216) new C23930(C0809.f3062, abstractC17217.m40433(), (C20946) null, C0063.f947));
                c24698M55041 = C24698.m55041(i14);
            } else {
                c24698M55041 = c24698M55045;
            }
            c15724.mo15005();
            int iM39731 = m39731();
            m39729(new C22438(iM39731, c15724, c24698M55041, i14), c1400M5110.m5122());
            c24698M55045 = c24698M55045.m55045();
            c24698M55045.set(iM55043, iM39731);
            c24698M55045.mo15005();
            iM41223--;
            i14 = iM39731;
        }
        AbstractC17216 abstractC17218 = size2 == 0 ? null : (AbstractC17216) arrayListM41224.get(size2 - 1);
        if (abstractC17218 == null || abstractC17218.m40434().m43508() == 1) {
            if (abstractC17218 == null) {
                c9012M40433 = C9012.f29360;
            } else {
                c9012M40433 = abstractC17218.m40433();
            }
            arrayListM41224.add(new C23930(C0809.f3062, c9012M40433, (C20946) null, C0063.f947));
            size2++;
        }
        C15724 c15725 = new C15724(size2);
        for (int i15 = 0; i15 < size2; i15++) {
            c15725.m31603(i15, (AbstractC17216) arrayListM41224.get(i15));
        }
        c15725.mo15005();
        C22438 c22438 = new C22438(c12586.mo31292(), c15725, c24698M55045, i14);
        C24698 c24698M5122 = c1400M5110.m5122();
        int iM39732 = m39732(c22438.mo31292());
        if (iM39732 >= 0) {
            m39740(iM39732);
        }
        this.f54264.add(c22438);
        c24698M5122.m46488();
        this.f54268.add(c24698M5122);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m39724(int i, int i2, C11599 c11599, C1400 c1400, int[] iArr) {
        C1400 c1400M5113;
        C1400[] c1400Arr = this.f54272;
        C1400 c1401 = c1400Arr[i];
        if (c1401 == null) {
            if (c11599 != null) {
                c1400Arr[i] = c1400.m5111(i, i2);
            } else {
                c1400Arr[i] = c1400;
            }
            C4560.m14326(i, iArr);
            return;
        }
        if (c11599 != null) {
            c1400M5113 = c1401.m5114(c1400, c11599.m29155(), i2);
        } else {
            c1400M5113 = c1401.m5113(c1400);
        }
        if (c1400M5113 != c1401) {
            c1400Arr[i] = c1400M5113;
            C4560.m14326(i, iArr);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m39730(C16820 c16820, C22438 c22438) {
        C24698 c24698M50590 = c22438.m50590();
        if (c24698M50590.size() < 2) {
            return false;
        }
        int i = c24698M50590.get(1);
        C11599[] c11599Arr = c16820.f54273;
        return i < c11599Arr.length && c11599Arr[i] != null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C11599 m39736(C16820 c16820, int i) {
        C11599[] c11599Arr = c16820.f54273;
        int length = c11599Arr.length;
        while (true) {
            length--;
            if (length < 0) {
                return null;
            }
            C11599 c11599 = c11599Arr[length];
            if (c11599 != null && c11599.f36421.get(i)) {
                return c11599;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:23:0x004e A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m39728(C22438 c22438, InterfaceC10503 interfaceC10503, BitSet bitSet) {
        int iM39732;
        interfaceC10503.mo26957(c22438);
        bitSet.set(c22438.mo31292());
        C24698 c24698M50590 = c22438.m50590();
        int size = c24698M50590.size();
        for (int i = 0; i < size; i++) {
            int i2 = c24698M50590.get(i);
            if (!bitSet.get(i2)) {
                C24698 c24698M50591 = c22438.m50590();
                if (c24698M50591.size() >= 2) {
                    int i3 = c24698M50591.get(1);
                    C11599[] c11599Arr = this.f54273;
                    if (i3 >= c11599Arr.length || c11599Arr[i3] == null || i <= 0) {
                        iM39732 = m39732(i2);
                        if (iM39732 >= 0) {
                            m39728((C22438) this.f54264.get(iM39732), interfaceC10503, bitSet);
                        }
                    }
                } else {
                    iM39732 = m39732(i2);
                    if (iM39732 >= 0) {
                        m39728((C22438) this.f54264.get(iM39732), interfaceC10503, bitSet);
                    }
                }
            }
        }
    }
}
