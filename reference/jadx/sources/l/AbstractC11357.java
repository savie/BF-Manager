package l;

/* JADX INFO: renamed from: l.ۨ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 85GM */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11357 extends AbstractC4300 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC9011 f38307;

    public AbstractC11357(EnumC0772 enumC0772, AbstractC9011 abstractC9011) {
        super(enumC0772);
        this.f38307 = abstractC9011;
        int i = C13474.f44540[enumC0772.f3348.ordinal()];
        if (i == 1) {
            if (this.f38307 instanceof C18888) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f38307.getClass().getSimpleName());
            sb.append(" is the wrong item type for opcode ");
            throw new RuntimeException(C22697.m50267(sb, enumC0772.f3345, ". Expecting FieldIdItem."));
        }
        if (i == 2) {
            if (this.f38307 instanceof C20299) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f38307.getClass().getSimpleName());
            sb2.append(" is the wrong item type for opcode ");
            throw new RuntimeException(C22697.m50267(sb2, enumC0772.f3345, ". Expecting MethodIdItem."));
        }
        if (i == 3) {
            if (this.f38307 instanceof C1953) {
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f38307.getClass().getSimpleName());
            sb3.append(" is the wrong item type for opcode ");
            throw new RuntimeException(C22697.m50267(sb3, enumC0772.f3345, ". Expecting TypeIdItem."));
        }
        if (i != 4) {
            if (this.f38307 == null) {
                return;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.f38307.getClass().getSimpleName());
            sb4.append(" is invalid for opcode ");
            throw new RuntimeException(C22697.m50267(sb4, enumC0772.f3345, ". This opcode does not reference an item"));
        }
        if (this.f38307 instanceof C14655) {
            return;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f38307.getClass().getSimpleName());
        sb5.append(" is the wrong item type for opcode ");
        throw new RuntimeException(C22697.m50267(sb5, enumC0772.f3345, ". Expecting StringIdItem."));
    }

    public AbstractC11357(C12063 c12063, EnumC0772 enumC0772, byte[] bArr, int i) {
        super(enumC0772);
        int iMo28437 = mo28437(i, bArr);
        int i2 = C13474.f44540[enumC0772.f3348.ordinal()];
        if (i2 == 1) {
            this.f38307 = c12063.f40352.m44688(iMo28437);
            return;
        }
        if (i2 == 2) {
            this.f38307 = c12063.f40370.m44688(iMo28437);
        } else if (i2 == 3) {
            this.f38307 = c12063.f40367.m44688(iMo28437);
        } else {
            if (i2 != 4) {
                return;
            }
            this.f38307 = c12063.f40354.m44688(iMo28437);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int mo28437(int i, byte[] bArr) {
        return C14611.m35087(i + 2, bArr);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final AbstractC9011 m28439() {
        return this.f38307;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28438(AbstractC9011 abstractC9011) {
        this.f38307 = abstractC9011;
    }
}
