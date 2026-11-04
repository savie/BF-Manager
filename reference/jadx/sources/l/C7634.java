package l;

import java.util.LinkedList;

/* JADX INFO: renamed from: l.۟ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: P9V5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7634 extends AbstractC12108 implements InterfaceC1162 {

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f25184 = C16980.m40037(C7634.class);

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public long f25185;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final String f25186;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public byte[] f25187;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f25188;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC14345[] f25189;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public long f25190;

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩸ */
    public final int mo1472(int i, byte[] bArr) {
        return 0;
    }

    public C7634(String str, InterfaceC5878 interfaceC5878) {
        super(interfaceC5878);
        this.f25187 = new byte[16];
        this.f25186 = str;
    }

    @Override // l.AbstractC12108, l.InterfaceC18315
    /* JADX INFO: renamed from: ۙ */
    public final void mo12767(InterfaceC21299 interfaceC21299) {
        if (mo12784() && (interfaceC21299 instanceof InterfaceC23297)) {
            ((InterfaceC23297) interfaceC21299).mo3727(this.f25187);
        }
        super.mo12767(interfaceC21299);
    }

    @Override // l.InterfaceC1162
    /* JADX INFO: renamed from: ۡ */
    public final long mo4305() {
        return this.f25190;
    }

    @Override // l.InterfaceC1162
    public final long getSize() {
        return this.f25185;
    }

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final long m20850() {
        return this.f25185;
    }

    @Override // l.InterfaceC1162
    public final int getAttributes() {
        return this.f25188;
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m20851() {
        return this.f25187;
    }

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1470(int i, byte[] bArr) throws C19061 {
        int iM2322;
        if (C0481.m2318(i, bArr) != 89) {
            throw new C19061("Structure size is not 89");
        }
        byte b = bArr[i + 2];
        byte b2 = bArr[i + 3];
        C0481.m2322(i + 4, bArr);
        C0481.m2324(i + 8, bArr);
        C0481.m2324(i + 16, bArr);
        this.f25190 = C0481.m2324(i + 24, bArr);
        C0481.m2324(i + 32, bArr);
        C0481.m2320(i + 40, bArr);
        this.f25185 = C0481.m2320(i + 48, bArr);
        this.f25188 = C0481.m2322(i + 56, bArr);
        byte[] bArr2 = this.f25187;
        System.arraycopy(bArr, i + 64, bArr2, 0, 16);
        int iM2323 = C0481.m2322(i + 80, bArr);
        int iM2324 = C0481.m2322(i + 84, bArr);
        int iMax = i + 88;
        if (iM2323 > 0 && iM2324 > 0) {
            LinkedList linkedList = new LinkedList();
            int iM10327 = m10327() + iM2323;
            do {
                iM2322 = C0481.m2322(iM10327, bArr);
                int iM2318 = C0481.m2318(iM10327 + 4, bArr);
                int iM2319 = C0481.m2318(iM10327 + 6, bArr);
                int iM23110 = C0481.m2318(iM10327 + 10, bArr);
                int iM2325 = C0481.m2322(iM10327 + 12, bArr);
                int i2 = iM2318 + iM10327;
                System.arraycopy(bArr, i2, new byte[iM2319], 0, iM2319);
                int iMax2 = Math.max(Math.max(iM10327 + 16, i2 + iM2319), iM23110 + iM10327 + iM2325);
                if (iM2322 > 0) {
                    iM10327 += iM2322;
                }
                iMax = Math.max(iMax, iMax2);
            } while (iM2322 > 0);
            this.f25189 = (InterfaceC14345[]) linkedList.toArray(new InterfaceC14345[0]);
        }
        InterfaceC25186 interfaceC25186 = f25184;
        if (interfaceC25186.mo13707()) {
            interfaceC25186.mo13721("Opened " + this.f25186 + ": " + C6033.m17504(bArr2, 0, bArr2.length));
        }
        return iMax - i;
    }
}
