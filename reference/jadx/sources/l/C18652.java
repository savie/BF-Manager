package l;

import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.Principal;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ᩴۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: O9TZ */
/* JADX INFO: loaded from: classes5.dex */
public class C18652 implements Principal, InterfaceC23901, Serializable {
    public static final long serialVersionUID = -4090263879887877186L;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f60572 = C13488.m32997(C18652.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f60573;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f60574;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public byte[] f60575;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public EnumC17946 f60576;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f60577;

    @Override // l.InterfaceC23901
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C18652 mo43146() {
        if (InterfaceC23901.class.isAssignableFrom(getClass())) {
            return this;
        }
        return null;
    }

    public C18652() {
        EnumC17946 enumC17946 = EnumC17946.NULL;
        this.f60575 = null;
        this.f60577 = "";
        this.f60574 = "";
        this.f60573 = "";
        this.f60576 = enumC17946;
    }

    public C18652(String str, String str2, String str3, EnumC17946 enumC17946) {
        this.f60575 = null;
        if (str2 != null) {
            int iIndexOf = str2.indexOf(64);
            if (iIndexOf > 0) {
                str = str2.substring(iIndexOf + 1);
                str2 = str2.substring(0, iIndexOf);
            } else {
                int iIndexOf2 = str2.indexOf(92);
                if (iIndexOf2 > 0) {
                    str = str2.substring(0, iIndexOf2);
                    str2 = str2.substring(iIndexOf2 + 1);
                }
            }
        }
        this.f60577 = str == null ? "" : str;
        str2 = str2 == null ? "" : str2;
        this.f60574 = str2;
        this.f60573 = str3 == null ? "" : str3;
        if (enumC17946 != null) {
            this.f60576 = enumC17946;
            return;
        }
        EnumC17946 enumC17947 = EnumC17946.USER;
        if ("guest".equalsIgnoreCase(str2)) {
            enumC17947 = EnumC17946.GUEST;
        } else {
            String str4 = this.f60577;
            if ((str4 == null || str4.isEmpty()) && this.f60574.isEmpty() && this.f60573.isEmpty()) {
                enumC17947 = EnumC17946.NULL;
            }
        }
        this.f60576 = enumC17947;
    }

    @Override // l.InterfaceC23901
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20769 mo43141(InterfaceC19067 interfaceC19067, String str, byte[] bArr, boolean z) throws C12303 {
        InterfaceC4314 interfaceC4314 = f60572;
        interfaceC19067.mo29449().getClass();
        if (bArr != null) {
            try {
                if (bArr.length > 0) {
                    C7404 c7404 = new C7404(bArr);
                    if (interfaceC4314.mo12125()) {
                        interfaceC4314.mo12135("Have initial token " + c7404);
                    }
                    if (c7404.m19750() != null && !new HashSet(Arrays.asList(c7404.m19750())).contains(C15125.f49401)) {
                        throw new C19399("Server does not support NTLM authentication");
                    }
                }
            } catch (C12303 e) {
                throw e;
            } catch (IOException e2) {
                interfaceC4314.mo12120("Ignoring invalid initial token", (Exception) e2);
            }
        }
        InterfaceC10601 interfaceC10601Mo29449 = interfaceC19067.mo29449();
        C15125 c15125 = new C15125(interfaceC19067, this, z);
        if (str != null && ((C9895) interfaceC19067.mo29449()).m25055()) {
            c15125.m36250("cifs/".concat(str));
        }
        return new C8816(interfaceC10601Mo29449, c15125);
    }

    @Override // l.InterfaceC23901
    public C18652 clone() {
        C18652 c18652 = new C18652();
        c18652.f60577 = this.f60577;
        c18652.f60574 = this.f60574;
        c18652.f60573 = this.f60573;
        c18652.f60576 = this.f60576;
        return c18652;
    }

    @Override // l.InterfaceC23901
    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public final String mo43139() {
        return this.f60577;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m43140() {
        return this.f60574;
    }

    public final String getPassword() {
        return this.f60573;
    }

    @Override // java.security.Principal
    public final String getName() {
        String str = this.f60577;
        if (str == null || str.length() <= 0) {
            return this.f60574;
        }
        return this.f60577 + "\\" + this.f60574;
    }

    @Override // java.security.Principal
    public boolean equals(Object obj) {
        if (obj instanceof C18652) {
            C18652 c18652 = (C18652) obj;
            String str = c18652.f60577;
            String upperCase = str != null ? str.toUpperCase() : null;
            String str2 = this.f60577;
            String upperCase2 = str2 != null ? str2.toUpperCase() : null;
            if (c18652.f60576 == this.f60576 && C13638.equals(upperCase, upperCase2) && c18652.f60574.equalsIgnoreCase(this.f60574) && C13638.equals(this.f60573, c18652.f60573)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Principal
    public final int hashCode() {
        return getName().toUpperCase().hashCode();
    }

    @Override // java.security.Principal
    public final String toString() {
        return getName();
    }

    @Override // l.InterfaceC23901
    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo43144() {
        return this.f60576 == EnumC17946.NULL;
    }

    @Override // l.InterfaceC23901
    /* JADX INFO: renamed from: ۫ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo43145() {
        return this.f60576 == EnumC17946.GUEST;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] m43143(InterfaceC19067 interfaceC19067, byte[] bArr) {
        int iM25054 = ((C9895) interfaceC19067.mo29449()).m25054();
        if (iM25054 == 0 || iM25054 == 1) {
            return C8069.m21282(interfaceC19067, this.f60573, bArr);
        }
        if (iM25054 == 2) {
            return C8069.m21283(C8069.m21280(this.f60573), bArr);
        }
        if (iM25054 == 3 || iM25054 == 4 || iM25054 == 5) {
            if (this.f60575 == null) {
                this.f60575 = new byte[8];
                ((C9895) interfaceC19067.mo29449()).m25061().nextBytes(this.f60575);
            }
            String str = this.f60577;
            String str2 = this.f60574;
            String str3 = this.f60573;
            return C8069.m21281(str, str2, C8069.m21280(str3), bArr, this.f60575);
        }
        return C8069.m21282(interfaceC19067, this.f60573, bArr);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] m43147(InterfaceC19067 interfaceC19067, byte[] bArr) {
        int iM25054 = ((C9895) interfaceC19067.mo29449()).m25054();
        if (iM25054 == 0 || iM25054 == 1 || iM25054 == 2) {
            return C8069.m21283(C8069.m21280(this.f60573), bArr);
        }
        return (iM25054 == 3 || iM25054 == 4 || iM25054 == 5) ? new byte[0] : C8069.m21283(C8069.m21280(this.f60573), bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m43142(InterfaceC19067 interfaceC19067, byte[] bArr, byte[] bArr2) throws C12303 {
        try {
            MessageDigest messageDigestM38988 = C16577.m38988();
            MessageDigest messageDigestM38989 = C16577.m38988();
            messageDigestM38989.update(C10933.m27421(this.f60573));
            byte[] bArrDigest = messageDigestM38989.digest();
            int iM25054 = ((C9895) interfaceC19067.mo29449()).m25054();
            if (iM25054 == 0 || iM25054 == 1 || iM25054 == 2) {
                messageDigestM38988.update(bArrDigest);
                messageDigestM38988.digest(bArr2, 0, 16);
                return;
            }
            if (iM25054 == 3 || iM25054 == 4 || iM25054 == 5) {
                synchronized (this) {
                    if (this.f60575 == null) {
                        this.f60575 = new byte[8];
                        ((C9895) interfaceC19067.mo29449()).m25061().nextBytes(this.f60575);
                    }
                }
                MessageDigest messageDigestM38990 = C16577.m38990(bArrDigest);
                messageDigestM38990.update(C10933.m27421(this.f60574.toUpperCase()));
                messageDigestM38990.update(C10933.m27421(this.f60577.toUpperCase()));
                byte[] bArrDigest2 = messageDigestM38990.digest();
                MessageDigest messageDigestM38991 = C16577.m38990(bArrDigest2);
                messageDigestM38991.update(bArr);
                messageDigestM38991.update(this.f60575);
                MessageDigest messageDigestM38992 = C16577.m38990(bArrDigest2);
                messageDigestM38992.update(messageDigestM38991.digest());
                messageDigestM38992.digest(bArr2, 0, 16);
                return;
            }
            messageDigestM38988.update(bArrDigest);
            messageDigestM38988.digest(bArr2, 0, 16);
        } catch (Exception e) {
            throw new C12303("", e);
        }
    }
}
