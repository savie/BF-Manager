package l;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ۖ᩸᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes2.dex */
public final class C2806 extends AbstractC10569 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C2806 f10663;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f10664;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C21151[] f10665;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public volatile C11792 f10666;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C19741[] f10667;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C2806[] f10668;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19741[] f10669;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final int f10670;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int[] f10671;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public C0171 f10672;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9158 f10673;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C7040[] f10674;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int[] f10675;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C19741[] f10676;

    public /* synthetic */ C2806(C0171 c0171, C9158 c9158) {
        this(c0171, c9158, null);
    }

    @Override // l.AbstractC10569
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C0171 mo8524() {
        return this.f10672;
    }

    @Override // l.AbstractC10569
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC1332 mo8524() {
        return this.f10672;
    }

    @Override // l.AbstractC10569
    public final String getName() {
        return this.f10672.getName();
    }

    @Override // l.AbstractC10569
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String mo8523() {
        return this.f10664;
    }

    @Override // l.AbstractC10569
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C9158 mo8528() {
        return this.f10673;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C2806 m8530() {
        return this.f10663;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C11792 m8525() {
        if (this.f10666 == null) {
            C11792 c11792M1367 = this.f10672.m1367();
            if (c11792M1367.m29468()) {
                C13909 builder = c11792M1367.toBuilder();
                builder.m33743();
                c11792M1367 = builder.buildPartial();
                if (!c11792M1367.isInitialized()) {
                    throw AbstractC3967.m11452((InterfaceC1332) c11792M1367);
                }
            }
            C11792 c11792 = c11792M1367;
            synchronized (this) {
                if (this.f10666 == null) {
                    this.f10666 = c11792;
                }
            }
        }
        return this.f10666;
    }

    public final List getFields() {
        return C0561.unmodifiableList(Arrays.asList(this.f10669));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List m8527() {
        return C0561.unmodifiableList(Arrays.asList(this.f10665));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m8534() {
        return C0561.unmodifiableList(Arrays.asList(this.f10665).subList(0, this.f10670));
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final List m8533() {
        return C0561.unmodifiableList(Arrays.asList(this.f10667));
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final List m8526() {
        return C0561.unmodifiableList(Arrays.asList(this.f10668));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List m8532() {
        return C0561.unmodifiableList(Arrays.asList(this.f10674));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m8529(int i) {
        int iBinarySearch = Arrays.binarySearch(this.f10671, i);
        if (iBinarySearch < 0) {
            iBinarySearch = (~iBinarySearch) - 1;
        }
        return iBinarySearch >= 0 && i < this.f10675[iBinarySearch];
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m8531() {
        return !this.f10672.m1369().isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19741 m8522(String str) {
        C1395 c1395 = this.f10673.f31130;
        String str2 = this.f10664 + '.' + str;
        c1395.getClass();
        AbstractC10569 abstractC10569M4885 = c1395.m4885(str2, EnumC22563.ALL_SYMBOLS);
        if (abstractC10569M4885 instanceof C19741) {
            return (C19741) abstractC10569M4885;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19741 m8521(int i) {
        C19741[] c19741Arr = this.f10676;
        int length = c19741Arr.length;
        C18329 unused = C19741.f63431;
        int i2 = C20446.f66282;
        int i3 = length - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) / 2;
            C19741 c19741 = c19741Arr[i5];
            int number = c19741.getNumber();
            if (i < number) {
                i3 = i5 - 1;
            } else {
                if (i <= number) {
                    return c19741;
                }
                i4 = i5 + 1;
            }
        }
        return null;
    }

    public C2806(String str) {
        String strSubstring;
        String strSubstring2;
        super(0);
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            strSubstring2 = str.substring(iLastIndexOf + 1);
            strSubstring = str.substring(0, iLastIndexOf);
        } else {
            strSubstring = "";
            strSubstring2 = str;
        }
        C19222 c19222NewBuilder = C0171.newBuilder();
        c19222NewBuilder.setName(strSubstring2);
        C10050 c10050NewBuilder = C7227.newBuilder();
        c10050NewBuilder.m25446(1);
        c10050NewBuilder.m25445(536870912);
        C7227 c7227BuildPartial = c10050NewBuilder.buildPartial();
        if (c7227BuildPartial.isInitialized()) {
            c19222NewBuilder.m44150(c7227BuildPartial);
            this.f10672 = c19222NewBuilder.build();
            this.f10664 = str;
            this.f10663 = null;
            this.f10668 = C20446.f66287;
            this.f10674 = C20446.f66285;
            this.f10669 = C20446.f66280;
            this.f10676 = C20446.f66280;
            this.f10667 = C20446.f66280;
            this.f10665 = C20446.f66288;
            this.f10670 = 0;
            C9158 c9158 = new C9158(strSubstring, this);
            this.f10673 = c9158;
            this.f36173 = c9158;
            this.f10671 = new int[]{1};
            this.f10675 = new int[]{536870912};
            return;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c7227BuildPartial);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2806(C0171 c0171, C9158 c9158, C2806 c2806) throws C13391 {
        C21151[] c21151Arr;
        C2806[] c2806Arr;
        C7040[] c7040Arr;
        C19741[] c19741Arr;
        C19741[] c19741Arr2;
        int i = 0;
        super(i);
        if (c2806 == null) {
            this.f36173 = c9158;
        } else {
            this.f36173 = c2806;
        }
        this.f10672 = c0171;
        this.f10664 = C20446.m46243(c9158, c2806, c0171.getName());
        this.f10673 = c9158;
        this.f10663 = c2806;
        if (c0171.m1366() <= 0) {
            c21151Arr = C20446.f66288;
        } else {
            c21151Arr = new C21151[c0171.m1366()];
        }
        this.f10665 = c21151Arr;
        for (int i2 = 0; i2 < c0171.m1366(); i2++) {
            this.f10665[i2] = new C21151(c0171.m1359(i2), c9158, this, i2);
        }
        if (c0171.m1368() <= 0) {
            c2806Arr = C20446.f66287;
        } else {
            c2806Arr = new C2806[c0171.m1368()];
        }
        this.f10668 = c2806Arr;
        for (int i3 = 0; i3 < c0171.m1368(); i3++) {
            this.f10668[i3] = new C2806(c0171.m1356(i3), c9158, this);
        }
        if (c0171.m1363() <= 0) {
            c7040Arr = C20446.f66285;
        } else {
            c7040Arr = new C7040[c0171.m1363()];
        }
        this.f10674 = c7040Arr;
        for (int i4 = 0; i4 < c0171.m1363(); i4++) {
            this.f10674[i4] = new C7040(c0171.m1358(i4), c9158, this);
        }
        if (c0171.m1365() <= 0) {
            c19741Arr = C20446.f66280;
        } else {
            c19741Arr = new C19741[c0171.m1365()];
        }
        this.f10669 = c19741Arr;
        for (int i5 = 0; i5 < c0171.m1365(); i5++) {
            this.f10669[i5] = new C19741(c0171.m1362(i5), c9158, this, i5, false);
        }
        this.f10676 = c0171.m1365() > 0 ? (C19741[]) this.f10669.clone() : C20446.f66280;
        if (c0171.m1357() <= 0) {
            c19741Arr2 = C20446.f66280;
        } else {
            c19741Arr2 = new C19741[c0171.m1357()];
        }
        this.f10667 = c19741Arr2;
        for (int i6 = 0; i6 < c0171.m1357(); i6++) {
            this.f10667[i6] = new C19741(c0171.m1364(i6), c9158, this, i6, true);
        }
        for (int i7 = 0; i7 < c0171.m1366(); i7++) {
            C21151 c21151 = this.f10665[i7];
            c21151.f68887 = new C19741[c21151.m47594()];
            this.f10665[i7].f68888 = 0;
        }
        for (int i8 = 0; i8 < c0171.m1365(); i8++) {
            C21151 c21151M44906 = this.f10669[i8].m44906();
            if (c21151M44906 != null) {
                c21151M44906.f68887[C21151.m47590(c21151M44906)] = this.f10669[i8];
            }
        }
        int i9 = 0;
        for (C21151 c21152 : this.f10665) {
            if (c21152.m47592()) {
                i9++;
            } else if (i9 > 0) {
                throw new C13391(this, "Synthetic oneofs must come last.", i);
            }
        }
        this.f10670 = this.f10665.length - i9;
        c9158.f31130.m4887(this);
        if (c0171.m1360() <= 0) {
            this.f10671 = C20446.f66283;
            this.f10675 = C20446.f66283;
            return;
        }
        this.f10671 = new int[c0171.m1360()];
        this.f10675 = new int[c0171.m1360()];
        for (C7227 c7227 : c0171.m1369()) {
            this.f10671[i] = c7227.m19254();
            this.f10675[i] = c7227.m19255();
            i++;
        }
        Arrays.sort(this.f10671);
        Arrays.sort(this.f10675);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public void m8517() {
        m26727(this.f10672.m1367().m29475());
        for (C2806 c2806 : this.f10668) {
            c2806.m8517();
        }
        for (C7040 c7040 : this.f10674) {
            C7040.m18881(c7040);
        }
        for (C21151 c21151 : this.f10665) {
            C21151.m47587(c21151);
        }
        for (C19741 c19741 : this.f10669) {
            C19741.m44893(c19741);
        }
        for (C19741 c19742 : this.f10667) {
            C19741.m44893(c19742);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public void m8520() throws C13391 {
        int i = 0;
        for (C2806 c2806 : this.f10668) {
            c2806.m8520();
        }
        for (C19741 c19741 : this.f10669) {
            C19741.m44896(c19741);
        }
        C19741[] c19741Arr = this.f10676;
        Arrays.sort(c19741Arr);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= c19741Arr.length) {
                C19741[] c19741Arr2 = this.f10667;
                int length = c19741Arr2.length;
                while (i < length) {
                    C19741.m44896(c19741Arr2[i]);
                    i++;
                }
                return;
            }
            C19741 c19742 = c19741Arr[i2];
            C19741 c19743 = c19741Arr[i3];
            if (c19742.getNumber() == c19743.getNumber()) {
                throw new C13391(c19743, "Field number " + c19743.getNumber() + " has already been used in \"" + c19743.m44910().f10664 + "\" by field \"" + c19742.getName() + "\".", i);
            }
            i2 = i3;
        }
    }
}
