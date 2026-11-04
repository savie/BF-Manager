package l;

import com.alipay.sdk.m.y.l;
import java.io.DataInputStream;

/* JADX INFO: renamed from: l.᩹᩻᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: S7FD */
/* JADX INFO: loaded from: classes2.dex */
public final class C23914 extends AbstractC1890 {

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f77423 = 0;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public int f77424;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public int f77425;

    @Override // l.AbstractC1890
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1685(DataInputStream dataInputStream, EnumC13127 enumC13127, int i) {
        if (enumC13127 != EnumC13127.f41976) {
            return false;
        }
        if (this.f6377 != null) {
            this.f6369.mo4165("There is more than one \"{0}\" attribute in the attributes table of a \"{1}\" structure. The last one is used.", "Signature", "record_component_info");
        }
        C20930 c20930 = new C20930((C0224) this.f6363);
        c20930.m47838(i, dataInputStream);
        this.f6377 = c20930;
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m53415(DataInputStream dataInputStream) {
        this.f77424 = dataInputStream.readUnsignedShort();
        this.f77425 = dataInputStream.readUnsignedShort();
        this.f6369.m32315(String.format("RecordComponent: name[%d]=%s descriptor[%d]=%s", Integer.valueOf(this.f77424), ((C0224) this.f6363).f6371.m5640(this.f77424, new C8110(7)), Integer.valueOf(this.f77425), ((C0224) this.f6363).f6371.m5640(this.f77425, new C8110(7))), new Object[0]);
        m6500(dataInputStream);
    }

    @Override // l.AbstractC20997
    /* JADX INFO: renamed from: ᩷ */
    public final void mo11099(int i, int i2) {
        C20930 c20930 = this.f6377;
        boolean z = (c20930 == null || c20930.f67149 || !this.f67155) ? false : true;
        mo1684(this.f6375, this.f6364);
        mo1684(this.f6373, this.f6368);
        int iM48002 = ((m48002() * 2) + mo46523()) - 2;
        m6501(new StringBuilder(m47996(iM48002, m47991(m6505()).concat(EnumC5202.f18254.m15637()))), null, z ? ":" : l.b, this.f77424, this.f77425, -1);
        if (z) {
            int iM48003 = iM48002 - (m48002() + 2);
            C20930 c20931 = this.f6377;
            c20931.m47843(iM48003);
            c20931.m48012(1);
            c20931.m48012(1);
            c20931.f67148 = (this.f67148 - (m48000() * 2)) - 2;
            this.f6377.mo1688();
        }
    }

    @Override // l.AbstractC20997
    /* JADX INFO: renamed from: ᩸ */
    public final void mo11100(int i, int i2) {
        mo11099(i, i2);
    }
}
