package l;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֨ܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 6A0Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C1271 extends AbstractC19170 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10219 f4572;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C10219 f4573;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10219 f4574;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C10219 f4575;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f4576;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public HashMap f4577;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InetSocketAddress f4578;

    public C1271(int i) {
        this(i, 1460, true);
    }

    public C1271(int i, int i2, boolean z) {
        super(i, 0, z);
        this.f4577 = new HashMap();
        this.f4576 = i2 > 0 ? i2 : 1460;
        this.f4575 = new C10219(i2, this, 0);
        this.f4572 = new C10219(i2, this, 0);
        this.f4574 = new C10219(i2, this, 0);
        this.f4573 = new C10219(i2, this, 0);
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InetSocketAddress m4636() {
        return this.f4578;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4637(InetSocketAddress inetSocketAddress) {
        this.f4578 = inetSocketAddress;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m4642() {
        return ((((this.f4576 - 12) - this.f4575.size()) - this.f4572.size()) - this.f4574.size()) - this.f4573.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4641(C23120 c23120) throws IOException {
        C10219 c10219 = new C10219(512, this, 0);
        c10219.m26355(c23120.m35359());
        c10219.writeShort(c23120.m35360().m53580());
        c10219.writeShort(c23120.m35354().m17677());
        byte[] byteArray = c10219.toByteArray();
        c10219.close();
        if (byteArray.length < m4642()) {
            this.f62024.add(c23120);
            this.f4575.write(byteArray, 0, byteArray.length);
            return;
        }
        throw new IOException("message full");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4638(C0525 c0525, AbstractC17152 abstractC17152) throws IOException {
        if (c0525 == null || !abstractC17152.m40297(c0525)) {
            m4640(abstractC17152, 0L);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4640(AbstractC17152 abstractC17152, long j) throws IOException {
        if (abstractC17152 != null) {
            if (j == 0 || !abstractC17152.mo35351(j)) {
                C10219 c10219 = new C10219(512, this, 0);
                c10219.m26356(abstractC17152, j);
                byte[] byteArray = c10219.toByteArray();
                c10219.close();
                if (byteArray.length < m4642()) {
                    this.f62027.add(abstractC17152);
                    this.f4572.write(byteArray, 0, byteArray.length);
                    return;
                }
                throw new IOException("message full");
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4639(AbstractC17152 abstractC17152) throws IOException {
        C10219 c10219 = new C10219(512, this, 0);
        c10219.m26356(abstractC17152, 0L);
        byte[] byteArray = c10219.toByteArray();
        c10219.close();
        if (byteArray.length < m4642()) {
            this.f62023.add(abstractC17152);
            this.f4574.write(byteArray, 0, byteArray.length);
            return;
        }
        throw new IOException("message full");
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final byte[] m4644() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f4577.clear();
        C10219 c10219 = new C10219(this.f4576, this, 0);
        c10219.writeShort(this.f62025 ? 0 : m44436());
        c10219.writeShort(m44427());
        List<C23120> list = this.f62024;
        c10219.writeShort(list.size());
        List list2 = this.f62027;
        c10219.writeShort(list2.size());
        List list3 = this.f62023;
        c10219.writeShort(list3.size());
        List list4 = this.f62022;
        c10219.writeShort(list4.size());
        for (C23120 c23120 : list) {
            c10219.m26355(c23120.m35359());
            c10219.writeShort(c23120.m35360().m53580());
            c10219.writeShort(c23120.m35354().m17677());
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            c10219.m26356((AbstractC17152) it.next(), jCurrentTimeMillis);
        }
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            c10219.m26356((AbstractC17152) it2.next(), jCurrentTimeMillis);
        }
        Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            c10219.m26356((AbstractC17152) it3.next(), jCurrentTimeMillis);
        }
        byte[] byteArray = c10219.toByteArray();
        try {
            c10219.close();
        } catch (IOException unused) {
        }
        return byteArray;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m44428() ? "dns[query:" : "dns[response:");
        sb.append(" id=0x");
        sb.append(Integer.toHexString(m44436()));
        if (m44427() != 0) {
            sb.append(", flags=0x");
            sb.append(Integer.toHexString(m44427()));
            if (m44437()) {
                sb.append(":r");
            }
            if (m44429()) {
                sb.append(":aa");
            }
            if (m44431()) {
                sb.append(":tc");
            }
        }
        List<C23120> list = this.f62024;
        if (list.size() > 0) {
            sb.append(", questions=");
            sb.append(list.size());
        }
        List<AbstractC17152> list2 = this.f62027;
        if (list2.size() > 0) {
            sb.append(", answers=");
            sb.append(list2.size());
        }
        List<AbstractC17152> list3 = this.f62023;
        if (list3.size() > 0) {
            sb.append(", authorities=");
            sb.append(list3.size());
        }
        List<AbstractC17152> list4 = this.f62022;
        if (list4.size() > 0) {
            sb.append(", additionals=");
            sb.append(list4.size());
        }
        if (list.size() > 0) {
            sb.append("\nquestions:");
            for (C23120 c23120 : list) {
                sb.append("\n\t");
                sb.append(c23120);
            }
        }
        if (list2.size() > 0) {
            sb.append("\nanswers:");
            for (AbstractC17152 abstractC17152 : list2) {
                sb.append("\n\t");
                sb.append(abstractC17152);
            }
        }
        if (list3.size() > 0) {
            sb.append("\nauthorities:");
            for (AbstractC17152 abstractC17153 : list3) {
                sb.append("\n\t");
                sb.append(abstractC17153);
            }
        }
        if (list4.size() > 0) {
            sb.append("\nadditionals:");
            for (AbstractC17152 abstractC17154 : list4) {
                sb.append("\n\t");
                sb.append(abstractC17154);
            }
        }
        sb.append("\nnames=");
        sb.append(this.f4577);
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int m4643() {
        return this.f4576;
    }
}
