package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import com.github.luben.zstd.Zstd;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ܿۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: O6WV */
/* JADX INFO: loaded from: classes4.dex */
public final class C18121 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static volatile byte[] f59285;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m42239(AbstractC22044 abstractC22044) {
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876("format.json.tmp");
        AbstractC22044 abstractC22044M49877 = abstractC22044.m49876("format.json");
        if (!abstractC22044M49876.mo2934() && abstractC22044M49877.mo2934()) {
            try {
                JSONObject jSONObject = new JSONObject(new String(abstractC22044M49877.m49865(), StandardCharsets.UTF_8));
                if (jSONObject.getInt("version", -1) == 1 && "zstd".equals(jSONObject.getString("codec", null)) && jSONObject.getBoolean("checksum", false) && jSONObject.getBoolean("contentSize", false) && jSONObject.getLong("dictionaryId", -1L) == 1773473561 && "38ad0b3d930d8640ff96107546386f4e11da0ffba3e8bf7b641bd3c99ff02351".equals(jSONObject.getString("dictionarySha256", null))) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m42242(AbstractC22044 abstractC22044) throws IOException {
        m42243();
        abstractC22044.m49853();
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876("format.json.tmp");
        AbstractC22044 abstractC22044M49877 = abstractC22044.m49876("format.json");
        if (abstractC22044M49876.mo2934() && !abstractC22044M49876.mo4296()) {
            throw new IOException("Unable to delete stale smali cache format temp file");
        }
        abstractC22044M49876.m49849(JSON.object().add("version", 1).add("codec", "zstd").add("checksum", true).add("contentSize", true).add("dictionaryId", 1773473561L).add("dictionarySha256", "38ad0b3d930d8640ff96107546386f4e11da0ffba3e8bf7b641bd3c99ff02351").toString().getBytes(StandardCharsets.UTF_8));
        if (abstractC22044M49877.mo2934() && !abstractC22044M49877.mo4296()) {
            throw new IOException("Unable to replace smali cache format file");
        }
        if (!abstractC22044M49876.mo4301(abstractC22044M49877)) {
            throw new IOException("Unable to publish smali cache format file");
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static byte[] m42243() {
        byte[] bArr = f59285;
        if (bArr != null) {
            return bArr;
        }
        synchronized (C18121.class) {
            byte[] bArr2 = f59285;
            if (bArr2 != null) {
                return bArr2;
            }
            byte[] bArr3 = new byte[32768];
            try {
                InputStream inputStreamOpen = C21576.m49086().open("9");
                int i = 0;
                while (i < 32768) {
                    try {
                        int i2 = inputStreamOpen.read(bArr3, i, 32768 - i);
                        if (i2 < 0) {
                            throw new IOException("Smali cache dictionary is truncated");
                        }
                        if (i2 == 0) {
                            int i3 = inputStreamOpen.read();
                            if (i3 < 0) {
                                throw new IOException("Smali cache dictionary is truncated");
                            }
                            bArr3[i] = (byte) i3;
                            i++;
                        } else {
                            i += i2;
                        }
                    } catch (Throwable th) {
                        if (inputStreamOpen != null) {
                            try {
                                inputStreamOpen.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                if (inputStreamOpen.read() != -1) {
                    throw new IOException("Smali cache dictionary length is invalid");
                }
                inputStreamOpen.close();
                if (!"38ad0b3d930d8640ff96107546386f4e11da0ffba3e8bf7b641bd3c99ff02351".equals(C15022.m36182(C15022.m36179().digest(bArr3))) || Zstd.getDictIdFromDict(bArr3) != 1773473561) {
                    throw new IOException("Smali cache dictionary identity is invalid");
                }
                f59285 = bArr3;
                return bArr3;
            } catch (RuntimeException e) {
                throw new IOException("Unable to open smali cache dictionary", e);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m42237(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        if (i < 0 || i > 1048576) {
            throw new IOException("Invalid smali record name length");
        }
        byte[] bArr = new byte[i];
        dataInputStream.readFully(bArr);
        return new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42238(OutputStream outputStream, int i) throws IOException {
        outputStream.write((i >>> 24) & 255);
        outputStream.write((i >>> 16) & 255);
        outputStream.write((i >>> 8) & 255);
        outputStream.write(i & 255);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m42241(OutputStream outputStream, int i) throws IOException {
        outputStream.write((i >>> 8) & 255);
        outputStream.write(i & 255);
    }
}
