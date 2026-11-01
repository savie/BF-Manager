package l;

/* JADX INFO: renamed from: l.ۛ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M5CF */
/* JADX INFO: loaded from: classes3.dex */
public class C5712 extends AbstractC11833 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C14655[] f19459;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C1953 f19460;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC11833[] f19461;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f19462 = 0;

    public C5712(C12063 c12063, C13825 c13825) {
        int i = 0;
        this.f19460 = (C1953) c12063.f40367.m44688(c13825.m33647());
        int iM33647 = c13825.m33647();
        this.f19459 = new C14655[iM33647];
        this.f19461 = new AbstractC11833[iM33647];
        while (true) {
            C14655[] c14655Arr = this.f19459;
            if (i >= c14655Arr.length) {
                return;
            }
            c14655Arr[i] = (C14655) c12063.f40354.m44688(c13825.m33647());
            this.f19461[i] = AbstractC11833.m29516(c12063, c13825);
            i++;
        }
    }

    public C5712(C1953 c1953, C14655[] c14655Arr, AbstractC11833[] abstractC11833Arr) {
        this.f19460 = c1953;
        if (c14655Arr.length != abstractC11833Arr.length) {
            throw new RuntimeException("The names and values parameters must be the same length");
        }
        this.f19459 = c14655Arr;
        this.f19461 = abstractC11833Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC11833[] m15746(C12063 c12063) {
        AbstractC11833[] abstractC11833Arr = this.f19461;
        if (abstractC11833Arr == null) {
            return null;
        }
        int length = abstractC11833Arr.length;
        AbstractC11833[] abstractC11833Arr2 = new AbstractC11833[length];
        for (int i = 0; i < length; i++) {
            abstractC11833Arr2[i] = AbstractC11833.m29515(c12063, abstractC11833Arr[i]);
        }
        return abstractC11833Arr2;
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ۙ */
    public void mo4463(C4651 c4651) {
        C1953 c1953 = this.f19460;
        c1953.m6314();
        c4651.m12842(c1953.m23325());
        C14655[] c14655Arr = this.f19459;
        Integer.toHexString(c14655Arr.length);
        c4651.m12842(c14655Arr.length);
        for (int i = 0; i < c14655Arr.length; i++) {
            c4651.m12840();
            c14655Arr[i].m35176();
            c4651.m12842(c14655Arr[i].m23325());
            c4651.m12840();
            this.f19461[i].mo4463(c4651);
            c4651.m12834();
            c4651.m12834();
        }
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ۙ */
    public int mo4462(int i) {
        int iM33072 = C13530.m33072(this.f19460.m23325()) + i;
        C14655[] c14655Arr = this.f19459;
        int iM33073 = C13530.m33072(c14655Arr.length) + iM33072;
        for (int i2 = 0; i2 < c14655Arr.length; i2++) {
            iM33073 = this.f19461[i2].mo4462(C13530.m33072(c14655Arr[i2].m23325()) + iM33073);
        }
        return iM33073;
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ܰ */
    public final int mo4464(AbstractC11833 abstractC11833) {
        C5712 c5712 = (C5712) abstractC11833;
        C1953 c1953 = c5712.f19460;
        C14655[] c14655Arr = c5712.f19459;
        int iCompareTo = this.f19460.compareTo(c1953);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        C14655[] c14655Arr2 = this.f19459;
        int length = c14655Arr2.length - c14655Arr.length;
        if (length != 0) {
            return length;
        }
        for (int i = 0; i < c14655Arr2.length; i++) {
            int iCompareTo2 = c14655Arr2[i].compareTo(c14655Arr[i]);
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
            length = this.f19461[i].compareTo(c5712.f19461[i]);
            if (length != 0) {
                return length;
            }
        }
        return length;
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ᩸ */
    public final EnumC18182 mo4465() {
        return EnumC18182.VALUE_ANNOTATION;
    }

    public final int hashCode() {
        if (this.f19462 == 0) {
            this.f19462 = this.f19460.hashCode();
            int i = 0;
            while (true) {
                C14655[] c14655Arr = this.f19459;
                if (i >= c14655Arr.length) {
                    break;
                }
                int iHashCode = c14655Arr[i].hashCode() + (this.f19462 * 31);
                this.f19462 = iHashCode;
                this.f19462 = this.f19461[i].hashCode() + (iHashCode * 31);
                i++;
            }
        }
        return this.f19462;
    }
}
