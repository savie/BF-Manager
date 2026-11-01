package l;

import java.io.EOFException;
import org.bouncycastle.i18n.LocalizedMessage;

/* JADX INFO: renamed from: l.۬֨ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: NAGW */
/* JADX INFO: loaded from: classes3.dex */
public final class C12787 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f42607;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f42608;

    public C12787() {
        this.f42608 = new byte[4];
    }

    public C12787(int i) {
        this.f42608 = new byte[4];
        this.f42607 = 0L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m31771() {
        return this.f42607;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m31772(C0791 c0791) throws EOFException {
        byte bM3340 = c0791.m3340();
        byte[] bArr = this.f42608;
        bArr[0] = bM3340;
        bArr[1] = c0791.m3340();
        bArr[2] = c0791.m3340();
        bArr[3] = c0791.m3340();
        c0791.m3342(4L);
        this.f42607 = c0791.m3334();
        c0791.m3334();
        return new String(bArr, LocalizedMessage.DEFAULT_ENCODING);
    }
}
