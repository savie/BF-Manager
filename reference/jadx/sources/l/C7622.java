package l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.۟ۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X72G */
/* JADX INFO: loaded from: classes3.dex */
public final class C7622 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f25157 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f25158 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20819(C7622 c7622, Uri uri) {
        if (uri == null) {
            c7622.m20822("exo_redir");
        } else {
            c7622.m20817((Object) uri.toString(), "exo_redir");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20823(String str, String str2) {
        m20817((Object) str2, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20818(C7622 c7622, long j) {
        c7622.m20817(Long.valueOf(j), "exo_len");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20821(long j, String str) {
        m20817(Long.valueOf(j), str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20822(String str) {
        this.f25158.add(str);
        this.f25157.remove(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m20824() {
        return C4681.unmodifiableList(new ArrayList(this.f25158));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Map m20820() {
        HashMap map = new HashMap(this.f25157);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return C4681.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m20817(Object obj, String str) {
        obj.getClass();
        this.f25157.put(str, obj);
        this.f25158.remove(str);
    }
}
