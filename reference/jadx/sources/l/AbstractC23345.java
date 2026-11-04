package l;

import com.alipay.sdk.m.y.l;
import java.io.DataInputStream;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩹ۚ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: T7EH */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23345 extends AbstractC20997 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public int f75619;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public C19615 f75620;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public int f75621;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC15885 f75622;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public int f75623;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public String f75624;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public AbstractC3236 f75625;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public C15139 f75626;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public C1606 f75627;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public Supplier f75628;

    /* JADX INFO: renamed from: ۛ */
    public abstract String mo10080();

    public AbstractC23345(C0224 c0224, EnumC10882 enumC10882) {
        super(c0224.f67151);
        this.f75619 = 0;
        this.f75624 = null;
        this.f75621 = 0;
        this.f75620 = new C19615(this);
        this.f75626 = new C15139(this);
        this.f75627 = c0224.f6371;
        this.f75625 = ((C0224) c0224.f6363).f6369.m32312();
        this.f67131 = enumC10882;
        int i = C17377.f56521[enumC10882.ordinal()];
        if (i == 1) {
            this.f75619 = 2;
            this.f75628 = new Supplier() { // from class: l.۫ۚ᩺
                @Override // java.util.function.Supplier
                public final Object get() {
                    return String.format("#%d;", Integer.valueOf(this.f41260.f75623));
                }
            };
            this.f75622 = new InterfaceC15885() { // from class: l.ۚۚ᩺
                @Override // l.InterfaceC15885
                /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
                public final void mo16274() {
                    AbstractC23345 abstractC23345 = this.f19030;
                    String str = abstractC23345.f75624;
                    if (str == null) {
                        str = "???";
                    }
                    abstractC23345.m48006("\"" + str + "\";");
                }
            };
        } else if (i == 2) {
            this.f75619 = 2;
            this.f75628 = new Supplier() { // from class: l.֫ۚ᩺
                @Override // java.util.function.Supplier
                public final Object get() {
                    return String.format("#%d;", Integer.valueOf(this.f5865.f75623));
                }
            };
            this.f75622 = new InterfaceC15885() { // from class: l.ۧۚ᩺
                @Override // l.InterfaceC15885
                /* JADX INFO: renamed from: ᩷ */
                public final void mo16274() {
                    AbstractC23345 abstractC23345 = this.f35883;
                    String str = abstractC23345.f75624;
                    if (str == null) {
                        str = "\"???\"";
                    }
                    abstractC23345.m48006(str.concat(l.b));
                }
            };
        } else {
            if (i != 3) {
                throw new RuntimeException(C14442.m34865("Implementation of \"", this.f67131.m27632(), "\" is not supported"));
            }
            this.f75619 = 4;
            this.f75628 = new Supplier() { // from class: l.᩻ۚ᩺
                @Override // java.util.function.Supplier
                public final Object get() {
                    AbstractC23345 abstractC23345 = this.f80330;
                    return String.format("#%d:#%d;", Integer.valueOf(abstractC23345.f75623), Integer.valueOf(abstractC23345.f75621));
                }
            };
            this.f75622 = new InterfaceC15885() { // from class: l.ܺۚ᩺
                @Override // l.InterfaceC15885
                /* JADX INFO: renamed from: ᩷ */
                public final void mo16274() {
                    AbstractC23345 abstractC23345 = this.f53767;
                    abstractC23345.m48006(abstractC23345.f75624 + l.b);
                }
            };
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52512(int i, DataInputStream dataInputStream) {
        if (i != this.f75619) {
            boolean z = this.f67152;
            AbstractC3236 abstractC3236 = this.f75625;
            if (z) {
                abstractC3236.mo10582("{0}: Invalid attribute length #{1}", this.f67131.m27631().m32609(), Integer.valueOf(i));
            } else {
                throw new C5474(abstractC3236, "{0}: Invalid attribute length #{1}", this.f67131.m27631().m32609(), Integer.valueOf(i));
            }
        }
        this.f75623 = dataInputStream.readUnsignedShort();
        if (this.f67131 == EnumC10882.ENCLOSING_METHOD) {
            this.f75621 = dataInputStream.readUnsignedShort();
        }
    }

    @Override // l.AbstractC20997
    /* JADX INFO: renamed from: ᩹ */
    public final void mo5641() {
        mo10080();
        m47997(m47996(mo46523(), this.f67131.m27634().m15637()));
        if (this.f67132) {
            if (this.f67146) {
                this.f75620.mo16274();
                return;
            } else {
                this.f75626.mo16274();
                return;
            }
        }
        this.f75622.mo16274();
    }

    @Override // l.AbstractC20997
    /* JADX INFO: renamed from: ۨ */
    public final void mo5634() {
        mo5641();
    }
}
