package l;

import java.io.DataInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.᩹ܿۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: D7CN */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22428 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f73191;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f73193;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f73192 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f73194 = 1;

    public AbstractC22428(DataInputStream dataInputStream) throws IOException {
        byte[] bArr = new byte[dataInputStream.available()];
        dataInputStream.read(bArr);
        this.f73191 = new String(bArr, StandardCharsets.UTF_8);
        dataInputStream.close();
    }
}
