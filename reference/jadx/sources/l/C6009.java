package l;

import android.graphics.Point;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۚ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: LARZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6009 extends AbstractC2805 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f20560;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public BitSet f20561;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f20562;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f20563;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f20564;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC2805 f20565;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f20566;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f20567;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC2805 f20568;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final ArrayList f20569;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C7567 f20570;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f20571;

    public C6009(AbstractC2805 abstractC2805) {
        super(abstractC2805);
        this.f20569 = new ArrayList();
    }

    public C6009(AbstractC2805 abstractC2805, C20348 c20348) {
        super(abstractC2805);
        this.f20569 = new ArrayList();
        C17364.m40796(c20348, 20226);
        int iM46744 = c20348.m46744() + c20348.readInt();
        this.f20563 = c20348.m46742();
        this.f20566 = C17941.m41877(c20348.m46742());
        this.f20562 = C17941.m41877(c20348.m46742());
        this.f20568 = AbstractC2805.m9274(this, c20348);
        this.f20565 = AbstractC2805.m9274(this, c20348);
        int iM46749 = c20348.m46749();
        for (int i = 0; i < iM46749; i++) {
            this.f20569.add(AbstractC2805.m9274(this, c20348));
        }
        byte b = c20348.readByte();
        this.f20560 = (b & 1) != 0;
        this.f20567 = (b & 2) != 0;
        this.f20564 = c20348.readShort();
        int iM46741 = c20348.m46741();
        if (iM46741 > 0) {
            byte[] bArr = new byte[iM46741];
            c20348.m46745(iM46741, bArr);
            this.f20561 = BitSet.valueOf(bArr);
        }
        if (c20348.m46744() < iM46744) {
            this.f20570 = C7567.m20666(c20348);
            this.f20571 = C17941.m41877(c20348.m46742());
        }
    }

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final void mo9279(C6178 c6178) {
        c6178.mo17812(20226);
        c6178.m17797();
        c6178.m17787(this.f20563);
        c6178.m17787(C17941.m41878(this.f20566));
        c6178.m17787(C17941.m41878(this.f20562));
        this.f20568.mo9279(c6178);
        this.f20565.mo9279(c6178);
        ArrayList arrayList = this.f20569;
        c6178.mo17812(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC2805) it.next()).mo9279(c6178);
        }
        byte b = this.f20560 ? (byte) 1 : (byte) 0;
        if (this.f20567) {
            b = (byte) (b | 2);
        }
        c6178.writeByte(b);
        c6178.mo17788((short) this.f20564);
        BitSet bitSet = this.f20561;
        if (bitSet != null) {
            byte[] byteArray = bitSet.toByteArray();
            c6178.m17809(byteArray.length);
            c6178.write(byteArray, 0, byteArray.length);
        } else {
            c6178.m17809(0);
        }
        C7567.m20667(c6178, this.f20570);
        c6178.m17787(C17941.m41878(this.f20571));
        c6178.m17780();
    }

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final void mo9280(C9516 c9516) {
        AbstractC2805 abstractC2805 = this.f20568;
        if (abstractC2805 == null) {
            throw new C10833(this.f9224, "Missing start matcher");
        }
        AbstractC2805 abstractC2806 = this.f20565;
        if (abstractC2806 == null) {
            throw new C10833(this.f9224, "Missing end matcher");
        }
        C13466 c13466 = abstractC2805 instanceof C13466 ? (C13466) abstractC2805 : null;
        C13466 c13467 = abstractC2806 instanceof C13466 ? (C13466) abstractC2806 : null;
        List<C20992> listM33121 = c13466 == null ? Collections.EMPTY_LIST : c13466.m33121();
        List<String> listM37495 = c13467 == null ? Collections.EMPTY_LIST : c13467.m33116().m37495();
        if (!listM33121.isEmpty() || !listM37495.isEmpty()) {
            if (!listM33121.isEmpty() && c13467 == null) {
                throw new C10833(this.f9224, "start exports require a direct end match");
            }
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            int iM37496 = c13466 == null ? -1 : c13466.m33116().m37496();
            for (C20992 c20992 : listM33121) {
                if (c20992.m47979() < 0 || c20992.m47979() > iM37496) {
                    Point point = c13466.f9224;
                    StringBuilder sb = new StringBuilder("No start capture group ");
                    sb.append(c20992.m47979());
                    sb.append(" for exported variable \"");
                    throw new C10833(point, C8947.m23910(sb, c20992.m47980(), "\""));
                }
                if (!hashSet.add(Integer.valueOf(c20992.m47979()))) {
                    throw new C10833(c13466.f9224, C12669.m31437(c20992.m47979(), " is exported more than once", new StringBuilder("Capture group ")));
                }
                if (!hashSet2.add(c20992.m47980())) {
                    throw new C10833(c13466.f9224, "Duplicate exported variable: " + c20992.m47980());
                }
            }
            HashSet hashSet3 = new HashSet();
            for (String str : listM37495) {
                if (!hashSet2.contains(str)) {
                    throw new C10833(c13467.f9224, C25272.m56409("Undefined scope variable: ", str));
                }
                hashSet3.add(str);
            }
            for (C20992 c20993 : listM33121) {
                if (!hashSet3.contains(c20993.m47980())) {
                    throw new C10833(c13466.f9224, "Exported variable is not used by end: " + c20993.m47980());
                }
            }
        }
        C7567 c7567 = this.f20570;
        ArrayList arrayList = this.f20569;
        if (c7567 != null) {
            if (!arrayList.isEmpty()) {
                throw new C10833(this.f9224, "childrenSyntax and contains cannot be used together");
            }
            try {
                C7567 c7567M20671 = this.f20570.m20671(this.f9223.mo9276());
                if (c7567M20671.m20675()) {
                    AbstractC2805 abstractC2807 = this.f20568;
                    if (!(abstractC2807 instanceof C13466)) {
                        throw new C10833(this.f9224, "Dynamic childrenSyntax requires a direct match start");
                    }
                    int iM20669 = c7567M20671.m20669();
                    int iM37497 = ((C13466) abstractC2807).m33116().m37496();
                    if (iM20669 < 0 || iM20669 > iM37497) {
                        throw new C10833(this.f9224, C13645.m33382(iM20669, "No start capture group "));
                    }
                }
            } catch (IllegalArgumentException e) {
                if (this.f9224 == null) {
                    throw e;
                }
                C10833 c10833 = new C10833(this.f9224, e.getMessage());
                c10833.initCause((Throwable) e);
                throw c10833;
            }
        } else if (this.f20571 != 0) {
            throw new C10833(this.f9224, "missingStyle requires childrenSyntax");
        }
        this.f20568.mo9280(c9516);
        this.f20565.mo9280(c9516);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC2805) it.next()).mo9280(c9516);
        }
    }

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC2805 mo9275(AbstractC2805 abstractC2805) {
        C6009 c6009 = new C6009(abstractC2805);
        c6009.f9224 = this.f9224;
        c6009.f20563 = this.f20563;
        c6009.f20568 = this.f20568.mo9275(c6009);
        c6009.f20568 = this.f20568.mo9275(c6009);
        c6009.f20565 = this.f20565.mo9275(c6009);
        c6009.f20566 = this.f20566;
        c6009.f20562 = this.f20562;
        c6009.f20570 = this.f20570;
        c6009.f20571 = this.f20571;
        c6009.f20560 = this.f20560;
        c6009.f20567 = this.f20567;
        c6009.f20564 = this.f20564;
        BitSet bitSet = this.f20561;
        c6009.f20561 = bitSet == null ? null : (BitSet) bitSet.clone();
        Iterator it = this.f20569.iterator();
        while (it.hasNext()) {
            c6009.f20569.add(((AbstractC2805) it.next()).mo9275(c6009));
        }
        return c6009;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m17469() {
        return this.f20563;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m17477(String str) {
        this.f20563 = str;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC2805 m17473() {
        return this.f20568;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m17468(AbstractC2805 abstractC2805) {
        this.f20568 = abstractC2805;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC2805 m17470() {
        return this.f20565;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m17478(AbstractC2805 abstractC2805) {
        this.f20565 = abstractC2805;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m17481(String str) {
        this.f20566 = C17941.m41877(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17461(String str) {
        this.f20562 = C17941.m41877(str);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C7567 m17480() {
        return this.f20570;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17463(C7567 c7567) {
        this.f20570 = c7567;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m17467(String str) {
        this.f20571 = C17941.m41877(str);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m17471() {
        return this.f20566;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m17466() {
        return this.f20562;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m17482() {
        return this.f20571;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m17474() {
        return this.f20560;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17464(boolean z) {
        this.f20560 = z;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m17472() {
        return this.f20567;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m17479(boolean z) {
        this.f20567 = z;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m17465() {
        return this.f20564;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17460(int i) {
        if (i < 0) {
            i = 0;
        } else if (i > 32767) {
            i = EnumC6121.f20881;
        }
        this.f20564 = i;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List m17475() {
        return this.f20569;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17462(AbstractC2805 abstractC2805, boolean z) {
        ArrayList arrayList = this.f20569;
        arrayList.add(abstractC2805);
        if (z) {
            if (this.f20561 == null) {
                this.f20561 = new BitSet();
            }
            this.f20561.set(arrayList.size() - 1);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final BitSet m17459() {
        return this.f20561;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m17476() {
        BitSet bitSet = this.f20561;
        if (bitSet == null || this.f20560) {
            return;
        }
        int i = this.f20564;
        BitSet bitSet2 = new BitSet();
        int length = this.f20561.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (bitSet.get(i2)) {
                if (i2 < i) {
                    bitSet2.set(i2);
                } else {
                    bitSet2.set(i2 + 1);
                }
            }
        }
        this.f20561 = bitSet2;
    }

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final void mo9277(StringBuilder sb, int i) {
        sb.append(C24276.m54281(i, "\t"));
        sb.append("{\n");
        int i2 = i + 1;
        String strM54281 = C24276.m54281(i2, "\t");
        sb.append(strM54281);
        sb.append("start: ");
        sb.append('\n');
        this.f20568.mo9277(sb, i2);
        sb.append(strM54281);
        sb.append("end: ");
        sb.append('\n');
        this.f20565.mo9277(sb, i2);
        String strM41878 = C17941.m41878(this.f20566);
        if (strM41878 != null) {
            sb.append(strM54281);
            sb.append("style: ");
            sb.append('\"');
            sb.append(strM41878);
            sb.append('\"');
            sb.append('\n');
        }
        String strM41879 = C17941.m41878(this.f20562);
        if (strM41879 != null) {
            sb.append(strM54281);
            sb.append("childrenStyle: ");
            sb.append('\"');
            sb.append(strM41879);
            sb.append('\"');
            sb.append('\n');
        }
        C7567 c7567 = this.f20570;
        if (c7567 != null) {
            c7567.m20672(sb, strM54281);
        }
        String strM418710 = C17941.m41878(this.f20571);
        if (strM418710 != null) {
            sb.append(strM54281);
            sb.append("missingStyle: ");
            sb.append('\"');
            sb.append(strM418710);
            sb.append('\"');
            sb.append('\n');
        }
        if (this.f20564 != 0) {
            sb.append(strM54281);
            sb.append("endPriority: ");
            sb.append(this.f20564);
            sb.append('\n');
        }
        sb.append(strM54281);
        sb.append("contains: ");
        sb.append('\n');
        Iterator it = this.f20569.iterator();
        while (it.hasNext()) {
            ((AbstractC2805) it.next()).mo9277(sb, i2);
        }
        if (this.f20561 != null) {
            sb.append(strM54281);
            sb.append("fails: ");
            sb.append(this.f20561);
            sb.append('\n');
        }
        sb.append(C24276.m54281(i, "\t"));
        sb.append("}\n");
    }

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final void mo9278(ArrayList arrayList) {
        this.f20568.mo9278(arrayList);
    }
}
