package l;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۧ۠ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes4.dex */
public class C10873 extends AbstractC9462 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C22161 f36965 = new C22161(null, null, null, null);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f36966;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f36967;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C22161[] f36968;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f36969;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C22161 f36970;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f36971;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C10873 f36972;

    public /* synthetic */ C10873(C0993 c0993, AbstractC23903 abstractC23903, C22161[] c22161Arr) {
        this((C10873) c0993, abstractC23903, c22161Arr);
    }

    public C10873(C10873 c10873, AbstractC23903 abstractC23903, C22161[] c22161Arr) {
        super(abstractC23903);
        this.f36969 = 0;
        this.f36966 = 0;
        this.f36972 = c10873;
        C6171.m17176(abstractC23903 != null);
        this.f36968 = c22161Arr;
        this.f36967 = c22161Arr.length - 1;
    }

    public C10873(C10873 c10873, AbstractC23903 abstractC23903, C22161[] c22161Arr, int i) {
        this(c10873, abstractC23903, c22161Arr);
        this.f36969 = i;
    }

    public C10873(AbstractC23903 abstractC23903) {
        this((C10873) null, abstractC23903, new C22161[16]);
    }

    @Override // l.AbstractC9462
    /* JADX INFO: renamed from: ۨ */
    public AbstractC9462 mo3805(AbstractC23903 abstractC23903) {
        C10873 c10873 = new C10873(this, abstractC23903, this.f36968, this.f36969);
        this.f36971++;
        return c10873;
    }

    @Override // l.AbstractC9462
    /* JADX INFO: renamed from: ۖ */
    public AbstractC9462 mo3801(AbstractC23903 abstractC23903) {
        if (this.f36971 > 0) {
            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
            for (C10873 c10873 = this; c10873 != null; c10873 = c10873.f36972) {
                setNewSetFromMap.add(c10873);
            }
            C22161[] c22161Arr = this.f36968;
            C22161[] c22161Arr2 = new C22161[c22161Arr.length];
            int i = 0;
            for (int i2 = 0; i2 < c22161Arr.length; i2++) {
                C22161 c22161 = c22161Arr[i2];
                while (c22161 != null && c22161 != f36965 && !setNewSetFromMap.contains(c22161.f72487)) {
                    c22161 = c22161.f72484;
                }
                if (c22161 != null) {
                    i++;
                    c22161Arr2[i2] = c22161;
                }
            }
            return new C10873(this, abstractC23903, c22161Arr2, i);
        }
        return new C10873(this, abstractC23903, (C22161[]) this.f36968.clone(), this.f36969);
    }

    @Override // l.AbstractC9462
    /* JADX INFO: renamed from: ܰ */
    public AbstractC9462 mo24225() {
        C6171.m17176(this.f36971 == 0);
        C22161[] c22161Arr = this.f36968;
        C10873 c10873 = this.f36972;
        if (c22161Arr != c10873.f36968) {
            return c10873;
        }
        while (true) {
            C22161 c22161 = this.f36970;
            if (c22161 == null) {
                break;
            }
            int iM27241 = m27241(c22161.f72486.f77453);
            C22161 c22162 = this.f36968[iM27241];
            C22161 c22163 = this.f36970;
            C6171.m17173(c22163.f72486, c22162 == c22163);
            this.f36968[iM27241] = this.f36970.f72484;
            this.f36970 = this.f36970.f72485;
        }
        C6171.m17176(c10873.f36971 > 0);
        c10873.f36971--;
        c10873.f36969 = this.f36969;
        return c10873;
    }

    @Override // l.AbstractC9462
    /* JADX INFO: renamed from: ۚ */
    public void mo24224(AbstractC23903 abstractC23903) {
        int i = 0;
        C6171.m17176(this.f36971 == 0);
        int i2 = this.f36969 * 3;
        int i3 = this.f36967 * 2;
        C22161 c22161 = f36965;
        if (i2 >= i3) {
            C6171.m17176(this.f36971 == 0);
            C22161[] c22161Arr = this.f36968;
            int length = c22161Arr.length * 2;
            C22161[] c22161Arr2 = new C22161[length];
            C10873 c10873 = this;
            while (c10873 != null) {
                if (c10873.f36968 == c22161Arr) {
                    C6171.m17176(c10873 == this || c10873.f36971 != 0);
                    c10873.f36968 = c22161Arr2;
                    c10873.f36967 = length - 1;
                }
                c10873 = c10873.f36972;
            }
            int length2 = c22161Arr.length;
            while (true) {
                length2--;
                if (length2 < 0) {
                    break;
                }
                C22161 c22162 = c22161Arr[length2];
                if (c22162 != null && c22162 != c22161) {
                    this.f36968[m27241(c22162.f72486.f77453)] = c22162;
                    i++;
                }
            }
            this.f36969 = i;
        }
        int iM27241 = m27241(abstractC23903.f77453);
        C22161 c22163 = this.f36968[iM27241];
        if (c22163 == null) {
            this.f36969++;
        } else {
            c22161 = c22163;
        }
        C22161 c22164 = new C22161(abstractC23903, c22161, this.f36970, this);
        this.f36968[iM27241] = c22164;
        this.f36970 = c22164;
        this.f11718.m34669(this, abstractC23903);
    }

    @Override // l.AbstractC9462
    /* JADX INFO: renamed from: ֨ */
    public void mo24223(final AbstractC23903 abstractC23903) {
        C6171.m17176(this.f36971 == 0);
        C22161 c22161M27242 = m27242(abstractC23903.f77453, new Predicate() { // from class: l.۫۠ۤ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C8512.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo9645negate() {
                return C8512.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C8512.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((AbstractC23903) obj) == abstractC23903;
            }
        });
        if (c22161M27242.f72487 == null) {
            return;
        }
        int iM27241 = m27241(abstractC23903.f77453);
        C22161[] c22161Arr = this.f36968;
        C22161 c22161 = c22161Arr[iM27241];
        if (c22161 == c22161M27242) {
            c22161Arr[iM27241] = c22161M27242.f72484;
        } else {
            while (c22161.f72484 != c22161M27242) {
                c22161 = c22161.f72484;
            }
            c22161.f72484 = c22161M27242.f72484;
        }
        if (this.f36970 == c22161M27242) {
            C22161 c22162 = c22161M27242.f72485;
            this.f36970 = c22162;
            if (c22162 != null) {
                c22162.f72488 = null;
            }
        } else {
            C6171.m17173(c22161M27242.f72486, c22161M27242.f72488 != null);
            C22161 c22163 = c22161M27242.f72488;
            c22163.f72485 = c22161M27242.f72485;
            C22161 c22164 = c22161M27242.f72485;
            if (c22164 != null) {
                c22164.f72488 = c22163;
            }
        }
        this.f36966++;
        this.f11718.m34670(this, abstractC23903);
    }

    @Override // l.AbstractC9462
    /* JADX INFO: renamed from: ᩹ */
    public void mo24226(AbstractC23903 abstractC23903) {
        C10873 c10873;
        C6171.m17176(this.f36971 == 0);
        C22161 c22161Mo3806 = mo3806(abstractC23903.f77453);
        while (true) {
            c10873 = c22161Mo3806.f72487;
            if (c10873 != this || c22161Mo3806.f72486.f77452 == abstractC23903.f77452) {
                break;
            } else {
                c22161Mo3806 = c22161Mo3806.m49171();
            }
        }
        if (c10873 != this) {
            mo24224(abstractC23903);
        }
    }

    @Override // l.AbstractC3110
    /* JADX INFO: renamed from: ܰ */
    public boolean mo9331(AbstractC23903 abstractC23903) {
        for (C22161 c22161Mo3806 = mo3806(abstractC23903.f77453); c22161Mo3806.f72487 == this; c22161Mo3806 = c22161Mo3806.m49171()) {
            if (c22161Mo3806.f72486 == abstractC23903) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ */
    public C22161 mo3806(AbstractC11242 abstractC11242) {
        return m27242(abstractC11242, null);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22161 m27242(AbstractC11242 abstractC11242, Predicate predicate) {
        C22161 c22161 = this.f36968[m27241(abstractC11242)];
        C22161 c22162 = f36965;
        if (c22161 == null || c22161 == c22162) {
            return c22162;
        }
        while (c22161.f72487 != null) {
            AbstractC23903 abstractC23903 = c22161.f72486;
            if (abstractC23903.f77453 == abstractC11242 && (predicate == null || predicate.test(abstractC23903))) {
                break;
            }
            c22161 = c22161.f72484;
        }
        return c22161;
    }

    @Override // l.AbstractC3110
    /* JADX INFO: renamed from: ۙ */
    public AbstractC23903 mo3804(AbstractC11242 abstractC11242, Predicate predicate) {
        return m27242(abstractC11242, predicate).f72486;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m27241(AbstractC11242 abstractC11242) {
        int iHashCode = abstractC11242.hashCode();
        int i = this.f36967;
        int i2 = iHashCode & i;
        int i3 = i - ((iHashCode + (iHashCode >> 16)) << 1);
        int i4 = -1;
        while (true) {
            C22161 c22161 = this.f36968[i2];
            if (c22161 != null) {
                if (c22161 == f36965) {
                    if (i4 < 0) {
                        i4 = i2;
                    }
                } else if (c22161.f72486.f77453 == abstractC11242) {
                    break;
                }
                i2 = (i2 + i3) & this.f36967;
            } else if (i4 >= 0) {
                return i4;
            }
        }
        return i2;
    }

    @Override // l.AbstractC3110
    /* JADX INFO: renamed from: ۙ */
    public boolean mo9330(C18798 c18798) {
        return ((C0288) mo3802(c18798, EnumC10167.NON_RECURSIVE)).iterator().hasNext();
    }

    @Override // l.AbstractC3110
    /* JADX INFO: renamed from: ۙ */
    public Iterable mo3802(Predicate predicate, EnumC10167 enumC10167) {
        return new C0288(this, enumC10167, predicate);
    }

    @Override // l.AbstractC3110
    /* JADX INFO: renamed from: ۙ */
    public Iterable mo3803(AbstractC11242 abstractC11242, Predicate predicate, EnumC10167 enumC10167) {
        return new C16517(this, abstractC11242, predicate, enumC10167);
    }

    @Override // l.AbstractC3110
    /* JADX INFO: renamed from: ۙ */
    public AbstractC3110 mo9328(AbstractC23903 abstractC23903) {
        for (C22161 c22161Mo3806 = mo3806(abstractC23903.f77453); c22161Mo3806.f72487 != null; c22161Mo3806 = c22161Mo3806.m49171()) {
            if (c22161Mo3806.f72486 == abstractC23903) {
                return this;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Scope[");
        for (C10873 c10873 = this; c10873 != null; c10873 = c10873.f36972) {
            if (c10873 != this) {
                sb.append(" | ");
            }
            for (C22161 c22161 = c10873.f36970; c22161 != null; c22161 = c22161.f72485) {
                if (c22161 != c10873.f36970) {
                    sb.append(", ");
                }
                sb.append(c22161.f72486);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
