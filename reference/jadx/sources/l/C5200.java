package l;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۙ᩸᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: L19N */
/* JADX INFO: loaded from: classes2.dex */
public final class C5200 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C4849 f18139;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public HashMap f18140 = new HashMap();

    public C5200(byte[] bArr) {
        C22003 c22003 = new C22003(bArr);
        this.f18139 = c22003.m49739();
        ArrayList<C4849> arrayList = new ArrayList();
        while (true) {
            C4849 c4849M49739 = c22003.m49739();
            if (c4849M49739 == null) {
                break;
            } else {
                arrayList.add(c4849M49739);
            }
        }
        for (C4849 c4849 : arrayList) {
            this.f18140.put(c4849.m14891(), c4849);
        }
    }
}
