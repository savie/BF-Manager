package l;

/* JADX INFO: renamed from: l.ܶܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBIK */
/* JADX INFO: loaded from: classes5.dex */
public final enum C16249 extends EnumC14757 {
    public /* synthetic */ C16249() {
        this("FORMAT_FILL_ARRAY_DATA_PAYLOAD", 35);
    }

    public C16249(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC14757
    /* JADX INFO: renamed from: ۙ */
    public AbstractC3659 mo2922(int i, InterfaceC16337 interfaceC16337) {
        int i2 = interfaceC16337.read();
        int i3 = interfaceC16337.readInt();
        int i4 = 0;
        if (i2 == 1) {
            byte[] bArr = new byte[i3];
            int i5 = 0;
            boolean z = true;
            while (i4 < i3) {
                if (z) {
                    i5 = interfaceC16337.read();
                }
                bArr[i4] = (byte) (i5 & 255);
                i5 >>= 8;
                i4++;
                z = !z;
            }
            return new C20813((EnumC14757) this, i, bArr);
        }
        if (i2 == 2) {
            short[] sArr = new short[i3];
            while (i4 < i3) {
                sArr[i4] = (short) interfaceC16337.read();
                i4++;
            }
            return new C20813((EnumC14757) this, i, sArr);
        }
        if (i2 == 4) {
            int[] iArr = new int[i3];
            while (i4 < i3) {
                iArr[i4] = interfaceC16337.readInt();
                i4++;
            }
            return new C20813((EnumC14757) this, i, iArr);
        }
        if (i2 == 8) {
            long[] jArr = new long[i3];
            while (i4 < i3) {
                jArr[i4] = interfaceC16337.readLong();
                i4++;
            }
            return new C20813(this, i, jArr);
        }
        throw new C20288("bogus element_width: ".concat(C5306.m15934(i2)), null);
    }

    @Override // l.EnumC14757
    /* JADX INFO: renamed from: ۙ */
    public void mo2923(AbstractC3659 abstractC3659, InterfaceC23797 interfaceC23797) {
        C20813 c20813 = (C20813) abstractC3659;
        short sM47606 = c20813.m47606();
        Object objM47605 = c20813.m47605();
        interfaceC23797.m53077();
        interfaceC23797.m53077();
        interfaceC23797.m53086();
        if (sM47606 == 1) {
            interfaceC23797.m53083();
            return;
        }
        if (sM47606 == 2) {
            interfaceC23797.m53081();
        } else if (sM47606 == 4) {
            interfaceC23797.m53080();
        } else {
            if (sM47606 == 8) {
                interfaceC23797.m53078();
                return;
            }
            throw new C20288("bogus element_width: ".concat(C5306.m15934(sM47606)), null);
        }
    }
}
