package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.lang.ref.SoftReference;

/* JADX INFO: renamed from: l.֡ۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 143Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C0337 extends AbstractC22712 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C14769 f1824 = C14769.m35543();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f1825;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f1826;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f1827;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C18236[] f1828;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized C0337 m2067(C15252 c15252) {
        while (f1824.m35550()) {
            C0337 c0337 = (C0337) ((SoftReference) f1824.f48335).get();
            f1824 = f1824.f48336;
            if (c0337 != null) {
                return c0337;
            }
        }
        C0337 c0338 = new C0337(c15252);
        c0338.f1826 = 0;
        c0338.f1825 = EnumC6121.f20881;
        c0338.f1828 = new C18236[32768];
        c0338.f1827 = new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT];
        return c0338;
    }

    @Override // l.AbstractC22712
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2070() {
        synchronized (C0337.class) {
            C14769 c14769 = f1824;
            SoftReference softReference = new SoftReference(this);
            c14769.getClass();
            f1824 = new C14769(softReference, c14769);
        }
    }

    @Override // l.AbstractC22712
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC19728 mo2069(char[] cArr, int i) {
        int i2 = this.f1826;
        byte[] bArrM42988 = C18450.m42988((i * 3) + i2, this.f1827);
        this.f1827 = bArrM42988;
        int iM49589 = C21901.m49589(bArrM42988, i2, i, cArr) - i2;
        int iM51193 = AbstractC22712.m51193(i2, iM49589, bArrM42988) & this.f1825;
        C18236[] c18236Arr = this.f1828;
        C18236 c18236 = c18236Arr[iM51193];
        while (c18236 != null && (c18236.f59532 != iM49589 || !AbstractC22712.m51192(c18236.f59533, bArrM42988, i2, bArrM42988, iM49589))) {
            c18236 = c18236.f59531;
        }
        if (c18236 != null) {
            return c18236;
        }
        C18236 c18237 = new C18236(this);
        c18237.f59533 = i2;
        c18237.f59532 = iM49589;
        c18237.f59531 = c18236Arr[iM51193];
        c18236Arr[iM51193] = c18237;
        int i3 = i2 + iM49589;
        this.f1826 = i3;
        if (iM49589 == 0) {
            this.f1826 = i3 + 1;
        }
        return c18237;
    }

    @Override // l.AbstractC22712
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC19728 mo2068(int i, int i2, byte[] bArr) {
        int iM51193 = AbstractC22712.m51193(i, i2, bArr) & this.f1825;
        C18236[] c18236Arr = this.f1828;
        C18236 c18236 = c18236Arr[iM51193];
        byte[] bArr2 = this.f1827;
        while (c18236 != null && (c18236.f59532 != i2 || !AbstractC22712.m51192(c18236.f59533, bArr2, i, bArr, i2))) {
            c18236 = c18236.f59531;
        }
        if (c18236 != null) {
            return c18236;
        }
        int i3 = this.f1826;
        int i4 = i3 + i2;
        byte[] bArrM42988 = C18450.m42988(i4, bArr2);
        this.f1827 = bArrM42988;
        System.arraycopy(bArr, i, bArrM42988, i3, i2);
        C18236 c18237 = new C18236(this);
        c18237.f59533 = i3;
        c18237.f59532 = i2;
        c18237.f59531 = c18236Arr[iM51193];
        c18236Arr[iM51193] = c18237;
        this.f1826 = i4;
        if (i2 == 0) {
            this.f1826 = i4 + 1;
        }
        return c18237;
    }
}
