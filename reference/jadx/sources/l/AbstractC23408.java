package l;

/* JADX INFO: renamed from: l.᩻ۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z634 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23408 implements InterfaceC9961 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f75804 = -1;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3609 f75805;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f75806;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f75807;

    public AbstractC23408(AbstractC3650 abstractC3650) {
        this.f75805 = abstractC3650;
    }

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC6432 mo32493() {
        return this.f75805.mo10689();
    }

    @Override // l.InterfaceC9961
    /* JADX INFO: renamed from: ܰ */
    public InterfaceC17721 mo25190() {
        return this.f75805.mo10692();
    }

    @Override // l.InterfaceC9961
    public InterfaceC3609 getEntry() {
        return this.f75805;
    }

    @Override // l.InterfaceC9961
    public int getValue() {
        return this.f75807;
    }

    @Override // l.InterfaceC9961
    /* JADX INFO: renamed from: ۖۙ */
    public final boolean mo25185() {
        return this.f75806 == 3;
    }

    @Override // l.InterfaceC9961
    /* JADX INFO: renamed from: ۠ܰ */
    public final boolean mo25188() {
        int i = this.f75806;
        if (i != 0) {
            return (i == 1 || i == 2 || i == 7 || i == 8) && getValue() == 0;
        }
        return true;
    }

    @Override // l.InterfaceC9961
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo25189() {
        int i = this.f75806;
        return i == 16 || i == 17;
    }

    @Override // l.InterfaceC9961
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo25191() {
        int i = this.f75806;
        return 28 <= i && i <= 31;
    }

    @Override // l.InterfaceC9961
    /* JADX INFO: renamed from: ᩸ */
    public final int mo25192() {
        return this.f75806;
    }

    @Override // l.InterfaceC9961
    /* JADX INFO: renamed from: ᩺ۙ */
    public final int mo25193() {
        return this.f75804;
    }

    @Override // l.InterfaceC9961
    /* JADX INFO: renamed from: ۚܰ */
    public InterfaceC12078 mo25187() {
        return mo32493().mo5139().getItem(getValue());
    }

    @Override // l.InterfaceC7138
    /* JADX INFO: renamed from: ۙ */
    public final void mo10755(InterfaceC7138 interfaceC7138) {
        InterfaceC9961 interfaceC9961 = (InterfaceC9961) interfaceC7138;
        if (mo25188() && interfaceC9961.mo25188()) {
            return;
        }
        if (this.f75804 != interfaceC9961.mo25193()) {
            throw new RuntimeException(getEntry().getPath() + " " + Integer.toHexString(this.f75804) + " " + Integer.toHexString(interfaceC9961.mo25193()));
        }
        if (this.f75806 != interfaceC9961.mo25192() && ((!mo25191() || !interfaceC9961.mo25191()) && (!mo25189() || !interfaceC9961.mo25189()))) {
            throw new RuntimeException(getEntry().getPath() + " " + mo25186() + " " + this.f75806 + " " + interfaceC9961.mo25192());
        }
        if (mo25185()) {
            try {
                mo25187().mo10755(interfaceC9961.mo25187());
                return;
            } catch (RuntimeException e) {
                throw new RuntimeException(getEntry().getPath(), e);
            }
        }
        if (getValue() != interfaceC9961.getValue()) {
            int i = this.f75806;
            if (i == 18) {
                if ((getValue() != 0) == (interfaceC9961.getValue() != 0)) {
                    return;
                }
            } else {
                if (i == 4) {
                    String string = Float.toString(Float.intBitsToFloat(getValue()));
                    String string2 = Float.toString(Float.intBitsToFloat(interfaceC9961.getValue()));
                    if (string.equals(string2)) {
                        return;
                    }
                    throw new RuntimeException(getEntry().getPath() + " " + string + " " + string2);
                }
                if (i == 5) {
                    String strM16354 = C6037.m16354(getValue());
                    String strM16355 = C6037.m16354(interfaceC9961.getValue());
                    if (strM16354.equals(strM16355)) {
                        return;
                    }
                    throw new RuntimeException(getEntry().getPath() + " " + strM16354 + " " + strM16355);
                }
                if (i == 6) {
                    String strM16363 = C6037.m16363(getValue());
                    String strM16364 = C6037.m16363(interfaceC9961.getValue());
                    if (strM16363.equals(strM16364)) {
                        return;
                    }
                    throw new RuntimeException(getEntry().getPath() + " " + strM16363 + " " + strM16364);
                }
            }
            throw new RuntimeException(String.format("%s %d(0x%08x) %d(0x%08x)", getEntry().getPath(), Integer.valueOf(getValue()), Integer.valueOf(getValue()), Integer.valueOf(interfaceC9961.getValue()), Integer.valueOf(interfaceC9961.getValue())));
        }
    }
}
