package l;

import com.alipay.sdk.m.y.l;
import java.io.DataInputStream;

/* JADX INFO: renamed from: l.᩹ۚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7FD */
/* JADX INFO: loaded from: classes2.dex */
public final class C22078 extends AbstractC14504 {

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f71527 = 0;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public int f71528;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public int f71529;

    @Override // l.AbstractC14504
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo11477(DataInputStream dataInputStream, EnumC16783 enumC16783, int i) {
        if (enumC16783 != EnumC16783.f53727) {
            return false;
        }
        if (this.f47505 != null) {
            this.f47519.mo2157("There is more than one \"{0}\" attribute in the attributes table of a \"{1}\" structure. The last one is used.", "Signature", "record_component_info");
        }
        C12906 c12906 = new C12906((C3980) this.f47511);
        c12906.m31978(i, dataInputStream);
        this.f47505 = c12906;
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m49023(DataInputStream dataInputStream) {
        this.f71529 = dataInputStream.readUnsignedShort();
        this.f71528 = dataInputStream.readUnsignedShort();
        this.f47519.m2146(String.format("RecordComponent: name[%d]=%s descriptor[%d]=%s", Integer.valueOf(this.f71529), ((C3980) this.f47511).f47512.m27826(this.f71529, new C19839(3)), Integer.valueOf(this.f71528), ((C3980) this.f47511).f47512.m27826(this.f71528, new C19839(3))), new Object[0]);
        m34917(dataInputStream);
    }

    @Override // l.AbstractC6741
    /* JADX INFO: renamed from: ܰ */
    public final void mo14102(int i, int i2) {
        C12906 c12906 = this.f47505;
        boolean z = (c12906 == null || c12906.f22707 || !this.f22709) ? false : true;
        mo11476(this.f47508, this.f47515);
        mo11476(this.f47518, this.f47504);
        int iM18233 = ((m18233() * 2) + mo14807()) - 2;
        m34918(new StringBuilder(m18222(iM18233, m18213(m34922()).concat(EnumC20934.f68033.m47084()))), null, z ? ":" : l.b, this.f71529, this.f71528, -1);
        if (z) {
            int iM18234 = iM18233 - (m18233() + 2);
            C12906 c12907 = this.f47505;
            c12907.m31984(iM18234);
            c12907.m18208(1);
            c12907.m18208(1);
            c12907.f22686 = (this.f22686 - (m18205() * 2)) - 2;
            this.f47505.mo3628();
        }
    }

    @Override // l.AbstractC6741
    /* JADX INFO: renamed from: ۖ */
    public final void mo14101(int i, int i2) {
        mo14102(i, i2);
    }
}
