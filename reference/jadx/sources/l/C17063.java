package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܿۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 44P2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17063 implements InterfaceC3739 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C21660 f54473;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f54474;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public ArrayList f54475 = new ArrayList(100);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f54477 = -1;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f54476 = -1;

    @Override // l.InterfaceC14242
    /* JADX INFO: renamed from: ܰ */
    public final void mo34375() {
        if (this.f54477 == -1) {
            m39850();
        }
        int i = this.f54477 + 1;
        this.f54477 = i;
        m39849(i);
        while (((InterfaceC12913) this.f54475.get(this.f54477)).mo30182() != 0) {
            int i2 = this.f54477 + 1;
            this.f54477 = i2;
            m39849(i2);
        }
    }

    public C17063(C21660 c21660) {
        this.f54473 = c21660;
    }

    @Override // l.InterfaceC14242
    public final int index() {
        return this.f54477;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m39845() {
        if (this.f54477 == -1) {
            m39850();
        }
        int i = this.f54477;
        this.f54474 = i;
        return i;
    }

    @Override // l.InterfaceC3739
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC12913 mo10949(int i) {
        if (this.f54477 == -1) {
            m39850();
        }
        if (i == 0) {
            return null;
        }
        ArrayList arrayList = this.f54475;
        int i2 = 1;
        if (i >= 0) {
            int i3 = this.f54477;
            while (i2 < i) {
                i3++;
                m39849(i3);
                while (((InterfaceC12913) arrayList.get(i3)).mo30182() != 0) {
                    i3++;
                    m39849(i3);
                }
                i2++;
            }
            if (i3 > this.f54476) {
                this.f54476 = i3;
            }
            return (InterfaceC12913) arrayList.get(i3);
        }
        int i4 = -i;
        if (i4 == 0) {
            return null;
        }
        int i5 = this.f54477;
        if (i5 - i4 < 0) {
            return null;
        }
        while (i2 <= i4) {
            do {
                i5--;
                if (i5 < 0) {
                    break;
                }
            } while (((InterfaceC12913) arrayList.get(i5)).mo30182() != 0);
            i2++;
        }
        if (i5 < 0) {
            return null;
        }
        return (InterfaceC12913) arrayList.get(i5);
    }

    @Override // l.InterfaceC14242
    /* JADX INFO: renamed from: ᩹ */
    public final void mo34376() {
        this.f54477 = this.f54474;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m39846(int i) {
        this.f54477 = i;
    }

    @Override // l.InterfaceC14242
    /* JADX INFO: renamed from: ۙ */
    public final void mo34374(int i) {
        this.f54477 = i;
    }

    @Override // l.InterfaceC14242
    public final int size() {
        return this.f54475.size();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m39849(int i) {
        ArrayList arrayList = this.f54475;
        int size = (i - arrayList.size()) + 1;
        if (size > 0) {
            for (int i2 = 1; i2 <= size; i2++) {
                C12125 c12125M48380 = this.f54473.m48380();
                c12125M48380.f40590 = arrayList.size();
                arrayList.add(c12125M48380);
                if (c12125M48380.f40598 == -1) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m39850() {
        int i = 0;
        this.f54477 = 0;
        m39849(0);
        while (((InterfaceC12913) this.f54475.get(i)).mo30182() != 0) {
            i++;
            m39849(i);
        }
        this.f54477 = i;
    }

    @Override // l.InterfaceC14242
    /* JADX INFO: renamed from: ܰ */
    public final int mo21038(int i) {
        return mo10949(i).getType();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m39848() {
        return this.f54473.m48386();
    }

    public final String toString() {
        if (this.f54477 == -1) {
            m39850();
        }
        if (this.f54477 == -1) {
            m39850();
        }
        int i = this.f54477;
        ArrayList arrayList = this.f54475;
        if (((InterfaceC12913) arrayList.get(i)).getType() != -1) {
            int i2 = this.f54477 + 1;
            m39849(i2);
            while (((InterfaceC12913) arrayList.get(i2)).getType() != -1) {
                i2++;
                m39849(i2);
            }
        }
        return mo10948(0, arrayList.size() - 1);
    }

    @Override // l.InterfaceC3739
    /* JADX INFO: renamed from: ۙ */
    public final String mo10948(int i, int i2) {
        if (i < 0 || i2 < 0) {
            return null;
        }
        if (this.f54477 == -1) {
            m39850();
        }
        ArrayList arrayList = this.f54475;
        if (i2 >= arrayList.size()) {
            i2 = arrayList.size() - 1;
        }
        StringBuilder sb = new StringBuilder();
        while (i <= i2) {
            InterfaceC12913 interfaceC12913 = (InterfaceC12913) arrayList.get(i);
            if (interfaceC12913.getType() == -1) {
                break;
            }
            sb.append(interfaceC12913.getText());
            i++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m39847(InterfaceC12913 interfaceC12913, InterfaceC12913 interfaceC12914) {
        if (interfaceC12913 == null || interfaceC12914 == null) {
            return null;
        }
        return mo10948(interfaceC12913.mo30180(), interfaceC12914.mo30180());
    }
}
