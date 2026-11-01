package l;

import com.alipay.sdk.m.y.l;
import java.io.DataInputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۬ۙۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7DV */
/* JADX INFO: loaded from: classes4.dex */
public class C12885 extends AbstractC14504 {

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f42846 = 0;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f42847;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public String f42848;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public int f42849;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f42850;

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public String f42851;

    public C12885(AbstractC14504 abstractC14504, boolean z) {
        super(abstractC14504);
        this.f42851 = "@+";
        this.f42848 = "@-";
        this.f42847 = new ArrayList();
        this.f42849 = 0;
        this.f42850 = z;
    }

    /* JADX INFO: renamed from: ܰ */
    public void mo9027(DataInputStream dataInputStream) {
        this.f42849 = dataInputStream.readShort();
        short s = dataInputStream.readShort();
        for (int i = 0; i < s; i++) {
            C7240 c7240 = new C7240(this.f47511);
            c7240.f24126 = null;
            c7240.f24125 = dataInputStream.readShort();
            c7240.f24126 = C7240.m19353(dataInputStream, c7240.f47511, this.f42850);
            c7240.f47519.m2146("AnnotationElement: cpIndex#%d=%s value=%s", Integer.valueOf(c7240.f24125), c7240.f47512.m27826(c7240.f24125, new C19929(5)), c7240.f24126.toString());
            this.f42847.add(c7240);
        }
    }

    @Override // l.AbstractC6741, l.InterfaceC5144
    /* JADX INFO: renamed from: ܰ */
    public final void mo3628() {
        String strM38890;
        String strM27826 = this.f47512.m27826(this.f42849, new C7710(4));
        if (this.f22692) {
            StringBuilder sb = new StringBuilder("#");
            sb.append(this.f42849);
            sb.append((strM27826 == null || this.f22704) ? "" : C16523.m38890(" /* ", strM27826, " */"));
            strM38890 = sb.toString();
        } else if (strM27826 == null) {
            strM38890 = "#" + this.f42849;
        } else {
            strM38890 = C16523.m38890("\"", strM27826, "\"");
        }
        int i = C0889.f3591[m34921().ordinal()];
        boolean z = this.f42850;
        if (i == 1) {
            m18219(" default { ");
            m18223(z ? this.f42848 : this.f42851);
            m18228(strM38890);
            this.f22686 = this.f22686;
        } else if (i == 2 || i == 3) {
            this.f22710.mo18524(z ? this.f42848 : this.f42851);
            m18228(strM38890);
        } else {
            m18223(z ? this.f42848 : this.f42851);
            m18228(strM38890);
        }
        mo9028();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m31943() {
        ArrayList<C7240> arrayList = this.f42847;
        int i = 0;
        for (C7240 c7240 : arrayList) {
            c7240.f22686 = this.f22686;
            c7240.m18216(this);
            c7240.m18208(1);
            c7240.mo3628();
            int i2 = i + 1;
            m18219(i < arrayList.size() - 1 ? "," : "");
            i = i2;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C0219.m1594(sb, this.f42850 ? this.f42848 : this.f42851, this.f47512.m27826(this.f42849, new C22057(0)), "{");
        return C22697.m50267(sb, (String) C9030.stream(this.f42847).map(new C16177(3)).collect(C1890.joining(",")), l.d);
    }

    public final boolean isEmpty() {
        return this.f42847.isEmpty();
    }

    /* JADX INFO: renamed from: ᩶ */
    public void mo9028() {
        ArrayList<C7240> arrayList = this.f42847;
        if (arrayList.isEmpty()) {
            m18228(" { }");
            return;
        }
        int i = C0889.f3591[m34921().ordinal()];
        if (i != 1) {
            if (i != 3) {
                m18219(" {");
                m31943();
                m18223(l.d);
                return;
            } else {
                m18208(1);
                m18209("{");
                m31943();
                m18223(l.d);
                m18227(1);
                return;
            }
        }
        m18219(" {");
        int i2 = this.f22686;
        for (C7240 c7240 : arrayList) {
            m18228(m18207(i2, ""));
            c7240.mo34919(EnumC23676.RIGHT_OPERAND);
            c7240.mo3628();
        }
        m18221();
        m18227(1);
        m18223(l.d);
    }
}
