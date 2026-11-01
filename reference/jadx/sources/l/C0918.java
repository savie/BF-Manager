package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.֨ۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AZL */
/* JADX INFO: loaded from: classes2.dex */
public final class C0918 extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Comparator f3675 = new C2952();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C13620 f3676;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C22086 f3677;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f3678;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C2329 f3679;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f3680;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C22086 f3681;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f3682;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Comparator f3683;

    public C0918() {
        this(true);
    }

    public C0918(boolean z) {
        this.f3678 = 0;
        this.f3682 = 0;
        this.f3683 = f3675;
        this.f3680 = z;
        this.f3681 = new C22086(z);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f3678;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f3680) {
            throw new NullPointerException("value == null");
        }
        C22086 c22086M3643 = m3643(obj, true);
        Object obj3 = c22086M3643.f71549;
        c22086M3643.f71549 = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f3677 = null;
        this.f3678 = 0;
        this.f3682++;
        C22086 c22086 = this.f3681;
        c22086.f71542 = c22086;
        c22086.f71544 = c22086;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22086 m3643(Object obj, boolean z) {
        int iCompare;
        C22086 c22086;
        C22086 c22087 = this.f3677;
        Comparator comparator = f3675;
        Comparator comparator2 = this.f3683;
        if (c22087 != null) {
            Comparable comparable = comparator2 == comparator ? (Comparable) obj : null;
            while (true) {
                Object obj2 = c22087.f71541;
                if (comparable != null) {
                    iCompare = comparable.compareTo(obj2);
                } else {
                    iCompare = comparator2.compare(obj, obj2);
                }
                if (iCompare == 0) {
                    return c22087;
                }
                C22086 c22088 = iCompare < 0 ? c22087.f71546 : c22087.f71543;
                if (c22088 == null) {
                    break;
                }
                c22087 = c22088;
            }
        } else {
            iCompare = 0;
        }
        if (!z) {
            return null;
        }
        C22086 c22089 = this.f3681;
        if (c22087 == null) {
            if (comparator2 == comparator && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            c22086 = new C22086(this.f3680, c22087, obj, c22089, c22089.f71542);
            this.f3677 = c22086;
        } else {
            c22086 = new C22086(this.f3680, c22087, obj, c22089, c22089.f71542);
            if (iCompare < 0) {
                c22087.f71546 = c22086;
            } else {
                c22087.f71543 = c22086;
            }
            m3642(c22087, true);
        }
        this.f3678++;
        this.f3682++;
        return c22086;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        C22086 c22086M3643 = null;
        if (obj != null) {
            try {
                c22086M3643 = m3643(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return c22086M3643 != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        C22086 c22086M3643;
        if (obj != null) {
            try {
                c22086M3643 = m3643(obj, false);
            } catch (ClassCastException unused) {
                c22086M3643 = null;
            }
        } else {
            c22086M3643 = null;
        }
        if (c22086M3643 != null) {
            return c22086M3643.f71549;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        C22086 c22086M3643;
        if (obj != null) {
            try {
                c22086M3643 = m3643(obj, false);
            } catch (ClassCastException unused) {
                c22086M3643 = null;
            }
        } else {
            c22086M3643 = null;
        }
        if (c22086M3643 != null) {
            m3644(c22086M3643, true);
        }
        if (c22086M3643 != null) {
            return c22086M3643.f71549;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3644(C22086 c22086, boolean z) {
        int i;
        if (z) {
            C22086 c22087 = c22086.f71542;
            c22087.f71544 = c22086.f71544;
            c22086.f71544.f71542 = c22087;
        }
        C22086 c22088 = c22086.f71546;
        C22086 c22089 = c22086.f71543;
        C22086 c220810 = c22086.f71547;
        int i2 = 0;
        if (c22088 != null && c22089 != null) {
            if (c22088.f71548 <= c22089.f71548) {
                for (C22086 c220811 = c22089.f71546; c220811 != null; c220811 = c220811.f71546) {
                    c22089 = c220811;
                }
            } else {
                C22086 c220812 = c22088.f71543;
                while (true) {
                    C22086 c220813 = c220812;
                    c22089 = c22088;
                    c22088 = c220813;
                    if (c22088 == null) {
                        break;
                    } else {
                        c220812 = c22088.f71543;
                    }
                }
            }
            m3644(c22089, false);
            C22086 c220814 = c22086.f71546;
            if (c220814 != null) {
                i = c220814.f71548;
                c22089.f71546 = c220814;
                c220814.f71547 = c22089;
                c22086.f71546 = null;
            } else {
                i = 0;
            }
            C22086 c220815 = c22086.f71543;
            if (c220815 != null) {
                i2 = c220815.f71548;
                c22089.f71543 = c220815;
                c220815.f71547 = c22089;
                c22086.f71543 = null;
            }
            c22089.f71548 = Math.max(i, i2) + 1;
            m3640(c22086, c22089);
            return;
        }
        if (c22088 != null) {
            m3640(c22086, c22088);
            c22086.f71546 = null;
        } else if (c22089 != null) {
            m3640(c22086, c22089);
            c22086.f71543 = null;
        } else {
            m3640(c22086, (C22086) null);
        }
        m3642(c220810, false);
        this.f3678--;
        this.f3682++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m3640(C22086 c22086, C22086 c22087) {
        C22086 c22088 = c22086.f71547;
        c22086.f71547 = null;
        if (c22087 != null) {
            c22087.f71547 = c22088;
        }
        if (c22088 != null) {
            if (c22088.f71546 == c22086) {
                c22088.f71546 = c22087;
                return;
            } else {
                c22088.f71543 = c22087;
                return;
            }
        }
        this.f3677 = c22087;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m3642(C22086 c22086, boolean z) {
        while (c22086 != null) {
            C22086 c22087 = c22086.f71546;
            C22086 c22088 = c22086.f71543;
            int i = c22087 != null ? c22087.f71548 : 0;
            int i2 = c22088 != null ? c22088.f71548 : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                C22086 c22089 = c22088.f71546;
                C22086 c220810 = c22088.f71543;
                int i4 = (c22089 != null ? c22089.f71548 : 0) - (c220810 != null ? c220810.f71548 : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    m3639(c22086);
                } else {
                    m3641(c22088);
                    m3639(c22086);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                C22086 c220811 = c22087.f71546;
                C22086 c220812 = c22087.f71543;
                int i5 = (c220811 != null ? c220811.f71548 : 0) - (c220812 != null ? c220812.f71548 : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    m3641(c22086);
                } else {
                    m3639(c22087);
                    m3641(c22086);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                c22086.f71548 = i + 1;
                if (z) {
                    return;
                }
            } else {
                c22086.f71548 = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            c22086 = c22086.f71547;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m3639(C22086 c22086) {
        C22086 c22087 = c22086.f71546;
        C22086 c22088 = c22086.f71543;
        C22086 c22089 = c22088.f71546;
        C22086 c220810 = c22088.f71543;
        c22086.f71543 = c22089;
        if (c22089 != null) {
            c22089.f71547 = c22086;
        }
        m3640(c22086, c22088);
        c22088.f71546 = c22086;
        c22086.f71547 = c22088;
        int iMax = Math.max(c22087 != null ? c22087.f71548 : 0, c22089 != null ? c22089.f71548 : 0) + 1;
        c22086.f71548 = iMax;
        c22088.f71548 = Math.max(iMax, c220810 != null ? c220810.f71548 : 0) + 1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m3641(C22086 c22086) {
        C22086 c22087 = c22086.f71546;
        C22086 c22088 = c22086.f71543;
        C22086 c22089 = c22087.f71546;
        C22086 c220810 = c22087.f71543;
        c22086.f71546 = c220810;
        if (c220810 != null) {
            c220810.f71547 = c22086;
        }
        m3640(c22086, c22087);
        c22087.f71543 = c22086;
        c22086.f71547 = c22087;
        int iMax = Math.max(c22088 != null ? c22088.f71548 : 0, c220810 != null ? c220810.f71548 : 0) + 1;
        c22086.f71548 = iMax;
        c22087.f71548 = Math.max(iMax, c22089 != null ? c22089.f71548 : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C13620 c13620 = this.f3676;
        if (c13620 != null) {
            return c13620;
        }
        C13620 c13621 = new C13620(this);
        this.f3676 = c13621;
        return c13621;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C2329 c2329 = this.f3679;
        if (c2329 != null) {
            return c2329;
        }
        C2329 c23210 = new C2329(this);
        this.f3679 = c23210;
        return c23210;
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }
}
