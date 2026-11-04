package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۜ᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: U1KY */
/* JADX INFO: loaded from: classes4.dex */
public final class C7475 implements InterfaceC8966 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f24736;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f24737;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f24738;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f24739;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f24740;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f24741;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public List f24742;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f24743;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f24744;

    @Override // l.InterfaceC9711
    /* JADX INFO: renamed from: ۙ */
    public final int mo9797(boolean z) {
        return z ? mo9807() : mo9803();
    }

    @Override // l.InterfaceC9711
    /* JADX INFO: renamed from: ۤ */
    public final int mo9799(boolean z) {
        return z ? mo9796() : mo9801();
    }

    public C7475(InterfaceC8966 interfaceC8966, List list) {
        this(interfaceC8966.mo20528(), interfaceC8966.mo20522(), interfaceC8966.mo20524(), interfaceC8966.mo20518(), interfaceC8966.mo9807(), interfaceC8966.mo9796(), interfaceC8966.mo9803(), interfaceC8966.mo9801(), list);
    }

    @Override // l.InterfaceC9711
    /* JADX INFO: renamed from: ᩷ */
    public final void mo9806(int i, boolean z) {
        if (z) {
            mo9804(i);
        } else {
            mo9802(i);
        }
    }

    @Override // l.InterfaceC8966
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo20529(boolean z) {
        return z ? mo20528() : mo20524();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    public C7475(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, List list) {
        this.f24741 = i;
        this.f24737 = i2;
        this.f24740 = i3;
        this.f24743 = i4;
        this.f24738 = i5;
        this.f24739 = i6;
        this.f24736 = i7;
        this.f24744 = i8;
        int i9 = i6 - i5;
        int i10 = i8 - i7;
        if (list != null) {
            int size = list.size();
            if (size == 0) {
                list = null;
            } else if (size == 1) {
                InterfaceC9711 interfaceC9711 = (InterfaceC9711) list.get(0);
                if (interfaceC9711.mo9807() == 0 && interfaceC9711.mo9803() == 0 && interfaceC9711.mo9796() == i9 && interfaceC9711.mo9801() == i10) {
                    list = null;
                }
            }
        }
        this.f24742 = list;
        if (this.f24741 == this.f24737 && this.f24740 == this.f24743) {
            System.err.println("LineFragmentImpl should not be empty: " + toString());
        }
        if (this.f24741 > this.f24737 || this.f24740 > this.f24743 || this.f24738 > this.f24739 || this.f24736 > this.f24744) {
            System.err.println("LineFragmentImpl is invalid: " + toString());
        }
    }

    @Override // l.InterfaceC8966
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int mo20530(boolean z) {
        return z ? mo20522() : mo20518();
    }

    @Override // l.InterfaceC9711
    /* JADX INFO: renamed from: ᩸ */
    public final void mo9808(int i, boolean z) {
        if (z) {
            mo9800(i);
        } else {
            mo9805(i);
        }
    }

    @Override // l.InterfaceC8966
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo20520(int i, boolean z) {
        if (z) {
            mo20523(i);
        } else {
            mo20526(i);
        }
    }

    public C7475(C20348 c20348) {
        this.f24741 = c20348.readInt();
        this.f24737 = c20348.readInt();
        this.f24740 = c20348.readInt();
        this.f24743 = c20348.readInt();
        this.f24738 = c20348.readInt();
        this.f24739 = c20348.readInt();
        this.f24736 = c20348.readInt();
        this.f24744 = c20348.readInt();
        if (c20348.m46753()) {
            int i = c20348.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new C3000(c20348));
            }
            this.f24742 = arrayList;
        }
    }

    @Override // l.InterfaceC8966
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo20528() {
        return this.f24741;
    }

    @Override // l.InterfaceC8966
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int mo20522() {
        return this.f24737;
    }

    @Override // l.InterfaceC8966
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int mo20524() {
        return this.f24740;
    }

    @Override // l.InterfaceC8966
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo20518() {
        return this.f24743;
    }

    @Override // l.InterfaceC9711
    /* JADX INFO: renamed from: ᩸ */
    public final int mo9807() {
        return this.f24738;
    }

    @Override // l.InterfaceC9711
    /* JADX INFO: renamed from: ۙ */
    public final int mo9796() {
        return this.f24739;
    }

    @Override // l.InterfaceC9711
    /* JADX INFO: renamed from: ᩴ */
    public final int mo9803() {
        return this.f24736;
    }

    @Override // l.InterfaceC9711
    /* JADX INFO: renamed from: ۫ */
    public final int mo9801() {
        return this.f24744;
    }

    @Override // l.InterfaceC8966
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo20525(int i, boolean z) {
        if (z) {
            this.f24741 = i;
        } else {
            this.f24740 = i;
        }
    }

    @Override // l.InterfaceC8966
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo20531(int i) {
        this.f24741 = i;
    }

    @Override // l.InterfaceC8966
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo20523(int i) {
        this.f24737 = i;
    }

    @Override // l.InterfaceC8966
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo20519(int i) {
        this.f24740 = i;
    }

    @Override // l.InterfaceC8966
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void mo20526(int i) {
        this.f24743 = i;
    }

    @Override // l.InterfaceC9711
    /* JADX INFO: renamed from: ᩴ */
    public final void mo9804(int i) {
        this.f24738 = i;
    }

    @Override // l.InterfaceC9711
    /* JADX INFO: renamed from: ۤ */
    public final void mo9800(int i) {
        this.f24739 = i;
    }

    @Override // l.InterfaceC9711
    /* JADX INFO: renamed from: ܳ */
    public final void mo9802(int i) {
        this.f24736 = i;
    }

    @Override // l.InterfaceC9711
    /* JADX INFO: renamed from: ᩷ */
    public final void mo9805(int i) {
        this.f24744 = i;
    }

    @Override // l.InterfaceC9711
    /* JADX INFO: renamed from: ۙ */
    public final void mo9798(C6178 c6178) {
        c6178.writeInt(this.f24741);
        c6178.writeInt(this.f24737);
        c6178.writeInt(this.f24740);
        c6178.writeInt(this.f24743);
        c6178.writeInt(this.f24738);
        c6178.writeInt(this.f24739);
        c6178.writeInt(this.f24736);
        c6178.writeInt(this.f24744);
        if (this.f24742 == null) {
            c6178.writeByte(0);
            return;
        }
        c6178.m17789(true);
        c6178.writeInt(this.f24742.size());
        Iterator it = this.f24742.iterator();
        while (it.hasNext()) {
            ((InterfaceC9711) it.next()).mo9798(c6178);
        }
    }

    @Override // l.InterfaceC8966
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List mo20527() {
        return this.f24742;
    }

    @Override // l.InterfaceC8966
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo20521(List list) {
        this.f24742 = list;
    }

    public final String toString() {
        return "LineFragmentImpl: Lines [" + this.f24741 + ", " + this.f24737 + ") - [" + this.f24740 + ", " + this.f24743 + "); Offsets [" + this.f24738 + ", " + this.f24739 + ") - [" + this.f24736 + ", " + this.f24744 + "); Inner " + this.f24742;
    }
}
