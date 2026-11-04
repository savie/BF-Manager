package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩳۡۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44TD */
/* JADX INFO: loaded from: classes5.dex */
public class C18959 extends AbstractC5820 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C6041 f61469;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final List f61470;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f61471;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final EnumC24203 f61472;

    public C18959(EnumC24203 enumC24203, List list) {
        this.f61472 = enumC24203;
        this.f61470 = list;
        this.f61471 = -1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m44032((AbstractC16481) it.next());
        }
    }

    public C18959(EnumC24203 enumC24203, int i) {
        this(enumC24203, i == 0 ? Collections.EMPTY_LIST : new ArrayList(i));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m44031(C6041 c6041) {
        this.f61469 = c6041;
        if (c6041 != null) {
            c6041.mo39114(this);
            C17973 c17973M17530 = c6041.m17530();
            if (c17973M17530 != null) {
                c17973M17530.m41949(c6041);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo44014(AbstractC16481 abstractC16481) {
        this.f61470.add(abstractC16481);
        m44032(abstractC16481);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo44012(int i, AbstractC16481 abstractC16481) {
        this.f61470.set(i, abstractC16481);
        m44032(abstractC16481);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m44032(AbstractC16481 abstractC16481) {
        C6041 c6041;
        C17973 c17973M17530;
        abstractC16481.mo39114(this);
        if (!(abstractC16481 instanceof C6041) || (c17973M17530 = (c6041 = (C6041) abstractC16481).m17530()) == null) {
            return;
        }
        c17973M17530.m41938(c6041);
    }

    public final EnumC24203 getType() {
        return this.f61472;
    }

    /* JADX INFO: renamed from: ۗۙ */
    public void mo14759() {
        C6041 c6041 = this.f61469;
        if (c6041 != null) {
            C17973 c17973M17530 = c6041.m17530();
            if (c17973M17530 == null) {
                throw new C8597("No SSA var for result arg: " + c6041 + " from " + c6041.m39118());
            }
            c17973M17530.m41949(c6041);
        }
        for (AbstractC16481 abstractC16481 : this.f61470) {
            if (abstractC16481 instanceof C6041) {
                C6041 c6042 = (C6041) abstractC16481;
                C17973 c17973M17531 = c6042.m17530();
                c17973M17531.m41938(c6042);
                c17973M17531.m41937();
            } else if (abstractC16481 instanceof C17227) {
                ((C17227) abstractC16481).m40461().mo14759();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18959 m44011(C2551 c2551) {
        C6041 c6041 = this.f61469;
        if (c6041 == null) {
            throw new C8597("Result in null");
        }
        C6041 c6041M17524 = c6041.m17524(c6041.m17532(), (C17973) null);
        c2551.m8497(c6041M17524);
        C18959 c18959Mo4072 = mo4072();
        c18959Mo4072.m44031(c6041M17524);
        return c18959Mo4072;
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final C6041 m44027() {
        return this.f61469;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m44010(C8838 c8838) {
        for (AbstractC16481 abstractC16481 : this.f61470) {
            abstractC16481.getClass();
            Object objM44010 = abstractC16481 instanceof C17227 ? ((C17227) abstractC16481).m40461().m44010(c8838) : c8838.apply(abstractC16481);
            if (objM44010 != null) {
                return objM44010;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo14760(Collection collection) {
        for (AbstractC16481 abstractC16481 : this.f61470) {
            abstractC16481.getClass();
            if (abstractC16481 instanceof C6041) {
                collection.add((C6041) abstractC16481);
            } else if (abstractC16481 instanceof C17227) {
                ((C17227) abstractC16481).m40461().mo14760(collection);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44013(C1938 c1938) {
        for (AbstractC16481 abstractC16481 : this.f61470) {
            abstractC16481.getClass();
            if (abstractC16481 instanceof C17227) {
                ((C17227) abstractC16481).m40461().m44013(c1938);
            } else {
                c1938.accept(abstractC16481);
            }
        }
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final List m44026() {
        return this.f61470;
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44029() {
        for (AbstractC16481 abstractC16481 : this.f61470) {
            abstractC16481.getClass();
            if (abstractC16481 instanceof C17227) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final List m44023() {
        return this.f61470;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44016(C6041 c6041) {
        List list = this.f61470;
        if (list.size() == 0) {
            return false;
        }
        return C8314.m22406(list, c6041);
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo14762(AbstractC16481 abstractC16481, AbstractC16481 abstractC16482) {
        List list = this.f61470;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC16481 abstractC16483 = (AbstractC16481) list.get(i);
            if (abstractC16483 == abstractC16481) {
                C9804.m25533((C2551) null, abstractC16483);
                mo44012(i, abstractC16482);
                return true;
            }
            abstractC16483.getClass();
            if ((abstractC16483 instanceof C17227) && ((C17227) abstractC16483).m40461().mo14762(abstractC16481, abstractC16482)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m44020(AbstractC16481 abstractC16481) {
        List list = this.f61470;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (abstractC16481 == list.get(i)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m44033(C18959 c18959) {
        if (c18959.f61470.size() == 0) {
            Iterator it = this.f61470.iterator();
            while (it.hasNext()) {
                c18959.mo44014(((AbstractC16481) it.next()).mo17528());
            }
        }
        c18959.m39414((AbstractC16678) this);
        c18959.m16975((AbstractC5820) this);
        c18959.m16976(this);
        c18959.f61471 = this.f61471;
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final int m44039() {
        return this.f61470.size();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC16481 mo44035(int i) {
        return (AbstractC16481) this.f61470.get(i);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public AbstractC16481 mo44028(int i) {
        List list = this.f61470;
        AbstractC16481 abstractC16481 = (AbstractC16481) list.get(i);
        list.remove(i);
        C9804.m25533((C2551) null, abstractC16481);
        return abstractC16481;
    }

    public final int getOffset() {
        return this.f61471;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m44024(int i) {
        this.f61471 = i;
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44025() {
        int i = C7772.f25578[this.f61472.ordinal()];
        return i == 1 || i == 2 || i == 3;
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44037() {
        int i = C7772.f25578[this.f61472.ordinal()];
        return i == 4 || i == 5 || i == 6 || i == 7;
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44017() {
        int i = C7772.f25578[this.f61472.ordinal()];
        return i == 8 || i == 9;
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44034() {
        boolean zMo17865 = mo17865(EnumC1763.DONT_GENERATE);
        EnumC24203 enumC24203 = this.f61472;
        if (!zMo17865) {
            for (AbstractC16481 abstractC16481 : this.f61470) {
                abstractC16481.getClass();
                if ((abstractC16481 instanceof C17227) && !((C17227) abstractC16481).m40461().m44034()) {
                    return false;
                }
            }
            int i = C7772.f25578[enumC24203.ordinal()];
            if (i != 1 && i != 2 && i != 3) {
                switch (i) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                        break;
                    default:
                        return false;
                }
            }
        } else if (enumC24203 == EnumC24203.MONITOR_EXIT) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo14761(Consumer consumer) {
        consumer.accept(this);
        for (AbstractC16481 abstractC16481 : this.f61470) {
            abstractC16481.getClass();
            if (abstractC16481 instanceof C17227) {
                ((C17227) abstractC16481).m40461().mo14761(consumer);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m44009(Function function) {
        Object objM44009;
        Object objApply = function.apply(this);
        if (objApply != null) {
            return objApply;
        }
        for (AbstractC16481 abstractC16481 : this.f61470) {
            abstractC16481.getClass();
            if ((abstractC16481 instanceof C17227) && (objM44009 = ((C17227) abstractC16481).m40461().m44009(function)) != null) {
                return objM44009;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩴ */
    public boolean mo4075(C18959 c18959) {
        List list;
        int size;
        if (this == c18959) {
            return true;
        }
        EnumC24203 enumC24203 = c18959.f61472;
        List list2 = c18959.f61470;
        if (this.f61472 != enumC24203 || (size = (list = this.f61470).size()) != list2.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            AbstractC16481 abstractC16481 = (AbstractC16481) list.get(i);
            AbstractC16481 abstractC16482 = (AbstractC16481) list2.get(i);
            abstractC16481.getClass();
            if (abstractC16481 instanceof C17227) {
                abstractC16482.getClass();
                if (!(abstractC16482 instanceof C17227) || !((C17227) abstractC16481).m40461().mo4075(((C17227) abstractC16482).m40461())) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m44036(C18959 c18959) {
        if (this == c18959) {
            return true;
        }
        return mo4075(c18959) && C17359.equals(this.f61469, c18959.f61469) && C17359.equals(this.f61470, c18959.f61470);
    }

    /* JADX INFO: renamed from: ۫ۙ */
    public C18959 mo4072() {
        if (getClass() == C18959.class) {
            C18959 c18959 = new C18959(this.f61472, this.f61470.size());
            m44033(c18959);
            return c18959;
        }
        throw new C8597("Copy method not implemented in insn class ".concat(getClass().getSimpleName()));
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final C18959 m44018() {
        C18959 c18959Mo4072 = mo4072();
        C6041 c6041 = this.f61469;
        if (c6041 == null) {
            return c18959Mo4072;
        }
        if (c6041.m17530() == null) {
            c18959Mo4072.m44031(this.f61469.mo17528());
            return c18959Mo4072;
        }
        throw new C8597("Can't copy if SSA var is set");
    }

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44022() {
        int i = C7772.f25578[this.f61472.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4 || i == 11) {
            return false;
        }
        switch (i) {
            case 13:
            case 14:
            case 15:
                return false;
            default:
                switch (i) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                        return false;
                    default:
                        return true;
                }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m44021(C18959 c18959) {
        EnumC24203 enumC24203 = this.f61472;
        EnumC24203 enumC24204 = EnumC24203.RETURN;
        C11457 c11457 = C11457.f36032;
        if (enumC24203 == enumC24204) {
            m16976(c18959);
            if (mo17865(EnumC1763.SYNTHETIC)) {
                this.f61471 = c18959.f61471;
                m39419(c11457);
                m39412(c18959, c11457);
                return;
            }
            m39412(c18959, c11457);
            return;
        }
        m39412(c18959, c11457);
        m16975((AbstractC5820) c18959);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44015(StringBuilder sb) {
        List list = this.f61470;
        if (list.isEmpty()) {
            return false;
        }
        String strM13221 = C4123.m13221(list, ", ");
        if (strM13221.length() < 120) {
            sb.append(strM13221);
            return false;
        }
        sb.append("\n  ");
        sb.append(C4123.m13221(list, "\n  "));
        sb.append('\n');
        return true;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m44019() {
        StringBuilder sb = new StringBuilder();
        m44030(sb);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m44030(StringBuilder sb) {
        if (!m39417()) {
            sb.append(' ');
            sb.append(m39420());
        }
        if (m16977() != 0) {
            sb.append(" (LINE:");
            sb.append(m16977());
            sb.append(')');
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m44038() {
        StringBuilder sb = new StringBuilder();
        int i = this.f61471;
        if (i != -1) {
            sb.append(C8314.m22396(i));
            sb.append(": ");
        }
        sb.append(this.f61472);
        sb.append(' ');
        C6041 c6041 = this.f61469;
        if (c6041 != null) {
            sb.append(c6041);
            sb.append(" = ");
        }
        m44015(sb);
        return sb.toString();
    }

    public String toString() {
        return m44038() + m44019();
    }
}
