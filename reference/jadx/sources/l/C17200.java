package l;

import java.io.DataInputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܺ᩻᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: J7CR */
/* JADX INFO: loaded from: classes5.dex */
public final class C17200 extends AbstractC1890 {

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f56028;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f56029;

    public C17200(C3381 c3381, boolean z) {
        super(c3381);
        this.f56029 = null;
        this.f56028 = z;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int m40364() {
        ArrayList arrayList = this.f56029;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final ArrayList get(int i) {
        return (ArrayList) this.f56029.get(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m40365(DataInputStream dataInputStream) {
        byte b = dataInputStream.readByte();
        this.f6369.m32315("ParameterAnnotationData[%d]:", Integer.valueOf(b));
        this.f56029 = new ArrayList(b);
        for (int i = 0; i < b; i++) {
            short s = dataInputStream.readShort();
            this.f6369.m32315(" Param#[%d]: numAnnotations= %d", Integer.valueOf(i), Integer.valueOf(s));
            if (s > 0) {
                ArrayList arrayList = new ArrayList(s);
                for (int i2 = 0; i2 < s; i2++) {
                    C0442 c0442 = new C0442(this.f6363, this.f56028);
                    c0442.mo2258(dataInputStream);
                    arrayList.add(c0442);
                }
                this.f56029.add(i, arrayList);
            } else {
                this.f56029.add(i, null);
            }
        }
    }
}
