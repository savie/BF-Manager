package l;

import com.alipay.sdk.m.y.l;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۚܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 57DZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C5772 extends C5224 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2043 f19832;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public DataInputStream f19835;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC3425 f19834 = null;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public IOException f19833 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16857(DataInputStream dataInputStream) {
        this.f19835 = dataInputStream;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m16860() {
        try {
            return this.f19835.readUnsignedByte();
        } catch (IOException e) {
            this.f19833 = e;
            return 0;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m16858() {
        try {
            return this.f19835.readUnsignedShort();
        } catch (IOException e) {
            this.f19833 = e;
            return 0;
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m16859(EnumC24309 enumC24309) throws IOException {
        this.f19833 = null;
        this.f19834 = null;
        this.f19832.f6369.m32315("Target Type: " + enumC24309.m54353(), new Object[0]);
        m15715(enumC24309);
        IOException iOException = this.f19833;
        if (iOException != null) {
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC3425 m16856() {
        return this.f19834;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private boolean m16855() {
        return this.f19833 != null;
    }

    @Override // l.C5224
    /* JADX INFO: renamed from: ֫ */
    public final void mo15714(EnumC24309 enumC24309) {
        C2043 c2043 = this.f19832;
        c2043.f6369.m32304("Type Param Target: ", new Object[0]);
        int iM16860 = m16860();
        c2043.f6369.m32315(C14442.m34864(iM16860, "{ param_index: ", l.d), new Object[0]);
        if (m16855()) {
            return;
        }
        this.f19834 = new C23563(enumC24309, iM16860);
    }

    @Override // l.C5224
    /* JADX INFO: renamed from: ۫ */
    public final void mo15719(EnumC24309 enumC24309) {
        C2043 c2043 = this.f19832;
        c2043.f6369.m32304("SuperType Target: ", new Object[0]);
        int iM16858 = m16858();
        c2043.f6369.m32315(C14442.m34864(iM16858, "{ type_index: ", l.d), new Object[0]);
        if (m16855()) {
            return;
        }
        this.f19834 = new C25055(enumC24309, iM16858);
    }

    @Override // l.C5224
    /* JADX INFO: renamed from: ᩻ */
    public final void mo15724(EnumC24309 enumC24309) {
        C2043 c2043 = this.f19832;
        c2043.f6369.m32304("TypeParam Bound Target: ", new Object[0]);
        int iM16860 = m16860();
        if (m16855()) {
            return;
        }
        int iM16861 = m16860();
        if (m16855()) {
            return;
        }
        c2043.f6369.m32315(C0703.m3016("{ param_index: ", iM16860, " bound_index: ", l.d, iM16861), new Object[0]);
        this.f19834 = new C16103(enumC24309, iM16860, iM16861);
    }

    @Override // l.C5224
    /* JADX INFO: renamed from: ۤ */
    public final void mo15717(EnumC24309 enumC24309) {
        this.f19832.f6369.m32315("Empty Target: ", new Object[0]);
        if (m16855()) {
            return;
        }
        this.f19834 = new C15357(enumC24309);
    }

    @Override // l.C5224
    /* JADX INFO: renamed from: ᩴ */
    public final void mo15721(EnumC24309 enumC24309) {
        C2043 c2043 = this.f19832;
        c2043.f6369.m32304("MethodFormalParam Target: ", new Object[0]);
        int iM16860 = m16860();
        c2043.f6369.m32315(C14442.m34864(iM16860, "{ param_index: ", l.d), new Object[0]);
        if (m16855()) {
            return;
        }
        this.f19834 = new C13120(enumC24309, iM16860);
    }

    public C5772(C2043 c2043) {
        this.f19832 = c2043;
    }

    @Override // l.C5224
    /* JADX INFO: renamed from: ۚ */
    public final void mo15716(EnumC24309 enumC24309) {
        C2043 c2043 = this.f19832;
        c2043.f6369.m32304("Throws Target: ", new Object[0]);
        int iM16858 = m16858();
        c2043.f6369.m32315(C14442.m34864(iM16858, "{ exception_index: ", l.d), new Object[0]);
        if (m16855()) {
            return;
        }
        this.f19834 = new C16849(enumC24309, iM16858);
    }

    @Override // l.C5224
    /* JADX INFO: renamed from: ᩸ */
    public final void mo15723(EnumC24309 enumC24309) {
        C2043 c2043 = this.f19832;
        c2043.f6369.m32315("LocalVar Target: ", new Object[0]);
        int iM16858 = m16858();
        if (m16855()) {
            return;
        }
        C1934 c1934 = new C1934(enumC24309, iM16858);
        this.f19834 = c1934;
        for (int i = 0; i < iM16858; i++) {
            int iM16859 = m16858();
            if (m16855()) {
                return;
            }
            int iM168510 = m16858();
            if (m16855()) {
                return;
            }
            int iM168511 = m16858();
            c2043.f6369.m32304(C14442.m34864(i, "LocalVar[", "]: "), new Object[0]);
            c2043.f6369.m32315(C12669.m31437(iM168511, l.d, C1402.m5126("{ startPC: ", iM16859, ", length: ", ", CPX: ", iM168510)), new Object[0]);
            c1934.m6634(iM16859, iM168510, iM168511);
        }
    }

    @Override // l.C5224
    /* JADX INFO: renamed from: ᩷ */
    public final void mo15722(EnumC24309 enumC24309) {
        C2043 c2043 = this.f19832;
        c2043.f6369.m32304("Catch Target: ", new Object[0]);
        int iM16858 = m16858();
        c2043.f6369.m32315(C14442.m34864(iM16858, "{ catch_index: ", l.d), new Object[0]);
        if (m16855()) {
            return;
        }
        this.f19834 = new C19833(enumC24309, iM16858);
    }

    @Override // l.C5224
    /* JADX INFO: renamed from: ܳ */
    public final void mo15720(EnumC24309 enumC24309) {
        C2043 c2043 = this.f19832;
        c2043.f6369.m32304("Offset Target: ", new Object[0]);
        int iM16858 = m16858();
        c2043.f6369.m32315(C14442.m34864(iM16858, "{ offset_index: ", l.d), new Object[0]);
        if (m16855()) {
            return;
        }
        this.f19834 = new C11628(enumC24309, iM16858);
    }

    @Override // l.C5224
    /* JADX INFO: renamed from: ۧ */
    public final void mo15718(EnumC24309 enumC24309) {
        C2043 c2043 = this.f19832;
        c2043.f6369.m32304("TypeArg Target: ", new Object[0]);
        int iM16858 = m16858();
        if (m16855()) {
            return;
        }
        int iM16860 = m16860();
        if (m16855()) {
            return;
        }
        c2043.f6369.m32315(C0703.m3016("{ offset: ", iM16858, " type_index: ", l.d, iM16860), new Object[0]);
        this.f19834 = new C17595(enumC24309, iM16858, iM16860);
    }
}
