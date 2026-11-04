package l;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֫᩶᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes3.dex */
public class C2175 extends AbstractC17836 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C4214 f7152 = new C4214(null, null, null, null);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C4214[] f7153;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f7154;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C4214 f7155;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f7156;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C2175 f7157;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f7158;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f7159;

    public /* synthetic */ C2175(C14654 c14654, AbstractC11781 abstractC11781, C4214[] c4214Arr) {
        this((C2175) c14654, abstractC11781, c4214Arr);
    }

    public C2175(C2175 c2175, AbstractC11781 abstractC11781, C4214[] c4214Arr) {
        super(abstractC11781);
        this.f7158 = 0;
        this.f7156 = 0;
        this.f7157 = c2175;
        C11972.m30026(abstractC11781 != null);
        this.f7153 = c4214Arr;
        this.f7159 = c4214Arr.length - 1;
    }

    public C2175(C2175 c2175, AbstractC11781 abstractC11781, C4214[] c4214Arr, int i) {
        this(c2175, abstractC11781, c4214Arr);
        this.f7158 = i;
    }

    public C2175(AbstractC11781 abstractC11781) {
        this((C2175) null, abstractC11781, new C4214[16]);
    }

    @Override // l.AbstractC17836
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractC17836 mo7478(AbstractC11781 abstractC11781) {
        C2175 c2175 = new C2175(this, abstractC11781, this.f7153, this.f7158);
        this.f7154++;
        return c2175;
    }

    @Override // l.AbstractC17836
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC17836 mo7486(AbstractC11781 abstractC11781) {
        if (this.f7154 > 0) {
            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
            for (C2175 c2175 = this; c2175 != null; c2175 = c2175.f7157) {
                setNewSetFromMap.add(c2175);
            }
            C4214[] c4214Arr = this.f7153;
            C4214[] c4214Arr2 = new C4214[c4214Arr.length];
            int i = 0;
            for (int i2 = 0; i2 < c4214Arr.length; i2++) {
                C4214 c4214 = c4214Arr[i2];
                while (c4214 != null && c4214 != f7152 && !setNewSetFromMap.contains(c4214.f15399)) {
                    c4214 = c4214.f15402;
                }
                if (c4214 != null) {
                    i++;
                    c4214Arr2[i2] = c4214;
                }
            }
            return new C2175(this, abstractC11781, c4214Arr2, i);
        }
        return new C2175(this, abstractC11781, (C4214[]) this.f7153.clone(), this.f7158);
    }

    @Override // l.AbstractC17836
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC17836 mo7484() {
        C11972.m30026(this.f7154 == 0);
        C4214[] c4214Arr = this.f7153;
        C2175 c2175 = this.f7157;
        if (c4214Arr != c2175.f7153) {
            return c2175;
        }
        while (true) {
            C4214 c4214 = this.f7155;
            if (c4214 == null) {
                break;
            }
            int iM7482 = m7482(c4214.f15400.f38072);
            C4214 c4215 = this.f7153[iM7482];
            C4214 c4216 = this.f7155;
            C11972.m30023(c4216.f15400, c4215 == c4216);
            this.f7153[iM7482] = this.f7155.f15402;
            this.f7155 = this.f7155.f15398;
        }
        C11972.m30026(c2175.f7154 > 0);
        c2175.f7154--;
        c2175.f7158 = this.f7158;
        return c2175;
    }

    @Override // l.AbstractC17836
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public void mo7481(AbstractC11781 abstractC11781) {
        int i = 0;
        C11972.m30026(this.f7154 == 0);
        int i2 = this.f7158 * 3;
        int i3 = this.f7159 * 2;
        C4214 c4214 = f7152;
        if (i2 >= i3) {
            C11972.m30026(this.f7154 == 0);
            C4214[] c4214Arr = this.f7153;
            int length = c4214Arr.length * 2;
            C4214[] c4214Arr2 = new C4214[length];
            C2175 c2175 = this;
            while (c2175 != null) {
                if (c2175.f7153 == c4214Arr) {
                    C11972.m30026(c2175 == this || c2175.f7154 != 0);
                    c2175.f7153 = c4214Arr2;
                    c2175.f7159 = length - 1;
                }
                c2175 = c2175.f7157;
            }
            int length2 = c4214Arr.length;
            while (true) {
                length2--;
                if (length2 < 0) {
                    break;
                }
                C4214 c4215 = c4214Arr[length2];
                if (c4215 != null && c4215 != c4214) {
                    this.f7153[m7482(c4215.f15400.f38072)] = c4215;
                    i++;
                }
            }
            this.f7158 = i;
        }
        int iM7482 = m7482(abstractC11781.f38072);
        C4214 c4216 = this.f7153[iM7482];
        if (c4216 == null) {
            this.f7158++;
        } else {
            c4214 = c4216;
        }
        C4214 c4217 = new C4214(abstractC11781, c4214, this.f7155, this);
        this.f7153[iM7482] = c4217;
        this.f7155 = c4217;
        this.f53082.m56485(this, abstractC11781);
    }

    @Override // l.AbstractC17836
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public void mo7479(AbstractC11781 abstractC11781) {
        C11972.m30026(this.f7154 == 0);
        C4214 c4214M7483 = m7483(abstractC11781.f38072, new C11864(1, abstractC11781));
        if (c4214M7483.f15399 == null) {
            return;
        }
        int iM7482 = m7482(abstractC11781.f38072);
        C4214[] c4214Arr = this.f7153;
        C4214 c4214 = c4214Arr[iM7482];
        if (c4214 == c4214M7483) {
            c4214Arr[iM7482] = c4214M7483.f15402;
        } else {
            while (c4214.f15402 != c4214M7483) {
                c4214 = c4214.f15402;
            }
            c4214.f15402 = c4214M7483.f15402;
        }
        if (this.f7155 == c4214M7483) {
            C4214 c4215 = c4214M7483.f15398;
            this.f7155 = c4215;
            if (c4215 != null) {
                c4215.f15401 = null;
            }
        } else {
            C11972.m30023(c4214M7483.f15400, c4214M7483.f15401 != null);
            C4214 c4216 = c4214M7483.f15401;
            c4216.f15398 = c4214M7483.f15398;
            C4214 c4217 = c4214M7483.f15398;
            if (c4217 != null) {
                c4217.f15401 = c4216;
            }
        }
        this.f7156++;
        this.f53082.m56486(this, abstractC11781);
    }

    @Override // l.AbstractC17836
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void mo7480(AbstractC11781 abstractC11781) {
        C2175 c2175;
        C11972.m30026(this.f7154 == 0);
        C4214 c4214Mo7477 = mo7477(abstractC11781.f38072);
        while (true) {
            c2175 = c4214Mo7477.f15399;
            if (c2175 != this || c4214Mo7477.f15400.f38066 == abstractC11781.f38066) {
                break;
            } else {
                c4214Mo7477 = c4214Mo7477.m13478();
            }
        }
        if (c2175 != this) {
            mo7481(abstractC11781);
        }
    }

    @Override // l.AbstractC16344
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean mo7485(AbstractC11781 abstractC11781) {
        for (C4214 c4214Mo7477 = mo7477(abstractC11781.f38072); c4214Mo7477.f15399 == this; c4214Mo7477 = c4214Mo7477.m13478()) {
            if (c4214Mo7477.f15400 == abstractC11781) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C4214 mo7477(AbstractC19728 abstractC19728) {
        return m7483(abstractC19728, null);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C4214 m7483(AbstractC19728 abstractC19728, Predicate predicate) {
        C4214 c4214 = this.f7153[m7482(abstractC19728)];
        C4214 c4215 = f7152;
        if (c4214 == null || c4214 == c4215) {
            return c4215;
        }
        while (c4214.f15399 != null) {
            AbstractC11781 abstractC11781 = c4214.f15400;
            if (abstractC11781.f38072 == abstractC19728 && (predicate == null || predicate.test(abstractC11781))) {
                break;
            }
            c4214 = c4214.f15402;
        }
        return c4214;
    }

    @Override // l.AbstractC16344
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC11781 mo7474(AbstractC19728 abstractC19728, Predicate predicate) {
        return m7483(abstractC19728, predicate).f15400;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m7482(AbstractC19728 abstractC19728) {
        int iHashCode = abstractC19728.hashCode();
        int i = this.f7159;
        int i2 = iHashCode & i;
        int i3 = i - ((iHashCode + (iHashCode >> 16)) << 1);
        int i4 = -1;
        while (true) {
            C4214 c4214 = this.f7153[i2];
            if (c4214 != null) {
                if (c4214 == f7152) {
                    if (i4 < 0) {
                        i4 = i2;
                    }
                } else if (c4214.f15400.f38072 == abstractC19728) {
                    break;
                }
                i2 = (i2 + i3) & this.f7159;
            } else if (i4 >= 0) {
                return i4;
            }
        }
        return i2;
    }

    @Override // l.AbstractC16344
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo7476(C20548 c20548) {
        return ((C20074) mo7472(c20548, EnumC13908.NON_RECURSIVE)).iterator().hasNext();
    }

    @Override // l.AbstractC16344
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Iterable mo7472(Predicate predicate, EnumC13908 enumC13908) {
        return new C20074(this, enumC13908, predicate);
    }

    @Override // l.AbstractC16344
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Iterable mo7473(AbstractC19728 abstractC19728, Predicate predicate, EnumC13908 enumC13908) {
        return new C15598(this, abstractC19728, predicate, enumC13908);
    }

    @Override // l.AbstractC16344
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC16344 mo7475(AbstractC11781 abstractC11781) {
        for (C4214 c4214Mo7477 = mo7477(abstractC11781.f38072); c4214Mo7477.f15399 != null; c4214Mo7477 = c4214Mo7477.m13478()) {
            if (c4214Mo7477.f15400 == abstractC11781) {
                return this;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Scope[");
        for (C2175 c2175 = this; c2175 != null; c2175 = c2175.f7157) {
            if (c2175 != this) {
                sb.append(" | ");
            }
            for (C4214 c4214 = c2175.f7155; c4214 != null; c4214 = c4214.f15398) {
                if (c4214 != c2175.f7155) {
                    sb.append(", ");
                }
                sb.append(c4214.f15400);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
