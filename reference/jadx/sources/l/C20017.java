package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44RQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20017 extends AbstractC22343 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f64313;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f64314;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C13304[] f64315;

    public C20017(C23747 c23747, C20500 c20500) {
        super(c23747);
        if (c20500.m47021() != ((C25239) super.mo9071()).mo27606()) {
            throw new IllegalArgumentException("Config layout differs from package");
        }
        this.f72322 = c20500;
        this.f64315 = new C13304[c23747.f76957.size()];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46051(C20500 c20500) {
        if (c20500.m47021() != ((C25239) super.mo9071()).mo27606()) {
            throw new IllegalArgumentException("Config layout differs from package");
        }
        this.f72322 = c20500;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13304 m46050(int i) {
        C13304[] c13304Arr = this.f64315;
        if (i < c13304Arr.length) {
            C13304 c13304 = c13304Arr[i];
            if (c13304 != null) {
                return c13304;
            }
            C13304 c13305 = new C13304(this, i);
            c13304Arr[i] = c13305;
            return c13305;
        }
        ((C23747) super.getType()).m53014(i);
        C13304[] c13304Arr2 = new C13304[((C23747) super.getType()).f76957.size()];
        C13304[] c13304Arr3 = this.f64315;
        System.arraycopy(c13304Arr3, 0, c13304Arr2, 0, c13304Arr3.length);
        this.f64315 = c13304Arr2;
        C13304 c13306 = new C13304(this, i);
        c13304Arr2[i] = c13306;
        return c13306;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m46056(int i) {
        this.f64315[i] = null;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m46054() {
        int i = 0;
        for (C13304 c13304 : this.f64315) {
            if (c13304 != null) {
                i++;
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46052(InterfaceC23332 interfaceC23332, C6593 c6593, C3374 c3374) throws IOException {
        C20500 c20500Mo9073 = mo9073();
        short sM47024 = (short) (c20500Mo9073.m47024() + 24);
        interfaceC23332.mo17788(ColorResourcesTableCreator.HEADER_TYPE_TYPE);
        interfaceC23332.mo17788(sM47024);
        long position = interfaceC23332.getPosition();
        interfaceC23332.mo17795();
        interfaceC23332.writeByte(((C23747) super.getType()).mo35833());
        boolean z = this.f64314;
        int i = z;
        if (this.f64313) {
            i = (z ? 1 : 0) | 2;
        }
        interfaceC23332.writeByte(i);
        int i2 = 0;
        interfaceC23332.writeByte(0);
        interfaceC23332.writeByte(0);
        int i3 = 1;
        if (this.f64314) {
            List list = (List) C13847.stream(this.f64315).filter(new C15025(1)).collect(C2025.toList());
            int size = list.size();
            interfaceC23332.writeInt(size);
            int i4 = size * 4;
            interfaceC23332.writeInt(sM47024 + i4);
            c20500Mo9073.m47022(interfaceC23332);
            long position2 = interfaceC23332.getPosition();
            interfaceC23332.skipBytes(i4);
            int[] iArr = new int[size];
            long position3 = interfaceC23332.getPosition();
            while (i2 < size) {
                if (c3374 != null) {
                    c3374.m11079(i3);
                }
                C13304 c13304 = (C13304) list.get(i2);
                int iMo23383 = c13304.mo23383();
                long position4 = interfaceC23332.getPosition() - position3;
                if (position4 % 4 != 0) {
                    throw new RuntimeException();
                }
                long j = position3;
                long j2 = position4 / 4;
                if (j2 < 0 || j2 > 65535) {
                    throw new IOException("Sparse offset out of range");
                }
                iArr[i2] = iMo23383 | (((int) j2) << 16);
                c13304.m32854(interfaceC23332, c6593);
                i2++;
                i3 = 1;
                position3 = j;
            }
            long position5 = interfaceC23332.getPosition();
            interfaceC23332.seek(position);
            interfaceC23332.writeInt((int) ((position5 - position) + 4));
            interfaceC23332.seek(position2);
            interfaceC23332.mo17790(iArr);
            interfaceC23332.seek(position5);
            return;
        }
        if (this.f64313) {
            int size2 = ((C23747) super.getType()).f76957.size();
            interfaceC23332.writeInt(size2);
            int i5 = size2 * 2;
            if (i5 % 4 != 0) {
                i5 += 2;
            }
            interfaceC23332.writeInt(sM47024 + i5);
            c20500Mo9073.m47022(interfaceC23332);
            long position6 = interfaceC23332.getPosition();
            interfaceC23332.skipBytes(i5);
            int[] iArr2 = new int[size2];
            Arrays.fill(iArr2, -1);
            long position7 = interfaceC23332.getPosition();
            for (C13304 c13305 : m50412()) {
                if (c3374 != null) {
                    c3374.m11079(1);
                }
                int position8 = (int) (interfaceC23332.getPosition() - position7);
                if (position8 % 4 != 0) {
                    throw new RuntimeException();
                }
                int i6 = position8 / 4;
                if (i6 == 65535) {
                    throw new IOException("Offset 16 out of range");
                }
                iArr2[c13305.mo23383()] = i6;
                c13305.m32854(interfaceC23332, c6593);
            }
            long position9 = interfaceC23332.getPosition();
            interfaceC23332.seek(position);
            interfaceC23332.writeInt((int) ((position9 - position) + 4));
            interfaceC23332.seek(position6);
            for (int i7 = 0; i7 < size2; i7++) {
                int i8 = iArr2[i7];
                if (i8 == -1) {
                    i8 = 65535;
                }
                interfaceC23332.mo17812(i8);
            }
            interfaceC23332.seek(position9);
            return;
        }
        int size3 = ((C23747) super.getType()).f76957.size();
        interfaceC23332.writeInt(size3);
        int i9 = size3 * 4;
        interfaceC23332.writeInt(sM47024 + i9);
        c20500Mo9073.m47022(interfaceC23332);
        long position10 = interfaceC23332.getPosition();
        interfaceC23332.skipBytes(i9);
        int[] iArr3 = new int[size3];
        Arrays.fill(iArr3, -1);
        long position11 = interfaceC23332.getPosition();
        for (C13304 c13306 : m50412()) {
            if (c3374 != null) {
                c3374.m11079(1);
            }
            iArr3[c13306.mo23383()] = (int) (interfaceC23332.getPosition() - position11);
            c13306.m32854(interfaceC23332, c6593);
        }
        long position12 = interfaceC23332.getPosition();
        interfaceC23332.seek(position);
        interfaceC23332.writeInt((int) ((position12 - position) + 4));
        interfaceC23332.seek(position10);
        interfaceC23332.mo17790(iArr3);
        interfaceC23332.seek(position12);
    }

    @Override // l.InterfaceC2731
    /* JADX INFO: renamed from: ۛ */
    public final int mo9069() {
        return this.f64315.length - 1;
    }

    @Override // l.InterfaceC2731
    /* JADX INFO: renamed from: ܺ */
    public final boolean mo9075(int i) {
        C13304[] c13304Arr = this.f64315;
        return i < c13304Arr.length && c13304Arr[i] != null;
    }

    @Override // l.InterfaceC2731
    /* JADX INFO: renamed from: ۨۙ */
    public final boolean mo9072() {
        return this.f64314;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m46055(boolean z) {
        this.f64314 = z;
    }

    @Override // l.InterfaceC2731
    /* JADX INFO: renamed from: ֫᩷ */
    public final boolean mo9067() {
        return this.f64313;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46053(boolean z) {
        this.f64313 = z;
    }

    @Override // l.InterfaceC2731
    /* JADX INFO: renamed from: ۤ */
    public final String mo9070(int i) {
        return this.f64315[i].mo18156();
    }

    @Override // l.InterfaceC2731
    /* JADX INFO: renamed from: ᩷ */
    public final C13304 mo9076(int i) {
        if (i < 0) {
            return null;
        }
        C13304[] c13304Arr = this.f64315;
        if (i >= c13304Arr.length) {
            return null;
        }
        return c13304Arr[i];
    }

    @Override // l.AbstractC22343, l.InterfaceC2731
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC7206 mo9068() {
        return (C23001) super.mo9068();
    }

    @Override // l.AbstractC22343, l.InterfaceC2731
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC10869 mo9071() {
        return (C25239) super.mo9071();
    }

    @Override // l.AbstractC22343, l.InterfaceC2731
    public final InterfaceC15344 getType() {
        return (C23747) super.getType();
    }

    @Override // l.AbstractC22343, l.InterfaceC2731
    public final C23747 getType() {
        return (C23747) super.getType();
    }
}
