package l;

import com.umeng.analytics.pro.cb;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.᩵ܳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: N3OT */
/* JADX INFO: loaded from: classes5.dex */
public final class C20633 extends AbstractC10190 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C16157 f66165 = C16157.m38331("multipart/mixed");

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C16157 f66166;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final byte[] f66167;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final byte[] f66168;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final byte[] f66169;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16794 f66170;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C16157 f66171;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f66172 = -1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List f66173;

    public C20633(C16794 c16794, C16157 c16157, ArrayList arrayList) {
        this.f66170 = c16794;
        this.f66171 = C16157.m38331(c16157 + "; boundary=" + c16794.mo23092());
        this.f66173 = C19822.m45597((List) arrayList);
    }

    static {
        C16157.m38331("multipart/alternative");
        C16157.m38331("multipart/digest");
        C16157.m38331("multipart/parallel");
        f66166 = C16157.m38331("multipart/form-data");
        f66169 = new byte[]{58, UTF8.S_CS3};
        f66168 = new byte[]{cb.k, 10};
        f66167 = new byte[]{45, 45};
    }

    @Override // l.AbstractC10190
    /* JADX INFO: renamed from: ᩷ */
    public final C16157 mo26312() {
        return this.f66171;
    }

    @Override // l.AbstractC10190
    /* JADX INFO: renamed from: ۙ */
    public final long mo26310() {
        long j = this.f66172;
        if (j != -1) {
            return j;
        }
        long jM47242 = m47242((InterfaceC11573) null, true);
        this.f66172 = jM47242;
        return jM47242;
    }

    @Override // l.AbstractC10190
    /* JADX INFO: renamed from: ۙ */
    public final void mo26311(InterfaceC11573 interfaceC11573) {
        m47242(interfaceC11573, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m47242(InterfaceC11573 interfaceC11573, boolean z) {
        C1879 c1879;
        InterfaceC11573 c18710;
        if (z) {
            c18710 = new C1879();
            c1879 = c18710;
        } else {
            c1879 = 0;
            c18710 = interfaceC11573;
        }
        List list = this.f66173;
        int size = list.size();
        long j = 0;
        int i = 0;
        while (true) {
            C16794 c16794 = this.f66170;
            byte[] bArr = f66167;
            byte[] bArr2 = f66168;
            if (i < size) {
                C3479 c3479 = (C3479) list.get(i);
                C11682 c11682 = c3479.f12026;
                AbstractC10190 abstractC10190 = c3479.f12025;
                c18710.write(bArr);
                c18710.mo6435(c16794);
                c18710.write(bArr2);
                int iM29363 = c11682.m29363();
                for (int i2 = 0; i2 < iM29363; i2++) {
                    c18710.mo6442(c11682.m29360(i2)).write(f66169).mo6442(c11682.m29364(i2)).write(bArr2);
                }
                C19141 c19141 = (C19141) abstractC10190;
                int i3 = c19141.f61930;
                C16157 c16157 = c19141.f61931;
                if (c16157 != null) {
                    c18710.mo6442("Content-Type: ").mo6442(c16157.toString()).write(bArr2);
                }
                long j2 = i3;
                if (j2 != -1) {
                    c18710.mo6442("Content-Length: ").mo6447(j2).write(bArr2);
                } else if (z) {
                    c1879.m6436();
                    return -1L;
                }
                c18710.write(bArr2);
                if (z) {
                    j += j2;
                } else {
                    c18710.mo6452(0, i3, c19141.f61932);
                }
                c18710.write(bArr2);
                i++;
            } else {
                c18710.write(bArr);
                c18710.mo6435(c16794);
                c18710.write(bArr);
                c18710.write(bArr2);
                if (!z) {
                    return j;
                }
                long size2 = c1879.size() + j;
                c1879.m6436();
                return size2;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47243(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\n') {
                sb.append("%0A");
            } else if (cCharAt == '\r') {
                sb.append("%0D");
            } else if (cCharAt == '\"') {
                sb.append("%22");
            } else {
                sb.append(cCharAt);
            }
        }
        sb.append('\"');
    }
}
