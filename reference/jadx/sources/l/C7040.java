package l;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ۜ᩸᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes3.dex */
public final class C7040 extends AbstractC10569 implements InterfaceC17539 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ReferenceQueue f23650;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C1582 f23651;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public HashMap f23652;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C9158 f23653;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C21857[] f23654;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f23655;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f23656;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C21857[] f23657;

    @Override // l.AbstractC10569
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC1332 mo8524() {
        return this.f23651;
    }

    @Override // l.AbstractC10569
    public final String getName() {
        return this.f23651.getName();
    }

    @Override // l.AbstractC10569
    /* JADX INFO: renamed from: ۚ */
    public final String mo8523() {
        return this.f23656;
    }

    @Override // l.AbstractC10569
    /* JADX INFO: renamed from: ܰ */
    public final C9158 mo8528() {
        return this.f23653;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final List m18886() {
        return C0561.unmodifiableList(Arrays.asList(this.f23657));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21857 m18884(String str) {
        C1395 c1395 = this.f23653.f31130;
        String str2 = this.f23656 + '.' + str;
        c1395.getClass();
        AbstractC10569 abstractC10569M4885 = c1395.m4885(str2, EnumC22563.ALL_SYMBOLS);
        if (abstractC10569M4885 instanceof C21857) {
            return (C21857) abstractC10569M4885;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21857 m18885(int i) {
        C21857 c21857;
        C21857 c21857M18883 = m18883(i);
        if (c21857M18883 != null) {
            return c21857M18883;
        }
        synchronized (this) {
            if (this.f23650 == null) {
                this.f23650 = new ReferenceQueue();
                this.f23652 = new HashMap();
            } else {
                while (true) {
                    C4217 c4217 = (C4217) this.f23650.poll();
                    if (c4217 == null) {
                        break;
                    }
                    this.f23652.remove(Integer.valueOf(c4217.f15299));
                }
            }
            WeakReference weakReference = (WeakReference) this.f23652.get(Integer.valueOf(i));
            c21857 = weakReference == null ? null : (C21857) weakReference.get();
            if (c21857 == null) {
                c21857 = new C21857(this, Integer.valueOf(i));
                this.f23652.put(Integer.valueOf(i), new C4217(i, c21857));
            }
        }
        return c21857;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C7040(C1582 c1582, C9158 c9158, C2806 c2806) throws C13391 {
        int i = 0;
        super(i);
        this.f23652 = null;
        this.f23650 = null;
        if (c2806 == null) {
            this.f36173 = c9158;
        } else {
            this.f36173 = c2806;
        }
        this.f23651 = c1582;
        this.f23656 = C20446.m46243(c9158, c2806, c1582.getName());
        this.f23653 = c9158;
        if (c1582.m5400() == 0) {
            throw new C13391(this, "Enums must contain at least one value.", i);
        }
        this.f23657 = new C21857[c1582.m5400()];
        for (int i2 = 0; i2 < c1582.m5400(); i2++) {
            this.f23657[i2] = new C21857(c1582.m5401(i2), c9158, this, i2);
        }
        C21857[] c21857Arr = (C21857[]) this.f23657.clone();
        this.f23654 = c21857Arr;
        Arrays.sort(c21857Arr, C21857.f70930);
        for (int i3 = 1; i3 < c1582.m5400(); i3++) {
            C21857[] c21857Arr2 = this.f23654;
            C21857 c21857 = c21857Arr2[i];
            C21857 c21858 = c21857Arr2[i3];
            if (c21857.getNumber() != c21858.getNumber()) {
                i++;
                this.f23654[i] = c21858;
            }
        }
        int i4 = i + 1;
        this.f23655 = i4;
        Arrays.fill(this.f23654, i4, c1582.m5400(), (Object) null);
        c9158.f31130.m4887(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18881(C7040 c7040) {
        c7040.m26727(c7040.f23651.m5403().m12525());
        for (C21857 c21857 : c7040.f23657) {
            C21857.m48638(c21857);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21857 m18883(int i) {
        int i2 = this.f23655 - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            C21857 c21857 = this.f23654[i4];
            int number = c21857.getNumber();
            if (i < number) {
                i2 = i4 - 1;
            } else {
                if (i <= number) {
                    return c21857;
                }
                i3 = i4 + 1;
            }
        }
        return null;
    }
}
