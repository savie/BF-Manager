package l;

import java.io.EOFException;
import org.bouncycastle.i18n.LocalizedMessage;

/* JADX INFO: renamed from: l.ܿۘܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: NAGW */
/* JADX INFO: loaded from: classes4.dex */
public final class C18071 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f59152;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] f59153;

    public C18071() {
        this.f59153 = new byte[4];
    }

    public C18071(int i) {
        this.f59153 = new byte[4];
        this.f59152 = 0L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m42103() {
        return this.f59152;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m42104(C21055 c21055) throws EOFException {
        byte bM48128 = c21055.m48128();
        byte[] bArr = this.f59153;
        bArr[0] = bM48128;
        bArr[1] = c21055.m48128();
        bArr[2] = c21055.m48128();
        bArr[3] = c21055.m48128();
        c21055.m48130(4L);
        this.f59152 = c21055.m48131();
        c21055.m48131();
        return new String(bArr, LocalizedMessage.DEFAULT_ENCODING);
    }
}
