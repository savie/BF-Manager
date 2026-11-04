package l;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.EnumSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.᩶ۜܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: W88T */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21142 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f67527 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f67528 = 16384;

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo42311(byte[] bArr);

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo42312(byte[] bArr, byte[] bArr2);

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo42313(byte[] bArr);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48245(EnumC6269 enumC6269, EnumC6269 enumC62610) throws IOException {
        C1048 c1048 = new C1048(enumC6269, enumC62610);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C7760 c7760 = new C7760(byteArrayOutputStream);
        c1048.m30527(this.f67527.getAndIncrement());
        c1048.m30521(EnumSet.of(EnumC14471.FIRST_FRAGMENT, EnumC14471.LAST_FRAGMENT));
        c1048.mo3948(c7760);
        byte[] bArr = new byte[this.f67528];
        mo42313(byteArrayOutputStream.toByteArray());
        C0302 c0302 = new C0302(new ByteArrayInputStream(bArr, 0, mo42311(bArr)));
        C2539 c2539 = new C2539();
        c2539.mo8464(c0302);
        if (!EnumC4031.BIND_ACK.equals(c2539.m30524())) {
            throw new IOException(C3188.m10404("BIND ", enumC6269.getName(), " (", enumC6269.m17929(), ") failed."));
        }
        this.f67528 = c2539.m8465();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11445 m48244(C5480 c5480) throws IOException {
        int iM1884;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C7760 c7760 = new C7760(byteArrayOutputStream);
        C8505 c8505 = new C8505();
        c8505.m30522(EnumC4031.REQUEST);
        c8505.m30527(this.f67527.getAndIncrement());
        c8505.m30521(EnumSet.of(EnumC14471.FIRST_FRAGMENT, EnumC14471.LAST_FRAGMENT));
        c8505.m22821(c5480.m19329());
        C13087 c13087 = new C13087();
        c5480.m6175(new C7760(c13087));
        c8505.m22820(c13087.mo32557());
        c8505.mo3948(c7760);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byte[] bArr = new byte[this.f67528];
        C18308 c18308 = new C18308();
        c18308.m42695(mo42312(byteArray, bArr));
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        C4734 c4734 = new C4734();
        c4734.m30522(EnumC4031.RESPONSE);
        while (true) {
            c4734.mo8464(new C0302(new ByteArrayInputStream(bArr, 0, c18308.getValue().intValue())));
            byteArrayOutputStream2.write(c4734.m14634());
            if (c4734.m30520().contains(EnumC14471.LAST_FRAGMENT)) {
                break;
            }
            c18308.m42695(mo42311(bArr));
        }
        C0302 c0302 = new C0302(new ByteArrayInputStream(byteArrayOutputStream2.toByteArray()));
        EnumC4031 enumC4031M30524 = c4734.m30524();
        EnumC4031 enumC4031 = EnumC4031.RESPONSE;
        if (enumC4031M30524 == enumC4031) {
            C11445 c11445 = new C11445(4);
            c11445.m33541(c0302);
            return c11445;
        }
        if (c4734.m30524() == EnumC4031.FAULT || c4734.m30524() == EnumC4031.REJECT) {
            int i = C18904.f61345;
            try {
                iM1884 = c0302.m1884();
            } catch (EOFException unused) {
                iM1884 = -1;
            }
            throw new C18904(iM1884);
        }
        throw new IOException("Expected PDU " + enumC4031 + " but got: " + c4734.m30524());
    }
}
