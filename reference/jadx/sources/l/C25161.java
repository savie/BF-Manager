package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ܺ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U8JQ */
/* JADX INFO: loaded from: classes.dex */
public final class C25161 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f81352;

    public C25161(ArrayList arrayList) {
        this.f81352 = C4681.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C25161 m56081(C21287 c21287) {
        c21287.m48485();
        boolean z = (c21287.m48493() & 128) != 0;
        ArrayList arrayList = new ArrayList();
        if (!z) {
            int iM48493 = c21287.m48493();
            boolean z2 = (iM48493 & 64) != 0;
            boolean z3 = (iM48493 & 32) != 0;
            if (z2) {
                c21287.m48485();
            }
            if (!z2) {
                int iM48494 = c21287.m48493();
                arrayList = new ArrayList(iM48494);
                for (int i = 0; i < iM48494; i++) {
                    c21287.m48493();
                    c21287.m48485();
                    arrayList.add(new C11734());
                }
            }
            if (z3) {
                c21287.m48493();
                c21287.m48485();
            }
            c21287.m48494();
            c21287.m48493();
            c21287.m48493();
        }
        return new C25161(arrayList);
    }
}
