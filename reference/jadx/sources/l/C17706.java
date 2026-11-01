package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩳ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: O69P */
/* JADX INFO: loaded from: classes5.dex */
public final class C17706 extends AbstractC9011 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C21234[] f56221;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public AbstractC4300[] f56222;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f56223;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C22646[] f56224;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f56225;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C15591 f56226;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f56227;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C9841 f56228;

    public C17706(C12063 c12063, int i, int i2, int i3, AbstractC4300[] abstractC4300Arr, C21234[] c21234Arr, C22646[] c22646Arr) {
        super(c12063);
        this.f56225 = i;
        this.f56227 = i2;
        this.f56223 = i3;
        this.f56226 = null;
        this.f56222 = abstractC4300Arr;
        this.f56221 = c21234Arr;
        this.f56224 = c22646Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17706 m41250(C12063 c12063, int i, ArrayList arrayList) {
        AbstractC4300[] abstractC4300Arr;
        if (arrayList.size() > 0) {
            AbstractC4300[] abstractC4300Arr2 = new AbstractC4300[arrayList.size()];
            arrayList.toArray(abstractC4300Arr2);
            abstractC4300Arr = abstractC4300Arr2;
        } else {
            abstractC4300Arr = null;
        }
        return (C17706) c12063.f40347.m28060(new C17706(c12063, i, 1, 0, abstractC4300Arr, null, null));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17706 m41252(C12063 c12063) {
        int i;
        C21234[] c21234Arr;
        C22646 c22646;
        C9716 c9716 = this.f56228.f33621.f65772.f55610;
        if (c9716 == null) {
            i = 0;
        } else {
            int iM6313 = 0;
            for (C1953 c1953 : c9716.f32710) {
                iM6313 += c1953.m6313();
            }
            i = iM6313;
        }
        if ((this.f56228.f33622 & EnumC3364.STATIC.getValue()) == 0) {
            i++;
        }
        this.f56227 = i;
        ArrayList arrayList = new ArrayList(3);
        C21234[] c21234Arr2 = this.f56221;
        C22646[] c22646Arr = null;
        if (c21234Arr2 == null) {
            c21234Arr = null;
        } else {
            C21234[] c21234Arr3 = new C21234[c21234Arr2.length];
            int i2 = 0;
            while (true) {
                C21234[] c21234Arr4 = this.f56221;
                if (i2 >= c21234Arr4.length) {
                    break;
                }
                C21234 c21234 = c21234Arr4[i2];
                C22646 c22647 = c21234.f69162;
                C14885[] c14885Arr = c22647.f73782;
                if (c14885Arr == null) {
                    c22646 = null;
                } else {
                    C14885[] c14885Arr2 = new C14885[c14885Arr.length];
                    int i3 = 0;
                    while (true) {
                        C14885[] c14885Arr3 = c22647.f73782;
                        if (i3 >= c14885Arr3.length) {
                            break;
                        }
                        C14885 c14885 = c14885Arr3[i3];
                        c14885Arr2[i3] = new C14885(C1953.m6312(c14885.f48641.m6314(), c12063), c14885.m35582());
                        i3++;
                    }
                    c22646 = new C22646(c14885Arr2, c22647.m50181());
                }
                arrayList.add(c22646);
                c21234Arr3[i2] = new C21234(c21234.m47708(), c21234.m47709(), c22646);
                i2++;
            }
            c21234Arr = c21234Arr3;
        }
        if (arrayList.size() > 0) {
            c22646Arr = new C22646[arrayList.size()];
            arrayList.toArray(c22646Arr);
        }
        C22646[] c22646Arr2 = c22646Arr;
        int i4 = this.f56225;
        int i5 = this.f56227;
        int i6 = this.f56223;
        AbstractC4300[] abstractC4300Arr = this.f56222;
        for (AbstractC4300 abstractC4300 : abstractC4300Arr) {
            switch (C6417.f21732[abstractC4300.mo4758().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    AbstractC11357 abstractC11357 = (AbstractC11357) abstractC4300;
                    int i7 = C6417.f21733[abstractC4300.f15468.f3348.ordinal()];
                    if (i7 == 1) {
                        abstractC11357.m28438(((C18888) abstractC11357.m28439()).m43562(c12063));
                    } else if (i7 == 2) {
                        abstractC11357.m28438(((C20299) abstractC11357.m28439()).m45812(c12063));
                    } else if (i7 == 3) {
                        abstractC11357.m28438(C1953.m6312(((C1953) abstractC11357.m28439()).m6314(), c12063));
                    } else if (i7 == 4) {
                        abstractC11357.m28438(C14655.m35175(((C14655) abstractC11357.m28439()).m35176(), c12063));
                    }
                    break;
            }
        }
        return (C17706) c12063.f40347.m28060(new C17706(c12063, i4, i5, i6, abstractC4300Arr, c21234Arr, c22646Arr2));
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final void mo6320(C13825 c13825, C6187 c6187) {
        C12063 c12063;
        AbstractC4300 abstractC4300Mo2412;
        this.f56225 = c13825.m33638();
        this.f56227 = c13825.m33638();
        this.f56223 = c13825.m33638();
        int iM33638 = c13825.m33638();
        C15591 c15591 = (C15591) c6187.m17187(EnumC21004.TYPE_DEBUG_INFO_ITEM, c13825.m33642());
        this.f56226 = c15591;
        if (c15591 != null) {
            c15591.m37255(this);
        }
        int iM33642 = c13825.m33642();
        ArrayList arrayList = new ArrayList();
        byte[] bArrM33646 = c13825.m33646(iM33642 * 2);
        int iMo12097 = 0;
        while (true) {
            int length = bArrM33646.length;
            c12063 = this.f30808;
            if (iMo12097 >= length) {
                break;
            }
            try {
                EnumC0772 enumC0772M3313 = EnumC0772.m3313(bArrM33646[iMo12097]);
                if (enumC0772M3313 == null) {
                    System.err.println("Unknown opcode  address: " + C3335.m9929(iMo12097));
                    break;
                }
                EnumC0772 enumC0772 = EnumC0772.f3223;
                if (enumC0772M3313 == enumC0772) {
                    byte b = bArrM33646[iMo12097 + 1];
                    if (b == 0) {
                        abstractC4300Mo2412 = new C23101(enumC0772, 0);
                    } else if (b == 1) {
                        abstractC4300Mo2412 = new C23931(bArrM33646, iMo12097);
                    } else if (b == 2) {
                        abstractC4300Mo2412 = new C9820(bArrM33646, iMo12097);
                    } else {
                        abstractC4300Mo2412 = b != 3 ? null : new C22395(bArrM33646, iMo12097);
                    }
                } else {
                    abstractC4300Mo2412 = enumC0772M3313.f3349.f5389.mo2412(c12063, enumC0772M3313, bArrM33646, iMo12097);
                }
                arrayList.add(abstractC4300Mo2412);
                iMo12097 += abstractC4300Mo2412.mo12097(iMo12097 / 2) * 2;
            } catch (Exception e) {
                throw C11708.m29248("Error occurred at code address " + (iMo12097 * 2), e);
            }
        }
        AbstractC4300[] abstractC4300Arr = new AbstractC4300[arrayList.size()];
        this.f56222 = abstractC4300Arr;
        arrayList.toArray(abstractC4300Arr);
        if (iM33638 > 0) {
            c13825.m33640(4);
            int iM33639 = c13825.m33639();
            c13825.m33643((iM33638 * 8) + iM33639);
            int iM336310 = c13825.m33639();
            int iM33647 = c13825.m33647();
            C1123 c1123 = new C1123(iM33647);
            this.f56224 = new C22646[iM33647];
            for (int i = 0; i < iM33647; i++) {
                try {
                    int iM336311 = c13825.m33639() - iM336310;
                    this.f56224[i] = new C22646(c12063, c13825);
                    c1123.m4150(iM336311, this.f56224[i]);
                } catch (Exception e2) {
                    throw C11708.m29248("Error while reading EncodedCatchHandler at index " + i, e2);
                }
            }
            int iM336312 = c13825.m33639();
            c13825.m33643(iM33639);
            this.f56221 = new C21234[iM33638];
            for (int i2 = 0; i2 < iM33638; i2++) {
                try {
                    this.f56221[i2] = new C21234(c13825, c1123);
                } catch (Exception e3) {
                    throw C11708.m29248("Error while reading TryItem at index " + i2, e3);
                }
            }
            c13825.m33643(iM336312);
        }
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final String mo6317() {
        if (this.f56228 == null) {
            return C9576.m24440(new StringBuilder("code_item @0x"), this.f30807);
        }
        return "code_item @0x" + Integer.toHexString(this.f30807) + " (" + this.f56228.f33621.m45810() + MotionUtils.EASING_TYPE_FORMAT_END;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C17706 c17706) {
        C9841 c9841 = this.f56228;
        if (c9841 == null) {
            return c17706.f56228 == null ? 0 : -1;
        }
        C9841 c9842 = c17706.f56228;
        if (c9842 == null) {
            return 1;
        }
        return c9841.f33621.compareTo(c9842.f33621);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41253(C9841 c9841) {
        this.f56228 = c9841;
    }

    public final C9841 getParent() {
        return this.f56228;
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final int mo6315(int i) {
        int iMo12097 = 0;
        for (AbstractC4300 abstractC4300 : this.f56222) {
            iMo12097 += abstractC4300.mo12097(iMo12097);
        }
        int iM5620 = C1694.m5620(iMo12097, 2, 16, i);
        C21234[] c21234Arr = this.f56221;
        if (c21234Arr != null && c21234Arr.length > 0) {
            int length = (c21234Arr.length * 8) + ((iM5620 + 3) & (-4));
            iM5620 = C13530.m33072(this.f56224.length) + length;
            for (C22646 c22646 : this.f56224) {
                iM5620 = C22646.m50178(iM5620, length, c22646);
            }
        }
        return iM5620;
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final void mo6319(C4651 c4651) {
        int iMo12097 = 0;
        for (AbstractC4300 abstractC4300 : this.f56222) {
            iMo12097 += abstractC4300.mo12097(iMo12097);
        }
        c4651.m12833(this.f56225);
        c4651.m12833(this.f56227);
        c4651.m12833(this.f56223);
        C21234[] c21234Arr = this.f56221;
        if (c21234Arr == null) {
            c4651.m12833(0);
        } else {
            c4651.m12833(c21234Arr.length);
        }
        C15591 c15591 = this.f56226;
        if (c15591 == null) {
            c4651.m12839(0);
        } else {
            c4651.m12839(c15591.f30807);
        }
        c4651.m12839(iMo12097);
        int iM12098 = 0;
        for (AbstractC4300 abstractC4301 : this.f56222) {
            iM12098 = abstractC4301.m12098(c4651, iM12098);
        }
        C21234[] c21234Arr2 = this.f56221;
        if (c21234Arr2 == null || c21234Arr2.length <= 0) {
            return;
        }
        if (iM12098 % 2 != 0) {
            c4651.m12833(0);
        }
        for (C21234 c21234 : this.f56221) {
            C21234.m47707(c21234, c4651);
        }
        c4651.m12842(this.f56224.length);
        for (C22646 c22646 : this.f56224) {
            C22646.m50180(c22646, c4651);
        }
    }
}
