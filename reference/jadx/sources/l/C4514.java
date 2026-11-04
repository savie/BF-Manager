package l;

/* JADX INFO: renamed from: l.ۘ᩻ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: X9J0 */
/* JADX INFO: loaded from: classes3.dex */
public class C4514 extends AbstractC21779 {
    public C4514(byte[] bArr) {
        super(new C18684(), bArr);
    }

    public C4514(C7453 c7453) {
        super(new C18684(), c7453);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m14236() {
        return C10961.m27794(((C18684) m49391()).m43463(), EnumC12717.SMB2_FLAGS_ASYNC_COMMAND) && ((C18684) m49391()).m43472() == EnumC20243.STATUS_PENDING.getValue();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m14238() {
        return ((C18684) m49391()).m43457() == -1 && ((C18684) m49391()).m43462() == EnumC23906.SMB2_OPLOCK_BREAK;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C4514 mo14237() {
        if (((C18684) m49391()).m43451() != 0) {
            return new C4514(this.f69454);
        }
        return null;
    }

    public final String toString() {
        return ((C18684) m49391()).m43462() + " with message id << " + ((C18684) m49391()).m43457() + " >>";
    }
}
