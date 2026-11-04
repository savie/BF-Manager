package l;

/* JADX INFO: renamed from: l.ܽۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5CF */
/* JADX INFO: loaded from: classes5.dex */
public class C17278 extends AbstractC14294 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC14294[] f56274;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C20436 f56275;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C3282[] f56276;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f56277 = 0;

    public C17278(C24738 c24738, C4028 c4028) {
        int i = 0;
        this.f56275 = (C20436) c24738.f80112.m49623(c4028.m12998());
        int iM12998 = c4028.m12998();
        this.f56276 = new C3282[iM12998];
        this.f56274 = new AbstractC14294[iM12998];
        while (true) {
            C3282[] c3282Arr = this.f56276;
            if (i >= c3282Arr.length) {
                return;
            }
            c3282Arr[i] = (C3282) c24738.f80094.m49623(c4028.m12998());
            this.f56274[i] = AbstractC14294.m34702(c24738, c4028);
            i++;
        }
    }

    public C17278(C20436 c20436, C3282[] c3282Arr, AbstractC14294[] abstractC14294Arr) {
        this.f56275 = c20436;
        if (c3282Arr.length != abstractC14294Arr.length) {
            throw new RuntimeException("The names and values parameters must be the same length");
        }
        this.f56276 = c3282Arr;
        this.f56274 = abstractC14294Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC14294[] m40569(C24738 c24738) {
        AbstractC14294[] abstractC14294Arr = this.f56274;
        if (abstractC14294Arr == null) {
            return null;
        }
        int length = abstractC14294Arr.length;
        AbstractC14294[] abstractC14294Arr2 = new AbstractC14294[length];
        for (int i = 0; i < length; i++) {
            abstractC14294Arr2[i] = AbstractC14294.m34703(c24738, abstractC14294Arr[i]);
        }
        return abstractC14294Arr2;
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ۙ */
    public void mo1281(C24166 c24166) {
        C20436 c20436 = this.f56275;
        c20436.m46860();
        c24166.m54135(c20436.m27353());
        C3282[] c3282Arr = this.f56276;
        Integer.toHexString(c3282Arr.length);
        c24166.m54135(c3282Arr.length);
        for (int i = 0; i < c3282Arr.length; i++) {
            c24166.m54137();
            c3282Arr[i].m10827();
            c24166.m54135(c3282Arr[i].m27353());
            c24166.m54137();
            this.f56274[i].mo1281(c24166);
            c24166.m54130();
            c24166.m54130();
        }
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ۙ */
    public int mo1280(int i) {
        int iM19213 = C6929.m19213(this.f56275.m27353()) + i;
        C3282[] c3282Arr = this.f56276;
        int iM19214 = C6929.m19213(c3282Arr.length) + iM19213;
        for (int i2 = 0; i2 < c3282Arr.length; i2++) {
            iM19214 = this.f56274[i2].mo1280(C6929.m19213(c3282Arr[i2].m27353()) + iM19214);
        }
        return iM19214;
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1283(AbstractC14294 abstractC14294) {
        C17278 c17278 = (C17278) abstractC14294;
        C20436 c20436 = c17278.f56275;
        C3282[] c3282Arr = c17278.f56276;
        int iCompareTo = this.f56275.compareTo(c20436);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        C3282[] c3282Arr2 = this.f56276;
        int length = c3282Arr2.length - c3282Arr.length;
        if (length != 0) {
            return length;
        }
        for (int i = 0; i < c3282Arr2.length; i++) {
            int iCompareTo2 = c3282Arr2[i].compareTo(c3282Arr[i]);
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
            length = this.f56274[i].compareTo(c17278.f56274[i]);
            if (length != 0) {
                return length;
            }
        }
        return length;
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ܽ */
    public final EnumC6837 mo1282() {
        return EnumC6837.VALUE_ANNOTATION;
    }

    public final int hashCode() {
        if (this.f56277 == 0) {
            this.f56277 = this.f56275.hashCode();
            int i = 0;
            while (true) {
                C3282[] c3282Arr = this.f56276;
                if (i >= c3282Arr.length) {
                    break;
                }
                int iHashCode = c3282Arr[i].hashCode() + (this.f56277 * 31);
                this.f56277 = iHashCode;
                this.f56277 = this.f56274[i].hashCode() + (iHashCode * 31);
                i++;
            }
        }
        return this.f56277;
    }
}
