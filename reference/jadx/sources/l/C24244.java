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

/* JADX INFO: renamed from: l.᩺ۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M1TZ */
/* JADX INFO: loaded from: classes.dex */
public final class C24244 extends AbstractC8909 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17356 f78519;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final CountDownLatch f78520;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    @SuppressLint({"HandlerLeak"})
    public final Handler f78521;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String[] f78522;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f78523;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f78524;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String[] f78525;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C18605 f78526;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public float f78527;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f78528;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17356 f78529;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f78530;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public String f78531;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17930 f78532;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C9325 f78533;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final byte[] f78534;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f78535;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m54260() {
        return this.f78535 != -1;
    }

    public C24244(String str, String str2, String[] strArr, String[] strArr2, boolean z, C9325 c9325) {
        super(0);
        this.f78519 = new C17356();
        this.f78529 = new C17356();
        this.f78534 = new byte[5];
        this.f78520 = new CountDownLatch(1);
        this.f78532 = new C17930();
        this.f78521 = new HandlerC16038(this, Looper.getMainLooper());
        this.f78533 = c9325;
        this.f78523 = str;
        this.f78530 = str2;
        this.f78522 = strArr;
        this.f78525 = strArr2;
        this.f78524 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC12309 m54252() {
        return this.f78533;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C17930 m54256() {
        return this.f78532;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m54262(int i) {
        if (this.f78524) {
            this.f78531 = C21576.m49059(R.string.MT_Protector, Integer.valueOf(i));
        } else {
            this.f78531 = C21576.m49059(R.string.MT_Protector, Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m54261() {
        return this.f78524;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m54257() {
        return this.f78523;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54254(int i, float f, int i2) {
        Field declaredField;
        this.f78527 = f;
        if (this.f78526 != null) {
            Exec.setPtyWindowSize(this.f78528, i2, i);
            this.f78526.m43258(i, i2);
            return;
        }
        this.f78526 = new C18605(this, i, i2);
        int[] iArr = new int[1];
        int iCreateSubprocess = Exec.createSubprocess(this.f78523, this.f78530, this.f78522, this.f78525, iArr);
        this.f78528 = iCreateSubprocess;
        this.f78535 = iArr[0];
        Exec.setPtyWindowSize(iCreateSubprocess, i2, i);
        this.f78532.mo40348(Boolean.valueOf(m54260()));
        int i3 = this.f78528;
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
        new C23498(this, fileDescriptor).start();
        new C3360(this, fileDescriptor).start();
        new C20514(this).start();
    }

    @Override // l.AbstractC8909
    /* JADX INFO: renamed from: ۙ */
    public final void mo23817(int i, byte[] bArr) {
        if (this.f78535 > 0) {
            this.f78529.m40779(i, bArr);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54255(int i, boolean z) {
        int i2;
        int i3;
        if (i > 1114111 || (i >= 55296 && i <= 57343)) {
            throw new IllegalArgumentException(C13645.m33382(i, "Invalid code point: "));
        }
        int i4 = 0;
        byte[] bArr = this.f78534;
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
        mo23817(i3, bArr);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C18605 m54258() {
        return this.f78526;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m54243(C24244 c24244) {
        c24244.f78533.m24566();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m54259() {
        if (m54260()) {
            Exec.killAll(this.f78535);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m54245(C24244 c24244) {
        try {
            c24244.f78520.await(1L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
        }
        synchronized (c24244) {
            c24244.f78535 = -1;
            c24244.f78532.mo40348(Boolean.FALSE);
        }
        c24244.f78529.m40778();
        c24244.f78519.m40778();
        Exec.close(c24244.f78528);
    }

    @Override // l.AbstractC8909
    /* JADX INFO: renamed from: ᩴ */
    public final void mo23820() {
        this.f78533.getClass();
    }

    @Override // l.AbstractC8909
    /* JADX INFO: renamed from: ۙ */
    public final void mo23818(String str) {
        this.f78533.m24564(str);
    }

    @Override // l.AbstractC8909
    /* JADX INFO: renamed from: ۤ */
    public final void mo23819() {
        this.f78533.m24563();
    }

    @Override // l.AbstractC8909
    /* JADX INFO: renamed from: ᩸ */
    public final void mo23823() {
        this.f78533.m24567();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final float m54263() {
        return this.f78527;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54253(float f) {
        this.f78527 = f;
    }
}
