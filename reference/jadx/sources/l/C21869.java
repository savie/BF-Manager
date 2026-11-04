package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.᩷ۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AZL */
/* JADX INFO: loaded from: classes.dex */
public final class C21869 extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C7126 f69700;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f69703;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C4715 f69704;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C4715 f69705;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C2651 f69706;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f69702 = 0;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f69701 = 0;

    public C21869(boolean z) {
        this.f69703 = z;
        this.f69704 = new C4715(z);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f69702;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f69703) {
            throw new NullPointerException("value == null");
        }
        C4715 c4715M49563 = m49563(obj, true);
        Object obj3 = c4715M49563.f16630;
        c4715M49563.f16630 = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f69705 = null;
        this.f69702 = 0;
        this.f69701++;
        C4715 c4715 = this.f69704;
        c4715.f16631 = c4715;
        c4715.f16629 = c4715;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4715 m49563(Object obj, boolean z) {
        int iCompareTo;
        C4715 c4715;
        C4715 c4716 = this.f69705;
        if (c4716 != null) {
            Comparable comparable = (Comparable) obj;
            while (true) {
                Object obj2 = c4716.f16633;
                comparable.getClass();
                iCompareTo = comparable.compareTo(obj2);
                if (iCompareTo == 0) {
                    return c4716;
                }
                C4715 c4717 = iCompareTo < 0 ? c4716.f16627 : c4716.f16628;
                if (c4717 == null) {
                    break;
                }
                c4716 = c4717;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z) {
            return null;
        }
        C4715 c4718 = this.f69704;
        if (c4716 == null) {
            if (!(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            c4715 = new C4715(this.f69703, c4716, obj, c4718, c4718.f16631);
            this.f69705 = c4715;
        } else {
            c4715 = new C4715(this.f69703, c4716, obj, c4718, c4718.f16631);
            if (iCompareTo < 0) {
                c4716.f16627 = c4715;
            } else {
                c4716.f16628 = c4715;
            }
            m49562(c4716, true);
        }
        this.f69702++;
        this.f69701++;
        return c4715;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        C4715 c4715M49563 = null;
        if (obj != null) {
            try {
                c4715M49563 = m49563(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return c4715M49563 != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        C4715 c4715M49563;
        if (obj != null) {
            try {
                c4715M49563 = m49563(obj, false);
            } catch (ClassCastException unused) {
                c4715M49563 = null;
            }
        } else {
            c4715M49563 = null;
        }
        if (c4715M49563 != null) {
            return c4715M49563.f16630;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        C4715 c4715M49563;
        if (obj != null) {
            try {
                c4715M49563 = m49563(obj, false);
            } catch (ClassCastException unused) {
                c4715M49563 = null;
            }
        } else {
            c4715M49563 = null;
        }
        if (c4715M49563 != null) {
            m49564(c4715M49563, true);
        }
        if (c4715M49563 != null) {
            return c4715M49563.f16630;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49564(C4715 c4715, boolean z) {
        int i;
        if (z) {
            C4715 c4716 = c4715.f16631;
            c4716.f16629 = c4715.f16629;
            c4715.f16629.f16631 = c4716;
        }
        C4715 c4717 = c4715.f16627;
        C4715 c4718 = c4715.f16628;
        C4715 c4719 = c4715.f16634;
        int i2 = 0;
        if (c4717 != null && c4718 != null) {
            if (c4717.f16635 <= c4718.f16635) {
                for (C4715 c47110 = c4718.f16627; c47110 != null; c47110 = c47110.f16627) {
                    c4718 = c47110;
                }
            } else {
                C4715 c47111 = c4717.f16628;
                while (true) {
                    C4715 c47112 = c47111;
                    c4718 = c4717;
                    c4717 = c47112;
                    if (c4717 == null) {
                        break;
                    } else {
                        c47111 = c4717.f16628;
                    }
                }
            }
            m49564(c4718, false);
            C4715 c47113 = c4715.f16627;
            if (c47113 != null) {
                i = c47113.f16635;
                c4718.f16627 = c47113;
                c47113.f16634 = c4718;
                c4715.f16627 = null;
            } else {
                i = 0;
            }
            C4715 c47114 = c4715.f16628;
            if (c47114 != null) {
                i2 = c47114.f16635;
                c4718.f16628 = c47114;
                c47114.f16634 = c4718;
                c4715.f16628 = null;
            }
            c4718.f16635 = Math.max(i, i2) + 1;
            m49560(c4715, c4718);
            return;
        }
        if (c4717 != null) {
            m49560(c4715, c4717);
            c4715.f16627 = null;
        } else if (c4718 != null) {
            m49560(c4715, c4718);
            c4715.f16628 = null;
        } else {
            m49560(c4715, (C4715) null);
        }
        m49562(c4719, false);
        this.f69702--;
        this.f69701++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m49560(C4715 c4715, C4715 c4716) {
        C4715 c4717 = c4715.f16634;
        c4715.f16634 = null;
        if (c4716 != null) {
            c4716.f16634 = c4717;
        }
        if (c4717 != null) {
            if (c4717.f16627 == c4715) {
                c4717.f16627 = c4716;
                return;
            } else {
                c4717.f16628 = c4716;
                return;
            }
        }
        this.f69705 = c4716;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m49562(C4715 c4715, boolean z) {
        while (c4715 != null) {
            C4715 c4716 = c4715.f16627;
            C4715 c4717 = c4715.f16628;
            int i = c4716 != null ? c4716.f16635 : 0;
            int i2 = c4717 != null ? c4717.f16635 : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                C4715 c4718 = c4717.f16627;
                C4715 c4719 = c4717.f16628;
                int i4 = (c4718 != null ? c4718.f16635 : 0) - (c4719 != null ? c4719.f16635 : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    m49559(c4715);
                } else {
                    m49561(c4717);
                    m49559(c4715);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                C4715 c47110 = c4716.f16627;
                C4715 c47111 = c4716.f16628;
                int i5 = (c47110 != null ? c47110.f16635 : 0) - (c47111 != null ? c47111.f16635 : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    m49561(c4715);
                } else {
                    m49559(c4716);
                    m49561(c4715);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                c4715.f16635 = i + 1;
                if (z) {
                    return;
                }
            } else {
                c4715.f16635 = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            c4715 = c4715.f16634;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m49559(C4715 c4715) {
        C4715 c4716 = c4715.f16627;
        C4715 c4717 = c4715.f16628;
        C4715 c4718 = c4717.f16627;
        C4715 c4719 = c4717.f16628;
        c4715.f16628 = c4718;
        if (c4718 != null) {
            c4718.f16634 = c4715;
        }
        m49560(c4715, c4717);
        c4717.f16627 = c4715;
        c4715.f16634 = c4717;
        int iMax = Math.max(c4716 != null ? c4716.f16635 : 0, c4718 != null ? c4718.f16635 : 0) + 1;
        c4715.f16635 = iMax;
        c4717.f16635 = Math.max(iMax, c4719 != null ? c4719.f16635 : 0) + 1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m49561(C4715 c4715) {
        C4715 c4716 = c4715.f16627;
        C4715 c4717 = c4715.f16628;
        C4715 c4718 = c4716.f16627;
        C4715 c4719 = c4716.f16628;
        c4715.f16627 = c4719;
        if (c4719 != null) {
            c4719.f16634 = c4715;
        }
        m49560(c4715, c4716);
        c4716.f16628 = c4715;
        c4715.f16634 = c4716;
        int iMax = Math.max(c4717 != null ? c4717.f16635 : 0, c4719 != null ? c4719.f16635 : 0) + 1;
        c4715.f16635 = iMax;
        c4716.f16635 = Math.max(iMax, c4718 != null ? c4718.f16635 : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C2651 c2651 = this.f69706;
        if (c2651 != null) {
            return c2651;
        }
        C2651 c2652 = new C2651(this);
        this.f69706 = c2652;
        return c2652;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C7126 c7126 = this.f69700;
        if (c7126 != null) {
            return c7126;
        }
        C7126 c7127 = new C7126(this);
        this.f69700 = c7127;
        return c7127;
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }
}
