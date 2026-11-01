package l;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۧۧ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: G7TV */
/* JADX INFO: loaded from: classes4.dex */
public final class C10965 implements InterfaceC17314 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f37381 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14493 f37382;

    public C10965(C14493 c14493) {
        this.f37382 = c14493;
    }

    @Override // l.InterfaceC17314
    public final InterfaceC17314 putString(String str, String str2) {
        if (str2 == null) {
            remove(str);
            return this;
        }
        this.f37381.put(str, new C23665(16, str2.getBytes(Charset.defaultCharset())));
        return this;
    }

    @Override // l.InterfaceC17314
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC17314 mo4065(int i, String str) {
        byte[] bArr = new byte[4];
        C15157.m36338(0, i, bArr);
        this.f37381.put(str, new C23665(21, bArr));
        return this;
    }

    @Override // l.InterfaceC17314
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC17314 mo4066(long j, String str) {
        byte[] bArr = new byte[8];
        C15157.m36340(j, 0, bArr);
        this.f37381.put(str, new C23665(22, bArr));
        return this;
    }

    @Override // l.InterfaceC17314
    public final InterfaceC17314 putFloat(String str, float f) {
        byte[] bArr = new byte[4];
        C15157.m36338(0, Float.floatToRawIntBits(f), bArr);
        this.f37381.put(str, new C23665(23, bArr));
        return this;
    }

    @Override // l.InterfaceC17314
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC17314 mo4067(String str, byte[] bArr) {
        if (bArr == null) {
            remove(str);
            return this;
        }
        this.f37381.put(str, new C23665(25, (byte[]) bArr.clone()));
        return this;
    }

    @Override // l.InterfaceC17314
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC17314 mo4068(String str, int[] iArr) {
        if (iArr == null) {
            remove(str);
            return this;
        }
        byte[] bArr = new byte[iArr.length * 4];
        for (int i = 0; i < iArr.length; i++) {
            C15157.m36338(i * 4, iArr[i], bArr);
        }
        this.f37381.put(str, new C23665(26, bArr));
        return this;
    }

    @Override // l.InterfaceC17314
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC17314 mo4069(String str, String[] strArr) {
        if (strArr == null) {
            remove(str);
            return this;
        }
        C11018 c11018 = new C11018();
        c11018.mo24508(strArr.length);
        for (String str2 : strArr) {
            c11018.m27786(str2);
        }
        this.f37381.put(str, new C23665(27, c11018.m27773()));
        return this;
    }

    @Override // l.InterfaceC17314
    public final InterfaceC17314 remove(String str) {
        this.f37381.put(str, C14493.f47474);
        return this;
    }

    @Override // l.InterfaceC17314
    public final InterfaceC17314 putBoolean(String str, boolean z) {
        this.f37381.put(str, new C23665(17, new byte[]{(byte) (z ? 255 : 0)}));
        return this;
    }

    @Override // l.InterfaceC17314
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC17314 mo4064(byte b, String str) {
        this.f37381.put(str, new C23665(18, new byte[]{b}));
        return this;
    }

    @Override // l.InterfaceC17314
    public final void apply() {
        m27722();
        C4716.f16636.execute(new RunnableC11199(2, this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27723(C10965 c10965) {
        try {
            synchronized (c10965.f37382) {
                c10965.m27724();
            }
        } catch (IOException unused) {
        }
    }

    @Override // l.InterfaceC17314
    public final boolean commit() {
        m27722();
        try {
            synchronized (this.f37382) {
                m27724();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m27722() {
        for (Map.Entry entry : this.f37381.entrySet()) {
            this.f37382.f47479.put((String) entry.getKey(), (C23665) entry.getValue());
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m27724() throws Exception {
        C14493 c14493 = this.f37382;
        if (c14493.f47478.exists()) {
            if (!c14493.f47478.isDirectory() && !c14493.f47478.delete() && !c14493.f47478.mkdirs()) {
                throw new IOException("Unable to create directory " + c14493.f47478);
            }
        } else if (!c14493.f47478.mkdirs()) {
            throw new IOException("Unable to create directory " + c14493.f47478);
        }
        byte[] bArr = new byte[1024];
        CRC32 crc32 = new CRC32();
        IOException iOException = null;
        for (Map.Entry entry : this.f37381.entrySet()) {
            String str = (String) entry.getKey();
            C23665 c23665 = (C23665) entry.getValue();
            C13638.requireNonNull(c23665);
            try {
                if (c23665 == C14493.f47474) {
                    c14493.m34894(str).m37496();
                } else {
                    C14493.m34890(c14493, str, c23665, bArr, crc32);
                    if (c23665.f76592.length >= 10240) {
                        c14493.f47479.remove(str, c23665);
                    }
                }
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                }
            }
        }
        if (iOException != null) {
            throw iOException;
        }
    }
}
