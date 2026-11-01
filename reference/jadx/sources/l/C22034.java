package l;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩹ۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 6A0Y */
/* JADX INFO: loaded from: classes.dex */
public final class C22034 extends AbstractC2277 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C5100 f71410;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C5100 f71411;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C5100 f71412;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f71413;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C5100 f71414;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public HashMap f71415;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public InetSocketAddress f71416;

    public C22034(int i) {
        this(i, 1460, true);
    }

    public C22034(int i, int i2, boolean z) {
        super(i, 0, z);
        this.f71415 = new HashMap();
        this.f71413 = i2 > 0 ? i2 : 1460;
        this.f71414 = new C5100(i2, this, 0);
        this.f71410 = new C5100(i2, this, 0);
        this.f71411 = new C5100(i2, this, 0);
        this.f71412 = new C5100(i2, this, 0);
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final InetSocketAddress m48945() {
        return this.f71416;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48940(InetSocketAddress inetSocketAddress) {
        this.f71416 = inetSocketAddress;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m48946() {
        return ((((this.f71413 - 12) - this.f71414.size()) - this.f71410.size()) - this.f71411.size()) - this.f71412.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48942(C18506 c18506) throws IOException {
        C5100 c5100 = new C5100(512, this, 0);
        c5100.m14210(c18506.m24477());
        c5100.writeShort(c18506.m24467().m34598());
        c5100.writeShort(c18506.m24475().m51842());
        byte[] byteArray = c5100.toByteArray();
        c5100.close();
        if (byteArray.length < m48946()) {
            this.f8126.add(c18506);
            this.f71414.write(byteArray, 0, byteArray.length);
            return;
        }
        throw new IOException("message full");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48941(C13568 c13568, AbstractC19918 abstractC19918) throws IOException {
        if (c13568 == null || !abstractC19918.m45204(c13568)) {
            m48944(abstractC19918, 0L);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48944(AbstractC19918 abstractC19918, long j) throws IOException {
        if (abstractC19918 != null) {
            if (j == 0 || !abstractC19918.mo24471(j)) {
                C5100 c5100 = new C5100(512, this, 0);
                c5100.m14211(abstractC19918, j);
                byte[] byteArray = c5100.toByteArray();
                c5100.close();
                if (byteArray.length < m48946()) {
                    this.f8131.add(abstractC19918);
                    this.f71410.write(byteArray, 0, byteArray.length);
                    return;
                }
                throw new IOException("message full");
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48943(AbstractC19918 abstractC19918) throws IOException {
        C5100 c5100 = new C5100(512, this, 0);
        c5100.m14211(abstractC19918, 0L);
        byte[] byteArray = c5100.toByteArray();
        c5100.close();
        if (byteArray.length < m48946()) {
            this.f8130.add(abstractC19918);
            this.f71411.write(byteArray, 0, byteArray.length);
            return;
        }
        throw new IOException("message full");
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final byte[] m48947() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f71415.clear();
        C5100 c5100 = new C5100(this.f71413, this, 0);
        c5100.writeShort(this.f8132 ? 0 : m6974());
        c5100.writeShort(m6980());
        List<C18506> list = this.f8126;
        c5100.writeShort(list.size());
        List list2 = this.f8131;
        c5100.writeShort(list2.size());
        List list3 = this.f8130;
        c5100.writeShort(list3.size());
        List list4 = this.f8128;
        c5100.writeShort(list4.size());
        for (C18506 c18506 : list) {
            c5100.m14210(c18506.m24477());
            c5100.writeShort(c18506.m24467().m34598());
            c5100.writeShort(c18506.m24475().m51842());
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            c5100.m14211((AbstractC19918) it.next(), jCurrentTimeMillis);
        }
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            c5100.m14211((AbstractC19918) it2.next(), jCurrentTimeMillis);
        }
        Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            c5100.m14211((AbstractC19918) it3.next(), jCurrentTimeMillis);
        }
        byte[] byteArray = c5100.toByteArray();
        try {
            c5100.close();
        } catch (IOException unused) {
        }
        return byteArray;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m6979() ? "dns[query:" : "dns[response:");
        sb.append(" id=0x");
        sb.append(Integer.toHexString(m6974()));
        if (m6980() != 0) {
            sb.append(", flags=0x");
            sb.append(Integer.toHexString(m6980()));
            if (m6987()) {
                sb.append(":r");
            }
            if (m6973()) {
                sb.append(":aa");
            }
            if (m6984()) {
                sb.append(":tc");
            }
        }
        List<C18506> list = this.f8126;
        if (list.size() > 0) {
            sb.append(", questions=");
            sb.append(list.size());
        }
        List<AbstractC19918> list2 = this.f8131;
        if (list2.size() > 0) {
            sb.append(", answers=");
            sb.append(list2.size());
        }
        List<AbstractC19918> list3 = this.f8130;
        if (list3.size() > 0) {
            sb.append(", authorities=");
            sb.append(list3.size());
        }
        List<AbstractC19918> list4 = this.f8128;
        if (list4.size() > 0) {
            sb.append(", additionals=");
            sb.append(list4.size());
        }
        if (list.size() > 0) {
            sb.append("\nquestions:");
            for (C18506 c18506 : list) {
                sb.append("\n\t");
                sb.append(c18506);
            }
        }
        if (list2.size() > 0) {
            sb.append("\nanswers:");
            for (AbstractC19918 abstractC19918 : list2) {
                sb.append("\n\t");
                sb.append(abstractC19918);
            }
        }
        if (list3.size() > 0) {
            sb.append("\nauthorities:");
            for (AbstractC19918 abstractC19919 : list3) {
                sb.append("\n\t");
                sb.append(abstractC19919);
            }
        }
        if (list4.size() > 0) {
            sb.append("\nadditionals:");
            for (AbstractC19918 abstractC199110 : list4) {
                sb.append("\n\t");
                sb.append(abstractC199110);
            }
        }
        sb.append("\nnames=");
        sb.append(this.f71415);
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int m48948() {
        return this.f71413;
    }
}
