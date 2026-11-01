package l;

import com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPOutputStream;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ܿܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1EH */
/* JADX INFO: loaded from: classes4.dex */
public final class C17401 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final BufferedOutputStream f55374;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f55378;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f55379;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11018 f55376 = new C11018();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C19551 f55381 = new C19551();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C19551 f55375 = new C19551();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C19551 f55377 = new C19551();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f55380 = new byte[4];

    public C17401(boolean z, BufferedOutputStream bufferedOutputStream, AtomicInteger atomicInteger) {
        this.f55378 = z;
        this.f55374 = bufferedOutputStream;
        this.f55379 = atomicInteger;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40547(C16696 c16696) throws IOException {
        this.f55376.m27774();
        this.f55381.m44640();
        C11018 c11018 = this.f55376;
        C8340 c8340 = c16696.f53483;
        if (c8340 != null) {
            c8340.m21781(c11018);
        } else {
            InputStream inputStreamMo33970 = c16696.f53485.mo33970();
            try {
                byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
                while (true) {
                    int i = inputStreamMo33970.read(bArr);
                    if (i == -1) {
                        break;
                    } else {
                        c11018.write(bArr, 0, i);
                    }
                }
                inputStreamMo33970.close();
            } catch (Throwable th) {
                if (inputStreamMo33970 != null) {
                    try {
                        inputStreamMo33970.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        c16696.m39172(this.f55381);
        if (this.f55378) {
            this.f55375.m44640();
            C19551 c19551 = this.f55375;
            byte[] bArrM27788 = this.f55376.m27788();
            int size = this.f55376.size();
            int i2 = C18019.f57618;
            try {
                C11267 c11267 = new C11267(c19551);
                try {
                    c11267.write(bArrM27788, 0, size);
                    c11267.close();
                    this.f55377.m44640();
                    C19551 c19552 = this.f55377;
                    C19551 c19553 = this.f55381;
                    byte[] bArr2 = c19553.f62829;
                    int i3 = c19553.f62830;
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(c19552);
                        try {
                            gZIPOutputStream.write(bArr2, 0, i3);
                            gZIPOutputStream.close();
                        } catch (Throwable th3) {
                            try {
                                gZIPOutputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } catch (Throwable th5) {
                    try {
                        c11267.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
        synchronized (this.f55374) {
            if (this.f55378) {
                C15157.m36338(0, this.f55375.f62830, this.f55380);
                this.f55374.write(this.f55380);
                BufferedOutputStream bufferedOutputStream = this.f55374;
                C19551 c19554 = this.f55375;
                bufferedOutputStream.write(c19554.f62829, 0, c19554.f62830);
                c16696.f53489 = this.f55379.getAndAdd(this.f55375.f62830 + 4);
                C15157.m36338(0, this.f55377.f62830, this.f55380);
                this.f55374.write(this.f55380);
                BufferedOutputStream bufferedOutputStream2 = this.f55374;
                C19551 c19555 = this.f55377;
                bufferedOutputStream2.write(c19555.f62829, 0, c19555.f62830);
                c16696.f53488 = this.f55379.getAndAdd(this.f55377.f62830 + 4);
            } else {
                C15157.m36338(0, this.f55376.size(), this.f55380);
                this.f55374.write(this.f55380);
                this.f55374.write(this.f55376.m27788(), 0, this.f55376.size());
                c16696.f53489 = this.f55379.getAndAdd(this.f55376.size() + 4);
                C19551 c19556 = this.f55381;
                byte[] bArr3 = c19556.f62829;
                int i4 = c19556.f62830;
                for (int i5 = 0; i5 < i4; i5++) {
                    if (bArr3[i5] == 0) {
                        bArr3[i5] = UTF8.S_CS3;
                    }
                }
                this.f55374.write(bArr3, 0, i4);
                this.f55374.write(0);
                c16696.f53488 = this.f55379.getAndAdd(i4 + 1);
            }
        }
        if (this.f55376.m27788().length > 20480) {
            this.f55376.m27774();
            this.f55376.m27797();
        }
        C19551 c19557 = this.f55381;
        if (c19557.f62829.length > 20480) {
            c19557.m44640();
            this.f55381.m44641();
        }
        C19551 c19558 = this.f55375;
        if (c19558.f62829.length > 20480) {
            c19558.m44640();
            this.f55375.m44641();
        }
        C19551 c19559 = this.f55377;
        if (c19559.f62829.length > 20480) {
            c19559.m44640();
            this.f55377.m44641();
        }
        c16696.f53490 = null;
        C8340 c8341 = c16696.f53483;
        if (c8341 != null) {
            c8341.m21787();
            c16696.f53483 = null;
        }
    }
}
