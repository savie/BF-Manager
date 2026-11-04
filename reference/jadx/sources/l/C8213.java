package l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.۟᩺ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8NJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C8213 extends C18654 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Map f27041;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Uri f27042;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f27043;

    public C8213(int i, C5976 c5976, Map map, byte[] bArr, Uri uri) throws CloneNotSupportedException {
        super(2004, c5976, C13645.m33382(i, "Response code: "));
        this.f27043 = i;
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            map2.put((String) entry.getKey(), list == null ? Collections.EMPTY_LIST : C4681.unmodifiableList(new ArrayList(list)));
        }
        this.f27041 = C4681.unmodifiableMap(map2);
        bArr.clone();
        this.f27042 = uri;
    }
}
