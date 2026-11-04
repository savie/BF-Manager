package l;

/* JADX INFO: renamed from: l.ܰۡۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85GM */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14490 extends AbstractC24188 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC10739 f45606;

    public AbstractC14490(EnumC7779 enumC7779, AbstractC10739 abstractC10739) {
        super(enumC7779);
        this.f45606 = abstractC10739;
        int i = C4050.f13790[enumC7779.f25843.ordinal()];
        if (i == 1) {
            if (this.f45606 instanceof C13548) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f45606.getClass().getSimpleName());
            sb.append(" is the wrong item type for opcode ");
            throw new RuntimeException(C8947.m23910(sb, enumC7779.f25846, ". Expecting FieldIdItem."));
        }
        if (i == 2) {
            if (this.f45606 instanceof C5520) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f45606.getClass().getSimpleName());
            sb2.append(" is the wrong item type for opcode ");
            throw new RuntimeException(C8947.m23910(sb2, enumC7779.f25846, ". Expecting MethodIdItem."));
        }
        if (i == 3) {
            if (this.f45606 instanceof C20436) {
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f45606.getClass().getSimpleName());
            sb3.append(" is the wrong item type for opcode ");
            throw new RuntimeException(C8947.m23910(sb3, enumC7779.f25846, ". Expecting TypeIdItem."));
        }
        if (i != 4) {
            if (this.f45606 == null) {
                return;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.f45606.getClass().getSimpleName());
            sb4.append(" is invalid for opcode ");
            throw new RuntimeException(C8947.m23910(sb4, enumC7779.f25846, ". This opcode does not reference an item"));
        }
        if (this.f45606 instanceof C3282) {
            return;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f45606.getClass().getSimpleName());
        sb5.append(" is the wrong item type for opcode ");
        throw new RuntimeException(C8947.m23910(sb5, enumC7779.f25846, ". Expecting StringIdItem."));
    }

    public AbstractC14490(C24738 c24738, EnumC7779 enumC7779, byte[] bArr, int i) {
        super(enumC7779);
        int iMo24083 = mo24083(i, bArr);
        int i2 = C4050.f13790[enumC7779.f25843.ordinal()];
        if (i2 == 1) {
            this.f45606 = c24738.f80101.m49623(iMo24083);
            return;
        }
        if (i2 == 2) {
            this.f45606 = c24738.f80108.m49623(iMo24083);
        } else if (i2 == 3) {
            this.f45606 = c24738.f80112.m49623(iMo24083);
        } else {
            if (i2 != 4) {
                return;
            }
            this.f45606 = c24738.f80094.m49623(iMo24083);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public int mo24083(int i, byte[] bArr) {
        return C12556.m31238(i + 2, bArr);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC10739 m35002() {
        return this.f45606;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35001(AbstractC10739 abstractC10739) {
        this.f45606 = abstractC10739;
    }
}
