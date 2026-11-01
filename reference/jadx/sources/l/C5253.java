package l;

import java.io.IOException;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۚۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4EY */
/* JADX INFO: loaded from: classes3.dex */
public class C5253 extends AbstractC10872 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public EnumC13015 f18217;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Set f18222;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public byte f18218 = 5;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte f18220 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f18224 = {16, 0, 0, 0};

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public short f18221 = 16;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public short f18219 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f18223 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo14522(C21481 c21481) throws IOException {
        if (this.f18217 != null) {
            if (this.f18222 == null) {
                throw new IllegalStateException("Invalid PFC flag(s): " + this.f18222);
            }
            c21481.m48094(this.f18218);
            c21481.m48094(this.f18220);
            c21481.m48094((byte) this.f18217.getValue());
            c21481.m48094((byte) C20799.m46781(this.f18222));
            c21481.m48097(this.f18224);
            c21481.m48098(this.f18221);
            c21481.m48098(0);
            c21481.m48099(this.f18223);
            return;
        }
        throw new IllegalStateException("Invalid PDU type: " + this.f18217);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC13015 m14524() {
        return this.f18217;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Set m14517() {
        return this.f18222;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m14525() {
        return this.f18221;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m14518() {
        return this.f18219;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14520(EnumC13015 enumC13015) {
        this.f18217 = enumC13015;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14519(EnumSet enumSet) {
        this.f18222 = enumSet;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14523(short s) {
        this.f18221 = s;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m14526(int i) {
        this.f18223 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo14521(C15132 c15132) throws IOException {
        this.f18218 = c15132.m36282();
        byte bM36282 = c15132.m36282();
        this.f18220 = bM36282;
        if (5 != this.f18218 || bM36282 != 0) {
            throw new IOException(String.format("Version mismatch: %d.%d != 5.0", Byte.valueOf(this.f18218), Byte.valueOf(this.f18220)));
        }
        EnumC13015 enumC13015 = (EnumC13015) C20799.m46783(c15132.m36282(), EnumC13015.class, null);
        if (enumC13015 != null) {
            this.f18217 = enumC13015;
            this.f18222 = C20799.m46782(c15132.m36282(), EnumC3841.class);
            byte[] bArr = new byte[4];
            c15132.m36286(bArr);
            if (bArr[0] != 16) {
                throw new IOException(String.format("Integer and Character representation mismatch: %d", Byte.valueOf(bArr[0])));
            }
            if (bArr[1] == 0) {
                this.f18224 = bArr;
                this.f18221 = c15132.m36281();
                this.f18219 = c15132.m36281();
                this.f18223 = c15132.m36288();
                return;
            }
            throw new IOException(String.format("Floating-Point representation mismatch: %d", Byte.valueOf(bArr[1])));
        }
        throw new IOException(String.format("PDU type invalid: %d", enumC13015));
    }
}
