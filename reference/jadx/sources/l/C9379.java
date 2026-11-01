package l;

import com.alipay.sdk.m.y.l;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۢۚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57DZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C9379 extends C5487 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC9315 f31748 = null;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public IOException f31749 = null;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3027 f31750;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public DataInputStream f31751;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24056(DataInputStream dataInputStream) {
        this.f31751 = dataInputStream;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m24057() {
        try {
            return this.f31751.readUnsignedByte();
        } catch (IOException e) {
            this.f31749 = e;
            return 0;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m24055() {
        try {
            return this.f31751.readUnsignedShort();
        } catch (IOException e) {
            this.f31749 = e;
            return 0;
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m24059(EnumC2300 enumC2300) throws IOException {
        this.f31749 = null;
        this.f31748 = null;
        this.f31750.f47519.m2146("Target Type: " + enumC2300.m7039(), new Object[0]);
        m15162(enumC2300);
        IOException iOException = this.f31749;
        if (iOException != null) {
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC9315 m24058() {
        return this.f31748;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m24054() {
        return this.f31749 != null;
    }

    @Override // l.C5487
    /* JADX INFO: renamed from: ۘ */
    public final void mo15161(EnumC2300 enumC2300) {
        C3027 c3027 = this.f31750;
        c3027.f47519.m2160("Type Param Target: ", new Object[0]);
        int iM24057 = m24057();
        c3027.f47519.m2146(C2271.m6966(iM24057, "{ param_index: ", l.d), new Object[0]);
        if (m24054()) {
            return;
        }
        this.f31748 = new C1552(enumC2300, iM24057);
    }

    @Override // l.C5487
    /* JADX INFO: renamed from: ֨ */
    public final void mo15159(EnumC2300 enumC2300) {
        C3027 c3027 = this.f31750;
        c3027.f47519.m2160("SuperType Target: ", new Object[0]);
        int iM24055 = m24055();
        c3027.f47519.m2146(C2271.m6966(iM24055, "{ type_index: ", l.d), new Object[0]);
        if (m24054()) {
            return;
        }
        this.f31748 = new C5786(enumC2300, iM24055);
    }

    @Override // l.C5487
    /* JADX INFO: renamed from: ᩺ */
    public final void mo15169(EnumC2300 enumC2300) {
        C3027 c3027 = this.f31750;
        c3027.f47519.m2160("TypeParam Bound Target: ", new Object[0]);
        int iM24057 = m24057();
        if (m24054()) {
            return;
        }
        int iM24058 = m24057();
        if (m24054()) {
            return;
        }
        c3027.f47519.m2146(C8015.m21119("{ param_index: ", iM24057, " bound_index: ", l.d, iM24058), new Object[0]);
        this.f31748 = new C14254(enumC2300, iM24057, iM24058);
    }

    @Override // l.C5487
    /* JADX INFO: renamed from: ۨ */
    public final void mo15165(EnumC2300 enumC2300) {
        this.f31750.f47519.m2146("Empty Target: ", new Object[0]);
        if (m24054()) {
            return;
        }
        this.f31748 = new C15665(enumC2300);
    }

    @Override // l.C5487
    /* JADX INFO: renamed from: ۚ */
    public final void mo15163(EnumC2300 enumC2300) {
        C3027 c3027 = this.f31750;
        c3027.f47519.m2160("MethodFormalParam Target: ", new Object[0]);
        int iM24057 = m24057();
        c3027.f47519.m2146(C2271.m6966(iM24057, "{ param_index: ", l.d), new Object[0]);
        if (m24054()) {
            return;
        }
        this.f31748 = new C19898(enumC2300, iM24057);
    }

    public C9379(C3027 c3027) {
        this.f31750 = c3027;
    }

    @Override // l.C5487
    /* JADX INFO: renamed from: ۬ */
    public final void mo15166(EnumC2300 enumC2300) {
        C3027 c3027 = this.f31750;
        c3027.f47519.m2160("Throws Target: ", new Object[0]);
        int iM24055 = m24055();
        c3027.f47519.m2146(C2271.m6966(iM24055, "{ exception_index: ", l.d), new Object[0]);
        if (m24054()) {
            return;
        }
        this.f31748 = new C10726(enumC2300, iM24055);
    }

    @Override // l.C5487
    /* JADX INFO: renamed from: ۖ */
    public final void mo15160(EnumC2300 enumC2300) {
        C3027 c3027 = this.f31750;
        c3027.f47519.m2146("LocalVar Target: ", new Object[0]);
        int iM24055 = m24055();
        if (m24054()) {
            return;
        }
        C12137 c12137 = new C12137(enumC2300, iM24055);
        this.f31748 = c12137;
        for (int i = 0; i < iM24055; i++) {
            int iM24056 = m24055();
            if (m24054()) {
                return;
            }
            int iM24057 = m24055();
            if (m24054()) {
                return;
            }
            int iM24058 = m24055();
            c3027.f47519.m2160(C2271.m6966(i, "LocalVar[", "]: "), new Object[0]);
            c3027.f47519.m2146(C12441.m30911(iM24058, l.d, C0589.m2791("{ startPC: ", iM24056, ", length: ", ", CPX: ", iM24057)), new Object[0]);
            c12137.m30211(iM24056, iM24057, iM24058);
        }
    }

    @Override // l.C5487
    /* JADX INFO: renamed from: ܰ */
    public final void mo15167(EnumC2300 enumC2300) {
        C3027 c3027 = this.f31750;
        c3027.f47519.m2160("Catch Target: ", new Object[0]);
        int iM24055 = m24055();
        c3027.f47519.m2146(C2271.m6966(iM24055, "{ catch_index: ", l.d), new Object[0]);
        if (m24054()) {
            return;
        }
        this.f31748 = new C20603(enumC2300, iM24055);
    }

    @Override // l.C5487
    /* JADX INFO: renamed from: ᩹ */
    public final void mo15168(EnumC2300 enumC2300) {
        C3027 c3027 = this.f31750;
        c3027.f47519.m2160("Offset Target: ", new Object[0]);
        int iM24055 = m24055();
        c3027.f47519.m2146(C2271.m6966(iM24055, "{ offset_index: ", l.d), new Object[0]);
        if (m24054()) {
            return;
        }
        this.f31748 = new C17075(enumC2300, iM24055);
    }

    @Override // l.C5487
    /* JADX INFO: renamed from: ۜ */
    public final void mo15164(EnumC2300 enumC2300) {
        C3027 c3027 = this.f31750;
        c3027.f47519.m2160("TypeArg Target: ", new Object[0]);
        int iM24055 = m24055();
        if (m24054()) {
            return;
        }
        int iM24057 = m24057();
        if (m24054()) {
            return;
        }
        c3027.f47519.m2146(C8015.m21119("{ offset: ", iM24055, " type_index: ", l.d, iM24057), new Object[0]);
        this.f31748 = new C23426(enumC2300, iM24055, iM24057);
    }
}
