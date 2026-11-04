package l;

import java.io.IOException;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۨ۠ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4EY */
/* JADX INFO: loaded from: classes4.dex */
public class C12234 extends AbstractC8909 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Set f39375;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public EnumC4031 f39376;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f39377;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public byte[] f39378;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte f39379;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public byte f39380;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public short f39381;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public short f39382;

    public C12234() {
        super(4);
        this.f39380 = (byte) 5;
        this.f39379 = (byte) 0;
        this.f39378 = new byte[]{16, 0, 0, 0};
        this.f39382 = (short) 16;
        this.f39381 = (short) 0;
        this.f39377 = 0;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo3948(C7760 c7760) throws IOException {
        if (this.f39376 != null) {
            if (this.f39375 == null) {
                throw new IllegalStateException("Invalid PFC flag(s): " + this.f39375);
            }
            c7760.m21131(this.f39380);
            c7760.m21131(this.f39379);
            c7760.m21131((byte) this.f39376.getValue());
            c7760.m21131((byte) C10961.m27791(this.f39375));
            c7760.m21134(this.f39378);
            c7760.m21135(this.f39382);
            c7760.m21135(0);
            c7760.m21136(this.f39377);
            return;
        }
        throw new IllegalStateException("Invalid PDU type: " + this.f39376);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final EnumC4031 m30524() {
        return this.f39376;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Set m30520() {
        return this.f39375;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m30525() {
        return this.f39382;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m30526() {
        return this.f39381;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30522(EnumC4031 enumC4031) {
        this.f39376 = enumC4031;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30521(EnumSet enumSet) {
        this.f39375 = enumSet;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30523(short s) {
        this.f39382 = s;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m30527(int i) {
        this.f39377 = i;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo8464(C0302 c0302) throws IOException {
        this.f39380 = c0302.m1879();
        byte bM1879 = c0302.m1879();
        this.f39379 = bM1879;
        if (5 != this.f39380 || bM1879 != 0) {
            throw new IOException(String.format("Version mismatch: %d.%d != 5.0", Byte.valueOf(this.f39380), Byte.valueOf(this.f39379)));
        }
        EnumC4031 enumC4031 = (EnumC4031) C10961.m27793(c0302.m1879(), EnumC4031.class, null);
        if (enumC4031 != null) {
            this.f39376 = enumC4031;
            this.f39375 = C10961.m27792(c0302.m1879(), EnumC14471.class);
            byte[] bArr = new byte[4];
            c0302.m1883(bArr);
            if (bArr[0] != 16) {
                throw new IOException(String.format("Integer and Character representation mismatch: %d", Byte.valueOf(bArr[0])));
            }
            if (bArr[1] == 0) {
                this.f39378 = bArr;
                this.f39382 = c0302.m1887();
                this.f39381 = c0302.m1887();
                this.f39377 = c0302.m1884();
                return;
            }
            throw new IOException(String.format("Floating-Point representation mismatch: %d", Byte.valueOf(bArr[1])));
        }
        throw new IOException(String.format("PDU type invalid: %d", enumC4031));
    }
}
