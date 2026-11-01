package l;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import bin.mt.plus.Features3;
import com.alipay.sdk.m.w.a;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.cb;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntConsumer;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: renamed from: l.۠֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N17O */
/* JADX INFO: loaded from: classes3.dex */
public final class C7817 implements Closeable {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f25722;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final DataInputStream f25724;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16739 f25725;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f25726;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f25727;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile long f25728;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile boolean f25729;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final DataOutputStream f25730;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f25721 = new ReentrantLock();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f25723 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f25720 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f25719 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static Boolean m20518(C7817 c7817, String str) throws IOException {
        c7817.getClass();
        byte[] bArrM20546 = m20546(str, "Path");
        c7817.m20530((byte) 25);
        c7817.m20553(bArrM20546);
        c7817.f25730.flush();
        c7817.m20555(5, "Check exists failed");
        try {
            return Boolean.valueOf(c7817.f25724.readByte() != 0);
        } catch (IOException e) {
            c7817.m20531(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20534(C7817 c7817, String str) throws IOException {
        c7817.getClass();
        byte[] bArrM20564 = m20564(str);
        c7817.m20530((byte) 41);
        c7817.m20553(bArrM20564);
        c7817.f25730.flush();
        c7817.m20555(60, "Remove empty directory failed");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20539(C7817 c7817, String str, String str2, boolean z, IntConsumer intConsumer) throws IOException {
        c7817.getClass();
        byte[] bArrM20546 = m20546(str, "Path");
        byte[] bArrM20564 = m20564(str2);
        c7817.m20530((byte) 34);
        c7817.m20553(bArrM20546);
        c7817.m20553(bArrM20564);
        DataOutputStream dataOutputStream = c7817.f25730;
        dataOutputStream.writeBoolean(z);
        dataOutputStream.flush();
        boolean z2 = false;
        while (true) {
            int iM20555 = c7817.m20555(60, "Copy failed");
            if (iM20555 <= 0) {
                return;
            }
            if (intConsumer != null) {
                try {
                    intConsumer.accept(iM20555);
                } catch (CancellationException unused) {
                    if (!z2) {
                        c7817.m20530((byte) 118);
                        dataOutputStream.flush();
                        z2 = true;
                    }
                } catch (Throwable th) {
                    if (!z2) {
                        try {
                            c7817.m20530((byte) 118);
                            dataOutputStream.flush();
                        } catch (IOException e) {
                            th.addSuppressed(e);
                        }
                    }
                    c7817.f25723.set(false);
                    c7817.m20548();
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static long m20547(C7817 c7817, String str) throws IOException {
        c7817.getClass();
        byte[] bArrM20546 = m20546(str, "Path");
        c7817.m20530((byte) 38);
        c7817.m20553(bArrM20546);
        c7817.f25730.flush();
        c7817.m20555(5, "get file actual size failed");
        return c7817.m20563();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m20550(C7817 c7817, String str) throws IOException {
        c7817.getClass();
        byte[] bArrM20546 = m20546(str, "Path");
        c7817.m20530((byte) 24);
        c7817.m20553(bArrM20546);
        c7817.f25730.flush();
        c7817.m20555(5, "realPath failed");
        return c7817.m20517();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20552(C7817 c7817, String str, String str2) throws IOException {
        c7817.getClass();
        byte[] bArrM20564 = m20564(str);
        byte[] bArrM20565 = m20564(str2);
        c7817.m20530((byte) 29);
        c7817.m20553(bArrM20564);
        c7817.m20553(bArrM20565);
        c7817.f25730.flush();
        c7817.m20555(60, "Move failed");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m20561(C7817 c7817, String str, String str2) throws IOException {
        c7817.getClass();
        byte[] bArrM20546 = m20546(str, "Path");
        byte[] bArrM20564 = m20564(str2);
        c7817.m20530((byte) 23);
        c7817.m20553(bArrM20546);
        c7817.m20553(bArrM20564);
        c7817.f25730.flush();
        c7817.m20555(5, "Symlink failed");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20562(C7817 c7817, String str, boolean z) throws IOException {
        c7817.getClass();
        byte[] bArrM20564 = m20564(str);
        c7817.m20530(ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB);
        c7817.m20553(bArrM20564);
        DataOutputStream dataOutputStream = c7817.f25730;
        dataOutputStream.writeBoolean(z);
        dataOutputStream.flush();
        c7817.m20555(5, "Mkdir failed");
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20569(C7817 c7817, String str) throws IOException {
        c7817.getClass();
        byte[] bArrM20564 = m20564(str);
        c7817.m20530((byte) 40);
        c7817.m20553(bArrM20564);
        c7817.f25730.flush();
        c7817.m20555(60, "Unlink file or link failed");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20540(C7817 c7817, byte[] bArr) throws IOException {
        C16284.m38437("Path", bArr);
        c7817.m20530((byte) 30);
        c7817.m20553(bArr);
        c7817.f25730.flush();
        c7817.m20555(60, "Remove failed");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20541(C7817 c7817, byte[] bArr, byte[] bArr2) throws IOException {
        C16284.m38437("Path", bArr);
        C16284.m38437("Path", bArr2);
        c7817.m20530((byte) 29);
        c7817.m20553(bArr);
        c7817.m20553(bArr2);
        c7817.f25730.flush();
        c7817.m20555(60, "Move failed");
    }

    public C7817(InterfaceC16739 interfaceC16739, boolean z) throws IOException {
        this.f25725 = interfaceC16739;
        this.f25727 = z;
        DataInputStream dataInputStream = new DataInputStream(new C17694(this, interfaceC16739.getInputStream()));
        this.f25724 = dataInputStream;
        this.f25730 = new DataOutputStream(new C18400(this, new BufferedOutputStream(interfaceC16739.getOutputStream(), interfaceC16739.getSendBufferSize())));
        byte[] bArr = new byte[4];
        try {
            dataInputStream.readFully(bArr, 0, 4);
            if (!Arrays.equals(bArr, C19812.f63599)) {
                throw new IOException("Magic error");
            }
            this.f25726 = m20568();
            this.f25722 = m20568();
        } catch (IOException e) {
            m20531(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m20606() {
        this.f25728 = 0L;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m20592() {
        String.format("[%08x]", Integer.valueOf(hashCode()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m20531(IOException iOException) {
        m20592();
        this.f25723.set(false);
        m20548();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private IOException m20565(String str) {
        IOException iOException = new IOException(str);
        m20592();
        this.f25723.set(false);
        m20548();
        return iOException;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private void m20548() {
        if (this.f25720.compareAndSet(false, true)) {
            this.f25723.set(false);
            C19431.m44468(this.f25725);
        }
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    private int m20567() throws IOException {
        try {
            int i = this.f25724.read();
            if (i >= 0) {
                return i;
            }
            EOFException eOFException = new EOFException("Connection closed");
            m20531(eOFException);
            throw eOFException;
        } catch (IOException e) {
            m20531(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte m20522(C7817 c7817) throws IOException {
        try {
            return c7817.f25724.readByte();
        } catch (IOException e) {
            c7817.m20531(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m20568() throws IOException {
        try {
            return this.f25724.readInt();
        } catch (IOException e) {
            m20531(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private long m20563() throws IOException {
        try {
            return this.f25724.readLong();
        } catch (IOException e) {
            m20531(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final InputStream m20570(String str) {
        String str2 = "r";
        ParcelFileDescriptor parcelFileDescriptorM20599 = m20599(str, "r");
        if (parcelFileDescriptorM20599 != null) {
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptorM20599);
        }
        return new BufferedInputStream(new C9934((C8523) m20527((InterfaceC13336) new C16158(this, str, str2), true)), this.f25726);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final OutputStream m20591(String str, boolean z) {
        String strM45052 = C19812.m45052(str);
        ParcelFileDescriptor parcelFileDescriptorM20599 = m20599(strM45052, z ? am.av : "w");
        if (parcelFileDescriptorM20599 != null) {
            return new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorM20599);
        }
        return new BufferedOutputStream(new C7111((C8523) m20527((InterfaceC13336) new C16158(this, strM45052, z ? am.av : "w"), true)), this.f25726);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21850 m20575(String str, String str2) {
        if (C19812.m45049(str2)) {
            str = C19812.m45052(str);
        }
        ParcelFileDescriptor parcelFileDescriptorM20599 = m20599(str, str2);
        if (parcelFileDescriptorM20599 != null) {
            return new C15579(parcelFileDescriptorM20599, str, str2, this.f25727);
        }
        return new C20517((C8523) m20527((InterfaceC13336) new C16158(this, str, str2), true), str, str2);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m20610() {
        return this.f25721.isLocked() || this.f25719.get() > 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ParcelFileDescriptor m20599(final String str, final String str2) {
        InterfaceC16739 interfaceC16739 = this.f25725;
        if (!interfaceC16739.mo39298()) {
            return null;
        }
        final String strSubstring = str.substring(0, str.lastIndexOf(47) + 1);
        if (C19812.f63598.contains(strSubstring)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (str.startsWith("/storage/emulated/999/Android/")) {
                String strSubstring2 = str.substring(30);
                if (strSubstring2.startsWith("data/") || strSubstring2.startsWith("obb/")) {
                    return null;
                }
            }
            if (str.startsWith("/mnt/user/999/self/primary/Android/")) {
                String strSubstring3 = str.substring(35);
                if (strSubstring3.startsWith("data/") || strSubstring3.startsWith("obb/")) {
                    return null;
                }
            }
        }
        final int iMo39300 = interfaceC16739.mo39300();
        if (iMo39300 < 0) {
            return null;
        }
        return (ParcelFileDescriptor) m20527(new InterfaceC13336() { // from class: l.ܽ᩶ۚ
            @Override // l.InterfaceC13336
            public final Object call() {
                return C7817.m20526(this.f53955, str, str2, iMo39300, strSubstring);
            }
        }, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ParcelFileDescriptor m20526(final C7817 c7817, String str, String str2, final int i, String str3) throws IOException {
        byte bM45054 = C19812.m45054(str2);
        byte[] bArrM20546 = m20546(str, "Path");
        c7817.m20530((byte) 10);
        c7817.m20553(bArrM20546);
        DataOutputStream dataOutputStream = c7817.f25730;
        dataOutputStream.writeByte(bM45054);
        dataOutputStream.flush();
        AtomicBoolean atomicBoolean = c7817.f25723;
        Future futureSubmit = C4716.f16636.submit(new Callable() { // from class: l.ۨ֡ۚ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C7817.m20549(this.f38279, i);
            }
        });
        for (int i2 = 0; i2 < 10; i2++) {
            try {
                long jLongValue = ((Long) futureSubmit.get(500L, TimeUnit.MILLISECONDS)).longValue();
                byte b = (byte) ((jLongValue >>> 32) & 255);
                if (b == -1) {
                    String strM20517 = c7817.m20517();
                    if (strM20517.isEmpty()) {
                        strM20517 = "Open fd failed";
                    }
                    throw new IOException(strM20517);
                }
                if (b != 0) {
                    throw c7817.m20565(C8479.m22141(b, "Unknown open fd result code: "));
                }
                int i3 = (int) jLongValue;
                if (i3 >= 0) {
                    return ParcelFileDescriptor.adoptFd(i3);
                }
                C19812.f63598.add(str3);
                return null;
            } catch (InterruptedException e) {
                atomicBoolean.set(false);
                c7817.m20548();
                throw new IOException(e);
            } catch (ExecutionException e2) {
                Throwable cause = e2.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(cause);
            } catch (TimeoutException unused) {
            }
        }
        atomicBoolean.set(false);
        c7817.m20548();
        futureSubmit.cancel(true);
        throw new C8142("Open fd failed, timeout after 5 seconds");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8523 m20529(C7817 c7817, String str, String str2) throws IOException {
        byte bM45054 = C19812.m45054(str2);
        byte[] bArrM20546 = m20546(str, "Path");
        c7817.m20530((byte) 11);
        c7817.m20553(bArrM20546);
        DataOutputStream dataOutputStream = c7817.f25730;
        dataOutputStream.writeByte(bM45054);
        dataOutputStream.flush();
        c7817.m20555(5, "Open failed");
        try {
            C8523 c8523 = new C8523(c7817, c7817.f25724.readUnsignedShort());
            c7817.f25719.incrementAndGet();
            return c8523;
        } catch (IOException e) {
            c7817.m20531(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m20523(C7817 c7817, int i, int i2, int i3, byte[] bArr) throws IOException {
        DataOutputStream dataOutputStream = c7817.f25730;
        if (i2 < 0 || i3 < 0 || i3 > bArr.length || i2 > bArr.length - i3) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        int iMin = Math.min(i2, c7817.f25726);
        c7817.m20530((byte) 12);
        dataOutputStream.writeShort(i);
        dataOutputStream.writeInt(iMin);
        dataOutputStream.flush();
        c7817.m20555(8, "Read failed");
        int iM20568 = c7817.m20568();
        if (iM20568 < 0 || iM20568 > iMin || iM20568 > bArr.length - i3) {
            throw c7817.m20565(C8479.m22141(iM20568, "Invalid read size: "));
        }
        try {
            c7817.f25724.readFully(bArr, i3, iM20568);
            if (iM20568 == 0) {
                return -1;
            }
            return iM20568;
        } catch (IOException e) {
            c7817.m20531(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m20601(final int i, final byte[] bArr, final int i2, final int i3) {
        m20542(new InterfaceC22508() { // from class: l.֫᩶ۚ
            @Override // l.InterfaceC22508
            public final void call() throws IOException {
                C7817.m20559(this.f7617, i, i3, i2, bArr);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20559(C7817 c7817, int i, int i2, int i3, byte[] bArr) throws IOException {
        DataOutputStream dataOutputStream = c7817.f25730;
        if (i2 < 0 || i3 < 0 || i3 > bArr.length || i2 > bArr.length - i3) {
            throw new ArrayIndexOutOfBoundsException();
        }
        c7817.m20530(cb.k);
        dataOutputStream.writeShort(i);
        dataOutputStream.writeInt(i2);
        dataOutputStream.write(bArr, i3, i2);
        dataOutputStream.flush();
        c7817.m20555(8, "Write failed");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m20593(final int i) {
        m20542(new InterfaceC22508() { // from class: l.ܰ֡ۚ
            @Override // l.InterfaceC22508
            public final void call() throws IOException {
                C7817.m20520(this.f44529, i);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20520(C7817 c7817, int i) throws IOException {
        c7817.m20530(cb.f77931l);
        DataOutputStream dataOutputStream = c7817.f25730;
        dataOutputStream.writeShort(i);
        dataOutputStream.flush();
        c7817.m20555(8, "Sync failed");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20578(final int i) {
        m20542(new InterfaceC22508() { // from class: l.ۙ֡ۚ
            @Override // l.InterfaceC22508
            public final void call() {
                C7817.m20558(this.f15453, i);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20558(C7817 c7817, int i) {
        AtomicInteger atomicInteger = c7817.f25719;
        DataOutputStream dataOutputStream = c7817.f25730;
        try {
            try {
                c7817.m20530((byte) 15);
                dataOutputStream.writeShort(i);
                dataOutputStream.flush();
                c7817.m20555(8, "Close failed");
                atomicInteger.decrementAndGet();
            } catch (IOException e) {
                c7817.f25723.set(false);
                c7817.m20548();
                throw e;
            }
        } catch (Throwable th) {
            atomicInteger.decrementAndGet();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long m20573(final int i) {
        return m20524(new InterfaceC1340() { // from class: l.ۚ֡ۚ
            @Override // l.InterfaceC1340
            public final long call() {
                return C7817.m20544(this.f17377, i);
            }
        });
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ long m20544(C7817 c7817, int i) throws IOException {
        c7817.m20530((byte) 16);
        DataOutputStream dataOutputStream = c7817.f25730;
        dataOutputStream.writeShort(i);
        dataOutputStream.flush();
        c7817.m20555(5, "Tell failed");
        return c7817.m20563();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20579(final int i, final long j) {
        m20542(new InterfaceC22508() { // from class: l.ۢ᩶ۚ
            @Override // l.InterfaceC22508
            public final void call() throws IOException {
                C7817.m20560(this.f33553, i, j);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20560(C7817 c7817, int i, long j) throws IOException {
        c7817.m20530((byte) 17);
        DataOutputStream dataOutputStream = c7817.f25730;
        dataOutputStream.writeShort(i);
        dataOutputStream.writeLong(j);
        dataOutputStream.flush();
        c7817.m20555(5, "Seek failed");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m20597(final int i) {
        return m20524(new InterfaceC1340() { // from class: l.ۧ᩶ۚ
            @Override // l.InterfaceC1340
            public final long call() {
                return C7817.m20525(this.f37967, i);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ long m20525(C7817 c7817, int i) throws IOException {
        c7817.m20530((byte) 18);
        DataOutputStream dataOutputStream = c7817.f25730;
        dataOutputStream.writeShort(i);
        dataOutputStream.flush();
        c7817.m20555(5, "Length failed");
        return c7817.m20563();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m20600(final int i, final long j) {
        m20542(new InterfaceC22508() { // from class: l.᩻᩶ۚ
            @Override // l.InterfaceC22508
            public final void call() throws IOException {
                C7817.m20532(this.f77486, i, j);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20532(C7817 c7817, int i, long j) throws IOException {
        c7817.m20530((byte) 19);
        DataOutputStream dataOutputStream = c7817.f25730;
        dataOutputStream.writeShort(i);
        dataOutputStream.writeLong(j);
        dataOutputStream.flush();
        c7817.m20555(5, "Truncate failed");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m20576(final String str, final boolean z) {
        return (List) m20527(new InterfaceC13336() { // from class: l.ۡ᩶ۚ
            @Override // l.InterfaceC13336
            public final Object call() {
                return C7817.m20528(this.f31030, str, z);
            }
        }, true);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final List m20574(final String str) {
        return (List) m20527(new InterfaceC13336() { // from class: l.۫᩶ۚ
            @Override // l.InterfaceC13336
            public final Object call() {
                return C7817.m20545(this.f42209, str);
            }
        }, true);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final List m20589(final String str) {
        return (List) m20527(new InterfaceC13336() { // from class: l.᩹֡ۚ
            @Override // l.InterfaceC13336
            public final Object call() {
                return C7817.m20556(this.f71133, str);
            }
        }, true);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final List m20609(final String str) {
        return (List) m20527(new InterfaceC13336() { // from class: l.ᩳ᩶ۚ
            @Override // l.InterfaceC13336
            public final Object call() {
                return C7817.m20521(this.f58309, str);
            }
        }, true);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C5574 m20595(final String str) {
        return (C5574) m20527(new InterfaceC13336() { // from class: l.ܶ᩶ۚ
            @Override // l.InterfaceC13336
            public final Object call() {
                return C7817.m20519(this.f50360, str);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m20598(final String str) {
        return m20524(new InterfaceC1340() { // from class: l.֡᩶ۚ
            @Override // l.InterfaceC1340
            public final long call() {
                return C7817.m20547(this.f2742, str);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20583(final String str, final String str2) {
        m20542(new InterfaceC22508() { // from class: l.ۖ֡ۚ
            @Override // l.InterfaceC22508
            public final void call() throws IOException {
                C7817.m20561(this.f7883, str, str2);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m20590(final String str) {
        return (String) m20527(new InterfaceC13336() { // from class: l.᩸֡ۚ
            @Override // l.InterfaceC13336
            public final Object call() {
                return C7817.m20550(this.f69135, str);
            }
        }, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m20587(final String str) {
        return ((Boolean) m20527(new InterfaceC13336() { // from class: l.ۘ֡ۚ
            @Override // l.InterfaceC13336
            public final Object call() {
                return C7817.m20518(this.f13175, str);
            }
        }, true)).booleanValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean[] m20588(final String str, final ArrayList arrayList) throws IOException {
        if (arrayList.size() > 65535) {
            throw new IOException("Too many names");
        }
        if (!str.endsWith("/")) {
            str = str.concat("/");
        }
        return (boolean[]) m20527(new InterfaceC13336() { // from class: l.ᩴ᩶ۚ
            @Override // l.InterfaceC13336
            public final Object call() {
                return C7817.m20543(this.f61437, str, arrayList);
            }
        }, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean[] m20543(C7817 c7817, String str, ArrayList arrayList) throws IOException {
        DataOutputStream dataOutputStream = c7817.f25730;
        byte[] bArrM20546 = m20546(str, "Base path");
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] bArrM20547 = m20546((String) it.next(), "Name");
            if (bArrM20546.length + bArrM20547.length + 1 > 4097) {
                throw new IOException("Combined path too long");
            }
            arrayList2.add(bArrM20547);
        }
        c7817.m20530((byte) 36);
        c7817.m20553(bArrM20546);
        dataOutputStream.writeShort(arrayList.size());
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            c7817.m20553((byte[]) it2.next());
        }
        dataOutputStream.flush();
        c7817.m20555(5, "Check batch exists failed");
        int size = arrayList.size();
        boolean[] zArr = new boolean[size];
        for (int i = 0; i < size; i++) {
            try {
                zArr[i] = c7817.f25724.readByte() != 0;
            } catch (IOException e) {
                c7817.m20531(e);
                throw e;
            }
        }
        return zArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20582(final String str, final int i, final boolean z, final boolean z2) {
        m20542(new InterfaceC22508() { // from class: l.ܳ᩶ۚ
            @Override // l.InterfaceC22508
            public final void call() throws IOException {
                C7817.m20537(this.f48237, str, i, z, z2);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20537(C7817 c7817, String str, int i, boolean z, boolean z2) throws IOException {
        byte[] bArrM20564 = m20564(str);
        c7817.m20530((byte) 26);
        c7817.m20553(bArrM20564);
        DataOutputStream dataOutputStream = c7817.f25730;
        dataOutputStream.writeShort(i);
        dataOutputStream.writeBoolean(z);
        dataOutputStream.writeBoolean(z2);
        dataOutputStream.flush();
        c7817.m20555(5, "Chmod failed");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20581(final String str, final int i, final int i2, final boolean z, final boolean z2) {
        m20542(new InterfaceC22508() { // from class: l.᩸᩶ۚ
            @Override // l.InterfaceC22508
            public final void call() throws IOException {
                C7817.m20536(this.f70611, str, i, i2, z, z2);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20536(C7817 c7817, String str, int i, int i2, boolean z, boolean z2) throws IOException {
        byte[] bArrM20564 = m20564(str);
        c7817.m20530((byte) 27);
        c7817.m20553(bArrM20564);
        DataOutputStream dataOutputStream = c7817.f25730;
        dataOutputStream.writeInt(i);
        dataOutputStream.writeInt(i2);
        dataOutputStream.writeBoolean(z);
        dataOutputStream.writeBoolean(z2);
        dataOutputStream.flush();
        c7817.m20555(5, "Chown failed");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m20602(final String str, final boolean z) {
        m20542(new InterfaceC22508() { // from class: l.᩵᩶ۚ
            @Override // l.InterfaceC22508
            public final void call() throws IOException {
                C7817.m20562(this.f63202, str, z);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m20594(final String str, final String str2) {
        m20542(new InterfaceC22508() { // from class: l.ܶ֡ۚ
            @Override // l.InterfaceC22508
            public final void call() throws IOException {
                C7817.m20552(this.f48618, str, str2);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20586(final byte[] bArr, final byte[] bArr2) {
        m20542(new InterfaceC22508() { // from class: l.ۜ֡ۚ
            @Override // l.InterfaceC22508
            public final void call() throws IOException {
                C7817.m20541(this.f21722, bArr, bArr2);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m20611(final String str) {
        m20542(new InterfaceC22508() { // from class: l.᩺֡ۚ
            @Override // l.InterfaceC22508
            public final void call() throws IOException {
                C7817.m20554(this.f73750, str);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20554(C7817 c7817, String str) throws IOException {
        byte[] bArrM20564 = m20564(str);
        c7817.m20530((byte) 30);
        c7817.m20553(bArrM20564);
        c7817.f25730.flush();
        c7817.m20555(60, "Remove failed");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m20603(final byte[] bArr) {
        m20542(new InterfaceC22508() { // from class: l.۟᩶ۚ
            @Override // l.InterfaceC22508
            public final void call() throws IOException {
                C7817.m20540(this.f25474, bArr);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m20607(final String str) {
        m20542(new InterfaceC22508() { // from class: l.֨֡ۚ
            @Override // l.InterfaceC22508
            public final void call() throws IOException {
                C7817.m20569(this.f3075, str);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m20604(final String str) {
        m20542(new InterfaceC22508() { // from class: l.ۗ᩶ۚ
            @Override // l.InterfaceC22508
            public final void call() throws IOException {
                C7817.m20534(this.f12716, str);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20580(final long j, final String str) {
        m20542(new InterfaceC22508() { // from class: l.۬֡ۚ
            @Override // l.InterfaceC22508
            public final void call() throws IOException {
                C7817.m20538(this.f42511, str, j);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20538(C7817 c7817, String str, long j) throws IOException {
        byte[] bArrM20564 = m20564(str);
        c7817.m20530(bo.j);
        c7817.m20553(bArrM20564);
        DataOutputStream dataOutputStream = c7817.f25730;
        dataOutputStream.writeLong(j);
        dataOutputStream.flush();
        c7817.m20555(5, "Set time failed");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20585(final String str, EnumC12506... enumC12506Arr) {
        final int i = 0;
        for (EnumC12506 enumC12506 : enumC12506Arr) {
            i |= enumC12506.f41845;
        }
        m20542(new InterfaceC22508() { // from class: l.᩷᩶ۚ
            @Override // l.InterfaceC22508
            public final void call() throws IOException {
                C7817.m20535(this.f68724, str, i);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20535(C7817 c7817, String str, int i) throws IOException {
        byte[] bArrM20564 = m20564(str);
        c7817.m20530(PublicSuffixDatabase.EXCEPTION_MARKER);
        c7817.m20553(bArrM20564);
        DataOutputStream dataOutputStream = c7817.f25730;
        dataOutputStream.writeByte(1);
        dataOutputStream.writeInt(i);
        dataOutputStream.flush();
        c7817.m20555(5, "Remove attr failed");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20584(final String str, final String str2, final boolean z, final IntConsumer intConsumer) {
        m20542(new InterfaceC22508() { // from class: l.ۜ᩶ۚ
            @Override // l.InterfaceC22508
            public final void call() throws IOException {
                C7817.m20539(this.f23495, str, str2, z, intConsumer);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m20605() throws IOException {
        try {
            m20542(new InterfaceC22508() { // from class: l.᩺᩶ۚ
                @Override // l.InterfaceC22508
                public final void call() throws IOException {
                    C7817.m20557(this.f75333);
                }
            }, true);
        } catch (IOException e) {
            m20548();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20557(C7817 c7817) throws IOException {
        c7817.m20530((byte) 39);
        c7817.f25730.flush();
        c7817.m20555(5, "Ping failed");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20551(C7817 c7817) throws IOException {
        c7817.m20530((byte) 35);
        c7817.f25730.flush();
        c7817.f25723.set(false);
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private C5574 m20566() throws IOException {
        String str;
        int unsignedShort;
        DataInputStream dataInputStream = this.f25724;
        String strM20517 = m20517();
        try {
            int unsignedShort2 = dataInputStream.readUnsignedShort();
            int iM20568 = m20568();
            int iM20569 = m20568();
            long jM20563 = m20563();
            long jM20564 = m20563();
            long jM20565 = m20563();
            if ((61440 & unsignedShort2) == 40960) {
                String strM20518 = m20517();
                try {
                    unsignedShort = dataInputStream.readUnsignedShort();
                    str = strM20518;
                } catch (IOException e) {
                    m20531(e);
                    throw e;
                }
            } else {
                str = null;
                unsignedShort = 0;
            }
            return new C5574(strM20517, unsignedShort2, iM20568, iM20569, jM20563, jM20564, jM20565, str, unsignedShort);
        } catch (IOException e2) {
            m20531(e2);
            throw e2;
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private String m20517() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int iM20567 = m20567();
            if (iM20567 > 0) {
                byteArrayOutputStream.write(iM20567);
            } else {
                return byteArrayOutputStream.toString(a.D);
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C5574 m20519(C7817 c7817, String str) throws IOException {
        byte[] bArrM20546 = m20546(str, "Path");
        c7817.m20530((byte) 22);
        c7817.m20553(bArrM20546);
        c7817.f25730.flush();
        c7817.m20555(5, "Read file info failed");
        return c7817.m20566();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static ArrayList m20521(C7817 c7817, String str) throws IOException {
        int iM20567;
        c7817.getClass();
        byte[] bArrM20546 = m20546(str, "Path");
        c7817.m20530((byte) 37);
        c7817.m20553(bArrM20546);
        c7817.f25730.flush();
        c7817.m20555(30, "List dir failed");
        ArrayList arrayList = new ArrayList();
        while (true) {
            iM20567 = c7817.m20567();
            if (iM20567 != 254) {
                break;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int iM20568 = c7817.m20567();
                if (iM20568 > 0) {
                    byteArrayOutputStream.write(iM20568);
                }
            }
            arrayList.add(byteArrayOutputStream.toByteArray());
        }
        if (iM20567 == 239) {
            return arrayList;
        }
        c7817.close();
        throw new IOException("Error");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m20528(C7817 c7817, String str, boolean z) throws IOException {
        int iM20567;
        c7817.getClass();
        byte[] bArrM20546 = m20546(str, "Path");
        c7817.m20530((byte) 20);
        c7817.m20553(bArrM20546);
        DataOutputStream dataOutputStream = c7817.f25730;
        dataOutputStream.writeBoolean(z);
        dataOutputStream.flush();
        c7817.m20555(30, "List dir failed");
        ArrayList arrayList = new ArrayList();
        while (true) {
            iM20567 = c7817.m20567();
            if (iM20567 != 254) {
                break;
            }
            arrayList.add(c7817.m20566());
        }
        if (iM20567 == 239) {
            return arrayList;
        }
        c7817.close();
        throw new IOException("Error");
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static ArrayList m20545(C7817 c7817, String str) throws IOException {
        int iM20567;
        c7817.getClass();
        byte[] bArrM20546 = m20546(str, "Path");
        c7817.m20530((byte) 42);
        c7817.m20553(bArrM20546);
        DataOutputStream dataOutputStream = c7817.f25730;
        dataOutputStream.writeBoolean(true);
        dataOutputStream.flush();
        c7817.m20555(30, "Checked list dir failed");
        ArrayList arrayList = new ArrayList();
        while (true) {
            iM20567 = c7817.m20567();
            if (iM20567 != 254) {
                break;
            }
            arrayList.add(c7817.m20566());
        }
        if (iM20567 == 255) {
            String strM20517 = c7817.m20517();
            throw new IOException(strM20517.isEmpty() ? "Checked list dir failed" : strM20517);
        }
        if (iM20567 == 239) {
            return arrayList;
        }
        throw c7817.m20565(C8479.m22141(iM20567, "Invalid checked directory stream marker: "));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static ArrayList m20556(C7817 c7817, String str) throws IOException {
        int iM20567;
        c7817.getClass();
        byte[] bArrM20546 = m20546(str, "Path");
        c7817.m20530((byte) 21);
        c7817.m20553(bArrM20546);
        DataOutputStream dataOutputStream = c7817.f25730;
        dataOutputStream.writeBoolean(true);
        dataOutputStream.flush();
        c7817.m20555(30, "List dir failed");
        ArrayList arrayList = new ArrayList();
        while (true) {
            iM20567 = c7817.m20567();
            if (iM20567 != 254) {
                break;
            }
            arrayList.add(c7817.m20517());
        }
        if (iM20567 == 239) {
            return arrayList;
        }
        c7817.close();
        throw new IOException("Error");
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static byte[] m20564(String str) {
        return m20546(C19812.m45052(str), "Path");
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static byte[] m20546(String str, String str2) throws IOException {
        byte[] bytes = str.getBytes(C19812.f63595);
        C16284.m38437(str2, bytes);
        return bytes;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m20553(byte[] bArr) throws IOException {
        int length = bArr.length + 1;
        DataOutputStream dataOutputStream = this.f25730;
        dataOutputStream.writeShort(length);
        dataOutputStream.write(bArr);
        dataOutputStream.write(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m20530(byte b) throws IOException {
        if (!this.f25723.get()) {
            throw new IOException("Connection closed");
        }
        this.f25730.writeByte(b);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m20555(int i, String str) throws IOException {
        if (i == 0) {
            throw new IllegalArgumentException();
        }
        Future futureSubmit = C4716.f16636.submit(new CallableC9457(1, this));
        int i2 = i * 2;
        int i3 = 0;
        while (true) {
            AtomicBoolean atomicBoolean = this.f25723;
            if (i3 < i2) {
                try {
                    byte bByteValue = ((Byte) futureSubmit.get(500L, TimeUnit.MILLISECONDS)).byteValue();
                    if (bByteValue == -1) {
                        String strM20517 = m20517();
                        if (strM20517.isEmpty()) {
                            strM20517 = str;
                        }
                        throw new IOException(strM20517);
                    }
                    if (bByteValue != 0) {
                        if (bByteValue == 1) {
                            return m20568();
                        }
                        if (bByteValue != 2) {
                            throw m20565("Unknown result code: " + ((int) bByteValue));
                        }
                    }
                    return 0;
                } catch (InterruptedException e) {
                    atomicBoolean.set(false);
                    m20548();
                    throw new IOException(e);
                } catch (ExecutionException e2) {
                    Throwable cause = e2.getCause();
                    if (cause instanceof IOException) {
                        throw ((IOException) cause);
                    }
                    if (cause instanceof RuntimeException) {
                        throw ((RuntimeException) cause);
                    }
                    throw new IOException(cause);
                } catch (TimeoutException unused) {
                    i3++;
                }
            } else {
                atomicBoolean.set(false);
                m20548();
                futureSubmit.cancel(true);
                throw new C8142(str + ", timeout after " + i + " seconds");
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Long m20549(C7817 c7817, int i) throws IOException {
        try {
            return Long.valueOf(Features3.receiveFdResponse(i));
        } catch (IOException e) {
            c7817.m20531(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m20596() {
        return this.f25722 == 0;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m20608() {
        return this.f25722 == 2000;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m20571() {
        int i = this.f25722;
        return i == 0 || i == 2000;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m20572() {
        return this.f25722;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f25729 = true;
        if (this.f25720.get()) {
            return;
        }
        try {
            if (this.f25723.get()) {
                m20542(new InterfaceC22508() { // from class: l.ۘ᩶ۚ
                    @Override // l.InterfaceC22508
                    public final void call() throws IOException {
                        C7817.m20551(this.f15206);
                    }
                }, false);
            }
        } finally {
            m20548();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20577() {
        this.f25729 = true;
        if (m20610()) {
            C4716.f16636.submit(new Runnable() { // from class: l.۠᩶ۚ
                @Override // java.lang.Runnable
                public final void run() {
                    C7817 c7817 = this.f29142;
                    c7817.getClass();
                    for (int i = 0; i < 100; i++) {
                        SystemClock.sleep(100L);
                        if (!c7817.m20610()) {
                            break;
                        }
                    }
                    C19431.m44468(c7817);
                    c7817.f25723.set(false);
                }
            });
        } else {
            C19431.m44468(this);
            this.f25723.set(false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m20542(final InterfaceC22508 interfaceC22508, boolean z) {
        this.f25721.lock();
        try {
            if (!this.f25723.get()) {
                throw new IOException("Connection closed");
            }
            if (this.f25725.mo39299() && C13890.m33726()) {
                try {
                    C4716.f16636.submit(new Callable() { // from class: l.ۤ᩶ۚ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            interfaceC22508.call();
                            return null;
                        }
                    }).get();
                } catch (Throwable th) {
                    C19812.m45046(th);
                    throw null;
                }
            } else {
                interfaceC22508.call();
            }
            this.f25728 = z ? System.currentTimeMillis() : 0L;
            this.f25721.unlock();
        } catch (Throwable th2) {
            try {
                C19812.m45046(th2);
                throw null;
            } catch (Throwable th3) {
                this.f25728 = z ? System.currentTimeMillis() : 0L;
                this.f25721.unlock();
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m20524(final InterfaceC1340 interfaceC1340) {
        long jCall;
        this.f25721.lock();
        try {
            if (!this.f25723.get()) {
                throw new IOException("Connection closed");
            }
            if (this.f25725.mo39299() && C13890.m33726()) {
                try {
                    jCall = ((Long) C4716.f16636.submit(new Callable() { // from class: l.ۛ᩶ۚ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Long.valueOf(interfaceC1340.call());
                        }
                    }).get()).longValue();
                } catch (Throwable th) {
                    C19812.m45046(th);
                    throw null;
                }
            } else {
                jCall = interfaceC1340.call();
            }
            this.f25721.unlock();
            this.f25728 = 0L;
            return jCall;
        } catch (Throwable th2) {
            try {
                C19812.m45046(th2);
                throw null;
            } catch (Throwable th3) {
                this.f25721.unlock();
                this.f25728 = 0L;
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Object m20527(final InterfaceC13336 interfaceC13336, boolean z) {
        Object objCall;
        this.f25721.lock();
        try {
            if (!this.f25723.get()) {
                throw new IOException("Connection closed");
            }
            if (this.f25725.mo39299() && C13890.m33726()) {
                try {
                    objCall = C4716.f16636.submit(new Callable() { // from class: l.᩶᩶ۚ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return interfaceC13336.call();
                        }
                    }).get();
                } catch (Throwable th) {
                    C19812.m45046(th);
                    throw null;
                }
            } else {
                objCall = interfaceC13336.call();
            }
            this.f25721.unlock();
            this.f25728 = 0L;
            return objCall;
        } catch (Throwable th2) {
            try {
                if (!z) {
                    C19812.m45046(th2);
                    throw null;
                }
                C19812.m45046(th2);
                throw null;
            } catch (Throwable th3) {
                this.f25721.unlock();
                this.f25728 = 0L;
                throw th3;
            }
        }
    }
}
