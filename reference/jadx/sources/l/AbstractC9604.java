package l;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۢ۬۠, reason: contains not printable characters */
/* JADX INFO: compiled from: P9US */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9604 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean f32352;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final HashMap f32353;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC23529 f32354;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final EnumC14357 f32355;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f32356;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f32357;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f32358;

    /* JADX INFO: renamed from: ۙ */
    public void mo19178(StringBuilder sb) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo24471(long j);

    public AbstractC9604(String str, EnumC14357 enumC14357, EnumC23529 enumC23529, boolean z) {
        this.f32356 = str;
        this.f32355 = enumC14357;
        this.f32354 = enumC23529;
        this.f32352 = z;
        HashMap mapM38742 = C16473.m38742(m24477());
        this.f32353 = mapM38742;
        String str2 = (String) mapM38742.get(EnumC6075.Domain);
        String str3 = (String) mapM38742.get(EnumC6075.Protocol);
        String str4 = (String) mapM38742.get(EnumC6075.Application);
        String lowerCase = ((String) mapM38742.get(EnumC6075.Instance)).toLowerCase();
        StringBuilder sb = new StringBuilder();
        sb.append(str4.length() > 0 ? C16523.m38890("_", str4, ".") : "");
        String strM5622 = C1694.m5622(sb, str3.length() > 0 ? C16523.m38890("_", str3, ".") : "", str2, ".");
        this.f32358 = strM5622;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(lowerCase.length() > 0 ? lowerCase.concat(".") : "");
        sb2.append(strM5622);
        this.f32357 = sb2.toString().toLowerCase();
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC9604) {
            AbstractC9604 abstractC9604 = (AbstractC9604) obj;
            if (m24470().equals(abstractC9604.m24470()) && m24467().equals(abstractC9604.m24467()) && m24475() == abstractC9604.m24475()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo19180(AbstractC9604 abstractC9604) {
        if (m24470().equals(abstractC9604.m24470())) {
            return m24467().equals(abstractC9604.m24467()) && m24472(abstractC9604.m24475());
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24472(EnumC23529 enumC23529) {
        EnumC23529 enumC235210 = EnumC23529.CLASS_ANY;
        return enumC235210 == enumC23529 || enumC235210 == m24475() || m24475().equals(enumC23529);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m24477() {
        String str = this.f32356;
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m24479() {
        String str = this.f32358;
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m24470() {
        String str = this.f32357;
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final EnumC14357 m24467() {
        EnumC14357 enumC14357 = this.f32355;
        return enumC14357 != null ? enumC14357 : EnumC14357.TYPE_IGNORE;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC23529 m24475() {
        EnumC23529 enumC23529 = this.f32354;
        return enumC23529 != null ? enumC23529 : EnumC23529.CLASS_UNKNOWN;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m24468() {
        return this.f32352;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m24473() {
        String str = (String) C0561.unmodifiableMap(this.f32353).get(EnumC6075.Subtype);
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m24476() {
        EnumC6075 enumC6075 = EnumC6075.Application;
        HashMap map = this.f32353;
        return ((String) map.get(enumC6075)).equals("dns-sd") && ((String) map.get(EnumC6075.Instance)).equals("_services");
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m24466() {
        EnumC6075 enumC6075 = EnumC6075.Application;
        HashMap map = this.f32353;
        if (!((String) map.get(enumC6075)).equals("dns-sd")) {
            return false;
        }
        String str = (String) map.get(EnumC6075.Instance);
        return "b".equals(str) || "db".equals(str) || "r".equals(str) || "dr".equals(str) || "lb".equals(str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean mo24478(AbstractC9604 abstractC9604) {
        return abstractC9604.m24467() == m24467();
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo20927(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(m24477().getBytes(StandardCharsets.UTF_8));
        dataOutputStream.writeShort(m24467().m34598());
        dataOutputStream.writeShort(m24475().m51842());
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final byte[] m24474() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            mo20927(dataOutputStream);
            dataOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new InternalError();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m24469(AbstractC19918 abstractC19918) {
        byte[] bArrM24474 = m24474();
        byte[] bArrM24475 = abstractC19918.m24474();
        int iMin = Math.min(bArrM24474.length, bArrM24475.length);
        for (int i = 0; i < iMin; i++) {
            byte b = bArrM24474[i];
            byte b2 = bArrM24475[i];
            if (b > b2) {
                return 1;
            }
            if (b < b2) {
                return -1;
            }
        }
        return bArrM24474.length - bArrM24475.length;
    }

    public final int hashCode() {
        return m24475().m51842() + m24467().m34598() + m24470().hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append('[');
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(System.identityHashCode(this));
        sb.append(" type: ");
        sb.append(m24467());
        sb.append(", class: ");
        sb.append(m24475());
        sb.append(this.f32352 ? "-unique," : ",");
        sb.append(" name: ");
        sb.append(this.f32356);
        mo19178(sb);
        sb.append(']');
        return sb.toString();
    }
}
