package l;

/* JADX INFO: renamed from: l.ۖܳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X9J0 */
/* JADX INFO: loaded from: classes3.dex */
public class C2597 extends AbstractC7245 {
    public C2597(byte[] bArr) {
        super(new C1186(), bArr);
    }

    public C2597(C19240 c19240) {
        super(new C1186(), c19240);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m8071() {
        return C20799.m46784(((C1186) m19360()).m4348(), EnumC4714.SMB2_FLAGS_ASYNC_COMMAND) && ((C1186) m19360()).m4349() == EnumC3055.STATUS_PENDING.getValue();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m8069() {
        return ((C1186) m19360()).m4341() == -1 && ((C1186) m19360()).m4325() == EnumC2162.SMB2_OPLOCK_BREAK;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C2597 mo8070() {
        if (((C1186) m19360()).m4328() != 0) {
            return new C2597(this.f24139);
        }
        return null;
    }

    public final String toString() {
        return ((C1186) m19360()).m4325() + " with message id << " + ((C1186) m19360()).m4341() + " >>";
    }
}
