package l;

import com.alipay.sdk.m.y.l;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗ᩻᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: S7FD */
/* JADX INFO: loaded from: classes3.dex */
public final class C3776 extends AbstractC1890 {

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f12950;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m12253(DataInputStream dataInputStream) throws IOException {
        int unsignedShort = dataInputStream.readUnsignedShort();
        this.f6369.m32315(C13645.m33382(unsignedShort, "components="), new Object[0]);
        this.f12950 = new ArrayList(unsignedShort);
        for (int i = 0; i < unsignedShort; i++) {
            ArrayList arrayList = this.f12950;
            C23914 c23914 = new C23914((C0224) this.f6363);
            c23914.f6365 = "RecordData";
            c23914.m53415(dataInputStream);
            arrayList.add(c23914);
        }
    }

    @Override // l.AbstractC20997, l.InterfaceC16454
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1688() {
        int size = this.f12950.size();
        if (size > 0) {
            boolean zM27633 = this.f67131.m27633();
            m48013(EnumC5202.f18247.m15637() + " {");
            for (int i = 0; i < size; i++) {
                C23914 c23914 = (C23914) this.f12950.get(i);
                c23914.f67148 = m48002() + this.f67148;
                c23914.m48012(1);
                if (!zM27633 || !mo5637()) {
                    c23914.mo11099(i, size);
                } else {
                    c23914.mo11099(i, size);
                }
            }
            m48013(l.d);
        }
    }
}
