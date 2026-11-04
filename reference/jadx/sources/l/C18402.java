package l;

import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܿܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: RIV7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18402 implements InterfaceC4232 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f59944;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C10132 f59945;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C7150 f59946;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Function f59947;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public AbstractC16481 f59948;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Set f59949;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC15251 f59950;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public AbstractC1566 f59951;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Supplier f59954;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f59955;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f59952 = true;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f59953 = -1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f59943 = false;

    public C18402(C10132 c10132, C7150 c7150, AbstractC15251 abstractC15251, int i, Set set, Supplier supplier, Function function) {
        this.f59945 = c10132;
        this.f59946 = c7150;
        this.f59950 = abstractC15251;
        this.f59955 = i;
        this.f59949 = set;
        this.f59954 = supplier;
        this.f59947 = function;
    }

    @Override // l.InterfaceC4232
    /* JADX INFO: renamed from: ۙ */
    public final EnumC4695 mo11179(EnumC4695 enumC4695) {
        AbstractC16481 abstractC16481Mo44035;
        AbstractC1566 abstractC1566M42913;
        C18402 c18402;
        do {
            int i = C21386.f68104[enumC4695.ordinal()];
            C10132 c10132 = this.f59945;
            if (i == 1) {
                this.f59952 = false;
            } else if (i == 2) {
                EnumC7215 enumC7215M23403 = c10132.m26142().m23403(this.f59951, this.f59948.getType());
                if (this.f59944) {
                    if (enumC7215M23403.m19811()) {
                        return EnumC4695.REJECT;
                    }
                } else if (enumC7215M23403.m19812()) {
                    return EnumC4695.REJECT;
                }
            }
            while (true) {
                int i2 = this.f59953 + 1;
                this.f59953 = i2;
                if (i2 >= this.f59955) {
                    return this.f59952 ? EnumC4695.SAME : EnumC4695.CHANGED;
                }
                AbstractC15251 abstractC15251 = this.f59950;
                abstractC16481Mo44035 = abstractC15251.mo44035(abstractC15251.mo13126() + i2);
                if (!abstractC16481Mo44035.mo1129()) {
                    abstractC1566M42913 = m42913(this.f59949, (AbstractC1566) this.f59947.apply(Integer.valueOf(i2)));
                    if (abstractC1566M42913 != null) {
                        break;
                    }
                }
            }
            this.f59948 = abstractC16481Mo44035;
            this.f59951 = abstractC1566M42913;
            this.f59944 = false;
            if (this.f59943) {
                this.f59943 = false;
                c18402 = this;
            } else {
                c18402 = null;
            }
            enumC4695 = c10132.m26141(this.f59946, abstractC16481Mo44035, abstractC1566M42913, c18402);
        } while (enumC4695 != null);
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC4695 m42914() {
        this.f59943 = true;
        EnumC4695 enumC4695M26141 = EnumC4695.SAME;
        C6041 c6041M44027 = this.f59950.m44027();
        if (c6041M44027 != null && !c6041M44027.mo1129()) {
            AbstractC1566 abstractC1566M42913 = m42913(this.f59949, (AbstractC1566) this.f59954.get());
            if (abstractC1566M42913 != null) {
                this.f59948 = c6041M44027;
                this.f59951 = abstractC1566M42913;
                this.f59944 = true;
                this.f59943 = false;
                enumC4695M26141 = this.f59945.m26141(this.f59946, c6041M44027, abstractC1566M42913, this);
                if (enumC4695M26141 == null) {
                    return null;
                }
            }
        }
        return mo11179(enumC4695M26141);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC1566 m42913(Set set, AbstractC1566 abstractC1566) {
        if (abstractC1566 == null || abstractC1566.m5540()) {
            return null;
        }
        if (!abstractC1566.m5567() || (!set.isEmpty() && ((Boolean) abstractC1566.m5544((Function) new C14672(0, this))) == null)) {
            return abstractC1566;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Boolean m42912(C18402 c18402, AbstractC1566 abstractC1566) {
        if (!abstractC1566.m5569() || c18402.f59949.contains(abstractC1566)) {
            return null;
        }
        return Boolean.TRUE;
    }
}
