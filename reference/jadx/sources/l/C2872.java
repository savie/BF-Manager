package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 56CK */
/* JADX INFO: loaded from: classes2.dex */
public final class C2872 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f9447;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f9448;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ArrayList f9449;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f9450;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C18959 f9451;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f9452;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C2872 f9453;

    public C2872(C18959 c18959, ArrayList arrayList, int i) {
        this.f9451 = c18959;
        this.f9452 = arrayList;
        this.f9450 = i;
        this.f9448 = i;
        this.f9447 = m9462(c18959);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m9462(C18959 c18959) {
        ArrayList arrayList = new ArrayList();
        m9464(c18959, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9464(C18959 c18959, ArrayList arrayList) {
        if (c18959.getType() == EnumC24203.TERNARY) {
            arrayList.addAll(((C4789) c18959).m14764().m25587());
        }
        for (AbstractC16481 abstractC16481 : c18959.m44026()) {
            abstractC16481.getClass();
            if (abstractC16481 instanceof C6041) {
                arrayList.add((C6041) abstractC16481);
            }
        }
        for (AbstractC16481 abstractC16482 : c18959.m44026()) {
            abstractC16482.getClass();
            if (abstractC16482 instanceof C17227) {
                m9464(((C17227) abstractC16482).m40461(), arrayList);
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C18959 m9470() {
        return this.f9451;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m9468() {
        return this.f9447;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9463(BitSet bitSet) {
        Iterator it = this.f9447.iterator();
        while (it.hasNext()) {
            bitSet.set(((C6041) it.next()).m17532());
        }
        ArrayList arrayList = this.f9449;
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C2872) it2.next()).m9463(bitSet);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14058 m9469(C2551 c2551, int i, C6041 c6041) {
        BitSet bitSet;
        if (i >= this.f9448) {
            return null;
        }
        ArrayList arrayList = this.f9452;
        if (!((C2872) arrayList.get(i)).m9465(c2551, this.f9451)) {
            return null;
        }
        int i2 = this.f9448;
        C2872 c2872 = (C2872) arrayList.get(i);
        int i3 = i + 1;
        if (i3 != i2) {
            if (i3 > i2) {
                throw new C8597(C6934.m19217("Invalid inline insn positions: ", i3, i2, " - "));
            }
            if (c2872.f9447.isEmpty() && C4123.m13229((Collection) c2872.f9449)) {
                bitSet = C20247.f65032;
            } else {
                bitSet = new BitSet();
                c2872.m9463(bitSet);
            }
            if (bitSet != C20247.f65032 || !c2872.f9451.m44025()) {
                boolean zM9467 = c2872.m9467();
                while (i3 < i2) {
                    C2872 c2873 = (C2872) arrayList.get(i3);
                    if (c2873.m9471() != this) {
                        C18959 c18959 = c2873.f9451;
                        if (zM9467) {
                            if (m9466(c18959, bitSet)) {
                                return null;
                            }
                        } else if (!c18959.m44034() || m9466(c18959, bitSet)) {
                            return null;
                        }
                    }
                    i3++;
                }
            }
        }
        this.f9448 = i;
        C2872 c2874 = (C2872) arrayList.get(i);
        c2874.f9453 = this;
        if (this.f9449 == null) {
            this.f9449 = new ArrayList(this.f9447.size());
        }
        this.f9449.add(c2874);
        return new C14058(c2874.f9451, c6041);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m9465(C2551 c2551, C18959 c18959) {
        if (!C8314.m22407(c2551)) {
            return true;
        }
        if (!C8314.m22409(c2551, this.f9451, c18959)) {
            return false;
        }
        ArrayList arrayList = this.f9449;
        if (arrayList == null) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C2872) it.next()).m9465(c2551, c18959)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private boolean m9467() {
        if (!this.f9451.m44034()) {
            return false;
        }
        ArrayList arrayList = this.f9449;
        if (arrayList == null) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C2872) it.next()).m9467()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m9466(C18959 c18959, BitSet bitSet) {
        C6041 c6041M44027;
        if (bitSet.isEmpty() || (c6041M44027 = c18959.m44027()) == null) {
            return false;
        }
        return bitSet.get(c6041M44027.m17532());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2872 m9471() {
        C2872 c2872M9471;
        C2872 c2872 = this.f9453;
        if (c2872 != null && (c2872M9471 = c2872.m9471()) != null) {
            this.f9453 = c2872M9471;
        }
        return this.f9453;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArgsInfo: |");
        sb.append(this.f9448);
        sb.append(" ->");
        C2872 c2872 = this.f9453;
        sb.append(c2872 == null ? "-" : Integer.valueOf(c2872.f9450));
        sb.append(' ');
        sb.append(this.f9447);
        sb.append(" : ");
        sb.append(this.f9451);
        return sb.toString();
    }
}
