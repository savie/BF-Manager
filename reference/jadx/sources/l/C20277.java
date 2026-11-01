package l;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import com.alipay.sdk.m.b0.a;
import com.alipay.sdk.m.p.d;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.᩶ܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C20277 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public KeyStore f65719;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public SharedPreferences f65720;

    public C20277(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("KEYSTORE_SETTING", 0);
            this.f65720 = sharedPreferences;
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.f65719 = keyStore;
            keyStore.load(null);
            if (keyStore.containsAlias("KEYSTORE_AES")) {
                return;
            }
            sharedPreferences.edit().putString("PREF_KEY_IV", "").apply();
            m45774(context);
            m45773();
        } catch (Exception e) {
            C23099.m51109(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45774(Context context) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        StringBuilder sb = new StringBuilder("Build.VERSION.SDK_INT=");
        int i = Build.VERSION.SDK_INT;
        sb.append(i);
        C23099.m51110("KEYSTORE", sb.toString());
        if (i >= 23) {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(d.a, "AndroidKeyStore");
            keyPairGenerator.initialize(new KeyGenParameterSpec.Builder("KEYSTORE_AES", 3).setDigests(XMSSKeyParameters.SHA_256, XMSSKeyParameters.SHA_512).setEncryptionPaddings("PKCS1Padding").build());
            keyPairGenerator.generateKeyPair();
        } else {
            KeyPairGenerator keyPairGenerator2 = KeyPairGenerator.getInstance(d.a, "AndroidKeyStore");
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 30);
            keyPairGenerator2.initialize(new KeyPairGeneratorSpec.Builder(context).setAlias("KEYSTORE_AES").setSubject(new X500Principal("CN=KEYSTORE_AES")).setSerialNumber(BigInteger.TEN).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).build());
            keyPairGenerator2.generateKeyPair();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m45776(String str) {
        try {
            Cipher cipher = Cipher.getInstance(a.f);
            cipher.init(1, m45775(), new IvParameterSpec(Base64.decode(this.f65720.getString("PREF_KEY_IV", ""), 0)));
            return Base64.encodeToString(cipher.doFinal(str.getBytes()), 0);
        } catch (Exception e) {
            C23099.m51111("KEYSTORE", "Exception", e);
            return "";
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m45773() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        byte[] bArr = new byte[16];
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextBytes(bArr);
        String strEncodeToString = Base64.encodeToString(secureRandom.generateSeed(12), 0);
        SharedPreferences sharedPreferences = this.f65720;
        sharedPreferences.edit().putString("PREF_KEY_IV", strEncodeToString).apply();
        PublicKey publicKey = this.f65719.getCertificate("KEYSTORE_AES").getPublicKey();
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(1, publicKey);
        sharedPreferences.edit().putString("PREF_KEY_AES", Base64.encodeToString(cipher.doFinal(bArr), 0)).apply();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private SecretKeySpec m45775() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        String string = this.f65720.getString("PREF_KEY_AES", "");
        PrivateKey privateKey = (PrivateKey) this.f65719.getKey("KEYSTORE_AES", null);
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(2, privateKey);
        return new SecretKeySpec(cipher.doFinal(Base64.decode(string, 0)), a.f);
    }
}
