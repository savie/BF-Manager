package l;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.۟ᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes4.dex */
public final class C8069 extends AbstractC4823 implements InterfaceC1818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f26699;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public HashMap f26700;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C1357[] f26701;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C14034 f26702;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C1357[] f26703;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C16250 f26704;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ReferenceQueue f26705;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f26706;

    @Override // l.AbstractC4823
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC21013 mo5000() {
        return this.f26704;
    }

    @Override // l.AbstractC4823
    public final String getName() {
        return this.f26704.getName();
    }

    @Override // l.AbstractC4823
    /* JADX INFO: renamed from: ᩴ */
    public final String mo5002() {
        return this.f26706;
    }

    @Override // l.AbstractC4823
    /* JADX INFO: renamed from: ᩸ */
    public final C14034 mo5003() {
        return this.f26702;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final List m21965() {
        return C4681.unmodifiableList(Arrays.asList(this.f26703));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1357 m21964(String str) {
        C21494 c21494 = this.f26702.f44472;
        String str2 = this.f26706 + '.' + str;
        c21494.getClass();
        AbstractC4823 abstractC4823M48902 = c21494.m48902(str2, EnumC14780.ALL_SYMBOLS);
        if (abstractC4823M48902 instanceof C1357) {
            return (C1357) abstractC4823M48902;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1357 m21966(int i) {
        C1357 c1357;
        C1357 c1357M21963 = m21963(i);
        if (c1357M21963 != null) {
            return c1357M21963;
        }
        synchronized (this) {
            if (this.f26705 == null) {
                this.f26705 = new ReferenceQueue();
                this.f26700 = new HashMap();
            } else {
                while (true) {
                    C0611 c0611 = (C0611) this.f26705.poll();
                    if (c0611 == null) {
                        break;
                    }
                    this.f26700.remove(Integer.valueOf(c0611.f2422));
                }
            }
            WeakReference weakReference = (WeakReference) this.f26700.get(Integer.valueOf(i));
            c1357 = weakReference == null ? null : (C1357) weakReference.get();
            if (c1357 == null) {
                c1357 = new C1357(this, Integer.valueOf(i));
                this.f26700.put(Integer.valueOf(i), new C0611(i, c1357));
            }
        }
        return c1357;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C8069(C16250 c16250, C14034 c14034, C24478 c24478) throws C18510 {
        int i = 0;
        super(i);
        this.f26700 = null;
        this.f26705 = null;
        if (c24478 == null) {
            this.f16869 = c14034;
        } else {
            this.f16869 = c24478;
        }
        this.f26704 = c16250;
        this.f26706 = C19739.m45480(c14034, c24478, c16250.getName());
        this.f26702 = c14034;
        if (c16250.m38562() == 0) {
            throw new C18510(this, "Enums must contain at least one value.", i);
        }
        this.f26703 = new C1357[c16250.m38562()];
        for (int i2 = 0; i2 < c16250.m38562(); i2++) {
            this.f26703[i2] = new C1357(c16250.m38563(i2), c14034, this, i2);
        }
        C1357[] c1357Arr = (C1357[]) this.f26703.clone();
        this.f26701 = c1357Arr;
        Arrays.sort(c1357Arr, C1357.f4838);
        for (int i3 = 1; i3 < c16250.m38562(); i3++) {
            C1357[] c1357Arr2 = this.f26701;
            C1357 c1357 = c1357Arr2[i];
            C1357 c1358 = c1357Arr2[i3];
            if (c1357.getNumber() != c1358.getNumber()) {
                i++;
                this.f26701[i] = c1358;
            }
        }
        int i4 = i + 1;
        this.f26699 = i4;
        Arrays.fill(this.f26701, i4, c16250.m38562(), (Object) null);
        c14034.f44472.m48903(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21961(C8069 c8069) {
        c8069.m14855(c8069.f26704.m38564().m47399());
        for (C1357 c1357 : c8069.f26703) {
            C1357.m4999(c1357);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1357 m21963(int i) {
        int i2 = this.f26699 - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            C1357 c1357 = this.f26701[i4];
            int number = c1357.getNumber();
            if (i < number) {
                i2 = i4 - 1;
            } else {
                if (i <= number) {
                    return c1357;
                }
                i3 = i4 + 1;
            }
        }
        return null;
    }
}
