package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB7S */
/* JADX INFO: loaded from: classes4.dex */
public final class C10019 implements InterfaceC14494 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f32137;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f32138;

    public C10019(boolean z, String str) {
        this.f32137 = z;
        this.f32138 = str;
    }

    @Override // l.InterfaceC14494
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4022(AbstractC14472 abstractC14472) {
        int i;
        boolean z = this.f32137;
        String strMo1286 = this.f32138;
        if (z && strMo1286 == null) {
            strMo1286 = abstractC14472.mo1286();
        }
        InterfaceC24170 interfaceC24170 = abstractC14472.f59447;
        if (interfaceC24170 != null) {
            Iterator it = interfaceC24170.getChildren().iterator();
            i = 0;
            while (it.hasNext()) {
                AbstractC14472 abstractC14473 = (AbstractC14472) ((C18202) it.next());
                if (strMo1286 == null || abstractC14473.mo1286().equals(strMo1286)) {
                    i++;
                }
            }
        } else {
            i = 1;
        }
        return i == 1;
    }

    public final String toString() {
        return this.f32137 ? C14442.m34865("only-of-type <", this.f32138, ">") : "only-child";
    }
}
