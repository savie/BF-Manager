package l;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩹ۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: L19N */
/* JADX INFO: loaded from: classes.dex */
public final class C21987 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13790 f71309;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public HashMap f71310 = new HashMap();

    public C21987(byte[] bArr) {
        C11673 c11673 = new C11673(bArr);
        this.f71309 = c11673.m29131();
        ArrayList<C13790> arrayList = new ArrayList();
        while (true) {
            C13790 c13790M29131 = c11673.m29131();
            if (c13790M29131 == null) {
                break;
            } else {
                arrayList.add(c13790M29131);
            }
        }
        for (C13790 c13790 : arrayList) {
            this.f71310.put(c13790.m33547(), c13790);
        }
    }
}
