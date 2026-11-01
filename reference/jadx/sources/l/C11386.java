package l;

import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۨ֫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07NF */
/* JADX INFO: loaded from: classes4.dex */
public final class C11386 implements InterfaceC8011 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C7648 f38380;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C7648 f38381;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C7648 f38382;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f38383;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C7648 f38384;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8011 f38385;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f38386;

    @Override // l.InterfaceC8011
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo8113(long j) {
    }

    @Override // l.InterfaceC8011
    /* JADX INFO: renamed from: ۙ */
    public final int mo8111(InterfaceC6942 interfaceC6942, int i, boolean z) {
        return mo8117(interfaceC6942, i, z);
    }

    @Override // l.InterfaceC8011
    /* JADX INFO: renamed from: ۙ */
    public final void mo8112(int i, C2460 c2460) {
        mo8115(c2460, i, 0);
    }

    static {
        C10471 c10471 = new C10471();
        c10471.m26533("application/id3");
        f38380 = c10471.m26497();
        C10471 c10472 = new C10471();
        c10472.m26533("application/x-emsg");
        f38381 = c10472.m26497();
    }

    public C11386(InterfaceC8011 interfaceC8011, int i) {
        this.f38385 = interfaceC8011;
        if (i == 1) {
            this.f38382 = f38380;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(C8479.m22141(i, "Unknown metadataType: "));
            }
            this.f38382 = f38381;
        }
        this.f38383 = new byte[0];
        this.f38386 = 0;
    }

    @Override // l.InterfaceC8011
    /* JADX INFO: renamed from: ۙ */
    public final void mo8116(C7648 c7648) {
        this.f38384 = c7648;
        this.f38385.mo8116(this.f38382);
    }

    @Override // l.InterfaceC8011
    /* JADX INFO: renamed from: ܰ */
    public final int mo8117(InterfaceC6942 interfaceC6942, int i, boolean z) throws EOFException {
        int i2 = this.f38386 + i;
        byte[] bArr = this.f38383;
        if (bArr.length < i2) {
            this.f38383 = Arrays.copyOf(bArr, (i2 / 2) + i2);
        }
        int i3 = interfaceC6942.read(this.f38383, this.f38386, i);
        if (i3 != -1) {
            this.f38386 += i3;
            return i3;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // l.InterfaceC8011
    /* JADX INFO: renamed from: ۙ */
    public final void mo8115(C2460 c2460, int i, int i2) {
        int i3 = this.f38386 + i;
        byte[] bArr = this.f38383;
        if (bArr.length < i3) {
            this.f38383 = Arrays.copyOf(bArr, (i3 / 2) + i3);
        }
        c2460.m7507(this.f38386, i, this.f38383);
        this.f38386 += i;
    }

    @Override // l.InterfaceC8011
    /* JADX INFO: renamed from: ۙ */
    public final void mo8114(long j, int i, int i2, int i3, C18594 c18594) {
        this.f38384.getClass();
        int i4 = this.f38386 - i3;
        C2460 c2460 = new C2460(Arrays.copyOfRange(this.f38383, i4 - i2, i4));
        byte[] bArr = this.f38383;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.f38386 = i3;
        String str = this.f38384.f25265;
        C7648 c7648 = this.f38382;
        String str2 = c7648.f25265;
        String str3 = c7648.f25265;
        if (!C13638.equals(str, str2)) {
            if ("application/x-emsg".equals(this.f38384.f25265)) {
                C0726 c0726M39738 = C16955.m39738(c2460);
                C7648 c7648Mo3145 = c0726M39738.mo3145();
                if (c7648Mo3145 == null || !C13638.equals(str3, c7648Mo3145.f25265)) {
                    C0303.m1848("Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + c0726M39738.mo3145());
                    return;
                }
                byte[] bArrMo3147 = c0726M39738.mo3147();
                bArrMo3147.getClass();
                c2460 = new C2460(bArrMo3147);
            } else {
                C0303.m1848("Ignoring sample for unsupported format: " + this.f38384.f25265);
                return;
            }
        }
        int iM7503 = c2460.m7503();
        InterfaceC8011 interfaceC8011 = this.f38385;
        interfaceC8011.mo8112(iM7503, c2460);
        interfaceC8011.mo8114(j, i, iM7503, 0, c18594);
    }
}
