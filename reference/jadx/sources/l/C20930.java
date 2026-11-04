package l;

import com.alipay.sdk.m.y.l;
import java.io.DataInputStream;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩵᩻᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: C7CI */
/* JADX INFO: loaded from: classes5.dex */
public final class C20930 extends AbstractC1890 {

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public String f66969;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public int f66970;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public int f66971;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public String f66972;

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public AbstractC4280 f66973;

    public C20930(C0224 c0224) {
        super(c0224);
        this.f66973 = null;
        this.f66971 = -1;
        this.f66972 = l.b;
        this.f66969 = System.getProperty("line.separator");
        this.f67131 = EnumC10882.SIGNATURE;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int m47836() {
        return this.f66970;
    }

    @Override // l.AbstractC20997, l.InterfaceC16454
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo19009() {
        return !this.f67149;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47838(int i, DataInputStream dataInputStream) {
        if (i != 2) {
            if (this.f67152) {
                this.f6369.m32312().mo10582("{0}: Invalid attribute length #{1}", EnumC13127.f41976.m32609(), Integer.valueOf(i));
            } else {
                throw new C5474(this.f6369.m32312(), "{0}: Invalid attribute length #{1}", EnumC13127.f41976.m32609(), Integer.valueOf(i));
            }
        }
        this.f66970 = dataInputStream.readUnsignedShort();
    }

    public final String toString() {
        return String.format("signature[%d]=%s", Integer.valueOf(this.f66970), this.f6371.m5644(this.f66970));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m47841() {
        if (this.f66973 == null) {
            this.f6369.getClass();
            this.f66973 = new C16958(this.f66970).m39939(this.f6371);
        }
        AbstractC4280 abstractC4280 = this.f66973;
        if (abstractC4280 != null) {
            return abstractC4280.toString().replace('/', '.');
        }
        return this.f6371.m5644(this.f66970);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC4280 m47840() {
        if (this.f66973 == null) {
            this.f6369.getClass();
            this.f66973 = new C16958(this.f66970).m39939(this.f6371);
        }
        return this.f66973;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m47843(int i) {
        this.f66971 = i;
    }

    @Override // l.AbstractC20997
    /* JADX INFO: renamed from: ᩻ */
    public final int mo46523() {
        int i = this.f66971;
        return i == -1 ? super.mo46523() : i;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m47842() {
        this.f66969 = "";
    }

    @Override // l.AbstractC20997
    /* JADX INFO: renamed from: ۨ */
    public final void mo5634() {
        m47997(m47996(mo46523(), this.f67131.m27630()));
        String strM5644 = this.f6371.m5644(this.f66970);
        if (this.f67132) {
            if (this.f67146) {
                m48009(String.format("#%d%s", Integer.valueOf(this.f66970), this.f66972).concat(this.f66969));
                return;
            } else {
                this.f67151.mo3879(m47996(m47999(), String.format("#%d%s", Integer.valueOf(this.f66970), this.f66972)));
                m48009(" // ".concat(strM5644).concat(this.f66969));
                return;
            }
        }
        m48009(strM5644.concat(this.f66972).concat(this.f66969));
    }

    @Override // l.AbstractC20997
    /* JADX INFO: renamed from: ᩹ */
    public final void mo5641() {
        m47997(m47996(mo46523(), EnumC10882.SIGNATURE.m27632()));
        String strM5644 = this.f6371.m5644(this.f66970);
        if (this.f67132) {
            if (this.f67146) {
                m48009(String.format("#%d%s", Integer.valueOf(this.f66970), this.f66972).concat(this.f66969));
                return;
            } else {
                this.f67151.mo3879(m47996(m47999(), String.format("#%d%s", Integer.valueOf(this.f66970), this.f66972)));
                m48009(" // ".concat(strM5644).concat(this.f66969));
                return;
            }
        }
        m48009(strM5644.concat(this.f66972).concat(this.f66969));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18941 m47837(Function function) {
        String str;
        if (this.f67155) {
            return new C18941("", "");
        }
        String str2 = String.format(":#%d", Integer.valueOf(this.f66970));
        if (((Boolean) function.apply(Integer.valueOf(this.f66970))).booleanValue()) {
            str = ":" + this.f6371.m5644(this.f66970);
        } else {
            str = String.format(":?%d Invalid constant_pool index", Integer.valueOf(this.f66970));
        }
        return new C18941(str2, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47839(boolean z) {
        this.f66972 = z ? l.b : ",";
    }
}
