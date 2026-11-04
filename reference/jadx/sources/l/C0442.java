package l;

import com.alipay.sdk.m.y.l;
import java.io.DataInputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֡۫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R7DV */
/* JADX INFO: loaded from: classes3.dex */
public class C0442 extends AbstractC1890 {

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f2008 = 0;

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public String f2009;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f2010;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public int f2011;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f2012;

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public String f2013;

    public C0442(AbstractC1890 abstractC1890, boolean z) {
        super(abstractC1890);
        this.f2013 = "@+";
        this.f2009 = "@-";
        this.f2012 = new ArrayList();
        this.f2011 = 0;
        this.f2010 = z;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void mo2258(DataInputStream dataInputStream) {
        this.f2011 = dataInputStream.readShort();
        short s = dataInputStream.readShort();
        for (int i = 0; i < s; i++) {
            C21853 c21853 = new C21853(this.f6363);
            c21853.f69619 = null;
            c21853.f69620 = dataInputStream.readShort();
            c21853.f69619 = C21853.m49515(dataInputStream, c21853.f6363, this.f2010);
            c21853.f6369.m32315("AnnotationElement: cpIndex#%d=%s value=%s", Integer.valueOf(c21853.f69620), c21853.f6371.m5640(c21853.f69620, new C0114(1)), c21853.f69619.toString());
            this.f2012.add(c21853);
        }
    }

    @Override // l.AbstractC20997, l.InterfaceC16454
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1688() {
        String strM34865;
        String strM5640 = this.f6371.m5640(this.f2011, new C9746(5));
        if (this.f67132) {
            StringBuilder sb = new StringBuilder("#");
            sb.append(this.f2011);
            sb.append((strM5640 == null || this.f67146) ? "" : C14442.m34865(" /* ", strM5640, " */"));
            strM34865 = sb.toString();
        } else if (strM5640 == null) {
            strM34865 = "#" + this.f2011;
        } else {
            strM34865 = C14442.m34865("\"", strM5640, "\"");
        }
        int i = C18341.f59810[m6504().ordinal()];
        boolean z = this.f2010;
        if (i == 1) {
            m48006(" default { ");
            m47997(z ? this.f2009 : this.f2013);
            m48009(strM34865);
            this.f67148 = this.f67148;
        } else if (i == 2 || i == 3) {
            this.f67151.mo3879(z ? this.f2009 : this.f2013);
            m48009(strM34865);
        } else {
            m47997(z ? this.f2009 : this.f2013);
            m48009(strM34865);
        }
        mo2257();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m2256() {
        ArrayList<C21853> arrayList = this.f2012;
        int i = 0;
        for (C21853 c21853 : arrayList) {
            c21853.f67148 = this.f67148;
            c21853.m47994(this);
            c21853.m48012(1);
            c21853.mo1688();
            int i2 = i + 1;
            m48006(i < arrayList.size() - 1 ? "," : "");
            i = i2;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C22121.m50078(sb, this.f2010 ? this.f2009 : this.f2013, this.f6371.m5640(this.f2011, new C14611(0)), "{");
        return C8947.m23910(sb, (String) C1170.stream(this.f2012).map(new C21325(0)).collect(C2025.joining(",")), l.d);
    }

    public final boolean isEmpty() {
        return this.f2012.isEmpty();
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public void mo2257() {
        ArrayList<C21853> arrayList = this.f2012;
        if (arrayList.isEmpty()) {
            m48009(" { }");
            return;
        }
        int i = C18341.f59810[m6504().ordinal()];
        if (i != 1) {
            if (i != 3) {
                m48006(" {");
                m2256();
                m47997(l.d);
                return;
            } else {
                m48012(1);
                m48013("{");
                m2256();
                m47997(l.d);
                m48008(1);
                return;
            }
        }
        m48006(" {");
        int i2 = this.f67148;
        for (C21853 c21853 : arrayList) {
            m48009(m48011(i2, ""));
            c21853.mo6502(EnumC5619.RIGHT_OPERAND);
            c21853.mo1688();
        }
        m47989();
        m48008(1);
        m47997(l.d);
    }
}
