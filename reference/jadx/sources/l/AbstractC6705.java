package l;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.EnumSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۜۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: W88T */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6705 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f22600 = new AtomicInteger();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f22601 = 16384;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract int mo18119(byte[] bArr);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract int mo18120(byte[] bArr, byte[] bArr2);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract void mo18123(byte[] bArr);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18122(EnumC22187 enumC22187, EnumC22187 enumC22188) throws IOException {
        C8076 c8076 = new C8076(enumC22187, enumC22188);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C21481 c21481 = new C21481(byteArrayOutputStream);
        c8076.m14526(this.f22600.getAndIncrement());
        c8076.m14519(EnumSet.of(EnumC3841.FIRST_FRAGMENT, EnumC3841.LAST_FRAGMENT));
        c8076.mo14522(c21481);
        byte[] bArr = new byte[this.f22601];
        mo18123(byteArrayOutputStream.toByteArray());
        C15132 c15132 = new C15132(new ByteArrayInputStream(bArr, 0, mo18119(bArr)));
        C8782 c8782 = new C8782();
        c8782.mo14521(c15132);
        if (!EnumC13015.BIND_ACK.equals(c8782.m14524())) {
            throw new IOException(C0242.m1617("BIND ", enumC22187.getName(), " (", enumC22187.m49219(), ") failed."));
        }
        this.f22601 = c8782.m22854();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14427 m18121(C10899 c10899) throws IOException {
        int iM36288;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C21481 c21481 = new C21481(byteArrayOutputStream);
        C10193 c10193 = new C10193();
        c10193.m14520(EnumC13015.REQUEST);
        c10193.m14526(this.f22600.getAndIncrement());
        c10193.m14519(EnumSet.of(EnumC3841.FIRST_FRAGMENT, EnumC3841.LAST_FRAGMENT));
        c10193.m25970(c10899.m19639());
        C14843 c14843 = new C14843();
        c10899.m52028(new C21481(c14843));
        c10193.m25969(c14843.mo35530());
        c10193.mo14522(c21481);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byte[] bArr = new byte[this.f22601];
        C23080 c23080 = new C23080();
        c23080.m51064(mo18120(byteArray, bArr));
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        C15838 c15838 = new C15838();
        c15838.m14520(EnumC13015.RESPONSE);
        while (true) {
            c15838.mo14521(new C15132(new ByteArrayInputStream(bArr, 0, c23080.getValue().intValue())));
            byteArrayOutputStream2.write(c15838.m37648());
            if (c15838.m14517().contains(EnumC3841.LAST_FRAGMENT)) {
                break;
            }
            c23080.m51064(mo18119(bArr));
        }
        C15132 c15132 = new C15132(new ByteArrayInputStream(byteArrayOutputStream2.toByteArray()));
        EnumC13015 enumC13015M14524 = c15838.m14524();
        EnumC13015 enumC13015 = EnumC13015.RESPONSE;
        if (enumC13015M14524 == enumC13015) {
            C14427 c14427 = new C14427();
            c14427.m46764(c15132);
            return c14427;
        }
        if (c15838.m14524() == EnumC13015.FAULT || c15838.m14524() == EnumC13015.REJECT) {
            int i = C17994.f57534;
            try {
                iM36288 = c15132.m36288();
            } catch (EOFException unused) {
                iM36288 = -1;
            }
            throw new C17994(iM36288);
        }
        throw new IOException("Expected PDU " + enumC13015 + " but got: " + c15838.m14524());
    }
}
