package l;

/* JADX INFO: renamed from: l.᩶᩸ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z634 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21597 implements InterfaceC5650 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f68997;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8697 f68998;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f68999 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f69000;

    public AbstractC21597(AbstractC11154 abstractC11154) {
        this.f68998 = abstractC11154;
    }

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC7206 mo11705() {
        return this.f68998.mo18150();
    }

    @Override // l.InterfaceC5650
    /* JADX INFO: renamed from: ۤ */
    public InterfaceC10869 mo11708() {
        return this.f68998.mo18153();
    }

    @Override // l.InterfaceC5650
    public InterfaceC8697 getEntry() {
        return this.f68998;
    }

    @Override // l.InterfaceC5650
    public int getValue() {
        return this.f69000;
    }

    @Override // l.InterfaceC5650
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo16632() {
        int i = this.f68997;
        return i == 16 || i == 17;
    }

    @Override // l.InterfaceC5650
    /* JADX INFO: renamed from: ۗ᩷ */
    public final boolean mo16633() {
        int i = this.f68997;
        if (i != 0) {
            return (i == 1 || i == 2 || i == 7 || i == 8) && getValue() == 0;
        }
        return true;
    }

    @Override // l.InterfaceC5650
    /* JADX INFO: renamed from: ܶ */
    public final boolean mo16634() {
        int i = this.f68997;
        return 28 <= i && i <= 31;
    }

    @Override // l.InterfaceC5650
    /* JADX INFO: renamed from: ܽ */
    public final int mo16635() {
        return this.f68997;
    }

    @Override // l.InterfaceC5650
    /* JADX INFO: renamed from: ᩸ۙ */
    public final boolean mo16636() {
        return this.f68997 == 3;
    }

    @Override // l.InterfaceC5650
    /* JADX INFO: renamed from: ᩻ۙ */
    public final int mo16637() {
        return this.f68999;
    }

    @Override // l.InterfaceC5650
    /* JADX INFO: renamed from: ᩴ᩷ */
    public InterfaceC16090 mo11710() {
        return mo11705().mo15675().getItem(getValue());
    }

    @Override // l.InterfaceC1921
    /* JADX INFO: renamed from: ۙ */
    public final void mo6599(InterfaceC1921 interfaceC1921) {
        InterfaceC5650 interfaceC5650 = (InterfaceC5650) interfaceC1921;
        if (mo16633() && interfaceC5650.mo16633()) {
            return;
        }
        if (this.f68999 != interfaceC5650.mo16637()) {
            throw new RuntimeException(getEntry().getPath() + " " + Integer.toHexString(this.f68999) + " " + Integer.toHexString(interfaceC5650.mo16637()));
        }
        if (this.f68997 != interfaceC5650.mo16635() && ((!mo16634() || !interfaceC5650.mo16634()) && (!mo16632() || !interfaceC5650.mo16632()))) {
            throw new RuntimeException(getEntry().getPath() + " " + mo11704() + " " + this.f68997 + " " + interfaceC5650.mo16635());
        }
        if (mo16636()) {
            try {
                mo11710().mo6599(interfaceC5650.mo11710());
                return;
            } catch (RuntimeException e) {
                throw new RuntimeException(getEntry().getPath(), e);
            }
        }
        if (getValue() != interfaceC5650.getValue()) {
            int i = this.f68997;
            if (i == 18) {
                if ((getValue() != 0) == (interfaceC5650.getValue() != 0)) {
                    return;
                }
            } else {
                if (i == 4) {
                    String string = Float.toString(Float.intBitsToFloat(getValue()));
                    String string2 = Float.toString(Float.intBitsToFloat(interfaceC5650.getValue()));
                    if (string.equals(string2)) {
                        return;
                    }
                    throw new RuntimeException(getEntry().getPath() + " " + string + " " + string2);
                }
                if (i == 5) {
                    String strM48419 = C21246.m48419(getValue());
                    String strM484110 = C21246.m48419(interfaceC5650.getValue());
                    if (strM48419.equals(strM484110)) {
                        return;
                    }
                    throw new RuntimeException(getEntry().getPath() + " " + strM48419 + " " + strM484110);
                }
                if (i == 6) {
                    String strM48417 = C21246.m48417(getValue());
                    String strM48418 = C21246.m48417(interfaceC5650.getValue());
                    if (strM48417.equals(strM48418)) {
                        return;
                    }
                    throw new RuntimeException(getEntry().getPath() + " " + strM48417 + " " + strM48418);
                }
            }
            throw new RuntimeException(String.format("%s %d(0x%08x) %d(0x%08x)", getEntry().getPath(), Integer.valueOf(getValue()), Integer.valueOf(getValue()), Integer.valueOf(interfaceC5650.getValue()), Integer.valueOf(interfaceC5650.getValue())));
        }
    }
}
