package l;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.۬ܺۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 874P */
/* JADX INFO: loaded from: classes4.dex */
public final class C13210 implements InterfaceC22382 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C13210 f43962 = new C13210(Collections.EMPTY_MAP);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f43963;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Map f43964;

    public C13210() {
        this(Collections.EMPTY_MAP);
    }

    public C13210(Map map) {
        this.f43964 = C0561.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set m32696() {
        return this.f43964.entrySet();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m32699(String str) {
        byte[] bArr = (byte[]) this.f43964.get(str);
        if (bArr != null) {
            return new String(bArr, StandardCharsets.UTF_8);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m32695(long j, String str) {
        byte[] bArr = (byte[]) this.f43964.get(str);
        return bArr != null ? ByteBuffer.wrap(bArr).getLong() : j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m32698(String str) {
        return this.f43964.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13210.class != obj.getClass()) {
            return false;
        }
        return m32694(this.f43964, ((C13210) obj).f43964);
    }

    public final int hashCode() {
        if (this.f43963 == 0) {
            int iHashCode = 0;
            for (Map.Entry entry : this.f43964.entrySet()) {
                iHashCode += Arrays.hashCode((byte[]) entry.getValue()) ^ ((String) entry.getKey()).hashCode();
            }
            this.f43963 = iHashCode;
        }
        return this.f43963;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m32694(Map map, Map map2) {
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
    public final C13210 m32697(C1214 c1214) {
        byte[] bytes;
        Map map = this.f43964;
        HashMap map2 = new HashMap(map);
        List listM4411 = c1214.m4411();
        for (int i = 0; i < listM4411.size(); i++) {
            map2.remove(listM4411.get(i));
        }
        for (Map.Entry entry : c1214.m4407().entrySet()) {
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
        return m32694(map, map2) ? this : new C13210(map2);
    }
}
