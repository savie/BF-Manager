package l;

/* JADX INFO: renamed from: l.ۘ᩻ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: N4NK */
/* JADX INFO: loaded from: classes2.dex */
public class C4511 extends Exception {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f16093;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Object f16094;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f16095;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC17189 f16096;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC21665 f16097;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f16098;

    public C4511() {
    }

    public C4511(InterfaceC17189 interfaceC17189) {
        Object objMo9827;
        this.f16096 = interfaceC17189;
        interfaceC17189.getClass();
        if (interfaceC17189 instanceof InterfaceC18681) {
            InterfaceC21665 interfaceC21665Mo17439 = ((InterfaceC18681) interfaceC17189).mo17439(1);
            this.f16097 = interfaceC21665Mo17439;
            this.f16093 = interfaceC21665Mo17439.getLine();
            this.f16098 = this.f16097.mo33097();
        }
        if (!(interfaceC17189 instanceof InterfaceC15455)) {
            if (interfaceC17189 instanceof InterfaceC15697) {
                this.f16095 = interfaceC17189.mo9833(1);
                InterfaceC15697 interfaceC15697 = (InterfaceC15697) interfaceC17189;
                this.f16093 = interfaceC15697.getLine();
                this.f16098 = interfaceC15697.m37469();
                return;
            }
            this.f16095 = interfaceC17189.mo9833(1);
            return;
        }
        InterfaceC15455 interfaceC15455 = (InterfaceC15455) interfaceC17189;
        this.f16094 = interfaceC15455.m37009(1);
        if (interfaceC15455 instanceof InterfaceC8985) {
            InterfaceC8985 interfaceC8985 = (InterfaceC8985) interfaceC15455;
            objMo9827 = interfaceC8985.mo9827(false);
            if (objMo9827 == null) {
                objMo9827 = interfaceC8985.mo9827(true);
            }
        } else {
            objMo9827 = null;
        }
        C17370 c17370Mo9831 = interfaceC15455.mo9831();
        objMo9827 = objMo9827 == null ? this.f16094 : objMo9827;
        c17370Mo9831.getClass();
        InterfaceC21665 interfaceC21665 = objMo9827 instanceof C9730 ? ((C9730) objMo9827).f31384 : null;
        if (interfaceC21665 != null) {
            this.f16097 = interfaceC21665;
            if (interfaceC21665.getLine() <= 0) {
                Object objM37009 = interfaceC15455.m37009(-1);
                int i = -1;
                while (objM37009 != null) {
                    InterfaceC21665 interfaceC21666 = objM37009 instanceof C9730 ? ((C9730) objM37009).f31384 : null;
                    if (interfaceC21666 != null && interfaceC21666.getLine() > 0) {
                        this.f16093 = interfaceC21666.getLine();
                        this.f16098 = interfaceC21666.mo33097();
                        return;
                    } else {
                        i--;
                        try {
                            objM37009 = interfaceC15455.m37009(i);
                        } catch (UnsupportedOperationException unused) {
                            objM37009 = null;
                        }
                    }
                }
                return;
            }
            this.f16093 = interfaceC21665.getLine();
            this.f16098 = interfaceC21665.mo33097();
            return;
        }
        Object obj = this.f16094;
        if (!(obj instanceof InterfaceC22915)) {
            int type = obj != null ? ((InterfaceC22915) obj).getType() : 0;
            Object obj2 = this.f16094;
            this.f16097 = new C13460(type, obj2 != null ? ((InterfaceC22915) obj2).getText() : null);
        } else {
            this.f16093 = ((InterfaceC22915) obj).getLine();
            this.f16098 = ((InterfaceC22915) this.f16094).mo25318();
            Object obj3 = this.f16094;
            if (obj3 instanceof C9730) {
                this.f16097 = ((C9730) obj3).f31384;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m14235() {
        InterfaceC17189 interfaceC17189 = this.f16096;
        if (interfaceC17189 instanceof InterfaceC18681) {
            return this.f16097.getType();
        }
        if (interfaceC17189 instanceof InterfaceC15455) {
            ((InterfaceC15455) interfaceC17189).mo9831().getClass();
            Object obj = this.f16094;
            if (obj == null) {
                return 0;
            }
            return ((InterfaceC22915) obj).getType();
        }
        return this.f16095;
    }
}
