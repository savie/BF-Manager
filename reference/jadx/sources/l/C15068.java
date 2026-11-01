package l;

/* JADX INFO: renamed from: l.ܶۜܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBIK */
/* JADX INFO: loaded from: classes4.dex */
public final enum C15068 extends EnumC7306 {
    public /* synthetic */ C15068() {
        this("FORMAT_FILL_ARRAY_DATA_PAYLOAD", 35);
    }

    public C15068(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC7306
    /* JADX INFO: renamed from: ۙ */
    public AbstractC17806 mo1324(int i, InterfaceC14985 interfaceC14985) {
        int i2 = interfaceC14985.read();
        int i3 = interfaceC14985.readInt();
        int i4 = 0;
        if (i2 == 1) {
            byte[] bArr = new byte[i3];
            int i5 = 0;
            boolean z = true;
            while (i4 < i3) {
                if (z) {
                    i5 = interfaceC14985.read();
                }
                bArr[i4] = (byte) (i5 & 255);
                i5 >>= 8;
                i4++;
                z = !z;
            }
            return new C18512((EnumC7306) this, i, bArr);
        }
        if (i2 == 2) {
            short[] sArr = new short[i3];
            while (i4 < i3) {
                sArr[i4] = (short) interfaceC14985.read();
                i4++;
            }
            return new C18512((EnumC7306) this, i, sArr);
        }
        if (i2 == 4) {
            int[] iArr = new int[i3];
            while (i4 < i3) {
                iArr[i4] = interfaceC14985.readInt();
                i4++;
            }
            return new C18512((EnumC7306) this, i, iArr);
        }
        if (i2 == 8) {
            long[] jArr = new long[i3];
            while (i4 < i3) {
                jArr[i4] = interfaceC14985.readLong();
                i4++;
            }
            return new C18512(this, i, jArr);
        }
        throw new C19508("bogus element_width: ".concat(C22475.m49982(i2)), null);
    }

    @Override // l.EnumC7306
    /* JADX INFO: renamed from: ۙ */
    public void mo1325(AbstractC17806 abstractC17806, InterfaceC21334 interfaceC21334) {
        C18512 c18512 = (C18512) abstractC17806;
        short sM42904 = c18512.m42904();
        Object objM42903 = c18512.m42903();
        interfaceC21334.m47859();
        interfaceC21334.m47859();
        interfaceC21334.m47866();
        if (sM42904 == 1) {
            interfaceC21334.m47860();
            return;
        }
        if (sM42904 == 2) {
            interfaceC21334.m47865();
        } else if (sM42904 == 4) {
            interfaceC21334.m47857();
        } else {
            if (sM42904 == 8) {
                interfaceC21334.m47862();
                return;
            }
            throw new C19508("bogus element_width: ".concat(C22475.m49982(sM42904)), null);
        }
    }
}
