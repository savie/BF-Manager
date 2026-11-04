package l;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܰܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: P9US */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14694 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC6121 f48022;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f48023;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f48024;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f48025;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final EnumC24021 f48026;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f48027;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f48028;

    /* JADX INFO: renamed from: ۙ */
    public void mo7634(StringBuilder sb) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo35351(long j);

    public AbstractC14694(String str, EnumC24021 enumC24021, EnumC6121 enumC6121, boolean z) {
        this.f48023 = str;
        this.f48026 = enumC24021;
        this.f48022 = enumC6121;
        this.f48024 = z;
        HashMap mapM37743 = C15815.m37743(m35359());
        this.f48028 = mapM37743;
        String str2 = (String) mapM37743.get(EnumC20662.Domain);
        String str3 = (String) mapM37743.get(EnumC20662.Protocol);
        String str4 = (String) mapM37743.get(EnumC20662.Application);
        String lowerCase = ((String) mapM37743.get(EnumC20662.Instance)).toLowerCase();
        StringBuilder sb = new StringBuilder();
        sb.append(str4.length() > 0 ? C14442.m34865("_", str4, ".") : "");
        String strM31438 = C12669.m31438(sb, str3.length() > 0 ? C14442.m34865("_", str3, ".") : "", str2, ".");
        this.f48025 = strM31438;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(lowerCase.length() > 0 ? lowerCase.concat(".") : "");
        sb2.append(strM31438);
        this.f48027 = sb2.toString().toLowerCase();
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC14694) {
            AbstractC14694 abstractC14694 = (AbstractC14694) obj;
            if (m35350().equals(abstractC14694.m35350()) && m35360().equals(abstractC14694.m35360()) && m35354() == abstractC14694.m35354()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo7636(AbstractC14694 abstractC14694) {
        if (m35350().equals(abstractC14694.m35350())) {
            return m35360().equals(abstractC14694.m35360()) && m35352(abstractC14694.m35354());
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m35352(EnumC6121 enumC6121) {
        EnumC6121 enumC6122 = EnumC6121.CLASS_ANY;
        return enumC6122 == enumC6121 || enumC6122 == m35354() || m35354().equals(enumC6121);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m35359() {
        String str = this.f48023;
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m35357() {
        String str = this.f48025;
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m35350() {
        String str = this.f48027;
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC24021 m35360() {
        EnumC24021 enumC24021 = this.f48026;
        return enumC24021 != null ? enumC24021 : EnumC24021.TYPE_IGNORE;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC6121 m35354() {
        EnumC6121 enumC6121 = this.f48022;
        return enumC6121 != null ? enumC6121 : EnumC6121.CLASS_UNKNOWN;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m35348() {
        return this.f48024;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m35358() {
        String str = (String) C4681.unmodifiableMap(this.f48028).get(EnumC20662.Subtype);
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m35353() {
        EnumC20662 enumC20662 = EnumC20662.Application;
        HashMap map = this.f48028;
        return ((String) map.get(enumC20662)).equals("dns-sd") && ((String) map.get(EnumC20662.Instance)).equals("_services");
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m35356() {
        EnumC20662 enumC20662 = EnumC20662.Application;
        HashMap map = this.f48028;
        if (!((String) map.get(enumC20662)).equals("dns-sd")) {
            return false;
        }
        String str = (String) map.get(EnumC20662.Instance);
        return "b".equals(str) || "db".equals(str) || "r".equals(str) || "dr".equals(str) || "lb".equals(str);
    }

    /* JADX INFO: renamed from: ᩷ */
    public boolean mo9135(AbstractC14694 abstractC14694) {
        return abstractC14694.m35360() == m35360();
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo29889(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(m35359().getBytes(StandardCharsets.UTF_8));
        dataOutputStream.writeShort(m35360().m53580());
        dataOutputStream.writeShort(m35354().m17677());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] m35355() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            mo29889(dataOutputStream);
            dataOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new InternalError();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m35349(AbstractC17152 abstractC17152) {
        byte[] bArrM35355 = m35355();
        byte[] bArrM35356 = abstractC17152.m35355();
        int iMin = Math.min(bArrM35355.length, bArrM35356.length);
        for (int i = 0; i < iMin; i++) {
            byte b = bArrM35355[i];
            byte b2 = bArrM35356[i];
            if (b > b2) {
                return 1;
            }
            if (b < b2) {
                return -1;
            }
        }
        return bArrM35355.length - bArrM35356.length;
    }

    public final int hashCode() {
        return m35354().m17677() + m35360().m53580() + m35350().hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append('[');
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(System.identityHashCode(this));
        sb.append(" type: ");
        sb.append(m35360());
        sb.append(", class: ");
        sb.append(m35354());
        sb.append(this.f48024 ? "-unique," : ",");
        sb.append(" name: ");
        sb.append(this.f48023);
        mo7634(sb);
        sb.append(']');
        return sb.toString();
    }
}
