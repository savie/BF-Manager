package l;

import com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPOutputStream;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ܰ᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1EH */
/* JADX INFO: loaded from: classes4.dex */
public final class C14950 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f48812;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f48813;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final BufferedOutputStream f48814;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6178 f48811 = new C6178();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9982 f48815 = new C9982();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C9982 f48818 = new C9982();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C9982 f48816 = new C9982();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] f48817 = new byte[4];

    public C14950(boolean z, BufferedOutputStream bufferedOutputStream, AtomicInteger atomicInteger) {
        this.f48813 = z;
        this.f48814 = bufferedOutputStream;
        this.f48812 = atomicInteger;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35971(C24648 c24648) throws IOException {
        this.f48811.m17793();
        this.f48815.m25824();
        C6178 c6178 = this.f48811;
        C2008 c2008 = c24648.f79791;
        if (c2008 != null) {
            c2008.m6855(c6178);
        } else {
            InputStream inputStreamMo4290 = c24648.f79788.mo4290();
            try {
                byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
                while (true) {
                    int i = inputStreamMo4290.read(bArr);
                    if (i == -1) {
                        break;
                    } else {
                        c6178.write(bArr, 0, i);
                    }
                }
                inputStreamMo4290.close();
            } catch (Throwable th) {
                if (inputStreamMo4290 != null) {
                    try {
                        inputStreamMo4290.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        c24648.m55002(this.f48815);
        if (this.f48813) {
            this.f48818.m25824();
            C9982 c9982 = this.f48818;
            byte[] bArrM17808 = this.f48811.m17808();
            int size = this.f48811.size();
            int i2 = C15768.f51344;
            try {
                C14729 c14729 = new C14729(c9982);
                try {
                    c14729.write(bArrM17808, 0, size);
                    c14729.close();
                    this.f48816.m25824();
                    C9982 c9983 = this.f48816;
                    C9982 c9984 = this.f48815;
                    byte[] bArr2 = c9984.f32079;
                    int i3 = c9984.f32081;
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(c9983);
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
                        c14729.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
        synchronized (this.f48814) {
            if (this.f48813) {
                C6929.m19210(0, this.f48818.f32081, this.f48817);
                this.f48814.write(this.f48817);
                BufferedOutputStream bufferedOutputStream = this.f48814;
                C9982 c9985 = this.f48818;
                bufferedOutputStream.write(c9985.f32079, 0, c9985.f32081);
                c24648.f79794 = this.f48812.getAndAdd(this.f48818.f32081 + 4);
                C6929.m19210(0, this.f48816.f32081, this.f48817);
                this.f48814.write(this.f48817);
                BufferedOutputStream bufferedOutputStream2 = this.f48814;
                C9982 c9986 = this.f48816;
                bufferedOutputStream2.write(c9986.f32079, 0, c9986.f32081);
                c24648.f79789 = this.f48812.getAndAdd(this.f48816.f32081 + 4);
            } else {
                C6929.m19210(0, this.f48811.size(), this.f48817);
                this.f48814.write(this.f48817);
                this.f48814.write(this.f48811.m17808(), 0, this.f48811.size());
                c24648.f79794 = this.f48812.getAndAdd(this.f48811.size() + 4);
                C9982 c9987 = this.f48815;
                byte[] bArr3 = c9987.f32079;
                int i4 = c9987.f32081;
                for (int i5 = 0; i5 < i4; i5++) {
                    if (bArr3[i5] == 0) {
                        bArr3[i5] = UTF8.S_CS3;
                    }
                }
                this.f48814.write(bArr3, 0, i4);
                this.f48814.write(0);
                c24648.f79789 = this.f48812.getAndAdd(i4 + 1);
            }
        }
        if (this.f48811.m17808().length > 20480) {
            this.f48811.m17793();
            this.f48811.m17811();
        }
        C9982 c9988 = this.f48815;
        if (c9988.f32079.length > 20480) {
            c9988.m25824();
            this.f48815.m25825();
        }
        C9982 c9989 = this.f48818;
        if (c9989.f32079.length > 20480) {
            c9989.m25824();
            this.f48818.m25825();
        }
        C9982 c99810 = this.f48816;
        if (c99810.f32079.length > 20480) {
            c99810.m25824();
            this.f48816.m25825();
        }
        c24648.f79792 = null;
        C2008 c2009 = c24648.f79791;
        if (c2009 != null) {
            c2009.m6862();
            c24648.f79791 = null;
        }
    }
}
