package l;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩵ۚܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: GAQ7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20354 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f65288;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public synchronized ArrayList m46770() {
        ArrayList arrayList;
        arrayList = (ArrayList) ((C20528) this.f65288).m47061();
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public synchronized void m46771(ArrayList arrayList) {
        if (arrayList.size() < 4096 && ((C20528) this.f65288).m47059()) {
            arrayList.clear();
            ((C20528) this.f65288).m47060(arrayList);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m46772(C4313 c4313) {
        Class clsM13803 = c4313.m13803();
        HashMap map = (HashMap) this.f65288;
        C4313 c4314 = (C4313) map.get(clsM13803);
        if (c4314 == null) {
            map.put(c4313.m13803(), c4313);
        } else {
            c4314.m13806(c4313);
        }
    }

    public C20354(int i) {
        switch (i) {
            case 1:
                this.f65288 = new HashMap();
                break;
            default:
                this.f65288 = new C20528();
                break;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object m46769(String str) {
        C4313 c4313 = (C4313) ((HashMap) this.f65288).get(C8787.class);
        if (c4313 == null) {
            return null;
        }
        return c4313.m13804(str);
    }
}
