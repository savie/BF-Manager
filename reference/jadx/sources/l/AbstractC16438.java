package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ܽۚܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7BB0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16438 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C0727 f52858;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f52859;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C11312 f52860;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C17143 f52861;

    /* JADX INFO: renamed from: ۙ */
    public abstract String mo8568();

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC16438 mo8569(C0727 c0727);

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC16438 mo8570(C17143 c17143);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo15535(C2718 c2718);

    /* JADX INFO: renamed from: ܰ */
    public abstract int mo15536();

    /* JADX INFO: renamed from: ܰ */
    public abstract AbstractC16438 mo20431(int i);

    /* JADX INFO: renamed from: ܶ */
    public abstract String mo15537();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19052 m38692(C11312 c11312, C16251 c16251, C16251 c16252) {
        C17143 c17143;
        boolean z = c16251.m38396() == 1;
        boolean zM9829 = c16251.getType().m9829();
        int iM38400 = c16251.m38400();
        if ((c16252.m38400() | iM38400) < 16) {
            if (zM9829) {
                c17143 = C5854.f19843;
            } else {
                c17143 = z ? C5854.f19872 : C5854.f19847;
            }
        } else if (iM38400 < 256) {
            if (zM9829) {
                c17143 = C5854.f19852;
            } else {
                c17143 = z ? C5854.f19932 : C5854.f19986;
            }
        } else if (zM9829) {
            c17143 = C5854.f19897;
        } else {
            c17143 = z ? C5854.f19907 : C5854.f19866;
        }
        return new C19052(c17143, c11312, C0727.m3149(c16251, c16252));
    }

    public AbstractC16438(C17143 c17143, C11312 c11312, C0727 c0727) {
        if (c17143 == null) {
            throw new NullPointerException("opcode == null");
        }
        if (c11312 == null) {
            throw new NullPointerException("position == null");
        }
        if (c0727 == null) {
            throw new NullPointerException("registers == null");
        }
        this.f52859 = -1;
        this.f52861 = c17143;
        this.f52860 = c11312;
        this.f52858 = c0727;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder(100);
        sb.append(m38704());
        sb.append(' ');
        sb.append(this.f52860);
        sb.append(": ");
        sb.append(this.f52861.m40072());
        C0727 c0727 = this.f52858;
        if (c0727.size() != 0) {
            sb.append(c0727.m15251(" ", (String) null));
            z = true;
        } else {
            z = false;
        }
        String strMo8568 = mo8568();
        if (strMo8568 != null) {
            if (z) {
                sb.append(',');
            }
            sb.append(' ');
            sb.append(strMo8568);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m38699() {
        return this.f52859 >= 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m38698() {
        int i = this.f52859;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("address not yet known");
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C17143 m38693() {
        return this.f52861;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C11312 m38701() {
        return this.f52860;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C0727 m38695() {
        return this.f52858;
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC16438 mo29883(C11976 c11976) {
        return mo8569(c11976.m31288(this.f52858));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.֡᩺ܶ, l.ۚᩴܶ] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.BitSet] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m38694(BitSet bitSet) {
        ?? M40068 = this.f52861.m40068();
        ?? r1 = this.f52858;
        int size = r1.size();
        int iM38396 = 0;
        int iM38397 = (M40068 == 0 || bitSet.get(0)) ? 0 : r1.m15275get(0).m38396();
        while (M40068 < size) {
            if (!bitSet.get(M40068)) {
                iM38396 = r1.m15275get(M40068).m38396() + iM38396;
            }
            M40068++;
        }
        return Math.max(iM38396, iM38397);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC16438 m38700(BitSet bitSet) {
        return mo8569(this.f52858.m3155(this.f52861.m40068(), bitSet));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C19052 m38702(BitSet bitSet) {
        if (!this.f52861.m40068() || bitSet.get(0)) {
            return null;
        }
        C16251 c16251M15275get = this.f52858.m15275get(0);
        return m38692(this.f52860, c16251M15275get, c16251M15275get.m38397(0));
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC16438 m38703() {
        return mo8569(this.f52858.m3155(this.f52861.m40068(), (BitSet) null));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23494 m38696(BitSet bitSet) {
        boolean z = bitSet.get(0);
        C17143 c17143 = this.f52861;
        if (c17143.m40068()) {
            bitSet.set(0);
        }
        C0727 c0727M3153 = this.f52858.m3153(bitSet);
        if (c17143.m40068()) {
            bitSet.set(0, z);
        }
        if (c0727M3153.size() == 0) {
            return null;
        }
        return new C23494(this.f52860, c0727M3153);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String m38704() {
        int i = this.f52859;
        return i != -1 ? String.format("%04x", Integer.valueOf(i)) : C22475.m49978(System.identityHashCode(this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38697(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("address < 0");
        }
        this.f52859 = i;
    }

    /* JADX INFO: renamed from: ۖ */
    public String mo8567() {
        throw new UnsupportedOperationException("Not supported.");
    }

    /* JADX INFO: renamed from: ۨ */
    public String mo8573() {
        throw new UnsupportedOperationException("Not supported.");
    }
}
