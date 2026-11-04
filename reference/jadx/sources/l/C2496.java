package l;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.EnumSet;

/* JADX INFO: renamed from: l.ۖۜܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: R89U */
/* JADX INFO: loaded from: classes3.dex */
public final class C2496 extends AbstractC9207 implements Closeable {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final EnumSet f7996;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final EnumSet f7997;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final EnumSet f7998;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f7999;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C25398 f8000;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f8001;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C24279 f8002;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f8003;

    static {
        EnumC20243 enumC20243 = EnumC20243.STATUS_SUCCESS;
        EnumC20243 enumC20244 = EnumC20243.STATUS_BUFFER_OVERFLOW;
        f7996 = EnumSet.of(enumC20243, enumC20244);
        f7998 = EnumSet.of(enumC20243, enumC20244, EnumC20243.STATUS_END_OF_FILE);
        f7997 = EnumSet.of(enumC20243);
    }

    public C2496(C10852 c10852, C24279 c24279, String str) {
        super(c10852, c24279.m4267().m23243());
        this.f8002 = c24279;
        this.f8000 = ((C13221) m24362(new C15458(c10852.m27585().m48065().m1341(), c10852.m27586(), c24279.m4267().m23241(), EnumC16446.Impersonation, EnumSet.of(EnumC15767.FILE_READ_DATA, EnumC15767.FILE_WRITE_DATA), null, EnumSet.of(EnumC0785.FILE_SHARE_READ, EnumC0785.FILE_SHARE_WRITE), EnumC11225.FILE_OPEN_IF, null, new C6117(c24279.m4268(), str)), EnumSet.of(EnumC20243.STATUS_SUCCESS))).m32766();
        this.f7999 = Math.min(c24279.m4267().m23243().m31827(), c10852.m27585().m48065().m1342());
        this.f8003 = Math.min(c24279.m4267().m23243().m31829(), c10852.m27585().m48065().m1343());
        this.f8001 = Math.min(c24279.m4267().m23243().m31833(), c10852.m27585().m48065().m1344());
    }

    public final byte[] read() {
        C4272 c4272;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        do {
            c4272 = (C4272) m24362(new C24410(m24361(), this.f8000, m24363(), this.f8002.m4267().m23241(), 0L, this.f8003), f7998);
            try {
                byteArrayOutputStream.write(c4272.m13616());
            } catch (IOException e) {
                throw new C12082(e);
            }
        } while (EnumC20243.m46515(((C18684) c4272.mo3632()).m43472()).equals(EnumC20243.STATUS_BUFFER_OVERFLOW));
        return byteArrayOutputStream.toByteArray();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f8002.mo4263(this.f8000);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] m8383(byte[] bArr) throws IOException {
        C25156 c25156 = (C25156) m24362(new C11729(m24361(), m24363(), this.f8002.m4267().m23241(), 1163287L, this.f8000, new C0653(0L, bArr.length, bArr), this.f7999), f7996);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        try {
            byteArrayOutputStream.write(c25156.m56070());
            if (EnumC20243.m46515(((C18684) c25156.mo3632()).m43472()).equals(EnumC20243.STATUS_BUFFER_OVERFLOW)) {
                byteArrayOutputStream.write(read());
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new C12082(e);
        }
    }

    public final void write(byte[] bArr) {
    }
}
