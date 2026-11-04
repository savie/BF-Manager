package l;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.᩺ᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes.dex */
public final class C24478 extends AbstractC4823 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C8069[] f79427;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C7323[] f79428;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C14034 f79429;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public volatile C6250 f79430;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C24478[] f79431;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int[] f79432;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String f79433;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C7323[] f79434;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C7323[] f79435;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final int f79436;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C10788[] f79437;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C24478 f79438;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f79439;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public C15504 f79440;

    public /* synthetic */ C24478(C15504 c15504, C14034 c14034) {
        this(c15504, c14034, null);
    }

    @Override // l.AbstractC4823
    /* JADX INFO: renamed from: ۧ */
    public final C15504 mo5000() {
        return this.f79440;
    }

    @Override // l.AbstractC4823
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC21013 mo5000() {
        return this.f79440;
    }

    @Override // l.AbstractC4823
    public final String getName() {
        return this.f79440.getName();
    }

    @Override // l.AbstractC4823
    /* JADX INFO: renamed from: ᩴ */
    public final String mo5002() {
        return this.f79433;
    }

    @Override // l.AbstractC4823
    /* JADX INFO: renamed from: ᩸ */
    public final C14034 mo5003() {
        return this.f79429;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C24478 m54740() {
        return this.f79438;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C6250 m54744() {
        if (this.f79430 == null) {
            C6250 c6250M37139 = this.f79440.m37139();
            if (c6250M37139.m17889()) {
                C12215 builder = c6250M37139.toBuilder();
                builder.m30490();
                c6250M37139 = builder.buildPartial();
                if (!c6250M37139.isInitialized()) {
                    throw AbstractC0479.m2311((InterfaceC21013) c6250M37139);
                }
            }
            C6250 c6250 = c6250M37139;
            synchronized (this) {
                if (this.f79430 == null) {
                    this.f79430 = c6250;
                }
            }
        }
        return this.f79430;
    }

    public final List getFields() {
        return C4681.unmodifiableList(Arrays.asList(this.f79428));
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final List m54737() {
        return C4681.unmodifiableList(Arrays.asList(this.f79437));
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final List m54734() {
        return C4681.unmodifiableList(Arrays.asList(this.f79437).subList(0, this.f79436));
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final List m54741() {
        return C4681.unmodifiableList(Arrays.asList(this.f79435));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List m54738() {
        return C4681.unmodifiableList(Arrays.asList(this.f79431));
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final List m54743() {
        return C4681.unmodifiableList(Arrays.asList(this.f79427));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m54742(int i) {
        int iBinarySearch = Arrays.binarySearch(this.f79432, i);
        if (iBinarySearch < 0) {
            iBinarySearch = (~iBinarySearch) - 1;
        }
        return iBinarySearch >= 0 && i < this.f79439[iBinarySearch];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m54739() {
        return !this.f79440.m37140().isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7323 m54736(String str) {
        C21494 c21494 = this.f79429.f44472;
        String str2 = this.f79433 + '.' + str;
        c21494.getClass();
        AbstractC4823 abstractC4823M48902 = c21494.m48902(str2, EnumC14780.ALL_SYMBOLS);
        if (abstractC4823M48902 instanceof C7323) {
            return (C7323) abstractC4823M48902;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7323 m54735(int i) {
        C7323[] c7323Arr = this.f79434;
        int length = c7323Arr.length;
        C9559 unused = C7323.f24118;
        int i2 = C19739.f63530;
        int i3 = length - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) / 2;
            C7323 c7323 = c7323Arr[i5];
            int number = c7323.getNumber();
            if (i < number) {
                i3 = i5 - 1;
            } else {
                if (i <= number) {
                    return c7323;
                }
                i4 = i5 + 1;
            }
        }
        return null;
    }

    public C24478(String str) {
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
        C7389 c7389NewBuilder = C15504.newBuilder();
        c7389NewBuilder.setName(strSubstring2);
        C5064 c5064NewBuilder = C22218.newBuilder();
        c5064NewBuilder.m15328(1);
        c5064NewBuilder.m15327(536870912);
        C22218 c22218BuildPartial = c5064NewBuilder.buildPartial();
        if (c22218BuildPartial.isInitialized()) {
            c7389NewBuilder.m20303(c22218BuildPartial);
            this.f79440 = c7389NewBuilder.build();
            this.f79433 = str;
            this.f79438 = null;
            this.f79431 = C19739.f63537;
            this.f79427 = C19739.f63532;
            this.f79428 = C19739.f63538;
            this.f79434 = C19739.f63538;
            this.f79435 = C19739.f63538;
            this.f79437 = C19739.f63535;
            this.f79436 = 0;
            C14034 c14034 = new C14034(strSubstring, this);
            this.f79429 = c14034;
            this.f16869 = c14034;
            this.f79432 = new int[]{1};
            this.f79439 = new int[]{536870912};
            return;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c22218BuildPartial);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C24478(C15504 c15504, C14034 c14034, C24478 c24478) throws C18510 {
        C10788[] c10788Arr;
        C24478[] c24478Arr;
        C8069[] c8069Arr;
        C7323[] c7323Arr;
        C7323[] c7323Arr2;
        int i = 0;
        super(i);
        if (c24478 == null) {
            this.f16869 = c14034;
        } else {
            this.f16869 = c24478;
        }
        this.f79440 = c15504;
        this.f79433 = C19739.m45480(c14034, c24478, c15504.getName());
        this.f79429 = c14034;
        this.f79438 = c24478;
        if (c15504.m37133() <= 0) {
            c10788Arr = C19739.f63535;
        } else {
            c10788Arr = new C10788[c15504.m37133()];
        }
        this.f79437 = c10788Arr;
        for (int i2 = 0; i2 < c15504.m37133(); i2++) {
            this.f79437[i2] = new C10788(c15504.m37136(i2), c14034, this, i2);
        }
        if (c15504.m37135() <= 0) {
            c24478Arr = C19739.f63537;
        } else {
            c24478Arr = new C24478[c15504.m37135()];
        }
        this.f79431 = c24478Arr;
        for (int i3 = 0; i3 < c15504.m37135(); i3++) {
            this.f79431[i3] = new C24478(c15504.m37138(i3), c14034, this);
        }
        if (c15504.m37130() <= 0) {
            c8069Arr = C19739.f63532;
        } else {
            c8069Arr = new C8069[c15504.m37130()];
        }
        this.f79427 = c8069Arr;
        for (int i4 = 0; i4 < c15504.m37130(); i4++) {
            this.f79427[i4] = new C8069(c15504.m37129(i4), c14034, this);
        }
        if (c15504.m37134() <= 0) {
            c7323Arr = C19739.f63538;
        } else {
            c7323Arr = new C7323[c15504.m37134()];
        }
        this.f79428 = c7323Arr;
        for (int i5 = 0; i5 < c15504.m37134(); i5++) {
            this.f79428[i5] = new C7323(c15504.m37131(i5), c14034, this, i5, false);
        }
        this.f79434 = c15504.m37134() > 0 ? (C7323[]) this.f79428.clone() : C19739.f63538;
        if (c15504.m37127() <= 0) {
            c7323Arr2 = C19739.f63538;
        } else {
            c7323Arr2 = new C7323[c15504.m37127()];
        }
        this.f79435 = c7323Arr2;
        for (int i6 = 0; i6 < c15504.m37127(); i6++) {
            this.f79435[i6] = new C7323(c15504.m37137(i6), c14034, this, i6, true);
        }
        for (int i7 = 0; i7 < c15504.m37133(); i7++) {
            C10788 c10788 = this.f79437[i7];
            c10788.f34244 = new C7323[c10788.m27502()];
            this.f79437[i7].f34242 = 0;
        }
        for (int i8 = 0; i8 < c15504.m37134(); i8++) {
            C10788 c10788M20094 = this.f79428[i8].m20094();
            if (c10788M20094 != null) {
                c10788M20094.f34244[C10788.m27496(c10788M20094)] = this.f79428[i8];
            }
        }
        int i9 = 0;
        for (C10788 c10789 : this.f79437) {
            if (c10789.m27499()) {
                i9++;
            } else if (i9 > 0) {
                throw new C18510(this, "Synthetic oneofs must come last.", i);
            }
        }
        this.f79436 = this.f79437.length - i9;
        c14034.f44472.m48903(this);
        if (c15504.m37132() <= 0) {
            this.f79432 = C19739.f63536;
            this.f79439 = C19739.f63536;
            return;
        }
        this.f79432 = new int[c15504.m37132()];
        this.f79439 = new int[c15504.m37132()];
        for (C22218 c22218 : c15504.m37140()) {
            this.f79432[i] = c22218.m50248();
            this.f79439[i] = c22218.m50247();
            i++;
        }
        Arrays.sort(this.f79432);
        Arrays.sort(this.f79439);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public void m54731() {
        m14855(this.f79440.m37139().m17894());
        for (C24478 c24478 : this.f79431) {
            c24478.m54731();
        }
        for (C8069 c8069 : this.f79427) {
            C8069.m21961(c8069);
        }
        for (C10788 c10788 : this.f79437) {
            C10788.m27498(c10788);
        }
        for (C7323 c7323 : this.f79428) {
            C7323.m20079(c7323);
        }
        for (C7323 c7324 : this.f79435) {
            C7323.m20079(c7324);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public void m54732() throws C18510 {
        int i = 0;
        for (C24478 c24478 : this.f79431) {
            c24478.m54732();
        }
        for (C7323 c7323 : this.f79428) {
            C7323.m20082(c7323);
        }
        C7323[] c7323Arr = this.f79434;
        Arrays.sort(c7323Arr);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= c7323Arr.length) {
                C7323[] c7323Arr2 = this.f79435;
                int length = c7323Arr2.length;
                while (i < length) {
                    C7323.m20082(c7323Arr2[i]);
                    i++;
                }
                return;
            }
            C7323 c7324 = c7323Arr[i2];
            C7323 c7325 = c7323Arr[i3];
            if (c7324.getNumber() == c7325.getNumber()) {
                throw new C18510(c7325, "Field number " + c7325.getNumber() + " has already been used in \"" + c7325.m20099().f79433 + "\" by field \"" + c7324.getName() + "\".", i);
            }
            i2 = i3;
        }
    }
}
