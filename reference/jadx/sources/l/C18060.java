package l;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ᩳ۫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 31TZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18060 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f57762;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f57763;

    public C18060(int i) {
        switch (i) {
            case 1:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f57763 = byteArrayOutputStream;
                this.f57762 = new DataOutputStream(byteArrayOutputStream);
                break;
            default:
                this.f57763 = new HashMap();
                this.f57762 = new HashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m42051(C21588 c21588) {
        C21588 c21589 = (C21588) ((HashMap) this.f57763).put(c21588.m48305(), c21588);
        C21588 c215810 = (C21588) ((HashMap) this.f57762).put(c21588.m48299(), c21588);
        if (c21589 != null) {
            throw new RuntimeException("Old Name conflict: " + c21588.m48305() + ", [" + c21588.m48305() + ", " + c21588.m48299() + "], [" + c21589.m48305() + ", " + c21589.m48299() + "]");
        }
        if (c215810 == null) {
            return;
        }
        throw new RuntimeException("New Name conflict: " + c21588.m48299() + ", [" + c21588.m48305() + ", " + c21588.m48299() + "], [" + c215810.m48305() + ", " + c215810.m48299() + "]");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C21588 m42054(String str) {
        if (str.length() == 1) {
            return null;
        }
        return (C21588) ((HashMap) this.f57763).get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] m42053(C0726 c0726) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f57762;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f57763;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(c0726.f3011);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(c0726.f3014);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(c0726.f3010);
            dataOutputStream.writeLong(c0726.f3012);
            dataOutputStream.write(c0726.f3009);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m42052(String str) {
        return ((HashMap) this.f57763).containsKey(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m42050(String str, String str2) {
        String strSubstring;
        if (str.charAt(0) == '[') {
            int iIndexOf = str.indexOf(76);
            if (iIndexOf != -1) {
                strSubstring = str.substring(0, iIndexOf);
                str = str.substring(iIndexOf);
            }
            return str2;
        }
        strSubstring = null;
        C21588 c21588M42054 = m42054(str);
        if (c21588M42054 != null) {
            if (strSubstring == null) {
                return c21588M42054.m48299();
            }
            StringBuilder sbM23356 = C9023.m23356(strSubstring);
            sbM23356.append(c21588M42054.m48299());
            return sbM23356.toString();
        }
        return str2;
    }
}
