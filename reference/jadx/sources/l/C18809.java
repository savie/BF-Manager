package l;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩳۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 874P */
/* JADX INFO: loaded from: classes5.dex */
public final class C18809 implements InterfaceC0164 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C18809 f61123 = new C18809(Collections.EMPTY_MAP);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f61124;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Map f61125;

    public C18809() {
        this(Collections.EMPTY_MAP);
    }

    public C18809(Map map) {
        this.f61125 = C4681.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set m43651() {
        return this.f61125.entrySet();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m43654(String str) {
        byte[] bArr = (byte[]) this.f61125.get(str);
        if (bArr != null) {
            return new String(bArr, StandardCharsets.UTF_8);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m43650(long j, String str) {
        byte[] bArr = (byte[]) this.f61125.get(str);
        return bArr != null ? ByteBuffer.wrap(bArr).getLong() : j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m43653(String str) {
        return this.f61125.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18809.class != obj.getClass()) {
            return false;
        }
        return m43649(this.f61125, ((C18809) obj).f61125);
    }

    public final int hashCode() {
        if (this.f61124 == 0) {
            int iHashCode = 0;
            for (Map.Entry entry : this.f61125.entrySet()) {
                iHashCode += Arrays.hashCode((byte[]) entry.getValue()) ^ ((String) entry.getKey()).hashCode();
            }
            this.f61124 = iHashCode;
        }
        return this.f61124;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m43649(Map map, Map map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18809 m43652(C7622 c7622) {
        byte[] bytes;
        Map map = this.f61125;
        HashMap map2 = new HashMap(map);
        List listM20824 = c7622.m20824();
        for (int i = 0; i < listM20824.size(); i++) {
            map2.remove(listM20824.get(i));
        }
        for (Map.Entry entry : c7622.m20820().entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Long) {
                bytes = ByteBuffer.allocate(8).putLong(((Long) value).longValue()).array();
            } else if (value instanceof String) {
                bytes = ((String) value).getBytes(StandardCharsets.UTF_8);
            } else if (value instanceof byte[]) {
                bytes = (byte[]) value;
            } else {
                throw new IllegalArgumentException();
            }
            map2.put(str, bytes);
        }
        return m43649(map, map2) ? this : new C18809(map2);
    }
}
