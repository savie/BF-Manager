package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙ᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 44P2 */
/* JADX INFO: loaded from: classes3.dex */
public class C4943 implements InterfaceC22583 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f17276;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public AbstractC1415 f17277;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ArrayList f17275 = new ArrayList(100);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f17278 = -1;

    @Override // l.InterfaceC22583
    /* JADX INFO: renamed from: ۙ */
    public final int mo11328() {
        return 0;
    }

    @Override // l.InterfaceC22583
    /* JADX INFO: renamed from: ۨ */
    public final void mo11331(int i) {
    }

    public C4943(AbstractC1415 abstractC1415) {
        this.f17277 = abstractC1415;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m13726(int i) {
        return m13729(i);
    }

    @Override // l.InterfaceC22583
    public final int index() {
        return this.f17278;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC19761 mo13724(int i) {
        m13727();
        if (i == 0) {
            return null;
        }
        if (i < 0) {
            int i2 = -i;
            ArrayList arrayList = this.f17275;
            if (i2 != 0) {
                int size = this.f17278;
                if (size - i2 >= 0) {
                    for (int i3 = 1; i3 <= i2 && size > 0; i3++) {
                        size--;
                        m13725(size);
                        if (size >= arrayList.size()) {
                            size = arrayList.size() - 1;
                        } else {
                            while (size >= 0) {
                                InterfaceC19761 interfaceC19761 = (InterfaceC19761) arrayList.get(size);
                                if (interfaceC19761.getType() == -1 || interfaceC19761.mo22512() == 0) {
                                    break;
                                }
                                size--;
                            }
                        }
                    }
                    if (size >= 0) {
                        return (InterfaceC19761) arrayList.get(size);
                    }
                }
            }
            return null;
        }
        int iM13729 = this.f17278;
        for (int i4 = 1; i4 < i; i4++) {
            int i5 = iM13729 + 1;
            if (m13725(i5)) {
                iM13729 = m13729(i5);
            }
        }
        return (InterfaceC19761) this.f17275.get(iM13729);
    }

    @Override // l.InterfaceC22583
    /* JADX INFO: renamed from: ۙ */
    public final void mo11329(int i) {
        m13727();
        this.f17278 = m13726(i);
    }

    @Override // l.InterfaceC22583
    public final int size() {
        return this.f17275.size();
    }

    @Override // l.InterfaceC22583
    /* JADX INFO: renamed from: ܰ */
    public final void mo11333() {
        ArrayList arrayList = this.f17275;
        int i = this.f17278;
        if ((i < 0 || (!this.f17276 ? i >= arrayList.size() : i >= arrayList.size() - 1)) && mo11332(1) == -1) {
            throw new IllegalStateException("cannot consume EOF");
        }
        if (m13725(this.f17278 + 1)) {
            this.f17278 = m13726(this.f17278 + 1);
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m13725(int i) {
        int size = (i - this.f17275.size()) + 1;
        return size <= 0 || mo13730(size) >= size;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int mo13730(int i) {
        ArrayList arrayList = this.f17275;
        if (this.f17276) {
            return 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC19761 interfaceC19761NextToken = this.f17277.nextToken();
            if (interfaceC19761NextToken instanceof C9386) {
                ((C9386) interfaceC19761NextToken).m24079(arrayList.size());
            }
            arrayList.add(interfaceC19761NextToken);
            if (interfaceC19761NextToken.getType() == -1) {
                this.f17276 = true;
                return i2 + 1;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final InterfaceC19761 m13722(int i) {
        ArrayList arrayList = this.f17275;
        if (i >= 0 && i < arrayList.size()) {
            return (InterfaceC19761) arrayList.get(i);
        }
        StringBuilder sbM40153 = C17214.m40153(i, "token index ", " out of range 0..");
        sbM40153.append(arrayList.size() - 1);
        throw new IndexOutOfBoundsException(sbM40153.toString());
    }

    @Override // l.InterfaceC22583
    /* JADX INFO: renamed from: ܰ */
    public final int mo11332(int i) {
        return mo13724(i).getType();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m13727() {
        if (this.f17278 == -1) {
            m13725(0);
            this.f17278 = m13726(0);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList m13723() {
        return this.f17275;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m13729(int i) {
        ArrayList arrayList = this.f17275;
        m13725(i);
        if (i >= arrayList.size()) {
            return arrayList.size() - 1;
        }
        Object obj = arrayList.get(i);
        while (true) {
            InterfaceC19761 interfaceC19761 = (InterfaceC19761) obj;
            if (interfaceC19761.mo22512() == 0 || interfaceC19761.getType() == -1) {
                break;
            }
            i++;
            m13725(i);
            obj = arrayList.get(i);
        }
        return i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m13728() {
        m13727();
        while (mo13730(1000) >= 1000) {
        }
    }
}
