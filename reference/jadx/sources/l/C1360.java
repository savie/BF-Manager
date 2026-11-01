package l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.֨᩷ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8NJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C1360 extends C5594 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Uri f5707;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Map f5708;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f5709;

    public C1360(int i, C20018 c20018, Map map, byte[] bArr, Uri uri) throws CloneNotSupportedException {
        super(2004, c20018, C8479.m22141(i, "Response code: "));
        this.f5709 = i;
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            map2.put((String) entry.getKey(), list == null ? Collections.EMPTY_LIST : C0561.unmodifiableList(new ArrayList(list)));
        }
        this.f5708 = C0561.unmodifiableMap(map2);
        bArr.clone();
        this.f5707 = uri;
    }
}
