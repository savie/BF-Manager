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

/* JADX INFO: renamed from: l.ܶ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N17O */
/* JADX INFO: loaded from: classes4.dex */
public final class C15945 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean f51774;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14759 f51776;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f51777;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final DataInputStream f51778;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final DataOutputStream f51780;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f51782;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile long f51784;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile boolean f51785;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f51781 = new ReentrantLock();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f51775 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f51779 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f51783 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37984(C15945 c15945, String str) throws IOException {
        c15945.getClass();
        byte[] bArrM38003 = m38003(str);
        c15945.m37979((byte) 41);
        c15945.m37998(bArrM38003);
        c15945.f51780.flush();
        c15945.m38010(60, "Remove empty directory failed");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37989(C15945 c15945, String str, String str2, boolean z, IntConsumer intConsumer) throws IOException {
        c15945.getClass();
        byte[] bArrM38007 = m38007(str, "Path");
        byte[] bArrM38003 = m38003(str2);
        c15945.m37979((byte) 34);
        c15945.m37998(bArrM38007);
        c15945.m37998(bArrM38003);
        DataOutputStream dataOutputStream = c15945.f51780;
        dataOutputStream.writeBoolean(z);
        dataOutputStream.flush();
        boolean z2 = false;
        while (true) {
            int iM38010 = c15945.m38010(60, "Copy failed");
            if (iM38010 <= 0) {
                return;
            }
            if (intConsumer != null) {
                try {
                    intConsumer.accept(iM38010);
                } catch (CancellationException unused) {
                    if (!z2) {
                        c15945.m37979((byte) 118);
                        dataOutputStream.flush();
                        z2 = true;
                    }
                } catch (Throwable th) {
                    if (!z2) {
                        try {
                            c15945.m37979((byte) 118);
                            dataOutputStream.flush();
                        } catch (IOException e) {
                            th.addSuppressed(e);
                        }
                    }
                    c15945.f51775.set(false);
                    c15945.m37969();
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m37995(C15945 c15945, String str) throws IOException {
        c15945.getClass();
        byte[] bArrM38007 = m38007(str, "Path");
        c15945.m37979((byte) 24);
        c15945.m37998(bArrM38007);
        c15945.f51780.flush();
        c15945.m38010(5, "realPath failed");
        return c15945.m38004();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37997(C15945 c15945, String str, String str2) throws IOException {
        c15945.getClass();
        byte[] bArrM38003 = m38003(str);
        byte[] bArrM38004 = m38003(str2);
        c15945.m37979((byte) 29);
        c15945.m37998(bArrM38003);
        c15945.m37998(bArrM38004);
        c15945.f51780.flush();
        c15945.m38010(60, "Move failed");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m37999(C15945 c15945, String str) throws IOException {
        c15945.getClass();
        byte[] bArrM38007 = m38007(str, "Path");
        c15945.m37979((byte) 38);
        c15945.m37998(bArrM38007);
        c15945.f51780.flush();
        c15945.m38010(5, "get file actual size failed");
        return c15945.m38001();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static Boolean m38000(C15945 c15945, String str) throws IOException {
        c15945.getClass();
        byte[] bArrM38007 = m38007(str, "Path");
        c15945.m37979((byte) 25);
        c15945.m37998(bArrM38007);
        c15945.f51780.flush();
        c15945.m38010(5, "Check exists failed");
        try {
            return Boolean.valueOf(c15945.f51778.readByte() != 0);
        } catch (IOException e) {
            c15945.m37980(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38002(C15945 c15945, String str) throws IOException {
        c15945.getClass();
        byte[] bArrM38003 = m38003(str);
        c15945.m37979((byte) 40);
        c15945.m37998(bArrM38003);
        c15945.f51780.flush();
        c15945.m38010(60, "Unlink file or link failed");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m38016(C15945 c15945, String str, String str2) throws IOException {
        c15945.getClass();
        byte[] bArrM38007 = m38007(str, "Path");
        byte[] bArrM38003 = m38003(str2);
        c15945.m37979((byte) 23);
        c15945.m37998(bArrM38007);
        c15945.m37998(bArrM38003);
        c15945.f51780.flush();
        c15945.m38010(5, "Symlink failed");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38017(C15945 c15945, String str, boolean z) throws IOException {
        c15945.getClass();
        byte[] bArrM38003 = m38003(str);
        c15945.m37979(ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB);
        c15945.m37998(bArrM38003);
        DataOutputStream dataOutputStream = c15945.f51780;
        dataOutputStream.writeBoolean(z);
        dataOutputStream.flush();
        c15945.m38010(5, "Mkdir failed");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37990(C15945 c15945, byte[] bArr) throws IOException {
        C21167.m48274("Path", bArr);
        c15945.m37979((byte) 30);
        c15945.m37998(bArr);
        c15945.f51780.flush();
        c15945.m38010(60, "Remove failed");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37991(C15945 c15945, byte[] bArr, byte[] bArr2) throws IOException {
        C21167.m48274("Path", bArr);
        C21167.m48274("Path", bArr2);
        c15945.m37979((byte) 29);
        c15945.m37998(bArr);
        c15945.m37998(bArr2);
        c15945.f51780.flush();
        c15945.m38010(60, "Move failed");
    }

    public C15945(InterfaceC14759 interfaceC14759, boolean z) throws IOException {
        this.f51776 = interfaceC14759;
        this.f51774 = z;
        DataInputStream dataInputStream = new DataInputStream(new C16691(this, interfaceC14759.getInputStream()));
        this.f51778 = dataInputStream;
        this.f51780 = new DataOutputStream(new C17437(this, new BufferedOutputStream(interfaceC14759.getOutputStream(), interfaceC14759.getSendBufferSize())));
        byte[] bArr = new byte[4];
        try {
            dataInputStream.readFully(bArr, 0, 4);
            if (!Arrays.equals(bArr, C4013.f13714)) {
                throw new IOException("Magic error");
            }
            this.f51782 = m37970();
            this.f51777 = m37970();
        } catch (IOException e) {
            m37980(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m38061() {
        this.f51784 = 0L;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m38053() {
        String.format("[%08x]", Integer.valueOf(hashCode()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m37980(IOException iOException) {
        m38053();
        this.f51775.set(false);
        m37969();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private IOException m38020(String str) {
        IOException iOException = new IOException(str);
        m38053();
        this.f51775.set(false);
        m37969();
        return iOException;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private void m37969() {
        if (this.f51779.compareAndSet(false, true)) {
            this.f51775.set(false);
            C20244.m46520(this.f51776);
        }
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    private int m38009() throws IOException {
        try {
            int i = this.f51778.read();
            if (i >= 0) {
                return i;
            }
            EOFException eOFException = new EOFException("Connection closed");
            m37980(eOFException);
            throw eOFException;
        } catch (IOException e) {
            m37980(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte m37971(C15945 c15945) throws IOException {
        try {
            return c15945.f51778.readByte();
        } catch (IOException e) {
            c15945.m37980(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private int m37970() throws IOException {
        try {
            return this.f51778.readInt();
        } catch (IOException e) {
            m37980(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private long m38001() throws IOException {
        try {
            return this.f51778.readLong();
        } catch (IOException e) {
            m37980(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InputStream m38041(String str) {
        String str2 = "r";
        ParcelFileDescriptor parcelFileDescriptorM38052 = m38052(str, "r");
        if (parcelFileDescriptorM38052 != null) {
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptorM38052);
        }
        return new BufferedInputStream(new C20421((C3267) m37976((InterfaceC19456) new C23932(this, str, str2), true)), this.f51782);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final OutputStream m38037(String str, boolean z) {
        String strM12981 = C4013.m12981(str);
        ParcelFileDescriptor parcelFileDescriptorM38052 = m38052(strM12981, z ? am.av : "w");
        if (parcelFileDescriptorM38052 != null) {
            return new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorM38052);
        }
        return new BufferedOutputStream(new C12216((C3267) m37976((InterfaceC19456) new C23932(this, strM12981, z ? am.av : "w"), true)), this.f51782);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC15475 m38060(String str, String str2) {
        if (C4013.m12979(str2)) {
            str = C4013.m12981(str);
        }
        ParcelFileDescriptor parcelFileDescriptorM38052 = m38052(str, str2);
        if (parcelFileDescriptorM38052 != null) {
            return new C24151(parcelFileDescriptorM38052, str, str2, this.f51774);
        }
        return new C6251((C3267) m37976((InterfaceC19456) new C23932(this, str, str2), true), str, str2);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m38044() {
        return this.f51781.isLocked() || this.f51783.get() > 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ParcelFileDescriptor m38052(final String str, final String str2) {
        InterfaceC14759 interfaceC14759 = this.f51776;
        if (!interfaceC14759.mo35492()) {
            return null;
        }
        final String strSubstring = str.substring(0, str.lastIndexOf(47) + 1);
        if (C4013.f13711.contains(strSubstring)) {
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
        final int iMo35491 = interfaceC14759.mo35491();
        if (iMo35491 < 0) {
            return null;
        }
        return (ParcelFileDescriptor) m37976(new InterfaceC19456() { // from class: l.᩶֡ᩴ
            @Override // l.InterfaceC19456
            public final Object call() {
                return C15945.m37975(this.f67014, str, str2, iMo35491, strSubstring);
            }
        }, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ParcelFileDescriptor m37975(final C15945 c15945, String str, String str2, final int i, String str3) throws IOException {
        byte bM12984 = C4013.m12984(str2);
        byte[] bArrM38007 = m38007(str, "Path");
        c15945.m37979((byte) 10);
        c15945.m37998(bArrM38007);
        DataOutputStream dataOutputStream = c15945.f51780;
        dataOutputStream.writeByte(bM12984);
        dataOutputStream.flush();
        AtomicBoolean atomicBoolean = c15945.f51775;
        Future futureSubmit = C5261.f18540.submit(new Callable() { // from class: l.ۙ۟ᩴ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C15945.m37994(this.f16717, i);
            }
        });
        for (int i2 = 0; i2 < 10; i2++) {
            try {
                long jLongValue = ((Long) futureSubmit.get(500L, TimeUnit.MILLISECONDS)).longValue();
                byte b = (byte) ((jLongValue >>> 32) & 255);
                if (b == -1) {
                    String strM38004 = c15945.m38004();
                    if (strM38004.isEmpty()) {
                        strM38004 = "Open fd failed";
                    }
                    throw new IOException(strM38004);
                }
                if (b != 0) {
                    throw c15945.m38020(C13645.m33382(b, "Unknown open fd result code: "));
                }
                int i3 = (int) jLongValue;
                if (i3 >= 0) {
                    return ParcelFileDescriptor.adoptFd(i3);
                }
                C4013.f13711.add(str3);
                return null;
            } catch (InterruptedException e) {
                atomicBoolean.set(false);
                c15945.m37969();
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
        c15945.m37969();
        futureSubmit.cancel(true);
        throw new C3090("Open fd failed, timeout after 5 seconds");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3267 m37978(C15945 c15945, String str, String str2) throws IOException {
        byte bM12984 = C4013.m12984(str2);
        byte[] bArrM38007 = m38007(str, "Path");
        c15945.m37979((byte) 11);
        c15945.m37998(bArrM38007);
        DataOutputStream dataOutputStream = c15945.f51780;
        dataOutputStream.writeByte(bM12984);
        dataOutputStream.flush();
        c15945.m38010(5, "Open failed");
        try {
            C3267 c3267 = new C3267(c15945, c15945.f51778.readUnsignedShort());
            c15945.f51783.incrementAndGet();
            return c3267;
        } catch (IOException e) {
            c15945.m37980(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m37972(C15945 c15945, int i, int i2, int i3, byte[] bArr) throws IOException {
        DataOutputStream dataOutputStream = c15945.f51780;
        if (i2 < 0 || i3 < 0 || i3 > bArr.length || i2 > bArr.length - i3) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        int iMin = Math.min(i2, c15945.f51782);
        c15945.m37979((byte) 12);
        dataOutputStream.writeShort(i);
        dataOutputStream.writeInt(iMin);
        dataOutputStream.flush();
        c15945.m38010(8, "Read failed");
        int iM37970 = c15945.m37970();
        if (iM37970 < 0 || iM37970 > iMin || iM37970 > bArr.length - i3) {
            throw c15945.m38020(C13645.m33382(iM37970, "Invalid read size: "));
        }
        try {
            c15945.f51778.readFully(bArr, i3, iM37970);
            if (iM37970 == 0) {
                return -1;
            }
            return iM37970;
        } catch (IOException e) {
            c15945.m37980(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m38055(final int i, final byte[] bArr, final int i2, final int i3) {
        m37981(new InterfaceC10505() { // from class: l.֨֡ᩴ
            @Override // l.InterfaceC10505
            public final void call() throws IOException {
                C15945.m38014(this.f3086, i, i3, i2, bArr);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38014(C15945 c15945, int i, int i2, int i3, byte[] bArr) throws IOException {
        DataOutputStream dataOutputStream = c15945.f51780;
        if (i2 < 0 || i3 < 0 || i3 > bArr.length || i2 > bArr.length - i3) {
            throw new ArrayIndexOutOfBoundsException();
        }
        c15945.m37979(cb.k);
        dataOutputStream.writeShort(i);
        dataOutputStream.writeInt(i2);
        dataOutputStream.write(bArr, i3, i2);
        dataOutputStream.flush();
        c15945.m38010(8, "Write failed");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m38038(final int i) {
        m37981(new InterfaceC10505() { // from class: l.ۜ֡ᩴ
            @Override // l.InterfaceC10505
            public final void call() throws IOException {
                C15945.m38019(this.f22596, i);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38019(C15945 c15945, int i) throws IOException {
        c15945.m37979(cb.f82047l);
        DataOutputStream dataOutputStream = c15945.f51780;
        dataOutputStream.writeShort(i);
        dataOutputStream.flush();
        c15945.m38010(8, "Sync failed");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38023(final int i) {
        m37981(new InterfaceC10505() { // from class: l.۠֡ᩴ
            @Override // l.InterfaceC10505
            public final void call() {
                C15945.m38013(this.f27213, i);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38013(C15945 c15945, int i) {
        AtomicInteger atomicInteger = c15945.f51783;
        DataOutputStream dataOutputStream = c15945.f51780;
        try {
            try {
                c15945.m37979((byte) 15);
                dataOutputStream.writeShort(i);
                dataOutputStream.flush();
                c15945.m38010(8, "Close failed");
                atomicInteger.decrementAndGet();
            } catch (IOException e) {
                c15945.f51775.set(false);
                c15945.m37969();
                throw e;
            }
        } catch (Throwable th) {
            atomicInteger.decrementAndGet();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long m38058(final int i) {
        return m37974(new InterfaceC22440() { // from class: l.ۤ۟ᩴ
            @Override // l.InterfaceC22440
            public final long call() {
                return C15945.m38005(this.f34060, i);
            }
        });
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ long m38005(C15945 c15945, int i) throws IOException {
        c15945.m37979((byte) 16);
        DataOutputStream dataOutputStream = c15945.f51780;
        dataOutputStream.writeShort(i);
        dataOutputStream.flush();
        c15945.m38010(5, "Tell failed");
        return c15945.m38001();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38024(final int i, final long j) {
        m37981(new InterfaceC10505() { // from class: l.ۡ֡ᩴ
            @Override // l.InterfaceC10505
            public final void call() throws IOException {
                C15945.m38015(this.f29364, i, j);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38015(C15945 c15945, int i, long j) throws IOException {
        c15945.m37979((byte) 17);
        DataOutputStream dataOutputStream = c15945.f51780;
        dataOutputStream.writeShort(i);
        dataOutputStream.writeLong(j);
        dataOutputStream.flush();
        c15945.m38010(5, "Seek failed");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m38050(final int i) {
        return m37974(new InterfaceC22440() { // from class: l.۟֡ᩴ
            @Override // l.InterfaceC22440
            public final long call() {
                return C15945.m37973(this.f24847, i);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ long m37973(C15945 c15945, int i) throws IOException {
        c15945.m37979((byte) 18);
        DataOutputStream dataOutputStream = c15945.f51780;
        dataOutputStream.writeShort(i);
        dataOutputStream.flush();
        c15945.m38010(5, "Length failed");
        return c15945.m38001();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m38054(final int i, final long j) {
        m37981(new InterfaceC10505() { // from class: l.ᩳ֡ᩴ
            @Override // l.InterfaceC10505
            public final void call() throws IOException {
                C15945.m37982(this.f60832, i, j);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37982(C15945 c15945, int i, long j) throws IOException {
        c15945.m37979((byte) 19);
        DataOutputStream dataOutputStream = c15945.f51780;
        dataOutputStream.writeShort(i);
        dataOutputStream.writeLong(j);
        dataOutputStream.flush();
        c15945.m38010(5, "Truncate failed");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m38021(final String str, final boolean z) {
        return (List) m37976(new InterfaceC19456() { // from class: l.ۗ֡ᩴ
            @Override // l.InterfaceC19456
            public final Object call() {
                return C15945.m37977(this.f9878, str, z);
            }
        }, true);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List m38059(final String str) {
        return (List) m37976(new InterfaceC19456() { // from class: l.᩹֡ᩴ
            @Override // l.InterfaceC19456
            public final Object call() {
                return C15945.m38006(this.f75133, str);
            }
        }, true);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List m38049(final String str) {
        return (List) m37976(new InterfaceC19456() { // from class: l.᩸۟ᩴ
            @Override // l.InterfaceC19456
            public final Object call() {
                return C15945.m38011(this.f73579, str);
            }
        }, true);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List m38043(final String str) {
        return (List) m37976(new InterfaceC19456() { // from class: l.᩻֡ᩴ
            @Override // l.InterfaceC19456
            public final Object call() {
                return C15945.m37968(this.f79859, str);
            }
        }, true);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C21694 m38034(final String str) {
        return (C21694) m37976(new InterfaceC19456() { // from class: l.֫֡ᩴ
            @Override // l.InterfaceC19456
            public final Object call() {
                return C15945.m38018(this.f5379, str);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m38051(final String str) {
        return m37974(new InterfaceC22440() { // from class: l.ܰ֡ᩴ
            @Override // l.InterfaceC22440
            public final long call() {
                return C15945.m37999(this.f44974, str);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38028(final String str, final String str2) {
        m37981(new InterfaceC10505() { // from class: l.᩷۟ᩴ
            @Override // l.InterfaceC10505
            public final void call() throws IOException {
                C15945.m38016(this.f70762, str, str2);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m38040(final String str) {
        return (String) m37976(new InterfaceC19456() { // from class: l.᩻۟ᩴ
            @Override // l.InterfaceC19456
            public final Object call() {
                return C15945.m37995(this.f80568, str);
            }
        }, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m38032(final String str) {
        return ((Boolean) m37976(new InterfaceC19456() { // from class: l.۫۟ᩴ
            @Override // l.InterfaceC19456
            public final Object call() {
                return C15945.m38000(this.f41559, str);
            }
        }, true)).booleanValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean[] m38033(final String str, final ArrayList arrayList) throws IOException {
        if (arrayList.size() > 65535) {
            throw new IOException("Too many names");
        }
        if (!str.endsWith("/")) {
            str = str.concat("/");
        }
        return (boolean[]) m37976(new InterfaceC19456() { // from class: l.ܺ֡ᩴ
            @Override // l.InterfaceC19456
            public final Object call() {
                return C15945.m37992(this.f53424, str, arrayList);
            }
        }, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean[] m37992(C15945 c15945, String str, ArrayList arrayList) throws IOException {
        DataOutputStream dataOutputStream = c15945.f51780;
        byte[] bArrM38007 = m38007(str, "Base path");
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] bArrM38008 = m38007((String) it.next(), "Name");
            if (bArrM38007.length + bArrM38008.length + 1 > 4097) {
                throw new IOException("Combined path too long");
            }
            arrayList2.add(bArrM38008);
        }
        c15945.m37979((byte) 36);
        c15945.m37998(bArrM38007);
        dataOutputStream.writeShort(arrayList.size());
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            c15945.m37998((byte[]) it2.next());
        }
        dataOutputStream.flush();
        c15945.m38010(5, "Check batch exists failed");
        int size = arrayList.size();
        boolean[] zArr = new boolean[size];
        for (int i = 0; i < size; i++) {
            try {
                zArr[i] = c15945.f51778.readByte() != 0;
            } catch (IOException e) {
                c15945.m37980(e);
                throw e;
            }
        }
        return zArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38027(final String str, final int i, final boolean z, final boolean z2) {
        m37981(new InterfaceC10505() { // from class: l.ۢ֡ᩴ
            @Override // l.InterfaceC10505
            public final void call() throws IOException {
                C15945.m37987(this.f31473, str, i, z, z2);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37987(C15945 c15945, String str, int i, boolean z, boolean z2) throws IOException {
        byte[] bArrM38003 = m38003(str);
        c15945.m37979((byte) 26);
        c15945.m37998(bArrM38003);
        DataOutputStream dataOutputStream = c15945.f51780;
        dataOutputStream.writeShort(i);
        dataOutputStream.writeBoolean(z);
        dataOutputStream.writeBoolean(z2);
        dataOutputStream.flush();
        c15945.m38010(5, "Chmod failed");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38026(final String str, final int i, final int i2, final boolean z, final boolean z2) {
        m37981(new InterfaceC10505() { // from class: l.ۧ֡ᩴ
            @Override // l.InterfaceC10505
            public final void call() throws IOException {
                C15945.m37986(this.f35522, str, i, i2, z, z2);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37986(C15945 c15945, String str, int i, int i2, boolean z, boolean z2) throws IOException {
        byte[] bArrM38003 = m38003(str);
        c15945.m37979((byte) 27);
        c15945.m37998(bArrM38003);
        DataOutputStream dataOutputStream = c15945.f51780;
        dataOutputStream.writeInt(i);
        dataOutputStream.writeInt(i2);
        dataOutputStream.writeBoolean(z);
        dataOutputStream.writeBoolean(z2);
        dataOutputStream.flush();
        c15945.m38010(5, "Chown failed");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m38056(final String str, final boolean z) {
        m37981(new InterfaceC10505() { // from class: l.ܶ֡ᩴ
            @Override // l.InterfaceC10505
            public final void call() throws IOException {
                C15945.m38017(this.f51159, str, z);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m38039(final String str, final String str2) {
        m37981(new InterfaceC10505() { // from class: l.ۧ۟ᩴ
            @Override // l.InterfaceC10505
            public final void call() throws IOException {
                C15945.m37997(this.f36079, str, str2);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38031(final byte[] bArr, final byte[] bArr2) {
        m37981(new InterfaceC10505() { // from class: l.ۚ۟ᩴ
            @Override // l.InterfaceC10505
            public final void call() throws IOException {
                C15945.m37991(this.f19157, bArr, bArr2);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m38062(final String str) {
        m37981(new InterfaceC10505() { // from class: l.֫۟ᩴ
            @Override // l.InterfaceC10505
            public final void call() throws IOException {
                C15945.m37993(this.f6081, str);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37993(C15945 c15945, String str) throws IOException {
        byte[] bArrM38003 = m38003(str);
        c15945.m37979((byte) 30);
        c15945.m37998(bArrM38003);
        c15945.f51780.flush();
        c15945.m38010(60, "Remove failed");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m38057(final byte[] bArr) {
        m37981(new InterfaceC10505() { // from class: l.᩵֡ᩴ
            @Override // l.InterfaceC10505
            public final void call() throws IOException {
                C15945.m37990(this.f64853, bArr);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m38047(final String str) {
        m37981(new InterfaceC10505() { // from class: l.ᩴ۟ᩴ
            @Override // l.InterfaceC10505
            public final void call() throws IOException {
                C15945.m38002(this.f63367, str);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m38046(final String str) {
        m37981(new InterfaceC10505() { // from class: l.ۖ֡ᩴ
            @Override // l.InterfaceC10505
            public final void call() throws IOException {
                C15945.m37984(this.f7464, str);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38025(final long j, final String str) {
        m37981(new InterfaceC10505() { // from class: l.ܳ۟ᩴ
            @Override // l.InterfaceC10505
            public final void call() throws IOException {
                C15945.m37988(this.f49610, str, j);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37988(C15945 c15945, String str, long j) throws IOException {
        byte[] bArrM38003 = m38003(str);
        c15945.m37979(bo.j);
        c15945.m37998(bArrM38003);
        DataOutputStream dataOutputStream = c15945.f51780;
        dataOutputStream.writeLong(j);
        dataOutputStream.flush();
        c15945.m38010(5, "Set time failed");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38030(final String str, EnumC21473... enumC21473Arr) {
        final int i = 0;
        for (EnumC21473 enumC21473 : enumC21473Arr) {
            i |= enumC21473.f68615;
        }
        m37981(new InterfaceC10505() { // from class: l.ۛ֡ᩴ
            @Override // l.InterfaceC10505
            public final void call() throws IOException {
                C15945.m37985(this.f20628, str, i);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37985(C15945 c15945, String str, int i) throws IOException {
        byte[] bArrM38003 = m38003(str);
        c15945.m37979(PublicSuffixDatabase.EXCEPTION_MARKER);
        c15945.m37998(bArrM38003);
        DataOutputStream dataOutputStream = c15945.f51780;
        dataOutputStream.writeByte(1);
        dataOutputStream.writeInt(i);
        dataOutputStream.flush();
        c15945.m38010(5, "Remove attr failed");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38029(final String str, final String str2, final boolean z, final IntConsumer intConsumer) {
        m37981(new InterfaceC10505() { // from class: l.۫֡ᩴ
            @Override // l.InterfaceC10505
            public final void call() throws IOException {
                C15945.m37989(this.f40788, str, str2, z, intConsumer);
            }
        }, false);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m38045() throws IOException {
        try {
            m37981(new InterfaceC10505() { // from class: l.ۚ֡ᩴ
                @Override // l.InterfaceC10505
                public final void call() throws IOException {
                    C15945.m38012(this.f18611);
                }
            }, true);
        } catch (IOException e) {
            m37969();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38012(C15945 c15945) throws IOException {
        c15945.m37979((byte) 39);
        c15945.f51780.flush();
        c15945.m38010(5, "Ping failed");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37996(C15945 c15945) throws IOException {
        c15945.m37979((byte) 35);
        c15945.f51780.flush();
        c15945.f51775.set(false);
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private C21694 m38008() throws IOException {
        String str;
        int unsignedShort;
        DataInputStream dataInputStream = this.f51778;
        String strM38004 = m38004();
        try {
            int unsignedShort2 = dataInputStream.readUnsignedShort();
            int iM37970 = m37970();
            int iM37971 = m37970();
            long jM38001 = m38001();
            long jM38002 = m38001();
            long jM38003 = m38001();
            if ((61440 & unsignedShort2) == 40960) {
                String strM38005 = m38004();
                try {
                    unsignedShort = dataInputStream.readUnsignedShort();
                    str = strM38005;
                } catch (IOException e) {
                    m37980(e);
                    throw e;
                }
            } else {
                str = null;
                unsignedShort = 0;
            }
            return new C21694(strM38004, unsignedShort2, iM37970, iM37971, jM38001, jM38002, jM38003, str, unsignedShort);
        } catch (IOException e2) {
            m37980(e2);
            throw e2;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private String m38004() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int iM38009 = m38009();
            if (iM38009 > 0) {
                byteArrayOutputStream.write(iM38009);
            } else {
                return byteArrayOutputStream.toString(a.D);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m37968(C15945 c15945, String str) throws IOException {
        int iM38009;
        c15945.getClass();
        byte[] bArrM38007 = m38007(str, "Path");
        c15945.m37979((byte) 37);
        c15945.m37998(bArrM38007);
        c15945.f51780.flush();
        c15945.m38010(30, "List dir failed");
        ArrayList arrayList = new ArrayList();
        while (true) {
            iM38009 = c15945.m38009();
            if (iM38009 != 254) {
                break;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int iM380010 = c15945.m38009();
                if (iM380010 > 0) {
                    byteArrayOutputStream.write(iM380010);
                }
            }
            arrayList.add(byteArrayOutputStream.toByteArray());
        }
        if (iM38009 == 239) {
            return arrayList;
        }
        c15945.close();
        throw new IOException("Error");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m37977(C15945 c15945, String str, boolean z) throws IOException {
        int iM38009;
        c15945.getClass();
        byte[] bArrM38007 = m38007(str, "Path");
        c15945.m37979((byte) 20);
        c15945.m37998(bArrM38007);
        DataOutputStream dataOutputStream = c15945.f51780;
        dataOutputStream.writeBoolean(z);
        dataOutputStream.flush();
        c15945.m38010(30, "List dir failed");
        ArrayList arrayList = new ArrayList();
        while (true) {
            iM38009 = c15945.m38009();
            if (iM38009 != 254) {
                break;
            }
            arrayList.add(c15945.m38008());
        }
        if (iM38009 == 239) {
            return arrayList;
        }
        c15945.close();
        throw new IOException("Error");
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static ArrayList m38006(C15945 c15945, String str) throws IOException {
        int iM38009;
        c15945.getClass();
        byte[] bArrM38007 = m38007(str, "Path");
        c15945.m37979((byte) 42);
        c15945.m37998(bArrM38007);
        DataOutputStream dataOutputStream = c15945.f51780;
        dataOutputStream.writeBoolean(true);
        dataOutputStream.flush();
        c15945.m38010(30, "Checked list dir failed");
        ArrayList arrayList = new ArrayList();
        while (true) {
            iM38009 = c15945.m38009();
            if (iM38009 != 254) {
                break;
            }
            arrayList.add(c15945.m38008());
        }
        if (iM38009 == 255) {
            String strM38004 = c15945.m38004();
            throw new IOException(strM38004.isEmpty() ? "Checked list dir failed" : strM38004);
        }
        if (iM38009 == 239) {
            return arrayList;
        }
        throw c15945.m38020(C13645.m33382(iM38009, "Invalid checked directory stream marker: "));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static ArrayList m38011(C15945 c15945, String str) throws IOException {
        int iM38009;
        c15945.getClass();
        byte[] bArrM38007 = m38007(str, "Path");
        c15945.m37979((byte) 21);
        c15945.m37998(bArrM38007);
        DataOutputStream dataOutputStream = c15945.f51780;
        dataOutputStream.writeBoolean(true);
        dataOutputStream.flush();
        c15945.m38010(30, "List dir failed");
        ArrayList arrayList = new ArrayList();
        while (true) {
            iM38009 = c15945.m38009();
            if (iM38009 != 254) {
                break;
            }
            arrayList.add(c15945.m38004());
        }
        if (iM38009 == 239) {
            return arrayList;
        }
        c15945.close();
        throw new IOException("Error");
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C21694 m38018(C15945 c15945, String str) throws IOException {
        byte[] bArrM38007 = m38007(str, "Path");
        c15945.m37979((byte) 22);
        c15945.m37998(bArrM38007);
        c15945.f51780.flush();
        c15945.m38010(5, "Read file info failed");
        return c15945.m38008();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static byte[] m38003(String str) {
        return m38007(C4013.m12981(str), "Path");
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static byte[] m38007(String str, String str2) throws IOException {
        byte[] bytes = str.getBytes(C4013.f13715);
        C21167.m48274(str2, bytes);
        return bytes;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m37998(byte[] bArr) throws IOException {
        int length = bArr.length + 1;
        DataOutputStream dataOutputStream = this.f51780;
        dataOutputStream.writeShort(length);
        dataOutputStream.write(bArr);
        dataOutputStream.write(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37979(byte b) throws IOException {
        if (!this.f51775.get()) {
            throw new IOException("Connection closed");
        }
        this.f51780.writeByte(b);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m38010(int i, String str) throws IOException {
        if (i == 0) {
            throw new IllegalArgumentException();
        }
        Future futureSubmit = C5261.f18540.submit(new CallableC24545(1, this));
        int i2 = i * 2;
        int i3 = 0;
        while (true) {
            AtomicBoolean atomicBoolean = this.f51775;
            if (i3 < i2) {
                try {
                    byte bByteValue = ((Byte) futureSubmit.get(500L, TimeUnit.MILLISECONDS)).byteValue();
                    if (bByteValue == -1) {
                        String strM38004 = m38004();
                        if (strM38004.isEmpty()) {
                            strM38004 = str;
                        }
                        throw new IOException(strM38004);
                    }
                    if (bByteValue != 0) {
                        if (bByteValue == 1) {
                            return m37970();
                        }
                        if (bByteValue != 2) {
                            throw m38020("Unknown result code: " + ((int) bByteValue));
                        }
                    }
                    return 0;
                } catch (InterruptedException e) {
                    atomicBoolean.set(false);
                    m37969();
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
                m37969();
                futureSubmit.cancel(true);
                throw new C3090(str + ", timeout after " + i + " seconds");
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Long m37994(C15945 c15945, int i) throws IOException {
        try {
            return Long.valueOf(Features3.receiveFdResponse(i));
        } catch (IOException e) {
            c15945.m37980(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m38035() {
        return this.f51777 == 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m38048() {
        return this.f51777 == 2000;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m38042() {
        int i = this.f51777;
        return i == 0 || i == 2000;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m38036() {
        return this.f51777;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f51785 = true;
        if (this.f51779.get()) {
            return;
        }
        try {
            if (this.f51775.get()) {
                m37981(new InterfaceC10505() { // from class: l.ܳ֡ᩴ
                    @Override // l.InterfaceC10505
                    public final void call() throws IOException {
                        C15945.m37996(this.f48900);
                    }
                }, false);
            }
        } finally {
            m37969();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38022() {
        this.f51785 = true;
        if (m38044()) {
            C5261.f18540.submit(new Runnable() { // from class: l.ܽ֡ᩴ
                @Override // java.lang.Runnable
                public final void run() {
                    C15945 c15945 = this.f56113;
                    c15945.getClass();
                    for (int i = 0; i < 100; i++) {
                        SystemClock.sleep(100L);
                        if (!c15945.m38044()) {
                            break;
                        }
                    }
                    C20244.m46520(c15945);
                    c15945.f51775.set(false);
                }
            });
        } else {
            C20244.m46520(this);
            this.f51775.set(false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37981(final InterfaceC10505 interfaceC10505, boolean z) {
        this.f51781.lock();
        try {
            if (!this.f51775.get()) {
                throw new IOException("Connection closed");
            }
            if (this.f51776.mo35490() && C22415.m50555()) {
                try {
                    C5261.f18540.submit(new Callable() { // from class: l.ۨ֡ᩴ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            interfaceC10505.call();
                            return null;
                        }
                    }).get();
                } catch (Throwable th) {
                    C4013.m12976(th);
                    throw null;
                }
            } else {
                interfaceC10505.call();
            }
            this.f51784 = z ? System.currentTimeMillis() : 0L;
            this.f51781.unlock();
        } catch (Throwable th2) {
            try {
                C4013.m12976(th2);
                throw null;
            } catch (Throwable th3) {
                this.f51784 = z ? System.currentTimeMillis() : 0L;
                this.f51781.unlock();
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m37974(final InterfaceC22440 interfaceC22440) {
        long jCall;
        this.f51781.lock();
        try {
            if (!this.f51775.get()) {
                throw new IOException("Connection closed");
            }
            if (this.f51776.mo35490() && C22415.m50555()) {
                try {
                    jCall = ((Long) C5261.f18540.submit(new Callable() { // from class: l.֡֡ᩴ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Long.valueOf(interfaceC22440.call());
                        }
                    }).get()).longValue();
                } catch (Throwable th) {
                    C4013.m12976(th);
                    throw null;
                }
            } else {
                jCall = interfaceC22440.call();
            }
            this.f51781.unlock();
            this.f51784 = 0L;
            return jCall;
        } catch (Throwable th2) {
            try {
                C4013.m12976(th2);
                throw null;
            } catch (Throwable th3) {
                this.f51781.unlock();
                this.f51784 = 0L;
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Object m37976(final InterfaceC19456 interfaceC19456, boolean z) {
        Object objCall;
        this.f51781.lock();
        try {
            if (!this.f51775.get()) {
                throw new IOException("Connection closed");
            }
            if (this.f51776.mo35490() && C22415.m50555()) {
                try {
                    objCall = C5261.f18540.submit(new Callable() { // from class: l.ۘ֡ᩴ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return interfaceC19456.call();
                        }
                    }).get();
                } catch (Throwable th) {
                    C4013.m12976(th);
                    throw null;
                }
            } else {
                objCall = interfaceC19456.call();
            }
            this.f51781.unlock();
            this.f51784 = 0L;
            return objCall;
        } catch (Throwable th2) {
            try {
                if (!z) {
                    C4013.m12976(th2);
                    throw null;
                }
                C4013.m12976(th2);
                throw null;
            } catch (Throwable th3) {
                this.f51781.unlock();
                this.f51784 = 0L;
                throw th3;
            }
        }
    }
}
