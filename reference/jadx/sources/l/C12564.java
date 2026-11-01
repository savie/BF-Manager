package l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.۫ᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06TX */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C12564 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31275(InterfaceC3800 interfaceC3800, byte[] bArr) throws IOException {
        FileChannel fileChannelOpen = C6001.open(interfaceC3800, EnumC17912.CREATE_NEW, EnumC17912.WRITE);
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            while (byteBufferWrap.hasRemaining()) {
                if (fileChannelOpen.write(byteBufferWrap) <= 0) {
                    throw new IOException("App migration write made no progress");
                }
            }
            fileChannelOpen.force(true);
            fileChannelOpen.close();
        } catch (Throwable th) {
            if (fileChannelOpen != null) {
                try {
                    fileChannelOpen.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31274(InterfaceC3800 interfaceC3800) throws IOException {
        C11153.m28084(interfaceC3800);
        FileChannel fileChannelOpen = C6001.open(interfaceC3800, EnumC17912.WRITE, EnumC22146.NOFOLLOW_LINKS);
        try {
            fileChannelOpen.force(true);
            fileChannelOpen.close();
        } catch (Throwable th) {
            if (fileChannelOpen != null) {
                try {
                    fileChannelOpen.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
