package l;

/* JADX INFO: renamed from: l.᩹ۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N4NK */
/* JADX INFO: loaded from: classes.dex */
public class C22085 extends Exception {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient InterfaceC14242 f71535;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Object f71536;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f71537;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f71538;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC12913 f71539;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f71540;

    public C22085() {
    }

    public C22085(InterfaceC14242 interfaceC14242) {
        Object objMo21032;
        this.f71535 = interfaceC14242;
        interfaceC14242.getClass();
        if (interfaceC14242 instanceof InterfaceC3739) {
            InterfaceC12913 interfaceC12913Mo10949 = ((InterfaceC3739) interfaceC14242).mo10949(1);
            this.f71539 = interfaceC12913Mo10949;
            this.f71538 = interfaceC12913Mo10949.getLine();
            this.f71540 = this.f71539.mo30176();
        }
        if (!(interfaceC14242 instanceof InterfaceC16441)) {
            if (interfaceC14242 instanceof InterfaceC16358) {
                this.f71537 = interfaceC14242.mo21038(1);
                InterfaceC16358 interfaceC16358 = (InterfaceC16358) interfaceC14242;
                this.f71538 = interfaceC16358.getLine();
                this.f71540 = interfaceC16358.m38529();
                return;
            }
            this.f71537 = interfaceC14242.mo21038(1);
            return;
        }
        InterfaceC16441 interfaceC16441 = (InterfaceC16441) interfaceC14242;
        this.f71536 = interfaceC16441.m38708(1);
        if (interfaceC16441 instanceof InterfaceC19263) {
            InterfaceC19263 interfaceC19263 = (InterfaceC19263) interfaceC16441;
            objMo21032 = interfaceC19263.mo21032(false);
            if (objMo21032 == null) {
                objMo21032 = interfaceC19263.mo21032(true);
            }
        } else {
            objMo21032 = null;
        }
        C23805 c23805Mo21036 = interfaceC16441.mo21036();
        objMo21032 = objMo21032 == null ? this.f71536 : objMo21032;
        c23805Mo21036.getClass();
        InterfaceC12913 interfaceC12913 = objMo21032 instanceof C18557 ? ((C18557) objMo21032).f59042 : null;
        if (interfaceC12913 != null) {
            this.f71539 = interfaceC12913;
            if (interfaceC12913.getLine() <= 0) {
                Object objM38708 = interfaceC16441.m38708(-1);
                int i = -1;
                while (objM38708 != null) {
                    InterfaceC12913 interfaceC12914 = objM38708 instanceof C18557 ? ((C18557) objM38708).f59042 : null;
                    if (interfaceC12914 != null && interfaceC12914.getLine() > 0) {
                        this.f71538 = interfaceC12914.getLine();
                        this.f71540 = interfaceC12914.mo30176();
                        return;
                    } else {
                        i--;
                        try {
                            objM38708 = interfaceC16441.m38708(i);
                        } catch (UnsupportedOperationException unused) {
                            objM38708 = null;
                        }
                    }
                }
                return;
            }
            this.f71538 = interfaceC12913.getLine();
            this.f71540 = interfaceC12913.mo30176();
            return;
        }
        Object obj = this.f71536;
        if (!(obj instanceof InterfaceC19969)) {
            int type = obj != null ? ((InterfaceC19969) obj).getType() : 0;
            Object obj2 = this.f71536;
            this.f71539 = new C12125(type, obj2 != null ? ((InterfaceC19969) obj2).getText() : null);
        } else {
            this.f71538 = ((InterfaceC19969) obj).getLine();
            this.f71540 = ((InterfaceC19969) this.f71536).mo42954();
            Object obj3 = this.f71536;
            if (obj3 instanceof C18557) {
                this.f71539 = ((C18557) obj3).f59042;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m49026() {
        InterfaceC14242 interfaceC14242 = this.f71535;
        if (interfaceC14242 instanceof InterfaceC3739) {
            return this.f71539.getType();
        }
        if (interfaceC14242 instanceof InterfaceC16441) {
            ((InterfaceC16441) interfaceC14242).mo21036().getClass();
            Object obj = this.f71536;
            if (obj == null) {
                return 0;
            }
            return ((InterfaceC19969) obj).getType();
        }
        return this.f71537;
    }
}
