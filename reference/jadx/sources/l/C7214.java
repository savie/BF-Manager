package l;

import android.graphics.Point;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: LARZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C7214 extends AbstractC6839 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f24027;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C4660 f24028;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f24029;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ArrayList f24030;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f24031;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f24032;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public BitSet f24033;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f24034;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f24035;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC6839 f24036;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC6839 f24037;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f24038;

    public C7214(AbstractC6839 abstractC6839) {
        super(abstractC6839);
        this.f24030 = new ArrayList();
    }

    public C7214(AbstractC6839 abstractC6839, C17367 c17367) {
        super(abstractC6839);
        this.f24030 = new ArrayList();
        C20190.m45650(c17367, 20226);
        int iM40445 = c17367.m40445() + c17367.readInt();
        this.f24031 = c17367.m40448();
        this.f24035 = C16387.m38583(c17367.m40448());
        this.f24032 = C16387.m38583(c17367.m40448());
        this.f24036 = AbstractC6839.m18440(this, c17367);
        this.f24037 = AbstractC6839.m18440(this, c17367);
        int iM40462 = c17367.m40462();
        for (int i = 0; i < iM40462; i++) {
            this.f24030.add(AbstractC6839.m18440(this, c17367));
        }
        byte b = c17367.readByte();
        this.f24029 = (b & 1) != 0;
        this.f24034 = (b & 2) != 0;
        this.f24027 = c17367.readShort();
        int iM40454 = c17367.m40454();
        if (iM40454 > 0) {
            byte[] bArr = new byte[iM40454];
            c17367.m40446(iM40454, bArr);
            this.f24033 = BitSet.valueOf(bArr);
        }
        if (c17367.m40445() < iM40445) {
            this.f24028 = C4660.m12851(c17367);
            this.f24038 = C16387.m38583(c17367.m40448());
        }
    }

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final void mo18446(C11018 c11018) {
        c11018.mo24508(20226);
        c11018.m27799();
        c11018.m27783(this.f24031);
        c11018.m27783(C16387.m38584(this.f24035));
        c11018.m27783(C16387.m38584(this.f24032));
        this.f24036.mo18446(c11018);
        this.f24037.mo18446(c11018);
        ArrayList arrayList = this.f24030;
        c11018.mo24508(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC6839) it.next()).mo18446(c11018);
        }
        byte b = this.f24029 ? (byte) 1 : (byte) 0;
        if (this.f24034) {
            b = (byte) (b | 2);
        }
        c11018.writeByte(b);
        c11018.mo24505((short) this.f24027);
        BitSet bitSet = this.f24033;
        if (bitSet != null) {
            byte[] byteArray = bitSet.toByteArray();
            c11018.m27775(byteArray.length);
            c11018.write(byteArray, 0, byteArray.length);
        } else {
            c11018.m27775(0);
        }
        C4660.m12852(c11018, this.f24028);
        c11018.m27783(C16387.m38584(this.f24038));
        c11018.m27777();
    }

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final void mo18445(C4016 c4016) {
        AbstractC6839 abstractC6839 = this.f24036;
        if (abstractC6839 == null) {
            throw new C18066(this.f23038, "Missing start matcher");
        }
        AbstractC6839 abstractC68310 = this.f24037;
        if (abstractC68310 == null) {
            throw new C18066(this.f23038, "Missing end matcher");
        }
        C10037 c10037 = abstractC6839 instanceof C10037 ? (C10037) abstractC6839 : null;
        C10037 c10038 = abstractC68310 instanceof C10037 ? (C10037) abstractC68310 : null;
        List<C1487> listM25332 = c10037 == null ? Collections.EMPTY_LIST : c10037.m25332();
        List<String> listM22413 = c10038 == null ? Collections.EMPTY_LIST : c10038.m25330().m22413();
        if (!listM25332.isEmpty() || !listM22413.isEmpty()) {
            if (!listM25332.isEmpty() && c10038 == null) {
                throw new C18066(this.f23038, "start exports require a direct end match");
            }
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            int iM22415 = c10037 == null ? -1 : c10037.m25330().m22415();
            for (C1487 c1487 : listM25332) {
                if (c1487.m5133() < 0 || c1487.m5133() > iM22415) {
                    Point point = c10037.f23038;
                    StringBuilder sb = new StringBuilder("No start capture group ");
                    sb.append(c1487.m5133());
                    sb.append(" for exported variable \"");
                    throw new C18066(point, C22697.m50267(sb, c1487.m5134(), "\""));
                }
                if (!hashSet.add(Integer.valueOf(c1487.m5133()))) {
                    throw new C18066(c10037.f23038, C12441.m30911(c1487.m5133(), " is exported more than once", new StringBuilder("Capture group ")));
                }
                if (!hashSet2.add(c1487.m5134())) {
                    throw new C18066(c10037.f23038, "Duplicate exported variable: " + c1487.m5134());
                }
            }
            HashSet hashSet3 = new HashSet();
            for (String str : listM22413) {
                if (!hashSet2.contains(str)) {
                    throw new C18066(c10038.f23038, C0252.m1693("Undefined scope variable: ", str));
                }
                hashSet3.add(str);
            }
            for (C1487 c1488 : listM25332) {
                if (!hashSet3.contains(c1488.m5134())) {
                    throw new C18066(c10037.f23038, "Exported variable is not used by end: " + c1488.m5134());
                }
            }
        }
        C4660 c4660 = this.f24028;
        ArrayList arrayList = this.f24030;
        if (c4660 != null) {
            if (!arrayList.isEmpty()) {
                throw new C18066(this.f23038, "childrenSyntax and contains cannot be used together");
            }
            try {
                C4660 c4660M12857 = this.f24028.m12857(this.f23037.mo18442());
                if (c4660M12857.m12859()) {
                    AbstractC6839 abstractC68311 = this.f24036;
                    if (!(abstractC68311 instanceof C10037)) {
                        throw new C18066(this.f23038, "Dynamic childrenSyntax requires a direct match start");
                    }
                    int iM12855 = c4660M12857.m12855();
                    int iM22416 = ((C10037) abstractC68311).m25330().m22415();
                    if (iM12855 < 0 || iM12855 > iM22416) {
                        throw new C18066(this.f23038, C8479.m22141(iM12855, "No start capture group "));
                    }
                }
            } catch (IllegalArgumentException e) {
                if (this.f23038 == null) {
                    throw e;
                }
                C18066 c18066 = new C18066(this.f23038, e.getMessage());
                c18066.initCause((Throwable) e);
                throw c18066;
            }
        } else if (this.f24038 != 0) {
            throw new C18066(this.f23038, "missingStyle requires childrenSyntax");
        }
        this.f24036.mo18445(c4016);
        this.f24037.mo18445(c4016);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC6839) it.next()).mo18445(c4016);
        }
    }

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC6839 mo18441(AbstractC6839 abstractC6839) {
        C7214 c7214 = new C7214(abstractC6839);
        c7214.f23038 = this.f23038;
        c7214.f24031 = this.f24031;
        c7214.f24036 = this.f24036.mo18441(c7214);
        c7214.f24036 = this.f24036.mo18441(c7214);
        c7214.f24037 = this.f24037.mo18441(c7214);
        c7214.f24035 = this.f24035;
        c7214.f24032 = this.f24032;
        c7214.f24028 = this.f24028;
        c7214.f24038 = this.f24038;
        c7214.f24029 = this.f24029;
        c7214.f24034 = this.f24034;
        c7214.f24027 = this.f24027;
        BitSet bitSet = this.f24033;
        c7214.f24033 = bitSet == null ? null : (BitSet) bitSet.clone();
        Iterator it = this.f24030.iterator();
        while (it.hasNext()) {
            c7214.f24030.add(((AbstractC6839) it.next()).mo18441(c7214));
        }
        return c7214;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m19162() {
        return this.f24031;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m19168(String str) {
        this.f24031 = str;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final AbstractC6839 m19171() {
        return this.f24036;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m19165(AbstractC6839 abstractC6839) {
        this.f24036 = abstractC6839;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC6839 m19152() {
        return this.f24037;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m19169(AbstractC6839 abstractC6839) {
        this.f24037 = abstractC6839;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m19154(String str) {
        this.f24035 = C16387.m38583(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19157(String str) {
        this.f24032 = C16387.m38583(str);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C4660 m19153() {
        return this.f24028;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19158(C4660 c4660) {
        this.f24028 = c4660;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m19164(String str) {
        this.f24038 = C16387.m38583(str);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m19174() {
        return this.f24035;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m19163() {
        return this.f24032;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m19175() {
        return this.f24038;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m19173() {
        return this.f24029;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19160(boolean z) {
        this.f24029 = z;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m19172() {
        return this.f24034;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m19170(boolean z) {
        this.f24034 = z;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m19166() {
        return this.f24027;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19156(int i) {
        if (i < 0) {
            i = 0;
        } else if (i > 32767) {
            i = EnumC23529.f76192;
        }
        this.f24027 = i;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final List m19161() {
        return this.f24030;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19159(AbstractC6839 abstractC6839, boolean z) {
        ArrayList arrayList = this.f24030;
        arrayList.add(abstractC6839);
        if (z) {
            if (this.f24033 == null) {
                this.f24033 = new BitSet();
            }
            this.f24033.set(arrayList.size() - 1);
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final BitSet m19155() {
        return this.f24033;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m19167() {
        BitSet bitSet = this.f24033;
        if (bitSet == null || this.f24029) {
            return;
        }
        int i = this.f24027;
        BitSet bitSet2 = new BitSet();
        int length = this.f24033.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (bitSet.get(i2)) {
                if (i2 < i) {
                    bitSet2.set(i2);
                } else {
                    bitSet2.set(i2 + 1);
                }
            }
        }
        this.f24033 = bitSet2;
    }

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final void mo18443(StringBuilder sb, int i) {
        sb.append(C6851.m18455(i, "\t"));
        sb.append("{\n");
        int i2 = i + 1;
        String strM18455 = C6851.m18455(i2, "\t");
        sb.append(strM18455);
        sb.append("start: ");
        sb.append('\n');
        this.f24036.mo18443(sb, i2);
        sb.append(strM18455);
        sb.append("end: ");
        sb.append('\n');
        this.f24037.mo18443(sb, i2);
        String strM38584 = C16387.m38584(this.f24035);
        if (strM38584 != null) {
            sb.append(strM18455);
            sb.append("style: ");
            sb.append('\"');
            sb.append(strM38584);
            sb.append('\"');
            sb.append('\n');
        }
        String strM38585 = C16387.m38584(this.f24032);
        if (strM38585 != null) {
            sb.append(strM18455);
            sb.append("childrenStyle: ");
            sb.append('\"');
            sb.append(strM38585);
            sb.append('\"');
            sb.append('\n');
        }
        C4660 c4660 = this.f24028;
        if (c4660 != null) {
            c4660.m12858(sb, strM18455);
        }
        String strM38586 = C16387.m38584(this.f24038);
        if (strM38586 != null) {
            sb.append(strM18455);
            sb.append("missingStyle: ");
            sb.append('\"');
            sb.append(strM38586);
            sb.append('\"');
            sb.append('\n');
        }
        if (this.f24027 != 0) {
            sb.append(strM18455);
            sb.append("endPriority: ");
            sb.append(this.f24027);
            sb.append('\n');
        }
        sb.append(strM18455);
        sb.append("contains: ");
        sb.append('\n');
        Iterator it = this.f24030.iterator();
        while (it.hasNext()) {
            ((AbstractC6839) it.next()).mo18443(sb, i2);
        }
        if (this.f24033 != null) {
            sb.append(strM18455);
            sb.append("fails: ");
            sb.append(this.f24033);
            sb.append('\n');
        }
        sb.append(C6851.m18455(i, "\t"));
        sb.append("}\n");
    }

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final void mo18444(ArrayList arrayList) {
        this.f24036.mo18444(arrayList);
    }
}
