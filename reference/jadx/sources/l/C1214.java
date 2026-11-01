package l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.֨ܺۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X72G */
/* JADX INFO: loaded from: classes2.dex */
public final class C1214 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f5343 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f5344 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4406(C1214 c1214, Uri uri) {
        if (uri == null) {
            c1214.m4409("exo_redir");
        } else {
            c1214.m4404((Object) uri.toString(), "exo_redir");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4410(String str, String str2) {
        m4404((Object) str2, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4405(C1214 c1214, long j) {
        c1214.m4404(Long.valueOf(j), "exo_len");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4408(long j, String str) {
        m4404(Long.valueOf(j), str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4409(String str) {
        this.f5344.add(str);
        this.f5343.remove(str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List m4411() {
        return C0561.unmodifiableList(new ArrayList(this.f5344));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Map m4407() {
        HashMap map = new HashMap(this.f5343);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return C0561.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m4404(Object obj, String str) {
        obj.getClass();
        this.f5343.put(str, obj);
        this.f5344.remove(str);
    }
}
