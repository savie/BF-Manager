package l;

import java.io.DataInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.᩶ۜۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: D7CN */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21136 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f67514;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f67516;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f67513 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f67515 = 1;

    public AbstractC21136(DataInputStream dataInputStream) throws IOException {
        byte[] bArr = new byte[dataInputStream.available()];
        dataInputStream.read(bArr);
        this.f67516 = new String(bArr, StandardCharsets.UTF_8);
        dataInputStream.close();
    }
}
