package l;

import com.alipay.sdk.m.y.l;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨ۚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7FD */
/* JADX INFO: loaded from: classes3.dex */
public final class C0910 extends AbstractC14504 {

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f3641;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m3629(DataInputStream dataInputStream) throws IOException {
        int unsignedShort = dataInputStream.readUnsignedShort();
        this.f47519.m2146(C8479.m22141(unsignedShort, "components="), new Object[0]);
        this.f3641 = new ArrayList(unsignedShort);
        for (int i = 0; i < unsignedShort; i++) {
            ArrayList arrayList = this.f3641;
            C22078 c22078 = new C22078((C3980) this.f47511);
            c22078.f47507 = "RecordData";
            c22078.m49023(dataInputStream);
            arrayList.add(c22078);
        }
    }

    @Override // l.AbstractC6741, l.InterfaceC5144
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo3628() {
        int size = this.f3641.size();
        if (size > 0) {
            boolean zM25300 = this.f22696.m25300();
            m18209(EnumC20934.f68101.m47084() + " {");
            for (int i = 0; i < size; i++) {
                C22078 c22078 = (C22078) this.f3641.get(i);
                c22078.f22686 = m18233() + this.f22686;
                c22078.m18208(1);
                if (!zM25300 || !mo18231()) {
                    c22078.mo14102(i, size);
                } else {
                    c22078.mo14102(i, size);
                }
            }
            m18209(l.d);
        }
    }
}
