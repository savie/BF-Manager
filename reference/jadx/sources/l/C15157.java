package l;

/* JADX INFO: renamed from: l.ܳۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: O9YQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C15157 implements InterfaceC2149 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C19633[] f49449;

    @Override // l.InterfaceC2149
    /* JADX INFO: renamed from: ۙ */
    public final int mo6138(int i, int i2, byte[] bArr) throws C19061 {
        C0481.m2318(i + 2, bArr);
        int iM2322 = C0481.m2322(i + 4, bArr);
        int iM2323 = C0481.m2322(i + 8, bArr);
        C0481.m2322(i + 12, bArr);
        int iM2324 = C0481.m2322(i + 16, bArr);
        if (iM2322 > 0) {
            new C5812(bArr, iM2322 + i);
        }
        if (iM2323 > 0) {
            new C5812(bArr, iM2323 + i);
        }
        int iMo6138 = i + iM2324;
        if (iM2324 > 0) {
            C0481.m2318(iMo6138 + 2, bArr);
            int iM2325 = C0481.m2322(iMo6138 + 4, bArr);
            iMo6138 += 8;
            if (iM2325 > 4096) {
                throw new C19061("Invalid SecurityDescriptor");
            }
            this.f49449 = new C19633[iM2325];
            for (int i3 = 0; i3 < iM2325; i3++) {
                C19633[] c19633Arr = this.f49449;
                C19633 c19633 = new C19633();
                c19633Arr[i3] = c19633;
                iMo6138 += c19633.mo6138(iMo6138, i2 - iMo6138, bArr);
            }
        } else {
            this.f49449 = null;
        }
        return iMo6138 - i;
    }

    public final String toString() {
        if (this.f49449 == null) {
            return "SecurityDescriptor:\nNULL";
        }
        String string = "SecurityDescriptor:\n";
        for (int i = 0; i < this.f49449.length; i++) {
            StringBuilder sbM27333 = C10732.m27333(string);
            sbM27333.append(this.f49449[i].toString());
            sbM27333.append("\n");
            string = sbM27333.toString();
        }
        return string;
    }
}
