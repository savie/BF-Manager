package l;

import java.io.DataInputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨۚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7CR */
/* JADX INFO: loaded from: classes4.dex */
public final class C11495 extends AbstractC14504 {

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f38665;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f38666;

    public C11495(C5061 c5061, boolean z) {
        super(c5061);
        this.f38665 = null;
        this.f38666 = z;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int m28684() {
        ArrayList arrayList = this.f38665;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final ArrayList get(int i) {
        return (ArrayList) this.f38665.get(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m28683(DataInputStream dataInputStream) {
        byte b = dataInputStream.readByte();
        this.f47519.m2146("ParameterAnnotationData[%d]:", Integer.valueOf(b));
        this.f38665 = new ArrayList(b);
        for (int i = 0; i < b; i++) {
            short s = dataInputStream.readShort();
            this.f47519.m2146(" Param#[%d]: numAnnotations= %d", Integer.valueOf(i), Integer.valueOf(s));
            if (s > 0) {
                ArrayList arrayList = new ArrayList(s);
                for (int i2 = 0; i2 < s; i2++) {
                    C12885 c12885 = new C12885(this.f47511, this.f38666);
                    c12885.mo9027(dataInputStream);
                    arrayList.add(c12885);
                }
                this.f38665.add(i, arrayList);
            } else {
                this.f38665.add(i, null);
            }
        }
    }
}
