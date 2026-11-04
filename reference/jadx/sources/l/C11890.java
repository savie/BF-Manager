package l;

import android.os.Bundle;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۧ᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C11890 implements Serializable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f38310;

    public C11890(Bundle bundle) {
        this.f38310 = new HashMap();
        for (String str : bundle.keySet()) {
            this.f38310.put(str, bundle.getString(str));
        }
    }

    public C11890(HashMap map) {
        this.f38310 = new HashMap(map);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseData{time=");
        HashMap map = this.f38310;
        sb.append((String) map.get("time"));
        sb.append(", name=");
        sb.append((String) map.get("interface_name"));
        sb.append('}');
        return sb.toString();
    }
}
