package l;

import com.umeng.analytics.pro.cb;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ܰۗ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N3OT */
/* JADX INFO: loaded from: classes4.dex */
public final class C13547 extends AbstractC21307 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final byte[] f44708;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C9501 f44709 = C9501.m24336("multipart/mixed");

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final byte[] f44710;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C9501 f44711;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final byte[] f44712;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final List f44713;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14511 f44714;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C9501 f44715;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f44716 = -1;

    public C13547(C14511 c14511, C9501 c9501, ArrayList arrayList) {
        this.f44714 = c14511;
        this.f44715 = C9501.m24336(c9501 + "; boundary=" + c14511.mo34948());
        this.f44713 = C0140.m1227((List) arrayList);
    }

    static {
        C9501.m24336("multipart/alternative");
        C9501.m24336("multipart/digest");
        C9501.m24336("multipart/parallel");
        f44711 = C9501.m24336("multipart/form-data");
        f44710 = new byte[]{58, UTF8.S_CS3};
        f44712 = new byte[]{cb.k, 10};
        f44708 = new byte[]{45, 45};
    }

    @Override // l.AbstractC21307
    /* JADX INFO: renamed from: ۨ */
    public final C9501 mo4377() {
        return this.f44715;
    }

    @Override // l.AbstractC21307
    /* JADX INFO: renamed from: ۙ */
    public final long mo4375() {
        long j = this.f44716;
        if (j != -1) {
            return j;
        }
        long jM33133 = m33133((InterfaceC10983) null, true);
        this.f44716 = jM33133;
        return jM33133;
    }

    @Override // l.AbstractC21307
    /* JADX INFO: renamed from: ۙ */
    public final void mo4376(InterfaceC10983 interfaceC10983) {
        m33133(interfaceC10983, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m33133(InterfaceC10983 interfaceC10983, boolean z) {
        C6043 c6043;
        InterfaceC10983 c6044;
        if (z) {
            c6044 = new C6043();
            c6043 = c6044;
        } else {
            c6043 = 0;
            c6044 = interfaceC10983;
        }
        List list = this.f44713;
        int size = list.size();
        long j = 0;
        int i = 0;
        while (true) {
            C14511 c14511 = this.f44714;
            byte[] bArr = f44708;
            byte[] bArr2 = f44712;
            if (i < size) {
                C4373 c4373 = (C4373) list.get(i);
                C10912 c10912 = c4373.f15616;
                AbstractC21307 abstractC21307 = c4373.f15615;
                c6044.write(bArr);
                c6044.mo16405(c14511);
                c6044.write(bArr2);
                int iM27347 = c10912.m27347();
                for (int i2 = 0; i2 < iM27347; i2++) {
                    c6044.mo16418(c10912.m27344(i2)).write(f44710).mo16418(c10912.m27348(i2)).write(bArr2);
                }
                C14958 c14958 = (C14958) abstractC21307;
                int i3 = c14958.f48849;
                C9501 c9501 = c14958.f48850;
                if (c9501 != null) {
                    c6044.mo16418("Content-Type: ").mo16418(c9501.toString()).write(bArr2);
                }
                long j2 = i3;
                if (j2 != -1) {
                    c6044.mo16418("Content-Length: ").mo16428(j2).write(bArr2);
                } else if (z) {
                    c6043.m16407();
                    return -1L;
                }
                c6044.write(bArr2);
                if (z) {
                    j += j2;
                } else {
                    c6044.mo16397(0, i3, c14958.f48851);
                }
                c6044.write(bArr2);
                i++;
            } else {
                c6044.write(bArr);
                c6044.mo16405(c14511);
                c6044.write(bArr);
                c6044.write(bArr2);
                if (!z) {
                    return j;
                }
                long size2 = c6043.size() + j;
                c6043.m16407();
                return size2;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33134(StringBuilder sb, String str) {
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
