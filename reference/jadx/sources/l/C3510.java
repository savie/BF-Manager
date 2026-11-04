package l;

import android.os.Bundle;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۗܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6TQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3510 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TreeMap f12088;

    public C3510(TreeMap treeMap) throws IOException {
        this.f12088 = treeMap;
        if (!(treeMap.get("filePath") instanceof String)) {
            throw new IOException("Legacy config has no source path");
        }
        if (treeMap.containsKey("pageMode") && !(treeMap.get("pageMode") instanceof Boolean)) {
            throw new IOException("Invalid legacy page mode");
        }
        if (m11510()) {
            Object obj = treeMap.get("pageCount");
            if (obj instanceof Integer) {
                Integer num = (Integer) obj;
                if (num.intValue() >= 1 && num.intValue() <= 1024) {
                    Object obj2 = treeMap.get("currentPageIndex");
                    if (obj2 instanceof Integer) {
                        Integer num2 = (Integer) obj2;
                        if (num2.intValue() >= 0 && num2.intValue() < num.intValue()) {
                            return;
                        }
                    }
                }
            }
            throw new IOException("Invalid legacy page manifest");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3510 m11505(int i, Bundle bundle) throws IOException {
        TreeMap treeMap = new TreeMap();
        try {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (str == null || (obj != null && !(obj instanceof String) && !(obj instanceof Boolean) && !(obj instanceof Integer) && !(obj instanceof Long))) {
                    throw new IOException("Unsupported legacy config value type");
                }
                treeMap.put(str, obj);
            }
            C3510 c3510 = new C3510(treeMap);
            c3510.m11506(i);
            return c3510;
        } catch (RuntimeException e) {
            throw new IOException("Invalid legacy fragment values", e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m11510() {
        return Boolean.TRUE.equals(this.f12088.get("pageMode"));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m11511() {
        if (m11510()) {
            return ((Integer) this.f12088.get("pageCount")).intValue();
        }
        return 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m11507() {
        if (m11510()) {
            return ((Integer) this.f12088.get("currentPageIndex")).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Bundle m11509() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f12088.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null || (value instanceof String)) {
                bundle.putString(str, (String) value);
            } else if (value instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) value).booleanValue());
            } else if (value instanceof Integer) {
                bundle.putInt(str, ((Integer) value).intValue());
            } else {
                bundle.putLong(str, ((Long) value).longValue());
            }
        }
        bundle.remove("pageMode");
        bundle.remove("pageCount");
        bundle.remove("currentPageIndex");
        return bundle;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m11508(int i) {
        C6178 c6178 = new C6178(m11506(i));
        c6178.writeInt(1295140419);
        c6178.writeInt(1);
        TreeMap treeMap = this.f12088;
        c6178.writeInt(treeMap.size());
        for (Map.Entry entry : treeMap.entrySet()) {
            String str = (String) entry.getKey();
            c6178.writeInt(str.length());
            for (int i2 = 0; i2 < str.length(); i2++) {
                c6178.mo17812(str.charAt(i2));
            }
            Object value = entry.getValue();
            if (value == null) {
                c6178.writeByte(0);
            } else if (!(value instanceof String)) {
                if (value instanceof Boolean) {
                    c6178.writeByte(2);
                    c6178.m17789(((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    c6178.writeByte(3);
                    c6178.writeInt(((Integer) value).intValue());
                } else {
                    c6178.writeByte(4);
                    c6178.m17803(((Long) value).longValue());
                }
            } else {
                String str2 = (String) value;
                c6178.writeByte(1);
                c6178.writeInt(str2.length());
                for (int i3 = 0; i3 < str2.length(); i3++) {
                    c6178.mo17812(str2.charAt(i3));
                }
            }
        }
        return c6178.m17796();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3510 m11504(int i, long j, InputStream inputStream) throws IOException {
        Object objM39093;
        C16475 c16475M39088 = C16475.m39088(j, inputStream);
        try {
            if (i < 0 || j > i) {
                throw new IOException("Fragment config exceeds app state limit");
            }
            if (c16475M39088.readInt() != 1295140419 || c16475M39088.readInt() != 1) {
                throw new IOException("Unsupported fragment config format");
            }
            int i2 = c16475M39088.readInt();
            if (i2 < 0 || i2 > c16475M39088.m39101() / 5) {
                throw new IOException("Invalid fragment config entry count");
            }
            TreeMap treeMap = new TreeMap();
            for (int i3 = 0; i3 < i2; i3++) {
                String strM39093 = c16475M39088.m39093(i);
                if (treeMap.containsKey(strM39093)) {
                    throw new IOException("Duplicate fragment config key");
                }
                int i4 = c16475M39088.readByte();
                if (i4 == 0) {
                    objM39093 = null;
                } else if (i4 == 1) {
                    objM39093 = c16475M39088.m39093(i);
                } else if (i4 == 2) {
                    int i5 = c16475M39088.readByte();
                    if (i5 != 0 && i5 != 255) {
                        throw new IOException("Invalid fragment config boolean");
                    }
                    objM39093 = Boolean.valueOf(i5 != 0);
                } else if (i4 == 3) {
                    objM39093 = Integer.valueOf(c16475M39088.readInt());
                } else if (i4 == 4) {
                    objM39093 = Long.valueOf(c16475M39088.readLong());
                } else {
                    throw new IOException("Unsupported fragment config value");
                }
                treeMap.put(strM39093, objM39093);
            }
            c16475M39088.m39099();
            C3510 c3510 = new C3510(treeMap);
            c16475M39088.close();
            return c3510;
        } catch (Throwable th) {
            try {
                c16475M39088.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m11506(int i) throws IOException {
        long j;
        long jM29929 = 12;
        for (Map.Entry entry : this.f12088.entrySet()) {
            long jM299210 = C11958.m29929(((String) entry.getKey()).length(), 2L, 5L, jM29929);
            Object value = entry.getValue();
            if (value instanceof String) {
                jM29929 = C11958.m29929(((String) value).length(), 2L, 4L, jM299210);
            } else {
                if (!(value instanceof Boolean)) {
                    if (value instanceof Integer) {
                        jM299210 += 4;
                    } else {
                        j = value instanceof Long ? 8L : 1L;
                    }
                    jM29929 = jM299210;
                }
                jM299210 += j;
                jM29929 = jM299210;
            }
            if (jM29929 > i) {
                throw new IOException("Fragment config exceeds app state limit");
            }
        }
        if (jM29929 <= i) {
            return (int) jM29929;
        }
        throw new IOException("Fragment config exceeds app state limit");
    }
}
