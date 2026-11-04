package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۢۖۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4IX8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9812 extends AbstractC16678 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C22913 f31605;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final EnumC18763 f31606;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final List f31607;

    public C9812(C22913 c22913) {
        this.f31606 = EnumC18763.COMPARE;
        this.f31605 = c22913;
        this.f31607 = Collections.EMPTY_LIST;
    }

    public C9812(EnumC18763 enumC18763, List list) {
        this.f31606 = enumC18763;
        this.f31607 = list;
        this.f31605 = null;
    }

    public C9812(C9812 c9812) {
        this.f31606 = c9812.f31606;
        this.f31605 = c9812.f31605;
        if (c9812.f31606 == EnumC18763.COMPARE) {
            this.f31607 = Collections.EMPTY_LIST;
        } else {
            this.f31607 = new ArrayList(c9812.f31607);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9812 m25576(C17489 c17489) {
        return new C9812(new C22913(c17489));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9812 m25575(C9812 c9812, C9812 c9813, C9812 c9814) {
        return new C9812(EnumC18763.TERNARY, Arrays.asList(c9812, c9813, c9814));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9812 m25574(C9812 c9812) {
        EnumC18763 enumC18763 = c9812.f31606;
        int iOrdinal = enumC18763.ordinal();
        if (iOrdinal == 0) {
            C22913 c22913 = c9812.f31605;
            c22913.m51666();
            return new C9812(c22913);
        }
        if (iOrdinal == 1) {
            return m25575(c9812.m25580(), m25579(c9812.m25588()), m25579(c9812.m25584()));
        }
        if (iOrdinal == 2) {
            return c9812.m25580();
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            List list = c9812.f31607;
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m25574((C9812) it.next()));
            }
            EnumC18763 enumC18764 = EnumC18763.AND;
            if (enumC18763 == enumC18764) {
                enumC18764 = EnumC18763.OR;
            }
            return new C9812(enumC18764, arrayList);
        }
        throw new C8597("Unknown mode for invert: " + enumC18763);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9812 m25577(EnumC18763 enumC18763, C9812 c9812, C9812 c9813) {
        if (c9812.f31606 == enumC18763) {
            C9812 c9814 = new C9812(c9812);
            c9814.f31607.add(c9813);
            return c9814;
        }
        return new C9812(enumC18763, Arrays.asList(c9812, c9813));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C9812 m25579(C9812 c9812) {
        EnumC18763 enumC18763 = c9812.f31606;
        EnumC18763 enumC18764 = EnumC18763.NOT;
        if (enumC18763 != enumC18764) {
            C22913 c22913 = c9812.f31605;
            if (c22913 != null) {
                c22913.m51666();
                return new C9812(c22913);
            }
            return new C9812(enumC18764, Collections.singletonList(c9812));
        }
        return c9812.m25580();
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC18763 m25590() {
        return this.f31606;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final List m25586() {
        return this.f31607;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C9812 m25580() {
        return (C9812) this.f31607.get(0);
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final C9812 m25588() {
        return (C9812) this.f31607.get(1);
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final C9812 m25584() {
        return (C9812) this.f31607.get(2);
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final boolean m25589() {
        return this.f31606 == EnumC18763.COMPARE;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C22913 m25585() {
        return this.f31605;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00f8  */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C9812 m25578(C9812 c9812) {
        int size;
        C9812 c9813;
        EnumC19727 enumC19727M51191;
        EnumC19727 enumC19727;
        ArrayList arrayList = null;
        int i = 0;
        if (c9812.m25589()) {
            C22913 c22913 = c9812.f31605;
            AbstractC16481 abstractC16481M51662 = c22913.m51662();
            abstractC16481M51662.getClass();
            if (abstractC16481M51662 instanceof C17227) {
                AbstractC16481 abstractC16481M51667 = c22913.m51667();
                abstractC16481M51667.getClass();
                if (abstractC16481M51667 instanceof C23195) {
                    long jM52122 = ((C23195) c22913.m51667()).m52122();
                    if (jM52122 == 0 || jM52122 == 1) {
                        C18959 c18959M40461 = ((C17227) c22913.m51662()).m40461();
                        int i2 = C7576.f24990[c18959M40461.getType().ordinal()];
                        if (i2 == 1 || i2 == 2) {
                            if (jM52122 == 0) {
                                C17489 c17489M51663 = c22913.m51663();
                                c17489M51663.m40990(c17489M51663.m40994(), c18959M40461.mo44035(0), c18959M40461.mo44035(1));
                            }
                        } else if (i2 == 3 && c22913.m51667().getType() == AbstractC1566.f5436 && ((enumC19727M51191 = ((C22711) c18959M40461).m51191()) == (enumC19727 = EnumC19727.OR) || enumC19727M51191 == EnumC19727.AND)) {
                            EnumC15997 enumC15997M40994 = c22913.m51663().m40994();
                            EnumC15997 enumC15997 = EnumC15997.NE;
                            boolean z = (enumC15997M40994 == enumC15997 && jM52122 == 0) || (enumC15997M40994 == EnumC15997.EQ && jM52122 == 1);
                            if (!z) {
                                enumC15997 = EnumC15997.EQ;
                            }
                            c9813 = new C9812((!(z && enumC19727M51191 == enumC19727) && (z || enumC19727M51191 != EnumC19727.AND)) ? EnumC18763.AND : EnumC18763.OR, Arrays.asList(new C9812(new C22913(new C17489(enumC15997, c18959M40461.mo44035(0), C23195.m52119()))), new C9812(new C22913(new C17489(enumC15997, c18959M40461.mo44035(1), C23195.m52119())))));
                        }
                        c9813 = null;
                    } else {
                        c9813 = null;
                    }
                } else {
                    c9813 = null;
                }
            } else {
                c9813 = null;
            }
            if (c9813 != null) {
                return c9813;
            }
            if (c22913.m51668() == EnumC15997.EQ && c22913.m51667().m39119()) {
                EnumC18763 enumC18763 = EnumC18763.NOT;
                c22913.m51666();
                c9812 = new C9812(enumC18763, Collections.singletonList(new C9812(c22913)));
            } else {
                c22913.m51665();
            }
        }
        List list = c9812.f31607;
        for (int i3 = 0; i3 < list.size(); i3++) {
            C9812 c9814 = (C9812) list.get(i3);
            C9812 c9812M25578 = m25578(c9814);
            if (c9812M25578 != c9814) {
                if (arrayList == null) {
                    arrayList = new ArrayList(list);
                }
                arrayList.set(i3, c9812M25578);
            }
        }
        if (arrayList != null) {
            c9812 = new C9812(c9812.f31606, arrayList);
        }
        EnumC18763 enumC18764 = c9812.f31606;
        EnumC18763 enumC18765 = EnumC18763.NOT;
        if (enumC18764 == enumC18765 && c9812.m25580().f31606 == enumC18765) {
            c9812 = m25574(c9812.m25580());
        }
        if (c9812.f31606 == EnumC18763.TERNARY && c9812.m25580().f31606 == enumC18765) {
            c9812 = m25574(c9812);
        }
        EnumC18763 enumC18766 = c9812.f31606;
        List<C9812> list2 = c9812.f31607;
        if ((enumC18766 != EnumC18763.OR && enumC18766 != EnumC18763.AND) || (size = list2.size()) <= 1) {
            return c9812;
        }
        for (C9812 c9815 : list2) {
            if (c9815.f31606 == EnumC18763.NOT || (c9815.m25589() && c9815.f31605.m51668() == EnumC15997.NE)) {
                i++;
            }
        }
        return i > size / 2 ? m25579(m25574(c9812)) : c9812;
    }

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m25587() {
        ArrayList arrayList = new ArrayList();
        if (this.f31606 == EnumC18763.COMPARE) {
            this.f31605.m51663().mo14760((Collection) arrayList);
            return arrayList;
        }
        Iterator it = this.f31607.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((C9812) it.next()).m25587());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m25582(AbstractC16481 abstractC16481, AbstractC16481 abstractC16482) {
        if (this.f31606 == EnumC18763.COMPARE) {
            return this.f31605.m51663().mo14762(abstractC16481, abstractC16482);
        }
        Iterator it = this.f31607.iterator();
        while (it.hasNext()) {
            if (((C9812) it.next()).m25582(abstractC16481, abstractC16482)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25581(Consumer consumer) {
        if (this.f31606 == EnumC18763.COMPARE) {
            this.f31605.m51663().mo14761(consumer);
        } else {
            C4937.forEach(this.f31607, new C24723(1, consumer));
        }
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C18959 m25583() {
        if (this.f31606 == EnumC18763.COMPARE) {
            return this.f31605.m51663();
        }
        return ((C9812) this.f31607.get(0)).m25583();
    }

    public final String toString() {
        EnumC18763 enumC18763 = this.f31606;
        int iOrdinal = enumC18763.ordinal();
        if (iOrdinal == 0) {
            return this.f31605.toString();
        }
        if (iOrdinal == 1) {
            return m25580() + " ? " + m25588() + " : " + m25584();
        }
        if (iOrdinal == 2) {
            return "!(" + m25580() + ')';
        }
        if (iOrdinal != 3 && iOrdinal != 4) {
            return "??";
        }
        String str = enumC18763 == EnumC18763.OR ? " || " : " && ";
        StringBuilder sb = new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START);
        Iterator it = this.f31607.iterator();
        while (it.hasNext()) {
            sb.append((C9812) it.next());
            if (it.hasNext()) {
                sb.append(str);
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9812)) {
            return false;
        }
        C9812 c9812 = (C9812) obj;
        return this.f31606 == c9812.f31606 && C17359.equals(this.f31607, c9812.f31607) && C17359.equals(this.f31605, c9812.f31605);
    }

    public final int hashCode() {
        int iHashCode = (this.f31607.hashCode() + ((this.f31606.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        C22913 c22913 = this.f31605;
        return iHashCode + (c22913 != null ? c22913.hashCode() : 0);
    }
}
