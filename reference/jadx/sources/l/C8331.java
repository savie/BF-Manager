package l;

import android.os.Bundle;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.۠ᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6TQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8331 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TreeMap f28859;

    public C8331(TreeMap treeMap) throws IOException {
        this.f28859 = treeMap;
        if (!(treeMap.get("filePath") instanceof String)) {
            throw new IOException("Legacy config has no source path");
        }
        if (treeMap.containsKey("pageMode") && !(treeMap.get("pageMode") instanceof Boolean)) {
            throw new IOException("Invalid legacy page mode");
        }
        if (m21761()) {
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
    public static C8331 m21755(int i, Bundle bundle) throws IOException {
        TreeMap treeMap = new TreeMap();
        try {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (str == null || (obj != null && !(obj instanceof String) && !(obj instanceof Boolean) && !(obj instanceof Integer) && !(obj instanceof Long))) {
                    throw new IOException("Unsupported legacy config value type");
                }
                treeMap.put(str, obj);
            }
            C8331 c8331 = new C8331(treeMap);
            c8331.m21756(i);
            return c8331;
        } catch (RuntimeException e) {
            throw new IOException("Invalid legacy fragment values", e);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m21761() {
        return Boolean.TRUE.equals(this.f28859.get("pageMode"));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m21757() {
        if (m21761()) {
            return ((Integer) this.f28859.get("pageCount")).intValue();
        }
        return 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m21758() {
        if (m21761()) {
            return ((Integer) this.f28859.get("currentPageIndex")).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Bundle m21760() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f28859.entrySet()) {
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
    public final byte[] m21759(int i) {
        C11018 c11018 = new C11018(m21756(i));
        c11018.writeInt(1295140419);
        c11018.writeInt(1);
        TreeMap treeMap = this.f28859;
        c11018.writeInt(treeMap.size());
        for (Map.Entry entry : treeMap.entrySet()) {
            String str = (String) entry.getKey();
            c11018.writeInt(str.length());
            for (int i2 = 0; i2 < str.length(); i2++) {
                c11018.mo24508(str.charAt(i2));
            }
            Object value = entry.getValue();
            if (value == null) {
                c11018.writeByte(0);
            } else if (!(value instanceof String)) {
                if (value instanceof Boolean) {
                    c11018.writeByte(2);
                    c11018.m27784(((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    c11018.writeByte(3);
                    c11018.writeInt(((Integer) value).intValue());
                } else {
                    c11018.writeByte(4);
                    c11018.m27791(((Long) value).longValue());
                }
            } else {
                String str2 = (String) value;
                c11018.writeByte(1);
                c11018.writeInt(str2.length());
                for (int i3 = 0; i3 < str2.length(); i3++) {
                    c11018.mo24508(str2.charAt(i3));
                }
            }
        }
        return c11018.m27773();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8331 m21754(int i, long j, InputStream inputStream) throws IOException {
        Object objM3264;
        C0757 c0757M3260 = C0757.m3260(j, inputStream);
        try {
            if (i < 0 || j > i) {
                throw new IOException("Fragment config exceeds app state limit");
            }
            if (c0757M3260.readInt() != 1295140419 || c0757M3260.readInt() != 1) {
                throw new IOException("Unsupported fragment config format");
            }
            int i2 = c0757M3260.readInt();
            if (i2 < 0 || i2 > c0757M3260.m3268() / 5) {
                throw new IOException("Invalid fragment config entry count");
            }
            TreeMap treeMap = new TreeMap();
            for (int i3 = 0; i3 < i2; i3++) {
                String strM3264 = c0757M3260.m3264(i);
                if (treeMap.containsKey(strM3264)) {
                    throw new IOException("Duplicate fragment config key");
                }
                int i4 = c0757M3260.readByte();
                if (i4 == 0) {
                    objM3264 = null;
                } else if (i4 == 1) {
                    objM3264 = c0757M3260.m3264(i);
                } else if (i4 == 2) {
                    int i5 = c0757M3260.readByte();
                    if (i5 != 0 && i5 != 255) {
                        throw new IOException("Invalid fragment config boolean");
                    }
                    objM3264 = Boolean.valueOf(i5 != 0);
                } else if (i4 == 3) {
                    objM3264 = Integer.valueOf(c0757M3260.readInt());
                } else if (i4 == 4) {
                    objM3264 = Long.valueOf(c0757M3260.readLong());
                } else {
                    throw new IOException("Unsupported fragment config value");
                }
                treeMap.put(strM3264, objM3264);
            }
            c0757M3260.m3263();
            C8331 c8331 = new C8331(treeMap);
            c0757M3260.close();
            return c8331;
        } catch (Throwable th) {
            try {
                c0757M3260.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m21756(int i) throws IOException {
        long j;
        long jM19505 = 12;
        for (Map.Entry entry : this.f28859.entrySet()) {
            long jM19506 = C7309.m19505(((String) entry.getKey()).length(), 2L, 5L, jM19505);
            Object value = entry.getValue();
            if (value instanceof String) {
                jM19505 = C7309.m19505(((String) value).length(), 2L, 4L, jM19506);
            } else {
                if (!(value instanceof Boolean)) {
                    if (value instanceof Integer) {
                        jM19506 += 4;
                    } else {
                        j = value instanceof Long ? 8L : 1L;
                    }
                    jM19505 = jM19506;
                }
                jM19506 += j;
                jM19505 = jM19506;
            }
            if (jM19505 > i) {
                throw new IOException("Fragment config exceeds app state limit");
            }
        }
        if (jM19505 <= i) {
            return (int) jM19505;
        }
        throw new IOException("Fragment config exceeds app state limit");
    }
}
