package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.lang.ref.SoftReference;

/* JADX INFO: renamed from: l.ᩴܺ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 143Z */
/* JADX INFO: loaded from: classes5.dex */
public final class C18857 extends AbstractC6302 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static C21825 f61074 = C21825.m48588();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C18151[] f61075;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f61076;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f61077;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f61078;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized C18857 m43492(C23942 c23942) {
        while (f61074.m48595()) {
            C18857 c18857 = (C18857) ((SoftReference) f61074.f70876).get();
            f61074 = f61074.f70877;
            if (c18857 != null) {
                return c18857;
            }
        }
        C18857 c18858 = new C18857(c23942);
        c18858.f61076 = 0;
        c18858.f61077 = EnumC23529.f76192;
        c18858.f61075 = new C18151[32768];
        c18858.f61078 = new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT];
        return c18858;
    }

    @Override // l.AbstractC6302
    /* JADX INFO: renamed from: ۙ */
    public final void mo17391() {
        synchronized (C18857.class) {
            C21825 c21825 = f61074;
            SoftReference softReference = new SoftReference(this);
            c21825.getClass();
            f61074 = new C21825(softReference, c21825);
        }
    }

    @Override // l.AbstractC6302
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11242 mo17390(char[] cArr, int i) {
        int i2 = this.f61076;
        byte[] bArrM52455 = C23805.m52455((i * 3) + i2, this.f61078);
        this.f61078 = bArrM52455;
        int iM40238 = C17281.m40238(bArrM52455, i2, i, cArr) - i2;
        int iM17387 = AbstractC6302.m17387(i2, iM40238, bArrM52455) & this.f61077;
        C18151[] c18151Arr = this.f61075;
        C18151 c18151 = c18151Arr[iM17387];
        while (c18151 != null && (c18151.f58041 != iM40238 || !AbstractC6302.m17386(c18151.f58043, bArrM52455, i2, bArrM52455, iM40238))) {
            c18151 = c18151.f58042;
        }
        if (c18151 != null) {
            return c18151;
        }
        C18151 c18152 = new C18151(this);
        c18152.f58043 = i2;
        c18152.f58041 = iM40238;
        c18152.f58042 = c18151Arr[iM17387];
        c18151Arr[iM17387] = c18152;
        int i3 = i2 + iM40238;
        this.f61076 = i3;
        if (iM40238 == 0) {
            this.f61076 = i3 + 1;
        }
        return c18152;
    }

    @Override // l.AbstractC6302
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11242 mo17388(int i, int i2, byte[] bArr) {
        int iM17387 = AbstractC6302.m17387(i, i2, bArr) & this.f61077;
        C18151[] c18151Arr = this.f61075;
        C18151 c18151 = c18151Arr[iM17387];
        byte[] bArr2 = this.f61078;
        while (c18151 != null && (c18151.f58041 != i2 || !AbstractC6302.m17386(c18151.f58043, bArr2, i, bArr, i2))) {
            c18151 = c18151.f58042;
        }
        if (c18151 != null) {
            return c18151;
        }
        int i3 = this.f61076;
        int i4 = i3 + i2;
        byte[] bArrM52455 = C23805.m52455(i4, bArr2);
        this.f61078 = bArrM52455;
        System.arraycopy(bArr, i, bArrM52455, i3, i2);
        C18151 c18152 = new C18151(this);
        c18152.f58043 = i3;
        c18152.f58041 = i2;
        c18152.f58042 = c18151Arr[iM17387];
        c18151Arr[iM17387] = c18152;
        this.f61076 = i4;
        if (i2 == 0) {
            this.f61076 = i4 + 1;
        }
        return c18152;
    }
}
