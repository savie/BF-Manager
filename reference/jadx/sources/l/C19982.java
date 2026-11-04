package l;

import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.Principal;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ᩴܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: O9TZ */
/* JADX INFO: loaded from: classes5.dex */
public class C19982 implements Principal, InterfaceC24546, Serializable {
    public static final long serialVersionUID = -4090263879887877186L;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f64202 = C16980.m40037(C19982.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public EnumC22966 f64203;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f64204;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f64205;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f64206;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f64207;

    @Override // l.InterfaceC24546
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C19982 mo45917() {
        if (InterfaceC24546.class.isAssignableFrom(getClass())) {
            return this;
        }
        return null;
    }

    public C19982() {
        EnumC22966 enumC22966 = EnumC22966.NULL;
        this.f64205 = null;
        this.f64207 = "";
        this.f64204 = "";
        this.f64206 = "";
        this.f64203 = enumC22966;
    }

    public C19982(String str, String str2, String str3, EnumC22966 enumC22966) {
        this.f64205 = null;
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
        this.f64207 = str == null ? "" : str;
        str2 = str2 == null ? "" : str2;
        this.f64204 = str2;
        this.f64206 = str3 == null ? "" : str3;
        if (enumC22966 != null) {
            this.f64203 = enumC22966;
            return;
        }
        EnumC22966 enumC22967 = EnumC22966.USER;
        if ("guest".equalsIgnoreCase(str2)) {
            enumC22967 = EnumC22966.GUEST;
        } else {
            String str4 = this.f64207;
            if ((str4 == null || str4.isEmpty()) && this.f64204.isEmpty() && this.f64206.isEmpty()) {
                enumC22967 = EnumC22966.NULL;
            }
        }
        this.f64203 = enumC22967;
    }

    @Override // l.InterfaceC24546
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16998 mo45910(InterfaceC23032 interfaceC23032, String str, byte[] bArr, boolean z) throws C20728 {
        InterfaceC25186 interfaceC25186 = f64202;
        interfaceC23032.mo2875().getClass();
        if (bArr != null) {
            try {
                if (bArr.length > 0) {
                    C24679 c24679 = new C24679(bArr);
                    if (interfaceC25186.mo13707()) {
                        interfaceC25186.mo13721("Have initial token " + c24679);
                    }
                    if (c24679.m55026() != null && !new HashSet(Arrays.asList(c24679.m55026())).contains(C22220.f71573)) {
                        throw new C5287("Server does not support NTLM authentication");
                    }
                }
            } catch (C20728 e) {
                throw e;
            } catch (IOException e2) {
                interfaceC25186.mo13711("Ignoring invalid initial token", e2);
            }
        }
        InterfaceC5878 interfaceC5878Mo2875 = interfaceC23032.mo2875();
        C22220 c22220 = new C22220(interfaceC23032, this, z);
        if (str != null && ((C14826) interfaceC23032.mo2875()).m35719()) {
            c22220.m50254("cifs/".concat(str));
        }
        return new C1558(interfaceC5878Mo2875, c22220);
    }

    @Override // l.InterfaceC24546
    public C19982 clone() {
        C19982 c19982 = new C19982();
        c19982.f64207 = this.f64207;
        c19982.f64204 = this.f64204;
        c19982.f64206 = this.f64206;
        c19982.f64203 = this.f64203;
        return c19982;
    }

    @Override // l.InterfaceC24546
    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final String mo45915() {
        return this.f64207;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m45909() {
        return this.f64204;
    }

    public final String getPassword() {
        return this.f64206;
    }

    @Override // java.security.Principal
    public final String getName() {
        String str = this.f64207;
        if (str == null || str.length() <= 0) {
            return this.f64204;
        }
        return this.f64207 + "\\" + this.f64204;
    }

    @Override // java.security.Principal
    public boolean equals(Object obj) {
        if (obj instanceof C19982) {
            C19982 c19982 = (C19982) obj;
            String str = c19982.f64207;
            String upperCase = str != null ? str.toUpperCase() : null;
            String str2 = this.f64207;
            String upperCase2 = str2 != null ? str2.toUpperCase() : null;
            if (c19982.f64203 == this.f64203 && C17359.equals(upperCase, upperCase2) && c19982.f64204.equalsIgnoreCase(this.f64204) && C17359.equals(this.f64206, c19982.f64206)) {
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

    @Override // l.InterfaceC24546
    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo45913() {
        return this.f64203 == EnumC22966.NULL;
    }

    @Override // l.InterfaceC24546
    /* JADX INFO: renamed from: ۟᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo45914() {
        return this.f64203 == EnumC22966.GUEST;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] m45912(InterfaceC23032 interfaceC23032, byte[] bArr) {
        int iM35718 = ((C14826) interfaceC23032.mo2875()).m35718();
        if (iM35718 == 0 || iM35718 == 1) {
            return C15506.m37144(interfaceC23032, this.f64206, bArr);
        }
        if (iM35718 == 2) {
            return C15506.m37145(C15506.m37142(this.f64206), bArr);
        }
        if (iM35718 == 3 || iM35718 == 4 || iM35718 == 5) {
            if (this.f64205 == null) {
                this.f64205 = new byte[8];
                ((C14826) interfaceC23032.mo2875()).m35699().nextBytes(this.f64205);
            }
            String str = this.f64207;
            String str2 = this.f64204;
            String str3 = this.f64206;
            return C15506.m37143(str, str2, C15506.m37142(str3), bArr, this.f64205);
        }
        return C15506.m37144(interfaceC23032, this.f64206, bArr);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] m45916(InterfaceC23032 interfaceC23032, byte[] bArr) {
        int iM35718 = ((C14826) interfaceC23032.mo2875()).m35718();
        if (iM35718 == 0 || iM35718 == 1 || iM35718 == 2) {
            return C15506.m37145(C15506.m37142(this.f64206), bArr);
        }
        return (iM35718 == 3 || iM35718 == 4 || iM35718 == 5) ? new byte[0] : C15506.m37145(C15506.m37142(this.f64206), bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m45911(InterfaceC23032 interfaceC23032, byte[] bArr, byte[] bArr2) throws C20728 {
        try {
            MessageDigest messageDigestM9903 = C3049.m9903();
            MessageDigest messageDigestM9904 = C3049.m9903();
            messageDigestM9904.update(C23933.m53455(this.f64206));
            byte[] bArrDigest = messageDigestM9904.digest();
            int iM35718 = ((C14826) interfaceC23032.mo2875()).m35718();
            if (iM35718 == 0 || iM35718 == 1 || iM35718 == 2) {
                messageDigestM9903.update(bArrDigest);
                messageDigestM9903.digest(bArr2, 0, 16);
                return;
            }
            if (iM35718 == 3 || iM35718 == 4 || iM35718 == 5) {
                synchronized (this) {
                    if (this.f64205 == null) {
                        this.f64205 = new byte[8];
                        ((C14826) interfaceC23032.mo2875()).m35699().nextBytes(this.f64205);
                    }
                }
                MessageDigest messageDigestM9905 = C3049.m9905(bArrDigest);
                messageDigestM9905.update(C23933.m53455(this.f64204.toUpperCase()));
                messageDigestM9905.update(C23933.m53455(this.f64207.toUpperCase()));
                byte[] bArrDigest2 = messageDigestM9905.digest();
                MessageDigest messageDigestM9906 = C3049.m9905(bArrDigest2);
                messageDigestM9906.update(bArr);
                messageDigestM9906.update(this.f64205);
                MessageDigest messageDigestM9907 = C3049.m9905(bArrDigest2);
                messageDigestM9907.update(messageDigestM9906.digest());
                messageDigestM9907.digest(bArr2, 0, 16);
                return;
            }
            messageDigestM9903.update(bArrDigest);
            messageDigestM9903.digest(bArr2, 0, 16);
        } catch (Exception e) {
            throw new C20728("", e);
        }
    }
}
