package l;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.֨֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7TV */
/* JADX INFO: loaded from: classes3.dex */
public final class C0853 implements InterfaceC18752 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f3213 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2345 f3214;

    public C0853(C2345 c2345) {
        this.f3214 = c2345;
    }

    @Override // l.InterfaceC18752
    public final InterfaceC18752 putString(String str, String str2) {
        if (str2 == null) {
            remove(str);
            return this;
        }
        this.f3213.put(str, new C9056(16, str2.getBytes(Charset.defaultCharset())));
        return this;
    }

    @Override // l.InterfaceC18752
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18752 mo3486(int i, String str) {
        byte[] bArr = new byte[4];
        C6929.m19210(0, i, bArr);
        this.f3213.put(str, new C9056(21, bArr));
        return this;
    }

    @Override // l.InterfaceC18752
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18752 mo3487(long j, String str) {
        byte[] bArr = new byte[8];
        C6929.m19211(j, 0, bArr);
        this.f3213.put(str, new C9056(22, bArr));
        return this;
    }

    @Override // l.InterfaceC18752
    public final InterfaceC18752 putFloat(String str, float f) {
        byte[] bArr = new byte[4];
        C6929.m19210(0, Float.floatToRawIntBits(f), bArr);
        this.f3213.put(str, new C9056(23, bArr));
        return this;
    }

    @Override // l.InterfaceC18752
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18752 mo3488(String str, byte[] bArr) {
        if (bArr == null) {
            remove(str);
            return this;
        }
        this.f3213.put(str, new C9056(25, (byte[]) bArr.clone()));
        return this;
    }

    @Override // l.InterfaceC18752
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18752 mo3489(String str, int[] iArr) {
        if (iArr == null) {
            remove(str);
            return this;
        }
        byte[] bArr = new byte[iArr.length * 4];
        for (int i = 0; i < iArr.length; i++) {
            C6929.m19210(i * 4, iArr[i], bArr);
        }
        this.f3213.put(str, new C9056(26, bArr));
        return this;
    }

    @Override // l.InterfaceC18752
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18752 mo3490(String str, String[] strArr) {
        if (strArr == null) {
            remove(str);
            return this;
        }
        C6178 c6178 = new C6178();
        c6178.mo17812(strArr.length);
        for (String str2 : strArr) {
            c6178.m17800(str2);
        }
        this.f3213.put(str, new C9056(27, c6178.m17796()));
        return this;
    }

    @Override // l.InterfaceC18752
    public final InterfaceC18752 remove(String str) {
        this.f3213.put(str, C2345.f7560);
        return this;
    }

    @Override // l.InterfaceC18752
    public final InterfaceC18752 putBoolean(String str, boolean z) {
        this.f3213.put(str, new C9056(17, new byte[]{(byte) (z ? 255 : 0)}));
        return this;
    }

    @Override // l.InterfaceC18752
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18752 mo3485(byte b, String str) {
        this.f3213.put(str, new C9056(18, new byte[]{b}));
        return this;
    }

    @Override // l.InterfaceC18752
    public final void apply() {
        m3482();
        C5261.f18540.execute(new RunnableC2198(3, this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3483(C0853 c0853) {
        try {
            synchronized (c0853.f3214) {
                c0853.m3484();
            }
        } catch (IOException unused) {
        }
    }

    @Override // l.InterfaceC18752
    public final boolean commit() {
        m3482();
        try {
            synchronized (this.f3214) {
                m3484();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m3482() {
        for (Map.Entry entry : this.f3213.entrySet()) {
            this.f3214.f7564.put((String) entry.getKey(), (C9056) entry.getValue());
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m3484() throws Exception {
        C2345 c2345 = this.f3214;
        if (c2345.f7562.exists()) {
            if (!c2345.f7562.isDirectory() && !c2345.f7562.delete() && !c2345.f7562.mkdirs()) {
                throw new IOException("Unable to create directory " + c2345.f7562);
            }
        } else if (!c2345.f7562.mkdirs()) {
            throw new IOException("Unable to create directory " + c2345.f7562);
        }
        byte[] bArr = new byte[1024];
        CRC32 crc32 = new CRC32();
        IOException iOException = null;
        for (Map.Entry entry : this.f3213.entrySet()) {
            String str = (String) entry.getKey();
            C9056 c9056 = (C9056) entry.getValue();
            C17359.requireNonNull(c9056);
            try {
                if (c9056 == C2345.f7560) {
                    c2345.m7899(str).m53632();
                } else {
                    C2345.m7895(c2345, str, c9056, bArr, crc32);
                    if (c9056.f29453.length >= 10240) {
                        c2345.f7564.remove(str, c9056);
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
