package l;

/* JADX INFO: renamed from: l.᩺ܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: MA0S */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23071 extends AbstractC23777 implements InterfaceC13193 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f74953 = -1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f74952 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f74955 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f74957 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f74954 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f74956 = 0;

    /* JADX INFO: renamed from: ۖ */
    public abstract void mo37990(C17426 c17426);

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo37991();

    /* JADX INFO: renamed from: ᩹ */
    public abstract void mo37992(C17426 c17426);

    /* JADX INFO: renamed from: ܰ */
    public C6842 mo49597() {
        String strConcat;
        if (this.f74956 == 0) {
            return null;
        }
        int i = this.f74956;
        int i2 = 0;
        int i3 = 9;
        while (i3 >= i2) {
            int i4 = (i2 + i3) / 2;
            int i5 = InterfaceC4019.f14873[i4];
            if (i > i5) {
                i2 = i4 + 1;
            } else {
                if (i >= i5) {
                    strConcat = InterfaceC4019.f14874[i4];
                    return new C6842(strConcat);
                }
                i3 = i4 - 1;
            }
        }
        strConcat = "0x".concat(C5993.m16280(i, 8));
        return new C6842(strConcat);
    }

    @Override // l.AbstractC23777
    /* JADX INFO: renamed from: ܰ */
    public final void mo2371(C17426 c17426) {
        int i = c17426.f55443;
        c17426.m40624(16);
        int i2 = 0;
        if (this.f74953 == 0) {
            int i3 = c17426.f55443;
            c17426.m40622(0);
            c17426.m40627(0);
            c17426.m40627(mo37991());
            i2 = i3;
        }
        mo37992(c17426);
        int i4 = c17426.f55443 - i;
        this.f74955 = i4;
        if (this.f74953 == 0) {
            c17426.f55443 = i2;
            int i5 = i4 - i2;
            this.f74954 = i5;
            c17426.m40622(i5);
        }
        c17426.f55443 = i;
        m51047(c17426);
        c17426.f55443 = i + this.f74955;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m51047(C17426 c17426) {
        c17426.m40632(5);
        c17426.m40632(0);
        c17426.m40632(this.f74953);
        c17426.m40632(this.f74952);
        c17426.m40622(16);
        c17426.m40627(this.f74955);
        c17426.m40627(0);
        c17426.m40622(this.f74957);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m51048(C17426 c17426) throws C6137 {
        if (c17426.m40628() != 5 || c17426.m40628() != 0) {
            throw new C6137("DCERPC version not supported");
        }
        this.f74953 = c17426.m40628();
        this.f74952 = c17426.m40628();
        if (c17426.m40623() != 16) {
            throw new C6137("Data representation not supported");
        }
        this.f74955 = c17426.m40630();
        if (c17426.m40630() != 0) {
            throw new C6137("DCERPC authentication not supported");
        }
        this.f74957 = c17426.m40623();
    }

    @Override // l.AbstractC23777
    /* JADX INFO: renamed from: ۙ */
    public final void mo2370(C17426 c17426) throws C6137 {
        m51048(c17426);
        int i = this.f74953;
        if (i != 12 && i != 2 && i != 3 && i != 13) {
            throw new C6137("Unexpected ptype: " + this.f74953);
        }
        if (i == 2 || i == 3) {
            this.f74954 = c17426.m40623();
            c17426.m40630();
            c17426.m40630();
        }
        int i2 = this.f74953;
        if (i2 == 3 || i2 == 13) {
            this.f74956 = c17426.m40623();
        } else {
            mo37990(c17426);
        }
    }
}
