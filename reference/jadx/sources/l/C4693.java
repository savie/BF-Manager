package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۙܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 04FP */
/* JADX INFO: loaded from: classes2.dex */
public final class C4693 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC23683 f16583;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f16579 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C3013[] f16580 = new C3013[8];

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f16578 = 7;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f16582 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f16584 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f16581 = 4096;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f16585 = 4096;

    public C4693(InterfaceC10008 interfaceC10008) {
        this.f16583 = C0834.m3437(interfaceC10008);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m13001(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.f16580.length;
            while (true) {
                length--;
                i2 = this.f16578;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.f16580[length].f11267;
                i -= i4;
                this.f16584 -= i4;
                this.f16582--;
                i3++;
            }
            C3013[] c3013Arr = this.f16580;
            System.arraycopy(c3013Arr, i2 + 1, c3013Arr, i2 + 1 + i3, this.f16582);
            this.f16578 += i3;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m13006() {
        while (true) {
            InterfaceC23683 interfaceC23683 = this.f16583;
            if (interfaceC23683.mo16415()) {
                return;
            }
            byte b = interfaceC23683.readByte();
            int i = b & 255;
            if (i == 128) {
                throw new IOException("index == 0");
            }
            int i2 = b & GCMSIVBlockCipher.MASK;
            ArrayList arrayList = this.f16579;
            if (i2 == 128) {
                int iM13004 = m13004(i, 127);
                int i3 = iM13004 - 1;
                if (i3 >= 0) {
                    C3013[] c3013Arr = C11750.f39478;
                    if (i3 <= c3013Arr.length - 1) {
                        arrayList.add(c3013Arr[i3]);
                    }
                }
                int length = this.f16578 + 1 + (i3 - C11750.f39478.length);
                if (length >= 0) {
                    C3013[] c3013Arr2 = this.f16580;
                    if (length < c3013Arr2.length) {
                        arrayList.add(c3013Arr2[length]);
                    }
                }
                throw new IOException(C8479.m22141(iM13004, "Header index too large "));
            }
            if (i == 64) {
                C14511 c14511M13007 = m13007();
                C11750.m29360(c14511M13007);
                m13002(new C3013(c14511M13007, m13007()));
            } else if ((b & 64) == 64) {
                m13002(new C3013(m13003(m13004(i, 63) - 1), m13007()));
            } else if ((b & UTF8.S_CS3) == 32) {
                int iM13005 = m13004(i, 31);
                this.f16585 = iM13005;
                if (iM13005 < 0 || iM13005 > this.f16581) {
                    throw new IOException("Invalid dynamic table size update " + this.f16585);
                }
                int i4 = this.f16584;
                if (iM13005 < i4) {
                    if (iM13005 == 0) {
                        Arrays.fill(this.f16580, (Object) null);
                        this.f16578 = this.f16580.length - 1;
                        this.f16582 = 0;
                        this.f16584 = 0;
                    } else {
                        m13001(i4 - iM13005);
                    }
                }
            } else if (i == 16 || i == 0) {
                C14511 c14511M13008 = m13007();
                C11750.m29360(c14511M13008);
                arrayList.add(new C3013(c14511M13008, m13007()));
            } else {
                arrayList.add(new C3013(m13003(m13004(i, 15) - 1), m13007()));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m13005() {
        ArrayList arrayList = this.f16579;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        return arrayList2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C14511 m13003(int i) throws IOException {
        if (i >= 0) {
            C3013[] c3013Arr = C11750.f39478;
            if (i <= c3013Arr.length - 1) {
                return c3013Arr[i].f11269;
            }
        }
        int length = this.f16578 + 1 + (i - C11750.f39478.length);
        if (length >= 0) {
            C3013[] c3013Arr2 = this.f16580;
            if (length < c3013Arr2.length) {
                return c3013Arr2[length].f11269;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m13002(C3013 c3013) {
        this.f16579.add(c3013);
        int i = c3013.f11267;
        int i2 = this.f16585;
        if (i > i2) {
            Arrays.fill(this.f16580, (Object) null);
            this.f16578 = this.f16580.length - 1;
            this.f16582 = 0;
            this.f16584 = 0;
            return;
        }
        m13001((this.f16584 + i) - i2);
        int i3 = this.f16582 + 1;
        C3013[] c3013Arr = this.f16580;
        if (i3 > c3013Arr.length) {
            C3013[] c3013Arr2 = new C3013[c3013Arr.length * 2];
            System.arraycopy(c3013Arr, 0, c3013Arr2, c3013Arr.length, c3013Arr.length);
            this.f16578 = this.f16580.length - 1;
            this.f16580 = c3013Arr2;
        }
        int i4 = this.f16578;
        this.f16578 = i4 - 1;
        this.f16580[i4] = c3013;
        this.f16582++;
        this.f16584 += i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m13004(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte b = this.f16583.readByte();
            int i5 = b & 255;
            if ((b & GCMSIVBlockCipher.MASK) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << i4;
            i4 += 7;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14511 m13007() {
        InterfaceC23683 interfaceC23683 = this.f16583;
        byte b = interfaceC23683.readByte();
        int i = b & 255;
        boolean z = (b & GCMSIVBlockCipher.MASK) == 128;
        int iM13004 = m13004(i, 127);
        if (z) {
            return C14511.m34933(C1871.m6066().m6068(interfaceC23683.mo16420(iM13004)));
        }
        return interfaceC23683.mo16421(iM13004);
    }
}
