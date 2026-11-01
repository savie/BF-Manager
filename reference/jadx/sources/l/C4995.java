package l;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import bin.mt.plus.R;
import bin.mt.term.Exec;
import java.io.FileDescriptor;
import java.lang.reflect.Field;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.ۚ֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1TZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C4995 extends AbstractC21803 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String[] f17379;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C18401 f17380;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C14769 f17381;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f17382;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String f17383;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final CountDownLatch f17384;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean f17385;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String[] f17386;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    @SuppressLint({"HandlerLeak"})
    public final Handler f17387;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C9186 f17388;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f17389;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f17390;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final byte[] f17391;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public String f17392;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C14769 f17393;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C5575 f17394;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f17395;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m13847() {
        return this.f17395 != -1;
    }

    public C4995(String str, String str2, String[] strArr, String[] strArr2, boolean z, C18401 c18401) {
        super(0);
        this.f17381 = new C14769();
        this.f17393 = new C14769();
        this.f17391 = new byte[5];
        this.f17384 = new CountDownLatch(1);
        this.f17388 = new C9186();
        this.f17387 = new HandlerC9809(this, Looper.getMainLooper());
        this.f17380 = c18401;
        this.f17383 = str;
        this.f17382 = str2;
        this.f17386 = strArr;
        this.f17379 = strArr2;
        this.f17385 = z;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11346 m13836() {
        return this.f17380;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C9186 m13845() {
        return this.f17388;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m13846(int i) {
        if (this.f17385) {
            this.f17392 = C16737.m39264(R.string.MT_Protector, Integer.valueOf(i));
        } else {
            this.f17392 = C16737.m39264(R.string.MT_Protector, Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m13848() {
        return this.f17385;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m13843() {
        return this.f17383;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13838(int i, float f, int i2) {
        Field declaredField;
        this.f17390 = f;
        if (this.f17394 != null) {
            Exec.setPtyWindowSize(this.f17389, i2, i);
            this.f17394.m15429(i, i2);
            return;
        }
        this.f17394 = new C5575(this, i, i2);
        int[] iArr = new int[1];
        int iCreateSubprocess = Exec.createSubprocess(this.f17383, this.f17382, this.f17386, this.f17379, iArr);
        this.f17389 = iCreateSubprocess;
        this.f17395 = iArr[0];
        Exec.setPtyWindowSize(iCreateSubprocess, i2, i);
        this.f17388.mo23641(Boolean.valueOf(m13847()));
        int i3 = this.f17389;
        FileDescriptor fileDescriptor = new FileDescriptor();
        try {
            try {
                declaredField = FileDescriptor.class.getDeclaredField("descriptor");
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException unused) {
            }
        } catch (NoSuchFieldException unused2) {
            declaredField = FileDescriptor.class.getDeclaredField("fd");
        }
        declaredField.setAccessible(true);
        declaredField.set(fileDescriptor, Integer.valueOf(i3));
        new C3457(this, fileDescriptor).start();
        new C4289(this, fileDescriptor).start();
        new C13463(this).start();
    }

    @Override // l.AbstractC21803
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo13840(int i, byte[] bArr) {
        if (this.f17395 > 0) {
            this.f17393.m35394(i, bArr);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13839(int i, boolean z) {
        int i2;
        int i3;
        if (i > 1114111 || (i >= 55296 && i <= 57343)) {
            throw new IllegalArgumentException(C8479.m22141(i, "Invalid code point: "));
        }
        int i4 = 0;
        byte[] bArr = this.f17391;
        if (z) {
            bArr[0] = 27;
            i4 = 1;
        }
        if (i <= 127) {
            i3 = i4 + 1;
            bArr[i4] = (byte) i;
        } else {
            if (i <= 2047) {
                int i5 = i4 + 1;
                bArr[i4] = (byte) ((i >> 6) | 192);
                i2 = i4 + 2;
                bArr[i5] = (byte) ((i & 63) | 128);
            } else if (i <= 65535) {
                bArr[i4] = (byte) ((i >> 12) | BERTags.FLAGS);
                bArr[i4 + 1] = (byte) (((i >> 6) & 63) | 128);
                i3 = i4 + 3;
                bArr[i4 + 2] = (byte) ((i & 63) | 128);
            } else {
                bArr[i4] = (byte) ((i >> 18) | 240);
                bArr[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
                int i6 = i4 + 3;
                bArr[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
                i2 = i4 + 4;
                bArr[i6] = (byte) ((i & 63) | 128);
            }
            i3 = i2;
        }
        mo13840(i3, bArr);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C5575 m13834() {
        return this.f17394;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static void m13827(C4995 c4995) {
        c4995.f17380.m42686();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m13849() {
        if (m13847()) {
            Exec.killAll(this.f17395);
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static void m13831(C4995 c4995) {
        try {
            c4995.f17384.await(1L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
        }
        synchronized (c4995) {
            c4995.f17395 = -1;
            c4995.f17388.mo23641(Boolean.FALSE);
        }
        c4995.f17393.m35393();
        c4995.f17381.m35393();
        Exec.close(c4995.f17389);
    }

    @Override // l.AbstractC21803
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo13842() {
        this.f17380.getClass();
    }

    @Override // l.AbstractC21803
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo13841(String str) {
        this.f17380.m42684(str);
    }

    @Override // l.AbstractC21803
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo13844() {
        this.f17380.m42683();
    }

    @Override // l.AbstractC21803
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo13835() {
        this.f17380.m42687();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final float m13850() {
        return this.f17390;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13837(float f) {
        this.f17390 = f;
    }
}
