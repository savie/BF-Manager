package l;

import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;

/* JADX INFO: renamed from: l.֡ۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27Y0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0168 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static Hashtable f1256;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static InterfaceC8719 f1257;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Vector f1258;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC10047 f1259;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC18513 f1260;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C19925 f1261;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m1331(InterfaceC10047 interfaceC10047) {
        this.f1259 = interfaceC10047;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized InterfaceC10047 m1334() {
        return this.f1259;
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
        f1256 = hashtable;
        String property23 = "mlkem768x25519-sha256,curve25519-sha256,curve25519-sha256@libssh.org,ecdh-sha2-nistp256,ecdh-sha2-nistp384,ecdh-sha2-nistp521,diffie-hellman-group-exchange-sha256,diffie-hellman-group16-sha512,diffie-hellman-group18-sha512,diffie-hellman-group14-sha256";
        byte[] bArr = C8491.f29422;
        try {
            property23 = System.getProperty("jsch.kex", "mlkem768x25519-sha256,curve25519-sha256,curve25519-sha256@libssh.org,ecdh-sha2-nistp256,ecdh-sha2-nistp384,ecdh-sha2-nistp521,diffie-hellman-group-exchange-sha256,diffie-hellman-group16-sha512,diffie-hellman-group18-sha512,diffie-hellman-group14-sha256");
        } catch (SecurityException unused) {
        }
        hashtable.put("kex", property23);
        Hashtable hashtable2 = f1256;
        try {
            property = System.getProperty("jsch.server_host_key", "ssh-ed25519,ecdsa-sha2-nistp256,ecdsa-sha2-nistp384,ecdsa-sha2-nistp521,rsa-sha2-512,rsa-sha2-256");
        } catch (SecurityException unused2) {
            property = "ssh-ed25519,ecdsa-sha2-nistp256,ecdsa-sha2-nistp384,ecdsa-sha2-nistp521,rsa-sha2-512,rsa-sha2-256";
        }
        hashtable2.put("server_host_key", property);
        Hashtable hashtable3 = f1256;
        try {
            property2 = System.getProperty("jsch.prefer_known_host_key_types", "yes");
        } catch (SecurityException unused3) {
            property2 = "yes";
        }
        hashtable3.put("prefer_known_host_key_types", property2);
        Hashtable hashtable4 = f1256;
        try {
            property3 = System.getProperty("jsch.enable_strict_kex", "yes");
        } catch (SecurityException unused4) {
            property3 = "yes";
        }
        hashtable4.put("enable_strict_kex", property3);
        Hashtable hashtable5 = f1256;
        try {
            property4 = System.getProperty("jsch.require_strict_kex", "no");
        } catch (SecurityException unused5) {
            property4 = "no";
        }
        hashtable5.put("require_strict_kex", property4);
        Hashtable hashtable6 = f1256;
        try {
            property5 = System.getProperty("jsch.enable_server_sig_algs", "yes");
        } catch (SecurityException unused6) {
            property5 = "yes";
        }
        hashtable6.put("enable_server_sig_algs", property5);
        Hashtable hashtable7 = f1256;
        try {
            property6 = System.getProperty("jsch.enable_ext_info_in_auth", "yes");
        } catch (SecurityException unused7) {
            property6 = "yes";
        }
        hashtable7.put("enable_ext_info_in_auth", property6);
        Hashtable hashtable8 = f1256;
        try {
            property7 = System.getProperty("jsch.cipher", "aes128-gcm@openssh.com,aes256-gcm@openssh.com,chacha20-poly1305@openssh.com,aes128-ctr,aes192-ctr,aes256-ctr");
        } catch (SecurityException unused8) {
            property7 = "aes128-gcm@openssh.com,aes256-gcm@openssh.com,chacha20-poly1305@openssh.com,aes128-ctr,aes192-ctr,aes256-ctr";
        }
        hashtable8.put("cipher.s2c", property7);
        Hashtable hashtable9 = f1256;
        try {
            property19 = System.getProperty("jsch.cipher", "aes128-gcm@openssh.com,aes256-gcm@openssh.com,chacha20-poly1305@openssh.com,aes128-ctr,aes192-ctr,aes256-ctr");
        } catch (SecurityException unused9) {
        }
        hashtable9.put("cipher.c2s", property19);
        Hashtable hashtable10 = f1256;
        try {
            property8 = System.getProperty("jsch.mac", "hmac-sha2-256-etm@openssh.com,hmac-sha2-512-etm@openssh.com,hmac-sha1-etm@openssh.com,hmac-sha2-256,hmac-sha2-512,hmac-sha1");
        } catch (SecurityException unused10) {
            property8 = "hmac-sha2-256-etm@openssh.com,hmac-sha2-512-etm@openssh.com,hmac-sha1-etm@openssh.com,hmac-sha2-256,hmac-sha2-512,hmac-sha1";
        }
        hashtable10.put("mac.s2c", property8);
        Hashtable hashtable11 = f1256;
        try {
            property18 = System.getProperty("jsch.mac", "hmac-sha2-256-etm@openssh.com,hmac-sha2-512-etm@openssh.com,hmac-sha1-etm@openssh.com,hmac-sha2-256,hmac-sha2-512,hmac-sha1");
        } catch (SecurityException unused11) {
        }
        hashtable11.put("mac.c2s", property18);
        Hashtable hashtable12 = f1256;
        try {
            property9 = System.getProperty("jsch.compression", "none");
        } catch (SecurityException unused12) {
            property9 = "none";
        }
        hashtable12.put("compression.s2c", property9);
        Hashtable hashtable13 = f1256;
        try {
            property10 = System.getProperty("jsch.compression", "none");
        } catch (SecurityException unused13) {
            property10 = "none";
        }
        hashtable13.put("compression.c2s", property10);
        Hashtable hashtable14 = f1256;
        try {
            property11 = System.getProperty("jsch.lang", "");
        } catch (SecurityException unused14) {
            property11 = "";
        }
        hashtable14.put("lang.s2c", property11);
        Hashtable hashtable15 = f1256;
        try {
            property12 = System.getProperty("jsch.lang", "");
        } catch (SecurityException unused15) {
            property12 = "";
        }
        hashtable15.put("lang.c2s", property12);
        Hashtable hashtable16 = f1256;
        String property24 = "2048";
        try {
            property24 = System.getProperty("jsch.dhgex_min", "2048");
        } catch (SecurityException unused16) {
        }
        hashtable16.put("dhgex_min", property24);
        Hashtable hashtable17 = f1256;
        String property25 = "8192";
        try {
            property25 = System.getProperty("jsch.dhgex_max", "8192");
        } catch (SecurityException unused17) {
        }
        hashtable17.put("dhgex_max", property25);
        Hashtable hashtable18 = f1256;
        String property26 = "3072";
        try {
            property26 = System.getProperty("jsch.dhgex_preferred", "3072");
        } catch (SecurityException unused18) {
        }
        hashtable18.put("dhgex_preferred", property26);
        Hashtable hashtable19 = f1256;
        try {
            property13 = System.getProperty("jsch.compression_level", "6");
        } catch (SecurityException unused19) {
            property13 = "6";
        }
        hashtable19.put("compression_level", property13);
        Hashtable hashtable20 = f1256;
        C20630.m46499(C13575.class, hashtable20, "diffie-hellman-group-exchange-sha1", C4401.class, "diffie-hellman-group1-sha1");
        C20630.m46499(C0437.class, hashtable20, "diffie-hellman-group14-sha1", C2284.class, "diffie-hellman-group-exchange-sha256");
        C20630.m46499(C11458.class, hashtable20, "diffie-hellman-group-exchange-sha224@ssh.com", C5107.class, "diffie-hellman-group-exchange-sha384@ssh.com");
        C20630.m46499(C22041.class, hashtable20, "diffie-hellman-group-exchange-sha512@ssh.com", C20194.class, "diffie-hellman-group14-sha256");
        C20630.m46499(C6082.class, hashtable20, "diffie-hellman-group15-sha512", C14550.class, "diffie-hellman-group16-sha512");
        C20630.m46499(C9611.class, hashtable20, "diffie-hellman-group17-sha512", C3259.class, "diffie-hellman-group18-sha512");
        C20630.m46499(C20194.class, hashtable20, "diffie-hellman-group14-sha256@ssh.com", C15961.class, "diffie-hellman-group14-sha224@ssh.com");
        C20630.m46499(C12433.class, hashtable20, "diffie-hellman-group15-sha256@ssh.com", C17371.class, "diffie-hellman-group15-sha384@ssh.com");
        C20630.m46499(C14550.class, hashtable20, "diffie-hellman-group16-sha512@ssh.com", C23722.class, "diffie-hellman-group16-sha384@ssh.com");
        C20630.m46499(C3259.class, hashtable20, "diffie-hellman-group18-sha512@ssh.com", C12682.class, "ecdsa-sha2-nistp256");
        C20630.m46499(C17620.class, hashtable20, "ecdsa-sha2-nistp384", C6331.class, "ecdsa-sha2-nistp521");
        C20630.m46499(C18782.class, hashtable20, "ecdh-sha2-nistp256", C19488.class, "ecdh-sha2-nistp384");
        C20630.m46499(C10316.class, hashtable20, "ecdh-sha2-nistp521", C11084.class, "ecdh-sha2-nistp");
        hashtable20.put("curve25519-sha256", C6787.class.getName());
        hashtable20.put("curve25519-sha256@libssh.org", C6787.class.getName());
        hashtable20.put("curve448-sha512", C21604.class.getName());
        hashtable20.put("mlkem768x25519-sha256", C23016.class.getName());
        C20630.m46499(C8199.class, hashtable20, "mlkem768nistp256-sha256", C8905.class, "mlkem1024nistp384-sha384");
        hashtable20.put("sntrup761x25519-sha512", C15255.class.getName());
        hashtable20.put("sntrup761x25519-sha512@openssh.com", C15255.class.getName());
        hashtable20.put("mlkem768", C11313.class.getName());
        hashtable20.put("mlkem1024", C6373.class.getName());
        C20630.m46499(C9902.class, hashtable20, "sntrup761", C6144.class, "dh");
        C20630.m46499(C2698.class, hashtable20, "3des-cbc", C12495.class, "blowfish-cbc");
        C20630.m46499(C11977.class, hashtable20, "hmac-sha1", C4920.class, "hmac-sha1-96");
        C20630.m46499(C1392.class, hashtable20, "hmac-sha2-256", C23266.class, "hmac-sha2-512");
        C20630.m46499(C9673.class, hashtable20, "hmac-md5", C14612.class, "hmac-md5-96");
        C20630.m46499(C2803.class, hashtable20, "hmac-sha1-etm@openssh.com", C14094.class, "hmac-sha1-96-etm@openssh.com");
        C20630.m46499(C13388.class, hashtable20, "hmac-sha2-256-etm@openssh.com", C15505.class, "hmac-sha2-512-etm@openssh.com");
        C20630.m46499(C3321.class, hashtable20, "hmac-md5-etm@openssh.com", C1910.class, "hmac-md5-96-etm@openssh.com");
        C20630.m46499(C22560.class, hashtable20, "hmac-sha256-2@ssh.com", C5626.class, "hmac-sha224@ssh.com");
        C20630.m46499(C4214.class, hashtable20, "hmac-sha256@ssh.com", C7037.class, "hmac-sha384@ssh.com");
        C20630.m46499(C21854.class, hashtable20, "hmac-sha512@ssh.com", C7743.class, "sha-1");
        C20630.m46499(C21148.class, hashtable20, "sha-224", C16210.class, "sha-256");
        C20630.m46499(C20443.class, hashtable20, "sha-384", C0686.class, "sha-512");
        C20630.m46499(C19738.class, hashtable20, "md5", C7743.class, "sha1");
        String property27 = "sha256";
        C20630.m46499(C21148.class, hashtable20, "sha224", C16210.class, "sha256");
        C20630.m46499(C20443.class, hashtable20, "sha384", C0686.class, "sha512");
        C20630.m46499(C16915.class, hashtable20, "signature.dss", C23971.class, OpenSSHPublicKeyUtil.RSA);
        C20630.m46499(C9860.class, hashtable20, "rsa-sha2-256", C13989.class, "rsa-sha2-512");
        C20630.m46499(C2097.class, hashtable20, "ssh-rsa-sha224@ssh.com", C3508.class, "ssh-rsa-sha256@ssh.com");
        C20630.m46499(C4815.class, hashtable20, "ssh-rsa-sha384@ssh.com", C11872.class, "ssh-rsa-sha512@ssh.com");
        C20630.m46499(C18326.class, hashtable20, "keypairgen.dsa", C8449.class, "keypairgen.rsa");
        C20630.m46499(C19032.class, hashtable20, "keypairgen.ecdsa", C10566.class, "random");
        C20630.m46499(C0728.class, hashtable20, "hmac-ripemd160", C12724.class, "hmac-ripemd160@openssh.com");
        C20630.m46499(C16957.class, hashtable20, "hmac-ripemd160-etm@openssh.com", C13138.class, "none");
        C20630.m46499(C8261.class, hashtable20, "aes128-gcm@openssh.com", C20961.class, "aes256-gcm@openssh.com");
        C20630.m46499(C18138.class, hashtable20, "aes128-cbc", C19550.class, "aes192-cbc");
        hashtable20.put("aes256-cbc", C10378.class.getName());
        hashtable20.put("rijndael-cbc@lysator.liu.se", C10378.class.getName());
        String property28 = "chacha20-poly1305@openssh.com";
        hashtable20.put("chacha20-poly1305@openssh.com", C20485.class.getName());
        hashtable20.put("cast128-cbc", C21190.class.getName());
        C20630.m46499(C16252.class, hashtable20, "cast128-ctr", C11789.class, "twofish128-cbc");
        hashtable20.put("twofish192-cbc", C5438.class.getName());
        hashtable20.put("twofish256-cbc", C1204.class.getName());
        hashtable20.put("twofish-cbc", C1204.class.getName());
        hashtable20.put("twofish128-ctr", C2615.class.getName());
        C20630.m46499(C22372.class, hashtable20, "twofish192-ctr", C13200.class, "twofish256-ctr");
        C20630.m46499(C2139.class, hashtable20, "seed-cbc@ssh.com", C18844.class, "aes128-ctr");
        C20630.m46499(C8967.class, hashtable20, "aes192-ctr", C7555.class, "aes256-ctr");
        C20630.m46499(C5521.class, hashtable20, "3des-ctr", C17433.class, "blowfish-ctr");
        C20630.m46499(C16728.class, hashtable20, "arcfour", C20256.class, "arcfour128");
        C20630.m46499(C0499.class, hashtable20, "arcfour256", C15547.class, "userauth.none");
        C20630.m46499(C21896.class, hashtable20, "userauth.password", C23308.class, "userauth.keyboard-interactive");
        hashtable20.put("userauth.publickey", C18368.class.getName());
        hashtable20.put("zlib", C6932.class.getName());
        hashtable20.put("zlib@openssh.com", C6932.class.getName());
        hashtable20.put("pbkdf2", C9155.class.getName());
        hashtable20.put("bcrypt", C21666.class.getName());
        hashtable20.put("Argon2d", C7785.class.getName());
        hashtable20.put("Argon2i", C7785.class.getName());
        hashtable20.put("Argon2id", C7785.class.getName());
        C20630.m46499(C14841.class, hashtable20, "scrypt", C23078.class, "xdh");
        C20630.m46499(C17662.class, hashtable20, "keypairgen.eddsa", C3550.class, OpenSSHPublicKeyUtil.ED_25519);
        C20630.m46499(C4732.class, hashtable20, "ssh-ed448", C17662.class, "keypairgen_fromprivate.eddsa");
        hashtable20.put("StrictHostKeyChecking", "ask");
        hashtable20.put("HashKnownHosts", "no");
        String property29 = "gssapi-with-mic,publickey,keyboard-interactive,password";
        try {
            property29 = System.getProperty("jsch.preferred_authentications", "gssapi-with-mic,publickey,keyboard-interactive,password");
        } catch (SecurityException unused20) {
        }
        hashtable20.put("PreferredAuthentications", property29);
        Hashtable hashtable21 = f1256;
        try {
            property20 = System.getProperty("jsch.client_pubkey", "ssh-ed25519,ecdsa-sha2-nistp256,ecdsa-sha2-nistp384,ecdsa-sha2-nistp521,rsa-sha2-512,rsa-sha2-256");
        } catch (SecurityException unused21) {
        }
        hashtable21.put("PubkeyAcceptedAlgorithms", property20);
        Hashtable hashtable22 = f1256;
        try {
            property14 = System.getProperty("jsch.enable_pubkey_auth_query", "yes");
        } catch (SecurityException unused22) {
            property14 = "yes";
        }
        hashtable22.put("enable_pubkey_auth_query", property14);
        Hashtable hashtable23 = f1256;
        try {
            property15 = System.getProperty("jsch.try_additional_pubkey_algorithms", "yes");
        } catch (SecurityException unused23) {
            property15 = "yes";
        }
        hashtable23.put("try_additional_pubkey_algorithms", property15);
        Hashtable hashtable24 = f1256;
        try {
            property16 = System.getProperty("jsch.enable_auth_none", "yes");
        } catch (SecurityException unused24) {
            property16 = "yes";
        }
        hashtable24.put("enable_auth_none", property16);
        Hashtable hashtable25 = f1256;
        try {
            property22 = System.getProperty("jsch.use_sftp_write_flush_workaround", "yes");
        } catch (SecurityException unused25) {
        }
        hashtable25.put("use_sftp_write_flush_workaround", property22);
        Hashtable hashtable26 = f1256;
        try {
            property28 = System.getProperty("jsch.check_ciphers", "chacha20-poly1305@openssh.com");
        } catch (SecurityException unused26) {
        }
        hashtable26.put("CheckCiphers", property28);
        Hashtable hashtable27 = f1256;
        try {
            property21 = System.getProperty("jsch.check_macs", "");
        } catch (SecurityException unused27) {
        }
        hashtable27.put("CheckMacs", property21);
        Hashtable hashtable28 = f1256;
        String property30 = "mlkem768x25519-sha256,mlkem768nistp256-sha256,mlkem1024nistp384-sha384,sntrup761x25519-sha512,sntrup761x25519-sha512@openssh.com,curve25519-sha256,curve25519-sha256@libssh.org,curve448-sha512";
        try {
            property30 = System.getProperty("jsch.check_kexes", "mlkem768x25519-sha256,mlkem768nistp256-sha256,mlkem1024nistp384-sha384,sntrup761x25519-sha512,sntrup761x25519-sha512@openssh.com,curve25519-sha256,curve25519-sha256@libssh.org,curve448-sha512");
        } catch (SecurityException unused28) {
        }
        hashtable28.put("CheckKexes", property30);
        Hashtable hashtable29 = f1256;
        String property31 = "ssh-ed25519,ssh-ed448";
        try {
            property31 = System.getProperty("jsch.check_signatures", "ssh-ed25519,ssh-ed448");
        } catch (SecurityException unused29) {
        }
        hashtable29.put("CheckSignatures", property31);
        Hashtable hashtable30 = f1256;
        try {
            property27 = System.getProperty("jsch.fingerprint_hash", "sha256");
        } catch (SecurityException unused30) {
        }
        hashtable30.put("FingerprintHash", property27);
        Hashtable hashtable31 = f1256;
        try {
            property17 = System.getProperty("jsch.max_auth_tries", "6");
        } catch (SecurityException unused31) {
        }
        hashtable31.put("MaxAuthTries", property17);
        f1256.put("ClearAllForwardings", "no");
        f1257 = new C15692();
    }

    public C0168() {
        C19925 c19925 = new C19925();
        this.f1261 = c19925;
        this.f1258 = new Vector();
        this.f1259 = new C19302(c19925);
        this.f1260 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3073 m1328(int i, String str, String str2) throws C5813 {
        if (str2 == null) {
            throw new C5813("host must not be null.");
        }
        return new C3073(this, str, str2, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1330(C3073 c3073) {
        synchronized (this.f1258) {
            this.f1258.addElement(c3073);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m1335(C3073 c3073) {
        synchronized (this.f1258) {
            this.f1258.remove(c3073);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18513 m1329() {
        if (this.f1260 == null) {
            this.f1260 = new C8013(this);
        }
        return this.f1260;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1332(InterfaceC19219 interfaceC19219, byte[] bArr) throws Throwable {
        if (bArr != null) {
            try {
                byte[] bArr2 = new byte[bArr.length];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                try {
                    if (!((C8636) interfaceC19219).mo22437(bArr2)) {
                        throw new C5813("Incorrect passphrase provided.");
                    }
                    C8491.m22182(bArr2);
                } catch (Throwable th) {
                    th = th;
                    bArr = bArr2;
                    C8491.m22182(bArr);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        InterfaceC10047 interfaceC10047 = this.f1259;
        if (interfaceC10047 instanceof C19302) {
            ((C19302) interfaceC10047).m44290(interfaceC19219);
            return;
        }
        C8636 c8636 = (C8636) interfaceC19219;
        if (!c8636.mo22442()) {
            this.f1259.mo19222(c8636.m22439().mo7211());
            return;
        }
        synchronized (this) {
            InterfaceC10047 interfaceC10048 = this.f1259;
            if (!(interfaceC10048 instanceof C7224)) {
                m1331(new C7224(interfaceC10048));
            }
        }
        ((C7224) this.f1259).m19221(interfaceC19219);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m1327(String str) {
        String str2;
        Hashtable hashtable = f1256;
        synchronized (hashtable) {
            if (str.equals("PubkeyAcceptedKeyTypes")) {
                str = "PubkeyAcceptedAlgorithms";
            }
            str2 = (String) hashtable.get(str);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8719 m1333() {
        this.f1261.getClass();
        return f1257;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static InterfaceC8719 m1326() {
        return f1257;
    }
}
