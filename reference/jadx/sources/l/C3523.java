package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗܺۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44P2 */
/* JADX INFO: loaded from: classes3.dex */
public class C3523 implements InterfaceC4269 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f12103;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractC14709 f12104;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f12106 = new ArrayList(100);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f12105 = -1;

    @Override // l.InterfaceC4269
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo11529() {
        return 0;
    }

    @Override // l.InterfaceC4269
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo11533(int i) {
    }

    public C3523(AbstractC14709 abstractC14709) {
        this.f12104 = abstractC14709;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m11535(int i) {
        return m11531(i);
    }

    @Override // l.InterfaceC4269
    public final int index() {
        return this.f12105;
    }

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC8743 mo5263(int i) {
        m11536();
        if (i == 0) {
            return null;
        }
        if (i < 0) {
            int i2 = -i;
            ArrayList arrayList = this.f12106;
            if (i2 != 0) {
                int size = this.f12105;
                if (size - i2 >= 0) {
                    for (int i3 = 1; i3 <= i2 && size > 0; i3++) {
                        size--;
                        m11528(size);
                        if (size >= arrayList.size()) {
                            size = arrayList.size() - 1;
                        } else {
                            while (size >= 0) {
                                InterfaceC8743 interfaceC8743 = (InterfaceC8743) arrayList.get(size);
                                if (interfaceC8743.getType() == -1 || interfaceC8743.mo23441() == 0) {
                                    break;
                                }
                                size--;
                            }
                        }
                    }
                    if (size >= 0) {
                        return (InterfaceC8743) arrayList.get(size);
                    }
                }
            }
            return null;
        }
        int iM11531 = this.f12105;
        for (int i4 = 1; i4 < i; i4++) {
            int i5 = iM11531 + 1;
            if (m11528(i5)) {
                iM11531 = m11531(i5);
            }
        }
        return (InterfaceC8743) this.f12106.get(iM11531);
    }

    @Override // l.InterfaceC4269
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11530(int i) {
        m11536();
        this.f12105 = m11535(i);
    }

    @Override // l.InterfaceC4269
    public final int size() {
        return this.f12106.size();
    }

    @Override // l.InterfaceC4269
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo11538() {
        ArrayList arrayList = this.f12106;
        int i = this.f12105;
        if ((i < 0 || (!this.f12103 ? i >= arrayList.size() : i >= arrayList.size() - 1)) && mo11537(1) == -1) {
            throw new IllegalStateException("cannot consume EOF");
        }
        if (m11528(this.f12105 + 1)) {
            this.f12105 = m11535(this.f12105 + 1);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m11528(int i) {
        int size = (i - this.f12106.size()) + 1;
        return size <= 0 || mo6508(size) >= size;
    }

    /* JADX INFO: renamed from: ܳ */
    public int mo6508(int i) {
        ArrayList arrayList = this.f12106;
        if (this.f12103) {
            return 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC8743 interfaceC8743NextToken = this.f12104.nextToken();
            if (interfaceC8743NextToken instanceof C16201) {
                ((C16201) interfaceC8743NextToken).m38430(arrayList.size());
            }
            arrayList.add(interfaceC8743NextToken);
            if (interfaceC8743NextToken.getType() == -1) {
                this.f12103 = true;
                return i2 + 1;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC8743 m11534(int i) {
        ArrayList arrayList = this.f12106;
        if (i >= 0 && i < arrayList.size()) {
            return (InterfaceC8743) arrayList.get(i);
        }
        StringBuilder sbM12235 = C3769.m12235(i, "token index ", " out of range 0..");
        sbM12235.append(arrayList.size() - 1);
        throw new IndexOutOfBoundsException(sbM12235.toString());
    }

    @Override // l.InterfaceC4269
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo11537(int i) {
        return mo5263(i).getType();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m11536() {
        if (this.f12105 == -1) {
            m11528(0);
            this.f12105 = m11535(0);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList m11539() {
        return this.f12106;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m11531(int i) {
        ArrayList arrayList = this.f12106;
        m11528(i);
        if (i >= arrayList.size()) {
            return arrayList.size() - 1;
        }
        Object obj = arrayList.get(i);
        while (true) {
            InterfaceC8743 interfaceC8743 = (InterfaceC8743) obj;
            if (interfaceC8743.mo23441() == 0 || interfaceC8743.getType() == -1) {
                break;
            }
            i++;
            m11528(i);
            obj = arrayList.get(i);
        }
        return i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m11532() {
        m11536();
        while (mo6508(1000) >= 1000) {
        }
    }
}
