package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۚ᩻ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44P2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6003 implements InterfaceC18681 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f20536;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C9354 f20540;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public ArrayList f20538 = new ArrayList(100);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f20539 = -1;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f20537 = -1;

    @Override // l.InterfaceC17189
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo17444() {
        if (this.f20539 == -1) {
            m17438();
        }
        int i = this.f20539 + 1;
        this.f20539 = i;
        m17443(i);
        while (((InterfaceC21665) this.f20538.get(this.f20539)).mo33103() != 0) {
            int i2 = this.f20539 + 1;
            this.f20539 = i2;
            m17443(i2);
        }
    }

    public C6003(C9354 c9354) {
        this.f20540 = c9354;
    }

    @Override // l.InterfaceC17189
    public final int index() {
        return this.f20539;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m17440() {
        if (this.f20539 == -1) {
            m17438();
        }
        int i = this.f20539;
        this.f20536 = i;
        return i;
    }

    @Override // l.InterfaceC18681
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21665 mo17439(int i) {
        if (this.f20539 == -1) {
            m17438();
        }
        if (i == 0) {
            return null;
        }
        ArrayList arrayList = this.f20538;
        int i2 = 1;
        if (i >= 0) {
            int i3 = this.f20539;
            while (i2 < i) {
                i3++;
                m17443(i3);
                while (((InterfaceC21665) arrayList.get(i3)).mo33103() != 0) {
                    i3++;
                    m17443(i3);
                }
                i2++;
            }
            if (i3 > this.f20537) {
                this.f20537 = i3;
            }
            return (InterfaceC21665) arrayList.get(i3);
        }
        int i4 = -i;
        if (i4 == 0) {
            return null;
        }
        int i5 = this.f20539;
        if (i5 - i4 < 0) {
            return null;
        }
        while (i2 <= i4) {
            do {
                i5--;
                if (i5 < 0) {
                    break;
                }
            } while (((InterfaceC21665) arrayList.get(i5)).mo33103() != 0);
            i2++;
        }
        if (i5 < 0) {
            return null;
        }
        return (InterfaceC21665) arrayList.get(i5);
    }

    @Override // l.InterfaceC17189
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void mo17441() {
        this.f20539 = this.f20536;
    }

    @Override // l.InterfaceC17189
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17437(int i) {
        this.f20539 = i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m17445(int i) {
        this.f20539 = i;
    }

    @Override // l.InterfaceC17189
    public final int size() {
        return this.f20538.size();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m17443(int i) {
        ArrayList arrayList = this.f20538;
        int size = (i - arrayList.size()) + 1;
        if (size > 0) {
            for (int i2 = 1; i2 <= size; i2++) {
                C13460 c13460M24669 = this.f20540.m24669();
                c13460M24669.f42851 = arrayList.size();
                arrayList.add(c13460M24669);
                if (c13460M24669.f42848 == -1) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m17438() {
        int i = 0;
        this.f20539 = 0;
        m17443(0);
        while (((InterfaceC21665) this.f20538.get(i)).mo33103() != 0) {
            i++;
            m17443(i);
        }
        this.f20539 = i;
    }

    @Override // l.InterfaceC17189
    /* JADX INFO: renamed from: ᩷ */
    public final int mo9833(int i) {
        return mo17439(i).getType();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m17442() {
        return this.f20540.m24664();
    }

    public final String toString() {
        if (this.f20539 == -1) {
            m17438();
        }
        if (this.f20539 == -1) {
            m17438();
        }
        int i = this.f20539;
        ArrayList arrayList = this.f20538;
        if (((InterfaceC21665) arrayList.get(i)).getType() != -1) {
            int i2 = this.f20539 + 1;
            m17443(i2);
            while (((InterfaceC21665) arrayList.get(i2)).getType() != -1) {
                i2++;
                m17443(i2);
            }
        }
        return mo17435(0, arrayList.size() - 1);
    }

    @Override // l.InterfaceC18681
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo17435(int i, int i2) {
        if (i < 0 || i2 < 0) {
            return null;
        }
        if (this.f20539 == -1) {
            m17438();
        }
        ArrayList arrayList = this.f20538;
        if (i2 >= arrayList.size()) {
            i2 = arrayList.size() - 1;
        }
        StringBuilder sb = new StringBuilder();
        while (i <= i2) {
            InterfaceC21665 interfaceC21665 = (InterfaceC21665) arrayList.get(i);
            if (interfaceC21665.getType() == -1) {
                break;
            }
            sb.append(interfaceC21665.getText());
            i++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m17436(InterfaceC21665 interfaceC21665, InterfaceC21665 interfaceC21666) {
        if (interfaceC21665 == null || interfaceC21666 == null) {
            return null;
        }
        return mo17435(interfaceC21665.mo33100(), interfaceC21666.mo33100());
    }
}
