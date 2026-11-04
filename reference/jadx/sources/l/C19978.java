package l;

import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;

/* JADX INFO: renamed from: l.ᩴܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27Y0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19978 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static InterfaceC8790 f64189;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static Hashtable f64190;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC5062 f64191;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC2912 f64192;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C22962 f64193;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Vector f64194;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m45896(InterfaceC5062 interfaceC5062) {
        this.f64191 = interfaceC5062;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized InterfaceC5062 m45900() {
        return this.f64191;
    }

    static {
        String property;
        String property2;
        String property3;
        String property4;
        String property5;
        String property6;
        String property7;
        String property8;
        String property9;
        String property10;
        String property11;
        String property12;
        String property13;
        String property14;
        String property15;
        String property16;
        String property17 = "6";
        String property18 = "hmac-sha2-256-etm@openssh.com,hmac-sha2-512-etm@openssh.com,hmac-sha1-etm@openssh.com,hmac-sha2-256,hmac-sha2-512,hmac-sha1";
        String property19 = "aes128-gcm@openssh.com,aes256-gcm@openssh.com,chacha20-poly1305@openssh.com,aes128-ctr,aes192-ctr,aes256-ctr";
        String property20 = "ssh-ed25519,ecdsa-sha2-nistp256,ecdsa-sha2-nistp384,ecdsa-sha2-nistp521,rsa-sha2-512,rsa-sha2-256";
        String property21 = "";
        String property22 = "yes";
        Hashtable hashtable = new Hashtable();
        f64190 = hashtable;
        String property23 = "mlkem768x25519-sha256,curve25519-sha256,curve25519-sha256@libssh.org,ecdh-sha2-nistp256,ecdh-sha2-nistp384,ecdh-sha2-nistp521,diffie-hellman-group-exchange-sha256,diffie-hellman-group16-sha512,diffie-hellman-group18-sha512,diffie-hellman-group14-sha256";
        byte[] bArr = C9011.f29358;
        try {
            property23 = System.getProperty("jsch.kex", "mlkem768x25519-sha256,curve25519-sha256,curve25519-sha256@libssh.org,ecdh-sha2-nistp256,ecdh-sha2-nistp384,ecdh-sha2-nistp521,diffie-hellman-group-exchange-sha256,diffie-hellman-group16-sha512,diffie-hellman-group18-sha512,diffie-hellman-group14-sha256");
        } catch (SecurityException unused) {
        }
        hashtable.put("kex", property23);
        Hashtable hashtable2 = f64190;
        try {
            property = System.getProperty("jsch.server_host_key", "ssh-ed25519,ecdsa-sha2-nistp256,ecdsa-sha2-nistp384,ecdsa-sha2-nistp521,rsa-sha2-512,rsa-sha2-256");
        } catch (SecurityException unused2) {
            property = "ssh-ed25519,ecdsa-sha2-nistp256,ecdsa-sha2-nistp384,ecdsa-sha2-nistp521,rsa-sha2-512,rsa-sha2-256";
        }
        hashtable2.put("server_host_key", property);
        Hashtable hashtable3 = f64190;
        try {
            property2 = System.getProperty("jsch.prefer_known_host_key_types", "yes");
        } catch (SecurityException unused3) {
            property2 = "yes";
        }
        hashtable3.put("prefer_known_host_key_types", property2);
        Hashtable hashtable4 = f64190;
        try {
            property3 = System.getProperty("jsch.enable_strict_kex", "yes");
        } catch (SecurityException unused4) {
            property3 = "yes";
        }
        hashtable4.put("enable_strict_kex", property3);
        Hashtable hashtable5 = f64190;
        try {
            property4 = System.getProperty("jsch.require_strict_kex", "no");
        } catch (SecurityException unused5) {
            property4 = "no";
        }
        hashtable5.put("require_strict_kex", property4);
        Hashtable hashtable6 = f64190;
        try {
            property5 = System.getProperty("jsch.enable_server_sig_algs", "yes");
        } catch (SecurityException unused6) {
            property5 = "yes";
        }
        hashtable6.put("enable_server_sig_algs", property5);
        Hashtable hashtable7 = f64190;
        try {
            property6 = System.getProperty("jsch.enable_ext_info_in_auth", "yes");
        } catch (SecurityException unused7) {
            property6 = "yes";
        }
        hashtable7.put("enable_ext_info_in_auth", property6);
        Hashtable hashtable8 = f64190;
        try {
            property7 = System.getProperty("jsch.cipher", "aes128-gcm@openssh.com,aes256-gcm@openssh.com,chacha20-poly1305@openssh.com,aes128-ctr,aes192-ctr,aes256-ctr");
        } catch (SecurityException unused8) {
            property7 = "aes128-gcm@openssh.com,aes256-gcm@openssh.com,chacha20-poly1305@openssh.com,aes128-ctr,aes192-ctr,aes256-ctr";
        }
        hashtable8.put("cipher.s2c", property7);
        Hashtable hashtable9 = f64190;
        try {
            property19 = System.getProperty("jsch.cipher", "aes128-gcm@openssh.com,aes256-gcm@openssh.com,chacha20-poly1305@openssh.com,aes128-ctr,aes192-ctr,aes256-ctr");
        } catch (SecurityException unused9) {
        }
        hashtable9.put("cipher.c2s", property19);
        Hashtable hashtable10 = f64190;
        try {
            property8 = System.getProperty("jsch.mac", "hmac-sha2-256-etm@openssh.com,hmac-sha2-512-etm@openssh.com,hmac-sha1-etm@openssh.com,hmac-sha2-256,hmac-sha2-512,hmac-sha1");
        } catch (SecurityException unused10) {
            property8 = "hmac-sha2-256-etm@openssh.com,hmac-sha2-512-etm@openssh.com,hmac-sha1-etm@openssh.com,hmac-sha2-256,hmac-sha2-512,hmac-sha1";
        }
        hashtable10.put("mac.s2c", property8);
        Hashtable hashtable11 = f64190;
        try {
            property18 = System.getProperty("jsch.mac", "hmac-sha2-256-etm@openssh.com,hmac-sha2-512-etm@openssh.com,hmac-sha1-etm@openssh.com,hmac-sha2-256,hmac-sha2-512,hmac-sha1");
        } catch (SecurityException unused11) {
        }
        hashtable11.put("mac.c2s", property18);
        Hashtable hashtable12 = f64190;
        try {
            property9 = System.getProperty("jsch.compression", "none");
        } catch (SecurityException unused12) {
            property9 = "none";
        }
        hashtable12.put("compression.s2c", property9);
        Hashtable hashtable13 = f64190;
        try {
            property10 = System.getProperty("jsch.compression", "none");
        } catch (SecurityException unused13) {
            property10 = "none";
        }
        hashtable13.put("compression.c2s", property10);
        Hashtable hashtable14 = f64190;
        try {
            property11 = System.getProperty("jsch.lang", "");
        } catch (SecurityException unused14) {
            property11 = "";
        }
        hashtable14.put("lang.s2c", property11);
        Hashtable hashtable15 = f64190;
        try {
            property12 = System.getProperty("jsch.lang", "");
        } catch (SecurityException unused15) {
            property12 = "";
        }
        hashtable15.put("lang.c2s", property12);
        Hashtable hashtable16 = f64190;
        String property24 = "2048";
        try {
            property24 = System.getProperty("jsch.dhgex_min", "2048");
        } catch (SecurityException unused16) {
        }
        hashtable16.put("dhgex_min", property24);
        Hashtable hashtable17 = f64190;
        String property25 = "8192";
        try {
            property25 = System.getProperty("jsch.dhgex_max", "8192");
        } catch (SecurityException unused17) {
        }
        hashtable17.put("dhgex_max", property25);
        Hashtable hashtable18 = f64190;
        String property26 = "3072";
        try {
            property26 = System.getProperty("jsch.dhgex_preferred", "3072");
        } catch (SecurityException unused18) {
        }
        hashtable18.put("dhgex_preferred", property26);
        Hashtable hashtable19 = f64190;
        try {
            property13 = System.getProperty("jsch.compression_level", "6");
        } catch (SecurityException unused19) {
            property13 = "6";
        }
        hashtable19.put("compression_level", property13);
        Hashtable hashtable20 = f64190;
        C3769.m12236(C12607.class, hashtable20, "diffie-hellman-group-exchange-sha1", C20812.class, "diffie-hellman-group1-sha1");
        C3769.m12236(C15590.class, hashtable20, "diffie-hellman-group14-sha1", C24542.class, "diffie-hellman-group-exchange-sha256");
        C3769.m12236(C6642.class, hashtable20, "diffie-hellman-group-exchange-sha224@ssh.com", C4404.class, "diffie-hellman-group-exchange-sha384@ssh.com");
        C3769.m12236(C14844.class, hashtable20, "diffie-hellman-group-exchange-sha512@ssh.com", C20066.class, "diffie-hellman-group14-sha256");
        C3769.m12236(C11861.class, hashtable20, "diffie-hellman-group15-sha512", C17828.class, "diffie-hellman-group16-sha512");
        C3769.m12236(C23796.class, hashtable20, "diffie-hellman-group17-sha512", C3658.class, "diffie-hellman-group18-sha512");
        C3769.m12236(C20066.class, hashtable20, "diffie-hellman-group14-sha256@ssh.com", C23050.class, "diffie-hellman-group14-sha224@ssh.com");
        C3769.m12236(C5896.class, hashtable20, "diffie-hellman-group15-sha256@ssh.com", C2167.class, "diffie-hellman-group15-sha384@ssh.com");
        C3769.m12236(C17828.class, hashtable20, "diffie-hellman-group16-sha512@ssh.com", C17082.class, "diffie-hellman-group16-sha384@ssh.com");
        C3769.m12236(C3658.class, hashtable20, "diffie-hellman-group18-sha512@ssh.com", C15261.class, "ecdsa-sha2-nistp256");
        C3769.m12236(C13024.class, hashtable20, "ecdsa-sha2-nistp384", C5567.class, "ecdsa-sha2-nistp521");
        C3769.m12236(C2714.class, hashtable20, "ecdh-sha2-nistp256", C7189.class, "ecdh-sha2-nistp384");
        C3769.m12236(C5150.class, hashtable20, "ecdh-sha2-nistp521", C2101.class, "ecdh-sha2-nistp");
        hashtable20.put("curve25519-sha256", C7935.class.getName());
        hashtable20.put("curve25519-sha256@libssh.org", C7935.class.getName());
        hashtable20.put("curve448-sha512", C1223.class.getName());
        hashtable20.put("mlkem768x25519-sha256", C19122.class.getName());
        C3769.m12236(C8680.class, hashtable20, "mlkem768nistp256-sha256", C13900.class, "mlkem1024nistp384-sha384");
        hashtable20.put("sntrup761x25519-sha512", C10171.class.getName());
        hashtable20.put("sntrup761x25519-sha512@openssh.com", C10171.class.getName());
        hashtable20.put("mlkem768", C1773.class.getName());
        hashtable20.put("mlkem1024", C5502.class.getName());
        C3769.m12236(C17434.class, hashtable20, "sntrup761", C5830.class, "dh");
        C3769.m12236(C12278.class, hashtable20, "3des-cbc", C15524.class, "blowfish-cbc");
        C3769.m12236(C20746.class, hashtable20, "hmac-sha1", C23730.class, "hmac-sha1-96");
        C3769.m12236(C4338.class, hashtable20, "hmac-sha2-256", C0609.class, "hmac-sha2-512");
        C3769.m12236(C17762.class, hashtable20, "hmac-md5", C25222.class, "hmac-md5-96");
        C3769.m12236(C12541.class, hashtable20, "hmac-sha1-etm@openssh.com", C3592.class, "hmac-sha1-96-etm@openssh.com");
        C3769.m12236(C14778.class, hashtable20, "hmac-sha2-256-etm@openssh.com", C8067.class, "hmac-sha2-512-etm@openssh.com");
        C3769.m12236(C16270.class, hashtable20, "hmac-md5-etm@openssh.com", C17016.class, "hmac-md5-96-etm@openssh.com");
        C3769.m12236(C24476.class, hashtable20, "hmac-sha256-2@ssh.com", C6576.class, "hmac-sha224@ssh.com");
        C3769.m12236(C21492.class, hashtable20, "hmac-sha256@ssh.com", C18508.class, "hmac-sha384@ssh.com");
        C3769.m12236(C19254.class, hashtable20, "hmac-sha512@ssh.com", C14032.class, "sha-1");
        C3769.m12236(C4821.class, hashtable20, "sha-224", C21975.class, "sha-256");
        C3769.m12236(C10786.class, hashtable20, "sha-384", C22721.class, "sha-512");
        C3769.m12236(C2846.class, hashtable20, "md5", C14032.class, "sha1");
        String property27 = "sha256";
        C3769.m12236(C4821.class, hashtable20, "sha224", C21975.class, "sha256");
        C3769.m12236(C10786.class, hashtable20, "sha384", C22721.class, "sha512");
        C3769.m12236(C19737.class, hashtable20, "signature.dss", C11532.class, OpenSSHPublicKeyUtil.RSA);
        C3769.m12236(C17499.class, hashtable20, "rsa-sha2-256", C3329.class, "rsa-sha2-512");
        C3769.m12236(C16753.class, hashtable20, "ssh-rsa-sha224@ssh.com", C16007.class, "ssh-rsa-sha256@ssh.com");
        C3769.m12236(C23467.class, hashtable20, "ssh-rsa-sha384@ssh.com", C20483.class, "ssh-rsa-sha512@ssh.com");
        C3769.m12236(C10303.class, hashtable20, "keypairgen.dsa", C9557.class, "keypairgen.rsa");
        C3769.m12236(C1355.class, hashtable20, "keypairgen.ecdsa", C7321.class, "random");
        C3769.m12236(C22656.class, hashtable20, "hmac-ripemd160", C15196.class, "hmac-ripemd160@openssh.com");
        C3769.m12236(C19672.class, hashtable20, "hmac-ripemd160-etm@openssh.com", C18376.class, "none");
        C3769.m12236(C9229.class, hashtable20, "aes128-gcm@openssh.com", C5084.class, "aes256-gcm@openssh.com");
        C3769.m12236(C9975.class, hashtable20, "aes128-cbc", C2518.class, "aes192-cbc");
        hashtable20.put("aes256-cbc", C6993.class.getName());
        hashtable20.put("rijndael-cbc@lysator.liu.se", C6993.class.getName());
        String property28 = "chacha20-poly1305@openssh.com";
        hashtable20.put("chacha20-poly1305@openssh.com", C10721.class.getName());
        hashtable20.put("cast128-cbc", C4756.class.getName());
        C3769.m12236(C21910.class, hashtable20, "cast128-ctr", C20418.class, "twofish128-cbc");
        hashtable20.put("twofish192-cbc", C6248.class.getName());
        hashtable20.put("twofish256-cbc", C4010.class.getName());
        hashtable20.put("twofish-cbc", C4010.class.getName());
        hashtable20.put("twofish128-ctr", C12213.class.getName());
        C3769.m12236(C24148.class, hashtable20, "twofish192-ctr", C14450.class, "twofish256-ctr");
        C3769.m12236(C16688.class, hashtable20, "seed-cbc@ssh.com", C1027.class, "aes128-ctr");
        C3769.m12236(C8484.class, hashtable20, "aes192-ctr", C13704.class, "aes256-ctr");
        C3769.m12236(C6313.class, hashtable20, "3des-ctr", C13287.class, "blowfish-ctr");
        C3769.m12236(C20000.class, hashtable20, "arcfour", C11049.class, "arcfour128");
        C3769.m12236(C22984.class, hashtable20, "arcfour256", C7520.class, "userauth.none");
        C3769.m12236(C18707.class, hashtable20, "userauth.password", C0062.class, "userauth.keyboard-interactive");
        hashtable20.put("userauth.publickey", C9756.class.getName());
        hashtable20.put("zlib", C18245.class.getName());
        hashtable20.put("zlib@openssh.com", C18245.class.getName());
        hashtable20.put("pbkdf2", C8812.class.getName());
        hashtable20.put("bcrypt", C18926.class.getName());
        hashtable20.put("Argon2d", C13486.class.getName());
        hashtable20.put("Argon2i", C13486.class.getName());
        hashtable20.put("Argon2id", C13486.class.getName());
        C3769.m12236(C24894.class, hashtable20, "scrypt", C0281.class, "xdh");
        C3769.m12236(C12959.class, hashtable20, "keypairgen.eddsa", C15942.class, OpenSSHPublicKeyUtil.ED_25519);
        C3769.m12236(C23402.class, hashtable20, "ssh-ed448", C12959.class, "keypairgen_fromprivate.eddsa");
        hashtable20.put("StrictHostKeyChecking", "ask");
        hashtable20.put("HashKnownHosts", "no");
        String property29 = "gssapi-with-mic,publickey,keyboard-interactive,password";
        try {
            property29 = System.getProperty("jsch.preferred_authentications", "gssapi-with-mic,publickey,keyboard-interactive,password");
        } catch (SecurityException unused20) {
        }
        hashtable20.put("PreferredAuthentications", property29);
        Hashtable hashtable21 = f64190;
        try {
            property20 = System.getProperty("jsch.client_pubkey", "ssh-ed25519,ecdsa-sha2-nistp256,ecdsa-sha2-nistp384,ecdsa-sha2-nistp521,rsa-sha2-512,rsa-sha2-256");
        } catch (SecurityException unused21) {
        }
        hashtable21.put("PubkeyAcceptedAlgorithms", property20);
        Hashtable hashtable22 = f64190;
        try {
            property14 = System.getProperty("jsch.enable_pubkey_auth_query", "yes");
        } catch (SecurityException unused22) {
            property14 = "yes";
        }
        hashtable22.put("enable_pubkey_auth_query", property14);
        Hashtable hashtable23 = f64190;
        try {
            property15 = System.getProperty("jsch.try_additional_pubkey_algorithms", "yes");
        } catch (SecurityException unused23) {
            property15 = "yes";
        }
        hashtable23.put("try_additional_pubkey_algorithms", property15);
        Hashtable hashtable24 = f64190;
        try {
            property16 = System.getProperty("jsch.enable_auth_none", "yes");
        } catch (SecurityException unused24) {
            property16 = "yes";
        }
        hashtable24.put("enable_auth_none", property16);
        Hashtable hashtable25 = f64190;
        try {
            property22 = System.getProperty("jsch.use_sftp_write_flush_workaround", "yes");
        } catch (SecurityException unused25) {
        }
        hashtable25.put("use_sftp_write_flush_workaround", property22);
        Hashtable hashtable26 = f64190;
        try {
            property28 = System.getProperty("jsch.check_ciphers", "chacha20-poly1305@openssh.com");
        } catch (SecurityException unused26) {
        }
        hashtable26.put("CheckCiphers", property28);
        Hashtable hashtable27 = f64190;
        try {
            property21 = System.getProperty("jsch.check_macs", "");
        } catch (SecurityException unused27) {
        }
        hashtable27.put("CheckMacs", property21);
        Hashtable hashtable28 = f64190;
        String property30 = "mlkem768x25519-sha256,mlkem768nistp256-sha256,mlkem1024nistp384-sha384,sntrup761x25519-sha512,sntrup761x25519-sha512@openssh.com,curve25519-sha256,curve25519-sha256@libssh.org,curve448-sha512";
        try {
            property30 = System.getProperty("jsch.check_kexes", "mlkem768x25519-sha256,mlkem768nistp256-sha256,mlkem1024nistp384-sha384,sntrup761x25519-sha512,sntrup761x25519-sha512@openssh.com,curve25519-sha256,curve25519-sha256@libssh.org,curve448-sha512");
        } catch (SecurityException unused28) {
        }
        hashtable28.put("CheckKexes", property30);
        Hashtable hashtable29 = f64190;
        String property31 = "ssh-ed25519,ssh-ed448";
        try {
            property31 = System.getProperty("jsch.check_signatures", "ssh-ed25519,ssh-ed448");
        } catch (SecurityException unused29) {
        }
        hashtable29.put("CheckSignatures", property31);
        Hashtable hashtable30 = f64190;
        try {
            property27 = System.getProperty("jsch.fingerprint_hash", "sha256");
        } catch (SecurityException unused30) {
        }
        hashtable30.put("FingerprintHash", property27);
        Hashtable hashtable31 = f64190;
        try {
            property17 = System.getProperty("jsch.max_auth_tries", "6");
        } catch (SecurityException unused31) {
        }
        hashtable31.put("MaxAuthTries", property17);
        f64190.put("ClearAllForwardings", "no");
        f64189 = new C11027();
    }

    public C19978() {
        C22962 c22962 = new C22962();
        this.f64193 = c22962;
        this.f64194 = new Vector();
        this.f64191 = new C2824(c22962);
        this.f64192 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15723 m45895(int i, String str, String str2) throws C2079 {
        if (str2 == null) {
            throw new C2079("host must not be null.");
        }
        return new C15723(this, str, str2, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45898(C15723 c15723) {
        synchronized (this.f64194) {
            this.f64194.addElement(c15723);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m45901(C15723 c15723) {
        synchronized (this.f64194) {
            this.f64194.remove(c15723);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2912 m45894() {
        if (this.f64192 == null) {
            this.f64192 = new C9535(this);
        }
        return this.f64192;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45897(InterfaceC7387 interfaceC7387, byte[] bArr) throws Throwable {
        if (bArr != null) {
            try {
                byte[] bArr2 = new byte[bArr.length];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                try {
                    if (!((C14098) interfaceC7387).mo20288(bArr2)) {
                        throw new C2079("Incorrect passphrase provided.");
                    }
                    C9011.m24062(bArr2);
                } catch (Throwable th) {
                    th = th;
                    bArr = bArr2;
                    C9011.m24062(bArr);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        InterfaceC5062 interfaceC5062 = this.f64191;
        if (interfaceC5062 instanceof C2824) {
            ((C2824) interfaceC5062).m9295(interfaceC7387);
            return;
        }
        C14098 c14098 = (C14098) interfaceC7387;
        if (!c14098.mo20292()) {
            this.f64191.mo9296(c14098.m34256().mo2674());
            return;
        }
        synchronized (this) {
            InterfaceC5062 interfaceC5063 = this.f64191;
            if (!(interfaceC5063 instanceof C22216)) {
                m45896(new C22216(interfaceC5063));
            }
        }
        ((C22216) this.f64191).m50240(interfaceC7387);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m45892(String str) {
        String str2;
        Hashtable hashtable = f64190;
        synchronized (hashtable) {
            if (str.equals("PubkeyAcceptedKeyTypes")) {
                str = "PubkeyAcceptedAlgorithms";
            }
            str2 = (String) hashtable.get(str);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8790 m45899() {
        this.f64193.getClass();
        return f64189;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static InterfaceC8790 m45893() {
        return f64189;
    }
}
