package l;

import android.os.Bundle;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֫᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class C2076 implements Serializable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final HashMap f7679;

    public C2076(Bundle bundle) {
        this.f7679 = new HashMap();
        for (String str : bundle.keySet()) {
            this.f7679.put(str, bundle.getString(str));
        }
    }

    public C2076(HashMap map) {
        this.f7679 = new HashMap(map);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseData{time=");
        HashMap map = this.f7679;
        sb.append((String) map.get("time"));
        sb.append(", name=");
        sb.append((String) map.get("interface_name"));
        sb.append('}');
        return sb.toString();
    }
}
