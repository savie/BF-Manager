package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.᩸ۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44RQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C21373 extends AbstractC12824 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C18551[] f69505;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f69506;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f69507;

    public C21373(C0206 c0206, C15916 c15916) {
        super(c0206);
        if (c15916.m37862() != ((C7262) super.mo31754()).mo19107()) {
            throw new IllegalArgumentException("Config layout differs from package");
        }
        this.f42695 = c15916;
        this.f69505 = new C18551[c0206.f1365.size()];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47903(C15916 c15916) {
        if (c15916.m37862() != ((C7262) super.mo31754()).mo19107()) {
            throw new IllegalArgumentException("Config layout differs from package");
        }
        this.f42695 = c15916;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18551 m47902(int i) {
        C18551[] c18551Arr = this.f69505;
        if (i < c18551Arr.length) {
            C18551 c18551 = c18551Arr[i];
            if (c18551 != null) {
                return c18551;
            }
            C18551 c18552 = new C18551(this, i);
            c18551Arr[i] = c18552;
            return c18552;
        }
        ((C0206) super.getType()).m1524(i);
        C18551[] c18551Arr2 = new C18551[((C0206) super.getType()).f1365.size()];
        C18551[] c18551Arr3 = this.f69505;
        System.arraycopy(c18551Arr3, 0, c18551Arr2, 0, c18551Arr3.length);
        this.f69505 = c18551Arr2;
        C18551 c18553 = new C18551(this, i);
        c18551Arr2[i] = c18553;
        return c18553;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m47901(int i) {
        this.f69505[i] = null;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m47907() {
        int i = 0;
        for (C18551 c18551 : this.f69505) {
            if (c18551 != null) {
                i++;
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47904(InterfaceC16662 interfaceC16662, C5851 c5851, C8516 c8516) throws IOException {
        C15916 c15916Mo31747 = mo31747();
        short sM37860 = (short) (c15916Mo31747.m37860() + 24);
        interfaceC16662.mo24505(ColorResourcesTableCreator.HEADER_TYPE_TYPE);
        interfaceC16662.mo24505(sM37860);
        long position = interfaceC16662.getPosition();
        interfaceC16662.mo24500();
        interfaceC16662.writeByte(((C0206) super.getType()).mo26942());
        boolean z = this.f69506;
        int i = z;
        if (this.f69507) {
            i = (z ? 1 : 0) | 2;
        }
        interfaceC16662.writeByte(i);
        int i2 = 0;
        interfaceC16662.writeByte(0);
        interfaceC16662.writeByte(0);
        int i3 = 1;
        if (this.f69506) {
            List list = (List) C20318.stream(this.f69505).filter(new C15024(0)).collect(C1890.toList());
            int size = list.size();
            interfaceC16662.writeInt(size);
            int i4 = size * 4;
            interfaceC16662.writeInt(sM37860 + i4);
            c15916Mo31747.m37863(interfaceC16662);
            long position2 = interfaceC16662.getPosition();
            interfaceC16662.skipBytes(i4);
            int[] iArr = new int[size];
            long position3 = interfaceC16662.getPosition();
            while (i2 < size) {
                if (c8516 != null) {
                    c8516.m22242(i3);
                }
                C18551 c18551 = (C18551) list.get(i2);
                int iMo10691 = c18551.mo10691();
                long position4 = interfaceC16662.getPosition() - position3;
                if (position4 % 4 != 0) {
                    throw new RuntimeException();
                }
                long j = position3;
                long j2 = position4 / 4;
                if (j2 < 0 || j2 > 65535) {
                    throw new IOException("Sparse offset out of range");
                }
                iArr[i2] = iMo10691 | (((int) j2) << 16);
                c18551.m42942(interfaceC16662, c5851);
                i2++;
                i3 = 1;
                position3 = j;
            }
            long position5 = interfaceC16662.getPosition();
            interfaceC16662.seek(position);
            interfaceC16662.writeInt((int) ((position5 - position) + 4));
            interfaceC16662.seek(position2);
            interfaceC16662.mo24506(iArr);
            interfaceC16662.seek(position5);
            return;
        }
        if (this.f69507) {
            int size2 = ((C0206) super.getType()).f1365.size();
            interfaceC16662.writeInt(size2);
            int i5 = size2 * 2;
            if (i5 % 4 != 0) {
                i5 += 2;
            }
            interfaceC16662.writeInt(sM37860 + i5);
            c15916Mo31747.m37863(interfaceC16662);
            long position6 = interfaceC16662.getPosition();
            interfaceC16662.skipBytes(i5);
            int[] iArr2 = new int[size2];
            Arrays.fill(iArr2, -1);
            long position7 = interfaceC16662.getPosition();
            for (C18551 c18552 : m31827()) {
                if (c8516 != null) {
                    c8516.m22242(1);
                }
                int position8 = (int) (interfaceC16662.getPosition() - position7);
                if (position8 % 4 != 0) {
                    throw new RuntimeException();
                }
                int i6 = position8 / 4;
                if (i6 == 65535) {
                    throw new IOException("Offset 16 out of range");
                }
                iArr2[c18552.mo10691()] = i6;
                c18552.m42942(interfaceC16662, c5851);
            }
            long position9 = interfaceC16662.getPosition();
            interfaceC16662.seek(position);
            interfaceC16662.writeInt((int) ((position9 - position) + 4));
            interfaceC16662.seek(position6);
            for (int i7 = 0; i7 < size2; i7++) {
                int i8 = iArr2[i7];
                if (i8 == -1) {
                    i8 = 65535;
                }
                interfaceC16662.mo24508(i8);
            }
            interfaceC16662.seek(position9);
            return;
        }
        int size3 = ((C0206) super.getType()).f1365.size();
        interfaceC16662.writeInt(size3);
        int i9 = size3 * 4;
        interfaceC16662.writeInt(sM37860 + i9);
        c15916Mo31747.m37863(interfaceC16662);
        long position10 = interfaceC16662.getPosition();
        interfaceC16662.skipBytes(i9);
        int[] iArr3 = new int[size3];
        Arrays.fill(iArr3, -1);
        long position11 = interfaceC16662.getPosition();
        for (C18551 c18553 : m31827()) {
            if (c8516 != null) {
                c8516.m22242(1);
            }
            iArr3[c18553.mo10691()] = (int) (interfaceC16662.getPosition() - position11);
            c18553.m42942(interfaceC16662, c5851);
        }
        long position12 = interfaceC16662.getPosition();
        interfaceC16662.seek(position);
        interfaceC16662.writeInt((int) ((position12 - position) + 4));
        interfaceC16662.seek(position10);
        interfaceC16662.mo24506(iArr3);
        interfaceC16662.seek(position12);
    }

    @Override // l.InterfaceC12783
    /* JADX INFO: renamed from: ۤ */
    public final int mo31751() {
        return this.f69505.length - 1;
    }

    @Override // l.InterfaceC12783
    /* JADX INFO: renamed from: ܶ */
    public final boolean mo31756(int i) {
        C18551[] c18551Arr = this.f69505;
        return i < c18551Arr.length && c18551Arr[i] != null;
    }

    @Override // l.InterfaceC12783
    /* JADX INFO: renamed from: ۡۙ */
    public final boolean mo31750() {
        return this.f69506;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m47906(boolean z) {
        this.f69506 = z;
    }

    @Override // l.InterfaceC12783
    /* JADX INFO: renamed from: ۘܰ */
    public final boolean mo31748() {
        return this.f69507;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47905(boolean z) {
        this.f69507 = z;
    }

    @Override // l.InterfaceC12783
    /* JADX INFO: renamed from: ۨ */
    public final String mo31752(int i) {
        return this.f69505[i].mo7645();
    }

    @Override // l.InterfaceC12783
    /* JADX INFO: renamed from: ܰ */
    public final C18551 mo31753(int i) {
        if (i < 0) {
            return null;
        }
        C18551[] c18551Arr = this.f69505;
        if (i >= c18551Arr.length) {
            return null;
        }
        return c18551Arr[i];
    }

    @Override // l.AbstractC12824, l.InterfaceC12783
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC6432 mo31749() {
        return (C22785) super.mo31749();
    }

    @Override // l.AbstractC12824, l.InterfaceC12783
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC17721 mo31754() {
        return (C7262) super.mo31754();
    }

    @Override // l.AbstractC12824, l.InterfaceC12783
    public final C0206 getType() {
        return (C0206) super.getType();
    }

    @Override // l.AbstractC12824, l.InterfaceC12783
    public final InterfaceC19133 getType() {
        return (C0206) super.getType();
    }
}
